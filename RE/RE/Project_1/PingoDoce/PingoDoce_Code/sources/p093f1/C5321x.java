package p093f1;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p373u0.C10774f;

/* renamed from: f1.x */
/* loaded from: classes.dex */
public final class C5321x {

    /* renamed from: a */
    private final long f14678a;

    /* renamed from: b */
    private final long f14679b;

    /* renamed from: c */
    private final long f14680c;

    /* renamed from: d */
    private final long f14681d;

    /* renamed from: e */
    private final boolean f14682e;

    /* renamed from: f */
    private final int f14683f;

    /* renamed from: g */
    private final boolean f14684g;

    /* renamed from: h */
    private final List f14685h;

    /* renamed from: i */
    private final long f14686i;

    private C5321x(long j, long j2, long j3, long j4, boolean z, int i, boolean z2, List list, long j5) {
        this.f14678a = j;
        this.f14679b = j2;
        this.f14680c = j3;
        this.f14681d = j4;
        this.f14682e = z;
        this.f14683f = i;
        this.f14684g = z2;
        this.f14685h = list;
        this.f14686i = j5;
    }

    public /* synthetic */ C5321x(long j, long j2, long j3, long j4, boolean z, int i, boolean z2, List list, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, z, i, z2, list, j5);
    }

    /* renamed from: a */
    public final boolean m24637a() {
        return this.f14682e;
    }

    /* renamed from: b */
    public final List m24636b() {
        return this.f14685h;
    }

    /* renamed from: c */
    public final long m24635c() {
        return this.f14678a;
    }

    /* renamed from: d */
    public final boolean m24634d() {
        return this.f14684g;
    }

    /* renamed from: e */
    public final long m24633e() {
        return this.f14681d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5321x) {
            C5321x c5321x = (C5321x) obj;
            return C5317t.m24662d(this.f14678a, c5321x.f14678a) && this.f14679b == c5321x.f14679b && C10774f.m7147i(this.f14680c, c5321x.f14680c) && C10774f.m7147i(this.f14681d, c5321x.f14681d) && this.f14682e == c5321x.f14682e && C5280e0.m24806g(this.f14683f, c5321x.f14683f) && this.f14684g == c5321x.f14684g && Intrinsics.equals(this.f14685h, c5321x.f14685h) && C10774f.m7147i(this.f14686i, c5321x.f14686i);
        }
        return false;
    }

    /* renamed from: f */
    public final long m24632f() {
        return this.f14680c;
    }

    /* renamed from: g */
    public final long m24631g() {
        return this.f14686i;
    }

    /* renamed from: h */
    public final int m24630h() {
        return this.f14683f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int m24661e = ((((((C5317t.m24661e(this.f14678a) * 31) + Long.hashCode(this.f14679b)) * 31) + C10774f.m7143m(this.f14680c)) * 31) + C10774f.m7143m(this.f14681d)) * 31;
        boolean z = this.f14682e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int m24805h = (((m24661e + i) * 31) + C5280e0.m24805h(this.f14683f)) * 31;
        boolean z2 = this.f14684g;
        return ((((m24805h + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.f14685h.hashCode()) * 31) + C10774f.m7143m(this.f14686i);
    }

    /* renamed from: i */
    public final long m24629i() {
        return this.f14679b;
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) C5317t.m24660f(this.f14678a)) + ", uptime=" + this.f14679b + ", positionOnScreen=" + ((Object) C10774f.m7138r(this.f14680c)) + ", position=" + ((Object) C10774f.m7138r(this.f14681d)) + ", down=" + this.f14682e + ", type=" + ((Object) C5280e0.m24804i(this.f14683f)) + ", issuesEnterExit=" + this.f14684g + ", historical=" + this.f14685h + ", scrollDelta=" + ((Object) C10774f.m7138r(this.f14686i)) + ')';
    }
}
