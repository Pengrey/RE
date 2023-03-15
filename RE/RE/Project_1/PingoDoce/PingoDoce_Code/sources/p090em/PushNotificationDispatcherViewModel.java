package p090em;

import androidx.lifecycle.C1459l0;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import mg.C7310l;
import mg.StoreManager;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p276og.Result;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.CollectionsJVM;
import p494zh.BaseViewModel;
import p494zh.C13856k0;
import p494zh.C13904t1;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchCatalogParameters;
import pt.pingodoce.app.data.remote.models.response.CatalogResponse;
import pt.pingodoce.app.data.remote.models.response.Store;
import td.InterfaceC10524i0;

/* renamed from: em.e */
/* loaded from: classes2.dex */
public final class PushNotificationDispatcherViewModel extends BaseViewModel {

    /* renamed from: m */
    private final StoreManager f14197m;

    /* renamed from: n */
    private final C7310l f14198n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PushNotificationDispatcherViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.services.PushNotificationDispatcherViewModel", m20196f = "PushNotificationDispatcherViewModel.kt", m20195l = {59}, m20194m = "getCatalogDetail")
    /* renamed from: em.e$a */
    /* loaded from: classes2.dex */
    public static final class C5137a extends AbstractC6757d {

        /* renamed from: A */
        int f14199A;

        /* renamed from: w */
        Object f14200w;

        /* renamed from: x */
        Object f14201x;

        /* renamed from: y */
        /* synthetic */ Object f14202y;

