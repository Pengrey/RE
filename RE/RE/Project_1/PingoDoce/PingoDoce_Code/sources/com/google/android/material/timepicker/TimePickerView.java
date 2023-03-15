package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.C0857d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C1112b0;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import p100f8.C5423f;
import p100f8.C5425h;

/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: P */
    private final Chip f10829P;

    /* renamed from: Q */
    private final Chip f10830Q;

    /* renamed from: R */
    private final MaterialButtonToggleGroup f10831R;

    /* renamed from: S */
    private final View.OnClickListener f10832S;

    /* renamed from: T */
    private InterfaceC3806f f10833T;

    /* renamed from: U */
    private InterfaceC3807g f10834U;

    /* renamed from: V */
    private InterfaceC3805e f10835V;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    /* loaded from: classes.dex */
    class View$OnClickListenerC3801a implements View.OnClickListener {
        View$OnClickListenerC3801a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.f10834U != null) {
                TimePickerView.this.f10834U.m28814a(((Integer) view.getTag(C5423f.selection_type)).intValue());
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$b */
    /* loaded from: classes.dex */
    class C3802b implements MaterialButtonToggleGroup.InterfaceC3518d {
        C3802b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.InterfaceC3518d
        /* renamed from: a */
        public void mo28817a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
            int i2 = i == C5423f.material_clock_period_pm_button ? 1 : 0;
            if (TimePickerView.this.f10833T == null || !z) {
                return;
            }
            TimePickerView.this.f10833T.m28815a(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.timepicker.TimePickerView$c */
    /* loaded from: classes.dex */
    public class C3803c extends GestureDetector.SimpleOnGestureListener {
        C3803c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            InterfaceC3805e interfaceC3805e = TimePickerView.this.f10835V;
            if (interfaceC3805e != null) {
                interfaceC3805e.m28816a();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.timepicker.TimePickerView$d */
    /* loaded from: classes.dex */
    public class View$OnTouchListenerC3804d implements View.OnTouchListener {

        /* renamed from: w */
        final /* synthetic */ GestureDetector f10839w;

        View$OnTouchListenerC3804d(TimePickerView timePickerView, GestureDetector gestureDetector) {
            this.f10839w = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f10839w.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$e */
    /* loaded from: classes.dex */
    interface InterfaceC3805e {
        /* renamed from: a */
        void m28816a();
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$f */
    /* loaded from: classes.dex */
    interface InterfaceC3806f {
        /* renamed from: a */
        void m28815a(int i);
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$g */
    /* loaded from: classes.dex */
    interface InterfaceC3807g {
        /* renamed from: a */
        void m28814a(int i);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: x */
    private void m28820x() {
        Chip chip = this.f10829P;
        int i = C5423f.selection_type;
        chip.setTag(i, 12);
        this.f10830Q.setTag(i, 10);
        this.f10829P.setOnClickListener(this.f10832S);
        this.f10830Q.setOnClickListener(this.f10832S);
        this.f10829P.setAccessibilityClassName("android.view.View");
        this.f10830Q.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: y */
    private void m28819y() {
        View$OnTouchListenerC3804d view$OnTouchListenerC3804d = new View$OnTouchListenerC3804d(this, new GestureDetector(getContext(), new C3803c()));
        this.f10829P.setOnTouchListener(view$OnTouchListenerC3804d);
        this.f10830Q.setOnTouchListener(view$OnTouchListenerC3804d);
    }

    /* renamed from: z */
    private void m28818z() {
        if (this.f10831R.getVisibility() == 0) {
            C0857d c0857d = new C0857d();
            c0857d.m39396g(this);
            c0857d.m39398e(C5423f.material_clock_display, C1112b0.m38476E(this) == 0 ? 2 : 1);
            c0857d.m39400c(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m28818z();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            m28818z();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10832S = new View$OnClickListenerC3801a();
        LayoutInflater.from(context).inflate(C5425h.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(C5423f.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C5423f.material_clock_period_toggle);
        this.f10831R = materialButtonToggleGroup;
        materialButtonToggleGroup.m30294b(new C3802b());
        this.f10829P = (Chip) findViewById(C5423f.material_minute_tv);
        this.f10830Q = (Chip) findViewById(C5423f.material_hour_tv);
        ClockHandView clockHandView = (ClockHandView) findViewById(C5423f.material_clock_hand);
        m28819y();
        m28820x();
    }
}
