package p455y;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.constraintlayout.widget.C0868i;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p092f0.InterfaceC5242r1;
import p181jd.AbstractC6438m;
import p181jd.C6435i;
import p181jd.Intrinsics;
import p245n1.C7581b;
import p245n1.C7593i;
import p245n1.C7600o;
import p245n1.C7617t;
import p245n1.InterfaceC7621v;
import p302q0.InterfaceC9570f;
import p372u.C10648b0;
import p468yc.C13186n;
import p468yc.C13195u;
import td.InterfaceC10524i0;

/* renamed from: y.w */
/* loaded from: classes.dex */
public final class LazySemantics {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazySemantics.kt */
    /* renamed from: y.w$a */
    /* loaded from: classes.dex */
    public static final class C13045a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ InterfaceC10524i0 f33921A;

        /* renamed from: w */
        final /* synthetic */ boolean f33922w;

        /* renamed from: x */
        final /* synthetic */ boolean f33923x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC5242r1 f33924y;

        /* renamed from: z */
        final /* synthetic */ LazyListState f33925z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LazySemantics.kt */
        /* renamed from: y.w$a$a */
        /* loaded from: classes.dex */
        public static final class C13046a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ InterfaceC5242r1 f33926w;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: LazySemantics.kt */
            /* renamed from: y.w$a$a$a */
            /* loaded from: classes.dex */
            public /* synthetic */ class C13047a extends C6435i implements InterfaceC6108l {
                C13047a(Object obj) {
                    super(1, obj, InterfaceC13023k.class, "getKey", "getKey(I)Ljava/lang/Object;", 0);
                }

                /* renamed from: i */
                public final Object m1794i(int i) {
                    return ((InterfaceC13023k) this.f18132x).getKey(i);
                }

                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                    return m1794i(((Number) obj).intValue());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13046a(InterfaceC5242r1 interfaceC5242r1) {
                super(1);
                this.f33926w = interfaceC5242r1;
            }

            /* renamed from: a */
            public final Integer mo9587d(Object obj) {
                Intrinsics.isThisObjectNull(obj, "needle");
                C13047a c13047a = new C13047a(this.f33926w.getValue());
                int mo3321c = ((InterfaceC13023k) this.f33926w.getValue()).mo3321c();
                int i = 0;
                while (i < mo3321c) {
                    int i2 = i + 1;
                    if (Intrinsics.equals(c13047a.mo9587d(Integer.valueOf(i)), obj)) {
                        return Integer.valueOf(i);
                    }
                    i = i2;
                }
                return -1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LazySemantics.kt */
        /* renamed from: y.w$a$b */
        /* loaded from: classes.dex */
        public static final class C13048b extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            final /* synthetic */ boolean f33927w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC10524i0 f33928x;

            /* renamed from: y */
            final /* synthetic */ LazyListState f33929y;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: LazySemantics.kt */
            @InterfaceC6759f(m20197c = "androidx.compose.foundation.lazy.list.LazySemanticsKt$lazyListSemantics$1$2$1", m20196f = "LazySemantics.kt", m20195l = {83}, m20194m = "invokeSuspend")
            /* renamed from: y.w$a$b$a */
            /* loaded from: classes.dex */
            public static final class C13049a extends AbstractC6764l implements InterfaceC6112p {

                /* renamed from: x */
                int f33930x;

                /* renamed from: y */
                final /* synthetic */ LazyListState f33931y;

                /* renamed from: z */
                final /* synthetic */ float f33932z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C13049a(LazyListState lazyListState, float f, InterfaceC1886d interfaceC1886d) {
                    super(2, interfaceC1886d);
                    this.f33931y = lazyListState;
                    this.f33932z = f;
                }

                public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                    return new C13049a(this.f33931y, this.f33932z, interfaceC1886d);
                }

                /* renamed from: d */
                public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                    return ((C13049a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    m34636d = C2116d.m34636d();
                    int i = this.f33930x;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        LazyListState lazyListState = this.f33931y;
                        float f = this.f33932z;
                        this.f33930x = 1;
                        if (C10648b0.m7399b(lazyListState, f, null, this, 2, null) == m34636d) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13048b(boolean z, InterfaceC10524i0 interfaceC10524i0, LazyListState lazyListState) {
                super(2);
                this.f33927w = z;
                this.f33928x = interfaceC10524i0;
                this.f33929y = lazyListState;
            }

            /* renamed from: F */
            public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                return m1792a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
            }

            /* renamed from: a */
            public final Boolean m1792a(float f, float f2) {
                if (this.f33927w) {
                    f = f2;
                }
                C6772d.m20158d(this.f33928x, null, null, new C13049a(this.f33929y, f, null), 3, null);
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LazySemantics.kt */
        /* renamed from: y.w$a$c */
        /* loaded from: classes.dex */
        public static final class C13050c extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ LazyListState f33933w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC10524i0 f33934x;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: LazySemantics.kt */
            @InterfaceC6759f(m20197c = "androidx.compose.foundation.lazy.list.LazySemanticsKt$lazyListSemantics$1$3$2", m20196f = "LazySemantics.kt", m20195l = {C0868i.f2978v0}, m20194m = "invokeSuspend")
            /* renamed from: y.w$a$c$a */
            /* loaded from: classes.dex */
            public static final class C13051a extends AbstractC6764l implements InterfaceC6112p {

                /* renamed from: x */
                int f33935x;

                /* renamed from: y */
                final /* synthetic */ LazyListState f33936y;

                /* renamed from: z */
                final /* synthetic */ int f33937z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C13051a(LazyListState lazyListState, int i, InterfaceC1886d interfaceC1886d) {
                    super(2, interfaceC1886d);
                    this.f33936y = lazyListState;
                    this.f33937z = i;
                }

                public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                    return new C13051a(this.f33936y, this.f33937z, interfaceC1886d);
                }

                /* renamed from: d */
                public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                    return ((C13051a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    m34636d = C2116d.m34636d();
                    int i = this.f33935x;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        LazyListState lazyListState = this.f33936y;
                        int i2 = this.f33937z;
                        this.f33935x = 1;
                        if (LazyListState.m40017s(lazyListState, i2, 0, this, 2, null) == m34636d) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13050c(LazyListState lazyListState, InterfaceC10524i0 interfaceC10524i0) {
                super(1);
                this.f33933w = lazyListState;
                this.f33934x = interfaceC10524i0;
            }

            /* renamed from: a */
            public final Boolean m1789a(int i) {
                boolean z = i >= 0 && i < this.f33933w.m40024l().mo40034f();
                LazyListState lazyListState = this.f33933w;
                if (z) {
                    C6772d.m20158d(this.f33934x, null, null, new C13051a(lazyListState, i, null), 3, null);
                    return Boolean.TRUE;
                }
                throw new IllegalArgumentException(("Can't scroll to index " + i + ", it is out of bounds [0, " + lazyListState.m40024l().mo40034f() + ')').toString());
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                return m1789a(((Number) obj).intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LazySemantics.kt */
        /* renamed from: y.w$a$d */
        /* loaded from: classes.dex */
        public static final class C13052d extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ LazyListState f33938w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13052d(LazyListState lazyListState) {
                super(0);
                this.f33938w = lazyListState;
            }

            /* renamed from: a */
            public final Float mo42214q() {
                return Float.valueOf(this.f33938w.m40029g() + (this.f33938w.m40027i() / 100000.0f));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LazySemantics.kt */
        /* renamed from: y.w$a$e */
        /* loaded from: classes.dex */
        public static final class C13053e extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ LazyListState f33939w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC5242r1 f33940x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13053e(LazyListState lazyListState, InterfaceC5242r1 interfaceC5242r1) {
                super(0);
                this.f33939w = lazyListState;
                this.f33940x = interfaceC5242r1;
            }

            /* renamed from: a */
            public final Float mo42214q() {
                float m40029g;
                float m40027i;
                if (this.f33939w.m40030f()) {
                    m40029g = ((InterfaceC13023k) this.f33940x.getValue()).mo3321c();
                    m40027i = 1.0f;
                } else {
                    m40029g = this.f33939w.m40029g();
                    m40027i = this.f33939w.m40027i() / 100000.0f;
                }
                return Float.valueOf(m40029g + m40027i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13045a(boolean z, boolean z2, InterfaceC5242r1 interfaceC5242r1, LazyListState lazyListState, InterfaceC10524i0 interfaceC10524i0) {
            super(1);
            this.f33922w = z;
            this.f33923x = z2;
            this.f33924y = interfaceC5242r1;
            this.f33925z = lazyListState;
            this.f33921A = interfaceC10524i0;
        }

        /* renamed from: a */
        public final void m1796a(InterfaceC7621v interfaceC7621v) {
            Intrinsics.isThisObjectNull(interfaceC7621v, "$this$semantics");
            C7617t.m17931g(interfaceC7621v, new C13046a(this.f33924y));
            C7593i c7593i = new C7593i(new C13052d(this.f33925z), new C13053e(this.f33925z, this.f33924y), this.f33922w);
            if (this.f33923x) {
                C7617t.m17915w(interfaceC7621v, c7593i);
            } else {
                C7617t.m17920r(interfaceC7621v, c7593i);
            }
            C7617t.m17926l(interfaceC7621v, null, new C13048b(this.f33923x, this.f33921A, this.f33925z), 1, null);
            C7617t.m17924n(interfaceC7621v, null, new C13050c(this.f33925z, this.f33921A), 1, null);
            boolean z = this.f33923x;
            C7617t.m17923o(interfaceC7621v, new C7581b(z ? -1 : 1, z ? 1 : -1));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m1796a((InterfaceC7621v) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC9570f m1797a(InterfaceC9570f interfaceC9570f, InterfaceC5242r1 interfaceC5242r1, LazyListState lazyListState, InterfaceC10524i0 interfaceC10524i0, boolean z, boolean z2) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC5242r1, "stateOfItemsProvider");
        Intrinsics.isThisObjectNull(lazyListState, "state");
        Intrinsics.isThisObjectNull(interfaceC10524i0, "coroutineScope");
        return C7600o.m18015b(interfaceC9570f, false, new C13045a(z2, z, interfaceC5242r1, lazyListState, interfaceC10524i0), 1, null);
    }
}
