package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.view.C1112b0;
import p070e.C4906j;

/* renamed from: androidx.appcompat.widget.u */
/* loaded from: classes.dex */
class C0525u extends C0511p {

    /* renamed from: d */
    private final SeekBar f1756d;

    /* renamed from: e */
    private Drawable f1757e;

    /* renamed from: f */
    private ColorStateList f1758f;

    /* renamed from: g */
    private PorterDuff.Mode f1759g;

    /* renamed from: h */
    private boolean f1760h;

    /* renamed from: i */
    private boolean f1761i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0525u(SeekBar seekBar) {
        super(seekBar);
        this.f1758f = null;
        this.f1759g = null;
        this.f1760h = false;
        this.f1761i = false;
        this.f1756d = seekBar;
    }

    /* renamed from: f */
    private void m40416f() {
        Drawable drawable = this.f1757e;
        if (drawable != null) {
            if (this.f1760h || this.f1761i) {
                Drawable m38859r = C0981a.m38859r(drawable.mutate());
                this.f1757e = m38859r;
                if (this.f1760h) {
                    C0981a.m38862o(m38859r, this.f1758f);
                }
                if (this.f1761i) {
                    C0981a.m38861p(this.f1757e, this.f1759g);
                }
                if (this.f1757e.isStateful()) {
                    this.f1757e.setState(this.f1756d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.C0511p
    /* renamed from: c */
    public void mo40417c(AttributeSet attributeSet, int i) {
        super.mo40417c(attributeSet, i);
        Context context = this.f1756d.getContext();
        int[] iArr = C4906j.f13451Q;
        C0520s0 m40453v = C0520s0.m40453v(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f1756d;
        C1112b0.m38409q0(seekBar, seekBar.getContext(), iArr, attributeSet, m40453v.m40457r(), i, 0);
        Drawable m40467h = m40453v.m40467h(C4906j.f13455R);
        if (m40467h != null) {
            this.f1756d.setThumb(m40467h);
        }
        m40412j(m40453v.m40468g(C4906j.f13459S));
        int i2 = C4906j.f13467U;
        if (m40453v.m40456s(i2)) {
            this.f1759g = C0456b0.m40678e(m40453v.m40464k(i2, -1), this.f1759g);
            this.f1761i = true;
        }
        int i3 = C4906j.f13463T;
        if (m40453v.m40456s(i3)) {
            this.f1758f = m40453v.m40472c(i3);
            this.f1760h = true;
        }
        m40453v.m40452w();
        m40416f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m40415g(Canvas canvas) {
        if (this.f1757e != null) {
            int max = this.f1756d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1757e.getIntrinsicWidth();
                int intrinsicHeight = this.f1757e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1757e.setBounds(-i, -i2, i, i2);
                float width = ((this.f1756d.getWidth() - this.f1756d.getPaddingLeft()) - this.f1756d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1756d.getPaddingLeft(), this.f1756d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1757e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m40414h() {
        Drawable drawable = this.f1757e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1756d.getDrawableState())) {
            this.f1756d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m40413i() {
        Drawable drawable = this.f1757e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: j */
    void m40412j(Drawable drawable) {
        Drawable drawable2 = this.f1757e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1757e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1756d);
            C0981a.m38864m(drawable, C1112b0.m38476E(this.f1756d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1756d.getDrawableState());
            }
            m40416f();
        }
        this.f1756d.invalidate();
    }
}
