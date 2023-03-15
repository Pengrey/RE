package p372u;

import bd.InterfaceC1886d;
import id.InterfaceC6112p;
import p357t.EnumC10314o;
import p468yc.C13195u;

/* renamed from: u.f0 */
/* loaded from: classes.dex */
public interface InterfaceC10675f0 {

    /* compiled from: ScrollableState.kt */
    /* renamed from: u.f0$a */
    /* loaded from: classes.dex */
    public static final class C10676a {
        /* renamed from: a */
        public static /* synthetic */ Object m7345a(InterfaceC10675f0 interfaceC10675f0, EnumC10314o enumC10314o, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    enumC10314o = EnumC10314o.Default;
                }
                return interfaceC10675f0.mo7347b(enumC10314o, interfaceC6112p, interfaceC1886d);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
    }

    /* renamed from: a */
    boolean mo7348a();

    /* renamed from: b */
    Object mo7347b(EnumC10314o enumC10314o, InterfaceC6112p<? super InterfaceC10653c0, ? super InterfaceC1886d<? super C13195u>, ? extends Object> interfaceC6112p, InterfaceC1886d<? super C13195u> interfaceC1886d);

    /* renamed from: c */
    float mo7346c(float f);
}
