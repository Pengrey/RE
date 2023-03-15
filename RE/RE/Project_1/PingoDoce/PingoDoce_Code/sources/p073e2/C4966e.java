package p073e2;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p053d2.C4710c;
import p053d2.C4711d;
import p073e2.C4963d;
import p094f2.AbstractC5345p;
import p094f2.C5328c;
import p094f2.C5331f;
import p094f2.C5338l;
import p094f2.C5341n;

/* renamed from: e2.e */
/* loaded from: classes.dex */
public class C4966e {

    /* renamed from: o0 */
    public static float f13806o0 = 0.5f;

    /* renamed from: B */
    private boolean f13808B;

    /* renamed from: M */
    public C4963d f13819M;

    /* renamed from: N */
    public C4963d[] f13820N;

    /* renamed from: O */
    protected ArrayList<C4963d> f13821O;

    /* renamed from: P */
    private boolean[] f13822P;

    /* renamed from: Q */
    public EnumC4968b[] f13823Q;

    /* renamed from: R */
    public C4966e f13824R;

    /* renamed from: S */
    int f13825S;

    /* renamed from: T */
    int f13826T;

    /* renamed from: U */
    public float f13827U;

    /* renamed from: V */
    protected int f13828V;

    /* renamed from: W */
    protected int f13829W;

    /* renamed from: X */
    protected int f13830X;

    /* renamed from: Y */
    int f13831Y;

    /* renamed from: Z */
    protected int f13832Z;

    /* renamed from: a0 */
    protected int f13834a0;

    /* renamed from: b */
    public C5328c f13835b;

    /* renamed from: b0 */
    float f13836b0;

    /* renamed from: c */
    public C5328c f13837c;

    /* renamed from: c0 */
    float f13838c0;

    /* renamed from: d0 */
    private Object f13840d0;

    /* renamed from: e0 */
    private int f13842e0;

    /* renamed from: f0 */
    private String f13844f0;

    /* renamed from: g0 */
    private String f13846g0;

    /* renamed from: h0 */
    int f13848h0;

    /* renamed from: i0 */
    int f13850i0;

    /* renamed from: j0 */
    public float[] f13852j0;

    /* renamed from: k0 */
    protected C4966e[] f13854k0;

    /* renamed from: l0 */
    protected C4966e[] f13856l0;

    /* renamed from: m0 */
    public int f13858m0;

    /* renamed from: n0 */
    public int f13860n0;

    /* renamed from: a */
    public boolean f13833a = false;

    /* renamed from: d */
    public C5338l f13839d = null;

    /* renamed from: e */
    public C5341n f13841e = null;

    /* renamed from: f */
    public boolean[] f13843f = {true, true};

    /* renamed from: g */
    private boolean f13845g = true;

    /* renamed from: h */
    private boolean f13847h = false;

    /* renamed from: i */
    private boolean f13849i = true;

    /* renamed from: j */
    private boolean f13851j = false;

    /* renamed from: k */
    private boolean f13853k = false;

    /* renamed from: l */
    public int f13855l = -1;

    /* renamed from: m */
    public int f13857m = -1;

    /* renamed from: n */
    public int f13859n = 0;

    /* renamed from: o */
    public int f13861o = 0;

    /* renamed from: p */
    public int[] f13862p = new int[2];

    /* renamed from: q */
    public int f13863q = 0;

    /* renamed from: r */
    public int f13864r = 0;

    /* renamed from: s */
    public float f13865s = 1.0f;

    /* renamed from: t */
    public int f13866t = 0;

    /* renamed from: u */
    public int f13867u = 0;

    /* renamed from: v */
    public float f13868v = 1.0f;

    /* renamed from: w */
    int f13869w = -1;

    /* renamed from: x */
    float f13870x = 1.0f;

    /* renamed from: y */
    private int[] f13871y = {Reader.READ_DONE, Reader.READ_DONE};

    /* renamed from: z */
    private float f13872z = 0.0f;

    /* renamed from: A */
    private boolean f13807A = false;

    /* renamed from: C */
    private boolean f13809C = false;

    /* renamed from: D */
    private int f13810D = 0;

    /* renamed from: E */
    private int f13811E = 0;

    /* renamed from: F */
    public C4963d f13812F = new C4963d(this, C4963d.EnumC4965b.LEFT);

    /* renamed from: G */
    public C4963d f13813G = new C4963d(this, C4963d.EnumC4965b.TOP);

    /* renamed from: H */
    public C4963d f13814H = new C4963d(this, C4963d.EnumC4965b.RIGHT);

