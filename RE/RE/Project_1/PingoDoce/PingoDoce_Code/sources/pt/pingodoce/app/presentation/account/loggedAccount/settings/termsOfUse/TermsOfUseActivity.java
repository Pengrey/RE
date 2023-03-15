package pt.pingodoce.app.presentation.account.loggedAccount.settings.termsOfUse;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.AbstractC1468o0;
import androidx.lifecycle.C1479r0;
import androidx.lifecycle.C1486s0;
import androidx.lifecycle.ViewModelProvider;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ke.ViewModelFactoryByInjection;
import p021b.ComponentActivity;
import p051d0.MaterialTheme;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p206kk.TermsAndConditionsActivity;
import p229m0.ComposableLambda;
import p314qd.InterfaceC9717b;
import p427wh.TermsOfUseViewModel;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import pt.pingodoce.app.data.remote.models.response.Consent;
import vc.AbstractActivityC11204b;

/* compiled from: TermsOfUseActivity.kt */
/* loaded from: classes2.dex */
public final class TermsOfUseActivity extends AbstractActivityC11204b {

    /* renamed from: P */
    public ViewModelFactoryByInjection f23621P;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TermsOfUseActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.termsOfUse.TermsOfUseActivity$a */
    /* loaded from: classes2.dex */
    public static final class C8936a extends AbstractC6438m implements InterfaceC6097a {
        C8936a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(TermsOfUseActivity.this.m13080k0(), TermsOfUseActivity.this, null, 2, null);
        }
    }

    /* compiled from: TermsOfUseActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.termsOfUse.TermsOfUseActivity$b */
    /* loaded from: classes2.dex */
    static final class C8937b extends AbstractC6438m implements InterfaceC6112p {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TermsOfUseActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.termsOfUse.TermsOfUseActivity$b$a */
        /* loaded from: classes2.dex */
        public static final class C8938a extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            final /* synthetic */ TermsOfUseActivity f23624w;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TermsOfUseActivity.kt */
            /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.termsOfUse.TermsOfUseActivity$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C8939a extends AbstractC6438m implements InterfaceC6108l {

                /* renamed from: w */
                final /* synthetic */ TermsOfUseActivity f23625w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C8939a(TermsOfUseActivity termsOfUseActivity) {
                    super(1);
                    this.f23625w = termsOfUseActivity;
                }

                /* renamed from: a */
                public final void m13071a(Consent consent) {
                    Intrinsics.isThisObjectNull(consent, "it");
                    TermsAndConditionsActivity.m20277a(this.f23625w, consent.m13865c(), consent.m13866b(), false);
                }

                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                    m13071a((Consent) obj);
                    return C13195u.f34156a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TermsOfUseActivity.kt */
            /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.termsOfUse.TermsOfUseActivity$b$a$b */
            /* loaded from: classes2.dex */
            public static final class C8940b extends AbstractC6438m implements InterfaceC6097a {

                /* renamed from: w */
                final /* synthetic */ TermsOfUseActivity f23626w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C8940b(TermsOfUseActivity termsOfUseActivity) {
                    super(0);
                    this.f23626w = termsOfUseActivity;
                }

                /* renamed from: a */
                public final void m13070a() {
                    this.f23626w.finish();
                }

                /* renamed from: q */
                public /* bridge */ /* synthetic */ Object mo42214q() {
                    m13070a();
                    return C13195u.f34156a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8938a(TermsOfUseActivity termsOfUseActivity) {
                super(2);
                this.f23624w = termsOfUseActivity;
            }

            /* renamed from: F */
            public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                m13072a((InterfaceC5179i) obj, ((Number) obj2).intValue());
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m13072a(InterfaceC5179i interfaceC5179i, int i) {
                if ((i & 11) == 2 && interfaceC5179i.mo25245y()) {
                    interfaceC5179i.mo25264f();
                } else {
                    p427wh.TermsOfUseActivity.m3551d(TermsOfUseActivity.m13081j0(this.f23624w), new C8939a(this.f23624w), new C8940b(this.f23624w), interfaceC5179i, 8);
                }
            }
        }

        C8937b() {
            super(2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m13073a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m13073a(InterfaceC5179i interfaceC5179i, int i) {
            if ((i & 11) == 2 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
            } else {
                MaterialTheme.m27106a(null, null, null, ComposableLambda.m19327b(interfaceC5179i, -385793651, true, new C8938a(TermsOfUseActivity.this)), interfaceC5179i, 3072, 7);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TermsOfUseActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.termsOfUse.TermsOfUseActivity$c */
    /* loaded from: classes2.dex */
    public static final class C8941c extends AbstractC6438m implements InterfaceC6097a {
        C8941c() {
            super(0);
        }

        /* renamed from: a */
        public final C1486s0 mo42214q() {
            C1486s0 mo36970z = TermsOfUseActivity.this.mo36970z();
            Intrinsics.checkIfNull(mo36970z, "viewModelStore");
            return mo36970z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TermsOfUseActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.termsOfUse.TermsOfUseActivity$d */
    /* loaded from: classes2.dex */
    public static final class C8942d extends AbstractC6438m implements InterfaceC6097a {
        C8942d() {
            super(0);
        }

        /* renamed from: a */
        public final C1479r0.InterfaceC1481b mo42214q() {
            C1479r0.InterfaceC1481b mo36992p = TermsOfUseActivity.this.mo36992p();
            Intrinsics.checkIfNull(mo36992p, "defaultViewModelProviderFactory");
            return mo36992p;
        }
    }

    /* renamed from: j0 */
    public static final /* synthetic */ TermsOfUseViewModel m13081j0(TermsOfUseActivity termsOfUseActivity) {
        return termsOfUseActivity.m13077n0();
    }

    /* renamed from: l0 */
    private final InterfaceC9717b m13079l0() {
        return C6450z.m20906b(TermsOfUseViewModel.class);
    }

    /* renamed from: m0 */
    private final InterfaceC6097a m13078m0() {
        return new C8936a();
    }

    /* renamed from: n0 */
    private final TermsOfUseViewModel m13077n0() {
        return (TermsOfUseViewModel) m13076o0(m13075p0(m13079l0(), m13078m0()));
    }

    /* renamed from: o0 */
    private static final AbstractC1468o0 m13076o0(InterfaceC13178g interfaceC13178g) {
        return (AbstractC1468o0) interfaceC13178g.getValue();
    }

    /* renamed from: p0 */
    private final InterfaceC13178g m13075p0(InterfaceC9717b interfaceC9717b, InterfaceC6097a interfaceC6097a) {
        C8941c c8941c = new C8941c();
        if (interfaceC6097a == null) {
            interfaceC6097a = new C8942d();
        }
        return new ViewModelProvider(interfaceC9717b, c8941c, interfaceC6097a);
    }

    /* renamed from: k0 */
    public final ViewModelFactoryByInjection m13080k0() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23621P;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivity.m35421b(this, null, ComposableLambda.m19326c(1282360033, true, new C8937b()), 1, null);
    }
}
