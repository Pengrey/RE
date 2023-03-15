package p478z0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p393v0.InterfaceC11052q0;
import p478z0.AbstractC13505e;
import p489zc._ArraysJvm;

/* renamed from: z0.g */
/* loaded from: classes.dex */
public final class PathParser {

    /* renamed from: a */
    private final List f34440a = new ArrayList();

    /* renamed from: b */
    private final C13526b f34441b = new C13526b(0.0f, 0.0f, 3, null);

    /* renamed from: c */
    private final C13526b f34442c = new C13526b(0.0f, 0.0f, 3, null);

    /* renamed from: d */
    private final C13526b f34443d = new C13526b(0.0f, 0.0f, 3, null);

    /* renamed from: e */
    private final C13526b f34444e = new C13526b(0.0f, 0.0f, 3, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PathParser.kt */
    /* renamed from: z0.g$b */
    /* loaded from: classes.dex */
    public static final class C13526b {

        /* renamed from: a */
        private float f34447a;

        /* renamed from: b */
        private float f34448b;

        public C13526b() {
            this(0.0f, 0.0f, 3, null);
        }

        public C13526b(float f, float f2) {
            this.f34447a = f;
            this.f34448b = f2;
        }

        /* renamed from: a */
        public final float m1088a() {
            return this.f34447a;
        }

        /* renamed from: b */
        public final float m1087b() {
            return this.f34448b;
        }

        /* renamed from: c */
        public final void m1086c() {
            this.f34447a = 0.0f;
            this.f34448b = 0.0f;
        }

        /* renamed from: d */
        public final void m1085d(float f) {
            this.f34447a = f;
        }

        /* renamed from: e */
        public final void m1084e(float f) {
            this.f34448b = f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13526b) {
                C13526b c13526b = (C13526b) obj;
                return Intrinsics.equals(Float.valueOf(this.f34447a), Float.valueOf(c13526b.f34447a)) && Intrinsics.equals(Float.valueOf(this.f34448b), Float.valueOf(c13526b.f34448b));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f34447a) * 31) + Float.hashCode(this.f34448b);
        }

        public String toString() {
            return "PathPoint(x=" + this.f34447a + ", y=" + this.f34448b + ')';
        }

