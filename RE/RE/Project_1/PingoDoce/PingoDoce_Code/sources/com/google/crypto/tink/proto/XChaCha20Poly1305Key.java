package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class XChaCha20Poly1305Key extends GeneratedMessageLite<XChaCha20Poly1305Key, Builder> implements XChaCha20Poly1305KeyOrBuilder {
    private static final XChaCha20Poly1305Key DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile Parser<XChaCha20Poly1305Key> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.XChaCha20Poly1305Key$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C40901 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f11354xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f11354xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11354xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11354xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11354xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11354xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11354xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11354xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<XChaCha20Poly1305Key, Builder> implements XChaCha20Poly1305KeyOrBuilder {
        /* synthetic */ Builder(C40901 c40901) {
            this();
        }

        public Builder clearKeyValue() {
            copyOnWrite();
            ((XChaCha20Poly1305Key) this.instance).clearKeyValue();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((XChaCha20Poly1305Key) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.XChaCha20Poly1305KeyOrBuilder
        public ByteString getKeyValue() {
            return ((XChaCha20Poly1305Key) this.instance).getKeyValue();
        }

        @Override // com.google.crypto.tink.proto.XChaCha20Poly1305KeyOrBuilder
        public int getVersion() {
            return ((XChaCha20Poly1305Key) this.instance).getVersion();
        }

        public Builder setKeyValue(ByteString byteString) {
            copyOnWrite();
            ((XChaCha20Poly1305Key) this.instance).setKeyValue(byteString);
            return this;
        }

        public Builder setVersion(int i) {
            copyOnWrite();
            ((XChaCha20Poly1305Key) this.instance).setVersion(i);
            return this;
        }

        private Builder() {
            super(XChaCha20Poly1305Key.DEFAULT_INSTANCE);
        }
    }

    static {
        XChaCha20Poly1305Key xChaCha20Poly1305Key = new XChaCha20Poly1305Key();
        DEFAULT_INSTANCE = xChaCha20Poly1305Key;
        GeneratedMessageLite.registerDefaultInstance(XChaCha20Poly1305Key.class, xChaCha20Poly1305Key);
    }

    private XChaCha20Poly1305Key() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyValue() {
        this.keyValue_ = getDefaultInstance().getKeyValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static XChaCha20Poly1305Key getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static XChaCha20Poly1305Key parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static XChaCha20Poly1305Key parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<XChaCha20Poly1305Key> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyValue(ByteString byteString) {
        byteString.getClass();
        this.keyValue_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C40901.f11354xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new XChaCha20Poly1305Key();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<XChaCha20Poly1305Key> parser = PARSER;
                if (parser == null) {
                    synchronized (XChaCha20Poly1305Key.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.crypto.tink.proto.XChaCha20Poly1305KeyOrBuilder
    public ByteString getKeyValue() {
        return this.keyValue_;
    }

    @Override // com.google.crypto.tink.proto.XChaCha20Poly1305KeyOrBuilder
    public int getVersion() {
        return this.version_;
    }

    public static Builder newBuilder(XChaCha20Poly1305Key xChaCha20Poly1305Key) {
        return DEFAULT_INSTANCE.createBuilder(xChaCha20Poly1305Key);
    }

    public static XChaCha20Poly1305Key parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static XChaCha20Poly1305Key parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static XChaCha20Poly1305Key parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static XChaCha20Poly1305Key parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static XChaCha20Poly1305Key parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static XChaCha20Poly1305Key parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static XChaCha20Poly1305Key parseFrom(InputStream inputStream) throws IOException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static XChaCha20Poly1305Key parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static XChaCha20Poly1305Key parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static XChaCha20Poly1305Key parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}