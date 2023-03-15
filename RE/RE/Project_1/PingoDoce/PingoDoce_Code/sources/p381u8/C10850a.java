package p381u8;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.core.graphics.C0969a;

/* renamed from: u8.a */
/* loaded from: classes.dex */
public class C10850a {

    /* renamed from: i */
    private static final int[] f28041i = new int[3];

    /* renamed from: j */
    private static final float[] f28042j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    private static final int[] f28043k = new int[4];

    /* renamed from: l */
    private static final float[] f28044l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    private final Paint f28045a;

    /* renamed from: b */
    private final Paint f28046b;

    /* renamed from: c */
    private final Paint f28047c;

    /* renamed from: d */
    private int f28048d;

    /* renamed from: e */
    private int f28049e;

    /* renamed from: f */
    private int f28050f;

    /* renamed from: g */
    private final Path f28051g;

    /* renamed from: h */
    private Paint f28052h;

    public C10850a() {
        this(-16777216);
    }

    /* renamed from: a */
    public void m6884a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        boolean z = f2 < 0.0f;
        Path path = this.f28051g;
        if (z) {
            int[] iArr = f28043k;
            iArr[0] = 0;
            iArr[1] = this.f28050f;
            iArr[2] = this.f28049e;
            iArr[3] = this.f28048d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = f28043k;
            iArr2[0] = 0;
            iArr2[1] = this.f28048d;
            iArr2[2] = this.f28049e;
            iArr2[3] = this.f28050f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = f28044l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        this.f28046b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f28043k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f28052h);
        }
        canvas.drawArc(rectF, f, f2, true, this.f28046b);
        canvas.restore();
    }

    /* renamed from: b */
    public void m6883b(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = f28041i;
        iArr[0] = this.f28050f;
        iArr[1] = this.f28049e;
        iArr[2] = this.f28048d;
        Paint paint = this.f28047c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f28042j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f28047c);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint m6882c() {
        return this.f28045a;
    }

    /* renamed from: d */
    public void m6881d(int i) {
        this.f28048d = C0969a.m38939j(i, 68);
        this.f28049e = C0969a.m38939j(i, 20);
        this.f28050f = C0969a.m38939j(i, 0);
        this.f28045a.setColor(this.f28048d);
    }

    public C10850a(int i) {
        this.f28051g = new Path();
        this.f28052h = new Paint();
        this.f28045a = new Paint();
        m6881d(i);
        this.f28052h.setColor(0);
        Paint paint = new Paint(4);
        this.f28046b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f28047c = new Paint(paint);
    }
}
