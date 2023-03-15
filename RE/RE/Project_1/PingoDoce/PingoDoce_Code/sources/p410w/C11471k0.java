package p410w;

import androidx.compose.p018ui.platform.AbstractC0820x0;
import com.google.crypto.tink.shaded.protobuf.Reader;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p127h1.InterfaceC5803r;
import p127h1.InterfaceC5805t;
import p127h1.LayoutModifier;
import p127h1.MeasureScope;
import p127h1.Placeable;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p297pd._Ranges;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;
import p479z1.C13599b;
import p479z1.C13601c;
import p479z1.C13612k;
import p479z1.C13615m;
import p479z1.C13617n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Size.kt */
/* renamed from: w.k0 */
/* loaded from: classes.dex */
public final class C11471k0 extends AbstractC0820x0 implements LayoutModifier {

    /* renamed from: A */
    private final Object f29390A;

    /* renamed from: x */
    private final EnumC11482n f29391x;

    /* renamed from: y */
    private final boolean f29392y;

    /* renamed from: z */
    private final InterfaceC6112p f29393z;

    /* compiled from: Size.kt */
    /* renamed from: w.k0$a */
    /* loaded from: classes.dex */
    static final class C11472a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ MeasureScope f29394A;

        /* renamed from: x */
        final /* synthetic */ int f29396x;

        /* renamed from: y */
        final /* synthetic */ Placeable f29397y;

        /* renamed from: z */
        final /* synthetic */ int f29398z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11472a(int i, Placeable placeable, int i2, MeasureScope measureScope) {
            super(1);
            this.f29396x = i;
            this.f29397y = placeable;
            this.f29398z = i2;
            this.f29394A = measureScope;
        }

        /* renamed from: a */
        public final void m5039a(Placeable.AbstractC5751a abstractC5751a) {
            Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
            Placeable.AbstractC5751a.m23161l(abstractC5751a, this.f29397y, ((C13612k) C11471k0.m5042b(C11471k0.this).mo39856d(C13615m.m829b(C13617n.m819a(this.f29396x - this.f29397y.m23177q0(), this.f29398z - this.f29397y.m23182l0())), this.f29394A.getLayoutDirection())).m835l(), 0.0f, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5039a((Placeable.AbstractC5751a) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11471k0(EnumC11482n enumC11482n, boolean z, InterfaceC6112p interfaceC6112p, Object obj, InterfaceC6108l interfaceC6108l) {
        super(interfaceC6108l);
        Intrinsics.isThisObjectNull(enumC11482n, "direction");
        Intrinsics.isThisObjectNull(interfaceC6112p, "alignmentCallback");
        Intrinsics.isThisObjectNull(obj, "align");
        Intrinsics.isThisObjectNull(interfaceC6108l, "inspectorInfo");
        this.f29391x = enumC11482n;
        this.f29392y = z;
        this.f29393z = interfaceC6112p;
        this.f29390A = obj;
    }

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC6112p m5042b(C11471k0 c11471k0) {
        return c11471k0.f29393z;
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return LayoutModifier.C5802a.m23011a(this, interfaceC6108l);
    }

    /* renamed from: S */
    public InterfaceC5805t m5044S(MeasureScope measureScope, InterfaceC5803r interfaceC5803r, long j) {
        int m14996m;
        int m14996m2;
        Intrinsics.isThisObjectNull(measureScope, "$receiver");
        Intrinsics.isThisObjectNull(interfaceC5803r, "measurable");
        EnumC11482n enumC11482n = this.f29391x;
        EnumC11482n enumC11482n2 = EnumC11482n.Vertical;
        int m914p = enumC11482n != enumC11482n2 ? 0 : C13599b.m914p(j);
        EnumC11482n enumC11482n3 = this.f29391x;
        EnumC11482n enumC11482n4 = EnumC11482n.Horizontal;
        int m915o = enumC11482n3 == enumC11482n4 ? C13599b.m915o(j) : 0;
        EnumC11482n enumC11482n5 = this.f29391x;
        int i = Reader.READ_DONE;
        int m916n = (enumC11482n5 == enumC11482n2 || !this.f29392y) ? C13599b.m916n(j) : Integer.MAX_VALUE;
        if (this.f29391x == enumC11482n4 || !this.f29392y) {
            i = C13599b.m917m(j);
        }
        Placeable mo23007n = interfaceC5803r.mo23007n(C13601c.m907a(m914p, m916n, m915o, i));
        m14996m = _Ranges.m14996m(mo23007n.m23177q0(), C13599b.m914p(j), C13599b.m916n(j));
        m14996m2 = _Ranges.m14996m(mo23007n.m23182l0(), C13599b.m915o(j), C13599b.m917m(j));
        return MeasureScope.C5806a.m22999b(measureScope, m14996m, m14996m2, null, new C11472a(m14996m, mo23007n, m14996m2, measureScope), 4, null);
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return LayoutModifier.C5802a.m23009c(this, obj, interfaceC6112p);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11471k0) {
            C11471k0 c11471k0 = (C11471k0) obj;
            return this.f29391x == c11471k0.f29391x && this.f29392y == c11471k0.f29392y && Intrinsics.equals(this.f29390A, c11471k0.f29390A);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f29391x.hashCode() * 31) + Boolean.hashCode(this.f29392y)) * 31) + this.f29390A.hashCode();
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        return LayoutModifier.C5802a.m23010b(this, obj, interfaceC6112p);
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return LayoutModifier.C5802a.m23008d(this, interfaceC9570f);
    }
}
