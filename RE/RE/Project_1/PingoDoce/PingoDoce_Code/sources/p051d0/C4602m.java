package p051d0;

import id.InterfaceC6097a;
import p092f0.AbstractC5250t0;
import p092f0.CompositionLocal;
import p181jd.AbstractC6438m;
import p393v0.Color;

/* renamed from: d0.m */
/* loaded from: classes.dex */
public final class C4602m {

    /* renamed from: a */
    private static final AbstractC5250t0<Color> f12496a = CompositionLocal.m24952c(null, C4603a.f12497w, 1, null);

    /* compiled from: ContentColor.kt */
    /* renamed from: d0.m$a */
    /* loaded from: classes.dex */
    static final class C4603a extends AbstractC6438m implements InterfaceC6097a<Color> {

        /* renamed from: w */
        public static final C4603a f12497w = new C4603a();

        C4603a() {
            super(0);
        }

        /* renamed from: a */
        public final long m27097a() {
            return Color.f28297b.m6637a();
        }

        @Override // id.InterfaceC6097a
        /* renamed from: q */
        public /* bridge */ /* synthetic */ Color mo42214q() {
            return Color.m6652h(m27097a());
        }
    }

    /* renamed from: a */
    public static final AbstractC5250t0<Color> m27098a() {
        return f12496a;
    }
}
