package td;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import kotlinx.coroutines.internal.C6859d0;
import kotlinx.coroutines.internal.C6881l0;
import p468yc.C13182l;
import p468yc.C13191r;
import p468yc.C13195u;

/* renamed from: td.w2 */
/* loaded from: classes2.dex */
public final class C10589w2<T> extends C6859d0<T> {

    /* renamed from: z */
    private ThreadLocal<C13182l<CoroutineContext, Object>> f27301z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C10589w2(bd.CoroutineContext r3, bd.InterfaceC1886d<? super T> r4) {
        /*
            r2 = this;
            td.x2 r0 = td.C10593x2.f27305w
            bd.g$b r1 = r3.mo4546c(r0)
            if (r1 != 0) goto Ld
            bd.g r0 = r3.mo4545f0(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f27301z = r0
            bd.g r4 = r4.getContext()
            bd.e$b r0 = bd.ContinuationInterceptor.f5618d
            bd.g$b r4 = r4.mo4546c(r0)
            boolean r4 = r4 instanceof td.AbstractC10505e0
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.C6881l0.m19922c(r3, r4)
            kotlinx.coroutines.internal.C6881l0.m19924a(r3, r4)
            r2.m7603c1(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: td.C10589w2.<init>(bd.g, bd.d):void");
    }

    @Override // kotlinx.coroutines.internal.C6859d0, td.AbstractC10476a
    /* renamed from: W0 */
    protected void mo7605W0(Object obj) {
        C13182l<CoroutineContext, Object> c13182l = this.f27301z.get();
        if (c13182l != null) {
            C6881l0.m19924a(c13182l.m1462a(), c13182l.m1461b());
            this.f27301z.set(null);
        }
        Object m7925a = C10477a0.m7925a(obj, this.f18305y);
        InterfaceC1886d<T> interfaceC1886d = this.f18305y;
        CoroutineContext context = interfaceC1886d.getContext();
        Object m19922c = C6881l0.m19922c(context, null);
        C10589w2<?> m7822g = m19922c != C6881l0.f18331a ? C10494d0.m7822g(interfaceC1886d, context, m19922c) : null;
        try {
            this.f18305y.resumeWith(m7925a);
            C13195u c13195u = C13195u.f34156a;
        } finally {
            if (m7822g == null || m7822g.m7604b1()) {
                C6881l0.m19924a(context, m19922c);
            }
        }
    }

    /* renamed from: b1 */
    public final boolean m7604b1() {
        if (this.f27301z.get() == null) {
            return false;
        }
        this.f27301z.set(null);
        return true;
    }

    /* renamed from: c1 */
    public final void m7603c1(CoroutineContext coroutineContext, Object obj) {
        this.f27301z.set(C13191r.m1447a(coroutineContext, obj));
    }
}
