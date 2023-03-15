package p393v0;

import kotlin.NoWhenBranchMatchedException;
import p181jd.Intrinsics;
import p373u0.C10769a;
import p373u0.C10771b;
import p373u0.C10776g;
import p373u0.C10779j;
import p373u0.C10783m;
import p373u0.Rect;
import p393v0.Outline;
import p433x0.AbstractC12242f;
import p433x0.C12245i;
import p433x0.DrawScope;

/* compiled from: Outline.kt */
/* renamed from: v0.n0 */
/* loaded from: classes.dex */
public final class C11043n0 {
    /* renamed from: a */
    public static final /* synthetic */ boolean m6420a(C10779j c10779j) {
        return m6415f(c10779j);
    }

    /* renamed from: b */
    public static final void m6419b(DrawScope drawScope, Outline outline, AbstractC11057s abstractC11057s, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i) {
        InterfaceC11052q0 m6425a;
        Intrinsics.isThisObjectNull(drawScope, "$this$drawOutline");
        Intrinsics.isThisObjectNull(outline, "outline");
        Intrinsics.isThisObjectNull(abstractC11057s, "brush");
        Intrinsics.isThisObjectNull(abstractC12242f, "style");
        if (outline instanceof Outline.C11040b) {
            Rect m6424a = ((Outline.C11040b) outline).m6424a();
            drawScope.m3268M(abstractC11057s, m6412i(m6424a), m6414g(m6424a), f, abstractC12242f, colorFilter, i);
            return;
        }
        if (outline instanceof Outline.C11041c) {
            Outline.C11041c c11041c = (Outline.C11041c) outline;
            m6425a = c11041c.m6422b();
            if (m6425a == null) {
                C10779j m6423a = c11041c.m6423a();
                drawScope.m3264X(abstractC11057s, m6411j(m6423a), m6413h(m6423a), C10771b.m7169b(C10769a.m7175d(m6423a.m7112b()), 0.0f, 2, null), f, abstractC12242f, colorFilter, i);
                return;
            }
        } else if (!(outline instanceof Outline.C11039a)) {
            throw new NoWhenBranchMatchedException();
        } else {
            m6425a = ((Outline.C11039a) outline).m6425a();
        }
        drawScope.m3267N(m6425a, abstractC11057s, f, abstractC12242f, colorFilter, i);
    }

