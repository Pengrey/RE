package p257nj;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0928a;
import androidx.fragment.app.ActivityC1354d;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import be.UtilsExtensions;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.keyboardevents.C2354b;
import com.github.guilhe.keyboardevents.C2355c;
import com.github.guilhe.keyboardevents.EnumC2353a;
import com.google.android.gms.location.C3084a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3413a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import id.InterfaceC6112p;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p012ab.InterfaceC0098a;
import p047ce.FluidContentResizer;
import p079e8.InterfaceC5016c;
import p181jd.Intrinsics;
import p186jj.AbstractC6515g;
import p186jj.StoresViewModel;
import p195k5.C6599b;
import p234m5.SuspendExtensions;
import p249n5.PermissionsBuilder;
import p257nj.StoreMapFragment;
import p265o5.InterfaceC8020b;
import p378u5.C10841b;
import p378u5.ResourcesProvider;
import p400v7.C11131c;
import p418w7.C11580b;
import p418w7.C11581c;
import p418w7.InterfaceC11590d;
import p426wg.AbstractC12098x6;
import p463y7.C13129b;
import p463y7.C13130c;
import p466ya.C13144c;
import p466ya.InterfaceC13142a;
import p466ya.InterfaceC13143b;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.AbstractC13876n;
import pt.pingodoce.app.data.remote.models.response.Store;
import td.InterfaceC10524i0;

/* renamed from: nj.l */
/* loaded from: classes2.dex */
public abstract class StoreMapFragment<ViewModel extends AbstractC6515g> extends AbstractC13876n implements InterfaceC11590d {

    /* renamed from: A0 */
    private Store f20557A0;

    /* renamed from: B0 */
    private CameraPosition f20558B0;

    /* renamed from: C0 */
    private LatLng f20559C0;

    /* renamed from: D0 */
    private C13144c f20560D0;

    /* renamed from: E0 */
    private C3413a f20561E0;

    /* renamed from: z0 */
    private boolean f20562z0;

    /* compiled from: StoreMapFragment.kt */
    /* renamed from: nj.l$a */
    /* loaded from: classes2.dex */
    public static final class C7921a extends BottomSheetBehavior.AbstractC3499f {
        C7921a() {
        }

        /* renamed from: b */
        public void mo30311b(View view, float f) {
            Intrinsics.isThisObjectNull(view, "bottomSheet");
        }

