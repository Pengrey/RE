package p071e0;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import p092f0.C5209j1;
import p092f0.Effects;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5242r1;
import p181jd.Intrinsics;
import p357t.InterfaceC10307k;
import p357t.InterfaceC10308l;
import p392v.C10988p;
import p392v.C10989q;
import p392v.InterfaceC10984j;
import p392v.InterfaceC10985k;
import p392v.PressInteraction;
import p393v0.Color;
import p468yc.C13186n;
import p468yc.C13195u;
import p479z1.C13605g;
import td.InterfaceC10524i0;

/* renamed from: e0.e */
/* loaded from: classes.dex */
public abstract class Ripple implements InterfaceC10307k {

    /* renamed from: a */
    private final boolean f13642a;

    /* renamed from: b */
    private final float f13643b;

    /* renamed from: c */
    private final InterfaceC5242r1 f13644c;

    /* compiled from: Ripple.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", m20196f = "Ripple.kt", m20195l = {356}, m20194m = "invokeSuspend")
    /* renamed from: e0.e$a */
    /* loaded from: classes.dex */
    static final class C4912a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ AbstractC4928m f13645A;

        /* renamed from: x */
        int f13646x;

        /* renamed from: y */
        private /* synthetic */ Object f13647y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC10985k f13648z;

        /* compiled from: Collect.kt */
        /* renamed from: e0.e$a$a */
        /* loaded from: classes.dex */
        public static final class C4913a implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ AbstractC4928m f13649w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC10524i0 f13650x;

            public C4913a(AbstractC4928m abstractC4928m, InterfaceC10524i0 interfaceC10524i0) {
                this.f13649w = abstractC4928m;
                this.f13650x = interfaceC10524i0;
            }

            /* renamed from: a */
            public Object mo4529a(Object obj, InterfaceC1886d interfaceC1886d) {
                InterfaceC10984j interfaceC10984j = (InterfaceC10984j) obj;
                if (interfaceC10984j instanceof C10988p) {
                    this.f13649w.m26262d((C10988p) interfaceC10984j, this.f13650x);
                } else if (interfaceC10984j instanceof C10989q) {
                    this.f13649w.m26260g(((C10989q) interfaceC10984j).m6664a());
                } else if (interfaceC10984j instanceof PressInteraction) {
                    this.f13649w.m26260g(((PressInteraction) interfaceC10984j).m6666a());
                } else {
                    this.f13649w.m26259h(interfaceC10984j, this.f13650x);
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4912a(InterfaceC10985k interfaceC10985k, AbstractC4928m abstractC4928m, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f13648z = interfaceC10985k;
            this.f13645A = abstractC4928m;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C4912a c4912a = new C4912a(this.f13648z, this.f13645A, interfaceC1886d);
            c4912a.f13647y = obj;
            return c4912a;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4912a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f13646x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC6785c<InterfaceC10984j> mo6674c = this.f13648z.mo6674c();
                C4913a c4913a = new C4913a(this.f13645A, (InterfaceC10524i0) this.f13647y);
                this.f13646x = 1;
                if (mo6674c.mo20086d(c4913a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    private Ripple(boolean z, float f, InterfaceC5242r1 interfaceC5242r1) {
        this.f13642a = z;
        this.f13643b = f;
        this.f13644c = interfaceC5242r1;
    }

    public /* synthetic */ Ripple(boolean z, float f, InterfaceC5242r1 interfaceC5242r1, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, interfaceC5242r1);
    }

    /* renamed from: a */
    public final InterfaceC10308l mo8304a(InterfaceC10985k interfaceC10985k, InterfaceC5179i interfaceC5179i, int i) {
        long mo26253a;
        Intrinsics.isThisObjectNull(interfaceC10985k, "interactionSource");
        interfaceC5179i.mo25263g(-1524341239);
        InterfaceC4930o interfaceC4930o = (InterfaceC4930o) interfaceC5179i.mo25256n(C4932p.m26246d());
        interfaceC5179i.mo25263g(-1524341038);
        if (((Color) this.f13644c.getValue()).m6638v() != Color.f28297b.m6632f()) {
            mo26253a = ((Color) this.f13644c.getValue()).m6638v();
        } else {
            mo26253a = interfaceC4930o.mo26253a(interfaceC5179i, 0);
        }
        interfaceC5179i.mo25282C();
        AbstractC4928m m26300b = m26300b(interfaceC10985k, this.f13642a, this.f13643b, C5209j1.m25067k(Color.m6652h(mo26253a), interfaceC5179i, 0), C5209j1.m25067k(interfaceC4930o.mo26252b(interfaceC5179i, 0), interfaceC5179i, 0), interfaceC5179i, (i & 14) | (458752 & (i << 12)));
        Effects.m25538d(m26300b, interfaceC10985k, new C4912a(interfaceC10985k, m26300b, null), interfaceC5179i, ((i << 3) & 112) | 8);
        interfaceC5179i.mo25282C();
        return m26300b;
    }

    /* renamed from: b */
    public abstract AbstractC4928m m26300b(InterfaceC10985k interfaceC10985k, boolean z, float f, InterfaceC5242r1 interfaceC5242r1, InterfaceC5242r1 interfaceC5242r12, InterfaceC5179i interfaceC5179i, int i);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Ripple) {
            Ripple ripple = (Ripple) obj;
            return this.f13642a == ripple.f13642a && C13605g.m873i(this.f13643b, ripple.f13643b) && Intrinsics.equals(this.f13644c, ripple.f13644c);
        }
        return false;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f13642a) * 31) + C13605g.m872j(this.f13643b)) * 31) + this.f13644c.hashCode();
    }
}
