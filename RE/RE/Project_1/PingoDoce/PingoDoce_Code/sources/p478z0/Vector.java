package p478z0;

import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6097a;
import java.util.ArrayList;
import java.util.List;
import p181jd.Intrinsics;
import p393v0.C11042n;
import p393v0.InterfaceC11052q0;
import p393v0.Matrix;
import p433x0.DrawScope;
import p433x0.InterfaceC12239d;
import p433x0.InterfaceC12243g;

/* renamed from: z0.b */
/* loaded from: classes.dex */
public final class Vector extends AbstractC13528i {

    /* renamed from: b */
    private float[] f34314b;

    /* renamed from: c */
    private final List f34315c;

    /* renamed from: d */
    private List f34316d;

    /* renamed from: e */
    private boolean f34317e;

    /* renamed from: f */
    private InterfaceC11052q0 f34318f;

    /* renamed from: g */
    private PathParser f34319g;

    /* renamed from: h */
    private InterfaceC6097a f34320h;

    /* renamed from: i */
    private String f34321i;

    /* renamed from: j */
    private float f34322j;

    /* renamed from: k */
    private float f34323k;

    /* renamed from: l */
    private float f34324l;

    /* renamed from: m */
    private float f34325m;

    /* renamed from: n */
    private float f34326n;

    /* renamed from: o */
    private float f34327o;

    /* renamed from: p */
    private float f34328p;

    /* renamed from: q */
    private boolean f34329q;

    public Vector() {
        super(null);
        this.f34315c = new ArrayList();
        this.f34316d = C13565o.m977e();
        this.f34317e = true;
        this.f34321i = BuildConfig.VERSION_NAME;
        this.f34325m = 1.0f;
        this.f34326n = 1.0f;
        this.f34329q = true;
    }

    /* renamed from: g */
    private final boolean m1250g() {
        return !this.f34316d.isEmpty();
    }

    /* renamed from: t */
    private final void m1237t() {
        if (m1250g()) {
            PathParser pathParser = this.f34319g;
            if (pathParser == null) {
                pathParser = new PathParser();
                this.f34319g = pathParser;
            } else {
                pathParser.m1114e();
            }
            InterfaceC11052q0 interfaceC11052q0 = this.f34318f;
            if (interfaceC11052q0 == null) {
                interfaceC11052q0 = C11042n.m6421a();
                this.f34318f = interfaceC11052q0;
            } else {
                interfaceC11052q0.mo6316a();
            }
            pathParser.m1117b(this.f34316d).m1121D(interfaceC11052q0);
        }
    }

    /* renamed from: u */
    private final void m1236u() {
        float[] fArr = this.f34314b;
        if (fArr == null) {
            fArr = Matrix.m6435b(null, 1, null);
            this.f34314b = fArr;
        } else {
            Matrix.m6432e(fArr);
        }
        Matrix.m6428i(fArr, this.f34323k + this.f34327o, this.f34324l + this.f34328p, 0.0f, 4, null);
        Matrix.m6431f(fArr, this.f34322j);
        Matrix.m6430g(fArr, this.f34325m, this.f34326n, 1.0f);
        Matrix.m6428i(fArr, -this.f34323k, -this.f34324l, 0.0f, 4, null);
    }

    /* renamed from: a */
    public void mo1077a(DrawScope drawScope) {
        Intrinsics.isThisObjectNull(drawScope, "<this>");
        if (this.f34329q) {
            m1236u();
            this.f34329q = false;
        }
        if (this.f34317e) {
            m1237t();
            this.f34317e = false;
        }
        InterfaceC12239d m3272B = drawScope.m3272B();
        long mo3276a = m3272B.mo3276a();
        m3272B.mo3275b().m6269h();
        InterfaceC12243g mo3274c = m3272B.mo3274c();
        float[] fArr = this.f34314b;
        if (fArr != null) {
            mo3274c.mo3242e(fArr);
        }
        InterfaceC11052q0 interfaceC11052q0 = this.f34318f;
        if (m1250g() && interfaceC11052q0 != null) {
            InterfaceC12243g.C12244a.m3241a(mo3274c, interfaceC11052q0, 0, 2, null);
        }
        List list = this.f34315c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC13528i) list.get(i)).mo1077a(drawScope);
        }
        m3272B.mo3275b().m6270g();
        m3272B.mo3273d(mo3276a);
    }

    /* renamed from: b */
    public InterfaceC6097a mo1076b() {
        return this.f34320h;
    }

    /* renamed from: d */
    public void mo1074d(InterfaceC6097a interfaceC6097a) {
        this.f34320h = interfaceC6097a;
        List list = this.f34315c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC13528i) list.get(i)).mo1074d(interfaceC6097a);
        }
    }

    /* renamed from: e */
    public final String m1252e() {
        return this.f34321i;
    }

    /* renamed from: f */
    public final int m1251f() {
        return this.f34315c.size();
    }

    /* renamed from: h */
    public final void m1249h(int i, AbstractC13528i abstractC13528i) {
        Intrinsics.isThisObjectNull(abstractC13528i, "instance");
        if (i < m1251f()) {
            this.f34315c.set(i, abstractC13528i);
        } else {
            this.f34315c.add(abstractC13528i);
        }
        abstractC13528i.mo1074d(mo1076b());
        m1075c();
    }

    /* renamed from: i */
    public final void m1248i(int i, int i2, int i3) {
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                i4++;
                this.f34315c.remove(i);
                this.f34315c.add(i2, (AbstractC13528i) this.f34315c.get(i));
                i2++;
            }
        } else {
            while (i4 < i3) {
                i4++;
                this.f34315c.remove(i);
                this.f34315c.add(i2 - 1, (AbstractC13528i) this.f34315c.get(i));
            }
        }
        m1075c();
    }

    /* renamed from: j */
    public final void m1247j(int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            i3++;
            if (i < this.f34315c.size()) {
                ((AbstractC13528i) this.f34315c.get(i)).mo1074d(null);
                this.f34315c.remove(i);
            }
        }
        m1075c();
    }

    /* renamed from: k */
    public final void m1246k(List list) {
        Intrinsics.isThisObjectNull(list, "value");
        this.f34316d = list;
        this.f34317e = true;
        m1075c();
    }

    /* renamed from: l */
    public final void m1245l(String str) {
        Intrinsics.isThisObjectNull(str, "value");
        this.f34321i = str;
        m1075c();
    }

    /* renamed from: m */
    public final void m1244m(float f) {
        this.f34323k = f;
        this.f34329q = true;
        m1075c();
    }

    /* renamed from: n */
    public final void m1243n(float f) {
        this.f34324l = f;
        this.f34329q = true;
        m1075c();
    }

    /* renamed from: o */
    public final void m1242o(float f) {
        this.f34322j = f;
        this.f34329q = true;
        m1075c();
    }

    /* renamed from: p */
    public final void m1241p(float f) {
        this.f34325m = f;
        this.f34329q = true;
        m1075c();
    }

    /* renamed from: q */
    public final void m1240q(float f) {
        this.f34326n = f;
        this.f34329q = true;
        m1075c();
    }

    /* renamed from: r */
    public final void m1239r(float f) {
        this.f34327o = f;
        this.f34329q = true;
        m1075c();
    }

    /* renamed from: s */
    public final void m1238s(float f) {
        this.f34328p = f;
        this.f34329q = true;
        m1075c();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VGroup: ");
        sb2.append(this.f34321i);
        List list = this.f34315c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb2.append("\t");
            sb2.append(((AbstractC13528i) list.get(i)).toString());
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "sb.toString()");
        return sb3;
    }
}