        C5137a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f14202y = obj;
            this.f14199A |= Integer.MIN_VALUE;
            return PushNotificationDispatcherViewModel.this.m25571O(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PushNotificationDispatcherViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.services.PushNotificationDispatcherViewModel$getCatalogDetail$2", m20196f = "PushNotificationDispatcherViewModel.kt", m20195l = {62}, m20194m = "invokeSuspend")
    /* renamed from: em.e$b */
    /* loaded from: classes2.dex */
    public static final class C5138b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ String f14204A;

        /* renamed from: x */
        int f14205x;

        /* renamed from: z */
        final /* synthetic */ Store f14207z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PushNotificationDispatcherViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.services.PushNotificationDispatcherViewModel$getCatalogDetail$2$1", m20196f = "PushNotificationDispatcherViewModel.kt", m20195l = {64}, m20194m = "invokeSuspend")
        /* renamed from: em.e$b$a */
        /* loaded from: classes2.dex */
        public static final class C5139a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: A */
            final /* synthetic */ String f14208A;

            /* renamed from: x */
            int f14209x;

            /* renamed from: y */
            final /* synthetic */ PushNotificationDispatcherViewModel f14210y;

            /* renamed from: z */
            final /* synthetic */ Store f14211z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5139a(PushNotificationDispatcherViewModel pushNotificationDispatcherViewModel, Store store, String str, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f14210y = pushNotificationDispatcherViewModel;
                this.f14211z = store;
                this.f14208A = str;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C5139a(this.f14210y, this.f14211z, this.f14208A, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C5139a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                List m202b;
                Object m18720w;
                m34636d = C2116d.m34636d();
                int i = this.f14209x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7310l m25574L = PushNotificationDispatcherViewModel.m25574L(this.f14210y);
                    int m13711f = this.f14211z.m13711f();
                    m202b = CollectionsJVM.m202b(this.f14208A);
                    SearchCatalogParameters searchCatalogParameters = new SearchCatalogParameters(m13711f, null, null, null, null, C6755b.m20201a(false), null, false, null, null, null, null, null, null, m202b, 0, 100, false, 180190, null);
                    this.f14209x = 1;
                    m18720w = m25574L.m18720w(searchCatalogParameters, false, this);
                    if (m18720w == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                    m18720w = obj;
                }
                Result result = (Result) m18720w;
                if (result instanceof Result.C8078c) {
                    Result.C8078c c8078c = (Result.C8078c) result;
                    if (!((CatalogResponse) c8078c.m16962b()).m13884b().isEmpty()) {
                        this.f14210y.m120B(C13904t1.f35025a, ((CatalogResponse) c8078c.m16962b()).m13884b().get(0));
                    } else {
                        UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
                        uiEventsLiveData.m19510t("invalid something");
                        UiEventsLiveData.m19517m(uiEventsLiveData, 0, null, 3, null);
                    }
                } else if (result instanceof Result.C8077b) {
                    PushNotificationDispatcherViewModel.m25573M(this.f14210y, ((Result.C8077b) result).m16964b());
                    UiEventsLiveData.m19517m(UiEventsLiveData.f18671a, 0, null, 3, null);
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5138b(Store store, String str, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f14207z = store;
            this.f14204A = str;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5138b(this.f14207z, this.f14204A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5138b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f14205x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PushNotificationDispatcherViewModel pushNotificationDispatcherViewModel = PushNotificationDispatcherViewModel.this;
                C5139a c5139a = new C5139a(pushNotificationDispatcherViewModel, this.f14207z, this.f14204A, null);
                this.f14205x = 1;
                if (PushNotificationDispatcherViewModel.m25572N(pushNotificationDispatcherViewModel, true, c5139a, this) == m34636d) {
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
    /* compiled from: PushNotificationDispatcherViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.services.PushNotificationDispatcherViewModel", m20196f = "PushNotificationDispatcherViewModel.kt", m20195l = {33}, m20194m = "getFlyerDetail")
    /* renamed from: em.e$c */
    /* loaded from: classes2.dex */
    public static final class C5140c extends AbstractC6757d {

        /* renamed from: A */
        int f14212A;

        /* renamed from: w */
        Object f14213w;

        /* renamed from: x */
        Object f14214x;

        /* renamed from: y */
        /* synthetic */ Object f14215y;

        C5140c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f14215y = obj;
            this.f14212A |= Integer.MIN_VALUE;
            return PushNotificationDispatcherViewModel.this.m25570P(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PushNotificationDispatcherViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.services.PushNotificationDispatcherViewModel$getFlyerDetail$2", m20196f = "PushNotificationDispatcherViewModel.kt", m20195l = {36}, m20194m = "invokeSuspend")
    /* renamed from: em.e$d */
    /* loaded from: classes2.dex */
    public static final class C5141d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f14217x;

        /* renamed from: z */
        final /* synthetic */ String f14219z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PushNotificationDispatcherViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.services.PushNotificationDispatcherViewModel$getFlyerDetail$2$1", m20196f = "PushNotificationDispatcherViewModel.kt", m20195l = {37}, m20194m = "invokeSuspend")
        /* renamed from: em.e$d$a */
        /* loaded from: classes2.dex */
        public static final class C5142a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f14220x;

            /* renamed from: y */
            final /* synthetic */ PushNotificationDispatcherViewModel f14221y;

            /* renamed from: z */
            final /* synthetic */ String f14222z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5142a(PushNotificationDispatcherViewModel pushNotificationDispatcherViewModel, String str, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f14221y = pushNotificationDispatcherViewModel;
                this.f14222z = str;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C5142a(this.f14221y, this.f14222z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C5142a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f14220x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7310l m25574L = PushNotificationDispatcherViewModel.m25574L(this.f14221y);
                    Integer m20199c = C6755b.m20199c(Integer.parseInt(this.f14222z));
                    this.f14220x = 1;
                    obj = m25574L.m18718y(m20199c, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                Result result = (Result) obj;
                if (result instanceof Result.C8078c) {
                    Result.C8078c c8078c = (Result.C8078c) result;
                    if (!((Collection) c8078c.m16962b()).isEmpty()) {
                        this.f14221y.m120B(C13856k0.f34964a, ((List) c8078c.m16962b()).get(0));
                    }
                } else if (result instanceof Result.C8077b) {
                    PushNotificationDispatcherViewModel.m25573M(this.f14221y, ((Result.C8077b) result).m16964b());
                    UiEventsLiveData.m19517m(UiEventsLiveData.f18671a, 0, null, 3, null);
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5141d(String str, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f14219z = str;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5141d(this.f14219z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5141d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f14217x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PushNotificationDispatcherViewModel pushNotificationDispatcherViewModel = PushNotificationDispatcherViewModel.this;
                C5142a c5142a = new C5142a(pushNotificationDispatcherViewModel, this.f14219z, null);
                this.f14217x = 1;
                if (PushNotificationDispatcherViewModel.m25572N(pushNotificationDispatcherViewModel, true, c5142a, this) == m34636d) {
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
    public PushNotificationDispatcherViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, StoreManager storeManager, C7310l c7310l) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(storeManager, "storeManager");
        Intrinsics.isThisObjectNull(c7310l, "catalogManager");
        this.f14197m = storeManager;
        this.f14198n = c7310l;
    }

    /* renamed from: L */
    public static final /* synthetic */ C7310l m25574L(PushNotificationDispatcherViewModel pushNotificationDispatcherViewModel) {
        return pushNotificationDispatcherViewModel.f14198n;
    }

    /* renamed from: M */
    public static final /* synthetic */ void m25573M(PushNotificationDispatcherViewModel pushNotificationDispatcherViewModel, Throwable th2) {
        pushNotificationDispatcherViewModel.m109l(th2);
    }

    /* renamed from: N */
    public static final /* synthetic */ Object m25572N(PushNotificationDispatcherViewModel pushNotificationDispatcherViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return pushNotificationDispatcherViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m25571O(java.lang.String r11, bd.InterfaceC1886d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof p090em.PushNotificationDispatcherViewModel.C5137a
            if (r0 == 0) goto L13
            r0 = r12
            em.e$a r0 = (p090em.PushNotificationDispatcherViewModel.C5137a) r0
            int r1 = r0.f14199A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14199A = r1
            goto L18
        L13:
            em.e$a r0 = new em.e$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f14202y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f14199A
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r11 = r0.f14201x
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r0 = r0.f14200w
            em.e r0 = (p090em.PushNotificationDispatcherViewModel) r0
            p468yc.C13186n.m1453b(r12)
            goto L4c
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            p468yc.C13186n.m1453b(r12)
            mg.j1 r12 = r10.f14197m
            r0.f14200w = r10
            r0.f14201x = r11
            r0.f14199A = r3
            java.lang.Object r12 = r12.m18760g(r0)
            if (r12 != r1) goto L4b
            return r1
        L4b:
            r0 = r10
        L4c:
            og.a r12 = (p276og.Result) r12
            java.lang.Object r12 = r12.m16966a()
            pt.pingodoce.app.data.remote.models.response.Store r12 = (pt.pingodoce.app.data.remote.models.response.Store) r12
            r1 = 0
            r2 = 0
            if (r12 == 0) goto L73
            int r4 = r11.length()
            if (r4 <= 0) goto L5f
            goto L60
        L5f:
            r3 = r1
        L60:
            if (r3 == 0) goto L73
            td.i0 r4 = androidx.lifecycle.C1473p0.m36987a(r0)
            r5 = 0
            r6 = 0
            em.e$b r7 = new em.e$b
            r7.<init>(r12, r11, r2)
            r8 = 3
            r9 = 0
            kotlinx.coroutines.C6769b.m20167d(r4, r5, r6, r7, r8, r9)
            goto L7e
        L73:
            le.a r11 = p221le.UiEventsLiveData.f18671a
            java.lang.String r12 = "invalid something"
            r11.m19510t(r12)
            r12 = 3
            p221le.UiEventsLiveData.m19517m(r11, r1, r2, r12, r2)
        L7e:
            yc.u r11 = p468yc.C13195u.f34156a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p090em.PushNotificationDispatcherViewModel.m25571O(java.lang.String, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m25570P(java.lang.String r11, bd.InterfaceC1886d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof p090em.PushNotificationDispatcherViewModel.C5140c
            if (r0 == 0) goto L13
            r0 = r12
            em.e$c r0 = (p090em.PushNotificationDispatcherViewModel.C5140c) r0
            int r1 = r0.f14212A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14212A = r1
            goto L18
        L13:
            em.e$c r0 = new em.e$c
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f14215y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f14212A
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r11 = r0.f14214x
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r0 = r0.f14213w
            em.e r0 = (p090em.PushNotificationDispatcherViewModel) r0
            p468yc.C13186n.m1453b(r12)
            goto L4c
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            p468yc.C13186n.m1453b(r12)
            mg.j1 r12 = r10.f14197m
            r0.f14213w = r10
            r0.f14214x = r11
            r0.f14212A = r3
            java.lang.Object r12 = r12.m18760g(r0)
            if (r12 != r1) goto L4b
            return r1
        L4b:
            r0 = r10
        L4c:
            og.a r12 = (p276og.Result) r12
            java.lang.Object r12 = r12.m16966a()
            pt.pingodoce.app.data.remote.models.response.Store r12 = (pt.pingodoce.app.data.remote.models.response.Store) r12
            r1 = 0
            r2 = 0
            if (r12 == 0) goto L73
            int r12 = r11.length()
            if (r12 <= 0) goto L5f
            goto L60
        L5f:
            r3 = r1
        L60:
            if (r3 == 0) goto L73
            td.i0 r4 = androidx.lifecycle.C1473p0.m36987a(r0)
            r5 = 0
            r6 = 0
            em.e$d r7 = new em.e$d
            r7.<init>(r11, r2)
            r8 = 3
            r9 = 0
            kotlinx.coroutines.C6769b.m20167d(r4, r5, r6, r7, r8, r9)
            goto L7e
        L73:
            le.a r11 = p221le.UiEventsLiveData.f18671a
            java.lang.String r12 = "invalid something"
            r11.m19510t(r12)
            r12 = 3
            p221le.UiEventsLiveData.m19517m(r11, r1, r2, r12, r2)
        L7e:
            yc.u r11 = p468yc.C13195u.f34156a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p090em.PushNotificationDispatcherViewModel.m25570P(java.lang.String, bd.d):java.lang.Object");
    }
}
