package sh;

import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import ci.C2139d;
import ci.FlowViewModel;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AbstractC7425u;
import mg.LoyaltyCardManager;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p221le.UiWidgets;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13780s;
import p494zh.BaseViewModel;
import pt.pingodoce.app.data.local.flows.ElectronicInvoiceFlowData;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.LoyaltyCardResumeViewModel;
import td.InterfaceC10524i0;

/* renamed from: sh.f */
/* loaded from: classes2.dex */
public final class ElectronicInvoiceStatusViewModel extends FlowViewModel {

    /* renamed from: q */
    private final LoyaltyCardManager f26620q;

    /* renamed from: r */
    private final InterfaceC6108l f26621r;

    /* renamed from: s */
    private final C1436e0 f26622s;

    /* renamed from: t */
    private final LiveData f26623t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ElectronicInvoiceStatusViewModel.kt */
    /* renamed from: sh.f$a */
    /* loaded from: classes2.dex */
    public static final class C10212a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ ResourcesProvider f26624w;

        /* renamed from: x */
        final /* synthetic */ ElectronicInvoiceStatusViewModel f26625x;

        /* compiled from: ElectronicInvoiceStatusViewModel.kt */
        /* renamed from: sh.f$a$a */
        /* loaded from: classes2.dex */
        public static final class C10213a implements UiWidgets.InterfaceC7044a {

            /* renamed from: a */
            final /* synthetic */ ElectronicInvoiceStatusViewModel f26626a;

            /* compiled from: ElectronicInvoiceStatusViewModel.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.status.ElectronicInvoiceStatusViewModel$clickThrottle$1$1$onResponse$1", m20196f = "ElectronicInvoiceStatusViewModel.kt", m20195l = {40}, m20194m = "invokeSuspend")
            /* renamed from: sh.f$a$a$a */
            /* loaded from: classes2.dex */
            static final class C10214a extends AbstractC6764l implements InterfaceC6112p {

                /* renamed from: x */
                int f26627x;

                /* renamed from: y */
                final /* synthetic */ ElectronicInvoiceStatusViewModel f26628y;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: ElectronicInvoiceStatusViewModel.kt */
                @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.status.ElectronicInvoiceStatusViewModel$clickThrottle$1$1$onResponse$1$1", m20196f = "ElectronicInvoiceStatusViewModel.kt", m20195l = {41}, m20194m = "invokeSuspend")
                /* renamed from: sh.f$a$a$a$a */
                /* loaded from: classes2.dex */
                public static final class C10215a extends AbstractC6764l implements InterfaceC6108l {

                    /* renamed from: x */
                    int f26629x;

                    /* renamed from: y */
                    final /* synthetic */ ElectronicInvoiceStatusViewModel f26630y;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C10215a(ElectronicInvoiceStatusViewModel electronicInvoiceStatusViewModel, InterfaceC1886d interfaceC1886d) {
                        super(1, interfaceC1886d);
                        this.f26630y = electronicInvoiceStatusViewModel;
                    }

                    public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                        return new C10215a(this.f26630y, interfaceC1886d);
                    }

