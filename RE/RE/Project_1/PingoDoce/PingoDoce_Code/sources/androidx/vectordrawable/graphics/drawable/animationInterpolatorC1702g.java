package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.core.content.res.C0967k;
import androidx.core.graphics.C0972c;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.vectordrawable.graphics.drawable.g  reason: invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name */
/* loaded from: classes.dex */
public class animationInterpolatorC1702g implements Interpolator {

    /* renamed from: a */
    private float[] f5174a;

    /* renamed from: b */
    private float[] f5175b;

    public animationInterpolatorC1702g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    /* renamed from: a */
    private void m35661a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m35660b(path);
    }

    /* renamed from: b */
    private void m35660b(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f5174a = new float[min];
            this.f5175b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
                this.f5174a[i2] = fArr[0];
                this.f5175b[i2] = fArr[1];
            }
            if (Math.abs(this.f5174a[0]) <= 1.0E-5d && Math.abs(this.f5175b[0]) <= 1.0E-5d) {
                int i3 = min - 1;
                if (Math.abs(this.f5174a[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.f5175b[i3] - 1.0f) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.f5174a;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb2.append(this.f5174a[0]);
            sb2.append(",");
            sb2.append(this.f5175b[0]);
            sb2.append(" end:");
            int i6 = min - 1;
            sb2.append(this.f5174a[i6]);
            sb2.append(",");
            sb2.append(this.f5175b[i6]);
            throw new IllegalArgumentException(sb2.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    /* renamed from: c */
    private void m35659c(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m35660b(path);
    }

    /* renamed from: d */
    private void m35658d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C0967k.m38962j(xmlPullParser, "pathData")) {
            String m38963i = C0967k.m38963i(typedArray, xmlPullParser, "pathData", 4);
            Path m38928e = C0972c.m38928e(m38963i);
            if (m38928e != null) {
                m35660b(m38928e);
                return;
            }
            throw new InflateException("The path is null, which is created from " + m38963i);
        } else if (C0967k.m38962j(xmlPullParser, "controlX1")) {
            if (C0967k.m38962j(xmlPullParser, "controlY1")) {
                float m38966f = C0967k.m38966f(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
                float m38966f2 = C0967k.m38966f(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
                boolean m38962j = C0967k.m38962j(xmlPullParser, "controlX2");
                if (m38962j != C0967k.m38962j(xmlPullParser, "controlY2")) {
                    throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
                }
                if (!m38962j) {
                    m35659c(m38966f, m38966f2);
                    return;
                } else {
                    m35661a(m38966f, m38966f2, C0967k.m38966f(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C0967k.m38966f(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
                    return;
                }
            }
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        } else {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f5174a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f5174a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f5174a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f5175b[i];
        }
        float[] fArr2 = this.f5175b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }

    public animationInterpolatorC1702g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m38961k = C0967k.m38961k(resources, theme, attributeSet, C1692a.f5160l);
        m35658d(m38961k, xmlPullParser);
        m38961k.recycle();
    }
}
