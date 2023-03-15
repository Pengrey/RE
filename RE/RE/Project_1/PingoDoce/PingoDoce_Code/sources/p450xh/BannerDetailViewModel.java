package p450xh;

import android.graphics.drawable.Drawable;
import androidx.constraintlayout.widget.C0868i;
import androidx.lifecycle.C1430c0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.razir.progressbutton.C2381h;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ki.SubmitAnimatedViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import mg.AnalyticsManager;
import mg.C7310l;
import mg.ClubManager;
import mg.StoreManager;
import ng.AnalyticEvents;
import ng.InterfaceC7886d;
import p070e.C4906j;
import p181jd.Intrinsics;
import p276og.Result;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13807a0;
import pt.pingodoce.app.data.local.models.banners.BannerActionGotoType;
import pt.pingodoce.app.data.local.models.banners.BannerActionType;
import pt.pingodoce.app.data.remote.models.response.Banner;
import td.InterfaceC10524i0;

/* renamed from: xh.e */
/* loaded from: classes2.dex */
public final class BannerDetailViewModel extends SubmitAnimatedViewModel {

    /* renamed from: C */
    private final C7310l f33691C;

    /* renamed from: D */
    private final AnalyticsManager f33692D;

    /* renamed from: E */
    private final ClubManager f33693E;

    /* renamed from: F */
    private C2381h f33694F;

    /* renamed from: G */
    private final Void f33695G;

    /* renamed from: H */
    private final C1436e0 f33696H;

    /* renamed from: I */
    private final C1430c0 f33697I;

    /* renamed from: J */
    private final C1430c0 f33698J;

    /* renamed from: K */
    private final LiveData f33699K;

    /* renamed from: L */
    private final C1430c0 f33700L;

    /* renamed from: M */
    private final C1430c0 f33701M;

    /* compiled from: BannerDetailViewModel.kt */
    /* renamed from: xh.e$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C12984a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33702a;

        static {
            int[] iArr = new int[BannerActionType.values().length];
            iArr[BannerActionType.GOTO.ordinal()] = 1;
            iArr[BannerActionType.FLYER.ordinal()] = 2;
            iArr[BannerActionType.PRODUCT.ordinal()] = 3;
            iArr[BannerActionType.URL.ordinal()] = 4;
            iArr[BannerActionType.CLUBS.ordinal()] = 5;
            f33702a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BannerDetailViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.banner.BannerDetailViewModel", m20196f = "BannerDetailViewModel.kt", m20195l = {90, C0868i.f2758E0}, m20194m = "onSubmit")
    /* renamed from: xh.e$b */
    /* loaded from: classes2.dex */
    public static final class C12985b extends AbstractC6757d {

        /* renamed from: w */
        Object f33703w;

        /* renamed from: x */
        /* synthetic */ Object f33704x;

        /* renamed from: z */
        int f33706z;

        C12985b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f33704x = obj;
            this.f33706z |= Integer.MIN_VALUE;
            return BannerDetailViewModel.this.m2013n0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BannerDetailViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.banner.BannerDetailViewModel$onSubmit$2$2", m20196f = "BannerDetailViewModel.kt", m20195l = {C4906j.f13415H0}, m20194m = "invokeSuspend")
    /* renamed from: xh.e$c */
    /* loaded from: classes2.dex */
    public static final class C12986c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f33707x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BannerDetailViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.banner.BannerDetailViewModel$onSubmit$2$2$1", m20196f = "BannerDetailViewModel.kt", m20195l = {C4906j.f13420I0}, m20194m = "invokeSuspend")
        /* renamed from: xh.e$c$a */
        /* loaded from: classes2.dex */
        public static final class C12987a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f33709x;

