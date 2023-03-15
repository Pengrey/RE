package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0466e;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.view.C1112b0;
import androidx.core.widget.C1240i;
import androidx.customview.view.AbsSavedState;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p100f8.C5419b;
import p100f8.C5428k;
import p111g.C5586a;
import p401v8.C11145h;
import p401v8.C11148k;
import p401v8.InterfaceC11164n;

/* loaded from: classes.dex */
public class MaterialButton extends C0466e implements Checkable, InterfaceC11164n {

    /* renamed from: L */
    private static final int[] f9612L = {16842911};

    /* renamed from: M */
    private static final int[] f9613M = {16842912};

    /* renamed from: N */
    private static final int f9614N = C5428k.Widget_MaterialComponents_Button;

    /* renamed from: A */
    private InterfaceC3514b f9615A;

    /* renamed from: B */
    private PorterDuff.Mode f9616B;

    /* renamed from: C */
    private ColorStateList f9617C;

    /* renamed from: D */
    private Drawable f9618D;

    /* renamed from: E */
    private int f9619E;

    /* renamed from: F */
    private int f9620F;

    /* renamed from: G */
    private int f9621G;

    /* renamed from: H */
    private int f9622H;

    /* renamed from: I */
    private boolean f9623I;

    /* renamed from: J */
    private boolean f9624J;

    /* renamed from: K */
    private int f9625K;

    /* renamed from: y */
    private final C3520a f9626y;

    /* renamed from: z */
    private final LinkedHashSet<InterfaceC3513a> f9627z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3512a();

        /* renamed from: y */
        boolean f9628y;

