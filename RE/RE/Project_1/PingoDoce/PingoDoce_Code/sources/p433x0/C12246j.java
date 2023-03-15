package p433x0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p393v0.C11012e1;
import p393v0.C11018f1;
import p393v0.InterfaceC11056r0;

/* renamed from: x0.j */
/* loaded from: classes.dex */
public final class C12246j extends AbstractC12242f {

    /* renamed from: a */
    private final float f32290a;

    /* renamed from: b */
    private final float f32291b;

    /* renamed from: c */
    private final int f32292c;

    /* renamed from: d */
    private final int f32293d;

    /* renamed from: e */
    private final InterfaceC11056r0 f32294e;

    /* compiled from: DrawScope.kt */
    /* renamed from: x0.j$a */
    /* loaded from: classes.dex */
    public static final class C12247a {
        private C12247a() {
        }

        public /* synthetic */ C12247a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C12247a(null);
        C11012e1.f28346b.m6537a();
        C11018f1.f28366b.m6513b();
    }

    public /* synthetic */ C12246j(float f, float f2, int i, int i2, InterfaceC11056r0 interfaceC11056r0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0.0f : f, (i3 & 2) != 0 ? 4.0f : f2, (i3 & 4) != 0 ? C11012e1.f28346b.m6537a() : i, (i3 & 8) != 0 ? C11018f1.f28366b.m6513b() : i2, (i3 & 16) != 0 ? null : interfaceC11056r0, null);
    }

    public /* synthetic */ C12246j(float f, float f2, int i, int i2, InterfaceC11056r0 interfaceC11056r0, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, i, i2, interfaceC11056r0);
    }

    /* renamed from: a */
    public final int m3224a() {
        return this.f32292c;
    }

    /* renamed from: b */
    public final int m3223b() {
        return this.f32293d;
    }

    /* renamed from: c */
    public final float m3222c() {
        return this.f32291b;
    }

    /* renamed from: d */
    public final InterfaceC11056r0 m3221d() {
        return this.f32294e;
    }

    /* renamed from: e */
    public final float m3220e() {
        return this.f32290a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12246j) {
            C12246j c12246j = (C12246j) obj;
            if (this.f32290a == c12246j.f32290a) {
                return ((this.f32291b > c12246j.f32291b ? 1 : (this.f32291b == c12246j.f32291b ? 0 : -1)) == 0) && C11012e1.m6541g(m3224a(), c12246j.m3224a()) && C11018f1.m6518g(m3223b(), c12246j.m3223b()) && Intrinsics.equals(this.f32294e, c12246j.f32294e);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((Float.hashCode(this.f32290a) * 31) + Float.hashCode(this.f32291b)) * 31) + C11012e1.m6540h(m3224a())) * 31) + C11018f1.m6517h(m3223b())) * 31;
        InterfaceC11056r0 interfaceC11056r0 = this.f32294e;
        return hashCode + (interfaceC11056r0 == null ? 0 : interfaceC11056r0.hashCode());
    }

    public String toString() {
        return "Stroke(width=" + this.f32290a + ", miter=" + this.f32291b + ", cap=" + ((Object) C11012e1.m6539i(m3224a())) + ", join=" + ((Object) C11018f1.m6516i(m3223b())) + ", pathEffect=" + this.f32294e + ')';
    }

    private C12246j(float f, float f2, int i, int i2, InterfaceC11056r0 interfaceC11056r0) {
        super(null);
        this.f32290a = f;
        this.f32291b = f2;
        this.f32292c = i;
        this.f32293d = i2;
        this.f32294e = interfaceC11056r0;
    }
}
