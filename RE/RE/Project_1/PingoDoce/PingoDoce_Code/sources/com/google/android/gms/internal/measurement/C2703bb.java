package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.bb */
/* loaded from: classes.dex */
final class C2703bb {

    /* renamed from: a */
    private static final Unsafe f7666a;

    /* renamed from: b */
    private static final Class f7667b;

    /* renamed from: c */
    private static final boolean f7668c;

    /* renamed from: d */
    private static final AbstractC2687ab f7669d;

    /* renamed from: e */
    private static final boolean f7670e;

    /* renamed from: f */
    private static final boolean f7671f;

    /* renamed from: g */
    static final long f7672g;

    /* renamed from: h */
    static final boolean f7673h;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0133  */
    static {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2703bb.<clinit>():void");
    }

    private C2703bb() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    static boolean m32861A(Class cls) {
        int i = C2731d7.f7705a;
        try {
            Class cls2 = f7667b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static boolean m32860B(Object obj, long j) {
        return f7669d.mo31643g(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static boolean m32859C() {
        return f7671f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static boolean m32858D() {
        return f7670e;
    }

    /* renamed from: E */
    private static int m32857E(Class cls) {
        if (f7671f) {
            return f7669d.m32913h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m32856a(Class cls) {
        if (f7671f) {
            return f7669d.m32912i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m32855b() {
        int i = C2731d7.f7705a;
        Field m32854c = m32854c(Buffer.class, "effectiveDirectAddress");
        if (m32854c == null) {
            Field m32854c2 = m32854c(Buffer.class, "address");
            if (m32854c2 == null || m32854c2.getType() != Long.TYPE) {
                return null;
            }
            return m32854c2;
        }
        return m32854c;
    }

    /* renamed from: c */
    private static Field m32854c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static void m32853d(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        AbstractC2687ab abstractC2687ab = f7669d;
        int m32911j = abstractC2687ab.m32911j(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        abstractC2687ab.m32907n(obj, j2, ((255 & b) << i) | (m32911j & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static void m32852e(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        AbstractC2687ab abstractC2687ab = f7669d;
        int i = (((int) j) & 3) << 3;
        abstractC2687ab.m32907n(obj, j2, ((255 & b) << i) | (abstractC2687ab.m32911j(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static double m32851f(Object obj, long j) {
        return f7669d.mo31649a(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static float m32850g(Object obj, long j) {
        return f7669d.mo31648b(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m32849h(Object obj, long j) {
        return f7669d.m32911j(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static long m32848i(Object obj, long j) {
        return f7669d.m32910k(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static Object m32847j(Class cls) {
        try {
            return f7666a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static Object m32846k(Object obj, long j) {
        return f7669d.m32908m(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static Unsafe m32845l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C3050xa());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    static /* synthetic */ void m32844m(Throwable th2) {
        Logger.getLogger(C2703bb.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static void m32839r(Object obj, long j, boolean z) {
        f7669d.mo31647c(obj, j, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static void m32838s(byte[] bArr, long j, byte b) {
        f7669d.mo31646d(bArr, f7672g + j, b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static void m32837t(Object obj, long j, double d) {
        f7669d.mo31645e(obj, j, d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static void m32836u(Object obj, long j, float f) {
        f7669d.mo31644f(obj, j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static void m32835v(Object obj, long j, int i) {
        f7669d.m32907n(obj, j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static void m32834w(Object obj, long j, long j2) {
        f7669d.m32906o(obj, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static void m32833x(Object obj, long j, Object obj2) {
        f7669d.m32905p(obj, j, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static /* synthetic */ boolean m32832y(Object obj, long j) {
        return ((byte) ((f7669d.m32911j(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static /* synthetic */ boolean m32831z(Object obj, long j) {
        return ((byte) ((f7669d.m32911j(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
