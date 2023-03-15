package pt.pingodoce.app.presentation.onboarding.mypd;

import android.text.Html;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1423a;
import ci.C2143g;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.bottomsheet.DialogC3502a;
import com.google.android.material.button.MaterialButton;
import fm.C5579c;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import lk.EnumC7070a;
import p034bl.OnboardingResumeActivity;
import p166ik.AbstractActivityC6183a;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p408vk.OnboardingEmailSentActivity;
import p426wg.AbstractC11864l1;
import p453xk.OnboardingMyPdViewModel;
import p468yc.C13182l;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p475yk.OnboardingNifActivity;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.C13842h1;
import p494zh.C13847i1;
import p494zh.C13852j1;
import p494zh.C13874m1;
import p494zh.C13878n1;
import p494zh.C13918x;
import p497zk.OnboardingNotificationActivity;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import pt.pingodoce.app.presentation.onboarding.mypd.OnboardingMyPdActivity;
import uk.OnboardingEmailActivity;

/* compiled from: OnboardingMyPdActivity.kt */
/* loaded from: classes2.dex */
public final class OnboardingMyPdActivity extends AbstractActivityC6183a {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24552g0;

    /* renamed from: h0 */
    private final InterfaceC13178g f24553h0;

    /* compiled from: OnboardingMyPdActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.mypd.OnboardingMyPdActivity$a */
    /* loaded from: classes2.dex */
    static final class C9335a extends AbstractC6438m implements InterfaceC6097a {
        C9335a() {
            super(0);
        }

        /* renamed from: a */
        public static /* synthetic */ void m11609a(OnboardingMyPdActivity onboardingMyPdActivity, DialogC3502a dialogC3502a, View view) {
            m11606d(onboardingMyPdActivity, dialogC3502a, view);
        }

