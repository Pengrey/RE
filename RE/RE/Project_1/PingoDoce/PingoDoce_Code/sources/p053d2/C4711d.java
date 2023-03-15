package p053d2;

import java.util.Arrays;
import java.util.HashMap;
import p053d2.C4720i;
import p073e2.C4963d;
import p073e2.C4966e;

/* renamed from: d2.d */
/* loaded from: classes.dex */
public class C4711d {

    /* renamed from: r */
    public static boolean f12856r = false;

    /* renamed from: s */
    public static boolean f12857s = true;

    /* renamed from: t */
    public static boolean f12858t = true;

    /* renamed from: u */
    public static boolean f12859u = true;

    /* renamed from: v */
    public static boolean f12860v = false;

    /* renamed from: w */
    private static int f12861w = 1000;

    /* renamed from: x */
    public static C4714e f12862x;

    /* renamed from: y */
    public static long f12863y;

    /* renamed from: z */
    public static long f12864z;

    /* renamed from: d */
    private InterfaceC4712a f12868d;

    /* renamed from: g */
    C4708b[] f12871g;

    /* renamed from: n */
    final C4710c f12878n;

    /* renamed from: q */
    private InterfaceC4712a f12881q;

    /* renamed from: a */
    public boolean f12865a = false;

    /* renamed from: b */
    int f12866b = 0;

    /* renamed from: c */
    private HashMap<String, C4720i> f12867c = null;

    /* renamed from: e */
    private int f12869e = 32;

    /* renamed from: f */
    private int f12870f = 32;

    /* renamed from: h */
    public boolean f12872h = false;

    /* renamed from: i */
    public boolean f12873i = false;

    /* renamed from: j */
    private boolean[] f12874j = new boolean[32];

    /* renamed from: k */
    int f12875k = 1;

    /* renamed from: l */
    int f12876l = 0;

    /* renamed from: m */
    private int f12877m = 32;

    /* renamed from: o */
    private C4720i[] f12879o = new C4720i[f12861w];

    /* renamed from: p */
    private int f12880p = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinearSystem.java */
    /* renamed from: d2.d$a */
    /* loaded from: classes.dex */
    public interface InterfaceC4712a {
        /* renamed from: a */
        void mo26835a(InterfaceC4712a interfaceC4712a);

        /* renamed from: b */
        C4720i mo26827b(C4711d c4711d, boolean[] zArr);

        /* renamed from: c */
        void mo26826c(C4720i c4720i);

        void clear();

        C4720i getKey();

        boolean isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinearSystem.java */
    /* renamed from: d2.d$b */
    /* loaded from: classes.dex */
    public class C4713b extends C4708b {
        public C4713b(C4711d c4711d, C4710c c4710c) {
            this.f12850e = new C4722j(this, c4710c);
        }
    }

    public C4711d() {
        this.f12871g = null;
        this.f12871g = new C4708b[32];
        m26863C();
        C4710c c4710c = new C4710c();
        this.f12878n = c4710c;
        this.f12868d = new C4717h(c4710c);
        if (f12860v) {
            this.f12881q = new C4713b(this, c4710c);
        } else {
            this.f12881q = new C4708b(c4710c);
        }
    }

