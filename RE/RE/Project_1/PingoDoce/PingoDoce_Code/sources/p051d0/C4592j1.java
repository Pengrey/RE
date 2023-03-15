package p051d0;

import id.InterfaceC6097a;
import p092f0.AbstractC5250t0;
import p092f0.CompositionLocal;
import p181jd.AbstractC6438m;
import p286p1.TextStyle;
import p359t1.AbstractC10364e;

/* renamed from: d0.j1 */
/* loaded from: classes.dex */
public final class C4592j1 {

    /* renamed from: a */
    private static final AbstractC5250t0<Typography> f12478a = CompositionLocal.m24951d(C4593a.f12479w);

    /* compiled from: Typography.kt */
    /* renamed from: d0.j1$a */
    /* loaded from: classes.dex */
    static final class C4593a extends AbstractC6438m implements InterfaceC6097a<Typography> {

        /* renamed from: w */
        public static final C4593a f12479w = new C4593a();

        C4593a() {
            super(0);
        }

        @Override // id.InterfaceC6097a
        /* renamed from: a */
        public final Typography mo42214q() {
            return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }
    }

    /* renamed from: b */
    public static final AbstractC5250t0<Typography> m27113b() {
        return f12478a;
    }

    /* renamed from: c */
    public static final TextStyle m27112c(TextStyle textStyle, AbstractC10364e abstractC10364e) {
        return textStyle.m15520g() != null ? textStyle : TextStyle.m15524c(textStyle, 0L, 0L, null, null, null, abstractC10364e, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262111, null);
    }
}
