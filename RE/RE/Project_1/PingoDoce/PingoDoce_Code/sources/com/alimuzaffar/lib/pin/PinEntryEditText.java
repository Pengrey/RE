package com.alimuzaffar.lib.pin;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import androidx.appcompat.widget.C0494j;
import androidx.core.content.C0928a;
import androidx.core.view.C1112b0;
import p172j4.C6301a;
import p172j4.C6302b;
import p172j4.C6303c;

/* loaded from: classes.dex */
public class PinEntryEditText extends C0494j {

    /* renamed from: A */
    protected String f6517A;

    /* renamed from: B */
    protected StringBuilder f6518B;

    /* renamed from: C */
    protected String f6519C;

    /* renamed from: D */
    protected int f6520D;

    /* renamed from: E */
    protected float f6521E;

    /* renamed from: F */
    protected float f6522F;

    /* renamed from: G */
    protected float f6523G;

    /* renamed from: H */
    protected float f6524H;

    /* renamed from: I */
    protected int f6525I;

    /* renamed from: J */
    protected RectF[] f6526J;

    /* renamed from: K */
    protected float[] f6527K;

    /* renamed from: L */
    protected Paint f6528L;

    /* renamed from: M */
    protected Paint f6529M;

    /* renamed from: N */
    protected Paint f6530N;

    /* renamed from: O */
    protected Drawable f6531O;

    /* renamed from: P */
    protected Rect f6532P;

    /* renamed from: Q */
    protected boolean f6533Q;

    /* renamed from: R */
    protected View.OnClickListener f6534R;

    /* renamed from: S */
    protected InterfaceC2251i f6535S;

    /* renamed from: T */
    protected float f6536T;

    /* renamed from: U */
    protected float f6537U;

    /* renamed from: V */
    protected Paint f6538V;

    /* renamed from: W */
    protected boolean f6539W;

    /* renamed from: a0 */
    protected boolean f6540a0;

    /* renamed from: b0 */
    protected ColorStateList f6541b0;

    /* renamed from: c0 */
    protected int[][] f6542c0;

    /* renamed from: d0 */
    protected int[] f6543d0;

