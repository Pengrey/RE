package p205kj;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import ee.CustomDividerItemDecoration;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.TransactionCacheManager;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p205kj.StoreDetailViewModel;
import p418w7.C11580b;
import p418w7.C11581c;
import p418w7.C11593g;
import p418w7.InterfaceC11590d;
import p426wg.AbstractC12061v3;
import p463y7.C13129b;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseActivity;
import pe.C8617d;
import pt.pingodoce.app.data.local.models.stores.StoreSchedule;
import pt.pingodoce.app.data.remote.models.response.Store;
import td.InterfaceC10524i0;

/* renamed from: kj.a */
/* loaded from: classes2.dex */
public abstract class StoreDetailActivity<ViewModel extends StoreDetailViewModel> extends BaseActivity implements InterfaceC11590d {

    /* renamed from: f0 */
    public TransactionCacheManager f17995f0;

    /* renamed from: g0 */
    private Store f17996g0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StoreDetailActivity.kt */
    /* renamed from: kj.a$a */
    /* loaded from: classes2.dex */
    public static final class C6679a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C6679a f17997w = new C6679a();

        C6679a() {
            super(1);
        }

        /* renamed from: a */
        public final void m20297a(StoreSchedule storeSchedule) {
            Intrinsics.isThisObjectNull(storeSchedule, "it");
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m20297a((StoreSchedule) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StoreDetailActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.store.detail.StoreDetailActivity$initViews$1$1$2$1", m20196f = "StoreDetailActivity.kt", m20195l = {44}, m20194m = "invokeSuspend")
    /* renamed from: kj.a$b */
    /* loaded from: classes2.dex */
    public static final class C6680b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f17998x;

        /* renamed from: y */
        final /* synthetic */ StoreScheduleAdapter f17999y;

        /* renamed from: z */
        final /* synthetic */ StoreDetailActivity f18000z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6680b(StoreScheduleAdapter storeScheduleAdapter, StoreDetailActivity storeDetailActivity, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f17999y = storeScheduleAdapter;
            this.f18000z = storeDetailActivity;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C6680b(this.f17999y, this.f18000z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C6680b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f17998x;
            if (i == 0) {
                C13186n.m1453b(obj);
                StoreScheduleAdapter storeScheduleAdapter = this.f17999y;
                Store m20303i1 = StoreDetailActivity.m20303i1(this.f18000z);
                if (m20303i1 == null) {
                    Intrinsics.throwUninitPropException("store");
                    m20303i1 = null;
                }
                List m13698z = m20303i1.m13698z();
                this.f17998x = 1;
                if (storeScheduleAdapter.m22148H(m13698z, this) == m34636d) {
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

    /* renamed from: i1 */
    public static final /* synthetic */ Store m20303i1(StoreDetailActivity storeDetailActivity) {
        return storeDetailActivity.f17996g0;
    }

    /* renamed from: S0 */
    protected boolean m20304S0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: k1 */
    public final TransactionCacheManager m20301k1() {
        TransactionCacheManager transactionCacheManager = this.f17995f0;
        if (transactionCacheManager != null) {
            return transactionCacheManager;
        }
        Intrinsics.throwUninitPropException("cache");
        return null;
    }

    /* renamed from: l */
    public void mo4652l(C11581c c11581c) {
        Intrinsics.isThisObjectNull(c11581c, "map");
        c11581c.m4669h(MapStyleOptions.m31551h(this, C2336R.raw.map_style));
        C11593g m4672e = c11581c.m4672e();
        m4672e.m4650a(false);
        m4672e.m4649b(false);
        m4672e.m4648c(false);
        m4672e.m4645f(false);
        m4672e.m4646e(false);
        m4672e.m4647d(false);
        m4672e.m4644g(false);
        m4672e.m4643h(false);
        if (this.f17996g0 != null) {
            MarkerOptions markerOptions = new MarkerOptions();
            Store store = this.f17996g0;
            Store store2 = null;
            if (store == null) {
                Intrinsics.throwUninitPropException("store");
                store = null;
            }
            double m14317a = store.m13712e().m14317a();
            Store store3 = this.f17996g0;
            if (store3 == null) {
                Intrinsics.throwUninitPropException("store");
            } else {
                store2 = store3;
            }
            markerOptions.m31540N(new LatLng(m14317a, store2.m13712e().m14316b()));
            markerOptions.m31544J(C13129b.m1563b(C2336R.C2337drawable.ic_marker_on));
            c11581c.m4676a(markerOptions);
            c11581c.m4671f(C11580b.m4679c(markerOptions.m31549E(), 15.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l1 */
    public void m20305P0(AbstractC12061v3 abstractC12061v3, StoreDetailViewModel storeDetailViewModel) {
        Intrinsics.isThisObjectNull(abstractC12061v3, "binding");
        Intrinsics.isThisObjectNull(storeDetailViewModel, "viewModel");
        Store m18583g = m20301k1().m18583g();
        if (m18583g != null) {
            this.f17996g0 = m18583g;
            RecyclerView recyclerView = abstractC12061v3.f31712D;
            recyclerView.m36657h(new CustomDividerItemDecoration(this, 16, 0, 0, 0, 28, null));
            StoreScheduleAdapter storeScheduleAdapter = new StoreScheduleAdapter(C6679a.f17997w);
            C6772d.m20158d(LifecycleOwner.m36965a(this), null, null, new C6680b(storeScheduleAdapter, this, null), 3, null);
            recyclerView.setAdapter(storeScheduleAdapter);
        }
        abstractC12061v3.f31713E.m31574a(this);
        m20301k1().m18580j();
    }

    /* renamed from: n */
    public boolean m20299n() {
        return true;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13195u c13195u = C13195u.f34156a;
        ((AbstractC12061v3) m22738w0()).f31713E.m31573b(bundle);
    }

    protected void onDestroy() {
        ((AbstractC12061v3) m22738w0()).f31713E.m31572c();
        super.onDestroy();
    }

    public void onLowMemory() {
        ((AbstractC12061v3) m22738w0()).f31713E.m31571d();
        super.onLowMemory();
    }

    protected void onPause() {
        ((AbstractC12061v3) m22738w0()).f31713E.m31570e();
        super.onPause();
    }

    protected void onResume() {
        ((AbstractC12061v3) m22738w0()).f31713E.m31569f();
        super.onResume();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_store_detail;
    }
}
