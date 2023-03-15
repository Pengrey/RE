package pt.pingodoce.app.presentation.login.phone.validate;

import android.text.Html;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.lifecycle.AbstractC1423a;
import ci.C2142f;
import ci.C2143g;
import ci.C2146h;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.bottomsheet.DialogC3502a;
import com.google.android.material.button.MaterialButton;
import fm.C5579c;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import lk.EnumC7070a;
import mk.UpdatePhoneActivity;
import ne.EventObserver;
import p050d.C4519c;
import p162ig.Term;
import p165ij.SnackBarLiveData;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p187jk.PhoneActivity;
import p206kk.TermsAndConditionsActivity;
import p258nk.LoginPhoneViewModel;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11828j2;
import p468yc.C13182l;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.C13848i2;
import p494zh.C13897r2;
import p494zh.C13900s1;
import p494zh.C13901s2;
import p494zh.C13922y;
import pe.C8617d;
import pk.InsertPinActivity;
import pt.pingodoce.app.data.local.flows.LoginFlowData;
import pt.pingodoce.app.presentation.login.phone.validate.LoginPhoneActivity;
import tk.SmsValidationActivity;

/* compiled from: LoginPhoneActivity.kt */
/* loaded from: classes2.dex */
public final class LoginPhoneActivity extends PhoneActivity {

    /* renamed from: h0 */
    public ViewModelFactoryByInjection f24477h0;

    /* renamed from: i0 */
    private boolean f24478i0;

    /* renamed from: j0 */
    private final AbstractC0304b f24479j0;

