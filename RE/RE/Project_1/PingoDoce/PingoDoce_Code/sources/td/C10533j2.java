package td;

import p468yc.C13183m;
import p468yc.C13186n;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: td.j2 */
/* loaded from: classes2.dex */
public final class C10533j2<T> extends AbstractC10601z1 {

    /* renamed from: A */
    private final C10534k<T> f27246A;

    /* JADX WARN: Multi-variable type inference failed */
    public C10533j2(C10534k<? super T> c10534k) {
        this.f27246A = c10534k;
    }

    @Override // td.AbstractC10599z
    /* renamed from: A */
    public void mo7587A(Throwable th2) {
        Object m7887i0 = m7586B().m7887i0();
        if (C10539l0.m7720a() && !(!(m7887i0 instanceof InterfaceC10548n1))) {
            throw new AssertionError();
        }
        if (m7887i0 instanceof C10590x) {
            C10534k<T> c10534k = this.f27246A;
            C13183m.C13184a c13184a = C13183m.f34143w;
            c10534k.resumeWith(C13183m.m1458a(C13186n.m1454a(((C10590x) m7887i0).f27303a)));
            return;
        }
        C10534k<T> c10534k2 = this.f27246A;
        C13183m.C13184a c13184a2 = C13183m.f34143w;
        c10534k2.resumeWith(C13183m.m1458a(C10488b2.m7845h(m7887i0)));
    }

    @Override // id.InterfaceC6108l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ C13195u mo9587d(Throwable th2) {
        mo7587A(th2);
        return C13195u.f34156a;
    }
}
