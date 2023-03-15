package p216l6;

import p057d6.C4746d;
import p057d6.InterfaceC4744b;

/* renamed from: l6.c */
/* loaded from: classes.dex */
public final class C6986c implements InterfaceC4744b<InterfaceC6984a> {

    /* compiled from: TimeModule_EventClockFactory.java */
    /* renamed from: l6.c$a */
    /* loaded from: classes.dex */
    private static final class C6987a {

        /* renamed from: a */
        private static final C6986c f18602a = new C6986c();
    }

    /* renamed from: a */
    public static C6986c m19652a() {
        return C6987a.f18602a;
    }

    /* renamed from: b */
    public static InterfaceC6984a m19651b() {
        return (InterfaceC6984a) C4746d.m26713c(AbstractC6985b.m19654a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: c */
    public InterfaceC6984a mo42226get() {
        return m19651b();
    }
}
