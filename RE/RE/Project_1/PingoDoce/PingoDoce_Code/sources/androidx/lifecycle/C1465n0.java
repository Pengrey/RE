package androidx.lifecycle;

import p259o.InterfaceC7946a;

/* renamed from: androidx.lifecycle.n0 */
/* loaded from: classes.dex */
public class C1465n0 {

    /* compiled from: Transformations.java */
    /* renamed from: androidx.lifecycle.n0$a */
    /* loaded from: classes.dex */
    class C1466a implements InterfaceC1440f0<X> {

        /* renamed from: a */
        final /* synthetic */ C1430c0 f4343a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC7946a f4344b;

        C1466a(C1430c0 c1430c0, InterfaceC7946a interfaceC7946a) {
            this.f4343a = c1430c0;
            this.f4344b = interfaceC7946a;
        }

        @Override // androidx.lifecycle.InterfaceC1440f0
        /* renamed from: c */
        public void mo37325a(X x) {
            this.f4343a.mo166p(this.f4344b.mo37540b(x));
        }
    }

    /* renamed from: a */
    public static <X, Y> LiveData<Y> m36993a(LiveData<X> liveData, InterfaceC7946a<X, Y> interfaceC7946a) {
        C1430c0 c1430c0 = new C1430c0();
        c1430c0.m37055q(liveData, new C1466a(c1430c0, interfaceC7946a));
        return c1430c0;
    }
}
