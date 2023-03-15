package pt.pingodoce.app.presentation.home;

import ae.InterfaceC0131a;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0928a;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.C1636p;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import bd.InterfaceC1886d;
import be.UtilsExtensions;
import cd.C2116d;
import ch.LoyaltyActivity;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import dk.TailoredForYouActivity;
import ee.MarginItemDecoration;
import fj.SearchActivity;
import fm.C5579c;
import gh.LoyaltyIntroActivity;
import gl.PromotionActivity;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import id.InterfaceC6114r;
import il.PurchaseListActivity;
import java.util.List;
import jm.C6537a;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C6772d;
import kotlinx.coroutines.flow.C6788e;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import mg.StoreManager;
import mg.TransactionCacheManager;
import ni.BottomNavigationActivity;
import p039c3.C2046o;
import p050d.C4519c;
import p086ei.BenefitsActivity;
import p087ej.C5117h;
import p087ej.EnumC5125l;
import p087ej.ItemFixPlaceHolderAdapter;
import p143hh.LoyaltyPendingActivity;
import p144hi.ClubActivity;
import p146hl.PurchaseDetailActivity;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p207kl.ShoppingListActivity;
import p314qd.InterfaceC9717b;
import p322ql.Launchers;
import p336rc.Spotlight;
import p378u5.C10841b;
import p378u5.ResourcesProvider;
import p389ui.LoyaltyCardActivity;
import p390uj.C10934r;
import p390uj.C10935s;
import p390uj.HomeCoachMarks;
import p407vj.DefaultStoreActivity;
import p426wg.AbstractC11737e0;
import p450xh.BannerDetailActivity;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p472yh.BannerAdapter;
import p472yh.BannerPlaceHolderAdapter;
import p472yh.EnumC13439a;
import p493zg.AccountActivityLauncher;
import p494zh.AbstractC13816c;
import p494zh.C13806a;
import p494zh.C13807a0;
import p494zh.C13811b;
import p494zh.C13858k2;
import p494zh.C13871l2;
import p494zh.C13873m0;
import p494zh.C13890q;
import p494zh.C13895r0;
import p494zh.C13899s0;
import p494zh.C13903t0;
import p494zh.C13907u0;
import p494zh.C13911v0;
import p494zh.C13920x1;
import p496zj.CardRegistrationLandingActivity;
import pt.pingodoce.app.data.local.models.banners.BannerActionGotoType;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;
import pt.pingodoce.app.data.local.models.purchases.Purchase;
import pt.pingodoce.app.data.remote.models.response.Banner;
import pt.pingodoce.app.data.remote.models.response.BenefitsExpirationColors;
import pt.pingodoce.app.data.remote.models.response.Flyer;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;
import pt.pingodoce.app.data.remote.models.response.Store;
import pt.pingodoce.app.presentation.home.HomeActivity;
import pt.pingodoce.app.presentation.home.HomeViewModel;
import td.InterfaceC10524i0;
import td.InterfaceC10574t1;
import tj.FlyerAdapter;

/* compiled from: HomeActivity.kt */
/* loaded from: classes2.dex */
public final class HomeActivity extends BottomNavigationActivity implements HomeCoachMarks {

    /* renamed from: h0 */
    public StoreManager f24122h0;

    /* renamed from: i0 */
    public TransactionCacheManager f24123i0;

    /* renamed from: j0 */
    public ViewModelFactoryByInjection f24124j0;

    /* renamed from: m0 */
    private int f24127m0;

    /* renamed from: n0 */
    private Spotlight f24128n0;

    /* renamed from: p0 */
    private final AbstractC0304b f24130p0;

    /* renamed from: q0 */
    private final AbstractC0304b f24131q0;

    /* renamed from: r0 */
    private final AbstractC0304b f24132r0;

    /* renamed from: s0 */
    private final AbstractC0304b f24133s0;

    /* renamed from: t0 */
    private final AbstractC0304b f24134t0;

    /* renamed from: k0 */
    private final BannerAdapter f24125k0 = new BannerAdapter(new C9157c());

    /* renamed from: l0 */
    private final C5117h f24126l0 = new C5117h(LifecycleOwner.m36965a(this), EnumC5125l.FIXED, new C9170j(), new C9171k());

    /* renamed from: o0 */
    private boolean f24129o0 = true;

    /* compiled from: HomeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$a */
    /* loaded from: classes2.dex */
    public static final class C9155a {
        private C9155a() {
        }

        public /* synthetic */ C9155a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: HomeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C9156b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24135a;

        static {
            int[] iArr = new int[BannerActionGotoType.values().length];
            iArr[BannerActionGotoType.PROMOTIONS.ordinal()] = 1;
            iArr[BannerActionGotoType.SHOPPING_LIST.ordinal()] = 2;
            iArr[BannerActionGotoType.TAKE_AWAY.ordinal()] = 3;
            iArr[BannerActionGotoType.LOYALTY.ordinal()] = 4;
            f24135a = iArr;
        }
    }

    /* compiled from: HomeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$c */
    /* loaded from: classes2.dex */
    static final class C9157c extends AbstractC6438m implements InterfaceC6114r {

