package p064dd;

import p083ed.JDK7PlatformImplementations;
import p105fd.C5453a;
import p181jd.Intrinsics;
import sd.C10171u;

/* renamed from: dd.b */
/* loaded from: classes2.dex */
public final class C4784b {

    /* renamed from: a */
    public static final PlatformImplementations f13103a;

    static {
        PlatformImplementations platformImplementations;
        Object newInstance;
        Object newInstance2;
        int m26612a = m26612a();
        if (m26612a >= 65544 || m26612a < 65536) {
            try {
                newInstance = C5453a.class.newInstance();
                Intrinsics.checkIfNull(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            } catch (ClassNotFoundException unused) {
                Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                Intrinsics.checkIfNull(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (newInstance3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    platformImplementations = (PlatformImplementations) newInstance3;
                } catch (ClassCastException e) {
                    ClassLoader classLoader = newInstance3.getClass().getClassLoader();
                    ClassLoader classLoader2 = PlatformImplementations.class.getClassLoader();
                    if (Intrinsics.equals(classLoader, classLoader2)) {
                        throw e;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
                }
            }
            try {
                if (newInstance == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                }
                platformImplementations = (PlatformImplementations) newInstance;
                f13103a = platformImplementations;
            } catch (ClassCastException e2) {
                ClassLoader classLoader3 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader4 = PlatformImplementations.class.getClassLoader();
                if (Intrinsics.equals(classLoader3, classLoader4)) {
                    throw e2;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
            }
        }
        if (m26612a >= 65543 || m26612a < 65536) {
            try {
                try {
                    newInstance2 = JDK7PlatformImplementations.class.newInstance();
                    Intrinsics.checkIfNull(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                    } catch (ClassCastException e3) {
                        ClassLoader classLoader5 = newInstance2.getClass().getClassLoader();
                        ClassLoader classLoader6 = PlatformImplementations.class.getClassLoader();
                        if (Intrinsics.equals(classLoader5, classLoader6)) {
                            throw e3;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                    }
                } catch (ClassNotFoundException unused2) {
                }
            } catch (ClassNotFoundException unused3) {
                Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                Intrinsics.checkIfNull(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (newInstance4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    platformImplementations = (PlatformImplementations) newInstance4;
                } catch (ClassCastException e4) {
                    ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                    ClassLoader classLoader8 = PlatformImplementations.class.getClassLoader();
                    if (Intrinsics.equals(classLoader7, classLoader8)) {
                        throw e4;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
                }
            }
            if (newInstance2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            platformImplementations = (PlatformImplementations) newInstance2;
            f13103a = platformImplementations;
        }
        platformImplementations = new PlatformImplementations();
        f13103a = platformImplementations;
    }

    /* renamed from: a */
    private static final int m26612a() {
        int m8906T;
        int m8906T2;
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        m8906T = C10171u.m8906T(property, '.', 0, false, 6, null);
        if (m8906T < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        }
        int i = m8906T + 1;
        m8906T2 = C10171u.m8906T(property, '.', i, false, 4, null);
        if (m8906T2 < 0) {
            m8906T2 = property.length();
        }
        String substring = property.substring(0, m8906T);
        Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = property.substring(i, m8906T2);
        Intrinsics.checkIfNull(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        try {
            return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
        } catch (NumberFormatException unused2) {
            return 65542;
        }
    }
}
