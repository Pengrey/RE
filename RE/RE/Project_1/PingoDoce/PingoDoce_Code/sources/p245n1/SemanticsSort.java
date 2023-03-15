package p245n1;

import id.InterfaceC6108l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p127h1.InterfaceC5776j;
import p127h1.LayoutCoordinates;
import p169j1.LayoutNode;
import p169j1.LayoutNodeWrapper;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p373u0.Rect;
import p479z1.EnumC13618o;

/* renamed from: n1.f */
/* loaded from: classes.dex */
public final class SemanticsSort implements Comparable {

    /* renamed from: A */
    public static final C7586a f20074A = new C7586a(null);

    /* renamed from: B */
    private static EnumC7587b f20075B = EnumC7587b.Stripe;

    /* renamed from: w */
    private final LayoutNode f20076w;

    /* renamed from: x */
    private final LayoutNode f20077x;

    /* renamed from: y */
    private final Rect f20078y;

    /* renamed from: z */
    private final EnumC13618o f20079z;

    /* compiled from: SemanticsSort.kt */
    /* renamed from: n1.f$a */
    /* loaded from: classes.dex */
    public static final class C7586a {
        private C7586a() {
        }

        public /* synthetic */ C7586a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m18081a(EnumC7587b enumC7587b) {
            Intrinsics.isThisObjectNull(enumC7587b, "<set-?>");
            SemanticsSort.m18084b(enumC7587b);
        }
    }

    /* compiled from: SemanticsSort.kt */
    /* renamed from: n1.f$b */
    /* loaded from: classes.dex */
    public enum EnumC7587b {
        Stripe,
        Location
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SemanticsSort.kt */
    /* renamed from: n1.f$c */
    /* loaded from: classes.dex */
    public static final class C7588c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ Rect f20080w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7588c(Rect rect) {
            super(1);
            this.f20080w = rect;
        }

        /* renamed from: a */
        public final Boolean mo9587d(LayoutNode layoutNode) {
            Intrinsics.isThisObjectNull(layoutNode, "it");
            LayoutNodeWrapper m17905e = C7622w.m17905e(layoutNode);
            return Boolean.valueOf(m17905e.mo23109S() && !Intrinsics.equals(this.f20080w, LayoutCoordinates.m23093b(m17905e)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SemanticsSort.kt */
    /* renamed from: n1.f$d */
    /* loaded from: classes.dex */
    public static final class C7589d extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ Rect f20081w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7589d(Rect rect) {
            super(1);
            this.f20081w = rect;
        }

        /* renamed from: a */
        public final Boolean mo9587d(LayoutNode layoutNode) {
            Intrinsics.isThisObjectNull(layoutNode, "it");
            LayoutNodeWrapper m17905e = C7622w.m17905e(layoutNode);
            return Boolean.valueOf(m17905e.mo23109S() && !Intrinsics.equals(this.f20081w, LayoutCoordinates.m23093b(m17905e)));
        }
    }

    public SemanticsSort(LayoutNode layoutNode, LayoutNode layoutNode2) {
        Intrinsics.isThisObjectNull(layoutNode, "subtreeRoot");
        Intrinsics.isThisObjectNull(layoutNode2, "node");
        this.f20076w = layoutNode;
        this.f20077x = layoutNode2;
        this.f20079z = layoutNode.getLayoutDirection();
        LayoutNodeWrapper m21563P = layoutNode.m21563P();
        LayoutNodeWrapper m17905e = C7622w.m17905e(layoutNode2);
        Rect rect = null;
        if (m21563P.mo23109S() && m17905e.mo23109S()) {
            rect = InterfaceC5776j.C5777a.m23102a(m21563P, m17905e, false, 2, null);
        }
        this.f20078y = rect;
    }

    /* renamed from: b */
    public static final /* synthetic */ void m18084b(EnumC7587b enumC7587b) {
        f20075B = enumC7587b;
    }

    /* renamed from: c */
    public int compareTo(SemanticsSort semanticsSort) {
        Intrinsics.isThisObjectNull(semanticsSort, "other");
        Rect rect = this.f20078y;
        if (rect == null) {
            return 1;
        }
        if (semanticsSort.f20078y == null) {
            return -1;
        }
        if (f20075B == EnumC7587b.Stripe) {
            if (rect.m7128c() - semanticsSort.f20078y.m7122i() <= 0.0f) {
                return -1;
            }
            if (this.f20078y.m7122i() - semanticsSort.f20078y.m7128c() >= 0.0f) {
                return 1;
            }
        }
        if (this.f20079z == EnumC13618o.Ltr) {
            int i = ((this.f20078y.m7125f() - semanticsSort.f20078y.m7125f()) > 0.0f ? 1 : ((this.f20078y.m7125f() - semanticsSort.f20078y.m7125f()) == 0.0f ? 0 : -1));
            if (!(i == 0)) {
                return i < 0 ? -1 : 1;
            }
        } else {
            int i2 = ((this.f20078y.m7124g() - semanticsSort.f20078y.m7124g()) > 0.0f ? 1 : ((this.f20078y.m7124g() - semanticsSort.f20078y.m7124g()) == 0.0f ? 0 : -1));
            if (!(i2 == 0)) {
                return i2 < 0 ? 1 : -1;
            }
        }
        int i3 = ((this.f20078y.m7122i() - semanticsSort.f20078y.m7122i()) > 0.0f ? 1 : ((this.f20078y.m7122i() - semanticsSort.f20078y.m7122i()) == 0.0f ? 0 : -1));
        if (!(i3 == 0)) {
            return i3 < 0 ? -1 : 1;
        }
        int i4 = ((this.f20078y.m7126e() - semanticsSort.f20078y.m7126e()) > 0.0f ? 1 : ((this.f20078y.m7126e() - semanticsSort.f20078y.m7126e()) == 0.0f ? 0 : -1));
        if (!(i4 == 0)) {
            return i4 < 0 ? 1 : -1;
        }
        int i5 = ((this.f20078y.m7120k() - semanticsSort.f20078y.m7120k()) > 0.0f ? 1 : ((this.f20078y.m7120k() - semanticsSort.f20078y.m7120k()) == 0.0f ? 0 : -1));
        if (!(i5 == 0)) {
            return i5 < 0 ? 1 : -1;
        }
        Rect m23093b = LayoutCoordinates.m23093b(C7622w.m17905e(this.f20077x));
        Rect m23093b2 = LayoutCoordinates.m23093b(C7622w.m17905e(semanticsSort.f20077x));
        LayoutNode m17909a = C7622w.m17909a(this.f20077x, new C7588c(m23093b));
        LayoutNode m17909a2 = C7622w.m17909a(semanticsSort.f20077x, new C7589d(m23093b2));
        if (m17909a == null || m17909a2 == null) {
            return m17909a != null ? 1 : -1;
        }
        return new SemanticsSort(this.f20076w, m17909a).compareTo(new SemanticsSort(semanticsSort.f20076w, m17909a2));
    }

    /* renamed from: d */
    public final LayoutNode m18082d() {
        return this.f20077x;
    }
}
