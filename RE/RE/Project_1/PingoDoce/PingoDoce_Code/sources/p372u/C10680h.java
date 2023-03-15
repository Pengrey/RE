package p372u;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p092f0.C5232o1;
import p092f0.InterfaceC5220m0;
import p181jd.Intrinsics;
import p357t.EnumC10314o;
import p357t.MutatorMutex;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10531j0;
import td.InterfaceC10524i0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScrollableState.kt */
/* renamed from: u.h */
/* loaded from: classes.dex */
public final class C10680h implements InterfaceC10675f0 {

    /* renamed from: a */
    private final InterfaceC6108l f27523a;

    /* renamed from: b */
    private final InterfaceC10653c0 f27524b;

    /* renamed from: c */
    private final MutatorMutex f27525c;

    /* renamed from: d */
    private final InterfaceC5220m0 f27526d;

    /* compiled from: ScrollableState.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", m20196f = "ScrollableState.kt", m20195l = {145}, m20194m = "invokeSuspend")
    /* renamed from: u.h$a */
    /* loaded from: classes.dex */
    static final class C10681a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ InterfaceC6112p f27527A;

        /* renamed from: x */
        int f27528x;

        /* renamed from: z */
        final /* synthetic */ EnumC10314o f27530z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ScrollableState.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", m20196f = "ScrollableState.kt", m20195l = {148}, m20194m = "invokeSuspend")
        /* renamed from: u.h$a$a */
        /* loaded from: classes.dex */
        public static final class C10682a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: A */
            final /* synthetic */ InterfaceC6112p f27531A;

            /* renamed from: x */
            int f27532x;

            /* renamed from: y */
            private /* synthetic */ Object f27533y;

            /* renamed from: z */
            final /* synthetic */ C10680h f27534z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10682a(C10680h c10680h, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f27534z = c10680h;
                this.f27531A = interfaceC6112p;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                C10682a c10682a = new C10682a(this.f27534z, this.f27531A, interfaceC1886d);
                c10682a.f27533y = obj;
                return c10682a;
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10653c0 interfaceC10653c0, InterfaceC1886d interfaceC1886d) {
                return ((C10682a) create(interfaceC10653c0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f27532x;
                try {
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        InterfaceC10653c0 interfaceC10653c0 = (InterfaceC10653c0) this.f27533y;
                        C10680h.m7337f(this.f27534z).setValue(C6755b.m20201a(true));
                        InterfaceC6112p interfaceC6112p = this.f27531A;
                        this.f27532x = 1;
                        if (interfaceC6112p.mo39856d(interfaceC10653c0, this) == m34636d) {
                            return m34636d;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C13186n.m1453b(obj);
                    }
                    C10680h.m7337f(this.f27534z).setValue(C6755b.m20201a(false));
                    return C13195u.f34156a;
                } catch (Throwable th2) {
                    C10680h.m7337f(this.f27534z).setValue(C6755b.m20201a(false));
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10681a(EnumC10314o enumC10314o, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f27530z = enumC10314o;
            this.f27527A = interfaceC6112p;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C10681a(this.f27530z, this.f27527A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C10681a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f27528x;
            if (i == 0) {
                C13186n.m1453b(obj);
                MutatorMutex m7339d = C10680h.m7339d(C10680h.this);
                InterfaceC10653c0 m7338e = C10680h.m7338e(C10680h.this);
                EnumC10314o enumC10314o = this.f27530z;
                C10682a c10682a = new C10682a(C10680h.this, this.f27527A, null);
                this.f27528x = 1;
                if (m7339d.m8293d(m7338e, enumC10314o, c10682a, this) == m34636d) {
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

    /* compiled from: ScrollableState.kt */
    /* renamed from: u.h$b */
    /* loaded from: classes.dex */
    public static final class C10683b implements InterfaceC10653c0 {
        C10683b() {
        }

        /* renamed from: a */
        public float mo7395a(float f) {
            return ((Number) C10680h.this.m7336g().mo9587d(Float.valueOf(f))).floatValue();
        }
    }

    public C10680h(InterfaceC6108l interfaceC6108l) {
        InterfaceC5220m0 m24962d;
        Intrinsics.isThisObjectNull(interfaceC6108l, "onDelta");
        this.f27523a = interfaceC6108l;
        this.f27524b = new C10683b();
        this.f27525c = new MutatorMutex();
        m24962d = C5232o1.m24962d(Boolean.FALSE, null, 2, null);
        this.f27526d = m24962d;
    }

    /* renamed from: d */
    public static final /* synthetic */ MutatorMutex m7339d(C10680h c10680h) {
        return c10680h.f27525c;
    }

    /* renamed from: e */
    public static final /* synthetic */ InterfaceC10653c0 m7338e(C10680h c10680h) {
        return c10680h.f27524b;
    }

    /* renamed from: f */
    public static final /* synthetic */ InterfaceC5220m0 m7337f(C10680h c10680h) {
        return c10680h.f27526d;
    }

    /* renamed from: a */
    public boolean mo7348a() {
        return ((Boolean) this.f27526d.getValue()).booleanValue();
    }

    /* renamed from: b */
    public Object mo7347b(EnumC10314o enumC10314o, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m7768d = C10531j0.m7768d(new C10681a(enumC10314o, interfaceC6112p, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m7768d == m34636d ? m7768d : C13195u.f34156a;
    }

    /* renamed from: c */
    public float mo7346c(float f) {
        return ((Number) this.f27523a.mo9587d(Float.valueOf(f))).floatValue();
    }

    /* renamed from: g */
    public final InterfaceC6108l m7336g() {
        return this.f27523a;
    }
}
