package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.C1078a;
import androidx.core.view.C1112b0;
import androidx.core.view.accessibility.C1085c;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import p100f8.C5419b;
import p100f8.C5420c;
import p100f8.C5421d;
import p100f8.C5423f;
import p100f8.C5425h;
import p100f8.C5428k;
import p100f8.C5429l;
import p111g.C5586a;
import p354s8.C10086c;

/* loaded from: classes.dex */
class ClockFaceView extends C3809b implements ClockHandView.InterfaceC3799d {

    /* renamed from: S */
    private final ClockHandView f10791S;

    /* renamed from: T */
    private final Rect f10792T;

    /* renamed from: U */
    private final RectF f10793U;

    /* renamed from: V */
    private final SparseArray<TextView> f10794V;

    /* renamed from: W */
    private final C1078a f10795W;

    /* renamed from: a0 */
    private final int[] f10796a0;

    /* renamed from: b0 */
    private final float[] f10797b0;

    /* renamed from: c0 */
    private final int f10798c0;

    /* renamed from: d0 */
    private final int f10799d0;

    /* renamed from: e0 */
    private final int f10800e0;

    /* renamed from: f0 */
    private final int f10801f0;

    /* renamed from: g0 */
    private String[] f10802g0;

    /* renamed from: h0 */
    private float f10803h0;

    /* renamed from: i0 */
    private final ColorStateList f10804i0;

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnPreDrawListenerC3794a implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC3794a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (ClockFaceView.this.isShown()) {
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                ClockFaceView.this.mo28811w(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f10791S.m28837g()) - ClockFaceView.this.f10798c0);
                return true;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    /* loaded from: classes.dex */
    class C3795b extends C1078a {
        C3795b() {
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: g */
        public void mo19280g(View view, C1085c c1085c) {
            super.mo19280g(view, c1085c);
            int intValue = ((Integer) view.getTag(C5423f.material_value_index)).intValue();
            if (intValue > 0) {
                c1085c.m38584I0((View) ClockFaceView.this.f10794V.get(intValue - 1));
            }
            c1085c.m38556d0(C1085c.C1088c.m38506a(0, 1, intValue, 1, false, view.isSelected()));
            c1085c.m38560b0(true);
            c1085c.m38561b(C1085c.C1086a.f3425e);
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: j */
        public boolean mo28844j(View view, int i, Bundle bundle) {
            if (i == 16) {
                long uptimeMillis = SystemClock.uptimeMillis();
                float x = view.getX() + (view.getWidth() / 2.0f);
                float height = (view.getHeight() / 2.0f) + view.getY();
                ClockFaceView.this.f10791S.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, x, height, 0));
                ClockFaceView.this.f10791S.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, x, height, 0));
                return true;
            }
            return super.mo28844j(view, i, bundle);
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5419b.materialClockStyle);
    }

    /* renamed from: D */
    private void m28849D() {
        RectF m28840d = this.f10791S.m28840d();
        for (int i = 0; i < this.f10794V.size(); i++) {
            TextView textView = this.f10794V.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.f10792T);
                offsetDescendantRectToMyCoords(textView, this.f10792T);
                textView.setSelected(m28840d.contains(this.f10792T.centerX(), this.f10792T.centerY()));
                textView.getPaint().setShader(m28848E(m28840d, this.f10792T, textView));
                textView.invalidate();
            }
        }
    }

    /* renamed from: E */
    private RadialGradient m28848E(RectF rectF, Rect rect, TextView textView) {
        this.f10793U.set(rect);
        this.f10793U.offset(textView.getPaddingLeft(), textView.getPaddingTop());
        if (RectF.intersects(rectF, this.f10793U)) {
            return new RadialGradient(rectF.centerX() - this.f10793U.left, rectF.centerY() - this.f10793U.top, rectF.width() * 0.5f, this.f10796a0, this.f10797b0, Shader.TileMode.CLAMP);
        }
        return null;
    }

    /* renamed from: F */
    private static float m28847F(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    /* renamed from: H */
    private void m28845H(int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f10794V.size();
        for (int i2 = 0; i2 < Math.max(this.f10802g0.length, size); i2++) {
            TextView textView = this.f10794V.get(i2);
            if (i2 >= this.f10802g0.length) {
                removeView(textView);
                this.f10794V.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(C5425h.material_clockface_textview, (ViewGroup) this, false);
                    this.f10794V.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f10802g0[i2]);
                textView.setTag(C5423f.material_value_index, Integer.valueOf(i2));
                C1112b0.m38405s0(textView, this.f10795W);
                textView.setTextColor(this.f10804i0);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.f10802g0[i2]));
                }
            }
        }
    }

    /* renamed from: G */
    public void m28846G(String[] strArr, int i) {
        this.f10802g0 = strArr;
        m28845H(i);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.InterfaceC3799d
    /* renamed from: a */
    public void mo28829a(float f, boolean z) {
        if (Math.abs(this.f10803h0 - f) > 0.001f) {
            this.f10803h0 = f;
            m28849D();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1085c.m38578L0(accessibilityNodeInfo).m38558c0(C1085c.C1087b.m38507a(1, this.f10802g0.length, false, 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m28849D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int m28847F = (int) (this.f10801f0 / m28847F(this.f10799d0 / displayMetrics.heightPixels, this.f10800e0 / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(m28847F, 1073741824);
        setMeasuredDimension(m28847F, m28847F);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.C3809b
    /* renamed from: w */
    public void mo28811w(int i) {
        if (i != m28812v()) {
            super.mo28811w(i);
            this.f10791S.m28834j(m28812v());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10792T = new Rect();
        this.f10793U = new RectF();
        this.f10794V = new SparseArray<>();
        this.f10797b0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5429l.f15173i1, i, C5428k.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList m9229a = C10086c.m9229a(context, obtainStyledAttributes, C5429l.f15191k1);
        this.f10804i0 = m9229a;
        LayoutInflater.from(context).inflate(C5425h.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C5423f.material_clock_hand);
        this.f10791S = clockHandView;
        this.f10798c0 = resources.getDimensionPixelSize(C5421d.material_clock_hand_padding);
        int colorForState = m9229a.getColorForState(new int[]{16842913}, m9229a.getDefaultColor());
        this.f10796a0 = new int[]{colorForState, colorForState, m9229a.getDefaultColor()};
        clockHandView.m28842b(this);
        int defaultColor = C5586a.m23700a(context, C5420c.material_timepicker_clockface).getDefaultColor();
        ColorStateList m9229a2 = C10086c.m9229a(context, obtainStyledAttributes, C5429l.f15182j1);
        setBackgroundColor(m9229a2 != null ? m9229a2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC3794a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f10795W = new C3795b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, BuildConfig.VERSION_NAME);
        m28846G(strArr, 0);
        this.f10799d0 = resources.getDimensionPixelSize(C5421d.material_time_picker_minimum_screen_height);
        this.f10800e0 = resources.getDimensionPixelSize(C5421d.material_time_picker_minimum_screen_width);
        this.f10801f0 = resources.getDimensionPixelSize(C5421d.material_clock_size);
    }
}
