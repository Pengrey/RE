package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import androidx.core.view.C1112b0;
import androidx.vectordrawable.graphics.drawable.AbstractC1693b;
import com.google.android.material.internal.C3646n;
import com.google.android.material.progressindicator.AbstractC3675b;
import java.util.Arrays;
import org.joda.time.DateTimeConstants;
import p100f8.C5419b;
import p100f8.C5428k;
import p100f8.C5429l;
import p198k8.C6608a;
import p332r8.C9826a;
import p419w8.C11602a;

/* renamed from: com.google.android.material.progressindicator.a */
/* loaded from: classes.dex */
public abstract class AbstractC3670a<S extends AbstractC3675b> extends ProgressBar {

    /* renamed from: J */
    static final int f10324J = C5428k.Widget_MaterialComponents_ProgressIndicator;

    /* renamed from: A */
    private final int f10325A;

    /* renamed from: B */
    private long f10326B;

    /* renamed from: C */
    C9826a f10327C;

    /* renamed from: D */
    private boolean f10328D;

    /* renamed from: E */
    private int f10329E;

    /* renamed from: F */
    private final Runnable f10330F;

    /* renamed from: G */
    private final Runnable f10331G;

    /* renamed from: H */
    private final AbstractC1693b f10332H;

    /* renamed from: I */
    private final AbstractC1693b f10333I;

    /* renamed from: w */
    S f10334w;

    /* renamed from: x */
    private int f10335x;

    /* renamed from: y */
    private boolean f10336y;

    /* renamed from: z */
    private boolean f10337z;

