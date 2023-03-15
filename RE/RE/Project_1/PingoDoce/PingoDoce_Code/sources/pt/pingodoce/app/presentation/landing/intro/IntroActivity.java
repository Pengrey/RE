package pt.pingodoce.app.presentation.landing.intro;

import android.text.Html;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.lifecycle.AbstractC1423a;
import ci.C2142f;
import ci.C2143g;
import ci.C2146h;
import ci.FlowActivity;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.bottomsheet.DialogC3502a;
import com.google.android.material.button.MaterialButton;
import fm.C5579c;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import lk.EnumC7070a;
import ne.EventObserver;
import p088ek.IntroViewModel;
import p162ig.Term;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p206kk.TermsAndConditionsActivity;
import p258nk.LoginPhoneActivity;
import p314qd.InterfaceC9717b;
import p390uj.HomeActivity;
import p426wg.AbstractC11771g0;
import p468yc.C13182l;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.C13869l0;
import p494zh.C13878n1;
import p494zh.C13888p1;
import p494zh.C13897r2;
import p497zk.OnboardingNotificationActivity;
import pe.C8614a;
import pt.pingodoce.app.presentation.landing.intro.IntroActivity;

/* compiled from: IntroActivity.kt */
/* loaded from: classes2.dex */
public final class IntroActivity extends FlowActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24309g0;

    /* renamed from: h0 */
    private final InterfaceC13178g f24310h0;

    /* compiled from: IntroActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.intro.IntroActivity$a */
    /* loaded from: classes2.dex */
    static final class C9235a extends AbstractC6438m implements InterfaceC6097a {
        C9235a() {
            super(0);
        }

        /* renamed from: a */
        public static /* synthetic */ void m12009a(IntroActivity introActivity, DialogC3502a dialogC3502a, View view) {
            m12005e(introActivity, dialogC3502a, view);
        }

        /* renamed from: b */
        public static /* synthetic */ void m12008b(IntroActivity introActivity, DialogC3502a dialogC3502a, View view) {
            m12006d(introActivity, dialogC3502a, view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m12006d(IntroActivity introActivity, DialogC3502a dialogC3502a, View view) {
            Intrinsics.isThisObjectNull(introActivity, "this$0");
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            IntroActivity.m12017r1(introActivity).m25607D0();
            dialogC3502a.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m12005e(IntroActivity introActivity, DialogC3502a dialogC3502a, View view) {
            Intrinsics.isThisObjectNull(introActivity, "this$0");
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            IntroActivity.m12017r1(introActivity).m25606E0();
            dialogC3502a.dismiss();
        }

        /* renamed from: c */
        public final DialogC3502a mo42214q() {
            final DialogC3502a dialogC3502a = new DialogC3502a(IntroActivity.this);
            final IntroActivity introActivity = IntroActivity.this;
            View inflate = dialogC3502a.getLayoutInflater().inflate(C2336R.layout.bottomsheet_for_terms_rgpd_layout, (ViewGroup) null);
            dialogC3502a.setContentView(inflate);
            TextView textView = (TextView) inflate.findViewById(C2336R.C2338id.tv_term_conditions);
            if (textView != null) {
                textView.setText(Html.fromHtml(introActivity.getString(C2336R.string.lbl_consents_description_guest), 0));
            }
            ((MaterialButton) inflate.findViewById(C2336R.C2338id.btn_term_accept)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.landing.intro.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IntroActivity.C9235a.m12006d(IntroActivity.this, dialogC3502a, view);
                }
            });
            ((MaterialButton) inflate.findViewById(C2336R.C2338id.btn_term_cancel)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.landing.intro.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IntroActivity.C9235a.m12005e(IntroActivity.this, dialogC3502a, view);
                }
            });
            dialogC3502a.setCancelable(false);
            Intrinsics.checkIfNull(textView, "tvTermConditions");
            IntroActivity.m12016s1(introActivity, textView);
            return dialogC3502a;
        }
    }

    /* compiled from: IntroActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.intro.IntroActivity$b */
    /* loaded from: classes2.dex */
    static final class C9236b extends AbstractC6438m implements InterfaceC6097a {
        C9236b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(IntroActivity.this.m12013v1(), IntroActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IntroActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.intro.IntroActivity$c */
    /* loaded from: classes2.dex */
    public static final class C9237c extends AbstractC6438m implements InterfaceC6108l {
        C9237c() {
            super(1);
        }

        /* renamed from: a */
        public final void m12003a(Term term) {
            Intrinsics.isThisObjectNull(term, "term");
            TermsAndConditionsActivity.m20276b(IntroActivity.this, term.m22124a(), term.m22123b(), false, 4, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12003a((Term) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: IntroActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.intro.IntroActivity$d */
    /* loaded from: classes2.dex */
    public static final class C9238d extends ClickableSpan {
        C9238d() {
        }

        public void onClick(View view) {
            Intrinsics.isThisObjectNull(view, "textView");
            IntroActivity.m12017r1(IntroActivity.this).m25597y0(C5579c.m23717b(this, (TextView) view), EnumC7070a.PRIVACY);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.isThisObjectNull(textPaint, "ds");
        }
    }

    /* compiled from: IntroActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.intro.IntroActivity$e */
    /* loaded from: classes2.dex */
    public static final class C9239e extends ClickableSpan {
        C9239e() {
        }

        public void onClick(View view) {
            Intrinsics.isThisObjectNull(view, "textView");
            IntroActivity.m12017r1(IntroActivity.this).m25597y0(C5579c.m23717b(this, (TextView) view), EnumC7070a.TERM_OF_USE);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.isThisObjectNull(textPaint, "ds");
        }
    }

    public IntroActivity() {
        InterfaceC13178g m1464a;
        m1464a = LazyJVM.m1464a(new C9235a());
        this.f24310h0 = m1464a;
    }

    /* renamed from: r1 */
    public static final /* synthetic */ IntroViewModel m12017r1(IntroActivity introActivity) {
        return (IntroViewModel) introActivity.m22758I0();
    }

    /* renamed from: s1 */
    public static final /* synthetic */ void m12016s1(IntroActivity introActivity, TextView textView) {
        introActivity.m12010x1(textView);
    }

    /* renamed from: u1 */
    private final DialogC3502a m12014u1() {
        return (DialogC3502a) this.f24310h0.getValue();
    }

    /* renamed from: x1 */
    private final void m12010x1(TextView textView) {
        SpannableString spannableString = new SpannableString(textView.getText());
        C9239e c9239e = new C9239e();
        C9238d c9238d = new C9238d();
        spannableString.setSpan(c9239e, 79, 98, 33);
        spannableString.setSpan(c9238d, C0868i.f2753D0, 142, 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12023J0() {
        return C6450z.m20906b(IntroViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12022K0() {
        return new C9236b();
    }

    /* renamed from: k1 */
    protected List m12020k1() {
        List m194j;
        m194j = C13780s.m194j(C2142f.f6177a, C2143g.f6178a, C2146h.f6181a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m12019m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        AbstractC13816c abstractC13816c = (AbstractC13816c) c13182l.m1460c();
        if (Intrinsics.equals(abstractC13816c, C13897r2.f35018a)) {
            m12014u1().show();
        } else if (abstractC13816c instanceof C13888p1) {
            LoginPhoneActivity.m17547a(this);
        } else if (abstractC13816c instanceof C13878n1) {
            OnboardingNotificationActivity.m42a(this, null);
            finish();
        } else if (abstractC13816c instanceof C13869l0) {
            HomeActivity.m6743b(this);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t1 */
    public C8614a mo42216v0() {
        return new C8614a();
    }

    /* renamed from: v1 */
    public final ViewModelFactoryByInjection m12013v1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24309g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w1 */
    public void m12018n1(AbstractC11771g0 abstractC11771g0, IntroViewModel introViewModel) {
        Intrinsics.isThisObjectNull(abstractC11771g0, "binding");
        Intrinsics.isThisObjectNull(introViewModel, "viewModel");
        super.m34589n1(abstractC11771g0, introViewModel);
        introViewModel.m25609B0().mo171i(this, new EventObserver(new C9237c()));
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_intro;
    }
}
