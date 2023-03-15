package p051d0;

import id.InterfaceC6097a;
import p092f0.AbstractC5250t0;
import p092f0.CompositionLocal;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p393v0.Color;
import p479z1.C13605g;

/* renamed from: d0.y */
/* loaded from: classes.dex */
public final class C4677y {

    /* renamed from: a */
    private static final AbstractC5250t0<InterfaceC4675x> f12736a = CompositionLocal.m24951d(C4679b.f12739w);

    /* renamed from: b */
    private static final AbstractC5250t0<C13605g> f12737b = CompositionLocal.m24952c(null, C4678a.f12738w, 1, null);

    /* compiled from: ElevationOverlay.kt */
    /* renamed from: d0.y$a */
    /* loaded from: classes.dex */
    static final class C4678a extends AbstractC6438m implements InterfaceC6097a<C13605g> {

        /* renamed from: w */
        public static final C4678a f12738w = new C4678a();

        C4678a() {
            super(0);
        }

        /* renamed from: a */
        public final float m26981a() {
            return C13605g.m875g(0);
        }

        @Override // id.InterfaceC6097a
        /* renamed from: q */
        public /* bridge */ /* synthetic */ C13605g mo42214q() {
            return C13605g.m878d(m26981a());
        }
    }

    /* compiled from: ElevationOverlay.kt */
    /* renamed from: d0.y$b */
    /* loaded from: classes.dex */
    static final class C4679b extends AbstractC6438m implements InterfaceC6097a<InterfaceC4675x> {

        /* renamed from: w */
        public static final C4679b f12739w = new C4679b();

        C4679b() {
            super(0);
        }

        @Override // id.InterfaceC6097a
        /* renamed from: a */
        public final InterfaceC4675x mo42214q() {
            return C4625p.f12611a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final long m26984b(long j, float f, InterfaceC5179i interfaceC5179i, int i) {
        return Color.m6648l(Colors.m27147b(j, interfaceC5179i, i & 14), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* renamed from: c */
    public static final AbstractC5250t0<C13605g> m26983c() {
        return f12737b;
    }

    /* renamed from: d */
    public static final AbstractC5250t0<InterfaceC4675x> m26982d() {
        return f12736a;
    }
}
