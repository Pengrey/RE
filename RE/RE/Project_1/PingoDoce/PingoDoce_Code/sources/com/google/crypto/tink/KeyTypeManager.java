package com.google.crypto.tink;

import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Alpha
/* loaded from: classes.dex */
public abstract class KeyTypeManager<KeyProtoT extends MessageLite> {
    private final Class<KeyProtoT> clazz;
    private final Map<Class<?>, PrimitiveFactory<?, KeyProtoT>> factories;
    private final Class<?> firstPrimitiveClass;

    /* loaded from: classes.dex */
    public static abstract class KeyFactory<KeyFormatProtoT extends MessageLite, KeyT> {
        private final Class<KeyFormatProtoT> clazz;

        public KeyFactory(Class<KeyFormatProtoT> cls) {
            this.clazz = cls;
        }

        public abstract KeyT createKey(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

        public KeyT deriveKey(KeyFormatProtoT keyformatprotot, InputStream inputStream) throws GeneralSecurityException {
            throw new GeneralSecurityException("deriveKey not implemented for key of type " + this.clazz.toString());
        }

        public final Class<KeyFormatProtoT> getKeyFormatClass() {
            return this.clazz;
        }

        public abstract KeyFormatProtoT parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException;

        public abstract void validateKeyFormat(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;
    }

    /* loaded from: classes.dex */
    protected static abstract class PrimitiveFactory<PrimitiveT, KeyT> {
        private final Class<PrimitiveT> clazz;

        public PrimitiveFactory(Class<PrimitiveT> cls) {
            this.clazz = cls;
        }

        public abstract PrimitiveT getPrimitive(KeyT keyt) throws GeneralSecurityException;

        final Class<PrimitiveT> getPrimitiveClass() {
            return this.clazz;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public KeyTypeManager(Class<KeyProtoT> cls, PrimitiveFactory<?, KeyProtoT>... primitiveFactoryArr) {
        this.clazz = cls;
        HashMap hashMap = new HashMap();
        for (PrimitiveFactory<?, KeyProtoT> primitiveFactory : primitiveFactoryArr) {
            if (!hashMap.containsKey(primitiveFactory.getPrimitiveClass())) {
                hashMap.put(primitiveFactory.getPrimitiveClass(), primitiveFactory);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + primitiveFactory.getPrimitiveClass().getCanonicalName());
            }
        }
        if (primitiveFactoryArr.length > 0) {
            this.firstPrimitiveClass = primitiveFactoryArr[0].getPrimitiveClass();
        } else {
            this.firstPrimitiveClass = Void.class;
        }
        this.factories = Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Class<?> firstSupportedPrimitiveClass() {
        return this.firstPrimitiveClass;
    }

    public final Class<KeyProtoT> getKeyClass() {
        return this.clazz;
    }

    public abstract String getKeyType();

    public final <P> P getPrimitive(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        PrimitiveFactory<?, KeyProtoT> primitiveFactory = this.factories.get(cls);
        if (primitiveFactory != null) {
            return (P) primitiveFactory.getPrimitive(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract int getVersion();

    public KeyFactory<?, KeyProtoT> keyFactory() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract KeyData.KeyMaterialType keyMaterialType();

    public abstract KeyProtoT parseKey(ByteString byteString) throws InvalidProtocolBufferException;

    public final Set<Class<?>> supportedPrimitives() {
        return this.factories.keySet();
    }

    public abstract void validateKey(KeyProtoT keyprotot) throws GeneralSecurityException;
}
