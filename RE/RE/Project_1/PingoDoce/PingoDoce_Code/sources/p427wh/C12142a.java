package p427wh;

import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6112p;
import p051d0.Icon;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p229m0.ComposableLambda;
import p230m1.C7097c;
import p468yc.C13195u;

/* renamed from: wh.a */
/* loaded from: classes2.dex */
public final class C12142a {

    /* renamed from: a */
    public static final C12142a f32069a = new C12142a();

    /* renamed from: b */
    public static InterfaceC6112p<InterfaceC5179i, Integer, C13195u> f32070b = ComposableLambda.m19326c(1747495978, false, C12143a.f32071w);

    /* compiled from: TermsOfUseActivity.kt */
    /* renamed from: wh.a$a */
    /* loaded from: classes2.dex */
    static final class C12143a extends AbstractC6438m implements InterfaceC6112p<InterfaceC5179i, Integer, C13195u> {

        /* renamed from: w */
        public static final C12143a f32071w = new C12143a();

        C12143a() {
            super(2);
        }

        @Override // id.InterfaceC6112p
        /* renamed from: F */
        public /* bridge */ /* synthetic */ C13195u mo39856d(InterfaceC5179i interfaceC5179i, Integer num) {
            m3555a(interfaceC5179i, num.intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m3555a(InterfaceC5179i interfaceC5179i, int i) {
            if ((i & 11) == 2 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
            } else {
                Icon.m27154a(C7097c.m19308c(C2336R.C2337drawable.ic_arrow_back, interfaceC5179i, 0), null, null, 0L, interfaceC5179i, 56, 12);
            }
        }
    }

    /* renamed from: a */
    public final InterfaceC6112p<InterfaceC5179i, Integer, C13195u> m3557a() {
        return f32070b;
    }
}
