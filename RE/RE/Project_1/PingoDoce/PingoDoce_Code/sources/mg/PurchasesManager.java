package mg;

import bd.InterfaceC1886d;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p425we.BaseException;
import pt.pingodoce.app.data.local.models.purchases.ChartData;
import pt.pingodoce.app.data.local.models.purchases.Purchase;
import vg.PurchaseService;

/* renamed from: mg.v0 */
/* loaded from: classes2.dex */
public final class PurchasesManager {

    /* renamed from: a */
    private final PurchaseService f19726a;

    /* renamed from: b */
    private final PrefsManager f19727b;

    /* compiled from: PurchasesManager.kt */
    /* renamed from: mg.v0$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7445a<T> {

        /* compiled from: PurchasesManager.kt */
        /* renamed from: mg.v0$a$a */
        /* loaded from: classes2.dex */
        public static final class C7446a extends AbstractC7445a {

            /* renamed from: a */
            private final BaseException f19728a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7446a(BaseException baseException) {
                super(null);
                Intrinsics.isThisObjectNull(baseException, "exception");
                this.f19728a = baseException;
            }

            /* renamed from: a */
            public final BaseException m18444a() {
                return this.f19728a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7446a) && Intrinsics.equals(this.f19728a, ((C7446a) obj).f19728a);
            }

            public int hashCode() {
                return this.f19728a.hashCode();
            }

