package com.github.guilhe.views;

import android.animation.Animator;
import android.animation.FloatEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.content.C0928a;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.crypto.tink.shaded.protobuf.Reader;
import kotlin.Metadata;
import kotlin.TypeCastException;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* compiled from: QuantityPickerView.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002GHB\u0019\b\u0016\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007J\u0012\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010R*\u0010\u001b\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\"\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010&\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010-\u001a\u00020#2\u0006\u0010\n\u001a\u00020#8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R*\u00101\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001d\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u0010!R*\u00105\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001d\u001a\u0004\b3\u0010\u001f\"\u0004\b4\u0010!R*\u0010\n\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001d\u001a\u0004\b7\u0010\u001f\"\u0004\b8\u0010!R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006I"}, m20207d2 = {"Lcom/github/guilhe/views/QuantityPickerView;", "Landroid/view/View;", BuildConfig.VERSION_NAME, "resId", "Lyc/u;", "setButtonRemove", "setButtonAdd", "Landroid/animation/TimeInterpolator;", "interpolator", "setAnimationInterpolator", "value", "setLabelAlpha", "Landroid/graphics/Color;", "color", "setBackgroundColor", "setBackgroundColorResource", "Landroid/graphics/Bitmap;", "bitmap", "setButtonRemoveBitmap", "setButtonAddBitmap", BuildConfig.VERSION_NAME, "g0", "Ljava/lang/String;", "getTextLabelFormatter", "()Ljava/lang/String;", "setTextLabelFormatter", "(Ljava/lang/String;)V", "textLabelFormatter", "d0", "I", "getMin", "()I", "setMin", "(I)V", "min", BuildConfig.VERSION_NAME, "i0", "Z", "isAutoToggleEnabled", "()Z", "setAutoToggleEnabled", "(Z)V", "f0", "getShowLabel", "setShowLabel", "showLabel", "h0", "getTextLabelSize", "setTextLabelSize", "textLabelSize", "c0", "getMax", "setMax", "max", "e0", "getValue", "setValue", "Lcom/github/guilhe/views/QuantityPickerView$b;", "l0", "Lcom/github/guilhe/views/QuantityPickerView$b;", "getActionListener", "()Lcom/github/guilhe/views/QuantityPickerView$b;", "setActionListener", "(Lcom/github/guilhe/views/QuantityPickerView$b;)V", "actionListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "quantity-picker-view_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class QuantityPickerView extends View {

    /* renamed from: A */
    private boolean f6880A;

    /* renamed from: B */
    private final ColorFilter f6881B;

    /* renamed from: C */
    private int f6882C;

    /* renamed from: D */
    private int f6883D;

    /* renamed from: E */
    private boolean f6884E;

    /* renamed from: F */
    private boolean f6885F;

    /* renamed from: G */
    private ValueAnimator f6886G;

    /* renamed from: H */
    private ValueAnimator f6887H;

    /* renamed from: I */
    private float f6888I;

    /* renamed from: J */
    private float f6889J;

    /* renamed from: K */
    private RippleDrawable f6890K;

    /* renamed from: L */
    private int f6891L;

    /* renamed from: M */
    private Paint f6892M;

    /* renamed from: N */
    private Paint f6893N;

    /* renamed from: O */
    private Paint f6894O;

    /* renamed from: P */
    private Paint f6895P;

    /* renamed from: Q */
    private Rect f6896Q;

    /* renamed from: R */
    private Rect f6897R;

    /* renamed from: S */
    private Rect f6898S;

    /* renamed from: T */
    private Bitmap f6899T;

    /* renamed from: U */
    private Bitmap f6900U;

    /* renamed from: V */
    private final int f6901V;

    /* renamed from: W */
    private float f6902W;

    /* renamed from: a0 */
    private float f6903a0;

    /* renamed from: b0 */
    private EnumC2362a f6904b0;

    /* renamed from: c0 */
    private int f6905c0;

    /* renamed from: d0 */
    private int f6906d0;

    /* renamed from: e0 */
    private int f6907e0;

    /* renamed from: f0 */
    private boolean f6908f0;

    /* renamed from: g0 */
    private String f6909g0;

    /* renamed from: h0 */
    private int f6910h0;

    /* renamed from: i0 */
    private boolean f6911i0;

    /* renamed from: j0 */
    private boolean f6912j0;

    /* renamed from: k0 */
    private boolean f6913k0;

    /* renamed from: l0 */
    private InterfaceC2363b f6914l0;

    /* renamed from: w */
    private final int f6915w;

    /* renamed from: x */
    private final int f6916x;

    /* renamed from: y */
    private final int f6917y;

    /* renamed from: z */
    private TimeInterpolator f6918z;

    /* compiled from: QuantityPickerView.kt */
    /* renamed from: com.github.guilhe.views.QuantityPickerView$a */
    /* loaded from: classes.dex */
    public enum EnumC2362a {
        ADD,
        REMOVE
    }

    /* compiled from: QuantityPickerView.kt */
    /* renamed from: com.github.guilhe.views.QuantityPickerView$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2363b {
        /* renamed from: a */
        void m33786a(boolean z);

        /* renamed from: b */
        void m33785b(boolean z);

        /* renamed from: c */
        void m33784c(QuantityPickerView quantityPickerView, int i);
    }

    /* compiled from: QuantityPickerView.kt */
    /* renamed from: com.github.guilhe.views.QuantityPickerView$c */
    /* loaded from: classes.dex */
    public static final class C2364c extends FloatEvaluator {
        C2364c() {
        }
    }

    /* compiled from: QuantityPickerView.kt */
    /* renamed from: com.github.guilhe.views.QuantityPickerView$d */
    /* loaded from: classes.dex */
    public static final class C2365d implements Animator.AnimatorListener {
        C2365d() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            ValueAnimator m33812a;
            Intrinsics.m20926i(animator, "animation");
            QuantityPickerView.m33805h(QuantityPickerView.this, false);
            QuantityPickerView quantityPickerView = QuantityPickerView.this;
            QuantityPickerView.m33803j(quantityPickerView, QuantityPickerView.m33810c(quantityPickerView) == ((float) QuantityPickerView.m33808e(QuantityPickerView.this)) - ((float) QuantityPickerView.m33811b(QuantityPickerView.this).getWidth()));
            InterfaceC2363b actionListener = QuantityPickerView.this.getActionListener();
            if (actionListener != null) {
                actionListener.m33786a(QuantityPickerView.this.m33796q());
            }
            if (!QuantityPickerView.this.m33796q() || (m33812a = QuantityPickerView.m33812a(QuantityPickerView.this)) == null) {
                return;
            }
            m33812a.start();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            ValueAnimator m33812a;
            QuantityPickerView.m33805h(QuantityPickerView.this, true);
            if (QuantityPickerView.this.m33796q() && QuantityPickerView.m33809d(QuantityPickerView.this) > 0 && (m33812a = QuantityPickerView.m33812a(QuantityPickerView.this)) != null) {
                m33812a.start();
            }
            InterfaceC2363b actionListener = QuantityPickerView.this.getActionListener();
            if (actionListener != null) {
                actionListener.m33785b(true ^ QuantityPickerView.this.m33796q());
            }
        }
    }

    /* compiled from: QuantityPickerView.kt */
    /* renamed from: com.github.guilhe.views.QuantityPickerView$e */
    /* loaded from: classes.dex */
    public static final class C2366e implements Animator.AnimatorListener {
        C2366e() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            ValueAnimator m33807f;
            Intrinsics.m20926i(animator, "animation");
            QuantityPickerView.m33805h(QuantityPickerView.this, false);
            if (!QuantityPickerView.m33806g(QuantityPickerView.this) || (m33807f = QuantityPickerView.m33807f(QuantityPickerView.this)) == null) {
                return;
            }
            m33807f.start();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            QuantityPickerView.m33805h(QuantityPickerView.this, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QuantityPickerView.kt */
    /* renamed from: com.github.guilhe.views.QuantityPickerView$f */
    /* loaded from: classes.dex */
    public static final class C2367f implements ValueAnimator.AnimatorUpdateListener {
        C2367f() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.isNotNull(valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                QuantityPickerView.m33802k(QuantityPickerView.this, ((Float) animatedValue).floatValue(), EnumC2362a.ADD);
                QuantityPickerView.m33801l(QuantityPickerView.this);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QuantityPickerView.kt */
    /* renamed from: com.github.guilhe.views.QuantityPickerView$g */
    /* loaded from: classes.dex */
    public static final class C2368g implements ValueAnimator.AnimatorUpdateListener {
        C2368g() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            QuantityPickerView quantityPickerView = QuantityPickerView.this;
            Intrinsics.isNotNull(valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            QuantityPickerView.m33804i(quantityPickerView, (int) ((Float) animatedValue).floatValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuantityPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.m20926i(context, "context");
        Intrinsics.m20926i(attributeSet, "attrs");
        this.f6915w = 200;
        this.f6916x = 255;
        this.f6917y = Color.rgb(229, 240, 199);
        this.f6918z = new DecelerateInterpolator();
        this.f6881B = new PorterDuffColorFilter(1207959552, PorterDuff.Mode.SRC_ATOP);
        this.f6883D = 255;
        this.f6891L = 200;
        this.f6901V = 50;
        this.f6905c0 = Reader.READ_DONE;
        this.f6908f0 = true;
        this.f6909g0 = "%s";
        this.f6910h0 = m33799n(20);
        this.f6911i0 = true;
        m33793t(context, attributeSet);
    }

    /* renamed from: a */
    public static final /* synthetic */ ValueAnimator m33812a(QuantityPickerView quantityPickerView) {
        return quantityPickerView.f6887H;
    }

    /* renamed from: b */
    public static final /* synthetic */ Bitmap m33811b(QuantityPickerView quantityPickerView) {
        Bitmap bitmap = quantityPickerView.f6900U;
        if (bitmap == null) {
            Intrinsics.throwUninitPropException("btnAdd");
        }
        return bitmap;
    }

    /* renamed from: c */
    public static final /* synthetic */ float m33810c(QuantityPickerView quantityPickerView) {
        return quantityPickerView.f6889J;
    }

    /* renamed from: d */
    public static final /* synthetic */ int m33809d(QuantityPickerView quantityPickerView) {
        return quantityPickerView.f6883D;
    }

    /* renamed from: e */
    public static final /* synthetic */ int m33808e(QuantityPickerView quantityPickerView) {
        return quantityPickerView.f6891L;
    }

    /* renamed from: f */
    public static final /* synthetic */ ValueAnimator m33807f(QuantityPickerView quantityPickerView) {
        return quantityPickerView.f6886G;
    }

    /* renamed from: g */
    public static final /* synthetic */ boolean m33806g(QuantityPickerView quantityPickerView) {
        return quantityPickerView.f6884E;
    }

    /* renamed from: h */
    public static final /* synthetic */ void m33805h(QuantityPickerView quantityPickerView, boolean z) {
        quantityPickerView.f6885F = z;
    }

    /* renamed from: i */
    public static final /* synthetic */ void m33804i(QuantityPickerView quantityPickerView, int i) {
        quantityPickerView.setLabelAlpha(i);
    }

    /* renamed from: j */
    public static final /* synthetic */ void m33803j(QuantityPickerView quantityPickerView, boolean z) {
        quantityPickerView.f6912j0 = z;
    }

    /* renamed from: k */
    public static final /* synthetic */ void m33802k(QuantityPickerView quantityPickerView, float f, EnumC2362a enumC2362a) {
        quantityPickerView.m33789x(f, enumC2362a);
    }

    /* renamed from: l */
    public static final /* synthetic */ void m33801l(QuantityPickerView quantityPickerView) {
        quantityPickerView.m33787z();
    }

    /* renamed from: m */
    private final EnumC2362a m33800m(float f, float f2) {
        Rect rect = this.f6898S;
        if (rect == null) {
            Intrinsics.throwUninitPropException("addButtonRect");
        }
        int i = (int) f;
        int i2 = (int) f2;
        if (rect.contains(i, i2)) {
            return EnumC2362a.ADD;
        }
        Rect rect2 = this.f6897R;
        if (rect2 == null) {
            Intrinsics.throwUninitPropException("removeButtonRect");
        }
        if (rect2.contains(i, i2)) {
            return EnumC2362a.REMOVE;
        }
        return null;
    }

    /* renamed from: n */
    private final int m33799n(int i) {
        Resources system = Resources.getSystem();
        Intrinsics.isNotNull(system, "Resources.getSystem()");
        return (int) Math.ceil(i * system.getDisplayMetrics().density);
    }

    /* renamed from: o */
    private final void m33798o(Canvas canvas, Paint paint, String str) {
        Rect rect = new Rect();
        canvas.getClipBounds(rect);
        int height = rect.height();
        int width = rect.width();
        paint.setTextAlign(Paint.Align.LEFT);
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
    }

    /* renamed from: p */
    private final ValueAnimator m33797p(float f, float f2, long j, TimeInterpolator timeInterpolator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(timeInterpolator);
        valueAnimator.setDuration(j);
        valueAnimator.setObjectValues(Float.valueOf(f), Float.valueOf(f2));
        valueAnimator.setEvaluator(new C2364c());
        valueAnimator.addUpdateListener(animatorUpdateListener);
        return valueAnimator;
    }

    /* renamed from: r */
    private final void m33795r(Bitmap bitmap, boolean z) {
        this.f6900U = bitmap;
        if (z) {
            requestLayout();
        }
    }

    /* renamed from: s */
    private final void m33794s(Bitmap bitmap, boolean z) {
        this.f6899T = bitmap;
        if (z) {
            requestLayout();
        }
    }

    private final void setAnimationInterpolator(TimeInterpolator timeInterpolator) {
        this.f6918z = timeInterpolator;
    }

    private final void setButtonAdd(int i) {
        Drawable m39111f = C0928a.m39111f(getContext(), i);
        if (m39111f != null) {
            Bitmap createBitmap = Bitmap.createBitmap(m39111f.getIntrinsicWidth(), m39111f.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.isNotNull(createBitmap, "Bitmap.createBitmap(it.i… Bitmap.Config.ARGB_8888)");
            this.f6900U = createBitmap;
            m39111f.setBounds(0, 0, m39111f.getIntrinsicWidth(), m39111f.getIntrinsicHeight());
            Bitmap bitmap = this.f6900U;
            if (bitmap == null) {
                Intrinsics.throwUninitPropException("btnAdd");
            }
            m39111f.draw(new Canvas(bitmap));
            Bitmap bitmap2 = this.f6900U;
            if (bitmap2 == null) {
                Intrinsics.throwUninitPropException("btnAdd");
            }
            setButtonAddBitmap(bitmap2);
        }
    }

    private final void setButtonRemove(int i) {
        Drawable m39111f = C0928a.m39111f(getContext(), i);
        if (m39111f != null) {
            Bitmap createBitmap = Bitmap.createBitmap(m39111f.getIntrinsicWidth(), m39111f.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.isNotNull(createBitmap, "Bitmap.createBitmap(it.i… Bitmap.Config.ARGB_8888)");
            this.f6899T = createBitmap;
            m39111f.setBounds(0, 0, m39111f.getIntrinsicWidth(), m39111f.getIntrinsicHeight());
            Bitmap bitmap = this.f6899T;
            if (bitmap == null) {
                Intrinsics.throwUninitPropException("btnRemove");
            }
            m39111f.draw(new Canvas(bitmap));
            Bitmap bitmap2 = this.f6899T;
            if (bitmap2 == null) {
                Intrinsics.throwUninitPropException("btnRemove");
            }
            setButtonAddBitmap(bitmap2);
        }
    }

    private final void setLabelAlpha(int i) {
        this.f6883D = i;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[Catch: all -> 0x012a, TryCatch #1 {all -> 0x012a, blocks: (B:3:0x000e, B:7:0x0046, B:10:0x0053, B:13:0x0059, B:15:0x0063, B:16:0x0067, B:6:0x0044), top: B:36:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m33793t(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.guilhe.views.QuantityPickerView.m33793t(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: w */
    public static /* synthetic */ void m33790w(QuantityPickerView quantityPickerView, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        quantityPickerView.m33792u(j);
    }

    /* renamed from: x */
    private final void m33789x(float f, EnumC2362a enumC2362a) {
        if (enumC2362a == EnumC2362a.ADD) {
            this.f6889J = f;
        } else {
            this.f6888I = f;
        }
        requestLayout();
    }

    /* renamed from: y */
    private final boolean m33788y() {
        invalidate();
        InterfaceC2363b interfaceC2363b = this.f6914l0;
        if (interfaceC2363b != null) {
            interfaceC2363b.m33784c(this, this.f6907e0);
            return true;
        }
        return true;
    }

    /* renamed from: z */
    private final void m33787z() {
        int i = (int) this.f6888I;
        Bitmap bitmap = this.f6899T;
        if (bitmap == null) {
            Intrinsics.throwUninitPropException("btnRemove");
        }
        int width = bitmap.getWidth();
        Bitmap bitmap2 = this.f6899T;
        if (bitmap2 == null) {
            Intrinsics.throwUninitPropException("btnRemove");
        }
        this.f6897R = new Rect(i, 0, width, bitmap2.getHeight());
        int i2 = (int) this.f6889J;
        int measuredWidth = getMeasuredWidth();
        Bitmap bitmap3 = this.f6900U;
        if (bitmap3 == null) {
            Intrinsics.throwUninitPropException("btnAdd");
        }
        this.f6898S = new Rect(i2, 0, measuredWidth, bitmap3.getHeight());
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        RippleDrawable rippleDrawable = this.f6890K;
        if (rippleDrawable != null) {
            rippleDrawable.setHotspot(f, f2);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        RippleDrawable rippleDrawable = this.f6890K;
        if (rippleDrawable != null) {
            rippleDrawable.setState(getDrawableState());
        }
    }

    public final InterfaceC2363b getActionListener() {
        return this.f6914l0;
    }

    public final int getMax() {
        return this.f6905c0;
    }

    public final int getMin() {
        return this.f6906d0;
    }

    public final boolean getShowLabel() {
        return this.f6908f0;
    }

    public final String getTextLabelFormatter() {
        return this.f6909g0;
    }

    public final int getTextLabelSize() {
        return this.f6910h0;
    }

    public final int getValue() {
        return this.f6907e0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7 A[Catch: all -> 0x0168, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000d, B:6:0x0012, B:8:0x0018, B:9:0x001d, B:11:0x002c, B:12:0x0031, B:14:0x0046, B:15:0x004b, B:17:0x0054, B:18:0x0059, B:20:0x005d, B:21:0x0062, B:25:0x006e, B:27:0x0079, B:29:0x007d, B:30:0x0082, B:31:0x00a5, B:34:0x00ab, B:35:0x00ae, B:39:0x00b5, B:42:0x00bb, B:43:0x00be, B:46:0x00c3, B:48:0x00c7, B:49:0x00cc, B:51:0x00d2, B:52:0x00d7, B:54:0x00db, B:55:0x00e0, B:58:0x00ee, B:60:0x00f2, B:62:0x00fd, B:63:0x0102, B:65:0x0108, B:66:0x010d, B:69:0x0113, B:70:0x0115, B:74:0x0123, B:77:0x0129, B:80:0x012f, B:84:0x013a, B:86:0x013f, B:88:0x0143, B:89:0x0148, B:93:0x0157, B:90:0x014d, B:92:0x0151, B:81:0x0133, B:24:0x006c), top: B:99:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2 A[Catch: all -> 0x0168, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000d, B:6:0x0012, B:8:0x0018, B:9:0x001d, B:11:0x002c, B:12:0x0031, B:14:0x0046, B:15:0x004b, B:17:0x0054, B:18:0x0059, B:20:0x005d, B:21:0x0062, B:25:0x006e, B:27:0x0079, B:29:0x007d, B:30:0x0082, B:31:0x00a5, B:34:0x00ab, B:35:0x00ae, B:39:0x00b5, B:42:0x00bb, B:43:0x00be, B:46:0x00c3, B:48:0x00c7, B:49:0x00cc, B:51:0x00d2, B:52:0x00d7, B:54:0x00db, B:55:0x00e0, B:58:0x00ee, B:60:0x00f2, B:62:0x00fd, B:63:0x0102, B:65:0x0108, B:66:0x010d, B:69:0x0113, B:70:0x0115, B:74:0x0123, B:77:0x0129, B:80:0x012f, B:84:0x013a, B:86:0x013f, B:88:0x0143, B:89:0x0148, B:93:0x0157, B:90:0x014d, B:92:0x0151, B:81:0x0133, B:24:0x006c), top: B:99:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db A[Catch: all -> 0x0168, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000d, B:6:0x0012, B:8:0x0018, B:9:0x001d, B:11:0x002c, B:12:0x0031, B:14:0x0046, B:15:0x004b, B:17:0x0054, B:18:0x0059, B:20:0x005d, B:21:0x0062, B:25:0x006e, B:27:0x0079, B:29:0x007d, B:30:0x0082, B:31:0x00a5, B:34:0x00ab, B:35:0x00ae, B:39:0x00b5, B:42:0x00bb, B:43:0x00be, B:46:0x00c3, B:48:0x00c7, B:49:0x00cc, B:51:0x00d2, B:52:0x00d7, B:54:0x00db, B:55:0x00e0, B:58:0x00ee, B:60:0x00f2, B:62:0x00fd, B:63:0x0102, B:65:0x0108, B:66:0x010d, B:69:0x0113, B:70:0x0115, B:74:0x0123, B:77:0x0129, B:80:0x012f, B:84:0x013a, B:86:0x013f, B:88:0x0143, B:89:0x0148, B:93:0x0157, B:90:0x014d, B:92:0x0151, B:81:0x0133, B:24:0x006c), top: B:99:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd A[Catch: all -> 0x0168, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000d, B:6:0x0012, B:8:0x0018, B:9:0x001d, B:11:0x002c, B:12:0x0031, B:14:0x0046, B:15:0x004b, B:17:0x0054, B:18:0x0059, B:20:0x005d, B:21:0x0062, B:25:0x006e, B:27:0x0079, B:29:0x007d, B:30:0x0082, B:31:0x00a5, B:34:0x00ab, B:35:0x00ae, B:39:0x00b5, B:42:0x00bb, B:43:0x00be, B:46:0x00c3, B:48:0x00c7, B:49:0x00cc, B:51:0x00d2, B:52:0x00d7, B:54:0x00db, B:55:0x00e0, B:58:0x00ee, B:60:0x00f2, B:62:0x00fd, B:63:0x0102, B:65:0x0108, B:66:0x010d, B:69:0x0113, B:70:0x0115, B:74:0x0123, B:77:0x0129, B:80:0x012f, B:84:0x013a, B:86:0x013f, B:88:0x0143, B:89:0x0148, B:93:0x0157, B:90:0x014d, B:92:0x0151, B:81:0x0133, B:24:0x006c), top: B:99:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0108 A[Catch: all -> 0x0168, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000d, B:6:0x0012, B:8:0x0018, B:9:0x001d, B:11:0x002c, B:12:0x0031, B:14:0x0046, B:15:0x004b, B:17:0x0054, B:18:0x0059, B:20:0x005d, B:21:0x0062, B:25:0x006e, B:27:0x0079, B:29:0x007d, B:30:0x0082, B:31:0x00a5, B:34:0x00ab, B:35:0x00ae, B:39:0x00b5, B:42:0x00bb, B:43:0x00be, B:46:0x00c3, B:48:0x00c7, B:49:0x00cc, B:51:0x00d2, B:52:0x00d7, B:54:0x00db, B:55:0x00e0, B:58:0x00ee, B:60:0x00f2, B:62:0x00fd, B:63:0x0102, B:65:0x0108, B:66:0x010d, B:69:0x0113, B:70:0x0115, B:74:0x0123, B:77:0x0129, B:80:0x012f, B:84:0x013a, B:86:0x013f, B:88:0x0143, B:89:0x0148, B:93:0x0157, B:90:0x014d, B:92:0x0151, B:81:0x0133, B:24:0x006c), top: B:99:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0129 A[Catch: all -> 0x0168, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000d, B:6:0x0012, B:8:0x0018, B:9:0x001d, B:11:0x002c, B:12:0x0031, B:14:0x0046, B:15:0x004b, B:17:0x0054, B:18:0x0059, B:20:0x005d, B:21:0x0062, B:25:0x006e, B:27:0x0079, B:29:0x007d, B:30:0x0082, B:31:0x00a5, B:34:0x00ab, B:35:0x00ae, B:39:0x00b5, B:42:0x00bb, B:43:0x00be, B:46:0x00c3, B:48:0x00c7, B:49:0x00cc, B:51:0x00d2, B:52:0x00d7, B:54:0x00db, B:55:0x00e0, B:58:0x00ee, B:60:0x00f2, B:62:0x00fd, B:63:0x0102, B:65:0x0108, B:66:0x010d, B:69:0x0113, B:70:0x0115, B:74:0x0123, B:77:0x0129, B:80:0x012f, B:84:0x013a, B:86:0x013f, B:88:0x0143, B:89:0x0148, B:93:0x0157, B:90:0x014d, B:92:0x0151, B:81:0x0133, B:24:0x006c), top: B:99:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0133 A[Catch: all -> 0x0168, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000d, B:6:0x0012, B:8:0x0018, B:9:0x001d, B:11:0x002c, B:12:0x0031, B:14:0x0046, B:15:0x004b, B:17:0x0054, B:18:0x0059, B:20:0x005d, B:21:0x0062, B:25:0x006e, B:27:0x0079, B:29:0x007d, B:30:0x0082, B:31:0x00a5, B:34:0x00ab, B:35:0x00ae, B:39:0x00b5, B:42:0x00bb, B:43:0x00be, B:46:0x00c3, B:48:0x00c7, B:49:0x00cc, B:51:0x00d2, B:52:0x00d7, B:54:0x00db, B:55:0x00e0, B:58:0x00ee, B:60:0x00f2, B:62:0x00fd, B:63:0x0102, B:65:0x0108, B:66:0x010d, B:69:0x0113, B:70:0x0115, B:74:0x0123, B:77:0x0129, B:80:0x012f, B:84:0x013a, B:86:0x013f, B:88:0x0143, B:89:0x0148, B:93:0x0157, B:90:0x014d, B:92:0x0151, B:81:0x0133, B:24:0x006c), top: B:99:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013f A[Catch: all -> 0x0168, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000d, B:6:0x0012, B:8:0x0018, B:9:0x001d, B:11:0x002c, B:12:0x0031, B:14:0x0046, B:15:0x004b, B:17:0x0054, B:18:0x0059, B:20:0x005d, B:21:0x0062, B:25:0x006e, B:27:0x0079, B:29:0x007d, B:30:0x0082, B:31:0x00a5, B:34:0x00ab, B:35:0x00ae, B:39:0x00b5, B:42:0x00bb, B:43:0x00be, B:46:0x00c3, B:48:0x00c7, B:49:0x00cc, B:51:0x00d2, B:52:0x00d7, B:54:0x00db, B:55:0x00e0, B:58:0x00ee, B:60:0x00f2, B:62:0x00fd, B:63:0x0102, B:65:0x0108, B:66:0x010d, B:69:0x0113, B:70:0x0115, B:74:0x0123, B:77:0x0129, B:80:0x012f, B:84:0x013a, B:86:0x013f, B:88:0x0143, B:89:0x0148, B:93:0x0157, B:90:0x014d, B:92:0x0151, B:81:0x0133, B:24:0x006c), top: B:99:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014d A[Catch: all -> 0x0168, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000d, B:6:0x0012, B:8:0x0018, B:9:0x001d, B:11:0x002c, B:12:0x0031, B:14:0x0046, B:15:0x004b, B:17:0x0054, B:18:0x0059, B:20:0x005d, B:21:0x0062, B:25:0x006e, B:27:0x0079, B:29:0x007d, B:30:0x0082, B:31:0x00a5, B:34:0x00ab, B:35:0x00ae, B:39:0x00b5, B:42:0x00bb, B:43:0x00be, B:46:0x00c3, B:48:0x00c7, B:49:0x00cc, B:51:0x00d2, B:52:0x00d7, B:54:0x00db, B:55:0x00e0, B:58:0x00ee, B:60:0x00f2, B:62:0x00fd, B:63:0x0102, B:65:0x0108, B:66:0x010d, B:69:0x0113, B:70:0x0115, B:74:0x0123, B:77:0x0129, B:80:0x012f, B:84:0x013a, B:86:0x013f, B:88:0x0143, B:89:0x0148, B:93:0x0157, B:90:0x014d, B:92:0x0151, B:81:0x0133, B:24:0x006c), top: B:99:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected synchronized void onDraw(android.graphics.Canvas r9) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.guilhe.views.QuantityPickerView.onDraw(android.graphics.Canvas):void");
    }

    protected synchronized void onMeasure(int i, int i2) {
        Bitmap bitmap;
        float f;
        RippleDrawable rippleDrawable;
        int i3 = this.f6915w;
        if (View.MeasureSpec.getMode(i) != 0) {
            i3 = View.MeasureSpec.getSize(i);
        }
        Bitmap bitmap2 = this.f6899T;
        if (bitmap2 == null) {
            Intrinsics.throwUninitPropException("btnRemove");
        }
        int height = bitmap2.getHeight();
        Bitmap bitmap3 = this.f6900U;
        if (bitmap3 == null) {
            Intrinsics.throwUninitPropException("btnAdd");
        }
        int max = Math.max(height, bitmap3.getHeight());
        if (View.MeasureSpec.getMode(i2) != 0) {
            max = Math.min(max, View.MeasureSpec.getSize(i2));
        }
        setMeasuredDimension(i3, max);
        this.f6891L = i3;
        if (this.f6880A) {
            this.f6880A = false;
            if (this.f6912j0) {
                Bitmap bitmap4 = this.f6900U;
                if (bitmap4 == null) {
                    Intrinsics.throwUninitPropException("btnAdd");
                }
                f = i3 - bitmap4.getWidth();
            } else {
                f = 0.0f;
            }
            this.f6889J = f;
            this.f6888I = 0.0f;
            m33787z();
            if (this.f6913k0 && (rippleDrawable = this.f6890K) != null) {
                Rect rect = this.f6898S;
                if (rect == null) {
                    Intrinsics.throwUninitPropException("addButtonRect");
                }
                rippleDrawable.setRadius(rect.height() / 2);
            }
        }
        float f2 = this.f6889J;
        if (this.f6900U == null) {
            Intrinsics.throwUninitPropException("btnAdd");
        }
        setMeasuredDimension((int) (f2 + bitmap.getWidth()), max);
        C13195u c13195u = C13195u.f34156a;
        m33787z();
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        Intrinsics.m20926i(parcelable, "parcel");
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("SUPER"));
        setValue(bundle.getInt("VALUE"));
        setMin(bundle.getInt("MIN"));
        setMax(bundle.getInt("MAX"));
        setShowLabel(bundle.getBoolean("LABEL_SHOW", true));
        setTextLabelSize(bundle.getInt("LABEL_SIZE"));
        this.f6883D = bundle.getInt("LABEL_ALPHA");
        String string = bundle.getString("LABEL_FORMATTER", "%s");
        Intrinsics.isNotNull(string, "bundle.getString(\"LABEL_FORMATTER\", \"%s\")");
        setTextLabelFormatter(string);
        this.f6912j0 = bundle.getBoolean("IS_OPEN", false);
        this.f6911i0 = bundle.getBoolean("AUTO_TOGGLE", true);
    }

    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUPER", super.onSaveInstanceState());
        bundle.putInt("VALUE", this.f6907e0);
        bundle.putInt("MIN", this.f6906d0);
        bundle.putInt("MAX", this.f6905c0);
        bundle.putBoolean("LABEL_SHOW", this.f6908f0);
        bundle.putInt("LABEL_SIZE", this.f6910h0);
        bundle.putInt("LABEL_ALPHA", this.f6883D);
        bundle.putString("LABEL_FORMATTER", this.f6909g0);
        bundle.putBoolean("IS_OPEN", this.f6912j0);
        bundle.putBoolean("AUTO_TOGGLE", this.f6911i0);
        return bundle;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.m20926i(motionEvent, "event");
        if (!isEnabled() || this.f6885F) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setPressed(true);
            this.f6902W = motionEvent.getX();
            float y = motionEvent.getY();
            this.f6903a0 = y;
            EnumC2362a m33800m = m33800m(this.f6902W, y);
            if (m33800m != null) {
                this.f6904b0 = m33800m;
                invalidate();
            }
            return true;
        } else if (action != 1) {
            if (action == 3 || action == 4) {
                this.f6904b0 = null;
                invalidate();
                return true;
            }
            return true;
        } else {
            setPressed(false);
            float abs = Math.abs(this.f6902W - motionEvent.getX());
            float abs2 = Math.abs(this.f6903a0 - motionEvent.getY());
            int i = this.f6901V;
            if (abs <= i && abs2 <= i) {
                EnumC2362a enumC2362a = this.f6904b0;
                if (enumC2362a != null) {
                    if (enumC2362a == null) {
                        Intrinsics.m20916s();
                    }
                    if (enumC2362a == EnumC2362a.ADD) {
                        this.f6904b0 = null;
                        if (!this.f6912j0) {
                            m33790w(this, 0L, 1, null);
                        }
                        int i2 = this.f6907e0;
                        if (i2 < this.f6905c0) {
                            setValue(i2 + 1);
                            return m33788y();
                        }
                    }
                }
                EnumC2362a enumC2362a2 = this.f6904b0;
                if (enumC2362a2 != null) {
                    if (enumC2362a2 == null) {
                        Intrinsics.m20916s();
                    }
                    if (enumC2362a2 == EnumC2362a.REMOVE) {
                        this.f6904b0 = null;
                        int i3 = this.f6907e0;
                        if (i3 > this.f6906d0) {
                            setValue(i3 - 1);
                            if (this.f6907e0 == 0 && this.f6911i0 && this.f6912j0) {
                                m33790w(this, 0L, 1, null);
                            }
                            return m33788y();
                        } else if (this.f6911i0 && this.f6912j0) {
                            m33790w(this, 0L, 1, null);
                        }
                    }
                }
            }
            this.f6904b0 = null;
            invalidate();
            return true;
        }
    }

    /* renamed from: q */
    public final boolean m33796q() {
        return this.f6912j0;
    }

    public final void setActionListener(InterfaceC2363b interfaceC2363b) {
        this.f6914l0 = interfaceC2363b;
    }

    public final void setAutoToggleEnabled(boolean z) {
        this.f6911i0 = z;
    }

    public final void setBackgroundColor(Color color) {
        Intrinsics.m20926i(color, "color");
        setBackgroundColor(color.toArgb());
    }

    public final void setBackgroundColorResource(int i) {
        setBackgroundColor(getContext().getColor(i));
    }

    public final void setButtonAddBitmap(Bitmap bitmap) {
        Intrinsics.m20926i(bitmap, "bitmap");
        m33795r(bitmap, true);
    }

    public final void setButtonRemoveBitmap(Bitmap bitmap) {
        Intrinsics.m20926i(bitmap, "bitmap");
        m33794s(bitmap, true);
    }

    public final void setMax(int i) {
        this.f6905c0 = i;
        invalidate();
    }

    public final void setMin(int i) {
        this.f6906d0 = i;
        invalidate();
    }

    public final void setShowLabel(boolean z) {
        this.f6908f0 = z;
        invalidate();
    }

    public final void setTextLabelFormatter(String str) {
        Intrinsics.m20926i(str, "value");
        this.f6909g0 = str;
        invalidate();
    }

    public final void setTextLabelSize(int i) {
        this.f6910h0 = i;
        invalidate();
    }

    public final void setValue(int i) {
        this.f6907e0 = i;
        invalidate();
    }

    /* renamed from: u */
    public final void m33792u(long j) {
        m33791v(j, this.f6918z);
    }

    /* renamed from: v */
    public final void m33791v(long j, TimeInterpolator timeInterpolator) {
        Bitmap bitmap;
        float width;
        Intrinsics.m20926i(timeInterpolator, "interpolator");
        ValueAnimator valueAnimator = this.f6886G;
        if (valueAnimator != null) {
            if (valueAnimator == null) {
                Intrinsics.m20916s();
            }
            if (valueAnimator.isRunning()) {
                return;
            }
        }
        float f = this.f6889J;
        if (this.f6912j0) {
            width = 0.0f;
        } else {
            float f2 = this.f6891L;
            if (this.f6900U == null) {
                Intrinsics.throwUninitPropException("btnAdd");
            }
            width = f2 - bitmap.getWidth();
        }
        ValueAnimator m33797p = m33797p(f, width, j, timeInterpolator, new C2367f());
        m33797p.addListener(new C2365d());
        this.f6886G = m33797p;
        ValueAnimator m33797p2 = m33797p(this.f6883D, this.f6912j0 ? 0.0f : this.f6916x, j > 0 ? j / 3 : 0L, new LinearInterpolator(), new C2368g());
        m33797p2.addListener(new C2366e());
        this.f6887H = m33797p2;
        if (this.f6912j0) {
            this.f6884E = true;
            m33797p2.start();
            return;
        }
        this.f6884E = false;
        ValueAnimator valueAnimator2 = this.f6886G;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        Intrinsics.m20926i(drawable, "who");
        return Intrinsics.equals(drawable, this.f6890K) || super.verifyDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        this.f6882C = i;
        invalidate();
    }
}
