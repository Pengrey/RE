package p096f4;

import android.graphics.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p040c4.C2066c;
import p116g4.AbstractC5604c;
import p130h4.C5851g;

/* renamed from: f4.l */
/* loaded from: classes.dex */
public class C5393l implements InterfaceC5391j0<C2066c> {

    /* renamed from: a */
    private int f14845a;

    public C5393l(int i) {
        this.f14845a = i;
    }

    /* renamed from: b */
    private void m24430b(C2066c c2066c, List<Float> list) {
        int i = this.f14845a * 4;
        if (list.size() <= i) {
            return;
        }
        int size = (list.size() - i) / 2;
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                dArr[i2] = list.get(i).floatValue();
            } else {
                dArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        for (int i3 = 0; i3 < c2066c.m34786c(); i3++) {
            int i4 = c2066c.m34788a()[i3];
            c2066c.m34788a()[i3] = Color.argb(m24429c(c2066c.m34787b()[i3], dArr, dArr2), Color.red(i4), Color.green(i4), Color.blue(i4));
        }
    }

    /* renamed from: c */
    private int m24429c(double d, double[] dArr, double[] dArr2) {
        double d2;
        int i = 1;
        while (true) {
            if (i < dArr.length) {
                int i2 = i - 1;
                double d3 = dArr[i2];
                double d4 = dArr[i];
                if (dArr[i] >= d) {
                    d2 = C5851g.m22894j(dArr2[i2], dArr2[i], C5851g.m22902b((d - d3) / (d4 - d3), 0.0d, 1.0d));
                    break;
                }
                i++;
            } else {
                d2 = dArr2[dArr2.length - 1];
                break;
            }
        }
        return (int) (d2 * 255.0d);
    }

    @Override // p096f4.InterfaceC5391j0
    /* renamed from: d */
    public C2066c mo24395a(AbstractC5604c abstractC5604c, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = abstractC5604c.mo23596R() == AbstractC5604c.EnumC5606b.BEGIN_ARRAY;
        if (z) {
            abstractC5604c.mo23592c();
        }
        while (abstractC5604c.mo23580y()) {
            arrayList.add(Float.valueOf((float) abstractC5604c.mo23603F()));
        }
        if (z) {
            abstractC5604c.mo23589h();
        }
        if (this.f14845a == -1) {
            this.f14845a = arrayList.size() / 4;
        }
        int i = this.f14845a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f14845a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = arrayList.get(i4).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                if (i5 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i5 - 1] >= f2) {
                        fArr[i5] = f2 + 0.01f;
                    }
                }
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        C2066c c2066c = new C2066c(fArr, iArr);
        m24430b(c2066c, arrayList);
        return c2066c;
    }
}
