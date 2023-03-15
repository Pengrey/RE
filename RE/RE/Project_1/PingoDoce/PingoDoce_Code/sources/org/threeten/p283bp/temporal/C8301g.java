package org.threeten.p283bp.temporal;

import org.threeten.p283bp.EnumC8168a;
import p405vf.C11251d;

/* renamed from: org.threeten.bp.temporal.g */
/* loaded from: classes2.dex */
public final class C8301g {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TemporalAdjusters.java */
    /* renamed from: org.threeten.bp.temporal.g$b */
    /* loaded from: classes2.dex */
    public static final class C8303b implements InterfaceC8300f {

        /* renamed from: w */
        private final int f21505w;

        /* renamed from: x */
        private final int f21506x;

        @Override // org.threeten.p283bp.temporal.InterfaceC8300f
        public InterfaceC8298d adjustInto(InterfaceC8298d interfaceC8298d) {
            int i = interfaceC8298d.get(EnumC8288a.DAY_OF_WEEK);
            int i2 = this.f21505w;
            if (i2 >= 2 || i != this.f21506x) {
                if ((i2 & 1) == 0) {
                    int i3 = i - this.f21506x;
                    return interfaceC8298d.mo15873e(i3 >= 0 ? 7 - i3 : -i3, EnumC8289b.DAYS);
                }
                int i4 = this.f21506x - i;
                return interfaceC8298d.mo5632d(i4 >= 0 ? 7 - i4 : -i4, EnumC8289b.DAYS);
            }
            return interfaceC8298d;
        }

        private C8303b(int i, EnumC8168a enumC8168a) {
            C11251d.m5623i(enumC8168a, "dayOfWeek");
            this.f21505w = i;
            this.f21506x = enumC8168a.getValue();
        }
    }

    /* renamed from: a */
    public static InterfaceC8300f m15871a(EnumC8168a enumC8168a) {
        return new C8303b(0, enumC8168a);
    }

    /* renamed from: b */
    public static InterfaceC8300f m15870b(EnumC8168a enumC8168a) {
        return new C8303b(1, enumC8168a);
    }
}
