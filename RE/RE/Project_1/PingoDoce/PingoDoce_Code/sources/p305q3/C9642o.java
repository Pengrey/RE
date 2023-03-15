package p305q3;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p396v3.C11091c;
import p489zc.C13769l0;

/* renamed from: q3.o */
/* loaded from: classes.dex */
public final class C9642o {

    /* renamed from: b */
    public static final C9643a f25448b = new C9643a(null);

    /* renamed from: c */
    public static final C9642o f25449c;

    /* renamed from: a */
    private final Map f25450a;

    /* compiled from: Tags.kt */
    /* renamed from: q3.o$a */
    /* loaded from: classes.dex */
    public static final class C9643a {
        private C9643a() {
        }

        public /* synthetic */ C9643a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C9642o m10298a(Map map) {
            return new C9642o(C11091c.m6169b(map), null);
        }
    }

    static {
        Map m334e;
        m334e = C13769l0.m334e();
        f25449c = new C9642o(m334e);
    }

    private C9642o(Map map) {
        this.f25450a = map;
    }

    public /* synthetic */ C9642o(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    /* renamed from: a */
    public final Map m10299a() {
        return this.f25450a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9642o) && Intrinsics.equals(this.f25450a, ((C9642o) obj).f25450a);
    }

    public int hashCode() {
        return this.f25450a.hashCode();
    }

    public String toString() {
        return "Tags(tags=" + this.f25450a + ')';
    }
}
