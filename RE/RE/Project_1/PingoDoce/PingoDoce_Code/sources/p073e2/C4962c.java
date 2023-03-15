package p073e2;

import java.util.ArrayList;
import p073e2.C4966e;

/* renamed from: e2.c */
/* loaded from: classes.dex */
public class C4962c {

    /* renamed from: a */
    protected C4966e f13776a;

    /* renamed from: b */
    protected C4966e f13777b;

    /* renamed from: c */
    protected C4966e f13778c;

    /* renamed from: d */
    protected C4966e f13779d;

    /* renamed from: e */
    protected C4966e f13780e;

    /* renamed from: f */
    protected C4966e f13781f;

    /* renamed from: g */
    protected C4966e f13782g;

    /* renamed from: h */
    protected ArrayList<C4966e> f13783h;

    /* renamed from: i */
    protected int f13784i;

    /* renamed from: j */
    protected int f13785j;

    /* renamed from: k */
    protected float f13786k = 0.0f;

    /* renamed from: l */
    int f13787l;

    /* renamed from: m */
    int f13788m;

    /* renamed from: n */
    int f13789n;

    /* renamed from: o */
    private int f13790o;

    /* renamed from: p */
    private boolean f13791p;

    /* renamed from: q */
    protected boolean f13792q;

    /* renamed from: r */
    protected boolean f13793r;

    /* renamed from: s */
    protected boolean f13794s;

    /* renamed from: t */
    private boolean f13795t;

    public C4962c(C4966e c4966e, int i, boolean z) {
        this.f13791p = false;
        this.f13776a = c4966e;
        this.f13790o = i;
        this.f13791p = z;
    }

    /* renamed from: b */
    private void m26161b() {
        int i = this.f13790o * 2;
        C4966e c4966e = this.f13776a;
        boolean z = false;
        C4966e c4966e2 = c4966e;
        boolean z2 = false;
        while (!z2) {
            this.f13784i++;
            C4966e[] c4966eArr = c4966e.f13856l0;
            int i2 = this.f13790o;
            C4966e c4966e3 = null;
            c4966eArr[i2] = null;
            c4966e.f13854k0[i2] = null;
            if (c4966e.m26108Q() != 8) {
                this.f13787l++;
                C4966e.EnumC4968b m26064s = c4966e.m26064s(this.f13790o);
                C4966e.EnumC4968b enumC4968b = C4966e.EnumC4968b.MATCH_CONSTRAINT;
                if (m26064s != enumC4968b) {
                    this.f13788m += c4966e.m26136C(this.f13790o);
                }
                int m26155e = this.f13788m + c4966e.f13820N[i].m26155e();
                this.f13788m = m26155e;
                int i3 = i + 1;
                this.f13788m = m26155e + c4966e.f13820N[i3].m26155e();
                int m26155e2 = this.f13789n + c4966e.f13820N[i].m26155e();
                this.f13789n = m26155e2;
                this.f13789n = m26155e2 + c4966e.f13820N[i3].m26155e();
                if (this.f13777b == null) {
                    this.f13777b = c4966e;
                }
                this.f13779d = c4966e;
                C4966e.EnumC4968b[] enumC4968bArr = c4966e.f13823Q;
                int i4 = this.f13790o;
                if (enumC4968bArr[i4] == enumC4968b) {
                    int[] iArr = c4966e.f13862p;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.f13785j++;
                        float[] fArr = c4966e.f13852j0;
                        float f = fArr[i4];
                        if (f > 0.0f) {
                            this.f13786k += fArr[i4];
                        }
                        if (m26160c(c4966e, i4)) {
                            if (f < 0.0f) {
                                this.f13792q = true;
                            } else {
                                this.f13793r = true;
                            }
                            if (this.f13783h == null) {
                                this.f13783h = new ArrayList<>();
                            }
                            this.f13783h.add(c4966e);
                        }
                        if (this.f13781f == null) {
                            this.f13781f = c4966e;
                        }
                        C4966e c4966e4 = this.f13782g;
                        if (c4966e4 != null) {
                            c4966e4.f13854k0[this.f13790o] = c4966e;
                        }
                        this.f13782g = c4966e;
                    }
                    if (this.f13790o == 0) {
                        if (c4966e.f13859n == 0 && c4966e.f13863q == 0) {
                            int i5 = c4966e.f13864r;
                        }
                    } else if (c4966e.f13861o == 0 && c4966e.f13866t == 0) {
                        int i6 = c4966e.f13867u;
                    }
                }
            }
            if (c4966e2 != c4966e) {
                c4966e2.f13856l0[this.f13790o] = c4966e;
            }
            C4963d c4963d = c4966e.f13820N[i + 1].f13801f;
            if (c4963d != null) {
                C4966e c4966e5 = c4963d.f13799d;
                C4963d[] c4963dArr = c4966e5.f13820N;
                if (c4963dArr[i].f13801f != null && c4963dArr[i].f13801f.f13799d == c4966e) {
                    c4966e3 = c4966e5;
                }
            }
            if (c4966e3 == null) {
                c4966e3 = c4966e;
                z2 = true;
            }
            c4966e2 = c4966e;
            c4966e = c4966e3;
        }
        C4966e c4966e6 = this.f13777b;
        if (c4966e6 != null) {
            this.f13788m -= c4966e6.f13820N[i].m26155e();
        }
        C4966e c4966e7 = this.f13779d;
        if (c4966e7 != null) {
            this.f13788m -= c4966e7.f13820N[i + 1].m26155e();
        }
        this.f13778c = c4966e;
        if (this.f13790o == 0 && this.f13791p) {
            this.f13780e = c4966e;
        } else {
            this.f13780e = this.f13776a;
        }
        if (this.f13793r && this.f13792q) {
            z = true;
        }
        this.f13794s = z;
    }

    /* renamed from: c */
    private static boolean m26160c(C4966e c4966e, int i) {
        if (c4966e.m26108Q() != 8 && c4966e.f13823Q[i] == C4966e.EnumC4968b.MATCH_CONSTRAINT) {
            int[] iArr = c4966e.f13862p;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m26162a() {
        if (!this.f13795t) {
            m26161b();
        }
        this.f13795t = true;
    }
}
