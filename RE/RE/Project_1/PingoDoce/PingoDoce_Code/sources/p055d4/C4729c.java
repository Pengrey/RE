package p055d4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.C2210f;
import com.airbnb.lottie.InterfaceC2230k;
import p130h4.C5852h;
import p152i4.C6015c;
import p414w3.C11563a;
import p459y3.AbstractC13078a;
import p459y3.C13099p;

/* renamed from: d4.c */
/* loaded from: classes.dex */
public class C4729c extends AbstractC4724a {

    /* renamed from: A */
    private final Rect f12955A;

    /* renamed from: B */
    private final Rect f12956B;

    /* renamed from: C */
    private AbstractC13078a<ColorFilter, ColorFilter> f12957C;

    /* renamed from: D */
    private AbstractC13078a<Bitmap, Bitmap> f12958D;

    /* renamed from: z */
    private final Paint f12959z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4729c(C2210f c2210f, C4730d c4730d) {
        super(c2210f, c4730d);
        this.f12959z = new C11563a(3);
        this.f12955A = new Rect();
        this.f12956B = new Rect();
    }

    /* renamed from: M */
    private Bitmap m26766M() {
        Bitmap mo1634h;
        AbstractC13078a<Bitmap, Bitmap> abstractC13078a = this.f12958D;
        return (abstractC13078a == null || (mo1634h = abstractC13078a.mo1634h()) == null) ? this.f12934n.m34321t(this.f12935o.m26755k()) : mo1634h;
    }

    @Override // p055d4.AbstractC4724a, p436x3.InterfaceC12266e
    /* renamed from: b */
    public void mo3152b(RectF rectF, Matrix matrix, boolean z) {
        super.mo3152b(rectF, matrix, z);
        Bitmap m26766M = m26766M();
        if (m26766M != null) {
            rectF.set(0.0f, 0.0f, m26766M.getWidth() * C5852h.m22886e(), m26766M.getHeight() * C5852h.m22886e());
            this.f12933m.mapRect(rectF);
        }
    }

    @Override // p055d4.AbstractC4724a, p005a4.InterfaceC0019f
    /* renamed from: h */
    public <T> void mo3145h(T t, C6015c<T> c6015c) {
        super.mo3145h(t, c6015c);
        if (t == InterfaceC2230k.f6457E) {
            if (c6015c == null) {
                this.f12957C = null;
            } else {
                this.f12957C = new C13099p(c6015c);
            }
        } else if (t == InterfaceC2230k.f6460H) {
            if (c6015c == null) {
                this.f12958D = null;
            } else {
                this.f12958D = new C13099p(c6015c);
            }
        }
    }

    @Override // p055d4.AbstractC4724a
    /* renamed from: v */
    public void mo26726v(Canvas canvas, Matrix matrix, int i) {
        Bitmap m26766M = m26766M();
        if (m26766M == null || m26766M.isRecycled()) {
            return;
        }
        float m22886e = C5852h.m22886e();
        this.f12959z.setAlpha(i);
        AbstractC13078a<ColorFilter, ColorFilter> abstractC13078a = this.f12957C;
        if (abstractC13078a != null) {
            this.f12959z.setColorFilter(abstractC13078a.mo1634h());
        }
        canvas.save();
        canvas.concat(matrix);
        this.f12955A.set(0, 0, m26766M.getWidth(), m26766M.getHeight());
        this.f12956B.set(0, 0, (int) (m26766M.getWidth() * m22886e), (int) (m26766M.getHeight() * m22886e));
        canvas.drawBitmap(m26766M, this.f12955A, this.f12956B, this.f12959z);
        canvas.restore();
    }
}
