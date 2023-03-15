package p051d0;

import id.InterfaceC6112p;
import p092f0.InterfaceC5151a1;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* compiled from: MaterialTheme.android.kt */
/* renamed from: d0.l0 */
/* loaded from: classes.dex */
public final class C4600l0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialTheme.android.kt */
    /* renamed from: d0.l0$a */
    /* loaded from: classes.dex */
    public static final class C4601a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6112p f12494w;

        /* renamed from: x */
        final /* synthetic */ int f12495x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4601a(InterfaceC6112p interfaceC6112p, int i) {
            super(2);
            this.f12494w = interfaceC6112p;
            this.f12495x = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m27099a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27099a(InterfaceC5179i interfaceC5179i, int i) {
            C4600l0.m27100a(this.f12494w, interfaceC5179i, this.f12495x | 1);
        }
    }

    /* renamed from: a */
    public static final void m27100a(InterfaceC6112p interfaceC6112p, InterfaceC5179i interfaceC5179i, int i) {
        int i2;
        Intrinsics.isThisObjectNull(interfaceC6112p, "content");
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(-1558451989);
        if ((i & 14) == 0) {
            i2 = (mo25249u.mo25276I(interfaceC6112p) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((2 ^ (i2 & 11)) == 0 && mo25249u.mo25245y()) {
            mo25249u.mo25264f();
        } else {
            interfaceC6112p.mo39856d(mo25249u, Integer.valueOf(i2 & 14));
        }
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K == null) {
            return;
        }
        mo25274K.mo25532a(new C4601a(interfaceC6112p, i));
    }
}
