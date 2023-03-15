package p286p1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p457y1.C13061c;
import p457y1.C13064e;
import p457y1.C13068g;
import p479z1.C13619p;
import p479z1.C13621q;

/* renamed from: p1.n */
/* loaded from: classes.dex */
public final class C8349n {

    /* renamed from: a */
    private final C13061c f21616a;

    /* renamed from: b */
    private final C13064e f21617b;

    /* renamed from: c */
    private final long f21618c;

    /* renamed from: d */
    private final C13068g f21619d;

    private C8349n(C13061c c13061c, C13064e c13064e, long j, C13068g c13068g) {
        this.f21616a = c13061c;
        this.f21617b = c13064e;
        this.f21618c = j;
        this.f21619d = c13068g;
        if (C13619p.m813e(m15678c(), C13619p.f34613b.m806a())) {
            return;
        }
        if (C13619p.m810h(m15678c()) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + C13619p.m810h(m15678c()) + ')').toString());
    }

    public /* synthetic */ C8349n(C13061c c13061c, C13064e c13064e, long j, C13068g c13068g, DefaultConstructorMarker defaultConstructorMarker) {
        this(c13061c, c13064e, j, c13068g);
    }

    /* renamed from: b */
    public static /* synthetic */ C8349n m15679b(C8349n c8349n, C13061c c13061c, C13064e c13064e, long j, C13068g c13068g, int i, Object obj) {
        if ((i & 1) != 0) {
            c13061c = c8349n.m15677d();
        }
        if ((i & 2) != 0) {
            c13064e = c8349n.m15676e();
        }
        C13064e c13064e2 = c13064e;
        if ((i & 4) != 0) {
            j = c8349n.m15678c();
        }
        long j2 = j;
        if ((i & 8) != 0) {
            c13068g = c8349n.f21619d;
        }
        return c8349n.m15680a(c13061c, c13064e2, j2, c13068g);
    }

    /* renamed from: a */
    public final C8349n m15680a(C13061c c13061c, C13064e c13064e, long j, C13068g c13068g) {
        return new C8349n(c13061c, c13064e, j, c13068g, null);
    }

    /* renamed from: c */
    public final long m15678c() {
        return this.f21618c;
    }

    /* renamed from: d */
    public final C13061c m15677d() {
        return this.f21616a;
    }

    /* renamed from: e */
    public final C13064e m15676e() {
        return this.f21617b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8349n) {
            C8349n c8349n = (C8349n) obj;
            return Intrinsics.equals(m15677d(), c8349n.m15677d()) && Intrinsics.equals(m15676e(), c8349n.m15676e()) && C13619p.m813e(m15678c(), c8349n.m15678c()) && Intrinsics.equals(this.f21619d, c8349n.f21619d);
        }
        return false;
    }

    /* renamed from: f */
    public final C13068g m15675f() {
        return this.f21619d;
    }

    /* renamed from: g */
    public final C8349n m15674g(C8349n c8349n) {
        long m15678c;
        if (c8349n == null) {
            return this;
        }
        if (C13621q.m802d(c8349n.m15678c())) {
            m15678c = m15678c();
        } else {
            m15678c = c8349n.m15678c();
        }
        long j = m15678c;
        C13068g c13068g = c8349n.f21619d;
        if (c13068g == null) {
            c13068g = this.f21619d;
        }
        C13068g c13068g2 = c13068g;
        C13061c m15677d = c8349n.m15677d();
        if (m15677d == null) {
            m15677d = m15677d();
        }
        C13061c c13061c = m15677d;
        C13064e m15676e = c8349n.m15676e();
        if (m15676e == null) {
            m15676e = m15676e();
        }
        return new C8349n(c13061c, m15676e, j, c13068g2, null);
    }

    public int hashCode() {
        C13061c m15677d = m15677d();
        int m1737k = (m15677d == null ? 0 : C13061c.m1737k(m15677d.m1735m())) * 31;
        C13064e m15676e = m15676e();
        int m1711j = (((m1737k + (m15676e == null ? 0 : C13064e.m1711j(m15676e.m1709l()))) * 31) + C13619p.m809i(m15678c())) * 31;
        C13068g c13068g = this.f21619d;
        return m1711j + (c13068g != null ? c13068g.hashCode() : 0);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + m15677d() + ", textDirection=" + m15676e() + ", lineHeight=" + ((Object) C13619p.m808j(m15678c())) + ", textIndent=" + this.f21619d + ')';
    }
}
