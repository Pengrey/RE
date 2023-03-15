package pt.pingodoce.app.presentation.account.loggedAccount.settings;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.lifecycle.AbstractC1423a;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.bottomsheet.DialogC3502a;
import com.google.android.material.button.MaterialButton;
import dk.TailoredForYouActivity;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import ke.ViewModelFactoryByInjection;
import me.InterfaceC7186c;
import ne.EventObserver;
import p050d.C4519c;
import p124gk.SplashActivity;
import p162ig.Term;
import p165ij.SnackBarLiveData;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p206kk.TermsAndConditionsActivity;
import p221le.UiEventsLiveData;
import p277oh.DeleteAccountActivity;
import p314qd.InterfaceC9717b;
import p388uh.NotificationsActivity;
import p406vh.ChangePinActivity;
import p426wg.AbstractC11757f3;
import p427wh.TermsOfUseActivity;
import p428wi.LoyaltyCardInvitesActivity;
import p468yc.C13182l;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p494zh.BaseActivity;
import p494zh.C13812b0;
import p494zh.C13815b3;
import p494zh.C13822d0;
import p494zh.C13836g0;
import p494zh.C13837g1;
import p494zh.C13891q0;
import p494zh.C13903t0;
import p494zh.C13915w0;
import p494zh.C13926z;
import pe.C8618e;
import ph.ElectronicInvoiceActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.SettingsActivity;

