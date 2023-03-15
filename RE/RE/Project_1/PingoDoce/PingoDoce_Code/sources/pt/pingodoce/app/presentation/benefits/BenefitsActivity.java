package pt.pingodoce.app.presentation.benefits;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.C1636p;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import bd.InterfaceC1886d;
import be.UtilsExtensions;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import ee.MarginItemDecoration;
import gl.PromotionActivity;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6114r;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import me.InterfaceC7186c;
import ne.EventObserver;
import p050d.C4519c;
import p086ei.BenefitsAdapter;
import p086ei.BenefitsViewModel;
import p181jd.AbstractC6438m;
import p181jd.C6435i;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p207kl.ShoppingListActivity;
import p221le.UiEventsLiveData;
import p314qd.InterfaceC9717b;
import p322ql.Launchers;
import p389ui.LoyaltyCardActivity;
import p390uj.HomeActivity;
import p426wg.AbstractC11842k;
import p450xh.BannerDetailActivity;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p472yh.BannerAdapter;
import p472yh.BannerPlaceHolderAdapter;
import p472yh.EnumC13439a;
import p493zg.AccountActivityLauncher;
import p494zh.BaseActivity;
import p494zh.C13869l0;
import p494zh.C13899s0;
import pe.C8618e;
import pt.pingodoce.app.data.local.models.banners.BannerActionGotoType;
import pt.pingodoce.app.data.remote.models.response.Banner;
import pt.pingodoce.app.data.remote.models.response.Benefit;
import pt.pingodoce.app.presentation.benefits.BenefitsActivity;
import pt.pingodoce.app.presentation.benefits.details.BenefitsDetailsBottomSheetFragment;
import td.C10587w0;
import td.InterfaceC10524i0;

