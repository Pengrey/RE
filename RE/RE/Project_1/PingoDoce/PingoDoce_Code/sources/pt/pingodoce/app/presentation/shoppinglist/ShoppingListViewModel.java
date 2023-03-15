package pt.pingodoce.app.presentation.shoppinglist;

import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.core.content.C0928a;
import androidx.lifecycle.C1430c0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1465n0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.crashlytics.C4181a;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jm.C6537a;
import ke.CoreBaseViewModel;
import kg.InterfaceC6661b;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C6770c;
import kotlinx.coroutines.C6772d;
import mg.AbstractC7356n;
import mg.AbstractC7429u0;
import mg.C7256f1;
import mg.C7310l;
import mg.C7347m1;
import mg.CoachMarkManager;
import mg.StoreManager;
import p070e.C4906j;
import p165ij.SnackBarLiveData;
import p181jd.AbstractC6438m;
import p181jd.C6429c0;
import p181jd.C6447w;
import p181jd.Intrinsics;
import p207kl.C6741t0;
import p259o.InterfaceC7946a;
import p276og.Result;
import p378u5.ResourcesProvider;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p470yf.SnackBarAction;
import p489zc.C13777q;
import p489zc.CollectionsJVM;
import p489zc.Iterables;
import p489zc._Collections;
import p494zh.BaseViewModel;
import p494zh.C13838g2;
import p494zh.C13843h2;
import p494zh.C13885o2;
import p494zh.C13899s0;
import p494zh.C13920x1;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;
import pt.pingodoce.app.data.local.models.products.PriceCalculation;
import pt.pingodoce.app.data.local.models.products.Promotion;
import pt.pingodoce.app.data.local.models.shoppinglist.LiteralProduct;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListCategory;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchCatalogParameters;
import pt.pingodoce.app.data.remote.models.response.CatalogResponse;
import pt.pingodoce.app.data.remote.models.response.Store;
import pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel;
import td.InterfaceC10524i0;
import ug.ShoppingList;

/* renamed from: pt.pingodoce.app.presentation.shoppinglist.h */
/* loaded from: classes2.dex */
public final class ShoppingListViewModel extends BaseViewModel {

    /* renamed from: A */
    private final C1436e0 f24803A;

    /* renamed from: B */
    private final C1430c0 f24804B;

    /* renamed from: C */
    private final C1436e0 f24805C;

    /* renamed from: D */
    private final C1436e0 f24806D;

    /* renamed from: E */
    private final C1436e0 f24807E;

    /* renamed from: F */
    private final C1436e0 f24808F;

    /* renamed from: G */
    private final C1436e0 f24809G;

    /* renamed from: H */
    private final C1436e0 f24810H;

    /* renamed from: I */
    private final C1436e0 f24811I;

    /* renamed from: J */
    private final C1436e0 f24812J;

    /* renamed from: K */
    private final C1436e0 f24813K;

    /* renamed from: L */
    private final C1436e0 f24814L;

    /* renamed from: M */
    private final C1430c0 f24815M;

    /* renamed from: N */
    private final C1436e0 f24816N;

    /* renamed from: O */
    private final LiveData f24817O;

    /* renamed from: P */
    private final C1436e0 f24818P;

    /* renamed from: Q */
    private final C1436e0 f24819Q;

    /* renamed from: R */
    private final C1436e0 f24820R;

    /* renamed from: S */
    private final C1430c0 f24821S;

    /* renamed from: T */
    private final C1436e0 f24822T;

    /* renamed from: U */
    private final LiveData f24823U;

    /* renamed from: V */
    private final C1430c0 f24824V;

    /* renamed from: W */
    private final LiveData f24825W;

    /* renamed from: X */
    private final LiveData f24826X;

    /* renamed from: Y */
    private final LiveData f24827Y;

    /* renamed from: Z */
    private final LiveData f24828Z;

    /* renamed from: a0 */
    private final LiveData f24829a0;

    /* renamed from: b0 */
    private final LiveData f24830b0;

    /* renamed from: c0 */
    private final LiveData f24831c0;

    /* renamed from: d0 */
    private final LiveData f24832d0;

    /* renamed from: e0 */
    private final LiveData f24833e0;

    /* renamed from: f0 */
    private final LiveData f24834f0;

    /* renamed from: g0 */
    private final LiveData f24835g0;

    /* renamed from: h0 */
    private final LiveData f24836h0;

    /* renamed from: i0 */
    private final LiveData f24837i0;

    /* renamed from: j0 */
    private final C1436e0 f24838j0;

    /* renamed from: k0 */
    private final C1436e0 f24839k0;

    /* renamed from: l0 */
    private final C1430c0 f24840l0;

    /* renamed from: m */
    private final C7256f1 f24841m;

    /* renamed from: m0 */
    private final LiveData f24842m0;

    /* renamed from: n */
    private final C7310l f24843n;

    /* renamed from: n0 */
    private final LiveData f24844n0;

    /* renamed from: o */
    private final C7347m1 f24845o;

    /* renamed from: o0 */
    private final LiveData f24846o0;

    /* renamed from: p */
    private final CoachMarkManager f24847p;

    /* renamed from: p0 */
    private final LiveData f24848p0;

    /* renamed from: q */
    private final ShoppingListCategory f24849q;

    /* renamed from: q0 */
    private final LiveData f24850q0;

    /* renamed from: r */
    private final C1436e0 f24851r;

    /* renamed from: r0 */
    private final LiveData f24852r0;

    /* renamed from: s */
    private final LiveData f24853s;

    /* renamed from: s0 */
    private final LiveData f24854s0;

    /* renamed from: t */
    private final C1436e0 f24855t;

    /* renamed from: t0 */
    private final LiveData f24856t0;

    /* renamed from: u */
    private final LiveData f24857u;

    /* renamed from: u0 */
    private final LiveData f24858u0;

    /* renamed from: v */
    private boolean f24859v;

    /* renamed from: v0 */
    private final LiveData f24860v0;

    /* renamed from: w */
    private final InterfaceC6108l f24861w;

    /* renamed from: w0 */
    private final LiveData f24862w0;

    /* renamed from: x */
    private EnumC9455e f24863x;

    /* renamed from: y */
    private final C1436e0 f24864y;

    /* renamed from: z */
    private final C1436e0 f24865z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ShoppingListViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$a */
    /* loaded from: classes2.dex */
    public enum EnumC9451a {
        CLEAR_LIST,
        DELETE_LIST,
        IMPORT,
        ORDER_BY,
        MANUAL_SORT,
        TOGGLE_EDIT_SHOP_MODE,
        ADD_ITEM,
        EDIT_ITEM,
        SCAN_INPUT,
        VOICE_INPUT,
        UNCHECK,
        CARD,
        TAKE_AWAY_ORDER,
        BUY_ONLINE
    }

    /* compiled from: ShoppingListViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$b */
    /* loaded from: classes2.dex */
    public enum EnumC9452b {
        EAN13,
        VOICE
    }

    /* compiled from: ShoppingListViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$c */
    /* loaded from: classes2.dex */
    private static final class C9453c {
        private C9453c() {
        }

        public /* synthetic */ C9453c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ShoppingListViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$d */
    /* loaded from: classes2.dex */
    public enum EnumC9454d {
        EDIT,
        ADD
    }

    /* compiled from: ShoppingListViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$e */
    /* loaded from: classes2.dex */
    public enum EnumC9455e {
        MANUAL,
        PROMOTION,
        CATEGORY
    }

    /* compiled from: ShoppingListViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$f */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C9456f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24866a;

