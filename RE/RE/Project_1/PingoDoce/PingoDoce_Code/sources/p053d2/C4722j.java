package p053d2;

import java.util.Arrays;
import p053d2.C4708b;

/* renamed from: d2.j */
/* loaded from: classes.dex */
public class C4722j implements C4708b.InterfaceC4709a {

    /* renamed from: m */
    private static float f12908m = 0.001f;

    /* renamed from: a */
    private int f12909a = 16;

    /* renamed from: b */
    private int f12910b = 16;

    /* renamed from: c */
    int[] f12911c = new int[16];

    /* renamed from: d */
    int[] f12912d = new int[16];

    /* renamed from: e */
    int[] f12913e = new int[16];

    /* renamed from: f */
    float[] f12914f = new float[16];

    /* renamed from: g */
    int[] f12915g = new int[16];

    /* renamed from: h */
    int[] f12916h = new int[16];

    /* renamed from: i */
    int f12917i = 0;

    /* renamed from: j */
    int f12918j = -1;

    /* renamed from: k */
    private final C4708b f12919k;

    /* renamed from: l */
    protected final C4710c f12920l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4722j(C4708b c4708b, C4710c c4710c) {
        this.f12919k = c4708b;
        this.f12920l = c4710c;
        clear();
    }

    /* renamed from: l */
    private void m26801l(C4720i c4720i, int i) {
        int[] iArr;
        int i2 = c4720i.f12894c % this.f12910b;
        int[] iArr2 = this.f12911c;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f12912d;
                if (iArr[i3] == -1) {
                    break;
                }
                i3 = iArr[i3];
            }
            iArr[i3] = i;
        }
        this.f12912d[i] = -1;
    }

    /* renamed from: m */
    private void m26800m(int i, C4720i c4720i, float f) {
        this.f12913e[i] = c4720i.f12894c;
        this.f12914f[i] = f;
        this.f12915g[i] = -1;
        this.f12916h[i] = -1;
        c4720i.m26819a(this.f12919k);
        c4720i.f12904m++;
        this.f12917i++;
    }

    /* renamed from: n */
    private int m26799n() {
        for (int i = 0; i < this.f12909a; i++) {
            if (this.f12913e[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    private void m26798o() {
        int i = this.f12909a * 2;
        this.f12913e = Arrays.copyOf(this.f12913e, i);
        this.f12914f = Arrays.copyOf(this.f12914f, i);
        this.f12915g = Arrays.copyOf(this.f12915g, i);
        this.f12916h = Arrays.copyOf(this.f12916h, i);
        this.f12912d = Arrays.copyOf(this.f12912d, i);
        for (int i2 = this.f12909a; i2 < i; i2++) {
            this.f12913e[i2] = -1;
            this.f12912d[i2] = -1;
        }
        this.f12909a = i;
    }

    /* renamed from: q */
    private void m26796q(int i, C4720i c4720i, float f) {
        int m26799n = m26799n();
        m26800m(m26799n, c4720i, f);
        if (i != -1) {
            this.f12915g[m26799n] = i;
            int[] iArr = this.f12916h;
            iArr[m26799n] = iArr[i];
            iArr[i] = m26799n;
        } else {
            this.f12915g[m26799n] = -1;
            if (this.f12917i > 0) {
                this.f12916h[m26799n] = this.f12918j;
                this.f12918j = m26799n;
            } else {
                this.f12916h[m26799n] = -1;
            }
        }
        int[] iArr2 = this.f12916h;
        if (iArr2[m26799n] != -1) {
            this.f12915g[iArr2[m26799n]] = m26799n;
        }
        m26801l(c4720i, m26799n);
    }

    /* renamed from: r */
    private void m26795r(C4720i c4720i) {
        int[] iArr;
        int i = c4720i.f12894c;
        int i2 = i % this.f12910b;
        int[] iArr2 = this.f12911c;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            return;
        }
        if (this.f12913e[i3] == i) {
            int[] iArr3 = this.f12912d;
            iArr2[i2] = iArr3[i3];
            iArr3[i3] = -1;
            return;
        }
        while (true) {
            iArr = this.f12912d;
            if (iArr[i3] == -1 || this.f12913e[iArr[i3]] == i) {
                break;
            }
            i3 = iArr[i3];
        }
        int i4 = iArr[i3];
        if (i4 == -1 || this.f12913e[i4] != i) {
            return;
        }
        iArr[i3] = iArr[i4];
        iArr[i4] = -1;
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    /* renamed from: a */
    public float mo26812a(int i) {
        int i2 = this.f12917i;
        int i3 = this.f12918j;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f12914f[i3];
            }
            i3 = this.f12916h[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    /* renamed from: b */
    public void mo26811b(C4720i c4720i, float f, boolean z) {
        float f2 = f12908m;
        if (f <= (-f2) || f >= f2) {
            int m26797p = m26797p(c4720i);
            if (m26797p == -1) {
                mo26807f(c4720i, f);
                return;
            }
            float[] fArr = this.f12914f;
            fArr[m26797p] = fArr[m26797p] + f;
            float f3 = fArr[m26797p];
            float f4 = f12908m;
            if (f3 <= (-f4) || fArr[m26797p] >= f4) {
                return;
            }
            fArr[m26797p] = 0.0f;
            mo26806g(c4720i, z);
        }
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    /* renamed from: c */
    public int mo26810c() {
        return this.f12917i;
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    public void clear() {
        int i = this.f12917i;
        for (int i2 = 0; i2 < i; i2++) {
            C4720i mo26805h = mo26805h(i2);
            if (mo26805h != null) {
                mo26805h.m26817c(this.f12919k);
            }
        }
        for (int i3 = 0; i3 < this.f12909a; i3++) {
            this.f12913e[i3] = -1;
            this.f12912d[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f12910b; i4++) {
            this.f12911c[i4] = -1;
        }
        this.f12917i = 0;
        this.f12918j = -1;
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    /* renamed from: d */
    public float mo26809d(C4720i c4720i) {
        int m26797p = m26797p(c4720i);
        if (m26797p != -1) {
            return this.f12914f[m26797p];
        }
        return 0.0f;
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    /* renamed from: e */
    public boolean mo26808e(C4720i c4720i) {
        return m26797p(c4720i) != -1;
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    /* renamed from: f */
    public void mo26807f(C4720i c4720i, float f) {
        float f2 = f12908m;
        if (f > (-f2) && f < f2) {
            mo26806g(c4720i, true);
            return;
        }
        if (this.f12917i == 0) {
            m26800m(0, c4720i, f);
            m26801l(c4720i, 0);
            this.f12918j = 0;
            return;
        }
        int m26797p = m26797p(c4720i);
        if (m26797p != -1) {
            this.f12914f[m26797p] = f;
            return;
        }
        if (this.f12917i + 1 >= this.f12909a) {
            m26798o();
        }
        int i = this.f12917i;
        int i2 = this.f12918j;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int[] iArr = this.f12913e;
            int i5 = iArr[i2];
            int i6 = c4720i.f12894c;
            if (i5 == i6) {
                this.f12914f[i2] = f;
                return;
            }
            if (iArr[i2] < i6) {
                i3 = i2;
            }
            i2 = this.f12916h[i2];
            if (i2 == -1) {
                break;
            }
        }
        m26796q(i3, c4720i, f);
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    /* renamed from: g */
    public float mo26806g(C4720i c4720i, boolean z) {
        int m26797p = m26797p(c4720i);
        if (m26797p == -1) {
            return 0.0f;
        }
        m26795r(c4720i);
        float f = this.f12914f[m26797p];
        if (this.f12918j == m26797p) {
            this.f12918j = this.f12916h[m26797p];
        }
        this.f12913e[m26797p] = -1;
        int[] iArr = this.f12915g;
        if (iArr[m26797p] != -1) {
            int[] iArr2 = this.f12916h;
            iArr2[iArr[m26797p]] = iArr2[m26797p];
        }
        int[] iArr3 = this.f12916h;
        if (iArr3[m26797p] != -1) {
            iArr[iArr3[m26797p]] = iArr[m26797p];
        }
        this.f12917i--;
        c4720i.f12904m--;
        if (z) {
            c4720i.m26817c(this.f12919k);
        }
        return f;
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    /* renamed from: h */
    public C4720i mo26805h(int i) {
        int i2 = this.f12917i;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f12918j;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f12920l.f12855d[this.f12913e[i3]];
            }
            i3 = this.f12916h[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    /* renamed from: i */
    public void mo26804i(float f) {
        int i = this.f12917i;
        int i2 = this.f12918j;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f12914f;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f12916h[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    /* renamed from: j */
    public void mo26803j() {
        int i = this.f12917i;
        int i2 = this.f12918j;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f12914f;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f12916h[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    /* renamed from: k */
    public float mo26802k(C4708b c4708b, boolean z) {
        float mo26809d = mo26809d(c4708b.f12846a);
        mo26806g(c4708b.f12846a, z);
        C4722j c4722j = (C4722j) c4708b.f12850e;
        int mo26810c = c4722j.mo26810c();
        int i = 0;
        int i2 = 0;
        while (i < mo26810c) {
            int[] iArr = c4722j.f12913e;
            if (iArr[i2] != -1) {
                mo26811b(this.f12920l.f12855d[iArr[i2]], c4722j.f12914f[i2] * mo26809d, z);
                i++;
            }
            i2++;
        }
        return mo26809d;
    }

    /* renamed from: p */
    public int m26797p(C4720i c4720i) {
        int[] iArr;
        if (this.f12917i != 0 && c4720i != null) {
            int i = c4720i.f12894c;
            int i2 = this.f12911c[i % this.f12910b];
            if (i2 == -1) {
                return -1;
            }
            if (this.f12913e[i2] == i) {
                return i2;
            }
            while (true) {
                iArr = this.f12912d;
                if (iArr[i2] == -1 || this.f12913e[iArr[i2]] == i) {
                    break;
                }
                i2 = iArr[i2];
            }
            if (iArr[i2] != -1 && this.f12913e[iArr[i2]] == i) {
                return iArr[i2];
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i = this.f12917i;
        for (int i2 = 0; i2 < i; i2++) {
            C4720i mo26805h = mo26805h(i2);
            if (mo26805h != null) {
                String str2 = str + mo26805h + " = " + mo26812a(i2) + " ";
                int m26797p = m26797p(mo26805h);
                String str3 = str2 + "[p: ";
                String str4 = (this.f12915g[m26797p] != -1 ? str3 + this.f12920l.f12855d[this.f12913e[this.f12915g[m26797p]]] : str3 + "none") + ", n: ";
                str = (this.f12916h[m26797p] != -1 ? str4 + this.f12920l.f12855d[this.f12913e[this.f12916h[m26797p]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
