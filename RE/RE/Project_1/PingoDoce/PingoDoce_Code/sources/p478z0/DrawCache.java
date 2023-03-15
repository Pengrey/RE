package p478z0;

import id.InterfaceC6108l;
import p181jd.Intrinsics;
import p393v0.C11047p;
import p393v0.C11070w;
import p393v0.Color;
import p393v0.ColorFilter;
import p393v0.ImageBitmap;
import p393v0.InterfaceC11025h0;
import p393v0.InterfaceC11064u;
import p433x0.CanvasDrawScope;
import p433x0.DrawScope;
import p479z1.C13615m;
import p479z1.C13617n;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: z0.a */
/* loaded from: classes.dex */
public final class DrawCache {

    /* renamed from: a */
    private InterfaceC11025h0 f34309a;

    /* renamed from: b */
    private InterfaceC11064u f34310b;

    /* renamed from: c */
    private Density f34311c;

    /* renamed from: d */
    private long f34312d;

    /* renamed from: e */
    private final CanvasDrawScope f34313e;

    public DrawCache() {
        EnumC13618o enumC13618o = EnumC13618o.Ltr;
        this.f34312d = C13615m.f34610b.m820a();
        this.f34313e = new CanvasDrawScope();
    }

    /* renamed from: a */
    private final void m1255a(DrawScope drawScope) {
        DrawScope.C12241b.m3255e(drawScope, Color.f28297b.m6637a(), 0L, 0L, 0.0f, null, null, C11047p.f28401a.m6349a(), 62, null);
    }

    /* renamed from: b */
    public final void m1254b(long j, Density density, EnumC13618o enumC13618o, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(density, "density");
        Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
        Intrinsics.isThisObjectNull(interfaceC6108l, "block");
        this.f34311c = density;
        InterfaceC11025h0 interfaceC11025h0 = this.f34309a;
        InterfaceC11064u interfaceC11064u = this.f34310b;
        if (interfaceC11025h0 == null || interfaceC11064u == null || C13615m.m824g(j) > interfaceC11025h0.mo6478b() || C13615m.m825f(j) > interfaceC11025h0.mo6479a()) {
            interfaceC11025h0 = ImageBitmap.m6438b(C13615m.m824g(j), C13615m.m825f(j), 0, false, null, 28, null);
            interfaceC11064u = C11070w.m6241a(interfaceC11025h0);
            this.f34309a = interfaceC11025h0;
            this.f34310b = interfaceC11064u;
        }
        this.f34312d = j;
        CanvasDrawScope canvasDrawScope = this.f34313e;
        long m818b = C13617n.m818b(j);
        CanvasDrawScope.C12234a m3299q = canvasDrawScope.m3299q();
        Density m3293a = m3299q.m3293a();
        EnumC13618o m3292b = m3299q.m3292b();
        InterfaceC11064u m3291c = m3299q.m3291c();
        long m3290d = m3299q.m3290d();
        CanvasDrawScope.C12234a m3299q2 = canvasDrawScope.m3299q();
        m3299q2.m3284j(density);
        m3299q2.m3283k(enumC13618o);
        m3299q2.m3285i(interfaceC11064u);
        m3299q2.m3282l(m818b);
        interfaceC11064u.m6269h();
        m1255a(canvasDrawScope);
        interfaceC6108l.mo9587d(canvasDrawScope);
        interfaceC11064u.m6270g();
        CanvasDrawScope.C12234a m3299q3 = canvasDrawScope.m3299q();
        m3299q3.m3284j(m3293a);
        m3299q3.m3283k(m3292b);
        m3299q3.m3285i(m3291c);
        m3299q3.m3282l(m3290d);
        interfaceC11025h0.mo6477c();
    }

    /* renamed from: c */
    public final void m1253c(DrawScope drawScope, float f, ColorFilter colorFilter) {
        Intrinsics.isThisObjectNull(drawScope, "target");
        InterfaceC11025h0 interfaceC11025h0 = this.f34309a;
        if (interfaceC11025h0 != null) {
            DrawScope.C12241b.m3258b(drawScope, interfaceC11025h0, 0L, this.f34312d, 0L, 0L, f, null, colorFilter, 0, 0, 858, null);
            return;
        }
        throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
    }
}
