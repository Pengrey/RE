package pt.pingodoce.app.presentation.common.loyaltycard.virtualcard;

import android.content.Intent;
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
import ci.C2148j;
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
import p162ig.Term;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p206kk.TermsAndConditionsActivity;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11945p4;
import p468yc.C13182l;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p473yi.VirtualCardPreferencesViewModel;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.C13921x2;
import p494zh.C13929z2;
import pe.C8617d;
import pt.pingodoce.app.presentation.common.loyaltycard.virtualcard.VirtualCardPreferencesActivity;

/* compiled from: VirtualCardPreferencesActivity.kt */
/* loaded from: classes2.dex */
public final class VirtualCardPreferencesActivity extends FlowActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f23929g0;

    /* renamed from: h0 */
    private final InterfaceC13178g f23930h0;

    /* compiled from: VirtualCardPreferencesActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.virtualcard.VirtualCardPreferencesActivity$a */
    /* loaded from: classes2.dex */
    static final class C9079a extends AbstractC6438m implements InterfaceC6097a {
        C9079a() {
            super(0);
        }

        /* renamed from: a */
        public static /* synthetic */ void m12607a(DialogC3502a dialogC3502a, View view) {
            m12603e(dialogC3502a, view);
        }

        /* renamed from: b */
        public static /* synthetic */ void m12606b(VirtualCardPreferencesActivity virtualCardPreferencesActivity, DialogC3502a dialogC3502a, View view) {
            m12604d(virtualCardPreferencesActivity, dialogC3502a, view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m12604d(VirtualCardPreferencesActivity virtualCardPreferencesActivity, DialogC3502a dialogC3502a, View view) {
            Intrinsics.isThisObjectNull(virtualCardPreferencesActivity, "this$0");
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            VirtualCardPreferencesActivity.m12615r1(virtualCardPreferencesActivity).m1362h0();
            dialogC3502a.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m12603e(DialogC3502a dialogC3502a, View view) {
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            dialogC3502a.dismiss();
        }

        /* renamed from: c */
        public final DialogC3502a mo42214q() {
            final DialogC3502a dialogC3502a = new DialogC3502a(VirtualCardPreferencesActivity.this);
            final VirtualCardPreferencesActivity virtualCardPreferencesActivity = VirtualCardPreferencesActivity.this;
            View inflate = dialogC3502a.getLayoutInflater().inflate(C2336R.layout.bottomsheet_for_terms_rgpd_layout, (ViewGroup) null);
            dialogC3502a.setContentView(inflate);
            TextView textView = (TextView) inflate.findViewById(C2336R.C2338id.const_header);
            TextView textView2 = (TextView) inflate.findViewById(C2336R.C2338id.tv_term_conditions);
            if (textView != null) {
                textView.setText(Html.fromHtml(virtualCardPreferencesActivity.getString(C2336R.string.lbl_loyalty_virtual_card_bottom_sheet_title), 0));
            }
            if (textView2 != null) {
                textView2.setText(Html.fromHtml(virtualCardPreferencesActivity.getString(C2336R.string.lbl_loyalty_virtual_card_bottom_sheet_desc), 0));
            }
            ((MaterialButton) inflate.findViewById(C2336R.C2338id.btn_term_accept)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.common.loyaltycard.virtualcard.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VirtualCardPreferencesActivity.C9079a.m12604d(VirtualCardPreferencesActivity.this, dialogC3502a, view);
                }
            });
            ((MaterialButton) inflate.findViewById(C2336R.C2338id.btn_term_cancel)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.common.loyaltycard.virtualcard.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VirtualCardPreferencesActivity.C9079a.m12603e(DialogC3502a.this, view);
                }
            });
            dialogC3502a.setCancelable(false);
            Intrinsics.checkIfNull(textView2, "tvTermConditions");
            VirtualCardPreferencesActivity.m12614s1(virtualCardPreferencesActivity, textView2);
            return dialogC3502a;
        }
    }

    /* compiled from: VirtualCardPreferencesActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.virtualcard.VirtualCardPreferencesActivity$b */
    /* loaded from: classes2.dex */
    static final class C9080b extends AbstractC6438m implements InterfaceC6097a {
        C9080b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m12611v1 = VirtualCardPreferencesActivity.this.m12611v1();
            VirtualCardPreferencesActivity virtualCardPreferencesActivity = VirtualCardPreferencesActivity.this;
            Intent intent = virtualCardPreferencesActivity.getIntent();
            return m12611v1.m20377b(virtualCardPreferencesActivity, intent != null ? intent.getExtras() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VirtualCardPreferencesActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.virtualcard.VirtualCardPreferencesActivity$c */
    /* loaded from: classes2.dex */
    public static final class C9081c extends AbstractC6438m implements InterfaceC6108l {
        C9081c() {
            super(1);
        }

        /* renamed from: a */
        public final void m12601a(Term term) {
            Intrinsics.isThisObjectNull(term, "term");
            TermsAndConditionsActivity.m20276b(VirtualCardPreferencesActivity.this, term.m22124a(), term.m22123b(), false, 4, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12601a((Term) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: VirtualCardPreferencesActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.virtualcard.VirtualCardPreferencesActivity$d */
    /* loaded from: classes2.dex */
    public static final class C9082d extends ClickableSpan {
        C9082d() {
        }

        public void onClick(View view) {
            Intrinsics.isThisObjectNull(view, "textView");
            VirtualCardPreferencesActivity.m12615r1(VirtualCardPreferencesActivity.this).m1369a0(C5579c.m23717b(this, (TextView) view), EnumC7070a.PRIVACY);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.isThisObjectNull(textPaint, "ds");
        }
    }

    /* compiled from: VirtualCardPreferencesActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.virtualcard.VirtualCardPreferencesActivity$e */
    /* loaded from: classes2.dex */
    public static final class C9083e extends ClickableSpan {
        C9083e() {
        }

        public void onClick(View view) {
            Intrinsics.isThisObjectNull(view, "textView");
            VirtualCardPreferencesActivity.m12615r1(VirtualCardPreferencesActivity.this).m1369a0(C5579c.m23717b(this, (TextView) view), EnumC7070a.TERM_OF_USE);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.isThisObjectNull(textPaint, "ds");
        }
    }

    public VirtualCardPreferencesActivity() {
        InterfaceC13178g m1464a;
        m1464a = LazyJVM.m1464a(new C9079a());
        this.f23930h0 = m1464a;
    }

    /* renamed from: r1 */
    public static final /* synthetic */ VirtualCardPreferencesViewModel m12615r1(VirtualCardPreferencesActivity virtualCardPreferencesActivity) {
        return (VirtualCardPreferencesViewModel) virtualCardPreferencesActivity.m22758I0();
    }

    /* renamed from: s1 */
    public static final /* synthetic */ void m12614s1(VirtualCardPreferencesActivity virtualCardPreferencesActivity, TextView textView) {
        virtualCardPreferencesActivity.m12608x1(textView);
    }

    /* renamed from: u1 */
    private final DialogC3502a m12612u1() {
        return (DialogC3502a) this.f23930h0.getValue();
    }

    /* renamed from: x1 */
    private final void m12608x1(TextView textView) {
        SpannableString spannableString = new SpannableString(textView.getText());
        C9083e c9083e = new C9083e();
        C9082d c9082d = new C9082d();
        spannableString.setSpan(c9083e, 10, 40, 33);
        spannableString.setSpan(c9082d, 42, 71, 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12621J0() {
        return C6450z.m20906b(VirtualCardPreferencesViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12620K0() {
        return new C9080b();
    }

    /* renamed from: k1 */
    protected List m12618k1() {
        List m194j;
        m194j = C13780s.m194j(C2143g.f6178a, C2148j.f6183a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m12617m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        AbstractC13816c abstractC13816c = (AbstractC13816c) c13182l.m1460c();
        if (Intrinsics.equals(abstractC13816c, C13921x2.f35042a)) {
            m12612u1().show();
        } else if (Intrinsics.equals(abstractC13816c, C13929z2.f35050a)) {
            p473yi.VirtualCardSuccessActivity.m1349a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: v1 */
    public final ViewModelFactoryByInjection m12611v1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23929g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w1 */
    public void m12616n1(AbstractC11945p4 abstractC11945p4, VirtualCardPreferencesViewModel virtualCardPreferencesViewModel) {
        Intrinsics.isThisObjectNull(abstractC11945p4, "binding");
        Intrinsics.isThisObjectNull(virtualCardPreferencesViewModel, "viewModel");
        super.m34589n1(abstractC11945p4, virtualCardPreferencesViewModel);
        virtualCardPreferencesViewModel.m1365e0().mo171i(this, new EventObserver(new C9081c()));
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_virtual_card_preferences;
    }
}
