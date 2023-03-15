package p066dg;

import bd.InterfaceC1886d;
import cd.C2116d;
import eg.NullableValueAgent;
import gg.C5664k;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6770c;
import kotlinx.coroutines.flow.InterfaceC6785c;
import p181jd.Intrinsics;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.response.Store;
import td.InterfaceC10524i0;
import vg.StoreService;

/* renamed from: dg.o */
/* loaded from: classes2.dex */
public final class DefaultStoreAgent extends NullableValueAgent {

    /* renamed from: h */
    private final StoreService f13241h;

    /* renamed from: i */
    private final C5664k f13242i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultStoreAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.DefaultStoreAgent", m20196f = "DefaultStoreAgent.kt", m20195l = {34, 34, 36}, m20194m = "get")
    /* renamed from: dg.o$a */
    /* loaded from: classes2.dex */
    public static final class C4839a extends AbstractC6757d {

        /* renamed from: A */
        int f13243A;

        /* renamed from: w */
        Object f13244w;

        /* renamed from: x */
        Object f13245x;

        /* renamed from: y */
        /* synthetic */ Object f13246y;

        C4839a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f13246y = obj;
            this.f13243A |= Integer.MIN_VALUE;
            return DefaultStoreAgent.this.m26499I(false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultStoreAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.DefaultStoreAgent$getFlow$1", m20196f = "DefaultStoreAgent.kt", m20195l = {43, 43}, m20194m = "invokeSuspend")
    /* renamed from: dg.o$b */
    /* loaded from: classes2.dex */
    public static final class C4840b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        Object f13248x;

        /* renamed from: y */
        int f13249y;

        C4840b(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C4840b(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4840b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            DefaultStoreAgent defaultStoreAgent;
            m34636d = C2116d.m34636d();
            int i = this.f13249y;
            if (i == 0) {
                C13186n.m1453b(obj);
                defaultStoreAgent = DefaultStoreAgent.this;
                C5664k m26496r = defaultStoreAgent.m26496r();
                this.f13248x = defaultStoreAgent;
                this.f13249y = 1;
                obj = m26496r.mo22688c(this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                if (i == 2) {
                    C13186n.m1453b(obj);
                    return C13195u.f34156a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                defaultStoreAgent = (DefaultStoreAgent) this.f13248x;
                C13186n.m1453b(obj);
            }
            this.f13248x = null;
            this.f13249y = 2;
            if (defaultStoreAgent.m25783y(obj, this) == m34636d) {
                return m34636d;
            }
            return C13195u.f34156a;
        }
    }

    /* compiled from: DefaultStoreAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.DefaultStoreAgent$getFreshData$1", m20196f = "DefaultStoreAgent.kt", m20195l = {21}, m20194m = "invokeSuspend")
    /* renamed from: dg.o$c */
    /* loaded from: classes2.dex */
    static final class C4841c extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f13251x;

        C4841c(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C4841c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C4841c) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f13251x;
            if (i == 0) {
                C13186n.m1453b(obj);
                StoreService m26500H = DefaultStoreAgent.m26500H(DefaultStoreAgent.this);
                this.f13251x = 1;
                obj = m26500H.m5528m(this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            Store store = (Store) obj;
            if (store.m13702t()) {
                return store;
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStoreAgent(StoreService storeService, C5664k c5664k) {
        super(null, null, 3, null);
        Intrinsics.isThisObjectNull(storeService, "service");
        Intrinsics.isThisObjectNull(c5664k, "localDataProvider");
        this.f13241h = storeService;
        this.f13242i = c5664k;
    }

    /* renamed from: H */
    public static final /* synthetic */ StoreService m26500H(DefaultStoreAgent defaultStoreAgent) {
        return defaultStoreAgent.f13241h;
    }

    /* renamed from: G */
    public InterfaceC6108l m26501G() {
        return new C4841c(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e A[RETURN] */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m26499I(boolean r8, bd.InterfaceC1886d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p066dg.DefaultStoreAgent.C4839a
            if (r0 == 0) goto L13
            r0 = r9
            dg.o$a r0 = (p066dg.DefaultStoreAgent.C4839a) r0
            int r1 = r0.f13243A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13243A = r1
            goto L18
        L13:
            dg.o$a r0 = new dg.o$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f13246y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f13243A
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4c
            if (r2 == r6) goto L40
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            p468yc.C13186n.m1453b(r9)
            goto L7f
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.f13244w
            dg.o r8 = (p066dg.DefaultStoreAgent) r8
            p468yc.C13186n.m1453b(r9)
            goto L74
        L40:
            java.lang.Object r8 = r0.f13245x
            dg.o r8 = (p066dg.DefaultStoreAgent) r8
            java.lang.Object r2 = r0.f13244w
            dg.o r2 = (p066dg.DefaultStoreAgent) r2
            p468yc.C13186n.m1453b(r9)
            goto L64
        L4c:
            p468yc.C13186n.m1453b(r9)
            if (r8 != 0) goto L73
            gg.k r8 = r7.m26496r()
            r0.f13244w = r7
            r0.f13245x = r7
            r0.f13243A = r6
            java.lang.Object r9 = r8.mo22688c(r0)
            if (r9 != r1) goto L62
            return r1
        L62:
            r8 = r7
            r2 = r8
        L64:
            r0.f13244w = r2
            r0.f13245x = r3
            r0.f13243A = r5
            java.lang.Object r8 = r8.m25783y(r9, r0)
            if (r8 != r1) goto L71
            return r1
        L71:
            r8 = r2
            goto L74
        L73:
            r8 = r7
        L74:
            r0.f13244w = r3
            r0.f13243A = r4
            java.lang.Object r9 = super.m25771D(r0)
            if (r9 != r1) goto L7f
            return r1
        L7f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p066dg.DefaultStoreAgent.m26499I(boolean, bd.d):java.lang.Object");
    }

    /* renamed from: J */
    public final InterfaceC6785c m26498J(boolean z) {
        if (!z) {
            C6770c.m20162b(null, new C4840b(null), 1, null);
        }
        return super.m25769F();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public C5664k m26496r() {
        return this.f13242i;
    }
}
