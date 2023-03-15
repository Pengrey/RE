package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.InterfaceC1217z;
import androidx.core.widget.InterfaceC1252m;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView implements InterfaceC1217z, InterfaceC1252m {

    /* renamed from: w */
    private final C0463d f1273w;

    /* renamed from: x */
    private final C0504m f1274x;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0463d c0463d = this.f1273w;
        if (c0463d != null) {
            c0463d.m40660b();
        }
        C0504m c0504m = this.f1274x;
        if (c0504m != null) {
            c0504m.m40522b();
        }
    }

    @Override // androidx.core.view.InterfaceC1217z
    public ColorStateList getSupportBackgroundTintList() {
        C0463d c0463d = this.f1273w;
        if (c0463d != null) {
            return c0463d.m40659c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC1217z
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0463d c0463d = this.f1273w;
        if (c0463d != null) {
            return c0463d.m40658d();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC1252m
    public ColorStateList getSupportImageTintList() {
        C0504m c0504m = this.f1274x;
        if (c0504m != null) {
            return c0504m.m40521c();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC1252m
    public PorterDuff.Mode getSupportImageTintMode() {
        C0504m c0504m = this.f1274x;
        if (c0504m != null) {
            return c0504m.m40520d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f1274x.m40519e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0463d c0463d = this.f1273w;
        if (c0463d != null) {
            c0463d.m40656f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0463d c0463d = this.f1273w;
        if (c0463d != null) {
            c0463d.m40655g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0504m c0504m = this.f1274x;
        if (c0504m != null) {
            c0504m.m40522b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0504m c0504m = this.f1274x;
        if (c0504m != null) {
            c0504m.m40522b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C0504m c0504m = this.f1274x;
        if (c0504m != null) {
            c0504m.m40517g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0504m c0504m = this.f1274x;
        if (c0504m != null) {
            c0504m.m40522b();
        }
    }

    @Override // androidx.core.view.InterfaceC1217z
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0463d c0463d = this.f1273w;
        if (c0463d != null) {
            c0463d.m40653i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC1217z
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0463d c0463d = this.f1273w;
        if (c0463d != null) {
            c0463d.m40652j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC1252m
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0504m c0504m = this.f1274x;
        if (c0504m != null) {
            c0504m.m40516h(colorStateList);
        }
    }

    @Override // androidx.core.widget.InterfaceC1252m
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0504m c0504m = this.f1274x;
        if (c0504m != null) {
            c0504m.m40515i(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(C0512p0.m40482b(context), attributeSet, i);
        C0508n0.m40495a(this, getContext());
        C0463d c0463d = new C0463d(this);
        this.f1273w = c0463d;
        c0463d.m40657e(attributeSet, i);
        C0504m c0504m = new C0504m(this);
        this.f1274x = c0504m;
        c0504m.m40518f(attributeSet, i);
    }
}
