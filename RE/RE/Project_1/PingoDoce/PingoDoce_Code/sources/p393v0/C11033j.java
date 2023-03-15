package p393v0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p373u0.C10769a;
import p373u0.C10774f;
import p373u0.C10779j;
import p373u0.Rect;
import p393v0.C11066u0;

/* compiled from: AndroidPath.android.kt */
/* renamed from: v0.j */
/* loaded from: classes.dex */
public final class C11033j implements InterfaceC11052q0 {

    /* renamed from: a */
    private final Path f28390a;

    /* renamed from: b */
    private final RectF f28391b;

    /* renamed from: c */
    private final float[] f28392c;

    /* renamed from: d */
    private final Matrix f28393d;

    public C11033j() {
        this(null, 1, null);
    }

    public C11033j(Path path) {
        Intrinsics.isThisObjectNull(path, "internalPath");
        this.f28390a = path;
        this.f28391b = new RectF();
        this.f28392c = new float[8];
        this.f28393d = new Matrix();
    }

    /* renamed from: p */
    private final boolean m6441p(Rect rect) {
        if (!Float.isNaN(rect.m7125f())) {
            if (!Float.isNaN(rect.m7122i())) {
                if (!Float.isNaN(rect.m7124g())) {
                    if (!Float.isNaN(rect.m7128c())) {
                        return true;
                    }
                    throw new IllegalStateException("Rect.bottom is NaN".toString());
                }
                throw new IllegalStateException("Rect.right is NaN".toString());
            }
            throw new IllegalStateException("Rect.top is NaN".toString());
        }
        throw new IllegalStateException("Rect.left is NaN".toString());
    }

    /* renamed from: a */
    public void mo6316a() {
        this.f28390a.reset();
    }

    /* renamed from: b */
    public boolean mo6315b() {
        return this.f28390a.isConvex();
    }

    /* renamed from: c */
    public void mo6314c(Rect rect) {
        Intrinsics.isThisObjectNull(rect, "rect");
        if (m6441p(rect)) {
            this.f28391b.set(C11069v0.m6243b(rect));
            this.f28390a.addRect(this.f28391b, Path.Direction.CCW);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public void close() {
        this.f28390a.close();
    }

    /* renamed from: d */
    public void mo6313d(C10779j c10779j) {
        Intrinsics.isThisObjectNull(c10779j, "roundRect");
        this.f28391b.set(c10779j.m7109e(), c10779j.m7107g(), c10779j.m7108f(), c10779j.m7113a());
        this.f28392c[0] = C10769a.m7175d(c10779j.m7106h());
        this.f28392c[1] = C10769a.m7174e(c10779j.m7106h());
        this.f28392c[2] = C10769a.m7175d(c10779j.m7105i());
        this.f28392c[3] = C10769a.m7174e(c10779j.m7105i());
        this.f28392c[4] = C10769a.m7175d(c10779j.m7111c());
        this.f28392c[5] = C10769a.m7174e(c10779j.m7111c());
        this.f28392c[6] = C10769a.m7175d(c10779j.m7112b());
        this.f28392c[7] = C10769a.m7174e(c10779j.m7112b());
        this.f28390a.addRoundRect(this.f28391b, this.f28392c, Path.Direction.CCW);
    }

    /* renamed from: e */
    public void mo6312e(float f, float f2) {
        this.f28390a.moveTo(f, f2);
    }

    /* renamed from: f */
    public void mo6311f(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f28390a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    /* renamed from: g */
    public void mo6310g(float f, float f2) {
        this.f28390a.rMoveTo(f, f2);
    }

    /* renamed from: h */
    public void mo6309h(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f28390a.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    /* renamed from: i */
    public void mo6308i(float f, float f2, float f3, float f4) {
        this.f28390a.quadTo(f, f2, f3, f4);
    }

    public boolean isEmpty() {
        return this.f28390a.isEmpty();
    }

    /* renamed from: j */
    public void mo6307j(InterfaceC11052q0 interfaceC11052q0, long j) {
        Intrinsics.isThisObjectNull(interfaceC11052q0, "path");
        Path path = this.f28390a;
        if (interfaceC11052q0 instanceof C11033j) {
            path.addPath(((C11033j) interfaceC11052q0).m6440q(), C10774f.m7145k(j), C10774f.m7144l(j));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: k */
    public boolean mo6306k(InterfaceC11052q0 interfaceC11052q0, InterfaceC11052q0 interfaceC11052q02, int i) {
        Path.Op op;
        Intrinsics.isThisObjectNull(interfaceC11052q0, "path1");
        Intrinsics.isThisObjectNull(interfaceC11052q02, "path2");
        C11066u0.C11067a c11067a = C11066u0.f28443a;
        if (C11066u0.m6250f(i, c11067a.m6249a())) {
            op = Path.Op.DIFFERENCE;
        } else if (C11066u0.m6250f(i, c11067a.m6248b())) {
            op = Path.Op.INTERSECT;
        } else if (C11066u0.m6250f(i, c11067a.m6247c())) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = C11066u0.m6250f(i, c11067a.m6246d()) ? Path.Op.UNION : Path.Op.XOR;
        }
        Path path = this.f28390a;
        if (interfaceC11052q0 instanceof C11033j) {
            Path m6440q = ((C11033j) interfaceC11052q0).m6440q();
            if (interfaceC11052q02 instanceof C11033j) {
                return path.op(m6440q, ((C11033j) interfaceC11052q02).m6440q(), op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: l */
    public void mo6305l(float f, float f2, float f3, float f4) {
        this.f28390a.rQuadTo(f, f2, f3, f4);
    }

    /* renamed from: m */
    public void mo6304m(float f, float f2) {
        this.f28390a.rLineTo(f, f2);
    }

    /* renamed from: n */
    public void mo6303n(int i) {
        Path.FillType fillType;
        Path path = this.f28390a;
        if (C11059s0.m6287f(i, C11059s0.f28438b.m6283a())) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    /* renamed from: o */
    public void mo6302o(float f, float f2) {
        this.f28390a.lineTo(f, f2);
    }

    /* renamed from: q */
    public final Path m6440q() {
        return this.f28390a;
    }

    public /* synthetic */ C11033j(Path path, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Path() : path);
    }
}
