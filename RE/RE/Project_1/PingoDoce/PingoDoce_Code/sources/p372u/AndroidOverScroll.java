package p372u;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import java.util.List;
import p092f0.C5232o1;
import p092f0.InterfaceC5220m0;
import p181jd.Intrinsics;
import p220ld.C7037c;
import p373u0.C10774f;
import p373u0.C10781l;
import p373u0.C10783m;
import p393v0.C11002c;
import p393v0.C11003c0;
import p393v0.InterfaceC11064u;
import p433x0.DrawScope;
import p479z1.C13624s;
import p489zc.C13780s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: u.a */
/* loaded from: classes.dex */
public final class AndroidOverScroll implements InterfaceC10764v {

    /* renamed from: a */
    private final C10761t f27419a;

    /* renamed from: b */
    private final EdgeEffect f27420b;

    /* renamed from: c */
    private final EdgeEffect f27421c;

    /* renamed from: d */
    private final EdgeEffect f27422d;

    /* renamed from: e */
    private final EdgeEffect f27423e;

    /* renamed from: f */
    private final List f27424f;

    /* renamed from: g */
    private final EdgeEffect f27425g;

    /* renamed from: h */
    private final EdgeEffect f27426h;

    /* renamed from: i */
    private final EdgeEffect f27427i;

    /* renamed from: j */
    private final EdgeEffect f27428j;

    /* renamed from: k */
    private final InterfaceC5220m0 f27429k;

    /* renamed from: l */
    private final InterfaceC5220m0 f27430l;

    /* renamed from: m */
    private final InterfaceC5220m0 f27431m;

    public AndroidOverScroll(Context context, C10761t c10761t) {
        List m194j;
        InterfaceC5220m0 m24962d;
        InterfaceC5220m0 m24962d2;
        InterfaceC5220m0 m24962d3;
        Intrinsics.isThisObjectNull(context, "context");
        Intrinsics.isThisObjectNull(c10761t, "overScrollConfig");
        this.f27419a = c10761t;
        C10753o c10753o = C10753o.f27827a;
        EdgeEffect m7222a = c10753o.m7222a(context, null);
        this.f27420b = m7222a;
        EdgeEffect m7222a2 = c10753o.m7222a(context, null);
        this.f27421c = m7222a2;
        EdgeEffect m7222a3 = c10753o.m7222a(context, null);
        this.f27422d = m7222a3;
        EdgeEffect m7222a4 = c10753o.m7222a(context, null);
        this.f27423e = m7222a4;
        m194j = C13780s.m194j(m7222a3, m7222a, m7222a4, m7222a2);
        this.f27424f = m194j;
        this.f27425g = c10753o.m7222a(context, null);
        this.f27426h = c10753o.m7222a(context, null);
        this.f27427i = c10753o.m7222a(context, null);
        this.f27428j = c10753o.m7222a(context, null);
        int size = m194j.size();
        for (int i = 0; i < size; i++) {
            ((EdgeEffect) m194j.get(i)).setColor(C11003c0.m6587i(m7418n().m7202c()));
        }
        m24962d = C5232o1.m24962d(0, null, 2, null);
        this.f27429k = m24962d;
        m24962d2 = C5232o1.m24962d(C10781l.m7097c(C10781l.f27885b.m7086b()), null, 2, null);
        this.f27430l = m24962d2;
        m24962d3 = C5232o1.m24962d(Boolean.FALSE, null, 2, null);
        this.f27431m = m24962d3;
    }

