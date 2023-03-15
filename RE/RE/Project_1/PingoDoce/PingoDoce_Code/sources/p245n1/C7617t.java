package p245n1;

import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import p181jd.AbstractC6438m;
import p181jd.C6440o;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p286p1.AnnotatedString;
import p314qd.InterfaceC9724h;
import p468yc.C13195u;
import p468yc.InterfaceC13174c;
import p489zc.CollectionsJVM;

/* compiled from: SemanticsProperties.kt */
/* renamed from: n1.t */
/* loaded from: classes.dex */
public final class C7617t {

    /* renamed from: a */
    static final /* synthetic */ InterfaceC9724h[] f20172a = {C6450z.m20904d(new C6440o(C7617t.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), C6450z.m20904d(new C6440o(C7617t.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), C6450z.m20904d(new C6440o(C7617t.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), C6450z.m20904d(new C6440o(C7617t.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), C6450z.m20904d(new C6440o(C7617t.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), C6450z.m20904d(new C6440o(C7617t.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), C6450z.m20904d(new C6440o(C7617t.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), C6450z.m20904d(new C6440o(C7617t.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), C6450z.m20904d(new C6440o(C7617t.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), C6450z.m20904d(new C6440o(C7617t.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), C6450z.m20904d(new C6440o(C7617t.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), C6450z.m20904d(new C6440o(C7617t.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), C6450z.m20904d(new C6440o(C7617t.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), C6450z.m20904d(new C6440o(C7617t.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), C6450z.m20904d(new C6440o(C7617t.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), C6450z.m20904d(new C6440o(C7617t.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), C6450z.m20904d(new C6440o(C7617t.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};

    /* renamed from: b */
    private static final C7619u f20173b;

    /* renamed from: c */
    private static final C7619u f20174c;

    /* renamed from: d */
    private static final C7619u f20175d;

    /* renamed from: e */
    private static final C7619u f20176e;

    /* renamed from: f */
    private static final C7619u f20177f;

    /* renamed from: g */
    private static final C7619u f20178g;

    /* renamed from: h */
    private static final C7619u f20179h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SemanticsProperties.kt */
    /* renamed from: n1.t$a */
    /* loaded from: classes.dex */
    public static final class C7618a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C7618a f20180w = new C7618a();

        C7618a() {
            super(2);
        }

        /* renamed from: a */
        public final C7580a mo39856d(C7580a c7580a, C7580a c7580a2) {
            Intrinsics.isThisObjectNull(c7580a2, "childValue");
            String m18104b = c7580a == null ? null : c7580a.m18104b();
            if (m18104b == null) {
                m18104b = c7580a2.m18104b();
            }
            InterfaceC13174c m18105a = c7580a != null ? c7580a.m18105a() : null;
            if (m18105a == null) {
                m18105a = c7580a2.m18105a();
            }
            return new C7580a(m18104b, m18105a);
        }
    }

    static {
        C7608s c7608s = C7608s.f20138a;
        c7608s.m17951t();
        c7608s.m17955p();
        f20173b = c7608s.m17957n();
        f20174c = c7608s.m17958m();
        f20175d = c7608s.m17964g();
        f20176e = c7608s.m17962i();
        f20177f = c7608s.m17946y();
        f20178g = c7608s.m17954q();
        c7608s.m17950u();
        c7608s.m17966e();
        c7608s.m17948w();
        c7608s.m17961j();
        c7608s.m17952s();
        f20179h = c7608s.m17970a();
        c7608s.m17969b();
        c7608s.m17947x();
        C7594j.f20098a.m18049c();
    }

    /* renamed from: a */
    public static final C7619u m17937a(String str) {
        Intrinsics.isThisObjectNull(str, "name");
        return new C7619u(str, C7618a.f20180w);
    }

    /* renamed from: b */
    public static final void m17936b(InterfaceC7621v interfaceC7621v) {
        Intrinsics.isThisObjectNull(interfaceC7621v, "<this>");
        interfaceC7621v.mo17910b(C7608s.f20138a.m17967d(), C13195u.f34156a);
    }

    /* renamed from: c */
    public static final void m17935c(InterfaceC7621v interfaceC7621v, String str, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC7621v, "<this>");
        interfaceC7621v.mo17910b(C7594j.f20098a.m18047e(), new C7580a(str, interfaceC6097a));
    }

    /* renamed from: d */
    public static /* synthetic */ void m17934d(InterfaceC7621v interfaceC7621v, String str, InterfaceC6097a interfaceC6097a, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m17935c(interfaceC7621v, str, interfaceC6097a);
    }

    /* renamed from: e */
    public static final void m17933e(InterfaceC7621v interfaceC7621v, String str, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC7621v, "<this>");
        interfaceC7621v.mo17910b(C7594j.f20098a.m18045g(), new C7580a(str, interfaceC6108l));
    }

    /* renamed from: f */
    public static /* synthetic */ void m17932f(InterfaceC7621v interfaceC7621v, String str, InterfaceC6108l interfaceC6108l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m17933e(interfaceC7621v, str, interfaceC6108l);
    }

    /* renamed from: g */
    public static final void m17931g(InterfaceC7621v interfaceC7621v, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC7621v, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6108l, "mapping");
        interfaceC7621v.mo17910b(C7608s.f20138a.m17960k(), interfaceC6108l);
    }

    /* renamed from: h */
    public static final void m17930h(InterfaceC7621v interfaceC7621v, String str, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC7621v, "<this>");
        interfaceC7621v.mo17910b(C7594j.f20098a.m18044h(), new C7580a(str, interfaceC6097a));
    }

    /* renamed from: i */
    public static /* synthetic */ void m17929i(InterfaceC7621v interfaceC7621v, String str, InterfaceC6097a interfaceC6097a, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m17930h(interfaceC7621v, str, interfaceC6097a);
    }

    /* renamed from: j */
    public static final void m17928j(InterfaceC7621v interfaceC7621v, String str, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC7621v, "<this>");
        interfaceC7621v.mo17910b(C7594j.f20098a.m18043i(), new C7580a(str, interfaceC6097a));
    }

    /* renamed from: k */
    public static final void m17927k(InterfaceC7621v interfaceC7621v, String str, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC7621v, "<this>");
        interfaceC7621v.mo17910b(C7594j.f20098a.m18041k(), new C7580a(str, interfaceC6112p));
    }

    /* renamed from: l */
    public static /* synthetic */ void m17926l(InterfaceC7621v interfaceC7621v, String str, InterfaceC6112p interfaceC6112p, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m17927k(interfaceC7621v, str, interfaceC6112p);
    }

    /* renamed from: m */
    public static final void m17925m(InterfaceC7621v interfaceC7621v, String str, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC7621v, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6108l, "action");
        interfaceC7621v.mo17910b(C7594j.f20098a.m18040l(), new C7580a(str, interfaceC6108l));
    }

    /* renamed from: n */
    public static /* synthetic */ void m17924n(InterfaceC7621v interfaceC7621v, String str, InterfaceC6108l interfaceC6108l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m17925m(interfaceC7621v, str, interfaceC6108l);
    }

    /* renamed from: o */
    public static final void m17923o(InterfaceC7621v interfaceC7621v, C7581b c7581b) {
        Intrinsics.isThisObjectNull(interfaceC7621v, "<this>");
        Intrinsics.isThisObjectNull(c7581b, "<set-?>");
        f20179h.m17911c(interfaceC7621v, f20172a[13], c7581b);
    }

    /* renamed from: p */
    public static final void m17922p(InterfaceC7621v interfaceC7621v, String str) {
        List m202b;
        Intrinsics.isThisObjectNull(interfaceC7621v, "<this>");
        Intrinsics.isThisObjectNull(str, "value");
        C7619u m17968c = C7608s.f20138a.m17968c();
        m202b = CollectionsJVM.m202b(str);
        interfaceC7621v.mo17910b(m17968c, m202b);
    }

    /* renamed from: q */
    public static final void m17921q(InterfaceC7621v interfaceC7621v, boolean z) {
        Intrinsics.isThisObjectNull(interfaceC7621v, "<this>");
        f20175d.m17911c(interfaceC7621v, f20172a[4], Boolean.valueOf(z));
    }

    /* renamed from: r */
    public static final void m17920r(InterfaceC7621v interfaceC7621v, C7593i c7593i) {
        Intrinsics.isThisObjectNull(interfaceC7621v, "<this>");
        Intrinsics.isThisObjectNull(c7593i, "<set-?>");
        f20176e.m17911c(interfaceC7621v, f20172a[5], c7593i);
    }

    /* renamed from: s */
    public static final void m17919s(InterfaceC7621v interfaceC7621v, int i) {
        Intrinsics.isThisObjectNull(interfaceC7621v, "$this$liveRegion");
        f20174c.m17911c(interfaceC7621v, f20172a[3], C7584e.m18093c(i));
    }

    /* renamed from: t */
    public static final void m17918t(InterfaceC7621v interfaceC7621v, String str) {
        Intrinsics.isThisObjectNull(interfaceC7621v, "<this>");
        Intrinsics.isThisObjectNull(str, "<set-?>");
        f20173b.m17911c(interfaceC7621v, f20172a[2], str);
    }

    /* renamed from: u */
    public static final void m17917u(InterfaceC7621v interfaceC7621v, int i) {
        Intrinsics.isThisObjectNull(interfaceC7621v, "$this$role");
        f20178g.m17911c(interfaceC7621v, f20172a[7], C7591h.m18067g(i));
    }

    /* renamed from: v */
    public static final void m17916v(InterfaceC7621v interfaceC7621v, AnnotatedString annotatedString) {
        List m202b;
        Intrinsics.isThisObjectNull(interfaceC7621v, "<this>");
        Intrinsics.isThisObjectNull(annotatedString, "value");
        C7619u m17949v = C7608s.f20138a.m17949v();
        m202b = CollectionsJVM.m202b(annotatedString);
        interfaceC7621v.mo17910b(m17949v, m202b);
    }

    /* renamed from: w */
    public static final void m17915w(InterfaceC7621v interfaceC7621v, C7593i c7593i) {
        Intrinsics.isThisObjectNull(interfaceC7621v, "<this>");
        Intrinsics.isThisObjectNull(c7593i, "<set-?>");
        f20177f.m17911c(interfaceC7621v, f20172a[6], c7593i);
    }
}
