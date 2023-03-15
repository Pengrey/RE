package p093f1;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p373u0.C10774f;
import p489zc.C13780s;

/* compiled from: PointerEvent.kt */
/* renamed from: f1.u */
/* loaded from: classes.dex */
public final class C5318u {

    /* renamed from: a */
    private final long f14661a;

    /* renamed from: b */
    private final long f14662b;

    /* renamed from: c */
    private final long f14663c;

    /* renamed from: d */
    private final boolean f14664d;

    /* renamed from: e */
    private final long f14665e;

    /* renamed from: f */
    private final long f14666f;

    /* renamed from: g */
    private final boolean f14667g;

    /* renamed from: h */
    private final C5277d f14668h;

    /* renamed from: i */
    private final int f14669i;

    /* renamed from: j */
    private List f14670j;

    /* renamed from: k */
    private long f14671k;

    private C5318u(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, C5277d c5277d, int i) {
        this.f14661a = j;
        this.f14662b = j2;
        this.f14663c = j3;
        this.f14664d = z;
        this.f14665e = j4;
        this.f14666f = j5;
        this.f14667g = z2;
        this.f14668h = c5277d;
        this.f14669i = i;
        this.f14671k = C10774f.f27866b.m7134c();
    }

    public /* synthetic */ C5318u(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, C5277d c5277d, int i, List list, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, c5277d, i, list, j6);
    }

    public /* synthetic */ C5318u(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, C5277d c5277d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, c5277d, i);
    }

    /* renamed from: b */
    public static /* synthetic */ C5318u m24657b(C5318u c5318u, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, C5277d c5277d, int i, List list, int i2, Object obj) {
        return c5318u.m24658a((i2 & 1) != 0 ? c5318u.m24652g() : j, (i2 & 2) != 0 ? c5318u.f14662b : j2, (i2 & 4) != 0 ? c5318u.m24651h() : j3, (i2 & 8) != 0 ? c5318u.f14664d : z, (i2 & 16) != 0 ? c5318u.f14665e : j4, (i2 & 32) != 0 ? c5318u.m24649j() : j5, (i2 & 64) != 0 ? c5318u.f14667g : z2, (i2 & 128) != 0 ? c5318u.f14668h : c5277d, (i2 & 256) != 0 ? c5318u.m24646m() : i, list);
    }

    /* renamed from: d */
    public static /* synthetic */ C5318u m24655d(C5318u c5318u, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, C5277d c5277d, int i, int i2, Object obj) {
        return c5318u.m24656c((i2 & 1) != 0 ? c5318u.m24652g() : j, (i2 & 2) != 0 ? c5318u.f14662b : j2, (i2 & 4) != 0 ? c5318u.m24651h() : j3, (i2 & 8) != 0 ? c5318u.f14664d : z, (i2 & 16) != 0 ? c5318u.f14665e : j4, (i2 & 32) != 0 ? c5318u.m24649j() : j5, (i2 & 64) != 0 ? c5318u.f14667g : z2, (i2 & 128) != 0 ? c5318u.f14668h : c5277d, (i2 & 256) != 0 ? c5318u.m24646m() : i);
    }

    /* renamed from: a */
    public final C5318u m24658a(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, C5277d c5277d, int i, List list) {
        Intrinsics.isThisObjectNull(c5277d, "consumed");
        Intrinsics.isThisObjectNull(list, "historical");
        return new C5318u(j, j2, j3, z, j4, j5, z2, c5277d, i, list, m24647l(), null);
    }

    /* renamed from: c */
    public final C5318u m24656c(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, C5277d c5277d, int i) {
        Intrinsics.isThisObjectNull(c5277d, "consumed");
        return new C5318u(j, j2, j3, z, j4, j5, z2, c5277d, i, m24653f(), m24647l(), null);
    }

    /* renamed from: e */
    public final C5277d m24654e() {
        return this.f14668h;
    }

    /* renamed from: f */
    public final List m24653f() {
        List m197g;
        List list = this.f14670j;
        if (list == null) {
            m197g = C13780s.m197g();
            return m197g;
        }
        return list;
    }

    /* renamed from: g */
    public final long m24652g() {
        return this.f14661a;
    }

    /* renamed from: h */
    public final long m24651h() {
        return this.f14663c;
    }

    /* renamed from: i */
    public final boolean m24650i() {
        return this.f14664d;
    }

    /* renamed from: j */
    public final long m24649j() {
        return this.f14666f;
    }

    /* renamed from: k */
    public final boolean m24648k() {
        return this.f14667g;
    }

    /* renamed from: l */
    public final long m24647l() {
        return this.f14671k;
    }

    /* renamed from: m */
    public final int m24646m() {
        return this.f14669i;
    }

    /* renamed from: n */
    public final long m24645n() {
        return this.f14662b;
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) C5317t.m24660f(m24652g())) + ", uptimeMillis=" + this.f14662b + ", position=" + ((Object) C10774f.m7138r(m24651h())) + ", pressed=" + this.f14664d + ", previousUptimeMillis=" + this.f14665e + ", previousPosition=" + ((Object) C10774f.m7138r(m24649j())) + ", previousPressed=" + this.f14667g + ", consumed=" + this.f14668h + ", type=" + ((Object) C5280e0.m24804i(m24646m())) + ", historical=" + m24653f() + ",scrollDelta=" + ((Object) C10774f.m7138r(m24647l())) + ')';
    }

    private C5318u(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, C5277d c5277d, int i, List list, long j6) {
        this(j, j2, j3, z, j4, j5, z2, c5277d, i, null);
        this.f14670j = list;
        this.f14671k = j6;
    }
}
