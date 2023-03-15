package p055d4;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C2210f;
import com.airbnb.lottie.InterfaceC2230k;
import p152i4.C6015c;
import p414w3.C11563a;
import p459y3.AbstractC13078a;
import p459y3.C13099p;

/* renamed from: d4.g */
/* loaded from: classes.dex */
public class C4735g extends AbstractC4724a {

    /* renamed from: A */
    private final Paint f12983A;

    /* renamed from: B */
    private final float[] f12984B;

    /* renamed from: C */
    private final Path f12985C;

    /* renamed from: D */
    private final C4730d f12986D;

    /* renamed from: E */
    private AbstractC13078a<ColorFilter, ColorFilter> f12987E;

    /* renamed from: z */
    private final RectF f12988z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4735g(C2210f c2210f, C4730d c4730d) {
        super(c2210f, c4730d);
        this.f12988z = new RectF();
        C11563a c11563a = new C11563a();
        this.f12983A = c11563a;
        this.f12984B = new float[8];
        this.f12985C = new Path();
        this.f12986D = c4730d;
        c11563a.setAlpha(0);
        c11563a.setStyle(Paint.Style.FILL);
        c11563a.setColor(c4730d.m26753m());
    }

    @Override // p055d4.AbstractC4724a, p436x3.InterfaceC12266e
    /* renamed from: b */
    public void mo3152b(RectF rectF, Matrix matrix, boolean z) {
        super.mo3152b(rectF, matrix, z);
        this.f12988z.set(0.0f, 0.0f, this.f12986D.m26751o(), this.f12986D.m26752n());
        this.f12933m.mapRect(this.f12988z);
        rectF.set(this.f12988z);
    }

    @Override // p055d4.AbstractC4724a, p005a4.InterfaceC0019f
    /* renamed from: h */
    public <T> void mo3145h(T t, C6015c<T> c6015c) {
        super.mo3145h(t, c6015c);
        if (t == InterfaceC2230k.f6457E) {
            if (c6015c == null) {
                this.f12987E = null;
            } else {
                this.f12987E = new C13099p(c6015c);
            }
        }
    }

    @Override // p055d4.AbstractC4724a
    /* renamed from: v */
    public void mo26726v(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.f12986D.m26753m());
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i / 255.0f) * (((alpha / 255.0f) * (this.f12942v.m1638h() == null ? 100 : this.f12942v.m1638h().mo1634h().intValue())) / 100.0f) * 255.0f);
        this.f12983A.setAlpha(intValue);
        AbstractC13078a<ColorFilter, ColorFilter> abstractC13078a = this.f12987E;
        if (abstractC13078a != null) {
            this.f12983A.setColorFilter(abstractC13078a.mo1634h());
        }
        if (intValue > 0) {
            float[] fArr = this.f12984B;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f12986D.m26751o();
            float[] fArr2 = this.f12984B;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f12986D.m26751o();
            this.f12984B[5] = this.f12986D.m26752n();
            float[] fArr3 = this.f12984B;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f12986D.m26752n();
            matrix.mapPoints(this.f12984B);
            this.f12985C.reset();
            Path path = this.f12985C;
            float[] fArr4 = this.f12984B;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f12985C;
            float[] fArr5 = this.f12984B;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f12985C;
            float[] fArr6 = this.f12984B;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f12985C;
            float[] fArr7 = this.f12984B;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f12985C;
            float[] fArr8 = this.f12984B;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f12985C.close();
            canvas.drawPath(this.f12985C, this.f12983A);
        }
    }
}
