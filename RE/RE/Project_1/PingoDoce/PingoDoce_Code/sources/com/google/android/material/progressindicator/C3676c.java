package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.google.android.material.progressindicator.AbstractC3675b;
import p198k8.C6608a;
import p304q2.AbstractC9620c;
import p304q2.C9621d;
import p304q2.C9622e;

/* renamed from: com.google.android.material.progressindicator.c */
/* loaded from: classes.dex */
public final class C3676c<S extends AbstractC3675b> extends AbstractC3678d {

    /* renamed from: Q */
    private static final AbstractC9620c<C3676c> f10348Q = new C3677a("indicatorLevel");

    /* renamed from: L */
    private AbstractC3682e<S> f10349L;

    /* renamed from: M */
    private final C9622e f10350M;

    /* renamed from: N */
    private final C9621d f10351N;

    /* renamed from: O */
    private float f10352O;

    /* renamed from: P */
    private boolean f10353P;

    /* compiled from: DeterminateDrawable.java */
    /* renamed from: com.google.android.material.progressindicator.c$a */
    /* loaded from: classes.dex */
    class C3677a extends AbstractC9620c<C3676c> {
        C3677a(String str) {
            super(str);
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: c */
        public float mo10451a(C3676c c3676c) {
            return c3676c.m29383w() * 10000.0f;
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: d */
        public void mo10450b(C3676c c3676c, float f) {
            c3676c.m29381y(f / 10000.0f);
        }
    }

    C3676c(Context context, AbstractC3675b abstractC3675b, AbstractC3682e<S> abstractC3682e) {
        super(context, abstractC3675b);
        this.f10353P = false;
        m29382x(abstractC3682e);
        C9622e c9622e = new C9622e();
        this.f10350M = c9622e;
        c9622e.m10438d(1.0f);
        c9622e.m10436f(50.0f);
        C9621d c9621d = new C9621d(this, f10348Q);
        this.f10351N = c9621d;
        c9621d.m10443p(c9622e);
        m29365m(1.0f);
    }

    /* renamed from: u */
    public static C3676c<C3693k> m29385u(Context context, C3693k c3693k) {
        return new C3676c<>(context, c3693k, new C3685h(c3693k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public float m29383w() {
        return this.f10352O;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m29381y(float f) {
        this.f10352O = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f10349L.m29357g(canvas, m29371g());
            this.f10349L.mo29346c(canvas, this.f10363I);
            this.f10349L.mo29347b(canvas, this.f10363I, 0.0f, m29383w(), C6608a.m20507a(this.f10366x.f10344c[0], getAlpha()));
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f10349L.mo29345d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f10349L.mo29344e();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f10351N.m10442q();
        m29381y(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        if (this.f10353P) {
            this.f10351N.m10442q();
            m29381y(i / 10000.0f);
            return true;
        }
        this.f10351N.m10483h(m29383w() * 10000.0f);
        this.f10351N.m10447l(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC3678d
    /* renamed from: q */
    public boolean mo29354q(boolean z, boolean z2, boolean z3) {
        boolean mo29354q = super.mo29354q(z, z2, z3);
        float m9912a = this.f10367y.m9912a(this.f10365w.getContentResolver());
        if (m9912a == 0.0f) {
            this.f10353P = true;
        } else {
            this.f10353P = false;
            this.f10350M.m10436f(50.0f / m9912a);
        }
        return mo29354q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public AbstractC3682e<S> m29384v() {
        return this.f10349L;
    }

    /* renamed from: x */
    void m29382x(AbstractC3682e<S> abstractC3682e) {
        this.f10349L = abstractC3682e;
        abstractC3682e.m29358f(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m29380z(float f) {
        setLevel((int) (f * 10000.0f));
    }
}
