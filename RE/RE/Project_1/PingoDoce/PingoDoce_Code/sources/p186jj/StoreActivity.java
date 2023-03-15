package p186jj;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager2.widget.ViewPager2;
import be.OperatorExtensions;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.C3413a;
import com.google.android.material.tabs.C3737e;
import com.google.android.material.tabs.TabLayout;
import com.google.crypto.tink.shaded.protobuf.Reader;
import id.InterfaceC6108l;
import java.util.Objects;
import p050d.C4519c;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p186jj.AbstractC6515g;
import p315qe.AbstractC9725a;
import p426wg.AbstractC12020t3;
import p468yc.C13195u;
import p494zh.BaseActivity;
import pe.C8618e;

/* renamed from: jj.c */
/* loaded from: classes2.dex */
public abstract class StoreActivity<ViewModel extends AbstractC6515g> extends BaseActivity {

    /* renamed from: f0 */
    private InterfaceC6108l f17636f0 = OperatorExtensions.m35180a(500, LifecycleOwner.m36965a(this), new C6512a());

    /* renamed from: g0 */
    private LatLng f17637g0;

    /* renamed from: h0 */
    private C3413a f17638h0;

    /* renamed from: i0 */
    private final AbstractC0304b f17639i0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StoreActivity.kt */
    /* renamed from: jj.c$a */
    /* loaded from: classes2.dex */
    public static final class C6512a extends AbstractC6438m implements InterfaceC6108l {
        C6512a() {
            super(1);
        }

        /* renamed from: a */
        public final void m20765a(String str) {
            Intrinsics.isThisObjectNull(str, "query");
            StoreActivity storeActivity = StoreActivity.this;
            storeActivity.m20771n1(str, StoreActivity.m20774l1(storeActivity));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m20765a((String) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: StoreActivity.kt */
    /* renamed from: jj.c$b */
    /* loaded from: classes2.dex */
    public static final class C6513b implements SearchView.InterfaceC0439l {
        C6513b() {
        }

        /* renamed from: a */
        public boolean mo40760a(String str) {
            Intrinsics.isThisObjectNull(str, "newText");
            StoreActivity.m20775k1(StoreActivity.this).mo9587d(str);
            return true;
        }

        /* renamed from: b */
        public boolean mo40759b(String str) {
            Intrinsics.isThisObjectNull(str, "query");
            StoreActivity storeActivity = StoreActivity.this;
            storeActivity.m20771n1(str, StoreActivity.m20774l1(storeActivity));
            return true;
        }
    }

    public StoreActivity() {
        AbstractC0304b<I> m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: jj.a
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                StoreActivity.m20773m1(StoreActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul… finish()\n        }\n    }");
        this.f17639i0 = m41364M;
    }

    /* renamed from: R0 */
    private final void m20778R0(Toolbar toolbar) {
        m22752S0();
        toolbar.setTitle(m22760G0());
        toolbar.setNavigationIcon(mo11827D0());
        toolbar.setNavigationOnClickListener(m22763B0());
        toolbar.m40698x(C2336R.C2339menu.menu_search_view);
        View actionView = toolbar.getMenu().findItem(C2336R.C2338id.action_search).getActionView();
        Objects.requireNonNull(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        SearchView searchView = (SearchView) actionView;
        searchView.setMaxWidth(Reader.READ_DONE);
        searchView.setQueryHint(getString(C2336R.string.hint_store_search));
        searchView.setOnQueryTextListener(new C6513b());
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m20777i1(StoreActivity storeActivity, ActivityResult activityResult) {
        m20773m1(storeActivity, activityResult);
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m20776j1(StoresPagerAdapter storesPagerAdapter, TabLayout.C3728f c3728f, int i) {
        m20767r1(storesPagerAdapter, c3728f, i);
    }

    /* renamed from: k1 */
    public static final /* synthetic */ InterfaceC6108l m20775k1(StoreActivity storeActivity) {
        return storeActivity.f17636f0;
    }

    /* renamed from: l1 */
    public static final /* synthetic */ LatLng m20774l1(StoreActivity storeActivity) {
        return storeActivity.f17637g0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m1 */
    public static final void m20773m1(StoreActivity storeActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(storeActivity, "this$0");
        if (activityResult.m41351b() == -1) {
            storeActivity.setResult(-1, activityResult.m41352a());
            storeActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m20767r1(StoresPagerAdapter storesPagerAdapter, TabLayout.C3728f c3728f, int i) {
        Intrinsics.isThisObjectNull(storesPagerAdapter, "$pagerAdapter");
        Intrinsics.isThisObjectNull(c3728f, "tab");
        c3728f.m29139r((CharSequence) storesPagerAdapter.m20760X().get(i));
    }

    /* renamed from: D0 */
    protected int mo11827D0() {
        return C2336R.C2337drawable.ic_close;
    }

    /* renamed from: E0 */
    protected Integer m20780E0() {
        return Integer.valueOf((int) C2336R.string.lbl_favorite_store);
    }

    /* renamed from: n */
    public boolean m20772n() {
        return true;
    }

    /* renamed from: n1 */
    public abstract void m20771n1(String str, LatLng latLng);

    /* renamed from: o1 */
    public final AbstractC0304b m20770o1() {
        return this.f17639i0;
    }

    protected void onDestroy() {
        super.onDestroy();
        C3413a c3413a = this.f17638h0;
        if (c3413a != null) {
            if (c3413a == null) {
                Intrinsics.throwUninitPropException("locationCancelToken");
                c3413a = null;
            }
            c3413a.m30806a();
        }
    }

    /* renamed from: p1 */
    public abstract StoresPagerAdapter m20769p1();

    /* JADX INFO: Access modifiers changed from: protected */
    @SuppressLint({"MissingPermission"})
    /* renamed from: q1 */
    public void m20779P0(AbstractC12020t3 abstractC12020t3, AbstractC6515g abstractC6515g) {
        Intrinsics.isThisObjectNull(abstractC12020t3, "binding");
        Intrinsics.isThisObjectNull(abstractC6515g, "viewModel");
        final StoresPagerAdapter m20769p1 = m20769p1();
        ViewPager2 viewPager2 = abstractC12020t3.f31513y;
        viewPager2.setUserInputEnabled(false);
        viewPager2.setAdapter(m20769p1);
        viewPager2.setOffscreenPageLimit(1);
        new C3737e(abstractC12020t3.f31512x, abstractC12020t3.f31513y, new C3737e.InterfaceC3739b() { // from class: jj.b
            @Override // com.google.android.material.tabs.C3737e.InterfaceC3739b
            /* renamed from: a */
            public final void mo8459a(TabLayout.C3728f c3831f, int i) {
                StoreActivity.m20767r1(StoresPagerAdapter.this, c3831f, i);
            }
        }).m29104a();
        Toolbar toolbar = abstractC12020t3.f31514z;
        Intrinsics.checkIfNull(toolbar, "binding.toolbar");
        m20778R0(toolbar);
    }

    /* renamed from: v0 */
    protected AbstractC9725a mo42216v0() {
        return new C8618e();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_store;
    }
}
