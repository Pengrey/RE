package pt.pingodoce.app.presentation.clubs.wine;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import be.UtilsExtensions;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import ee.MarginItemDecoration;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import me.InterfaceC7186c;
import mg.ClubManager;
import ne.EventObserver;
import p070e.C4906j;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p185ji.WineClubRegionAdapter;
import p185ji.WineClubTypeAdapter;
import p221le.UiEventsLiveData;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC12096x4;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.AppNavigationTypes;
import p494zh.BaseActivity;
import p494zh.C13810a3;
import p494zh.C13825d3;
import p494zh.C13887p0;
import pe.C8617d;
import pt.pingodoce.app.presentation.clubs.wine.WineClubHomeActivity;
import td.InterfaceC10524i0;

/* compiled from: WineClubHomeActivity.kt */
/* loaded from: classes2.dex */
public final class WineClubHomeActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f23740f0;

    /* renamed from: g0 */
    public ClubManager f23741g0;

    /* compiled from: WineClubHomeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.WineClubHomeActivity$a */
    /* loaded from: classes2.dex */
    static final class C9006a extends AbstractC6438m implements InterfaceC6097a {
        C9006a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(WineClubHomeActivity.this.m12873m1(), WineClubHomeActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WineClubHomeActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.clubs.wine.WineClubHomeActivity$initViews$1", m20196f = "WineClubHomeActivity.kt", m20195l = {69}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.WineClubHomeActivity$b */
    /* loaded from: classes2.dex */
    public static final class C9007b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23743x;

        /* renamed from: z */
        final /* synthetic */ WineClubHomeViewModel f23745z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WineClubHomeActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.clubs.wine.WineClubHomeActivity$b$a */
        /* loaded from: classes2.dex */
        public static final class C9008a implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ WineClubHomeViewModel f23746w;

            C9008a(WineClubHomeViewModel wineClubHomeViewModel) {
                this.f23746w = wineClubHomeViewModel;
            }

            /* renamed from: d */
            public final Object mo4529a(List list, InterfaceC1886d interfaceC1886d) {
                this.f23746w.m12788y1(list);
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9007b(WineClubHomeViewModel wineClubHomeViewModel, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23745z = wineClubHomeViewModel;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9007b(this.f23745z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9007b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23743x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC6785c m18645i = WineClubHomeActivity.this.m12874l1().m18645i();
                C9008a c9008a = new C9008a(this.f23745z);
                this.f23743x = 1;
                if (m18645i.mo20086d(c9008a, this) == m34636d) {
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
    /* compiled from: WineClubHomeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.WineClubHomeActivity$c */
    /* loaded from: classes2.dex */
    public static final class C9009c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: x */
        final /* synthetic */ boolean f23748x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9009c(boolean z) {
            super(1);
            this.f23748x = z;
        }

        /* renamed from: a */
        public final void m12863a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "it");
            InterfaceC7186c interfaceC7186c = (InterfaceC7186c) c13182l.m1460c();
            if (interfaceC7186c instanceof C13887p0) {
                p185ji.WineClubUpdateActivity.m20786b(WineClubHomeActivity.this, this.f23748x, null, 2, null);
                WineClubHomeActivity.this.finish();
            } else if (interfaceC7186c instanceof AppNavigationTypes) {
                p185ji.WineClubUpdateActivity.m20782f(WineClubHomeActivity.this, true, null, 2, null);
            } else if (interfaceC7186c instanceof C13825d3) {
                p185ji.WineClubUpdateActivity.m20784d(WineClubHomeActivity.this, true, null, 2, null);
            } else if (interfaceC7186c instanceof C13810a3) {
                Uri parse = Uri.parse("https://vinho.pingodoce.pt/");
                Intrinsics.checkIfNull(parse, "parse(this)");
                WineClubHomeActivity.this.startActivity(new Intent("android.intent.action.VIEW", parse));
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12863a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WineClubHomeActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.clubs.wine.WineClubHomeActivity$setupAdapters$2$1", m20196f = "WineClubHomeActivity.kt", m20195l = {C4906j.f13390C0}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.WineClubHomeActivity$d */
    /* loaded from: classes2.dex */
    public static final class C9010d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23749x;

        /* renamed from: y */
        final /* synthetic */ WineClubTypeAdapter f23750y;

        /* renamed from: z */
        final /* synthetic */ List f23751z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9010d(WineClubTypeAdapter wineClubTypeAdapter, List list, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23750y = wineClubTypeAdapter;
            this.f23751z = list;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9010d(this.f23750y, this.f23751z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9010d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23749x;
            if (i == 0) {
                C13186n.m1453b(obj);
                WineClubTypeAdapter wineClubTypeAdapter = this.f23750y;
                List list = this.f23751z;
                Intrinsics.checkIfNull(list, "it");
                this.f23749x = 1;
                if (wineClubTypeAdapter.m22148H(list, this) == m34636d) {
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
    /* compiled from: WineClubHomeActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.clubs.wine.WineClubHomeActivity$setupAdapters$4$1", m20196f = "WineClubHomeActivity.kt", m20195l = {147}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.WineClubHomeActivity$e */
    /* loaded from: classes2.dex */
    public static final class C9011e extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23752x;

        /* renamed from: y */
        final /* synthetic */ WineClubRegionAdapter f23753y;

        /* renamed from: z */
        final /* synthetic */ List f23754z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9011e(WineClubRegionAdapter wineClubRegionAdapter, List list, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23753y = wineClubRegionAdapter;
            this.f23754z = list;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9011e(this.f23753y, this.f23754z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9011e) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23752x;
            if (i == 0) {
                C13186n.m1453b(obj);
                WineClubRegionAdapter wineClubRegionAdapter = this.f23753y;
                List list = this.f23754z;
                Intrinsics.checkIfNull(list, "it");
                this.f23752x = 1;
                if (wineClubRegionAdapter.m22148H(list, this) == m34636d) {
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
    public static /* synthetic */ void m12877i1(WineClubHomeActivity wineClubHomeActivity, WineClubRegionAdapter wineClubRegionAdapter, List list) {
        m12868q1(wineClubHomeActivity, wineClubRegionAdapter, list);
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m12876j1(WineClubHomeActivity wineClubHomeActivity, WineClubTypeAdapter wineClubTypeAdapter, List list) {
        m12869p1(wineClubHomeActivity, wineClubTypeAdapter, list);
    }

    /* renamed from: o1 */
    private final void m12870o1() {
        final WineClubRegionAdapter wineClubRegionAdapter = new WineClubRegionAdapter();
        final WineClubTypeAdapter wineClubTypeAdapter = new WineClubTypeAdapter();
        PlaceHolderRecyclerView placeHolderRecyclerView = ((AbstractC12096x4) m22738w0()).f31861D.f31055z.f31882y;
        placeHolderRecyclerView.m36657h(new MarginItemDecoration(0, 0, 0, UtilsExtensions.m35167e(8), false, true, 0, 16, null));
        placeHolderRecyclerView.setAdapter(wineClubTypeAdapter);
        ((WineClubHomeViewModel) m22758I0()).m12744K0().mo171i(this, new InterfaceC1440f0() { // from class: ji.b
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                WineClubHomeActivity.m12869p1(WineClubHomeActivity.this, wineClubTypeAdapter, (List) obj);
            }
        });
        PlaceHolderRecyclerView placeHolderRecyclerView2 = ((AbstractC12096x4) m22738w0()).f31861D.f31053x.f31731y;
        placeHolderRecyclerView2.m36657h(new MarginItemDecoration(0, 0, 0, UtilsExtensions.m35167e(8), false, true, 0, 16, null));
        placeHolderRecyclerView2.setAdapter(wineClubRegionAdapter);
        ((WineClubHomeViewModel) m22758I0()).m12745J0().mo171i(this, new InterfaceC1440f0() { // from class: ji.a
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                WineClubHomeActivity.m12868q1(WineClubHomeActivity.this, wineClubRegionAdapter, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1 */
    public static final void m12869p1(WineClubHomeActivity wineClubHomeActivity, WineClubTypeAdapter wineClubTypeAdapter, List list) {
        Intrinsics.isThisObjectNull(wineClubHomeActivity, "this$0");
        Intrinsics.isThisObjectNull(wineClubTypeAdapter, "$typeAdapter");
        Intrinsics.checkIfNull(list, "it");
        if (!list.isEmpty()) {
            ((WineClubHomeViewModel) wineClubHomeActivity.m22758I0()).m12799n1().mo166p(Boolean.TRUE);
            C6772d.m20158d(LifecycleOwner.m36965a(wineClubHomeActivity), null, null, new C9010d(wineClubTypeAdapter, list, null), 3, null);
            return;
        }
        ((WineClubHomeViewModel) wineClubHomeActivity.m22758I0()).m12799n1().mo166p(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m12868q1(WineClubHomeActivity wineClubHomeActivity, WineClubRegionAdapter wineClubRegionAdapter, List list) {
        Intrinsics.isThisObjectNull(wineClubHomeActivity, "this$0");
        Intrinsics.isThisObjectNull(wineClubRegionAdapter, "$regionAdapter");
        Intrinsics.checkIfNull(list, "it");
        if (!list.isEmpty()) {
            ((WineClubHomeViewModel) wineClubHomeActivity.m22758I0()).m12801m1().mo166p(Boolean.TRUE);
            C6772d.m20158d(LifecycleOwner.m36965a(wineClubHomeActivity), null, null, new C9011e(wineClubRegionAdapter, list, null), 3, null);
            return;
        }
        ((WineClubHomeViewModel) wineClubHomeActivity.m22758I0()).m12801m1().mo166p(Boolean.FALSE);
    }

    /* renamed from: G0 */
    protected int m12881G0() {
        return C2336R.string.lbl_wine_club_name;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12880J0() {
        return C6450z.m20906b(WineClubHomeViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12879K0() {
        return new C9006a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: l1 */
    public final ClubManager m12874l1() {
        ClubManager clubManager = this.f23741g0;
        if (clubManager != null) {
            return clubManager;
        }
        Intrinsics.throwUninitPropException("clubManager");
        return null;
    }

    /* renamed from: m1 */
    public final ViewModelFactoryByInjection m12873m1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23740f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: n */
    public boolean m12872n() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n1 */
    public void m12878P0(AbstractC12096x4 abstractC12096x4, WineClubHomeViewModel wineClubHomeViewModel) {
        Intrinsics.isThisObjectNull(abstractC12096x4, "binding");
        Intrinsics.isThisObjectNull(wineClubHomeViewModel, "viewModel");
        LifecycleOwner.m36965a(this).m36985h(new C9007b(wineClubHomeViewModel, null));
        Bundle extras = getIntent().getExtras();
        boolean z = extras != null ? extras.getBoolean("KEY_FOR_CLUB_SUBSCRIPTION") : false;
        wineClubHomeViewModel.m12789x1(z);
        if (z) {
            m12870o1();
        }
        abstractC12096x4.f31860C.f30317y.setText(getString(C2336R.string.lbl_clubS_wine_know_more_subtitle));
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C9009c(z)));
    }

    public void onBackPressed() {
        ((WineClubHomeViewModel) m22758I0()).m12794s1();
        super.onBackPressed();
    }

    protected void onResume() {
        super.onResume();
        Bundle extras = getIntent().getExtras();
        if (extras != null ? extras.getBoolean("KEY_FOR_CLUB_SUBSCRIPTION") : false) {
            ((WineClubHomeViewModel) m22758I0()).m12735T0();
        }
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(getString(C2336R.string.lbl_wine_club_name));
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_wine_club_home;
    }
}