        /* compiled from: HomeActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$c$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C9158a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f24137a;

            static {
                int[] iArr = new int[EnumC13439a.values().length];
                iArr[EnumC13439a.DETAIL.ordinal()] = 1;
                iArr[EnumC13439a.DELETE.ordinal()] = 2;
                f24137a = iArr;
            }
        }

        C9157c() {
            super(4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
            if (r4 <= ((androidx.recyclerview.widget.LinearLayoutManager) r1).m36770c2()) goto L13;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m12192a(int r4, pt.pingodoce.app.data.remote.models.response.Banner r5, p472yh.EnumC13439a r6, android.view.View r7) {
            /*
                r3 = this;
                java.lang.String r0 = "banner"
                p181jd.Intrinsics.isThisObjectNull(r5, r0)
                java.lang.String r0 = "actionType"
                p181jd.Intrinsics.isThisObjectNull(r6, r0)
                java.lang.String r0 = "view"
                p181jd.Intrinsics.isThisObjectNull(r7, r0)
                int[] r0 = pt.pingodoce.app.presentation.home.HomeActivity.C9157c.C9158a.f24137a
                int r6 = r6.ordinal()
                r6 = r0[r6]
                r0 = 1
                if (r6 == r0) goto L2c
                r4 = 2
                if (r6 == r4) goto L1e
                goto L67
            L1e:
                pt.pingodoce.app.presentation.home.HomeActivity r4 = pt.pingodoce.app.presentation.home.HomeActivity.this
                pt.pingodoce.app.presentation.home.a r4 = pt.pingodoce.app.presentation.home.HomeActivity.m12244Q1(r4)
                int r5 = r5.m13950h()
                r4.m12153P0(r5)
                goto L67
            L2c:
                pt.pingodoce.app.presentation.home.HomeActivity r6 = pt.pingodoce.app.presentation.home.HomeActivity.this
                androidx.activity.result.b r6 = pt.pingodoce.app.presentation.home.HomeActivity.m12249M1(r6)
                pt.pingodoce.app.presentation.home.HomeActivity r0 = pt.pingodoce.app.presentation.home.HomeActivity.this
                wg.e0 r1 = pt.pingodoce.app.presentation.home.HomeActivity.m12248N1(r0)
                com.github.guilhe.views.PlaceHolderRecyclerView r1 = r1.f30192z
                androidx.recyclerview.widget.RecyclerView$o r1 = r1.getLayoutManager()
                java.lang.String r2 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
                java.util.Objects.requireNonNull(r1, r2)
                androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
                int r1 = r1.m36776W1()
                if (r4 < r1) goto L63
                pt.pingodoce.app.presentation.home.HomeActivity r1 = pt.pingodoce.app.presentation.home.HomeActivity.this
                wg.e0 r1 = pt.pingodoce.app.presentation.home.HomeActivity.m12248N1(r1)
                com.github.guilhe.views.PlaceHolderRecyclerView r1 = r1.f30192z
                androidx.recyclerview.widget.RecyclerView$o r1 = r1.getLayoutManager()
                java.util.Objects.requireNonNull(r1, r2)
                androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
                int r1 = r1.m36770c2()
                if (r4 > r1) goto L63
                goto L64
            L63:
                r7 = 0
            L64:
                p450xh.BannerDetailActivity.m2021a(r6, r0, r5, r7)
            L67:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.home.HomeActivity.C9157c.m12192a(int, pt.pingodoce.app.data.remote.models.response.Banner, yh.a, android.view.View):void");
        }

        /* renamed from: a0 */
        public /* bridge */ /* synthetic */ Object mo22157a0(Object obj, Object obj2, Object obj3, Object obj4) {
            m12192a(((Number) obj).intValue(), (Banner) obj2, (EnumC13439a) obj3, (View) obj4);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeActivity$bannerLauncher$1$1$1", m20196f = "HomeActivity.kt", m20195l = {201}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$d */
    /* loaded from: classes2.dex */
    public static final class C9159d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24138x;

        C9159d(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9159d(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9159d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24138x;
            if (i == 0) {
                C13186n.m1453b(obj);
                HomeViewModel m12244Q1 = HomeActivity.m12244Q1(HomeActivity.this);
                this.f24138x = 1;
                if (m12244Q1.m12123s1(this) == m34636d) {
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

    /* compiled from: HomeActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeActivity$consumeNavigationEvent$1", m20196f = "HomeActivity.kt", m20195l = {237}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$e */
    /* loaded from: classes2.dex */
    static final class C9160e extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        Object f24140x;

        /* renamed from: y */
        int f24141y;

        C9160e(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9160e(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9160e) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            HomeActivity homeActivity;
            m34636d = C2116d.m34636d();
            int i = this.f24141y;
            if (i == 0) {
                C13186n.m1453b(obj);
                HomeActivity homeActivity2 = HomeActivity.this;
                HomeViewModel m12244Q1 = HomeActivity.m12244Q1(homeActivity2);
                this.f24140x = homeActivity2;
                this.f24141y = 1;
                Object m12150S0 = m12244Q1.m12150S0(this);
                if (m12150S0 == m34636d) {
                    return m34636d;
                }
                homeActivity = homeActivity2;
                obj = m12150S0;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                homeActivity = (HomeActivity) this.f24140x;
                C13186n.m1453b(obj);
            }
            Store store = (Store) obj;
            HomeActivity.m12243R1(homeActivity, store != null ? store.m13711f() : -1);
            DefaultStoreActivity.m5308a(HomeActivity.this.m12232b2(), HomeActivity.this);
            return C13195u.f34156a;
        }
    }

    /* compiled from: HomeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$f */
    /* loaded from: classes2.dex */
    static final class C9161f extends AbstractC6438m implements InterfaceC6097a {
        C9161f() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return HomeActivity.this.m12233a2().m20377b(HomeActivity.this, new Bundle());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeActivity$initViews$1", m20196f = "HomeActivity.kt", m20195l = {278}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$g */
    /* loaded from: classes2.dex */
    public static final class C9162g extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ AbstractC11737e0 f24144A;

        /* renamed from: x */
        int f24145x;

        /* renamed from: y */
        final /* synthetic */ HomeViewModel f24146y;

        /* renamed from: z */
        final /* synthetic */ HomeActivity f24147z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HomeActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$g$a */
        /* loaded from: classes2.dex */
        public static final class C9163a implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ HomeActivity f24148w;

            /* renamed from: x */
            final /* synthetic */ AbstractC11737e0 f24149x;

            /* renamed from: y */
            final /* synthetic */ HomeViewModel f24150y;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: HomeActivity.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeActivity$initViews$1$1$emit$2", m20196f = "HomeActivity.kt", m20195l = {283, 288, 293}, m20194m = "invokeSuspend")
            /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$g$a$a */
            /* loaded from: classes2.dex */
            public static final class C9164a extends AbstractC6764l implements InterfaceC6112p {

                /* renamed from: A */
                final /* synthetic */ AbstractC11737e0 f24151A;

                /* renamed from: B */
                final /* synthetic */ HomeViewModel f24152B;

                /* renamed from: x */
                int f24153x;

                /* renamed from: y */
                final /* synthetic */ HomeActivity f24154y;

                /* renamed from: z */
                final /* synthetic */ HomeViewModel.EnumC9179a f24155z;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: HomeActivity.kt */
                /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$g$a$a$a */
                /* loaded from: classes2.dex */
                public static final class C9165a extends AbstractC6438m implements InterfaceC6097a {

                    /* renamed from: w */
                    final /* synthetic */ HomeViewModel f24156w;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C9165a(HomeViewModel homeViewModel) {
                        super(0);
                        this.f24156w = homeViewModel;
                    }

                    /* renamed from: a */
                    public final void m12184a() {
                        this.f24156w.m12120v1();
                    }

                    /* renamed from: q */
                    public /* bridge */ /* synthetic */ Object mo42214q() {
                        m12184a();
                        return C13195u.f34156a;
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: HomeActivity.kt */
                /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$g$a$a$b */
                /* loaded from: classes2.dex */
                public static final class C9166b extends AbstractC6438m implements InterfaceC6097a {

                    /* renamed from: w */
                    final /* synthetic */ HomeViewModel f24157w;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C9166b(HomeViewModel homeViewModel) {
                        super(0);
                        this.f24157w = homeViewModel;
                    }

                    /* renamed from: a */
                    public final void m12183a() {
                        this.f24157w.m12118w1();
                    }

                    /* renamed from: q */
                    public /* bridge */ /* synthetic */ Object mo42214q() {
                        m12183a();
                        return C13195u.f34156a;
                    }
                }

                /* compiled from: HomeActivity.kt */
                /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$g$a$a$c */
                /* loaded from: classes2.dex */
                public /* synthetic */ class C9167c {

                    /* renamed from: a */
                    public static final /* synthetic */ int[] f24158a;

                    static {
                        int[] iArr = new int[HomeViewModel.EnumC9179a.values().length];
                        iArr[HomeViewModel.EnumC9179a.DEFAULT_STORE.ordinal()] = 1;
                        iArr[HomeViewModel.EnumC9179a.BENEFITS.ordinal()] = 2;
                        iArr[HomeViewModel.EnumC9179a.LOYALTY.ordinal()] = 3;
                        iArr[HomeViewModel.EnumC9179a.NONE.ordinal()] = 4;
                        f24158a = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C9164a(HomeActivity homeActivity, HomeViewModel.EnumC9179a enumC9179a, AbstractC11737e0 abstractC11737e0, HomeViewModel homeViewModel, InterfaceC1886d interfaceC1886d) {
                    super(2, interfaceC1886d);
                    this.f24154y = homeActivity;
                    this.f24155z = enumC9179a;
                    this.f24151A = abstractC11737e0;
                    this.f24152B = homeViewModel;
                }

                public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                    return new C9164a(this.f24154y, this.f24155z, this.f24151A, this.f24152B, interfaceC1886d);
                }

                /* renamed from: d */
                public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                    return ((C9164a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    Spotlight m12231c2;
                    m34636d = C2116d.m34636d();
                    int i = this.f24153x;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        Spotlight m12231c22 = this.f24154y.m12231c2();
                        if (m12231c22 != null) {
                            m12231c22.m9817i();
                        }
                        int i2 = C9167c.f24158a[this.f24155z.ordinal()];
                        if (i2 == 1) {
                            HomeActivity homeActivity = this.f24154y;
                            AbstractC11737e0 abstractC11737e0 = this.f24151A;
                            HomeViewModel homeViewModel = this.f24152B;
                            this.f24153x = 1;
                            if (homeActivity.m12263B2(homeActivity, abstractC11737e0, homeViewModel, this) == m34636d) {
                                return m34636d;
                            }
                        } else if (i2 == 2) {
                            HomeActivity homeActivity2 = this.f24154y;
                            AbstractC11737e0 abstractC11737e02 = this.f24151A;
                            HomeViewModel homeViewModel2 = this.f24152B;
                            C9165a c9165a = new C9165a(homeViewModel2);
                            this.f24153x = 2;
                            if (homeActivity2.m12265A2(homeActivity2, abstractC11737e02, homeViewModel2, c9165a, this) == m34636d) {
                                return m34636d;
                            }
                        } else if (i2 == 3) {
                            HomeActivity homeActivity3 = this.f24154y;
                            AbstractC11737e0 abstractC11737e03 = this.f24151A;
                            HomeViewModel homeViewModel3 = this.f24152B;
                            C9166b c9166b = new C9166b(homeViewModel3);
                            this.f24153x = 3;
                            if (homeActivity3.m12261C2(homeActivity3, abstractC11737e03, homeViewModel3, c9166b, this) == m34636d) {
                                return m34636d;
                            }
                        } else if (i2 == 4 && (m12231c2 = this.f24154y.m12231c2()) != null) {
                            m12231c2.m9817i();
                        }
                    } else if (i != 1 && i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C13186n.m1453b(obj);
                    }
                    return C13195u.f34156a;
                }
            }

            C9163a(HomeActivity homeActivity, AbstractC11737e0 abstractC11737e0, HomeViewModel homeViewModel) {
                this.f24148w = homeActivity;
                this.f24149x = abstractC11737e0;
                this.f24150y = homeViewModel;
            }

            /* renamed from: d */
            public final Object mo4529a(HomeViewModel.EnumC9179a enumC9179a, InterfaceC1886d interfaceC1886d) {
                Object m34636d;
                C6537a.m20678a("HOME ACTIVITY -> COACHMARK: " + enumC9179a, new Object[0]);
                InterfaceC10574t1 m36984i = LifecycleOwner.m36965a(this.f24148w).m36984i(new C9164a(this.f24148w, enumC9179a, this.f24149x, this.f24150y, null));
                m34636d = C2116d.m34636d();
                return m36984i == m34636d ? m36984i : C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9162g(HomeViewModel homeViewModel, HomeActivity homeActivity, AbstractC11737e0 abstractC11737e0, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24146y = homeViewModel;
            this.f24147z = homeActivity;
            this.f24144A = abstractC11737e0;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9162g(this.f24146y, this.f24147z, this.f24144A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9162g) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24145x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC6785c m20141g = C6788e.m20141g(this.f24146y.m12154O0());
                C9163a c9163a = new C9163a(this.f24147z, this.f24144A, this.f24146y);
                this.f24145x = 1;
                if (m20141g.mo20086d(c9163a, this) == m34636d) {
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

    /* compiled from: HomeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$h */
    /* loaded from: classes2.dex */
    public static final class C9168h implements InterfaceC0131a {
        C9168h() {
        }

        /* renamed from: b */
        public void mo41791a(Purchase purchase, int i) {
            Intrinsics.isThisObjectNull(purchase, "item");
            PurchaseDetailActivity.m22578c(HomeActivity.m12247O1(HomeActivity.this), HomeActivity.this, purchase.m14434i(), purchase.m14424y(), purchase.m14428s(), purchase.m14435h(), false, 32, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeActivity$initViews$8", m20196f = "HomeActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$i */
    /* loaded from: classes2.dex */
    public static final class C9169i extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24160x;

        C9169i(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9169i(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9169i) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f24160x == 0) {
                C13186n.m1453b(obj);
                HomeActivity.m12240T1(HomeActivity.this);
                HomeActivity.m12241S1(HomeActivity.this);
                HomeActivity.m12238V1(HomeActivity.this);
                HomeActivity.m12239U1(HomeActivity.this);
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: HomeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$j */
    /* loaded from: classes2.dex */
    static final class C9170j extends AbstractC6438m implements InterfaceC6113q {
        C9170j() {
            super(3);
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m12179a(((Number) obj).intValue(), (CatalogProduct) obj2, (View) obj3);
            return C13195u.f34156a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x003e, code lost:
            if (r10 <= ((androidx.recyclerview.widget.LinearLayoutManager) r0).m36770c2()) goto L5;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m12179a(int r10, pt.pingodoce.app.data.local.models.products.CatalogProduct r11, android.view.View r12) {
            /*
                r9 = this;
                java.lang.String r0 = "product"
                p181jd.Intrinsics.isThisObjectNull(r11, r0)
                java.lang.String r0 = "view"
                p181jd.Intrinsics.isThisObjectNull(r12, r0)
                pt.pingodoce.app.presentation.home.HomeActivity r0 = pt.pingodoce.app.presentation.home.HomeActivity.this
                androidx.activity.result.b r1 = pt.pingodoce.app.presentation.home.HomeActivity.m12247O1(r0)
                pt.pingodoce.app.presentation.home.HomeActivity r2 = pt.pingodoce.app.presentation.home.HomeActivity.this
                wg.e0 r0 = pt.pingodoce.app.presentation.home.HomeActivity.m12248N1(r2)
                com.github.guilhe.views.PlaceHolderRecyclerView r0 = r0.f30183Q
                androidx.recyclerview.widget.RecyclerView$o r0 = r0.getLayoutManager()
                java.lang.String r3 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
                java.util.Objects.requireNonNull(r0, r3)
                androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
                int r0 = r0.m36776W1()
                if (r10 < r0) goto L41
                pt.pingodoce.app.presentation.home.HomeActivity r0 = pt.pingodoce.app.presentation.home.HomeActivity.this
                wg.e0 r0 = pt.pingodoce.app.presentation.home.HomeActivity.m12248N1(r0)
                com.github.guilhe.views.PlaceHolderRecyclerView r0 = r0.f30183Q
                androidx.recyclerview.widget.RecyclerView$o r0 = r0.getLayoutManager()
                java.util.Objects.requireNonNull(r0, r3)
                androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
                int r0 = r0.m36770c2()
                if (r10 > r0) goto L41
                goto L42
            L41:
                r12 = 0
            L42:
                r4 = r12
                r5 = 0
                pt.pingodoce.app.presentation.home.HomeActivity r10 = pt.pingodoce.app.presentation.home.HomeActivity.this
                mg.q1 r6 = r10.m12234Z1()
                r7 = 8
                r8 = 0
                r3 = r11
                p048cj.ProductDetailActivity.m34573c(r1, r2, r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.home.HomeActivity.C9170j.m12179a(int, pt.pingodoce.app.data.local.models.products.CatalogProduct, android.view.View):void");
        }
    }

    /* compiled from: HomeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$k */
    /* loaded from: classes2.dex */
    static final class C9171k extends AbstractC6438m implements InterfaceC6112p {
        C9171k() {
            super(2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m12178a((CatalogProduct) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m12178a(CatalogProduct catalogProduct, int i) {
            Intrinsics.isThisObjectNull(catalogProduct, "product");
            HomeActivity.m12244Q1(HomeActivity.this).m22610S(catalogProduct, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeActivity$resultForCardLauncher$1$1", m20196f = "HomeActivity.kt", m20195l = {222}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$l */
    /* loaded from: classes2.dex */
    public static final class C9172l extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24164x;

        C9172l(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9172l(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9172l) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24164x;
            if (i == 0) {
                C13186n.m1453b(obj);
                HomeViewModel m12244Q1 = HomeActivity.m12244Q1(HomeActivity.this);
                this.f24164x = 1;
                if (m12244Q1.m12139d1(this) == m34636d) {
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
    /* compiled from: HomeActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeActivity$setupBanners$2", m20196f = "HomeActivity.kt", m20195l = {403}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$m */
    /* loaded from: classes2.dex */
    public static final class C9173m extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24166x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HomeActivity.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeActivity$setupBanners$2$1", m20196f = "HomeActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$m$a */
        /* loaded from: classes2.dex */
        public static final class C9174a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f24168x;

            /* renamed from: y */
            /* synthetic */ Object f24169y;

            /* renamed from: z */
            final /* synthetic */ HomeActivity f24170z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: HomeActivity.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeActivity$setupBanners$2$1$1", m20196f = "HomeActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
            /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$m$a$a */
            /* loaded from: classes2.dex */
            public static final class C9175a extends AbstractC6764l implements InterfaceC6112p {

                /* renamed from: x */
                int f24171x;

                /* renamed from: y */
                final /* synthetic */ HomeActivity f24172y;

                /* renamed from: z */
                final /* synthetic */ List f24173z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C9175a(HomeActivity homeActivity, List list, InterfaceC1886d interfaceC1886d) {
                    super(2, interfaceC1886d);
                    this.f24172y = homeActivity;
                    this.f24173z = list;
                }

                public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                    return new C9175a(this.f24172y, this.f24173z, interfaceC1886d);
                }

                /* renamed from: d */
                public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                    return ((C9175a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    C2116d.m34636d();
                    if (this.f24171x == 0) {
                        C13186n.m1453b(obj);
                        HomeActivity.m12250L1(this.f24172y).m22153F(this.f24173z);
                        if (this.f24173z.size() == 1) {
                            HomeActivity.m12248N1(this.f24172y).f30192z.setVisibility(8);
                            HomeActivity.m12248N1(this.f24172y).f30191y.m37802s().setVisibility(0);
                        } else if (this.f24173z.size() > 1) {
                            HomeActivity.m12248N1(this.f24172y).f30192z.setVisibility(0);
                            HomeActivity.m12248N1(this.f24172y).f30191y.m37802s().setVisibility(8);
                        } else {
                            HomeActivity.m12248N1(this.f24172y).f30192z.setVisibility(8);
                            HomeActivity.m12248N1(this.f24172y).f30191y.m37802s().setVisibility(8);
                        }
                        return C13195u.f34156a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9174a(HomeActivity homeActivity, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f24170z = homeActivity;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                C9174a c9174a = new C9174a(this.f24170z, interfaceC1886d);
                c9174a.f24169y = obj;
                return c9174a;
            }

            /* renamed from: d */
            public final Object mo39856d(List list, InterfaceC1886d interfaceC1886d) {
                return ((C9174a) create(list, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                C2116d.m34636d();
                if (this.f24168x == 0) {
                    C13186n.m1453b(obj);
                    LifecycleOwner.m36965a(this.f24170z).m36984i(new C9175a(this.f24170z, (List) this.f24169y, null));
                    return C13195u.f34156a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        C9173m(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9173m(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9173m) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24166x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC6785c m12152Q0 = HomeActivity.m12244Q1(HomeActivity.this).m12152Q0();
                C9174a c9174a = new C9174a(HomeActivity.this, null);
                this.f24166x = 1;
                if (C6788e.m20144d(m12152Q0, c9174a, this) == m34636d) {
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
    /* compiled from: HomeActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeActivity$setupFlyers$2$1", m20196f = "HomeActivity.kt", m20195l = {512}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$n */
    /* loaded from: classes2.dex */
    public static final class C9176n extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24174x;

        /* renamed from: y */
        final /* synthetic */ FlyerAdapter f24175y;

        /* renamed from: z */
        final /* synthetic */ List f24176z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9176n(FlyerAdapter flyerAdapter, List list, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24175y = flyerAdapter;
            this.f24176z = list;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9176n(this.f24175y, this.f24176z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9176n) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24174x;
            if (i == 0) {
                C13186n.m1453b(obj);
                FlyerAdapter flyerAdapter = this.f24175y;
                List list = this.f24176z;
                Intrinsics.checkIfNull(list, "flyers");
                this.f24174x = 1;
                if (flyerAdapter.m22148H(list, this) == m34636d) {
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
    /* compiled from: HomeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$o */
    /* loaded from: classes2.dex */
    public static final class C9177o extends AbstractC6438m implements InterfaceC6108l {
        C9177o() {
            super(1);
        }

        /* renamed from: a */
        public final void m12172a(Flyer flyer) {
            Intrinsics.isThisObjectNull(flyer, "flyer");
            AbstractC11737e0 m12248N1 = HomeActivity.m12248N1(HomeActivity.this);
            HomeActivity homeActivity = HomeActivity.this;
            C5579c.m23713f(m12248N1, homeActivity, flyer, homeActivity.m12234Z1());
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12172a((Flyer) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeActivity$setupProducts$2$1", m20196f = "HomeActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.home.HomeActivity$p */
    /* loaded from: classes2.dex */
    public static final class C9178p extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24178x;

        /* renamed from: z */
        final /* synthetic */ List f24180z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9178p(List list, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24180z = list;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9178p(this.f24180z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9178p) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f24178x == 0) {
                C13186n.m1453b(obj);
                C5117h m12245P1 = HomeActivity.m12245P1(HomeActivity.this);
                List list = this.f24180z;
                Intrinsics.checkIfNull(list, "products");
                m12245P1.m22153F(list);
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        new C9155a(null);
    }

    public HomeActivity() {
        AbstractC0304b m41364M = m41364M(new C4519c(), C10935s.f28181a);
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…rtActivityForResult()) {}");
        this.f24130p0 = m41364M;
        AbstractC0304b m41364M2 = m41364M(new C4519c(), C10934r.f28180a);
        Intrinsics.checkIfNull(m41364M2, "registerForActivityResul…rtActivityForResult()) {}");
        this.f24131q0 = m41364M2;
        AbstractC0304b m41364M3 = m41364M(new C4519c(), new InterfaceC0303a() { // from class: uj.o
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                HomeActivity.m12236X1(HomeActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M3, "registerForActivityResul…}\n            }\n        }");
        this.f24132r0 = m41364M3;
        AbstractC0304b m41364M4 = m41364M(new C4519c(), new InterfaceC0303a() { // from class: uj.p
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                HomeActivity.m12235Y1(HomeActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M4, "registerForActivityResul…)\n            }\n        }");
        this.f24133s0 = m41364M4;
        AbstractC0304b m41364M5 = m41364M(new C4519c(), new InterfaceC0303a() { // from class: uj.q
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                HomeActivity.m12221l2(HomeActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M5, "registerForActivityResul…}\n            }\n        }");
        this.f24134t0 = m41364M5;
    }

    /* renamed from: A1 */
    public static /* synthetic */ void m12266A1(AbstractC11737e0 abstractC11737e0, Boolean bool) {
        m12225i2(abstractC11737e0, bool);
    }

    /* renamed from: B1 */
    public static /* synthetic */ void m12264B1(HomeActivity homeActivity, ActivityResult activityResult) {
        m12235Y1(homeActivity, activityResult);
    }

    /* renamed from: C1 */
    public static /* synthetic */ void m12262C1(HomeActivity homeActivity, View view) {
        m12222k2(homeActivity, view);
    }

    /* renamed from: D1 */
    public static /* synthetic */ void m12260D1(AbstractC11737e0 abstractC11737e0, Boolean bool) {
        m12227g2(abstractC11737e0, bool);
    }

    /* renamed from: E1 */
    public static /* synthetic */ void m12259E1(HomeActivity homeActivity, Boolean bool) {
        m12216p2(homeActivity, bool);
    }

    /* renamed from: F1 */
    public static /* synthetic */ void m12258F1(HomeViewModel homeViewModel, AbstractC11737e0 abstractC11737e0, LoyaltyCard loyaltyCard) {
        m12226h2(homeViewModel, abstractC11737e0, loyaltyCard);
    }

    /* renamed from: G1 */
    public static /* synthetic */ void m12257G1(HomeActivity homeActivity, View view) {
        m12215q2(homeActivity, view);
    }

    /* renamed from: H1 */
    public static /* synthetic */ void m12256H1(HomeActivity homeActivity, View view) {
        m12210s2(homeActivity, view);
    }

    /* renamed from: I1 */
    public static /* synthetic */ void m12255I1(HomeActivity homeActivity, ActivityResult activityResult) {
        m12221l2(homeActivity, activityResult);
    }

    /* renamed from: J1 */
    public static /* synthetic */ void m12253J1(HomeViewModel homeViewModel) {
        m12228f2(homeViewModel);
    }

    /* renamed from: K1 */
    public static /* synthetic */ boolean m12251K1(HomeActivity homeActivity, MenuItem menuItem) {
        return m12230d2(homeActivity, menuItem);
    }

    /* renamed from: L1 */
    public static final /* synthetic */ BannerAdapter m12250L1(HomeActivity homeActivity) {
        return homeActivity.f24125k0;
    }

    /* renamed from: M1 */
    public static final /* synthetic */ AbstractC0304b m12249M1(HomeActivity homeActivity) {
        return homeActivity.f24132r0;
    }

    /* renamed from: N1 */
    public static final /* synthetic */ AbstractC11737e0 m12248N1(HomeActivity homeActivity) {
        return (AbstractC11737e0) homeActivity.m22738w0();
    }

    /* renamed from: O1 */
    public static final /* synthetic */ AbstractC0304b m12247O1(HomeActivity homeActivity) {
        return homeActivity.f24133s0;
    }

    /* renamed from: P1 */
    public static final /* synthetic */ C5117h m12245P1(HomeActivity homeActivity) {
        return homeActivity.f24126l0;
    }

    /* renamed from: Q1 */
    public static final /* synthetic */ HomeViewModel m12244Q1(HomeActivity homeActivity) {
        return (HomeViewModel) homeActivity.m22758I0();
    }

    /* renamed from: R1 */
    public static final /* synthetic */ void m12243R1(HomeActivity homeActivity, int i) {
        homeActivity.f24127m0 = i;
    }

    /* renamed from: S1 */
    public static final /* synthetic */ void m12241S1(HomeActivity homeActivity) {
        homeActivity.m12217o2();
    }

    /* renamed from: T1 */
    public static final /* synthetic */ void m12240T1(HomeActivity homeActivity) {
        homeActivity.m12208t2();
    }

    /* renamed from: U1 */
    public static final /* synthetic */ void m12239U1(HomeActivity homeActivity) {
        homeActivity.m12204v2();
    }

    /* renamed from: V1 */
    public static final /* synthetic */ void m12238V1(HomeActivity homeActivity) {
        homeActivity.m12198x2();
    }

    /* renamed from: W1 */
    private static final void m12237W1(ActivityResult activityResult) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X1 */
    public static final void m12236X1(HomeActivity homeActivity, ActivityResult activityResult) {
        Intent m41352a;
        Bundle extras;
        BannerActionGotoType bannerActionGotoType;
        Intrinsics.isThisObjectNull(homeActivity, "this$0");
        if (activityResult.m41351b() != -1 || (m41352a = activityResult.m41352a()) == null || (extras = m41352a.getExtras()) == null || (bannerActionGotoType = (BannerActionGotoType) extras.getParcelable("EXTRA_FOR_GOTO_RESULT")) == null) {
            return;
        }
        int i = C9156b.f24135a[bannerActionGotoType.ordinal()];
        if (i == 1) {
            PromotionActivity.m23290a(homeActivity);
            homeActivity.finish();
        } else if (i == 2) {
            ShoppingListActivity.m20275a(homeActivity);
        } else if (i == 3) {
            Launchers.m9999c(homeActivity, ((HomeViewModel) homeActivity.m22758I0()).m121A());
            homeActivity.finish();
        } else if (i != 4) {
        } else {
            C6772d.m20158d(LifecycleOwner.m36965a(homeActivity), null, null, new C9159d(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y1 */
    public static final void m12235Y1(HomeActivity homeActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(homeActivity, "this$0");
        if (activityResult.m41351b() == -1) {
            ShoppingListActivity.m20275a(homeActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d2 */
    public static final boolean m12230d2(HomeActivity homeActivity, MenuItem menuItem) {
        Intrinsics.isThisObjectNull(homeActivity, "this$0");
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == C2336R.C2338id.action_search) {
            SearchActivity.m23749c(homeActivity.f24133s0, homeActivity, null, null, 6, null);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f2 */
    public static final void m12228f2(HomeViewModel homeViewModel) {
        Intrinsics.isThisObjectNull(homeViewModel, "$viewModel");
        homeViewModel.m12122t1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g2 */
    public static final void m12227g2(AbstractC11737e0 abstractC11737e0, Boolean bool) {
        Intrinsics.isThisObjectNull(abstractC11737e0, "$binding");
        SwipeRefreshLayout swipeRefreshLayout = abstractC11737e0.f30184R;
        Intrinsics.checkIfNull(bool, "it");
        swipeRefreshLayout.setRefreshing(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m12226h2(HomeViewModel homeViewModel, AbstractC11737e0 abstractC11737e0, LoyaltyCard loyaltyCard) {
        Intrinsics.isThisObjectNull(homeViewModel, "$viewModel");
        Intrinsics.isThisObjectNull(abstractC11737e0, "$binding");
        if (Intrinsics.equals(homeViewModel.m12151R0().mo172f(), Boolean.TRUE)) {
            LoyaltyCard loyaltyCard2 = (LoyaltyCard) homeViewModel.m12140c1().mo172f();
            BenefitsExpirationColors m13792y = loyaltyCard2 != null ? loyaltyCard2.m13792y() : null;
            abstractC11737e0.f30178L.f30457y.setTextColor(Color.parseColor(m13792y != null ? m13792y.m13917b() : null));
            abstractC11737e0.f30178L.f30457y.setBackgroundColor(Color.parseColor(m13792y != null ? m13792y.m13918a() : null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m12225i2(AbstractC11737e0 abstractC11737e0, Boolean bool) {
        Intrinsics.isThisObjectNull(abstractC11737e0, "$binding");
        Intrinsics.checkIfNull(bool, "it");
        abstractC11737e0.f30179M.setPadding(UtilsExtensions.m35167e(0), UtilsExtensions.m35167e(16), UtilsExtensions.m35167e(0), UtilsExtensions.m35167e(bool.booleanValue() ? 0 : 150));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j2 */
    public static final void m12224j2(AbstractC11737e0 abstractC11737e0, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        Intrinsics.isThisObjectNull(abstractC11737e0, "$binding");
        Intrinsics.isThisObjectNull(nestedScrollView, "v");
        abstractC11737e0.f30176J.m30716w(nestedScrollView.getScrollY() != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m12222k2(HomeActivity homeActivity, View view) {
        Intrinsics.isThisObjectNull(homeActivity, "this$0");
        Uri parse = Uri.parse("https://www.poupamais.pt/pt/welcome/info_points_aquire/");
        Intrinsics.checkIfNull(parse, "parse(this)");
        homeActivity.startActivity(new Intent("android.intent.action.VIEW", parse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m12221l2(HomeActivity homeActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(homeActivity, "this$0");
        if (activityResult.m41351b() == -1) {
            C6772d.m20158d(LifecycleOwner.m36965a(homeActivity), null, null, new C9172l(null), 3, null);
        }
    }

    /* renamed from: m2 */
    private static final void m12220m2(ActivityResult activityResult) {
    }

    /* renamed from: o2 */
    private final void m12217o2() {
        PlaceHolderRecyclerView placeHolderRecyclerView = ((AbstractC11737e0) m22738w0()).f30192z;
        placeHolderRecyclerView.m36657h(new MarginItemDecoration(0, UtilsExtensions.m35167e(16), UtilsExtensions.m35167e(8), UtilsExtensions.m35167e(40), false, false, 0, 16, null));
        placeHolderRecyclerView.setAdapter(this.f24125k0);
        placeHolderRecyclerView.setHoldersAdapter(new BannerPlaceHolderAdapter());
        if (placeHolderRecyclerView.getOnFlingListener() == null) {
            new C1636p().m35821b(placeHolderRecyclerView);
        }
        LifecycleOwner.m36965a(this).m36985h(new C9173m(null));
        ((HomeViewModel) m22758I0()).m12137f1().mo171i(this, new InterfaceC1440f0() { // from class: uj.d
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                HomeActivity.m12216p2(HomeActivity.this, (Boolean) obj);
            }
        });
        ((AbstractC11737e0) m22738w0()).f30191y.m37802s().setOnClickListener(new View.OnClickListener() { // from class: uj.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.m12215q2(HomeActivity.this, view);
            }
        });
        ((AbstractC11737e0) m22738w0()).f30191y.f30336x.setOnClickListener(new View.OnClickListener() { // from class: uj.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.m12213r2(HomeActivity.this, view);
            }
        });
        ((AbstractC11737e0) m22738w0()).f30191y.f30337y.setOnClickListener(new View.OnClickListener() { // from class: uj.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.m12210s2(HomeActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m12216p2(HomeActivity homeActivity, Boolean bool) {
        Intrinsics.isThisObjectNull(homeActivity, "this$0");
        if (homeActivity.f24129o0) {
            if (Intrinsics.equals(bool, Boolean.FALSE)) {
                homeActivity.f24129o0 = false;
            }
            C2046o.m34853a(((AbstractC11737e0) homeActivity.m22738w0()).f30192z);
            PlaceHolderRecyclerView placeHolderRecyclerView = ((AbstractC11737e0) homeActivity.m22738w0()).f30192z;
            Intrinsics.checkIfNull(bool, "it");
            placeHolderRecyclerView.m33813B1(bool.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m12215q2(HomeActivity homeActivity, View view) {
        Intrinsics.isThisObjectNull(homeActivity, "this$0");
        AbstractC0304b abstractC0304b = homeActivity.f24132r0;
        Object mo172f = ((HomeViewModel) homeActivity.m22758I0()).m12149T0().mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        BannerDetailActivity.m2021a(abstractC0304b, homeActivity, (Banner) mo172f, null);
    }

    /* renamed from: r1 */
    public static /* synthetic */ void m12214r1(HomeActivity homeActivity, List list) {
        m12196y2(homeActivity, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r2 */
    public static final void m12213r2(HomeActivity homeActivity, View view) {
        Intrinsics.isThisObjectNull(homeActivity, "this$0");
        AbstractC0304b abstractC0304b = homeActivity.f24132r0;
        Object mo172f = ((HomeViewModel) homeActivity.m22758I0()).m12149T0().mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        BannerDetailActivity.m2021a(abstractC0304b, homeActivity, (Banner) mo172f, null);
    }

    /* renamed from: s1 */
    public static /* synthetic */ void m12211s1(HomeActivity homeActivity, FlyerAdapter flyerAdapter, List list) {
        m12201w2(homeActivity, flyerAdapter, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m12210s2(HomeActivity homeActivity, View view) {
        Intrinsics.isThisObjectNull(homeActivity, "this$0");
        Object mo172f = ((HomeViewModel) homeActivity.m22758I0()).m12149T0().mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        ((HomeViewModel) homeActivity.m22758I0()).m12153P0(((Banner) mo172f).m13950h());
    }

    /* renamed from: t1 */
    public static /* synthetic */ void m12209t1(HomeActivity homeActivity, ActivityResult activityResult) {
        m12236X1(homeActivity, activityResult);
    }

    /* renamed from: t2 */
    private final void m12208t2() {
        ((HomeViewModel) m22758I0()).m12140c1().mo171i(this, new InterfaceC1440f0() { // from class: uj.f
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                HomeActivity.m12206u2(HomeActivity.this, (LoyaltyCard) obj);
            }
        });
    }

    /* renamed from: u1 */
    public static /* synthetic */ void m12207u1(AbstractC11737e0 abstractC11737e0, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        m12224j2(abstractC11737e0, nestedScrollView, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m12206u2(HomeActivity homeActivity, LoyaltyCard loyaltyCard) {
        Intrinsics.isThisObjectNull(homeActivity, "this$0");
        if (loyaltyCard.m13817M()) {
            return;
        }
        TextView textView = ((AbstractC11737e0) homeActivity.m22738w0()).f30178L.f30456x;
        ResourcesProvider m6898a = C10841b.m6898a(homeActivity);
        TypedValue typedValue = new TypedValue();
        new ContextThemeWrapper(m6898a.m6899a(), 2131951665).getTheme().resolveAttribute(C2336R.attr.colorPrimaryVariant, typedValue, true);
        ColorStateList valueOf = ColorStateList.valueOf(C0928a.m39113d(m6898a.m6899a(), typedValue.resourceId));
        Intrinsics.checkIfNull(valueOf, "ColorStateList.valueOf(c…r(attrResId, themeResId))");
        textView.setTextColor(valueOf);
    }

    /* renamed from: v1 */
    public static /* synthetic */ void m12205v1(HomeActivity homeActivity, LoyaltyCard loyaltyCard) {
        m12206u2(homeActivity, loyaltyCard);
    }

    /* renamed from: v2 */
    private final void m12204v2() {
        final FlyerAdapter flyerAdapter = new FlyerAdapter(new C9177o());
        PlaceHolderRecyclerView placeHolderRecyclerView = ((AbstractC11737e0) m22738w0()).f30175I;
        placeHolderRecyclerView.setItemAnimator(null);
        placeHolderRecyclerView.m36657h(new MarginItemDecoration(0, UtilsExtensions.m35167e(16), UtilsExtensions.m35167e(8), UtilsExtensions.m35167e(40), false, false, 0, 16, null));
        placeHolderRecyclerView.setAdapter(flyerAdapter);
        ((HomeViewModel) m22758I0()).m12148U0().mo171i(this, new InterfaceC1440f0() { // from class: uj.g
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                HomeActivity.m12201w2(HomeActivity.this, flyerAdapter, (List) obj);
            }
        });
    }

    /* renamed from: w1 */
    public static /* synthetic */ void m12202w1(ActivityResult activityResult) {
        m12220m2(activityResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w2 */
    public static final void m12201w2(HomeActivity homeActivity, FlyerAdapter flyerAdapter, List list) {
        Intrinsics.isThisObjectNull(homeActivity, "this$0");
        Intrinsics.isThisObjectNull(flyerAdapter, "$flyerAdapter");
        Intrinsics.checkIfNull(list, "flyers");
        if (!list.isEmpty()) {
            C6772d.m20158d(LifecycleOwner.m36965a(homeActivity), null, null, new C9176n(flyerAdapter, list, null), 3, null);
        }
    }

    /* renamed from: x1 */
    public static /* synthetic */ void m12199x1(HomeActivity homeActivity, Boolean bool) {
        m12193z2(homeActivity, bool);
    }

    /* renamed from: x2 */
    private final void m12198x2() {
        PlaceHolderRecyclerView placeHolderRecyclerView = ((AbstractC11737e0) m22738w0()).f30183Q;
        placeHolderRecyclerView.m36657h(new MarginItemDecoration(0, UtilsExtensions.m35167e(16), UtilsExtensions.m35167e(8), UtilsExtensions.m35167e(1), false, false, 0, 16, null));
        placeHolderRecyclerView.setAdapter(this.f24125k0);
        placeHolderRecyclerView.setHoldersAdapter(new BannerPlaceHolderAdapter());
        if (placeHolderRecyclerView.getOnFlingListener() == null) {
            new C1636p().m35821b(placeHolderRecyclerView);
        }
        placeHolderRecyclerView.setAdapter(this.f24126l0);
        placeHolderRecyclerView.setHoldersAdapter(new ItemFixPlaceHolderAdapter());
        if (placeHolderRecyclerView.getOnFlingListener() == null) {
            new C1636p().m35821b(placeHolderRecyclerView);
        }
        ((HomeViewModel) m22758I0()).m12132k0().mo171i(this, new InterfaceC1440f0() { // from class: uj.e
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                HomeActivity.m12196y2(HomeActivity.this, (List) obj);
            }
        });
        ((HomeViewModel) m22758I0()).m102x().mo171i(this, new InterfaceC1440f0() { // from class: uj.c
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                HomeActivity.m12193z2(HomeActivity.this, (Boolean) obj);
            }
        });
    }

    /* renamed from: y1 */
    public static /* synthetic */ void m12197y1(HomeActivity homeActivity, View view) {
        m12213r2(homeActivity, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y2 */
    public static final void m12196y2(HomeActivity homeActivity, List list) {
        Intrinsics.isThisObjectNull(homeActivity, "this$0");
        C6772d.m20158d(LifecycleOwner.m36965a(homeActivity), null, null, new C9178p(list, null), 3, null);
    }

    /* renamed from: z1 */
    public static /* synthetic */ void m12194z1(ActivityResult activityResult) {
        m12237W1(activityResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z2 */
    public static final void m12193z2(HomeActivity homeActivity, Boolean bool) {
        Intrinsics.isThisObjectNull(homeActivity, "this$0");
        C2046o.m34853a(((AbstractC11737e0) homeActivity.m22738w0()).f30183Q);
        PlaceHolderRecyclerView placeHolderRecyclerView = ((AbstractC11737e0) homeActivity.m22738w0()).f30183Q;
        Intrinsics.checkIfNull(bool, "it");
        placeHolderRecyclerView.m33813B1(bool.booleanValue());
    }

    /* renamed from: A0 */
    protected int m12267A0() {
        return C2336R.C2339menu.menu_search;
    }

    /* renamed from: A2 */
    public Object m12265A2(HomeActivity homeActivity, AbstractC11737e0 abstractC11737e0, HomeViewModel homeViewModel, InterfaceC6097a interfaceC6097a, InterfaceC1886d interfaceC1886d) {
        return HomeCoachMarks.C10938a.m6735d(this, homeActivity, abstractC11737e0, homeViewModel, interfaceC6097a, interfaceC1886d);
    }

    /* renamed from: B2 */
    public Object m12263B2(HomeActivity homeActivity, AbstractC11737e0 abstractC11737e0, HomeViewModel homeViewModel, InterfaceC1886d interfaceC1886d) {
        return HomeCoachMarks.C10938a.m6734e(this, homeActivity, abstractC11737e0, homeViewModel, interfaceC1886d);
    }

    /* renamed from: C2 */
    public Object m12261C2(HomeActivity homeActivity, AbstractC11737e0 abstractC11737e0, HomeViewModel homeViewModel, InterfaceC6097a interfaceC6097a, InterfaceC1886d interfaceC1886d) {
        return HomeCoachMarks.C10938a.m6733f(this, homeActivity, abstractC11737e0, homeViewModel, interfaceC6097a, interfaceC1886d);
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12254J0() {
        return C6450z.m20906b(HomeViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12252K0() {
        return new C9161f();
    }

    /* renamed from: S0 */
    protected boolean m12242S0() {
        return false;
    }

    /* renamed from: Z1 */
    public final TransactionCacheManager m12234Z1() {
        TransactionCacheManager transactionCacheManager = this.f24123i0;
        if (transactionCacheManager != null) {
            return transactionCacheManager;
        }
        Intrinsics.throwUninitPropException("cache");
        return null;
    }

    /* renamed from: a2 */
    public final ViewModelFactoryByInjection m12233a2() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24124j0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: b2 */
    public final AbstractC0304b m12232b2() {
        return this.f24131q0;
    }

    /* renamed from: c2 */
    public final Spotlight m12231c2() {
        return this.f24128n0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SuppressLint({"DirectColorInSource"})
    /* renamed from: e2 */
    public void m12218o1(final AbstractC11737e0 abstractC11737e0, final HomeViewModel homeViewModel) {
        Intrinsics.isThisObjectNull(abstractC11737e0, "binding");
        Intrinsics.isThisObjectNull(homeViewModel, "viewModel");
        super.m17611o1(abstractC11737e0, homeViewModel);
        LifecycleOwner.m36965a(this).m36985h(new C9162g(homeViewModel, this, abstractC11737e0, null));
        homeViewModel.m12147V0().mo171i(this, new InterfaceC1440f0() { // from class: uj.i
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                HomeActivity.m12225i2(AbstractC11737e0.this, (Boolean) obj);
            }
        });
        abstractC11737e0.mo4339Q(m17612n1());
        abstractC11737e0.mo4338R(new C9168h());
        abstractC11737e0.f30173G.setOnScrollChangeListener(new NestedScrollView.InterfaceC1221c() { // from class: uj.b
            @Override // androidx.core.widget.NestedScrollView.InterfaceC1221c
            /* renamed from: a */
            public final void mo6751a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                HomeActivity.m12224j2(AbstractC11737e0.this, nestedScrollView, i, i2, i3, i4);
            }
        });
        abstractC11737e0.f30178L.m37802s().setOnClickListener(new View.OnClickListener() { // from class: uj.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.m12222k2(HomeActivity.this, view);
            }
        });
        abstractC11737e0.f30184R.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC1685j() { // from class: uj.k
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC1685j
            /* renamed from: a */
            public final void mo6745a() {
                HomeActivity.m12228f2(HomeViewModel.this);
            }
        });
        homeViewModel.m12130l1().mo171i(this, new InterfaceC1440f0() { // from class: uj.j
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                HomeActivity.m12227g2(AbstractC11737e0.this, (Boolean) obj);
            }
        });
        LifecycleOwner.m36965a(this).m36984i(new C9169i(null));
        homeViewModel.m12140c1().mo171i(this, new InterfaceC1440f0() { // from class: uj.h
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                HomeActivity.m12226h2(HomeViewModel.this, abstractC11737e0, (LoyaltyCard) obj);
            }
        });
    }

    /* renamed from: k1 */
    protected void m12223k1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        AbstractC13816c abstractC13816c = (AbstractC13816c) c13182l.m1460c();
        if (abstractC13816c instanceof C13858k2) {
            C6772d.m20158d(LifecycleOwner.m36965a(this), null, null, new C9160e(null), 3, null);
        } else if (abstractC13816c instanceof C13806a) {
            AccountActivityLauncher.m157a(this.f24130p0, ((HomeViewModel) m22758I0()).m121A(), this);
        } else if (abstractC13816c instanceof C13873m0) {
            CardRegistrationLandingActivity.m60a(this.f24134t0, this);
        } else if (abstractC13816c instanceof C13807a0) {
            ClubActivity.m22636a(this);
        } else {
            if (abstractC13816c instanceof C13903t0 ? true : abstractC13816c instanceof C13899s0) {
                LoyaltyCardActivity.m6783c(this, null, 1, null);
            } else if (abstractC13816c instanceof C13907u0) {
                LoyaltyIntroActivity.m23345a(this);
            } else if (abstractC13816c instanceof C13895r0) {
                LoyaltyActivity.m34603b(this, false, 1, null);
            } else if (abstractC13816c instanceof C13911v0) {
                LoyaltyPendingActivity.m22645a(this);
            } else if (abstractC13816c instanceof C13890q) {
                BenefitsActivity.m25726a(this);
            } else if (abstractC13816c instanceof C13811b) {
                AccountActivityLauncher.m156b(this, ((HomeViewModel) m22758I0()).m121A());
                finish();
            } else if (abstractC13816c instanceof C13871l2) {
                TailoredForYouActivity.m26360b(this.f24133s0, this);
            } else if (abstractC13816c instanceof C13920x1) {
                PurchaseListActivity.m21957c(this.f24133s0, this, false, false, 6, null);
            }
        }
    }

    /* renamed from: n2 */
    public final void m12219n2(Spotlight spotlight) {
        this.f24128n0 = spotlight;
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        Intrinsics.isThisObjectNull(bundle, "savedInstanceState");
        super.onRestoreInstanceState(bundle);
        this.f24127m0 = bundle.getInt("STATE_FOR_PREVIOUS_STORE");
    }

    protected void onResume() {
        super.onResume();
        ((HomeViewModel) m22758I0()).m26370q0();
        ((HomeViewModel) m22758I0()).m22606W();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        Intrinsics.isThisObjectNull(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putInt("STATE_FOR_PREVIOUS_STORE", this.f24127m0);
    }

    /* renamed from: s */
    public BottomNavigationView mo17603s() {
        BottomNavigationView bottomNavigationView = ((AbstractC11737e0) m22738w0()).f30168B.f30312x;
        Intrinsics.checkIfNull(bottomNavigationView, "binding.bottomNavigation….viewBottomNavigationView");
        return bottomNavigationView;
    }

    /* renamed from: w */
    public int mo17602w() {
        return C2336R.C2338id.navigation_home;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_home;
    }

    /* renamed from: z0 */
    protected Toolbar.InterfaceC0450f m12195z0() {
        return new Toolbar.InterfaceC0450f() { // from class: uj.t
            @Override // androidx.appcompat.widget.Toolbar.InterfaceC0450f
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean m11117d2;
                m11117d2 = HomeActivity.m12230d2(HomeActivity.this, menuItem);
                return m11117d2;
            }
        };
    }
}
