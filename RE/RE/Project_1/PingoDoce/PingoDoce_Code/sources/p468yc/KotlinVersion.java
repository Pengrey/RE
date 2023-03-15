package p468yc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p297pd.C8611f;

/* renamed from: yc.e */
/* loaded from: classes2.dex */
public final class KotlinVersion implements Comparable {

    /* renamed from: A */
    public static final KotlinVersion f34135A;

    /* renamed from: w */
    private final int f34136w;

    /* renamed from: x */
    private final int f34137x;

    /* renamed from: y */
    private final int f34138y;

    /* renamed from: z */
    private final int f34139z;

    /* compiled from: KotlinVersion.kt */
    /* renamed from: yc.e$a */
    /* loaded from: classes2.dex */
    public static final class C13176a {
        private C13176a() {
        }

        public /* synthetic */ C13176a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C13176a(null);
        f34135A = C13177f.m1467a();
    }

    public KotlinVersion(int i, int i2, int i3) {
        this.f34136w = i;
        this.f34137x = i2;
        this.f34138y = i3;
        this.f34139z = m1468c(i, i2, i3);
    }

    /* renamed from: c */
    private final int m1468c(int i, int i2, int i3) {
        boolean z = false;
        if (new C8611f(0, 255).m15028q(i) && new C8611f(0, 255).m15028q(i2) && new C8611f(0, 255).m15028q(i3)) {
            z = true;
        }
        if (z) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    /* renamed from: b */
    public int compareTo(KotlinVersion kotlinVersion) {
        Intrinsics.isThisObjectNull(kotlinVersion, "other");
        return this.f34139z - kotlinVersion.f34139z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        KotlinVersion kotlinVersion = obj instanceof KotlinVersion ? (KotlinVersion) obj : null;
        return kotlinVersion != null && this.f34139z == kotlinVersion.f34139z;
    }

    public int hashCode() {
        return this.f34139z;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f34136w);
        sb2.append('.');
        sb2.append(this.f34137x);
        sb2.append('.');
        sb2.append(this.f34138y);
        return sb2.toString();
    }
}