        /* renamed from: b */
        public static /* synthetic */ void m11608b(DialogC3502a dialogC3502a, View view) {
            m11605e(dialogC3502a, view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m11606d(OnboardingMyPdActivity onboardingMyPdActivity, DialogC3502a dialogC3502a, View view) {
            Intrinsics.isThisObjectNull(onboardingMyPdActivity, "this$0");
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            OnboardingNifActivity.m1326a(onboardingMyPdActivity, (OnboardingFlowData) OnboardingMyPdActivity.m11615s1(onboardingMyPdActivity).m34578S());
            dialogC3502a.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m11605e(DialogC3502a dialogC3502a, View view) {
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            dialogC3502a.dismiss();
        }

        /* renamed from: c */
        public final DialogC3502a mo42214q() {
            final DialogC3502a dialogC3502a = new DialogC3502a(OnboardingMyPdActivity.this);
            final OnboardingMyPdActivity onboardingMyPdActivity = OnboardingMyPdActivity.this;
            View inflate = dialogC3502a.getLayoutInflater().inflate(C2336R.layout.bottomsheet_for_terms_rgpd_layout, (ViewGroup) null);
            dialogC3502a.setContentView(inflate);
            TextView textView = (TextView) inflate.findViewById(C2336R.C2338id.tv_term_conditions);
            if (textView != null) {
                textView.setText(Html.fromHtml(onboardingMyPdActivity.getString(C2336R.string.lbl_consents_description), 0));
            }
            ((MaterialButton) inflate.findViewById(C2336R.C2338id.btn_term_accept)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.onboarding.mypd.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OnboardingMyPdActivity.C9335a.m11606d(OnboardingMyPdActivity.this, dialogC3502a, view);
                }
            });
            ((MaterialButton) inflate.findViewById(C2336R.C2338id.btn_term_cancel)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.onboarding.mypd.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OnboardingMyPdActivity.C9335a.m11605e(DialogC3502a.this, view);
                }
            });
            dialogC3502a.setCancelable(false);
            Intrinsics.checkIfNull(textView, "tvTermConditions");
            OnboardingMyPdActivity.m11614t1(onboardingMyPdActivity, textView);
            return dialogC3502a;
        }
    }

    /* compiled from: OnboardingMyPdActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.mypd.OnboardingMyPdActivity$b */
    /* loaded from: classes2.dex */
    static final class C9336b extends AbstractC6438m implements InterfaceC6097a {
        C9336b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(OnboardingMyPdActivity.this.m11612v1(), OnboardingMyPdActivity.this, null, 2, null);
        }
    }

    /* compiled from: OnboardingMyPdActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.mypd.OnboardingMyPdActivity$c */
    /* loaded from: classes2.dex */
    public static final class C9337c extends ClickableSpan {
        C9337c() {
        }

        public void onClick(View view) {
            Intrinsics.isThisObjectNull(view, "textView");
            OnboardingMyPdActivity.m11615s1(OnboardingMyPdActivity.this).m1936B0(C5579c.m23717b(this, (TextView) view), EnumC7070a.PRIVACY);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.isThisObjectNull(textPaint, "ds");
        }
    }

    /* compiled from: OnboardingMyPdActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.mypd.OnboardingMyPdActivity$d */
    /* loaded from: classes2.dex */
    public static final class C9338d extends ClickableSpan {
        C9338d() {
        }

        public void onClick(View view) {
            Intrinsics.isThisObjectNull(view, "textView");
            OnboardingMyPdActivity.m11615s1(OnboardingMyPdActivity.this).m1936B0(C5579c.m23717b(this, (TextView) view), EnumC7070a.TERM_OF_USE);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.isThisObjectNull(textPaint, "ds");
        }
    }

    public OnboardingMyPdActivity() {
        InterfaceC13178g m1464a;
        m1464a = LazyJVM.m1464a(new C9335a());
        this.f24553h0 = m1464a;
    }

    /* renamed from: s1 */
    public static final /* synthetic */ OnboardingMyPdViewModel m11615s1(OnboardingMyPdActivity onboardingMyPdActivity) {
        return (OnboardingMyPdViewModel) onboardingMyPdActivity.m22758I0();
    }

    /* renamed from: t1 */
    public static final /* synthetic */ void m11614t1(OnboardingMyPdActivity onboardingMyPdActivity, TextView textView) {
        onboardingMyPdActivity.m11610x1(textView);
    }

    /* renamed from: u1 */
    private final DialogC3502a m11613u1() {
        return (DialogC3502a) this.f24553h0.getValue();
    }

    /* renamed from: x1 */
    private final void m11610x1(TextView textView) {
        SpannableString spannableString = new SpannableString(textView.getText());
        C9338d c9338d = new C9338d();
        C9337c c9337c = new C9337c();
        spannableString.setSpan(c9338d, 196, 209, 33);
        spannableString.setSpan(c9337c, 211, 250, 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11621J0() {
        return C6450z.m20906b(OnboardingMyPdViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11620K0() {
        return new C9336b();
    }

    /* renamed from: k1 */
    protected List m11618k1() {
        List m194j;
        m194j = C13780s.m194j(C2143g.f6178a, C2143g.C2145b.f6180a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m11617m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        AbstractC13816c abstractC13816c = (AbstractC13816c) c13182l.m1460c();
        if (Intrinsics.equals(abstractC13816c, C13842h1.f34950a)) {
            m11613u1().show();
        } else if (Intrinsics.equals(abstractC13816c, C13918x.f35039a)) {
            OnboardingResumeActivity.m35085a(this, (OnboardingFlowData) c13182l.m1459d(), true);
        } else if (Intrinsics.equals(abstractC13816c, C13878n1.f34993a)) {
            OnboardingNotificationActivity.m42a(this, (OnboardingFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13847i1.f34955a)) {
            OnboardingEmailActivity.m6723a(this, (OnboardingFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13874m1.f34990a)) {
            OnboardingNifActivity.m1326a(this, (OnboardingFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13852j1.f34960a)) {
            OnboardingEmailSentActivity.m5282a(this, (OnboardingFlowData) c13182l.m1459d());
        }
    }

    /* renamed from: v1 */
    public final ViewModelFactoryByInjection m11612v1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24552g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w1 */
    public void m11616n1(AbstractC11864l1 abstractC11864l1, OnboardingMyPdViewModel onboardingMyPdViewModel) {
        Intrinsics.isThisObjectNull(abstractC11864l1, "binding");
        Intrinsics.isThisObjectNull(onboardingMyPdViewModel, "viewModel");
        super.m34589n1(abstractC11864l1, onboardingMyPdViewModel);
        OnboardingFlowData onboardingFlowData = (OnboardingFlowData) getIntent().getParcelableExtra("EXTRA_FOR_FLOW_DATA");
        if (!(onboardingFlowData != null && onboardingFlowData.m14734F())) {
            abstractC11864l1.f30827C.setText(getString(C2336R.string.lbl_mypd_title));
            TextView textView = abstractC11864l1.f30826B;
            Intrinsics.ifNullDoSomething(onboardingFlowData);
            textView.setText(getString(C2336R.string.lbl_mypd_subtitle, new Object[]{onboardingFlowData.m14715m()}));
            abstractC11864l1.f30831x.setText(getString(C2336R.string.lbl_mypd_bullet_1));
            abstractC11864l1.f30832y.setText(getString(C2336R.string.lbl_mypd_bullet_2));
            abstractC11864l1.f30833z.setText(getString(C2336R.string.lbl_mypd_bullet_3));
            abstractC11864l1.f30825A.setText(getString(C2336R.string.lbl_mypd_bullet_4));
            abstractC11864l1.f30825A.setVisibility(0);
            return;
        }
        abstractC11864l1.f30827C.setText(getString(C2336R.string.lbl_mypd_title_alt));
        abstractC11864l1.f30826B.setText(getString(C2336R.string.lbl_mypd_subtitle_alt, new Object[]{onboardingFlowData.m14715m()}));
        abstractC11864l1.f30831x.setText(getString(C2336R.string.lbl_mypd_bullet_1_alt));
        abstractC11864l1.f30832y.setText(getString(C2336R.string.lbl_mypd_bullet_2_alt));
        abstractC11864l1.f30833z.setText(getString(C2336R.string.lbl_mypd_bullet_3_alt));
        abstractC11864l1.f30825A.setVisibility(8);
    }
}
