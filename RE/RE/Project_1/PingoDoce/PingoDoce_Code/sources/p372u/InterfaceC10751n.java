package p372u;

import bd.InterfaceC1886d;
import id.InterfaceC6112p;
import p357t.EnumC10314o;
import p468yc.C13195u;

/* renamed from: u.n */
/* loaded from: classes.dex */
public interface InterfaceC10751n {

    /* compiled from: Draggable.kt */
    /* renamed from: u.n$a */
    /* loaded from: classes.dex */
    public static final class C10752a {
        /* renamed from: a */
        public static /* synthetic */ Object m7223a(InterfaceC10751n interfaceC10751n, EnumC10314o enumC10314o, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    enumC10314o = EnumC10314o.Default;
                }
                return interfaceC10751n.mo7224a(enumC10314o, interfaceC6112p, interfaceC1886d);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
        }
    }

    /* renamed from: a */
    Object mo7224a(EnumC10314o enumC10314o, InterfaceC6112p<? super InterfaceC10729l, ? super InterfaceC1886d<? super C13195u>, ? extends Object> interfaceC6112p, InterfaceC1886d<? super C13195u> interfaceC1886d);
}
