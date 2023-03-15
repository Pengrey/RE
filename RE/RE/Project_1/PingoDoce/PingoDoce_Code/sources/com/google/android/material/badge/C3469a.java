package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.C1112b0;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.C3640k;
import com.google.android.material.internal.C3646n;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import p100f8.C5419b;
import p100f8.C5421d;
import p100f8.C5423f;
import p100f8.C5427j;
import p100f8.C5428k;
import p354s8.C10087d;
import p401v8.C11141g;

/* renamed from: com.google.android.material.badge.a */
/* loaded from: classes.dex */
public class C3469a extends Drawable implements C3640k.InterfaceC3642b {

    /* renamed from: J */
    private static final int f9423J = C5428k.Widget_MaterialComponents_Badge;

    /* renamed from: K */
    private static final int f9424K = C5419b.badgeStyle;

    /* renamed from: A */
    private final BadgeState f9425A;

    /* renamed from: B */
    private float f9426B;

    /* renamed from: C */
    private float f9427C;

    /* renamed from: D */
    private int f9428D;

    /* renamed from: E */
    private float f9429E;

    /* renamed from: F */
    private float f9430F;

    /* renamed from: G */
    private float f9431G;

    /* renamed from: H */
    private WeakReference<View> f9432H;

    /* renamed from: I */
    private WeakReference<FrameLayout> f9433I;

    /* renamed from: w */
    private final WeakReference<Context> f9434w;

    /* renamed from: x */
    private final C11141g f9435x;

    /* renamed from: y */
    private final C3640k f9436y;

    /* renamed from: z */
    private final Rect f9437z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BadgeDrawable.java */
    /* renamed from: com.google.android.material.badge.a$a */
    /* loaded from: classes.dex */
    public class RunnableC3470a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ View f9438w;

        /* renamed from: x */
        final /* synthetic */ FrameLayout f9439x;

