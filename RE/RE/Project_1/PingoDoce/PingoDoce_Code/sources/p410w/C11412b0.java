package p410w;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: w.b0 */
/* loaded from: classes.dex */
public final class C11412b0 {

    /* renamed from: a */
    private float f29294a;

    /* renamed from: b */
    private boolean f29295b;

    /* renamed from: c */
    private AbstractC11475m f29296c;

    public C11412b0() {
        this(0.0f, false, null, 7, null);
    }

    public C11412b0(float f, boolean z, AbstractC11475m abstractC11475m) {
        this.f29294a = f;
        this.f29295b = z;
        this.f29296c = abstractC11475m;
    }

    /* renamed from: a */
    public final AbstractC11475m m5184a() {
        return this.f29296c;
    }

    /* renamed from: b */
    public final boolean m5183b() {
        return this.f29295b;
    }

    /* renamed from: c */
    public final float m5182c() {
        return this.f29294a;
    }

    /* renamed from: d */
    public final void m5181d(AbstractC11475m abstractC11475m) {
        this.f29296c = abstractC11475m;
    }

    /* renamed from: e */
    public final void m5180e(boolean z) {
        this.f29295b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11412b0) {
            C11412b0 c11412b0 = (C11412b0) obj;
            return Intrinsics.equals(Float.valueOf(this.f29294a), Float.valueOf(c11412b0.f29294a)) && this.f29295b == c11412b0.f29295b && Intrinsics.equals(this.f29296c, c11412b0.f29296c);
        }
        return false;
    }

    /* renamed from: f */
    public final void m5179f(float f) {
        this.f29294a = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Float.hashCode(this.f29294a) * 31;
        boolean z = this.f29295b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        AbstractC11475m abstractC11475m = this.f29296c;
        return i2 + (abstractC11475m == null ? 0 : abstractC11475m.hashCode());
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.f29294a + ", fill=" + this.f29295b + ", crossAxisAlignment=" + this.f29296c + ')';
    }

    public /* synthetic */ C11412b0(float f, boolean z, AbstractC11475m abstractC11475m, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : abstractC11475m);
    }
}
