package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.C1112b0;
import androidx.core.view.accessibility.C1085c;
import com.google.android.material.internal.C3645m;
import com.google.android.material.textfield.TextInputLayout;
import p100f8.C5419b;
import p100f8.C5421d;
import p100f8.C5422e;
import p100f8.C5427j;
import p120g8.C5616a;
import p198k8.C6608a;
import p401v8.C11141g;
import p401v8.C11148k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.d */
/* loaded from: classes.dex */
public class C3763d extends AbstractC3777e {

    /* renamed from: r */
    private static final boolean f10703r;

    /* renamed from: e */
    private final TextWatcher f10704e;

    /* renamed from: f */
    private final View.OnFocusChangeListener f10705f;

    /* renamed from: g */
    private final TextInputLayout.C3747e f10706g;

    /* renamed from: h */
    private final TextInputLayout.InterfaceC3748f f10707h;
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: i */
    private final TextInputLayout.InterfaceC3749g f10708i;

    /* renamed from: j */
    private boolean f10709j;

    /* renamed from: k */
    private boolean f10710k;

    /* renamed from: l */
    private long f10711l;

    /* renamed from: m */
    private StateListDrawable f10712m;

    /* renamed from: n */
    private C11141g f10713n;

    /* renamed from: o */
    private AccessibilityManager f10714o;

    /* renamed from: p */
    private ValueAnimator f10715p;

    /* renamed from: q */
    private ValueAnimator f10716q;

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$a */
    /* loaded from: classes.dex */
    class C3764a extends C3645m {

        /* compiled from: DropdownMenuEndIconDelegate.java */
        /* renamed from: com.google.android.material.textfield.d$a$a */
        /* loaded from: classes.dex */
        class RunnableC3765a implements Runnable {

            /* renamed from: w */
            final /* synthetic */ AutoCompleteTextView f10718w;

            RunnableC3765a(AutoCompleteTextView autoCompleteTextView) {
                this.f10718w = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f10718w.isPopupShowing();
                C3763d.this.m28983E(isPopupShowing);
                C3763d.this.f10709j = isPopupShowing;
            }
        }

        C3764a() {
        }

