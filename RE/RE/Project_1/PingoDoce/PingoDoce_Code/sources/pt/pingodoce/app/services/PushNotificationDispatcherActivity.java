package pt.pingodoce.app.services;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C6772d;
import me.InterfaceC7186c;
import mg.TransactionCacheManager;
import ne.EventObserver;
import p048cj.ProductDetailActivity;
import p090em.PushNotificationDispatcherViewModel;
import p106fe.IntentUtils;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11688b3;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseActivity;
import p494zh.C13856k0;
import p494zh.C13904t1;
import pe.C8618e;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;
import pt.pingodoce.app.data.remote.models.response.Flyer;
import sj.FlyerActivity;
import td.InterfaceC10524i0;

/* compiled from: PushNotificationDispatcherActivity.kt */
/* loaded from: classes2.dex */
public final class PushNotificationDispatcherActivity extends BaseActivity {

    /* renamed from: f0 */
    public TransactionCacheManager f25081f0;

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f25082g0;

    /* compiled from: PushNotificationDispatcherActivity.kt */
    /* renamed from: pt.pingodoce.app.services.PushNotificationDispatcherActivity$a */
    /* loaded from: classes2.dex */
    public static final class C9539a {
        private C9539a() {
        }

        public /* synthetic */ C9539a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PushNotificationDispatcherActivity.kt */
    /* renamed from: pt.pingodoce.app.services.PushNotificationDispatcherActivity$b */
    /* loaded from: classes2.dex */
    static final class C9540b extends AbstractC6438m implements InterfaceC6097a {
        C9540b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m10686k1 = PushNotificationDispatcherActivity.this.m10686k1();
            PushNotificationDispatcherActivity pushNotificationDispatcherActivity = PushNotificationDispatcherActivity.this;
            return m10686k1.m20377b(pushNotificationDispatcherActivity, pushNotificationDispatcherActivity.getIntent().getExtras());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PushNotificationDispatcherActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.services.PushNotificationDispatcherActivity$initViews$1", m20196f = "PushNotificationDispatcherActivity.kt", m20195l = {71, 73}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.services.PushNotificationDispatcherActivity$c */
    /* loaded from: classes2.dex */
    public static final class C9541c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f25084x;

        /* renamed from: z */
        final /* synthetic */ PushNotificationDispatcherViewModel f25086z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9541c(PushNotificationDispatcherViewModel pushNotificationDispatcherViewModel, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f25086z = pushNotificationDispatcherViewModel;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9541c(this.f25086z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9541c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            String string;
            String string2;
            m34636d = C2116d.m34636d();
            int i = this.f25084x;
            if (i == 0) {
                C13186n.m1453b(obj);
                Bundle extras = PushNotificationDispatcherActivity.this.getIntent().getExtras();
                boolean z = false;
                if (extras != null && extras.getBoolean("EXTRAS_IS_FLYER")) {
                    z = true;
                }
                String str = BuildConfig.VERSION_NAME;
                if (z) {
                    PushNotificationDispatcherViewModel pushNotificationDispatcherViewModel = this.f25086z;
                    Bundle extras2 = PushNotificationDispatcherActivity.this.getIntent().getExtras();
                    if (extras2 != null && (string2 = extras2.getString("EXTRAS_FLYER_ID")) != null) {
                        str = string2;
                    }
                    this.f25084x = 1;
                    if (pushNotificationDispatcherViewModel.m25570P(str, this) == m34636d) {
                        return m34636d;
                    }
                } else {
                    PushNotificationDispatcherViewModel pushNotificationDispatcherViewModel2 = this.f25086z;
                    Bundle extras3 = PushNotificationDispatcherActivity.this.getIntent().getExtras();
                    if (extras3 != null && (string = extras3.getString("EXTRAS_PRODUCT_ID")) != null) {
                        str = string;
                    }
                    this.f25084x = 2;
                    if (pushNotificationDispatcherViewModel2.m25571O(str, this) == m34636d) {
                        return m34636d;
                    }
                }
            } else if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PushNotificationDispatcherActivity.kt */
    /* renamed from: pt.pingodoce.app.services.PushNotificationDispatcherActivity$d */
    /* loaded from: classes2.dex */
    public static final class C9542d extends AbstractC6438m implements InterfaceC6108l {
        C9542d() {
            super(1);
        }

        /* renamed from: a */
        public final void m10679a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "it");
            InterfaceC7186c interfaceC7186c = (InterfaceC7186c) c13182l.m1460c();
            if (interfaceC7186c instanceof C13856k0) {
                Flyer flyer = (Flyer) c13182l.m1459d();
                if (flyer.m13832m()) {
                    IntentUtils.m24293a(PushNotificationDispatcherActivity.this, flyer.m13836h());
                } else {
                    PushNotificationDispatcherActivity pushNotificationDispatcherActivity = PushNotificationDispatcherActivity.this;
                    FlyerActivity.m8457b(pushNotificationDispatcherActivity, flyer, pushNotificationDispatcherActivity.m10687j1());
                }
            } else if (interfaceC7186c instanceof C13904t1) {
                ProductDetailActivity.m34572d(PushNotificationDispatcherActivity.this, (CatalogProduct) c13182l.m1459d(), null, false, PushNotificationDispatcherActivity.this.m10687j1(), 6, null);
            }
            PushNotificationDispatcherActivity.this.finish();
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m10679a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    static {
        new C9539a(null);
    }

    /* renamed from: D0 */
    protected int mo11827D0() {
        return C2336R.C2337drawable.ic_close;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m10692J0() {
        return C6450z.m20906b(PushNotificationDispatcherViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m10691K0() {
        return new C9540b();
    }

    /* renamed from: M0 */
    protected boolean m10690M0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i1 */
    public C8618e mo42216v0() {
        return new C8618e();
    }

    /* renamed from: j1 */
    public final TransactionCacheManager m10687j1() {
        TransactionCacheManager transactionCacheManager = this.f25081f0;
        if (transactionCacheManager != null) {
            return transactionCacheManager;
        }
        Intrinsics.throwUninitPropException("cache");
        return null;
    }

    /* renamed from: k1 */
    public final ViewModelFactoryByInjection m10686k1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f25082g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l1 */
    public void m10689P0(AbstractC11688b3 abstractC11688b3, PushNotificationDispatcherViewModel pushNotificationDispatcherViewModel) {
        Intrinsics.isThisObjectNull(abstractC11688b3, "binding");
        Intrinsics.isThisObjectNull(pushNotificationDispatcherViewModel, "viewModel");
        C6772d.m20158d(LifecycleOwner.m36965a(this), null, null, new C9541c(pushNotificationDispatcherViewModel, null), 3, null);
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C9542d()));
    }

    /* renamed from: n */
    public boolean m10684n() {
        return true;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_push_notification_dispatcher;
    }
}
