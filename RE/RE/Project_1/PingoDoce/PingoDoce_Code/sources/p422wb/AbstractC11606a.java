package p422wb;

import com.google.crypto.tink.shaded.protobuf.Reader;
import com.google.zxing.NotFoundException;
import p403vb.AbstractC11194r;

/* renamed from: wb.a */
/* loaded from: classes2.dex */
public abstract class AbstractC11606a extends AbstractC11194r {

    /* renamed from: b */
    private final int[] f29679b;

    /* renamed from: e */
    private final int[] f29682e;

    /* renamed from: f */
    private final int[] f29683f;

    /* renamed from: a */
    private final int[] f29678a = new int[4];

    /* renamed from: c */
    private final float[] f29680c = new float[4];

    /* renamed from: d */
    private final float[] f29681d = new float[4];

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11606a() {
        int[] iArr = new int[8];
        this.f29679b = iArr;
        this.f29682e = new int[iArr.length / 2];
        this.f29683f = new int[iArr.length / 2];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public static void m4626i(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] < f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public static void m4619p(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] > f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public static boolean m4618q(int[] iArr) {
        int i;
        float f = (iArr[0] + iArr[1]) / ((iArr[2] + i) + iArr[3]);
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i2 = Reader.READ_DONE;
            int i3 = Integer.MIN_VALUE;
            for (int i4 : iArr) {
                if (i4 > i3) {
                    i3 = i4;
                }
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i3 < i2 * 10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public static int m4617r(int[] iArr, int[][] iArr2) throws NotFoundException {
        for (int i = 0; i < iArr2.length; i++) {
            if (AbstractC11194r.m5785f(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw NotFoundException.m27700a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final int[] m4625j() {
        return this.f29679b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public final int[] m4624k() {
        return this.f29678a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final int[] m4623l() {
        return this.f29683f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final float[] m4622m() {
        return this.f29681d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final int[] m4621n() {
        return this.f29682e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final float[] m4620o() {
        return this.f29680c;
    }
}
