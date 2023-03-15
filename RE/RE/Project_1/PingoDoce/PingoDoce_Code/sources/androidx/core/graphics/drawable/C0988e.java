package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.drawable.e */
/* loaded from: classes.dex */
public class C0988e extends C0987d {

    /* renamed from: D */
    private static Method f3284D;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0988e(Drawable drawable) {
        super(drawable);
        m38836g();
    }

    /* renamed from: g */
    private void m38836g() {
        if (f3284D == null) {
            try {
                f3284D = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    @Override // androidx.core.graphics.drawable.C0987d
    /* renamed from: c */
    protected boolean mo38837c() {
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = this.f3279B;
            return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f3279B.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f3279B.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f3279B;
        if (drawable != null && (method = f3284D) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.f3279B.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f3279B.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // androidx.core.graphics.drawable.C0987d, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.C0987d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0985b
    public void setTint(int i) {
        if (mo38837c()) {
            super.setTint(i);
        } else {
            this.f3279B.setTint(i);
        }
    }

    @Override // androidx.core.graphics.drawable.C0987d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0985b
    public void setTintList(ColorStateList colorStateList) {
        if (mo38837c()) {
            super.setTintList(colorStateList);
        } else {
            this.f3279B.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.C0987d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0985b
    public void setTintMode(PorterDuff.Mode mode) {
        if (mo38837c()) {
            super.setTintMode(mode);
        } else {
            this.f3279B.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0988e(C0989f c0989f, Resources resources) {
        super(c0989f, resources);
        m38836g();
    }
}