    /* compiled from: LoginPhoneActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.login.phone.validate.LoginPhoneActivity$a */
    /* loaded from: classes2.dex */
    static final class C9302a extends AbstractC6438m implements InterfaceC6097a {
        C9302a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(LoginPhoneActivity.this.m11793F1(), LoginPhoneActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoginPhoneActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.login.phone.validate.LoginPhoneActivity$b */
    /* loaded from: classes2.dex */
    public static final class C9303b extends AbstractC6438m implements InterfaceC6108l {
        C9303b() {
            super(1);
        }

        /* renamed from: a */
        public final void m11778a(Term term) {
            Intrinsics.isThisObjectNull(term, "term");
            TermsAndConditionsActivity.m20276b(LoginPhoneActivity.this, term.m22124a(), term.m22123b(), false, 4, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m11778a((Term) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: LoginPhoneActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.login.phone.validate.LoginPhoneActivity$c */
    /* loaded from: classes2.dex */
    public static final class C9304c extends ClickableSpan {
        C9304c() {
        }

        public void onClick(View view) {
            Intrinsics.isThisObjectNull(view, "textView");
            LoginPhoneActivity.m11797B1(LoginPhoneActivity.this).m17540W0(C5579c.m23717b(this, (TextView) view), EnumC7070a.PRIVACY);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.isThisObjectNull(textPaint, "ds");
        }
    }

    /* compiled from: LoginPhoneActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.login.phone.validate.LoginPhoneActivity$d */
    /* loaded from: classes2.dex */
    public static final class C9305d extends ClickableSpan {
        C9305d() {
        }

        public void onClick(View view) {
            Intrinsics.isThisObjectNull(view, "textView");
            LoginPhoneActivity.m11797B1(LoginPhoneActivity.this).m17540W0(C5579c.m23717b(this, (TextView) view), EnumC7070a.TERM_OF_USE);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.isThisObjectNull(textPaint, "ds");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoginPhoneActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.login.phone.validate.LoginPhoneActivity$e */
    /* loaded from: classes2.dex */
    public static final class C9306e extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: x */
        final /* synthetic */ boolean f24485x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9306e(boolean z) {
            super(0);
            this.f24485x = z;
        }

        /* renamed from: a */
        public static /* synthetic */ void m11777a(LoginPhoneActivity loginPhoneActivity, DialogC3502a dialogC3502a, boolean z, View view) {
            m11774d(loginPhoneActivity, dialogC3502a, z, view);
        }

        /* renamed from: b */
        public static /* synthetic */ void m11776b(LoginPhoneActivity loginPhoneActivity, DialogC3502a dialogC3502a, View view) {
            m11773e(loginPhoneActivity, dialogC3502a, view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m11774d(LoginPhoneActivity loginPhoneActivity, DialogC3502a dialogC3502a, boolean z, View view) {
            Intrinsics.isThisObjectNull(loginPhoneActivity, "this$0");
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            LoginPhoneActivity.m11797B1(loginPhoneActivity).m17537Z0();
            dialogC3502a.dismiss();
            if (!LoginPhoneActivity.m11796C1(loginPhoneActivity) && z) {
                SmsValidationActivity.m7451a(loginPhoneActivity, (LoginFlowData) LoginPhoneActivity.m11797B1(loginPhoneActivity).m34578S());
            } else {
                InsertPinActivity.m14936b(loginPhoneActivity, (LoginFlowData) LoginPhoneActivity.m11797B1(loginPhoneActivity).m34578S());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m11773e(LoginPhoneActivity loginPhoneActivity, DialogC3502a dialogC3502a, View view) {
            Intrinsics.isThisObjectNull(loginPhoneActivity, "this$0");
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            LoginPhoneActivity.m11797B1(loginPhoneActivity).m17536a1();
            dialogC3502a.dismiss();
        }

        /* renamed from: c */
        public final DialogC3502a mo42214q() {
            final DialogC3502a dialogC3502a = new DialogC3502a(LoginPhoneActivity.this);
            final LoginPhoneActivity loginPhoneActivity = LoginPhoneActivity.this;
            final boolean z = this.f24485x;
            View inflate = dialogC3502a.getLayoutInflater().inflate(C2336R.layout.bottomsheet_for_terms_rgpd_layout, (ViewGroup) null);
            dialogC3502a.setContentView(inflate);
            TextView textView = (TextView) inflate.findViewById(C2336R.C2338id.tv_term_conditions);
            if (textView != null) {
                textView.setText(Html.fromHtml(loginPhoneActivity.getString(C2336R.string.lbl_consents_description), 0));
            }
            ((MaterialButton) inflate.findViewById(C2336R.C2338id.btn_term_accept)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.login.phone.validate.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginPhoneActivity.C9306e.m11774d(LoginPhoneActivity.this, dialogC3502a, z, view);
                }
            });
            ((MaterialButton) inflate.findViewById(C2336R.C2338id.btn_term_cancel)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.login.phone.validate.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginPhoneActivity.C9306e.m11773e(LoginPhoneActivity.this, dialogC3502a, view);
                }
            });
            dialogC3502a.setCancelable(false);
            Intrinsics.checkIfNull(textView, "tvTermConditions");
            LoginPhoneActivity.m11795D1(loginPhoneActivity, textView);
            return dialogC3502a;
        }
    }

    public LoginPhoneActivity() {
        AbstractC0304b m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: nk.a
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                LoginPhoneActivity.m11791H1(LoginPhoneActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…success))\n        }\n    }");
        this.f24479j0 = m41364M;
    }

    /* renamed from: A1 */
    public static /* synthetic */ void m11798A1(LoginPhoneActivity loginPhoneActivity, ActivityResult activityResult) {
        m11791H1(loginPhoneActivity, activityResult);
    }

    /* renamed from: B1 */
    public static final /* synthetic */ LoginPhoneViewModel m11797B1(LoginPhoneActivity loginPhoneActivity) {
        return (LoginPhoneViewModel) loginPhoneActivity.m22758I0();
    }

    /* renamed from: C1 */
    public static final /* synthetic */ boolean m11796C1(LoginPhoneActivity loginPhoneActivity) {
        return loginPhoneActivity.f24478i0;
    }

    /* renamed from: D1 */
    public static final /* synthetic */ void m11795D1(LoginPhoneActivity loginPhoneActivity, TextView textView) {
        loginPhoneActivity.m11790I1(textView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m11791H1(LoginPhoneActivity loginPhoneActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(loginPhoneActivity, "this$0");
        if (activityResult.m41351b() == -1) {
            SnackBarLiveData snackBarLiveData = SnackBarLiveData.f16957a;
            String string = loginPhoneActivity.getString(C2336R.string.lbl_change_phone_success);
            Intrinsics.checkIfNull(string, "getString(R.string.lbl_change_phone_success)");
            SnackBarLiveData.m21968c(snackBarLiveData, string, null, 0, 0, 14, null);
        }
    }

    /* renamed from: I1 */
    private final void m11790I1(TextView textView) {
        SpannableString spannableString = new SpannableString(textView.getText());
        C9305d c9305d = new C9305d();
        C9304c c9304c = new C9304c();
        spannableString.setSpan(c9305d, 196, 209, 33);
        spannableString.setSpan(c9304c, 211, 250, 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
    }

    /* renamed from: J1 */
    private final void m11788J1(boolean z) {
        InterfaceC13178g m1464a;
        m1464a = LazyJVM.m1464a(new C9306e(z));
        m11786K1(m1464a).show();
    }

    /* renamed from: K1 */
    private static final DialogC3502a m11786K1(InterfaceC13178g interfaceC13178g) {
        return (DialogC3502a) interfaceC13178g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: F1 */
    public final ViewModelFactoryByInjection m11793F1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24477h0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G1 */
    public void m11781u1(AbstractC11828j2 abstractC11828j2, LoginPhoneViewModel loginPhoneViewModel) {
        Intrinsics.isThisObjectNull(abstractC11828j2, "binding");
        Intrinsics.isThisObjectNull(loginPhoneViewModel, "viewModel");
        super.m20739u1(abstractC11828j2, loginPhoneViewModel);
        loginPhoneViewModel.m17539X0().mo171i(this, new EventObserver(new C9303b()));
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11789J0() {
        return C6450z.m20906b(LoginPhoneViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11787K0() {
        return new C9302a();
    }

    /* renamed from: k1 */
    protected List m11784k1() {
        List m194j;
        m194j = C13780s.m194j(C2142f.f6177a, C2143g.f6178a, C2146h.f6181a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m11783m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        AbstractC13816c abstractC13816c = (AbstractC13816c) c13182l.m1460c();
        if (Intrinsics.equals(abstractC13816c, C13901s2.f35022a)) {
            this.f24478i0 = true;
            m11788J1(((LoginFlowData) c13182l.m1459d()).m14746h());
        } else if (Intrinsics.equals(abstractC13816c, C13897r2.f35018a)) {
            m11788J1(((LoginFlowData) c13182l.m1459d()).m14746h());
        } else if (Intrinsics.equals(abstractC13816c, C13900s1.f35021a)) {
            InsertPinActivity.m14936b(this, (LoginFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13848i2.f34956a)) {
            SmsValidationActivity.m7451a(this, (LoginFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13922y.f35043a)) {
            UpdatePhoneActivity.m18356a(this.f24479j0, this);
        }
    }

    public void onBackPressed() {
        ((LoginPhoneViewModel) m22758I0()).m17538Y0();
        super.onBackPressed();
    }
}
