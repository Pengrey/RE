package pt.pingodoce.app.presentation.onboarding.email.emailsent;

import al.CreatePinActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1423a;
import ci.C2143g;
import ci.FlowActivity;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import p034bl.OnboardingResumeActivity;
import p047ce.FluidContentResizer;
import p089el.UserDataInsertActivity;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p408vk.OnboardingEmailSentViewModel;
import p426wg.AbstractC11667a0;
import p468yc.C13182l;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.C13817c0;
import p494zh.C13878n1;
import p494zh.C13917w2;
import p494zh.C13918x;
import p497zk.OnboardingNotificationActivity;
import pe.C8617d;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import pt.pingodoce.app.data.local.flows.PhoneFlowData;

/* compiled from: OnboardingEmailSentActivity.kt */
/* loaded from: classes2.dex */
public final class OnboardingEmailSentActivity extends FlowActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24540g0;

    /* compiled from: OnboardingEmailSentActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.email.emailsent.OnboardingEmailSentActivity$a */
    /* loaded from: classes2.dex */
    static final class C9328a extends AbstractC6438m implements InterfaceC6097a {
        C9328a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m11675s1 = OnboardingEmailSentActivity.this.m11675s1();
            OnboardingEmailSentActivity onboardingEmailSentActivity = OnboardingEmailSentActivity.this;
            return m11675s1.m20377b(onboardingEmailSentActivity, onboardingEmailSentActivity.getIntent().getExtras());
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11682J0() {
        return C6450z.m20906b(OnboardingEmailSentViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11681K0() {
        return new C9328a();
    }

    /* renamed from: k1 */
    protected List m11679k1() {
        List m194j;
        m194j = C13780s.m194j(C2143g.f6178a, C2143g.C2145b.f6180a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m11678m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        AbstractC13816c abstractC13816c = (AbstractC13816c) c13182l.m1460c();
        if (Intrinsics.equals(abstractC13816c, C13817c0.f34924a)) {
            CreatePinActivity.m41589a(this, (PhoneFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13918x.f35039a)) {
            OnboardingResumeActivity.m35085a(this, (OnboardingFlowData) c13182l.m1459d(), true);
        } else if (Intrinsics.equals(abstractC13816c, C13878n1.f34993a)) {
            OnboardingNotificationActivity.m42a(this, (OnboardingFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13917w2.f35038a)) {
            UserDataInsertActivity.m25589a(this, (OnboardingFlowData) c13182l.m1459d());
            finish();
        }
    }

    public void onBackPressed() {
        ((OnboardingEmailSentViewModel) m22758I0()).m5260T0();
        super.onBackPressed();
    }

    protected void onNewIntent(Intent intent) {
        Uri data;
        super.onNewIntent(intent);
        if (Intrinsics.equals((intent == null || (data = intent.getData()) == null) ? null : data.getPath(), getString(C2336R.string.deeplink_prefix_onboarding))) {
            ((OnboardingEmailSentViewModel) m22758I0()).m5258V0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: s1 */
    public final ViewModelFactoryByInjection m11675s1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24540g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t1 */
    public void m11677n1(AbstractC11667a0 abstractC11667a0, OnboardingEmailSentViewModel onboardingEmailSentViewModel) {
        Bundle extras;
        Intrinsics.isThisObjectNull(abstractC11667a0, "binding");
        Intrinsics.isThisObjectNull(onboardingEmailSentViewModel, "viewModel");
        super.m34589n1(abstractC11667a0, onboardingEmailSentViewModel);
        FluidContentResizer.m34623h(FluidContentResizer.f6136a, this, 0L, null, 6, null);
        OnboardingFlowData onboardingFlowData = (OnboardingFlowData) getIntent().getParcelableExtra("EXTRA_FOR_FLOW_DATA");
        Intent intent = getIntent();
        if ((intent == null || (extras = intent.getExtras()) == null || !extras.getBoolean("EXTRA_FOR_EMAIL_VALIDATION")) ? false : true) {
            abstractC11667a0.f29810B.setText(getString(C2336R.string.lbl_email_sent_title_alt));
            TextView textView = abstractC11667a0.f29811C;
            Object[] objArr = new Object[1];
            objArr[0] = onboardingFlowData != null ? onboardingFlowData.m14716k() : null;
            textView.setText(Html.fromHtml(getString(C2336R.string.lbl_email_sent_subtitle_alt, objArr), 0));
            onboardingEmailSentViewModel.m5255Y0();
            return;
        }
        abstractC11667a0.f29810B.setText(getString(C2336R.string.lbl_email_sent_title));
        TextView textView2 = abstractC11667a0.f29811C;
        Object[] objArr2 = new Object[1];
        objArr2[0] = onboardingFlowData != null ? onboardingFlowData.m14716k() : null;
        textView2.setText(Html.fromHtml(getString(C2336R.string.lbl_email_sent_subtitle, objArr2), 0));
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_email_sent;
    }
}
