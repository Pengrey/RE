package p410w;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p479z1.C13601c;

/* compiled from: RowColumnImpl.kt */
/* renamed from: w.u */
/* loaded from: classes.dex */
public final class C11491u {

    /* renamed from: a */
    private final int f29419a;

    /* renamed from: b */
    private final int f29420b;

    /* renamed from: c */
    private final int f29421c;

    /* renamed from: d */
    private final int f29422d;

    public C11491u(int i, int i2, int i3, int i4) {
        this.f29419a = i;
        this.f29420b = i2;
        this.f29421c = i3;
        this.f29422d = i4;
    }

    public /* synthetic */ C11491u(long j, EnumC11486q enumC11486q, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, enumC11486q);
    }

    /* renamed from: b */
    public static /* synthetic */ C11491u m4994b(C11491u c11491u, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = c11491u.f29419a;
        }
        if ((i5 & 2) != 0) {
            i2 = c11491u.f29420b;
        }
        if ((i5 & 4) != 0) {
            i3 = c11491u.f29421c;
        }
        if ((i5 & 8) != 0) {
            i4 = c11491u.f29422d;
        }
        return c11491u.m4995a(i, i2, i3, i4);
    }

    /* renamed from: a */
    public final C11491u m4995a(int i, int i2, int i3, int i4) {
        return new C11491u(i, i2, i3, i4);
    }

    /* renamed from: c */
    public final int m4993c() {
        return this.f29422d;
    }

    /* renamed from: d */
    public final int m4992d() {
        return this.f29421c;
    }

    /* renamed from: e */
    public final int m4991e() {
        return this.f29420b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11491u) {
            C11491u c11491u = (C11491u) obj;
            return this.f29419a == c11491u.f29419a && this.f29420b == c11491u.f29420b && this.f29421c == c11491u.f29421c && this.f29422d == c11491u.f29422d;
        }
        return false;
    }

    /* renamed from: f */
    public final int m4990f() {
        return this.f29419a;
    }

    /* renamed from: g */
    public final long m4989g(EnumC11486q enumC11486q) {
        Intrinsics.isThisObjectNull(enumC11486q, "orientation");
        if (enumC11486q == EnumC11486q.Horizontal) {
            return C13601c.m907a(this.f29419a, this.f29420b, this.f29421c, this.f29422d);
        }
        return C13601c.m907a(this.f29421c, this.f29422d, this.f29419a, this.f29420b);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f29419a) * 31) + Integer.hashCode(this.f29420b)) * 31) + Integer.hashCode(this.f29421c)) * 31) + Integer.hashCode(this.f29422d);
    }

    public String toString() {
        return "OrientationIndependentConstraints(mainAxisMin=" + this.f29419a + ", mainAxisMax=" + this.f29420b + ", crossAxisMin=" + this.f29421c + ", crossAxisMax=" + this.f29422d + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C11491u(long r5, p410w.EnumC11486q r7) {
        /*
            r4 = this;
            w.q r0 = p410w.EnumC11486q.Horizontal
            if (r7 != r0) goto L9
            int r1 = p479z1.C13599b.m914p(r5)
            goto Ld
        L9:
            int r1 = p479z1.C13599b.m915o(r5)
        Ld:
            if (r7 != r0) goto L14
            int r2 = p479z1.C13599b.m916n(r5)
            goto L18
        L14:
            int r2 = p479z1.C13599b.m917m(r5)
        L18:
            if (r7 != r0) goto L1f
            int r3 = p479z1.C13599b.m915o(r5)
            goto L23
        L1f:
            int r3 = p479z1.C13599b.m914p(r5)
        L23:
            if (r7 != r0) goto L2a
            int r5 = p479z1.C13599b.m917m(r5)
            goto L2e
        L2a:
            int r5 = p479z1.C13599b.m916n(r5)
        L2e:
            r4.<init>(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p410w.C11491u.<init>(long, w.q):void");
    }
}
