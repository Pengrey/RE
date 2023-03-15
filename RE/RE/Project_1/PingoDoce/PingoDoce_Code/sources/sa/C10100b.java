package sa;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* renamed from: sa.b  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C10100b {

    /* renamed from: a */
    static final Type[] f26381a = new Type[0];

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: $Gson$Types.java */
    /* renamed from: sa.b$a */
    /* loaded from: classes2.dex */
    public static final class C10101a implements GenericArrayType, Serializable {

        /* renamed from: w */
        private final Type f26382w;

        public C10101a(Type type) {
            this.f26382w = C10100b.m9141b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C10100b.m9137f(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f26382w;
        }

        public int hashCode() {
            return this.f26382w.hashCode();
        }

        public String toString() {
            return C10100b.m9122u(this.f26382w) + "[]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: $Gson$Types.java */
    /* renamed from: sa.b$b */
    /* loaded from: classes2.dex */
    public static final class C10102b implements ParameterizedType, Serializable {

        /* renamed from: w */
        private final Type f26383w;

        /* renamed from: x */
        private final Type f26384x;

        /* renamed from: y */
        private final Type[] f26385y;

        public C10102b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                C10099a.m9144a(z);
            }
            this.f26383w = type == null ? null : C10100b.m9141b(type);
            this.f26384x = C10100b.m9141b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f26385y = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                C10099a.m9143b(this.f26385y[i]);
                C10100b.m9140c(this.f26385y[i]);
                Type[] typeArr3 = this.f26385y;
                typeArr3[i] = C10100b.m9141b(typeArr3[i]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C10100b.m9137f(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f26385y.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f26383w;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f26384x;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f26385y) ^ this.f26384x.hashCode()) ^ C10100b.m9130m(this.f26383w);
        }

        public String toString() {
            int length = this.f26385y.length;
            if (length == 0) {
                return C10100b.m9122u(this.f26384x);
            }
            StringBuilder sb2 = new StringBuilder((length + 1) * 30);
            sb2.append(C10100b.m9122u(this.f26384x));
            sb2.append("<");
            sb2.append(C10100b.m9122u(this.f26385y[0]));
            for (int i = 1; i < length; i++) {
                sb2.append(", ");
                sb2.append(C10100b.m9122u(this.f26385y[i]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: $Gson$Types.java */
    /* renamed from: sa.b$c */
    /* loaded from: classes2.dex */
    public static final class C10103c implements WildcardType, Serializable {

        /* renamed from: w */
        private final Type f26386w;

        /* renamed from: x */
        private final Type f26387x;

        public C10103c(Type[] typeArr, Type[] typeArr2) {
            C10099a.m9144a(typeArr2.length <= 1);
            C10099a.m9144a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                C10099a.m9143b(typeArr2[0]);
                C10100b.m9140c(typeArr2[0]);
                C10099a.m9144a(typeArr[0] == Object.class);
                this.f26387x = C10100b.m9141b(typeArr2[0]);
                this.f26386w = Object.class;
                return;
            }
            C10099a.m9143b(typeArr[0]);
            C10100b.m9140c(typeArr[0]);
            this.f26387x = null;
            this.f26386w = C10100b.m9141b(typeArr[0]);
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C10100b.m9137f(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f26387x;
            return type != null ? new Type[]{type} : C10100b.f26381a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f26386w};
        }

        public int hashCode() {
            Type type = this.f26387x;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f26386w.hashCode() + 31);
        }

        public String toString() {
            if (this.f26387x != null) {
                return "? super " + C10100b.m9122u(this.f26387x);
            } else if (this.f26386w == Object.class) {
                return "?";
            } else {
                return "? extends " + C10100b.m9122u(this.f26386w);
            }
        }
    }

    /* renamed from: a */
    public static GenericArrayType m9142a(Type type) {
        return new C10101a(type);
    }

    /* renamed from: b */
    public static Type m9141b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C10101a(m9141b(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C10102b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C10101a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return new C10103c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
            }
            return type;
        }
    }

    /* renamed from: c */
    static void m9140c(Type type) {
        C10099a.m9144a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* renamed from: d */
    private static Class<?> m9139d(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: e */
    static boolean m9138e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: f */
    public static boolean m9137f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                return m9138e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m9137f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        } else if (type instanceof WildcardType) {
            if (type2 instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                WildcardType wildcardType2 = (WildcardType) type2;
                return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
            }
            return false;
        } else if ((type instanceof TypeVariable) && (type2 instanceof TypeVariable)) {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        } else {
            return false;
        }
    }

    /* renamed from: g */
    public static Type m9136g(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    /* renamed from: h */
    public static Type m9135h(Type type, Class<?> cls) {
        Type m9131l = m9131l(type, cls, Collection.class);
        if (m9131l instanceof WildcardType) {
            m9131l = ((WildcardType) m9131l).getUpperBounds()[0];
        }
        if (m9131l instanceof ParameterizedType) {
            return ((ParameterizedType) m9131l).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: i */
    static Type m9134i(Type type, Class<?> cls, Class<?> cls2) {
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
                    return m9134i(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return m9134i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: j */
    public static Type[] m9133j(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type m9131l = m9131l(type, cls, Map.class);
        return m9131l instanceof ParameterizedType ? ((ParameterizedType) m9131l).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    /* renamed from: k */
    public static Class<?> m9132k(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C10099a.m9144a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m9132k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m9132k(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    /* renamed from: l */
    static Type m9131l(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C10099a.m9144a(cls2.isAssignableFrom(cls));
        return m9127p(type, cls, m9134i(type, cls, cls2));
    }

    /* renamed from: m */
    static int m9130m(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: n */
    private static int m9129n(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: o */
    public static ParameterizedType m9128o(Type type, Type type2, Type... typeArr) {
        return new C10102b(type, type2, typeArr);
    }

    /* renamed from: p */
    public static Type m9127p(Type type, Class<?> cls, Type type2) {
        return m9126q(type, cls, type2, new HashSet());
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r10 = r10;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.reflect.Type m9126q(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
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
            java.lang.reflect.Type r10 = m9125r(r8, r9, r0)
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
            java.lang.reflect.Type r8 = m9126q(r8, r9, r10, r11)
            if (r10 != r8) goto L30
            goto L34
        L30:
            java.lang.reflect.GenericArrayType r0 = m9142a(r8)
        L34:
            return r0
        L35:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L4b
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m9126q(r8, r9, r0, r11)
            if (r0 != r8) goto L46
            goto L4a
        L46:
            java.lang.reflect.GenericArrayType r10 = m9142a(r8)
        L4a:
            return r10
        L4b:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8b
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m9126q(r8, r9, r0, r11)
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
            java.lang.reflect.Type r6 = m9126q(r8, r9, r6, r11)
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
            if (r0 == 0) goto L8a
            java.lang.reflect.Type r8 = r10.getRawType()
            java.lang.reflect.ParameterizedType r10 = m9128o(r3, r8, r4)
        L8a:
            return r10
        L8b:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Lbd
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto Lab
            r1 = r0[r2]
            java.lang.reflect.Type r8 = m9126q(r8, r9, r1, r11)
            r9 = r0[r2]
            if (r8 == r9) goto Lbd
            java.lang.reflect.WildcardType r8 = m9123t(r8)
            return r8
        Lab:
            int r0 = r3.length
            if (r0 != r1) goto Lbd
            r0 = r3[r2]
            java.lang.reflect.Type r8 = m9126q(r8, r9, r0, r11)
            r9 = r3[r2]
            if (r8 == r9) goto Lbd
            java.lang.reflect.WildcardType r8 = m9124s(r8)
            return r8
        Lbd:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.C10100b.m9126q(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    /* renamed from: r */
    static Type m9125r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> m9139d = m9139d(typeVariable);
        if (m9139d == null) {
            return typeVariable;
        }
        Type m9134i = m9134i(type, cls, m9139d);
        if (m9134i instanceof ParameterizedType) {
            return ((ParameterizedType) m9134i).getActualTypeArguments()[m9129n(m9139d.getTypeParameters(), typeVariable)];
        }
        return typeVariable;
    }

    /* renamed from: s */
    public static WildcardType m9124s(Type type) {
        return new C10103c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, f26381a);
    }

    /* renamed from: t */
    public static WildcardType m9123t(Type type) {
        return new C10103c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    /* renamed from: u */
    public static String m9122u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