        /* renamed from: com.google.android.material.button.MaterialButton$SavedState$a */
        /* loaded from: classes.dex */
        class C3512a implements Parcelable.ClassLoaderCreator<SavedState> {
            C3512a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState mo30299a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState mo30298b(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] mo30297c(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m30300b(Parcel parcel) {
            this.f9628y = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f9628y ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            m30300b(parcel);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3513a {
        /* renamed from: a */
        void m30296a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    /* loaded from: classes.dex */
    interface InterfaceC3514b {
        /* renamed from: a */
        void mo30269a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5419b.materialButtonStyle);
    }

    /* renamed from: b */
    private boolean m30308b() {
        int i = this.f9625K;
        return i == 3 || i == 4;
    }

    /* renamed from: c */
    private boolean m30307c() {
        int i = this.f9625K;
        return i == 1 || i == 2;
    }

    /* renamed from: d */
    private boolean m30306d() {
        int i = this.f9625K;
        return i == 16 || i == 32;
    }

    /* renamed from: e */
    private boolean m30305e() {
        return C1112b0.m38476E(this) == 1;
    }

    /* renamed from: f */
    private boolean m30304f() {
        C3520a c3520a = this.f9626y;
        return (c3520a == null || c3520a.m30244o()) ? false : true;
    }

    /* renamed from: g */
    private void m30303g() {
        if (m30307c()) {
            C1240i.m37877l(this, this.f9618D, null, null, null);
        } else if (m30308b()) {
            C1240i.m37877l(this, null, null, this.f9618D, null);
        } else if (m30306d()) {
            C1240i.m37877l(this, null, this.f9618D, null, null);
        }
    }

    private String getA11yClassName() {
        return (m30309a() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        if (Build.VERSION.SDK_INT < 17) {
            return getGravityTextAlignment();
        }
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment == 6 || textAlignment == 3) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            if (textAlignment != 4) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_CENTER;
        }
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    /* renamed from: h */
    private void m30302h(boolean z) {
        Drawable drawable = this.f9618D;
        boolean z2 = true;
        if (drawable != null) {
            Drawable mutate = C0981a.m38859r(drawable).mutate();
            this.f9618D = mutate;
            C0981a.m38862o(mutate, this.f9617C);
            PorterDuff.Mode mode = this.f9616B;
            if (mode != null) {
                C0981a.m38861p(this.f9618D, mode);
            }
            int i = this.f9619E;
            if (i == 0) {
                i = this.f9618D.getIntrinsicWidth();
            }
            int i2 = this.f9619E;
            if (i2 == 0) {
                i2 = this.f9618D.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f9618D;
            int i3 = this.f9620F;
            int i4 = this.f9621G;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.f9618D.setVisible(true, z);
        }
        if (z) {
            m30303g();
            return;
        }
        Drawable[] m37888a = C1240i.m37888a(this);
        Drawable drawable3 = m37888a[0];
        Drawable drawable4 = m37888a[1];
        Drawable drawable5 = m37888a[2];
        if ((!m30307c() || drawable3 == this.f9618D) && ((!m30308b() || drawable5 == this.f9618D) && (!m30306d() || drawable4 == this.f9618D))) {
            z2 = false;
        }
        if (z2) {
            m30303g();
        }
    }

    /* renamed from: i */
    private void m30301i(int i, int i2) {
        if (this.f9618D == null || getLayout() == null) {
            return;
        }
        if (!m30307c() && !m30308b()) {
            if (m30306d()) {
                this.f9620F = 0;
                if (this.f9625K == 16) {
                    this.f9621G = 0;
                    m30302h(false);
                    return;
                }
                int i3 = this.f9619E;
                if (i3 == 0) {
                    i3 = this.f9618D.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i3) - this.f9622H) - getPaddingBottom()) / 2;
                if (this.f9621G != textHeight) {
                    this.f9621G = textHeight;
                    m30302h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f9621G = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.f9625K;
        if (i4 != 1 && i4 != 3 && ((i4 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i4 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
            int i5 = this.f9619E;
            if (i5 == 0) {
                i5 = this.f9618D.getIntrinsicWidth();
            }
            int textWidth = ((((i - getTextWidth()) - C1112b0.m38468I(this)) - i5) - this.f9622H) - C1112b0.m38466J(this);
            if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                textWidth /= 2;
            }
            if (m30305e() != (this.f9625K == 4)) {
                textWidth = -textWidth;
            }
            if (this.f9620F != textWidth) {
                this.f9620F = textWidth;
                m30302h(false);
                return;
            }
            return;
        }
        this.f9620F = 0;
        m30302h(false);
    }

    /* renamed from: a */
    public boolean m30309a() {
        C3520a c3520a = this.f9626y;
        return c3520a != null && c3520a.m30243p();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m30304f()) {
            return this.f9626y.m30257b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f9618D;
    }

    public int getIconGravity() {
        return this.f9625K;
    }

    public int getIconPadding() {
        return this.f9622H;
    }

    public int getIconSize() {
        return this.f9619E;
    }

    public ColorStateList getIconTint() {
        return this.f9617C;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f9616B;
    }

    public int getInsetBottom() {
        return this.f9626y.m30256c();
    }

    public int getInsetTop() {
        return this.f9626y.m30255d();
    }

    public ColorStateList getRippleColor() {
        if (m30304f()) {
            return this.f9626y.m30251h();
        }
        return null;
    }

    public C11148k getShapeAppearanceModel() {
        if (m30304f()) {
            return this.f9626y.m30250i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m30304f()) {
            return this.f9626y.m30249j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m30304f()) {
            return this.f9626y.m30248k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C0466e, androidx.core.view.InterfaceC1217z
    public ColorStateList getSupportBackgroundTintList() {
        if (m30304f()) {
            return this.f9626y.m30247l();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C0466e, androidx.core.view.InterfaceC1217z
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m30304f()) {
            return this.f9626y.m30246m();
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f9623I;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m30304f()) {
            C11145h.m5960f(this, this.f9626y.m30253f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m30309a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f9612L);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f9613M);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C0466e, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.C0466e, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m30309a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.C0466e, android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C3520a c3520a;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (c3520a = this.f9626y) != null) {
            c3520a.m30261H(i4 - i2, i3 - i);
        }
        m30301i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m37835a());
        setChecked(savedState.f9628y);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9628y = this.f9623I;
        return savedState;
    }

    @Override // androidx.appcompat.widget.C0466e, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m30301i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f9618D != null) {
            if (this.f9618D.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (m30304f()) {
            this.f9626y.m30241r(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.C0466e, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (m30304f()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.f9626y.m30240s();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.C0466e, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C5586a.m23699b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m30304f()) {
            this.f9626y.m30239t(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (m30309a() && isEnabled() && this.f9623I != z) {
            this.f9623I = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m30283m(this, this.f9623I);
            }
            if (this.f9624J) {
                return;
            }
            this.f9624J = true;
            Iterator<InterfaceC3513a> it = this.f9627z.iterator();
            while (it.hasNext()) {
                it.next().m30296a(this, this.f9623I);
            }
            this.f9624J = false;
        }
    }

    public void setCornerRadius(int i) {
        if (m30304f()) {
            this.f9626y.m30238u(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m30304f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m30304f()) {
            this.f9626y.m30253f().m6005Y(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f9618D != drawable) {
            this.f9618D = drawable;
            m30302h(true);
            m30301i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f9625K != i) {
            this.f9625K = i;
            m30301i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f9622H != i) {
            this.f9622H = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C5586a.m23699b(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i >= 0) {
            if (this.f9619E != i) {
                this.f9619E = i;
                m30302h(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f9617C != colorStateList) {
            this.f9617C = colorStateList;
            m30302h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f9616B != mode) {
            this.f9616B = mode;
            m30302h(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C5586a.m23700a(getContext(), i));
    }

    public void setInsetBottom(int i) {
        this.f9626y.m30237v(i);
    }

    public void setInsetTop(int i) {
        this.f9626y.m30236w(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(InterfaceC3514b interfaceC3514b) {
        this.f9615A = interfaceC3514b;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC3514b interfaceC3514b = this.f9615A;
        if (interfaceC3514b != null) {
            interfaceC3514b.mo30269a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m30304f()) {
            this.f9626y.m30235x(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m30304f()) {
            setRippleColor(C5586a.m23700a(getContext(), i));
        }
    }

    @Override // p401v8.InterfaceC11164n
    public void setShapeAppearanceModel(C11148k c11148k) {
        if (m30304f()) {
            this.f9626y.m30234y(c11148k);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m30304f()) {
            this.f9626y.m30233z(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m30304f()) {
            this.f9626y.m30268A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m30304f()) {
            setStrokeColor(C5586a.m23700a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m30304f()) {
            this.f9626y.m30267B(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m30304f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.C0466e, androidx.core.view.InterfaceC1217z
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m30304f()) {
            this.f9626y.m30266C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.C0466e, androidx.core.view.InterfaceC1217z
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m30304f()) {
            this.f9626y.m30265D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m30301i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f9623I);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.f9614N
            android.content.Context r9 = p419w8.C11602a.m4640c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f9627z = r9
            r9 = 0
            r8.f9623I = r9
            r8.f9624J = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = p100f8.C5429l.f14934F2
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C3646n.m29500h(r0, r1, r2, r3, r4, r5)
            int r1 = p100f8.C5429l.f15038S2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f9622H = r1
            int r1 = p100f8.C5429l.f15062V2
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.C3649p.m29487f(r1, r2)
            r8.f9616B = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p100f8.C5429l.f15054U2
            android.content.res.ColorStateList r1 = p354s8.C10086c.m9229a(r1, r0, r2)
            r8.f9617C = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p100f8.C5429l.f15022Q2
            android.graphics.drawable.Drawable r1 = p354s8.C10086c.m9225e(r1, r0, r2)
            r8.f9618D = r1
            int r1 = p100f8.C5429l.f15030R2
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f9625K = r1
            int r1 = p100f8.C5429l.f15046T2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f9619E = r1
            v8.k$b r10 = p401v8.C11148k.m5953e(r7, r10, r11, r6)
            v8.k r10 = r10.m5914m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f9626y = r11
            r11.m30242q(r0)
            r0.recycle()
            int r10 = r8.f9622H
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f9618D
            if (r10 == 0) goto L84
            r9 = r2
        L84:
            r8.m30302h(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
