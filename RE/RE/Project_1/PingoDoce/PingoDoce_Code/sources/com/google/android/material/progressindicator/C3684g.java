package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import com.google.android.material.progressindicator.AbstractC3675b;

/* renamed from: com.google.android.material.progressindicator.g */
/* loaded from: classes.dex */
public final class C3684g<S extends AbstractC3675b> extends AbstractC3678d {

    /* renamed from: L */
    private AbstractC3682e<S> f10376L;

    /* renamed from: M */
    private AbstractC3683f<ObjectAnimator> f10377M;

    C3684g(Context context, AbstractC3675b abstractC3675b, AbstractC3682e<S> abstractC3682e, AbstractC3683f<ObjectAnimator> abstractC3683f) {
        super(context, abstractC3675b);
        m29349w(abstractC3682e);
        m29350v(abstractC3683f);
    }

    /* renamed from: s */
    public static C3684g<C3693k> m29353s(Context context, C3693k c3693k) {
        AbstractC3683f c3689j;
        C3685h c3685h = new C3685h(c3693k);
        if (c3693k.f10402g == 0) {
            c3689j = new C3686i(c3693k);
        } else {
            c3689j = new C3689j(context, c3693k);
        }
        return new C3684g<>(context, c3693k, c3685h, c3689j);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        this.f10376L.m29357g(canvas, m29371g());
        this.f10376L.mo29346c(canvas, this.f10363I);
        int i = 0;
        while (true) {
            AbstractC3683f<ObjectAnimator> abstractC3683f = this.f10377M;
            int[] iArr = abstractC3683f.f10375c;
            if (i < iArr.length) {
                AbstractC3682e<S> abstractC3682e = this.f10376L;
                Paint paint = this.f10363I;
                float[] fArr = abstractC3683f.f10374b;
                int i2 = i * 2;
                abstractC3682e.mo29347b(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                i++;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f10376L.mo29345d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f10376L.mo29344e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC3678d
    /* renamed from: q */
    public boolean mo29354q(boolean z, boolean z2, boolean z3) {
        boolean mo29354q = super.mo29354q(z, z2, z3);
        if (!isRunning()) {
            this.f10377M.mo29330a();
        }
        float m9912a = this.f10367y.m9912a(this.f10365w.getContentResolver());
        if (z && (z3 || (Build.VERSION.SDK_INT <= 21 && m9912a > 0.0f))) {
            this.f10377M.mo29326g();
        }
        return mo29354q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public AbstractC3683f<ObjectAnimator> m29352t() {
        return this.f10377M;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public AbstractC3682e<S> m29351u() {
        return this.f10376L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m29350v(AbstractC3683f<ObjectAnimator> abstractC3683f) {
        this.f10377M = abstractC3683f;
        abstractC3683f.m29355e(this);
    }

    /* renamed from: w */
    void m29349w(AbstractC3682e<S> abstractC3682e) {
        this.f10376L = abstractC3682e;
        abstractC3682e.m29358f(this);
    }
}
