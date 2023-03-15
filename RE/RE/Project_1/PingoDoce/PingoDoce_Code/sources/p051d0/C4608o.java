package p051d0;

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
import p260o0.C7982r;
import p345s.Animatable;
import p345s.C9983s0;
import p373u0.C10774f;
import p392v.C10976d;
import p392v.C10980g;
import p392v.C10988p;
import p392v.C10989q;
import p392v.FocusInteraction;
import p392v.HoverInteraction;
import p392v.InterfaceC10984j;
import p392v.InterfaceC10985k;
import p392v.PressInteraction;
import p468yc.C13186n;
import p468yc.C13195u;
import p479z1.C13605g;
import p489zc.C13777q;
import td.InterfaceC10524i0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Button.kt */
/* renamed from: d0.o */
/* loaded from: classes.dex */
public final class C4608o implements InterfaceC4549e {

    /* renamed from: a */
    private final float f12509a;

    /* renamed from: b */
    private final float f12510b;

    /* renamed from: c */
    private final float f12511c;

    /* renamed from: d */
    private final float f12512d;

    /* renamed from: e */
    private final float f12513e;

    /* compiled from: Button.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.material.DefaultButtonElevation$elevation$1", m20196f = "Button.kt", m20195l = {617}, m20194m = "invokeSuspend")
    /* renamed from: d0.o$a */
    /* loaded from: classes.dex */
    static final class C4609a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f12514x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC10985k f12515y;

        /* renamed from: z */
        final /* synthetic */ C7982r f12516z;

        /* compiled from: Collect.kt */
        /* renamed from: d0.o$a$a */
        /* loaded from: classes.dex */
        public static final class C4610a implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ C7982r f12517w;

            public C4610a(C7982r c7982r) {
                this.f12517w = c7982r;
            }

