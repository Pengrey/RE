package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.C1112b0;
import java.util.ArrayList;
import java.util.List;
import p100f8.C5419b;
import p100f8.C5421d;
import p100f8.C5428k;
import p100f8.C5429l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockHandView extends View {

    /* renamed from: A */
    private boolean f10807A;

    /* renamed from: B */
    private int f10808B;

    /* renamed from: C */
    private final List<InterfaceC3799d> f10809C;

    /* renamed from: D */
    private final int f10810D;

    /* renamed from: E */
    private final float f10811E;

    /* renamed from: F */
    private final Paint f10812F;

    /* renamed from: G */
    private final RectF f10813G;

    /* renamed from: H */
    private final int f10814H;

    /* renamed from: I */
    private float f10815I;

    /* renamed from: J */
    private boolean f10816J;

    /* renamed from: K */
    private InterfaceC3798c f10817K;

    /* renamed from: L */
    private double f10818L;

    /* renamed from: M */
    private int f10819M;

    /* renamed from: w */
    private ValueAnimator f10820w;

    /* renamed from: x */
    private boolean f10821x;

    /* renamed from: y */
    private float f10822y;

    /* renamed from: z */
    private float f10823z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    /* loaded from: classes.dex */
    public class C3796a implements ValueAnimator.AnimatorUpdateListener {
        C3796a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m28831m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.timepicker.ClockHandView$b */
    /* loaded from: classes.dex */
    public class C3797b extends AnimatorListenerAdapter {
        C3797b(ClockHandView clockHandView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$c */
    /* loaded from: classes.dex */
    public interface InterfaceC3798c {
        /* renamed from: a */
        void m28830a(float f, boolean z);
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$d */
    /* loaded from: classes.dex */
    public interface InterfaceC3799d {
        /* renamed from: a */
        void mo28829a(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5419b.materialClockStyle);
    }

    /* renamed from: c */
    private void m28841c(Canvas canvas) {
        int width;
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f = height;
        this.f10812F.setStrokeWidth(0.0f);
        canvas.drawCircle((this.f10819M * ((float) Math.cos(this.f10818L))) + width2, (this.f10819M * ((float) Math.sin(this.f10818L))) + f, this.f10810D, this.f10812F);
        double sin = Math.sin(this.f10818L);
        double cos = Math.cos(this.f10818L);
        this.f10812F.setStrokeWidth(this.f10814H);
        canvas.drawLine(width2, f, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.f10812F);
        canvas.drawCircle(width2, f, this.f10811E, this.f10812F);
    }

    /* renamed from: e */
    private int m28839e(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    /* renamed from: h */
    private Pair<Float, Float> m28836h(float f) {
        float m28838f = m28838f();
        if (Math.abs(m28838f - f) > 180.0f) {
            if (m28838f > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (m28838f < 180.0f && f > 180.0f) {
                m28838f += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(m28838f), Float.valueOf(f));
    }

    /* renamed from: i */
    private boolean m28835i(float f, float f2, boolean z, boolean z2, boolean z3) {
        float m28839e = m28839e(f, f2);
        boolean z4 = false;
        boolean z5 = m28838f() != m28839e;
        if (z2 && z5) {
            return true;
        }
        if (z5 || z) {
            if (z3 && this.f10821x) {
                z4 = true;
            }
            m28832l(m28839e, z4);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m28831m(float f, boolean z) {
        float f2 = f % 360.0f;
        this.f10815I = f2;
        this.f10818L = Math.toRadians(f2 - 90.0f);
        float width = (getWidth() / 2) + (this.f10819M * ((float) Math.cos(this.f10818L)));
        float height = (getHeight() / 2) + (this.f10819M * ((float) Math.sin(this.f10818L)));
        RectF rectF = this.f10813G;
        int i = this.f10810D;
        rectF.set(width - i, height - i, width + i, height + i);
        for (InterfaceC3799d interfaceC3799d : this.f10809C) {
            interfaceC3799d.mo28829a(f2, z);
        }
        invalidate();
    }

    /* renamed from: b */
    public void m28842b(InterfaceC3799d interfaceC3799d) {
        this.f10809C.add(interfaceC3799d);
    }

    /* renamed from: d */
    public RectF m28840d() {
        return this.f10813G;
    }

    /* renamed from: f */
    public float m28838f() {
        return this.f10815I;
    }

    /* renamed from: g */
    public int m28837g() {
        return this.f10810D;
    }

    /* renamed from: j */
    public void m28834j(int i) {
        this.f10819M = i;
        invalidate();
    }

    /* renamed from: k */
    public void m28833k(float f) {
        m28832l(f, false);
    }

    /* renamed from: l */
    public void m28832l(float f, boolean z) {
        ValueAnimator valueAnimator = this.f10820w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m28831m(f, false);
            return;
        }
        Pair<Float, Float> m28836h = m28836h(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) m28836h.first).floatValue(), ((Float) m28836h.second).floatValue());
        this.f10820w = ofFloat;
        ofFloat.setDuration(200L);
        this.f10820w.addUpdateListener(new C3796a());
        this.f10820w.addListener(new C3797b(this));
        this.f10820w.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m28841c(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m28833k(m28838f());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        InterfaceC3798c interfaceC3798c;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.f10822y = x;
            this.f10823z = y;
            this.f10807A = true;
            this.f10816J = false;
            z = false;
            z2 = false;
            z3 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i = (int) (x - this.f10822y);
            int i2 = (int) (y - this.f10823z);
            this.f10807A = (i * i) + (i2 * i2) > this.f10808B;
            boolean z4 = this.f10816J;
            z = actionMasked == 1;
            z3 = false;
            z2 = z4;
        } else {
            z = false;
            z2 = false;
            z3 = false;
        }
        boolean m28835i = m28835i(x, y, z2, z3, z) | this.f10816J;
        this.f10816J = m28835i;
        if (m28835i && z && (interfaceC3798c = this.f10817K) != null) {
            interfaceC3798c.m28830a(m28839e(x, y), this.f10807A);
        }
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10809C = new ArrayList();
        Paint paint = new Paint();
        this.f10812F = paint;
        this.f10813G = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5429l.f15199l1, i, C5428k.Widget_MaterialComponents_TimePicker_Clock);
        this.f10819M = obtainStyledAttributes.getDimensionPixelSize(C5429l.f15215n1, 0);
        this.f10810D = obtainStyledAttributes.getDimensionPixelSize(C5429l.f15223o1, 0);
        Resources resources = getResources();
        this.f10814H = resources.getDimensionPixelSize(C5421d.material_clock_hand_stroke_width);
        this.f10811E = resources.getDimensionPixelSize(C5421d.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(C5429l.f15207m1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m28833k(0.0f);
        this.f10808B = ViewConfiguration.get(context).getScaledTouchSlop();
        C1112b0.m38479C0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
