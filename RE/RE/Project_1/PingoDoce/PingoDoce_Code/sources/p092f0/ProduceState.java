package p092f0;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import p468yc.C13186n;
import p468yc.C13195u;
import td.InterfaceC10524i0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f0.l1 */
/* loaded from: classes.dex */
public final /* synthetic */ class ProduceState {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProduceState.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3", m20196f = "ProduceState.kt", m20195l = {153}, m20194m = "invokeSuspend")
    /* renamed from: f0.l1$a */
    /* loaded from: classes.dex */
    public static final class C5218a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ InterfaceC5220m0 f14439A;

        /* renamed from: x */
        int f14440x;

        /* renamed from: y */
        private /* synthetic */ Object f14441y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC6112p f14442z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5218a(InterfaceC6112p interfaceC6112p, InterfaceC5220m0 interfaceC5220m0, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f14442z = interfaceC6112p;
            this.f14439A = interfaceC5220m0;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C5218a c5218a = new C5218a(this.f14442z, this.f14439A, interfaceC1886d);
            c5218a.f14441y = obj;
            return c5218a;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5218a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f14440x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC6112p interfaceC6112p = this.f14442z;
                C5244s0 c5244s0 = new C5244s0(this.f14439A, ((InterfaceC10524i0) this.f14441y).mo7716y());
                this.f14440x = 1;
                if (interfaceC6112p.mo39856d(c5244s0, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC5242r1 m25003a(Object obj, Object obj2, Object obj3, InterfaceC6112p interfaceC6112p, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "producer");
        interfaceC5179i.mo25263g(-1870531010);
        interfaceC5179i.mo25263g(-3687241);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            mo25262h = C5232o1.m24962d(obj, null, 2, null);
            interfaceC5179i.mo25247w(mo25262h);
        }
        interfaceC5179i.mo25282C();
        InterfaceC5220m0 interfaceC5220m0 = (InterfaceC5220m0) mo25262h;
        Effects.m25538d(obj2, obj3, new C5218a(interfaceC6112p, interfaceC5220m0, null), interfaceC5179i, 72);
        interfaceC5179i.mo25282C();
        return interfaceC5220m0;
    }
}
