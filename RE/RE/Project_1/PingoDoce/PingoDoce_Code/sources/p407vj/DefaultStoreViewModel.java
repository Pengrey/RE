package p407vj;

import android.content.Intent;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.gms.maps.model.LatLng;
import fm.C5579c;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke.CoreBaseViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.StoreManager;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p186jj.AbstractC6515g;
import p186jj.StoresViewModel;
import p221le.UiEventsLiveData;
import p276og.C8082c;
import p276og.Result;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.response.Store;
import sd.C10171u;
import td.InterfaceC10524i0;

/* renamed from: vj.d */
/* loaded from: classes2.dex */
public final class DefaultStoreViewModel extends AbstractC6515g {

    /* renamed from: w */
    private final StoreManager f29178w;

    /* renamed from: x */
    private Store f29179x;

    /* renamed from: y */
    private final InterfaceC6108l f29180y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultStoreViewModel.kt */
    /* renamed from: vj.d$a */
    /* loaded from: classes2.dex */
    public static final class C11371a extends AbstractC6438m implements InterfaceC6108l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DefaultStoreViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.defaultstore.DefaultStoreViewModel$actionClick$1$1", m20196f = "DefaultStoreViewModel.kt", m20195l = {35}, m20194m = "invokeSuspend")
        /* renamed from: vj.d$a$a */
        /* loaded from: classes2.dex */
        public static final class C11372a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f29182x;

            /* renamed from: y */
            final /* synthetic */ DefaultStoreViewModel f29183y;

            /* renamed from: z */
            final /* synthetic */ Store f29184z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: DefaultStoreViewModel.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.defaultstore.DefaultStoreViewModel$actionClick$1$1$1", m20196f = "DefaultStoreViewModel.kt", m20195l = {36}, m20194m = "invokeSuspend")
            /* renamed from: vj.d$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C11373a extends AbstractC6764l implements InterfaceC6108l {

                /* renamed from: x */
                int f29185x;

                /* renamed from: y */
                final /* synthetic */ DefaultStoreViewModel f29186y;

                /* renamed from: z */
                final /* synthetic */ Store f29187z;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: DefaultStoreViewModel.kt */
                /* renamed from: vj.d$a$a$a$a */
                /* loaded from: classes2.dex */
                public static final class C11374a extends AbstractC6438m implements InterfaceC6108l {

                    /* renamed from: w */
                    final /* synthetic */ Store f29188w;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C11374a(Store store) {
                        super(1);
                        this.f29188w = store;
                    }

                    /* renamed from: a */
                    public final void m5291a(C13195u c13195u) {
                        Intrinsics.isThisObjectNull(c13195u, "it");
                        UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
                        Intent intent = new Intent();
                        intent.putExtra("EXTRA_FOR_STORE", this.f29188w);
                        C13195u c13195u2 = C13195u.f34156a;
                        UiEventsLiveData.m19517m(uiEventsLiveData, 0, intent, 1, null);
                    }

                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                        m5291a((C13195u) obj);
                        return C13195u.f34156a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C11373a(DefaultStoreViewModel defaultStoreViewModel, Store store, InterfaceC1886d interfaceC1886d) {
                    super(1, interfaceC1886d);
                    this.f29186y = defaultStoreViewModel;
                    this.f29187z = store;
                }

                public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                    return new C11373a(this.f29186y, this.f29187z, interfaceC1886d);
                }

