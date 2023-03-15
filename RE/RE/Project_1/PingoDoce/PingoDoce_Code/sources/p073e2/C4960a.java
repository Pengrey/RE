package p073e2;

import p053d2.C4711d;
import p053d2.C4720i;
import p073e2.C4963d;
import p073e2.C4966e;

/* renamed from: e2.a */
/* loaded from: classes.dex */
public class C4960a extends C4973i {

    /* renamed from: r0 */
    private int f13772r0 = 0;

    /* renamed from: s0 */
    private boolean f13773s0 = true;

    /* renamed from: t0 */
    private int f13774t0 = 0;

    /* renamed from: u0 */
    boolean f13775u0 = false;

    /* renamed from: c1 */
    public boolean m26173c1() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.f13902q0;
            if (i4 >= i) {
                break;
            }
            C4966e c4966e = this.f13901p0[i4];
            if ((this.f13773s0 || c4966e.mo26006h()) && ((((i2 = this.f13772r0) == 0 || i2 == 1) && !c4966e.mo26012e0()) || (((i3 = this.f13772r0) == 2 || i3 == 3) && !c4966e.mo26010f0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.f13902q0; i6++) {
            C4966e c4966e2 = this.f13901p0[i6];
            if (this.f13773s0 || c4966e2.mo26006h()) {
                if (!z2) {
                    int i7 = this.f13772r0;
                    if (i7 == 0) {
                        i5 = c4966e2.mo26002m(C4963d.EnumC4965b.LEFT).m26156d();
                    } else if (i7 == 1) {
                        i5 = c4966e2.mo26002m(C4963d.EnumC4965b.RIGHT).m26156d();
                    } else if (i7 == 2) {
                        i5 = c4966e2.mo26002m(C4963d.EnumC4965b.TOP).m26156d();
                    } else if (i7 == 3) {
                        i5 = c4966e2.mo26002m(C4963d.EnumC4965b.BOTTOM).m26156d();
                    }
                    z2 = true;
                }
                int i8 = this.f13772r0;
                if (i8 == 0) {
                    i5 = Math.min(i5, c4966e2.mo26002m(C4963d.EnumC4965b.LEFT).m26156d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, c4966e2.mo26002m(C4963d.EnumC4965b.RIGHT).m26156d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, c4966e2.mo26002m(C4963d.EnumC4965b.TOP).m26156d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, c4966e2.mo26002m(C4963d.EnumC4965b.BOTTOM).m26156d());
                }
            }
        }
        int i9 = i5 + this.f13774t0;
        int i10 = this.f13772r0;
        if (i10 != 0 && i10 != 1) {
            m26063s0(i9, i9);
        } else {
            m26069p0(i9, i9);
        }
        this.f13775u0 = true;
        return true;
    }

    /* renamed from: d1 */
    public boolean m26172d1() {
        return this.f13773s0;
    }

    @Override // p073e2.C4966e
    /* renamed from: e0 */
    public boolean mo26012e0() {
        return this.f13775u0;
    }

    /* renamed from: e1 */
    public int m26171e1() {
        return this.f13772r0;
    }

    @Override // p073e2.C4966e
    /* renamed from: f0 */
    public boolean mo26010f0() {
        return this.f13775u0;
    }

    /* renamed from: f1 */
    public int m26170f1() {
        return this.f13774t0;
    }

    @Override // p073e2.C4966e
    /* renamed from: g */
    public void mo26008g(C4711d c4711d, boolean z) {
        Object[] objArr;
        boolean z2;
        int i;
        int i2;
        int i3;
        C4963d[] c4963dArr = this.f13820N;
        c4963dArr[0] = this.f13812F;
        c4963dArr[2] = this.f13813G;
        c4963dArr[1] = this.f13814H;
        c4963dArr[3] = this.f13815I;
        int i4 = 0;
        while (true) {
            objArr = this.f13820N;
            if (i4 >= objArr.length) {
                break;
            }
            objArr[i4].f13804i = c4711d.m26845q(objArr[i4]);
            i4++;
        }
        int i5 = this.f13772r0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        C4963d c4963d = objArr[i5];
        if (!this.f13775u0) {
            m26173c1();
        }
        if (this.f13775u0) {
            this.f13775u0 = false;
            int i6 = this.f13772r0;
            if (i6 == 0 || i6 == 1) {
                c4711d.m26856f(this.f13812F.f13804i, this.f13829W);
                c4711d.m26856f(this.f13814H.f13804i, this.f13829W);
                return;
            } else if (i6 == 2 || i6 == 3) {
                c4711d.m26856f(this.f13813G.f13804i, this.f13830X);
                c4711d.m26856f(this.f13815I.f13804i, this.f13830X);
                return;
            } else {
                return;
            }
        }
        for (int i7 = 0; i7 < this.f13902q0; i7++) {
            C4966e c4966e = this.f13901p0[i7];
            if ((this.f13773s0 || c4966e.mo26006h()) && ((((i2 = this.f13772r0) == 0 || i2 == 1) && c4966e.m26052y() == C4966e.EnumC4968b.MATCH_CONSTRAINT && c4966e.f13812F.f13801f != null && c4966e.f13814H.f13801f != null) || (((i3 = this.f13772r0) == 2 || i3 == 3) && c4966e.m26112O() == C4966e.EnumC4968b.MATCH_CONSTRAINT && c4966e.f13813G.f13801f != null && c4966e.f13815I.f13801f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.f13812F.m26149k() || this.f13814H.m26149k();
        boolean z4 = this.f13813G.m26149k() || this.f13815I.m26149k();
        int i8 = !z2 && (((i = this.f13772r0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4)))) ? 5 : 4;
        for (int i9 = 0; i9 < this.f13902q0; i9++) {
            C4966e c4966e2 = this.f13901p0[i9];
            if (this.f13773s0 || c4966e2.mo26006h()) {
                C4720i m26845q = c4711d.m26845q(c4966e2.f13820N[this.f13772r0]);
                C4963d[] c4963dArr2 = c4966e2.f13820N;
                int i10 = this.f13772r0;
                c4963dArr2[i10].f13804i = m26845q;
                int i11 = (c4963dArr2[i10].f13801f == null || c4963dArr2[i10].f13801f.f13799d != this) ? 0 : c4963dArr2[i10].f13802g + 0;
                if (i10 != 0 && i10 != 2) {
                    c4711d.m26855g(c4963d.f13804i, m26845q, this.f13774t0 + i11, z2);
                } else {
                    c4711d.m26853i(c4963d.f13804i, m26845q, this.f13774t0 - i11, z2);
                }
                c4711d.m26857e(c4963d.f13804i, m26845q, this.f13774t0 + i11, i8);
            }
        }
        int i12 = this.f13772r0;
        if (i12 == 0) {
            c4711d.m26857e(this.f13814H.f13804i, this.f13812F.f13804i, 0, 8);
            c4711d.m26857e(this.f13812F.f13804i, this.f13824R.f13814H.f13804i, 0, 4);
            c4711d.m26857e(this.f13812F.f13804i, this.f13824R.f13812F.f13804i, 0, 0);
        } else if (i12 == 1) {
            c4711d.m26857e(this.f13812F.f13804i, this.f13814H.f13804i, 0, 8);
            c4711d.m26857e(this.f13812F.f13804i, this.f13824R.f13812F.f13804i, 0, 4);
            c4711d.m26857e(this.f13812F.f13804i, this.f13824R.f13814H.f13804i, 0, 0);
        } else if (i12 == 2) {
            c4711d.m26857e(this.f13815I.f13804i, this.f13813G.f13804i, 0, 8);
            c4711d.m26857e(this.f13813G.f13804i, this.f13824R.f13815I.f13804i, 0, 4);
            c4711d.m26857e(this.f13813G.f13804i, this.f13824R.f13813G.f13804i, 0, 0);
        } else if (i12 == 3) {
            c4711d.m26857e(this.f13813G.f13804i, this.f13815I.f13804i, 0, 8);
            c4711d.m26857e(this.f13813G.f13804i, this.f13824R.f13813G.f13804i, 0, 4);
            c4711d.m26857e(this.f13813G.f13804i, this.f13824R.f13815I.f13804i, 0, 0);
        }
    }

    /* renamed from: g1 */
    public int m26169g1() {
        int i = this.f13772r0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // p073e2.C4966e
    /* renamed from: h */
    public boolean mo26006h() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h1 */
    public void m26168h1() {
        for (int i = 0; i < this.f13902q0; i++) {
            C4966e c4966e = this.f13901p0[i];
            int i2 = this.f13772r0;
            if (i2 == 0 || i2 == 1) {
                c4966e.m26135C0(0, true);
            } else if (i2 == 2 || i2 == 3) {
                c4966e.m26135C0(1, true);
            }
        }
    }

    /* renamed from: i1 */
    public void m26167i1(boolean z) {
        this.f13773s0 = z;
    }

    /* renamed from: j1 */
    public void m26166j1(int i) {
        this.f13772r0 = i;
    }

    /* renamed from: k1 */
    public void m26165k1(int i) {
        this.f13774t0 = i;
    }

    @Override // p073e2.C4966e
    public String toString() {
        String str = "[Barrier] " + m26066r() + " {";
        for (int i = 0; i < this.f13902q0; i++) {
            C4966e c4966e = this.f13901p0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + c4966e.m26066r();
        }
        return str + "}";
    }
}
