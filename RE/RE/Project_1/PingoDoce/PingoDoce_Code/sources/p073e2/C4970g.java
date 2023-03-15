package p073e2;

import p053d2.C4711d;
import p053d2.C4720i;
import p073e2.C4963d;
import p073e2.C4966e;

/* renamed from: e2.g */
/* loaded from: classes.dex */
public class C4970g extends C4966e {

    /* renamed from: p0 */
    protected float f13894p0 = -1.0f;

    /* renamed from: q0 */
    protected int f13895q0 = -1;

    /* renamed from: r0 */
    protected int f13896r0 = -1;

    /* renamed from: s0 */
    private C4963d f13897s0 = this.f13813G;

    /* renamed from: t0 */
    private int f13898t0 = 0;

    /* renamed from: u0 */
    private boolean f13899u0;

    /* compiled from: Guideline.java */
    /* renamed from: e2.g$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C4971a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13900a;

        static {
            int[] iArr = new int[C4963d.EnumC4965b.values().length];
            f13900a = iArr;
            try {
                iArr[C4963d.EnumC4965b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13900a[C4963d.EnumC4965b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13900a[C4963d.EnumC4965b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13900a[C4963d.EnumC4965b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13900a[C4963d.EnumC4965b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13900a[C4963d.EnumC4965b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13900a[C4963d.EnumC4965b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13900a[C4963d.EnumC4965b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13900a[C4963d.EnumC4965b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C4970g() {
        this.f13821O.clear();
        this.f13821O.add(this.f13897s0);
        int length = this.f13820N.length;
        for (int i = 0; i < length; i++) {
            this.f13820N[i] = this.f13897s0;
        }
    }

    @Override // p073e2.C4966e
    /* renamed from: Z0 */
    public void mo26017Z0(C4711d c4711d, boolean z) {
        if (m26124I() == null) {
            return;
        }
        int m26838x = c4711d.m26838x(this.f13897s0);
        if (this.f13898t0 == 1) {
            m26097V0(m26838x);
            m26095W0(0);
            m26057v0(m26124I().m26058v());
            m26099U0(0);
            return;
        }
        m26097V0(0);
        m26095W0(m26838x);
        m26099U0(m26124I().m26106R());
        m26057v0(0);
    }

    /* renamed from: a1 */
    public C4963d m26016a1() {
        return this.f13897s0;
    }

    /* renamed from: b1 */
    public int m26015b1() {
        return this.f13898t0;
    }

    /* renamed from: c1 */
    public int m26014c1() {
        return this.f13895q0;
    }

    /* renamed from: d1 */
    public int m26013d1() {
        return this.f13896r0;
    }

    @Override // p073e2.C4966e
    /* renamed from: e0 */
    public boolean mo26012e0() {
        return this.f13899u0;
    }

    /* renamed from: e1 */
    public float m26011e1() {
        return this.f13894p0;
    }

    @Override // p073e2.C4966e
    /* renamed from: f0 */
    public boolean mo26010f0() {
        return this.f13899u0;
    }

    /* renamed from: f1 */
    public void m26009f1(int i) {
        this.f13897s0.m26141s(i);
        this.f13899u0 = true;
    }

