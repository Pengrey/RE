package p404vd;

import id.InterfaceC6108l;
import kotlinx.coroutines.channels.EnumC6771a;
import p468yc.C13195u;

/* renamed from: vd.h */
/* loaded from: classes2.dex */
public final class C11226h {
    /* renamed from: a */
    public static final <E> InterfaceC11222e<E> m5693a(int i, EnumC6771a enumC6771a, InterfaceC6108l<? super E, C13195u> interfaceC6108l) {
        if (i == -2) {
            return new C11220d(enumC6771a == EnumC6771a.SUSPEND ? InterfaceC11222e.f28804t.m5698a() : 1, enumC6771a, interfaceC6108l);
        } else if (i == -1) {
            if ((enumC6771a != EnumC6771a.SUSPEND ? 0 : 1) != 0) {
                return new C11234m(interfaceC6108l);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        } else if (i == 0) {
            if (enumC6771a == EnumC6771a.SUSPEND) {
                return new C11242u(interfaceC6108l);
            }
            return new C11220d(1, enumC6771a, interfaceC6108l);
        } else if (i != Integer.MAX_VALUE) {
            if (i == 1 && enumC6771a == EnumC6771a.DROP_OLDEST) {
                return new C11234m(interfaceC6108l);
            }
            return new C11220d(i, enumC6771a, interfaceC6108l);
        } else {
            return new C11235n(interfaceC6108l);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC11222e m5692b(int i, EnumC6771a enumC6771a, InterfaceC6108l interfaceC6108l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            enumC6771a = EnumC6771a.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            interfaceC6108l = null;
        }
        return m5693a(i, enumC6771a, interfaceC6108l);
    }
}
