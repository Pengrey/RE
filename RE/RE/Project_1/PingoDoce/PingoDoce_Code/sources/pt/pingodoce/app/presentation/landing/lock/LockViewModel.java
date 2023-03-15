package pt.pingodoce.app.presentation.landing.lock;

import android.graphics.drawable.BitmapDrawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.core.content.C0928a;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1465n0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import cd.C2116d;
import ci.FlowViewModel;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import fm.C5580d;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import ke.CoreBaseViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import mg.AuthManager;
import mg.C7256f1;
import mg.C7296j0;
import mg.C7310l;
import mg.C7405s1;
import mg.ConsentsManager;
import mg.LoyaltyCardManager;
import mg.SmsManager;
import mg.StoreManager;
import module.network.data.remote.models.user.User;
import p070e.C4906j;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p259o.InterfaceC7946a;
import p276og.Result;
import p378u5.ResourcesProvider;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p489zc.C13777q;
import p494zh.C13870l1;
import p494zh.C13905t2;
import p494zh.C13909u2;
import pt.pingodoce.app.data.local.flows.LoginFlowData;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;
import pt.pingodoce.app.data.local.models.products.Promotion;
import pt.pingodoce.app.data.local.models.shoppinglist.LiteralProduct;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListCategory;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchCatalogParameters;
import pt.pingodoce.app.data.remote.models.response.CatalogResponse;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;
import pt.pingodoce.app.data.remote.models.response.Store;
import pt.pingodoce.app.presentation.landing.lock.LockViewModel;
import td.InterfaceC10524i0;

/* renamed from: pt.pingodoce.app.presentation.landing.lock.a */
/* loaded from: classes2.dex */
public final class LockViewModel extends FlowViewModel {

    /* renamed from: A */
    private final C1436e0 f24360A;

    /* renamed from: B */
    private final C1436e0 f24361B;

    /* renamed from: C */
    private final LiveData f24362C;

    /* renamed from: D */
    private final C1436e0 f24363D;

    /* renamed from: E */
    private final LiveData f24364E;

    /* renamed from: F */
    private final LiveData f24365F;

    /* renamed from: G */
    private final LiveData f24366G;

    /* renamed from: H */
    private final LiveData f24367H;

    /* renamed from: I */
    private final LiveData f24368I;

    /* renamed from: J */
    private final LiveData f24369J;

    /* renamed from: K */
    private final LiveData f24370K;

    /* renamed from: L */
    private final LiveData f24371L;

    /* renamed from: M */
    private final LiveData f24372M;

    /* renamed from: N */
    private final LiveData f24373N;

    /* renamed from: O */
    private final LiveData f24374O;

    /* renamed from: P */
    private final LiveData f24375P;

    /* renamed from: Q */
    private final LiveData f24376Q;

    /* renamed from: R */
    private final LiveData f24377R;

    /* renamed from: S */
    private final LiveData f24378S;

    /* renamed from: T */
    private final LiveData f24379T;

    /* renamed from: U */
    private final LiveData f24380U;

    /* renamed from: V */
    private final LiveData f24381V;

    /* renamed from: W */
    private final LiveData f24382W;

    /* renamed from: X */
    private final LiveData f24383X;

    /* renamed from: Y */
    private final C1436e0 f24384Y;

    /* renamed from: Z */
    private final LiveData f24385Z;

    /* renamed from: a0 */
    private final InterfaceC6108l f24386a0;

    /* renamed from: b0 */
    private final InterfaceC13178g f24387b0;

    /* renamed from: q */
    private final C7405s1 f24388q;

    /* renamed from: r */
    private final C5580d f24389r;

    /* renamed from: s */
    private final AuthManager f24390s;

    /* renamed from: t */
    private final C7256f1 f24391t;

    /* renamed from: u */
    private final C7310l f24392u;

    /* renamed from: v */
    private final StoreManager f24393v;

    /* renamed from: w */
    private final C1436e0 f24394w;

    /* renamed from: x */
    private final C1436e0 f24395x;

    /* renamed from: y */
    private final C1436e0 f24396y;

    /* renamed from: z */
    private final C1436e0 f24397z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LockViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$a */
    /* loaded from: classes2.dex */
    public enum EnumC9256a {
        ENTER_APP,
        UNLOCK_CARD,
        UNLOCK_CARD_ONBOARDING,
        ENTER_SHOPPING_LIST,
        ENTER_BENEFITS,
        ENTER_SHOPPING_ACTIVITY
    }

    /* compiled from: LockViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C9257b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24398a;

        static {
            int[] iArr = new int[EnumC9256a.values().length];
            iArr[EnumC9256a.ENTER_APP.ordinal()] = 1;
            iArr[EnumC9256a.ENTER_BENEFITS.ordinal()] = 2;
            iArr[EnumC9256a.ENTER_SHOPPING_ACTIVITY.ordinal()] = 3;
            iArr[EnumC9256a.ENTER_SHOPPING_LIST.ordinal()] = 4;
            f24398a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LockViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$c */
    /* loaded from: classes2.dex */
    public static final class C9258c extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ ResourcesProvider f24399w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9258c(ResourcesProvider resourcesProvider) {
            super(0);
            this.f24399w = resourcesProvider;
        }