    /* renamed from: B */
    private final int m26864B(InterfaceC4712a interfaceC4712a, boolean z) {
        for (int i = 0; i < this.f12875k; i++) {
            this.f12874j[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 >= this.f12875k * 2) {
                return i2;
            }
            if (interfaceC4712a.getKey() != null) {
                this.f12874j[interfaceC4712a.getKey().f12894c] = true;
            }
            C4720i mo26827b = interfaceC4712a.mo26827b(this, this.f12874j);
            if (mo26827b != null) {
                boolean[] zArr = this.f12874j;
                int i3 = mo26827b.f12894c;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (mo26827b != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f12876l; i5++) {
                    C4708b c4708b = this.f12871g[i5];
                    if (c4708b.f12846a.f12901j != C4720i.EnumC4721a.UNRESTRICTED && !c4708b.f12851f && c4708b.m26872t(mo26827b)) {
                        float mo26809d = c4708b.f12850e.mo26809d(mo26827b);
                        if (mo26809d < 0.0f) {
                            float f2 = (-c4708b.f12847b) / mo26809d;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C4708b c4708b2 = this.f12871g[i4];
                    c4708b2.f12846a.f12895d = -1;
                    c4708b2.m26868x(mo26827b);
                    C4720i c4720i = c4708b2.f12846a;
                    c4720i.f12895d = i4;
                    c4720i.m26813g(this, c4708b2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: C */
    private void m26863C() {
        int i = 0;
        if (f12860v) {
            while (i < this.f12876l) {
                C4708b c4708b = this.f12871g[i];
                if (c4708b != null) {
                    this.f12878n.f12852a.mo26834a(c4708b);
                }
                this.f12871g[i] = null;
                i++;
            }
            return;
        }
        while (i < this.f12876l) {
            C4708b c4708b2 = this.f12871g[i];
            if (c4708b2 != null) {
                this.f12878n.f12853b.mo26834a(c4708b2);
            }
            this.f12871g[i] = null;
            i++;
        }
    }

    /* renamed from: a */
    private C4720i m26861a(C4720i.EnumC4721a enumC4721a, String str) {
        C4720i mo26833b = this.f12878n.f12854c.mo26833b();
        if (mo26833b == null) {
            mo26833b = new C4720i(enumC4721a, str);
            mo26833b.m26814f(enumC4721a, str);
        } else {
            mo26833b.m26816d();
            mo26833b.m26814f(enumC4721a, str);
        }
        int i = this.f12880p;
        int i2 = f12861w;
        if (i >= i2) {
            int i3 = i2 * 2;
            f12861w = i3;
            this.f12879o = (C4720i[]) Arrays.copyOf(this.f12879o, i3);
        }
        C4720i[] c4720iArr = this.f12879o;
        int i4 = this.f12880p;
        this.f12880p = i4 + 1;
        c4720iArr[i4] = mo26833b;
        return mo26833b;
    }

    /* renamed from: l */
    private final void m26850l(C4708b c4708b) {
        int i;
        if (f12858t && c4708b.f12851f) {
            c4708b.f12846a.m26815e(this, c4708b.f12847b);
        } else {
            C4708b[] c4708bArr = this.f12871g;
            int i2 = this.f12876l;
            c4708bArr[i2] = c4708b;
            C4720i c4720i = c4708b.f12846a;
            c4720i.f12895d = i2;
            this.f12876l = i2 + 1;
            c4720i.m26813g(this, c4708b);
        }
        if (f12858t && this.f12865a) {
            int i3 = 0;
            while (i3 < this.f12876l) {
                if (this.f12871g[i3] == null) {
                    System.out.println("WTF");
                }
                C4708b[] c4708bArr2 = this.f12871g;
                if (c4708bArr2[i3] != null && c4708bArr2[i3].f12851f) {
                    C4708b c4708b2 = c4708bArr2[i3];
                    c4708b2.f12846a.m26815e(this, c4708b2.f12847b);
                    if (f12860v) {
                        this.f12878n.f12852a.mo26834a(c4708b2);
                    } else {
                        this.f12878n.f12853b.mo26834a(c4708b2);
                    }
                    this.f12871g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f12876l;
                        if (i4 >= i) {
                            break;
                        }
                        C4708b[] c4708bArr3 = this.f12871g;
                        int i6 = i4 - 1;
                        c4708bArr3[i6] = c4708bArr3[i4];
                        if (c4708bArr3[i6].f12846a.f12895d == i4) {
                            c4708bArr3[i6].f12846a.f12895d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f12871g[i5] = null;
                    }
                    this.f12876l = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f12865a = false;
        }
    }

    /* renamed from: n */
    private void m26848n() {
        for (int i = 0; i < this.f12876l; i++) {
            C4708b c4708b = this.f12871g[i];
            c4708b.f12846a.f12897f = c4708b.f12847b;
        }
    }

    /* renamed from: s */
    public static C4708b m26843s(C4711d c4711d, C4720i c4720i, C4720i c4720i2, float f) {
        return c4711d.m26844r().m26882j(c4720i, c4720i2, f);
    }

    /* renamed from: u */
    private int m26841u(InterfaceC4712a interfaceC4712a) throws Exception {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.f12876l) {
                z = false;
                break;
            }
            C4708b[] c4708bArr = this.f12871g;
            if (c4708bArr[i].f12846a.f12901j != C4720i.EnumC4721a.UNRESTRICTED && c4708bArr[i].f12847b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                i2++;
                float f = Float.MAX_VALUE;
                int i3 = -1;
                int i4 = -1;
                int i5 = 0;
                for (int i6 = 0; i6 < this.f12876l; i6++) {
                    C4708b c4708b = this.f12871g[i6];
                    if (c4708b.f12846a.f12901j != C4720i.EnumC4721a.UNRESTRICTED && !c4708b.f12851f && c4708b.f12847b < 0.0f) {
                        int i7 = 9;
                        if (f12859u) {
                            int mo26810c = c4708b.f12850e.mo26810c();
                            int i8 = 0;
                            while (i8 < mo26810c) {
                                C4720i mo26805h = c4708b.f12850e.mo26805h(i8);
                                float mo26809d = c4708b.f12850e.mo26809d(mo26805h);
                                if (mo26809d > 0.0f) {
                                    int i9 = 0;
                                    while (i9 < i7) {
                                        float f2 = mo26805h.f12899h[i9] / mo26809d;
                                        if ((f2 < f && i9 == i5) || i9 > i5) {
                                            i4 = mo26805h.f12894c;
                                            i5 = i9;
                                            i3 = i6;
                                            f = f2;
                                        }
                                        i9++;
                                        i7 = 9;
                                    }
                                }
                                i8++;
                                i7 = 9;
                            }
                        } else {
                            for (int i10 = 1; i10 < this.f12875k; i10++) {
                                C4720i c4720i = this.f12878n.f12855d[i10];
                                float mo26809d2 = c4708b.f12850e.mo26809d(c4720i);
                                if (mo26809d2 > 0.0f) {
                                    for (int i11 = 0; i11 < 9; i11++) {
                                        float f3 = c4720i.f12899h[i11] / mo26809d2;
                                        if ((f3 < f && i11 == i5) || i11 > i5) {
                                            i4 = i10;
                                            i3 = i6;
                                            i5 = i11;
                                            f = f3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i3 != -1) {
                    C4708b c4708b2 = this.f12871g[i3];
                    c4708b2.f12846a.f12895d = -1;
                    c4708b2.m26868x(this.f12878n.f12855d[i4]);
                    C4720i c4720i2 = c4708b2.f12846a;
                    c4720i2.f12895d = i3;
                    c4720i2.m26813g(this, c4708b2);
                } else {
                    z2 = true;
                }
                if (i2 > this.f12875k / 2) {
                    z2 = true;
                }
            }
            return i2;
        }
        return 0;
    }

    /* renamed from: w */
    public static C4714e m26839w() {
        return f12862x;
    }

    /* renamed from: y */
    private void m26837y() {
        int i = this.f12869e * 2;
        this.f12869e = i;
        this.f12871g = (C4708b[]) Arrays.copyOf(this.f12871g, i);
        C4710c c4710c = this.f12878n;
        c4710c.f12855d = (C4720i[]) Arrays.copyOf(c4710c.f12855d, this.f12869e);
        int i2 = this.f12869e;
        this.f12874j = new boolean[i2];
        this.f12870f = i2;
        this.f12877m = i2;
    }

    /* renamed from: A */
    void m26865A(InterfaceC4712a interfaceC4712a) throws Exception {
        m26841u(interfaceC4712a);
        m26864B(interfaceC4712a, false);
        m26848n();
    }

    /* renamed from: D */
    public void m26862D() {
        C4710c c4710c;
        int i = 0;
        while (true) {
            c4710c = this.f12878n;
            C4720i[] c4720iArr = c4710c.f12855d;
            if (i >= c4720iArr.length) {
                break;
            }
            C4720i c4720i = c4720iArr[i];
            if (c4720i != null) {
                c4720i.m26816d();
            }
            i++;
        }
        c4710c.f12854c.mo26832c(this.f12879o, this.f12880p);
        this.f12880p = 0;
        Arrays.fill(this.f12878n.f12855d, (Object) null);
        HashMap<String, C4720i> hashMap = this.f12867c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f12866b = 0;
        this.f12868d.clear();
        this.f12875k = 1;
        for (int i2 = 0; i2 < this.f12876l; i2++) {
            C4708b[] c4708bArr = this.f12871g;
            if (c4708bArr[i2] != null) {
                c4708bArr[i2].f12848c = false;
            }
        }
        m26863C();
        this.f12876l = 0;
        if (f12860v) {
            this.f12881q = new C4713b(this, this.f12878n);
        } else {
            this.f12881q = new C4708b(this.f12878n);
        }
    }

    /* renamed from: b */
    public void m26860b(C4966e c4966e, C4966e c4966e2, float f, int i) {
        C4963d.EnumC4965b enumC4965b = C4963d.EnumC4965b.LEFT;
        C4720i m26845q = m26845q(c4966e.mo26002m(enumC4965b));
        C4963d.EnumC4965b enumC4965b2 = C4963d.EnumC4965b.TOP;
        C4720i m26845q2 = m26845q(c4966e.mo26002m(enumC4965b2));
        C4963d.EnumC4965b enumC4965b3 = C4963d.EnumC4965b.RIGHT;
        C4720i m26845q3 = m26845q(c4966e.mo26002m(enumC4965b3));
        C4963d.EnumC4965b enumC4965b4 = C4963d.EnumC4965b.BOTTOM;
        C4720i m26845q4 = m26845q(c4966e.mo26002m(enumC4965b4));
        C4720i m26845q5 = m26845q(c4966e2.mo26002m(enumC4965b));
        C4720i m26845q6 = m26845q(c4966e2.mo26002m(enumC4965b2));
        C4720i m26845q7 = m26845q(c4966e2.mo26002m(enumC4965b3));
        C4720i m26845q8 = m26845q(c4966e2.mo26002m(enumC4965b4));
        C4708b m26844r = m26844r();
        double d = f;
        double d2 = i;
        m26844r.m26875q(m26845q2, m26845q4, m26845q6, m26845q8, (float) (Math.sin(d) * d2));
        m26858d(m26844r);
        C4708b m26844r2 = m26844r();
        m26844r2.m26875q(m26845q, m26845q3, m26845q5, m26845q7, (float) (Math.cos(d) * d2));
        m26858d(m26844r2);
    }

    /* renamed from: c */
    public void m26859c(C4720i c4720i, C4720i c4720i2, int i, float f, C4720i c4720i3, C4720i c4720i4, int i2, int i3) {
        C4708b m26844r = m26844r();
        m26844r.m26884h(c4720i, c4720i2, i, f, c4720i3, c4720i4, i2);
        if (i3 != 8) {
            m26844r.m26888d(this, i3);
        }
        m26858d(m26844r);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m26858d(p053d2.C4708b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r5.f12876l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f12877m
            if (r0 >= r2) goto L12
            int r0 = r5.f12875k
            int r0 = r0 + r1
            int r2 = r5.f12870f
            if (r0 < r2) goto L15
        L12:
            r5.m26837y()
        L15:
            r0 = 0
            boolean r2 = r6.f12851f
            if (r2 != 0) goto L84
            r6.m26889D(r5)
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L24
            return
        L24:
            r6.m26874r()
            boolean r2 = r6.m26886f(r5)
            if (r2 == 0) goto L7b
            d2.i r2 = r5.m26846p()
            r6.f12846a = r2
            int r3 = r5.f12876l
            r5.m26850l(r6)
            int r4 = r5.f12876l
            int r3 = r3 + r1
            if (r4 != r3) goto L7b
            d2.d$a r0 = r5.f12881q
            r0.mo26835a(r6)
            d2.d$a r0 = r5.f12881q
            r5.m26864B(r0, r1)
            int r0 = r2.f12895d
            r3 = -1
            if (r0 != r3) goto L7c
            d2.i r0 = r6.f12846a
            if (r0 != r2) goto L59
            d2.i r0 = r6.m26870v(r2)
            if (r0 == 0) goto L59
            r6.m26868x(r0)
        L59:
            boolean r0 = r6.f12851f
            if (r0 != 0) goto L62
            d2.i r0 = r6.f12846a
            r0.m26813g(r5, r6)
        L62:
            boolean r0 = p053d2.C4711d.f12860v
            if (r0 == 0) goto L6e
            d2.c r0 = r5.f12878n
            d2.f<d2.b> r0 = r0.f12852a
            r0.mo26834a(r6)
            goto L75
        L6e:
            d2.c r0 = r5.f12878n
            d2.f<d2.b> r0 = r0.f12853b
            r0.mo26834a(r6)
        L75:
            int r0 = r5.f12876l
            int r0 = r0 - r1
            r5.f12876l = r0
            goto L7c
        L7b:
            r1 = r0
        L7c:
            boolean r0 = r6.m26873s()
            if (r0 != 0) goto L83
            return
        L83:
            r0 = r1
        L84:
            if (r0 != 0) goto L89
            r5.m26850l(r6)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p053d2.C4711d.m26858d(d2.b):void");
    }

    /* renamed from: e */
    public C4708b m26857e(C4720i c4720i, C4720i c4720i2, int i, int i2) {
        if (f12857s && i2 == 8 && c4720i2.f12898g && c4720i.f12895d == -1) {
            c4720i.m26815e(this, c4720i2.f12897f + i);
            return null;
        }
        C4708b m26844r = m26844r();
        m26844r.m26878n(c4720i, c4720i2, i);
        if (i2 != 8) {
            m26844r.m26888d(this, i2);
        }
        m26858d(m26844r);
        return m26844r;
    }

    /* renamed from: f */
    public void m26856f(C4720i c4720i, int i) {
        if (f12857s && c4720i.f12895d == -1) {
            float f = i;
            c4720i.m26815e(this, f);
            for (int i2 = 0; i2 < this.f12866b + 1; i2++) {
                C4720i c4720i2 = this.f12878n.f12855d[i2];
                if (c4720i2 != null && c4720i2.f12905n && c4720i2.f12906o == c4720i.f12894c) {
                    c4720i2.m26815e(this, c4720i2.f12907p + f);
                }
            }
            return;
        }
        int i3 = c4720i.f12895d;
        if (i3 != -1) {
            C4708b c4708b = this.f12871g[i3];
            if (c4708b.f12851f) {
                c4708b.f12847b = i;
                return;
            } else if (c4708b.f12850e.mo26810c() == 0) {
                c4708b.f12851f = true;
                c4708b.f12847b = i;
                return;
            } else {
                C4708b m26844r = m26844r();
                m26844r.m26879m(c4720i, i);
                m26858d(m26844r);
                return;
            }
        }
        C4708b m26844r2 = m26844r();
        m26844r2.m26883i(c4720i, i);
        m26858d(m26844r2);
    }

    /* renamed from: g */
    public void m26855g(C4720i c4720i, C4720i c4720i2, int i, boolean z) {
        C4708b m26844r = m26844r();
        C4720i m26842t = m26842t();
        m26842t.f12896e = 0;
        m26844r.m26877o(c4720i, c4720i2, m26842t, i);
        m26858d(m26844r);
    }

    /* renamed from: h */
    public void m26854h(C4720i c4720i, C4720i c4720i2, int i, int i2) {
        C4708b m26844r = m26844r();
        C4720i m26842t = m26842t();
        m26842t.f12896e = 0;
        m26844r.m26877o(c4720i, c4720i2, m26842t, i);
        if (i2 != 8) {
            m26849m(m26844r, (int) (m26844r.f12850e.mo26809d(m26842t) * (-1.0f)), i2);
        }
        m26858d(m26844r);
    }

    /* renamed from: i */
    public void m26853i(C4720i c4720i, C4720i c4720i2, int i, boolean z) {
        C4708b m26844r = m26844r();
        C4720i m26842t = m26842t();
        m26842t.f12896e = 0;
        m26844r.m26876p(c4720i, c4720i2, m26842t, i);
        m26858d(m26844r);
    }

    /* renamed from: j */
    public void m26852j(C4720i c4720i, C4720i c4720i2, int i, int i2) {
        C4708b m26844r = m26844r();
        C4720i m26842t = m26842t();
        m26842t.f12896e = 0;
        m26844r.m26876p(c4720i, c4720i2, m26842t, i);
        if (i2 != 8) {
            m26849m(m26844r, (int) (m26844r.f12850e.mo26809d(m26842t) * (-1.0f)), i2);
        }
        m26858d(m26844r);
    }

    /* renamed from: k */
    public void m26851k(C4720i c4720i, C4720i c4720i2, C4720i c4720i3, C4720i c4720i4, float f, int i) {
        C4708b m26844r = m26844r();
        m26844r.m26881k(c4720i, c4720i2, c4720i3, c4720i4, f);
        if (i != 8) {
            m26844r.m26888d(this, i);
        }
        m26858d(m26844r);
    }

    /* renamed from: m */
    void m26849m(C4708b c4708b, int i, int i2) {
        c4708b.m26887e(m26847o(i2, null), i);
    }

    /* renamed from: o */
    public C4720i m26847o(int i, String str) {
        if (this.f12875k + 1 >= this.f12870f) {
            m26837y();
        }
        C4720i m26861a = m26861a(C4720i.EnumC4721a.ERROR, str);
        int i2 = this.f12866b + 1;
        this.f12866b = i2;
        this.f12875k++;
        m26861a.f12894c = i2;
        m26861a.f12896e = i;
        this.f12878n.f12855d[i2] = m26861a;
        this.f12868d.mo26826c(m26861a);
        return m26861a;
    }

    /* renamed from: p */
    public C4720i m26846p() {
        if (this.f12875k + 1 >= this.f12870f) {
            m26837y();
        }
        C4720i m26861a = m26861a(C4720i.EnumC4721a.SLACK, null);
        int i = this.f12866b + 1;
        this.f12866b = i;
        this.f12875k++;
        m26861a.f12894c = i;
        this.f12878n.f12855d[i] = m26861a;
        return m26861a;
    }

    /* renamed from: q */
    public C4720i m26845q(Object obj) {
        C4720i c4720i = null;
        if (obj == null) {
            return null;
        }
        if (this.f12875k + 1 >= this.f12870f) {
            m26837y();
        }
        if (obj instanceof C4963d) {
            C4963d c4963d = (C4963d) obj;
            c4720i = c4963d.m26152h();
            if (c4720i == null) {
                c4963d.m26142r(this.f12878n);
                c4720i = c4963d.m26152h();
            }
            int i = c4720i.f12894c;
            if (i == -1 || i > this.f12866b || this.f12878n.f12855d[i] == null) {
                if (i != -1) {
                    c4720i.m26816d();
                }
                int i2 = this.f12866b + 1;
                this.f12866b = i2;
                this.f12875k++;
                c4720i.f12894c = i2;
                c4720i.f12901j = C4720i.EnumC4721a.UNRESTRICTED;
                this.f12878n.f12855d[i2] = c4720i;
            }
        }
        return c4720i;
    }

    /* renamed from: r */
    public C4708b m26844r() {
        C4708b mo26833b;
        if (f12860v) {
            mo26833b = this.f12878n.f12852a.mo26833b();
            if (mo26833b == null) {
                mo26833b = new C4713b(this, this.f12878n);
                f12864z++;
            } else {
                mo26833b.m26867y();
            }
        } else {
            mo26833b = this.f12878n.f12853b.mo26833b();
            if (mo26833b == null) {
                mo26833b = new C4708b(this.f12878n);
                f12863y++;
            } else {
                mo26833b.m26867y();
            }
        }
        C4720i.m26818b();
        return mo26833b;
    }

    /* renamed from: t */
    public C4720i m26842t() {
        if (this.f12875k + 1 >= this.f12870f) {
            m26837y();
        }
        C4720i m26861a = m26861a(C4720i.EnumC4721a.SLACK, null);
        int i = this.f12866b + 1;
        this.f12866b = i;
        this.f12875k++;
        m26861a.f12894c = i;
        this.f12878n.f12855d[i] = m26861a;
        return m26861a;
    }

    /* renamed from: v */
    public C4710c m26840v() {
        return this.f12878n;
    }

    /* renamed from: x */
    public int m26838x(Object obj) {
        C4720i m26152h = ((C4963d) obj).m26152h();
        if (m26152h != null) {
            return (int) (m26152h.f12897f + 0.5f);
        }
        return 0;
    }

    /* renamed from: z */
    public void m26836z() throws Exception {
        if (this.f12868d.isEmpty()) {
            m26848n();
        } else if (!this.f12872h && !this.f12873i) {
            m26865A(this.f12868d);
        } else {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f12876l) {
                    z = true;
                    break;
                } else if (!this.f12871g[i].f12851f) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                m26865A(this.f12868d);
            } else {
                m26848n();
            }
        }
    }
}
