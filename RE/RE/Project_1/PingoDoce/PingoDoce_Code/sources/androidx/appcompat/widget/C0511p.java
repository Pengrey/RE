package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.InterfaceC0986c;

/* renamed from: androidx.appcompat.widget.p */
/* loaded from: classes.dex */
class C0511p {

    /* renamed from: c */
    private static final int[] f1713c = {16843067, 16843068};

    /* renamed from: a */
    private final ProgressBar f1714a;

    /* renamed from: b */
    private Bitmap f1715b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0511p(ProgressBar progressBar) {
        this.f1714a = progressBar;
    }

    /* renamed from: a */
    private Shape m40487a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* renamed from: d */
    private Drawable m40485d(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC0986c) {
            InterfaceC0986c interfaceC0986c = (InterfaceC0986c) drawable;
            Drawable mo38841b = interfaceC0986c.mo38841b();
            if (mo38841b != null) {
                interfaceC0986c.mo38842a(m40485d(mo38841b, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id2 = layerDrawable.getId(i);
                drawableArr[i] = m40485d(layerDrawable.getDrawable(i), id2 == 16908301 || id2 == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1715b == null) {
                this.f1715b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(m40487a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: e */
    private Drawable m40484e(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            AnimationDrawable animationDrawable2 = new AnimationDrawable();
            animationDrawable2.setOneShot(animationDrawable.isOneShot());
            for (int i = 0; i < numberOfFrames; i++) {
                Drawable m40485d = m40485d(animationDrawable.getFrame(i), true);
                m40485d.setLevel(10000);
                animationDrawable2.addFrame(m40485d, animationDrawable.getDuration(i));
            }
            animationDrawable2.setLevel(10000);
            return animationDrawable2;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Bitmap m40486b() {
        return this.f1715b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo40417c(AttributeSet attributeSet, int i) {
        C0520s0 m40453v = C0520s0.m40453v(this.f1714a.getContext(), attributeSet, f1713c, i, 0);
        Drawable m40467h = m40453v.m40467h(0);
        if (m40467h != null) {
            this.f1714a.setIndeterminateDrawable(m40484e(m40467h));
        }
        Drawable m40467h2 = m40453v.m40467h(1);
        if (m40467h2 != null) {
            this.f1714a.setProgressDrawable(m40485d(m40467h2, false));
        }
        m40453v.m40452w();
    }
}
