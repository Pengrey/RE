package p393v0;

import androidx.compose.p018ui.platform.AbstractC0820x0;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p127h1.InterfaceC5803r;
import p127h1.InterfaceC5805t;
import p127h1.LayoutModifier;
import p127h1.MeasureScope;
import p127h1.Placeable;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GraphicsLayerModifier.kt */
/* renamed from: v0.r */
/* loaded from: classes.dex */
public final class C11054r extends AbstractC0820x0 implements LayoutModifier {

    /* renamed from: x */
    private final InterfaceC6108l f28435x;

    /* compiled from: GraphicsLayerModifier.kt */
    /* renamed from: v0.r$a */
    /* loaded from: classes.dex */
    static final class C11055a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ Placeable f28436w;

        /* renamed from: x */
        final /* synthetic */ C11054r f28437x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11055a(Placeable placeable, C11054r c11054r) {
            super(1);
            this.f28436w = placeable;
            this.f28437x = c11054r;
        }

        /* renamed from: a */
        public final void m6294a(Placeable.AbstractC5751a abstractC5751a) {
            Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
            Placeable.AbstractC5751a.m23151v(abstractC5751a, this.f28436w, 0, 0, 0.0f, C11054r.m6297b(this.f28437x), 4, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m6294a((Placeable.AbstractC5751a) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11054r(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
        super(interfaceC6108l2);
        Intrinsics.isThisObjectNull(interfaceC6108l, "layerBlock");
        Intrinsics.isThisObjectNull(interfaceC6108l2, "inspectorInfo");
        this.f28435x = interfaceC6108l;
    }

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC6108l m6297b(C11054r c11054r) {
        return c11054r.f28435x;
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return LayoutModifier.C5802a.m23011a(this, interfaceC6108l);
    }

    /* renamed from: S */
    public InterfaceC5805t m6299S(MeasureScope measureScope, InterfaceC5803r interfaceC5803r, long j) {
        Intrinsics.isThisObjectNull(measureScope, "$receiver");
        Intrinsics.isThisObjectNull(interfaceC5803r, "measurable");
        Placeable mo23007n = interfaceC5803r.mo23007n(j);
        return MeasureScope.C5806a.m22999b(measureScope, mo23007n.m23177q0(), mo23007n.m23182l0(), null, new C11055a(mo23007n, this), 4, null);
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return LayoutModifier.C5802a.m23009c(this, obj, interfaceC6112p);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11054r) {
            return Intrinsics.equals(this.f28435x, ((C11054r) obj).f28435x);
        }
        return false;
    }

    public int hashCode() {
        return this.f28435x.hashCode();
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        return LayoutModifier.C5802a.m23010b(this, obj, interfaceC6112p);
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f28435x + ')';
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return LayoutModifier.C5802a.m23008d(this, interfaceC9570f);
    }
}
