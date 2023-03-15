package p226lj;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.view.View;
import androidx.fragment.app.ActivityC1354d;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.keyboardevents.C2354b;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.google.android.gms.location.C3084a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3413a;
import ee.CustomDividerItemDecoration;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p039c3.C2046o;
import p079e8.InterfaceC5016c;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p186jj.AbstractC6515g;
import p186jj.StoresViewModel;
import p195k5.C6599b;
import p226lj.StoreListFragment;
import p234m5.SuspendExtensions;
import p242mj.StoreListAdapter;
import p242mj.StorePlaceHolderAdapter;
import p249n5.PermissionsBuilder;
import p265o5.InterfaceC8020b;
import p400v7.C11131c;
import p426wg.AbstractC12064v6;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.AbstractC13876n;
import pt.pingodoce.app.data.remote.models.response.Store;
import td.InterfaceC10524i0;

/* renamed from: lj.d */
/* loaded from: classes2.dex */
public abstract class StoreListFragment<ViewModel extends AbstractC6515g> extends AbstractC13876n {

    /* renamed from: A0 */
    private C3413a f18768A0;

    /* renamed from: B0 */
    private LatLng f18769B0;

    /* renamed from: z0 */
    private StoreListAdapter f18770z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StoreListFragment.kt */
    /* renamed from: lj.d$a */
    /* loaded from: classes2.dex */
    public static final class C7064a extends AbstractC6438m implements InterfaceC6108l {
        C7064a() {
            super(1);
        }

