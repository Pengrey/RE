package p245n1;

import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p245n1.SemanticsModifier;
import p302q0.InterfaceC9570f;

/* compiled from: SemanticsModifier.kt */
/* renamed from: n1.n */
/* loaded from: classes.dex */
public final class C7598n implements SemanticsModifier {

    /* renamed from: y */
    public static final C7599a f20118y = new C7599a(null);

    /* renamed from: z */
    private static AtomicInteger f20119z = new AtomicInteger(0);

    /* renamed from: w */
    private final int f20120w;

    /* renamed from: x */
    private final SemanticsConfiguration f20121x;

    /* compiled from: SemanticsModifier.kt */
    /* renamed from: n1.n$a */
    /* loaded from: classes.dex */
    public static final class C7599a {
        private C7599a() {
        }

        public /* synthetic */ C7599a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m18017a() {
            return C7598n.m18019a().addAndGet(1);
        }
    }

    public C7598n(int i, boolean z, boolean z2, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "properties");
        this.f20120w = i;
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.m18026y(z);
        semanticsConfiguration.m18027x(z2);
        interfaceC6108l.mo9587d(semanticsConfiguration);
        this.f20121x = semanticsConfiguration;
    }

    /* renamed from: a */
    public static final /* synthetic */ AtomicInteger m18019a() {
        return f20119z;
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return SemanticsModifier.C7597a.m18023a(this, interfaceC6108l);
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return SemanticsModifier.C7597a.m18021c(this, obj, interfaceC6112p);
    }

    /* renamed from: c0 */
    public SemanticsConfiguration m18018c0() {
        return this.f20121x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7598n) {
            C7598n c7598n = (C7598n) obj;
            return getId() == c7598n.getId() && Intrinsics.equals(m18018c0(), c7598n.m18018c0());
        }
        return false;
    }

    public int getId() {
        return this.f20120w;
    }

    public int hashCode() {
        return (m18018c0().hashCode() * 31) + Integer.hashCode(getId());
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        return SemanticsModifier.C7597a.m18022b(this, obj, interfaceC6112p);
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return SemanticsModifier.C7597a.m18020d(this, interfaceC9570f);
    }
}
