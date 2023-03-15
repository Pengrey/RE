package p092f0;

import bd.C1894h;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.Set;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6769b;
import kotlinx.coroutines.flow.C6788e;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p260o0.AbstractC7961h;
import p404vd.InterfaceC11222e;
import p468yc.C13186n;
import p468yc.C13195u;
import td.InterfaceC10524i0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f0.m1 */
/* loaded from: classes.dex */
public final /* synthetic */ class SnapshotFlow {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnapshotFlow.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", m20196f = "SnapshotFlow.kt", m20195l = {175, 66}, m20194m = "invokeSuspend")
    /* renamed from: f0.m1$a */
    /* loaded from: classes.dex */
    public static final class C5221a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ InterfaceC6785c f14444A;

        /* renamed from: x */
        int f14445x;

        /* renamed from: y */
        private /* synthetic */ Object f14446y;

        /* renamed from: z */
        final /* synthetic */ CoroutineContext f14447z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SnapshotFlow.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", m20196f = "SnapshotFlow.kt", m20195l = {175}, m20194m = "invokeSuspend")
        /* renamed from: f0.m1$a$a */
        /* loaded from: classes.dex */
        public static final class C5222a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f14448x;

            /* renamed from: y */
            final /* synthetic */ InterfaceC6785c f14449y;

            /* renamed from: z */
            final /* synthetic */ InterfaceC5241r0 f14450z;

            /* compiled from: Collect.kt */
            /* renamed from: f0.m1$a$a$a */
            /* loaded from: classes.dex */
            public static final class C5223a implements InterfaceC6787d {

                /* renamed from: w */
                final /* synthetic */ InterfaceC5241r0 f14451w;

                public C5223a(InterfaceC5241r0 interfaceC5241r0) {
                    this.f14451w = interfaceC5241r0;
                }

                /* renamed from: a */
                public Object mo4529a(Object obj, InterfaceC1886d interfaceC1886d) {
                    this.f14451w.setValue(obj);
                    return C13195u.f34156a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5222a(InterfaceC6785c interfaceC6785c, InterfaceC5241r0 interfaceC5241r0, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f14449y = interfaceC6785c;
                this.f14450z = interfaceC5241r0;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C5222a(this.f14449y, this.f14450z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C5222a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f14448x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    InterfaceC6785c interfaceC6785c = this.f14449y;
                    C5223a c5223a = new C5223a(this.f14450z);
                    this.f14448x = 1;
                    if (interfaceC6785c.mo20086d(c5223a, this) == m34636d) {
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

        /* compiled from: Collect.kt */
        /* renamed from: f0.m1$a$b */
        /* loaded from: classes.dex */
        public static final class C5224b implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC5241r0 f14452w;

            public C5224b(InterfaceC5241r0 interfaceC5241r0) {
                this.f14452w = interfaceC5241r0;
            }

            /* renamed from: a */
            public Object mo4529a(Object obj, InterfaceC1886d interfaceC1886d) {
                this.f14452w.setValue(obj);
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5221a(CoroutineContext coroutineContext, InterfaceC6785c interfaceC6785c, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f14447z = coroutineContext;
            this.f14444A = interfaceC6785c;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C5221a c5221a = new C5221a(this.f14447z, this.f14444A, interfaceC1886d);
            c5221a.f14446y = obj;
            return c5221a;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC5241r0 interfaceC5241r0, InterfaceC1886d interfaceC1886d) {
            return ((C5221a) create(interfaceC5241r0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f14445x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC5241r0 interfaceC5241r0 = (InterfaceC5241r0) this.f14446y;
                if (Intrinsics.equals(this.f14447z, C1894h.f5621w)) {
                    InterfaceC6785c interfaceC6785c = this.f14444A;
                    C5224b c5224b = new C5224b(interfaceC5241r0);
                    this.f14445x = 1;
                    if (interfaceC6785c.mo20086d(c5224b, this) == m34636d) {
                        return m34636d;
                    }
                } else {
                    CoroutineContext coroutineContext = this.f14447z;
                    C5222a c5222a = new C5222a(this.f14444A, interfaceC5241r0, null);
                    this.f14445x = 2;
                    if (C6769b.m20164g(coroutineContext, c5222a, this) == m34636d) {
                        return m34636d;
                    }
                }
            } else if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnapshotFlow.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", m20196f = "SnapshotFlow.kt", m20195l = {134, 138, 160}, m20194m = "invokeSuspend")
    /* renamed from: f0.m1$b */
    /* loaded from: classes.dex */
    public static final class C5225b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        Object f14453A;

        /* renamed from: B */
        Object f14454B;

        /* renamed from: C */
        int f14455C;

        /* renamed from: D */
        int f14456D;

        /* renamed from: E */
        private /* synthetic */ Object f14457E;

        /* renamed from: F */
        final /* synthetic */ InterfaceC6097a f14458F;

        /* renamed from: x */
        Object f14459x;

        /* renamed from: y */
        Object f14460y;

        /* renamed from: z */
        Object f14461z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SnapshotFlow.kt */
        /* renamed from: f0.m1$b$a */
        /* loaded from: classes.dex */
        public static final class C5226a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ Set f14462w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5226a(Set set) {
                super(1);
                this.f14462w = set;
            }

            /* renamed from: a */
            public final void m24993a(Object obj) {
                Intrinsics.isThisObjectNull(obj, "it");
                this.f14462w.add(obj);
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m24993a(obj);
                return C13195u.f34156a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SnapshotFlow.kt */
        /* renamed from: f0.m1$b$b */
        /* loaded from: classes.dex */
        public static final class C5227b extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            final /* synthetic */ InterfaceC11222e f14463w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5227b(InterfaceC11222e interfaceC11222e) {
                super(2);
                this.f14463w = interfaceC11222e;
            }

            /* renamed from: F */
            public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                m24992a((Set) obj, (AbstractC7961h) obj2);
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m24992a(Set set, AbstractC7961h abstractC7961h) {
                Intrinsics.isThisObjectNull(set, "changed");
                Intrinsics.isThisObjectNull(abstractC7961h, "$noName_1");
                this.f14463w.mo5641i(set);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5225b(InterfaceC6097a interfaceC6097a, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f14458F = interfaceC6097a;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C5225b c5225b = new C5225b(this.f14458F, interfaceC1886d);
            c5225b.f14457E = obj;
            return c5225b;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            return ((C5225b) create(interfaceC6787d, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00db A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0100 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #4 {all -> 0x0053, blocks: (B:34:0x00e4, B:36:0x00e8, B:41:0x00f2, B:44:0x0100, B:48:0x0116, B:50:0x011f, B:11:0x004b, B:45:0x010b, B:47:0x0113, B:46:0x010f), top: B:75:0x004b }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x014c -> B:30:0x00c5). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 350
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p092f0.SnapshotFlow.C5225b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ boolean m25000a(Set set, Set set2) {
        return m24998c(set, set2);
    }

    /* renamed from: b */
    public static final InterfaceC5242r1 m24999b(InterfaceC6785c interfaceC6785c, Object obj, CoroutineContext coroutineContext, InterfaceC5179i interfaceC5179i, int i, int i2) {
        Intrinsics.isThisObjectNull(interfaceC6785c, "<this>");
        interfaceC5179i.mo25263g(2062127072);
        if ((i2 & 2) != 0) {
            coroutineContext = C1894h.f5621w;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        int i3 = i >> 3;
        InterfaceC5242r1 m25069i = C5209j1.m25069i(obj, interfaceC6785c, coroutineContext2, new C5221a(coroutineContext2, interfaceC6785c, null), interfaceC5179i, (i3 & 8) | 576 | (i3 & 14));
        interfaceC5179i.mo25282C();
        return m25069i;
    }

    /* renamed from: c */
    private static final boolean m24998c(Set set, Set set2) {
        if (set.size() < set2.size()) {
            if (!set.isEmpty()) {
                for (Object obj : set) {
                    if (set2.contains(obj)) {
                        return true;
                    }
                }
            }
        } else if (!set2.isEmpty()) {
            for (Object obj2 : set2) {
                if (set.contains(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final InterfaceC6785c m24997d(InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "block");
        return C6788e.m20128t(new C5225b(interfaceC6097a, null));
    }
}
