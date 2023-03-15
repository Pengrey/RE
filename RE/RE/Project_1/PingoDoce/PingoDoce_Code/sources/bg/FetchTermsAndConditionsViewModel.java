package bg;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.ConsentsManager;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p276og.C8082c;
import p276og.Result;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import pt.pingodoce.app.data.remote.models.response.Consent;
import td.InterfaceC10524i0;

/* renamed from: bg.a */
/* loaded from: classes2.dex */
public final class FetchTermsAndConditionsViewModel extends BaseViewModel {

    /* renamed from: m */
    private final ConsentsManager f5644m;

    /* renamed from: n */
    private final C1436e0 f5645n;

    /* renamed from: o */
    private final LiveData f5646o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FetchTermsAndConditionsViewModel.kt */
    @InterfaceC6759f(m20197c = "presentation.login.phone.terms.FetchTermsAndConditionsViewModel$fetchTermsAndConditions$1", m20196f = "FetchTermsAndConditionsViewModel.kt", m20195l = {30}, m20194m = "invokeSuspend")
    /* renamed from: bg.a$a */
    /* loaded from: classes2.dex */
    public static final class C1901a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f5647x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FetchTermsAndConditionsViewModel.kt */
        @InterfaceC6759f(m20197c = "presentation.login.phone.terms.FetchTermsAndConditionsViewModel$fetchTermsAndConditions$1$1", m20196f = "FetchTermsAndConditionsViewModel.kt", m20195l = {31}, m20194m = "invokeSuspend")
        /* renamed from: bg.a$a$a */
        /* loaded from: classes2.dex */
        public static final class C1902a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f5649x;

            /* renamed from: y */
            final /* synthetic */ FetchTermsAndConditionsViewModel f5650y;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: FetchTermsAndConditionsViewModel.kt */
            /* renamed from: bg.a$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C1903a extends AbstractC6438m implements InterfaceC6108l {

                /* renamed from: w */
                final /* synthetic */ FetchTermsAndConditionsViewModel f5651w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1903a(FetchTermsAndConditionsViewModel fetchTermsAndConditionsViewModel) {
                    super(1);
                    this.f5651w = fetchTermsAndConditionsViewModel;
                }

                /* renamed from: a */
                public final void m35152a(Consent consent) {
                    Intrinsics.isThisObjectNull(consent, "it");
                    FetchTermsAndConditionsViewModel.m35158M(this.f5651w).mo166p(consent.m13866b());
                }

                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                    m35152a((Consent) obj);
                    return C13195u.f34156a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1902a(FetchTermsAndConditionsViewModel fetchTermsAndConditionsViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f5650y = fetchTermsAndConditionsViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C1902a(this.f5650y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C1902a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f5649x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    ConsentsManager m35159L = FetchTermsAndConditionsViewModel.m35159L(this.f5650y);
                    this.f5649x = 1;
                    obj = m35159L.m18565f(this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                C8082c.m16958b((Result) obj, new C1903a(this.f5650y));
                return C13195u.f34156a;
            }
        }

        C1901a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C1901a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C1901a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f5647x;
            if (i == 0) {
                C13186n.m1453b(obj);
                FetchTermsAndConditionsViewModel fetchTermsAndConditionsViewModel = FetchTermsAndConditionsViewModel.this;
                C1902a c1902a = new C1902a(fetchTermsAndConditionsViewModel, null);
                this.f5647x = 1;
                if (FetchTermsAndConditionsViewModel.m35157N(fetchTermsAndConditionsViewModel, true, c1902a, this) == m34636d) {
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
    public FetchTermsAndConditionsViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, ConsentsManager consentsManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(consentsManager, "consentsManager");
        this.f5644m = consentsManager;
        C1436e0 m37003d = c1459l0.m37003d("_termsUrl", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData<String>(\"_termsUrl\", \"\")");
        this.f5645n = m37003d;
        this.f5646o = m37003d;
    }

    /* renamed from: L */
    public static final /* synthetic */ ConsentsManager m35159L(FetchTermsAndConditionsViewModel fetchTermsAndConditionsViewModel) {
        return fetchTermsAndConditionsViewModel.f5644m;
    }

    /* renamed from: M */
    public static final /* synthetic */ C1436e0 m35158M(FetchTermsAndConditionsViewModel fetchTermsAndConditionsViewModel) {
        return fetchTermsAndConditionsViewModel.f5645n;
    }

    /* renamed from: N */
    public static final /* synthetic */ Object m35157N(FetchTermsAndConditionsViewModel fetchTermsAndConditionsViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return fetchTermsAndConditionsViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: O */
    public final void m35156O() {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C1901a(null), 3, null);
    }

    /* renamed from: P */
    public final LiveData m35155P() {
        return this.f5646o;
    }
}
