package p366t8;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.InterfaceC0985b;
import p401v8.C11141g;
import p401v8.C11148k;
import p401v8.InterfaceC11164n;

/* renamed from: t8.a */
/* loaded from: classes.dex */
public class C10396a extends Drawable implements InterfaceC11164n, InterfaceC0985b {

    /* renamed from: w */
    private C10398b f27021w;

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a */
    public C10396a mutate() {
        this.f27021w = new C10398b(this.f27021w);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C10398b c10398b = this.f27021w;
        if (c10398b.f27023b) {
            c10398b.f27022a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f27021w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f27021w.f27022a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f27021w.f27022a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f27021w.f27022a.setState(iArr)) {
            onStateChange = true;
        }
        boolean m8070e = C10399b.m8070e(iArr);
        C10398b c10398b = this.f27021w;
        if (c10398b.f27023b != m8070e) {
            c10398b.f27023b = m8070e;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f27021w.f27022a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f27021w.f27022a.setColorFilter(colorFilter);
    }

    @Override // p401v8.InterfaceC11164n
    public void setShapeAppearanceModel(C11148k c11148k) {
        this.f27021w.f27022a.setShapeAppearanceModel(c11148k);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0985b
    public void setTint(int i) {
        this.f27021w.f27022a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0985b
    public void setTintList(ColorStateList colorStateList) {
        this.f27021w.f27022a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0985b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f27021w.f27022a.setTintMode(mode);
    }

    public C10396a(C11148k c11148k) {
        this(new C10398b(new C11141g(c11148k)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RippleDrawableCompat.java */
    /* renamed from: t8.a$b */
    /* loaded from: classes.dex */
    public static final class C10398b extends Drawable.ConstantState {

        /* renamed from: a */
        C11141g f27022a;

        /* renamed from: b */
        boolean f27023b;

        public C10398b(C11141g c11141g) {
            this.f27022a = c11141g;
            this.f27023b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a */
        public C10396a newDrawable() {
            return new C10396a(new C10398b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public C10398b(C10398b c10398b) {
            this.f27022a = (C11141g) c10398b.f27022a.getConstantState().newDrawable();
            this.f27023b = c10398b.f27023b;
        }
    }

    private C10396a(C10398b c10398b) {
        this.f27021w = c10398b;
    }
}
