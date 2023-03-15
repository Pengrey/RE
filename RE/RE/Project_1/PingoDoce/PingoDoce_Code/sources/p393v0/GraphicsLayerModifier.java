package p393v0;

import androidx.compose.p018ui.platform.AbstractC0820x0;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* renamed from: v0.c1 */
/* loaded from: classes.dex */
public final class GraphicsLayerModifier extends AbstractC0820x0 implements LayoutModifier {

    /* renamed from: A */
    private final float f28319A;

    /* renamed from: B */
    private final float f28320B;

    /* renamed from: C */
    private final float f28321C;

    /* renamed from: D */
    private final float f28322D;

    /* renamed from: E */
    private final float f28323E;

    /* renamed from: F */
    private final float f28324F;

    /* renamed from: G */
    private final float f28325G;

    /* renamed from: H */
    private final long f28326H;

    /* renamed from: I */
    private final InterfaceC11001b1 f28327I;

    /* renamed from: J */
    private final boolean f28328J;

    /* renamed from: K */
    private final AbstractC11073x0 f28329K;

    /* renamed from: L */
    private final InterfaceC6108l f28330L;

    /* renamed from: x */
    private final float f28331x;

    /* renamed from: y */
    private final float f28332y;

    /* renamed from: z */
    private final float f28333z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GraphicsLayerModifier.kt */
    /* renamed from: v0.c1$a */
    /* loaded from: classes.dex */
    public static final class C11004a extends AbstractC6438m implements InterfaceC6108l {
        C11004a() {
            super(1);
        }