    /* renamed from: i */
    private final boolean m7423i(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-C10781l.m7091i(m7419m()), (-C10781l.m7093g(m7419m())) + drawScope.m899A(this.f27419a.m7204a().mo4959b()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: j */
    private final boolean m7422j(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-C10781l.m7093g(m7419m()), drawScope.m899A(this.f27419a.m7204a().mo4957d(drawScope.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: k */
    private final boolean m7421k(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int m19530c;
        int save = canvas.save();
        m19530c = C7037c.m19530c(C10781l.m7091i(m7419m()));
        float mo4960a = this.f27419a.m7204a().mo4960a(drawScope.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-m19530c) + drawScope.m899A(mo4960a));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: l */
    private final boolean m7420l(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.translate(0.0f, drawScope.m899A(this.f27419a.m7204a().mo4958c()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: m */
    private final long m7419m() {
        return ((C10781l) this.f27430l.getValue()).m7088l();
    }

    /* renamed from: o */
    private final boolean m7417o() {
        return (this.f27419a.m7203b() || m7415q()) ? false : true;
    }

    /* renamed from: p */
    private final void m7416p() {
        InterfaceC5220m0 interfaceC5220m0 = this.f27429k;
        interfaceC5220m0.setValue(Integer.valueOf(((Number) interfaceC5220m0.getValue()).intValue() + 1));
    }

    /* renamed from: q */
    private final boolean m7415q() {
        return ((Boolean) this.f27431m.getValue()).booleanValue();
    }

    /* renamed from: r */
    private final float m7414r(long j, long j2) {
        float m7145k = C10774f.m7145k(j2) / C10781l.m7091i(m7419m());
        return (-C10753o.f27827a.m7219d(this.f27421c, -(C10774f.m7144l(j) / C10781l.m7093g(m7419m())), 1 - m7145k)) * C10781l.m7093g(m7419m());
    }

    /* renamed from: s */
    private final float m7413s(long j, long j2) {
        float m7144l = C10774f.m7144l(j2) / C10781l.m7093g(m7419m());
        return C10753o.f27827a.m7219d(this.f27422d, C10774f.m7145k(j) / C10781l.m7091i(m7419m()), 1 - m7144l) * C10781l.m7091i(m7419m());
    }

    /* renamed from: t */
    private final float m7412t(long j, long j2) {
        return (-C10753o.f27827a.m7219d(this.f27423e, -(C10774f.m7145k(j) / C10781l.m7091i(m7419m())), C10774f.m7144l(j2) / C10781l.m7093g(m7419m()))) * C10781l.m7091i(m7419m());
    }

    /* renamed from: u */
    private final float m7411u(long j, long j2) {
        float m7145k = C10774f.m7145k(j2) / C10781l.m7091i(m7419m());
        return C10753o.f27827a.m7219d(this.f27420b, C10774f.m7144l(j) / C10781l.m7093g(m7419m()), m7145k) * C10781l.m7093g(m7419m());
    }

    /* renamed from: v */
    private final boolean m7410v(long j) {
        boolean z;
        boolean z2 = false;
        if (this.f27422d.isFinished() || C10774f.m7145k(j) >= 0.0f) {
            z = false;
        } else {
            this.f27422d.onRelease();
            z = this.f27422d.isFinished();
        }
        if (!this.f27423e.isFinished() && C10774f.m7145k(j) > 0.0f) {
            this.f27423e.onRelease();
            z = z || this.f27423e.isFinished();
        }
        if (!this.f27420b.isFinished() && C10774f.m7144l(j) < 0.0f) {
            this.f27420b.onRelease();
            z = z || this.f27420b.isFinished();
        }
        if (this.f27421c.isFinished() || C10774f.m7144l(j) <= 0.0f) {
            return z;
        }
        this.f27421c.onRelease();
        if (z || this.f27421c.isFinished()) {
            z2 = true;
        }
        return z2;
    }

    /* renamed from: w */
    private final void m7409w(long j) {
        this.f27430l.setValue(C10781l.m7097c(j));
    }

    /* renamed from: x */
    private final void m7408x(boolean z) {
        this.f27431m.setValue(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public void mo7199a() {
        if (m7417o()) {
            return;
        }
        List list = this.f27424f;
        int size = list.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            int i2 = i + 1;
            EdgeEffect edgeEffect = (EdgeEffect) list.get(i);
            edgeEffect.onRelease();
            z = edgeEffect.isFinished() || z;
            i = i2;
        }
        if (z) {
            m7416p();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo7198b(long r5, long r7, p373u0.C10774f r9, int r10) {
        /*
            r4 = this;
            boolean r0 = r4.m7417o()
            if (r0 == 0) goto L7
            return
        L7:
            e1.g$a r0 = p072e1.C4955g.f13756a
            int r0 = r0.m26183a()
            boolean r10 = p072e1.C4955g.m26184d(r10, r0)
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L62
            if (r9 != 0) goto L20
            long r9 = r4.m7419m()
            long r9 = p373u0.C10783m.m7084b(r9)
            goto L24
        L20:
            long r9 = r9.m7137s()
        L24:
            float r2 = p373u0.C10774f.m7145k(r7)
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L31
            r4.m7413s(r7, r9)
            goto L3c
        L31:
            float r2 = p373u0.C10774f.m7145k(r7)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L3c
            r4.m7412t(r7, r9)
        L3c:
            float r2 = p373u0.C10774f.m7144l(r7)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L48
            r4.m7411u(r7, r9)
            goto L53
        L48:
            float r2 = p373u0.C10774f.m7144l(r7)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L53
            r4.m7414r(r7, r9)
        L53:
            u0.f$a r9 = p373u0.C10774f.f27866b
            long r9 = r9.m7134c()
            boolean r7 = p373u0.C10774f.m7147i(r7, r9)
            if (r7 == 0) goto L60
            goto L62
        L60:
            r7 = r0
            goto L63
        L62:
            r7 = r1
        L63:
            boolean r5 = r4.m7410v(r5)
            if (r5 != 0) goto L6d
            if (r7 == 0) goto L6c
            goto L6d
        L6c:
            r0 = r1
        L6d:
            if (r0 == 0) goto L72
            r4.m7416p()
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.AndroidOverScroll.mo7198b(long, long, u0.f, int):void");
    }

    /* renamed from: c */
    public void mo7197c(DrawScope drawScope) {
        boolean z;
        Intrinsics.isThisObjectNull(drawScope, "<this>");
        InterfaceC11064u mo3275b = drawScope.m3272B().mo3275b();
        this.f27429k.getValue();
        if (m7417o()) {
            return;
        }
        Canvas m6596c = C11002c.m6596c(mo3275b);
        C10753o c10753o = C10753o.f27827a;
        boolean z2 = true;
        if (!(c10753o.m7221b(this.f27427i) == 0.0f)) {
            m7421k(drawScope, this.f27427i, m6596c);
            this.f27427i.finish();
        }
        if (this.f27422d.isFinished()) {
            z = false;
        } else {
            z = m7422j(drawScope, this.f27422d, m6596c);
            c10753o.m7219d(this.f27427i, c10753o.m7221b(this.f27422d), 0.0f);
        }
        if (!(c10753o.m7221b(this.f27425g) == 0.0f)) {
            m7423i(drawScope, this.f27425g, m6596c);
            this.f27425g.finish();
        }
        if (!this.f27420b.isFinished()) {
            z = m7420l(drawScope, this.f27420b, m6596c) || z;
            c10753o.m7219d(this.f27425g, c10753o.m7221b(this.f27420b), 0.0f);
        }
        if (!(c10753o.m7221b(this.f27428j) == 0.0f)) {
            m7422j(drawScope, this.f27428j, m6596c);
            this.f27428j.finish();
        }
        if (!this.f27423e.isFinished()) {
            z = m7421k(drawScope, this.f27423e, m6596c) || z;
            c10753o.m7219d(this.f27428j, c10753o.m7221b(this.f27423e), 0.0f);
        }
        if (!(c10753o.m7221b(this.f27426h) == 0.0f)) {
            m7420l(drawScope, this.f27426h, m6596c);
            this.f27426h.finish();
        }
        if (!this.f27421c.isFinished()) {
            if (!m7423i(drawScope, this.f27421c, m6596c) && !z) {
                z2 = false;
            }
            c10753o.m7219d(this.f27426h, c10753o.m7221b(this.f27421c), 0.0f);
            z = z2;
        }
        if (z) {
            m7416p();
        }
    }

    /* renamed from: d */
    public void mo7196d(long j) {
        int m19530c;
        int m19530c2;
        int m19530c3;
        int m19530c4;
        if (m7417o()) {
            return;
        }
        if (C13624s.m780h(j) > 0.0f) {
            C10753o c10753o = C10753o.f27827a;
            EdgeEffect edgeEffect = this.f27422d;
            m19530c4 = C7037c.m19530c(C13624s.m780h(j));
            c10753o.m7220c(edgeEffect, m19530c4);
        } else if (C13624s.m780h(j) < 0.0f) {
            C10753o c10753o2 = C10753o.f27827a;
            EdgeEffect edgeEffect2 = this.f27423e;
            m19530c = C7037c.m19530c(C13624s.m780h(j));
            c10753o2.m7220c(edgeEffect2, -m19530c);
        }
        if (C13624s.m779i(j) > 0.0f) {
            C10753o c10753o3 = C10753o.f27827a;
            EdgeEffect edgeEffect3 = this.f27420b;
            m19530c3 = C7037c.m19530c(C13624s.m779i(j));
            c10753o3.m7220c(edgeEffect3, m19530c3);
        } else if (C13624s.m779i(j) < 0.0f) {
            C10753o c10753o4 = C10753o.f27827a;
            EdgeEffect edgeEffect4 = this.f27421c;
            m19530c2 = C7037c.m19530c(C13624s.m779i(j));
            c10753o4.m7220c(edgeEffect4, -m19530c2);
        }
        if (C13624s.m781g(j, C13624s.f34622b.m773a())) {
            return;
        }
        m7416p();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo7195e(long r7) {
        /*
            r6 = this;
            boolean r0 = r6.m7417o()
            if (r0 == 0) goto Ld
            z1.s$a r7 = p479z1.C13624s.f34622b
            long r7 = r7.m773a()
            return r7
        Ld:
            float r0 = p479z1.C13624s.m780h(r7)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r0 <= 0) goto L3b
            u.o r0 = p372u.C10753o.f27827a
            android.widget.EdgeEffect r4 = r6.f27422d
            float r4 = r0.m7221b(r4)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L26
            r4 = r2
            goto L27
        L26:
            r4 = r3
        L27:
            if (r4 != 0) goto L3b
            android.widget.EdgeEffect r4 = r6.f27422d
            float r5 = p479z1.C13624s.m780h(r7)
            int r5 = p220ld.C7035a.m19533c(r5)
            r0.m7220c(r4, r5)
            float r0 = p479z1.C13624s.m780h(r7)
            goto L68
        L3b:
            float r0 = p479z1.C13624s.m780h(r7)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L67
            u.o r0 = p372u.C10753o.f27827a
            android.widget.EdgeEffect r4 = r6.f27423e
            float r4 = r0.m7221b(r4)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L51
            r4 = r2
            goto L52
        L51:
            r4 = r3
        L52:
            if (r4 != 0) goto L67
            android.widget.EdgeEffect r4 = r6.f27423e
            float r5 = p479z1.C13624s.m780h(r7)
            int r5 = p220ld.C7035a.m19533c(r5)
            int r5 = -r5
            r0.m7220c(r4, r5)
            float r0 = p479z1.C13624s.m780h(r7)
            goto L68
        L67:
            r0 = r1
        L68:
            float r4 = p479z1.C13624s.m779i(r7)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L93
            u.o r4 = p372u.C10753o.f27827a
            android.widget.EdgeEffect r5 = r6.f27420b
            float r5 = r4.m7221b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L7e
            r5 = r2
            goto L7f
        L7e:
            r5 = r3
        L7f:
            if (r5 != 0) goto L93
            android.widget.EdgeEffect r1 = r6.f27420b
            float r2 = p479z1.C13624s.m779i(r7)
            int r2 = p220ld.C7035a.m19533c(r2)
            r4.m7220c(r1, r2)
            float r1 = p479z1.C13624s.m779i(r7)
            goto Lbd
        L93:
            float r4 = p479z1.C13624s.m779i(r7)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 >= 0) goto Lbd
            u.o r4 = p372u.C10753o.f27827a
            android.widget.EdgeEffect r5 = r6.f27421c
            float r5 = r4.m7221b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto La8
            goto La9
        La8:
            r2 = r3
        La9:
            if (r2 != 0) goto Lbd
            android.widget.EdgeEffect r1 = r6.f27421c
            float r2 = p479z1.C13624s.m779i(r7)
            int r2 = p220ld.C7035a.m19533c(r2)
            int r2 = -r2
            r4.m7220c(r1, r2)
            float r1 = p479z1.C13624s.m779i(r7)
        Lbd:
            long r7 = p479z1.C13626t.m772a(r0, r1)
            z1.s$a r0 = p479z1.C13624s.f34622b
            long r0 = r0.m773a()
            boolean r0 = p479z1.C13624s.m781g(r7, r0)
            if (r0 != 0) goto Ld0
            r6.m7416p()
        Ld0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.AndroidOverScroll.mo7195e(long):long");
    }

    /* renamed from: f */
    public void mo7194f(long j, boolean z) {
        int m19530c;
        int m19530c2;
        int m19530c3;
        int m19530c4;
        int m19530c5;
        int m19530c6;
        int m19530c7;
        int m19530c8;
        int m19530c9;
        int m19530c10;
        int m19530c11;
        int m19530c12;
        int m19530c13;
        int m19530c14;
        int m19530c15;
        int m19530c16;
        boolean z2 = !C10781l.m7094f(j, m7419m());
        boolean z3 = m7415q() != z;
        m7409w(j);
        m7408x(z);
        if (z2) {
            EdgeEffect edgeEffect = this.f27420b;
            m19530c = C7037c.m19530c(C10781l.m7091i(j));
            m19530c2 = C7037c.m19530c(C10781l.m7093g(j));
            edgeEffect.setSize(m19530c, m19530c2);
            EdgeEffect edgeEffect2 = this.f27421c;
            m19530c3 = C7037c.m19530c(C10781l.m7091i(j));
            m19530c4 = C7037c.m19530c(C10781l.m7093g(j));
            edgeEffect2.setSize(m19530c3, m19530c4);
            EdgeEffect edgeEffect3 = this.f27422d;
            m19530c5 = C7037c.m19530c(C10781l.m7093g(j));
            m19530c6 = C7037c.m19530c(C10781l.m7091i(j));
            edgeEffect3.setSize(m19530c5, m19530c6);
            EdgeEffect edgeEffect4 = this.f27423e;
            m19530c7 = C7037c.m19530c(C10781l.m7093g(j));
            m19530c8 = C7037c.m19530c(C10781l.m7091i(j));
            edgeEffect4.setSize(m19530c7, m19530c8);
            EdgeEffect edgeEffect5 = this.f27425g;
            m19530c9 = C7037c.m19530c(C10781l.m7091i(j));
            m19530c10 = C7037c.m19530c(C10781l.m7093g(j));
            edgeEffect5.setSize(m19530c9, m19530c10);
            EdgeEffect edgeEffect6 = this.f27426h;
            m19530c11 = C7037c.m19530c(C10781l.m7091i(j));
            m19530c12 = C7037c.m19530c(C10781l.m7093g(j));
            edgeEffect6.setSize(m19530c11, m19530c12);
            EdgeEffect edgeEffect7 = this.f27427i;
            m19530c13 = C7037c.m19530c(C10781l.m7093g(j));
            m19530c14 = C7037c.m19530c(C10781l.m7091i(j));
            edgeEffect7.setSize(m19530c13, m19530c14);
            EdgeEffect edgeEffect8 = this.f27428j;
            m19530c15 = C7037c.m19530c(C10781l.m7093g(j));
            m19530c16 = C7037c.m19530c(C10781l.m7091i(j));
            edgeEffect8.setSize(m19530c15, m19530c16);
        }
        if (z3 || z2) {
            mo7199a();
        }
    }

    /* renamed from: g */
    public boolean mo7193g() {
        boolean z;
        long m7084b = C10783m.m7084b(m7419m());
        C10753o c10753o = C10753o.f27827a;
        if (c10753o.m7221b(this.f27422d) == 0.0f) {
            z = false;
        } else {
            m7413s(C10774f.f27866b.m7134c(), m7084b);
            z = true;
        }
        if (!(c10753o.m7221b(this.f27423e) == 0.0f)) {
            m7412t(C10774f.f27866b.m7134c(), m7084b);
            z = true;
        }
        if (!(c10753o.m7221b(this.f27420b) == 0.0f)) {
            m7411u(C10774f.f27866b.m7134c(), m7084b);
            z = true;
        }
        if (c10753o.m7221b(this.f27421c) == 0.0f) {
            return z;
        }
        m7414r(C10774f.f27866b.m7134c(), m7084b);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f5  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo7192h(long r7, p373u0.C10774f r9, int r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.AndroidOverScroll.mo7192h(long, u0.f, int):long");
    }

    /* renamed from: n */
    public final C10761t m7418n() {
        return this.f27419a;
    }
}