    /* renamed from: e0 */
    protected ColorStateList f6544e0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.alimuzaffar.lib.pin.PinEntryEditText$a */
    /* loaded from: classes.dex */
    public class ActionMode$CallbackC2243a implements ActionMode.Callback {
        ActionMode$CallbackC2243a(PinEntryEditText pinEntryEditText) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.alimuzaffar.lib.pin.PinEntryEditText$b */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2244b implements View.OnClickListener {
        View$OnClickListenerC2244b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PinEntryEditText pinEntryEditText = PinEntryEditText.this;
            pinEntryEditText.setSelection(pinEntryEditText.getText().length());
            View.OnClickListener onClickListener = PinEntryEditText.this.f6534R;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.alimuzaffar.lib.pin.PinEntryEditText$c */
    /* loaded from: classes.dex */
    public class View$OnLongClickListenerC2245c implements View.OnLongClickListener {
        View$OnLongClickListenerC2245c() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            PinEntryEditText pinEntryEditText = PinEntryEditText.this;
            pinEntryEditText.setSelection(pinEntryEditText.getText().length());
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.alimuzaffar.lib.pin.PinEntryEditText$d */
    /* loaded from: classes.dex */
    public class C2246d implements ValueAnimator.AnimatorUpdateListener {
        C2246d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            PinEntryEditText.this.f6529M.setTextSize(((Float) valueAnimator.getAnimatedValue()).floatValue());
            PinEntryEditText.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.alimuzaffar.lib.pin.PinEntryEditText$e */
    /* loaded from: classes.dex */
    public class C2247e implements Animator.AnimatorListener {
        C2247e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            PinEntryEditText pinEntryEditText = PinEntryEditText.this;
            pinEntryEditText.f6535S.mo34281a(pinEntryEditText.getText());
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.alimuzaffar.lib.pin.PinEntryEditText$f */
    /* loaded from: classes.dex */
    public class C2248f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ int f6549a;

        C2248f(int i) {
            this.f6549a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            PinEntryEditText.this.f6527K[this.f6549a] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            PinEntryEditText.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.alimuzaffar.lib.pin.PinEntryEditText$g */
    /* loaded from: classes.dex */
    public class C2249g implements ValueAnimator.AnimatorUpdateListener {
        C2249g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            PinEntryEditText.this.f6529M.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.alimuzaffar.lib.pin.PinEntryEditText$h */
    /* loaded from: classes.dex */
    public class C2250h implements Animator.AnimatorListener {
        C2250h() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            PinEntryEditText pinEntryEditText = PinEntryEditText.this;
            pinEntryEditText.f6535S.mo34281a(pinEntryEditText.getText());
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.alimuzaffar.lib.pin.PinEntryEditText$i */
    /* loaded from: classes.dex */
    public interface InterfaceC2251i {
        /* renamed from: a */
        void mo34281a(CharSequence charSequence);
    }

    public PinEntryEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6517A = null;
        this.f6518B = null;
        this.f6519C = null;
        this.f6520D = 0;
        this.f6521E = 24.0f;
        this.f6523G = 4.0f;
        this.f6524H = 8.0f;
        this.f6525I = 4;
        this.f6532P = new Rect();
        this.f6533Q = false;
        this.f6535S = null;
        this.f6536T = 1.0f;
        this.f6537U = 2.0f;
        this.f6539W = false;
        this.f6540a0 = false;
        this.f6542c0 = new int[][]{new int[]{16842913}, new int[]{16842914}, new int[]{16842908}, new int[]{-16842908}};
        this.f6543d0 = new int[]{-16711936, -65536, -16777216, -7829368};
        this.f6544e0 = new ColorStateList(this.f6542c0, this.f6543d0);
        m34284e(context, attributeSet);
    }

    /* renamed from: b */
    private void m34287b(CharSequence charSequence, int i) {
        float[] fArr = this.f6527K;
        fArr[i] = this.f6526J[i].bottom - this.f6524H;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr[i] + getPaint().getTextSize(), this.f6527K[i]);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new OvershootInterpolator());
        ofFloat.addUpdateListener(new C2248f(i));
        this.f6529M.setAlpha(255);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new C2249g());
        AnimatorSet animatorSet = new AnimatorSet();
        if (charSequence.length() == this.f6525I && this.f6535S != null) {
            animatorSet.addListener(new C2250h());
        }
        animatorSet.playTogether(ofFloat, ofInt);
        animatorSet.start();
    }

    /* renamed from: c */
    private void m34286c() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, getPaint().getTextSize());
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new OvershootInterpolator());
        ofFloat.addUpdateListener(new C2246d());
        if (getText().length() == this.f6525I && this.f6535S != null) {
            ofFloat.addListener(new C2247e());
        }
        ofFloat.start();
    }

    /* renamed from: d */
    private int m34285d(int... iArr) {
        return this.f6544e0.getColorForState(iArr, -7829368);
    }

