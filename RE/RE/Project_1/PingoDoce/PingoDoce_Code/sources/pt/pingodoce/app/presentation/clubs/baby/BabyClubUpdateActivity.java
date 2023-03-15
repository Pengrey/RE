package pt.pingodoce.app.presentation.clubs.baby;

import android.os.Bundle;
import android.text.Html;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1423a;
import ci.FlowActivity;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.bottomsheet.DialogC3502a;
import com.google.android.material.button.MaterialButton;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import ke.ViewModelFactoryByInjection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lk.EnumC7070a;
import ne.EventObserver;
import p162ig.Term;
import p164ii.BabyClubViewModel;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p206kk.TermsAndConditionsActivity;
import p221le.UiWidgets;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11903n1;
import p448xf.BabyClubUpdateViewModel;
import p468yc.C13182l;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p494zh.AbstractC13816c;
import p494zh.C13826e;
import p494zh.C13830f;
import p494zh.C13835g;
import p494zh.C13840h;
import p494zh.C13845i;
import p494zh.C13850j;
import p494zh.C13855k;
import p494zh.C13883o0;
import pe.C8617d;
import pt.pingodoce.app.data.local.flows.ClubBabyFlowData;
import pt.pingodoce.app.presentation.clubs.baby.BabyClubUpdateActivity;
import sd.C10156i;

