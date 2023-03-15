package com.squareup.moshi;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import p313qc.C9712b;

@CheckReturnValue
/* renamed from: com.squareup.moshi.s */
/* loaded from: classes2.dex */
public final class C4516s {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Type m27336a(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof Class) {
            return ((Class) type).getComponentType();
        }
        return null;
    }

    /* renamed from: b */
    public static GenericArrayType m27335b(Type type) {
        return new C9712b.C9713a(type);
    }

    /* renamed from: c */
    public static Type m27334c(Type type, Class<?> cls) {
        Type m27329h = m27329h(type, cls, Collection.class);
        if (m27329h instanceof WildcardType) {
            m27329h = ((WildcardType) m27329h).getUpperBounds()[0];
        }
        if (m27329h instanceof ParameterizedType) {
            return ((ParameterizedType) m27329h).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: d */
    public static boolean m27333d(@Nullable Type type, @Nullable Type type2) {
        Type[] actualTypeArguments;
        Type[] actualTypeArguments2;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            if (type2 instanceof GenericArrayType) {
                return m27333d(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return type.equals(type2);
        } else if (type instanceof ParameterizedType) {
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                if (parameterizedType instanceof C9712b.C9714b) {
                    actualTypeArguments = ((C9712b.C9714b) parameterizedType).f25576y;
                } else {
                    actualTypeArguments = parameterizedType.getActualTypeArguments();
                }
                if (parameterizedType2 instanceof C9712b.C9714b) {
                    actualTypeArguments2 = ((C9712b.C9714b) parameterizedType2).f25576y;
                } else {
                    actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                }
                return m27333d(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(actualTypeArguments, actualTypeArguments2);
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return m27333d(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return m27333d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    /* renamed from: e */
    public static String m27332e(String str) {
        return str.replace("$", "_") + "JsonAdapter";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static Type m27331f(Type type) {
        Class<?> m27330g = m27330g(type);
        return C9712b.m10127p(type, m27330g, m27330g.getGenericSuperclass());
    }

    /* renamed from: g */
    public static Class<?> m27330g(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m27330g(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m27330g(((WildcardType) type).getUpperBounds()[0]);
        }
        String name = type == null ? "null" : type.getClass().getName();
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    /* renamed from: h */
    static Type m27329h(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C9712b.m10127p(type, cls, C9712b.m10138e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static Type[] m27328i(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type m27329h = m27329h(type, cls, Map.class);
        return m27329h instanceof ParameterizedType ? ((ParameterizedType) m27329h).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    /* renamed from: j */
    public static ParameterizedType m27327j(Type type, Type... typeArr) {
        if (typeArr.length != 0) {
            return new C9712b.C9714b(null, type, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + type);
    }

    /* renamed from: k */
    public static WildcardType m27326k(Type type) {
        return new C9712b.C9715c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, C9712b.f25569b);
    }

    /* renamed from: l */
    public static WildcardType m27325l(Type type) {
        return new C9712b.C9715c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }
}
