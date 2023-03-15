package p431wl;

import android.content.Intent;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.gms.maps.model.LatLng;
import fm.C5579c;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.C7347m1;
import mg.StoreManager;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p186jj.AbstractC6515g;
import p186jj.StoresViewModel;
import p221le.UiEventsLiveData;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.response.Store;
import sd.C10171u;
import td.InterfaceC10524i0;

/* renamed from: wl.d */
/* loaded from: classes2.dex */
public final class TakeAwayStoreViewModel extends AbstractC6515g {

    /* renamed from: w */
    private final C7347m1 f32192w;

    /* renamed from: x */
    private final StoreManager f32193x;

    /* renamed from: y */
    private final InterfaceC6108l f32194y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayStoreViewModel.kt */
    /* renamed from: wl.d$a */
    /* loaded from: classes2.dex */
    public static final class C12204a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C12204a f32195w = new C12204a();

        C12204a() {
            super(1);
        }

        /* renamed from: a */
        public final void m3398a(Store store) {
            Intrinsics.isThisObjectNull(store, "store");
            UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
            Intent intent = new Intent();
            intent.putExtra("EXTRA_FOR_STORE", store);
            C13195u c13195u = C13195u.f34156a;
            UiEventsLiveData.m19517m(uiEventsLiveData, 0, intent, 1, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m3398a((Store) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayStoreViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.takeaway.pickupstore.TakeAwayStoreViewModel$filterStores$1", m20196f = "TakeAwayStoreViewModel.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: wl.d$b */
    /* loaded from: classes2.dex */
    public static final class C12205b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f32196x;

        /* renamed from: z */
        final /* synthetic */ String f32198z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12205b(String str, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f32198z = str;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C12205b(this.f32198z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C12205b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean m8926F;
            C2116d.m34636d();
            if (this.f32196x == 0) {
                C13186n.m1453b(obj);
                TakeAwayStoreViewModel.this.m20752c0(false);
                List m18687e = TakeAwayStoreViewModel.m3403h0(TakeAwayStoreViewModel.this).m18687e();
                if (this.f32198z.length() > 0) {
                    String str = this.f32198z;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : m18687e) {
                        m8926F = C10171u.m8926F(C5579c.m23712g(((Store) obj2).m13710h()), str, true);
                        if (m8926F) {
                            arrayList.add(obj2);
                        }
                    }
                    m18687e = arrayList;
                }
                StoresViewModel.f17642a.m20761b(m18687e, TakeAwayStoreViewModel.m3405f0(TakeAwayStoreViewModel.this));
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: TakeAwayStoreViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.takeaway.pickupstore.TakeAwayStoreViewModel$searchStores$1", m20196f = "TakeAwayStoreViewModel.kt", m20195l = {47}, m20194m = "invokeSuspend")
    /* renamed from: wl.d$c */
    /* loaded from: classes2.dex */
    static final class C12206c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ LatLng f32199A;

        /* renamed from: x */
        Object f32200x;

        /* renamed from: y */
        int f32201y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12206c(LatLng latLng, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f32199A = latLng;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C12206c(this.f32199A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C12206c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, T] */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List, T, java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, T] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = cd.C2111b.m34640d()
                int r1 = r7.f32201y
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r0 = r7.f32200x
                jd.y r0 = (p181jd.C6449y) r0
                p468yc.C13186n.m1453b(r8)
                goto L55
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                p468yc.C13186n.m1453b(r8)
                wl.d r8 = p431wl.TakeAwayStoreViewModel.this
                com.google.android.gms.maps.model.LatLng r1 = r7.f32199A
                p431wl.TakeAwayStoreViewModel.m3402i0(r8, r1)
                jd.y r8 = new jd.y
                r8.<init>()
                wl.d r1 = p431wl.TakeAwayStoreViewModel.this
                mg.m1 r1 = p431wl.TakeAwayStoreViewModel.m3403h0(r1)
                java.util.List r1 = r1.m18687e()
                r8.f17533w = r1
                wl.d r1 = p431wl.TakeAwayStoreViewModel.this
                mg.m1 r1 = p431wl.TakeAwayStoreViewModel.m3403h0(r1)
                pt.pingodoce.app.data.remote.models.response.Store r1 = r1.m18678n()
                if (r1 != 0) goto L5f
                wl.d r1 = p431wl.TakeAwayStoreViewModel.this
                mg.j1 r1 = p431wl.TakeAwayStoreViewModel.m3404g0(r1)
                r7.f32200x = r8
                r7.f32201y = r2
                java.lang.Object r1 = r1.m18760g(r7)
                if (r1 != r0) goto L53
                return r0
            L53:
                r0 = r8
                r8 = r1
            L55:
                og.a r8 = (p276og.Result) r8
                java.lang.Object r8 = r8.m16966a()
                r1 = r8
                pt.pingodoce.app.data.remote.models.response.Store r1 = (pt.pingodoce.app.data.remote.models.response.Store) r1
                r8 = r0
            L5f:
                if (r1 == 0) goto La5
                wl.d r0 = p431wl.TakeAwayStoreViewModel.this
                T r3 = r8.f17533w
                java.util.List r3 = (java.util.List) r3
                com.google.android.gms.maps.model.LatLng r4 = r1.mo1544b()
                java.util.List r0 = p431wl.TakeAwayStoreViewModel.m3401j0(r0, r3, r4)
                java.util.Iterator r3 = r0.iterator()
            L73:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L90
                java.lang.Object r4 = r3.next()
                r5 = r4
                pt.pingodoce.app.data.remote.models.response.Store r5 = (pt.pingodoce.app.data.remote.models.response.Store) r5
                int r5 = r5.m13711f()
                int r6 = r1.m13711f()
                if (r5 != r6) goto L8c
                r5 = r2
                goto L8d
            L8c:
                r5 = 0
            L8d:
                if (r5 == 0) goto L73
                goto L91
            L90:
                r4 = 0
            L91:
                pt.pingodoce.app.data.remote.models.response.Store r4 = (pt.pingodoce.app.data.remote.models.response.Store) r4
                if (r4 != 0) goto L96
                goto L99
            L96:
                r4.m13716A(r2)
            L99:
                r8.f17533w = r0
                wl.d r0 = p431wl.TakeAwayStoreViewModel.this
                com.google.android.gms.maps.model.LatLng r1 = r1.mo1544b()
                p431wl.TakeAwayStoreViewModel.m3402i0(r0, r1)
                goto Lb9
            La5:
                wl.d r0 = p431wl.TakeAwayStoreViewModel.this
                com.google.android.gms.maps.model.LatLng r0 = p431wl.TakeAwayStoreViewModel.m3405f0(r0)
                if (r0 == 0) goto Lb9
                wl.d r1 = p431wl.TakeAwayStoreViewModel.this
                T r2 = r8.f17533w
                java.util.List r2 = (java.util.List) r2
                java.util.List r0 = p431wl.TakeAwayStoreViewModel.m3401j0(r1, r2, r0)
                r8.f17533w = r0
            Lb9:
                jj.d r0 = p186jj.StoresViewModel.f17642a
                T r8 = r8.f17533w
                java.util.List r8 = (java.util.List) r8
                wl.d r1 = p431wl.TakeAwayStoreViewModel.this
                com.google.android.gms.maps.model.LatLng r1 = p431wl.TakeAwayStoreViewModel.m3405f0(r1)
                r0.m20761b(r8, r1)
                yc.u r8 = p468yc.C13195u.f34156a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p431wl.TakeAwayStoreViewModel.C12206c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeAwayStoreViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7347m1 c7347m1, StoreManager storeManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7347m1, "takeAwayManager");
        Intrinsics.isThisObjectNull(storeManager, "storeManager");
        this.f32192w = c7347m1;
        this.f32193x = storeManager;
        this.f32194y = OperatorExtensions.m35176e(0L, null, C12204a.f32195w, 3, null);
        C1436e0 m20746U = m20746U();
        String string = resourcesProvider.m6899a().getString(C2336R.string.btn_pickup_store);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        m20746U.mo166p(string);
        for (Store store : c7347m1.m18687e()) {
            store.m13716A(false);
        }
        m20752c0(false);
    }

    /* renamed from: f0 */
    public static final /* synthetic */ LatLng m3405f0(TakeAwayStoreViewModel takeAwayStoreViewModel) {
        return takeAwayStoreViewModel.m20757X();
    }

    /* renamed from: g0 */
    public static final /* synthetic */ StoreManager m3404g0(TakeAwayStoreViewModel takeAwayStoreViewModel) {
        return takeAwayStoreViewModel.f32193x;
    }

    /* renamed from: h0 */
    public static final /* synthetic */ C7347m1 m3403h0(TakeAwayStoreViewModel takeAwayStoreViewModel) {
        return takeAwayStoreViewModel.f32192w;
    }

    /* renamed from: i0 */
    public static final /* synthetic */ void m3402i0(TakeAwayStoreViewModel takeAwayStoreViewModel, LatLng latLng) {
        takeAwayStoreViewModel.m20753b0(latLng);
    }

    /* renamed from: j0 */
    public static final /* synthetic */ List m3401j0(TakeAwayStoreViewModel takeAwayStoreViewModel, List list, LatLng latLng) {
        return takeAwayStoreViewModel.m20751d0(list, latLng);
    }

    /* renamed from: Z */
    public void m3406Z(LatLng latLng, boolean z) {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C12206c(latLng, null), 3, null);
    }

    /* renamed from: k0 */
    public void m3400k0(String str, LatLng latLng) {
        Intrinsics.isThisObjectNull(str, "query");
        m20753b0(latLng);
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C12205b(C5579c.m23712g(str), null), 3, null);
    }

    /* renamed from: l0 */
    public final void m3399l0(Store store) {
        Intrinsics.isThisObjectNull(store, "store");
        this.f32192w.m18666z(store);
        this.f32194y.mo9587d(store);
    }
}
