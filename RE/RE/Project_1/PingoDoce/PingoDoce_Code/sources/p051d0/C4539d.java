package p051d0;

import p092f0.InterfaceC5179i;
import p393v0.C11003c0;
import p393v0.Color;
import p410w.InterfaceC11498x;
import p410w.Padding;
import p479z1.C13605g;

/* renamed from: d0.d */
/* loaded from: classes.dex */
public final class C4539d {

    /* renamed from: a */
    public static final C4539d f12261a = new C4539d();

    /* renamed from: b */
    private static final float f12262b;

    /* renamed from: c */
    private static final float f12263c;

    /* renamed from: d */
    private static final InterfaceC11498x f12264d;

    /* renamed from: e */
    private static final float f12265e;

    /* renamed from: f */
    private static final float f12266f;

    /* renamed from: g */
    private static final float f12267g;

    /* renamed from: h */
    private static final InterfaceC11498x f12268h;

    static {
        float m875g = C13605g.m875g(16);
        f12262b = m875g;
        float f = 8;
        float m875g2 = C13605g.m875g(f);
        f12263c = m875g2;
        InterfaceC11498x m4985d = Padding.m4985d(m875g, m875g2, m875g, m875g2);
        f12264d = m4985d;
        f12265e = C13605g.m875g(64);
        f12266f = C13605g.m875g(36);
        C13605g.m875g(18);
        C13605g.m875g(f);
        C13605g.m875g(1);
        float m875g3 = C13605g.m875g(f);
        f12267g = m875g3;
        f12268h = Padding.m4985d(m875g3, m4985d.mo4958c(), m875g3, m4985d.mo4959b());
    }

    private C4539d() {
    }

    /* renamed from: a */
    public final InterfaceC4537c m27261a(long j, long j2, long j3, long j4, InterfaceC5179i interfaceC5179i, int i, int i2) {
        long j5;
        interfaceC5179i.mo25263g(2063545420);
        long m27171j = (i2 & 1) != 0 ? C4591j0.f12477a.m27117a(interfaceC5179i, 6).m27171j() : j;
        long m27147b = (i2 & 2) != 0 ? Colors.m27147b(m27171j, interfaceC5179i, i & 14) : j2;
        if ((i2 & 4) != 0) {
            C4591j0 c4591j0 = C4591j0.f12477a;
            j5 = C11003c0.m6591e(Color.m6648l(c4591j0.m27117a(interfaceC5179i, 6).m27172i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), c4591j0.m27117a(interfaceC5179i, 6).m27167n());
        } else {
            j5 = j3;
        }
        C4606n c4606n = new C4606n(m27171j, m27147b, j5, (i2 & 8) != 0 ? Color.m6648l(C4591j0.f12477a.m27117a(interfaceC5179i, 6).m27172i(), C4594k.f12480a.m27109b(interfaceC5179i, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4, null);
        interfaceC5179i.mo25282C();
        return c4606n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
        if (r3 == p092f0.InterfaceC5285i.f14328a.m23582a()) goto L27;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p051d0.InterfaceC4549e m27260b(float r14, float r15, float r16, float r17, float r18, p092f0.InterfaceC5179i r19, int r20, int r21) {
        /*
            r13 = this;
            r0 = r19
            r1 = 399130879(0x17ca40ff, float:1.3070351E-24)
            r0.mo25263g(r1)
            r1 = r21 & 1
            r2 = 2
            if (r1 == 0) goto L14
            float r1 = (float) r2
            float r1 = p479z1.C13605g.m875g(r1)
            r4 = r1
            goto L15
        L14:
            r4 = r14
        L15:
            r1 = r21 & 2
            if (r1 == 0) goto L22
            r1 = 8
            float r1 = (float) r1
            float r1 = p479z1.C13605g.m875g(r1)
            r5 = r1
            goto L23
        L22:
            r5 = r15
        L23:
            r1 = r21 & 4
            r3 = 0
            if (r1 == 0) goto L2f
            float r1 = (float) r3
            float r1 = p479z1.C13605g.m875g(r1)
            r6 = r1
            goto L31
        L2f:
            r6 = r16
        L31:
            r1 = r21 & 8
            r7 = 4
            if (r1 == 0) goto L3c
            float r1 = (float) r7
            float r1 = p479z1.C13605g.m875g(r1)
            goto L3e
        L3c:
            r1 = r17
        L3e:
            r8 = r21 & 16
            if (r8 == 0) goto L48
            float r8 = (float) r7
            float r8 = p479z1.C13605g.m875g(r8)
            goto L4a
        L48:
            r8 = r18
        L4a:
            r9 = 5
            java.lang.Object[] r10 = new java.lang.Object[r9]
            z1.g r11 = p479z1.C13605g.m878d(r4)
            r10[r3] = r11
            z1.g r11 = p479z1.C13605g.m878d(r5)
            r12 = 1
            r10[r12] = r11
            z1.g r11 = p479z1.C13605g.m878d(r6)
            r10[r2] = r11
            r2 = 3
            z1.g r11 = p479z1.C13605g.m878d(r1)
            r10[r2] = r11
            z1.g r2 = p479z1.C13605g.m878d(r8)
            r10[r7] = r2
            r2 = -3685570(0xffffffffffc7c33e, float:NaN)
            r0.mo25263g(r2)
            r2 = r3
        L74:
            if (r3 >= r9) goto L80
            r7 = r10[r3]
            int r3 = r3 + 1
            boolean r7 = r0.mo25276I(r7)
            r2 = r2 | r7
            goto L74
        L80:
            java.lang.Object r3 = r19.mo25262h()
            if (r2 != 0) goto L8e
            f0.i$a r2 = p092f0.InterfaceC5179i.f14328a
            java.lang.Object r2 = r2.m25243a()
            if (r3 != r2) goto L99
        L8e:
            d0.o r2 = new d0.o
            r9 = 0
            r3 = r2
            r7 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.mo25247w(r2)
        L99:
            r19.mo25282C()
            d0.o r3 = (p051d0.C4608o) r3
            r19.mo25282C()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p051d0.C4539d.m27260b(float, float, float, float, float, f0.i, int, int):d0.e");
    }

    /* renamed from: c */
    public final InterfaceC11498x m27259c() {
        return f12264d;
    }

    /* renamed from: d */
    public final float m27258d() {
        return f12266f;
    }

    /* renamed from: e */
    public final float m27257e() {
        return f12265e;
    }

    /* renamed from: f */
    public final InterfaceC11498x m27256f() {
        return f12268h;
    }

    /* renamed from: g */
    public final InterfaceC4537c m27255g(long j, long j2, long j3, InterfaceC5179i interfaceC5179i, int i, int i2) {
        interfaceC5179i.mo25263g(1409305054);
        long m6633e = (i2 & 1) != 0 ? Color.f28297b.m6633e() : j;
        C4606n c4606n = new C4606n(m6633e, (i2 & 2) != 0 ? C4591j0.f12477a.m27117a(interfaceC5179i, 6).m27171j() : j2, m6633e, (i2 & 4) != 0 ? Color.m6648l(C4591j0.f12477a.m27117a(interfaceC5179i, 6).m27172i(), C4594k.f12480a.m27109b(interfaceC5179i, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3, null);
        interfaceC5179i.mo25282C();
        return c4606n;
    }
}