        /* renamed from: a */
        public final ShoppingListCategory mo42214q() {
            String string = this.f24399w.m6899a().getString(C2336R.string.lbl_default_product_category);
            Intrinsics.checkIfNull(string, "ctx.getString(id)");
            ResourcesProvider resourcesProvider = this.f24399w;
            TypedValue typedValue = new TypedValue();
            new ContextThemeWrapper(resourcesProvider.m6899a(), 2131951714).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue, true);
            String hexString = Integer.toHexString(C0928a.m39113d(resourcesProvider.m6899a(), typedValue.resourceId));
            Intrinsics.checkIfNull(hexString, "toHexString(\n           …          )\n            )");
            Locale locale = Locale.getDefault();
            Intrinsics.checkIfNull(locale, "getDefault()");
            String lowerCase = hexString.toLowerCase(locale);
            Intrinsics.checkIfNull(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            return new ShoppingListCategory(string, "#" + lowerCase, 0, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LockViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.landing.lock.LockViewModel", m20196f = "LockViewModel.kt", m20195l = {142}, m20194m = "enterApp")
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$d */
    /* loaded from: classes2.dex */
    public static final class C9259d extends AbstractC6757d {

        /* renamed from: w */
        Object f24400w;

        /* renamed from: x */
        /* synthetic */ Object f24401x;

        /* renamed from: z */
        int f24403z;

        C9259d(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f24401x = obj;
            this.f24403z |= Integer.MIN_VALUE;
            return LockViewModel.m11897c0(LockViewModel.this, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LockViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.landing.lock.LockViewModel$enterApp$2", m20196f = "LockViewModel.kt", m20195l = {146}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$e */
    /* loaded from: classes2.dex */
    public static final class C9260e extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24404x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LockViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.landing.lock.LockViewModel$enterApp$2$1", m20196f = "LockViewModel.kt", m20195l = {147, 151, 162}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$e$a */
        /* loaded from: classes2.dex */
        public static final class C9261a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: A */
            final /* synthetic */ LockViewModel f24406A;

            /* renamed from: x */
            Object f24407x;

            /* renamed from: y */
            Object f24408y;

            /* renamed from: z */
            int f24409z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9261a(LockViewModel lockViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f24406A = lockViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C9261a(this.f24406A, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C9261a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0089 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    Method dump skipped, instructions count: 277
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.landing.lock.LockViewModel.C9260e.C9261a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        C9260e(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9260e(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9260e) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24404x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LockViewModel.m11890j0(LockViewModel.this).mo169m(C6755b.m20201a(true));
                LockViewModel lockViewModel = LockViewModel.this;
                C9261a c9261a = new C9261a(lockViewModel, null);
                this.f24404x = 1;
                if (CoreBaseViewModel.m20383n(lockViewModel, false, c9261a, this, 1, null) == m34636d) {
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
    /* compiled from: LockViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.landing.lock.LockViewModel", m20196f = "LockViewModel.kt", m20195l = {189, 190}, m20194m = "enterAppClick")
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$f */
    /* loaded from: classes2.dex */
    public static final class C9262f extends AbstractC6757d {

        /* renamed from: A */
        int f24410A;

        /* renamed from: w */
        Object f24411w;

        /* renamed from: x */
        Object f24412x;

        /* renamed from: y */
        /* synthetic */ Object f24413y;

        C9262f(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f24413y = obj;
            this.f24410A |= Integer.MIN_VALUE;
            return LockViewModel.m11896d0(LockViewModel.this, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LockViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$g */
    /* loaded from: classes2.dex */
    public static final class C9263g extends AbstractC6438m implements InterfaceC6108l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LockViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.landing.lock.LockViewModel$onClick$1$1", m20196f = "LockViewModel.kt", m20195l = {C4906j.f13405F0}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$g$a */
        /* loaded from: classes2.dex */
        public static final class C9264a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f24416x;

            /* renamed from: y */
            final /* synthetic */ LockViewModel f24417y;

            /* renamed from: z */
            final /* synthetic */ C13182l f24418z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9264a(LockViewModel lockViewModel, C13182l c13182l, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f24417y = lockViewModel;
                this.f24418z = c13182l;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C9264a(this.f24417y, this.f24418z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C9264a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24416x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    this.f24416x = 1;
                    if (LockViewModel.m11896d0(this.f24417y, (EnumC9256a) this.f24418z.m1460c(), this) == m34636d) {
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

        /* compiled from: LockViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$g$b */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C9265b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f24419a;

            static {
                int[] iArr = new int[EnumC9256a.values().length];
                iArr[EnumC9256a.ENTER_BENEFITS.ordinal()] = 1;
                iArr[EnumC9256a.ENTER_SHOPPING_LIST.ordinal()] = 2;
                iArr[EnumC9256a.ENTER_APP.ordinal()] = 3;
                iArr[EnumC9256a.UNLOCK_CARD.ordinal()] = 4;
                iArr[EnumC9256a.UNLOCK_CARD_ONBOARDING.ordinal()] = 5;
                f24419a = iArr;
            }
        }

        C9263g() {
            super(1);
        }

        /* renamed from: a */
        public final void m11870a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "type");
            int i = C9265b.f24419a[((EnumC9256a) c13182l.m1460c()).ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                C6772d.m20158d(C1473p0.m36987a(LockViewModel.this), null, null, new C9264a(LockViewModel.this, c13182l, null), 3, null);
            } else if (i == 4) {
                LockViewModel lockViewModel = LockViewModel.this;
                lockViewModel.m120B(C13905t2.f35026a, lockViewModel.m34578S());
            } else if (i != 5) {
            } else {
                LockViewModel lockViewModel2 = LockViewModel.this;
                lockViewModel2.m120B(C13909u2.f35030a, lockViewModel2.m34578S());
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m11870a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LockViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.landing.lock.LockViewModel$searchEan$1", m20196f = "LockViewModel.kt", m20195l = {270}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$h */
    /* loaded from: classes2.dex */
    public static final class C9266h extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24420x;

        /* renamed from: z */
        final /* synthetic */ String f24422z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LockViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.landing.lock.LockViewModel$searchEan$1$1", m20196f = "LockViewModel.kt", m20195l = {271}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$h$a */
        /* loaded from: classes2.dex */
        public static final class C9267a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f24423x;

            /* renamed from: y */
            final /* synthetic */ LockViewModel f24424y;

            /* renamed from: z */
            final /* synthetic */ String f24425z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9267a(LockViewModel lockViewModel, String str, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f24424y = lockViewModel;
                this.f24425z = str;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C9267a(this.f24424y, this.f24425z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C9267a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
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
                int i = this.f24423x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7310l m11895e0 = LockViewModel.m11895e0(this.f24424y);
                    SearchCatalogParameters searchCatalogParameters = new SearchCatalogParameters(0, C6755b.m20198d(Long.parseLong(this.f24425z)), null, null, null, null, null, false, null, null, null, null, null, null, null, 0, 0, false, 262141, null);
                    this.f24423x = 1;
                    z = false;
                    m18720w = m11895e0.m18720w(searchCatalogParameters, false, this);
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
                        LockViewModel lockViewModel = this.f24424y;
                        String string = LockViewModel.m11894f0(lockViewModel).m6899a().getString(C2336R.string.lbl_product_not_found);
                        Intrinsics.checkIfNull(string, "ctx.getString(id)");
                        LockViewModel.m11888l0(lockViewModel, string);
                    } else {
                        if (!LockViewModel.m11893g0(this.f24424y).m18855F(catalogProduct.m14502t())) {
                            LockViewModel.m11893g0(this.f24424y).m18834e(((CatalogResponse) c8078c.m16962b()).m13885a());
                        }
                        Promotion m14512e = catalogProduct.m14512e();
                        C7256f1 m11893g0 = LockViewModel.m11893g0(this.f24424y);
                        String m14499y = catalogProduct.m14499y();
                        ShoppingListCategory m18858C = LockViewModel.m11893g0(this.f24424y).m18858C(catalogProduct.m14502t());
                        if (m18858C == null) {
                            m18858C = new ShoppingListCategory(null, null, catalogProduct.m14502t(), 3, null);
                        }
                        ShoppingListCategory shoppingListCategory = m18858C;
                        String m14540E = catalogProduct.m14540E();
                        ShoppingListProduct m18815x = LockViewModel.m11893g0(this.f24424y).m18815x(catalogProduct.m14499y());
                        m11893g0.m18833f(new ShoppingListProduct(m14499y, 0L, shoppingListCategory, m14540E, m18815x != null ? m18815x.m14327s() : 1, false, catalogProduct.m14541D(), (m14512e == null || (m14456m = m14512e.m14456m()) == null) ? BuildConfig.VERSION_NAME : m14456m, (m14512e == null || (m14463d = m14512e.m14463d()) == null) ? BuildConfig.VERSION_NAME : m14463d, (m14512e == null || (m14462e = m14512e.m14462e()) == null) ? BuildConfig.VERSION_NAME : m14462e, m14512e != null ? m14512e.m14455n() : z, (m14512e == null || (m14465b = m14512e.m14465b()) == null) ? BuildConfig.VERSION_NAME : m14465b, catalogProduct.m14520Y(), catalogProduct.m14520Y(), null, 0, 0, false, 245794, null));
                        LockViewModel.m11886n0(this.f24424y);
                    }
                } else {
                    boolean z2 = result instanceof Result.C8077b;
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9266h(String str, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24422z = str;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9266h(this.f24422z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9266h) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24420x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LockViewModel lockViewModel = LockViewModel.this;
                C9267a c9267a = new C9267a(lockViewModel, this.f24422z, null);
                this.f24420x = 1;
                if (LockViewModel.m11885o0(lockViewModel, true, c9267a, this) == m34636d) {
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

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$i */
    /* loaded from: classes2.dex */
    public static final class C9268i implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f24426w;

        /* compiled from: Emitters.kt */
        /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$i$a */
        /* loaded from: classes2.dex */
        public static final class C9269a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f24427w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.landing.lock.LockViewModel$special$$inlined$filterNot$1$2", m20196f = "LockViewModel.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$i$a$a */
            /* loaded from: classes2.dex */
            public static final class C9270a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f24428w;

                /* renamed from: x */
                int f24429x;

                public C9270a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f24428w = obj;
                    this.f24429x |= Integer.MIN_VALUE;
                    return C9269a.this.mo4529a(null, this);
                }
            }

            public C9269a(InterfaceC6787d interfaceC6787d) {
                this.f24427w = interfaceC6787d;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(java.lang.Object r5, bd.InterfaceC1886d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof pt.pingodoce.app.presentation.landing.lock.LockViewModel.C9268i.C9269a.C9270a
                    if (r0 == 0) goto L13
                    r0 = r6
                    pt.pingodoce.app.presentation.landing.lock.a$i$a$a r0 = (pt.pingodoce.app.presentation.landing.lock.LockViewModel.C9268i.C9269a.C9270a) r0
                    int r1 = r0.f24429x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f24429x = r1
                    goto L18
                L13:
                    pt.pingodoce.app.presentation.landing.lock.a$i$a$a r0 = new pt.pingodoce.app.presentation.landing.lock.a$i$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f24428w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f24429x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L4d
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    kotlinx.coroutines.flow.d r6 = r4.f24427w
                    r2 = r5
                    java.lang.String r2 = (java.lang.String) r2
                    int r2 = r2.length()
                    if (r2 != 0) goto L41
                    r2 = r3
                    goto L42
                L41:
                    r2 = 0
                L42:
                    if (r2 != 0) goto L4d
                    r0.f24429x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L4d
                    return r1
                L4d:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.landing.lock.LockViewModel.C9268i.C9269a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C9268i(InterfaceC6785c interfaceC6785c) {
            this.f24426w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f24426w.mo20086d(new C9269a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$j */
    /* loaded from: classes2.dex */
    public static final class C9271j implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f24431w;

        /* compiled from: Emitters.kt */
        /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$j$a */
        /* loaded from: classes2.dex */
        public static final class C9272a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f24432w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.landing.lock.LockViewModel$special$$inlined$map$1$2", m20196f = "LockViewModel.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$j$a$a */
            /* loaded from: classes2.dex */
            public static final class C9273a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f24433w;

                /* renamed from: x */
                int f24434x;

                public C9273a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f24433w = obj;
                    this.f24434x |= Integer.MIN_VALUE;
                    return C9272a.this.mo4529a(null, this);
                }
            }

            public C9272a(InterfaceC6787d interfaceC6787d) {
                this.f24432w = interfaceC6787d;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(java.lang.Object r5, bd.InterfaceC1886d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof pt.pingodoce.app.presentation.landing.lock.LockViewModel.C9271j.C9272a.C9273a
                    if (r0 == 0) goto L13
                    r0 = r6
                    pt.pingodoce.app.presentation.landing.lock.a$j$a$a r0 = (pt.pingodoce.app.presentation.landing.lock.LockViewModel.C9271j.C9272a.C9273a) r0
                    int r1 = r0.f24434x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f24434x = r1
                    goto L18
                L13:
                    pt.pingodoce.app.presentation.landing.lock.a$j$a$a r0 = new pt.pingodoce.app.presentation.landing.lock.a$j$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f24433w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f24434x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L55
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    kotlinx.coroutines.flow.d r6 = r4.f24432w
                    module.network.data.remote.models.user.User r5 = (module.network.data.remote.models.user.User) r5
                    java.lang.String r5 = r5.m18180n()
                    if (r5 == 0) goto L47
                    int r5 = r5.length()
                    if (r5 != 0) goto L45
                    goto L47
                L45:
                    r5 = 0
                    goto L48
                L47:
                    r5 = r3
                L48:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r5)
                    r0.f24434x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L55
                    return r1
                L55:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.landing.lock.LockViewModel.C9271j.C9272a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C9271j(InterfaceC6785c interfaceC6785c) {
            this.f24431w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f24431w.mo20086d(new C9272a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$k */
    /* loaded from: classes2.dex */
    public static final class C9274k<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return Boolean.valueOf(((LoyaltyCard.Type) obj) == LoyaltyCard.Type.LoyaltyCard);
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$l */
    /* loaded from: classes2.dex */
    public static final class C9275l<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return Boolean.valueOf(((LoyaltyCard.Type) obj) == LoyaltyCard.Type.PoupaMais);
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$m */
    /* loaded from: classes2.dex */
    public static final class C9276m<I, O> implements InterfaceC7946a {
        public C9276m() {
        }

        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return LockViewModel.m11898b0(LockViewModel.this, (LoyaltyCard) obj);
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$n */
    /* loaded from: classes2.dex */
    public static final class C9277n<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return ((LoyaltyCard) obj).m13799m();
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$o */
    /* loaded from: classes2.dex */
    public static final class C9278o implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f24437w;

        /* compiled from: Emitters.kt */
        /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$o$a */
        /* loaded from: classes2.dex */
        public static final class C9279a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f24438w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.landing.lock.LockViewModel$special$$inlined$map$4$2", m20196f = "LockViewModel.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$o$a$a */
            /* loaded from: classes2.dex */
            public static final class C9280a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f24439w;

                /* renamed from: x */
                int f24440x;

                public C9280a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f24439w = obj;
                    this.f24440x |= Integer.MIN_VALUE;
                    return C9279a.this.mo4529a(null, this);
                }
            }

            public C9279a(InterfaceC6787d interfaceC6787d) {
                this.f24438w = interfaceC6787d;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(java.lang.Object r5, bd.InterfaceC1886d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof pt.pingodoce.app.presentation.landing.lock.LockViewModel.C9278o.C9279a.C9280a
                    if (r0 == 0) goto L13
                    r0 = r6
                    pt.pingodoce.app.presentation.landing.lock.a$o$a$a r0 = (pt.pingodoce.app.presentation.landing.lock.LockViewModel.C9278o.C9279a.C9280a) r0
                    int r1 = r0.f24440x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f24440x = r1
                    goto L18
                L13:
                    pt.pingodoce.app.presentation.landing.lock.a$o$a$a r0 = new pt.pingodoce.app.presentation.landing.lock.a$o$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f24439w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f24440x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    kotlinx.coroutines.flow.d r6 = r4.f24438w
                    module.network.data.remote.models.user.User r5 = (module.network.data.remote.models.user.User) r5
                    java.lang.String r5 = r5.m18189c()
                    r0.f24440x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.landing.lock.LockViewModel.C9278o.C9279a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C9278o(InterfaceC6785c interfaceC6785c) {
            this.f24437w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f24437w.mo20086d(new C9279a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$p */
    /* loaded from: classes2.dex */
    public static final class C9281p<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return Boolean.valueOf(((String) obj).length() > 0);
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$q */
    /* loaded from: classes2.dex */
    public static final class C9282q<I, O> implements InterfaceC7946a {

        /* renamed from: a */
        final /* synthetic */ ResourcesProvider f24442a;

        public C9282q(ResourcesProvider resourcesProvider) {
            this.f24442a = resourcesProvider;
        }

        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            String m13710h;
            Store store = (Store) obj;
            if (store == null || (m13710h = store.m13710h()) == null) {
                String string = this.f24442a.m6899a().getString(C2336R.string.lbl_store_default_name);
                Intrinsics.checkIfNull(string, "ctx.getString(id)");
                return string;
            }
            return m13710h;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$r */
    /* loaded from: classes2.dex */
    public static final class C9283r implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f24443w;

        /* compiled from: Emitters.kt */
        /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$r$a */
        /* loaded from: classes2.dex */
        public static final class C9284a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f24444w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.landing.lock.LockViewModel$special$$inlined$map$7$2", m20196f = "LockViewModel.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$r$a$a */
            /* loaded from: classes2.dex */
            public static final class C9285a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f24445w;

                /* renamed from: x */
                int f24446x;

                public C9285a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f24445w = obj;
                    this.f24446x |= Integer.MIN_VALUE;
                    return C9284a.this.mo4529a(null, this);
                }
            }

            public C9284a(InterfaceC6787d interfaceC6787d) {
                this.f24444w = interfaceC6787d;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(java.lang.Object r5, bd.InterfaceC1886d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof pt.pingodoce.app.presentation.landing.lock.LockViewModel.C9283r.C9284a.C9285a
                    if (r0 == 0) goto L13
                    r0 = r6
                    pt.pingodoce.app.presentation.landing.lock.a$r$a$a r0 = (pt.pingodoce.app.presentation.landing.lock.LockViewModel.C9283r.C9284a.C9285a) r0
                    int r1 = r0.f24446x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f24446x = r1
                    goto L18
                L13:
                    pt.pingodoce.app.presentation.landing.lock.a$r$a$a r0 = new pt.pingodoce.app.presentation.landing.lock.a$r$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f24445w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f24446x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    kotlinx.coroutines.flow.d r6 = r4.f24444w
                    pt.pingodoce.app.data.remote.models.response.LoyaltyCard r5 = (pt.pingodoce.app.data.remote.models.response.LoyaltyCard) r5
                    java.lang.String r5 = r5.m13819K()
                    r0.f24446x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.landing.lock.LockViewModel.C9283r.C9284a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C9283r(InterfaceC6785c interfaceC6785c) {
            this.f24443w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f24443w.mo20086d(new C9284a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$s */
    /* loaded from: classes2.dex */
    public static final class C9286s implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f24448w;

        /* renamed from: x */
        final /* synthetic */ LockViewModel f24449x;

        /* compiled from: Emitters.kt */
        /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$s$a */
        /* loaded from: classes2.dex */
        public static final class C9287a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f24450w;

            /* renamed from: x */
            final /* synthetic */ LockViewModel f24451x;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.landing.lock.LockViewModel$special$$inlined$map$8$2", m20196f = "LockViewModel.kt", m20195l = {224, 224}, m20194m = "emit")
            /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$s$a$a */
            /* loaded from: classes2.dex */
            public static final class C9288a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f24452w;

                /* renamed from: x */
                int f24453x;

                /* renamed from: y */
                Object f24454y;

                public C9288a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f24452w = obj;
                    this.f24453x |= Integer.MIN_VALUE;
                    return C9287a.this.mo4529a(null, this);
                }
            }

            public C9287a(InterfaceC6787d interfaceC6787d, LockViewModel lockViewModel) {
                this.f24450w = interfaceC6787d;
                this.f24451x = lockViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0067 A[RETURN] */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(java.lang.Object r11, bd.InterfaceC1886d r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof pt.pingodoce.app.presentation.landing.lock.LockViewModel.C9286s.C9287a.C9288a
                    if (r0 == 0) goto L13
                    r0 = r12
                    pt.pingodoce.app.presentation.landing.lock.a$s$a$a r0 = (pt.pingodoce.app.presentation.landing.lock.LockViewModel.C9286s.C9287a.C9288a) r0
                    int r1 = r0.f24453x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f24453x = r1
                    goto L18
                L13:
                    pt.pingodoce.app.presentation.landing.lock.a$s$a$a r0 = new pt.pingodoce.app.presentation.landing.lock.a$s$a$a
                    r0.<init>(r12)
                L18:
                    java.lang.Object r12 = r0.f24452w
                    java.lang.Object r7 = cd.C2111b.m34640d()
                    int r1 = r0.f24453x
                    r8 = 2
                    r2 = 1
                    if (r1 == 0) goto L3c
                    if (r1 == r2) goto L34
                    if (r1 != r8) goto L2c
                    p468yc.C13186n.m1453b(r12)
                    goto L68
                L2c:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L34:
                    java.lang.Object r11 = r0.f24454y
                    kotlinx.coroutines.flow.d r11 = (kotlinx.coroutines.flow.InterfaceC6787d) r11
                    p468yc.C13186n.m1453b(r12)
                    goto L5c
                L3c:
                    p468yc.C13186n.m1453b(r12)
                    kotlinx.coroutines.flow.d r12 = r10.f24450w
                    java.lang.String r11 = (java.lang.String) r11
                    pt.pingodoce.app.presentation.landing.lock.a r1 = r10.f24451x
                    fm.d r1 = pt.pingodoce.app.presentation.landing.lock.LockViewModel.m11892h0(r1)
                    r3 = 0
                    r5 = 2
                    r6 = 0
                    r0.f24454y = r12
                    r0.f24453x = r2
                    r2 = r11
                    r4 = r0
                    java.lang.Object r11 = fm.C5580d.m23707d(r1, r2, r3, r4, r5, r6)
                    if (r11 != r7) goto L59
                    return r7
                L59:
                    r9 = r12
                    r12 = r11
                    r11 = r9
                L5c:
                    r1 = 0
                    r0.f24454y = r1
                    r0.f24453x = r8
                    java.lang.Object r11 = r11.mo4529a(r12, r0)
                    if (r11 != r7) goto L68
                    return r7
                L68:
                    yc.u r11 = p468yc.C13195u.f34156a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.landing.lock.LockViewModel.C9286s.C9287a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C9286s(InterfaceC6785c interfaceC6785c, LockViewModel lockViewModel) {
            this.f24448w = interfaceC6785c;
            this.f24449x = lockViewModel;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f24448w.mo20086d(new C9287a(interfaceC6787d, this.f24449x), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.a$t */
    /* loaded from: classes2.dex */
    public static final class C9289t<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return ((LoyaltyCard) obj).m13798n();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockViewModel(C1459l0 c1459l0, final ResourcesProvider resourcesProvider, C7405s1 c7405s1, SmsManager smsManager, ConsentsManager consentsManager, C5580d c5580d, AuthManager authManager, C7296j0 c7296j0, C7256f1 c7256f1, C7310l c7310l, LoyaltyCardManager loyaltyCardManager, StoreManager storeManager) {
        super(c1459l0, resourcesProvider);
        InterfaceC13178g m1464a;
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        Intrinsics.isThisObjectNull(smsManager, "smsManager");
        Intrinsics.isThisObjectNull(consentsManager, "consentsManager");
        Intrinsics.isThisObjectNull(c5580d, "zxingHelper");
        Intrinsics.isThisObjectNull(authManager, "authManager");
        Intrinsics.isThisObjectNull(c7296j0, "onboardingManager");
        Intrinsics.isThisObjectNull(c7256f1, "shoppingListManager");
        Intrinsics.isThisObjectNull(c7310l, "catalogManager");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        Intrinsics.isThisObjectNull(storeManager, "storeManager");
        this.f24388q = c7405s1;
        this.f24389r = c5580d;
        this.f24390s = authManager;
        this.f24391t = c7256f1;
        this.f24392u = c7310l;
        this.f24393v = storeManager;
        Boolean bool = Boolean.FALSE;
        C1436e0 m37003d = c1459l0.m37003d("_isAuthenticated", bool);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData(\"_isAuthenticated\", false)");
        this.f24394w = m37003d;
        C1436e0 c1436e0 = new C1436e0();
        this.f24395x = c1436e0;
        C1436e0 c1436e02 = new C1436e0();
        this.f24396y = c1436e02;
        C1436e0 c1436e03 = new C1436e0();
        this.f24397z = c1436e03;
        C1436e0 c1436e04 = new C1436e0();
        this.f24360A = c1436e04;
        C1436e0 c1436e05 = new C1436e0(c7256f1.m18813z());
        this.f24361B = c1436e05;
        LiveData m36993a = C1465n0.m36993a(c1436e03, new InterfaceC7946a() { // from class: fk.s
            @Override // p259o.InterfaceC7946a
            /* renamed from: a */
            public final Object mo37540b(Object obj) {
                List m10865a0;
                m10865a0 = LockViewModel.m11899a0(LockViewModel.this, (C13195u) obj);
                return m10865a0;
            }
        });
        Intrinsics.checkIfNull(m36993a, "map(_updateList) { shopp…getActiveListProducts() }");
        this.f24362C = m36993a;
        C1436e0 c1436e06 = new C1436e0(bool);
        this.f24363D = c1436e06;
        authManager.m18878r();
        m34576U(new LoginFlowData(null, BuildConfig.VERSION_NAME, null, false, false, 29, null));
        LiveData m106t = m106t(loyaltyCardManager.m18930p());
        this.f24364E = m106t;
        this.f24365F = m106t(new C9271j(c7405s1.m18500j()));
        LiveData m106t2 = m106t(loyaltyCardManager.m18930p());
        this.f24366G = m106t2;
        this.f24367H = m37003d;
        LiveData m36993a2 = C1465n0.m36993a(m106t, new C9276m());
        Intrinsics.checkIfNull(m36993a2, "Transformations.map(this) { transform(it) }");
        this.f24368I = m36993a2;
        LiveData m36993a3 = C1465n0.m36993a(m106t, new C9277n());
        Intrinsics.checkIfNull(m36993a3, "Transformations.map(this) { transform(it) }");
        this.f24369J = m36993a3;
        LiveData m106t3 = m106t(new C9278o(c7405s1.m18500j()));
        this.f24370K = m106t3;
        LiveData m36993a4 = C1465n0.m36993a(m106t3, new C9281p());
        Intrinsics.checkIfNull(m36993a4, "Transformations.map(this) { transform(it) }");
        this.f24371L = m36993a4;
        LiveData m106t4 = m106t(storeManager.m18757j());
        this.f24372M = m106t4;
        LiveData m36993a5 = C1465n0.m36993a(m106t4, new C9282q(resourcesProvider));
        Intrinsics.checkIfNull(m36993a5, "Transformations.map(this) { transform(it) }");
        this.f24373N = m36993a5;
        this.f24374O = c1436e0;
        this.f24375P = c1436e02;
        this.f24376Q = c1436e05;
        this.f24377R = c1436e04;
        LiveData m36993a6 = C1465n0.m36993a(m36993a, new InterfaceC7946a() { // from class: fk.t
            @Override // p259o.InterfaceC7946a
            /* renamed from: a */
            public final Object mo37540b(Object obj) {
                List m10842x0;
                m10842x0 = LockViewModel.m11876x0(LockViewModel.this, resourcesProvider, (List) obj);
                return m10842x0;
            }
        });
        Intrinsics.checkIfNull(m36993a6, "map(_fields) {\n        _…      return@map it\n    }");
        this.f24378S = m36993a6;
        this.f24379T = c1436e06;
        this.f24380U = m106t(new C9286s(new C9268i(new C9283r(loyaltyCardManager.m18930p())), this));
        LiveData m36993a7 = C1465n0.m36993a(m106t2, new C9289t());
        Intrinsics.checkIfNull(m36993a7, "Transformations.map(this) { transform(it) }");
        this.f24381V = m36993a7;
        LiveData m36993a8 = C1465n0.m36993a(m36993a7, new C9274k());
        Intrinsics.checkIfNull(m36993a8, "Transformations.map(this) { transform(it) }");
        this.f24382W = m36993a8;
        LiveData m36993a9 = C1465n0.m36993a(m36993a7, new C9275l());
        Intrinsics.checkIfNull(m36993a9, "Transformations.map(this) { transform(it) }");
        this.f24383X = m36993a9;
        C1436e0 c1436e07 = new C1436e0();
        this.f24384Y = c1436e07;
        this.f24385Z = c1436e07;
        this.f24386a0 = OperatorExtensions.m35177d(700L, C1473p0.m36987a(this), new C9263g());
        m1464a = LazyJVM.m1464a(new C9258c(resourcesProvider));
        this.f24387b0 = m1464a;
    }

    /* renamed from: A0 */
    private final ShoppingListCategory m11929A0() {
        return (ShoppingListCategory) this.f24387b0.getValue();
    }

    /* renamed from: T0 */
    private final void m11910T0() {
        this.f24397z.mo169m(C13195u.f34156a);
    }

    /* renamed from: V */
    public static /* synthetic */ List m11908V(LockViewModel lockViewModel, C13195u c13195u) {
        return m11899a0(lockViewModel, c13195u);
    }

    /* renamed from: W */
    public static /* synthetic */ void m11906W(LockViewModel lockViewModel, View view) {
        m11877w0(lockViewModel, view);
    }

    /* renamed from: X */
    public static /* synthetic */ void m11904X(LockViewModel lockViewModel, View view) {
        m11903X0(lockViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X0 */
    public static final void m11903X0(LockViewModel lockViewModel, View view) {
        Intrinsics.isThisObjectNull(lockViewModel, "this$0");
        lockViewModel.f24386a0.mo9587d(new C13182l(EnumC9256a.ENTER_SHOPPING_LIST, C13195u.f34156a));
    }

    /* renamed from: Y */
    public static /* synthetic */ void m11902Y(LockViewModel lockViewModel, View view) {
        m11882r0(lockViewModel, view);
    }

    /* renamed from: Y0 */
    private final Object m11901Y0(User user, EnumC9256a enumC9256a, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        m34576U(new LoginFlowData(null, user.m18185h(), null, this.f24388q.m18492r(), false, 21, null));
        if (user.m18193L()) {
            this.f24388q.m18491s(true);
        }
        if (!user.m18193L() && !user.m18194K()) {
            Object m11880t0 = m11880t0(enumC9256a, interfaceC1886d);
            m34636d = C2116d.m34636d();
            return m11880t0 == m34636d ? m11880t0 : C13195u.f34156a;
        }
        m120B(C13870l1.f34987a, LoginFlowData.m14748e((LoginFlowData) m34578S(), null, user.m18185h(), null, this.f24388q.m18492r(), false, 21, null));
        return C13195u.f34156a;
    }

    /* renamed from: Z */
    public static /* synthetic */ List m11900Z(LockViewModel lockViewModel, ResourcesProvider resourcesProvider, List list) {
        return m11876x0(lockViewModel, resourcesProvider, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static final List m11899a0(LockViewModel lockViewModel, C13195u c13195u) {
        Intrinsics.isThisObjectNull(lockViewModel, "this$0");
        return lockViewModel.f24391t.m18822q();
    }

    /* renamed from: b0 */
    public static final /* synthetic */ BitmapDrawable m11898b0(LockViewModel lockViewModel, LoyaltyCard loyaltyCard) {
        return lockViewModel.m11881s0(loyaltyCard);
    }

    /* renamed from: c0 */
    public static final /* synthetic */ Object m11897c0(LockViewModel lockViewModel, EnumC9256a enumC9256a, InterfaceC1886d interfaceC1886d) {
        return lockViewModel.m11880t0(enumC9256a, interfaceC1886d);
    }

    /* renamed from: d0 */
    public static final /* synthetic */ Object m11896d0(LockViewModel lockViewModel, EnumC9256a enumC9256a, InterfaceC1886d interfaceC1886d) {
        return lockViewModel.m11879u0(enumC9256a, interfaceC1886d);
    }

    /* renamed from: e0 */
    public static final /* synthetic */ C7310l m11895e0(LockViewModel lockViewModel) {
        return lockViewModel.f24392u;
    }

    /* renamed from: f0 */
    public static final /* synthetic */ ResourcesProvider m11894f0(LockViewModel lockViewModel) {
        return lockViewModel.m20390g();
    }

    /* renamed from: g0 */
    public static final /* synthetic */ C7256f1 m11893g0(LockViewModel lockViewModel) {
        return lockViewModel.f24391t;
    }

    /* renamed from: h0 */
    public static final /* synthetic */ C5580d m11892h0(LockViewModel lockViewModel) {
        return lockViewModel.f24389r;
    }

    /* renamed from: i0 */
    public static final /* synthetic */ C1436e0 m11891i0(LockViewModel lockViewModel) {
        return lockViewModel.f24361B;
    }

    /* renamed from: j0 */
    public static final /* synthetic */ C1436e0 m11890j0(LockViewModel lockViewModel) {
        return lockViewModel.f24363D;
    }

    /* renamed from: k0 */
    public static final /* synthetic */ C1436e0 m11889k0(LockViewModel lockViewModel) {
        return lockViewModel.f24360A;
    }

    /* renamed from: l0 */
    public static final /* synthetic */ void m11888l0(LockViewModel lockViewModel, String str) {
        lockViewModel.m110k(str);
    }

    /* renamed from: m0 */
    public static final /* synthetic */ void m11887m0(LockViewModel lockViewModel, Throwable th2) {
        lockViewModel.m109l(th2);
    }

    /* renamed from: n0 */
    public static final /* synthetic */ void m11886n0(LockViewModel lockViewModel) {
        lockViewModel.m11910T0();
    }

    /* renamed from: o0 */
    public static final /* synthetic */ Object m11885o0(LockViewModel lockViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return lockViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public static final void m11882r0(LockViewModel lockViewModel, View view) {
        Intrinsics.isThisObjectNull(lockViewModel, "this$0");
        lockViewModel.f24386a0.mo9587d(new C13182l(EnumC9256a.ENTER_BENEFITS, C13195u.f34156a));
    }

    /* renamed from: s0 */
    private final BitmapDrawable m11881s0(LoyaltyCard loyaltyCard) {
        return new BitmapDrawable(m20390g().m6899a().getResources(), loyaltyCard.m13809a());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m11880t0(pt.pingodoce.app.presentation.landing.lock.LockViewModel.EnumC9256a r11, bd.InterfaceC1886d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof pt.pingodoce.app.presentation.landing.lock.LockViewModel.C9259d
            if (r0 == 0) goto L13
            r0 = r12
            pt.pingodoce.app.presentation.landing.lock.a$d r0 = (pt.pingodoce.app.presentation.landing.lock.LockViewModel.C9259d) r0
            int r1 = r0.f24403z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24403z = r1
            goto L18
        L13:
            pt.pingodoce.app.presentation.landing.lock.a$d r0 = new pt.pingodoce.app.presentation.landing.lock.a$d
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f24401x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f24403z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r11 = r0.f24400w
            pt.pingodoce.app.presentation.landing.lock.a r11 = (pt.pingodoce.app.presentation.landing.lock.LockViewModel) r11
            p468yc.C13186n.m1453b(r12)
            goto L67
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            p468yc.C13186n.m1453b(r12)
            boolean r12 = r10.m11911S0()
            r2 = 2
            if (r12 == 0) goto L46
            zh.l0 r11 = p494zh.C13869l0.f34986a
            p494zh.BaseViewModel.m119C(r10, r11, r3, r2, r3)
            goto Lab
        L46:
            int[] r12 = pt.pingodoce.app.presentation.landing.lock.LockViewModel.C9257b.f24398a
            int r11 = r11.ordinal()
            r11 = r12[r11]
            if (r11 == r4) goto La2
            if (r11 == r2) goto L98
            r12 = 3
            if (r11 == r12) goto L8e
            r12 = 4
            if (r11 == r12) goto L59
            goto Lab
        L59:
            mg.j1 r11 = r10.f24393v
            r0.f24400w = r10
            r0.f24403z = r4
            java.lang.Object r12 = r11.m18760g(r0)
            if (r12 != r1) goto L66
            return r1
        L66:
            r11 = r10
        L67:
            og.a r12 = (p276og.Result) r12
            java.lang.Object r12 = r12.m16966a()
            if (r12 == 0) goto L83
            r11.m11910T0()
            td.i0 r4 = androidx.lifecycle.C1473p0.m36987a(r11)
            r5 = 0
            r6 = 0
            pt.pingodoce.app.presentation.landing.lock.a$e r7 = new pt.pingodoce.app.presentation.landing.lock.a$e
            r7.<init>(r3)
            r8 = 3
            r9 = 0
            kotlinx.coroutines.C6769b.m20167d(r4, r5, r6, r7, r8, r9)
            goto Lab
        L83:
            androidx.lifecycle.e0 r11 = r11.f24363D
            r12 = 0
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r12)
            r11.mo166p(r12)
            goto Lab
        L8e:
            zh.f2 r11 = p494zh.C13833f2.f34941a
            pt.pingodoce.app.data.local.flows.FlowData r12 = r10.m34578S()
            r10.m120B(r11, r12)
            goto Lab
        L98:
            zh.q r11 = p494zh.C13890q.f35011a
            pt.pingodoce.app.data.local.flows.FlowData r12 = r10.m34578S()
            r10.m120B(r11, r12)
            goto Lab
        La2:
            zh.v2 r11 = p494zh.C13913v2.f35034a
            pt.pingodoce.app.data.local.flows.FlowData r12 = r10.m34578S()
            r10.m120B(r11, r12)
        Lab:
            yc.u r11 = p468yc.C13195u.f34156a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.landing.lock.LockViewModel.m11880t0(pt.pingodoce.app.presentation.landing.lock.a$a, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* renamed from: u0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m11879u0(pt.pingodoce.app.presentation.landing.lock.LockViewModel.EnumC9256a r6, bd.InterfaceC1886d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof pt.pingodoce.app.presentation.landing.lock.LockViewModel.C9262f
            if (r0 == 0) goto L13
            r0 = r7
            pt.pingodoce.app.presentation.landing.lock.a$f r0 = (pt.pingodoce.app.presentation.landing.lock.LockViewModel.C9262f) r0
            int r1 = r0.f24410A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24410A = r1
            goto L18
        L13:
            pt.pingodoce.app.presentation.landing.lock.a$f r0 = new pt.pingodoce.app.presentation.landing.lock.a$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f24413y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f24410A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p468yc.C13186n.m1453b(r7)
            goto L72
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f24412x
            pt.pingodoce.app.presentation.landing.lock.a$a r6 = (pt.pingodoce.app.presentation.landing.lock.LockViewModel.EnumC9256a) r6
            java.lang.Object r2 = r0.f24411w
            pt.pingodoce.app.presentation.landing.lock.a r2 = (pt.pingodoce.app.presentation.landing.lock.LockViewModel) r2
            p468yc.C13186n.m1453b(r7)
            goto L53
        L40:
            p468yc.C13186n.m1453b(r7)
            mg.s1 r7 = r5.f24388q
            r0.f24411w = r5
            r0.f24412x = r6
            r0.f24410A = r4
            java.lang.Object r7 = r7.m18501i(r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            og.a r7 = (p276og.Result) r7
            boolean r4 = r7 instanceof p276og.Result.C8078c
            if (r4 == 0) goto L75
            og.a$c r7 = (p276og.Result.C8078c) r7
            java.lang.Object r7 = r7.m16962b()
            p181jd.Intrinsics.ifNullDoSomething(r7)
            module.network.data.remote.models.user.User r7 = (module.network.data.remote.models.user.User) r7
            r4 = 0
            r0.f24411w = r4
            r0.f24412x = r4
            r0.f24410A = r3
            java.lang.Object r6 = r2.m11901Y0(r7, r6, r0)
            if (r6 != r1) goto L72
            return r1
        L72:
            yc.u r6 = p468yc.C13195u.f34156a
            return r6
        L75:
            boolean r6 = r7 instanceof p276og.Result.C8077b
            if (r6 == 0) goto L82
            og.a$b r7 = (p276og.Result.C8077b) r7
            java.lang.Throwable r6 = r7.m16964b()
            r2.m109l(r6)
        L82:
            yc.u r6 = p468yc.C13195u.f34156a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.landing.lock.LockViewModel.m11879u0(pt.pingodoce.app.presentation.landing.lock.a$a, bd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static final void m11877w0(LockViewModel lockViewModel, View view) {
        Intrinsics.isThisObjectNull(lockViewModel, "this$0");
        lockViewModel.f24386a0.mo9587d(new C13182l(EnumC9256a.ENTER_APP, C13195u.f34156a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public static final List m11876x0(LockViewModel lockViewModel, ResourcesProvider resourcesProvider, List list) {
        Intrinsics.isThisObjectNull(lockViewModel, "this$0");
        Intrinsics.isThisObjectNull(resourcesProvider, "$resourcesProvider");
        lockViewModel.f24395x.mo166p(lockViewModel.f24391t.m18859B());
        C1436e0 c1436e0 = lockViewModel.f24396y;
        String quantityString = resourcesProvider.m6899a().getResources().getQuantityString(C2336R.plurals.lbl_shopping_list_item_count_plurals, lockViewModel.f24391t.m18814y(), Arrays.copyOf(new Object[]{Integer.valueOf(lockViewModel.f24391t.m18814y())}, 1));
        Intrinsics.checkIfNull(quantityString, "ctx.resources.getQuantit…d, quantity, *formatArgs)");
        c1436e0.mo166p(quantityString);
        lockViewModel.m20381p(list.isEmpty());
        return list;
    }

    /* renamed from: B0 */
    public final LiveData m11928B0() {
        return this.f24368I;
    }

    /* renamed from: C0 */
    public final LiveData m11927C0() {
        return this.f24369J;
    }

    /* renamed from: D0 */
    public final LiveData m11926D0() {
        return this.f24378S;
    }

    /* renamed from: E0 */
    public final LiveData m11925E0() {
        return this.f24371L;
    }

    /* renamed from: F0 */
    public final LiveData m11924F0() {
        return this.f24376Q;
    }

    /* renamed from: G0 */
    public final LiveData m11923G0() {
        return this.f24379T;
    }

    /* renamed from: H0 */
    public final LiveData m11922H0() {
        return this.f24366G;
    }

    /* renamed from: I0 */
    public final LiveData m11921I0() {
        return this.f24380U;
    }

    /* renamed from: J0 */
    public final LiveData m11920J0() {
        return this.f24375P;
    }

    /* renamed from: K0 */
    public final LiveData m11919K0() {
        return this.f24374O;
    }

    /* renamed from: L0 */
    public final LiveData m11918L0() {
        return this.f24365F;
    }

    /* renamed from: M0 */
    public final LiveData m11917M0() {
        return this.f24373N;
    }

    /* renamed from: N0 */
    public final LiveData m11916N0() {
        return this.f24377R;
    }

    /* renamed from: O0 */
    public final LiveData m11915O0() {
        return this.f24385Z;
    }

    /* renamed from: P0 */
    public final LiveData m11914P0() {
        return this.f24370K;
    }

    /* renamed from: Q0 */
    public final Object m11913Q0(InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m11879u0 = m11879u0(EnumC9256a.ENTER_SHOPPING_ACTIVITY, interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m11879u0 == m34636d ? m11879u0 : C13195u.f34156a;
    }

    /* renamed from: R0 */
    public final LiveData m11912R0() {
        return this.f24367H;
    }

    /* renamed from: S0 */
    public final boolean m11911S0() {
        return Intrinsics.equals(this.f24394w.mo172f(), Boolean.TRUE);
    }

    /* renamed from: U0 */
    public final void m11909U0(String str) {
        Intrinsics.isThisObjectNull(str, "ean");
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9266h(str, null), 3, null);
    }

    /* renamed from: V0 */
    public final void m11907V0(boolean z) {
        if (z) {
            this.f24390s.m18899A();
        } else {
            this.f24390s.m18878r();
        }
        this.f24394w.mo166p(Boolean.valueOf(z));
    }

    /* renamed from: W0 */
    public final View.OnClickListener m11905W0() {
        return new View.OnClickListener() { // from class: fk.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LockViewModel.m11903X0(LockViewModel.this, view);
            }
        };
    }

    /* renamed from: p0 */
    public final void m11884p0(String str) {
        Intrinsics.isThisObjectNull(str, "query");
        this.f24391t.m18833f(new LiteralProduct(null, 0L, m11929A0(), str, 0, false, null, 0, 0, false, 1011, null));
        m11910T0();
    }

    /* renamed from: q0 */
    public final View.OnClickListener m11883q0() {
        return new View.OnClickListener() { // from class: fk.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LockViewModel.m11882r0(LockViewModel.this, view);
            }
        };
    }

    /* renamed from: v0 */
    public final View.OnClickListener m11878v0() {
        return new View.OnClickListener() { // from class: fk.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LockViewModel.m11877w0(LockViewModel.this, view);
            }
        };
    }

    /* renamed from: y0 */
    public final LiveData m11875y0() {
        return this.f24382W;
    }

    /* renamed from: z0 */
    public final LiveData m11874z0() {
        return this.f24383X;
    }
}