                    /* renamed from: d */
                    public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                        return ((C10215a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object m34636d;
                        m34636d = C2116d.m34636d();
                        int i = this.f26629x;
                        if (i == 0) {
                            C13186n.m1453b(obj);
                            LoyaltyCardManager m8499W = ElectronicInvoiceStatusViewModel.m8499W(this.f26630y);
                            String m14759b = ((ElectronicInvoiceFlowData) this.f26630y.m34578S()).m14759b();
                            this.f26629x = 1;
                            if (m8499W.m18935k(m14759b, this) == m34636d) {
                                return m34636d;
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            C13186n.m1453b(obj);
                        }
                        this.f26630y.m104v(C2139d.C2140a.f6175a);
                        return C13195u.f34156a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C10214a(ElectronicInvoiceStatusViewModel electronicInvoiceStatusViewModel, InterfaceC1886d interfaceC1886d) {
                    super(2, interfaceC1886d);
                    this.f26628y = electronicInvoiceStatusViewModel;
                }

                public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                    return new C10214a(this.f26628y, interfaceC1886d);
                }

                /* renamed from: d */
                public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                    return ((C10214a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    m34636d = C2116d.m34636d();
                    int i = this.f26627x;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        ElectronicInvoiceStatusViewModel electronicInvoiceStatusViewModel = this.f26628y;
                        C10215a c10215a = new C10215a(electronicInvoiceStatusViewModel, null);
                        this.f26627x = 1;
                        if (ElectronicInvoiceStatusViewModel.m8496Z(electronicInvoiceStatusViewModel, true, c10215a, this) == m34636d) {
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

            C10213a(ElectronicInvoiceStatusViewModel electronicInvoiceStatusViewModel) {
                this.f26626a = electronicInvoiceStatusViewModel;
            }

            /* renamed from: a */
            public void m8489a(boolean z) {
                if (z) {
                    C6772d.m20158d(C1473p0.m36987a(this.f26626a), null, null, new C10214a(this.f26626a, null), 3, null);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10212a(ResourcesProvider resourcesProvider, ElectronicInvoiceStatusViewModel electronicInvoiceStatusViewModel) {
            super(1);
            this.f26624w = resourcesProvider;
            this.f26625x = electronicInvoiceStatusViewModel;
        }

        /* renamed from: a */
        public final void m8490a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
            String string = this.f26624w.m6899a().getString(C2336R.string.dialog_caution_title);
            Intrinsics.checkIfNull(string, "ctx.getString(id)");
            String string2 = this.f26624w.m6899a().getString(C2336R.string.dialog_electronic_invoice_deactivate);
            Intrinsics.checkIfNull(string2, "ctx.getString(id)");
            UiEventsLiveData.m19519k(uiEventsLiveData, string, string2, null, null, new C10213a(this.f26625x), 12, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m8490a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ElectronicInvoiceStatusViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.status.ElectronicInvoiceStatusViewModel$updateEmail$1", m20196f = "ElectronicInvoiceStatusViewModel.kt", m20195l = {62}, m20194m = "invokeSuspend")
    /* renamed from: sh.f$b */
    /* loaded from: classes2.dex */
    public static final class C10216b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f26631x;

        /* renamed from: z */
        final /* synthetic */ String f26633z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ElectronicInvoiceStatusViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.status.ElectronicInvoiceStatusViewModel$updateEmail$1$1", m20196f = "ElectronicInvoiceStatusViewModel.kt", m20195l = {63}, m20194m = "invokeSuspend")
        /* renamed from: sh.f$b$a */
        /* loaded from: classes2.dex */
        public static final class C10217a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f26634x;

            /* renamed from: y */
            final /* synthetic */ ElectronicInvoiceStatusViewModel f26635y;

            /* renamed from: z */
            final /* synthetic */ String f26636z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10217a(ElectronicInvoiceStatusViewModel electronicInvoiceStatusViewModel, String str, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f26635y = electronicInvoiceStatusViewModel;
                this.f26636z = str;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C10217a(this.f26635y, this.f26636z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C10217a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f26634x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    LoyaltyCardManager m8499W = ElectronicInvoiceStatusViewModel.m8499W(this.f26635y);
                    String m14759b = ((ElectronicInvoiceFlowData) this.f26635y.m34578S()).m14759b();
                    String str = this.f26636z;
                    this.f26634x = 1;
                    obj = m8499W.m18939g(m14759b, str, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                AbstractC7425u abstractC7425u = (AbstractC7425u) obj;
                if (abstractC7425u instanceof AbstractC7425u.C7428b) {
                    ElectronicInvoiceStatusViewModel electronicInvoiceStatusViewModel = this.f26635y;
                    electronicInvoiceStatusViewModel.m34576U(ElectronicInvoiceFlowData.m14757e((ElectronicInvoiceFlowData) electronicInvoiceStatusViewModel.m34578S(), null, this.f26636z, null, false, 13, null));
                    ElectronicInvoiceStatusViewModel.m8497Y(this.f26635y);
                } else if (abstractC7425u instanceof AbstractC7425u.AbstractC7426a.C7427a) {
                    ElectronicInvoiceStatusViewModel.m8498X(this.f26635y, ((AbstractC7425u.AbstractC7426a.C7427a) abstractC7425u).m18463a());
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10216b(String str, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f26633z = str;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C10216b(this.f26633z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C10216b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f26631x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ElectronicInvoiceStatusViewModel electronicInvoiceStatusViewModel = ElectronicInvoiceStatusViewModel.this;
                C10217a c10217a = new C10217a(electronicInvoiceStatusViewModel, this.f26633z, null);
                this.f26631x = 1;
                if (ElectronicInvoiceStatusViewModel.m8496Z(electronicInvoiceStatusViewModel, true, c10217a, this) == m34636d) {
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
    public ElectronicInvoiceStatusViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager) {
        super(c1459l0, resourcesProvider);
        List m197g;
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        this.f26620q = loyaltyCardManager;
        this.f26621r = BaseViewModel.m113I(this, 0L, new C10212a(resourcesProvider, this), 1, null);
        m197g = C13780s.m197g();
        C1436e0 c1436e0 = new C1436e0(m197g);
        this.f26622s = c1436e0;
        this.f26623t = c1436e0;
        m8494b0();
    }

    /* renamed from: V */
    public static /* synthetic */ void m8500V(ElectronicInvoiceStatusViewModel electronicInvoiceStatusViewModel, View view) {
        m8492d0(electronicInvoiceStatusViewModel, view);
    }

    /* renamed from: W */
    public static final /* synthetic */ LoyaltyCardManager m8499W(ElectronicInvoiceStatusViewModel electronicInvoiceStatusViewModel) {
        return electronicInvoiceStatusViewModel.f26620q;
    }

    /* renamed from: X */
    public static final /* synthetic */ void m8498X(ElectronicInvoiceStatusViewModel electronicInvoiceStatusViewModel, Throwable th2) {
        electronicInvoiceStatusViewModel.m109l(th2);
    }

    /* renamed from: Y */
    public static final /* synthetic */ void m8497Y(ElectronicInvoiceStatusViewModel electronicInvoiceStatusViewModel) {
        electronicInvoiceStatusViewModel.m8494b0();
    }

    /* renamed from: Z */
    public static final /* synthetic */ Object m8496Z(ElectronicInvoiceStatusViewModel electronicInvoiceStatusViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return electronicInvoiceStatusViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: b0 */
    private final void m8494b0() {
        List m191m;
        ElectronicInvoiceFlowData electronicInvoiceFlowData = (ElectronicInvoiceFlowData) m34578S();
        C1436e0 c1436e0 = this.f26622s;
        String string = m20390g().m6899a().getString(C2336R.string.lbl_onboarding_resume_card);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        String string2 = m20390g().m6899a().getString(C2336R.string.lbl_electronic_invoice_resume_phone);
        Intrinsics.checkIfNull(string2, "ctx.getString(id)");
        String string3 = m20390g().m6899a().getString(C2336R.string.lbl_electronic_invoice_resume_email);
        Intrinsics.checkIfNull(string3, "ctx.getString(id)");
        String m14755h = electronicInvoiceFlowData.m14755h();
        String string4 = m20390g().m6899a().getString(C2336R.string.lbl_electronic_invoice_resume_email_warning);
        Intrinsics.checkIfNull(string4, "ctx.getString(id)");
        m191m = C13780s.m191m(new LoyaltyCardResumeViewModel(string, electronicInvoiceFlowData.m14756f(), null, false, null, false, false, false, 0, false, null, false, 4092, null), new LoyaltyCardResumeViewModel(string2, electronicInvoiceFlowData.m14759b(), null, false, null, false, false, false, 0, false, null, false, 4092, null), new LoyaltyCardResumeViewModel(string3, m14755h, null, false, string4, false, false, true, 0, false, null, false, 3948, null));
        c1436e0.mo166p(m191m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public static final void m8492d0(ElectronicInvoiceStatusViewModel electronicInvoiceStatusViewModel, View view) {
        Intrinsics.isThisObjectNull(electronicInvoiceStatusViewModel, "this$0");
        electronicInvoiceStatusViewModel.f26621r.mo9587d(C13195u.f34156a);
    }

    /* renamed from: a0 */
    public final LiveData m8495a0() {
        return this.f26623t;
    }

    /* renamed from: c0 */
    public final View.OnClickListener m8493c0() {
        return new View.OnClickListener() { // from class: sh.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ElectronicInvoiceStatusViewModel.m8492d0(ElectronicInvoiceStatusViewModel.this, view);
            }
        };
    }

    /* renamed from: e0 */
    public final void m8491e0(String str) {
        Intrinsics.isThisObjectNull(str, "email");
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C10216b(str, null), 3, null);
    }
}