/* compiled from: BenefitsActivity.kt */
/* loaded from: classes2.dex */
public final class BenefitsActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f23634f0;

    /* renamed from: g0 */
    private boolean f23635g0;

    /* renamed from: h0 */
    private final BenefitsAdapter f23636h0 = new BenefitsAdapter(new C8950c(this));

    /* renamed from: i0 */
    private final BannerAdapter f23637i0 = new BannerAdapter(new C8947b());

    /* renamed from: j0 */
    private final AbstractC0304b f23638j0;

    /* compiled from: BenefitsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.benefits.BenefitsActivity$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C8946a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23639a;

        static {
            int[] iArr = new int[BannerActionGotoType.values().length];
            iArr[BannerActionGotoType.PROMOTIONS.ordinal()] = 1;
            iArr[BannerActionGotoType.SHOPPING_LIST.ordinal()] = 2;
            iArr[BannerActionGotoType.TAKE_AWAY.ordinal()] = 3;
            iArr[BannerActionGotoType.LOYALTY.ordinal()] = 4;
            f23639a = iArr;
        }
    }

    /* compiled from: BenefitsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.benefits.BenefitsActivity$b */
    /* loaded from: classes2.dex */
    static final class C8947b extends AbstractC6438m implements InterfaceC6114r {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BenefitsActivity.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.benefits.BenefitsActivity$bannerAdapter$1$1", m20196f = "BenefitsActivity.kt", m20195l = {70}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.benefits.BenefitsActivity$b$a */
        /* loaded from: classes2.dex */
        public static final class C8948a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f23641x;

            /* renamed from: y */
            final /* synthetic */ BenefitsActivity f23642y;

            /* renamed from: z */
            final /* synthetic */ Banner f23643z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8948a(BenefitsActivity benefitsActivity, Banner banner, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f23642y = benefitsActivity;
                this.f23643z = banner;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C8948a(this.f23642y, this.f23643z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C8948a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f23641x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    BenefitsViewModel m13024t1 = BenefitsActivity.m13024t1(this.f23642y);
                    int m13950h = this.f23643z.m13950h();
                    this.f23641x = 1;
                    if (m13024t1.m25699X(m13950h, this) == m34636d) {
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

        /* compiled from: BenefitsActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.benefits.BenefitsActivity$b$b */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C8949b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f23644a;

            static {
                int[] iArr = new int[EnumC13439a.values().length];
                iArr[EnumC13439a.DETAIL.ordinal()] = 1;
                iArr[EnumC13439a.DELETE.ordinal()] = 2;
                f23644a = iArr;
            }
        }

        C8947b() {
            super(4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x006b, code lost:
            if (r9 <= ((androidx.recyclerview.widget.LinearLayoutManager) r2).m36770c2()) goto L13;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m13016a(int r9, pt.pingodoce.app.data.remote.models.response.Banner r10, p472yh.EnumC13439a r11, android.view.View r12) {
            /*
                r8 = this;
                java.lang.String r0 = "banner"
                p181jd.Intrinsics.isThisObjectNull(r10, r0)
                java.lang.String r0 = "actionType"
                p181jd.Intrinsics.isThisObjectNull(r11, r0)
                java.lang.String r0 = "view"
                p181jd.Intrinsics.isThisObjectNull(r12, r0)
                int[] r0 = pt.pingodoce.app.presentation.benefits.BenefitsActivity.C8947b.C8949b.f23644a
                int r11 = r11.ordinal()
                r11 = r0[r11]
                r0 = 1
                r1 = 0
                if (r11 == r0) goto L37
                r9 = 2
                if (r11 == r9) goto L1f
                goto L72
            L1f:
                pt.pingodoce.app.presentation.benefits.BenefitsActivity r9 = pt.pingodoce.app.presentation.benefits.BenefitsActivity.this
                androidx.lifecycle.q r2 = androidx.lifecycle.LifecycleOwner.m36965a(r9)
                td.e0 r3 = td.C10587w0.m7620b()
                r4 = 0
                pt.pingodoce.app.presentation.benefits.BenefitsActivity$b$a r5 = new pt.pingodoce.app.presentation.benefits.BenefitsActivity$b$a
                pt.pingodoce.app.presentation.benefits.BenefitsActivity r9 = pt.pingodoce.app.presentation.benefits.BenefitsActivity.this
                r5.<init>(r9, r10, r1)
                r6 = 2
                r7 = 0
                kotlinx.coroutines.C6769b.m20167d(r2, r3, r4, r5, r6, r7)
                goto L72
            L37:
                pt.pingodoce.app.presentation.benefits.BenefitsActivity r11 = pt.pingodoce.app.presentation.benefits.BenefitsActivity.this
                androidx.activity.result.b r11 = pt.pingodoce.app.presentation.benefits.BenefitsActivity.m13026r1(r11)
                pt.pingodoce.app.presentation.benefits.BenefitsActivity r0 = pt.pingodoce.app.presentation.benefits.BenefitsActivity.this
                wg.k r2 = pt.pingodoce.app.presentation.benefits.BenefitsActivity.m13025s1(r0)
                com.github.guilhe.views.PlaceHolderRecyclerView r2 = r2.f30714y
                androidx.recyclerview.widget.RecyclerView$o r2 = r2.getLayoutManager()
                java.lang.String r3 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
                java.util.Objects.requireNonNull(r2, r3)
                androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
                int r2 = r2.m36776W1()
                if (r9 < r2) goto L6e
                pt.pingodoce.app.presentation.benefits.BenefitsActivity r2 = pt.pingodoce.app.presentation.benefits.BenefitsActivity.this
                wg.k r2 = pt.pingodoce.app.presentation.benefits.BenefitsActivity.m13025s1(r2)
                com.github.guilhe.views.PlaceHolderRecyclerView r2 = r2.f30714y
                androidx.recyclerview.widget.RecyclerView$o r2 = r2.getLayoutManager()
                java.util.Objects.requireNonNull(r2, r3)
                androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
                int r2 = r2.m36770c2()
                if (r9 > r2) goto L6e
                goto L6f
            L6e:
                r12 = r1
            L6f:
                p450xh.BannerDetailActivity.m2021a(r11, r0, r10, r12)
            L72:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.benefits.BenefitsActivity.C8947b.m13016a(int, pt.pingodoce.app.data.remote.models.response.Banner, yh.a, android.view.View):void");
        }

        /* renamed from: a0 */
        public /* bridge */ /* synthetic */ Object mo22157a0(Object obj, Object obj2, Object obj3, Object obj4) {
            m13016a(((Number) obj).intValue(), (Banner) obj2, (EnumC13439a) obj3, (View) obj4);
            return C13195u.f34156a;
        }
    }

    /* compiled from: BenefitsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.benefits.BenefitsActivity$c */
    /* loaded from: classes2.dex */
    /* synthetic */ class C8950c extends C6435i implements InterfaceC6108l {
        C8950c(Object obj) {
            super(1, obj, BenefitsActivity.class, "onBenefitClickListener", "onBenefitClickListener(Lpt/pingodoce/app/data/remote/models/response/Benefit;)V", 0);
        }

        /* renamed from: i */
        public final void m13013i(Benefit benefit) {
            Intrinsics.isThisObjectNull(benefit, "p0");
            BenefitsActivity.m13023u1((BenefitsActivity) this.f18132x, benefit);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m13013i((Benefit) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: BenefitsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.benefits.BenefitsActivity$d */
    /* loaded from: classes2.dex */
    static final class C8951d extends AbstractC6438m implements InterfaceC6097a {
        C8951d() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(BenefitsActivity.this.m13019x1(), BenefitsActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BenefitsActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.benefits.BenefitsActivity$refresh$1", m20196f = "BenefitsActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.benefits.BenefitsActivity$e */
    /* loaded from: classes2.dex */
    public static final class C8952e extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23646x;

        C8952e(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8952e(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8952e) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f23646x == 0) {
                C13186n.m1453b(obj);
                BenefitsActivity.m13024t1(BenefitsActivity.this).m25691f0();
                BenefitsActivity.m13024t1(BenefitsActivity.this).m25690g0();
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BenefitsActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.benefits.BenefitsActivity$setupObservers$3$1", m20196f = "BenefitsActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.benefits.BenefitsActivity$f */
    /* loaded from: classes2.dex */
    public static final class C8953f extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23648x;

        /* renamed from: z */
        final /* synthetic */ List f23650z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8953f(List list, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23650z = list;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8953f(this.f23650z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8953f) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f23648x == 0) {
                C13186n.m1453b(obj);
                BannerAdapter m13027q1 = BenefitsActivity.m13027q1(BenefitsActivity.this);
                List list = this.f23650z;
                Intrinsics.checkIfNull(list, "it");
                m13027q1.m22153F(list);
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BenefitsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.benefits.BenefitsActivity$g */
    /* loaded from: classes2.dex */
    public static final class C8954g extends AbstractC6438m implements InterfaceC6108l {
        C8954g() {
            super(1);
        }

        /* renamed from: a */
        public final void m13009a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "it");
            InterfaceC7186c interfaceC7186c = (InterfaceC7186c) c13182l.m1460c();
            if (interfaceC7186c instanceof C13899s0) {
                LoyaltyCardActivity.m6783c(BenefitsActivity.this, null, 1, null);
            } else if (interfaceC7186c instanceof C13869l0) {
                HomeActivity.m6743b(BenefitsActivity.this);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m13009a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BenefitsActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.benefits.BenefitsActivity$setupViews$4$1", m20196f = "BenefitsActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.benefits.BenefitsActivity$h */
    /* loaded from: classes2.dex */
    public static final class C8955h extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23652x;

        /* renamed from: z */
        final /* synthetic */ List f23654z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8955h(List list, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23654z = list;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8955h(this.f23654z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8955h) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f23652x == 0) {
                C13186n.m1453b(obj);
                BannerAdapter m13027q1 = BenefitsActivity.m13027q1(BenefitsActivity.this);
                List list = this.f23654z;
                Intrinsics.checkIfNull(list, "bannerList");
                m13027q1.m22153F(list);
                if (this.f23654z.size() == 1) {
                    BenefitsActivity.m13025s1(BenefitsActivity.this).f30714y.setVisibility(8);
                    BenefitsActivity.m13025s1(BenefitsActivity.this).f30713x.m37802s().setVisibility(0);
                } else {
                    BenefitsActivity.m13025s1(BenefitsActivity.this).f30714y.setVisibility(0);
                    BenefitsActivity.m13025s1(BenefitsActivity.this).f30713x.m37802s().setVisibility(8);
                }
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BenefitsActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.benefits.BenefitsActivity$setupViews$6$1", m20196f = "BenefitsActivity.kt", m20195l = {182}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.benefits.BenefitsActivity$i */
    /* loaded from: classes2.dex */
    public static final class C8956i extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23655x;

        C8956i(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8956i(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8956i) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23655x;
            if (i == 0) {
                C13186n.m1453b(obj);
                BenefitsViewModel m13024t1 = BenefitsActivity.m13024t1(BenefitsActivity.this);
                Object mo172f = BenefitsActivity.m13024t1(BenefitsActivity.this).m25696a0().mo172f();
                Intrinsics.ifNullDoSomething(mo172f);
                int m13950h = ((Banner) mo172f).m13950h();
                this.f23655x = 1;
                if (m13024t1.m25699X(m13950h, this) == m34636d) {
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

    public BenefitsActivity() {
        AbstractC0304b m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: ei.c
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                BenefitsActivity.m13022v1(BenefitsActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…}\n            }\n        }");
        this.f23638j0 = m41364M;
    }

    /* renamed from: A1 */
    private final void m13052A1() {
        C6772d.m20158d(LifecycleOwner.m36965a(this), C10587w0.m7620b(), null, new C8952e(null), 2, null);
    }

    /* renamed from: B1 */
    private final void m13051B1() {
        ((BenefitsViewModel) m22758I0()).m25697Z().mo171i(this, new InterfaceC1440f0() { // from class: ei.e
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                BenefitsActivity.m13049D1(BenefitsActivity.this, (List) obj);
            }
        });
        ((BenefitsViewModel) m22758I0()).m25698Y().mo171i(this, new InterfaceC1440f0() { // from class: ei.f
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                BenefitsActivity.m13047E1(BenefitsActivity.this, (List) obj);
            }
        });
        ((BenefitsViewModel) m22758I0()).m25698Y().mo171i(this, new InterfaceC1440f0() { // from class: ei.g
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                BenefitsActivity.m13050C1(BenefitsActivity.this, (List) obj);
            }
        });
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C8954g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m13050C1(BenefitsActivity benefitsActivity, List list) {
        Intrinsics.isThisObjectNull(benefitsActivity, "this$0");
        C6772d.m20158d(LifecycleOwner.m36965a(benefitsActivity), null, null, new C8953f(list, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m13049D1(BenefitsActivity benefitsActivity, List list) {
        Intrinsics.isThisObjectNull(benefitsActivity, "this$0");
        ((AbstractC11842k) benefitsActivity.m22738w0()).f30709D.setRefreshing(false);
        BenefitsAdapter benefitsAdapter = benefitsActivity.f23636h0;
        Intrinsics.checkIfNull(list, "it");
        benefitsAdapter.m25723H(((BenefitsViewModel) benefitsActivity.m22758I0()).m25700W(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m13047E1(BenefitsActivity benefitsActivity, List list) {
        Intrinsics.isThisObjectNull(benefitsActivity, "this$0");
        benefitsActivity.f23635g0 = false;
        PlaceHolderRecyclerView placeHolderRecyclerView = ((AbstractC11842k) benefitsActivity.m22738w0()).f30714y;
    }

    /* renamed from: F1 */
    private final void m13046F1() {
        RecyclerView recyclerView = ((AbstractC11842k) m22738w0()).f30708C;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(this.f23636h0);
        ((AbstractC11842k) m22738w0()).f30709D.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC1685j() { // from class: ei.h
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC1685j
            /* renamed from: a */
            public final void mo6745a() {
                BenefitsActivity.m13045G1(BenefitsActivity.this);
            }
        });
        PlaceHolderRecyclerView placeHolderRecyclerView = ((AbstractC11842k) m22738w0()).f30714y;
        placeHolderRecyclerView.m33813B1(true);
        placeHolderRecyclerView.m36657h(new MarginItemDecoration(0, UtilsExtensions.m35167e(16), UtilsExtensions.m35167e(8), UtilsExtensions.m35167e(16), false, false, 0, 16, null));
        placeHolderRecyclerView.setAdapter(this.f23637i0);
        placeHolderRecyclerView.setHoldersAdapter(new BannerPlaceHolderAdapter());
        if (placeHolderRecyclerView.getOnFlingListener() == null) {
            new C1636p().m35821b(placeHolderRecyclerView);
        }
        ((BenefitsViewModel) m22758I0()).m25698Y().mo171i(this, new InterfaceC1440f0() { // from class: ei.d
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                BenefitsActivity.m13044H1(BenefitsActivity.this, (List) obj);
            }
        });
        ((AbstractC11842k) m22738w0()).f30713x.f30336x.setOnClickListener(new View.OnClickListener() { // from class: ei.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BenefitsActivity.m13043I1(BenefitsActivity.this, view);
            }
        });
        ((AbstractC11842k) m22738w0()).f30713x.f30337y.setOnClickListener(new View.OnClickListener() { // from class: ei.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BenefitsActivity.m13041J1(BenefitsActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m13045G1(BenefitsActivity benefitsActivity) {
        Intrinsics.isThisObjectNull(benefitsActivity, "this$0");
        benefitsActivity.m13052A1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m13044H1(BenefitsActivity benefitsActivity, List list) {
        Intrinsics.isThisObjectNull(benefitsActivity, "this$0");
        C6772d.m20158d(LifecycleOwner.m36965a(benefitsActivity), null, null, new C8955h(list, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I1 */
    public static final void m13043I1(BenefitsActivity benefitsActivity, View view) {
        Intrinsics.isThisObjectNull(benefitsActivity, "this$0");
        AbstractC0304b abstractC0304b = benefitsActivity.f23638j0;
        Object mo172f = ((BenefitsViewModel) benefitsActivity.m22758I0()).m25696a0().mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        BannerDetailActivity.m2021a(abstractC0304b, benefitsActivity, (Banner) mo172f, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J1 */
    public static final void m13041J1(BenefitsActivity benefitsActivity, View view) {
        Intrinsics.isThisObjectNull(benefitsActivity, "this$0");
        C6772d.m20158d(LifecycleOwner.m36965a(benefitsActivity), C10587w0.m7620b(), null, new C8956i(null), 2, null);
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m13036i1(BenefitsActivity benefitsActivity) {
        m13045G1(benefitsActivity);
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m13035j1(BenefitsActivity benefitsActivity, ActivityResult activityResult) {
        m13022v1(benefitsActivity, activityResult);
    }

    /* renamed from: k1 */
    public static /* synthetic */ void m13034k1(BenefitsActivity benefitsActivity, View view) {
        m13041J1(benefitsActivity, view);
    }

    /* renamed from: l1 */
    public static /* synthetic */ void m13033l1(BenefitsActivity benefitsActivity, List list) {
        m13044H1(benefitsActivity, list);
    }

    /* renamed from: m1 */
    public static /* synthetic */ void m13032m1(BenefitsActivity benefitsActivity, List list) {
        m13049D1(benefitsActivity, list);
    }

    /* renamed from: n1 */
    public static /* synthetic */ void m13030n1(BenefitsActivity benefitsActivity, List list) {
        m13047E1(benefitsActivity, list);
    }

    /* renamed from: o1 */
    public static /* synthetic */ void m13029o1(BenefitsActivity benefitsActivity, List list) {
        m13050C1(benefitsActivity, list);
    }

    /* renamed from: p1 */
    public static /* synthetic */ void m13028p1(BenefitsActivity benefitsActivity, View view) {
        m13043I1(benefitsActivity, view);
    }

    /* renamed from: q1 */
    public static final /* synthetic */ BannerAdapter m13027q1(BenefitsActivity benefitsActivity) {
        return benefitsActivity.f23637i0;
    }

    /* renamed from: r1 */
    public static final /* synthetic */ AbstractC0304b m13026r1(BenefitsActivity benefitsActivity) {
        return benefitsActivity.f23638j0;
    }

    /* renamed from: s1 */
    public static final /* synthetic */ AbstractC11842k m13025s1(BenefitsActivity benefitsActivity) {
        return (AbstractC11842k) benefitsActivity.m22738w0();
    }

    /* renamed from: t1 */
    public static final /* synthetic */ BenefitsViewModel m13024t1(BenefitsActivity benefitsActivity) {
        return (BenefitsViewModel) benefitsActivity.m22758I0();
    }

    /* renamed from: u1 */
    public static final /* synthetic */ void m13023u1(BenefitsActivity benefitsActivity, Benefit benefit) {
        benefitsActivity.m13017z1(benefit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m13022v1(BenefitsActivity benefitsActivity, ActivityResult activityResult) {
        Intent m41352a;
        Bundle extras;
        BannerActionGotoType bannerActionGotoType;
        Intrinsics.isThisObjectNull(benefitsActivity, "this$0");
        if (activityResult.m41351b() != -1 || (m41352a = activityResult.m41352a()) == null || (extras = m41352a.getExtras()) == null || (bannerActionGotoType = (BannerActionGotoType) extras.getParcelable("EXTRA_FOR_GOTO_RESULT")) == null) {
            return;
        }
        int i = C8946a.f23639a[bannerActionGotoType.ordinal()];
        if (i == 1) {
            PromotionActivity.m23290a(benefitsActivity);
            benefitsActivity.finish();
        } else if (i == 2) {
            ShoppingListActivity.m20275a(benefitsActivity);
        } else if (i == 3) {
            Launchers.m9999c(benefitsActivity, ((BenefitsViewModel) benefitsActivity.m22758I0()).m121A());
            benefitsActivity.finish();
        } else if (i != 4) {
        } else {
            AccountActivityLauncher.m156b(benefitsActivity, ((BenefitsViewModel) benefitsActivity.m22758I0()).m121A());
            benefitsActivity.finish();
        }
    }

    /* renamed from: z1 */
    private final void m13017z1(Benefit benefit) {
        BenefitsDetailsBottomSheetFragment.f23657R0.m12992a(benefit).mo3126x2(m37323P(), "benefits_details_bottom_sheet");
    }

    /* renamed from: D0 */
    protected int mo11827D0() {
        return C2336R.C2337drawable.ic_close;
    }

    /* renamed from: E0 */
    protected Integer m13048E0() {
        return Integer.valueOf((int) C2336R.C2338id.toolbar);
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13042J0() {
        return C6450z.m20906b(BenefitsViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13040K0() {
        return new C8951d();
    }

    /* renamed from: M0 */
    protected boolean m13039M0() {
        return true;
    }

    /* renamed from: S0 */
    protected boolean m13037S0() {
        return true;
    }

    /* renamed from: n */
    public boolean m13031n() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w1 */
    public C8618e mo42216v0() {
        return new C8618e();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_benefit;
    }

    /* renamed from: x1 */
    public final ViewModelFactoryByInjection m13019x1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23634f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y1 */
    public void m13038P0(AbstractC11842k abstractC11842k, BenefitsViewModel benefitsViewModel) {
        Intrinsics.isThisObjectNull(abstractC11842k, "binding");
        Intrinsics.isThisObjectNull(benefitsViewModel, "viewModel");
        m13046F1();
        m13051B1();
        m13052A1();
    }
}
