package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.q3 */
/* loaded from: classes.dex */
public final class C2935q3 {

    /* renamed from: a */
    final C3054y f7945a;

    /* renamed from: b */
    final C2952r4 f7946b;

    /* renamed from: c */
    final C2952r4 f7947c;

    /* renamed from: d */
    final C3002u7 f7948d;

    public C2935q3() {
        C3054y c3054y = new C3054y();
        this.f7945a = c3054y;
        C2952r4 c2952r4 = new C2952r4(null, c3054y);
        this.f7947c = c2952r4;
        this.f7946b = c2952r4.m32163a();
        C3002u7 c3002u7 = new C3002u7();
        this.f7948d = c3002u7;
        c2952r4.m32157g("require", new C2930pe(c3002u7));
        c3002u7.m32004a("internal.platform", CallableC2918p2.f7920a);
        c2952r4.m32157g("runtime.counter", new C2803i(Double.valueOf(0.0d)));
    }

    /* renamed from: a */
    public final InterfaceC2931q m32193a(C2952r4 c2952r4, C2857l5... c2857l5Arr) {
        InterfaceC2931q interfaceC2931q = InterfaceC2931q.f7930f;
        for (C2857l5 c2857l5 : c2857l5Arr) {
            interfaceC2931q = C2986t6.m32065a(c2857l5);
            C2969s5.m32125c(this.f7947c);
            if ((interfaceC2931q instanceof C2947r) || (interfaceC2931q instanceof C2915p)) {
                interfaceC2931q = this.f7945a.m31817a(c2952r4, interfaceC2931q);
            }
        }
        return interfaceC2931q;
    }
}
