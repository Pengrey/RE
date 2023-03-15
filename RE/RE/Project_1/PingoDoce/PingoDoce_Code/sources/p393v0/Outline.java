package p393v0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p373u0.C10779j;
import p373u0.Rect;

/* renamed from: v0.m0 */
/* loaded from: classes.dex */
public abstract class Outline {

    /* compiled from: Outline.kt */
    /* renamed from: v0.m0$a */
    /* loaded from: classes.dex */
    public static final class C11039a extends Outline {

        /* renamed from: a */
        private final InterfaceC11052q0 f28396a;

        /* renamed from: a */
        public final InterfaceC11052q0 m6425a() {
            return this.f28396a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11039a) && Intrinsics.equals(this.f28396a, ((C11039a) obj).f28396a);
        }

        public int hashCode() {
            return this.f28396a.hashCode();
        }
    }

    /* compiled from: Outline.kt */
    /* renamed from: v0.m0$b */
    /* loaded from: classes.dex */
    public static final class C11040b extends Outline {

        /* renamed from: a */
        private final Rect f28397a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11040b(Rect rect) {
            super(null);
            Intrinsics.isThisObjectNull(rect, "rect");
            this.f28397a = rect;
        }

        /* renamed from: a */
        public final Rect m6424a() {
            return this.f28397a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11040b) && Intrinsics.equals(this.f28397a, ((C11040b) obj).f28397a);
        }

        public int hashCode() {
            return this.f28397a.hashCode();
        }
    }

    /* compiled from: Outline.kt */
    /* renamed from: v0.m0$c */
    /* loaded from: classes.dex */
    public static final class C11041c extends Outline {

        /* renamed from: a */
        private final C10779j f28398a;

        /* renamed from: b */
        private final InterfaceC11052q0 f28399b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11041c(C10779j c10779j) {
            super(null);
            Intrinsics.isThisObjectNull(c10779j, "roundRect");
            InterfaceC11052q0 interfaceC11052q0 = null;
            this.f28398a = c10779j;
            if (!C11043n0.m6420a(c10779j)) {
                interfaceC11052q0 = C11042n.m6421a();
                interfaceC11052q0.mo6313d(m6423a());
            }
            this.f28399b = interfaceC11052q0;
        }

        /* renamed from: a */
        public final C10779j m6423a() {
            return this.f28398a;
        }

        /* renamed from: b */
        public final InterfaceC11052q0 m6422b() {
            return this.f28399b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11041c) && Intrinsics.equals(this.f28398a, ((C11041c) obj).f28398a);
        }

        public int hashCode() {
            return this.f28398a.hashCode();
        }
    }

    private Outline() {
    }

    public /* synthetic */ Outline(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
