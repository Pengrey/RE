package p457y1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: y1.f */
/* loaded from: classes.dex */
public final class C13066f {

    /* renamed from: c */
    public static final C13067a f33984c = new C13067a(null);

    /* renamed from: d */
    private static final C13066f f33985d = new C13066f(1.0f, 0.0f);

    /* renamed from: a */
    private final float f33986a;

    /* renamed from: b */
    private final float f33987b;

    /* compiled from: TextGeometricTransform.kt */
    /* renamed from: y1.f$a */
    /* loaded from: classes.dex */
    public static final class C13067a {
        private C13067a() {
        }

        public /* synthetic */ C13067a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13066f m1700a() {
            return C13066f.f33985d;
        }
    }

    public C13066f() {
        this(0.0f, 0.0f, 3, null);
    }

    public C13066f(float f, float f2) {
        this.f33986a = f;
        this.f33987b = f2;
    }

    /* renamed from: b */
    public final float m1702b() {
        return this.f33986a;
    }

    /* renamed from: c */
    public final float m1701c() {
        return this.f33987b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13066f) {
            C13066f c13066f = (C13066f) obj;
            if (this.f33986a == c13066f.f33986a) {
                return (this.f33987b > c13066f.f33987b ? 1 : (this.f33987b == c13066f.f33987b ? 0 : -1)) == 0;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f33986a) * 31) + Float.hashCode(this.f33987b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f33986a + ", skewX=" + this.f33987b + ')';
    }

    public /* synthetic */ C13066f(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
