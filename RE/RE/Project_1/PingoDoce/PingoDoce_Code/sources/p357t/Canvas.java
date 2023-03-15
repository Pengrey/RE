package p357t;

import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p092f0.InterfaceC5151a1;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p346s0.C10026f;
import p410w.Spacer;
import p468yc.C13195u;

/* renamed from: t.d */
/* loaded from: classes.dex */
public final class Canvas {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Canvas.kt */
    /* renamed from: t.d$a */
    /* loaded from: classes.dex */
    public static final class C10258a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC9570f f26718w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6108l f26719x;

        /* renamed from: y */
        final /* synthetic */ int f26720y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10258a(InterfaceC9570f interfaceC9570f, InterfaceC6108l interfaceC6108l, int i) {
            super(2);
            this.f26718w = interfaceC9570f;
            this.f26719x = interfaceC6108l;
            this.f26720y = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m8379a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m8379a(InterfaceC5179i interfaceC5179i, int i) {
            Canvas.m8380a(this.f26718w, this.f26719x, interfaceC5179i, this.f26720y | 1);
        }
    }

    /* renamed from: a */
    public static final void m8380a(InterfaceC9570f interfaceC9570f, InterfaceC6108l interfaceC6108l, InterfaceC5179i interfaceC5179i, int i) {
        int i2;
        Intrinsics.isThisObjectNull(interfaceC9570f, "modifier");
        Intrinsics.isThisObjectNull(interfaceC6108l, "onDraw");
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(-912324257);
        if ((i & 14) == 0) {
            i2 = (mo25249u.mo25276I(interfaceC9570f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= mo25249u.mo25276I(interfaceC6108l) ? 32 : 16;
        }
        if (((i2 & 91) ^ 18) == 0 && mo25249u.mo25245y()) {
            mo25249u.mo25264f();
        } else {
            Spacer.m5064a(C10026f.m9372a(interfaceC9570f, interfaceC6108l), mo25249u, 0);
        }
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K == null) {
            return;
        }
        mo25274K.mo25532a(new C10258a(interfaceC9570f, interfaceC6108l, i));
    }
}
