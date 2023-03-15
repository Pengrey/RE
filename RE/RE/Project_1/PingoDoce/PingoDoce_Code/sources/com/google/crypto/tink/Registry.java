package com.google.crypto.tink;

import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class Registry {
    private static final Logger logger = Logger.getLogger(Registry.class.getName());
    private static final ConcurrentMap<String, KeyManagerContainer> keyManagerMap = new ConcurrentHashMap();
    private static final ConcurrentMap<String, KeyDeriverContainer> keyDeriverMap = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> newKeyAllowedMap = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Catalogue<?>> catalogueMap = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, PrimitiveWrapper<?>> primitiveWrapperMap = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface KeyDeriverContainer {
        KeyData deriveKey(ByteString byteString, InputStream inputStream) throws GeneralSecurityException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface KeyManagerContainer {
        Class<?> getImplementingClass();

        <P> KeyManager<P> getKeyManager(Class<P> cls) throws GeneralSecurityException;

        KeyManager<?> getUntypedKeyManager();

        MessageLite parseKey(ByteString byteString) throws GeneralSecurityException, InvalidProtocolBufferException;

        Class<?> publicKeyManagerClassOrNull();

        Set<Class<?>> supportedPrimitives();
    }

    @Deprecated
    public static synchronized void addCatalogue(String str, Catalogue<?> catalogue) throws GeneralSecurityException {
        synchronized (Registry.class) {
            if (str == null) {
                throw new IllegalArgumentException("catalogueName must be non-null.");
            }
            if (catalogue != null) {
                ConcurrentMap<String, Catalogue<?>> concurrentMap = catalogueMap;
                if (concurrentMap.containsKey(str.toLowerCase()) && !catalogue.getClass().equals(concurrentMap.get(str.toLowerCase()).getClass())) {
                    Logger logger2 = logger;
                    logger2.warning("Attempted overwrite of a catalogueName catalogue for name " + str);
                    throw new GeneralSecurityException("catalogue for name " + str + " has been already registered");
                }
                concurrentMap.put(str.toLowerCase(), catalogue);
            } else {
                throw new IllegalArgumentException("catalogue must be non-null.");
            }
        }
    }

    private static <T> T checkNotNull(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    private static <P> KeyManagerContainer createContainerFor(final KeyManager<P> keyManager) {
        return new KeyManagerContainer() { // from class: com.google.crypto.tink.Registry.1
            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> getImplementingClass() {
                return KeyManager.this.getClass();
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public <Q> KeyManager<Q> getKeyManager(Class<Q> cls) throws GeneralSecurityException {
                if (KeyManager.this.getPrimitiveClass().equals(cls)) {
                    return KeyManager.this;
                }
                throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public KeyManager<?> getUntypedKeyManager() {
                return KeyManager.this;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public MessageLite parseKey(ByteString byteString) throws GeneralSecurityException, InvalidProtocolBufferException {
                return null;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> publicKeyManagerClassOrNull() {
                return null;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Set<Class<?>> supportedPrimitives() {
                return Collections.singleton(KeyManager.this.getPrimitiveClass());
            }
        };
    }

    private static <KeyProtoT extends MessageLite> KeyDeriverContainer createDeriverFor(final KeyTypeManager<KeyProtoT> keyTypeManager) {
        return new KeyDeriverContainer() { // from class: com.google.crypto.tink.Registry.4
            /* JADX WARN: Unknown type variable: KeyProtoT in type: com.google.crypto.tink.KeyTypeManager$KeyFactory<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyProtoT> */
            private <KeyFormatProtoT extends MessageLite> MessageLite deriveKeyWithFactory(ByteString byteString, InputStream inputStream, KeyTypeManager.KeyFactory<KeyFormatProtoT, KeyProtoT> keyFactory) throws GeneralSecurityException {
                try {
                    KeyFormatProtoT parseKeyFormat = keyFactory.parseKeyFormat(byteString);
                    keyFactory.validateKeyFormat(parseKeyFormat);
                    return (MessageLite) keyFactory.deriveKey(parseKeyFormat, inputStream);
                } catch (InvalidProtocolBufferException e) {
                    throw new GeneralSecurityException("parsing key format failed in deriveKey", e);
                }
            }

            @Override // com.google.crypto.tink.Registry.KeyDeriverContainer
            public KeyData deriveKey(ByteString byteString, InputStream inputStream) throws GeneralSecurityException {
                return KeyData.newBuilder().setTypeUrl(KeyTypeManager.this.getKeyType()).setValue(deriveKeyWithFactory(byteString, inputStream, KeyTypeManager.this.keyFactory()).toByteString()).setKeyMaterialType(KeyTypeManager.this.keyMaterialType()).build();
            }
        };
    }

    private static <KeyProtoT extends MessageLite, PublicKeyProtoT extends MessageLite> KeyManagerContainer createPrivateKeyContainerFor(final PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyTypeManager, final KeyTypeManager<PublicKeyProtoT> keyTypeManager) {
        return new KeyManagerContainer() { // from class: com.google.crypto.tink.Registry.3
            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> getImplementingClass() {
                return PrivateKeyTypeManager.this.getClass();
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public <Q> KeyManager<Q> getKeyManager(Class<Q> cls) throws GeneralSecurityException {
                try {
                    return new PrivateKeyManagerImpl(PrivateKeyTypeManager.this, keyTypeManager, cls);
                } catch (IllegalArgumentException e) {
                    throw new GeneralSecurityException("Primitive type not supported", e);
                }
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public KeyManager<?> getUntypedKeyManager() {
                PrivateKeyTypeManager privateKeyTypeManager2 = PrivateKeyTypeManager.this;
                return new PrivateKeyManagerImpl(privateKeyTypeManager2, keyTypeManager, privateKeyTypeManager2.firstSupportedPrimitiveClass());
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [com.google.crypto.tink.shaded.protobuf.MessageLite] */
            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public MessageLite parseKey(ByteString byteString) throws GeneralSecurityException, InvalidProtocolBufferException {
                ?? parseKey = PrivateKeyTypeManager.this.parseKey(byteString);
                PrivateKeyTypeManager.this.validateKey(parseKey);
                return parseKey;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> publicKeyManagerClassOrNull() {
                return keyTypeManager.getClass();
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Set<Class<?>> supportedPrimitives() {
                return PrivateKeyTypeManager.this.supportedPrimitives();
            }
        };
    }

    static synchronized KeyData deriveKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate, InputStream inputStream) throws GeneralSecurityException {
        KeyData deriveKey;
        synchronized (Registry.class) {
            String typeUrl = keyTemplate.getTypeUrl();
            ConcurrentMap<String, KeyDeriverContainer> concurrentMap = keyDeriverMap;
            if (concurrentMap.containsKey(typeUrl)) {
                deriveKey = concurrentMap.get(typeUrl).deriveKey(keyTemplate.getValue(), inputStream);
            } else {
                throw new GeneralSecurityException("No keymanager registered or key manager cannot derive keys for " + typeUrl);
            }
        }
        return deriveKey;
    }

    private static synchronized void ensureKeyManagerInsertable(String str, Class<?> cls, boolean z) throws GeneralSecurityException {
        synchronized (Registry.class) {
            ConcurrentMap<String, KeyManagerContainer> concurrentMap = keyManagerMap;
            if (concurrentMap.containsKey(str)) {
                KeyManagerContainer keyManagerContainer = concurrentMap.get(str);
                if (keyManagerContainer.getImplementingClass().equals(cls)) {
                    if (z && !newKeyAllowedMap.get(str).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                    }
                    return;
                }
                Logger logger2 = logger;
                logger2.warning("Attempted overwrite of a registered key manager for key type " + str);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, keyManagerContainer.getImplementingClass().getName(), cls.getName()));
            }
        }
    }

    @Deprecated
    public static Catalogue<?> getCatalogue(String str) throws GeneralSecurityException {
        if (str != null) {
            Catalogue<?> catalogue = catalogueMap.get(str.toLowerCase());
            if (catalogue == null) {
                String format = String.format("no catalogue found for %s. ", str);
                if (str.toLowerCase().startsWith("tinkaead")) {
                    format = format + "Maybe call AeadConfig.register().";
                }
                if (!str.toLowerCase().startsWith("tinkdeterministicaead")) {
                    if (!str.toLowerCase().startsWith("tinkstreamingaead")) {
                        if (!str.toLowerCase().startsWith("tinkhybriddecrypt") && !str.toLowerCase().startsWith("tinkhybridencrypt")) {
                            if (!str.toLowerCase().startsWith("tinkmac")) {
                                if (!str.toLowerCase().startsWith("tinkpublickeysign") && !str.toLowerCase().startsWith("tinkpublickeyverify")) {
                                    if (str.toLowerCase().startsWith("tink")) {
                                        format = format + "Maybe call TinkConfig.register().";
                                    }
                                } else {
                                    format = format + "Maybe call SignatureConfig.register().";
                                }
                            } else {
                                format = format + "Maybe call MacConfig.register().";
                            }
                        } else {
                            format = format + "Maybe call HybridConfig.register().";
                        }
                    } else {
                        format = format + "Maybe call StreamingAeadConfig.register().";
                    }
                } else {
                    format = format + "Maybe call DeterministicAeadConfig.register().";
                }
                throw new GeneralSecurityException(format);
            }
            return catalogue;
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    @Deprecated
    public static <P> KeyManager<P> getKeyManager(String str) throws GeneralSecurityException {
        return getKeyManagerInternal(str, null);
    }

    private static synchronized KeyManagerContainer getKeyManagerContainerOrThrow(String str) throws GeneralSecurityException {
        KeyManagerContainer keyManagerContainer;
        synchronized (Registry.class) {
            ConcurrentMap<String, KeyManagerContainer> concurrentMap = keyManagerMap;
            if (concurrentMap.containsKey(str)) {
                keyManagerContainer = concurrentMap.get(str);
            } else {
                throw new GeneralSecurityException("No key manager found for key type " + str);
            }
        }
        return keyManagerContainer;
    }

    private static <P> KeyManager<P> getKeyManagerInternal(String str, Class<P> cls) throws GeneralSecurityException {
        KeyManagerContainer keyManagerContainerOrThrow = getKeyManagerContainerOrThrow(str);
        if (cls == null) {
            return (KeyManager<P>) keyManagerContainerOrThrow.getUntypedKeyManager();
        }
        if (keyManagerContainerOrThrow.supportedPrimitives().contains(cls)) {
            return keyManagerContainerOrThrow.getKeyManager(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + keyManagerContainerOrThrow.getImplementingClass() + ", supported primitives: " + toCommaSeparatedString(keyManagerContainerOrThrow.supportedPrimitives()));
    }

    @Deprecated
    public static <P> P getPrimitive(String str, MessageLite messageLite) throws GeneralSecurityException {
        return (P) getPrimitiveInternal(str, messageLite, (Class<Object>) null);
    }

    private static <P> P getPrimitiveInternal(String str, MessageLite messageLite, Class<P> cls) throws GeneralSecurityException {
        return (P) getKeyManagerInternal(str, cls).getPrimitive(messageLite);
    }

    @Deprecated
    public static <P> PrimitiveSet<P> getPrimitives(KeysetHandle keysetHandle) throws GeneralSecurityException {
        return getPrimitives(keysetHandle, (KeyManager) null);
    }

    private static <P> PrimitiveSet<P> getPrimitivesInternal(KeysetHandle keysetHandle, KeyManager<P> keyManager, Class<P> cls) throws GeneralSecurityException {
        P p;
        Util.validateKeyset(keysetHandle.getKeyset());
        PrimitiveSet<P> newPrimitiveSet = PrimitiveSet.newPrimitiveSet(cls);
        for (Keyset.Key key : keysetHandle.getKeyset().getKeyList()) {
            if (key.getStatus() == KeyStatusType.ENABLED) {
                if (keyManager != null && keyManager.doesSupport(key.getKeyData().getTypeUrl())) {
                    p = keyManager.getPrimitive(key.getKeyData().getValue());
                } else {
                    p = (P) getPrimitiveInternal(key.getKeyData().getTypeUrl(), key.getKeyData().getValue(), cls);
                }
                PrimitiveSet.Entry<P> addPrimitive = newPrimitiveSet.addPrimitive(p, key);
                if (key.getKeyId() == keysetHandle.getKeyset().getPrimaryKeyId()) {
                    newPrimitiveSet.setPrimary(addPrimitive);
                }
            }
        }
        return newPrimitiveSet;
    }

    public static KeyData getPublicKeyData(String str, ByteString byteString) throws GeneralSecurityException {
        KeyManager keyManager = getKeyManager(str);
        if (keyManager instanceof PrivateKeyManager) {
            return ((PrivateKeyManager) keyManager).getPublicKeyData(byteString);
        }
        throw new GeneralSecurityException("manager for key type " + str + " is not a PrivateKeyManager");
    }

    public static KeyManager<?> getUntypedKeyManager(String str) throws GeneralSecurityException {
        return getKeyManagerContainerOrThrow(str).getUntypedKeyManager();
    }

    public static synchronized MessageLite newKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        MessageLite newKey;
        synchronized (Registry.class) {
            KeyManager<?> untypedKeyManager = getUntypedKeyManager(keyTemplate.getTypeUrl());
            if (newKeyAllowedMap.get(keyTemplate.getTypeUrl()).booleanValue()) {
                newKey = untypedKeyManager.newKey(keyTemplate.getValue());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + keyTemplate.getTypeUrl());
            }
        }
        return newKey;
    }

    public static synchronized KeyData newKeyData(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeyData newKeyData;
        synchronized (Registry.class) {
            KeyManager<?> untypedKeyManager = getUntypedKeyManager(keyTemplate.getTypeUrl());
            if (newKeyAllowedMap.get(keyTemplate.getTypeUrl()).booleanValue()) {
                newKeyData = untypedKeyManager.newKeyData(keyTemplate.getValue());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + keyTemplate.getTypeUrl());
            }
        }
        return newKeyData;
    }

    static MessageLite parseKeyData(KeyData keyData) throws GeneralSecurityException, InvalidProtocolBufferException {
        return getKeyManagerContainerOrThrow(keyData.getTypeUrl()).parseKey(keyData.getValue());
    }

    public static synchronized <KeyProtoT extends MessageLite, PublicKeyProtoT extends MessageLite> void registerAsymmetricKeyManagers(PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyTypeManager, KeyTypeManager<PublicKeyProtoT> keyTypeManager, boolean z) throws GeneralSecurityException {
        Class<?> publicKeyManagerClassOrNull;
        synchronized (Registry.class) {
            if (privateKeyTypeManager != null && keyTypeManager != null) {
                String keyType = privateKeyTypeManager.getKeyType();
                String keyType2 = keyTypeManager.getKeyType();
                ensureKeyManagerInsertable(keyType, privateKeyTypeManager.getClass(), z);
                ensureKeyManagerInsertable(keyType2, keyTypeManager.getClass(), false);
                if (!keyType.equals(keyType2)) {
                    ConcurrentMap<String, KeyManagerContainer> concurrentMap = keyManagerMap;
                    if (concurrentMap.containsKey(keyType) && (publicKeyManagerClassOrNull = concurrentMap.get(keyType).publicKeyManagerClassOrNull()) != null && !publicKeyManagerClassOrNull.equals(keyTypeManager.getClass())) {
                        Logger logger2 = logger;
                        logger2.warning("Attempted overwrite of a registered key manager for key type " + keyType + " with inconsistent public key type " + keyType2);
                        throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", privateKeyTypeManager.getClass().getName(), publicKeyManagerClassOrNull.getName(), keyTypeManager.getClass().getName()));
                    }
                    if (!concurrentMap.containsKey(keyType) || concurrentMap.get(keyType).publicKeyManagerClassOrNull() == null) {
                        concurrentMap.put(keyType, createPrivateKeyContainerFor(privateKeyTypeManager, keyTypeManager));
                        keyDeriverMap.put(keyType, createDeriverFor(privateKeyTypeManager));
                    }
                    ConcurrentMap<String, Boolean> concurrentMap2 = newKeyAllowedMap;
                    concurrentMap2.put(keyType, Boolean.valueOf(z));
                    if (!concurrentMap.containsKey(keyType2)) {
                        concurrentMap.put(keyType2, createContainerFor(keyTypeManager));
                    }
                    concurrentMap2.put(keyType2, Boolean.FALSE);
                } else {
                    throw new GeneralSecurityException("Private and public key type must be different.");
                }
            } else {
                throw new IllegalArgumentException("given key managers must be non-null.");
            }
        }
    }

    public static synchronized <P> void registerKeyManager(KeyManager<P> keyManager) throws GeneralSecurityException {
        synchronized (Registry.class) {
            registerKeyManager((KeyManager) keyManager, true);
        }
    }

    public static synchronized <P> void registerPrimitiveWrapper(PrimitiveWrapper<P> primitiveWrapper) throws GeneralSecurityException {
        synchronized (Registry.class) {
            if (primitiveWrapper != null) {
                Class<P> primitiveClass = primitiveWrapper.getPrimitiveClass();
                ConcurrentMap<Class<?>, PrimitiveWrapper<?>> concurrentMap = primitiveWrapperMap;
                if (concurrentMap.containsKey(primitiveClass)) {
                    PrimitiveWrapper<?> primitiveWrapper2 = concurrentMap.get(primitiveClass);
                    if (!primitiveWrapper.getClass().equals(primitiveWrapper2.getClass())) {
                        Logger logger2 = logger;
                        logger2.warning("Attempted overwrite of a registered SetWrapper for type " + primitiveClass.toString());
                        throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", primitiveClass.getName(), primitiveWrapper2.getClass().getName(), primitiveWrapper.getClass().getName()));
                    }
                }
                concurrentMap.put(primitiveClass, primitiveWrapper);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    static synchronized void reset() {
        synchronized (Registry.class) {
            keyManagerMap.clear();
            keyDeriverMap.clear();
            newKeyAllowedMap.clear();
            catalogueMap.clear();
            primitiveWrapperMap.clear();
        }
    }

    private static String toCommaSeparatedString(Set<Class<?>> set) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = true;
        for (Class<?> cls : set) {
            if (!z) {
                sb2.append(", ");
            }
            sb2.append(cls.getCanonicalName());
            z = false;
        }
        return sb2.toString();
    }

    public static <P> P wrap(PrimitiveSet<P> primitiveSet) throws GeneralSecurityException {
        PrimitiveWrapper<?> primitiveWrapper = primitiveWrapperMap.get(primitiveSet.getPrimitiveClass());
        if (primitiveWrapper != null) {
            return (P) primitiveWrapper.wrap(primitiveSet);
        }
        throw new GeneralSecurityException("No wrapper found for " + primitiveSet.getPrimitiveClass().getName());
    }

    private static <KeyProtoT extends MessageLite> KeyManagerContainer createContainerFor(final KeyTypeManager<KeyProtoT> keyTypeManager) {
        return new KeyManagerContainer() { // from class: com.google.crypto.tink.Registry.2
            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> getImplementingClass() {
                return KeyTypeManager.this.getClass();
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public <Q> KeyManager<Q> getKeyManager(Class<Q> cls) throws GeneralSecurityException {
                try {
                    return new KeyManagerImpl(KeyTypeManager.this, cls);
                } catch (IllegalArgumentException e) {
                    throw new GeneralSecurityException("Primitive type not supported", e);
                }
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public KeyManager<?> getUntypedKeyManager() {
                KeyTypeManager keyTypeManager2 = KeyTypeManager.this;
                return new KeyManagerImpl(keyTypeManager2, keyTypeManager2.firstSupportedPrimitiveClass());
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public MessageLite parseKey(ByteString byteString) throws GeneralSecurityException, InvalidProtocolBufferException {
                MessageLite parseKey = KeyTypeManager.this.parseKey(byteString);
                KeyTypeManager.this.validateKey(parseKey);
                return parseKey;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> publicKeyManagerClassOrNull() {
                return null;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Set<Class<?>> supportedPrimitives() {
                return KeyTypeManager.this.supportedPrimitives();
            }
        };
    }

    public static <P> KeyManager<P> getKeyManager(String str, Class<P> cls) throws GeneralSecurityException {
        return getKeyManagerInternal(str, (Class) checkNotNull(cls));
    }

    public static <P> P getPrimitive(String str, MessageLite messageLite, Class<P> cls) throws GeneralSecurityException {
        return (P) getPrimitiveInternal(str, messageLite, (Class) checkNotNull(cls));
    }

    public static <P> PrimitiveSet<P> getPrimitives(KeysetHandle keysetHandle, Class<P> cls) throws GeneralSecurityException {
        return getPrimitives(keysetHandle, null, cls);
    }

    @Deprecated
    public static <P> P getPrimitive(String str, ByteString byteString) throws GeneralSecurityException {
        return (P) getPrimitiveInternal(str, byteString, (Class<Object>) null);
    }

    private static <P> P getPrimitiveInternal(String str, ByteString byteString, Class<P> cls) throws GeneralSecurityException {
        return (P) getKeyManagerInternal(str, cls).getPrimitive(byteString);
    }

    @Deprecated
    public static <P> PrimitiveSet<P> getPrimitives(KeysetHandle keysetHandle, KeyManager<P> keyManager) throws GeneralSecurityException {
        return getPrimitivesInternal(keysetHandle, keyManager, null);
    }

    public static synchronized <P> void registerKeyManager(KeyManager<P> keyManager, boolean z) throws GeneralSecurityException {
        synchronized (Registry.class) {
            if (keyManager != null) {
                String keyType = keyManager.getKeyType();
                ensureKeyManagerInsertable(keyType, keyManager.getClass(), z);
                ConcurrentMap<String, KeyManagerContainer> concurrentMap = keyManagerMap;
                if (!concurrentMap.containsKey(keyType)) {
                    concurrentMap.put(keyType, createContainerFor(keyManager));
                }
                newKeyAllowedMap.put(keyType, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    public static <P> P getPrimitive(String str, ByteString byteString, Class<P> cls) throws GeneralSecurityException {
        return (P) getPrimitiveInternal(str, byteString, (Class) checkNotNull(cls));
    }

    public static <P> PrimitiveSet<P> getPrimitives(KeysetHandle keysetHandle, KeyManager<P> keyManager, Class<P> cls) throws GeneralSecurityException {
        return getPrimitivesInternal(keysetHandle, keyManager, (Class) checkNotNull(cls));
    }

    @Deprecated
    public static <P> P getPrimitive(String str, byte[] bArr) throws GeneralSecurityException {
        return (P) getPrimitive(str, ByteString.copyFrom(bArr));
    }

    public static <P> P getPrimitive(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return (P) getPrimitive(str, ByteString.copyFrom(bArr), cls);
    }

    public static synchronized MessageLite newKey(String str, MessageLite messageLite) throws GeneralSecurityException {
        MessageLite newKey;
        synchronized (Registry.class) {
            KeyManager keyManager = getKeyManager(str);
            if (newKeyAllowedMap.get(str).booleanValue()) {
                newKey = keyManager.newKey(messageLite);
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + str);
            }
        }
        return newKey;
    }

    @Deprecated
    public static <P> P getPrimitive(KeyData keyData) throws GeneralSecurityException {
        return (P) getPrimitive(keyData.getTypeUrl(), keyData.getValue());
    }

    public static <P> P getPrimitive(KeyData keyData, Class<P> cls) throws GeneralSecurityException {
        return (P) getPrimitive(keyData.getTypeUrl(), keyData.getValue(), cls);
    }

    public static synchronized <KeyProtoT extends MessageLite> void registerKeyManager(KeyTypeManager<KeyProtoT> keyTypeManager, boolean z) throws GeneralSecurityException {
        synchronized (Registry.class) {
            if (keyTypeManager != null) {
                String keyType = keyTypeManager.getKeyType();
                ensureKeyManagerInsertable(keyType, keyTypeManager.getClass(), z);
                ConcurrentMap<String, KeyManagerContainer> concurrentMap = keyManagerMap;
                if (!concurrentMap.containsKey(keyType)) {
                    concurrentMap.put(keyType, createContainerFor(keyTypeManager));
                    keyDeriverMap.put(keyType, createDeriverFor(keyTypeManager));
                }
                newKeyAllowedMap.put(keyType, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    @Deprecated
    public static synchronized <P> void registerKeyManager(String str, KeyManager<P> keyManager) throws GeneralSecurityException {
        synchronized (Registry.class) {
            registerKeyManager(str, keyManager, true);
        }
    }

    @Deprecated
    public static synchronized <P> void registerKeyManager(String str, KeyManager<P> keyManager, boolean z) throws GeneralSecurityException {
        synchronized (Registry.class) {
            try {
                if (keyManager != null) {
                    if (str.equals(keyManager.getKeyType())) {
                        registerKeyManager(keyManager, z);
                    } else {
                        throw new GeneralSecurityException("Manager does not support key type " + str + ".");
                    }
                } else {
                    throw new IllegalArgumentException("key manager must be non-null.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