        /* renamed from: a */
        public final void m19375a(Store store) {
            Intrinsics.isThisObjectNull(store, "it");
            StoreListFragment.this.m19387I2(store);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m19375a((Store) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: StoreListFragment.kt */
    /* renamed from: lj.d$b */
    /* loaded from: classes2.dex */
    public static final class C7065b extends RecyclerView.AbstractC1555t {
        C7065b() {
        }

        /* renamed from: a */
        public void mo29914a(RecyclerView recyclerView, int i) {
            Intrinsics.isThisObjectNull(recyclerView, "recyclerView");
            super.mo29914a(recyclerView, i);
            if (i == 1) {
                ActivityC1354d m37652G1 = StoreListFragment.this.m37652G1();
                Intrinsics.checkIfNull(m37652G1, "requireActivity()");
                C2354b.m33844b(m37652G1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StoreListFragment.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.store.list.StoreListFragment$initViews$4$1", m20196f = "StoreListFragment.kt", m20195l = {66}, m20194m = "invokeSuspend")
    /* renamed from: lj.d$c */
    /* loaded from: classes2.dex */
    public static final class C7066c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ AbstractC12064v6 f18773A;

        /* renamed from: x */
        int f18774x;

        /* renamed from: z */
        final /* synthetic */ C13182l f18776z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7066c(C13182l c13182l, AbstractC12064v6 abstractC12064v6, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f18776z = c13182l;
            this.f18773A = abstractC12064v6;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C7066c(this.f18776z, this.f18773A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C7066c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            Object obj2;
            m34636d = C2116d.m34636d();
            int i = this.f18774x;
            if (i == 0) {
                C13186n.m1453b(obj);
                StoreListAdapter m19379w2 = StoreListFragment.m19379w2(StoreListFragment.this);
                StoreListAdapter storeListAdapter = null;
                if (m19379w2 == null) {
                    Intrinsics.throwUninitPropException("storeListAdapter");
                    m19379w2 = null;
                }
                if (m19379w2.m18378L() == null) {
                    StoreListAdapter m19379w22 = StoreListFragment.m19379w2(StoreListFragment.this);
                    if (m19379w22 == null) {
                        Intrinsics.throwUninitPropException("storeListAdapter");
                        m19379w22 = null;
                    }
                    Iterator it = ((Iterable) this.f18776z.m1460c()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((Store) obj2).m13702t()) {
                            break;
                        }
                    }
                    m19379w22.m18373Q((Store) obj2);
                }
                StoreListAdapter m19379w23 = StoreListFragment.m19379w2(StoreListFragment.this);
                if (m19379w23 == null) {
                    Intrinsics.throwUninitPropException("storeListAdapter");
                } else {
                    storeListAdapter = m19379w23;
                }
                this.f18774x = 1;
                if (storeListAdapter.m22148H((List) this.f18776z.m1460c(), this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            this.f18773A.f31722y.m36643l1(0);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StoreListFragment.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.store.list.StoreListFragment$initViews$6", m20196f = "StoreListFragment.kt", m20195l = {83}, m20194m = "invokeSuspend")
    /* renamed from: lj.d$d */
    /* loaded from: classes2.dex */
    public static final class C7067d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f18777x;

        /* renamed from: z */
        final /* synthetic */ AbstractC6515g f18779z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7067d(AbstractC6515g abstractC6515g, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f18779z = abstractC6515g;
        }

        /* renamed from: d */
        public static /* synthetic */ void m19372d(StoreListFragment storeListFragment, AbstractC6515g abstractC6515g, C3084a c3084a, AbstractC3419d abstractC3419d) {
            m19369g(storeListFragment, abstractC6515g, c3084a, abstractC3419d);
        }

        /* renamed from: e */
        public static /* synthetic */ void m19371e(StoreListFragment storeListFragment, AbstractC3419d abstractC3419d) {
            m19368h(storeListFragment, abstractC3419d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final void m19369g(final StoreListFragment storeListFragment, AbstractC6515g abstractC6515g, C3084a c3084a, AbstractC3419d abstractC3419d) {
            C3413a c3413a = null;
            if (abstractC3419d.mo30780p()) {
                if (abstractC3419d.mo30784l() != null) {
                    StoreListFragment.m19376z2(storeListFragment, new LatLng(((Location) abstractC3419d.mo30784l()).getLatitude(), ((Location) abstractC3419d.mo30784l()).getLongitude()));
                    storeListFragment.m19394C2(StoreListFragment.m19378x2(storeListFragment));
                    return;
                }
                StoreListFragment.m19377y2(storeListFragment, new C3413a());
                abstractC6515g.m20752c0(true);
                C3413a m19380v2 = StoreListFragment.m19380v2(storeListFragment);
                if (m19380v2 == null) {
                    Intrinsics.throwUninitPropException("locationCancelToken");
                } else {
                    c3413a = m19380v2;
                }
                c3084a.m31621u(100, c3413a.m30805b()).mo30794b(new InterfaceC5016c() { // from class: lj.e
                    @Override // p079e8.InterfaceC5016c
                    /* renamed from: a */
                    public final void mo4683a(AbstractC3419d abstractC3484d2) {
                        StoreListFragment.C7067d.m19368h(StoreListFragment.this, abstractC3484d2);
                    }
                });
                return;
            }
            StoreListFragment.m19393D2(storeListFragment, null, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static final void m19368h(StoreListFragment storeListFragment, AbstractC3419d abstractC3419d) {
            if (abstractC3419d.mo30780p() && abstractC3419d.mo30784l() != null) {
                StoreListFragment.m19376z2(storeListFragment, new LatLng(((Location) abstractC3419d.mo30784l()).getLatitude(), ((Location) abstractC3419d.mo30784l()).getLongitude()));
            }
            storeListFragment.m19394C2(StoreListFragment.m19378x2(storeListFragment));
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C7067d(this.f18779z, interfaceC1886d);
        }

        /* renamed from: f */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C7067d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f18777x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC8020b build = PermissionsBuilder.m17729a(StoreListFragment.this, "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION").build();
                this.f18777x = 1;
                obj = SuspendExtensions.m19106a(build, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            if (C6599b.m20515a((List) obj)) {
                final C3084a m6034a = C11131c.m6034a(StoreListFragment.this.m37652G1());
                final StoreListFragment storeListFragment = StoreListFragment.this;
                final AbstractC6515g abstractC6515g = this.f18779z;
                m6034a.m31620v().mo30794b(new InterfaceC5016c() { // from class: lj.f
                    @Override // p079e8.InterfaceC5016c
                    /* renamed from: a */
                    public final void mo4683a(AbstractC3419d abstractC3484d) {
                        StoreListFragment.C7067d.m19369g(StoreListFragment.this, abstractC6515g, m6034a, abstractC3484d);
                    }
                });
            } else {
                StoreListFragment.m19393D2(StoreListFragment.this, null, 1, null);
            }
            return C13195u.f34156a;
        }
    }

    /* renamed from: D2 */
    public static /* synthetic */ void m19393D2(StoreListFragment storeListFragment, LatLng latLng, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStores");
        }
        if ((i & 1) != 0) {
            latLng = null;
        }
        storeListFragment.m19394C2(latLng);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F2 */
    public static final void m19391F2(StoreListFragment storeListFragment, View view) {
        Intrinsics.isThisObjectNull(storeListFragment, "this$0");
        StoreListAdapter storeListAdapter = storeListFragment.f18770z0;
        if (storeListAdapter == null) {
            Intrinsics.throwUninitPropException("storeListAdapter");
            storeListAdapter = null;
        }
        Store m18378L = storeListAdapter.m18378L();
        if (m18378L != null) {
            storeListFragment.m19396A2(m18378L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G2 */
    public static final void m19390G2(StoreListFragment storeListFragment, AbstractC12064v6 abstractC12064v6, C13182l c13182l) {
        Intrinsics.isThisObjectNull(storeListFragment, "this$0");
        Intrinsics.isThisObjectNull(abstractC12064v6, "$binding");
        InterfaceC1491v m37582i0 = storeListFragment.m37582i0();
        Intrinsics.checkIfNull(m37582i0, "viewLifecycleOwner");
        C6772d.m20158d(LifecycleOwner.m36965a(m37582i0), null, null, new C7066c(c13182l, abstractC12064v6, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H2 */
    public static final void m19389H2(AbstractC12064v6 abstractC12064v6, Boolean bool) {
        Intrinsics.isThisObjectNull(abstractC12064v6, "$binding");
        C2046o.m34853a(abstractC12064v6.f31722y);
        PlaceHolderRecyclerView placeHolderRecyclerView = abstractC12064v6.f31722y;
        Intrinsics.checkIfNull(bool, "it");
        placeHolderRecyclerView.m33813B1(bool.booleanValue());
    }

    /* renamed from: s2 */
    public static /* synthetic */ void m19383s2(AbstractC12064v6 abstractC12064v6, Boolean bool) {
        m19389H2(abstractC12064v6, bool);
    }

    /* renamed from: t2 */
    public static /* synthetic */ void m19382t2(StoreListFragment storeListFragment, View view) {
        m19391F2(storeListFragment, view);
    }

    /* renamed from: u2 */
    public static /* synthetic */ void m19381u2(StoreListFragment storeListFragment, AbstractC12064v6 abstractC12064v6, C13182l c13182l) {
        m19390G2(storeListFragment, abstractC12064v6, c13182l);
    }

    /* renamed from: v2 */
    public static final /* synthetic */ C3413a m19380v2(StoreListFragment storeListFragment) {
        return storeListFragment.f18768A0;
    }

    /* renamed from: w2 */
    public static final /* synthetic */ StoreListAdapter m19379w2(StoreListFragment storeListFragment) {
        return storeListFragment.f18770z0;
    }

    /* renamed from: x2 */
    public static final /* synthetic */ LatLng m19378x2(StoreListFragment storeListFragment) {
        return storeListFragment.f18769B0;
    }

    /* renamed from: y2 */
    public static final /* synthetic */ void m19377y2(StoreListFragment storeListFragment, C3413a c3413a) {
        storeListFragment.f18768A0 = c3413a;
    }

    /* renamed from: z2 */
    public static final /* synthetic */ void m19376z2(StoreListFragment storeListFragment, LatLng latLng) {
        storeListFragment.f18769B0 = latLng;
    }

    /* renamed from: A2 */
    public abstract void m19396A2(Store store);

    /* renamed from: B2 */
    protected boolean m19395B2() {
        return false;
    }

    /* renamed from: C2 */
    public abstract void m19394C2(LatLng latLng);

    /* JADX INFO: Access modifiers changed from: protected */
    @SuppressLint({"MissingPermission"})
    /* renamed from: E2 */
    public void m19384p2(final AbstractC12064v6 abstractC12064v6, AbstractC6515g abstractC6515g) {
        Intrinsics.isThisObjectNull(abstractC12064v6, "binding");
        Intrinsics.isThisObjectNull(abstractC6515g, "viewModel");
        this.f18770z0 = new StoreListAdapter(new C7064a());
        abstractC12064v6.f31721x.setOnClickListener(new View.OnClickListener() { // from class: lj.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoreListFragment.m19391F2(StoreListFragment.this, view);
            }
        });
        PlaceHolderRecyclerView placeHolderRecyclerView = abstractC12064v6.f31722y;
        Context m37650H1 = m37650H1();
        Intrinsics.checkIfNull(m37650H1, "requireContext()");
        placeHolderRecyclerView.m36657h(new CustomDividerItemDecoration(m37650H1, 10, 0, 0, 0, 28, null));
        StoreListAdapter storeListAdapter = this.f18770z0;
        if (storeListAdapter == null) {
            Intrinsics.throwUninitPropException("storeListAdapter");
            storeListAdapter = null;
        }
        placeHolderRecyclerView.setAdapter(storeListAdapter);
        placeHolderRecyclerView.setHoldersAdapter(new StorePlaceHolderAdapter());
        placeHolderRecyclerView.m36645l(new C7065b());
        StoresViewModel.f17642a.m20762a().mo171i(m37582i0(), new InterfaceC1440f0() { // from class: lj.b
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                StoreListFragment.m19390G2(StoreListFragment.this, abstractC12064v6, (C13182l) obj);
            }
        });
        if (!m19395B2()) {
            abstractC6515g.m20756Y().mo171i(m37582i0(), new InterfaceC1440f0() { // from class: lj.c
                @Override // androidx.lifecycle.InterfaceC1440f0
                /* renamed from: c */
                public final void mo37325a(Object obj) {
                    StoreListFragment.m19389H2(AbstractC12064v6.this, (Boolean) obj);
                }
            });
        }
        InterfaceC1491v m37582i0 = m37582i0();
        Intrinsics.checkIfNull(m37582i0, "viewLifecycleOwner");
        LifecycleOwner.m36965a(m37582i0).m36984i(new C7067d(abstractC6515g, null));
    }

    /* renamed from: I0 */
    public void mo33459I0() {
        C3413a c3413a = this.f18768A0;
        if (c3413a != null) {
            if (c3413a == null) {
                Intrinsics.throwUninitPropException("locationCancelToken");
                c3413a = null;
            }
            c3413a.m30806a();
        }
        super.mo33459I0();
    }

    /* renamed from: I2 */
    public abstract void m19387I2(Store store);

    /* renamed from: Y0 */
    public void mo33458Y0() {
        super.mo33458Y0();
    }

    /* renamed from: i2 */
    protected int m19385i2() {
        return C2336R.layout.fragment_store_list;
    }
}
