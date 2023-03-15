package p404vd;

import bd.C1894h;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlinx.coroutines.EnumC6775f;
import kotlinx.coroutines.channels.EnumC6771a;
import p468yc.C13195u;
import td.C10494d0;
import td.InterfaceC10524i0;

/* renamed from: vd.o */
/* loaded from: classes2.dex */
public final class C11236o {
    /* renamed from: a */
    public static final <E> InterfaceC11240s<E> m5664a(InterfaceC10524i0 interfaceC10524i0, CoroutineContext coroutineContext, int i, InterfaceC6112p<? super InterfaceC11238q<? super E>, ? super InterfaceC1886d<? super C13195u>, ? extends Object> interfaceC6112p) {
        return m5663b(interfaceC10524i0, coroutineContext, i, EnumC6771a.SUSPEND, EnumC6775f.DEFAULT, null, interfaceC6112p);
    }

    /* renamed from: b */
    public static final <E> InterfaceC11240s<E> m5663b(InterfaceC10524i0 interfaceC10524i0, CoroutineContext coroutineContext, int i, EnumC6771a enumC6771a, EnumC6775f enumC6775f, InterfaceC6108l<? super Throwable, C13195u> interfaceC6108l, InterfaceC6112p<? super InterfaceC11238q<? super E>, ? super InterfaceC1886d<? super C13195u>, ? extends Object> interfaceC6112p) {
        C11237p c11237p = new C11237p(C10494d0.m7824e(interfaceC10524i0, coroutineContext), C11226h.m5692b(i, enumC6771a, null, 4, null));
        if (interfaceC6108l != null) {
            c11237p.mo7659X(interfaceC6108l);
        }
        c11237p.m7928Z0(enumC6775f, c11237p, interfaceC6112p);
        return c11237p;
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC11240s m5662c(InterfaceC10524i0 interfaceC10524i0, CoroutineContext coroutineContext, int i, EnumC6771a enumC6771a, EnumC6775f enumC6775f, InterfaceC6108l interfaceC6108l, InterfaceC6112p interfaceC6112p, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = C1894h.f5621w;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            enumC6771a = EnumC6771a.SUSPEND;
        }
        EnumC6771a enumC6771a2 = enumC6771a;
        if ((i2 & 8) != 0) {
            enumC6775f = EnumC6775f.DEFAULT;
        }
        EnumC6775f enumC6775f2 = enumC6775f;
        if ((i2 & 16) != 0) {
            interfaceC6108l = null;
        }
        return m5663b(interfaceC10524i0, coroutineContext2, i3, enumC6771a2, enumC6775f2, interfaceC6108l, interfaceC6112p);
    }
}