        public /* synthetic */ C13526b(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
        }
    }

    /* renamed from: A */
    private final void m1124A(AbstractC13505e.C13522q c13522q, boolean z, InterfaceC11052q0 interfaceC11052q0) {
        if (z) {
            this.f34444e.m1085d(this.f34441b.m1088a() - this.f34442c.m1088a());
            this.f34444e.m1084e(this.f34441b.m1087b() - this.f34442c.m1087b());
        } else {
            this.f34444e.m1086c();
        }
        interfaceC11052q0.mo6305l(this.f34444e.m1088a(), this.f34444e.m1087b(), c13522q.m1129c(), c13522q.m1128d());
        this.f34442c.m1085d(this.f34441b.m1088a() + this.f34444e.m1088a());
        this.f34442c.m1084e(this.f34441b.m1087b() + this.f34444e.m1087b());
        C13526b c13526b = this.f34441b;
        c13526b.m1085d(c13526b.m1088a() + c13522q.m1129c());
        C13526b c13526b2 = this.f34441b;
        c13526b2.m1084e(c13526b2.m1087b() + c13522q.m1128d());
    }

    /* renamed from: B */
    private final void m1123B(AbstractC13505e.C13523r c13523r, InterfaceC11052q0 interfaceC11052q0) {
        interfaceC11052q0.mo6304m(0.0f, c13523r.m1127c());
        C13526b c13526b = this.f34441b;
        c13526b.m1084e(c13526b.m1087b() + c13523r.m1127c());
    }

    /* renamed from: E */
    private final double m1120E(double d) {
        return (d / 180) * 3.141592653589793d;
    }

    /* renamed from: F */
    private final void m1119F(AbstractC13505e.C13524s c13524s, InterfaceC11052q0 interfaceC11052q0) {
        interfaceC11052q0.mo6302o(this.f34441b.m1088a(), c13524s.m1126c());
        this.f34441b.m1084e(c13524s.m1126c());
    }

    /* renamed from: a */
    private final void m1118a(char c, float[] fArr) {
        this.f34440a.addAll(PathNode.m1125a(c, fArr));
    }

    /* renamed from: c */
    private final void m1116c(AbstractC13505e.C13506a c13506a, InterfaceC11052q0 interfaceC11052q0) {
        m1110i(interfaceC11052q0, this.f34441b.m1088a(), this.f34441b.m1087b(), c13506a.m1183c(), c13506a.m1182d(), c13506a.m1181e(), c13506a.m1179g(), c13506a.m1180f(), c13506a.m1178h(), c13506a.m1177i());
        this.f34441b.m1085d(c13506a.m1183c());
        this.f34441b.m1084e(c13506a.m1182d());
        this.f34442c.m1085d(this.f34441b.m1088a());
        this.f34442c.m1084e(this.f34441b.m1087b());
    }

    /* renamed from: d */
    private final void m1115d(InterfaceC11052q0 interfaceC11052q0, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d3;
        double d11 = 4;
        int ceil = (int) Math.ceil(Math.abs((d9 * d11) / 3.141592653589793d));
        double cos = Math.cos(d7);
        double sin = Math.sin(d7);
        double cos2 = Math.cos(d8);
        double sin2 = Math.sin(d8);
        double d12 = -d10;
        double d13 = d12 * cos;
        double d14 = d4 * sin;
        double d15 = (d13 * sin2) - (d14 * cos2);
        double d16 = d12 * sin;
        double d17 = d4 * cos;
        double d18 = (sin2 * d16) + (cos2 * d17);
        double d19 = d9 / ceil;
        double d20 = d5;
        double d21 = d18;
        double d22 = d15;
        int i = 0;
        double d23 = d6;
        double d24 = d8;
        while (i < ceil) {
            double d25 = d24 + d19;
            double sin3 = Math.sin(d25);
            double cos3 = Math.cos(d25);
            int i2 = ceil;
            double d26 = (d + ((d10 * cos) * cos3)) - (d14 * sin3);
            double d27 = d2 + (d10 * sin * cos3) + (d17 * sin3);
            double d28 = (d13 * sin3) - (d14 * cos3);
            double d29 = (sin3 * d16) + (cos3 * d17);
            double d30 = d25 - d24;
            double tan = Math.tan(d30 / 2);
            double sin4 = (Math.sin(d30) * (Math.sqrt(d11 + ((3.0d * tan) * tan)) - 1)) / 3;
            interfaceC11052q0.mo6311f((float) (d20 + (d22 * sin4)), (float) (d23 + (d21 * sin4)), (float) (d26 - (sin4 * d28)), (float) (d27 - (sin4 * d29)), (float) d26, (float) d27);
            d19 = d19;
            i++;
            sin = sin;
            d23 = d27;
            d20 = d26;
            ceil = i2;
            d24 = d25;
            d21 = d29;
            d11 = d11;
            d22 = d28;
            cos = cos;
            d10 = d3;
        }
    }

    /* renamed from: f */
    private final void m1113f(InterfaceC11052q0 interfaceC11052q0) {
        this.f34441b.m1085d(this.f34443d.m1088a());
        this.f34441b.m1084e(this.f34443d.m1087b());
        this.f34442c.m1085d(this.f34443d.m1088a());
        this.f34442c.m1084e(this.f34443d.m1087b());
        interfaceC11052q0.close();
        interfaceC11052q0.mo6312e(this.f34441b.m1088a(), this.f34441b.m1087b());
    }

    /* renamed from: g */
    private final float[] m1112g(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i >= 0 && i <= length) {
                int i3 = i2 - i;
                int min = Math.min(i3, length - i);
                float[] fArr2 = new float[i3];
                _ArraysJvm.m318f(fArr, fArr2, 0, i, min + i);
                return fArr2;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    private final void m1111h(AbstractC13505e.C13508c c13508c, InterfaceC11052q0 interfaceC11052q0) {
        interfaceC11052q0.mo6311f(c13508c.m1176c(), c13508c.m1173f(), c13508c.m1175d(), c13508c.m1172g(), c13508c.m1174e(), c13508c.m1171h());
        this.f34442c.m1085d(c13508c.m1175d());
        this.f34442c.m1084e(c13508c.m1172g());
        this.f34441b.m1085d(c13508c.m1174e());
        this.f34441b.m1084e(c13508c.m1171h());
    }

    /* renamed from: i */
    private final void m1110i(InterfaceC11052q0 interfaceC11052q0, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double m1120E = m1120E(d7);
        double cos = Math.cos(m1120E);
        double sin = Math.sin(m1120E);
        double d10 = ((d * cos) + (d2 * sin)) / d5;
        double d11 = (((-d) * sin) + (d2 * cos)) / d6;
        double d12 = ((d3 * cos) + (d4 * sin)) / d5;
        double d13 = (((-d3) * sin) + (d4 * cos)) / d6;
        double d14 = d10 - d12;
        double d15 = d11 - d13;
        double d16 = 2;
        double d17 = (d10 + d12) / d16;
        double d18 = (d11 + d13) / d16;
        double d19 = (d14 * d14) + (d15 * d15);
        if (d19 == 0.0d) {
            return;
        }
        double d20 = (1.0d / d19) - 0.25d;
        if (d20 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d19) / 1.99999d);
            m1110i(interfaceC11052q0, d, d2, d3, d4, d5 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d20);
        double d21 = d14 * sqrt2;
        double d22 = sqrt2 * d15;
        if (z == z2) {
            d8 = d17 - d22;
            d9 = d18 + d21;
        } else {
            d8 = d17 + d22;
            d9 = d18 - d21;
        }
        double atan2 = Math.atan2(d11 - d9, d10 - d8);
        double atan22 = Math.atan2(d13 - d9, d12 - d8) - atan2;
        int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (z2 != (i >= 0)) {
            atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d23 = d8 * d5;
        double d24 = d9 * d6;
        m1115d(interfaceC11052q0, (d23 * cos) - (d24 * sin), (d23 * sin) + (d24 * cos), d5, d6, d, d2, m1120E, atan2, atan22);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0051 A[LOOP:0: B:3:0x0008->B:36:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0054 A[EDGE_INSN: B:40:0x0054->B:37:0x0054 ?: BREAK  , SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m1109j(java.lang.String r9, int r10, p478z0.PathParser.C13525a r11) {
        /*
            r8 = this;
            r0 = 0
            r11.m1089d(r0)
            r1 = r10
            r2 = r0
            r3 = r2
            r4 = r3
        L8:
            int r5 = r9.length()
            if (r1 >= r5) goto L54
            char r5 = r9.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 != r6) goto L19
        L17:
            r6 = r7
            goto L1f
        L19:
            r6 = 44
            if (r5 != r6) goto L1e
            goto L17
        L1e:
            r6 = r0
        L1f:
            if (r6 == 0) goto L24
        L21:
            r2 = r0
            r4 = r7
            goto L4e
        L24:
            r6 = 45
            if (r5 != r6) goto L30
            if (r1 == r10) goto L4d
            if (r2 != 0) goto L4d
            r11.m1089d(r7)
            goto L21
        L30:
            r2 = 46
            if (r5 != r2) goto L3d
            if (r3 != 0) goto L39
            r2 = r0
            r3 = r7
            goto L4e
        L39:
            r11.m1089d(r7)
            goto L21
        L3d:
            r2 = 101(0x65, float:1.42E-43)
            if (r5 != r2) goto L43
        L41:
            r2 = r7
            goto L49
        L43:
            r2 = 69
            if (r5 != r2) goto L48
            goto L41
        L48:
            r2 = r0
        L49:
            if (r2 == 0) goto L4d
            r2 = r7
            goto L4e
        L4d:
            r2 = r0
        L4e:
            if (r4 == 0) goto L51
            goto L54
        L51:
            int r1 = r1 + 1
            goto L8
        L54:
            r11.m1090c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p478z0.PathParser.m1109j(java.lang.String, int, z0.g$a):void");
    }

    /* renamed from: k */
    private final float[] m1108k(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        float[] fArr = new float[str.length()];
        C13525a c13525a = new C13525a(0, false, 3, null);
        int length = str.length();
        int i = 1;
        int i2 = 0;
        while (i < length) {
            m1109j(str, i, c13525a);
            int m1092a = c13525a.m1092a();
            if (i < m1092a) {
                String substring = str.substring(i, m1092a);
                Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                fArr[i2] = Float.parseFloat(substring);
                i2++;
            }
            i = c13525a.m1091b() ? m1092a : m1092a + 1;
        }
        return m1112g(fArr, 0, i2);
    }

    /* renamed from: l */
    private final void m1107l(AbstractC13505e.C13509d c13509d, InterfaceC11052q0 interfaceC11052q0) {
        interfaceC11052q0.mo6302o(c13509d.m1170c(), this.f34441b.m1087b());
        this.f34441b.m1085d(c13509d.m1170c());
    }

    /* renamed from: m */
    private final void m1106m(AbstractC13505e.C13510e c13510e, InterfaceC11052q0 interfaceC11052q0) {
        interfaceC11052q0.mo6302o(c13510e.m1169c(), c13510e.m1168d());
        this.f34441b.m1085d(c13510e.m1169c());
        this.f34441b.m1084e(c13510e.m1168d());
    }

    /* renamed from: n */
    private final void m1105n(AbstractC13505e.C13511f c13511f, InterfaceC11052q0 interfaceC11052q0) {
        this.f34441b.m1085d(c13511f.m1167c());
        this.f34441b.m1084e(c13511f.m1166d());
        interfaceC11052q0.mo6312e(c13511f.m1167c(), c13511f.m1166d());
        this.f34443d.m1085d(this.f34441b.m1088a());
        this.f34443d.m1084e(this.f34441b.m1087b());
    }

    /* renamed from: o */
    private final int m1104o(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: q */
    private final void m1102q(AbstractC13505e.C13512g c13512g, InterfaceC11052q0 interfaceC11052q0) {
        interfaceC11052q0.mo6308i(c13512g.m1165c(), c13512g.m1163e(), c13512g.m1164d(), c13512g.m1162f());
        this.f34442c.m1085d(c13512g.m1165c());
        this.f34442c.m1084e(c13512g.m1163e());
        this.f34441b.m1085d(c13512g.m1164d());
        this.f34441b.m1084e(c13512g.m1162f());
    }

    /* renamed from: r */
    private final void m1101r(AbstractC13505e.C13513h c13513h, boolean z, InterfaceC11052q0 interfaceC11052q0) {
        if (z) {
            float f = 2;
            this.f34444e.m1085d((this.f34441b.m1088a() * f) - this.f34442c.m1088a());
            this.f34444e.m1084e((f * this.f34441b.m1087b()) - this.f34442c.m1087b());
        } else {
            this.f34444e.m1085d(this.f34441b.m1088a());
            this.f34444e.m1084e(this.f34441b.m1087b());
        }
        interfaceC11052q0.mo6311f(this.f34444e.m1088a(), this.f34444e.m1087b(), c13513h.m1161c(), c13513h.m1159e(), c13513h.m1160d(), c13513h.m1158f());
        this.f34442c.m1085d(c13513h.m1161c());
        this.f34442c.m1084e(c13513h.m1159e());
        this.f34441b.m1085d(c13513h.m1160d());
        this.f34441b.m1084e(c13513h.m1158f());
    }

    /* renamed from: s */
    private final void m1100s(AbstractC13505e.C13514i c13514i, boolean z, InterfaceC11052q0 interfaceC11052q0) {
        if (z) {
            float f = 2;
            this.f34444e.m1085d((this.f34441b.m1088a() * f) - this.f34442c.m1088a());
            this.f34444e.m1084e((f * this.f34441b.m1087b()) - this.f34442c.m1087b());
        } else {
            this.f34444e.m1085d(this.f34441b.m1088a());
            this.f34444e.m1084e(this.f34441b.m1087b());
        }
        interfaceC11052q0.mo6308i(this.f34444e.m1088a(), this.f34444e.m1087b(), c13514i.m1157c(), c13514i.m1156d());
        this.f34442c.m1085d(this.f34444e.m1088a());
        this.f34442c.m1084e(this.f34444e.m1087b());
        this.f34441b.m1085d(c13514i.m1157c());
        this.f34441b.m1084e(c13514i.m1156d());
    }

    /* renamed from: t */
    private final void m1099t(AbstractC13505e.C13515j c13515j, InterfaceC11052q0 interfaceC11052q0) {
        float m1155c = c13515j.m1155c() + this.f34441b.m1088a();
        float m1154d = c13515j.m1154d() + this.f34441b.m1087b();
        m1110i(interfaceC11052q0, this.f34441b.m1088a(), this.f34441b.m1087b(), m1155c, m1154d, c13515j.m1153e(), c13515j.m1151g(), c13515j.m1152f(), c13515j.m1150h(), c13515j.m1149i());
        this.f34441b.m1085d(m1155c);
        this.f34441b.m1084e(m1154d);
        this.f34442c.m1085d(this.f34441b.m1088a());
        this.f34442c.m1084e(this.f34441b.m1087b());
    }

    /* renamed from: u */
    private final void m1098u(AbstractC13505e.C13516k c13516k, InterfaceC11052q0 interfaceC11052q0) {
        interfaceC11052q0.mo6309h(c13516k.m1148c(), c13516k.m1145f(), c13516k.m1147d(), c13516k.m1144g(), c13516k.m1146e(), c13516k.m1143h());
        this.f34442c.m1085d(this.f34441b.m1088a() + c13516k.m1147d());
        this.f34442c.m1084e(this.f34441b.m1087b() + c13516k.m1144g());
        C13526b c13526b = this.f34441b;
        c13526b.m1085d(c13526b.m1088a() + c13516k.m1146e());
        C13526b c13526b2 = this.f34441b;
        c13526b2.m1084e(c13526b2.m1087b() + c13516k.m1143h());
    }

    /* renamed from: v */
    private final void m1097v(AbstractC13505e.C13517l c13517l, InterfaceC11052q0 interfaceC11052q0) {
        interfaceC11052q0.mo6304m(c13517l.m1142c(), 0.0f);
        C13526b c13526b = this.f34441b;
        c13526b.m1085d(c13526b.m1088a() + c13517l.m1142c());
    }

    /* renamed from: w */
    private final void m1096w(AbstractC13505e.C13518m c13518m, InterfaceC11052q0 interfaceC11052q0) {
        interfaceC11052q0.mo6304m(c13518m.m1141c(), c13518m.m1140d());
        C13526b c13526b = this.f34441b;
        c13526b.m1085d(c13526b.m1088a() + c13518m.m1141c());
        C13526b c13526b2 = this.f34441b;
        c13526b2.m1084e(c13526b2.m1087b() + c13518m.m1140d());
    }

    /* renamed from: x */
    private final void m1095x(AbstractC13505e.C13519n c13519n, InterfaceC11052q0 interfaceC11052q0) {
        C13526b c13526b = this.f34441b;
        c13526b.m1085d(c13526b.m1088a() + c13519n.m1139c());
        C13526b c13526b2 = this.f34441b;
        c13526b2.m1084e(c13526b2.m1087b() + c13519n.m1138d());
        interfaceC11052q0.mo6310g(c13519n.m1139c(), c13519n.m1138d());
        this.f34443d.m1085d(this.f34441b.m1088a());
        this.f34443d.m1084e(this.f34441b.m1087b());
    }

    /* renamed from: y */
    private final void m1094y(AbstractC13505e.C13520o c13520o, InterfaceC11052q0 interfaceC11052q0) {
        interfaceC11052q0.mo6305l(c13520o.m1137c(), c13520o.m1135e(), c13520o.m1136d(), c13520o.m1134f());
        this.f34442c.m1085d(this.f34441b.m1088a() + c13520o.m1137c());
        this.f34442c.m1084e(this.f34441b.m1087b() + c13520o.m1135e());
        C13526b c13526b = this.f34441b;
        c13526b.m1085d(c13526b.m1088a() + c13520o.m1136d());
        C13526b c13526b2 = this.f34441b;
        c13526b2.m1084e(c13526b2.m1087b() + c13520o.m1134f());
    }

    /* renamed from: z */
    private final void m1093z(AbstractC13505e.C13521p c13521p, boolean z, InterfaceC11052q0 interfaceC11052q0) {
        if (z) {
            this.f34444e.m1085d(this.f34441b.m1088a() - this.f34442c.m1088a());
            this.f34444e.m1084e(this.f34441b.m1087b() - this.f34442c.m1087b());
        } else {
            this.f34444e.m1086c();
        }
        interfaceC11052q0.mo6309h(this.f34444e.m1088a(), this.f34444e.m1087b(), c13521p.m1133c(), c13521p.m1131e(), c13521p.m1132d(), c13521p.m1130f());
        this.f34442c.m1085d(this.f34441b.m1088a() + c13521p.m1133c());
        this.f34442c.m1084e(this.f34441b.m1087b() + c13521p.m1131e());
        C13526b c13526b = this.f34441b;
        c13526b.m1085d(c13526b.m1088a() + c13521p.m1132d());
        C13526b c13526b2 = this.f34441b;
        c13526b2.m1084e(c13526b2.m1087b() + c13521p.m1130f());
    }

    /* renamed from: C */
    public final List m1122C() {
        return this.f34440a;
    }

    /* renamed from: D */
    public final InterfaceC11052q0 m1121D(InterfaceC11052q0 interfaceC11052q0) {
        Intrinsics.isThisObjectNull(interfaceC11052q0, "target");
        interfaceC11052q0.mo6316a();
        this.f34441b.m1086c();
        this.f34442c.m1086c();
        this.f34443d.m1086c();
        this.f34444e.m1086c();
        List list = this.f34440a;
        int size = list.size();
        AbstractC13505e abstractC13505e = null;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            AbstractC13505e abstractC13505e2 = (AbstractC13505e) list.get(i);
            if (abstractC13505e == null) {
                abstractC13505e = abstractC13505e2;
            }
            if (abstractC13505e2 instanceof AbstractC13505e.C13507b) {
                m1113f(interfaceC11052q0);
            } else if (abstractC13505e2 instanceof AbstractC13505e.C13519n) {
                m1095x((AbstractC13505e.C13519n) abstractC13505e2, interfaceC11052q0);
            } else if (abstractC13505e2 instanceof AbstractC13505e.C13511f) {
                m1105n((AbstractC13505e.C13511f) abstractC13505e2, interfaceC11052q0);
            } else if (abstractC13505e2 instanceof AbstractC13505e.C13518m) {
                m1096w((AbstractC13505e.C13518m) abstractC13505e2, interfaceC11052q0);
            } else if (abstractC13505e2 instanceof AbstractC13505e.C13510e) {
                m1106m((AbstractC13505e.C13510e) abstractC13505e2, interfaceC11052q0);
            } else if (abstractC13505e2 instanceof AbstractC13505e.C13517l) {
                m1097v((AbstractC13505e.C13517l) abstractC13505e2, interfaceC11052q0);
            } else if (abstractC13505e2 instanceof AbstractC13505e.C13509d) {
                m1107l((AbstractC13505e.C13509d) abstractC13505e2, interfaceC11052q0);
            } else if (abstractC13505e2 instanceof AbstractC13505e.C13523r) {
                m1123B((AbstractC13505e.C13523r) abstractC13505e2, interfaceC11052q0);
            } else if (abstractC13505e2 instanceof AbstractC13505e.C13524s) {
                m1119F((AbstractC13505e.C13524s) abstractC13505e2, interfaceC11052q0);
            } else if (abstractC13505e2 instanceof AbstractC13505e.C13516k) {
                m1098u((AbstractC13505e.C13516k) abstractC13505e2, interfaceC11052q0);
            } else if (abstractC13505e2 instanceof AbstractC13505e.C13508c) {
                m1111h((AbstractC13505e.C13508c) abstractC13505e2, interfaceC11052q0);
            } else if (abstractC13505e2 instanceof AbstractC13505e.C13521p) {
                Intrinsics.ifNullDoSomething(abstractC13505e);
                m1093z((AbstractC13505e.C13521p) abstractC13505e2, abstractC13505e.m1185a(), interfaceC11052q0);
            } else if (abstractC13505e2 instanceof AbstractC13505e.C13513h) {
                Intrinsics.ifNullDoSomething(abstractC13505e);
                m1101r((AbstractC13505e.C13513h) abstractC13505e2, abstractC13505e.m1185a(), interfaceC11052q0);
            } else if (abstractC13505e2 instanceof AbstractC13505e.C13520o) {
                m1094y((AbstractC13505e.C13520o) abstractC13505e2, interfaceC11052q0);
            } else if (abstractC13505e2 instanceof AbstractC13505e.C13512g) {
                m1102q((AbstractC13505e.C13512g) abstractC13505e2, interfaceC11052q0);
            } else if (abstractC13505e2 instanceof AbstractC13505e.C13522q) {
                Intrinsics.ifNullDoSomething(abstractC13505e);
                m1124A((AbstractC13505e.C13522q) abstractC13505e2, abstractC13505e.m1184b(), interfaceC11052q0);
            } else if (abstractC13505e2 instanceof AbstractC13505e.C13514i) {
                Intrinsics.ifNullDoSomething(abstractC13505e);
                m1100s((AbstractC13505e.C13514i) abstractC13505e2, abstractC13505e.m1184b(), interfaceC11052q0);
            } else if (abstractC13505e2 instanceof AbstractC13505e.C13515j) {
                m1099t((AbstractC13505e.C13515j) abstractC13505e2, interfaceC11052q0);
            } else if (abstractC13505e2 instanceof AbstractC13505e.C13506a) {
                m1116c((AbstractC13505e.C13506a) abstractC13505e2, interfaceC11052q0);
            }
            abstractC13505e = abstractC13505e2;
            i = i2;
        }
        return interfaceC11052q0;
    }

    /* renamed from: b */
    public final PathParser m1117b(List list) {
        Intrinsics.isThisObjectNull(list, "nodes");
        this.f34440a.addAll(list);
        return this;
    }

    /* renamed from: e */
    public final void m1114e() {
        this.f34440a.clear();
    }

    /* renamed from: p */
    public final PathParser m1103p(String str) {
        Intrinsics.isThisObjectNull(str, "pathData");
        this.f34440a.clear();
        int i = 0;
        int i2 = 1;
        while (i2 < str.length()) {
            int m1104o = m1104o(str, i2);
            String substring = str.substring(i, m1104o);
            Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int length = substring.length() - 1;
            int i3 = 0;
            boolean z = false;
            while (i3 <= length) {
                boolean z2 = Intrinsics.isLessOrEqual(substring.charAt(!z ? i3 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i3++;
                } else {
                    z = true;
                }
            }
            String obj = substring.subSequence(i3, length + 1).toString();
            if (obj.length() > 0) {
                m1118a(obj.charAt(0), m1108k(obj));
            }
            i = m1104o;
            i2 = m1104o + 1;
        }
        if (i2 - i == 1 && i < str.length()) {
            m1118a(str.charAt(i), new float[0]);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PathParser.kt */
    /* renamed from: z0.g$a */
    /* loaded from: classes.dex */
    public static final class C13525a {

        /* renamed from: a */
        private int f34445a;

        /* renamed from: b */
        private boolean f34446b;

        public C13525a() {
            this(0, false, 3, null);
        }

        public C13525a(int i, boolean z) {
            this.f34445a = i;
            this.f34446b = z;
        }

        /* renamed from: a */
        public final int m1092a() {
            return this.f34445a;
        }

        /* renamed from: b */
        public final boolean m1091b() {
            return this.f34446b;
        }

        /* renamed from: c */
        public final void m1090c(int i) {
            this.f34445a = i;
        }

        /* renamed from: d */
        public final void m1089d(boolean z) {
            this.f34446b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13525a) {
                C13525a c13525a = (C13525a) obj;
                return this.f34445a == c13525a.f34445a && this.f34446b == c13525a.f34446b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = Integer.hashCode(this.f34445a) * 31;
            boolean z = this.f34446b;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            return "ExtractFloatResult(endPosition=" + this.f34445a + ", endWithNegativeOrDot=" + this.f34446b + ')';
        }

        public /* synthetic */ C13525a(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
        }
    }
}
