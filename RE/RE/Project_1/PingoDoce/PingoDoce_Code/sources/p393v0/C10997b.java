package p393v0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import id.InterfaceC6097a;
import kotlin.EnumC6754a;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p373u0.C10774f;
import p393v0.InterfaceC11064u;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p479z1.C13612k;
import p479z1.C13615m;

/* compiled from: AndroidCanvas.android.kt */
/* renamed from: v0.b */
/* loaded from: classes.dex */
public final class C10997b implements InterfaceC11064u {

    /* renamed from: a */
    private Canvas f28311a = C11002c.m6597b();

    /* renamed from: b */
    private final InterfaceC13178g f28312b;

    /* renamed from: c */
    private final InterfaceC13178g f28313c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCanvas.android.kt */
    /* renamed from: v0.b$a */
    /* loaded from: classes.dex */
    public static final class C10998a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C10998a f28314w = new C10998a();

        C10998a() {
            super(0);
        }

        /* renamed from: a */
        public final Rect mo42214q() {
            return new Rect();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCanvas.android.kt */
    /* renamed from: v0.b$b */
    /* loaded from: classes.dex */
    public static final class C10999b extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C10999b f28315w = new C10999b();

        C10999b() {
            super(0);
        }

        /* renamed from: a */
        public final Rect mo42214q() {
            return new Rect();
        }
    }

    public C10997b() {
        InterfaceC13178g m1463b;
        InterfaceC13178g m1463b2;
        EnumC6754a enumC6754a = EnumC6754a.NONE;
        m1463b = LazyJVM.m1463b(enumC6754a, C10999b.f28315w);
        this.f28312b = m1463b;
        m1463b2 = LazyJVM.m1463b(enumC6754a, C10998a.f28314w);
        this.f28313c = m1463b2;
    }

    /* renamed from: q */
    private final Rect m6609q() {
        return (Rect) this.f28313c.getValue();
    }

    /* renamed from: s */
    private final Rect m6607s() {
        return (Rect) this.f28312b.getValue();
    }

    /* renamed from: a */
    public void m6625a(float f, float f2, float f3, float f4, int i) {
        this.f28311a.clipRect(f, f2, f3, f4, m6605u(i));
    }

    /* renamed from: b */
    public void m6624b(float f, float f2) {
        this.f28311a.translate(f, f2);
    }

    /* renamed from: c */
    public void m6623c(InterfaceC11052q0 interfaceC11052q0, int i) {
        Intrinsics.isThisObjectNull(interfaceC11052q0, "path");
        Canvas canvas = this.f28311a;
        if (interfaceC11052q0 instanceof C11033j) {
            canvas.clipPath(((C11033j) interfaceC11052q0).m6440q(), m6605u(i));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: d */
    public void m6622d(float f, float f2, float f3, float f4, InterfaceC11046o0 interfaceC11046o0) {
        Intrinsics.isThisObjectNull(interfaceC11046o0, "paint");
        this.f28311a.drawRect(f, f2, f3, f4, interfaceC11046o0.mo6391r());
    }

    /* renamed from: e */
    public void m6621e(float f, float f2, float f3, float f4, float f5, float f6, InterfaceC11046o0 interfaceC11046o0) {
        Intrinsics.isThisObjectNull(interfaceC11046o0, "paint");
        this.f28311a.drawRoundRect(f, f2, f3, f4, f5, f6, interfaceC11046o0.mo6391r());
    }

    /* renamed from: f */
    public void m6620f(p373u0.Rect rect, int i) {
        InterfaceC11064u.C11065a.m6258c(this, rect, i);
    }

    /* renamed from: g */
    public void m6619g() {
        this.f28311a.restore();
    }

    /* renamed from: h */
    public void m6618h() {
        this.f28311a.save();
    }

    /* renamed from: i */
    public void m6617i(InterfaceC11025h0 interfaceC11025h0, long j, long j2, long j3, long j4, InterfaceC11046o0 interfaceC11046o0) {
        Intrinsics.isThisObjectNull(interfaceC11025h0, "image");
        Intrinsics.isThisObjectNull(interfaceC11046o0, "paint");
        Canvas canvas = this.f28311a;
        Bitmap m6533b = C11014f.m6533b(interfaceC11025h0);
        Rect m6607s = m6607s();
        m6607s.left = C13612k.m839h(j);
        m6607s.top = C13612k.m838i(j);
        m6607s.right = C13612k.m839h(j) + C13615m.m824g(j2);
        m6607s.bottom = C13612k.m838i(j) + C13615m.m825f(j2);
        C13195u c13195u = C13195u.f34156a;
        Rect m6609q = m6609q();
        m6609q.left = C13612k.m839h(j3);
        m6609q.top = C13612k.m838i(j3);
        m6609q.right = C13612k.m839h(j3) + C13615m.m824g(j4);
        m6609q.bottom = C13612k.m838i(j3) + C13615m.m825f(j4);
        canvas.drawBitmap(m6533b, m6607s, m6609q, interfaceC11046o0.mo6391r());
    }

    /* renamed from: j */
    public void m6616j() {
        C11072x.f28450a.m6237a(this.f28311a, false);
    }

    /* renamed from: k */
    public void m6615k(long j, float f, InterfaceC11046o0 interfaceC11046o0) {
        Intrinsics.isThisObjectNull(interfaceC11046o0, "paint");
        this.f28311a.drawCircle(C10774f.m7145k(j), C10774f.m7144l(j), f, interfaceC11046o0.mo6391r());
    }

    /* renamed from: l */
    public void m6614l(p373u0.Rect rect, InterfaceC11046o0 interfaceC11046o0) {
        InterfaceC11064u.C11065a.m6256e(this, rect, interfaceC11046o0);
    }

    /* renamed from: m */
    public void m6613m(float[] fArr) {
        Intrinsics.isThisObjectNull(fArr, "matrix");
        if (C11037l0.m6427a(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        C11020g.m6511a(matrix, fArr);
        this.f28311a.concat(matrix);
    }

    /* renamed from: n */
    public void m6612n() {
        C11072x.f28450a.m6237a(this.f28311a, true);
    }

    /* renamed from: o */
    public void m6611o(InterfaceC11052q0 interfaceC11052q0, InterfaceC11046o0 interfaceC11046o0) {
        Intrinsics.isThisObjectNull(interfaceC11052q0, "path");
        Intrinsics.isThisObjectNull(interfaceC11046o0, "paint");
        Canvas canvas = this.f28311a;
        if (interfaceC11052q0 instanceof C11033j) {
            canvas.drawPath(((C11033j) interfaceC11052q0).m6440q(), interfaceC11046o0.mo6391r());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: p */
    public void m6610p(p373u0.Rect rect, InterfaceC11046o0 interfaceC11046o0) {
        Intrinsics.isThisObjectNull(rect, "bounds");
        Intrinsics.isThisObjectNull(interfaceC11046o0, "paint");
        this.f28311a.saveLayer(rect.m7125f(), rect.m7122i(), rect.m7124g(), rect.m7128c(), interfaceC11046o0.mo6391r(), 31);
    }

    /* renamed from: r */
    public final Canvas m6608r() {
        return this.f28311a;
    }

    /* renamed from: t */
    public final void m6606t(Canvas canvas) {
        Intrinsics.isThisObjectNull(canvas, "<set-?>");
        this.f28311a = canvas;
    }

    /* renamed from: u */
    public final Region.Op m6605u(int i) {
        return C11076z.m6196d(i, C11076z.f28470a.m6195a()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }
}
