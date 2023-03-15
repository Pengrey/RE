package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0456b0;
import androidx.appcompat.widget.C0484i;
import androidx.core.content.C0928a;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.text.C1047a;
import androidx.core.view.C1078a;
import androidx.core.view.C1112b0;
import androidx.core.view.C1170i;
import androidx.core.view.accessibility.C1085c;
import androidx.core.widget.C1240i;
import androidx.customview.view.AbsSavedState;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.material.internal.C3625b;
import com.google.android.material.internal.C3628c;
import com.google.android.material.internal.C3649p;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p039c3.C2010d;
import p039c3.C2046o;
import p100f8.C5419b;
import p100f8.C5421d;
import p100f8.C5423f;
import p100f8.C5427j;
import p100f8.C5428k;
import p111g.C5586a;
import p120g8.C5616a;
import p198k8.C6608a;
import p354s8.C10086c;
import p401v8.C11141g;
import p401v8.C11148k;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: e1 */
    private static final int f10590e1 = C5428k.Widget_Design_TextInputLayout;

    /* renamed from: A */
    EditText f10591A;

    /* renamed from: A0 */
    private final CheckableImageButton f10592A0;

    /* renamed from: B */
    private CharSequence f10593B;

    /* renamed from: B0 */
    private final LinkedHashSet<InterfaceC3749g> f10594B0;

    /* renamed from: C */
    private int f10595C;

    /* renamed from: C0 */
    private ColorStateList f10596C0;

    /* renamed from: D */
    private int f10597D;

    /* renamed from: D0 */
    private PorterDuff.Mode f10598D0;

    /* renamed from: E */
    private int f10599E;

    /* renamed from: E0 */
    private Drawable f10600E0;

    /* renamed from: F */
    private int f10601F;

    /* renamed from: F0 */
    private int f10602F0;

    /* renamed from: G */
    private final C3779g f10603G;

    /* renamed from: G0 */
    private Drawable f10604G0;

    /* renamed from: H */
    boolean f10605H;

    /* renamed from: H0 */
    private View.OnLongClickListener f10606H0;

    /* renamed from: I */
    private int f10607I;

    /* renamed from: I0 */
    private View.OnLongClickListener f10608I0;

    /* renamed from: J */
    private boolean f10609J;

    /* renamed from: J0 */
    private final CheckableImageButton f10610J0;

    /* renamed from: K */
    private TextView f10611K;

    /* renamed from: K0 */
    private ColorStateList f10612K0;

    /* renamed from: L */
    private int f10613L;

    /* renamed from: L0 */
    private PorterDuff.Mode f10614L0;

    /* renamed from: M */
    private int f10615M;

    /* renamed from: M0 */
    private ColorStateList f10616M0;

    /* renamed from: N */
    private CharSequence f10617N;

    /* renamed from: N0 */
    private ColorStateList f10618N0;

    /* renamed from: O */
    private boolean f10619O;

    /* renamed from: O0 */
    private int f10620O0;

    /* renamed from: P */
    private TextView f10621P;

    /* renamed from: P0 */
    private int f10622P0;

    /* renamed from: Q */
    private ColorStateList f10623Q;

    /* renamed from: Q0 */
    private int f10624Q0;

    /* renamed from: R */
    private int f10625R;

    /* renamed from: R0 */
    private ColorStateList f10626R0;

    /* renamed from: S */
    private C2010d f10627S;

    /* renamed from: S0 */
    private int f10628S0;

    /* renamed from: T */
    private C2010d f10629T;

    /* renamed from: T0 */
    private int f10630T0;

    /* renamed from: U */
    private ColorStateList f10631U;

    /* renamed from: U0 */
    private int f10632U0;

    /* renamed from: V */
    private ColorStateList f10633V;

    /* renamed from: V0 */
    private int f10634V0;

    /* renamed from: W */
    private CharSequence f10635W;

    /* renamed from: W0 */
    private int f10636W0;

    /* renamed from: X0 */
    private boolean f10637X0;

    /* renamed from: Y0 */
    final C3625b f10638Y0;

    /* renamed from: Z0 */
    private boolean f10639Z0;

    /* renamed from: a0 */
    private final TextView f10640a0;

    /* renamed from: a1 */
    private boolean f10641a1;

    /* renamed from: b0 */
    private boolean f10642b0;

    /* renamed from: b1 */
    private ValueAnimator f10643b1;

    /* renamed from: c0 */
    private CharSequence f10644c0;

    /* renamed from: c1 */
    private boolean f10645c1;

    /* renamed from: d0 */
    private boolean f10646d0;

    /* renamed from: d1 */
    private boolean f10647d1;

    /* renamed from: e0 */
    private C11141g f10648e0;

    /* renamed from: f0 */
    private C11141g f10649f0;

    /* renamed from: g0 */
    private C11141g f10650g0;

    /* renamed from: h0 */
    private C11148k f10651h0;

    /* renamed from: i0 */
    private boolean f10652i0;

    /* renamed from: j0 */
    private final int f10653j0;

    /* renamed from: k0 */
    private int f10654k0;

    /* renamed from: l0 */
    private int f10655l0;

    /* renamed from: m0 */
    private int f10656m0;

    /* renamed from: n0 */
    private int f10657n0;

    /* renamed from: o0 */
    private int f10658o0;

    /* renamed from: p0 */
    private int f10659p0;

    /* renamed from: q0 */
    private int f10660q0;

    /* renamed from: r0 */
    private final Rect f10661r0;

    /* renamed from: s0 */
    private final Rect f10662s0;

    /* renamed from: t0 */
    private final RectF f10663t0;

    /* renamed from: u0 */
    private Typeface f10664u0;

    /* renamed from: v0 */
    private Drawable f10665v0;

    /* renamed from: w */
    private final FrameLayout f10666w;

    /* renamed from: w0 */
    private int f10667w0;

    /* renamed from: x */
    private final C3791k f10668x;

    /* renamed from: x0 */
    private final LinkedHashSet<InterfaceC3748f> f10669x0;

    /* renamed from: y */
    private final LinearLayout f10670y;

    /* renamed from: y0 */
    private int f10671y0;

    /* renamed from: z */
    private final FrameLayout f10672z;

    /* renamed from: z0 */
    private final SparseArray<AbstractC3777e> f10673z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3742a();

        /* renamed from: A */
        CharSequence f10674A;

        /* renamed from: B */
        CharSequence f10675B;

        /* renamed from: C */
        CharSequence f10676C;

        /* renamed from: y */
        CharSequence f10677y;

        /* renamed from: z */
        boolean f10678z;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$a */
        /* loaded from: classes.dex */
        class C3742a implements Parcelable.ClassLoaderCreator<SavedState> {
            C3742a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState mo29004a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState mo29003b(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] mo29002c(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f10677y) + " hint=" + ((Object) this.f10674A) + " helperText=" + ((Object) this.f10675B) + " placeholderText=" + ((Object) this.f10676C) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f10677y, parcel, i);
            parcel.writeInt(this.f10678z ? 1 : 0);
            TextUtils.writeToParcel(this.f10674A, parcel, i);
            TextUtils.writeToParcel(this.f10675B, parcel, i);
            TextUtils.writeToParcel(this.f10676C, parcel, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10677y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f10678z = parcel.readInt() == 1;
            this.f10674A = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f10675B = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f10676C = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    /* loaded from: classes.dex */
    public class C3743a implements TextWatcher {
        C3743a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.m29011w0(!textInputLayout.f10647d1);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f10605H) {
                textInputLayout2.m29031m0(editable.length());
            }
            if (TextInputLayout.this.f10619O) {
                TextInputLayout.this.m29086A0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    /* loaded from: classes.dex */
    class RunnableC3744b implements Runnable {
        RunnableC3744b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f10592A0.performClick();
            TextInputLayout.this.f10592A0.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    /* loaded from: classes.dex */
    class RunnableC3745c implements Runnable {
        RunnableC3745c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f10591A.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    /* loaded from: classes.dex */
    public class C3746d implements ValueAnimator.AnimatorUpdateListener {
        C3746d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f10638Y0.m29561u0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    /* loaded from: classes.dex */
    public static class C3747e extends C1078a {

        /* renamed from: d */
        private final TextInputLayout f10683d;

        public C3747e(TextInputLayout textInputLayout) {
            this.f10683d = textInputLayout;
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: g */
        public void mo19280g(View view, C1085c c1085c) {
            View m28910s;
            super.mo19280g(view, c1085c);
            EditText editText = this.f10683d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f10683d.getHint();
            CharSequence error = this.f10683d.getError();
            CharSequence placeholderText = this.f10683d.getPlaceholderText();
            int counterMaxLength = this.f10683d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f10683d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.f10683d.m29069N();
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z2 ? hint.toString() : BuildConfig.VERSION_NAME;
            this.f10683d.f10668x.m28869v(c1085c);
            if (z) {
                c1085c.m38588G0(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                c1085c.m38588G0(charSequence);
                if (z3 && placeholderText != null) {
                    c1085c.m38588G0(charSequence + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                c1085c.m38588G0(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    c1085c.m38536n0(charSequence);
                } else {
                    if (z) {
                        charSequence = ((Object) text) + ", " + charSequence;
                    }
                    c1085c.m38588G0(charSequence);
                }
                c1085c.m38594D0(!z);
            }
            c1085c.m38528r0((text == null || text.length() != counterMaxLength) ? -1 : -1);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                c1085c.m38544j0(error);
            }
            if (Build.VERSION.SDK_INT < 17 || (m28910s = this.f10683d.f10603G.m28910s()) == null) {
                return;
            }
            c1085c.m38534o0(m28910s);
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    /* loaded from: classes.dex */
    public interface InterfaceC3748f {
        /* renamed from: a */
        void mo28892a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    /* loaded from: classes.dex */
    public interface InterfaceC3749g {
        /* renamed from: a */
        void mo28891a(TextInputLayout textInputLayout, int i);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5419b.textInputStyle);
    }

    /* renamed from: A */
    private boolean m29087A() {
        return this.f10642b0 && !TextUtils.isEmpty(this.f10644c0) && (this.f10648e0 instanceof C3762c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public void m29086A0(int i) {
        if (i == 0 && !this.f10637X0) {
            m29041h0();
        } else {
            m29073J();
        }
    }

    /* renamed from: B */
    private void m29085B() {
        Iterator<InterfaceC3748f> it = this.f10669x0.iterator();
        while (it.hasNext()) {
            it.next().mo28892a(this);
        }
    }

    /* renamed from: B0 */
    private void m29084B0(boolean z, boolean z2) {
        int defaultColor = this.f10626R0.getDefaultColor();
        int colorForState = this.f10626R0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f10626R0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f10659p0 = colorForState2;
        } else if (z2) {
            this.f10659p0 = colorForState;
        } else {
            this.f10659p0 = defaultColor;
        }
    }

    /* renamed from: C */
    private void m29083C(int i) {
        Iterator<InterfaceC3749g> it = this.f10594B0.iterator();
        while (it.hasNext()) {
            it.next().mo28891a(this, i);
        }
    }

    /* renamed from: C0 */
    private void m29082C0() {
        if (this.f10591A == null) {
            return;
        }
        C1112b0.m38473F0(this.f10640a0, getContext().getResources().getDimensionPixelSize(C5421d.material_input_text_to_prefix_suffix_padding), this.f10591A.getPaddingTop(), (m29072K() || m29071L()) ? 0 : C1112b0.m38468I(this.f10591A), this.f10591A.getPaddingBottom());
    }

    /* renamed from: D */
    private void m29081D(Canvas canvas) {
        C11141g c11141g;
        if (this.f10650g0 == null || (c11141g = this.f10649f0) == null) {
            return;
        }
        c11141g.draw(canvas);
        if (this.f10591A.isFocused()) {
            Rect bounds = this.f10650g0.getBounds();
            Rect bounds2 = this.f10649f0.getBounds();
            float m29631D = this.f10638Y0.m29631D();
            int centerX = bounds2.centerX();
            bounds.left = C5616a.m23563c(centerX, bounds2.left, m29631D);
            bounds.right = C5616a.m23563c(centerX, bounds2.right, m29631D);
            this.f10650g0.draw(canvas);
        }
    }

    /* renamed from: D0 */
    private void m29080D0() {
        int visibility = this.f10640a0.getVisibility();
        int i = (this.f10635W == null || m29069N()) ? 8 : 0;
        if (visibility != i) {
            getEndIconDelegate().mo28953c(i == 0);
        }
        m29017t0();
        this.f10640a0.setVisibility(i);
        m29023q0();
    }

    /* renamed from: E */
    private void m29079E(Canvas canvas) {
        if (this.f10642b0) {
            this.f10638Y0.m29580l(canvas);
        }
    }

    /* renamed from: F */
    private void m29077F(boolean z) {
        ValueAnimator valueAnimator = this.f10643b1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f10643b1.cancel();
        }
        if (z && this.f10641a1) {
            m29036k(0.0f);
        } else {
            this.f10638Y0.m29561u0(0.0f);
        }
        if (m29087A() && ((C3762c) this.f10648e0).m28992n0()) {
            m29010x();
        }
        this.f10637X0 = true;
        m29073J();
        this.f10668x.m28882i(true);
        m29080D0();
    }

    /* renamed from: G */
    private int m29076G(int i, boolean z) {
        int compoundPaddingLeft = i + this.f10591A.getCompoundPaddingLeft();
        return (getPrefixText() == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    /* renamed from: H */
    private int m29075H(int i, boolean z) {
        int compoundPaddingRight = i - this.f10591A.getCompoundPaddingRight();
        return (getPrefixText() == null || !z) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    /* renamed from: I */
    private boolean m29074I() {
        return this.f10671y0 != 0;
    }

    /* renamed from: J */
    private void m29073J() {
        TextView textView = this.f10621P;
        if (textView == null || !this.f10619O) {
            return;
        }
        textView.setText((CharSequence) null);
        C2046o.m34852b(this.f10666w, this.f10629T);
        this.f10621P.setVisibility(4);
    }

    /* renamed from: L */
    private boolean m29071L() {
        return this.f10610J0.getVisibility() == 0;
    }

    /* renamed from: P */
    private boolean m29067P() {
        return this.f10654k0 == 1 && (Build.VERSION.SDK_INT < 16 || this.f10591A.getMinLines() <= 1);
    }

    /* renamed from: Q */
    private void m29066Q() {
        m29028o();
        m29057Z();
        m29078E0();
        m29037j0();
        m29038j();
        if (this.f10654k0 != 0) {
            m29013v0();
        }
    }

    /* renamed from: R */
    private void m29065R() {
        if (m29087A()) {
            RectF rectF = this.f10663t0;
            this.f10638Y0.m29574o(rectF, this.f10591A.getWidth(), this.f10591A.getGravity());
            m29030n(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f10656m0);
            ((C3762c) this.f10648e0).m28989q0(rectF);
        }
    }

    /* renamed from: S */
    private void m29064S() {
        if (!m29087A() || this.f10637X0) {
            return;
        }
        m29010x();
        m29065R();
    }

    /* renamed from: T */
    private static void m29063T(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m29063T((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: X */
    private void m29059X() {
        TextView textView = this.f10621P;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: Z */
    private void m29057Z() {
        if (m29043g0()) {
            C1112b0.m38399v0(this.f10591A, this.f10648e0);
        }
    }

    /* renamed from: a0 */
    private static void m29055a0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean m38451R = C1112b0.m38451R(checkableImageButton);
        boolean z = false;
        boolean z2 = onLongClickListener != null;
        if (m38451R || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(m38451R);
        checkableImageButton.setPressable(m38451R);
        checkableImageButton.setLongClickable(z2);
        C1112b0.m38479C0(checkableImageButton, z ? 1 : 2);
    }

    /* renamed from: b0 */
    private static void m29053b0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m29055a0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: c0 */
    private static void m29051c0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m29055a0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: e0 */
    private boolean m29047e0() {
        return (this.f10610J0.getVisibility() == 0 || ((m29074I() && m29072K()) || this.f10635W != null)) && this.f10670y.getMeasuredWidth() > 0;
    }

    /* renamed from: f0 */
    private boolean m29045f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f10668x.getMeasuredWidth() > 0;
    }

    /* renamed from: g0 */
    private boolean m29043g0() {
        EditText editText = this.f10591A;
        return (editText == null || this.f10648e0 == null || editText.getBackground() != null || this.f10654k0 == 0) ? false : true;
    }

    private AbstractC3777e getEndIconDelegate() {
        AbstractC3777e abstractC3777e = this.f10673z0.get(this.f10671y0);
        return abstractC3777e != null ? abstractC3777e : this.f10673z0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f10610J0.getVisibility() == 0) {
            return this.f10610J0;
        }
        if (m29074I() && m29072K()) {
            return this.f10592A0;
        }
        return null;
    }

    /* renamed from: h0 */
    private void m29041h0() {
        if (this.f10621P == null || !this.f10619O || TextUtils.isEmpty(this.f10617N)) {
            return;
        }
        this.f10621P.setText(this.f10617N);
        C2046o.m34852b(this.f10666w, this.f10627S);
        this.f10621P.setVisibility(0);
        this.f10621P.bringToFront();
        if (Build.VERSION.SDK_INT >= 16) {
            announceForAccessibility(this.f10617N);
        }
    }

    /* renamed from: i */
    private void m29040i() {
        TextView textView = this.f10621P;
        if (textView != null) {
            this.f10666w.addView(textView);
            this.f10621P.setVisibility(0);
        }
    }

    /* renamed from: i0 */
    private void m29039i0(boolean z) {
        if (z && getEndIconDrawable() != null) {
            Drawable mutate = C0981a.m38859r(getEndIconDrawable()).mutate();
            C0981a.m38863n(mutate, this.f10603G.m28913p());
            this.f10592A0.setImageDrawable(mutate);
            return;
        }
        C3778f.m28951a(this, this.f10592A0, this.f10596C0, this.f10598D0);
    }

    /* renamed from: j */
    private void m29038j() {
        if (this.f10591A == null || this.f10654k0 != 1) {
            return;
        }
        if (C10086c.m9220j(getContext())) {
            EditText editText = this.f10591A;
            C1112b0.m38473F0(editText, C1112b0.m38466J(editText), getResources().getDimensionPixelSize(C5421d.material_filled_edittext_font_2_0_padding_top), C1112b0.m38468I(this.f10591A), getResources().getDimensionPixelSize(C5421d.material_filled_edittext_font_2_0_padding_bottom));
        } else if (C10086c.m9221i(getContext())) {
            EditText editText2 = this.f10591A;
            C1112b0.m38473F0(editText2, C1112b0.m38466J(editText2), getResources().getDimensionPixelSize(C5421d.material_filled_edittext_font_1_3_padding_top), C1112b0.m38468I(this.f10591A), getResources().getDimensionPixelSize(C5421d.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    /* renamed from: j0 */
    private void m29037j0() {
        if (this.f10654k0 == 1) {
            if (C10086c.m9220j(getContext())) {
                this.f10655l0 = getResources().getDimensionPixelSize(C5421d.material_font_2_0_box_collapsed_padding_top);
            } else if (C10086c.m9221i(getContext())) {
                this.f10655l0 = getResources().getDimensionPixelSize(C5421d.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    /* renamed from: k0 */
    private void m29035k0(Rect rect) {
        C11141g c11141g = this.f10649f0;
        if (c11141g != null) {
            int i = rect.bottom;
            c11141g.setBounds(rect.left, i - this.f10657n0, rect.right, i);
        }
        C11141g c11141g2 = this.f10650g0;
        if (c11141g2 != null) {
            int i2 = rect.bottom;
            c11141g2.setBounds(rect.left, i2 - this.f10658o0, rect.right, i2);
        }
    }

    /* renamed from: l */
    private void m29034l() {
        C11141g c11141g = this.f10648e0;
        if (c11141g == null) {
            return;
        }
        C11148k m6025E = c11141g.m6025E();
        C11148k c11148k = this.f10651h0;
        if (m6025E != c11148k) {
            this.f10648e0.setShapeAppearanceModel(c11148k);
            m29025p0();
        }
        if (m29014v()) {
            this.f10648e0.m5991g0(this.f10656m0, this.f10659p0);
        }
        int m29026p = m29026p();
        this.f10660q0 = m29026p;
        this.f10648e0.m6004Z(ColorStateList.valueOf(m29026p));
        if (this.f10671y0 == 3) {
            this.f10591A.getBackground().invalidateSelf();
        }
        m29032m();
        invalidate();
    }

    /* renamed from: l0 */
    private void m29033l0() {
        if (this.f10611K != null) {
            EditText editText = this.f10591A;
            m29031m0(editText == null ? 0 : editText.getText().length());
        }
    }

    /* renamed from: m */
    private void m29032m() {
        ColorStateList valueOf;
        if (this.f10649f0 == null || this.f10650g0 == null) {
            return;
        }
        if (m29012w()) {
            C11141g c11141g = this.f10649f0;
            if (this.f10591A.isFocused()) {
                valueOf = ColorStateList.valueOf(this.f10620O0);
            } else {
                valueOf = ColorStateList.valueOf(this.f10659p0);
            }
            c11141g.m6004Z(valueOf);
            this.f10650g0.m6004Z(ColorStateList.valueOf(this.f10659p0));
        }
        invalidate();
    }

    /* renamed from: n */
    private void m29030n(RectF rectF) {
        float f = rectF.left;
        int i = this.f10653j0;
        rectF.left = f - i;
        rectF.right += i;
    }

    /* renamed from: n0 */
    private static void m29029n0(Context context, TextView textView, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = C5427j.character_counter_overflowed_content_description;
        } else {
            i3 = C5427j.character_counter_content_description;
        }
        textView.setContentDescription(context.getString(i3, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* renamed from: o */
    private void m29028o() {
        int i = this.f10654k0;
        if (i == 0) {
            this.f10648e0 = null;
            this.f10649f0 = null;
            this.f10650g0 = null;
        } else if (i == 1) {
            this.f10648e0 = new C11141g(this.f10651h0);
            this.f10649f0 = new C11141g();
            this.f10650g0 = new C11141g();
        } else if (i == 2) {
            if (this.f10642b0 && !(this.f10648e0 instanceof C3762c)) {
                this.f10648e0 = new C3762c(this.f10651h0);
            } else {
                this.f10648e0 = new C11141g(this.f10651h0);
            }
            this.f10649f0 = null;
            this.f10650g0 = null;
        } else {
            throw new IllegalArgumentException(this.f10654k0 + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    /* renamed from: o0 */
    private void m29027o0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f10611K;
        if (textView != null) {
            m29049d0(textView, this.f10609J ? this.f10613L : this.f10615M);
            if (!this.f10609J && (colorStateList2 = this.f10631U) != null) {
                this.f10611K.setTextColor(colorStateList2);
            }
            if (!this.f10609J || (colorStateList = this.f10633V) == null) {
                return;
            }
            this.f10611K.setTextColor(colorStateList);
        }
    }

    /* renamed from: p */
    private int m29026p() {
        return this.f10654k0 == 1 ? C6608a.m20501g(C6608a.m20503e(this, C5419b.colorSurface, 0), this.f10660q0) : this.f10660q0;
    }

    /* renamed from: p0 */
    private void m29025p0() {
        if (this.f10671y0 == 3 && this.f10654k0 == 2) {
            ((C3763d) this.f10673z0.get(3)).m28978J((AutoCompleteTextView) this.f10591A);
        }
    }

    /* renamed from: q */
    private Rect m29024q(Rect rect) {
        if (this.f10591A != null) {
            Rect rect2 = this.f10662s0;
            boolean m29488e = C3649p.m29488e(this);
            rect2.bottom = rect.bottom;
            int i = this.f10654k0;
            if (i == 1) {
                rect2.left = m29076G(rect.left, m29488e);
                rect2.top = rect.top + this.f10655l0;
                rect2.right = m29075H(rect.right, m29488e);
                return rect2;
            } else if (i != 2) {
                rect2.left = m29076G(rect.left, m29488e);
                rect2.top = getPaddingTop();
                rect2.right = m29075H(rect.right, m29488e);
                return rect2;
            } else {
                rect2.left = rect.left + this.f10591A.getPaddingLeft();
                rect2.top = rect.top - m29016u();
                rect2.right = rect.right - this.f10591A.getPaddingRight();
                return rect2;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: r */
    private int m29022r(Rect rect, Rect rect2, float f) {
        if (m29067P()) {
            return (int) (rect2.top + f);
        }
        return rect.bottom - this.f10591A.getCompoundPaddingBottom();
    }

    /* renamed from: s */
    private int m29020s(Rect rect, float f) {
        if (m29067P()) {
            return (int) (rect.centerY() - (f / 2.0f));
        }
        return rect.top + this.f10591A.getCompoundPaddingTop();
    }

    /* renamed from: s0 */
    private boolean m29019s0() {
        int max;
        if (this.f10591A != null && this.f10591A.getMeasuredHeight() < (max = Math.max(this.f10670y.getMeasuredHeight(), this.f10668x.getMeasuredHeight()))) {
            this.f10591A.setMinimumHeight(max);
            return true;
        }
        return false;
    }

    private void setEditText(EditText editText) {
        if (this.f10591A == null) {
            if (this.f10671y0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f10591A = editText;
            int i = this.f10595C;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.f10599E);
            }
            int i2 = this.f10597D;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.f10601F);
            }
            m29066Q();
            setTextInputAccessibilityDelegate(new C3747e(this));
            this.f10638Y0.m29622H0(this.f10591A.getTypeface());
            this.f10638Y0.m29567r0(this.f10591A.getTextSize());
            if (Build.VERSION.SDK_INT >= 21) {
                this.f10638Y0.m29577m0(this.f10591A.getLetterSpacing());
            }
            int gravity = this.f10591A.getGravity();
            this.f10638Y0.m29589g0((gravity & (-113)) | 48);
            this.f10638Y0.m29569q0(gravity);
            this.f10591A.addTextChangedListener(new C3743a());
            if (this.f10616M0 == null) {
                this.f10616M0 = this.f10591A.getHintTextColors();
            }
            if (this.f10642b0) {
                if (TextUtils.isEmpty(this.f10644c0)) {
                    CharSequence hint = this.f10591A.getHint();
                    this.f10593B = hint;
                    setHint(hint);
                    this.f10591A.setHint((CharSequence) null);
                }
                this.f10646d0 = true;
            }
            if (this.f10611K != null) {
                m29031m0(this.f10591A.getText().length());
            }
            m29021r0();
            this.f10603G.m28923f();
            this.f10668x.bringToFront();
            this.f10670y.bringToFront();
            this.f10672z.bringToFront();
            this.f10610J0.bringToFront();
            m29085B();
            m29082C0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            m29009x0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f10644c0)) {
            return;
        }
        this.f10644c0 = charSequence;
        this.f10638Y0.m29626F0(charSequence);
        if (this.f10637X0) {
            return;
        }
        m29065R();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f10619O == z) {
            return;
        }
        if (z) {
            m29040i();
        } else {
            m29059X();
            this.f10621P = null;
        }
        this.f10619O = z;
    }

    /* renamed from: t */
    private Rect m29018t(Rect rect) {
        if (this.f10591A != null) {
            Rect rect2 = this.f10662s0;
            float m29635B = this.f10638Y0.m29635B();
            rect2.left = rect.left + this.f10591A.getCompoundPaddingLeft();
            rect2.top = m29020s(rect, m29635B);
            rect2.right = rect.right - this.f10591A.getCompoundPaddingRight();
            rect2.bottom = m29022r(rect, rect2, m29635B);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: t0 */
    private void m29017t0() {
        this.f10672z.setVisibility((this.f10592A0.getVisibility() != 0 || m29071L()) ? 8 : 0);
        this.f10670y.setVisibility(m29072K() || m29071L() || !((this.f10635W == null || m29069N()) ? true : false) ? 0 : 8);
    }

    /* renamed from: u */
    private int m29016u() {
        float m29568r;
        if (this.f10642b0) {
            int i = this.f10654k0;
            if (i == 0) {
                m29568r = this.f10638Y0.m29568r();
            } else if (i != 2) {
                return 0;
            } else {
                m29568r = this.f10638Y0.m29568r() / 2.0f;
            }
            return (int) m29568r;
        }
        return 0;
    }

    /* renamed from: u0 */
    private void m29015u0() {
        this.f10610J0.setVisibility(getErrorIconDrawable() != null && this.f10603G.m28903z() && this.f10603G.m28917l() ? 0 : 8);
        m29017t0();
        m29082C0();
        if (m29074I()) {
            return;
        }
        m29023q0();
    }

    /* renamed from: v */
    private boolean m29014v() {
        return this.f10654k0 == 2 && m29012w();
    }

    /* renamed from: v0 */
    private void m29013v0() {
        if (this.f10654k0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f10666w.getLayoutParams();
            int m29016u = m29016u();
            if (m29016u != layoutParams.topMargin) {
                layoutParams.topMargin = m29016u;
                this.f10666w.requestLayout();
            }
        }
    }

    /* renamed from: w */
    private boolean m29012w() {
        return this.f10656m0 > -1 && this.f10659p0 != 0;
    }

    /* renamed from: x */
    private void m29010x() {
        if (m29087A()) {
            ((C3762c) this.f10648e0).m28991o0();
        }
    }

    /* renamed from: x0 */
    private void m29009x0(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        int i;
        boolean isEnabled = isEnabled();
        EditText editText = this.f10591A;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f10591A;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean m28917l = this.f10603G.m28917l();
        ColorStateList colorStateList2 = this.f10616M0;
        if (colorStateList2 != null) {
            this.f10638Y0.m29591f0(colorStateList2);
            this.f10638Y0.m29571p0(this.f10616M0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f10616M0;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, this.f10636W0);
            } else {
                i = this.f10636W0;
            }
            this.f10638Y0.m29591f0(ColorStateList.valueOf(i));
            this.f10638Y0.m29571p0(ColorStateList.valueOf(i));
        } else if (m28917l) {
            this.f10638Y0.m29591f0(this.f10603G.m28912q());
        } else if (this.f10609J && (textView = this.f10611K) != null) {
            this.f10638Y0.m29591f0(textView.getTextColors());
        } else if (z4 && (colorStateList = this.f10618N0) != null) {
            this.f10638Y0.m29591f0(colorStateList);
        }
        if (!z3 && this.f10639Z0 && (!isEnabled() || !z4)) {
            if (z2 || !this.f10637X0) {
                m29077F(z);
            }
        } else if (z2 || this.f10637X0) {
            m29008y(z);
        }
    }

    /* renamed from: y */
    private void m29008y(boolean z) {
        ValueAnimator valueAnimator = this.f10643b1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f10643b1.cancel();
        }
        if (z && this.f10641a1) {
            m29036k(1.0f);
        } else {
            this.f10638Y0.m29561u0(1.0f);
        }
        this.f10637X0 = false;
        if (m29087A()) {
            m29065R();
        }
        m29005z0();
        this.f10668x.m28882i(false);
        m29080D0();
    }

    /* renamed from: y0 */
    private void m29007y0() {
        EditText editText;
        if (this.f10621P == null || (editText = this.f10591A) == null) {
            return;
        }
        this.f10621P.setGravity(editText.getGravity());
        this.f10621P.setPadding(this.f10591A.getCompoundPaddingLeft(), this.f10591A.getCompoundPaddingTop(), this.f10591A.getCompoundPaddingRight(), this.f10591A.getCompoundPaddingBottom());
    }

    /* renamed from: z */
    private C2010d m29006z() {
        C2010d c2010d = new C2010d();
        c2010d.mo34842Y(87L);
        c2010d.mo34839a0(C5616a.f15853a);
        return c2010d;
    }

    /* renamed from: z0 */
    private void m29005z0() {
        EditText editText = this.f10591A;
        m29086A0(editText == null ? 0 : editText.getText().length());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void m29078E0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f10648e0 == null || this.f10654k0 == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f10591A) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f10591A) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.f10659p0 = this.f10636W0;
        } else if (this.f10603G.m28917l()) {
            if (this.f10626R0 != null) {
                m29084B0(z2, z);
            } else {
                this.f10659p0 = this.f10603G.m28913p();
            }
        } else if (!this.f10609J || (textView = this.f10611K) == null) {
            if (z2) {
                this.f10659p0 = this.f10624Q0;
            } else if (z) {
                this.f10659p0 = this.f10622P0;
            } else {
                this.f10659p0 = this.f10620O0;
            }
        } else if (this.f10626R0 != null) {
            m29084B0(z2, z);
        } else {
            this.f10659p0 = textView.getCurrentTextColor();
        }
        m29015u0();
        m29061V();
        m29060W();
        m29062U();
        if (getEndIconDelegate().mo28952d()) {
            m29039i0(this.f10603G.m28917l());
        }
        if (this.f10654k0 == 2) {
            int i = this.f10656m0;
            if (z2 && isEnabled()) {
                this.f10656m0 = this.f10658o0;
            } else {
                this.f10656m0 = this.f10657n0;
            }
            if (this.f10656m0 != i) {
                m29064S();
            }
        }
        if (this.f10654k0 == 1) {
            if (!isEnabled()) {
                this.f10660q0 = this.f10630T0;
            } else if (z && !z2) {
                this.f10660q0 = this.f10634V0;
            } else if (z2) {
                this.f10660q0 = this.f10632U0;
            } else {
                this.f10660q0 = this.f10628S0;
            }
        }
        m29034l();
    }

    /* renamed from: K */
    public boolean m29072K() {
        return this.f10672z.getVisibility() == 0 && this.f10592A0.getVisibility() == 0;
    }

    /* renamed from: M */
    public boolean m29070M() {
        return this.f10603G.m28945A();
    }

    /* renamed from: N */
    final boolean m29069N() {
        return this.f10637X0;
    }

    /* renamed from: O */
    public boolean m29068O() {
        return this.f10646d0;
    }

    /* renamed from: U */
    public void m29062U() {
        C3778f.m28949c(this, this.f10592A0, this.f10596C0);
    }

    /* renamed from: V */
    public void m29061V() {
        C3778f.m28949c(this, this.f10610J0, this.f10612K0);
    }

    /* renamed from: W */
    public void m29060W() {
        this.f10668x.m28881j();
    }

    /* renamed from: Y */
    public void m29058Y(float f, float f2, float f3, float f4) {
        boolean m29488e = C3649p.m29488e(this);
        this.f10652i0 = m29488e;
        float f5 = m29488e ? f2 : f;
        if (!m29488e) {
            f = f2;
        }
        float f6 = m29488e ? f4 : f3;
        if (!m29488e) {
            f3 = f4;
        }
        C11141g c11141g = this.f10648e0;
        if (c11141g != null && c11141g.m6022H() == f5 && this.f10648e0.m6021I() == f && this.f10648e0.m5973s() == f6 && this.f10648e0.m5972t() == f3) {
            return;
        }
        this.f10651h0 = this.f10651h0.m5936v().m5932A(f5).m5928E(f).m5908s(f6).m5904w(f3).m5914m();
        m29034l();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.f10666w.addView(view, layoutParams2);
            this.f10666w.setLayoutParams(layoutParams);
            m29013v0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L8;
     */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m29049d0(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            androidx.core.widget.C1240i.m37872q(r3, r4)     // Catch: java.lang.Exception -> L1a
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1a
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1a
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1a
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1a
        L18:
            r4 = 0
            r0 = r4
        L1a:
            if (r0 == 0) goto L2e
            int r4 = p100f8.C5428k.TextAppearance_AppCompat_Caption
            androidx.core.widget.C1240i.m37872q(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = p100f8.C5420c.design_error
            int r4 = androidx.core.content.C0928a.m39113d(r4, r0)
            r3.setTextColor(r4)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m29049d0(android.widget.TextView, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f10591A;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f10593B != null) {
            boolean z = this.f10646d0;
            this.f10646d0 = false;
            CharSequence hint = editText.getHint();
            this.f10591A.setHint(this.f10593B);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f10591A.setHint(hint);
                this.f10646d0 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.f10666w.getChildCount());
        for (int i2 = 0; i2 < this.f10666w.getChildCount(); i2++) {
            View childAt = this.f10666w.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f10591A) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f10647d1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f10647d1 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        m29079E(canvas);
        m29081D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f10645c1) {
            return;
        }
        boolean z = true;
        this.f10645c1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C3625b c3625b = this.f10638Y0;
        boolean m29628E0 = c3625b != null ? c3625b.m29628E0(drawableState) | false : false;
        if (this.f10591A != null) {
            if (!C1112b0.m38446W(this) || !isEnabled()) {
                z = false;
            }
            m29011w0(z);
        }
        m29021r0();
        m29078E0();
        if (m29628E0) {
            invalidate();
        }
        this.f10645c1 = false;
    }

    /* renamed from: g */
    public void m29044g(InterfaceC3748f interfaceC3748f) {
        this.f10669x0.add(interfaceC3748f);
        if (this.f10591A != null) {
            interfaceC3748f.mo28892a(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f10591A;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + m29016u();
        }
        return super.getBaseline();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11141g getBoxBackground() {
        int i = this.f10654k0;
        if (i != 1 && i != 2) {
            throw new IllegalStateException();
        }
        return this.f10648e0;
    }

    public int getBoxBackgroundColor() {
        return this.f10660q0;
    }

    public int getBoxBackgroundMode() {
        return this.f10654k0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f10655l0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (C3649p.m29488e(this)) {
            return this.f10651h0.m5948j().mo5959a(this.f10663t0);
        }
        return this.f10651h0.m5946l().mo5959a(this.f10663t0);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (C3649p.m29488e(this)) {
            return this.f10651h0.m5946l().mo5959a(this.f10663t0);
        }
        return this.f10651h0.m5948j().mo5959a(this.f10663t0);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (C3649p.m29488e(this)) {
            return this.f10651h0.m5940r().mo5959a(this.f10663t0);
        }
        return this.f10651h0.m5938t().mo5959a(this.f10663t0);
    }

    public float getBoxCornerRadiusTopStart() {
        if (C3649p.m29488e(this)) {
            return this.f10651h0.m5938t().mo5959a(this.f10663t0);
        }
        return this.f10651h0.m5940r().mo5959a(this.f10663t0);
    }

    public int getBoxStrokeColor() {
        return this.f10624Q0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f10626R0;
    }

    public int getBoxStrokeWidth() {
        return this.f10657n0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f10658o0;
    }

    public int getCounterMaxLength() {
        return this.f10607I;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f10605H && this.f10609J && (textView = this.f10611K) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f10631U;
    }

    public ColorStateList getCounterTextColor() {
        return this.f10631U;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f10616M0;
    }

    public EditText getEditText() {
        return this.f10591A;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f10592A0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f10592A0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f10671y0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f10592A0;
    }

    public CharSequence getError() {
        if (this.f10603G.m28903z()) {
            return this.f10603G.m28914o();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f10603G.m28915n();
    }

    public int getErrorCurrentTextColors() {
        return this.f10603G.m28913p();
    }

    public Drawable getErrorIconDrawable() {
        return this.f10610J0.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.f10603G.m28913p();
    }

    public CharSequence getHelperText() {
        if (this.f10603G.m28945A()) {
            return this.f10603G.m28911r();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f10603G.m28909t();
    }

    public CharSequence getHint() {
        if (this.f10642b0) {
            return this.f10644c0;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f10638Y0.m29568r();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f10638Y0.m29560v();
    }

    public ColorStateList getHintTextColor() {
        return this.f10618N0;
    }

    public int getMaxEms() {
        return this.f10597D;
    }

    public int getMaxWidth() {
        return this.f10601F;
    }

    public int getMinEms() {
        return this.f10595C;
    }

    public int getMinWidth() {
        return this.f10599E;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f10592A0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f10592A0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f10619O) {
            return this.f10617N;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f10625R;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f10623Q;
    }

    public CharSequence getPrefixText() {
        return this.f10668x.m28890a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f10668x.m28889b();
    }

    public TextView getPrefixTextView() {
        return this.f10668x.m28888c();
    }

    public CharSequence getStartIconContentDescription() {
        return this.f10668x.m28887d();
    }

    public Drawable getStartIconDrawable() {
        return this.f10668x.m28886e();
    }

    public CharSequence getSuffixText() {
        return this.f10635W;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f10640a0.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f10640a0;
    }

    public Typeface getTypeface() {
        return this.f10664u0;
    }

    /* renamed from: h */
    public void m29042h(InterfaceC3749g interfaceC3749g) {
        this.f10594B0.add(interfaceC3749g);
    }

    /* renamed from: k */
    void m29036k(float f) {
        if (this.f10638Y0.m29631D() == f) {
            return;
        }
        if (this.f10643b1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f10643b1 = valueAnimator;
            valueAnimator.setInterpolator(C5616a.f15854b);
            this.f10643b1.setDuration(167L);
            this.f10643b1.addUpdateListener(new C3746d());
        }
        this.f10643b1.setFloatValues(this.f10638Y0.m29631D(), f);
        this.f10643b1.start();
    }

    /* renamed from: m0 */
    void m29031m0(int i) {
        boolean z = this.f10609J;
        int i2 = this.f10607I;
        if (i2 == -1) {
            this.f10611K.setText(String.valueOf(i));
            this.f10611K.setContentDescription(null);
            this.f10609J = false;
        } else {
            this.f10609J = i > i2;
            m29029n0(getContext(), this.f10611K, i, this.f10607I, this.f10609J);
            if (z != this.f10609J) {
                m29027o0();
            }
            this.f10611K.setText(C1047a.m38687c().m38680j(getContext().getString(C5427j.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.f10607I))));
        }
        if (this.f10591A == null || z == this.f10609J) {
            return;
        }
        m29011w0(false);
        m29078E0();
        m29021r0();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f10638Y0.m29607V(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f10591A;
        if (editText != null) {
            Rect rect = this.f10661r0;
            C3628c.m29550a(this, editText, rect);
            m29035k0(rect);
            if (this.f10642b0) {
                this.f10638Y0.m29567r0(this.f10591A.getTextSize());
                int gravity = this.f10591A.getGravity();
                this.f10638Y0.m29589g0((gravity & (-113)) | 48);
                this.f10638Y0.m29569q0(gravity);
                this.f10638Y0.m29597c0(m29024q(rect));
                this.f10638Y0.m29579l0(m29018t(rect));
                this.f10638Y0.m29604Y();
                if (!m29087A() || this.f10637X0) {
                    return;
                }
                m29065R();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean m29019s0 = m29019s0();
        boolean m29023q0 = m29023q0();
        if (m29019s0 || m29023q0) {
            this.f10591A.post(new RunnableC3745c());
        }
        m29007y0();
        m29082C0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m37835a());
        setError(savedState.f10677y);
        if (savedState.f10678z) {
            this.f10592A0.post(new RunnableC3744b());
        }
        setHint(savedState.f10674A);
        setHelperText(savedState.f10675B);
        setPlaceholderText(savedState.f10676C);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = false;
        boolean z2 = i == 1;
        boolean z3 = this.f10652i0;
        if (z2 != z3) {
            if (z2 && !z3) {
                z = true;
            }
            float mo5959a = this.f10651h0.m5940r().mo5959a(this.f10663t0);
            float mo5959a2 = this.f10651h0.m5938t().mo5959a(this.f10663t0);
            float mo5959a3 = this.f10651h0.m5948j().mo5959a(this.f10663t0);
            float mo5959a4 = this.f10651h0.m5946l().mo5959a(this.f10663t0);
            float f = z ? mo5959a : mo5959a2;
            if (z) {
                mo5959a = mo5959a2;
            }
            float f2 = z ? mo5959a3 : mo5959a4;
            if (z) {
                mo5959a3 = mo5959a4;
            }
            m29058Y(f, mo5959a, f2, mo5959a3);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f10603G.m28917l()) {
            savedState.f10677y = getError();
        }
        savedState.f10678z = m29074I() && this.f10592A0.isChecked();
        savedState.f10674A = getHint();
        savedState.f10675B = getHelperText();
        savedState.f10676C = getPlaceholderText();
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public boolean m29023q0() {
        boolean z;
        if (this.f10591A == null) {
            return false;
        }
        boolean z2 = true;
        if (m29045f0()) {
            int measuredWidth = this.f10668x.getMeasuredWidth() - this.f10591A.getPaddingLeft();
            if (this.f10665v0 == null || this.f10667w0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f10665v0 = colorDrawable;
                this.f10667w0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] m37888a = C1240i.m37888a(this.f10591A);
            Drawable drawable = m37888a[0];
            Drawable drawable2 = this.f10665v0;
            if (drawable != drawable2) {
                C1240i.m37877l(this.f10591A, drawable2, m37888a[1], m37888a[2], m37888a[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.f10665v0 != null) {
                Drawable[] m37888a2 = C1240i.m37888a(this.f10591A);
                C1240i.m37877l(this.f10591A, null, m37888a2[1], m37888a2[2], m37888a2[3]);
                this.f10665v0 = null;
                z = true;
            }
            z = false;
        }
        if (m29047e0()) {
            int measuredWidth2 = this.f10640a0.getMeasuredWidth() - this.f10591A.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + C1170i.m38156b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] m37888a3 = C1240i.m37888a(this.f10591A);
            Drawable drawable3 = this.f10600E0;
            if (drawable3 != null && this.f10602F0 != measuredWidth2) {
                this.f10602F0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                C1240i.m37877l(this.f10591A, m37888a3[0], m37888a3[1], this.f10600E0, m37888a3[3]);
            } else {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f10600E0 = colorDrawable2;
                    this.f10602F0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = m37888a3[2];
                Drawable drawable5 = this.f10600E0;
                if (drawable4 != drawable5) {
                    this.f10604G0 = m37888a3[2];
                    C1240i.m37877l(this.f10591A, m37888a3[0], m37888a3[1], drawable5, m37888a3[3]);
                } else {
                    z2 = z;
                }
            }
        } else if (this.f10600E0 == null) {
            return z;
        } else {
            Drawable[] m37888a4 = C1240i.m37888a(this.f10591A);
            if (m37888a4[2] == this.f10600E0) {
                C1240i.m37877l(this.f10591A, m37888a4[0], m37888a4[1], this.f10604G0, m37888a4[3]);
            } else {
                z2 = z;
            }
            this.f10600E0 = null;
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r0 */
    public void m29021r0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f10591A;
        if (editText == null || this.f10654k0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (C0456b0.m40682a(background)) {
            background = background.mutate();
        }
        if (this.f10603G.m28917l()) {
            background.setColorFilter(C0484i.m40587e(this.f10603G.m28913p(), PorterDuff.Mode.SRC_IN));
        } else if (this.f10609J && (textView = this.f10611K) != null) {
            background.setColorFilter(C0484i.m40587e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            C0981a.m38874c(background);
            this.f10591A.refreshDrawableState();
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f10660q0 != i) {
            this.f10660q0 = i;
            this.f10628S0 = i;
            this.f10632U0 = i;
            this.f10634V0 = i;
            m29034l();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C0928a.m39113d(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f10628S0 = defaultColor;
        this.f10660q0 = defaultColor;
        this.f10630T0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f10632U0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f10634V0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m29034l();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f10654k0) {
            return;
        }
        this.f10654k0 = i;
        if (this.f10591A != null) {
            m29066Q();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f10655l0 = i;
    }

    public void setBoxStrokeColor(int i) {
        if (this.f10624Q0 != i) {
            this.f10624Q0 = i;
            m29078E0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f10620O0 = colorStateList.getDefaultColor();
            this.f10636W0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f10622P0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f10624Q0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f10624Q0 != colorStateList.getDefaultColor()) {
            this.f10624Q0 = colorStateList.getDefaultColor();
        }
        m29078E0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f10626R0 != colorStateList) {
            this.f10626R0 = colorStateList;
            m29078E0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f10657n0 = i;
        m29078E0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f10658o0 = i;
        m29078E0();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f10605H != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f10611K = appCompatTextView;
                appCompatTextView.setId(C5423f.textinput_counter);
                Typeface typeface = this.f10664u0;
                if (typeface != null) {
                    this.f10611K.setTypeface(typeface);
                }
                this.f10611K.setMaxLines(1);
                this.f10603G.m28924e(this.f10611K, 2);
                C1170i.m38154d((ViewGroup.MarginLayoutParams) this.f10611K.getLayoutParams(), getResources().getDimensionPixelOffset(C5421d.mtrl_textinput_counter_margin_start));
                m29027o0();
                m29033l0();
            } else {
                this.f10603G.m28944B(this.f10611K, 2);
                this.f10611K = null;
            }
            this.f10605H = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f10607I != i) {
            if (i > 0) {
                this.f10607I = i;
            } else {
                this.f10607I = -1;
            }
            if (this.f10605H) {
                m29033l0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f10613L != i) {
            this.f10613L = i;
            m29027o0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f10633V != colorStateList) {
            this.f10633V = colorStateList;
            m29027o0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f10615M != i) {
            this.f10615M = i;
            m29027o0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f10631U != colorStateList) {
            this.f10631U = colorStateList;
            m29027o0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f10616M0 = colorStateList;
        this.f10618N0 = colorStateList;
        if (this.f10591A != null) {
            m29011w0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m29063T(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f10592A0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f10592A0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C5586a.m23699b(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f10671y0;
        if (i2 == i) {
            return;
        }
        this.f10671y0 = i;
        m29083C(i2);
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo28954b(this.f10654k0)) {
            getEndIconDelegate().mo28897a();
            C3778f.m28951a(this, this.f10592A0, this.f10596C0, this.f10598D0);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f10654k0 + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m29053b0(this.f10592A0, onClickListener, this.f10606H0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10606H0 = onLongClickListener;
        m29051c0(this.f10592A0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f10596C0 != colorStateList) {
            this.f10596C0 = colorStateList;
            C3778f.m28951a(this, this.f10592A0, colorStateList, this.f10598D0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f10598D0 != mode) {
            this.f10598D0 = mode;
            C3778f.m28951a(this, this.f10592A0, this.f10596C0, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        if (m29072K() != z) {
            this.f10592A0.setVisibility(z ? 0 : 8);
            m29017t0();
            m29082C0();
            m29023q0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f10603G.m28903z()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f10603G.m28931O(charSequence);
        } else {
            this.f10603G.m28907v();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f10603G.m28942D(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f10603G.m28941E(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C5586a.m23699b(getContext(), i) : null);
        m29061V();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m29053b0(this.f10610J0, onClickListener, this.f10608I0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10608I0 = onLongClickListener;
        m29051c0(this.f10610J0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.f10612K0 != colorStateList) {
            this.f10612K0 = colorStateList;
            C3778f.m28951a(this, this.f10610J0, colorStateList, this.f10614L0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.f10614L0 != mode) {
            this.f10614L0 = mode;
            C3778f.m28951a(this, this.f10610J0, this.f10612K0, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.f10603G.m28940F(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f10603G.m28939G(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f10639Z0 != z) {
            this.f10639Z0 = z;
            m29011w0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (m29070M()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!m29070M()) {
            setHelperTextEnabled(true);
        }
        this.f10603G.m28930P(charSequence);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f10603G.m28936J(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f10603G.m28937I(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f10603G.m28938H(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f10642b0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f10641a1 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f10642b0) {
            this.f10642b0 = z;
            if (!z) {
                this.f10646d0 = false;
                if (!TextUtils.isEmpty(this.f10644c0) && TextUtils.isEmpty(this.f10591A.getHint())) {
                    this.f10591A.setHint(this.f10644c0);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f10591A.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f10644c0)) {
                        setHint(hint);
                    }
                    this.f10591A.setHint((CharSequence) null);
                }
                this.f10646d0 = true;
            }
            if (this.f10591A != null) {
                m29013v0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f10638Y0.m29595d0(i);
        this.f10618N0 = this.f10638Y0.m29572p();
        if (this.f10591A != null) {
            m29011w0(false);
            m29013v0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f10618N0 != colorStateList) {
            if (this.f10616M0 == null) {
                this.f10638Y0.m29591f0(colorStateList);
            }
            this.f10618N0 = colorStateList;
            if (this.f10591A != null) {
                m29011w0(false);
            }
        }
    }

    public void setMaxEms(int i) {
        this.f10597D = i;
        EditText editText = this.f10591A;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f10601F = i;
        EditText editText = this.f10591A;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f10595C = i;
        EditText editText = this.f10591A;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f10599E = i;
        EditText editText = this.f10591A;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C5586a.m23699b(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f10671y0 != 1) {
            setEndIconMode(1);
        } else if (z) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f10596C0 = colorStateList;
        C3778f.m28951a(this, this.f10592A0, colorStateList, this.f10598D0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f10598D0 = mode;
        C3778f.m28951a(this, this.f10592A0, this.f10596C0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f10621P == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f10621P = appCompatTextView;
            appCompatTextView.setId(C5423f.textinput_placeholder);
            C1112b0.m38479C0(this.f10621P, 2);
            C2010d m29006z = m29006z();
            this.f10627S = m29006z;
            m29006z.mo34835d0(67L);
            this.f10629T = m29006z();
            setPlaceholderTextAppearance(this.f10625R);
            setPlaceholderTextColor(this.f10623Q);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f10619O) {
                setPlaceholderTextEnabled(true);
            }
            this.f10617N = charSequence;
        }
        m29005z0();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f10625R = i;
        TextView textView = this.f10621P;
        if (textView != null) {
            C1240i.m37872q(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f10623Q != colorStateList) {
            this.f10623Q = colorStateList;
            TextView textView = this.f10621P;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f10668x.m28880k(charSequence);
    }

    public void setPrefixTextAppearance(int i) {
        this.f10668x.m28879l(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f10668x.m28878m(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f10668x.m28877n(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C5586a.m23699b(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f10668x.m28874q(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10668x.m28873r(onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f10668x.m28872s(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f10668x.m28871t(mode);
    }

    public void setStartIconVisible(boolean z) {
        this.f10668x.m28870u(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f10635W = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f10640a0.setText(charSequence);
        m29080D0();
    }

    public void setSuffixTextAppearance(int i) {
        C1240i.m37872q(this.f10640a0, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f10640a0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C3747e c3747e) {
        EditText editText = this.f10591A;
        if (editText != null) {
            C1112b0.m38405s0(editText, c3747e);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f10664u0) {
            this.f10664u0 = typeface;
            this.f10638Y0.m29622H0(typeface);
            this.f10603G.m28934L(typeface);
            TextView textView = this.f10611K;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0 */
    public void m29011w0(boolean z) {
        m29009x0(z, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v109 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInputLayout(android.content.Context r27, android.util.AttributeSet r28, int r29) {
        /*
            Method dump skipped, instructions count: 1386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f10592A0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f10592A0.setImageDrawable(drawable);
        if (drawable != null) {
            C3778f.m28951a(this, this.f10592A0, this.f10596C0, this.f10598D0);
            m29062U();
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f10668x.m28876o(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f10668x.m28875p(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f10610J0.setImageDrawable(drawable);
        m29015u0();
        C3778f.m28951a(this, this.f10610J0, this.f10612K0, this.f10614L0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f10592A0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f10592A0.setImageDrawable(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