    @Override // p073e2.C4966e
    /* renamed from: g */
    public void mo26008g(C4711d c4711d, boolean z) {
        C4969f c4969f = (C4969f) m26124I();
        if (c4969f == null) {
            return;
        }
        C4963d mo26002m = c4969f.mo26002m(C4963d.EnumC4965b.LEFT);
        C4963d mo26002m2 = c4969f.mo26002m(C4963d.EnumC4965b.RIGHT);
        C4966e c4966e = this.f13824R;
        boolean z2 = true;
        boolean z3 = c4966e != null && c4966e.f13823Q[0] == C4966e.EnumC4968b.WRAP_CONTENT;
        if (this.f13898t0 == 0) {
            mo26002m = c4969f.mo26002m(C4963d.EnumC4965b.TOP);
            mo26002m2 = c4969f.mo26002m(C4963d.EnumC4965b.BOTTOM);
            C4966e c4966e2 = this.f13824R;
            if (c4966e2 == null || c4966e2.f13823Q[1] != C4966e.EnumC4968b.WRAP_CONTENT) {
                z2 = false;
            }
            z3 = z2;
        }
        if (this.f13899u0 && this.f13897s0.m26147m()) {
            C4720i m26845q = c4711d.m26845q(this.f13897s0);
            c4711d.m26856f(m26845q, this.f13897s0.m26156d());
            if (this.f13895q0 != -1) {
                if (z3) {
                    c4711d.m26854h(c4711d.m26845q(mo26002m2), m26845q, 0, 5);
                }
            } else if (this.f13896r0 != -1 && z3) {
                C4720i m26845q2 = c4711d.m26845q(mo26002m2);
                c4711d.m26854h(m26845q, c4711d.m26845q(mo26002m), 0, 5);
                c4711d.m26854h(m26845q2, m26845q, 0, 5);
            }
            this.f13899u0 = false;
        } else if (this.f13895q0 != -1) {
            C4720i m26845q3 = c4711d.m26845q(this.f13897s0);
            c4711d.m26857e(m26845q3, c4711d.m26845q(mo26002m), this.f13895q0, 8);
            if (z3) {
                c4711d.m26854h(c4711d.m26845q(mo26002m2), m26845q3, 0, 5);
            }
        } else if (this.f13896r0 != -1) {
            C4720i m26845q4 = c4711d.m26845q(this.f13897s0);
            C4720i m26845q5 = c4711d.m26845q(mo26002m2);
            c4711d.m26857e(m26845q4, m26845q5, -this.f13896r0, 8);
            if (z3) {
                c4711d.m26854h(m26845q4, c4711d.m26845q(mo26002m), 0, 5);
                c4711d.m26854h(m26845q5, m26845q4, 0, 5);
            }
        } else if (this.f13894p0 != -1.0f) {
            c4711d.m26858d(C4711d.m26843s(c4711d, c4711d.m26845q(this.f13897s0), c4711d.m26845q(mo26002m2), this.f13894p0));
        }
    }

    /* renamed from: g1 */
    public void m26007g1(int i) {
        if (i > -1) {
            this.f13894p0 = -1.0f;
            this.f13895q0 = i;
            this.f13896r0 = -1;
        }
    }

    @Override // p073e2.C4966e
    /* renamed from: h */
    public boolean mo26006h() {
        return true;
    }

    /* renamed from: h1 */
    public void m26005h1(int i) {
        if (i > -1) {
            this.f13894p0 = -1.0f;
            this.f13895q0 = -1;
            this.f13896r0 = i;
        }
    }

    /* renamed from: i1 */
    public void m26004i1(float f) {
        if (f > -1.0f) {
            this.f13894p0 = f;
            this.f13895q0 = -1;
            this.f13896r0 = -1;
        }
    }

    /* renamed from: j1 */
    public void m26003j1(int i) {
        if (this.f13898t0 == i) {
            return;
        }
        this.f13898t0 = i;
        this.f13821O.clear();
        if (this.f13898t0 == 1) {
            this.f13897s0 = this.f13812F;
        } else {
            this.f13897s0 = this.f13813G;
        }
        this.f13821O.add(this.f13897s0);
        int length = this.f13820N.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f13820N[i2] = this.f13897s0;
        }
    }

    @Override // p073e2.C4966e
    /* renamed from: m */
    public C4963d mo26002m(C4963d.EnumC4965b enumC4965b) {
        switch (C4971a.f13900a[enumC4965b.ordinal()]) {
            case 1:
            case 2:
                if (this.f13898t0 == 1) {
                    return this.f13897s0;
                }
                break;
            case 3:
            case 4:
                if (this.f13898t0 == 0) {
                    return this.f13897s0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(enumC4965b.name());
    }
}