                /* renamed from: d */
                public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                    return ((C11373a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    m34636d = C2116d.m34636d();
                    int i = this.f29185x;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        StoreManager m5302g0 = DefaultStoreViewModel.m5302g0(this.f29186y);
                        Store store = this.f29187z;
                        this.f29185x = 1;
                        obj = m5302g0.m18756k(store, this);
                        if (obj == m34636d) {
                            return m34636d;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C13186n.m1453b(obj);
                    }
                    C8082c.m16958b((Result) obj, new C11374a(this.f29187z));
                    return C13195u.f34156a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11372a(DefaultStoreViewModel defaultStoreViewModel, Store store, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f29183y = defaultStoreViewModel;
                this.f29184z = store;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C11372a(this.f29183y, this.f29184z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C11372a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f29182x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    DefaultStoreViewModel defaultStoreViewModel = this.f29183y;
                    C11373a c11373a = new C11373a(defaultStoreViewModel, this.f29184z, null);
                    this.f29182x = 1;
                    if (DefaultStoreViewModel.m5301h0(defaultStoreViewModel, true, c11373a, this) == m34636d) {
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

        C11371a() {
            super(1);
        }

        /* renamed from: a */
        public final void m5294a(Store store) {
            Intrinsics.isThisObjectNull(store, "store");
            C6772d.m20158d(C1473p0.m36987a(DefaultStoreViewModel.this), null, null, new C11372a(DefaultStoreViewModel.this, store, null), 3, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5294a((Store) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultStoreViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.defaultstore.DefaultStoreViewModel", m20196f = "DefaultStoreViewModel.kt", m20195l = {85}, m20194m = "fetchDefaultStore")
    /* renamed from: vj.d$b */
    /* loaded from: classes2.dex */
    public static final class C11375b extends AbstractC6757d {

        /* renamed from: w */
        Object f29189w;

        /* renamed from: x */
        /* synthetic */ Object f29190x;

        /* renamed from: z */
        int f29192z;

        C11375b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f29190x = obj;
            this.f29192z |= Integer.MIN_VALUE;
            return DefaultStoreViewModel.this.m5298k0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultStoreViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.defaultstore.DefaultStoreViewModel$searchStores$1", m20196f = "DefaultStoreViewModel.kt", m20195l = {64}, m20194m = "invokeSuspend")
    /* renamed from: vj.d$c */
    /* loaded from: classes2.dex */
    public static final class C11376c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ String f29193A;

        /* renamed from: B */
        final /* synthetic */ LatLng f29194B;

        /* renamed from: x */
        int f29195x;

        /* renamed from: z */
        final /* synthetic */ boolean f29197z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DefaultStoreViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.defaultstore.DefaultStoreViewModel$searchStores$1$1", m20196f = "DefaultStoreViewModel.kt", m20195l = {65}, m20194m = "invokeSuspend")
        /* renamed from: vj.d$c$a */
        /* loaded from: classes2.dex */
        public static final class C11377a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: A */
            final /* synthetic */ LatLng f29198A;

            /* renamed from: x */
            int f29199x;

            /* renamed from: y */
            final /* synthetic */ DefaultStoreViewModel f29200y;

            /* renamed from: z */
            final /* synthetic */ String f29201z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: DefaultStoreViewModel.kt */
            /* renamed from: vj.d$c$a$a */
            /* loaded from: classes2.dex */
            public static final class C11378a extends AbstractC6438m implements InterfaceC6108l {

                /* renamed from: w */
                final /* synthetic */ String f29202w;

                /* renamed from: x */
                final /* synthetic */ DefaultStoreViewModel f29203x;

                /* renamed from: y */
                final /* synthetic */ LatLng f29204y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C11378a(String str, DefaultStoreViewModel defaultStoreViewModel, LatLng latLng) {
                    super(1);
                    this.f29202w = str;
                    this.f29203x = defaultStoreViewModel;
                    this.f29204y = latLng;
                }

                /* renamed from: a */
                public final void m5288a(List list) {
                    Object obj;
                    LatLng latLng;
                    boolean m8926F;
                    Intrinsics.isThisObjectNull(list, "storesFromManager");
                    if (this.f29202w.length() > 0) {
                        String str = this.f29202w;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            m8926F = C10171u.m8926F(C5579c.m23712g(((Store) obj2).m13710h()), str, true);
                            if (m8926F) {
                                arrayList.add(obj2);
                            }
                        }
                        list = arrayList;
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((Store) obj).m13702t()) {
                            break;
                        }
                    }
                    Store store = (Store) obj;
                    DefaultStoreViewModel defaultStoreViewModel = this.f29203x;
                    if (store == null || (latLng = store.mo1544b()) == null) {
                        latLng = this.f29204y;
                    }
                    DefaultStoreViewModel.m5300i0(defaultStoreViewModel, latLng);
                    LatLng m5303f0 = DefaultStoreViewModel.m5303f0(this.f29203x);
                    if (m5303f0 != null) {
                        list = DefaultStoreViewModel.m5299j0(this.f29203x, list, m5303f0);
                    }
                    StoresViewModel.f17642a.m20761b(list, DefaultStoreViewModel.m5303f0(this.f29203x));
                }

                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                    m5288a((List) obj);
                    return C13195u.f34156a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11377a(DefaultStoreViewModel defaultStoreViewModel, String str, LatLng latLng, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f29200y = defaultStoreViewModel;
                this.f29201z = str;
                this.f29198A = latLng;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C11377a(this.f29200y, this.f29201z, this.f29198A, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C11377a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f29199x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    StoreManager m5302g0 = DefaultStoreViewModel.m5302g0(this.f29200y);
                    this.f29199x = 1;
                    obj = m5302g0.m18758i(this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                C8082c.m16958b((Result) obj, new C11378a(this.f29201z, this.f29200y, this.f29198A));
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11376c(boolean z, String str, LatLng latLng, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f29197z = z;
            this.f29193A = str;
            this.f29194B = latLng;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C11376c(this.f29197z, this.f29193A, this.f29194B, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C11376c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29195x;
            if (i == 0) {
                C13186n.m1453b(obj);
                DefaultStoreViewModel.this.m20752c0(this.f29197z);
                DefaultStoreViewModel defaultStoreViewModel = DefaultStoreViewModel.this;
                C11377a c11377a = new C11377a(defaultStoreViewModel, this.f29193A, this.f29194B, null);
                this.f29195x = 1;
                if (CoreBaseViewModel.m20383n(defaultStoreViewModel, false, c11377a, this, 1, null) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            DefaultStoreViewModel.this.m20752c0(false);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStoreViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, StoreManager storeManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(storeManager, "storeManager");
        this.f29178w = storeManager;
        this.f29180y = OperatorExtensions.m35176e(0L, null, new C11371a(), 3, null);
    }

    /* renamed from: f0 */
    public static final /* synthetic */ LatLng m5303f0(DefaultStoreViewModel defaultStoreViewModel) {
        return defaultStoreViewModel.m20757X();
    }

    /* renamed from: g0 */
    public static final /* synthetic */ StoreManager m5302g0(DefaultStoreViewModel defaultStoreViewModel) {
        return defaultStoreViewModel.f29178w;
    }

    /* renamed from: h0 */
    public static final /* synthetic */ Object m5301h0(DefaultStoreViewModel defaultStoreViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return defaultStoreViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: i0 */
    public static final /* synthetic */ void m5300i0(DefaultStoreViewModel defaultStoreViewModel, LatLng latLng) {
        defaultStoreViewModel.m20753b0(latLng);
    }

    /* renamed from: j0 */
    public static final /* synthetic */ List m5299j0(DefaultStoreViewModel defaultStoreViewModel, List list, LatLng latLng) {
        return defaultStoreViewModel.m20751d0(list, latLng);
    }

    /* renamed from: m0 */
    private final void m5296m0(boolean z, LatLng latLng, String str) {
        String str2;
        if (str == null || (str2 = C5579c.m23712g(str)) == null) {
            str2 = BuildConfig.VERSION_NAME;
        }
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C11376c(z, str2, latLng, null), 3, null);
    }

    /* renamed from: Z */
    public void m5304Z(LatLng latLng, boolean z) {
        m5296m0(z, latLng, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m5298k0(bd.InterfaceC1886d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p407vj.DefaultStoreViewModel.C11375b
            if (r0 == 0) goto L13
            r0 = r5
            vj.d$b r0 = (p407vj.DefaultStoreViewModel.C11375b) r0
            int r1 = r0.f29192z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29192z = r1
            goto L18
        L13:
            vj.d$b r0 = new vj.d$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f29190x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f29192z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f29189w
            vj.d r0 = (p407vj.DefaultStoreViewModel) r0
            p468yc.C13186n.m1453b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            p468yc.C13186n.m1453b(r5)
            mg.j1 r5 = r4.f29178w
            r0.f29189w = r4
            r0.f29192z = r3
            java.lang.Object r5 = r5.m18760g(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            og.a r5 = (p276og.Result) r5
            java.lang.Object r5 = r5.m16966a()
            pt.pingodoce.app.data.remote.models.response.Store r5 = (pt.pingodoce.app.data.remote.models.response.Store) r5
            r0.f29179x = r5
            yc.u r5 = p468yc.C13195u.f34156a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p407vj.DefaultStoreViewModel.m5298k0(bd.d):java.lang.Object");
    }

    /* renamed from: l0 */
    public void m5297l0(String str, LatLng latLng) {
        Intrinsics.isThisObjectNull(str, "query");
        m5296m0(false, latLng, str);
    }

    /* renamed from: n0 */
    public final void m5295n0(Store store) {
        Intrinsics.isThisObjectNull(store, "store");
        this.f29180y.mo9587d(store);
    }
}