    /* renamed from: I */
    public C4963d f13815I = new C4963d(this, C4963d.EnumC4965b.BOTTOM);

    /* renamed from: J */
    public C4963d f13816J = new C4963d(this, C4963d.EnumC4965b.BASELINE);

    /* renamed from: K */
    C4963d f13817K = new C4963d(this, C4963d.EnumC4965b.CENTER_X);

    /* renamed from: L */
    C4963d f13818L = new C4963d(this, C4963d.EnumC4965b.CENTER_Y);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintWidget.java */
    /* renamed from: e2.e$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C4967a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13873a;

        /* renamed from: b */
        static final /* synthetic */ int[] f13874b;

        static {
            int[] iArr = new int[EnumC4968b.values().length];
            f13874b = iArr;
            try {
                iArr[EnumC4968b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13874b[EnumC4968b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13874b[EnumC4968b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13874b[EnumC4968b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C4963d.EnumC4965b.values().length];
            f13873a = iArr2;
            try {
                iArr2[C4963d.EnumC4965b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13873a[C4963d.EnumC4965b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13873a[C4963d.EnumC4965b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13873a[C4963d.EnumC4965b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13873a[C4963d.EnumC4965b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13873a[C4963d.EnumC4965b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13873a[C4963d.EnumC4965b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13873a[C4963d.EnumC4965b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13873a[C4963d.EnumC4965b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: ConstraintWidget.java */
    /* renamed from: e2.e$b */
    /* loaded from: classes.dex */
    public enum EnumC4968b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C4966e() {
        C4963d c4963d = new C4963d(this, C4963d.EnumC4965b.CENTER);
        this.f13819M = c4963d;
        this.f13820N = new C4963d[]{this.f13812F, this.f13814H, this.f13813G, this.f13815I, this.f13816J, c4963d};
        this.f13821O = new ArrayList<>();
        this.f13822P = new boolean[2];
        EnumC4968b enumC4968b = EnumC4968b.FIXED;
        this.f13823Q = new EnumC4968b[]{enumC4968b, enumC4968b};
        this.f13824R = null;
        this.f13825S = 0;
        this.f13826T = 0;
        this.f13827U = 0.0f;
        this.f13828V = -1;
        this.f13829W = 0;
        this.f13830X = 0;
        this.f13831Y = 0;
        float f = f13806o0;
        this.f13836b0 = f;
        this.f13838c0 = f;
        this.f13842e0 = 0;
        this.f13844f0 = null;
        this.f13846g0 = null;
        this.f13848h0 = 0;
        this.f13850i0 = 0;
        this.f13852j0 = new float[]{-1.0f, -1.0f};
        this.f13854k0 = new C4966e[]{null, null};
        this.f13856l0 = new C4966e[]{null, null};
        this.f13858m0 = -1;
        this.f13860n0 = -1;
        m26087d();
    }

    /* renamed from: Y */
    private boolean m26092Y(int i) {
        int i2 = i * 2;
        C4963d[] c4963dArr = this.f13820N;
        if (c4963dArr[i2].f13801f != null && c4963dArr[i2].f13801f.f13801f != c4963dArr[i2]) {
            int i3 = i2 + 1;
            if (c4963dArr[i3].f13801f != null && c4963dArr[i3].f13801f.f13801f == c4963dArr[i3]) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m26087d() {
        this.f13821O.add(this.f13812F);
        this.f13821O.add(this.f13813G);
        this.f13821O.add(this.f13814H);
        this.f13821O.add(this.f13815I);
        this.f13821O.add(this.f13817K);
        this.f13821O.add(this.f13818L);
        this.f13821O.add(this.f13819M);
        this.f13821O.add(this.f13816J);
    }

    /* JADX WARN: Code restructure failed: missing block: B:344:0x052b, code lost:
        if (r1[r30] == r6) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x038d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0423 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x049e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x04fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:355:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m26082i(p053d2.C4711d r32, boolean r33, boolean r34, boolean r35, boolean r36, p053d2.C4720i r37, p053d2.C4720i r38, p073e2.C4966e.EnumC4968b r39, boolean r40, p073e2.C4963d r41, p073e2.C4963d r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 1339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p073e2.C4966e.m26082i(d2.d, boolean, boolean, boolean, boolean, d2.i, d2.i, e2.e$b, boolean, e2.d, e2.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* renamed from: A */
    public int m26140A() {
        return this.f13810D;
    }

    /* renamed from: A0 */
    public void m26139A0(int i, int i2, int i3, float f) {
        this.f13859n = i;
        this.f13863q = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f13864r = i3;
        this.f13865s = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.f13859n = 2;
    }

    /* renamed from: B */
    public int m26138B() {
        return this.f13811E;
    }

    /* renamed from: B0 */
    public void m26137B0(float f) {
        this.f13852j0[0] = f;
    }

    /* renamed from: C */
    public int m26136C(int i) {
        if (i == 0) {
            return m26106R();
        }
        if (i == 1) {
            return m26058v();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C0 */
    public void m26135C0(int i, boolean z) {
        this.f13822P[i] = z;
    }

    /* renamed from: D */
    public int m26134D() {
        return this.f13871y[1];
    }

    /* renamed from: D0 */
    public void m26133D0(boolean z) {
        this.f13808B = z;
    }

    /* renamed from: E */
    public int m26132E() {
        return this.f13871y[0];
    }

    /* renamed from: E0 */
    public void m26131E0(boolean z) {
        this.f13809C = z;
    }

    /* renamed from: F */
    public int m26130F() {
        return this.f13834a0;
    }

    /* renamed from: F0 */
    public void m26129F0(int i, int i2) {
        this.f13810D = i;
        this.f13811E = i2;
        m26123I0(false);
    }

    /* renamed from: G */
    public int m26128G() {
        return this.f13832Z;
    }

    /* renamed from: G0 */
    public void m26127G0(int i) {
        this.f13871y[1] = i;
    }

    /* renamed from: H */
    public C4966e m26126H(int i) {
        C4963d c4963d;
        C4963d c4963d2;
        if (i != 0) {
            if (i == 1 && (c4963d2 = (c4963d = this.f13815I).f13801f) != null && c4963d2.f13801f == c4963d) {
                return c4963d2.f13799d;
            }
            return null;
        }
        C4963d c4963d3 = this.f13814H;
        C4963d c4963d4 = c4963d3.f13801f;
        if (c4963d4 == null || c4963d4.f13801f != c4963d3) {
            return null;
        }
        return c4963d4.f13799d;
    }

    /* renamed from: H0 */
    public void m26125H0(int i) {
        this.f13871y[0] = i;
    }

    /* renamed from: I */
    public C4966e m26124I() {
        return this.f13824R;
    }

    /* renamed from: I0 */
    public void m26123I0(boolean z) {
        this.f13845g = z;
    }

    /* renamed from: J */
    public C4966e m26122J(int i) {
        C4963d c4963d;
        C4963d c4963d2;
        if (i != 0) {
            if (i == 1 && (c4963d2 = (c4963d = this.f13813G).f13801f) != null && c4963d2.f13801f == c4963d) {
                return c4963d2.f13799d;
            }
            return null;
        }
        C4963d c4963d3 = this.f13812F;
        C4963d c4963d4 = c4963d3.f13801f;
        if (c4963d4 == null || c4963d4.f13801f != c4963d3) {
            return null;
        }
        return c4963d4.f13799d;
    }

    /* renamed from: J0 */
    public void m26121J0(int i) {
        if (i < 0) {
            this.f13834a0 = 0;
        } else {
            this.f13834a0 = i;
        }
    }

    /* renamed from: K */
    public int m26120K() {
        return m26104S() + this.f13825S;
    }

    /* renamed from: K0 */
    public void m26119K0(int i) {
        if (i < 0) {
            this.f13832Z = 0;
        } else {
            this.f13832Z = i;
        }
    }

    /* renamed from: L */
    public AbstractC5345p m26118L(int i) {
        if (i == 0) {
            return this.f13839d;
        }
        if (i == 1) {
            return this.f13841e;
        }
        return null;
    }

    /* renamed from: L0 */
    public void m26117L0(int i, int i2) {
        this.f13829W = i;
        this.f13830X = i2;
    }

    /* renamed from: M */
    public float m26116M() {
        return this.f13838c0;
    }

    /* renamed from: M0 */
    public void m26115M0(C4966e c4966e) {
        this.f13824R = c4966e;
    }

    /* renamed from: N */
    public int m26114N() {
        return this.f13850i0;
    }

    /* renamed from: N0 */
    public void m26113N0(float f) {
        this.f13838c0 = f;
    }

    /* renamed from: O */
    public EnumC4968b m26112O() {
        return this.f13823Q[1];
    }

    /* renamed from: O0 */
    public void m26111O0(int i) {
        this.f13850i0 = i;
    }

    /* renamed from: P */
    public int m26110P() {
        int i = this.f13812F != null ? 0 + this.f13813G.f13802g : 0;
        return this.f13814H != null ? i + this.f13815I.f13802g : i;
    }

    /* renamed from: P0 */
    public void m26109P0(int i, int i2) {
        this.f13830X = i;
        int i3 = i2 - i;
        this.f13826T = i3;
        int i4 = this.f13834a0;
        if (i3 < i4) {
            this.f13826T = i4;
        }
    }

    /* renamed from: Q */
    public int m26108Q() {
        return this.f13842e0;
    }

    /* renamed from: Q0 */
    public void m26107Q0(EnumC4968b enumC4968b) {
        this.f13823Q[1] = enumC4968b;
    }

    /* renamed from: R */
    public int m26106R() {
        if (this.f13842e0 == 8) {
            return 0;
        }
        return this.f13825S;
    }

    /* renamed from: R0 */
    public void m26105R0(int i, int i2, int i3, float f) {
        this.f13861o = i;
        this.f13866t = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f13867u = i3;
        this.f13868v = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.f13861o = 2;
    }

    /* renamed from: S */
    public int m26104S() {
        C4966e c4966e = this.f13824R;
        if (c4966e != null && (c4966e instanceof C4969f)) {
            return ((C4969f) c4966e).f13889v0 + this.f13829W;
        }
        return this.f13829W;
    }

    /* renamed from: S0 */
    public void m26103S0(float f) {
        this.f13852j0[1] = f;
    }

    /* renamed from: T */
    public int m26102T() {
        C4966e c4966e = this.f13824R;
        if (c4966e != null && (c4966e instanceof C4969f)) {
            return ((C4969f) c4966e).f13890w0 + this.f13830X;
        }
        return this.f13830X;
    }

    /* renamed from: T0 */
    public void m26101T0(int i) {
        this.f13842e0 = i;
    }

    /* renamed from: U */
    public boolean m26100U() {
        return this.f13807A;
    }

    /* renamed from: U0 */
    public void m26099U0(int i) {
        this.f13825S = i;
        int i2 = this.f13832Z;
        if (i < i2) {
            this.f13825S = i2;
        }
    }

    /* renamed from: V */
    public boolean m26098V(int i) {
        if (i == 0) {
            return (this.f13812F.f13801f != null ? 1 : 0) + (this.f13814H.f13801f != null ? 1 : 0) < 2;
        }
        return ((this.f13813G.f13801f != null ? 1 : 0) + (this.f13815I.f13801f != null ? 1 : 0)) + (this.f13816J.f13801f != null ? 1 : 0) < 2;
    }

    /* renamed from: V0 */
    public void m26097V0(int i) {
        this.f13829W = i;
    }

    /* renamed from: W */
    public boolean m26096W() {
        int size = this.f13821O.size();
        for (int i = 0; i < size; i++) {
            if (this.f13821O.get(i).m26148l()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W0 */
    public void m26095W0(int i) {
        this.f13830X = i;
    }

    /* renamed from: X */
    public void m26094X(C4963d.EnumC4965b enumC4965b, C4966e c4966e, C4963d.EnumC4965b enumC4965b2, int i, int i2) {
        mo26002m(enumC4965b).m26159a(c4966e.mo26002m(enumC4965b2), i, i2, true);
    }

    /* renamed from: X0 */
    public void m26093X0(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f13869w == -1) {
            if (z3 && !z4) {
                this.f13869w = 0;
            } else if (!z3 && z4) {
                this.f13869w = 1;
                if (this.f13828V == -1) {
                    this.f13870x = 1.0f / this.f13870x;
                }
            }
        }
        if (this.f13869w == 0 && (!this.f13813G.m26146n() || !this.f13815I.m26146n())) {
            this.f13869w = 1;
        } else if (this.f13869w == 1 && (!this.f13812F.m26146n() || !this.f13814H.m26146n())) {
            this.f13869w = 0;
        }
        if (this.f13869w == -1 && (!this.f13813G.m26146n() || !this.f13815I.m26146n() || !this.f13812F.m26146n() || !this.f13814H.m26146n())) {
            if (this.f13813G.m26146n() && this.f13815I.m26146n()) {
                this.f13869w = 0;
            } else if (this.f13812F.m26146n() && this.f13814H.m26146n()) {
                this.f13870x = 1.0f / this.f13870x;
                this.f13869w = 1;
            }
        }
        if (this.f13869w == -1) {
            int i = this.f13863q;
            if (i > 0 && this.f13866t == 0) {
                this.f13869w = 0;
            } else if (i != 0 || this.f13866t <= 0) {
            } else {
                this.f13870x = 1.0f / this.f13870x;
                this.f13869w = 1;
            }
        }
    }

    /* renamed from: Y0 */
    public void mo26040Y0(boolean z, boolean z2) {
        int i;
        int i2;
        boolean m24555k = z & this.f13839d.m24555k();
        boolean m24555k2 = z2 & this.f13841e.m24555k();
        C5338l c5338l = this.f13839d;
        int i3 = c5338l.f14752h.f14723g;
        C5341n c5341n = this.f13841e;
        int i4 = c5341n.f14752h.f14723g;
        int i5 = c5338l.f14753i.f14723g;
        int i6 = c5341n.f14753i.f14723g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (m24555k) {
            this.f13829W = i3;
        }
        if (m24555k2) {
            this.f13830X = i4;
        }
        if (this.f13842e0 == 8) {
            this.f13825S = 0;
            this.f13826T = 0;
            return;
        }
        if (m24555k) {
            if (this.f13823Q[0] == EnumC4968b.FIXED && i8 < (i2 = this.f13825S)) {
                i8 = i2;
            }
            this.f13825S = i8;
            int i10 = this.f13832Z;
            if (i8 < i10) {
                this.f13825S = i10;
            }
        }
        if (m24555k2) {
            if (this.f13823Q[1] == EnumC4968b.FIXED && i9 < (i = this.f13826T)) {
                i9 = i;
            }
            this.f13826T = i9;
            int i11 = this.f13834a0;
            if (i9 < i11) {
                this.f13826T = i11;
            }
        }
    }

    /* renamed from: Z */
    public boolean m26091Z() {
        C4963d c4963d = this.f13812F;
        C4963d c4963d2 = c4963d.f13801f;
        if (c4963d2 == null || c4963d2.f13801f != c4963d) {
            C4963d c4963d3 = this.f13814H;
            C4963d c4963d4 = c4963d3.f13801f;
            return c4963d4 != null && c4963d4.f13801f == c4963d3;
        }
        return true;
    }

    /* renamed from: Z0 */
    public void mo26017Z0(C4711d c4711d, boolean z) {
        C5341n c5341n;
        C5338l c5338l;
        int m26838x = c4711d.m26838x(this.f13812F);
        int m26838x2 = c4711d.m26838x(this.f13813G);
        int m26838x3 = c4711d.m26838x(this.f13814H);
        int m26838x4 = c4711d.m26838x(this.f13815I);
        if (z && (c5338l = this.f13839d) != null) {
            C5331f c5331f = c5338l.f14752h;
            if (c5331f.f14726j) {
                C5331f c5331f2 = c5338l.f14753i;
                if (c5331f2.f14726j) {
                    m26838x = c5331f.f14723g;
                    m26838x3 = c5331f2.f14723g;
                }
            }
        }
        if (z && (c5341n = this.f13841e) != null) {
            C5331f c5331f3 = c5341n.f14752h;
            if (c5331f3.f14726j) {
                C5331f c5331f4 = c5341n.f14753i;
                if (c5331f4.f14726j) {
                    m26838x2 = c5331f3.f14723g;
                    m26838x4 = c5331f4.f14723g;
                }
            }
        }
        int i = m26838x4 - m26838x2;
        if (m26838x3 - m26838x < 0 || i < 0 || m26838x == Integer.MIN_VALUE || m26838x == Integer.MAX_VALUE || m26838x2 == Integer.MIN_VALUE || m26838x2 == Integer.MAX_VALUE || m26838x3 == Integer.MIN_VALUE || m26838x3 == Integer.MAX_VALUE || m26838x4 == Integer.MIN_VALUE || m26838x4 == Integer.MAX_VALUE) {
            m26838x4 = 0;
            m26838x = 0;
            m26838x2 = 0;
            m26838x3 = 0;
        }
        m26061t0(m26838x, m26838x2, m26838x3, m26838x4);
    }

    /* renamed from: a0 */
    public boolean m26090a0() {
        return this.f13808B;
    }

    /* renamed from: b0 */
    public boolean m26089b0() {
        C4963d c4963d = this.f13813G;
        C4963d c4963d2 = c4963d.f13801f;
        if (c4963d2 == null || c4963d2.f13801f != c4963d) {
            C4963d c4963d3 = this.f13815I;
            C4963d c4963d4 = c4963d3.f13801f;
            return c4963d4 != null && c4963d4.f13801f == c4963d3;
        }
        return true;
    }

    /* renamed from: c0 */
    public boolean m26088c0() {
        return this.f13809C;
    }

    /* renamed from: d0 */
    public boolean m26086d0() {
        return this.f13845g && this.f13842e0 != 8;
    }

    /* renamed from: e */
    public void m26085e(C4969f c4969f, C4711d c4711d, HashSet<C4966e> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            C4974j.m25997a(c4969f, c4711d, this);
            hashSet.remove(this);
            mo26008g(c4711d, c4969f.m26047B1(64));
        }
        if (i == 0) {
            HashSet<C4963d> m26157c = this.f13812F.m26157c();
            if (m26157c != null) {
                Iterator<C4963d> it = m26157c.iterator();
                while (it.hasNext()) {
                    it.next().f13799d.m26085e(c4969f, c4711d, hashSet, i, true);
                }
            }
            HashSet<C4963d> m26157c2 = this.f13814H.m26157c();
            if (m26157c2 != null) {
                Iterator<C4963d> it2 = m26157c2.iterator();
                while (it2.hasNext()) {
                    it2.next().f13799d.m26085e(c4969f, c4711d, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<C4963d> m26157c3 = this.f13813G.m26157c();
        if (m26157c3 != null) {
            Iterator<C4963d> it3 = m26157c3.iterator();
            while (it3.hasNext()) {
                it3.next().f13799d.m26085e(c4969f, c4711d, hashSet, i, true);
            }
        }
        HashSet<C4963d> m26157c4 = this.f13815I.m26157c();
        if (m26157c4 != null) {
            Iterator<C4963d> it4 = m26157c4.iterator();
            while (it4.hasNext()) {
                it4.next().f13799d.m26085e(c4969f, c4711d, hashSet, i, true);
            }
        }
        HashSet<C4963d> m26157c5 = this.f13816J.m26157c();
        if (m26157c5 != null) {
            Iterator<C4963d> it5 = m26157c5.iterator();
            while (it5.hasNext()) {
                it5.next().f13799d.m26085e(c4969f, c4711d, hashSet, i, true);
            }
        }
    }

    /* renamed from: e0 */
    public boolean mo26012e0() {
        return this.f13851j || (this.f13812F.m26147m() && this.f13814H.m26147m());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m26084f() {
        return (this instanceof C4975k) || (this instanceof C4970g);
    }

    /* renamed from: f0 */
    public boolean mo26010f0() {
        return this.f13853k || (this.f13813G.m26147m() && this.f13815I.m26147m());
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05b0  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo26008g(p053d2.C4711d r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 1494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p073e2.C4966e.mo26008g(d2.d, boolean):void");
    }

    /* renamed from: g0 */
    public boolean m26083g0() {
        EnumC4968b[] enumC4968bArr = this.f13823Q;
        EnumC4968b enumC4968b = enumC4968bArr[0];
        EnumC4968b enumC4968b2 = EnumC4968b.MATCH_CONSTRAINT;
        return enumC4968b == enumC4968b2 && enumC4968bArr[1] == enumC4968b2;
    }

    /* renamed from: h */
    public boolean mo26006h() {
        return this.f13842e0 != 8;
    }

    /* renamed from: h0 */
    public void mo25987h0() {
        this.f13812F.m26144p();
        this.f13813G.m26144p();
        this.f13814H.m26144p();
        this.f13815I.m26144p();
        this.f13816J.m26144p();
        this.f13817K.m26144p();
        this.f13818L.m26144p();
        this.f13819M.m26144p();
        this.f13824R = null;
        this.f13872z = 0.0f;
        this.f13825S = 0;
        this.f13826T = 0;
        this.f13827U = 0.0f;
        this.f13828V = -1;
        this.f13829W = 0;
        this.f13830X = 0;
        this.f13831Y = 0;
        this.f13832Z = 0;
        this.f13834a0 = 0;
        float f = f13806o0;
        this.f13836b0 = f;
        this.f13838c0 = f;
        EnumC4968b[] enumC4968bArr = this.f13823Q;
        EnumC4968b enumC4968b = EnumC4968b.FIXED;
        enumC4968bArr[0] = enumC4968b;
        enumC4968bArr[1] = enumC4968b;
        this.f13840d0 = null;
        this.f13842e0 = 0;
        this.f13846g0 = null;
        this.f13848h0 = 0;
        this.f13850i0 = 0;
        float[] fArr = this.f13852j0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f13855l = -1;
        this.f13857m = -1;
        int[] iArr = this.f13871y;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f13859n = 0;
        this.f13861o = 0;
        this.f13865s = 1.0f;
        this.f13868v = 1.0f;
        this.f13864r = Reader.READ_DONE;
        this.f13867u = Reader.READ_DONE;
        this.f13863q = 0;
        this.f13866t = 0;
        this.f13869w = -1;
        this.f13870x = 1.0f;
        boolean[] zArr = this.f13843f;
        zArr[0] = true;
        zArr[1] = true;
        this.f13809C = false;
        boolean[] zArr2 = this.f13822P;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f13845g = true;
    }

    /* renamed from: i0 */
    public void m26081i0() {
        this.f13851j = false;
        this.f13853k = false;
        int size = this.f13821O.size();
        for (int i = 0; i < size; i++) {
            this.f13821O.get(i).m26143q();
        }
    }

    /* renamed from: j */
    public void m26080j(C4966e c4966e, float f, int i) {
        C4963d.EnumC4965b enumC4965b = C4963d.EnumC4965b.CENTER;
        m26094X(enumC4965b, c4966e, enumC4965b, i, 0);
        this.f13872z = f;
    }

    /* renamed from: j0 */
    public void mo25986j0(C4710c c4710c) {
        this.f13812F.m26142r(c4710c);
        this.f13813G.m26142r(c4710c);
        this.f13814H.m26142r(c4710c);
        this.f13815I.m26142r(c4710c);
        this.f13816J.m26142r(c4710c);
        this.f13819M.m26142r(c4710c);
        this.f13817K.m26142r(c4710c);
        this.f13818L.m26142r(c4710c);
    }

    /* renamed from: k */
    public void m26079k(C4711d c4711d) {
        c4711d.m26845q(this.f13812F);
        c4711d.m26845q(this.f13813G);
        c4711d.m26845q(this.f13814H);
        c4711d.m26845q(this.f13815I);
        if (this.f13831Y > 0) {
            c4711d.m26845q(this.f13816J);
        }
    }

    /* renamed from: k0 */
    public void m26078k0(int i) {
        this.f13831Y = i;
        this.f13807A = i > 0;
    }

    /* renamed from: l */
    public void m26077l() {
        if (this.f13839d == null) {
            this.f13839d = new C5338l(this);
        }
        if (this.f13841e == null) {
            this.f13841e = new C5341n(this);
        }
    }

    /* renamed from: l0 */
    public void m26076l0(Object obj) {
        this.f13840d0 = obj;
    }

    /* renamed from: m */
    public C4963d mo26002m(C4963d.EnumC4965b enumC4965b) {
        switch (C4967a.f13873a[enumC4965b.ordinal()]) {
            case 1:
                return this.f13812F;
            case 2:
                return this.f13813G;
            case 3:
                return this.f13814H;
            case 4:
                return this.f13815I;
            case 5:
                return this.f13816J;
            case 6:
                return this.f13819M;
            case 7:
                return this.f13817K;
            case 8:
                return this.f13818L;
            case 9:
                return null;
            default:
                throw new AssertionError(enumC4965b.name());
        }
    }

    /* renamed from: m0 */
    public void m26075m0(String str) {
        this.f13844f0 = str;
    }

    /* renamed from: n */
    public int m26074n() {
        return this.f13831Y;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please submit an issue!!! */
    /* renamed from: n0 */
    public void m26073n0(String str) {
        float f;
        int i = 0;
        if (str != null && str.length() != 0) {
            int i2 = -1;
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i3 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i2 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i2 = 1;
                }
                i3 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i3, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        if (i2 == 1) {
                            f = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f = i;
            } else {
                String substring4 = str.substring(i3);
                if (substring4.length() > 0) {
                    f = Float.parseFloat(substring4);
                }
                f = i;
            }
            i = (f > i ? 1 : (f == i ? 0 : -1));
            if (i > 0) {
                this.f13827U = f;
                this.f13828V = i2;
                return;
            }
            return;
        }
        this.f13827U = 0.0f;
    }

    /* renamed from: o */
    public float m26072o(int i) {
        if (i == 0) {
            return this.f13836b0;
        }
        if (i == 1) {
            return this.f13838c0;
        }
        return -1.0f;
    }

    /* renamed from: o0 */
    public void m26071o0(int i) {
        if (this.f13807A) {
            int i2 = i - this.f13831Y;
            int i3 = this.f13826T + i2;
            this.f13830X = i2;
            this.f13813G.m26141s(i2);
            this.f13815I.m26141s(i3);
            this.f13816J.m26141s(i);
            this.f13853k = true;
        }
    }

    /* renamed from: p */
    public int m26070p() {
        return m26102T() + this.f13826T;
    }

    /* renamed from: p0 */
    public void m26069p0(int i, int i2) {
        this.f13812F.m26141s(i);
        this.f13814H.m26141s(i2);
        this.f13829W = i;
        this.f13825S = i2 - i;
        this.f13851j = true;
    }

    /* renamed from: q */
    public Object m26068q() {
        return this.f13840d0;
    }

    /* renamed from: q0 */
    public void m26067q0(int i) {
        this.f13812F.m26141s(i);
        this.f13829W = i;
    }

    /* renamed from: r */
    public String m26066r() {
        return this.f13844f0;
    }

    /* renamed from: r0 */
    public void m26065r0(int i) {
        this.f13813G.m26141s(i);
        this.f13830X = i;
    }

    /* renamed from: s */
    public EnumC4968b m26064s(int i) {
        if (i == 0) {
            return m26052y();
        }
        if (i == 1) {
            return m26112O();
        }
        return null;
    }

    /* renamed from: s0 */
    public void m26063s0(int i, int i2) {
        this.f13813G.m26141s(i);
        this.f13815I.m26141s(i2);
        this.f13830X = i;
        this.f13826T = i2 - i;
        if (this.f13807A) {
            this.f13816J.m26141s(i + this.f13831Y);
        }
        this.f13853k = true;
    }

    /* renamed from: t */
    public float m26062t() {
        return this.f13827U;
    }

    /* renamed from: t0 */
    public void m26061t0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.f13829W = i;
        this.f13830X = i2;
        if (this.f13842e0 == 8) {
            this.f13825S = 0;
            this.f13826T = 0;
            return;
        }
        EnumC4968b[] enumC4968bArr = this.f13823Q;
        EnumC4968b enumC4968b = enumC4968bArr[0];
        EnumC4968b enumC4968b2 = EnumC4968b.FIXED;
        if (enumC4968b == enumC4968b2 && i7 < (i6 = this.f13825S)) {
            i7 = i6;
        }
        if (enumC4968bArr[1] == enumC4968b2 && i8 < (i5 = this.f13826T)) {
            i8 = i5;
        }
        this.f13825S = i7;
        this.f13826T = i8;
        int i9 = this.f13834a0;
        if (i8 < i9) {
            this.f13826T = i9;
        }
        int i10 = this.f13832Z;
        if (i7 < i10) {
            this.f13825S = i10;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = this.f13846g0;
        String str3 = BuildConfig.VERSION_NAME;
        if (str2 != null) {
            str = "type: " + this.f13846g0 + " ";
        } else {
            str = BuildConfig.VERSION_NAME;
        }
        sb2.append(str);
        if (this.f13844f0 != null) {
            str3 = "id: " + this.f13844f0 + " ";
        }
        sb2.append(str3);
        sb2.append("(");
        sb2.append(this.f13829W);
        sb2.append(", ");
        sb2.append(this.f13830X);
        sb2.append(") - (");
        sb2.append(this.f13825S);
        sb2.append(" x ");
        sb2.append(this.f13826T);
        sb2.append(")");
        return sb2.toString();
    }

    /* renamed from: u */
    public int m26060u() {
        return this.f13828V;
    }

    /* renamed from: u0 */
    public void m26059u0(boolean z) {
        this.f13807A = z;
    }

    /* renamed from: v */
    public int m26058v() {
        if (this.f13842e0 == 8) {
            return 0;
        }
        return this.f13826T;
    }

    /* renamed from: v0 */
    public void m26057v0(int i) {
        this.f13826T = i;
        int i2 = this.f13834a0;
        if (i < i2) {
            this.f13826T = i2;
        }
    }

    /* renamed from: w */
    public float m26056w() {
        return this.f13836b0;
    }

    /* renamed from: w0 */
    public void m26055w0(float f) {
        this.f13836b0 = f;
    }

    /* renamed from: x */
    public int m26054x() {
        return this.f13848h0;
    }

    /* renamed from: x0 */
    public void m26053x0(int i) {
        this.f13848h0 = i;
    }

    /* renamed from: y */
    public EnumC4968b m26052y() {
        return this.f13823Q[0];
    }

    /* renamed from: y0 */
    public void m26051y0(int i, int i2) {
        this.f13829W = i;
        int i3 = i2 - i;
        this.f13825S = i3;
        int i4 = this.f13832Z;
        if (i3 < i4) {
            this.f13825S = i4;
        }
    }

    /* renamed from: z */
    public int m26050z() {
        C4963d c4963d = this.f13812F;
        int i = c4963d != null ? 0 + c4963d.f13802g : 0;
        C4963d c4963d2 = this.f13814H;
        return c4963d2 != null ? i + c4963d2.f13802g : i;
    }

    /* renamed from: z0 */
    public void m26049z0(EnumC4968b enumC4968b) {
        this.f13823Q[0] = enumC4968b;
    }
}
