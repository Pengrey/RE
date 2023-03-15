package pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.status;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import cd.C2116d;
import ci.C2139d;
import ci.FlowActivity;
import ci.InterfaceC2154o;
import com.github.aachartmodel.aainfographics.C2336R;
import ee.CustomDividerItemDecoration;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p050d.C4519c;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p318qh.ElectronicInvoiceEditEmailActivity;
import p426wg.AbstractC12073w;
import p451xi.LoyaltyCardResumeAdapter;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13780s;
import pe.C8617d;
import pt.pingodoce.app.data.local.flows.ElectronicInvoiceFlowData;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.status.ElectronicInvoiceStatusActivity;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.EnumC9077a;
import sh.ElectronicInvoiceStatusViewModel;
import td.InterfaceC10524i0;

/* compiled from: ElectronicInvoiceStatusActivity.kt */
/* loaded from: classes2.dex */
public final class ElectronicInvoiceStatusActivity extends FlowActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f23519g0;

    /* renamed from: h0 */
    private final AbstractC0304b f23520h0;

    /* compiled from: ElectronicInvoiceStatusActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.status.ElectronicInvoiceStatusActivity$a */
    /* loaded from: classes2.dex */
    static final class C8895a extends AbstractC6438m implements InterfaceC6097a {
        C8895a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m13247w1 = ElectronicInvoiceStatusActivity.this.m13247w1();
            ElectronicInvoiceStatusActivity electronicInvoiceStatusActivity = ElectronicInvoiceStatusActivity.this;
            return m13247w1.m20377b(electronicInvoiceStatusActivity, electronicInvoiceStatusActivity.getIntent().getExtras());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ElectronicInvoiceStatusActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.status.ElectronicInvoiceStatusActivity$initViews$1$1", m20196f = "ElectronicInvoiceStatusActivity.kt", m20195l = {59}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.status.ElectronicInvoiceStatusActivity$b */
    /* loaded from: classes2.dex */
    public static final class C8896b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23522x;

        /* renamed from: y */
        final /* synthetic */ LoyaltyCardResumeAdapter f23523y;

        /* renamed from: z */
        final /* synthetic */ List f23524z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8896b(LoyaltyCardResumeAdapter loyaltyCardResumeAdapter, List list, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23523y = loyaltyCardResumeAdapter;
            this.f23524z = list;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8896b(this.f23523y, this.f23524z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8896b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23522x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoyaltyCardResumeAdapter loyaltyCardResumeAdapter = this.f23523y;
                List list = this.f23524z;
                Intrinsics.checkIfNull(list, "it");
                this.f23522x = 1;
                if (loyaltyCardResumeAdapter.m22148H(list, this) == m34636d) {
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
    /* compiled from: ElectronicInvoiceStatusActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.status.ElectronicInvoiceStatusActivity$c */
    /* loaded from: classes2.dex */
    public static final class C8897c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: x */
        final /* synthetic */ ElectronicInvoiceStatusViewModel f23526x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8897c(ElectronicInvoiceStatusViewModel electronicInvoiceStatusViewModel) {
            super(1);
            this.f23526x = electronicInvoiceStatusViewModel;
        }

        /* renamed from: a */
        public final void m13241a(EnumC9077a enumC9077a) {
            Intrinsics.isThisObjectNull(enumC9077a, "action");
            if (enumC9077a == EnumC9077a.EDIT) {
                ElectronicInvoiceEditEmailActivity.m10088a(ElectronicInvoiceStatusActivity.m13250t1(ElectronicInvoiceStatusActivity.this), ElectronicInvoiceStatusActivity.this, ((ElectronicInvoiceFlowData) this.f23526x.m34578S()).m14755h());
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m13241a((EnumC9077a) obj);
            return C13195u.f34156a;
        }
    }

    public ElectronicInvoiceStatusActivity() {
        AbstractC0304b m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: sh.a
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                ElectronicInvoiceStatusActivity.m13249u1(ElectronicInvoiceStatusActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…ail(it) }\n        }\n    }");
        this.f23520h0 = m41364M;
    }

    /* renamed from: r1 */
    public static /* synthetic */ void m13252r1(ElectronicInvoiceStatusActivity electronicInvoiceStatusActivity, LoyaltyCardResumeAdapter loyaltyCardResumeAdapter, List list) {
        m13244y1(electronicInvoiceStatusActivity, loyaltyCardResumeAdapter, list);
    }

    /* renamed from: s1 */
    public static /* synthetic */ void m13251s1(ElectronicInvoiceStatusActivity electronicInvoiceStatusActivity, ActivityResult activityResult) {
        m13249u1(electronicInvoiceStatusActivity, activityResult);
    }

    /* renamed from: t1 */
    public static final /* synthetic */ AbstractC0304b m13250t1(ElectronicInvoiceStatusActivity electronicInvoiceStatusActivity) {
        return electronicInvoiceStatusActivity.f23520h0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m13249u1(ElectronicInvoiceStatusActivity electronicInvoiceStatusActivity, ActivityResult activityResult) {
        Intent m41352a;
        Bundle extras;
        String string;
        Intrinsics.isThisObjectNull(electronicInvoiceStatusActivity, "this$0");
        if (activityResult.m41351b() != -1 || (m41352a = activityResult.m41352a()) == null || (extras = m41352a.getExtras()) == null || (string = extras.getString("EXTRA_FOR_EMAIL")) == null) {
            return;
        }
        ((ElectronicInvoiceStatusViewModel) electronicInvoiceStatusActivity.m22758I0()).m8491e0(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m13244y1(ElectronicInvoiceStatusActivity electronicInvoiceStatusActivity, LoyaltyCardResumeAdapter loyaltyCardResumeAdapter, List list) {
        Intrinsics.isThisObjectNull(electronicInvoiceStatusActivity, "this$0");
        Intrinsics.isThisObjectNull(loyaltyCardResumeAdapter, "$adapter");
        C6772d.m20158d(LifecycleOwner.m36965a(electronicInvoiceStatusActivity), null, null, new C8896b(loyaltyCardResumeAdapter, list, null), 3, null);
    }

    /* renamed from: G0 */
    protected int m13260G0() {
        return C2336R.string.lbl_electronic_invoice_details;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13259J0() {
        return C6450z.m20906b(ElectronicInvoiceStatusViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13258K0() {
        return new C8895a();
    }

    /* renamed from: k1 */
    protected List m13256k1() {
        List m194j;
        m194j = C13780s.m194j(C2139d.f6174a, C2139d.C2140a.f6175a);
        return m194j;
    }

    /* renamed from: l1 */
    protected void m13255l1(InterfaceC2154o interfaceC2154o) {
        Intrinsics.isThisObjectNull(interfaceC2154o, "flow");
        if (Intrinsics.equals(interfaceC2154o, C2139d.C2140a.f6175a)) {
            setResult(-1);
        }
    }

    /* renamed from: m1 */
    public void m13254m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
    }

    public void onBackPressed() {
        ((ElectronicInvoiceStatusViewModel) m22758I0()).m104v(C2139d.f6174a);
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: w1 */
    public final ViewModelFactoryByInjection m13247w1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23519g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_electronic_invoice_status;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x1 */
    public void m13253n1(AbstractC12073w abstractC12073w, ElectronicInvoiceStatusViewModel electronicInvoiceStatusViewModel) {
        Intrinsics.isThisObjectNull(abstractC12073w, "binding");
        Intrinsics.isThisObjectNull(electronicInvoiceStatusViewModel, "viewModel");
        super.m34589n1(abstractC12073w, electronicInvoiceStatusViewModel);
        final LoyaltyCardResumeAdapter loyaltyCardResumeAdapter = new LoyaltyCardResumeAdapter(new C8897c(electronicInvoiceStatusViewModel));
        abstractC12073w.f31746z.m36657h(new CustomDividerItemDecoration(this, 16, 0, 0, 0, 28, null));
        abstractC12073w.f31746z.setAdapter(loyaltyCardResumeAdapter);
        electronicInvoiceStatusViewModel.m8495a0().mo171i(this, new InterfaceC1440f0() { // from class: sh.b
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ElectronicInvoiceStatusActivity.m13244y1(ElectronicInvoiceStatusActivity.this, loyaltyCardResumeAdapter, (List) obj);
            }
        });
    }
}
