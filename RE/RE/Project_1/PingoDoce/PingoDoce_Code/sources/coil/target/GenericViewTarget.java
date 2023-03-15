package coil.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.InterfaceC1443h;
import androidx.lifecycle.InterfaceC1491v;
import p349s3.InterfaceC10042b;
import p376u3.InterfaceC10826d;

/* compiled from: GenericViewTarget.kt */
/* loaded from: classes.dex */
public abstract class GenericViewTarget<T extends View> implements InterfaceC10042b<T>, InterfaceC10826d, InterfaceC1443h {

    /* renamed from: w */
    private boolean f6312w;

    @Override // p349s3.InterfaceC10041a
    /* renamed from: b */
    public void mo9343b(Drawable drawable) {
        m34469o(drawable);
    }

    @Override // androidx.lifecycle.InterfaceC1443h, androidx.lifecycle.InterfaceC1462m
    /* renamed from: f */
    public void mo34464f(InterfaceC1491v interfaceC1491v) {
        this.f6312w = true;
        m34470m();
    }

    @Override // androidx.lifecycle.InterfaceC1443h, androidx.lifecycle.InterfaceC1462m
    /* renamed from: g */
    public void mo34472g(InterfaceC1491v interfaceC1491v) {
        this.f6312w = false;
        m34470m();
    }

    @Override // p349s3.InterfaceC10041a
    /* renamed from: h */
    public void mo9342h(Drawable drawable) {
        m34469o(drawable);
    }

    @Override // p376u3.InterfaceC10826d
    /* renamed from: i */
    public abstract Drawable mo6973i();

    @Override // p349s3.InterfaceC10041a
    /* renamed from: k */
    public void mo9341k(Drawable drawable) {
        m34469o(drawable);
    }

    /* renamed from: l */
    public abstract void mo34471l(Drawable drawable);

    /* renamed from: m */
    protected final void m34470m() {
        Drawable mo6973i = mo6973i();
        Animatable animatable = mo6973i instanceof Animatable ? (Animatable) mo6973i : null;
        if (animatable == null) {
            return;
        }
        if (this.f6312w) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    /* renamed from: o */
    protected final void m34469o(Drawable drawable) {
        Drawable mo6973i = mo6973i();
        Animatable animatable = mo6973i instanceof Animatable ? (Animatable) mo6973i : null;
        if (animatable != null) {
            animatable.stop();
        }
        mo34471l(drawable);
        m34470m();
    }
}