        RunnableC3470a(View view, FrameLayout frameLayout) {
            this.f9438w = view;
            this.f9439x = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3469a.this.m30535D(this.f9438w, this.f9439x);
        }
    }

    private C3469a(Context context, int i, int i2, int i3, BadgeState.State state) {
        this.f9434w = new WeakReference<>(context);
        C3646n.m29505c(context);
        this.f9437z = new Rect();
        this.f9435x = new C11141g();
        C3640k c3640k = new C3640k(this);
        this.f9436y = c3640k;
        c3640k.m29518e().setTextAlign(Paint.Align.CENTER);
        m30508z(C5428k.TextAppearance_MaterialComponents_Badge);
        this.f9425A = new BadgeState(context, i, i2, i3, state);
        m30511w();
    }

    /* renamed from: B */
    private void m30537B(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != C5423f.mtrl_anchor_parent) {
            WeakReference<FrameLayout> weakReference = this.f9433I;
            if (weakReference == null || weakReference.get() != viewGroup) {
                m30536C(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(C5423f.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.f9433I = new WeakReference<>(frameLayout);
                frameLayout.post(new RunnableC3470a(view, frameLayout));
            }
        }
    }

    /* renamed from: C */
    private static void m30536C(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    /* renamed from: E */
    private void m30534E() {
        Context context = this.f9434w.get();
        WeakReference<View> weakReference = this.f9432H;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f9437z);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.f9433I;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || C3471b.f9441a) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        m30532b(context, rect2, view);
        C3471b.m30502f(this.f9437z, this.f9426B, this.f9427C, this.f9430F, this.f9431G);
        this.f9435x.m6007W(this.f9429E);
        if (rect.equals(this.f9437z)) {
            return;
        }
        this.f9435x.setBounds(this.f9437z);
    }

    /* renamed from: F */
    private void m30533F() {
        this.f9428D = ((int) Math.pow(10.0d, m30524j() - 1.0d)) - 1;
    }

    /* renamed from: b */
    private void m30532b(Context context, Rect rect, View view) {
        int i;
        float f;
        float f2;
        int m30520n = m30520n();
        int m30595f = this.f9425A.m30595f();
        if (m30595f != 8388691 && m30595f != 8388693) {
            this.f9427C = rect.top + m30520n;
        } else {
            this.f9427C = rect.bottom - m30520n;
        }
        if (m30523k() <= 9) {
            float f3 = !m30519o() ? this.f9425A.f9402c : this.f9425A.f9403d;
            this.f9429E = f3;
            this.f9431G = f3;
            this.f9430F = f3;
        } else {
            float f4 = this.f9425A.f9403d;
            this.f9429E = f4;
            this.f9431G = f4;
            this.f9430F = (this.f9436y.m29517f(m30528f()) / 2.0f) + this.f9425A.f9404e;
        }
        Resources resources = context.getResources();
        if (m30519o()) {
            i = C5421d.mtrl_badge_text_horizontal_edge_offset;
        } else {
            i = C5421d.mtrl_badge_horizontal_edge_offset;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        int m30521m = m30521m();
        int m30595f2 = this.f9425A.m30595f();
        if (m30595f2 != 8388659 && m30595f2 != 8388691) {
            if (C1112b0.m38476E(view) == 0) {
                f2 = ((rect.right + this.f9430F) - dimensionPixelSize) - m30521m;
            } else {
                f2 = (rect.left - this.f9430F) + dimensionPixelSize + m30521m;
            }
            this.f9426B = f2;
            return;
        }
        if (C1112b0.m38476E(view) == 0) {
            f = (rect.left - this.f9430F) + dimensionPixelSize + m30521m;
        } else {
            f = ((rect.right + this.f9430F) - dimensionPixelSize) - m30521m;
        }
        this.f9426B = f;
    }

    /* renamed from: c */
    public static C3469a m30531c(Context context) {
        return new C3469a(context, 0, f9424K, f9423J, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C3469a m30530d(Context context, BadgeState.State state) {
        return new C3469a(context, 0, f9424K, f9423J, state);
    }

    /* renamed from: e */
    private void m30529e(Canvas canvas) {
        Rect rect = new Rect();
        String m30528f = m30528f();
        this.f9436y.m29518e().getTextBounds(m30528f, 0, m30528f.length(), rect);
        canvas.drawText(m30528f, this.f9426B, this.f9427C + (rect.height() / 2), this.f9436y.m29518e());
    }

    /* renamed from: f */
    private String m30528f() {
        if (m30523k() <= this.f9428D) {
            return NumberFormat.getInstance(this.f9425A.m30586o()).format(m30523k());
        }
        Context context = this.f9434w.get();
        return context == null ? BuildConfig.VERSION_NAME : String.format(this.f9425A.m30586o(), context.getString(C5427j.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f9428D), "+");
    }

    /* renamed from: m */
    private int m30521m() {
        return (m30519o() ? this.f9425A.m30590k() : this.f9425A.m30589l()) + this.f9425A.m30599b();
    }

    /* renamed from: n */
    private int m30520n() {
        return (m30519o() ? this.f9425A.m30584q() : this.f9425A.m30583r()) + this.f9425A.m30598c();
    }

    /* renamed from: p */
    private void m30518p() {
        this.f9436y.m29518e().setAlpha(getAlpha());
        invalidateSelf();
    }

    /* renamed from: q */
    private void m30517q() {
        ColorStateList valueOf = ColorStateList.valueOf(this.f9425A.m30596e());
        if (this.f9435x.m5968x() != valueOf) {
            this.f9435x.m6004Z(valueOf);
            invalidateSelf();
        }
    }

    /* renamed from: r */
    private void m30516r() {
        WeakReference<View> weakReference = this.f9432H;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = this.f9432H.get();
        WeakReference<FrameLayout> weakReference2 = this.f9433I;
        m30535D(view, weakReference2 != null ? weakReference2.get() : null);
    }

    /* renamed from: s */
    private void m30515s() {
        this.f9436y.m29518e().setColor(this.f9425A.m30594g());
        invalidateSelf();
    }

    /* renamed from: t */
    private void m30514t() {
        m30533F();
        this.f9436y.m29514i(true);
        m30534E();
        invalidateSelf();
    }

    /* renamed from: u */
    private void m30513u() {
        this.f9436y.m29514i(true);
        m30534E();
        invalidateSelf();
    }

    /* renamed from: v */
    private void m30512v() {
        boolean m30581t = this.f9425A.m30581t();
        setVisible(m30581t, false);
        if (!C3471b.f9441a || m30526h() == null || m30581t) {
            return;
        }
        ((ViewGroup) m30526h().getParent()).invalidate();
    }

    /* renamed from: w */
    private void m30511w() {
        m30514t();
        m30513u();
        m30518p();
        m30517q();
        m30515s();
        m30516r();
        m30534E();
        m30512v();
    }

    /* renamed from: y */
    private void m30509y(C10087d c10087d) {
        Context context;
        if (this.f9436y.m29519d() == c10087d || (context = this.f9434w.get()) == null) {
            return;
        }
        this.f9436y.m29515h(c10087d, context);
        m30534E();
    }

    /* renamed from: z */
    private void m30508z(int i) {
        Context context = this.f9434w.get();
        if (context == null) {
            return;
        }
        m30509y(new C10087d(context, i));
    }

    /* renamed from: A */
    public void m30538A(boolean z) {
        this.f9425A.m30577x(z);
        m30512v();
    }

    /* renamed from: D */
    public void m30535D(View view, FrameLayout frameLayout) {
        this.f9432H = new WeakReference<>(view);
        boolean z = C3471b.f9441a;
        if (z && frameLayout == null) {
            m30537B(view);
        } else {
            this.f9433I = new WeakReference<>(frameLayout);
        }
        if (!z) {
            m30536C(view);
        }
        m30534E();
        invalidateSelf();
    }

    @Override // com.google.android.material.internal.C3640k.InterfaceC3642b
    /* renamed from: a */
    public void mo29512a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f9435x.draw(canvas);
        if (m30519o()) {
            m30529e(canvas);
        }
    }

    /* renamed from: g */
    public CharSequence m30527g() {
        Context context;
        if (isVisible()) {
            if (m30519o()) {
                if (this.f9425A.m30591j() == 0 || (context = this.f9434w.get()) == null) {
                    return null;
                }
                if (m30523k() <= this.f9428D) {
                    return context.getResources().getQuantityString(this.f9425A.m30591j(), m30523k(), Integer.valueOf(m30523k()));
                }
                return context.getString(this.f9425A.m30593h(), Integer.valueOf(this.f9428D));
            }
            return this.f9425A.m30592i();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f9425A.m30597d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f9437z.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f9437z.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public FrameLayout m30526h() {
        WeakReference<FrameLayout> weakReference = this.f9433I;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: i */
    public int m30525i() {
        return this.f9425A.m30589l();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    /* renamed from: j */
    public int m30524j() {
        return this.f9425A.m30588m();
    }

    /* renamed from: k */
    public int m30523k() {
        if (m30519o()) {
            return this.f9425A.m30587n();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public BadgeState.State m30522l() {
        return this.f9425A.m30585p();
    }

    /* renamed from: o */
    public boolean m30519o() {
        return this.f9425A.m30582s();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.C3640k.InterfaceC3642b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f9425A.m30579v(i);
        m30518p();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: x */
    public void m30510x(int i) {
        int max = Math.max(0, i);
        if (this.f9425A.m30587n() != max) {
            this.f9425A.m30578w(max);
            m30513u();
        }
    }
}