            /* renamed from: a */
            public Object mo4529a(Object obj, InterfaceC1886d interfaceC1886d) {
                InterfaceC10984j interfaceC10984j = (InterfaceC10984j) obj;
                if (interfaceC10984j instanceof C10980g) {
                    this.f12517w.add(interfaceC10984j);
                } else if (interfaceC10984j instanceof HoverInteraction) {
                    this.f12517w.remove(((HoverInteraction) interfaceC10984j).m6677a());
                } else if (interfaceC10984j instanceof C10976d) {
                    this.f12517w.add(interfaceC10984j);
                } else if (interfaceC10984j instanceof FocusInteraction) {
                    this.f12517w.remove(((FocusInteraction) interfaceC10984j).m6680a());
                } else if (interfaceC10984j instanceof C10988p) {
                    this.f12517w.add(interfaceC10984j);
                } else if (interfaceC10984j instanceof C10989q) {
                    this.f12517w.remove(((C10989q) interfaceC10984j).m6664a());
                } else if (interfaceC10984j instanceof PressInteraction) {
                    this.f12517w.remove(((PressInteraction) interfaceC10984j).m6666a());
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4609a(InterfaceC10985k interfaceC10985k, C7982r c7982r, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f12515y = interfaceC10985k;
            this.f12516z = c7982r;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C4609a(this.f12515y, this.f12516z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4609a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f12514x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC6785c<InterfaceC10984j> mo6674c = this.f12515y.mo6674c();
                C4610a c4610a = new C4610a(this.f12516z);
                this.f12514x = 1;
                if (mo6674c.mo20086d(c4610a, this) == m34636d) {
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

    /* compiled from: Button.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.material.DefaultButtonElevation$elevation$2", m20196f = "Button.kt", m20195l = {552}, m20194m = "invokeSuspend")
    /* renamed from: d0.o$b */
    /* loaded from: classes.dex */
    static final class C4611b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f12518x;

        /* renamed from: y */
        final /* synthetic */ Animatable f12519y;

        /* renamed from: z */
        final /* synthetic */ float f12520z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4611b(Animatable animatable, float f, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f12519y = animatable;
            this.f12520z = f;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C4611b(this.f12519y, this.f12520z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4611b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f12518x;
            if (i == 0) {
                C13186n.m1453b(obj);
                Animatable animatable = this.f12519y;
                C13605g m878d = C13605g.m878d(this.f12520z);
                this.f12518x = 1;
                if (animatable.m9637v(m878d, this) == m34636d) {
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

    /* compiled from: Button.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.material.DefaultButtonElevation$elevation$3", m20196f = "Button.kt", m20195l = {562}, m20194m = "invokeSuspend")
    /* renamed from: d0.o$c */
    /* loaded from: classes.dex */
    static final class C4612c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ float f12521A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC10984j f12522B;

        /* renamed from: x */
        int f12523x;

        /* renamed from: y */
        final /* synthetic */ Animatable f12524y;

        /* renamed from: z */
        final /* synthetic */ C4608o f12525z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4612c(Animatable animatable, C4608o c4608o, float f, InterfaceC10984j interfaceC10984j, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f12524y = animatable;
            this.f12525z = c4608o;
            this.f12521A = f;
            this.f12522B = interfaceC10984j;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C4612c(this.f12524y, this.f12525z, this.f12521A, this.f12522B, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4612c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f12523x;
            if (i == 0) {
                C13186n.m1453b(obj);
                float m870l = ((C13605g) this.f12524y.m9646m()).m870l();
                InterfaceC10984j interfaceC10984j = null;
                if (C13605g.m873i(m870l, C4608o.m27087d(this.f12525z))) {
                    interfaceC10984j = new C10988p(C10774f.f27866b.m7134c(), null);
                } else if (C13605g.m873i(m870l, C4608o.m27088c(this.f12525z))) {
                    interfaceC10984j = new C10980g();
                } else if (C13605g.m873i(m870l, C4608o.m27089b(this.f12525z))) {
                    interfaceC10984j = new C10976d();
                }
                Animatable animatable = this.f12524y;
                float f = this.f12521A;
                InterfaceC10984j interfaceC10984j2 = this.f12522B;
                this.f12523x = 1;
                if (C4660w.m27008d(animatable, f, interfaceC10984j, interfaceC10984j2, this) == m34636d) {
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

    private C4608o(float f, float f2, float f3, float f4, float f5) {
        this.f12509a = f;
        this.f12510b = f2;
        this.f12511c = f3;
        this.f12512d = f4;
        this.f12513e = f5;
    }

    public /* synthetic */ C4608o(float f, float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5);
    }

    /* renamed from: b */
    public static final /* synthetic */ float m27089b(C4608o c4608o) {
        return c4608o.f12513e;
    }

    /* renamed from: c */
    public static final /* synthetic */ float m27088c(C4608o c4608o) {
        return c4608o.f12512d;
    }

    /* renamed from: d */
    public static final /* synthetic */ float m27087d(C4608o c4608o) {
        return c4608o.f12510b;
    }

    /* renamed from: a */
    public InterfaceC5242r1 mo27240a(boolean z, InterfaceC10985k interfaceC10985k, InterfaceC5179i interfaceC5179i, int i) {
        float f;
        Intrinsics.isThisObjectNull(interfaceC10985k, "interactionSource");
        interfaceC5179i.mo25263g(-1598809227);
        interfaceC5179i.mo25263g(-3687241);
        Object mo25262h = interfaceC5179i.mo25262h();
        InterfaceC5179i.C5180a c5180a = InterfaceC5179i.f14328a;
        if (mo25262h == c5180a.m25243a()) {
            mo25262h = C5209j1.m25075c();
            interfaceC5179i.mo25247w(mo25262h);
        }
        interfaceC5179i.mo25282C();
        C7982r c7982r = (C7982r) mo25262h;
        Effects.m25539c(interfaceC10985k, new C4609a(interfaceC10985k, c7982r, null), interfaceC5179i, (i >> 3) & 14);
        InterfaceC10984j interfaceC10984j = (InterfaceC10984j) C13777q.m248X(c7982r);
        if (!z) {
            f = this.f12511c;
        } else if (interfaceC10984j instanceof C10988p) {
            f = this.f12510b;
        } else if (interfaceC10984j instanceof C10980g) {
            f = this.f12512d;
        } else {
            f = interfaceC10984j instanceof C10976d ? this.f12513e : this.f12509a;
        }
        float f2 = f;
        interfaceC5179i.mo25263g(-3687241);
        Object mo25262h2 = interfaceC5179i.mo25262h();
        if (mo25262h2 == c5180a.m25243a()) {
            mo25262h2 = new Animatable(C13605g.m878d(f2), C9983s0.m9450g(C13605g.f34597x), null, 4, null);
            interfaceC5179i.mo25247w(mo25262h2);
        }
        interfaceC5179i.mo25282C();
        Animatable animatable = (Animatable) mo25262h2;
        if (!z) {
            interfaceC5179i.mo25263g(-1598807427);
            Effects.m25539c(C13605g.m878d(f2), new C4611b(animatable, f2, null), interfaceC5179i, 0);
            interfaceC5179i.mo25282C();
        } else {
            interfaceC5179i.mo25263g(-1598807256);
            Effects.m25539c(C13605g.m878d(f2), new C4612c(animatable, this, f2, interfaceC10984j, null), interfaceC5179i, 0);
            interfaceC5179i.mo25282C();
        }
        InterfaceC5242r1 m9652g = animatable.m9652g();
        interfaceC5179i.mo25282C();
        return m9652g;
    }
}