    /* renamed from: c */
    public static /* synthetic */ void m6418c(DrawScope drawScope, Outline outline, AbstractC11057s abstractC11057s, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            abstractC12242f = C12245i.f32289a;
        }
        AbstractC12242f abstractC12242f2 = abstractC12242f;
        if ((i2 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i2 & 32) != 0) {
            i = DrawScope.f32285u.m3261a();
        }
        m6419b(drawScope, outline, abstractC11057s, f2, abstractC12242f2, colorFilter2, i);
    }

    /* renamed from: d */
    public static final void m6417d(DrawScope drawScope, Outline outline, long j, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i) {
        InterfaceC11052q0 m6425a;
        Intrinsics.isThisObjectNull(drawScope, "$this$drawOutline");
        Intrinsics.isThisObjectNull(outline, "outline");
        Intrinsics.isThisObjectNull(abstractC12242f, "style");
        if (outline instanceof Outline.C11040b) {
            Rect m6424a = ((Outline.C11040b) outline).m6424a();
            drawScope.m3265R(j, m6412i(m6424a), m6414g(m6424a), f, abstractC12242f, colorFilter, i);
            return;
        }
        if (outline instanceof Outline.C11041c) {
            Outline.C11041c c11041c = (Outline.C11041c) outline;
            m6425a = c11041c.m6422b();
            if (m6425a == null) {
                C10779j m6423a = c11041c.m6423a();
                drawScope.m3262d0(j, m6411j(m6423a), m6413h(m6423a), C10771b.m7169b(C10769a.m7175d(m6423a.m7112b()), 0.0f, 2, null), abstractC12242f, f, colorFilter, i);
                return;
            }
        } else if (!(outline instanceof Outline.C11039a)) {
            throw new NoWhenBranchMatchedException();
        } else {
            m6425a = ((Outline.C11039a) outline).m6425a();
        }
        drawScope.m3269H(m6425a, j, f, abstractC12242f, colorFilter, i);
    }

    /* renamed from: e */
    public static /* synthetic */ void m6416e(DrawScope drawScope, Outline outline, long j, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i, int i2, Object obj) {
        m6417d(drawScope, outline, j, (i2 & 4) != 0 ? 1.0f : f, (i2 & 8) != 0 ? C12245i.f32289a : abstractC12242f, (i2 & 16) != 0 ? null : colorFilter, (i2 & 32) != 0 ? DrawScope.f32285u.m3261a() : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0 A[ADDED_TO_REGION] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m6415f(p373u0.C10779j r6) {
        /*
            long r0 = r6.m7112b()
            float r0 = p373u0.C10769a.m7175d(r0)
            long r1 = r6.m7111c()
            float r1 = p373u0.C10769a.m7175d(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L18
            r0 = r1
            goto L19
        L18:
            r0 = r2
        L19:
            if (r0 == 0) goto L4f
            long r3 = r6.m7111c()
            float r0 = p373u0.C10769a.m7175d(r3)
            long r3 = r6.m7105i()
            float r3 = p373u0.C10769a.m7175d(r3)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L31
            r0 = r1
            goto L32
        L31:
            r0 = r2
        L32:
            if (r0 == 0) goto L4f
            long r3 = r6.m7105i()
            float r0 = p373u0.C10769a.m7175d(r3)
            long r3 = r6.m7106h()
            float r3 = p373u0.C10769a.m7175d(r3)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L4a
            r0 = r1
            goto L4b
        L4a:
            r0 = r2
        L4b:
            if (r0 == 0) goto L4f
            r0 = r1
            goto L50
        L4f:
            r0 = r2
        L50:
            long r3 = r6.m7112b()
            float r3 = p373u0.C10769a.m7174e(r3)
            long r4 = r6.m7111c()
            float r4 = p373u0.C10769a.m7174e(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L66
            r3 = r1
            goto L67
        L66:
            r3 = r2
        L67:
            if (r3 == 0) goto L9d
            long r3 = r6.m7111c()
            float r3 = p373u0.C10769a.m7174e(r3)
            long r4 = r6.m7105i()
            float r4 = p373u0.C10769a.m7174e(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L7f
            r3 = r1
            goto L80
        L7f:
            r3 = r2
        L80:
            if (r3 == 0) goto L9d
            long r3 = r6.m7105i()
            float r3 = p373u0.C10769a.m7174e(r3)
            long r4 = r6.m7106h()
            float r6 = p373u0.C10769a.m7174e(r4)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L98
            r6 = r1
            goto L99
        L98:
            r6 = r2
        L99:
            if (r6 == 0) goto L9d
            r6 = r1
            goto L9e
        L9d:
            r6 = r2
        L9e:
            if (r0 == 0) goto La3
            if (r6 == 0) goto La3
            goto La4
        La3:
            r1 = r2
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p393v0.C11043n0.m6415f(u0.j):boolean");
    }

    /* renamed from: g */
    private static final long m6414g(Rect rect) {
        return C10783m.m7085a(rect.m7120k(), rect.m7126e());
    }

    /* renamed from: h */
    private static final long m6413h(C10779j c10779j) {
        return C10783m.m7085a(c10779j.m7104j(), c10779j.m7110d());
    }

    /* renamed from: i */
    private static final long m6412i(Rect rect) {
        return C10776g.m7133a(rect.m7125f(), rect.m7122i());
    }

    /* renamed from: j */
    private static final long m6411j(C10779j c10779j) {
        return C10776g.m7133a(c10779j.m7109e(), c10779j.m7107g());
    }
}