    /* renamed from: e */
    private void m34284e(Context context, AttributeSet attributeSet) {
        float f = context.getResources().getDisplayMetrics().density;
        this.f6536T *= f;
        this.f6537U *= f;
        this.f6521E *= f;
        this.f6524H = f * this.f6524H;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6303c.f17281a, 0, 0);
        try {
            TypedValue typedValue = new TypedValue();
            obtainStyledAttributes.getValue(C6303c.f17282b, typedValue);
            this.f6520D = typedValue.data;
            this.f6517A = obtainStyledAttributes.getString(C6303c.f17285e);
            this.f6519C = obtainStyledAttributes.getString(C6303c.f17290j);
            this.f6536T = obtainStyledAttributes.getDimension(C6303c.f17288h, this.f6536T);
            this.f6537U = obtainStyledAttributes.getDimension(C6303c.f17289i, this.f6537U);
            this.f6521E = obtainStyledAttributes.getDimension(C6303c.f17286f, this.f6521E);
            this.f6524H = obtainStyledAttributes.getDimension(C6303c.f17291k, this.f6524H);
            this.f6533Q = obtainStyledAttributes.getBoolean(C6303c.f17284d, this.f6533Q);
            this.f6531O = obtainStyledAttributes.getDrawable(C6303c.f17283c);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(C6303c.f17287g);
            if (colorStateList != null) {
                this.f6544e0 = colorStateList;
            }
            obtainStyledAttributes.recycle();
            this.f6528L = new Paint(getPaint());
            this.f6529M = new Paint(getPaint());
            this.f6530N = new Paint(getPaint());
            Paint paint = new Paint(getPaint());
            this.f6538V = paint;
            paint.setStrokeWidth(this.f6536T);
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(C6301a.f17280a, typedValue2, true);
            this.f6543d0[0] = typedValue2.data;
            this.f6543d0[1] = isInEditMode() ? -7829368 : C0928a.m39113d(context, C6302b.pin_normal);
            this.f6543d0[2] = isInEditMode() ? -7829368 : C0928a.m39113d(context, C6302b.pin_normal);
            setBackgroundResource(0);
            int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLength", 4);
            this.f6525I = attributeIntValue;
            this.f6523G = attributeIntValue;
            super.setCustomSelectionActionModeCallback(new ActionMode$CallbackC2243a(this));
            super.setOnClickListener(new View$OnClickListenerC2244b());
            super.setOnLongClickListener(new View$OnLongClickListenerC2245c());
            if ((getInputType() & 128) == 128 && TextUtils.isEmpty(this.f6517A)) {
                this.f6517A = "●";
            } else if ((getInputType() & 16) == 16 && TextUtils.isEmpty(this.f6517A)) {
                this.f6517A = "●";
            }
            if (!TextUtils.isEmpty(this.f6517A)) {
                this.f6518B = getMaskChars();
            }
            getPaint().getTextBounds("|", 0, 1, this.f6532P);
            this.f6539W = this.f6520D > -1;
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private CharSequence getFullText() {
        if (TextUtils.isEmpty(this.f6517A)) {
            return getText();
        }
        return getMaskChars();
    }

    private StringBuilder getMaskChars() {
        if (this.f6518B == null) {
            this.f6518B = new StringBuilder();
        }
        int length = getText().length();
        while (this.f6518B.length() != length) {
            if (this.f6518B.length() < length) {
                this.f6518B.append(this.f6517A);
            } else {
                StringBuilder sb2 = this.f6518B;
                sb2.deleteCharAt(sb2.length() - 1);
            }
        }
        return this.f6518B;
    }

    private void setCustomTypeface(Typeface typeface) {
        Paint paint = this.f6528L;
        if (paint != null) {
            paint.setTypeface(typeface);
            this.f6529M.setTypeface(typeface);
            this.f6530N.setTypeface(typeface);
            this.f6538V.setTypeface(typeface);
        }
    }

    /* renamed from: f */
    protected void m34283f(boolean z) {
        if (this.f6540a0) {
            this.f6538V.setColor(m34285d(16842914));
        } else if (isFocused()) {
            this.f6538V.setStrokeWidth(this.f6537U);
            this.f6538V.setColor(m34285d(16842908));
            if (z) {
                this.f6538V.setColor(m34285d(16842913));
            }
        } else {
            this.f6538V.setStrokeWidth(this.f6536T);
            this.f6538V.setColor(m34285d(-16842908));
        }
    }

    /* renamed from: g */
    protected void m34282g(boolean z, boolean z2) {
        if (this.f6540a0) {
            this.f6531O.setState(new int[]{16842914});
        } else if (!isFocused()) {
            if (z) {
                this.f6531O.setState(new int[]{-16842908, 16842912});
            } else {
                this.f6531O.setState(new int[]{-16842908});
            }
        } else {
            this.f6531O.setState(new int[]{16842908});
            if (z2) {
                this.f6531O.setState(new int[]{16842908, 16842913});
            } else if (z) {
                this.f6531O.setState(new int[]{16842908, 16842912});
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        CharSequence fullText = getFullText();
        int length = fullText.length();
        float[] fArr = new float[length];
        getPaint().getTextWidths(fullText, 0, length, fArr);
        String str = this.f6519C;
        float f = 0.0f;
        if (str != null) {
            int length2 = str.length();
            float[] fArr2 = new float[length2];
            getPaint().getTextWidths(this.f6519C, fArr2);
            for (int i = 0; i < length2; i++) {
                f += fArr2[i];
            }
        }
        float f2 = f;
        int i2 = 0;
        while (i2 < this.f6523G) {
            if (this.f6531O != null) {
                m34282g(i2 < length, i2 == length);
                Drawable drawable = this.f6531O;
                RectF[] rectFArr = this.f6526J;
                drawable.setBounds((int) rectFArr[i2].left, (int) rectFArr[i2].top, (int) rectFArr[i2].right, (int) rectFArr[i2].bottom);
                this.f6531O.draw(canvas);
            }
            float f3 = this.f6526J[i2].left + (this.f6522F / 2.0f);
            if (length > i2) {
                if (this.f6539W && i2 == length - 1) {
                    canvas.drawText(fullText, i2, i2 + 1, f3 - (fArr[i2] / 2.0f), this.f6527K[i2], this.f6529M);
                } else {
                    canvas.drawText(fullText, i2, i2 + 1, f3 - (fArr[i2] / 2.0f), this.f6527K[i2], this.f6528L);
                }
            } else {
                String str2 = this.f6519C;
                if (str2 != null) {
                    canvas.drawText(str2, f3 - (f2 / 2.0f), this.f6527K[i2], this.f6530N);
                }
            }
            if (this.f6531O == null) {
                m34283f(i2 <= length);
                RectF[] rectFArr2 = this.f6526J;
                canvas.drawLine(rectFArr2[i2].left, rectFArr2[i2].top, rectFArr2[i2].right, rectFArr2[i2].bottom, this.f6538V);
            }
            i2++;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        int paddingLeft;
        float f;
        float f2;
        float f3;
        int size;
        float f4;
        float f5;
        float f6;
        if (this.f6533Q) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode == 1073741824) {
                paddingLeft = View.MeasureSpec.getSize(i);
                f = paddingLeft;
                f2 = this.f6523G;
                f3 = this.f6521E;
            } else {
                if (mode2 == 1073741824) {
                    size = View.MeasureSpec.getSize(i2);
                    f4 = this.f6523G;
                    f5 = size * f4;
                    f6 = this.f6521E;
                } else if (mode == Integer.MIN_VALUE) {
                    paddingLeft = View.MeasureSpec.getSize(i);
                    f = paddingLeft;
                    f2 = this.f6523G;
                    f3 = this.f6521E;
                } else if (mode2 == Integer.MIN_VALUE) {
                    size = View.MeasureSpec.getSize(i2);
                    f4 = this.f6523G;
                    f5 = size * f4;
                    f6 = this.f6521E;
                } else {
                    paddingLeft = getPaddingLeft() + getPaddingRight() + getSuggestedMinimumWidth();
                    f = paddingLeft;
                    f2 = this.f6523G;
                    f3 = this.f6521E;
                }
                paddingLeft = (int) (f5 + ((f6 * f4) - 1.0f));
                setMeasuredDimension(EditText.resolveSizeAndState(paddingLeft, i, 1), EditText.resolveSizeAndState(size, i2, 0));
                return;
            }
            size = (int) ((f - (f2 - (f3 * 1.0f))) / f2);
            setMeasuredDimension(EditText.resolveSizeAndState(paddingLeft, i, 1), EditText.resolveSizeAndState(size, i2, 0));
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int m38466J;
        float f;
        super.onSizeChanged(i, i2, i3, i4);
        ColorStateList textColors = getTextColors();
        this.f6541b0 = textColors;
        if (textColors != null) {
            this.f6529M.setColor(textColors.getDefaultColor());
            this.f6528L.setColor(this.f6541b0.getDefaultColor());
            this.f6530N.setColor(getCurrentHintTextColor());
        }
        int width = (getWidth() - C1112b0.m38468I(this)) - C1112b0.m38466J(this);
        float f2 = this.f6521E;
        if (f2 < 0.0f) {
            this.f6522F = width / ((this.f6523G * 2.0f) - 1.0f);
        } else {
            float f3 = this.f6523G;
            this.f6522F = (width - (f2 * (f3 - 1.0f))) / f3;
        }
        float f4 = this.f6523G;
        this.f6526J = new RectF[(int) f4];
        this.f6527K = new float[(int) f4];
        int height = getHeight() - getPaddingBottom();
        int i5 = 1;
        if (C1112b0.m38476E(this) == 1) {
            i5 = -1;
            m38466J = (int) ((getWidth() - C1112b0.m38466J(this)) - this.f6522F);
        } else {
            m38466J = C1112b0.m38466J(this);
        }
        for (int i6 = 0; i6 < this.f6523G; i6++) {
            float f5 = m38466J;
            float f6 = height;
            this.f6526J[i6] = new RectF(f5, f6, this.f6522F + f5, f6);
            if (this.f6531O != null) {
                if (this.f6533Q) {
                    this.f6526J[i6].top = getPaddingTop();
                    RectF[] rectFArr = this.f6526J;
                    rectFArr[i6].right = rectFArr[i6].width() + f5;
                } else {
                    this.f6526J[i6].top -= this.f6532P.height() + (this.f6524H * 2.0f);
                }
            }
            float f7 = this.f6521E;
            if (f7 < 0.0f) {
                f = f5 + (i5 * this.f6522F * 2.0f);
            } else {
                f = f5 + (i5 * (this.f6522F + f7));
            }
            m38466J = (int) f;
            this.f6527K[i6] = this.f6526J[i6].bottom - this.f6524H;
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        setError(false);
        if (this.f6526J != null && this.f6539W) {
            int i4 = this.f6520D;
            if (i4 == -1) {
                invalidate();
            } else if (i3 > i2) {
                if (i4 == 0) {
                    m34286c();
                } else {
                    m34287b(charSequence, i);
                }
            }
        } else if (this.f6535S == null || charSequence.length() != this.f6525I) {
        } else {
            this.f6535S.mo34281a(charSequence);
        }
    }

    public void setAnimateText(boolean z) {
        this.f6539W = z;
    }

    @Override // androidx.appcompat.widget.C0494j, android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        throw new RuntimeException("setCustomSelectionActionModeCallback() not supported.");
    }

    public void setError(boolean z) {
        this.f6540a0 = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setInputType(int i) {
        super.setInputType(i);
        if ((i & 128) != 128 && (i & 16) != 16) {
            setMask(null);
        } else if (TextUtils.isEmpty(this.f6517A)) {
            setMask("●");
        }
    }

    public void setMask(String str) {
        this.f6517A = str;
        this.f6518B = null;
        invalidate();
    }

    public void setMaxLength(int i) {
        this.f6525I = i;
        this.f6523G = i;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        setText((CharSequence) null);
        invalidate();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f6534R = onClickListener;
    }

    public void setOnPinEnteredListener(InterfaceC2251i interfaceC2251i) {
        this.f6535S = interfaceC2251i;
    }

    public void setPinBackground(Drawable drawable) {
        this.f6531O = drawable;
        invalidate();
    }

    public void setPinLineColors(ColorStateList colorStateList) {
        this.f6544e0 = colorStateList;
        invalidate();
    }

    public void setSingleCharHint(String str) {
        this.f6519C = str;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        setCustomTypeface(typeface);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        super.setTypeface(typeface, i);
        setCustomTypeface(typeface);
    }
}
