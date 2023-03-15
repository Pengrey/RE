package androidx.lifecycle;

import androidx.lifecycle.AbstractC1469p;
import p181jd.Intrinsics;
import td.InterfaceC10574t1;

/* compiled from: LifecycleController.kt */
/* loaded from: classes.dex */
public final class LifecycleController {

    /* renamed from: a */
    private final InterfaceC1485s f4218a;

    /* renamed from: b */
    private final AbstractC1469p f4219b;

    /* renamed from: c */
    private final AbstractC1469p.EnumC1472c f4220c;

    /* renamed from: d */
    private final DispatchQueue f4221d;

    public LifecycleController(AbstractC1469p abstractC1469p, AbstractC1469p.EnumC1472c enumC1472c, DispatchQueue dispatchQueue, final InterfaceC10574t1 interfaceC10574t1) {
        Intrinsics.isThisObjectNull(abstractC1469p, "lifecycle");
        Intrinsics.isThisObjectNull(enumC1472c, "minState");
        Intrinsics.isThisObjectNull(dispatchQueue, "dispatchQueue");
        Intrinsics.isThisObjectNull(interfaceC10574t1, "parentJob");
        this.f4219b = abstractC1469p;
        this.f4220c = enumC1472c;
        this.f4221d = dispatchQueue;
        InterfaceC1485s interfaceC1485s = new InterfaceC1485s() { // from class: androidx.lifecycle.LifecycleController$observer$1
            @Override // androidx.lifecycle.InterfaceC1485s
            /* renamed from: n */
            public final void mo33846n(InterfaceC1491v interfaceC1518v, AbstractC1469p.EnumC1471b enumC1498b) {
                AbstractC1469p.EnumC1472c enumC1499c2;
                DispatchQueue c1472i2;
                DispatchQueue c1472i3;
                Intrinsics.isThisObjectNull(interfaceC1518v, "source");
                Intrinsics.isThisObjectNull(enumC1498b, "<anonymous parameter 1>");
                AbstractC1469p mo132b = interfaceC1518v.mo137b();
                Intrinsics.checkIfNull(mo132b, "source.lifecycle");
                if (mo132b.mo10401b() == AbstractC1469p.EnumC1472c.DESTROYED) {
                    LifecycleController lifecycleController = LifecycleController.this;
                    InterfaceC10574t1.C10575a.m7654a(interfaceC10574t1, null, 1, null);
                    lifecycleController.m37086c();
                    return;
                }
                AbstractC1469p mo132b2 = interfaceC1518v.mo137b();
                Intrinsics.checkIfNull(mo132b2, "source.lifecycle");
                AbstractC1469p.EnumC1472c mo9735b = mo132b2.mo10401b();
                enumC1499c2 = LifecycleController.this.f4220c;
                if (mo9735b.compareTo(enumC1499c2) < 0) {
                    c1472i3 = LifecycleController.this.f4221d;
                    c1472i3.m37034g();
                    return;
                }
                c1472i2 = LifecycleController.this.f4221d;
                c1472i2.m37033h();
            }
        };
        this.f4218a = interfaceC1485s;
        if (abstractC1469p.mo10401b() == AbstractC1469p.EnumC1472c.DESTROYED) {
            InterfaceC10574t1.C10575a.m7654a(interfaceC10574t1, null, 1, null);
            m37086c();
            return;
        }
        abstractC1469p.mo10402a(interfaceC1485s);
    }

    /* renamed from: a */
    public static final /* synthetic */ DispatchQueue m37088a(LifecycleController lifecycleController) {
        return lifecycleController.f4221d;
    }

    /* renamed from: b */
    public static final /* synthetic */ AbstractC1469p.EnumC1472c m37087b(LifecycleController lifecycleController) {
        return lifecycleController.f4220c;
    }

    /* renamed from: c */
    public final void m37086c() {
        this.f4219b.mo10400c(this.f4218a);
        this.f4221d.m37035f();
    }
}
