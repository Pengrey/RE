package androidx.compose.p018ui.platform;

import id.InterfaceC6112p;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p229m0.ComposableLambda;
import p468yc.C13195u;

/* compiled from: Wrapper.android.kt */
/* renamed from: androidx.compose.ui.platform.k0 */
/* loaded from: classes.dex */
public final class C0730k0 {

    /* renamed from: a */
    public static final C0730k0 f2274a = new C0730k0();

    /* renamed from: b */
    public static InterfaceC6112p<InterfaceC5179i, Integer, C13195u> f2275b = ComposableLambda.m19326c(-985537551, false, C0731a.f2276w);

    /* compiled from: Wrapper.android.kt */
    /* renamed from: androidx.compose.ui.platform.k0$a */
    /* loaded from: classes.dex */
    static final class C0731a extends AbstractC6438m implements InterfaceC6112p<InterfaceC5179i, Integer, C13195u> {

        /* renamed from: w */
        public static final C0731a f2276w = new C0731a();

        C0731a() {
            super(2);
        }

        @Override // id.InterfaceC6112p
        /* renamed from: F */
        public /* bridge */ /* synthetic */ C13195u mo39856d(InterfaceC5179i interfaceC5179i, Integer num) {
            m39715a(interfaceC5179i, num.intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m39715a(InterfaceC5179i interfaceC5179i, int i) {
            if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
            }
        }
    }

    /* renamed from: a */
    public final InterfaceC6112p<InterfaceC5179i, Integer, C13195u> m39716a() {
        return f2275b;
    }
}