        /* renamed from: c */
        public void mo30310c(View view, int i) {
            Intrinsics.isThisObjectNull(view, "bottomSheet");
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                StoreMapFragment.m17593C2(StoreMapFragment.this);
                return;
            }
            ActivityC1354d m37652G1 = StoreMapFragment.this.m37652G1();
            Intrinsics.checkIfNull(m37652G1, "requireActivity()");
            C2354b.m33844b(m37652G1);
        }
    }

    /* compiled from: StoreMapFragment.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.store.map.StoreMapFragment$onMapReady$3", m20196f = "StoreMapFragment.kt", m20195l = {147}, m20194m = "invokeSuspend")
    /* renamed from: nj.l$b */
    /* loaded from: classes2.dex */
    static final class C7922b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f20564x;

        /* renamed from: z */
        final /* synthetic */ C11581c f20566z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7922b(C11581c c11581c, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f20566z = c11581c;
        }

        /* renamed from: d */
        public static /* synthetic */ void m17552d(StoreMapFragment storeMapFragment, AbstractC3419d abstractC3419d) {
            m17548h(storeMapFragment, abstractC3419d);
        }

        /* renamed from: e */
        public static /* synthetic */ void m17551e(StoreMapFragment storeMapFragment, C3084a c3084a, AbstractC3419d abstractC3419d) {
            m17549g(storeMapFragment, c3084a, abstractC3419d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final void m17549g(final StoreMapFragment storeMapFragment, C3084a c3084a, AbstractC3419d abstractC3419d) {
            C3413a c3413a = null;
            if (abstractC3419d.mo30780p()) {
                if (abstractC3419d.mo30784l() != null) {
                    StoreMapFragment.m17587H2(storeMapFragment, new LatLng(((Location) abstractC3419d.mo30784l()).getLatitude(), ((Location) abstractC3419d.mo30784l()).getLongitude()));
                    storeMapFragment.m17578P2(StoreMapFragment.m17591E2(storeMapFragment));
                    return;
                }
                StoreMapFragment.m17589G2(storeMapFragment, new C3413a());
                StoreMapFragment.m17590F2(storeMapFragment).m20752c0(true);
                C3413a m17592D2 = StoreMapFragment.m17592D2(storeMapFragment);
                if (m17592D2 == null) {
                    Intrinsics.throwUninitPropException("locationCancelToken");
                } else {
                    c3413a = m17592D2;
                }
                c3084a.m31621u(100, c3413a.m30805b()).mo30794b(new InterfaceC5016c() { // from class: nj.m
                    @Override // p079e8.InterfaceC5016c
                    /* renamed from: a */
                    public final void mo4683a(AbstractC3419d abstractC3484d2) {
                        StoreMapFragment.C7922b.m17548h(StoreMapFragment.this, abstractC3484d2);
                    }
                });
                return;
            }
            StoreMapFragment.m17577Q2(storeMapFragment, null, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static final void m17548h(StoreMapFragment storeMapFragment, AbstractC3419d abstractC3419d) {
            if (abstractC3419d.mo30780p() && abstractC3419d.mo30784l() != null) {
                StoreMapFragment.m17587H2(storeMapFragment, new LatLng(((Location) abstractC3419d.mo30784l()).getLatitude(), ((Location) abstractC3419d.mo30784l()).getLongitude()));
            }
            storeMapFragment.m17578P2(StoreMapFragment.m17591E2(storeMapFragment));
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C7922b(this.f20566z, interfaceC1886d);
        }

        /* renamed from: f */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C7922b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f20564x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC8020b build = PermissionsBuilder.m17729a(StoreMapFragment.this, "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION").build();
                this.f20564x = 1;
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
                this.f20566z.m4668i(true);
                final C3084a m6034a = C11131c.m6034a(StoreMapFragment.this.m37652G1());
                final StoreMapFragment storeMapFragment = StoreMapFragment.this;
                m6034a.m31620v().mo30794b(new InterfaceC5016c() { // from class: nj.n
                    @Override // p079e8.InterfaceC5016c
                    /* renamed from: a */
                    public final void mo4683a(AbstractC3419d abstractC3484d) {
                        StoreMapFragment.C7922b.m17549g(StoreMapFragment.this, m6034a, abstractC3484d);
                    }
                });
            } else {
                StoreMapFragment.m17577Q2(StoreMapFragment.this, null, 1, null);
            }
            return C13195u.f34156a;
        }
    }

    /* renamed from: A2 */
    public static /* synthetic */ void m17595A2(StoreMapFragment storeMapFragment, EnumC2353a enumC2353a) {
        m17575S2(storeMapFragment, enumC2353a);
    }

    /* renamed from: B2 */
    public static /* synthetic */ void m17594B2(StoreMapFragment storeMapFragment, Store store, View view) {
        m17583K2(storeMapFragment, store, view);
    }

    /* renamed from: C2 */
    public static final /* synthetic */ void m17593C2(StoreMapFragment storeMapFragment) {
        storeMapFragment.m17580N2();
    }

    /* renamed from: D2 */
    public static final /* synthetic */ C3413a m17592D2(StoreMapFragment storeMapFragment) {
        return storeMapFragment.f20561E0;
    }

    /* renamed from: E2 */
    public static final /* synthetic */ LatLng m17591E2(StoreMapFragment storeMapFragment) {
        return storeMapFragment.f20559C0;
    }

    /* renamed from: F2 */
    public static final /* synthetic */ AbstractC6515g m17590F2(StoreMapFragment storeMapFragment) {
        return (AbstractC6515g) storeMapFragment.m22721j2();
    }

    /* renamed from: G2 */
    public static final /* synthetic */ void m17589G2(StoreMapFragment storeMapFragment, C3413a c3413a) {
        storeMapFragment.f20561E0 = c3413a;
    }

    /* renamed from: H2 */
    public static final /* synthetic */ void m17587H2(StoreMapFragment storeMapFragment, LatLng latLng) {
        storeMapFragment.f20559C0 = latLng;
    }

    /* renamed from: I2 */
    private final void m17585I2(final Store store) {
        if (store != null) {
            ((AbstractC12098x6) m22723h2()).f31867x.mo4370R(store);
            ((AbstractC12098x6) m22723h2()).f31867x.mo4369S(Integer.valueOf(((AbstractC6515g) m22721j2()).m20748S(store)));
            ((AbstractC12098x6) m22723h2()).f31867x.m37807n();
            ((AbstractC12098x6) m22723h2()).f31867x.m37802s().setOnClickListener(new View.OnClickListener() { // from class: nj.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StoreMapFragment.m17583K2(StoreMapFragment.this, store, view);
                }
            });
            ((AbstractC12098x6) m22723h2()).f31867x.f30094x.setOnClickListener(new View.OnClickListener() { // from class: nj.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StoreMapFragment.m17582L2(StoreMapFragment.this, store, view);
                }
            });
        }
        BottomSheetBehavior m30367f0 = BottomSheetBehavior.m30367f0(((AbstractC12098x6) m22723h2()).f31867x.m37802s());
        m30367f0.m30402I0(store != null ? 3 : 4);
        m30367f0.m30376W(new C7921a());
    }

    /* renamed from: J2 */
    static /* synthetic */ void m17584J2(StoreMapFragment storeMapFragment, Store store, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindStoreToBottomSheet");
        }
        if ((i & 1) != 0) {
            store = null;
        }
        storeMapFragment.m17585I2(store);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K2 */
    public static final void m17583K2(StoreMapFragment storeMapFragment, Store store, View view) {
        Intrinsics.isThisObjectNull(storeMapFragment, "this$0");
        storeMapFragment.m17565a3(store);
        TextView textView = ((AbstractC12098x6) storeMapFragment.m22723h2()).f31867x.f30089B;
        Intrinsics.checkIfNull(textView, "binding.bottomsheetIncluded.constStoreName");
        UtilsExtensions.m35171a(textView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L2 */
    public static final void m17582L2(StoreMapFragment storeMapFragment, Store store, View view) {
        Intrinsics.isThisObjectNull(storeMapFragment, "this$0");
        storeMapFragment.m17581M2(store);
    }

    /* renamed from: N2 */
    private final void m17580N2() {
        if (this.f20557A0 != null) {
            C13144c c13144c = this.f20560D0;
            if (c13144c == null) {
                Intrinsics.throwUninitPropException("clusterManager");
                c13144c = null;
            }
            InterfaceC0098a m1532l = c13144c.m1532l();
            Objects.requireNonNull(m1532l, "null cannot be cast to non-null type pt.pingodoce.app.presentation.common.store.map.StoreClusterRenderer");
            C13130c m41948J = ((StoreClusterRenderer) m1532l).m41948J(this.f20557A0);
            if (m41948J != null) {
                m41948J.m1555f(C13129b.m1563b(C2336R.C2337drawable.ic_marker_off));
            }
        }
        this.f20557A0 = null;
    }

    /* renamed from: O2 */
    private final void m17579O2() {
        m17580N2();
        m17584J2(this, null, 1, null);
    }

    /* renamed from: Q2 */
    public static /* synthetic */ void m17577Q2(StoreMapFragment storeMapFragment, LatLng latLng, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStores");
        }
        if ((i & 1) != 0) {
            latLng = null;
        }
        storeMapFragment.m17578P2(latLng);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S2 */
    public static final void m17575S2(StoreMapFragment storeMapFragment, EnumC2353a enumC2353a) {
        Intrinsics.isThisObjectNull(storeMapFragment, "this$0");
        if (enumC2353a == EnumC2353a.OPEN) {
            storeMapFragment.m17579O2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T2 */
    public static final void m17573T2(AbstractC12098x6 abstractC12098x6, String str) {
        Intrinsics.isThisObjectNull(abstractC12098x6, "$binding");
        abstractC12098x6.f31867x.mo4371Q(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U2 */
    public static final boolean m17572U2(StoreMapFragment storeMapFragment, C11581c c11581c, InterfaceC13142a interfaceC13142a) {
        Intrinsics.isThisObjectNull(storeMapFragment, "this$0");
        Intrinsics.isThisObjectNull(c11581c, "$map");
        storeMapFragment.m17579O2();
        LatLngBounds.C3121a m31556h = LatLngBounds.m31556h();
        Intrinsics.checkIfNull(m31556h, "builder()");
        Collection<Store> mo521d = interfaceC13142a.mo521d();
        Intrinsics.checkIfNull(mo521d, "it.items");
        for (Store store : mo521d) {
            m31556h.m31552b(store.mo1544b());
        }
        c11581c.m4675b(C11580b.m4680b(m31556h.m31553a(), UtilsExtensions.m35167e(100)));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V2 */
    public static final boolean m17571V2(StoreMapFragment storeMapFragment, C13144c c13144c, C11581c c11581c, Store store) {
        Intrinsics.isThisObjectNull(storeMapFragment, "this$0");
        Intrinsics.isThisObjectNull(c13144c, "$this_with");
        Intrinsics.isThisObjectNull(c11581c, "$map");
        storeMapFragment.m17580N2();
        storeMapFragment.f20557A0 = store;
        InterfaceC0098a m1532l = c13144c.m1532l();
        Objects.requireNonNull(m1532l, "null cannot be cast to non-null type pt.pingodoce.app.presentation.common.store.map.StoreClusterRenderer");
        C13130c m41948J = ((StoreClusterRenderer) m1532l).m41948J(storeMapFragment.f20557A0);
        if (m41948J != null) {
            m41948J.m1555f(C13129b.m1563b(C2336R.C2337drawable.ic_marker_on));
            c11581c.m4675b(C11580b.m4681a(m41948J.m1560a()));
        }
        storeMapFragment.m17585I2(store);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W2 */
    public static final void m17570W2(StoreMapFragment storeMapFragment, LatLng latLng) {
        Intrinsics.isThisObjectNull(storeMapFragment, "this$0");
        Intrinsics.isThisObjectNull(latLng, "it");
        storeMapFragment.m17579O2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X2 */
    public static final void m17569X2(StoreMapFragment storeMapFragment, C11581c c11581c) {
        Intrinsics.isThisObjectNull(storeMapFragment, "this$0");
        Intrinsics.isThisObjectNull(c11581c, "$map");
        CameraPosition cameraPosition = storeMapFragment.f20558B0;
        if (cameraPosition != null) {
            Intrinsics.ifNullDoSomething(cameraPosition);
            if (cameraPosition.f8246x == c11581c.m4674c().f8246x) {
                return;
            }
        }
        storeMapFragment.f20558B0 = c11581c.m4674c();
        C13144c c13144c = storeMapFragment.f20560D0;
        if (c13144c == null) {
            Intrinsics.throwUninitPropException("clusterManager");
            c13144c = null;
        }
        c13144c.m1537g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y2 */
    public static final void m17567Y2(StoreMapFragment storeMapFragment, int i) {
        Intrinsics.isThisObjectNull(storeMapFragment, "this$0");
        if (i != 3) {
            storeMapFragment.m17579O2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z2 */
    public static final void m17566Z2(StoreMapFragment storeMapFragment, C11581c c11581c, C13182l c13182l) {
        Intrinsics.isThisObjectNull(storeMapFragment, "this$0");
        Intrinsics.isThisObjectNull(c11581c, "$map");
        C13144c c13144c = storeMapFragment.f20560D0;
        C13144c c13144c2 = null;
        if (c13144c == null) {
            Intrinsics.throwUninitPropException("clusterManager");
            c13144c = null;
        }
        c13144c.m1539e();
        if (!((Collection) c13182l.m1460c()).isEmpty()) {
            C13144c c13144c3 = storeMapFragment.f20560D0;
            if (c13144c3 == null) {
                Intrinsics.throwUninitPropException("clusterManager");
                c13144c3 = null;
            }
            c13144c3.m1541c((Collection) c13182l.m1460c());
            LatLng latLng = storeMapFragment.f20559C0;
            if (latLng == null) {
                latLng = (LatLng) c13182l.m1459d();
            }
            storeMapFragment.f20559C0 = latLng;
            if (latLng == null) {
                c11581c.m4671f(C11580b.m4679c(new LatLng(38.713d, -9.139d), 6.5f));
            } else if (storeMapFragment.f20562z0) {
                c11581c.m4671f(C11580b.m4680b(LatLngBounds.m31556h().m31552b(((Store) ((List) c13182l.m1460c()).get(0)).mo1544b()).m31552b(latLng).m31553a(), UtilsExtensions.m35167e(50)));
            } else {
                c11581c.m4671f(C11580b.m4679c(((Store) ((List) c13182l.m1460c()).get(0)).mo1544b(), 15.0f));
                if (storeMapFragment.f20558B0 != null) {
                    storeMapFragment.f20562z0 = true;
                }
            }
        }
        C13144c c13144c4 = storeMapFragment.f20560D0;
        if (c13144c4 == null) {
            Intrinsics.throwUninitPropException("clusterManager");
        } else {
            c13144c2 = c13144c4;
        }
        c13144c2.m1537g();
    }

    /* renamed from: s2 */
    public static /* synthetic */ boolean m17562s2(StoreMapFragment storeMapFragment, C11581c c11581c, InterfaceC13142a interfaceC13142a) {
        return m17572U2(storeMapFragment, c11581c, interfaceC13142a);
    }

    /* renamed from: t2 */
    public static /* synthetic */ boolean m17561t2(StoreMapFragment storeMapFragment, C13144c c13144c, C11581c c11581c, Store store) {
        return m17571V2(storeMapFragment, c13144c, c11581c, store);
    }

    /* renamed from: u2 */
    public static /* synthetic */ void m17560u2(StoreMapFragment storeMapFragment, Store store, View view) {
        m17582L2(storeMapFragment, store, view);
    }

    /* renamed from: v2 */
    public static /* synthetic */ void m17559v2(StoreMapFragment storeMapFragment, int i) {
        m17567Y2(storeMapFragment, i);
    }

    /* renamed from: w2 */
    public static /* synthetic */ void m17558w2(StoreMapFragment storeMapFragment, LatLng latLng) {
        m17570W2(storeMapFragment, latLng);
    }

    /* renamed from: x2 */
    public static /* synthetic */ void m17557x2(StoreMapFragment storeMapFragment, C11581c c11581c, C13182l c13182l) {
        m17566Z2(storeMapFragment, c11581c, c13182l);
    }

    /* renamed from: y2 */
    public static /* synthetic */ void m17556y2(AbstractC12098x6 abstractC12098x6, String str) {
        m17573T2(abstractC12098x6, str);
    }

    /* renamed from: z2 */
    public static /* synthetic */ void m17555z2(StoreMapFragment storeMapFragment, C11581c c11581c) {
        m17569X2(storeMapFragment, c11581c);
    }

    /* renamed from: H0 */
    public View mo29885H0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.isThisObjectNull(layoutInflater, "inflater");
        View mo29885H0 = super.mo29885H0(layoutInflater, viewGroup, bundle);
        ((AbstractC12098x6) m22723h2()).f31868y.m31573b(bundle);
        return mo29885H0;
    }

    /* renamed from: I0 */
    public void mo33459I0() {
        ((AbstractC12098x6) m22723h2()).f31868y.m31572c();
        C3413a c3413a = this.f20561E0;
        if (c3413a != null) {
            if (c3413a == null) {
                Intrinsics.throwUninitPropException("locationCancelToken");
                c3413a = null;
            }
            c3413a.m30806a();
        }
        super.mo33459I0();
    }

    /* renamed from: M2 */
    public abstract void m17581M2(Store store);

    /* renamed from: P2 */
    public abstract void m17578P2(LatLng latLng);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: R2 */
    public void m17563p2(final AbstractC12098x6 abstractC12098x6, AbstractC6515g abstractC6515g) {
        Intrinsics.isThisObjectNull(abstractC12098x6, "binding");
        Intrinsics.isThisObjectNull(abstractC6515g, "viewModel");
        abstractC12098x6.f31868y.m31574a(this);
        m17584J2(this, null, 1, null);
        ActivityC1354d m37652G1 = m37652G1();
        Intrinsics.checkIfNull(m37652G1, "requireActivity()");
        C2354b.m33845a(m37652G1);
        FluidContentResizer fluidContentResizer = FluidContentResizer.f6136a;
        ActivityC1354d m37652G12 = m37652G1();
        Intrinsics.checkIfNull(m37652G12, "requireActivity()");
        FluidContentResizer.m34623h(fluidContentResizer, m37652G12, 0L, null, 6, null);
        C2355c.f6855c.m33838a().mo171i(m37582i0(), new InterfaceC1440f0() { // from class: nj.d
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                StoreMapFragment.m17575S2(StoreMapFragment.this, (EnumC2353a) obj);
            }
        });
        abstractC6515g.m20749R().mo171i(this, new InterfaceC1440f0() { // from class: nj.f
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                StoreMapFragment.m17573T2(AbstractC12098x6.this, (String) obj);
            }
        });
    }

    /* renamed from: T0 */
    public void mo37619T0() {
        ((AbstractC12098x6) m22723h2()).f31868y.m31570e();
        super.mo37619T0();
    }

    /* renamed from: Y0 */
    public void mo33458Y0() {
        ((AbstractC12098x6) m22723h2()).f31868y.m31569f();
        super.mo33458Y0();
    }

    /* renamed from: a3 */
    public abstract void m17565a3(Store store);

    /* renamed from: i2 */
    protected int m17564i2() {
        return C2336R.layout.fragment_store_map;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: l */
    public void mo4652l(final C11581c c11581c) {
        C13144c c13144c;
        Intrinsics.isThisObjectNull(c11581c, "map");
        c11581c.m4669h(MapStyleOptions.m31551h(m37650H1(), C2336R.raw.map_style));
        final C13144c c13144c2 = new C13144c(m37650H1(), c11581c);
        this.f20560D0 = c13144c2;
        Context m37650H1 = m37650H1();
        Intrinsics.checkIfNull(m37650H1, "requireContext()");
        C13144c c13144c3 = this.f20560D0;
        if (c13144c3 == null) {
            Intrinsics.throwUninitPropException("clusterManager");
            c13144c = null;
        } else {
            c13144c = c13144c3;
        }
        ResourcesProvider m6896c = C10841b.m6896c(this);
        TypedValue typedValue = new TypedValue();
        new ContextThemeWrapper(m6896c.m6899a(), (int) C2336R.style.App).getTheme().resolveAttribute(C2336R.attr.clusterFillColor, typedValue, true);
        int m39113d = C0928a.m39113d(m6896c.m6899a(), typedValue.resourceId);
        ResourcesProvider m6896c2 = C10841b.m6896c(this);
        TypedValue typedValue2 = new TypedValue();
        new ContextThemeWrapper(m6896c2.m6899a(), (int) C2336R.style.App).getTheme().resolveAttribute(C2336R.attr.clusterOutlineColor, typedValue2, true);
        c13144c2.m1531m(new StoreClusterRenderer(m37650H1, c11581c, c13144c, 2131952235, m39113d, C0928a.m39113d(m6896c2.m6899a(), typedValue2.resourceId)));
        c13144c2.m1532l().mo41933f(new C13144c.InterfaceC13147c() { // from class: nj.j
            @Override // p466ya.C13144c.InterfaceC13147c
            /* renamed from: a */
            public final boolean mo1528a(InterfaceC13142a interfaceC13758a) {
                boolean m15933U2;
                m15933U2 = StoreMapFragment.m17572U2(StoreMapFragment.this, c11581c, interfaceC13758a);
                return m15933U2;
            }
        });
        c13144c2.m1532l().mo41935d(new C13144c.InterfaceC13150f() { // from class: nj.k
            @Override // p466ya.C13144c.InterfaceC13150f
            /* renamed from: a */
            public final boolean mo1525a(InterfaceC13143b interfaceC13759b) {
                boolean m15932V2;
                m15932V2 = StoreMapFragment.m17571V2(StoreMapFragment.this, c13144c2, c11581c, (Store) interfaceC13759b);
                return m15932V2;
            }
        });
        c11581c.m4672e().m4650a(false);
        c11581c.m4672e().m4649b(false);
        c11581c.m4672e().m4645f(false);
        c11581c.m4663n(new C11581c.InterfaceC11587f() { // from class: nj.i
            @Override // p418w7.C11581c.InterfaceC11587f
            /* renamed from: a */
            public final void mo4656a(LatLng latLng) {
                StoreMapFragment.m17570W2(StoreMapFragment.this, latLng);
            }
        });
        c11581c.m4667j(new C11581c.InterfaceC11583b() { // from class: nj.g
            @Override // p418w7.C11581c.InterfaceC11583b
            /* renamed from: a */
            public final void mo1543a() {
                StoreMapFragment.m17569X2(StoreMapFragment.this, c11581c);
            }
        });
        c11581c.m4666k(new C11581c.InterfaceC11584c() { // from class: nj.h
            @Override // p418w7.C11581c.InterfaceC11584c
            /* renamed from: a */
            public final void mo4658a(int i) {
                StoreMapFragment.m17567Y2(StoreMapFragment.this, i);
            }
        });
        StoresViewModel.f17642a.m20762a().mo171i(m37582i0(), new InterfaceC1440f0() { // from class: nj.e
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                StoreMapFragment.m17566Z2(StoreMapFragment.this, c11581c, (C13182l) obj);
            }
        });
        InterfaceC1491v m37582i0 = m37582i0();
        Intrinsics.checkIfNull(m37582i0, "viewLifecycleOwner");
        LifecycleOwner.m36965a(m37582i0).m36984i(new C7922b(c11581c, null));
    }

    public void onLowMemory() {
        ((AbstractC12098x6) m22723h2()).f31868y.m31571d();
        super.onLowMemory();
    }
}
