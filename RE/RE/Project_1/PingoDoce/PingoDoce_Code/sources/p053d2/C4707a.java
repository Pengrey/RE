package p053d2;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Arrays;
import p053d2.C4708b;

/* renamed from: d2.a */
/* loaded from: classes.dex */
public class C4707a implements C4708b.InterfaceC4709a {

    /* renamed from: l */
    private static float f12834l = 0.001f;

    /* renamed from: b */
    private final C4708b f12836b;

    /* renamed from: c */
    protected final C4710c f12837c;

    /* renamed from: a */
    int f12835a = 0;

    /* renamed from: d */
    private int f12838d = 8;

    /* renamed from: e */
    private C4720i f12839e = null;

    /* renamed from: f */
    private int[] f12840f = new int[8];

    /* renamed from: g */
    private int[] f12841g = new int[8];

    /* renamed from: h */
    private float[] f12842h = new float[8];

    /* renamed from: i */
    private int f12843i = -1;

    /* renamed from: j */
    private int f12844j = -1;

    /* renamed from: k */
    private boolean f12845k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4707a(C4708b c4708b, C4710c c4710c) {
        this.f12836b = c4708b;
        this.f12837c = c4710c;
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    /* renamed from: a */
    public float mo26812a(int i) {
        int i2 = this.f12843i;
        for (int i3 = 0; i2 != -1 && i3 < this.f12835a; i3++) {
            if (i3 == i) {
                return this.f12842h[i2];
            }
            i2 = this.f12841g[i2];
        }
        return 0.0f;
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    /* renamed from: b */
    public void mo26811b(C4720i c4720i, float f, boolean z) {
        float f2 = f12834l;
        if (f <= (-f2) || f >= f2) {
            int i = this.f12843i;
            if (i == -1) {
                this.f12843i = 0;
                this.f12842h[0] = f;
                this.f12840f[0] = c4720i.f12894c;
                this.f12841g[0] = -1;
                c4720i.f12904m++;
                c4720i.m26819a(this.f12836b);
                this.f12835a++;
                if (this.f12845k) {
                    return;
                }
                int i2 = this.f12844j + 1;
                this.f12844j = i2;
                int[] iArr = this.f12840f;
                if (i2 >= iArr.length) {
                    this.f12845k = true;
                    this.f12844j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f12835a; i4++) {
                int[] iArr2 = this.f12840f;
                int i5 = iArr2[i];
                int i6 = c4720i.f12894c;
                if (i5 == i6) {
                    float[] fArr = this.f12842h;
                    float f3 = fArr[i] + f;
                    float f4 = f12834l;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f12843i) {
                            this.f12843i = this.f12841g[i];
                        } else {
                            int[] iArr3 = this.f12841g;
                            iArr3[i3] = iArr3[i];
                        }
                        if (z) {
                            c4720i.m26817c(this.f12836b);
                        }
                        if (this.f12845k) {
                            this.f12844j = i;
                        }
                        c4720i.f12904m--;
                        this.f12835a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i3 = i;
                }
                i = this.f12841g[i];
            }
            int i7 = this.f12844j;
            int i8 = i7 + 1;
            if (this.f12845k) {
                int[] iArr4 = this.f12840f;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.f12840f;
            if (i7 >= iArr5.length && this.f12835a < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f12840f;
                    if (i9 >= iArr6.length) {
                        break;
                    } else if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr7 = this.f12840f;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.f12838d * 2;
                this.f12838d = i10;
                this.f12845k = false;
                this.f12844j = i7 - 1;
                this.f12842h = Arrays.copyOf(this.f12842h, i10);
                this.f12840f = Arrays.copyOf(this.f12840f, this.f12838d);
                this.f12841g = Arrays.copyOf(this.f12841g, this.f12838d);
            }
            this.f12840f[i7] = c4720i.f12894c;
            this.f12842h[i7] = f;
            if (i3 != -1) {
                int[] iArr8 = this.f12841g;
                iArr8[i7] = iArr8[i3];
                iArr8[i3] = i7;
            } else {
                this.f12841g[i7] = this.f12843i;
                this.f12843i = i7;
            }
            c4720i.f12904m++;
            c4720i.m26819a(this.f12836b);
            this.f12835a++;
            if (!this.f12845k) {
                this.f12844j++;
            }
            int i11 = this.f12844j;
            int[] iArr9 = this.f12840f;
            if (i11 >= iArr9.length) {
                this.f12845k = true;
                this.f12844j = iArr9.length - 1;
            }
        }
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    /* renamed from: c */
    public int mo26810c() {
        return this.f12835a;
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    public final void clear() {
        int i = this.f12843i;
        for (int i2 = 0; i != -1 && i2 < this.f12835a; i2++) {
            C4720i c4720i = this.f12837c.f12855d[this.f12840f[i]];
            if (c4720i != null) {
                c4720i.m26817c(this.f12836b);
            }
            i = this.f12841g[i];
        }
        this.f12843i = -1;
        this.f12844j = -1;
        this.f12845k = false;
        this.f12835a = 0;
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    /* renamed from: d */
    public final float mo26809d(C4720i c4720i) {
        int i = this.f12843i;
        for (int i2 = 0; i != -1 && i2 < this.f12835a; i2++) {
            if (this.f12840f[i] == c4720i.f12894c) {
                return this.f12842h[i];
            }
            i = this.f12841g[i];
        }
        return 0.0f;
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    /* renamed from: e */
    public boolean mo26808e(C4720i c4720i) {
        int i = this.f12843i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f12835a; i2++) {
            if (this.f12840f[i] == c4720i.f12894c) {
                return true;
            }
            i = this.f12841g[i];
        }
        return false;
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    /* renamed from: f */
    public final void mo26807f(C4720i c4720i, float f) {
        if (f == 0.0f) {
            mo26806g(c4720i, true);
            return;
        }
        int i = this.f12843i;
        if (i == -1) {
            this.f12843i = 0;
            this.f12842h[0] = f;
            this.f12840f[0] = c4720i.f12894c;
            this.f12841g[0] = -1;
            c4720i.f12904m++;
            c4720i.m26819a(this.f12836b);
            this.f12835a++;
            if (this.f12845k) {
                return;
            }
            int i2 = this.f12844j + 1;
            this.f12844j = i2;
            int[] iArr = this.f12840f;
            if (i2 >= iArr.length) {
                this.f12845k = true;
                this.f12844j = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f12835a; i4++) {
            int[] iArr2 = this.f12840f;
            int i5 = iArr2[i];
            int i6 = c4720i.f12894c;
            if (i5 == i6) {
                this.f12842h[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.f12841g[i];
        }
        int i7 = this.f12844j;
        int i8 = i7 + 1;
        if (this.f12845k) {
            int[] iArr3 = this.f12840f;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f12840f;
        if (i7 >= iArr4.length && this.f12835a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f12840f;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f12840f;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f12838d * 2;
            this.f12838d = i10;
            this.f12845k = false;
            this.f12844j = i7 - 1;
            this.f12842h = Arrays.copyOf(this.f12842h, i10);
            this.f12840f = Arrays.copyOf(this.f12840f, this.f12838d);
            this.f12841g = Arrays.copyOf(this.f12841g, this.f12838d);
        }
        this.f12840f[i7] = c4720i.f12894c;
        this.f12842h[i7] = f;
        if (i3 != -1) {
            int[] iArr7 = this.f12841g;
            iArr7[i7] = iArr7[i3];
            iArr7[i3] = i7;
        } else {
            this.f12841g[i7] = this.f12843i;
            this.f12843i = i7;
        }
        c4720i.f12904m++;
        c4720i.m26819a(this.f12836b);
        int i11 = this.f12835a + 1;
        this.f12835a = i11;
        if (!this.f12845k) {
            this.f12844j++;
        }
        int[] iArr8 = this.f12840f;
        if (i11 >= iArr8.length) {
            this.f12845k = true;
        }
        if (this.f12844j >= iArr8.length) {
            this.f12845k = true;
            this.f12844j = iArr8.length - 1;
        }
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    /* renamed from: g */
    public final float mo26806g(C4720i c4720i, boolean z) {
        if (this.f12839e == c4720i) {
            this.f12839e = null;
        }
        int i = this.f12843i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f12835a) {
            if (this.f12840f[i] == c4720i.f12894c) {
                if (i == this.f12843i) {
                    this.f12843i = this.f12841g[i];
                } else {
                    int[] iArr = this.f12841g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c4720i.m26817c(this.f12836b);
                }
                c4720i.f12904m--;
                this.f12835a--;
                this.f12840f[i] = -1;
                if (this.f12845k) {
                    this.f12844j = i;
                }
                return this.f12842h[i];
            }
            i2++;
            i3 = i;
            i = this.f12841g[i];
        }
        return 0.0f;
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    /* renamed from: h */
    public C4720i mo26805h(int i) {
        int i2 = this.f12843i;
        for (int i3 = 0; i2 != -1 && i3 < this.f12835a; i3++) {
            if (i3 == i) {
                return this.f12837c.f12855d[this.f12840f[i2]];
            }
            i2 = this.f12841g[i2];
        }
        return null;
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    /* renamed from: i */
    public void mo26804i(float f) {
        int i = this.f12843i;
        for (int i2 = 0; i != -1 && i2 < this.f12835a; i2++) {
            float[] fArr = this.f12842h;
            fArr[i] = fArr[i] / f;
            i = this.f12841g[i];
        }
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    /* renamed from: j */
    public void mo26803j() {
        int i = this.f12843i;
        for (int i2 = 0; i != -1 && i2 < this.f12835a; i2++) {
            float[] fArr = this.f12842h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f12841g[i];
        }
    }

    @Override // p053d2.C4708b.InterfaceC4709a
    /* renamed from: k */
    public float mo26802k(C4708b c4708b, boolean z) {
        float mo26809d = mo26809d(c4708b.f12846a);
        mo26806g(c4708b.f12846a, z);
        C4708b.InterfaceC4709a interfaceC4709a = c4708b.f12850e;
        int mo26810c = interfaceC4709a.mo26810c();
        for (int i = 0; i < mo26810c; i++) {
            C4720i mo26805h = interfaceC4709a.mo26805h(i);
            mo26811b(mo26805h, interfaceC4709a.mo26809d(mo26805h) * mo26809d, z);
        }
        return mo26809d;
    }

    public String toString() {
        int i = this.f12843i;
        String str = BuildConfig.VERSION_NAME;
        for (int i2 = 0; i != -1 && i2 < this.f12835a; i2++) {
            str = ((str + " -> ") + this.f12842h[i] + " : ") + this.f12837c.f12855d[this.f12840f[i]];
            i = this.f12841g[i];
        }
        return str;
    }
}
