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
public final class Ed25519PublicKey extends GeneratedMessageLite<Ed25519PublicKey, Builder> implements Ed25519PublicKeyOrBuilder {
    private static final Ed25519PublicKey DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile Parser<Ed25519PublicKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.Ed25519PublicKey$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C40581 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f11317xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f11317xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11317xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11317xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11317xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11317xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11317xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11317xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Ed25519PublicKey, Builder> implements Ed25519PublicKeyOrBuilder {
        /* synthetic */ Builder(C40581 c40581) {
            this();
        }

        public Builder clearKeyValue() {
            copyOnWrite();
            ((Ed25519PublicKey) this.instance).clearKeyValue();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((Ed25519PublicKey) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.Ed25519PublicKeyOrBuilder
        public ByteString getKeyValue() {
            return ((Ed25519PublicKey) this.instance).getKeyValue();
        }

        @Override // com.google.crypto.tink.proto.Ed25519PublicKeyOrBuilder
        public int getVersion() {
            return ((Ed25519PublicKey) this.instance).getVersion();
        }

        public Builder setKeyValue(ByteString byteString) {
            copyOnWrite();
            ((Ed25519PublicKey) this.instance).setKeyValue(byteString);
            return this;
        }

        public Builder setVersion(int i) {
            copyOnWrite();
            ((Ed25519PublicKey) this.instance).setVersion(i);
            return this;
        }

        private Builder() {
            super(Ed25519PublicKey.DEFAULT_INSTANCE);
        }
    }

    static {
        Ed25519PublicKey ed25519PublicKey = new Ed25519PublicKey();
        DEFAULT_INSTANCE = ed25519PublicKey;
        GeneratedMessageLite.registerDefaultInstance(Ed25519PublicKey.class, ed25519PublicKey);
    }

    private Ed25519PublicKey() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyValue() {
        this.keyValue_ = getDefaultInstance().getKeyValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static Ed25519PublicKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Ed25519PublicKey parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Ed25519PublicKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Ed25519PublicKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Ed25519PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Ed25519PublicKey> parser() {
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
        switch (C40581.f11317xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Ed25519PublicKey();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Ed25519PublicKey> parser = PARSER;
                if (parser == null) {
                    synchronized (Ed25519PublicKey.class) {
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

    @Override // com.google.crypto.tink.proto.Ed25519PublicKeyOrBuilder
    public ByteString getKeyValue() {
        return this.keyValue_;
    }

    @Override // com.google.crypto.tink.proto.Ed25519PublicKeyOrBuilder
    public int getVersion() {
        return this.version_;
    }

    public static Builder newBuilder(Ed25519PublicKey ed25519PublicKey) {
        return DEFAULT_INSTANCE.createBuilder(ed25519PublicKey);
    }

    public static Ed25519PublicKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Ed25519PublicKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Ed25519PublicKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Ed25519PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Ed25519PublicKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Ed25519PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Ed25519PublicKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Ed25519PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Ed25519PublicKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Ed25519PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Ed25519PublicKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Ed25519PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Ed25519PublicKey parseFrom(InputStream inputStream) throws IOException {
        return (Ed25519PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Ed25519PublicKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Ed25519PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Ed25519PublicKey parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Ed25519PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Ed25519PublicKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Ed25519PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
