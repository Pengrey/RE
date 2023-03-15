package p313qc;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.AbstractC4476h;
import com.squareup.moshi.C4496p;
import com.squareup.moshi.C4516s;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import com.squareup.moshi.JsonDataException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import p296pc.InterfaceC8603a;

/* renamed from: qc.b */
/* loaded from: classes2.dex */
public final class C9712b {

    /* renamed from: a */
    public static final Set<Annotation> f25568a;

    /* renamed from: b */
    public static final Type[] f25569b;
    @Nullable

    /* renamed from: c */
    public static final Class<?> f25570c;
    @Nullable

    /* renamed from: d */
    private static final Class<? extends Annotation> f25571d;

    /* renamed from: e */
    private static final Map<Class<?>, Class<?>> f25572e;

    /* compiled from: Util.java */
    /* renamed from: qc.b$a */
    /* loaded from: classes2.dex */
    public static final class C9713a implements GenericArrayType {

        /* renamed from: w */
        private final Type f25573w;

        public C9713a(Type type) {
            this.f25573w = C9712b.m10142a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C4516s.m27333d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f25573w;
        }

        public int hashCode() {
            return this.f25573w.hashCode();
        }

        public String toString() {
            return C9712b.m10122u(this.f25573w) + "[]";
        }
    }

    /* compiled from: Util.java */
    /* renamed from: qc.b$b */
    /* loaded from: classes2.dex */
    public static final class C9714b implements ParameterizedType {
        @Nullable

        /* renamed from: w */
        private final Type f25574w;

        /* renamed from: x */
        private final Type f25575x;

        /* renamed from: y */
        public final Type[] f25576y;

