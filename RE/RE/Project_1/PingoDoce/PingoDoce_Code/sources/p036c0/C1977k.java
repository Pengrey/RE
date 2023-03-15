package p036c0;

import id.InterfaceC6097a;
import p092f0.AbstractC5250t0;
import p092f0.CompositionLocal;
import p181jd.AbstractC6438m;
import p393v0.C11003c0;
import p393v0.Color;

/* renamed from: c0.k */
/* loaded from: classes.dex */
public final class C1977k {

    /* renamed from: a */
    private static final AbstractC5250t0<C1976j> f5790a = CompositionLocal.m24952c(null, C1978a.f5793w, 1, null);

    /* renamed from: b */
    private static final long f5791b;

    /* renamed from: c */
    private static final C1976j f5792c;

    /* compiled from: TextSelectionColors.kt */
    /* renamed from: c0.k$a */
    /* loaded from: classes.dex */
    static final class C1978a extends AbstractC6438m implements InterfaceC6097a<C1976j> {

        /* renamed from: w */
        public static final C1978a f5793w = new C1978a();

        C1978a() {
            super(0);
        }

        @Override // id.InterfaceC6097a
        /* renamed from: a */
        public final C1976j mo42214q() {
            return C1977k.f5792c;
        }
    }

    static {
        long m6593c = C11003c0.m6593c(4282550004L);
        f5791b = m6593c;
        f5792c = new C1976j(m6593c, Color.m6648l(m6593c, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    /* renamed from: b */
    public static final AbstractC5250t0<C1976j> m34993b() {
        return f5790a;
    }
}