    /* compiled from: BaseProgressIndicator.java */
    /* renamed from: com.google.android.material.progressindicator.a$a */
    /* loaded from: classes.dex */
    class RunnableC3671a implements Runnable {
        RunnableC3671a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC3670a.this.m29399k();
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    /* renamed from: com.google.android.material.progressindicator.a$b */
    /* loaded from: classes.dex */
    class RunnableC3672b implements Runnable {
        RunnableC3672b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC3670a.this.m29400j();
            AbstractC3670a.this.f10326B = -1L;
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    /* renamed from: com.google.android.material.progressindicator.a$c */
    /* loaded from: classes.dex */
    class C3673c extends AbstractC1693b {
        C3673c() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.AbstractC1693b
        /* renamed from: a */
        public void mo29392a(Drawable drawable) {
            AbstractC3670a.this.setIndeterminate(false);
            AbstractC3670a abstractC3670a = AbstractC3670a.this;
            abstractC3670a.mo29395o(abstractC3670a.f10335x, AbstractC3670a.this.f10336y);
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    /* renamed from: com.google.android.material.progressindicator.a$d */
    /* loaded from: classes.dex */
    class C3674d extends AbstractC1693b {
        C3674d() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.AbstractC1693b
        /* renamed from: a */
        public void mo29392a(Drawable drawable) {
            super.mo29392a(drawable);
            if (AbstractC3670a.this.f10328D) {
                return;
            }
            AbstractC3670a abstractC3670a = AbstractC3670a.this;
            abstractC3670a.setVisibility(abstractC3670a.f10329E);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3670a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C11602a.m4640c(context, attributeSet, i, f10324J), attributeSet, i);
        this.f10328D = false;
        this.f10329E = 4;
        this.f10330F = new RunnableC3671a();
        this.f10331G = new RunnableC3672b();
        this.f10332H = new C3673c();
        this.f10333I = new C3674d();
        Context context2 = getContext();
        this.f10334w = mo29411r(context2, attributeSet);
        TypedArray m29500h = C3646n.m29500h(context2, attributeSet, C5429l.f14891A, i, i2, new int[0]);
        m29500h.getInt(C5429l.f14931F, -1);
        this.f10325A = Math.min(m29500h.getInt(C5429l.f14915D, -1), (int) DateTimeConstants.MILLIS_PER_SECOND);
        m29500h.recycle();
        this.f10327C = new C9826a();
        this.f10337z = true;
    }

    private AbstractC3682e<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().m29351u();
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().m29384v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m29400j() {
        ((AbstractC3678d) getCurrentDrawable()).m29362p(false, false, true);
        if (m29397m()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m29399k() {
        if (this.f10325A > 0) {
            SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    /* renamed from: m */
    private boolean m29397m() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    /* renamed from: n */
    private void m29396n() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().m29352t().mo29328d(this.f10332H);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().m29366l(this.f10333I);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().m29366l(this.f10333I);
        }
    }

    /* renamed from: p */
    private void m29394p() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().m29361r(this.f10333I);
            getIndeterminateDrawable().m29352t().mo29325h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().m29361r(this.f10333I);
        }
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f10334w.f10347f;
    }

    public int[] getIndicatorColor() {
        return this.f10334w.f10344c;
    }

    public int getShowAnimationBehavior() {
        return this.f10334w.f10346e;
    }

    public int getTrackColor() {
        return this.f10334w.f10345d;
    }

    public int getTrackCornerRadius() {
        return this.f10334w.f10343b;
    }

    public int getTrackThickness() {
        return this.f10334w.f10342a;
    }

    /* renamed from: h */
    protected void m29402h(boolean z) {
        if (this.f10337z) {
            ((AbstractC3678d) getCurrentDrawable()).m29362p(m29393q(), false, z);
        }
    }

    /* renamed from: i */
    abstract S mo29411r(Context context, AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    /* renamed from: l */
    boolean m29398l() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: o */
    public void mo29395o(int i, boolean z) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.f10335x = i;
                this.f10336y = z;
                this.f10328D = true;
                if (getIndeterminateDrawable().isVisible() && this.f10327C.m9912a(getContext().getContentResolver()) != 0.0f) {
                    getIndeterminateDrawable().m29352t().mo29327f();
                    return;
                } else {
                    this.f10332H.mo29392a(getIndeterminateDrawable());
                    return;
                }
            }
            return;
        }
        super.setProgress(i);
        if (getProgressDrawable() == null || z) {
            return;
        }
        getProgressDrawable().jumpToCurrentState();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m29396n();
        if (m29393q()) {
            m29399k();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f10331G);
        removeCallbacks(this.f10330F);
        ((AbstractC3678d) getCurrentDrawable()).m29370h();
        m29394p();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        int paddingLeft;
        int paddingTop;
        super.onMeasure(i, i2);
        AbstractC3682e<S> currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate == null) {
            return;
        }
        int mo29344e = currentDrawingDelegate.mo29344e();
        int mo29345d = currentDrawingDelegate.mo29345d();
        if (mo29344e < 0) {
            paddingLeft = getMeasuredWidth();
        } else {
            paddingLeft = mo29344e + getPaddingLeft() + getPaddingRight();
        }
        if (mo29345d < 0) {
            paddingTop = getMeasuredHeight();
        } else {
            paddingTop = mo29345d + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m29402h(i == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m29402h(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean m29393q() {
        return C1112b0.m38447V(this) && getWindowVisibility() == 0 && m29398l();
    }

    public void setAnimatorDurationScaleProvider(C9826a c9826a) {
        this.f10327C = c9826a;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f10367y = c9826a;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f10367y = c9826a;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f10334w.f10347f = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        AbstractC3678d abstractC3678d = (AbstractC3678d) getCurrentDrawable();
        if (abstractC3678d != null) {
            abstractC3678d.m29370h();
        }
        super.setIndeterminate(z);
        AbstractC3678d abstractC3678d2 = (AbstractC3678d) getCurrentDrawable();
        if (abstractC3678d2 != null) {
            abstractC3678d2.m29362p(m29393q(), false, false);
        }
        if ((abstractC3678d2 instanceof C3684g) && m29393q()) {
            ((C3684g) abstractC3678d2).m29352t().mo29326g();
        }
        this.f10328D = false;
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (drawable instanceof C3684g) {
            ((AbstractC3678d) drawable).m29370h();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{C6608a.m20506b(getContext(), C5419b.f14888n, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f10334w.f10344c = iArr;
        getIndeterminateDrawable().m29352t().mo29329c();
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        mo29395o(i, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else if (drawable instanceof C3676c) {
            C3676c c3676c = (C3676c) drawable;
            c3676c.m29370h();
            super.setProgressDrawable(c3676c);
            c3676c.m29380z(getProgress() / getMax());
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f10334w.f10346e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        S s = this.f10334w;
        if (s.f10345d != i) {
            s.f10345d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        S s = this.f10334w;
        if (s.f10343b != i) {
            s.f10343b = Math.min(i, s.f10342a / 2);
        }
    }

    public void setTrackThickness(int i) {
        S s = this.f10334w;
        if (s.f10342a != i) {
            s.f10342a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f10329E = i;
    }

    @Override // android.widget.ProgressBar
    public C3684g<S> getIndeterminateDrawable() {
        return (C3684g) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public C3676c<S> getProgressDrawable() {
        return (C3676c) super.getProgressDrawable();
    }
}
