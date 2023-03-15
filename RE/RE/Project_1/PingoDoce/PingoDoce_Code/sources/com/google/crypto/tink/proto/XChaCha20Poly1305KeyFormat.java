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
public final class XChaCha20Poly1305KeyFormat extends GeneratedMessageLite<XChaCha20Poly1305KeyFormat, Builder> implements XChaCha20Poly1305KeyFormatOrBuilder {
    private static final XChaCha20Poly1305KeyFormat DEFAULT_INSTANCE;
    private static volatile Parser<XChaCha20Poly1305KeyFormat> PARSER;

    /* renamed from: com.google.crypto.tink.proto.XChaCha20Poly1305KeyFormat$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C40911 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f11355xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f11355xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11355xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11355xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11355xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11355xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11355xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11355xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<XChaCha20Poly1305KeyFormat, Builder> implements XChaCha20Poly1305KeyFormatOrBuilder {
        /* synthetic */ Builder(C40911 c40911) {
            this();
        }

        private Builder() {
            super(XChaCha20Poly1305KeyFormat.DEFAULT_INSTANCE);
        }
    }

    static {
        XChaCha20Poly1305KeyFormat xChaCha20Poly1305KeyFormat = new XChaCha20Poly1305KeyFormat();
        DEFAULT_INSTANCE = xChaCha20Poly1305KeyFormat;
        GeneratedMessageLite.registerDefaultInstance(XChaCha20Poly1305KeyFormat.class, xChaCha20Poly1305KeyFormat);
    }

    private XChaCha20Poly1305KeyFormat() {
    }

    public static XChaCha20Poly1305KeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static XChaCha20Poly1305KeyFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (XChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static XChaCha20Poly1305KeyFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<XChaCha20Poly1305KeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C40911.f11355xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new XChaCha20Poly1305KeyFormat();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<XChaCha20Poly1305KeyFormat> parser = PARSER;
                if (parser == null) {
                    synchronized (XChaCha20Poly1305KeyFormat.class) {
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

    public static Builder newBuilder(XChaCha20Poly1305KeyFormat xChaCha20Poly1305KeyFormat) {
        return DEFAULT_INSTANCE.createBuilder(xChaCha20Poly1305KeyFormat);
    }

    public static XChaCha20Poly1305KeyFormat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (XChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static XChaCha20Poly1305KeyFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static XChaCha20Poly1305KeyFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static XChaCha20Poly1305KeyFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static XChaCha20Poly1305KeyFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static XChaCha20Poly1305KeyFormat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static XChaCha20Poly1305KeyFormat parseFrom(InputStream inputStream) throws IOException {
        return (XChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static XChaCha20Poly1305KeyFormat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (XChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static XChaCha20Poly1305KeyFormat parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (XChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static XChaCha20Poly1305KeyFormat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (XChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
