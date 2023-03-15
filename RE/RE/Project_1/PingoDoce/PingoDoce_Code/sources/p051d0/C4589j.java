package p051d0;

import id.InterfaceC6113q;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p229m0.ComposableLambda;
import p468yc.C13195u;

/* compiled from: SnackbarHost.kt */
/* renamed from: d0.j */
/* loaded from: classes.dex */
public final class C4589j {

    /* renamed from: a */
    public static final C4589j f12474a = new C4589j();

    /* renamed from: b */
    public static InterfaceC6113q f12475b = ComposableLambda.m19326c(-985536016, false, C4590a.f12476w);

    /* compiled from: SnackbarHost.kt */
    /* renamed from: d0.j$a */
    /* loaded from: classes.dex */
    static final class C4590a extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        public static final C4590a f12476w = new C4590a();

        C4590a() {
            super(3);
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m27118a((InterfaceC4656t0) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27118a(InterfaceC4656t0 interfaceC4656t0, InterfaceC5179i interfaceC5179i, int i) {
            int i2;
            Intrinsics.isThisObjectNull(interfaceC4656t0, "it");
            if ((i & 14) == 0) {
                i2 = i | (interfaceC5179i.mo25276I(interfaceC4656t0) ? 4 : 2);
            } else {
                i2 = i;
            }
            if (((i2 & 91) ^ 18) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
            } else {
                Snackbar.m26976d(interfaceC4656t0, null, false, null, 0L, 0L, 0L, 0.0f, interfaceC5179i, i2 & 14, 254);
            }
        }
    }

    /* renamed from: a */
    public final InterfaceC6113q m27119a() {
        return f12475b;
    }
}
