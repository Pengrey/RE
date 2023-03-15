package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.EnumC6771a;
import p424wd.C11631h;
import p424wd.InterfaceC11646o;

/* renamed from: kotlinx.coroutines.flow.i */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6794i {
    /* renamed from: a */
    public static final <T> InterfaceC6785c<T> m20114a(InterfaceC6785c<? extends T> interfaceC6785c, int i, EnumC6771a enumC6771a) {
        int i2;
        EnumC6771a enumC6771a2;
        boolean z = true;
        if (i >= 0 || i == -2 || i == -1) {
            if (i == -1 && enumC6771a != EnumC6771a.SUSPEND) {
                z = false;
            }
            if (z) {
                if (i == -1) {
                    enumC6771a2 = EnumC6771a.DROP_OLDEST;
                    i2 = 0;
                } else {
                    i2 = i;
                    enumC6771a2 = enumC6771a;
                }
                return interfaceC6785c instanceof InterfaceC11646o ? InterfaceC11646o.C11647a.m4539a((InterfaceC11646o) interfaceC6785c, null, i2, enumC6771a2, 1, null) : new C11631h(interfaceC6785c, null, i2, enumC6771a2, 2, null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC6785c m20113b(InterfaceC6785c interfaceC6785c, int i, EnumC6771a enumC6771a, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            enumC6771a = EnumC6771a.SUSPEND;
        }
        return C6788e.m20147a(interfaceC6785c, i, enumC6771a);
    }
}