            public String toString() {
                BaseException baseException = this.f19728a;
                return "Error(exception=" + baseException + ")";
            }
        }

        /* compiled from: PurchasesManager.kt */
        /* renamed from: mg.v0$a$b */
        /* loaded from: classes2.dex */
        public static final class C7447b extends AbstractC7445a {

            /* renamed from: a */
            private final BaseException f19729a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7447b(BaseException baseException) {
                super(null);
                Intrinsics.isThisObjectNull(baseException, "exception");
                this.f19729a = baseException;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7447b) && Intrinsics.equals(this.f19729a, ((C7447b) obj).f19729a);
            }

            public int hashCode() {
                return this.f19729a.hashCode();
            }

            public String toString() {
                BaseException baseException = this.f19729a;
                return "NoDataAvailable(exception=" + baseException + ")";
            }
        }

        /* compiled from: PurchasesManager.kt */
        /* renamed from: mg.v0$a$c */
        /* loaded from: classes2.dex */
        public static final class C7448c extends AbstractC7445a {

            /* renamed from: a */
            private final ChartData f19730a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7448c(ChartData chartData) {
                super(null);
                Intrinsics.isThisObjectNull(chartData, "data");
                this.f19730a = chartData;
            }

            /* renamed from: a */
            public final ChartData m18443a() {
                return this.f19730a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7448c) && Intrinsics.equals(this.f19730a, ((C7448c) obj).f19730a);
            }

            public int hashCode() {
                return this.f19730a.hashCode();
            }

            public String toString() {
                ChartData chartData = this.f19730a;
                return "Success(data=" + chartData + ")";
            }
        }

        private AbstractC7445a() {
        }

        public /* synthetic */ AbstractC7445a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PurchasesManager.kt */
    /* renamed from: mg.v0$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7449b<T> {

        /* compiled from: PurchasesManager.kt */
        /* renamed from: mg.v0$b$a */
        /* loaded from: classes2.dex */
        public static final class C7450a extends AbstractC7449b {

            /* renamed from: a */
            private final BaseException f19731a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7450a(BaseException baseException) {
                super(null);
                Intrinsics.isThisObjectNull(baseException, "exception");
                this.f19731a = baseException;
            }

            /* renamed from: a */
            public final BaseException m18442a() {
                return this.f19731a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7450a) && Intrinsics.equals(this.f19731a, ((C7450a) obj).f19731a);
            }

            public int hashCode() {
                return this.f19731a.hashCode();
            }

            public String toString() {
                BaseException baseException = this.f19731a;
                return "Error(exception=" + baseException + ")";
            }
        }

        /* compiled from: PurchasesManager.kt */
        /* renamed from: mg.v0$b$b */
        /* loaded from: classes2.dex */
        public static final class C7451b extends AbstractC7449b {

            /* renamed from: a */
            private final BaseException f19732a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7451b(BaseException baseException) {
                super(null);
                Intrinsics.isThisObjectNull(baseException, "exception");
                this.f19732a = baseException;
            }

            /* renamed from: a */
            public final BaseException m18441a() {
                return this.f19732a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7451b) && Intrinsics.equals(this.f19732a, ((C7451b) obj).f19732a);
            }

            public int hashCode() {
                return this.f19732a.hashCode();
            }

            public String toString() {
                BaseException baseException = this.f19732a;
                return "NoDataAvailable(exception=" + baseException + ")";
            }
        }

        /* compiled from: PurchasesManager.kt */
        /* renamed from: mg.v0$b$c */
        /* loaded from: classes2.dex */
        public static final class C7452c extends AbstractC7449b {

            /* renamed from: a */
            private final List f19733a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7452c(List list) {
                super(null);
                Intrinsics.isThisObjectNull(list, "data");
                this.f19733a = list;
            }

            /* renamed from: a */
            public final List m18440a() {
                return this.f19733a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7452c) && Intrinsics.equals(this.f19733a, ((C7452c) obj).f19733a);
            }

            public int hashCode() {
                return this.f19733a.hashCode();
            }

            public String toString() {
                List list = this.f19733a;
                return "Success(data=" + list + ")";
            }
        }

        private AbstractC7449b() {
        }

        public /* synthetic */ AbstractC7449b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PurchasesManager.kt */
    /* renamed from: mg.v0$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7453c<T> {

        /* compiled from: PurchasesManager.kt */
        /* renamed from: mg.v0$c$a */
        /* loaded from: classes2.dex */
        public static final class C7454a extends AbstractC7453c {

            /* renamed from: a */
            private final BaseException f19734a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7454a(BaseException baseException) {
                super(null);
                Intrinsics.isThisObjectNull(baseException, "exception");
                this.f19734a = baseException;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7454a) && Intrinsics.equals(this.f19734a, ((C7454a) obj).f19734a);
            }

            public int hashCode() {
                return this.f19734a.hashCode();
            }

            public String toString() {
                BaseException baseException = this.f19734a;
                return "Error(exception=" + baseException + ")";
            }
        }

        /* compiled from: PurchasesManager.kt */
        /* renamed from: mg.v0$c$b */
        /* loaded from: classes2.dex */
        public static final class C7455b extends AbstractC7453c {

            /* renamed from: a */
            private final Purchase f19735a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7455b(Purchase purchase) {
                super(null);
                Intrinsics.isThisObjectNull(purchase, "data");
                this.f19735a = purchase;
            }

            /* renamed from: a */
            public final Purchase m18439a() {
                return this.f19735a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7455b) && Intrinsics.equals(this.f19735a, ((C7455b) obj).f19735a);
            }

            public int hashCode() {
                return this.f19735a.hashCode();
            }

            public String toString() {
                Purchase purchase = this.f19735a;
                return "Success(data=" + purchase + ")";
            }
        }

        private AbstractC7453c() {
        }

        public /* synthetic */ AbstractC7453c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchasesManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.PurchasesManager", m20196f = "PurchasesManager.kt", m20195l = {23}, m20194m = "getChartData")
    /* renamed from: mg.v0$d */
    /* loaded from: classes2.dex */
    public static final class C7456d extends AbstractC6757d {

        /* renamed from: A */
        int f19736A;

        /* renamed from: w */
        Object f19737w;

        /* renamed from: x */
        Object f19738x;

        /* renamed from: y */
        /* synthetic */ Object f19739y;

        C7456d(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19739y = obj;
            this.f19736A |= Integer.MIN_VALUE;
            return PurchasesManager.this.m18449d(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchasesManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.PurchasesManager", m20196f = "PurchasesManager.kt", m20195l = {42}, m20194m = "getLastPurchases")
    /* renamed from: mg.v0$e */
    /* loaded from: classes2.dex */
    public static final class C7457e extends AbstractC6757d {

        /* renamed from: w */
        Object f19741w;

        /* renamed from: x */
        /* synthetic */ Object f19742x;

        /* renamed from: z */
        int f19744z;

        C7457e(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19742x = obj;
            this.f19744z |= Integer.MIN_VALUE;
            return PurchasesManager.this.m18448e(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchasesManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.PurchasesManager", m20196f = "PurchasesManager.kt", m20195l = {70}, m20194m = "getPurchaseDetail")
    /* renamed from: mg.v0$f */
    /* loaded from: classes2.dex */
    public static final class C7458f extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19745w;

        /* renamed from: y */
        int f19747y;

        C7458f(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19745w = obj;
            this.f19747y |= Integer.MIN_VALUE;
            return PurchasesManager.this.m18447f(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchasesManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.PurchasesManager", m20196f = "PurchasesManager.kt", m20195l = {59}, m20194m = "getPurchaseList")
    /* renamed from: mg.v0$g */
    /* loaded from: classes2.dex */
    public static final class C7459g extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19748w;

        /* renamed from: y */
        int f19750y;

        C7459g(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19748w = obj;
            this.f19750y |= Integer.MIN_VALUE;
            return PurchasesManager.this.m18446g(0, 0, this);
        }
    }

    public PurchasesManager(PurchaseService purchaseService, PrefsManager prefsManager) {
        Intrinsics.isThisObjectNull(purchaseService, "service");
        Intrinsics.isThisObjectNull(prefsManager, "prefsManager");
        this.f19726a = purchaseService;
        this.f19727b = prefsManager;
    }

    /* renamed from: h */
    public static /* synthetic */ Object m18445h(PurchasesManager purchasesManager, int i, int i2, InterfaceC1886d interfaceC1886d, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 20;
        }
        return purchasesManager.m18446g(i, i2, interfaceC1886d);
    }

    /* renamed from: a */
    public final boolean m18452a(List list) {
        Intrinsics.isThisObjectNull(list, "products");
        return this.f19727b.m18536a(list);
    }

    /* renamed from: b */
    public final void m18451b() {
        this.f19727b.m18534c();
    }

    /* renamed from: c */
    public final List m18450c() {
        return this.f19727b.m18530g();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18449d(p163ih.PurchasesChartViewModel.EnumC6140a r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mg.PurchasesManager.C7456d
            if (r0 == 0) goto L13
            r0 = r6
            mg.v0$d r0 = (mg.PurchasesManager.C7456d) r0
            int r1 = r0.f19736A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19736A = r1
            goto L18
        L13:
            mg.v0$d r0 = new mg.v0$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19739y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19736A
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f19738x
            ih.d$a r5 = (p163ih.PurchasesChartViewModel.EnumC6140a) r5
            java.lang.Object r0 = r0.f19737w
            mg.v0 r0 = (mg.PurchasesManager) r0
            p468yc.C13186n.m1453b(r6)
            goto L5c
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            p468yc.C13186n.m1453b(r6)
            mg.s0 r6 = r4.f19727b
            pt.pingodoce.app.data.local.models.purchases.ChartData r6 = r6.m18527j(r5)
            boolean r2 = r6.m14446d()
            if (r2 == 0) goto La3
            vg.a0 r6 = r4.f19726a
            java.lang.String r2 = r5.name()
            r0.f19737w = r4
            r0.f19738x = r5
            r0.f19736A = r3
            java.lang.Object r6 = r6.m5605m(r2, r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            r0 = r4
        L5c:
            df.d r6 = (p065df.NetworkResult) r6
            boolean r1 = r6 instanceof p065df.NetworkResult.C4792b
            if (r1 == 0) goto L7b
            mg.s0 r0 = r0.f19727b
            df.d$b r6 = (p065df.NetworkResult.C4792b) r6
            java.lang.Object r1 = r6.m26590a()
            pt.pingodoce.app.data.local.models.purchases.ChartData r1 = (pt.pingodoce.app.data.local.models.purchases.ChartData) r1
            r0.m18548L(r1, r5)
            mg.v0$a$c r5 = new mg.v0$a$c
            java.lang.Object r6 = r6.m26590a()
            pt.pingodoce.app.data.local.models.purchases.ChartData r6 = (pt.pingodoce.app.data.local.models.purchases.ChartData) r6
            r5.<init>(r6)
            goto La8
        L7b:
            boolean r5 = r6 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L9d
            df.d$a r6 = (p065df.NetworkResult.C4791a) r6
            we.b r5 = r6.m26591a()
            boolean r5 = r5 instanceof p339rg.NoChartDataAvailableException
            if (r5 == 0) goto L93
            mg.v0$a$b r5 = new mg.v0$a$b
            we.b r6 = r6.m26591a()
            r5.<init>(r6)
            goto La8
        L93:
            mg.v0$a$a r5 = new mg.v0$a$a
            we.b r6 = r6.m26591a()
            r5.<init>(r6)
            goto La8
        L9d:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        La3:
            mg.v0$a$c r5 = new mg.v0$a$c
            r5.<init>(r6)
        La8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.PurchasesManager.m18449d(ih.d$a, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18448e(bd.InterfaceC1886d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof mg.PurchasesManager.C7457e
            if (r0 == 0) goto L13
            r0 = r5
            mg.v0$e r0 = (mg.PurchasesManager.C7457e) r0
            int r1 = r0.f19744z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19744z = r1
            goto L18
        L13:
            mg.v0$e r0 = new mg.v0$e
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19742x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19744z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f19741w
            mg.v0 r0 = (mg.PurchasesManager) r0
            p468yc.C13186n.m1453b(r5)
            goto L54
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            p468yc.C13186n.m1453b(r5)
            mg.s0 r5 = r4.f19727b
            java.util.List r5 = r5.m18522o()
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L9b
            vg.a0 r5 = r4.f19726a
            r2 = 10
            r0.f19741w = r4
            r0.f19744z = r3
            java.lang.Object r5 = r5.m5603o(r3, r2, r0)
            if (r5 != r1) goto L53
            return r1
        L53:
            r0 = r4
        L54:
            df.d r5 = (p065df.NetworkResult) r5
            boolean r1 = r5 instanceof p065df.NetworkResult.C4792b
            if (r1 == 0) goto L73
            mg.s0 r0 = r0.f19727b
            df.d$b r5 = (p065df.NetworkResult.C4792b) r5
            java.lang.Object r1 = r5.m26590a()
            java.util.List r1 = (java.util.List) r1
            r0.m18545O(r1)
            mg.v0$b$c r0 = new mg.v0$b$c
            java.lang.Object r5 = r5.m26590a()
            java.util.List r5 = (java.util.List) r5
            r0.<init>(r5)
            goto L94
        L73:
            boolean r0 = r5 instanceof p065df.NetworkResult.C4791a
            if (r0 == 0) goto L95
            df.d$a r5 = (p065df.NetworkResult.C4791a) r5
            we.b r0 = r5.m26591a()
            boolean r0 = r0 instanceof p339rg.NoChartDataAvailableException
            if (r0 == 0) goto L8b
            mg.v0$b$b r0 = new mg.v0$b$b
            we.b r5 = r5.m26591a()
            r0.<init>(r5)
            goto L94
        L8b:
            mg.v0$b$a r0 = new mg.v0$b$a
            we.b r5 = r5.m26591a()
            r0.<init>(r5)
        L94:
            return r0
        L95:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L9b:
            mg.v0$b$c r0 = new mg.v0$b$c
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.PurchasesManager.m18448e(bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18447f(java.lang.String r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mg.PurchasesManager.C7458f
            if (r0 == 0) goto L13
            r0 = r6
            mg.v0$f r0 = (mg.PurchasesManager.C7458f) r0
            int r1 = r0.f19747y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19747y = r1
            goto L18
        L13:
            mg.v0$f r0 = new mg.v0$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19745w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19747y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r6)
            vg.a0 r6 = r4.f19726a
            r0.f19747y = r3
            java.lang.Object r6 = r6.m5604n(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            df.d r6 = (p065df.NetworkResult) r6
            boolean r5 = r6 instanceof p065df.NetworkResult.C4792b
            if (r5 == 0) goto L53
            mg.v0$c$b r5 = new mg.v0$c$b
            df.d$b r6 = (p065df.NetworkResult.C4792b) r6
            java.lang.Object r6 = r6.m26590a()
            pt.pingodoce.app.data.local.models.purchases.Purchase r6 = (pt.pingodoce.app.data.local.models.purchases.Purchase) r6
            r5.<init>(r6)
            goto L62
        L53:
            boolean r5 = r6 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L63
            mg.v0$c$a r5 = new mg.v0$c$a
            df.d$a r6 = (p065df.NetworkResult.C4791a) r6
            we.b r6 = r6.m26591a()
            r5.<init>(r6)
        L62:
            return r5
        L63:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.PurchasesManager.m18447f(java.lang.String, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18446g(int r5, int r6, bd.InterfaceC1886d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof mg.PurchasesManager.C7459g
            if (r0 == 0) goto L13
            r0 = r7
            mg.v0$g r0 = (mg.PurchasesManager.C7459g) r0
            int r1 = r0.f19750y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19750y = r1
            goto L18
        L13:
            mg.v0$g r0 = new mg.v0$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19748w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19750y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r7)
            vg.a0 r7 = r4.f19726a
            r0.f19750y = r3
            java.lang.Object r7 = r7.m5603o(r5, r6, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            df.d r7 = (p065df.NetworkResult) r7
            boolean r5 = r7 instanceof p065df.NetworkResult.C4792b
            if (r5 == 0) goto L53
            mg.v0$b$c r5 = new mg.v0$b$c
            df.d$b r7 = (p065df.NetworkResult.C4792b) r7
            java.lang.Object r6 = r7.m26590a()
            java.util.List r6 = (java.util.List) r6
            r5.<init>(r6)
            goto L74
        L53:
            boolean r5 = r7 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L75
            df.d$a r7 = (p065df.NetworkResult.C4791a) r7
            we.b r5 = r7.m26591a()
            boolean r5 = r5 instanceof p339rg.NoChartDataAvailableException
            if (r5 == 0) goto L6b
            mg.v0$b$b r5 = new mg.v0$b$b
            we.b r6 = r7.m26591a()
            r5.<init>(r6)
            goto L74
        L6b:
            mg.v0$b$a r5 = new mg.v0$b$a
            we.b r6 = r7.m26591a()
            r5.<init>(r6)
        L74:
            return r5
        L75:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.PurchasesManager.m18446g(int, int, bd.d):java.lang.Object");
    }
}
