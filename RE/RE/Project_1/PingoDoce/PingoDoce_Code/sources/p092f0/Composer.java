package p092f0;

import p181jd.Intrinsics;

/* renamed from: f0.c1 */
/* loaded from: classes.dex */
public final class Composer<T> {

    /* renamed from: a */
    private final InterfaceC5179i f14249a;

    private /* synthetic */ Composer(InterfaceC5179i interfaceC5179i) {
        this.f14249a = interfaceC5179i;
    }

    /* renamed from: a */
    public static final /* synthetic */ Composer m25517a(InterfaceC5179i interfaceC5179i) {
        return new Composer(interfaceC5179i);
    }

    /* renamed from: b */
    public static InterfaceC5179i m25516b(InterfaceC5179i interfaceC5179i) {
        Intrinsics.isThisObjectNull(interfaceC5179i, "composer");
        return interfaceC5179i;
    }

    /* renamed from: c */
    public static boolean m25515c(InterfaceC5179i interfaceC5179i, Object obj) {
        return (obj instanceof Composer) && Intrinsics.equals(interfaceC5179i, ((Composer) obj).m25512f());
    }

    /* renamed from: d */
    public static int m25514d(InterfaceC5179i interfaceC5179i) {
        return interfaceC5179i.hashCode();
    }

    /* renamed from: e */
    public static String m25513e(InterfaceC5179i interfaceC5179i) {
        return "SkippableUpdater(composer=" + interfaceC5179i + ')';
    }

    public boolean equals(Object obj) {
        return m25515c(this.f14249a, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ InterfaceC5179i m25512f() {
        return this.f14249a;
    }

    public int hashCode() {
        return m25514d(this.f14249a);
    }

    public String toString() {
        return m25513e(this.f14249a);
    }
}
