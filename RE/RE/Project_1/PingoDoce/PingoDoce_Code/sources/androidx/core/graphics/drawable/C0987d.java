package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.drawable.d */
/* loaded from: classes.dex */
public class C0987d extends Drawable implements Drawable.Callback, InterfaceC0986c, InterfaceC0985b {

    /* renamed from: C */
    static final PorterDuff.Mode f3277C = PorterDuff.Mode.SRC_IN;

    /* renamed from: A */
    private boolean f3278A;

    /* renamed from: B */
    Drawable f3279B;

    /* renamed from: w */
    private int f3280w;

    /* renamed from: x */
    private PorterDuff.Mode f3281x;

    /* renamed from: y */
    private boolean f3282y;

    /* renamed from: z */
    C0989f f3283z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0987d(C0989f c0989f, Resources resources) {
        this.f3283z = c0989f;
        m38839e(resources);
    }

    /* renamed from: d */
    private C0989f m38840d() {
        return new C0989f(this.f3283z);
    }

    /* renamed from: e */
    private void m38839e(Resources resources) {
        Drawable.ConstantState constantState;
        C0989f c0989f = this.f3283z;
        if (c0989f == null || (constantState = c0989f.f3286b) == null) {
            return;
        }
        mo38842a(constantState.newDrawable(resources));
    }

    /* renamed from: f */
    private boolean m38838f(int[] iArr) {
        if (mo38837c()) {
            C0989f c0989f = this.f3283z;
            ColorStateList colorStateList = c0989f.f3287c;
            PorterDuff.Mode mode = c0989f.f3288d;
            if (colorStateList != null && mode != null) {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f3282y || colorForState != this.f3280w || mode != this.f3281x) {
                    setColorFilter(colorForState, mode);
                    this.f3280w = colorForState;
                    this.f3281x = mode;
                    this.f3282y = true;
                    return true;
                }
            } else {
                this.f3282y = false;
                clearColorFilter();
            }
            return false;
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.InterfaceC0986c
    /* renamed from: a */
    public final void mo38842a(Drawable drawable) {
        Drawable drawable2 = this.f3279B;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3279B = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0989f c0989f = this.f3283z;
            if (c0989f != null) {
                c0989f.f3286b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.InterfaceC0986c
    /* renamed from: b */
    public final Drawable mo38841b() {
        return this.f3279B;
    }

    /* renamed from: c */
    protected boolean mo38837c() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f3279B.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0989f c0989f = this.f3283z;
        return changingConfigurations | (c0989f != null ? c0989f.getChangingConfigurations() : 0) | this.f3279B.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        C0989f c0989f = this.f3283z;
        if (c0989f == null || !c0989f.m38835a()) {
            return null;
        }
        this.f3283z.f3285a = getChangingConfigurations();
        return this.f3283z;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f3279B.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3279B.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3279B.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return C0981a.m38871f(this.f3279B);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f3279B.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f3279B.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f3279B.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f3279B.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f3279B.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f3279B.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return C0981a.m38869h(this.f3279B);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0989f c0989f;
        ColorStateList colorStateList = (!mo38837c() || (c0989f = this.f3283z) == null) ? null : c0989f.f3287c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f3279B.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f3279B.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f3278A && super.mutate() == this) {
            this.f3283z = m38840d();
            Drawable drawable = this.f3279B;
            if (drawable != null) {
                drawable.mutate();
            }
            C0989f c0989f = this.f3283z;
            if (c0989f != null) {
                Drawable drawable2 = this.f3279B;
                c0989f.f3286b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f3278A = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3279B;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return C0981a.m38864m(this.f3279B, i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.f3279B.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f3279B.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        C0981a.m38867j(this.f3279B, z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f3279B.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3279B.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f3279B.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f3279B.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m38838f(iArr) || this.f3279B.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0985b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0985b
    public void setTintList(ColorStateList colorStateList) {
        this.f3283z.f3287c = colorStateList;
        m38838f(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0985b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f3283z.f3288d = mode;
        m38838f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f3279B.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0987d(Drawable drawable) {
        this.f3283z = m38840d();
        mo38842a(drawable);
    }
}
