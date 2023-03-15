package com.google.crypto.tink.mac;

import com.google.crypto.tink.Mac;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class MacWrapper implements PrimitiveWrapper<Mac> {
    private static final Logger logger = Logger.getLogger(MacWrapper.class.getName());

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class WrappedMac implements Mac {
        private final byte[] formatVersion;
        private final PrimitiveSet<Mac> primitives;

        @Override // com.google.crypto.tink.Mac
        public byte[] computeMac(byte[] bArr) throws GeneralSecurityException {
            if (this.primitives.getPrimary().getOutputPrefixType().equals(OutputPrefixType.LEGACY)) {
                return Bytes.concat(this.primitives.getPrimary().getIdentifier(), this.primitives.getPrimary().getPrimitive().computeMac(Bytes.concat(bArr, this.formatVersion)));
            }
            return Bytes.concat(this.primitives.getPrimary().getIdentifier(), this.primitives.getPrimary().getPrimitive().computeMac(bArr));
        }

        @Override // com.google.crypto.tink.Mac
        public void verifyMac(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (PrimitiveSet.Entry<Mac> entry : this.primitives.getPrimitive(copyOfRange)) {
                    try {
                        if (entry.getOutputPrefixType().equals(OutputPrefixType.LEGACY)) {
                            entry.getPrimitive().verifyMac(copyOfRange2, Bytes.concat(bArr2, this.formatVersion));
                            return;
                        } else {
                            entry.getPrimitive().verifyMac(copyOfRange2, bArr2);
                            return;
                        }
                    } catch (GeneralSecurityException e) {
                        Logger logger = MacWrapper.logger;
                        logger.info("tag prefix matches a key, but cannot verify: " + e.toString());
                    }
                }
                for (PrimitiveSet.Entry<Mac> entry2 : this.primitives.getRawPrimitives()) {
                    try {
                        entry2.getPrimitive().verifyMac(bArr, bArr2);
                        return;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                throw new GeneralSecurityException("invalid MAC");
            }
            throw new GeneralSecurityException("tag too short");
        }

        private WrappedMac(PrimitiveSet<Mac> primitiveSet) {
            this.formatVersion = new byte[]{0};
            this.primitives = primitiveSet;
        }
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(new MacWrapper());
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<Mac> getPrimitiveClass() {
        return Mac.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Mac wrap(PrimitiveSet<Mac> primitiveSet) throws GeneralSecurityException {
        return new WrappedMac(primitiveSet);
    }
}