/* compiled from: BabyClubUpdateActivity.kt */
/* loaded from: classes2.dex */
public final class BabyClubUpdateActivity extends FlowActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f23688g0;

    /* renamed from: h0 */
    private final InterfaceC13178g f23689h0;

    /* compiled from: BabyClubUpdateActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.BabyClubUpdateActivity$a */
    /* loaded from: classes2.dex */
    public static final class C8973a {
        private C8973a() {
        }

        public /* synthetic */ C8973a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: BabyClubUpdateActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.BabyClubUpdateActivity$b */
    /* loaded from: classes2.dex */
    static final class C8974b extends AbstractC6438m implements InterfaceC6097a {
        C8974b() {
            super(0);
        }

        /* renamed from: a */
        public static /* synthetic */ void m12924a(BabyClubUpdateActivity babyClubUpdateActivity, DialogC3502a dialogC3502a, View view) {
            m12921d(babyClubUpdateActivity, dialogC3502a, view);
        }

        /* renamed from: b */
        public static /* synthetic */ void m12923b(BabyClubUpdateActivity babyClubUpdateActivity, DialogC3502a dialogC3502a, View view) {
            m12920e(babyClubUpdateActivity, dialogC3502a, view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m12921d(BabyClubUpdateActivity babyClubUpdateActivity, DialogC3502a dialogC3502a, View view) {
            Intrinsics.isThisObjectNull(babyClubUpdateActivity, "this$0");
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            BabyClubUpdateActivity.m12932t1(babyClubUpdateActivity).m3005k1();
            BabyClubUpdateActivity.m12932t1(babyClubUpdateActivity).m3003m1(BabyClubViewModel.AbstractC6173a.C6174a.f16939a);
            dialogC3502a.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m12920e(BabyClubUpdateActivity babyClubUpdateActivity, DialogC3502a dialogC3502a, View view) {
            Intrinsics.isThisObjectNull(babyClubUpdateActivity, "this$0");
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            BabyClubUpdateActivity.m12932t1(babyClubUpdateActivity).m3004l1();
            BabyClubUpdateActivity.m12932t1(babyClubUpdateActivity).m3003m1(BabyClubViewModel.AbstractC6173a.C6175b.f16940a);
            dialogC3502a.dismiss();
        }

        /* renamed from: c */
        public final DialogC3502a mo42214q() {
            final DialogC3502a dialogC3502a = new DialogC3502a(BabyClubUpdateActivity.this);
            final BabyClubUpdateActivity babyClubUpdateActivity = BabyClubUpdateActivity.this;
            View inflate = dialogC3502a.getLayoutInflater().inflate(C2336R.layout.bottomsheet_for_terms_rgpd_layout, (ViewGroup) null);
            dialogC3502a.setContentView(inflate);
            TextView textView = (TextView) inflate.findViewById(C2336R.C2338id.tv_term_conditions);
            if (textView != null) {
                textView.setText(Html.fromHtml(babyClubUpdateActivity.getString(C2336R.string.lbl_consents_baby_club_description), 0));
            }
            ((MaterialButton) inflate.findViewById(C2336R.C2338id.btn_term_accept)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.clubs.baby.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BabyClubUpdateActivity.C8974b.m12921d(BabyClubUpdateActivity.this, dialogC3502a, view);
                }
            });
            ((MaterialButton) inflate.findViewById(C2336R.C2338id.btn_term_cancel)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.clubs.baby.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BabyClubUpdateActivity.C8974b.m12920e(BabyClubUpdateActivity.this, dialogC3502a, view);
                }
            });
            dialogC3502a.setCancelable(false);
            Intrinsics.checkIfNull(textView, "tvTermConditions");
            BabyClubUpdateActivity.m12931u1(babyClubUpdateActivity, textView);
            return dialogC3502a;
        }
    }

    /* compiled from: BabyClubUpdateActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.BabyClubUpdateActivity$c */
    /* loaded from: classes2.dex */
    static final class C8975c extends AbstractC6438m implements InterfaceC6097a {
        C8975c() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m12926y1 = BabyClubUpdateActivity.this.m12926y1();
            BabyClubUpdateActivity babyClubUpdateActivity = BabyClubUpdateActivity.this;
            return m12926y1.m20377b(babyClubUpdateActivity, babyClubUpdateActivity.getIntent().getExtras());
        }
    }

    /* compiled from: BabyClubUpdateActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.BabyClubUpdateActivity$d */
    /* loaded from: classes2.dex */
    public static final class C8976d implements UiWidgets.InterfaceC7045b {

        /* renamed from: a */
        final /* synthetic */ AbstractC11903n1 f23692a;

        C8976d(AbstractC11903n1 abstractC11903n1) {
            this.f23692a = abstractC11903n1;
        }

        /* renamed from: a */
        public void m12918a(String str) {
            Intrinsics.isThisObjectNull(str, "date");
            this.f23692a.f31010y.f31727x.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BabyClubUpdateActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.BabyClubUpdateActivity$e */
    /* loaded from: classes2.dex */
    public static final class C8977e extends AbstractC6438m implements InterfaceC6108l {
        C8977e() {
            super(1);
        }

        /* renamed from: a */
        public final void m12917a(Term term) {
            Intrinsics.isThisObjectNull(term, "term");
            TermsAndConditionsActivity.m20276b(BabyClubUpdateActivity.this, term.m22124a(), term.m22123b(), false, 4, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12917a((Term) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: BabyClubUpdateActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.BabyClubUpdateActivity$f */
    /* loaded from: classes2.dex */
    public static final class C8978f implements InputFilter {
        C8978f() {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            String obj;
            boolean z = true;
            if (charSequence != null && charSequence.equals(BuildConfig.VERSION_NAME)) {
                return charSequence;
            }
            if (charSequence == null || (obj = charSequence.toString()) == null || !new C10156i("[a-zA-Z ]+").m9021d(obj)) {
                z = false;
            }
            if (z) {
                return charSequence;
            }
            if (charSequence != null) {
                return new C10156i("\\d").m9020e(charSequence, BuildConfig.VERSION_NAME);
            }
            return null;
        }
    }

    /* compiled from: BabyClubUpdateActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.BabyClubUpdateActivity$g */
    /* loaded from: classes2.dex */
    public static final class C8979g extends InputFilter.LengthFilter {
        C8979g() {
            super(20);
        }
    }

    /* compiled from: BabyClubUpdateActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.BabyClubUpdateActivity$h */
    /* loaded from: classes2.dex */
    public static final class C8980h extends ClickableSpan {
        C8980h() {
        }

        public void onClick(View view) {
            Intrinsics.isThisObjectNull(view, "textView");
            BabyClubUpdateActivity.m12932t1(BabyClubUpdateActivity.this).m3008h1(BabyClubUpdateActivity.m12933s1(BabyClubUpdateActivity.this, this, (TextView) view), EnumC7070a.PRIVACY);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.isThisObjectNull(textPaint, "ds");
        }
    }

    /* compiled from: BabyClubUpdateActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.BabyClubUpdateActivity$i */
    /* loaded from: classes2.dex */
    public static final class C8981i extends ClickableSpan {
        C8981i() {
        }

        public void onClick(View view) {
            Intrinsics.isThisObjectNull(view, "textView");
            BabyClubUpdateActivity.m12932t1(BabyClubUpdateActivity.this).m3008h1(BabyClubUpdateActivity.m12933s1(BabyClubUpdateActivity.this, this, (TextView) view), EnumC7070a.TERM_OF_USE);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.isThisObjectNull(textPaint, "ds");
        }
    }

    static {
        new C8973a(null);
    }

    public BabyClubUpdateActivity() {
        InterfaceC13178g m1464a;
        m1464a = LazyJVM.m1464a(new C8974b());
        this.f23689h0 = m1464a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m12942A1(BabyClubUpdateActivity babyClubUpdateActivity, SimpleDateFormat simpleDateFormat, AbstractC11903n1 abstractC11903n1, View view) {
        Intrinsics.isThisObjectNull(babyClubUpdateActivity, "this$0");
        Intrinsics.isThisObjectNull(simpleDateFormat, "$formatter");
        Intrinsics.isThisObjectNull(abstractC11903n1, "$binding");
        UiWidgets m22759H0 = babyClubUpdateActivity.m22759H0();
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, -5);
        calendar.add(5, 1);
        C13195u c13195u = C13195u.f34156a;
        UiWidgets.m19491r(m22759H0, simpleDateFormat, null, calendar.getTimeInMillis(), System.currentTimeMillis(), new C8976d(abstractC11903n1), 2, null);
    }

    /* renamed from: B1 */
    private final void m12941B1(TextView textView) {
        SpannableString spannableString = new SpannableString(textView.getText());
        C8981i c8981i = new C8981i();
        C8980h c8980h = new C8980h();
        spannableString.setSpan(c8981i, 14, 45, 33);
        spannableString.setSpan(c8980h, 48, 86, 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
    }

    /* renamed from: r1 */
    public static /* synthetic */ void m12934r1(BabyClubUpdateActivity babyClubUpdateActivity, SimpleDateFormat simpleDateFormat, AbstractC11903n1 abstractC11903n1, View view) {
        m12942A1(babyClubUpdateActivity, simpleDateFormat, abstractC11903n1, view);
    }

    /* renamed from: s1 */
    public static final /* synthetic */ String m12933s1(BabyClubUpdateActivity babyClubUpdateActivity, ClickableSpan clickableSpan, TextView textView) {
        return babyClubUpdateActivity.m12930v1(clickableSpan, textView);
    }

    /* renamed from: t1 */
    public static final /* synthetic */ BabyClubUpdateViewModel m12932t1(BabyClubUpdateActivity babyClubUpdateActivity) {
        return (BabyClubUpdateViewModel) babyClubUpdateActivity.m22758I0();
    }

    /* renamed from: u1 */
    public static final /* synthetic */ void m12931u1(BabyClubUpdateActivity babyClubUpdateActivity, TextView textView) {
        babyClubUpdateActivity.m12941B1(textView);
    }

    /* renamed from: v1 */
    private final String m12930v1(ClickableSpan clickableSpan, TextView textView) {
        CharSequence text = textView.getText();
        Objects.requireNonNull(text, "null cannot be cast to non-null type android.text.Spanned");
        Spanned spanned = (Spanned) text;
        return spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan)).toString();
    }

    /* renamed from: x1 */
    private final DialogC3502a m12927x1() {
        return (DialogC3502a) this.f23689h0.getValue();
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12940J0() {
        return C6450z.m20906b(BabyClubUpdateViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12939K0() {
        return new C8975c();
    }

    /* renamed from: m1 */
    public void m12937m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        AbstractC13816c abstractC13816c = (AbstractC13816c) c13182l.m1460c();
        if (abstractC13816c instanceof C13883o0) {
            p164ii.BabyClubHomeActivity.m22025a(this, false);
            finish();
        } else if (abstractC13816c instanceof C13835g) {
            p164ii.BabyClubHomeActivity.m22025a(this, true);
            finish();
        } else if (abstractC13816c instanceof C13850j) {
            ((AbstractC11903n1) m22738w0()).f31003A.setText(Html.fromHtml(getString(C2336R.string.lbl_clubs_progress_bar_step, new Object[]{"1"}), 0));
            ((AbstractC11903n1) m22738w0()).f31005C.setProgress(33);
            ((AbstractC11903n1) m22738w0()).f31006D.setText(getString(C2336R.string.btn_continue));
            ((AbstractC11903n1) m22738w0()).f31009x.mo4427U(Boolean.TRUE);
            ((AbstractC11903n1) m22738w0()).f31010y.mo3666U(false);
            ((AbstractC11903n1) m22738w0()).f31011z.mo3604Y(false);
            ((AbstractC11903n1) m22738w0()).f31009x.f29948y.setText(((ClubBabyFlowData) c13182l.m1459d()).m14773d());
        } else if (abstractC13816c instanceof C13826e) {
            m12927x1().show();
        } else if (abstractC13816c instanceof C13840h) {
            ((AbstractC11903n1) m22738w0()).f31003A.setText(Html.fromHtml(getString(C2336R.string.lbl_clubs_progress_bar_step, new Object[]{"2"}), 0));
            ((AbstractC11903n1) m22738w0()).f31005C.setProgress(66);
            ((AbstractC11903n1) m22738w0()).f31006D.setText(getString(C2336R.string.btn_continue));
            ((AbstractC11903n1) m22738w0()).f31009x.mo4427U(Boolean.FALSE);
            ((AbstractC11903n1) m22738w0()).f31010y.mo3666U(true);
            ((AbstractC11903n1) m22738w0()).f31011z.mo3604Y(false);
        } else if (abstractC13816c instanceof C13845i) {
            ((AbstractC11903n1) m22738w0()).f31006D.setEnabled(false);
            ((AbstractC11903n1) m22738w0()).f31003A.setText(Html.fromHtml(getString(C2336R.string.lbl_clubs_progress_bar_step, new Object[]{"3"}), 0));
            ((AbstractC11903n1) m22738w0()).f31005C.setProgress(100);
            ((AbstractC11903n1) m22738w0()).f31006D.setText(getString(C2336R.string.btn_conclude));
            ((AbstractC11903n1) m22738w0()).f31009x.mo4427U(Boolean.FALSE);
            ((AbstractC11903n1) m22738w0()).f31010y.mo3666U(false);
            ((AbstractC11903n1) m22738w0()).f31011z.mo3604Y(true);
        } else if (abstractC13816c instanceof C13830f) {
            p164ii.BabyClubHomeActivity.m22025a(this, true);
            finish();
        } else if (abstractC13816c instanceof C13855k) {
            p164ii.BabyClubWelcomeActivity.m21986a(this);
            finish();
        } else {
            super.onBackPressed();
        }
    }

    /* renamed from: n */
    public boolean m12936n() {
        return true;
    }

    public void onBackPressed() {
        if (!Intrinsics.equals(((BabyClubUpdateViewModel) m22758I0()).m22014B0(), C13830f.f34938a) && !Intrinsics.equals(((BabyClubUpdateViewModel) m22758I0()).m22014B0(), C13850j.f34958a)) {
            ((BabyClubUpdateViewModel) m22758I0()).m3003m1(BabyClubViewModel.AbstractC6173a.C6175b.f16940a);
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_new_club_baby;
    }

    /* renamed from: y1 */
    public final ViewModelFactoryByInjection m12926y1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23688g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z1 */
    public void m12935n1(final AbstractC11903n1 abstractC11903n1, BabyClubUpdateViewModel babyClubUpdateViewModel) {
        Intrinsics.isThisObjectNull(abstractC11903n1, "binding");
        Intrinsics.isThisObjectNull(babyClubUpdateViewModel, "viewModel");
        super.m34589n1(abstractC11903n1, babyClubUpdateViewModel);
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.getBoolean("EXTRA_EDIT_BABY")) {
            abstractC11903n1.f31005C.setVisibility(8);
            abstractC11903n1.f31003A.setVisibility(8);
            babyClubUpdateViewModel.m22013C0();
        } else {
            ((TextView) findViewById(C2336R.C2338id.const_step)).setText(Html.fromHtml(getString(C2336R.string.lbl_clubs_progress_bar_step, new Object[]{"1"}), 0));
        }
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        abstractC11903n1.f31010y.f31728y.setOnClickListener(new View.OnClickListener() { // from class: ii.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BabyClubUpdateActivity.m12942A1(BabyClubUpdateActivity.this, simpleDateFormat, abstractC11903n1, view);
            }
        });
        babyClubUpdateViewModel.m3006j1().mo171i(this, new EventObserver(new C8977e()));
        abstractC11903n1.f31009x.f29948y.setFilters(new InputFilter[]{new C8978f(), new C8979g()});
    }
}
