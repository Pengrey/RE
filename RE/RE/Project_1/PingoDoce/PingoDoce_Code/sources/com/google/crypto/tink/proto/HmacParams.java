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
public final class HmacParams extends GeneratedMessageLite<HmacParams, Builder> implements HmacParamsOrBuilder {
    private static final HmacParams DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile Parser<HmacParams> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    /* renamed from: com.google.crypto.tink.proto.HmacParams$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C40681 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f11325xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f11325xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11325xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11325xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11325xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11325xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11325xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11325xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<HmacParams, Builder> implements HmacParamsOrBuilder {
        /* synthetic */ Builder(C40681 c40681) {
            this();
        }

        public Builder clearHash() {
            copyOnWrite();
            ((HmacParams) this.instance).clearHash();
            return this;
        }

        public Builder clearTagSize() {
            copyOnWrite();
            ((HmacParams) this.instance).clearTagSize();
            return this;
        }

        @Override // com.google.crypto.tink.proto.HmacParamsOrBuilder
        public HashType getHash() {
            return ((HmacParams) this.instance).getHash();
        }

        @Override // com.google.crypto.tink.proto.HmacParamsOrBuilder
        public int getHashValue() {
            return ((HmacParams) this.instance).getHashValue();
        }

        @Override // com.google.crypto.tink.proto.HmacParamsOrBuilder
        public int getTagSize() {
            return ((HmacParams) this.instance).getTagSize();
        }

        public Builder setHash(HashType hashType) {
            copyOnWrite();
            ((HmacParams) this.instance).setHash(hashType);
            return this;
        }

        public Builder setHashValue(int i) {
            copyOnWrite();
            ((HmacParams) this.instance).setHashValue(i);
            return this;
        }

        public Builder setTagSize(int i) {
            copyOnWrite();
            ((HmacParams) this.instance).setTagSize(i);
            return this;
        }

        private Builder() {
            super(HmacParams.DEFAULT_INSTANCE);
        }
    }

    static {
        HmacParams hmacParams = new HmacParams();
        DEFAULT_INSTANCE = hmacParams;
        GeneratedMessageLite.registerDefaultInstance(HmacParams.class, hmacParams);
    }

    private HmacParams() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHash() {
        this.hash_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTagSize() {
        this.tagSize_ = 0;
    }

    public static HmacParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static HmacParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HmacParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HmacParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HmacParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<HmacParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHash(HashType hashType) {
        this.hash_ = hashType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHashValue(int i) {
        this.hash_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTagSize(int i) {
        this.tagSize_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C40681.f11325xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new HmacParams();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HmacParams> parser = PARSER;
                if (parser == null) {
                    synchronized (HmacParams.class) {
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

    @Override // com.google.crypto.tink.proto.HmacParamsOrBuilder
    public HashType getHash() {
        HashType forNumber = HashType.forNumber(this.hash_);
        return forNumber == null ? HashType.UNRECOGNIZED : forNumber;
    }

    @Override // com.google.crypto.tink.proto.HmacParamsOrBuilder
    public int getHashValue() {
        return this.hash_;
    }

    @Override // com.google.crypto.tink.proto.HmacParamsOrBuilder
    public int getTagSize() {
        return this.tagSize_;
    }

    public static Builder newBuilder(HmacParams hmacParams) {
        return DEFAULT_INSTANCE.createBuilder(hmacParams);
    }

    public static HmacParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HmacParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HmacParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HmacParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static HmacParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HmacParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static HmacParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HmacParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static HmacParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HmacParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HmacParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HmacParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static HmacParams parseFrom(InputStream inputStream) throws IOException {
        return (HmacParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HmacParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HmacParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HmacParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HmacParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static HmacParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HmacParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