            /* renamed from: y */
            final /* synthetic */ BannerDetailViewModel f33710y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12987a(BannerDetailViewModel bannerDetailViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f33710y = bannerDetailViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C12987a(this.f33710y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C12987a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f33709x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    ClubManager m2010w0 = BannerDetailViewModel.m2010w0(this.f33710y);
                    this.f33709x = 1;
                    obj = m2010w0.m18646h(this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                Result result = (Result) obj;
                if (result instanceof Result.C8078c) {
                    BaseViewModel.m119C(this.f33710y, C13807a0.f34915a, null, 2, null);
                } else if (result instanceof Result.C8077b) {
                    BannerDetailViewModel.m2009x0(this.f33710y, ((Result.C8077b) result).m16964b());
                }
                return C13195u.f34156a;
            }
        }

        C12986c(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C12986c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C12986c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f33707x;
            if (i == 0) {
                C13186n.m1453b(obj);
                BannerDetailViewModel bannerDetailViewModel = BannerDetailViewModel.this;
                C12987a c12987a = new C12987a(bannerDetailViewModel, null);
                this.f33707x = 1;
                if (BannerDetailViewModel.m2008y0(bannerDetailViewModel, true, c12987a, this) == m34636d) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerDetailViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, StoreManager storeManager, C7310l c7310l, AnalyticsManager analyticsManager, ClubManager clubManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(storeManager, "storeManager");
        Intrinsics.isThisObjectNull(c7310l, "catalogManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        Intrinsics.isThisObjectNull(clubManager, "clubManager");
        this.f33691C = c7310l;
        this.f33692D = analyticsManager;
        this.f33693E = clubManager;
        C2381h c2381h = new C2381h();
        c2381h.m33752h(2);
        Object m37005b = c1459l0.m37005b("EXTRA_FOR_BANNER_DETAIL");
        Intrinsics.ifNullDoSomething(m37005b);
        c2381h.m33754f(((Banner) m37005b).m13953d().m14667a());
        this.f33694F = c2381h;
        C1436e0 m37004c = c1459l0.m37004c("EXTRA_FOR_BANNER_DETAIL");
        Intrinsics.checkIfNull(m37004c, "stateHandle.getLiveData<…(EXTRA_FOR_BANNER_DETAIL)");
        this.f33696H = m37004c;
        C1430c0 c1430c0 = new C1430c0();
        this.f33697I = c1430c0;
        C1430c0 c1430c02 = new C1430c0();
        this.f33698J = c1430c02;
        this.f33699K = m37004c;
        this.f33700L = c1430c0;
        this.f33701M = c1430c02;
        T mo172f = m37004c.mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        InterfaceC7886d.C7887a.m17629a(analyticsManager, new AnalyticEvents.AbstractC7743d.C7745b(String.valueOf(((Banner) mo172f).m13950h())), null, null, null, 14, null);
        c1430c02.mo166p(Boolean.TRUE);
        c1430c0.m37055q(m37004c, new InterfaceC1440f0() { // from class: xh.d
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                BannerDetailViewModel.m2011v0(BannerDetailViewModel.this, (Banner) obj);
            }
        });
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m2012u0(BannerDetailViewModel bannerDetailViewModel, Banner banner) {
        m2011v0(bannerDetailViewModel, banner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public static final void m2011v0(BannerDetailViewModel bannerDetailViewModel, Banner banner) {
        Intrinsics.isThisObjectNull(bannerDetailViewModel, "this$0");
        bannerDetailViewModel.f33697I.mo166p(Boolean.valueOf(banner.m13955b() != BannerActionType.NONE || (banner.m13955b() == BannerActionType.GOTO && banner.m13956a() != BannerActionGotoType.NONE)));
    }

    /* renamed from: w0 */
    public static final /* synthetic */ ClubManager m2010w0(BannerDetailViewModel bannerDetailViewModel) {
        return bannerDetailViewModel.f33693E;
    }

    /* renamed from: x0 */
    public static final /* synthetic */ void m2009x0(BannerDetailViewModel bannerDetailViewModel, Throwable th2) {
        bannerDetailViewModel.m109l(th2);
    }

    /* renamed from: y0 */
    public static final /* synthetic */ Object m2008y0(BannerDetailViewModel bannerDetailViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return bannerDetailViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: A0 */
    public final C1430c0 m2018A0() {
        return this.f33701M;
    }

    /* renamed from: B0 */
    public final C1430c0 m2017B0() {
        return this.f33700L;
    }

    /* renamed from: C0 */
    protected Void m2016C0() {
        return this.f33695G;
    }

    /* renamed from: f0 */
    public /* bridge */ /* synthetic */ Drawable m2015f0() {
        return (Drawable) m2016C0();
    }

    /* renamed from: g0 */
    protected C2381h m2014g0() {
        return this.f33694F;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0179  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object m2013n0(bd.InterfaceC1886d r30) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p450xh.BannerDetailViewModel.m2013n0(bd.d):java.lang.Object");
    }

    /* renamed from: z0 */
    public final LiveData m2007z0() {
        return this.f33699K;
    }
}