        static {
            int[] iArr = new int[EnumC9455e.values().length];
            iArr[EnumC9455e.CATEGORY.ordinal()] = 1;
            iArr[EnumC9455e.MANUAL.ordinal()] = 2;
            f24866a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel$canShare$1", m20196f = "ShoppingListViewModel.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$g */
    /* loaded from: classes2.dex */
    public static final class C9457g extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24867x;

        C9457g(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9457g(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9457g) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f24867x == 0) {
                C13186n.m1453b(obj);
                return C6755b.m20201a(ShoppingListViewModel.m11098p0(ShoppingListViewModel.this).m18831h());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel$checkout$1", m20196f = "ShoppingListViewModel.kt", m20195l = {608}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$h */
    /* loaded from: classes2.dex */
    public static final class C9458h extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24869x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ShoppingListViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel$checkout$1$1", m20196f = "ShoppingListViewModel.kt", m20195l = {609}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$h$a */
        /* loaded from: classes2.dex */
        public static final class C9459a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f24871x;

            /* renamed from: y */
            final /* synthetic */ ShoppingListViewModel f24872y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9459a(ShoppingListViewModel shoppingListViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f24872y = shoppingListViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C9459a(this.f24872y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C9459a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24871x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7256f1 m11098p0 = ShoppingListViewModel.m11098p0(this.f24872y);
                    this.f24871x = 1;
                    obj = m11098p0.m18830i(this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                AbstractC7356n abstractC7356n = (AbstractC7356n) obj;
                if (abstractC7356n instanceof AbstractC7356n.C7358b) {
                    this.f24872y.m120B(C13838g2.f34946a, ((AbstractC7356n.C7358b) abstractC7356n).m18664a());
                } else if (abstractC7356n instanceof AbstractC7356n.C7357a) {
                    ShoppingListViewModel.m11204D0(this.f24872y, ((AbstractC7356n.C7357a) abstractC7356n).m18665a());
                }
                return C13195u.f34156a;
            }
        }

        C9458h(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9458h(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9458h) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24869x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListViewModel shoppingListViewModel = ShoppingListViewModel.this;
                C9459a c9459a = new C9459a(shoppingListViewModel, null);
                this.f24869x = 1;
                if (ShoppingListViewModel.m11202E0(shoppingListViewModel, true, c9459a, this) == m34636d) {
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
    /* compiled from: ShoppingListViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$i */
    /* loaded from: classes2.dex */
    public static final class C9460i extends AbstractC6438m implements InterfaceC6097a {
        C9460i() {
            super(0);
        }

        /* renamed from: a */
        public final void m11069a() {
            ShoppingListViewModel.m11198G0(ShoppingListViewModel.this, true);
            ShoppingListViewModel.m11098p0(ShoppingListViewModel.this).m18843R();
            ShoppingListViewModel.this.m11162T1();
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m11069a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel$enterStoreMode$1", m20196f = "ShoppingListViewModel.kt", m20195l = {603}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$j */
    /* loaded from: classes2.dex */
    public static final class C9461j extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24874x;

        /* renamed from: z */
        final /* synthetic */ LatLng f24876z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ShoppingListViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel$enterStoreMode$1$1", m20196f = "ShoppingListViewModel.kt", m20195l = {603}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$j$a */
        /* loaded from: classes2.dex */
        public static final class C9462a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f24877x;

            /* renamed from: y */
            final /* synthetic */ ShoppingListViewModel f24878y;

            /* renamed from: z */
            final /* synthetic */ LatLng f24879z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9462a(ShoppingListViewModel shoppingListViewModel, LatLng latLng, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f24878y = shoppingListViewModel;
                this.f24879z = latLng;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C9462a(this.f24878y, this.f24879z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C9462a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24877x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7256f1 m11098p0 = ShoppingListViewModel.m11098p0(this.f24878y);
                    LatLng latLng = this.f24879z;
                    this.f24877x = 1;
                    obj = m11098p0.m18824o(latLng, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9461j(LatLng latLng, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24876z = latLng;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9461j(this.f24876z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9461j) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24874x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListViewModel shoppingListViewModel = ShoppingListViewModel.this;
                C9462a c9462a = new C9462a(shoppingListViewModel, this.f24876z, null);
                this.f24874x = 1;
                if (CoreBaseViewModel.m20383n(shoppingListViewModel, false, c9462a, this, 1, null) == m34636d) {
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
    /* compiled from: ShoppingListViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$k */
    /* loaded from: classes2.dex */
    public static final class C9463k extends AbstractC6438m implements InterfaceC6108l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ShoppingListViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel$onClick$1$1", m20196f = "ShoppingListViewModel.kt", m20195l = {C4906j.f13415H0}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$k$a */
        /* loaded from: classes2.dex */
        public static final class C9464a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f24881x;

            /* renamed from: y */
            final /* synthetic */ ShoppingListViewModel f24882y;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ShoppingListViewModel.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel$onClick$1$1$1", m20196f = "ShoppingListViewModel.kt", m20195l = {C4906j.f13420I0, 127}, m20194m = "invokeSuspend")
            /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$k$a$a */
            /* loaded from: classes2.dex */
            public static final class C9465a extends AbstractC6764l implements InterfaceC6108l {

                /* renamed from: x */
                Object f24883x;

                /* renamed from: y */
                int f24884y;

                /* renamed from: z */
                final /* synthetic */ ShoppingListViewModel f24885z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C9465a(ShoppingListViewModel shoppingListViewModel, InterfaceC1886d interfaceC1886d) {
                    super(1, interfaceC1886d);
                    this.f24885z = shoppingListViewModel;
                }

                public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                    return new C9465a(this.f24885z, interfaceC1886d);
                }

                /* renamed from: d */
                public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                    return ((C9465a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    C1430c0 c1430c0;
                    m34636d = C2116d.m34636d();
                    int i = this.f24884y;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        C7256f1 m11098p0 = ShoppingListViewModel.m11098p0(this.f24885z);
                        this.f24884y = 1;
                        if (m11098p0.m18825n(this) == m34636d) {
                            return m34636d;
                        }
                    } else if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1430c0 = (C1430c0) this.f24883x;
                        C13186n.m1453b(obj);
                        c1430c0.mo166p(obj);
                        this.f24885z.m11162T1();
                        this.f24885z.m11159U1();
                        this.f24885z.m11156V1();
                        return C13195u.f34156a;
                    } else {
                        C13186n.m1453b(obj);
                    }
                    C1430c0 m11085t1 = this.f24885z.m11085t1();
                    C7256f1 m11098p02 = ShoppingListViewModel.m11098p0(this.f24885z);
                    this.f24883x = m11085t1;
                    this.f24884y = 2;
                    Object m18816w = m11098p02.m18816w(this);
                    if (m18816w == m34636d) {
                        return m34636d;
                    }
                    c1430c0 = m11085t1;
                    obj = m18816w;
                    c1430c0.mo166p(obj);
                    this.f24885z.m11162T1();
                    this.f24885z.m11159U1();
                    this.f24885z.m11156V1();
                    return C13195u.f34156a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9464a(ShoppingListViewModel shoppingListViewModel, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f24882y = shoppingListViewModel;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C9464a(this.f24882y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C9464a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24881x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    BaseViewModel.m111K(this.f24882y, true, false, 2, null);
                    ShoppingListViewModel shoppingListViewModel = this.f24882y;
                    C9465a c9465a = new C9465a(shoppingListViewModel, null);
                    this.f24881x = 1;
                    if (CoreBaseViewModel.m20383n(shoppingListViewModel, false, c9465a, this, 1, null) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                BaseViewModel.m111K(this.f24882y, false, false, 2, null);
                return C13195u.f34156a;
            }
        }

        /* compiled from: ShoppingListViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$k$b */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C9466b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f24886a;

            static {
                int[] iArr = new int[EnumC9451a.values().length];
                iArr[EnumC9451a.TOGGLE_EDIT_SHOP_MODE.ordinal()] = 1;
                iArr[EnumC9451a.ADD_ITEM.ordinal()] = 2;
                iArr[EnumC9451a.EDIT_ITEM.ordinal()] = 3;
                iArr[EnumC9451a.CLEAR_LIST.ordinal()] = 4;
                iArr[EnumC9451a.DELETE_LIST.ordinal()] = 5;
                iArr[EnumC9451a.IMPORT.ordinal()] = 6;
                iArr[EnumC9451a.SCAN_INPUT.ordinal()] = 7;
                iArr[EnumC9451a.VOICE_INPUT.ordinal()] = 8;
                iArr[EnumC9451a.UNCHECK.ordinal()] = 9;
                iArr[EnumC9451a.CARD.ordinal()] = 10;
                iArr[EnumC9451a.ORDER_BY.ordinal()] = 11;
                iArr[EnumC9451a.MANUAL_SORT.ordinal()] = 12;
                iArr[EnumC9451a.TAKE_AWAY_ORDER.ordinal()] = 13;
                iArr[EnumC9451a.BUY_ONLINE.ordinal()] = 14;
                f24886a = iArr;
            }
        }

        C9463k() {
            super(1);
        }

        /* renamed from: a */
        public final void m11066a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "type");
            ShoppingListViewModel.m11198G0(ShoppingListViewModel.this, false);
            switch (C9466b.f24886a[((EnumC9451a) c13182l.m1460c()).ordinal()]) {
                case 1:
                    ShoppingListViewModel.m11210A0(ShoppingListViewModel.this).mo166p(C13195u.f34156a);
                    C1436e0 m11084u0 = ShoppingListViewModel.m11084u0(ShoppingListViewModel.this);
                    T mo172f = ShoppingListViewModel.m11084u0(ShoppingListViewModel.this).mo172f();
                    Intrinsics.ifNullDoSomething(mo172f);
                    m11084u0.mo166p(Boolean.valueOf(!((Boolean) mo172f).booleanValue()));
                    return;
                case 2:
                    if (c13182l.m1459d() instanceof String) {
                        ShoppingListViewModel.m11098p0(ShoppingListViewModel.this).m18833f(new LiteralProduct(null, 0L, ShoppingListViewModel.m11104n0(ShoppingListViewModel.this), (String) c13182l.m1459d(), 0, false, null, 0, 0, false, 1011, null));
                        ShoppingListViewModel.this.m11162T1();
                        ShoppingListViewModel.m11076y0(ShoppingListViewModel.this).mo169m(C13195u.f34156a);
                        return;
                    }
                    return;
                case 3:
                    if (c13182l.m1459d() instanceof ShoppingListProduct) {
                        ShoppingListViewModel.m11098p0(ShoppingListViewModel.this).m18842S((ShoppingListProduct) c13182l.m1459d());
                        ShoppingListViewModel.m11208B0(ShoppingListViewModel.this).mo166p(EnumC9454d.ADD);
                        ShoppingListViewModel.this.m11162T1();
                        return;
                    }
                    return;
                case 4:
                    ShoppingListViewModel.m11098p0(ShoppingListViewModel.this).m18828k();
                    ShoppingListViewModel.this.m11162T1();
                    return;
                case 5:
                    C6772d.m20158d(C1473p0.m36987a(ShoppingListViewModel.this), null, null, new C9464a(ShoppingListViewModel.this, null), 3, null);
                    return;
                case 6:
                    BaseViewModel.m119C(ShoppingListViewModel.this, C13920x1.f35041a, null, 2, null);
                    return;
                case 7:
                    ShoppingListViewModel.m11092r0(ShoppingListViewModel.this).mo166p(EnumC9452b.EAN13);
                    return;
                case 8:
                    ShoppingListViewModel.m11092r0(ShoppingListViewModel.this).mo166p(EnumC9452b.VOICE);
                    return;
                case 9:
                    Integer num = (Integer) ShoppingListViewModel.m11082v0(ShoppingListViewModel.this).mo172f();
                    if (num == null) {
                        num = 0;
                    }
                    if (num.intValue() > 0) {
                        ShoppingListViewModel.m11098p0(ShoppingListViewModel.this).m18844Q();
                        ShoppingListViewModel.this.m11162T1();
                        return;
                    }
                    return;
                case 10:
                    BaseViewModel.m119C(ShoppingListViewModel.this, C13899s0.f35020a, null, 2, null);
                    return;
                case 11:
                    if (c13182l.m1459d() instanceof EnumC9455e) {
                        ShoppingListViewModel.m11200F0(ShoppingListViewModel.this, (EnumC9455e) c13182l.m1459d());
                        ShoppingListViewModel.m11086t0(ShoppingListViewModel.this).mo166p(ShoppingListViewModel.m11107m0(ShoppingListViewModel.this));
                        ShoppingListViewModel.this.m11162T1();
                        return;
                    }
                    return;
                case 12:
                    BaseViewModel.m119C(ShoppingListViewModel.this, C13843h2.f34951a, null, 2, null);
                    return;
                case 13:
                    TakeAwayOrder takeAwayOrder = (TakeAwayOrder) ShoppingListViewModel.m11074z0(ShoppingListViewModel.this).mo172f();
                    if (takeAwayOrder != null) {
                        ShoppingListViewModel.this.m120B(C13885o2.f35007a, takeAwayOrder);
                        return;
                    }
                    return;
                case 14:
                    ShoppingListViewModel.m11089s0(ShoppingListViewModel.this).mo166p(C13195u.f34156a);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m11066a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel$refreshShoppingListActiveUsers$1", m20196f = "ShoppingListViewModel.kt", m20195l = {329}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$l */
    /* loaded from: classes2.dex */
    public static final class C9467l extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        Object f24887x;

        /* renamed from: y */
        int f24888y;

        C9467l(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9467l(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9467l) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            C1436e0 c1436e0;
            m34636d = C2116d.m34636d();
            int i = this.f24888y;
            if (i == 0) {
                C13186n.m1453b(obj);
                C1436e0 m11095q0 = ShoppingListViewModel.m11095q0(ShoppingListViewModel.this);
                C7256f1 m11098p0 = ShoppingListViewModel.m11098p0(ShoppingListViewModel.this);
                this.f24887x = m11095q0;
                this.f24888y = 1;
                Object m18819t = m11098p0.m18819t(this);
                if (m18819t == m34636d) {
                    return m34636d;
                }
                c1436e0 = m11095q0;
                obj = m18819t;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                c1436e0 = (C1436e0) this.f24887x;
                C13186n.m1453b(obj);
            }
            c1436e0.mo166p(ShoppingList.m6794a((List) obj));
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel$refreshShoppingListsCount$1", m20196f = "ShoppingListViewModel.kt", m20195l = {335}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$m */
    /* loaded from: classes2.dex */
    public static final class C9468m extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24890x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ShoppingListViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel$refreshShoppingListsCount$1$1", m20196f = "ShoppingListViewModel.kt", m20195l = {336}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$m$a */
        /* loaded from: classes2.dex */
        public static final class C9469a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            Object f24892x;

            /* renamed from: y */
            int f24893y;

            /* renamed from: z */
            final /* synthetic */ ShoppingListViewModel f24894z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9469a(ShoppingListViewModel shoppingListViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f24894z = shoppingListViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C9469a(this.f24894z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C9469a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                C1436e0 c1436e0;
                m34636d = C2116d.m34636d();
                int i = this.f24893y;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C1436e0 m11078x0 = ShoppingListViewModel.m11078x0(this.f24894z);
                    C7256f1 m11098p0 = ShoppingListViewModel.m11098p0(this.f24894z);
                    this.f24892x = m11078x0;
                    this.f24893y = 1;
                    Object m18860A = m11098p0.m18860A(this);
                    if (m18860A == m34636d) {
                        return m34636d;
                    }
                    c1436e0 = m11078x0;
                    obj = m18860A;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    c1436e0 = (C1436e0) this.f24892x;
                    C13186n.m1453b(obj);
                }
                c1436e0.mo166p(obj);
                return C13195u.f34156a;
            }
        }

        C9468m(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9468m(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9468m) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24890x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListViewModel shoppingListViewModel = ShoppingListViewModel.this;
                C9469a c9469a = new C9469a(shoppingListViewModel, null);
                this.f24890x = 1;
                if (CoreBaseViewModel.m20383n(shoppingListViewModel, false, c9469a, this, 1, null) == m34636d) {
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
    /* compiled from: ShoppingListViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel$searchEan$1", m20196f = "ShoppingListViewModel.kt", m20195l = {436}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$n */
    /* loaded from: classes2.dex */
    public static final class C9470n extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24895x;

        /* renamed from: z */
        final /* synthetic */ String f24897z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ShoppingListViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel$searchEan$1$1", m20196f = "ShoppingListViewModel.kt", m20195l = {437}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$n$a */
        /* loaded from: classes2.dex */
        public static final class C9471a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f24898x;

            /* renamed from: y */
            final /* synthetic */ ShoppingListViewModel f24899y;

            /* renamed from: z */
            final /* synthetic */ String f24900z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9471a(ShoppingListViewModel shoppingListViewModel, String str, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f24899y = shoppingListViewModel;
                this.f24900z = str;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C9471a(this.f24899y, this.f24900z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C9471a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                boolean z;
                Object m18720w;
                String m14465b;
                String m14462e;
                String m14463d;
                String m14456m;
                m34636d = C2116d.m34636d();
                int i = this.f24898x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7310l m11110l0 = ShoppingListViewModel.m11110l0(this.f24899y);
                    SearchCatalogParameters searchCatalogParameters = new SearchCatalogParameters(0, C6755b.m20198d(Long.parseLong(this.f24900z)), null, null, null, null, null, false, null, null, null, null, null, null, null, 0, 0, false, 262141, null);
                    this.f24898x = 1;
                    z = false;
                    m18720w = m11110l0.m18720w(searchCatalogParameters, false, this);
                    if (m18720w == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                    m18720w = obj;
                    z = false;
                }
                Result result = (Result) m18720w;
                if (result instanceof Result.C8078c) {
                    Result.C8078c c8078c = (Result.C8078c) result;
                    CatalogProduct catalogProduct = (CatalogProduct) C13777q.m254N(((CatalogResponse) c8078c.m16962b()).m13884b());
                    if (catalogProduct == null) {
                        ShoppingListViewModel shoppingListViewModel = this.f24899y;
                        String string = ShoppingListViewModel.m11101o0(shoppingListViewModel).m6899a().getString(C2336R.string.lbl_product_not_found);
                        Intrinsics.checkIfNull(string, "ctx.getString(id)");
                        ShoppingListViewModel.m11206C0(shoppingListViewModel, string);
                    } else {
                        if (!ShoppingListViewModel.m11098p0(this.f24899y).m18855F(catalogProduct.m14502t())) {
                            ShoppingListViewModel.m11098p0(this.f24899y).m18834e(((CatalogResponse) c8078c.m16962b()).m13885a());
                        }
                        Promotion m14512e = catalogProduct.m14512e();
                        C7256f1 m11098p0 = ShoppingListViewModel.m11098p0(this.f24899y);
                        String m14499y = catalogProduct.m14499y();
                        ShoppingListCategory m18858C = ShoppingListViewModel.m11098p0(this.f24899y).m18858C(catalogProduct.m14502t());
                        if (m18858C == null) {
                            m18858C = new ShoppingListCategory(null, null, catalogProduct.m14502t(), 3, null);
                        }
                        ShoppingListCategory shoppingListCategory = m18858C;
                        String m14540E = catalogProduct.m14540E();
                        ShoppingListProduct m18815x = ShoppingListViewModel.m11098p0(this.f24899y).m18815x(catalogProduct.m14499y());
                        m11098p0.m18833f(new ShoppingListProduct(m14499y, 0L, shoppingListCategory, m14540E, m18815x != null ? m18815x.m14327s() : 1, false, catalogProduct.m14541D(), (m14512e == null || (m14456m = m14512e.m14456m()) == null) ? BuildConfig.VERSION_NAME : m14456m, (m14512e == null || (m14463d = m14512e.m14463d()) == null) ? BuildConfig.VERSION_NAME : m14463d, (m14512e == null || (m14462e = m14512e.m14462e()) == null) ? BuildConfig.VERSION_NAME : m14462e, m14512e != null ? m14512e.m14455n() : z, (m14512e == null || (m14465b = m14512e.m14465b()) == null) ? BuildConfig.VERSION_NAME : m14465b, catalogProduct.m14520Y(), catalogProduct.m14520Y(), null, 0, 0, false, 245794, null));
                        this.f24899y.m11162T1();
                    }
                } else {
                    boolean z2 = result instanceof Result.C8077b;
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9470n(String str, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24897z = str;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9470n(this.f24897z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9470n) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24895x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListViewModel shoppingListViewModel = ShoppingListViewModel.this;
                C9471a c9471a = new C9471a(shoppingListViewModel, this.f24897z, null);
                this.f24895x = 1;
                if (ShoppingListViewModel.m11202E0(shoppingListViewModel, true, c9471a, this) == m34636d) {
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

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$o */
    /* loaded from: classes2.dex */
    public static final class C9472o<I, O> implements InterfaceC7946a {

        /* renamed from: a */
        final /* synthetic */ ResourcesProvider f24901a;

        public C9472o(ResourcesProvider resourcesProvider) {
            this.f24901a = resourcesProvider;
        }

        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            String m13710h;
            Store store = (Store) obj;
            if (store == null || (m13710h = store.m13710h()) == null) {
                String string = this.f24901a.m6899a().getString(C2336R.string.lbl_store_default_name);
                Intrinsics.checkIfNull(string, "ctx.getString(id)");
                return string;
            }
            return m13710h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel", m20196f = "ShoppingListViewModel.kt", m20195l = {555}, m20194m = "syncList")
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$p */
    /* loaded from: classes2.dex */
    public static final class C9473p extends AbstractC6757d {

        /* renamed from: w */
        Object f24902w;

        /* renamed from: x */
        /* synthetic */ Object f24903x;

        /* renamed from: z */
        int f24905z;

        C9473p(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f24903x = obj;
            this.f24905z |= Integer.MIN_VALUE;
            return ShoppingListViewModel.this.m11132d2(false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel$syncList$2", m20196f = "ShoppingListViewModel.kt", m20195l = {556, 562, 563}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$q */
    /* loaded from: classes2.dex */
    public static final class C9474q extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ boolean f24906A;

        /* renamed from: x */
        Object f24907x;

        /* renamed from: y */
        int f24908y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9474q(boolean z, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f24906A = z;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C9474q(this.f24906A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C9474q) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 257
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel.C9474q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel$updateItemPriceWithPromotion$2", m20196f = "ShoppingListViewModel.kt", m20195l = {489}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$r */
    /* loaded from: classes2.dex */
    public static final class C9475r extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24910x;

        /* renamed from: z */
        final /* synthetic */ ShoppingListProduct f24912z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ShoppingListViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel$updateItemPriceWithPromotion$2$1", m20196f = "ShoppingListViewModel.kt", m20195l = {490}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.shoppinglist.h$r$a */
        /* loaded from: classes2.dex */
        public static final class C9476a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f24913x;

            /* renamed from: y */
            final /* synthetic */ ShoppingListViewModel f24914y;

            /* renamed from: z */
            final /* synthetic */ ShoppingListProduct f24915z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9476a(ShoppingListViewModel shoppingListViewModel, ShoppingListProduct shoppingListProduct, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f24914y = shoppingListViewModel;
                this.f24915z = shoppingListProduct;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C9476a(this.f24914y, this.f24915z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C9476a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                List m202b;
                m34636d = C2116d.m34636d();
                int i = this.f24913x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7256f1 m11098p0 = ShoppingListViewModel.m11098p0(this.f24914y);
                    m202b = CollectionsJVM.m202b(new PriceCalculation(this.f24915z));
                    this.f24913x = 1;
                    obj = m11098p0.m18832g(m202b, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                AbstractC7429u0 abstractC7429u0 = (AbstractC7429u0) obj;
                if (abstractC7429u0 instanceof AbstractC7429u0.C7431b) {
                    ShoppingListViewModel.m11098p0(this.f24914y).m18841T(((AbstractC7429u0.C7431b) abstractC7429u0).m18460a());
                    this.f24914y.m11162T1();
                } else if (abstractC7429u0 instanceof AbstractC7429u0.C7430a) {
                    ShoppingListViewModel shoppingListViewModel = this.f24914y;
                    ShoppingListProduct m14340a = this.f24915z.m14340a();
                    m14340a.m14342L(m14340a.m14322z());
                    shoppingListViewModel.m11108l2(m14340a);
                    String str = "Failed to calculate promotion prices: " + ((AbstractC7429u0.C7430a) abstractC7429u0).m18461a();
                    C4181a.m28418a().m28416c(str);
                    C6537a.m20675d(str, new Object[0]);
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9475r(ShoppingListProduct shoppingListProduct, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24912z = shoppingListProduct;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9475r(this.f24912z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9475r) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24910x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListViewModel shoppingListViewModel = ShoppingListViewModel.this;
                C9476a c9476a = new C9476a(shoppingListViewModel, this.f24912z, null);
                this.f24910x = 1;
                if (CoreBaseViewModel.m20383n(shoppingListViewModel, false, c9476a, this, 1, null) == m34636d) {
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

    static {
        new C9453c(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListViewModel(C1459l0 c1459l0, final ResourcesProvider resourcesProvider, C7256f1 c7256f1, C7310l c7310l, C7347m1 c7347m1, CoachMarkManager coachMarkManager, StoreManager storeManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7256f1, "shoppingListManager");
        Intrinsics.isThisObjectNull(c7310l, "catalogManager");
        Intrinsics.isThisObjectNull(c7347m1, "takeAwayManager");
        Intrinsics.isThisObjectNull(coachMarkManager, "coachMarkManager");
        Intrinsics.isThisObjectNull(storeManager, "storeManager");
        this.f24841m = c7256f1;
        this.f24843n = c7310l;
        this.f24845o = c7347m1;
        this.f24847p = coachMarkManager;
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_default_product_category);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        TypedValue typedValue = new TypedValue();
        new ContextThemeWrapper(resourcesProvider.m6899a(), 2131951714).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue, true);
        String hexString = Integer.toHexString(C0928a.m39113d(resourcesProvider.m6899a(), typedValue.resourceId));
        Intrinsics.checkIfNull(hexString, "toHexString(\n           …y\n            )\n        )");
        Locale locale = Locale.getDefault();
        Intrinsics.checkIfNull(locale, "getDefault()");
        String lowerCase = hexString.toLowerCase(locale);
        Intrinsics.checkIfNull(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        this.f24849q = new ShoppingListCategory(string, "#" + lowerCase, 0, 4, null);
        C1436e0 c1436e0 = new C1436e0();
        this.f24851r = c1436e0;
        this.f24853s = c1436e0;
        C1436e0 c1436e02 = new C1436e0();
        this.f24855t = c1436e02;
        this.f24857u = c1436e02;
        this.f24861w = OperatorExtensions.m35177d(700L, C1473p0.m36987a(this), new C9463k());
        this.f24863x = EnumC9455e.MANUAL;
        C1436e0 c1436e03 = new C1436e0();
        this.f24864y = c1436e03;
        EnumC9454d enumC9454d = EnumC9454d.ADD;
        C1436e0 m37003d = c1459l0.m37003d("_updateInput", enumC9454d);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData(…eInput\", InputAction.ADD)");
        this.f24865z = m37003d;
        C1436e0 c1436e04 = new C1436e0();
        this.f24803A = c1436e04;
        C1430c0 c1430c0 = new C1430c0();
        this.f24804B = c1430c0;
        C1436e0 m37003d2 = c1459l0.m37003d("_listsCount", 1);
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData(\"_listsCount\", 1)");
        this.f24805C = m37003d2;
        C1436e0 m37003d3 = c1459l0.m37003d("_hasTakeAwayOrder", Boolean.valueOf(!c7347m1.m18680l().isEmpty()));
        Intrinsics.checkIfNull(m37003d3, "stateHandle.getLiveData(…ders().isNotEmpty()\n    )");
        this.f24806D = m37003d3;
        C1436e0 c1436e05 = new C1436e0(C13777q.m254N(c7347m1.m18680l()));
        this.f24807E = c1436e05;
        C1436e0 m37003d4 = c1459l0.m37003d("_itemCount", 0);
        Intrinsics.checkIfNull(m37003d4, "stateHandle.getLiveData(\"_itemCount\", 0)");
        this.f24808F = m37003d4;
        C1436e0 m37003d5 = c1459l0.m37003d("_itemCheckedCount", 0);
        Intrinsics.checkIfNull(m37003d5, "stateHandle.getLiveData(\"_itemCheckedCount\", 0)");
        this.f24809G = m37003d5;
        C1436e0 m37003d6 = c1459l0.m37003d("_toggleStartAnchorPercent", Float.valueOf(0.0f));
        Intrinsics.checkIfNull(m37003d6, "stateHandle.getLiveData(…eStartAnchorPercent\", 0f)");
        this.f24810H = m37003d6;
        C1436e0 m37003d7 = c1459l0.m37003d("_toggleEndAnchorPercent", Float.valueOf(0.5f));
        Intrinsics.checkIfNull(m37003d7, "stateHandle.getLiveData(…eEndAnchorPercent\", 0.5f)");
        this.f24811I = m37003d7;
        C1436e0 c1436e06 = new C1436e0();
        this.f24812J = c1436e06;
        Boolean bool = Boolean.TRUE;
        C1436e0 m37003d8 = c1459l0.m37003d("_isShoppingListModeEdit", bool);
        Intrinsics.checkIfNull(m37003d8, "stateHandle.getLiveData(…ppingListModeEdit\", true)");
        this.f24813K = m37003d8;
        C1436e0 c1436e07 = new C1436e0();
        this.f24814L = c1436e07;
        C1430c0 c1430c02 = new C1430c0();
        this.f24815M = c1430c02;
        C1436e0 m37003d9 = c1459l0.m37003d("_inputActionButtonEnable", bool);
        Intrinsics.checkIfNull(m37003d9, "stateHandle.getLiveData(…ctionButtonEnable\", true)");
        this.f24816N = m37003d9;
        LiveData m36993a = C1465n0.m36993a(c1436e03, new InterfaceC7946a() { // from class: kl.v0
            @Override // p259o.InterfaceC7946a
            /* renamed from: a */
            public final Object mo37540b(Object obj) {
                List m10591g0;
                m10591g0 = ShoppingListViewModel.m11125g0(ShoppingListViewModel.this, (C13195u) obj);
                return m10591g0;
            }
        });
        Intrinsics.checkIfNull(m36993a, "map(_updateList) {\n     …)\n            }\n        }");
        this.f24817O = m36993a;
        C1436e0 c1436e08 = new C1436e0(this.f24863x);
        this.f24818P = c1436e08;
        C1436e0 c1436e09 = new C1436e0();
        this.f24819Q = c1436e09;
        C1436e0 m37003d10 = c1459l0.m37003d("_lastSync", c7256f1.m18813z());
        Intrinsics.checkIfNull(m37003d10, "stateHandle.getLiveData<…anager.getLastSyncDate())");
        this.f24820R = m37003d10;
        C1430c0 c1430c03 = new C1430c0();
        this.f24821S = c1430c03;
        C1436e0 c1436e010 = new C1436e0();
        this.f24822T = c1436e010;
        this.f24823U = c1436e04;
        this.f24824V = c1430c0;
        LiveData m106t = m106t(storeManager.m18757j());
        this.f24825W = m106t;
        LiveData m36993a2 = C1465n0.m36993a(m106t, new C9472o(resourcesProvider));
        Intrinsics.checkIfNull(m36993a2, "Transformations.map(this) { transform(it) }");
        this.f24826X = m36993a2;
        this.f24827Y = m37003d3;
        this.f24828Z = c1436e05;
        this.f24829a0 = m37003d2;
        this.f24830b0 = m37003d4;
        this.f24831c0 = m37003d5;
        this.f24832d0 = m37003d6;
        this.f24833e0 = m37003d7;
        this.f24834f0 = c1436e06;
        this.f24835g0 = m37003d8;
        this.f24836h0 = m106t(coachMarkManager.m18612l());
        LiveData m36993a3 = C1465n0.m36993a(m37003d, new InterfaceC7946a() { // from class: pt.pingodoce.app.presentation.shoppinglist.e
            @Override // p259o.InterfaceC7946a
            /* renamed from: a */
            public final Object mo37540b(Object obj) {
                String m10640P1;
                m10640P1 = ShoppingListViewModel.m11174P1(ResourcesProvider.this, (ShoppingListViewModel.EnumC9454d) obj);
                return m10640P1;
            }
        });
        Intrinsics.checkIfNull(m36993a3, "map(_updateInput) { acti….string.hint_edit_item) }");
        this.f24837i0 = m36993a3;
        C1436e0 m37003d11 = c1459l0.m37003d("itemQuery", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d11, "stateHandle.getLiveData(\"itemQuery\", \"\")");
        this.f24838j0 = m37003d11;
        this.f24839k0 = c1436e07;
        this.f24840l0 = c1430c02;
        this.f24842m0 = m37003d9;
        LiveData m36993a4 = C1465n0.m36993a(m37003d, new InterfaceC7946a() { // from class: pt.pingodoce.app.presentation.shoppinglist.d
            @Override // p259o.InterfaceC7946a
            /* renamed from: a */
            public final Object mo37540b(Object obj) {
                Drawable m10659I1;
                m10659I1 = ShoppingListViewModel.m11193I1(ResourcesProvider.this, (ShoppingListViewModel.EnumC9454d) obj);
                return m10659I1;
            }
        });
        Intrinsics.checkIfNull(m36993a4, "map(_updateInput) { acti…    ) else null\n        }");
        this.f24844n0 = m36993a4;
        LiveData m36993a5 = C1465n0.m36993a(m37003d, new InterfaceC7946a() { // from class: pt.pingodoce.app.presentation.shoppinglist.f
            @Override // p259o.InterfaceC7946a
            /* renamed from: a */
            public final Object mo37540b(Object obj) {
                String m10657J1;
                m10657J1 = ShoppingListViewModel.m11191J1(ResourcesProvider.this, (ShoppingListViewModel.EnumC9454d) obj);
                return m10657J1;
            }
        });
        Intrinsics.checkIfNull(m36993a5, "map(_updateInput) { acti…else R.string.btn_save) }");
        this.f24846o0 = m36993a5;
        LiveData m36993a6 = C1465n0.m36993a(m37003d, C9450g.f24802a);
        Intrinsics.checkIfNull(m36993a6, "map(_updateInput) { acti…ion == InputAction.EDIT }");
        this.f24848p0 = m36993a6;
        LiveData m36993a7 = C1465n0.m36993a(m36993a, new InterfaceC7946a() { // from class: kl.u0
            @Override // p259o.InterfaceC7946a
            /* renamed from: a */
            public final Object mo37540b(Object obj) {
                List m10620W0;
                m10620W0 = ShoppingListViewModel.m11154W0(ShoppingListViewModel.this, (List) obj);
                return m10620W0;
            }
        });
        Intrinsics.checkIfNull(m36993a7, "map(_fields) {\n        u…      return@map it\n    }");
        this.f24850q0 = m36993a7;
        this.f24852r0 = c1436e08;
        this.f24854s0 = c1436e09;
        this.f24856t0 = m37003d10;
        this.f24858u0 = m106t(c7256f1.m18854G());
        this.f24860v0 = c1430c03;
        this.f24862w0 = c1436e010;
        c1430c02.m37055q(m37003d11, new InterfaceC1440f0() { // from class: kl.r0
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ShoppingListViewModel.m11113k0(ShoppingListViewModel.this, (String) obj);
            }
        });
        c1430c03.m37055q(m37003d4, new InterfaceC1440f0() { // from class: kl.q0
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ShoppingListViewModel.m11119i0(ShoppingListViewModel.this, (Integer) obj);
            }
        });
        c1430c0.m37055q(c1430c0, new InterfaceC1440f0() { // from class: kl.s0
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ShoppingListViewModel.m11116j0(ShoppingListViewModel.this, (String) obj);
            }
        });
        m37003d.mo166p(enumC9454d);
        m11156V1();
    }

    /* renamed from: A0 */
    public static final /* synthetic */ C1436e0 m11210A0(ShoppingListViewModel shoppingListViewModel) {
        return shoppingListViewModel.f24812J;
    }

    /* renamed from: B0 */
    public static final /* synthetic */ C1436e0 m11208B0(ShoppingListViewModel shoppingListViewModel) {
        return shoppingListViewModel.f24865z;
    }

    /* renamed from: C0 */
    public static final /* synthetic */ void m11206C0(ShoppingListViewModel shoppingListViewModel, String str) {
        shoppingListViewModel.m110k(str);
    }

    /* renamed from: D0 */
    public static final /* synthetic */ void m11204D0(ShoppingListViewModel shoppingListViewModel, Throwable th2) {
        shoppingListViewModel.m109l(th2);
    }

    /* renamed from: E0 */
    public static final /* synthetic */ Object m11202E0(ShoppingListViewModel shoppingListViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return shoppingListViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: F0 */
    public static final /* synthetic */ void m11200F0(ShoppingListViewModel shoppingListViewModel, EnumC9455e enumC9455e) {
        shoppingListViewModel.f24863x = enumC9455e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m11199F1(ShoppingListViewModel shoppingListViewModel, View view) {
        Intrinsics.isThisObjectNull(shoppingListViewModel, "this$0");
        shoppingListViewModel.f24861w.mo9587d(new C13182l(EnumC9451a.IMPORT, C13195u.f34156a));
    }

    /* renamed from: G0 */
    public static final /* synthetic */ void m11198G0(ShoppingListViewModel shoppingListViewModel, boolean z) {
        shoppingListViewModel.f24859v = z;
    }

    /* renamed from: H0 */
    public static final /* synthetic */ void m11196H0(ShoppingListViewModel shoppingListViewModel, boolean z, boolean z2) {
        shoppingListViewModel.m112J(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m11195H1(ShoppingListViewModel shoppingListViewModel, View view) {
        Intrinsics.isThisObjectNull(shoppingListViewModel, "this$0");
        String str = (String) shoppingListViewModel.f24838j0.mo172f();
        if (str != null) {
            if (str.length() > 0) {
                EnumC9454d enumC9454d = (EnumC9454d) shoppingListViewModel.f24865z.mo172f();
                if (enumC9454d == null) {
                    enumC9454d = EnumC9454d.ADD;
                }
                if (enumC9454d == EnumC9454d.EDIT) {
                    ShoppingListProduct shoppingListProduct = (ShoppingListProduct) shoppingListViewModel.m20389h().m37005b("_itemEditing");
                    if (shoppingListProduct != null) {
                        InterfaceC6108l interfaceC6108l = shoppingListViewModel.f24861w;
                        EnumC9451a enumC9451a = EnumC9451a.EDIT_ITEM;
                        ShoppingListProduct m14340a = shoppingListProduct.m14340a();
                        String str2 = (String) shoppingListViewModel.f24838j0.mo172f();
                        if (str2 == null) {
                            str2 = BuildConfig.VERSION_NAME;
                        } else {
                            Intrinsics.checkIfNull(str2, "itemQuery.value ?: \"\"");
                        }
                        m14340a.m14343K(str2);
                        C13195u c13195u = C13195u.f34156a;
                        interfaceC6108l.mo9587d(new C13182l(enumC9451a, m14340a));
                    }
                } else {
                    shoppingListViewModel.f24861w.mo9587d(new C13182l(EnumC9451a.ADD_ITEM, str));
                }
                shoppingListViewModel.f24838j0.mo166p(BuildConfig.VERSION_NAME);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I1 */
    public static final Drawable m11193I1(ResourcesProvider resourcesProvider, EnumC9454d enumC9454d) {
        Intrinsics.isThisObjectNull(resourcesProvider, "$resourcesProvider");
        if (enumC9454d == EnumC9454d.ADD) {
            return C0928a.m39111f(resourcesProvider.m6899a(), C2336R.C2337drawable.ic_add);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J0 */
    public static final void m11192J0(ShoppingListViewModel shoppingListViewModel, View view) {
        Intrinsics.isThisObjectNull(shoppingListViewModel, "this$0");
        shoppingListViewModel.f24861w.mo9587d(new C13182l(EnumC9451a.BUY_ONLINE, C13195u.f34156a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J1 */
    public static final String m11191J1(ResourcesProvider resourcesProvider, EnumC9454d enumC9454d) {
        Intrinsics.isThisObjectNull(resourcesProvider, "$resourcesProvider");
        String string = resourcesProvider.m6899a().getString(enumC9454d == EnumC9454d.ADD ? C2336R.string.btn_add : C2336R.string.btn_save);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        return string;
    }

    /* renamed from: L */
    public static /* synthetic */ List m11188L(ShoppingListViewModel shoppingListViewModel, C13195u c13195u) {
        return m11125g0(shoppingListViewModel, c13195u);
    }

    /* renamed from: M */
    public static /* synthetic */ Drawable m11185M(ResourcesProvider resourcesProvider, EnumC9454d enumC9454d) {
        return m11193I1(resourcesProvider, enumC9454d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public static final void m11184M0(ShoppingListViewModel shoppingListViewModel, View view) {
        Intrinsics.isThisObjectNull(shoppingListViewModel, "this$0");
        shoppingListViewModel.f24865z.mo166p(EnumC9454d.ADD);
        shoppingListViewModel.f24816N.mo166p(Boolean.TRUE);
        shoppingListViewModel.f24838j0.mo166p(BuildConfig.VERSION_NAME);
    }

    /* renamed from: N */
    public static /* synthetic */ void m11182N(ShoppingListViewModel shoppingListViewModel, View view) {
        m11184M0(shoppingListViewModel, view);
    }

    /* renamed from: N1 */
    private static final Boolean m11180N1(EnumC9454d enumC9454d) {
        return Boolean.valueOf(enumC9454d == EnumC9454d.EDIT);
    }

    /* renamed from: O */
    public static /* synthetic */ void m11179O(ShoppingListViewModel shoppingListViewModel, View view) {
        m11168R1(shoppingListViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O0 */
    public static final void m11178O0(ShoppingListViewModel shoppingListViewModel, View view) {
        Intrinsics.isThisObjectNull(shoppingListViewModel, "this$0");
        shoppingListViewModel.f24861w.mo9587d(new C13182l(EnumC9451a.CARD, C13195u.f34156a));
    }

    /* renamed from: P */
    public static /* synthetic */ void m11176P(ShoppingListViewModel shoppingListViewModel, View view) {
        m11147Y1(shoppingListViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P1 */
    public static final String m11174P1(ResourcesProvider resourcesProvider, EnumC9454d enumC9454d) {
        Intrinsics.isThisObjectNull(resourcesProvider, "$resourcesProvider");
        String string = resourcesProvider.m6899a().getString(enumC9454d == EnumC9454d.ADD ? C2336R.string.hint_add_item : C2336R.string.hint_edit_item);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        return string;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m11173Q(ShoppingListViewModel shoppingListViewModel, String str) {
        m11113k0(shoppingListViewModel, str);
    }

    /* renamed from: R */
    public static /* synthetic */ void m11170R(ShoppingListViewModel shoppingListViewModel, View view) {
        m11199F1(shoppingListViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R1 */
    public static final void m11168R1(ShoppingListViewModel shoppingListViewModel, View view) {
        Intrinsics.isThisObjectNull(shoppingListViewModel, "this$0");
        shoppingListViewModel.f24861w.mo9587d(new C13182l(EnumC9451a.MANUAL_SORT, C13195u.f34156a));
    }

    /* renamed from: S */
    public static /* synthetic */ void m11167S(ShoppingListViewModel shoppingListViewModel, View view) {
        m11195H1(shoppingListViewModel, view);
    }

    /* renamed from: S0 */
    private final void m11166S0(int i, boolean z) {
        try {
            List list = (List) this.f24850q0.mo172f();
            InterfaceC6661b interfaceC6661b = list != null ? (InterfaceC6661b) list.get(i) : null;
            if (interfaceC6661b == null || !(interfaceC6661b instanceof ShoppingListProduct)) {
                return;
            }
            this.f24841m.m18852I((ShoppingListProduct) interfaceC6661b, z);
            m11162T1();
            if (z) {
                SnackBarLiveData snackBarLiveData = SnackBarLiveData.f16957a;
                String string = m20390g().m6899a().getString(C2336R.string.lbl_list_item_removed);
                Intrinsics.checkIfNull(string, "ctx.getString(id)");
                String string2 = m20390g().m6899a().getString(C2336R.string.lbl_list_item_undo_remove);
                Intrinsics.checkIfNull(string2, "ctx.getString(id)");
                SnackBarLiveData.m21968c(snackBarLiveData, string, new SnackBarAction(string2, new C9460i()), 0, 0, 12, null);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* renamed from: T */
    public static /* synthetic */ void m11164T(ShoppingListViewModel shoppingListViewModel, View view) {
        m11087s2(shoppingListViewModel, view);
    }

    /* renamed from: U */
    public static /* synthetic */ void m11161U(ShoppingListViewModel shoppingListViewModel, View view) {
        m11111k2(shoppingListViewModel, view);
    }

    /* renamed from: V */
    public static /* synthetic */ void m11158V(ShoppingListViewModel shoppingListViewModel, View view) {
        m11123g2(shoppingListViewModel, view);
    }

    /* renamed from: W */
    public static /* synthetic */ void m11155W(ShoppingListViewModel shoppingListViewModel, View view) {
        m11117i2(shoppingListViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W0 */
    public static final List m11154W0(ShoppingListViewModel shoppingListViewModel, List list) {
        Intrinsics.isThisObjectNull(shoppingListViewModel, "this$0");
        shoppingListViewModel.m11096p2();
        shoppingListViewModel.m11102n2();
        shoppingListViewModel.m11105m2();
        shoppingListViewModel.m20381p(list.isEmpty());
        return list;
    }

    /* renamed from: X */
    public static /* synthetic */ void m11152X(ShoppingListViewModel shoppingListViewModel, View view) {
        m11192J0(shoppingListViewModel, view);
    }

    /* renamed from: Y */
    public static /* synthetic */ void m11149Y(ShoppingListViewModel shoppingListViewModel, String str) {
        m11116j0(shoppingListViewModel, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y1 */
    public static final void m11147Y1(ShoppingListViewModel shoppingListViewModel, View view) {
        Intrinsics.isThisObjectNull(shoppingListViewModel, "this$0");
        shoppingListViewModel.f24861w.mo9587d(new C13182l(EnumC9451a.SCAN_INPUT, C13195u.f34156a));
    }

    /* renamed from: Z */
    public static /* synthetic */ void m11146Z(ShoppingListViewModel shoppingListViewModel, Integer num) {
        m11119i0(shoppingListViewModel, num);
    }

    /* renamed from: a0 */
    public static /* synthetic */ Boolean m11143a0(EnumC9454d enumC9454d) {
        return m11180N1(enumC9454d);
    }

    /* renamed from: b0 */
    public static /* synthetic */ String m11140b0(ResourcesProvider resourcesProvider, EnumC9454d enumC9454d) {
        return m11174P1(resourcesProvider, enumC9454d);
    }

    /* renamed from: c0 */
    public static /* synthetic */ List m11137c0(ShoppingListViewModel shoppingListViewModel, List list) {
        return m11154W0(shoppingListViewModel, list);
    }

    /* renamed from: d0 */
    public static /* synthetic */ String m11134d0(ResourcesProvider resourcesProvider, EnumC9454d enumC9454d) {
        return m11191J1(resourcesProvider, enumC9454d);
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m11131e0(ShoppingListViewModel shoppingListViewModel, View view) {
        m11178O0(shoppingListViewModel, view);
    }

    /* renamed from: e2 */
    public static /* synthetic */ Object m11129e2(ShoppingListViewModel shoppingListViewModel, boolean z, InterfaceC1886d interfaceC1886d, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return shoppingListViewModel.m11132d2(z, interfaceC1886d);
    }

    /* renamed from: f0 */
    public static /* synthetic */ int m11128f0(ShoppingListProduct shoppingListProduct, ShoppingListProduct shoppingListProduct2) {
        return m11122h0(shoppingListProduct, shoppingListProduct2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public static final List m11125g0(ShoppingListViewModel shoppingListViewModel, C13195u c13195u) {
        List m461h0;
        List m453p0;
        Intrinsics.isThisObjectNull(shoppingListViewModel, "this$0");
        int i = C9456f.f24866a[shoppingListViewModel.f24863x.ordinal()];
        if (i != 1) {
            if (i != 2) {
                m461h0 = _Collections.m461h0(shoppingListViewModel.f24841m.m18822q(), C6741t0.f18103w);
                m453p0 = _Collections.m453p0(m461h0);
                return m453p0;
            }
            return shoppingListViewModel.f24841m.m18822q();
        }
        return shoppingListViewModel.f24841m.m18821r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g2 */
    public static final void m11123g2(ShoppingListViewModel shoppingListViewModel, View view) {
        Intrinsics.isThisObjectNull(shoppingListViewModel, "this$0");
        shoppingListViewModel.f24861w.mo9587d(new C13182l(EnumC9451a.TAKE_AWAY_ORDER, C13195u.f34156a));
    }

    /* renamed from: h0 */
    private static final int m11122h0(ShoppingListProduct shoppingListProduct, ShoppingListProduct shoppingListProduct2) {
        boolean z = shoppingListProduct instanceof LiteralProduct;
        if (z && (shoppingListProduct2 instanceof LiteralProduct)) {
            return Intrinsics.compare(shoppingListProduct.m14324w(), shoppingListProduct2.m14324w());
        }
        if (shoppingListProduct == null || !(shoppingListProduct2 instanceof LiteralProduct)) {
            if (!z || shoppingListProduct2 == null) {
                return Intrinsics.isLessOrEqual(shoppingListProduct.m14325v(), shoppingListProduct2.m14325v());
            }
            return 1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public static final void m11119i0(ShoppingListViewModel shoppingListViewModel, Integer num) {
        Intrinsics.isThisObjectNull(shoppingListViewModel, "this$0");
        List m18822q = shoppingListViewModel.f24841m.m18822q();
        boolean z = false;
        if (!(m18822q instanceof Collection) || !m18822q.isEmpty()) {
            Iterator it = m18822q.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((ShoppingListProduct) it.next()).m14349E()) {
                    z = true;
                    break;
                }
            }
        }
        shoppingListViewModel.f24821S.mo166p(Boolean.valueOf(z));
        shoppingListViewModel.f24855t.mo166p(Boolean.valueOf(!z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m11117i2(ShoppingListViewModel shoppingListViewModel, View view) {
        Intrinsics.isThisObjectNull(shoppingListViewModel, "this$0");
        shoppingListViewModel.f24861w.mo9587d(new C13182l(EnumC9451a.TOGGLE_EDIT_SHOP_MODE, C13195u.f34156a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public static final void m11116j0(ShoppingListViewModel shoppingListViewModel, String str) {
        Intrinsics.isThisObjectNull(shoppingListViewModel, "this$0");
        if (str != null) {
            shoppingListViewModel.f24841m.m18840U(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m11113k0(pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "this$0"
            p181jd.Intrinsics.isThisObjectNull(r4, r0)
            if (r5 == 0) goto L48
            androidx.lifecycle.LiveData r0 = r4.f24848p0
            java.lang.Object r0 = r0.mo172f()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto L13
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L13:
            java.lang.String r1 = "isEditingItem.value ?: false"
            p181jd.Intrinsics.checkIfNull(r0, r1)
            boolean r0 = r0.booleanValue()
            androidx.lifecycle.c0 r1 = r4.f24815M
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L30
            int r0 = r5.length()
            if (r0 <= 0) goto L2a
            r0 = r3
            goto L2b
        L2a:
            r0 = r2
        L2b:
            if (r0 == 0) goto L2e
            goto L30
        L2e:
            r0 = r2
            goto L31
        L30:
            r0 = r3
        L31:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.mo166p(r0)
            androidx.lifecycle.e0 r4 = r4.f24816N
            int r5 = r5.length()
            if (r5 <= 0) goto L41
            r2 = r3
        L41:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            r4.mo166p(r5)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel.m11113k0(pt.pingodoce.app.presentation.shoppinglist.h, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m11111k2(ShoppingListViewModel shoppingListViewModel, View view) {
        Intrinsics.isThisObjectNull(shoppingListViewModel, "this$0");
        shoppingListViewModel.f24861w.mo9587d(new C13182l(EnumC9451a.UNCHECK, C13195u.f34156a));
    }

    /* renamed from: l0 */
    public static final /* synthetic */ C7310l m11110l0(ShoppingListViewModel shoppingListViewModel) {
        return shoppingListViewModel.f24843n;
    }

    /* renamed from: m0 */
    public static final /* synthetic */ EnumC9455e m11107m0(ShoppingListViewModel shoppingListViewModel) {
        return shoppingListViewModel.f24863x;
    }

    /* renamed from: m2 */
    private final void m11105m2() {
        int m186r;
        C6447w c6447w = new C6447w();
        List list = (List) this.f24817O.mo172f();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof ShoppingListProduct) {
                    arrayList.add(obj);
                }
            }
            m186r = Iterables.m186r(arrayList, 10);
            ArrayList<Number> arrayList2 = new ArrayList(m186r);
            Iterator it = arrayList.iterator();
            while (true) {
                int i = 0;
                if (!it.hasNext()) {
                    break;
                }
                ShoppingListProduct shoppingListProduct = (ShoppingListProduct) it.next();
                if (shoppingListProduct.m14334h()) {
                    i = shoppingListProduct.m14327s();
                }
                arrayList2.add(Integer.valueOf(i));
            }
            Integer num = 0;
            for (Number number : arrayList2) {
                num = Integer.valueOf(num.intValue() + number.intValue());
            }
            c6447w.f17531w = num.intValue();
        }
        this.f24809G.mo166p(Integer.valueOf(c6447w.f17531w));
    }

    /* renamed from: n0 */
    public static final /* synthetic */ ShoppingListCategory m11104n0(ShoppingListViewModel shoppingListViewModel) {
        return shoppingListViewModel.f24849q;
    }

    /* renamed from: n2 */
    private final void m11102n2() {
        int m186r;
        C6447w c6447w = new C6447w();
        List list = (List) this.f24817O.mo172f();
        if (list != null) {
            ArrayList<ShoppingListProduct> arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof ShoppingListProduct) {
                    arrayList.add(obj);
                }
            }
            m186r = Iterables.m186r(arrayList, 10);
            ArrayList<Number> arrayList2 = new ArrayList(m186r);
            for (ShoppingListProduct shoppingListProduct : arrayList) {
                arrayList2.add(Integer.valueOf(shoppingListProduct.m14327s()));
            }
            Integer num = 0;
            for (Number number : arrayList2) {
                num = Integer.valueOf(num.intValue() + number.intValue());
            }
            c6447w.f17531w = num.intValue();
        }
        this.f24808F.mo166p(Integer.valueOf(c6447w.f17531w));
    }

    /* renamed from: o0 */
    public static final /* synthetic */ ResourcesProvider m11101o0(ShoppingListViewModel shoppingListViewModel) {
        return shoppingListViewModel.m20390g();
    }

    /* renamed from: p0 */
    public static final /* synthetic */ C7256f1 m11098p0(ShoppingListViewModel shoppingListViewModel) {
        return shoppingListViewModel.f24841m;
    }

    /* renamed from: p2 */
    private final void m11096p2() {
        this.f24804B.mo166p(this.f24841m.m18859B());
        this.f24803A.mo166p(Boolean.valueOf(this.f24841m.m18857D()));
    }

    /* renamed from: q0 */
    public static final /* synthetic */ C1436e0 m11095q0(ShoppingListViewModel shoppingListViewModel) {
        return shoppingListViewModel.f24819Q;
    }

    /* renamed from: r0 */
    public static final /* synthetic */ C1436e0 m11092r0(ShoppingListViewModel shoppingListViewModel) {
        return shoppingListViewModel.f24814L;
    }

    /* renamed from: s0 */
    public static final /* synthetic */ C1436e0 m11089s0(ShoppingListViewModel shoppingListViewModel) {
        return shoppingListViewModel.f24822T;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m11087s2(ShoppingListViewModel shoppingListViewModel, View view) {
        Intrinsics.isThisObjectNull(shoppingListViewModel, "this$0");
        shoppingListViewModel.f24861w.mo9587d(new C13182l(EnumC9451a.VOICE_INPUT, C13195u.f34156a));
    }

    /* renamed from: t0 */
    public static final /* synthetic */ C1436e0 m11086t0(ShoppingListViewModel shoppingListViewModel) {
        return shoppingListViewModel.f24818P;
    }

    /* renamed from: u0 */
    public static final /* synthetic */ C1436e0 m11084u0(ShoppingListViewModel shoppingListViewModel) {
        return shoppingListViewModel.f24813K;
    }

    /* renamed from: v0 */
    public static final /* synthetic */ C1436e0 m11082v0(ShoppingListViewModel shoppingListViewModel) {
        return shoppingListViewModel.f24809G;
    }

    /* renamed from: w0 */
    public static final /* synthetic */ C1436e0 m11080w0(ShoppingListViewModel shoppingListViewModel) {
        return shoppingListViewModel.f24820R;
    }

    /* renamed from: x0 */
    public static final /* synthetic */ C1436e0 m11078x0(ShoppingListViewModel shoppingListViewModel) {
        return shoppingListViewModel.f24805C;
    }

    /* renamed from: y0 */
    public static final /* synthetic */ C1436e0 m11076y0(ShoppingListViewModel shoppingListViewModel) {
        return shoppingListViewModel.f24851r;
    }

    /* renamed from: z0 */
    public static final /* synthetic */ C1436e0 m11074z0(ShoppingListViewModel shoppingListViewModel) {
        return shoppingListViewModel.f24807E;
    }

    /* renamed from: A1 */
    public final LiveData m11209A1() {
        return this.f24832d0;
    }

    /* renamed from: B1 */
    public final boolean m11207B1() {
        List<ShoppingListProduct> m18822q = this.f24841m.m18822q();
        if ((m18822q instanceof Collection) && m18822q.isEmpty()) {
            return false;
        }
        for (ShoppingListProduct shoppingListProduct : m18822q) {
            if (shoppingListProduct.m14350D()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C1 */
    public final boolean m11205C1() {
        return this.f24847p.m18619e();
    }

    /* renamed from: D1 */
    public final boolean m11203D1() {
        return this.f24847p.m18616h();
    }

    /* renamed from: E1 */
    public final View.OnClickListener m11201E1() {
        return new View.OnClickListener() { // from class: kl.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShoppingListViewModel.m11199F1(ShoppingListViewModel.this, view);
            }
        };
    }

    /* renamed from: G1 */
    public final View.OnClickListener m11197G1() {
        return new View.OnClickListener() { // from class: kl.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShoppingListViewModel.m11195H1(ShoppingListViewModel.this, view);
            }
        };
    }

    /* renamed from: I0 */
    public final View.OnClickListener m11194I0() {
        return new View.OnClickListener() { // from class: kl.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShoppingListViewModel.m11192J0(ShoppingListViewModel.this, view);
            }
        };
    }

    /* renamed from: K0 */
    public final boolean m11190K0() {
        Object m20162b;
        m20162b = C6770c.m20162b(null, new C9457g(null), 1, null);
        return ((Boolean) m20162b).booleanValue();
    }

    /* renamed from: K1 */
    public final LiveData m11189K1() {
        return this.f24823U;
    }

    /* renamed from: L0 */
    public final View.OnClickListener m11187L0() {
        return new View.OnClickListener() { // from class: kl.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShoppingListViewModel.m11184M0(ShoppingListViewModel.this, view);
            }
        };
    }

    /* renamed from: L1 */
    public final boolean m11186L1() {
        C7256f1 c7256f1 = this.f24841m;
        return c7256f1.m18823p().m13729w() && c7256f1.m18857D();
    }

    /* renamed from: M1 */
    public final LiveData m11183M1() {
        return this.f24848p0;
    }

    /* renamed from: N0 */
    public final View.OnClickListener m11181N0() {
        return new View.OnClickListener() { // from class: kl.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShoppingListViewModel.m11178O0(ShoppingListViewModel.this, view);
            }
        };
    }

    /* renamed from: O1 */
    public final LiveData m11177O1() {
        return this.f24835g0;
    }

    /* renamed from: P0 */
    public final void m11175P0() {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9458h(null), 3, null);
    }

    /* renamed from: Q0 */
    public final void m11172Q0() {
        this.f24861w.mo9587d(new C13182l(EnumC9451a.CLEAR_LIST, C13195u.f34156a));
    }

    /* renamed from: Q1 */
    public final View.OnClickListener m11171Q1() {
        return new View.OnClickListener() { // from class: kl.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShoppingListViewModel.m11168R1(ShoppingListViewModel.this, view);
            }
        };
    }

    /* renamed from: R0 */
    public final void m11169R0(int i) {
        m11166S0(i, true);
    }

    /* renamed from: S1 */
    public final void m11165S1(EnumC9455e enumC9455e) {
        Intrinsics.isThisObjectNull(enumC9455e, "type");
        this.f24861w.mo9587d(new C13182l(EnumC9451a.ORDER_BY, enumC9455e));
    }

    /* renamed from: T0 */
    public final void m11163T0() {
        this.f24861w.mo9587d(new C13182l(EnumC9451a.DELETE_LIST, C13195u.f34156a));
    }

    /* renamed from: T1 */
    public final void m11162T1() {
        this.f24864y.mo166p(C13195u.f34156a);
    }

    /* renamed from: U0 */
    public final void m11160U0(ShoppingListProduct shoppingListProduct) {
        Intrinsics.isThisObjectNull(shoppingListProduct, "item");
        m20389h().m37000g("_itemEditing", shoppingListProduct);
        this.f24838j0.mo166p(shoppingListProduct.m14329n());
        this.f24865z.mo166p(EnumC9454d.EDIT);
    }

    /* renamed from: U1 */
    public final void m11159U1() {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9467l(null), 3, null);
    }

    /* renamed from: V0 */
    public final void m11157V0(LatLng latLng) {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9461j(latLng, null), 3, null);
    }

    /* renamed from: V1 */
    public final void m11156V1() {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9468m(null), 3, null);
    }

    /* renamed from: W1 */
    public final void m11153W1(int i) {
        m11166S0(i, false);
    }

    /* renamed from: X0 */
    public final LiveData m11151X0() {
        return this.f24854s0;
    }

    /* renamed from: X1 */
    public final View.OnClickListener m11150X1() {
        return new View.OnClickListener() { // from class: kl.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShoppingListViewModel.m11147Y1(ShoppingListViewModel.this, view);
            }
        };
    }

    /* renamed from: Y0 */
    public final C1436e0 m11148Y0() {
        return this.f24839k0;
    }

    /* renamed from: Z0 */
    public final LiveData m11145Z0() {
        return this.f24860v0;
    }

    /* renamed from: Z1 */
    public final void m11144Z1(String str) {
        Intrinsics.isThisObjectNull(str, "ean");
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9470n(str, null), 3, null);
    }

    /* renamed from: a1 */
    public final LiveData m11142a1() {
        return this.f24862w0;
    }

    /* renamed from: a2 */
    public final void m11141a2(float f) {
        this.f24810H.mo166p(Float.valueOf(f));
        this.f24811I.mo166p(Float.valueOf(f + 0.5f));
    }

    /* renamed from: b1 */
    public final LiveData m11139b1() {
        return this.f24852r0;
    }

    /* renamed from: b2 */
    public final void m11138b2(boolean z) {
        if (z) {
            m20381p(false);
        } else {
            this.f24847p.m18608p();
        }
    }

    /* renamed from: c1 */
    public final boolean m11136c1() {
        return this.f24859v;
    }

    /* renamed from: c2 */
    public final void m11135c2(boolean z) {
        if (z) {
            return;
        }
        this.f24847p.m18604t();
    }

    /* renamed from: d1 */
    public final LiveData m11133d1() {
        return this.f24850q0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* renamed from: d2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m11132d2(boolean r11, bd.InterfaceC1886d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel.C9473p
            if (r0 == 0) goto L13
            r0 = r12
            pt.pingodoce.app.presentation.shoppinglist.h$p r0 = (pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel.C9473p) r0
            int r1 = r0.f24905z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24905z = r1
            goto L18
        L13:
            pt.pingodoce.app.presentation.shoppinglist.h$p r0 = new pt.pingodoce.app.presentation.shoppinglist.h$p
            r0.<init>(r12)
        L18:
            r4 = r0
            java.lang.Object r12 = r4.f24903x
            java.lang.Object r0 = cd.C2111b.m34640d()
            int r1 = r4.f24905z
            r7 = 2
            r8 = 0
            r9 = 0
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r11 = r4.f24902w
            pt.pingodoce.app.presentation.shoppinglist.h r11 = (pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel) r11
            p468yc.C13186n.m1453b(r12)
            goto L55
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            p468yc.C13186n.m1453b(r12)
            p494zh.BaseViewModel.m111K(r10, r2, r9, r7, r8)
            r12 = 0
            pt.pingodoce.app.presentation.shoppinglist.h$q r3 = new pt.pingodoce.app.presentation.shoppinglist.h$q
            r3.<init>(r11, r8)
            r5 = 1
            r6 = 0
            r4.f24902w = r10
            r4.f24905z = r2
            r1 = r10
            r2 = r12
            java.lang.Object r11 = ke.CoreBaseViewModel.m20383n(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto L54
            return r0
        L54:
            r11 = r10
        L55:
            p494zh.BaseViewModel.m111K(r11, r9, r9, r7, r8)
            yc.u r11 = p468yc.C13195u.f34156a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel.m11132d2(boolean, bd.d):java.lang.Object");
    }

    /* renamed from: e1 */
    public final LiveData m11130e1() {
        return this.f24858u0;
    }

    /* renamed from: f1 */
    public final LiveData m11127f1() {
        return this.f24827Y;
    }

    /* renamed from: f2 */
    public final View.OnClickListener m11126f2() {
        return new View.OnClickListener() { // from class: kl.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShoppingListViewModel.m11123g2(ShoppingListViewModel.this, view);
            }
        };
    }

    /* renamed from: g1 */
    public final LiveData m11124g1() {
        return this.f24842m0;
    }

    /* renamed from: h1 */
    public final C1430c0 m11121h1() {
        return this.f24840l0;
    }

    /* renamed from: h2 */
    public final View.OnClickListener m11120h2() {
        return new View.OnClickListener() { // from class: kl.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShoppingListViewModel.m11117i2(ShoppingListViewModel.this, view);
            }
        };
    }

    /* renamed from: i1 */
    public final LiveData m11118i1() {
        return this.f24844n0;
    }

    /* renamed from: j1 */
    public final LiveData m11115j1() {
        return this.f24846o0;
    }

    /* renamed from: j2 */
    public final View.OnClickListener m11114j2() {
        return new View.OnClickListener() { // from class: kl.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShoppingListViewModel.m11111k2(ShoppingListViewModel.this, view);
            }
        };
    }

    /* renamed from: k1 */
    public final LiveData m11112k1() {
        return this.f24831c0;
    }

    /* renamed from: l1 */
    public final LiveData m11109l1() {
        return this.f24830b0;
    }

    /* renamed from: l2 */
    public final void m11108l2(ShoppingListProduct shoppingListProduct) {
        Intrinsics.isThisObjectNull(shoppingListProduct, "item");
        this.f24841m.m18842S(shoppingListProduct);
        m11162T1();
    }

    /* renamed from: m1 */
    public final C1436e0 m11106m1() {
        return this.f24838j0;
    }

    /* renamed from: n1 */
    public final LiveData m11103n1() {
        return this.f24837i0;
    }

    /* renamed from: o1 */
    public final LiveData m11100o1() {
        return this.f24856t0;
    }

    /* renamed from: o2 */
    public final void m11099o2(ShoppingListProduct shoppingListProduct) {
        Intrinsics.isThisObjectNull(shoppingListProduct, "item");
        if (shoppingListProduct.m14350D()) {
            return;
        }
        if (shoppingListProduct.m14327s() > 1) {
            C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9475r(shoppingListProduct, null), 3, null);
            return;
        }
        ShoppingListProduct m14340a = shoppingListProduct.m14340a();
        m14340a.m14342L(m14340a.m14322z());
        m11108l2(m14340a);
    }

    /* renamed from: p1 */
    public final LiveData m11097p1() {
        return this.f24829a0;
    }

    /* renamed from: q1 */
    public final LiveData m11094q1() {
        return this.f24853s;
    }

    /* renamed from: q2 */
    public final void m11093q2() {
        this.f24806D.mo166p(Boolean.valueOf(!this.f24845o.m18680l().isEmpty()));
        this.f24807E.mo166p(C13777q.m254N(this.f24845o.m18680l()));
    }

    /* renamed from: r1 */
    public final String m11091r1() {
        int m186r;
        String mo172f = this.f24824V.mo172f();
        String str = (String) mo172f;
        if (str != null) {
            if (str.length() > 0) {
                mo172f = mo172f + ":\n\n";
            }
            List<ShoppingListProduct> m18822q = this.f24841m.m18822q();
            if (!m18822q.isEmpty()) {
                m186r = Iterables.m186r(m18822q, 10);
                ArrayList arrayList = new ArrayList(m186r);
                for (ShoppingListProduct shoppingListProduct : m18822q) {
                    C6429c0 c6429c0 = C6429c0.f17515a;
                    String format = String.format("%s - %s\n", Arrays.copyOf(new Object[]{Integer.valueOf(shoppingListProduct.m14327s()), shoppingListProduct.m14329n()}, 2));
                    Intrinsics.checkIfNull(format, "format(format, *args)");
                    arrayList.add(format);
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = ((String) next) + ((String) it.next());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(mo172f);
                    sb2.append(next);
                    mo172f = sb2.toString();
                } else {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
            }
            C6429c0 c6429c02 = C6429c0.f17515a;
            String string = m20390g().m6899a().getString(C2336R.string.lbl_shopping_list_share_message);
            Intrinsics.checkIfNull(string, "ctx.getString(id)");
            String format2 = String.format("\n\n%s\n", Arrays.copyOf(new Object[]{string}, 1));
            Intrinsics.checkIfNull(format2, "format(format, *args)");
            mo172f = mo172f + format2;
        }
        String str2 = (String) mo172f;
        return str2 == null ? BuildConfig.VERSION_NAME : str2;
    }

    /* renamed from: r2 */
    public final View.OnClickListener m11090r2() {
        return new View.OnClickListener() { // from class: kl.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShoppingListViewModel.m11087s2(ShoppingListViewModel.this, view);
            }
        };
    }

    /* renamed from: s1 */
    public final List m11088s1() {
        List list = (List) this.f24854s0.mo172f();
        return list == null ? new ArrayList() : list;
    }

    /* renamed from: t1 */
    public final C1430c0 m11085t1() {
        return this.f24824V;
    }

    /* renamed from: u1 */
    public final LiveData m11083u1() {
        return this.f24857u;
    }

    /* renamed from: v1 */
    public final LiveData m11081v1() {
        return this.f24836h0;
    }

    /* renamed from: w1 */
    public final LiveData m11079w1() {
        return this.f24826X;
    }

    /* renamed from: x1 */
    public final LiveData m11077x1() {
        return this.f24828Z;
    }

    /* renamed from: y1 */
    public final LiveData m11075y1() {
        return this.f24833e0;
    }

    /* renamed from: z1 */
    public final LiveData m11073z1() {
        return this.f24834f0;
    }
}
