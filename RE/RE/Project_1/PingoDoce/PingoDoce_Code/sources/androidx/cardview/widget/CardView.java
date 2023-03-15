package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p284p.C8328a;
import p284p.C8329b;
import p284p.C8331d;
import p284p.C8332e;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: D */
    private static final int[] f1920D = {16842801};

    /* renamed from: E */
    private static final InterfaceC0623e f1921E;

    /* renamed from: A */
    final Rect f1922A;

    /* renamed from: B */
    final Rect f1923B;

    /* renamed from: C */
    private final InterfaceC0622d f1924C;

    /* renamed from: w */
    private boolean f1925w;

    /* renamed from: x */
    private boolean f1926x;

    /* renamed from: y */
    int f1927y;

    /* renamed from: z */
    int f1928z;

    /* renamed from: androidx.cardview.widget.CardView$a */
    /* loaded from: classes.dex */
    class C0616a implements InterfaceC0622d {

        /* renamed from: a */
        private Drawable f1929a;

        C0616a() {
        }

        @Override // androidx.cardview.widget.InterfaceC0622d
        /* renamed from: a */
        public void mo40091a(int i, int i2, int i3, int i4) {
            CardView.this.f1923B.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1922A;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        @Override // androidx.cardview.widget.InterfaceC0622d
        /* renamed from: b */
        public View mo40090b() {
            return CardView.this;
        }

        @Override // androidx.cardview.widget.InterfaceC0622d
        /* renamed from: c */
        public void mo40089c(int i, int i2) {
            CardView cardView = CardView.this;
            if (i > cardView.f1927y) {
                CardView.super.setMinimumWidth(i);
            }
            CardView cardView2 = CardView.this;
            if (i2 > cardView2.f1928z) {
                CardView.super.setMinimumHeight(i2);
            }
        }

        @Override // androidx.cardview.widget.InterfaceC0622d
        /* renamed from: d */
        public void mo40088d(Drawable drawable) {
            this.f1929a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.InterfaceC0622d
        /* renamed from: e */
        public boolean mo40087e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.InterfaceC0622d
        /* renamed from: f */
        public boolean mo40086f() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.InterfaceC0622d
        /* renamed from: g */
        public Drawable mo40085g() {
            return this.f1929a;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f1921E = new C0619b();
        } else if (i >= 17) {
            f1921E = new C0617a();
        } else {
            f1921E = new C0620c();
        }
        f1921E.mo40078g();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8328a.cardViewStyle);
    }

    /* renamed from: f */
    public void m40095f(int i, int i2, int i3, int i4) {
        this.f1922A.set(i, i2, i3, i4);
        f1921E.mo40079f(this.f1924C);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1921E.mo40083b(this.f1924C);
    }

    public float getCardElevation() {
        return f1921E.mo40080e(this.f1924C);
    }

    public int getContentPaddingBottom() {
        return this.f1922A.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1922A.left;
    }

    public int getContentPaddingRight() {
        return this.f1922A.right;
    }

    public int getContentPaddingTop() {
        return this.f1922A.top;
    }

    public float getMaxCardElevation() {
        return f1921E.mo40084a(this.f1924C);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1926x;
    }

    public float getRadius() {
        return f1921E.mo40077h(this.f1924C);
    }

    public boolean getUseCompatPadding() {
        return this.f1925w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        InterfaceC0623e interfaceC0623e = f1921E;
        if (!(interfaceC0623e instanceof C0619b)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(interfaceC0623e.mo40075j(this.f1924C)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(interfaceC0623e.mo40076i(this.f1924C)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f1921E.mo40071n(this.f1924C, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        f1921E.mo40073l(this.f1924C, f);
    }

    public void setMaxCardElevation(float f) {
        f1921E.mo40070o(this.f1924C, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f1928z = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.f1927y = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1926x) {
            this.f1926x = z;
            f1921E.mo40072m(this.f1924C);
        }
    }

    public void setRadius(float f) {
        f1921E.mo40081d(this.f1924C, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1925w != z) {
            this.f1925w = z;
            f1921E.mo40074k(this.f1924C);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1922A = rect;
        this.f1923B = new Rect();
        C0616a c0616a = new C0616a();
        this.f1924C = c0616a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8332e.f21566a, i, C8331d.f21565a);
        int i2 = C8332e.f21569d;
        if (obtainStyledAttributes.hasValue(i2)) {
            valueOf = obtainStyledAttributes.getColorStateList(i2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1920D);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(C8329b.cardview_light_background);
            } else {
                color = getResources().getColor(C8329b.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C8332e.f21570e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C8332e.f21571f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C8332e.f21572g, 0.0f);
        this.f1925w = obtainStyledAttributes.getBoolean(C8332e.f21574i, false);
        this.f1926x = obtainStyledAttributes.getBoolean(C8332e.f21573h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C8332e.f21575j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(C8332e.f21577l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(C8332e.f21579n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(C8332e.f21578m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(C8332e.f21576k, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1927y = obtainStyledAttributes.getDimensionPixelSize(C8332e.f21567b, 0);
        this.f1928z = obtainStyledAttributes.getDimensionPixelSize(C8332e.f21568c, 0);
        obtainStyledAttributes.recycle();
        f1921E.mo40082c(c0616a, context, colorStateList, dimension, dimension2, f);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1921E.mo40071n(this.f1924C, colorStateList);
    }
}
