package p092f0;

import id.InterfaceC6097a;
import id.InterfaceC6112p;
import java.util.Arrays;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* renamed from: f0.q */
/* loaded from: classes.dex */
public final class CompositionLocal {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompositionLocal.kt */
    /* renamed from: f0.q$a */
    /* loaded from: classes.dex */
    public static final class C5236a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ C5255u0[] f14497w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6112p f14498x;

        /* renamed from: y */
        final /* synthetic */ int f14499y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5236a(C5255u0[] c5255u0Arr, InterfaceC6112p interfaceC6112p, int i) {
            super(2);
            this.f14497w = c5255u0Arr;
            this.f14498x = interfaceC6112p;
            this.f14499y = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m24950a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m24950a(InterfaceC5179i interfaceC5179i, int i) {
            C5255u0[] c5255u0Arr = this.f14497w;
            CompositionLocal.m24954a((C5255u0[]) Arrays.copyOf(c5255u0Arr, c5255u0Arr.length), this.f14498x, interfaceC5179i, this.f14499y | 1);
        }
    }

    /* renamed from: a */
    public static final void m24954a(C5255u0[] c5255u0Arr, InterfaceC6112p interfaceC6112p, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(c5255u0Arr, "values");
        Intrinsics.isThisObjectNull(interfaceC6112p, "content");
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(-1460639761);
        mo25249u.mo25272M(c5255u0Arr);
        interfaceC6112p.mo39856d(mo25249u, Integer.valueOf((i >> 3) & 14));
        mo25249u.mo25253q();
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K == null) {
            return;
        }
        mo25274K.mo25532a(new C5236a(c5255u0Arr, interfaceC6112p, i));
    }

    /* renamed from: b */
    public static final AbstractC5250t0 m24953b(SnapshotMutationPolicy snapshotMutationPolicy, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(snapshotMutationPolicy, "policy");
        Intrinsics.isThisObjectNull(interfaceC6097a, "defaultFactory");
        return new C5268z(snapshotMutationPolicy, interfaceC6097a);
    }

    /* renamed from: c */
    public static /* synthetic */ AbstractC5250t0 m24952c(SnapshotMutationPolicy snapshotMutationPolicy, InterfaceC6097a interfaceC6097a, int i, Object obj) {
        if ((i & 1) != 0) {
            snapshotMutationPolicy = C5209j1.m25065m();
        }
        return m24953b(snapshotMutationPolicy, interfaceC6097a);
    }

    /* renamed from: d */
    public static final AbstractC5250t0 m24951d(InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "defaultFactory");
        return new C5245s1(interfaceC6097a);
    }
}