        public C9714b(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || C4516s.m27330g(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            this.f25574w = type == null ? null : C9712b.m10142a(type);
            this.f25575x = C9712b.m10142a(type2);
            this.f25576y = (Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                Type[] typeArr2 = this.f25576y;
                if (i >= typeArr2.length) {
                    return;
                }
                Objects.requireNonNull(typeArr2[i]);
                C9712b.m10141b(typeArr2[i]);
                Type[] typeArr3 = this.f25576y;
                typeArr3[i] = C9712b.m10142a(typeArr3[i]);
                i++;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C4516s.m27333d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f25576y.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @Nullable
        public Type getOwnerType() {
            return this.f25574w;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f25575x;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f25576y) ^ this.f25575x.hashCode()) ^ C9712b.m10137f(this.f25574w);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((this.f25576y.length + 1) * 30);
            sb2.append(C9712b.m10122u(this.f25575x));
            if (this.f25576y.length == 0) {
                return sb2.toString();
            }
            sb2.append("<");
            sb2.append(C9712b.m10122u(this.f25576y[0]));
            for (int i = 1; i < this.f25576y.length; i++) {
                sb2.append(", ");
                sb2.append(C9712b.m10122u(this.f25576y[i]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* compiled from: Util.java */
    /* renamed from: qc.b$c */
    /* loaded from: classes2.dex */
    public static final class C9715c implements WildcardType {

        /* renamed from: w */
        private final Type f25577w;
        @Nullable

        /* renamed from: x */
        private final Type f25578x;

        public C9715c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length <= 1) {
                if (typeArr.length == 1) {
                    if (typeArr2.length == 1) {
                        Objects.requireNonNull(typeArr2[0]);
                        C9712b.m10141b(typeArr2[0]);
                        if (typeArr[0] == Object.class) {
                            this.f25578x = C9712b.m10142a(typeArr2[0]);
                            this.f25577w = Object.class;
                            return;
                        }
                        throw new IllegalArgumentException();
                    }
                    Objects.requireNonNull(typeArr[0]);
                    C9712b.m10141b(typeArr[0]);
                    this.f25578x = null;
                    this.f25577w = C9712b.m10142a(typeArr[0]);
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C4516s.m27333d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f25578x;
            return type != null ? new Type[]{type} : C9712b.f25569b;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f25577w};
        }

        public int hashCode() {
            Type type = this.f25578x;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f25577w.hashCode() + 31);
        }

        public String toString() {
            if (this.f25578x != null) {
                return "? super " + C9712b.m10122u(this.f25578x);
            } else if (this.f25577w == Object.class) {
                return "?";
            } else {
                return "? extends " + C9712b.m10122u(this.f25577w);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:10:0x001a
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    static {
        /*
            java.util.Set r0 = java.util.Collections.emptySet()
            p313qc.C9712b.f25568a = r0
            r0 = 0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            p313qc.C9712b.f25569b = r0
            r0 = 0
            java.lang.String r1 = getKotlinMetadataClassName()     // Catch: java.lang.ClassNotFoundException -> L15
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L15
            goto L16
        L15:
            r1 = r0
        L16:
            p313qc.C9712b.f25571d = r1
            java.lang.Class<kotlin.jvm.internal.DefaultConstructorMarker> r0 = kotlin.jvm.internal.DefaultConstructorMarker.class
        L1a:
            p313qc.C9712b.f25570c = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 16
            r0.<init>(r1)
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Byte.TYPE
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Character.TYPE
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Short.TYPE
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Void.TYPE
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            r0.put(r1, r2)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            p313qc.C9712b.f25572e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p313qc.C9712b.<clinit>():void");
    }

    /* renamed from: a */
    public static Type m10142a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C9713a(m10142a(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            if (type instanceof C9714b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C9714b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return type instanceof C9713a ? type : new C9713a(((GenericArrayType) type).getGenericComponentType());
        } else if (!(type instanceof WildcardType) || (type instanceof C9715c)) {
            return type;
        } else {
            WildcardType wildcardType = (WildcardType) type;
            return new C9715c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: b */
    static void m10141b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    @Nullable
    /* renamed from: c */
    static Class<?> m10140c(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    @Nullable
    /* renamed from: d */
    public static AbstractC4470f<?> m10139d(C4496p c4496p, Type type, Class<?> cls) {
        Constructor<?> declaredConstructor;
        Object[] objArr;
        InterfaceC4475g interfaceC4475g = (InterfaceC4475g) cls.getAnnotation(InterfaceC4475g.class);
        Class<?> cls2 = null;
        if (interfaceC4475g == null || !interfaceC4475g.generateAdapter()) {
            return null;
        }
        try {
            try {
                cls2 = Class.forName(C4516s.m27332e(cls.getName()), true, cls.getClassLoader());
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    try {
                        declaredConstructor = cls2.getDeclaredConstructor(C4496p.class, Type[].class);
                        objArr = new Object[]{c4496p, actualTypeArguments};
                    } catch (NoSuchMethodException unused) {
                        declaredConstructor = cls2.getDeclaredConstructor(Type[].class);
                        objArr = new Object[]{actualTypeArguments};
                    }
                } else {
                    try {
                        declaredConstructor = cls2.getDeclaredConstructor(C4496p.class);
                        objArr = new Object[]{c4496p};
                    } catch (NoSuchMethodException unused2) {
                        declaredConstructor = cls2.getDeclaredConstructor(new Class[0]);
                        objArr = new Object[0];
                    }
                }
                declaredConstructor.setAccessible(true);
                return ((AbstractC4470f) declaredConstructor.newInstance(objArr)).m27474f();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Failed to access the generated JsonAdapter for " + type, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type, e3);
            } catch (InvocationTargetException e4) {
                throw m10124s(e4);
            }
        } catch (NoSuchMethodException e5) {
            if (!(type instanceof ParameterizedType) && cls2.getTypeParameters().length != 0) {
                throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type + "'. Suspiciously, the type was not parameterized but the target class '" + cls2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e5);
            }
            throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type, e5);
        }
    }

    /* renamed from: e */
    public static Type m10138e(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m10138e(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m10138e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: f */
    static int m10137f(@Nullable Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: g */
    static int m10136g(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    /* renamed from: h */
    public static boolean m10135h(Class<?> cls) {
        Class<? extends Annotation> cls2 = f25571d;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    /* renamed from: i */
    public static boolean m10134i(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    /* renamed from: j */
    public static Set<? extends Annotation> m10133j(AnnotatedElement annotatedElement) {
        return m10132k(annotatedElement.getAnnotations());
    }

    /* renamed from: k */
    public static Set<? extends Annotation> m10132k(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(InterfaceC8603a.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f25568a;
    }

    /* renamed from: l */
    public static String m10131l(String str, @Nullable InterfaceC4469e interfaceC4469e) {
        if (interfaceC4469e == null) {
            return str;
        }
        String name = interfaceC4469e.name();
        return "\u0000".equals(name) ? str : name;
    }

    /* renamed from: m */
    public static String m10130m(String str, AnnotatedElement annotatedElement) {
        return m10131l(str, (InterfaceC4469e) annotatedElement.getAnnotation(InterfaceC4469e.class));
    }

    /* renamed from: n */
    public static JsonDataException m10129n(String str, String str2, AbstractC4476h abstractC4476h) {
        String format;
        String m27462v = abstractC4476h.m27462v();
        if (str2.equals(str)) {
            format = String.format("Required value '%s' missing at %s", str, m27462v);
        } else {
            format = String.format("Required value '%s' (JSON name '%s') missing at %s", str, str2, m27462v);
        }
        return new JsonDataException(format);
    }

    /* renamed from: o */
    public static Type m10128o(Type type) {
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return type;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return upperBounds[0];
            }
            throw new IllegalArgumentException();
        }
        return type;
    }

    /* renamed from: p */
    public static Type m10127p(Type type, Class<?> cls, Type type2) {
        return m10126q(type, cls, type2, new LinkedHashSet());
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r10 = r10;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.reflect.Type m10126q(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable<?>> r11) {
        /*
        L0:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L18
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r1 = r11.contains(r0)
            if (r1 == 0) goto Le
            return r10
        Le:
            r11.add(r0)
            java.lang.reflect.Type r10 = m10125r(r8, r9, r0)
            if (r10 != r0) goto L0
            return r10
        L18:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L35
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L35
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m10126q(r8, r9, r10, r11)
            if (r10 != r8) goto L30
            goto L34
        L30:
            java.lang.reflect.GenericArrayType r0 = com.squareup.moshi.C4516s.m27335b(r8)
        L34:
            return r0
        L35:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L4b
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m10126q(r8, r9, r0, r11)
            if (r0 != r8) goto L46
            goto L4a
        L46:
            java.lang.reflect.GenericArrayType r10 = com.squareup.moshi.C4516s.m27335b(r8)
        L4a:
            return r10
        L4b:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8d
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m10126q(r8, r9, r0, r11)
            if (r3 == r0) goto L5f
            r0 = r1
            goto L60
        L5f:
            r0 = r2
        L60:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L65:
            if (r2 >= r5) goto L80
            r6 = r4[r2]
            java.lang.reflect.Type r6 = m10126q(r8, r9, r6, r11)
            r7 = r4[r2]
            if (r6 == r7) goto L7d
            if (r0 != 0) goto L7b
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = r1
        L7b:
            r4[r2] = r6
        L7d:
            int r2 = r2 + 1
            goto L65
        L80:
            if (r0 == 0) goto L8c
            qc.b$b r8 = new qc.b$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L8c:
            return r10
        L8d:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Lbf
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto Lad
            r1 = r0[r2]
            java.lang.reflect.Type r8 = m10126q(r8, r9, r1, r11)
            r9 = r0[r2]
            if (r8 == r9) goto Lbf
            java.lang.reflect.WildcardType r8 = com.squareup.moshi.C4516s.m27325l(r8)
            return r8
        Lad:
            int r0 = r3.length
            if (r0 != r1) goto Lbf
            r0 = r3[r2]
            java.lang.reflect.Type r8 = m10126q(r8, r9, r0, r11)
            r9 = r3[r2]
            if (r8 == r9) goto Lbf
            java.lang.reflect.WildcardType r8 = com.squareup.moshi.C4516s.m27326k(r8)
            return r8
        Lbf:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p313qc.C9712b.m10126q(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    /* renamed from: r */
    static Type m10125r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> m10140c = m10140c(typeVariable);
        if (m10140c == null) {
            return typeVariable;
        }
        Type m10138e = m10138e(type, cls, m10140c);
        if (m10138e instanceof ParameterizedType) {
            return ((ParameterizedType) m10138e).getActualTypeArguments()[m10136g(m10140c.getTypeParameters(), typeVariable)];
        }
        return typeVariable;
    }

    /* renamed from: s */
    public static RuntimeException m10124s(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (!(targetException instanceof RuntimeException)) {
            if (targetException instanceof Error) {
                throw ((Error) targetException);
            }
            throw new RuntimeException(targetException);
        }
        throw ((RuntimeException) targetException);
    }

    /* renamed from: t */
    public static String m10123t(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: u */
    static String m10122u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: v */
    public static JsonDataException m10121v(String str, String str2, AbstractC4476h abstractC4476h) {
        String format;
        String m27462v = abstractC4476h.m27462v();
        if (str2.equals(str)) {
            format = String.format("Non-null value '%s' was null at %s", str, m27462v);
        } else {
            format = String.format("Non-null value '%s' (JSON name '%s') was null at %s", str, str2, m27462v);
        }
        return new JsonDataException(format);
    }
}