/* compiled from: SettingsActivity.kt */
/* loaded from: classes2.dex */
public final class SettingsActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f23466f0;

    /* renamed from: g0 */
    private final AbstractC0304b f23467g0;

    /* renamed from: h0 */
    private final AbstractC0304b f23468h0;

    /* compiled from: SettingsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.SettingsActivity$a */
    /* loaded from: classes2.dex */
    static final class C8873a extends AbstractC6438m implements InterfaceC6097a {
        C8873a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(SettingsActivity.this.m13355o1(), SettingsActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.SettingsActivity$b */
    /* loaded from: classes2.dex */
    public static final class C8874b extends AbstractC6438m implements InterfaceC6108l {
        C8874b() {
            super(1);
        }

        /* renamed from: a */
        public final void m13347a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "it");
            InterfaceC7186c interfaceC7186c = (InterfaceC7186c) c13182l.m1460c();
            if (Intrinsics.equals(interfaceC7186c, C13837g1.f34945a)) {
                NotificationsActivity.m6792a(SettingsActivity.this);
            } else if (Intrinsics.equals(interfaceC7186c, C13915w0.f35036a)) {
                TailoredForYouActivity.m26361a(SettingsActivity.this);
            } else if (Intrinsics.equals(interfaceC7186c, C13903t0.f35024a)) {
                LoyaltyCardInvitesActivity.m3527b(SettingsActivity.this);
            } else if (Intrinsics.equals(interfaceC7186c, C13836g0.f34944a)) {
                ElectronicInvoiceActivity.m14985a(SettingsActivity.m13360k1(SettingsActivity.this), SettingsActivity.this);
            } else if (Intrinsics.equals(interfaceC7186c, C13926z.f35047a)) {
                ChangePinActivity.m5357a(SettingsActivity.m13359l1(SettingsActivity.this), SettingsActivity.this);
            } else if (Intrinsics.equals(interfaceC7186c, C13815b3.f34923a)) {
                Term term = (Term) c13182l.m1459d();
                TermsAndConditionsActivity.m20277a(SettingsActivity.this, term.m22124a(), term.m22123b(), false);
            } else if (Intrinsics.equals(interfaceC7186c, C13891q0.f35012a)) {
                SplashActivity.m23306c(SettingsActivity.this);
            } else if (Intrinsics.equals(interfaceC7186c, C13812b0.f34920a)) {
                TermsOfUseActivity.m3550e(SettingsActivity.this);
            } else if (Intrinsics.equals(interfaceC7186c, C13822d0.f34929a)) {
                SettingsActivity.m13358m1(SettingsActivity.this);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m13347a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.SettingsActivity$c */
    /* loaded from: classes2.dex */
    public static final class C8875c extends AbstractC6438m implements InterfaceC6097a {
        C8875c() {
            super(0);
        }

        /* renamed from: a */
        public static /* synthetic */ void m13346a(DialogC3502a dialogC3502a, View view) {
            m13342e(dialogC3502a, view);
        }

        /* renamed from: b */
        public static /* synthetic */ void m13345b(SettingsActivity settingsActivity, DialogC3502a dialogC3502a, View view) {
            m13343d(settingsActivity, dialogC3502a, view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m13343d(SettingsActivity settingsActivity, DialogC3502a dialogC3502a, View view) {
            Intrinsics.isThisObjectNull(settingsActivity, "this$0");
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            DeleteAccountActivity.m16957a(settingsActivity);
            dialogC3502a.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m13342e(DialogC3502a dialogC3502a, View view) {
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            dialogC3502a.dismiss();
        }

        /* renamed from: c */
        public final DialogC3502a mo42214q() {
            final DialogC3502a dialogC3502a = new DialogC3502a(SettingsActivity.this);
            final SettingsActivity settingsActivity = SettingsActivity.this;
            View inflate = dialogC3502a.getLayoutInflater().inflate(C2336R.layout.bottomsheet_for_notifiations_confirmation, (ViewGroup) null);
            dialogC3502a.setContentView(inflate);
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2336R.C2338id.not_ok_MaterialButton);
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2336R.C2338id.ok_MaterialButton);
            ((TextView) inflate.findViewById(C2336R.C2338id.const_header)).setText(settingsActivity.getString(C2336R.string.lbl_settings_delete_account_bottom_sheet_header));
            ((TextView) inflate.findViewById(C2336R.C2338id.const_body)).setText(settingsActivity.getString(C2336R.string.lbl_settings_delete_account_bottom_sheet_desc));
            materialButton2.setText(settingsActivity.getString(C2336R.string.btn_cancel));
            materialButton.setText(settingsActivity.getString(C2336R.string.btn_accept));
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.account.loggedAccount.settings.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingsActivity.C8875c.m13343d(SettingsActivity.this, dialogC3502a, view);
                }
            });
            materialButton2.setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.account.loggedAccount.settings.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingsActivity.C8875c.m13342e(DialogC3502a.this, view);
                }
            });
            dialogC3502a.setCancelable(false);
            return dialogC3502a;
        }
    }

    public SettingsActivity() {
        AbstractC0304b m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: nh.b
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                SettingsActivity.m13352r1(SettingsActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…success))\n        }\n    }");
        this.f23467g0 = m41364M;
        AbstractC0304b m41364M2 = m41364M(new C4519c(), new InterfaceC0303a() { // from class: nh.a
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                SettingsActivity.m13353q1(SettingsActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M2, "registerForActivityResul…success))\n        }\n    }");
        this.f23468h0 = m41364M2;
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m13362i1(SettingsActivity settingsActivity, ActivityResult activityResult) {
        m13353q1(settingsActivity, activityResult);
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m13361j1(SettingsActivity settingsActivity, ActivityResult activityResult) {
        m13352r1(settingsActivity, activityResult);
    }

    /* renamed from: k1 */
    public static final /* synthetic */ AbstractC0304b m13360k1(SettingsActivity settingsActivity) {
        return settingsActivity.f23468h0;
    }

    /* renamed from: l1 */
    public static final /* synthetic */ AbstractC0304b m13359l1(SettingsActivity settingsActivity) {
        return settingsActivity.f23467g0;
    }

    /* renamed from: m1 */
    public static final /* synthetic */ void m13358m1(SettingsActivity settingsActivity) {
        settingsActivity.m13351s1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m13353q1(SettingsActivity settingsActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(settingsActivity, "this$0");
        if (activityResult.m41351b() == -1) {
            SnackBarLiveData snackBarLiveData = SnackBarLiveData.f16957a;
            String string = settingsActivity.getString(C2336R.string.lbl_electronic_invoice_disabled_success);
            Intrinsics.checkIfNull(string, "getString(R.string.lbl_e…invoice_disabled_success)");
            SnackBarLiveData.m21968c(snackBarLiveData, string, null, 0, 0, 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m13352r1(SettingsActivity settingsActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(settingsActivity, "this$0");
        if (activityResult.m41351b() == -1) {
            SnackBarLiveData snackBarLiveData = SnackBarLiveData.f16957a;
            String string = settingsActivity.getString(C2336R.string.lbl_settings_change_pin_success);
            Intrinsics.checkIfNull(string, "getString(R.string.lbl_s…tings_change_pin_success)");
            SnackBarLiveData.m21968c(snackBarLiveData, string, null, 0, 0, 14, null);
        }
    }

    /* renamed from: s1 */
    private final void m13351s1() {
        InterfaceC13178g m1464a;
        m1464a = LazyJVM.m1464a(new C8875c());
        m13350t1(m1464a).show();
    }

    /* renamed from: t1 */
    private static final DialogC3502a m13350t1(InterfaceC13178g interfaceC13178g) {
        return (DialogC3502a) interfaceC13178g.getValue();
    }

    /* renamed from: D0 */
    protected int mo11827D0() {
        return C2336R.C2337drawable.ic_close;
    }

    /* renamed from: G0 */
    protected int m13366G0() {
        return C2336R.string.lbl_settings;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13365J0() {
        return C6450z.m20906b(SettingsViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13364K0() {
        return new C8873a();
    }

    /* renamed from: n */
    public boolean m13357n() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n1 */
    public C8618e mo42216v0() {
        return new C8618e();
    }

    /* renamed from: o1 */
    public final ViewModelFactoryByInjection m13355o1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23466f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p1 */
    public void m13363P0(AbstractC11757f3 abstractC11757f3, SettingsViewModel settingsViewModel) {
        Intrinsics.isThisObjectNull(abstractC11757f3, "binding");
        Intrinsics.isThisObjectNull(settingsViewModel, "viewModel");
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C8874b()));
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_settings;
    }
}
