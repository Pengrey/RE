package pt.pingodoce.app.presentation.banner;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.core.view.C1112b0;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import me.InterfaceC7186c;
import mg.TransactionCacheManager;
import ne.EventObserver;
import p048cj.ProductDetailActivity;
import p106fe.IntentUtils;
import p144hi.ClubActivity;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11807i;
import p450xh.BannerDetailViewModel;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseActivity;
import p494zh.C13807a0;
import p494zh.C13815b3;
import p494zh.C13856k0;
import p494zh.C13904t1;
import pe.C8618e;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;
import pt.pingodoce.app.data.remote.models.response.Flyer;
import pt.pingodoce.app.presentation.banner.BannerDetailActivity;
import sj.FlyerActivity;
import td.C10565r0;
import td.InterfaceC10524i0;

/* compiled from: BannerDetailActivity.kt */
/* loaded from: classes2.dex */
public final class BannerDetailActivity extends BaseActivity {

    /* renamed from: f0 */
    public TransactionCacheManager f23629f0;

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f23630g0;

    /* compiled from: BannerDetailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.banner.BannerDetailActivity$a */
    /* loaded from: classes2.dex */
    static final class C8943a extends AbstractC6438m implements InterfaceC6097a {
        C8943a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m13060l1 = BannerDetailActivity.this.m13060l1();
            BannerDetailActivity bannerDetailActivity = BannerDetailActivity.this;
            return m13060l1.m20377b(bannerDetailActivity, bannerDetailActivity.getIntent().getExtras());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BannerDetailActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.banner.BannerDetailActivity$initViews$1", m20196f = "BannerDetailActivity.kt", m20195l = {64}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.banner.BannerDetailActivity$b */
    /* loaded from: classes2.dex */
    public static final class C8944b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23632x;

        C8944b(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8944b(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8944b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23632x;
            if (i == 0) {
                C13186n.m1453b(obj);
                this.f23632x = 1;
                if (C10565r0.m7677a(100L, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BannerDetailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.banner.BannerDetailActivity$c */
    /* loaded from: classes2.dex */
    public static final class C8945c extends AbstractC6438m implements InterfaceC6108l {
        C8945c() {
            super(1);
        }

        /* renamed from: a */
        public final void m13053a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "it");
            InterfaceC7186c interfaceC7186c = (InterfaceC7186c) c13182l.m1460c();
            if (interfaceC7186c instanceof C13856k0) {
                Flyer flyer = (Flyer) c13182l.m1459d();
                if (flyer.m13832m()) {
                    IntentUtils.m24293a(BannerDetailActivity.this, flyer.m13836h());
                    return;
                }
                BannerDetailActivity bannerDetailActivity = BannerDetailActivity.this;
                FlyerActivity.m8457b(bannerDetailActivity, flyer, bannerDetailActivity.m13061k1());
            } else if (interfaceC7186c instanceof C13904t1) {
                ProductDetailActivity.m34572d(BannerDetailActivity.this, (CatalogProduct) c13182l.m1459d(), null, false, BannerDetailActivity.this.m13061k1(), 6, null);
            } else if (interfaceC7186c instanceof C13815b3) {
                IntentUtils.m24293a(BannerDetailActivity.this, (String) c13182l.m1459d());
            } else if (interfaceC7186c instanceof C13807a0) {
                ClubActivity.m22636a(BannerDetailActivity.this);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m13053a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m13063i1(BannerDetailActivity bannerDetailActivity, View view) {
        m13057n1(bannerDetailActivity, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n1 */
    public static final void m13057n1(BannerDetailActivity bannerDetailActivity, View view) {
        Intrinsics.isThisObjectNull(bannerDetailActivity, "this$0");
        bannerDetailActivity.onBackPressed();
    }

    /* renamed from: D0 */
    protected int mo11827D0() {
        return C2336R.C2337drawable.ic_close;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13067J0() {
        return C6450z.m20906b(BannerDetailViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13066K0() {
        return new C8943a();
    }

    /* renamed from: M0 */
    protected boolean m13065M0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j1 */
    public C8618e mo42216v0() {
        return new C8618e();
    }

    /* renamed from: k1 */
    public final TransactionCacheManager m13061k1() {
        TransactionCacheManager transactionCacheManager = this.f23629f0;
        if (transactionCacheManager != null) {
            return transactionCacheManager;
        }
        Intrinsics.throwUninitPropException("cache");
        return null;
    }

    /* renamed from: l1 */
    public final ViewModelFactoryByInjection m13060l1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23630g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SuppressLint({"Range"})
    /* renamed from: m1 */
    public void m13064P0(AbstractC11807i abstractC11807i, BannerDetailViewModel bannerDetailViewModel) {
        Intrinsics.isThisObjectNull(abstractC11807i, "binding");
        Intrinsics.isThisObjectNull(bannerDetailViewModel, "viewModel");
        C1112b0.m38465J0(abstractC11807i.f30507x, "TRANSITION_IMAGE");
        LifecycleOwner.m36965a(this).m36984i(new C8944b(null));
        abstractC11807i.f30508y.setOnClickListener(new View.OnClickListener() { // from class: xh.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BannerDetailActivity.m13057n1(BannerDetailActivity.this, view);
            }
        });
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C8945c()));
    }

    /* renamed from: n */
    public boolean m13058n() {
        return true;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_banner_detail;
    }
}