        @Override // com.google.android.material.internal.C3645m, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView m28957y = C3763d.m28957y(C3763d.this.f10733a.getEditText());
            if (C3763d.this.f10714o.isTouchExplorationEnabled() && C3763d.m28984D(m28957y) && !C3763d.this.f10735c.hasFocus()) {
                m28957y.dismissDropDown();
            }
            m28957y.post(new RunnableC3765a(m28957y));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$b */
    /* loaded from: classes.dex */
    public class C3766b extends AnimatorListenerAdapter {
        C3766b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C3763d c3763d = C3763d.this;
            c3763d.f10735c.setChecked(c3763d.f10710k);
            C3763d.this.f10716q.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$c */
    /* loaded from: classes.dex */
    public class C3767c implements ValueAnimator.AnimatorUpdateListener {
        C3767c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C3763d.this.f10735c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$d */
    /* loaded from: classes.dex */
    class View$OnFocusChangeListenerC3768d implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC3768d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            C3763d.this.f10733a.setEndIconActivated(z);
            if (z) {
                return;
            }
            C3763d.this.m28983E(false);
            C3763d.this.f10709j = false;
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$e */
    /* loaded from: classes.dex */
    class C3769e extends TextInputLayout.C3747e {
        C3769e(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.C3747e, androidx.core.view.C1078a
        /* renamed from: g */
        public void mo19280g(View view, C1085c c1085c) {
            super.mo19280g(view, c1085c);
            if (!C3763d.m28984D(C3763d.this.f10733a.getEditText())) {
                c1085c.m38562a0(Spinner.class.getName());
            }
            if (c1085c.m38577M()) {
                c1085c.m38536n0(null);
            }
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: h */
        public void mo28955h(View view, AccessibilityEvent accessibilityEvent) {
            super.mo28955h(view, accessibilityEvent);
            AutoCompleteTextView m28957y = C3763d.m28957y(C3763d.this.f10733a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C3763d.this.f10714o.isEnabled() && !C3763d.m28984D(C3763d.this.f10733a.getEditText())) {
                C3763d.this.m28980H(m28957y);
                C3763d.this.m28979I();
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$f */
    /* loaded from: classes.dex */
    class C3770f implements TextInputLayout.InterfaceC3748f {
        C3770f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC3748f
        /* renamed from: a */
        public void mo28892a(TextInputLayout textInputLayout) {
            AutoCompleteTextView m28957y = C3763d.m28957y(textInputLayout.getEditText());
            C3763d.this.m28982F(m28957y);
            C3763d.this.m28960v(m28957y);
            C3763d.this.m28981G(m28957y);
            m28957y.setThreshold(0);
            m28957y.removeTextChangedListener(C3763d.this.f10704e);
            m28957y.addTextChangedListener(C3763d.this.f10704e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!C3763d.m28984D(m28957y) && C3763d.this.f10714o.isTouchExplorationEnabled()) {
                C1112b0.m38479C0(C3763d.this.f10735c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(C3763d.this.f10706g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$g */
    /* loaded from: classes.dex */
    class C3771g implements TextInputLayout.InterfaceC3749g {

        /* compiled from: DropdownMenuEndIconDelegate.java */
        /* renamed from: com.google.android.material.textfield.d$g$a */
        /* loaded from: classes.dex */
        class RunnableC3772a implements Runnable {

            /* renamed from: w */
            final /* synthetic */ AutoCompleteTextView f10726w;

            RunnableC3772a(AutoCompleteTextView autoCompleteTextView) {
                this.f10726w = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f10726w.removeTextChangedListener(C3763d.this.f10704e);
            }
        }

        C3771g() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC3749g
        /* renamed from: a */
        public void mo28891a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i != 3) {
                return;
            }
            autoCompleteTextView.post(new RunnableC3772a(autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == C3763d.this.f10705f) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            if (C3763d.f10703r) {
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$h */
    /* loaded from: classes.dex */
    class View$OnClickListenerC3773h implements View.OnClickListener {
        View$OnClickListenerC3773h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C3763d.this.m28980H((AutoCompleteTextView) C3763d.this.f10733a.getEditText());
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$i  reason: invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name */
    /* loaded from: classes.dex */
    class accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC3774i implements AccessibilityManager.TouchExplorationStateChangeListener {
        accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC3774i() {
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            if (C3763d.this.f10733a.getEditText() == null || C3763d.m28984D(C3763d.this.f10733a.getEditText())) {
                return;
            }
            C1112b0.m38479C0(C3763d.this.f10735c, z ? 2 : 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$j */
    /* loaded from: classes.dex */
    public class View$OnTouchListenerC3775j implements View.OnTouchListener {

        /* renamed from: w */
        final /* synthetic */ AutoCompleteTextView f10730w;

        View$OnTouchListenerC3775j(AutoCompleteTextView autoCompleteTextView) {
            this.f10730w = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C3763d.this.m28985C()) {
                    C3763d.this.f10709j = false;
                }
                C3763d.this.m28980H(this.f10730w);
                C3763d.this.m28979I();
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$k */
    /* loaded from: classes.dex */
    public class C3776k implements AutoCompleteTextView.OnDismissListener {
        C3776k() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            C3763d.this.m28979I();
            C3763d.this.m28983E(false);
        }
    }

    static {
        f10703r = Build.VERSION.SDK_INT >= 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3763d(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.f10704e = new C3764a();
        this.f10705f = new View$OnFocusChangeListenerC3768d();
        this.f10706g = new C3769e(this.f10733a);
        this.f10707h = new C3770f();
        this.f10708i = new C3771g();
        this.f10709j = false;
        this.f10710k = false;
        this.f10711l = Long.MAX_VALUE;
    }

    /* renamed from: A */
    private C11141g m28987A(float f, float f2, float f3, int i) {
        C11148k m5914m = C11148k.m5957a().m5932A(f).m5928E(f).m5908s(f2).m5904w(f2).m5914m();
        C11141g m5980m = C11141g.m5980m(this.f10734b, f3);
        m5980m.setShapeAppearanceModel(m5914m);
        m5980m.m6001b0(0, i, 0, i);
        return m5980m;
    }

    /* renamed from: B */
    private void m28986B() {
        this.f10716q = m28956z(67, 0.0f, 1.0f);
        ValueAnimator m28956z = m28956z(50, 1.0f, 0.0f);
        this.f10715p = m28956z;
        m28956z.addListener(new C3766b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public boolean m28985C() {
        long currentTimeMillis = System.currentTimeMillis() - this.f10711l;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static boolean m28984D(EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public void m28983E(boolean z) {
        if (this.f10710k != z) {
            this.f10710k = z;
            this.f10716q.cancel();
            this.f10715p.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public void m28982F(AutoCompleteTextView autoCompleteTextView) {
        if (f10703r) {
            int boxBackgroundMode = this.f10733a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f10713n);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f10712m);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: G */
    public void m28981G(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new View$OnTouchListenerC3775j(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f10705f);
        if (f10703r) {
            autoCompleteTextView.setOnDismissListener(new C3776k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public void m28980H(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (m28985C()) {
            this.f10709j = false;
        }
        if (!this.f10709j) {
            if (f10703r) {
                m28983E(!this.f10710k);
            } else {
                this.f10710k = !this.f10710k;
                this.f10735c.toggle();
            }
            if (this.f10710k) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            }
            autoCompleteTextView.dismissDropDown();
            return;
        }
        this.f10709j = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public void m28979I() {
        this.f10709j = true;
        this.f10711l = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m28960v(AutoCompleteTextView autoCompleteTextView) {
        if (m28984D(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.f10733a.getBoxBackgroundMode();
        C11141g boxBackground = this.f10733a.getBoxBackground();
        int m20504d = C6608a.m20504d(autoCompleteTextView, C5419b.f14887l);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        if (boxBackgroundMode == 2) {
            m28958x(autoCompleteTextView, m20504d, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            m28959w(autoCompleteTextView, m20504d, iArr, boxBackground);
        }
    }

    /* renamed from: w */
    private void m28959w(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C11141g c11141g) {
        int boxBackgroundColor = this.f10733a.getBoxBackgroundColor();
        int[] iArr2 = {C6608a.m20500h(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f10703r) {
            C1112b0.m38399v0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), c11141g, c11141g));
            return;
        }
        C11141g c11141g2 = new C11141g(c11141g.m6025E());
        c11141g2.m6004Z(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c11141g, c11141g2});
        int m38466J = C1112b0.m38466J(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int m38468I = C1112b0.m38468I(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        C1112b0.m38399v0(autoCompleteTextView, layerDrawable);
        C1112b0.m38473F0(autoCompleteTextView, m38466J, paddingTop, m38468I, paddingBottom);
    }

    /* renamed from: x */
    private void m28958x(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C11141g c11141g) {
        LayerDrawable layerDrawable;
        int m20504d = C6608a.m20504d(autoCompleteTextView, C5419b.colorSurface);
        C11141g c11141g2 = new C11141g(c11141g.m6025E());
        int m20500h = C6608a.m20500h(i, m20504d, 0.1f);
        c11141g2.m6004Z(new ColorStateList(iArr, new int[]{m20500h, 0}));
        if (f10703r) {
            c11141g2.setTint(m20504d);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{m20500h, m20504d});
            C11141g c11141g3 = new C11141g(c11141g.m6025E());
            c11141g3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c11141g2, c11141g3), c11141g});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{c11141g2, c11141g});
        }
        C1112b0.m38399v0(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static AutoCompleteTextView m28957y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: z */
    private ValueAnimator m28956z(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C5616a.f15853a);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new C3767c());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m28978J(AutoCompleteTextView autoCompleteTextView) {
        if (!m28984D(autoCompleteTextView) && this.f10733a.getBoxBackgroundMode() == 2 && (autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
            m28960v(autoCompleteTextView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC3777e
    /* renamed from: a */
    public void mo28897a() {
        float dimensionPixelOffset = this.f10734b.getResources().getDimensionPixelOffset(C5421d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f10734b.getResources().getDimensionPixelOffset(C5421d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f10734b.getResources().getDimensionPixelOffset(C5421d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C11141g m28987A = m28987A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C11141g m28987A2 = m28987A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f10713n = m28987A;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f10712m = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, m28987A);
        this.f10712m.addState(new int[0], m28987A2);
        int i = this.f10736d;
        if (i == 0) {
            i = f10703r ? C5422e.mtrl_dropdown_arrow : C5422e.mtrl_ic_arrow_drop_down;
        }
        this.f10733a.setEndIconDrawable(i);
        TextInputLayout textInputLayout = this.f10733a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C5427j.exposed_dropdown_menu_content_description));
        this.f10733a.setEndIconOnClickListener(new View$OnClickListenerC3773h());
        this.f10733a.m29044g(this.f10707h);
        this.f10733a.m29042h(this.f10708i);
        m28986B();
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f10734b.getSystemService("accessibility");
        this.f10714o = accessibilityManager;
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityManager.addTouchExplorationStateChangeListener(new accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC3774i());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC3777e
    /* renamed from: b */
    public boolean mo28954b(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC3777e
    /* renamed from: d */
    public boolean mo28952d() {
        return true;
    }
}
