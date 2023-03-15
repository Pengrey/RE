package pt.pingodoce.app.presentation.clubs.wine;

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
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import ke.ViewModelFactoryByInjection;
import me.InterfaceC7186c;
import ne.EventObserver;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p185ji.WineClubWelcomeViewModel;
import p221le.UiEventsLiveData;
import p314qd.InterfaceC9717b;
import p390uj.HomeActivity;
import p426wg.AbstractC12131z4;
import p468yc.C13182l;
import p468yc.C13195u;
import p494zh.BaseActivity;
import p494zh.C13819c2;
import p494zh.C13834f3;
import p494zh.C13869l0;
import pe.C8617d;

/* compiled from: WineClubWelcomeActivity.kt */
/* loaded from: classes2.dex */
public final class WineClubWelcomeActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f23771f0;

    /* compiled from: WineClubWelcomeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.WineClubWelcomeActivity$a */
    /* loaded from: classes2.dex */
    static final class C9023a extends AbstractC6438m implements InterfaceC6097a {
        C9023a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(WineClubWelcomeActivity.this.m12819j1(), WineClubWelcomeActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WineClubWelcomeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.WineClubWelcomeActivity$b */
    /* loaded from: classes2.dex */
    public static final class C9024b extends AbstractC6438m implements InterfaceC6108l {
        C9024b() {
            super(1);
        }

        /* renamed from: a */
        public final void m12813a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "it");
            InterfaceC7186c interfaceC7186c = (InterfaceC7186c) c13182l.m1460c();
            if (interfaceC7186c instanceof C13869l0) {
                HomeActivity.m6743b(WineClubWelcomeActivity.this);
                WineClubWelcomeActivity.this.finish();
            } else if (interfaceC7186c instanceof C13834f3) {
                p185ji.WineClubHomeActivity.m20835a(WineClubWelcomeActivity.this, true);
                WineClubWelcomeActivity.this.finish();
            } else if (interfaceC7186c instanceof C13819c2) {
                p185ji.WineClubHomeActivity.m20835a(WineClubWelcomeActivity.this, true);
                WineClubWelcomeActivity.this.finish();
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12813a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: WineClubWelcomeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.WineClubWelcomeActivity$c */
    /* loaded from: classes2.dex */
    public static final class C9025c extends ClickableSpan {
        C9025c() {
        }

        public void onClick(View view) {
            Intrinsics.isThisObjectNull(view, "textView");
            Uri parse = Uri.parse("https://vinho.pingodoce.pt/");
            Intrinsics.checkIfNull(parse, "parse(this)");
            WineClubWelcomeActivity.this.startActivity(new Intent("android.intent.action.VIEW", parse));
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.isThisObjectNull(textPaint, "ds");
        }
    }

    /* renamed from: l1 */
    private final void m12817l1(TextView textView) {
        SpannableString spannableString = new SpannableString(textView.getText());
        spannableString.setSpan(new C9025c(), 175, 188, 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12823J0() {
        return C6450z.m20906b(WineClubWelcomeViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12822K0() {
        return new C9023a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: j1 */
    public final ViewModelFactoryByInjection m12819j1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23771f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k1 */
    public void m12821P0(AbstractC12131z4 abstractC12131z4, WineClubWelcomeViewModel wineClubWelcomeViewModel) {
        Intrinsics.isThisObjectNull(abstractC12131z4, "binding");
        Intrinsics.isThisObjectNull(wineClubWelcomeViewModel, "viewModel");
        TextView textView = abstractC12131z4.f32034A;
        textView.setText(Html.fromHtml(getString(C2336R.string.lbl_clubs_wine_welcome_to_wine_club_subtitle), 0));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinkTextColor(getColor(C2336R.color.black));
        TextView textView2 = abstractC12131z4.f32034A;
        Intrinsics.checkIfNull(textView2, "binding.welcomeToClubSubtitle");
        m12817l1(textView2);
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C9024b()));
    }

    /* renamed from: n */
    public boolean m12816n() {
        return true;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_wine_club_welcome;
    }
}
