package p053d2;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Arrays;
import java.util.Comparator;
import p053d2.C4708b;

/* renamed from: d2.h */
/* loaded from: classes.dex */
public class C4717h extends C4708b {

    /* renamed from: g */
    private int f12884g;

    /* renamed from: h */
    private C4720i[] f12885h;

    /* renamed from: i */
    private C4720i[] f12886i;

    /* renamed from: j */
    private int f12887j;

    /* renamed from: k */
    C4719b f12888k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PriorityGoalRow.java */
    /* renamed from: d2.h$a */
    /* loaded from: classes.dex */
    public class C4718a implements Comparator<C4720i> {
        C4718a(C4717h c4717h) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C4720i c4720i, C4720i c4720i2) {
            return c4720i.f12894c - c4720i2.f12894c;
        }
    }

    /* compiled from: PriorityGoalRow.java */
    /* renamed from: d2.h$b */
    /* loaded from: classes.dex */
    class C4719b implements Comparable {

        /* renamed from: w */
        C4720i f12889w;

        public C4719b(C4717h c4717h) {
        }

        /* renamed from: b */
        public boolean m26824b(C4720i c4720i, float f) {
            boolean z = true;
            if (!this.f12889w.f12892a) {
                for (int i = 0; i < 9; i++) {
                    float f2 = c4720i.f12900i[i];
                    if (f2 != 0.0f) {
                        float f3 = f2 * f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        this.f12889w.f12900i[i] = f3;
                    } else {
                        this.f12889w.f12900i[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.f12889w.f12900i;
                fArr[i2] = fArr[i2] + (c4720i.f12900i[i2] * f);
                if (Math.abs(fArr[i2]) < 1.0E-4f) {
                    this.f12889w.f12900i[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                C4717h.this.m26828G(this.f12889w);
            }
            return false;
        }

        /* renamed from: c */
        public void m26823c(C4720i c4720i) {
            this.f12889w = c4720i;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f12889w.f12894c - ((C4720i) obj).f12894c;
        }

        /* renamed from: d */
        public final boolean m26822d() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f12889w.f12900i[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public final boolean m26821e(C4720i c4720i) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = c4720i.f12900i[i];
                float f2 = this.f12889w.f12900i[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: f */
        public void m26820f() {
            Arrays.fill(this.f12889w.f12900i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f12889w != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f12889w.f12900i[i] + " ";
                }
            }
            return str + "] " + this.f12889w;
        }
    }

    public C4717h(C4710c c4710c) {
        super(c4710c);
        this.f12884g = 128;
        this.f12885h = new C4720i[128];
        this.f12886i = new C4720i[128];
        this.f12887j = 0;
        this.f12888k = new C4719b(this);
    }

    /* renamed from: F */
    private final void m26829F(C4720i c4720i) {
        int i;
        int i2 = this.f12887j + 1;
        C4720i[] c4720iArr = this.f12885h;
        if (i2 > c4720iArr.length) {
            C4720i[] c4720iArr2 = (C4720i[]) Arrays.copyOf(c4720iArr, c4720iArr.length * 2);
            this.f12885h = c4720iArr2;
            this.f12886i = (C4720i[]) Arrays.copyOf(c4720iArr2, c4720iArr2.length * 2);
        }
        C4720i[] c4720iArr3 = this.f12885h;
        int i3 = this.f12887j;
        c4720iArr3[i3] = c4720i;
        int i4 = i3 + 1;
        this.f12887j = i4;
        if (i4 > 1 && c4720iArr3[i4 - 1].f12894c > c4720i.f12894c) {
            int i5 = 0;
            while (true) {
                i = this.f12887j;
                if (i5 >= i) {
                    break;
                }
                this.f12886i[i5] = this.f12885h[i5];
                i5++;
            }
            Arrays.sort(this.f12886i, 0, i, new C4718a(this));
            for (int i6 = 0; i6 < this.f12887j; i6++) {
                this.f12885h[i6] = this.f12886i[i6];
            }
        }
        c4720i.f12892a = true;
        c4720i.m26819a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public final void m26828G(C4720i c4720i) {
        int i = 0;
        while (i < this.f12887j) {
            if (this.f12885h[i] == c4720i) {
                while (true) {
                    int i2 = this.f12887j;
                    if (i < i2 - 1) {
                        C4720i[] c4720iArr = this.f12885h;
                        int i3 = i + 1;
                        c4720iArr[i] = c4720iArr[i3];
                        i = i3;
                    } else {
                        this.f12887j = i2 - 1;
                        c4720i.f12892a = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p053d2.C4708b
    /* renamed from: B */
    public void mo26831B(C4711d c4711d, C4708b c4708b, boolean z) {
        C4720i c4720i = c4708b.f12846a;
        if (c4720i == null) {
            return;
        }
        C4708b.InterfaceC4709a interfaceC4709a = c4708b.f12850e;
        int mo26810c = interfaceC4709a.mo26810c();
        for (int i = 0; i < mo26810c; i++) {
            C4720i mo26805h = interfaceC4709a.mo26805h(i);
            float mo26812a = interfaceC4709a.mo26812a(i);
            this.f12888k.m26823c(mo26805h);
            if (this.f12888k.m26824b(c4720i, mo26812a)) {
                m26829F(mo26805h);
            }
            this.f12847b += c4708b.f12847b * mo26812a;
        }
        m26828G(c4720i);
    }

    @Override // p053d2.C4708b, p053d2.C4711d.InterfaceC4712a
    /* renamed from: b */
    public C4720i mo26827b(C4711d c4711d, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f12887j; i2++) {
            C4720i c4720i = this.f12885h[i2];
            if (!zArr[c4720i.f12894c]) {
                this.f12888k.m26823c(c4720i);
                if (i == -1) {
                    if (!this.f12888k.m26822d()) {
                    }
                    i = i2;
                } else {
                    if (!this.f12888k.m26821e(this.f12885h[i])) {
                    }
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f12885h[i];
    }

    @Override // p053d2.C4708b, p053d2.C4711d.InterfaceC4712a
    /* renamed from: c */
    public void mo26826c(C4720i c4720i) {
        this.f12888k.m26823c(c4720i);
        this.f12888k.m26820f();
        c4720i.f12900i[c4720i.f12896e] = 1.0f;
        m26829F(c4720i);
    }

    @Override // p053d2.C4708b, p053d2.C4711d.InterfaceC4712a
    public void clear() {
        this.f12887j = 0;
        this.f12847b = 0.0f;
    }

    @Override // p053d2.C4708b, p053d2.C4711d.InterfaceC4712a
    public boolean isEmpty() {
        return this.f12887j == 0;
    }

    @Override // p053d2.C4708b
    public String toString() {
        String str = BuildConfig.VERSION_NAME + " goal -> (" + this.f12847b + ") : ";
        for (int i = 0; i < this.f12887j; i++) {
            this.f12888k.m26823c(this.f12885h[i]);
            str = str + this.f12888k + " ";
        }
        return str;
    }
}
