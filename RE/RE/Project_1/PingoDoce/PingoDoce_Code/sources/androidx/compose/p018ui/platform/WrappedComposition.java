package androidx.compose.p018ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.p018ui.platform.AndroidComposeView;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.InterfaceC1485s;
import androidx.lifecycle.InterfaceC1491v;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.Set;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p092f0.C5255u0;
import p092f0.CompositionLocal;
import p092f0.Effects;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5216l;
import p181jd.AbstractC6438m;
import p181jd.C6431d0;
import p181jd.Intrinsics;
import p229m0.ComposableLambda;
import p285p0.C8335c;
import p302q0.C9575g;
import p468yc.C13186n;
import p468yc.C13195u;
import td.InterfaceC10524i0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wrapper.android.kt */
/* renamed from: androidx.compose.ui.platform.WrappedComposition */
/* loaded from: classes.dex */
public final class WrappedComposition implements InterfaceC5216l, InterfaceC1485s {

    /* renamed from: A */
    private InterfaceC6112p f2135A;

    /* renamed from: w */
    private final AndroidComposeView f2136w;

    /* renamed from: x */
    private final InterfaceC5216l f2137x;

    /* renamed from: y */
    private boolean f2138y;

    /* renamed from: z */
    private AbstractC1469p f2139z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wrapper.android.kt */
    /* renamed from: androidx.compose.ui.platform.WrappedComposition$a */
    /* loaded from: classes.dex */
    public static final class C0677a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: x */
        final /* synthetic */ InterfaceC6112p f2141x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Wrapper.android.kt */
        /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a */
        /* loaded from: classes.dex */
        public static final class C0678a extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            final /* synthetic */ WrappedComposition f2142w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC6112p f2143x;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Wrapper.android.kt */
            @InterfaceC6759f(m20197c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", m20196f = "Wrapper.android.kt", m20195l = {153}, m20194m = "invokeSuspend")
            /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a$a */
            /* loaded from: classes.dex */
            public static final class C0679a extends AbstractC6764l implements InterfaceC6112p {

                /* renamed from: x */
                int f2144x;

                /* renamed from: y */
                final /* synthetic */ WrappedComposition f2145y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0679a(WrappedComposition wrappedComposition, InterfaceC1886d interfaceC1886d) {
                    super(2, interfaceC1886d);
                    this.f2145y = wrappedComposition;
                }

                public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                    return new C0679a(this.f2145y, interfaceC1886d);
                }

                /* renamed from: d */
                public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                    return ((C0679a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    m34636d = C2116d.m34636d();
                    int i = this.f2144x;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        AndroidComposeView m39855A = this.f2145y.m39855A();
                        this.f2144x = 1;
                        if (m39855A.m39902X(this) == m34636d) {
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

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Wrapper.android.kt */
            @InterfaceC6759f(m20197c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2", m20196f = "Wrapper.android.kt", m20195l = {154}, m20194m = "invokeSuspend")
            /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a$b */
            /* loaded from: classes.dex */
            public static final class C0680b extends AbstractC6764l implements InterfaceC6112p {

                /* renamed from: x */
                int f2146x;

                /* renamed from: y */
                final /* synthetic */ WrappedComposition f2147y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0680b(WrappedComposition wrappedComposition, InterfaceC1886d interfaceC1886d) {
                    super(2, interfaceC1886d);
                    this.f2147y = wrappedComposition;
                }

                public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                    return new C0680b(this.f2147y, interfaceC1886d);
                }

                /* renamed from: d */
                public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                    return ((C0680b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    m34636d = C2116d.m34636d();
                    int i = this.f2146x;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        AndroidComposeView m39855A = this.f2147y.m39855A();
                        this.f2146x = 1;
                        if (m39855A.m39917I(this) == m34636d) {
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

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Wrapper.android.kt */
            /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a$c */
            /* loaded from: classes.dex */
            public static final class C0681c extends AbstractC6438m implements InterfaceC6112p {

                /* renamed from: w */
                final /* synthetic */ WrappedComposition f2148w;

                /* renamed from: x */
                final /* synthetic */ InterfaceC6112p f2149x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0681c(WrappedComposition wrappedComposition, InterfaceC6112p interfaceC6112p) {
                    super(2);
                    this.f2148w = wrappedComposition;
                    this.f2149x = interfaceC6112p;
                }

                /* renamed from: F */
                public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                    m39845a((InterfaceC5179i) obj, ((Number) obj2).intValue());
                    return C13195u.f34156a;
                }

                /* renamed from: a */
                public final void m39845a(InterfaceC5179i interfaceC5179i, int i) {
                    if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                        interfaceC5179i.mo25264f();
                    } else {
                        C0824y.m39477a(this.f2148w.m39855A(), this.f2149x, interfaceC5179i, 8);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0678a(WrappedComposition wrappedComposition, InterfaceC6112p interfaceC6112p) {
                super(2);
                this.f2142w = wrappedComposition;
                this.f2143x = interfaceC6112p;
            }

            /* renamed from: F */
            public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                m39848a((InterfaceC5179i) obj, ((Number) obj2).intValue());
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m39848a(InterfaceC5179i interfaceC5179i, int i) {
                if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                    interfaceC5179i.mo25264f();
                    return;
                }
                AndroidComposeView m39855A = this.f2142w.m39855A();
                int i2 = C9575g.inspection_slot_table_set;
                Object tag = m39855A.getTag(i2);
                Set set = C6431d0.m20944k(tag) ? (Set) tag : null;
                if (set == null) {
                    ViewParent parent = this.f2142w.m39855A().getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view == null ? null : view.getTag(i2);
                    set = C6431d0.m20944k(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    set.add(interfaceC5179i.mo25257m());
                    interfaceC5179i.mo25269a();
                }
                Effects.m25539c(this.f2142w.m39855A(), new C0679a(this.f2142w, null), interfaceC5179i, 8);
                Effects.m25539c(this.f2142w.m39855A(), new C0680b(this.f2142w, null), interfaceC5179i, 8);
                CompositionLocal.m24954a(new C5255u0[]{C8335c.m15778a().m24909c(set)}, ComposableLambda.m19327b(interfaceC5179i, -819888609, true, new C0681c(this.f2142w, this.f2143x)), interfaceC5179i, 56);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0677a(InterfaceC6112p interfaceC6112p) {
            super(1);
            this.f2141x = interfaceC6112p;
        }

        /* renamed from: a */
        public final void m39849a(AndroidComposeView.C0664b c0664b) {
            Intrinsics.isThisObjectNull(c0664b, "it");
            if (WrappedComposition.m39853w(WrappedComposition.this)) {
                return;
            }
            AbstractC1469p mo137b = c0664b.m39873a().mo137b();
            Intrinsics.checkIfNull(mo137b, "it.lifecycleOwner.lifecycle");
            WrappedComposition.m39851y(WrappedComposition.this, this.f2141x);
            if (WrappedComposition.m39854v(WrappedComposition.this) == null) {
                WrappedComposition.m39852x(WrappedComposition.this, mo137b);
                mo137b.mo10402a(WrappedComposition.this);
            } else if (mo137b.mo10401b().isAtLeast(AbstractC1469p.EnumC1472c.CREATED)) {
                WrappedComposition.this.m39850z().mo25006r(ComposableLambda.m19326c(-985537467, true, new C0678a(WrappedComposition.this, this.f2141x)));
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m39849a((AndroidComposeView.C0664b) obj);
            return C13195u.f34156a;
        }
    }

    public WrappedComposition(AndroidComposeView androidComposeView, InterfaceC5216l interfaceC5216l) {
        Intrinsics.isThisObjectNull(androidComposeView, "owner");
        Intrinsics.isThisObjectNull(interfaceC5216l, "original");
        this.f2136w = androidComposeView;
        this.f2137x = interfaceC5216l;
        this.f2135A = C0730k0.f2274a.m39716a();
    }

    /* renamed from: v */
    public static final /* synthetic */ AbstractC1469p m39854v(WrappedComposition wrappedComposition) {
        return wrappedComposition.f2139z;
    }

    /* renamed from: w */
    public static final /* synthetic */ boolean m39853w(WrappedComposition wrappedComposition) {
        return wrappedComposition.f2138y;
    }

    /* renamed from: x */
    public static final /* synthetic */ void m39852x(WrappedComposition wrappedComposition, AbstractC1469p abstractC1469p) {
        wrappedComposition.f2139z = abstractC1469p;
    }

    /* renamed from: y */
    public static final /* synthetic */ void m39851y(WrappedComposition wrappedComposition, InterfaceC6112p interfaceC6112p) {
        wrappedComposition.f2135A = interfaceC6112p;
    }

    /* renamed from: A */
    public final AndroidComposeView m39855A() {
        return this.f2136w;
    }

    /* renamed from: b */
    public void mo25009b() {
        if (!this.f2138y) {
            this.f2138y = true;
            this.f2136w.getView().setTag(C9575g.wrapped_composition_tag, null);
            AbstractC1469p abstractC1469p = this.f2139z;
            if (abstractC1469p != null) {
                abstractC1469p.mo10400c(this);
            }
        }
        this.f2137x.mo25009b();
    }

    /* renamed from: m */
    public boolean mo25008m() {
        return this.f2137x.mo25008m();
    }

    /* renamed from: n */
    public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
        Intrinsics.isThisObjectNull(interfaceC1491v, "source");
        Intrinsics.isThisObjectNull(enumC1471b, "event");
        if (enumC1471b == AbstractC1469p.EnumC1471b.ON_DESTROY) {
            mo25009b();
        } else if (enumC1471b != AbstractC1469p.EnumC1471b.ON_CREATE || this.f2138y) {
        } else {
            mo25006r(this.f2135A);
        }
    }

    /* renamed from: q */
    public boolean mo25007q() {
        return this.f2137x.mo25007q();
    }

    /* renamed from: r */
    public void mo25006r(InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "content");
        this.f2136w.setOnViewTreeOwnersAvailable(new C0677a(interfaceC6112p));
    }

    /* renamed from: z */
    public final InterfaceC5216l m39850z() {
        return this.f2137x;
    }
}