        /* renamed from: a */
        public final void m6566a(GraphicsLayerScope graphicsLayerScope) {
            Intrinsics.isThisObjectNull(graphicsLayerScope, "$this$null");
            graphicsLayerScope.m6503g(GraphicsLayerModifier.m6575j(GraphicsLayerModifier.this));
            graphicsLayerScope.m6500j(GraphicsLayerModifier.m6574l(GraphicsLayerModifier.this));
            graphicsLayerScope.m6507c(GraphicsLayerModifier.m6583b(GraphicsLayerModifier.this));
            graphicsLayerScope.m6501i(GraphicsLayerModifier.m6568v(GraphicsLayerModifier.this));
            graphicsLayerScope.m6504f(GraphicsLayerModifier.m6567w(GraphicsLayerModifier.this));
            graphicsLayerScope.m6497v(GraphicsLayerModifier.m6573m(GraphicsLayerModifier.this));
            graphicsLayerScope.m6498m(GraphicsLayerModifier.m6578g(GraphicsLayerModifier.this));
            graphicsLayerScope.m6506d(GraphicsLayerModifier.m6577h(GraphicsLayerModifier.this));
            graphicsLayerScope.m6505e(GraphicsLayerModifier.m6576i(GraphicsLayerModifier.this));
            graphicsLayerScope.m6499l(GraphicsLayerModifier.m6582c(GraphicsLayerModifier.this));
            graphicsLayerScope.m6508P(GraphicsLayerModifier.m6570s(GraphicsLayerModifier.this));
            graphicsLayerScope.m6496z(GraphicsLayerModifier.m6571r(GraphicsLayerModifier.this));
            graphicsLayerScope.m6509L(GraphicsLayerModifier.m6581d(GraphicsLayerModifier.this));
            graphicsLayerScope.m6502h(GraphicsLayerModifier.m6579f(GraphicsLayerModifier.this));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m6566a((GraphicsLayerScope) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: GraphicsLayerModifier.kt */
    /* renamed from: v0.c1$b */
    /* loaded from: classes.dex */
    static final class C11005b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ Placeable f28335w;

        /* renamed from: x */
        final /* synthetic */ GraphicsLayerModifier f28336x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11005b(Placeable placeable, GraphicsLayerModifier graphicsLayerModifier) {
            super(1);
            this.f28335w = placeable;
            this.f28336x = graphicsLayerModifier;
        }

        /* renamed from: a */
        public final void m6565a(Placeable.AbstractC5751a abstractC5751a) {
            Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
            Placeable.AbstractC5751a.m23151v(abstractC5751a, this.f28335w, 0, 0, 0.0f, GraphicsLayerModifier.m6580e(this.f28336x), 4, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m6565a((Placeable.AbstractC5751a) obj);
            return C13195u.f34156a;
        }
    }

    private GraphicsLayerModifier(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC11001b1 interfaceC11001b1, boolean z, AbstractC11073x0 abstractC11073x0, InterfaceC6108l interfaceC6108l) {
        super(interfaceC6108l);
        this.f28331x = f;
        this.f28332y = f2;
        this.f28333z = f3;
        this.f28319A = f4;
        this.f28320B = f5;
        this.f28321C = f6;
        this.f28322D = f7;
        this.f28323E = f8;
        this.f28324F = f9;
        this.f28325G = f10;
        this.f28326H = j;
        this.f28327I = interfaceC11001b1;
        this.f28328J = z;
        this.f28330L = new C11004a();
    }

    public /* synthetic */ GraphicsLayerModifier(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC11001b1 interfaceC11001b1, boolean z, AbstractC11073x0 abstractC11073x0, InterfaceC6108l interfaceC6108l, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, interfaceC11001b1, z, abstractC11073x0, interfaceC6108l);
    }

    /* renamed from: b */
    public static final /* synthetic */ float m6583b(GraphicsLayerModifier graphicsLayerModifier) {
        return graphicsLayerModifier.f28333z;
    }

    /* renamed from: c */
    public static final /* synthetic */ float m6582c(GraphicsLayerModifier graphicsLayerModifier) {
        return graphicsLayerModifier.f28325G;
    }

    /* renamed from: d */
    public static final /* synthetic */ boolean m6581d(GraphicsLayerModifier graphicsLayerModifier) {
        return graphicsLayerModifier.f28328J;
    }

    /* renamed from: e */
    public static final /* synthetic */ InterfaceC6108l m6580e(GraphicsLayerModifier graphicsLayerModifier) {
        return graphicsLayerModifier.f28330L;
    }

    /* renamed from: f */
    public static final /* synthetic */ AbstractC11073x0 m6579f(GraphicsLayerModifier graphicsLayerModifier) {
        return graphicsLayerModifier.f28329K;
    }

    /* renamed from: g */
    public static final /* synthetic */ float m6578g(GraphicsLayerModifier graphicsLayerModifier) {
        return graphicsLayerModifier.f28322D;
    }

    /* renamed from: h */
    public static final /* synthetic */ float m6577h(GraphicsLayerModifier graphicsLayerModifier) {
        return graphicsLayerModifier.f28323E;
    }

    /* renamed from: i */
    public static final /* synthetic */ float m6576i(GraphicsLayerModifier graphicsLayerModifier) {
        return graphicsLayerModifier.f28324F;
    }

    /* renamed from: j */
    public static final /* synthetic */ float m6575j(GraphicsLayerModifier graphicsLayerModifier) {
        return graphicsLayerModifier.f28331x;
    }

    /* renamed from: l */
    public static final /* synthetic */ float m6574l(GraphicsLayerModifier graphicsLayerModifier) {
        return graphicsLayerModifier.f28332y;
    }

    /* renamed from: m */
    public static final /* synthetic */ float m6573m(GraphicsLayerModifier graphicsLayerModifier) {
        return graphicsLayerModifier.f28321C;
    }

    /* renamed from: r */
    public static final /* synthetic */ InterfaceC11001b1 m6571r(GraphicsLayerModifier graphicsLayerModifier) {
        return graphicsLayerModifier.f28327I;
    }

    /* renamed from: s */
    public static final /* synthetic */ long m6570s(GraphicsLayerModifier graphicsLayerModifier) {
        return graphicsLayerModifier.f28326H;
    }

    /* renamed from: v */
    public static final /* synthetic */ float m6568v(GraphicsLayerModifier graphicsLayerModifier) {
        return graphicsLayerModifier.f28319A;
    }

    /* renamed from: w */
    public static final /* synthetic */ float m6567w(GraphicsLayerModifier graphicsLayerModifier) {
        return graphicsLayerModifier.f28320B;
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return LayoutModifier.C5802a.m23011a(this, interfaceC6108l);
    }

    /* renamed from: S */
    public InterfaceC5805t m6585S(MeasureScope measureScope, InterfaceC5803r interfaceC5803r, long j) {
        Intrinsics.isThisObjectNull(measureScope, "$receiver");
        Intrinsics.isThisObjectNull(interfaceC5803r, "measurable");
        Placeable mo23007n = interfaceC5803r.mo23007n(j);
        return MeasureScope.C5806a.m22999b(measureScope, mo23007n.m23177q0(), mo23007n.m23182l0(), null, new C11005b(mo23007n, this), 4, null);
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return LayoutModifier.C5802a.m23009c(this, obj, interfaceC6112p);
    }

    public boolean equals(Object obj) {
        GraphicsLayerModifier graphicsLayerModifier = obj instanceof GraphicsLayerModifier ? (GraphicsLayerModifier) obj : null;
        if (graphicsLayerModifier == null) {
            return false;
        }
        if (this.f28331x == graphicsLayerModifier.f28331x) {
            if (this.f28332y == graphicsLayerModifier.f28332y) {
                if (this.f28333z == graphicsLayerModifier.f28333z) {
                    if (this.f28319A == graphicsLayerModifier.f28319A) {
                        if (this.f28320B == graphicsLayerModifier.f28320B) {
                            if (this.f28321C == graphicsLayerModifier.f28321C) {
                                if (this.f28322D == graphicsLayerModifier.f28322D) {
                                    if (this.f28323E == graphicsLayerModifier.f28323E) {
                                        if (this.f28324F == graphicsLayerModifier.f28324F) {
                                            return ((this.f28325G > graphicsLayerModifier.f28325G ? 1 : (this.f28325G == graphicsLayerModifier.f28325G ? 0 : -1)) == 0) && C11022g1.m6486e(this.f28326H, graphicsLayerModifier.f28326H) && Intrinsics.equals(this.f28327I, graphicsLayerModifier.f28327I) && this.f28328J == graphicsLayerModifier.f28328J && Intrinsics.equals(this.f28329K, graphicsLayerModifier.f28329K);
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Float.hashCode(this.f28331x) * 31) + Float.hashCode(this.f28332y)) * 31) + Float.hashCode(this.f28333z)) * 31) + Float.hashCode(this.f28319A)) * 31) + Float.hashCode(this.f28320B)) * 31) + Float.hashCode(this.f28321C)) * 31) + Float.hashCode(this.f28322D)) * 31) + Float.hashCode(this.f28323E)) * 31) + Float.hashCode(this.f28324F)) * 31) + Float.hashCode(this.f28325G)) * 31) + C11022g1.m6483h(this.f28326H)) * 31) + this.f28327I.hashCode()) * 31) + Boolean.hashCode(this.f28328J)) * 31) + 0;
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        return LayoutModifier.C5802a.m23010b(this, obj, interfaceC6112p);
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.f28331x + ", scaleY=" + this.f28332y + ", alpha = " + this.f28333z + ", translationX=" + this.f28319A + ", translationY=" + this.f28320B + ", shadowElevation=" + this.f28321C + ", rotationX=" + this.f28322D + ", rotationY=" + this.f28323E + ", rotationZ=" + this.f28324F + ", cameraDistance=" + this.f28325G + ", transformOrigin=" + ((Object) C11022g1.m6482i(this.f28326H)) + ", shape=" + this.f28327I + ", clip=" + this.f28328J + ", renderEffect=" + this.f28329K + ')';
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return LayoutModifier.C5802a.m23008d(this, interfaceC9570f);
    }
}
