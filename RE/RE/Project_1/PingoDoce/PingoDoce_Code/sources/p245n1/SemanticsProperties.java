package p245n1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p297pd.InterfaceC8606b;
import p297pd.Ranges;

/* renamed from: n1.g */
/* loaded from: classes.dex */
public final class SemanticsProperties {

    /* renamed from: d */
    public static final C7590a f20082d = new C7590a(null);

    /* renamed from: e */
    private static final SemanticsProperties f20083e;

    /* renamed from: a */
    private final float f20084a;

    /* renamed from: b */
    private final InterfaceC8606b f20085b;

    /* renamed from: c */
    private final int f20086c;

    /* compiled from: SemanticsProperties.kt */
    /* renamed from: n1.g$a */
    /* loaded from: classes.dex */
    public static final class C7590a {
        private C7590a() {
        }

        public /* synthetic */ C7590a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final SemanticsProperties m18074a() {
            return SemanticsProperties.m18078a();
        }
    }

    static {
        InterfaceC8606b<Float> m15007b;
        m15007b = Ranges.m15007b(0.0f, 0.0f);
        f20083e = new SemanticsProperties(0.0f, m15007b, 0, 4, null);
    }

    public SemanticsProperties(float f, InterfaceC8606b interfaceC8606b, int i) {
        Intrinsics.isThisObjectNull(interfaceC8606b, "range");
        this.f20084a = f;
        this.f20085b = interfaceC8606b;
        this.f20086c = i;
    }

    /* renamed from: a */
    public static final /* synthetic */ SemanticsProperties m18078a() {
        return f20083e;
    }

    /* renamed from: b */
    public final float m18077b() {
        return this.f20084a;
    }

    /* renamed from: c */
    public final InterfaceC8606b m18076c() {
        return this.f20085b;
    }

    /* renamed from: d */
    public final int m18075d() {
        return this.f20086c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SemanticsProperties) {
            SemanticsProperties semanticsProperties = (SemanticsProperties) obj;
            return ((this.f20084a > semanticsProperties.f20084a ? 1 : (this.f20084a == semanticsProperties.f20084a ? 0 : -1)) == 0) && Intrinsics.equals(this.f20085b, semanticsProperties.f20085b) && this.f20086c == semanticsProperties.f20086c;
        }
        return false;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f20084a) * 31) + this.f20085b.hashCode()) * 31) + this.f20086c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f20084a + ", range=" + this.f20085b + ", steps=" + this.f20086c + ')';
    }

    public /* synthetic */ SemanticsProperties(float f, InterfaceC8606b interfaceC8606b, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, interfaceC8606b, (i2 & 4) != 0 ? 0 : i);
    }
}
