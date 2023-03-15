package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.view.C1112b0;
import androidx.core.widget.C1240i;
import org.joda.time.DateTimeConstants;
import p070e.C4897a;
import p070e.C4904h;
import p070e.C4906j;
import p111g.C5586a;
import p167j.C6204a;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: m0 */
    private static final Property<SwitchCompat, Float> f1412m0 = new C0443a(Float.class, "thumbPos");

    /* renamed from: n0 */
    private static final int[] f1413n0 = {16842912};

    /* renamed from: A */
    private boolean f1414A;

    /* renamed from: B */
    private Drawable f1415B;

    /* renamed from: C */
    private ColorStateList f1416C;

    /* renamed from: D */
    private PorterDuff.Mode f1417D;

    /* renamed from: E */
    private boolean f1418E;

    /* renamed from: F */
    private boolean f1419F;

    /* renamed from: G */
    private int f1420G;

    /* renamed from: H */
    private int f1421H;

    /* renamed from: I */
    private int f1422I;

    /* renamed from: J */
    private boolean f1423J;

    /* renamed from: K */
    private CharSequence f1424K;

    /* renamed from: L */
    private CharSequence f1425L;

    /* renamed from: M */
    private boolean f1426M;

    /* renamed from: N */
    private int f1427N;

    /* renamed from: O */
    private int f1428O;

    /* renamed from: P */
    private float f1429P;

    /* renamed from: Q */
    private float f1430Q;

    /* renamed from: R */
    private VelocityTracker f1431R;

    /* renamed from: S */
    private int f1432S;

    /* renamed from: T */
    float f1433T;

    /* renamed from: U */
    private int f1434U;

    /* renamed from: V */
    private int f1435V;

    /* renamed from: W */
    private int f1436W;

    /* renamed from: a0 */
    private int f1437a0;

    /* renamed from: b0 */
    private int f1438b0;

    /* renamed from: c0 */
    private int f1439c0;

    /* renamed from: d0 */
    private int f1440d0;

    /* renamed from: e0 */
    private final TextPaint f1441e0;

    /* renamed from: f0 */
    private ColorStateList f1442f0;

    /* renamed from: g0 */
    private Layout f1443g0;

    /* renamed from: h0 */
    private Layout f1444h0;

    /* renamed from: i0 */
    private TransformationMethod f1445i0;

    /* renamed from: j0 */
    ObjectAnimator f1446j0;

    /* renamed from: k0 */
    private final C0531w f1447k0;

    /* renamed from: l0 */
    private final Rect f1448l0;

    /* renamed from: w */
    private Drawable f1449w;

    /* renamed from: x */
    private ColorStateList f1450x;

    /* renamed from: y */
    private PorterDuff.Mode f1451y;

    /* renamed from: z */
    private boolean f1452z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    /* loaded from: classes.dex */
    class C0443a extends Property<SwitchCompat, Float> {
        C0443a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float mo40737a(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f1433T);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void mo40736b(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4897a.f13365L);
    }

    /* renamed from: a */
    private void m40751a(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1412m0, z ? 1.0f : 0.0f);
        this.f1446j0 = ofFloat;
        ofFloat.setDuration(250L);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f1446j0.setAutoCancel(true);
        }
        this.f1446j0.start();
    }

    /* renamed from: b */
    private void m40750b() {
        Drawable drawable = this.f1449w;
        if (drawable != null) {
            if (this.f1452z || this.f1414A) {
                Drawable mutate = C0981a.m38859r(drawable).mutate();
                this.f1449w = mutate;
                if (this.f1452z) {
                    C0981a.m38862o(mutate, this.f1450x);
                }
                if (this.f1414A) {
                    C0981a.m38861p(this.f1449w, this.f1451y);
                }
                if (this.f1449w.isStateful()) {
                    this.f1449w.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: c */
    private void m40749c() {
        Drawable drawable = this.f1415B;
        if (drawable != null) {
            if (this.f1418E || this.f1419F) {
                Drawable mutate = C0981a.m38859r(drawable).mutate();
                this.f1415B = mutate;
                if (this.f1418E) {
                    C0981a.m38862o(mutate, this.f1416C);
                }
                if (this.f1419F) {
                    C0981a.m38861p(this.f1415B, this.f1417D);
                }
                if (this.f1415B.isStateful()) {
                    this.f1415B.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: d */
    private void m40748d() {
        ObjectAnimator objectAnimator = this.f1446j0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: e */
    private void m40747e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: f */
    private static float m40746f(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: g */
    private boolean m40745g(float f, float f2) {
        if (this.f1449w == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1449w.getPadding(this.f1448l0);
        int i = this.f1438b0;
        int i2 = this.f1428O;
        int i3 = i - i2;
        int i4 = (this.f1437a0 + thumbOffset) - i2;
        Rect rect = this.f1448l0;
        return f > ((float) i4) && f < ((float) ((((this.f1436W + i4) + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.f1440d0 + i2));
    }

    private boolean getTargetCheckedState() {
        return this.f1433T > 0.5f;
    }

    private int getThumbOffset() {
        float f;
        if (C0541y0.m40330b(this)) {
            f = 1.0f - this.f1433T;
        } else {
            f = this.f1433T;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f1415B;
        if (drawable != null) {
            Rect rect2 = this.f1448l0;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.f1449w;
            if (drawable2 != null) {
                rect = C0456b0.m40679d(drawable2);
            } else {
                rect = C0456b0.f1522c;
            }
            return ((((this.f1434U - this.f1436W) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    /* renamed from: h */
    private Layout m40744h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f1445i0;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f1441e0;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: i */
    private void m40743i() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f1425L;
            if (charSequence == null) {
                charSequence = getResources().getString(C4904h.abc_capital_off);
            }
            C1112b0.m38467I0(this, charSequence);
        }
    }

    /* renamed from: j */
    private void m40742j() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f1424K;
            if (charSequence == null) {
                charSequence = getResources().getString(C4904h.abc_capital_on);
            }
            C1112b0.m38467I0(this, charSequence);
        }
    }

    /* renamed from: m */
    private void m40739m(int i, int i2) {
        Typeface typeface;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i != 2) {
            typeface = i != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        m40740l(typeface, i2);
    }

    /* renamed from: n */
    private void m40738n(MotionEvent motionEvent) {
        this.f1427N = 0;
        boolean z = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z2) {
            this.f1431R.computeCurrentVelocity(DateTimeConstants.MILLIS_PER_SECOND);
            float xVelocity = this.f1431R.getXVelocity();
            if (Math.abs(xVelocity) > this.f1432S) {
                if (!C0541y0.m40330b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z = false;
                }
            } else {
                z = getTargetCheckedState();
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m40747e(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.f1448l0;
        int i3 = this.f1437a0;
        int i4 = this.f1438b0;
        int i5 = this.f1439c0;
        int i6 = this.f1440d0;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f1449w;
        if (drawable != null) {
            rect = C0456b0.m40679d(drawable);
        } else {
            rect = C0456b0.f1522c;
        }
        Drawable drawable2 = this.f1415B;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f1415B.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f1415B.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f1449w;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.f1436W + rect2.right;
            this.f1449w.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0981a.m38865l(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f1449w;
        if (drawable != null) {
            C0981a.m38866k(drawable, f, f2);
        }
        Drawable drawable2 = this.f1415B;
        if (drawable2 != null) {
            C0981a.m38866k(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1449w;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1415B;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!C0541y0.m40330b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1434U;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1422I : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (C0541y0.m40330b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1434U;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1422I : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f1426M;
    }

    public boolean getSplitTrack() {
        return this.f1423J;
    }

    public int getSwitchMinWidth() {
        return this.f1421H;
    }

    public int getSwitchPadding() {
        return this.f1422I;
    }

    public CharSequence getTextOff() {
        return this.f1425L;
    }

    public CharSequence getTextOn() {
        return this.f1424K;
    }

    public Drawable getThumbDrawable() {
        return this.f1449w;
    }

    public int getThumbTextPadding() {
        return this.f1420G;
    }

    public ColorStateList getThumbTintList() {
        return this.f1450x;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1451y;
    }

    public Drawable getTrackDrawable() {
        return this.f1415B;
    }

    public ColorStateList getTrackTintList() {
        return this.f1416C;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1417D;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1449w;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1415B;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1446j0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f1446j0.end();
        this.f1446j0 = null;
    }

    /* renamed from: k */
    public void m40741k(Context context, int i) {
        C0520s0 m40455t = C0520s0.m40455t(context, i, C4906j.f13412G2);
        ColorStateList m40472c = m40455t.m40472c(C4906j.f13430K2);
        if (m40472c != null) {
            this.f1442f0 = m40472c;
        } else {
            this.f1442f0 = getTextColors();
        }
        int m40469f = m40455t.m40469f(C4906j.f13417H2, 0);
        if (m40469f != 0) {
            float f = m40469f;
            if (f != this.f1441e0.getTextSize()) {
                this.f1441e0.setTextSize(f);
                requestLayout();
            }
        }
        m40739m(m40455t.m40464k(C4906j.f13422I2, -1), m40455t.m40464k(C4906j.f13426J2, -1));
        if (m40455t.m40474a(C4906j.f13458R2, false)) {
            this.f1445i0 = new C6204a(getContext());
        } else {
            this.f1445i0 = null;
        }
        m40455t.m40452w();
    }

    /* renamed from: l */
    public void m40740l(Typeface typeface, int i) {
        Typeface create;
        if (i > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i);
            } else {
                create = Typeface.create(typeface, i);
            }
            setSwitchTypeface(create);
            int i2 = (~(create != null ? create.getStyle() : 0)) & i;
            this.f1441e0.setFakeBoldText((i2 & 1) != 0);
            this.f1441e0.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
            return;
        }
        this.f1441e0.setFakeBoldText(false);
        this.f1441e0.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f1413n0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f1448l0;
        Drawable drawable = this.f1415B;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f1438b0;
        int i2 = this.f1440d0;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f1449w;
        if (drawable != null) {
            if (this.f1423J && drawable2 != null) {
                Rect m40679d = C0456b0.m40679d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += m40679d.left;
                rect.right -= m40679d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f1443g0 : this.f1444h0;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1442f0;
            if (colorStateList != null) {
                this.f1441e0.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1441e0.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f1424K : this.f1425L;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.f1449w != null) {
            Rect rect = this.f1448l0;
            Drawable drawable = this.f1415B;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect m40679d = C0456b0.m40679d(this.f1449w);
            i5 = Math.max(0, m40679d.left - rect.left);
            i9 = Math.max(0, m40679d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0541y0.m40330b(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.f1434U + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.f1434U) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i7 = this.f1435V;
            paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i7 / 2);
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            i7 = this.f1435V;
        } else {
            i8 = getHeight() - getPaddingBottom();
            paddingTop = i8 - this.f1435V;
            this.f1437a0 = i6;
            this.f1438b0 = paddingTop;
            this.f1440d0 = i8;
            this.f1439c0 = width;
        }
        i8 = i7 + paddingTop;
        this.f1437a0 = i6;
        this.f1438b0 = paddingTop;
        this.f1440d0 = i8;
        this.f1439c0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f1426M) {
            if (this.f1443g0 == null) {
                this.f1443g0 = m40744h(this.f1424K);
            }
            if (this.f1444h0 == null) {
                this.f1444h0 = m40744h(this.f1425L);
            }
        }
        Rect rect = this.f1448l0;
        Drawable drawable = this.f1449w;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.f1449w.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f1449w.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.f1436W = Math.max(this.f1426M ? Math.max(this.f1443g0.getWidth(), this.f1444h0.getWidth()) + (this.f1420G * 2) : 0, i3);
        Drawable drawable2 = this.f1415B;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f1415B.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f1449w;
        if (drawable3 != null) {
            Rect m40679d = C0456b0.m40679d(drawable3);
            i6 = Math.max(i6, m40679d.left);
            i7 = Math.max(i7, m40679d.right);
        }
        int max = Math.max(this.f1421H, (this.f1436W * 2) + i6 + i7);
        int max2 = Math.max(i5, i4);
        this.f1434U = max;
        this.f1435V = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1424K : this.f1425L;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != 3) goto L8;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f1431R
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.f1427N
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f1429P
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = androidx.appcompat.widget.C0541y0.m40330b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.f1433T
            float r0 = r0 + r2
            float r0 = m40746f(r0, r4, r3)
            float r2 = r6.f1433T
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.f1429P = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f1429P
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1428O
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.f1430Q
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1428O
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.f1427N = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f1429P = r0
            r6.f1430Q = r3
            return r1
        L89:
            int r0 = r6.f1427N
            if (r0 != r2) goto L94
            r6.m40738n(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.f1427N = r0
            android.view.VelocityTracker r0 = r6.f1431R
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.m40745g(r0, r2)
            if (r3 == 0) goto Lb7
            r6.f1427N = r1
            r6.f1429P = r0
            r6.f1430Q = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            m40742j();
        } else {
            m40743i();
        }
        if (getWindowToken() != null && C1112b0.m38446W(this)) {
            m40751a(isChecked);
            return;
        }
        m40748d();
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1240i.m37870s(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f1426M != z) {
            this.f1426M = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f1423J = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f1421H = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f1422I = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f1441e0.getTypeface() == null || this.f1441e0.getTypeface().equals(typeface)) && (this.f1441e0.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f1441e0.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f1425L = charSequence;
        requestLayout();
        if (isChecked()) {
            return;
        }
        m40743i();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f1424K = charSequence;
        requestLayout();
        if (isChecked()) {
            m40742j();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1449w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1449w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f) {
        this.f1433T = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C5586a.m23699b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f1420G = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1450x = colorStateList;
        this.f1452z = true;
        m40750b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1451y = mode;
        this.f1414A = true;
        m40750b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1415B;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1415B = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C5586a.m23699b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1416C = colorStateList;
        this.f1418E = true;
        m40749c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1417D = mode;
        this.f1419F = true;
        m40749c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1449w || drawable == this.f1415B;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1450x = null;
        this.f1451y = null;
        this.f1452z = false;
        this.f1414A = false;
        this.f1416C = null;
        this.f1417D = null;
        this.f1418E = false;
        this.f1419F = false;
        this.f1431R = VelocityTracker.obtain();
        this.f1448l0 = new Rect();
        C0508n0.m40495a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f1441e0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C4906j.f13579r2;
        C0520s0 m40453v = C0520s0.m40453v(context, attributeSet, iArr, i, 0);
        C1112b0.m38409q0(this, context, iArr, attributeSet, m40453v.m40457r(), i, 0);
        Drawable m40468g = m40453v.m40468g(C4906j.f13594u2);
        this.f1449w = m40468g;
        if (m40468g != null) {
            m40468g.setCallback(this);
        }
        Drawable m40468g2 = m40453v.m40468g(C4906j.f13397D2);
        this.f1415B = m40468g2;
        if (m40468g2 != null) {
            m40468g2.setCallback(this);
        }
        this.f1424K = m40453v.m40459p(C4906j.f13584s2);
        this.f1425L = m40453v.m40459p(C4906j.f13589t2);
        this.f1426M = m40453v.m40474a(C4906j.f13599v2, true);
        this.f1420G = m40453v.m40469f(C4906j.f13382A2, 0);
        this.f1421H = m40453v.m40469f(C4906j.f13609x2, 0);
        this.f1422I = m40453v.m40469f(C4906j.f13614y2, 0);
        this.f1423J = m40453v.m40474a(C4906j.f13604w2, false);
        ColorStateList m40472c = m40453v.m40472c(C4906j.f13387B2);
        if (m40472c != null) {
            this.f1450x = m40472c;
            this.f1452z = true;
        }
        PorterDuff.Mode m40678e = C0456b0.m40678e(m40453v.m40464k(C4906j.f13392C2, -1), null);
        if (this.f1451y != m40678e) {
            this.f1451y = m40678e;
            this.f1414A = true;
        }
        if (this.f1452z || this.f1414A) {
            m40750b();
        }
        ColorStateList m40472c2 = m40453v.m40472c(C4906j.f13402E2);
        if (m40472c2 != null) {
            this.f1416C = m40472c2;
            this.f1418E = true;
        }
        PorterDuff.Mode m40678e2 = C0456b0.m40678e(m40453v.m40464k(C4906j.f13407F2, -1), null);
        if (this.f1417D != m40678e2) {
            this.f1417D = m40678e2;
            this.f1419F = true;
        }
        if (this.f1418E || this.f1419F) {
            m40749c();
        }
        int m40461n = m40453v.m40461n(C4906j.f13619z2, 0);
        if (m40461n != 0) {
            m40741k(context, m40461n);
        }
        C0531w c0531w = new C0531w(this);
        this.f1447k0 = c0531w;
        c0531w.m40385m(attributeSet, i);
        m40453v.m40452w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1428O = viewConfiguration.getScaledTouchSlop();
        this.f1432S = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }
}
