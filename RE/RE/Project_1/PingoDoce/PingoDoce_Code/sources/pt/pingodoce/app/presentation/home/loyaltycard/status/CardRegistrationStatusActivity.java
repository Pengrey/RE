package pt.pingodoce.app.presentation.home.loyaltycard.status;

import android.os.Bundle;
import android.text.Html;
import androidx.lifecycle.AbstractC1423a;
import ck.CardRegistrationStatusViewModel;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.util.Arrays;
import ke.ViewModelFactoryByInjection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.InterfaceC7186c;
import ne.EventObserver;
import p106fe.IntentUtils;
import p181jd.AbstractC6438m;
import p181jd.C6429c0;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p314qd.InterfaceC9717b;
import p315qe.AbstractC9725a;
import p390uj.HomeActivity;
import p426wg.AbstractC12092x0;
import p468yc.C13182l;
import p468yc.C13195u;
import p494zh.BaseActivity;
import p494zh.C13829e2;
import p494zh.C13869l0;
import pe.C8617d;
import pe.C8618e;

/* compiled from: CardRegistrationStatusActivity.kt */
/* loaded from: classes2.dex */
public final class CardRegistrationStatusActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f24303f0;

    /* compiled from: CardRegistrationStatusActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.loyaltycard.status.CardRegistrationStatusActivity$a */
    /* loaded from: classes2.dex */
    public static final class C9231a {
        private C9231a() {
        }

        public /* synthetic */ C9231a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CardRegistrationStatusActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.loyaltycard.status.CardRegistrationStatusActivity$b */
    /* loaded from: classes2.dex */
    static final class C9232b extends AbstractC6438m implements InterfaceC6097a {
        C9232b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m12042i1 = CardRegistrationStatusActivity.this.m12042i1();
            CardRegistrationStatusActivity cardRegistrationStatusActivity = CardRegistrationStatusActivity.this;
            return m12042i1.m20377b(cardRegistrationStatusActivity, cardRegistrationStatusActivity.getIntent().getExtras());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CardRegistrationStatusActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.loyaltycard.status.CardRegistrationStatusActivity$c */
    /* loaded from: classes2.dex */
    public static final class C9233c extends AbstractC6438m implements InterfaceC6108l {
        C9233c() {
            super(1);
        }

        /* renamed from: a */
        public final void m12037a(C13182l c13182l) {
            String str;
            Intrinsics.isThisObjectNull(c13182l, "it");
            InterfaceC7186c interfaceC7186c = (InterfaceC7186c) c13182l.m1460c();
            if (Intrinsics.equals(interfaceC7186c, C13869l0.f34986a)) {
                HomeActivity.m6743b(CardRegistrationStatusActivity.this);
                CardRegistrationStatusActivity.this.finish();
            } else if (Intrinsics.equals(interfaceC7186c, C13829e2.f34936a)) {
                CardRegistrationStatusActivity cardRegistrationStatusActivity = CardRegistrationStatusActivity.this;
                C6429c0 c6429c0 = C6429c0.f17515a;
                String string = cardRegistrationStatusActivity.getString(C2336R.string.lbl_share_app_message);
                Intrinsics.checkIfNull(string, "getString(R.string.lbl_share_app_message)");
                Object[] objArr = new Object[1];
                Bundle extras = CardRegistrationStatusActivity.this.getIntent().getExtras();
                if (extras == null || (str = extras.getString("EXTRA_FOR_MASKED_NUMBER")) == null) {
                    str = BuildConfig.VERSION_NAME;
                }
                objArr[0] = str;
                String format = String.format(string, Arrays.copyOf(objArr, 1));
                Intrinsics.checkIfNull(format, "format(format, *args)");
                String string2 = CardRegistrationStatusActivity.this.getString(C2336R.string.lbl_share_app_title);
                Intrinsics.checkIfNull(string2, "getString(R.string.lbl_share_app_title)");
                IntentUtils.m24292b(cardRegistrationStatusActivity, format, string2);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12037a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    static {
        new C9231a(null);
    }

    /* renamed from: D0 */
    protected int mo11827D0() {
        Bundle extras = getIntent().getExtras();
        boolean z = true;
        if (extras == null || !extras.getBoolean("EXTRA_FOR_LAUNCH_FOR_RESUME")) {
            z = false;
        }
        return z ? C2336R.C2337drawable.ic_arrow_back : C2336R.C2337drawable.ic_close;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12045J0() {
        return C6450z.m20906b(CardRegistrationStatusViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12044K0() {
        return new C9232b();
    }

    /* renamed from: i1 */
    public final ViewModelFactoryByInjection m12042i1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24303f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j1 */
    public void m12043P0(AbstractC12092x0 abstractC12092x0, CardRegistrationStatusViewModel cardRegistrationStatusViewModel) {
        Intrinsics.isThisObjectNull(abstractC12092x0, "binding");
        Intrinsics.isThisObjectNull(cardRegistrationStatusViewModel, "viewModel");
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C9233c()));
        abstractC12092x0.f31835y.setText(Html.fromHtml(getString(C2336R.string.lbl_card_registration_contact), 0));
    }

    /* renamed from: n */
    public boolean m12040n() {
        return true;
    }

    public void onBackPressed() {
        ((CardRegistrationStatusViewModel) m22758I0()).m34532E0();
        super.onBackPressed();
    }

    /* renamed from: v0 */
    protected AbstractC9725a mo42216v0() {
        Bundle extras = getIntent().getExtras();
        boolean z = true;
        if (extras == null || !extras.getBoolean("EXTRA_FOR_LAUNCH_FOR_RESUME")) {
            z = false;
        }
        return z ? new C8617d() : new C8618e();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_loyalty_card_status;
    }
}
