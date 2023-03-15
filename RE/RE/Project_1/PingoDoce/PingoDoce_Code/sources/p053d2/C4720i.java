package p053d2;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Arrays;

/* renamed from: d2.i */
/* loaded from: classes.dex */
public class C4720i {

    /* renamed from: q */
    private static int f12891q = 1;

    /* renamed from: a */
    public boolean f12892a;

    /* renamed from: b */
    private String f12893b;

    /* renamed from: f */
    public float f12897f;

    /* renamed from: j */
    EnumC4721a f12901j;

    /* renamed from: c */
    public int f12894c = -1;

    /* renamed from: d */
    int f12895d = -1;

    /* renamed from: e */
    public int f12896e = 0;

    /* renamed from: g */
    public boolean f12898g = false;

    /* renamed from: h */
    float[] f12899h = new float[9];

    /* renamed from: i */
    float[] f12900i = new float[9];

    /* renamed from: k */
    C4708b[] f12902k = new C4708b[16];

    /* renamed from: l */
    int f12903l = 0;

    /* renamed from: m */
    public int f12904m = 0;

    /* renamed from: n */
    boolean f12905n = false;

    /* renamed from: o */
    int f12906o = -1;

    /* renamed from: p */
    float f12907p = 0.0f;

    /* compiled from: SolverVariable.java */
    /* renamed from: d2.i$a */
    /* loaded from: classes.dex */
    public enum EnumC4721a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C4720i(EnumC4721a enumC4721a, String str) {
        this.f12901j = enumC4721a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m26818b() {
        f12891q++;
    }

    /* renamed from: a */
    public final void m26819a(C4708b c4708b) {
        int i = 0;
        while (true) {
            int i2 = this.f12903l;
            if (i < i2) {
                if (this.f12902k[i] == c4708b) {
                    return;
                }
                i++;
            } else {
                C4708b[] c4708bArr = this.f12902k;
                if (i2 >= c4708bArr.length) {
                    this.f12902k = (C4708b[]) Arrays.copyOf(c4708bArr, c4708bArr.length * 2);
                }
                C4708b[] c4708bArr2 = this.f12902k;
                int i3 = this.f12903l;
                c4708bArr2[i3] = c4708b;
                this.f12903l = i3 + 1;
                return;
            }
        }
    }

    /* renamed from: c */
    public final void m26817c(C4708b c4708b) {
        int i = this.f12903l;
        int i2 = 0;
        while (i2 < i) {
            if (this.f12902k[i2] == c4708b) {
                while (i2 < i - 1) {
                    C4708b[] c4708bArr = this.f12902k;
                    int i3 = i2 + 1;
                    c4708bArr[i2] = c4708bArr[i3];
                    i2 = i3;
                }
                this.f12903l--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: d */
    public void m26816d() {
        this.f12893b = null;
        this.f12901j = EnumC4721a.UNKNOWN;
        this.f12896e = 0;
        this.f12894c = -1;
        this.f12895d = -1;
        this.f12897f = 0.0f;
        this.f12898g = false;
        this.f12905n = false;
        this.f12906o = -1;
        this.f12907p = 0.0f;
        int i = this.f12903l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f12902k[i2] = null;
        }
        this.f12903l = 0;
        this.f12904m = 0;
        this.f12892a = false;
        Arrays.fill(this.f12900i, 0.0f);
    }

    /* renamed from: e */
    public void m26815e(C4711d c4711d, float f) {
        this.f12897f = f;
        this.f12898g = true;
        this.f12905n = false;
        this.f12906o = -1;
        this.f12907p = 0.0f;
        int i = this.f12903l;
        this.f12895d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f12902k[i2].m26891A(c4711d, this, false);
        }
        this.f12903l = 0;
    }

    /* renamed from: f */
    public void m26814f(EnumC4721a enumC4721a, String str) {
        this.f12901j = enumC4721a;
    }

    /* renamed from: g */
    public final void m26813g(C4711d c4711d, C4708b c4708b) {
        int i = this.f12903l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f12902k[i2].mo26831B(c4711d, c4708b, false);
        }
        this.f12903l = 0;
    }

    public String toString() {
        if (this.f12893b != null) {
            return BuildConfig.VERSION_NAME + this.f12893b;
        }
        return BuildConfig.VERSION_NAME + this.f12894c;
    }
}
