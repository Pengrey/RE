package pt.pingodoce.app.presentation.login.sms.validate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import cd.C2116d;
import ci.C2142f;
import ci.C2143g;
import ci.C2146h;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6112p;
import java.util.Arrays;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p034bl.OnboardingResumeActivity;
import p089el.UserDataInsertActivity;
import p181jd.AbstractC6438m;
import p181jd.C6429c0;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p280ok.RecoverPinActivity;
import p314qd.InterfaceC9717b;
import p343rk.SmsTokenActivity;
import p408vk.OnboardingEmailSentActivity;
import p426wg.AbstractC11944p3;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.C13857k1;
import p494zh.C13900s1;
import p494zh.C13917w2;
import p494zh.C13918x;
import p494zh.C13928z1;
import pk.InsertPinActivity;
import pt.pingodoce.app.data.local.flows.LoginFlowData;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import pt.pingodoce.app.data.local.flows.PhoneFlowData;
import pt.pingodoce.app.data.local.flows.RecoverPinFlowData;
import td.InterfaceC10524i0;
import tk.SmsValidationViewModel;

/* compiled from: SmsValidationActivity.kt */
/* loaded from: classes2.dex */
public final class SmsValidationActivity extends SmsTokenActivity {

    /* renamed from: i0 */
    public ViewModelFactoryByInjection f24534i0;

    /* compiled from: SmsValidationActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.login.sms.validate.SmsValidationActivity$a */
    /* loaded from: classes2.dex */
    public static final class C9324a {
        private C9324a() {
        }

        public /* synthetic */ C9324a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SmsValidationActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.login.sms.validate.SmsValidationActivity$b */
    /* loaded from: classes2.dex */
    static final class C9325b extends AbstractC6438m implements InterfaceC6097a {
        C9325b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m11699C1 = SmsValidationActivity.this.m11699C1();
            SmsValidationActivity smsValidationActivity = SmsValidationActivity.this;
            Intent intent = smsValidationActivity.getIntent();
            return m11699C1.m20377b(smsValidationActivity, intent != null ? intent.getExtras() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SmsValidationActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.sms.validate.SmsValidationActivity$initViews$1", m20196f = "SmsValidationActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.login.sms.validate.SmsValidationActivity$c */
    /* loaded from: classes2.dex */
    public static final class C9326c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24536x;

        /* renamed from: y */
        final /* synthetic */ SmsValidationViewModel f24537y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9326c(SmsValidationViewModel smsValidationViewModel, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24537y = smsValidationViewModel;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9326c(this.f24537y, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9326c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f24536x == 0) {
                C13186n.m1453b(obj);
                this.f24537y.m7440x0();
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        new C9324a(null);
    }

    /* renamed from: C1 */
    public final ViewModelFactoryByInjection m11699C1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24534i0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D1 */
    public void m11691z1(AbstractC11944p3 abstractC11944p3, SmsValidationViewModel smsValidationViewModel) {
        Intrinsics.isThisObjectNull(abstractC11944p3, "binding");
        Intrinsics.isThisObjectNull(smsValidationViewModel, "viewModel");
        super.m9686z1(abstractC11944p3, smsValidationViewModel);
        Bundle extras = getIntent().getExtras();
        if (!(extras != null && extras.getBoolean("EXTRA_FOR_PIN_RECOVERY"))) {
            LifecycleOwner.m36965a(this).m36984i(new C9326c(smsValidationViewModel, null));
            TextView textView = abstractC11944p3.f31198D;
            C6429c0 c6429c0 = C6429c0.f17515a;
            String string = getString(C2336R.string.lbl_insert_sms_code);
            Intrinsics.checkIfNull(string, "getString(R.string.lbl_insert_sms_code)");
            String format = String.format(string, Arrays.copyOf(new Object[]{((PhoneFlowData) smsValidationViewModel.m34578S()).m14701b()}, 1));
            Intrinsics.checkIfNull(format, "format(format, *args)");
            textView.setText(format);
            abstractC11944p3.f31196B.setVisibility(8);
            return;
        }
        TextView textView2 = abstractC11944p3.f31198D;
        C6429c0 c6429c02 = C6429c0.f17515a;
        String string2 = getString(C2336R.string.lbl_insert_sms_code_alt);
        Intrinsics.checkIfNull(string2, "getString(R.string.lbl_insert_sms_code_alt)");
        String format2 = String.format(string2, Arrays.copyOf(new Object[]{((PhoneFlowData) smsValidationViewModel.m34578S()).m14701b()}, 1));
        Intrinsics.checkIfNull(format2, "format(format, *args)");
        textView2.setText(format2);
        abstractC11944p3.f31196B.setVisibility(0);
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11697J0() {
        return C6450z.m20906b(SmsValidationViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11696K0() {
        return new C9325b();
    }

    /* renamed from: k1 */
    protected List m11694k1() {
        List m194j;
        m194j = C13780s.m194j(C2142f.f6177a, C2143g.f6178a, C2146h.f6181a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m11693m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        AbstractC13816c abstractC13816c = (AbstractC13816c) c13182l.m1460c();
        if (Intrinsics.equals(abstractC13816c, C13928z1.f35049a)) {
            RecoverPinActivity.m16911a(this, new RecoverPinFlowData(((PhoneFlowData) c13182l.m1459d()).m14701b(), null, 2, null));
        } else if (Intrinsics.equals(abstractC13816c, C13900s1.f35021a)) {
            InsertPinActivity.m14936b(this, (LoginFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13917w2.f35038a)) {
            UserDataInsertActivity.m25589a(this, (OnboardingFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13918x.f35039a)) {
            OnboardingResumeActivity.m35085a(this, (OnboardingFlowData) c13182l.m1459d(), true);
        } else if (Intrinsics.equals(abstractC13816c, C13857k1.f34965a)) {
            OnboardingEmailSentActivity.m5281b(this, (OnboardingFlowData) c13182l.m1459d());
        }
    }

    public void onBackPressed() {
        ((SmsValidationViewModel) m22758I0()).m7442U0();
        super.onBackPressed();
    }
}
