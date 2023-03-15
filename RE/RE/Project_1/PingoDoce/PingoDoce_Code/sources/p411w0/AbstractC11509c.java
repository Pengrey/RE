package p411w0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.C6450z;
import p181jd.Intrinsics;

/* renamed from: w0.c */
/* loaded from: classes.dex */
public abstract class AbstractC11509c {

    /* renamed from: a */
    private final String f29456a;

    /* renamed from: b */
    private final long f29457b;

    /* renamed from: c */
    private final int f29458c;

    /* compiled from: ColorSpace.kt */
    /* renamed from: w0.c$a */
    /* loaded from: classes.dex */
    public static final class C11510a {
        private C11510a() {
        }

        public /* synthetic */ C11510a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C11510a(null);
    }

    private AbstractC11509c(String str, long j, int i) {
        this.f29456a = str;
        this.f29457b = j;
        this.f29458c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public /* synthetic */ AbstractC11509c(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, i);
    }

    /* renamed from: a */
    public abstract float[] m4925a(float[] fArr);

    /* renamed from: b */
    public final int m4924b() {
        return C11507b.m4931f(m4920f());
    }

    /* renamed from: c */
    public final int m4923c() {
        return this.f29458c;
    }

    /* renamed from: d */
    public abstract float m4922d(int i);

    /* renamed from: e */
    public abstract float m4921e(int i);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.equals(C6450z.m20906b(getClass()), C6450z.m20906b(obj.getClass()))) {
            return false;
        }
        AbstractC11509c abstractC11509c = (AbstractC11509c) obj;
        if (this.f29458c == abstractC11509c.f29458c && Intrinsics.equals(this.f29456a, abstractC11509c.f29456a)) {
            return C11507b.m4932e(m4920f(), abstractC11509c.m4920f());
        }
        return false;
    }

    /* renamed from: f */
    public final long m4920f() {
        return this.f29457b;
    }

    /* renamed from: g */
    public final String m4919g() {
        return this.f29456a;
    }

    /* renamed from: h */
    public boolean m4918h() {
        return false;
    }

    public int hashCode() {
        return (((this.f29456a.hashCode() * 31) + C11507b.m4930g(m4920f())) * 31) + this.f29458c;
    }

    /* renamed from: i */
    public abstract float[] m4917i(float[] fArr);

    public String toString() {
        return this.f29456a + " (id=" + this.f29458c + ", model=" + ((Object) C11507b.m4929h(m4920f())) + ')';
    }
}
