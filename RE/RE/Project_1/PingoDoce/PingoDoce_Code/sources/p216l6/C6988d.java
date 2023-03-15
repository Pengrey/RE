package p216l6;

import p057d6.C4746d;
import p057d6.InterfaceC4744b;

/* renamed from: l6.d */
/* loaded from: classes.dex */
public final class C6988d implements InterfaceC4744b<InterfaceC6984a> {

    /* compiled from: TimeModule_UptimeClockFactory.java */
    /* renamed from: l6.d$a */
    /* loaded from: classes.dex */
    private static final class C6989a {

        /* renamed from: a */
        private static final C6988d f18603a = new C6988d();
    }

    /* renamed from: a */
    public static C6988d m19648a() {
        return C6989a.f18603a;
    }

    /* renamed from: c */
    public static InterfaceC6984a m19646c() {
        return (InterfaceC6984a) C4746d.m26713c(AbstractC6985b.m19653b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public InterfaceC6984a mo42226get() {
        return m19646c();
    }
}
