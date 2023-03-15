package p139hd;

import p181jd.C6450z;
import p181jd.InterfaceC6428c;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;

/* renamed from: hd.a */
/* loaded from: classes2.dex */
public final class JvmClassMapping {
    /* renamed from: a */
    public static final Class m22767a(InterfaceC9717b interfaceC9717b) {
        Intrinsics.isThisObjectNull(interfaceC9717b, "<this>");
        Class<?> mo20958b = ((InterfaceC6428c) interfaceC9717b).mo20958b();
        Intrinsics.m20929f(mo20958b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return mo20958b;
    }

    /* renamed from: b */
    public static final Class m22766b(InterfaceC9717b interfaceC9717b) {
        Intrinsics.isThisObjectNull(interfaceC9717b, "<this>");
        Class<?> mo20958b = ((InterfaceC6428c) interfaceC9717b).mo20958b();
        if (!mo20958b.isPrimitive()) {
            Intrinsics.m20929f(mo20958b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return mo20958b;
        }
        String name = mo20958b.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    mo20958b = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    mo20958b = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    mo20958b = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    mo20958b = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    mo20958b = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    mo20958b = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    mo20958b = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    mo20958b = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    mo20958b = Short.class;
                    break;
                }
                break;
        }
        Intrinsics.m20929f(mo20958b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return mo20958b;
    }

    /* renamed from: c */
    public static final InterfaceC9717b m22765c(Class cls) {
        Intrinsics.isThisObjectNull(cls, "<this>");
        return C6450z.m20906b(cls);
    }
}
