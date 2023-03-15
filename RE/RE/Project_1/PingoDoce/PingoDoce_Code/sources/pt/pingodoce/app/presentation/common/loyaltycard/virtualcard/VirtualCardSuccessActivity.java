package pt.pingodoce.app.presentation.common.loyaltycard.virtualcard;

import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1423a;
import ci.C2143g;
import ci.C2148j;
import ci.FlowActivity;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p390uj.HomeActivity;
import p426wg.AbstractC11985r4;
import p468yc.C13182l;
import p473yi.VirtualCardSuccessViewModel;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.BaseViewModel;
import p494zh.C13815b3;
import p494zh.C13869l0;
import pe.C8617d;

/* compiled from: VirtualCardSuccessActivity.kt */
/* loaded from: classes2.dex */
public final class VirtualCardSuccessActivity extends FlowActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f23936g0;

    /* compiled from: VirtualCardSuccessActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.virtualcard.VirtualCardSuccessActivity$a */
    /* loaded from: classes2.dex */
    static final class C9084a extends AbstractC6438m implements InterfaceC6097a {
        C9084a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(VirtualCardSuccessActivity.this.m12592t1(), VirtualCardSuccessActivity.this, null, 2, null);
        }
    }

    /* compiled from: VirtualCardSuccessActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.virtualcard.VirtualCardSuccessActivity$b */
    /* loaded from: classes2.dex */
    public static final class C9085b extends ClickableSpan {
        C9085b() {
        }

        public void onClick(View view) {
            Intrinsics.isThisObjectNull(view, "textView");
            BaseViewModel.m119C(VirtualCardSuccessActivity.m12594r1(VirtualCardSuccessActivity.this), C13815b3.f34923a, null, 2, null);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.isThisObjectNull(textPaint, "ds");
        }
    }

    /* renamed from: r1 */
    public static final /* synthetic */ VirtualCardSuccessViewModel m12594r1(VirtualCardSuccessActivity virtualCardSuccessActivity) {
        return (VirtualCardSuccessViewModel) virtualCardSuccessActivity.m22758I0();
    }

    /* renamed from: v1 */
    private final void m12590v1(TextView textView) {
        SpannableString spannableString = new SpannableString(textView.getText());
        spannableString.setSpan(new C9085b(), 182, 198, 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12600J0() {
        return C6450z.m20906b(VirtualCardSuccessViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12599K0() {
        return new C9084a();
    }

    /* renamed from: k1 */
    protected List m12597k1() {
        List m194j;
        m194j = C13780s.m194j(C2143g.f6178a, C2148j.f6183a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m12596m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        AbstractC13816c abstractC13816c = (AbstractC13816c) c13182l.m1460c();
        if (Intrinsics.equals(abstractC13816c, C13869l0.f34986a)) {
            HomeActivity.m6743b(this);
        } else if (Intrinsics.equals(abstractC13816c, C13815b3.f34923a)) {
            Uri parse = Uri.parse("https://poupamais.pt/");
            Intrinsics.checkIfNull(parse, "parse(this)");
            startActivity(new Intent("android.intent.action.VIEW", parse));
        }
    }

    public void onBackPressed() {
        ((VirtualCardSuccessViewModel) m22758I0()).m1344Y();
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: t1 */
    public final ViewModelFactoryByInjection m12592t1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23936g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u1 */
    public void m12595n1(AbstractC11985r4 abstractC11985r4, VirtualCardSuccessViewModel virtualCardSuccessViewModel) {
        Intrinsics.isThisObjectNull(abstractC11985r4, "binding");
        Intrinsics.isThisObjectNull(virtualCardSuccessViewModel, "viewModel");
        super.m34589n1(abstractC11985r4, virtualCardSuccessViewModel);
        abstractC11985r4.f31368z.setText(Html.fromHtml(getString(C2336R.string.lbl_loyalty_virtual_card_success_desc), 0));
        TextView textView = abstractC11985r4.f31368z;
        Intrinsics.checkIfNull(textView, "binding.tvCardRegistrationSuccessSubtitle");
        m12590v1(textView);
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_virtual_card_success;
    }
}
