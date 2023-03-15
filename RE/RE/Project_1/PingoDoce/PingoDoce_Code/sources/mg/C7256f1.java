package mg;

import ad.C0127b;
import androidx.constraintlayout.widget.C0868i;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.crypto.tink.shaded.protobuf.Reader;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kg.InterfaceC6661b;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6770c;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p066dg.LoyaltyCardAgent;
import p066dg.UserProfileAgent;
import p181jd.Intrinsics;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13769l0;
import p489zc.Iterables;
import p489zc._Collections;
import pt.pingodoce.app.data.local.models.products.Category;
import pt.pingodoce.app.data.local.models.products.PriceCalculation;
import pt.pingodoce.app.data.local.models.shoppinglist.Friend;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListCategory;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct;
import pt.pingodoce.app.data.remote.models.response.ShoppingList;
import sd.C10171u;
import td.InterfaceC10524i0;
import vg.ShoppingListService;

/* compiled from: ShoppingListManager.kt */
/* renamed from: mg.f1 */
/* loaded from: classes2.dex */
public final class C7256f1 {

    /* renamed from: a */
    private final ShoppingListService f19186a;

    /* renamed from: b */
    private final PrefsManager f19187b;

    /* renamed from: c */
    private final LoyaltyCardAgent f19188c;

    /* renamed from: d */
    private final UserProfileAgent f19189d;

    /* renamed from: e */
    private final SimpleDateFormat f19190e;

    /* renamed from: f */
    private final DateTimeFormatter f19191f;

    /* renamed from: g */
    private ShoppingList f19192g;

    /* renamed from: h */
    private HashMap f19193h;

    /* renamed from: i */
    private Map f19194i;

    /* renamed from: j */
    private String f19195j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ShoppingListManager", m20196f = "ShoppingListManager.kt", m20195l = {314}, m20194m = "add")
    /* renamed from: mg.f1$a */
    /* loaded from: classes2.dex */
    public static final class C7257a extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19196w;

        /* renamed from: y */
        int f19198y;

        C7257a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19196w = obj;
            this.f19198y |= Integer.MIN_VALUE;
            return C7256f1.this.m18835d(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ShoppingListManager", m20196f = "ShoppingListManager.kt", m20195l = {359}, m20194m = "calculatePriceWithPromotion")
    /* renamed from: mg.f1$b */
    /* loaded from: classes2.dex */
    public static final class C7258b extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19199w;

        /* renamed from: y */
        int f19201y;

        C7258b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19199w = obj;
            this.f19201y |= Integer.MIN_VALUE;
            return C7256f1.this.m18832g(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ShoppingListManager", m20196f = "ShoppingListManager.kt", m20195l = {367}, m20194m = "checkout")
    /* renamed from: mg.f1$c */
    /* loaded from: classes2.dex */
    public static final class C7259c extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19202w;

        /* renamed from: y */
        int f19204y;

        C7259c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19202w = obj;
            this.f19204y |= Integer.MIN_VALUE;
            return C7256f1.this.m18830i(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ShoppingListManager", m20196f = "ShoppingListManager.kt", m20195l = {307}, m20194m = "create")
    /* renamed from: mg.f1$d */
    /* loaded from: classes2.dex */
    public static final class C7260d extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19205w;

        /* renamed from: y */
        int f19207y;

        C7260d(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19205w = obj;
            this.f19207y |= Integer.MIN_VALUE;
            return C7256f1.this.m18827l(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ShoppingListManager", m20196f = "ShoppingListManager.kt", m20195l = {331}, m20194m = "delete")
    /* renamed from: mg.f1$e */
    /* loaded from: classes2.dex */
    public static final class C7261e extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19208w;

        /* renamed from: y */
        int f19210y;

        C7261e(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19208w = obj;
            this.f19210y |= Integer.MIN_VALUE;
            return C7256f1.this.m18826m(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ShoppingListManager", m20196f = "ShoppingListManager.kt", m20195l = {323, 326}, m20194m = "deleteActiveList")
    /* renamed from: mg.f1$f */
    /* loaded from: classes2.dex */
    public static final class C7262f extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19211w;

        /* renamed from: y */
        int f19213y;

        C7262f(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19211w = obj;
            this.f19213y |= Integer.MIN_VALUE;
            return C7256f1.this.m18825n(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ShoppingListManager", m20196f = "ShoppingListManager.kt", m20195l = {340}, m20194m = "enterStoreMode")
    /* renamed from: mg.f1$g */
    /* loaded from: classes2.dex */
    public static final class C7263g extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19214w;

        /* renamed from: y */
        int f19216y;

        C7263g(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19214w = obj;
            this.f19216y |= Integer.MIN_VALUE;
            return C7256f1.this.m18824o(null, this);
        }
    }

    /* compiled from: Comparisons.kt */
    /* renamed from: mg.f1$h */
    /* loaded from: classes2.dex */
    public static final class C7264h<T> implements Comparator {
        public final int compare(Object obj, Object obj2) {
            int m41795a;
            m41795a = C0127b.m41795a(Integer.valueOf(((ShoppingListProduct) obj).m14330m()), Integer.valueOf(((ShoppingListProduct) obj2).m14330m()));
            return m41795a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ShoppingListManager", m20196f = "ShoppingListManager.kt", m20195l = {112}, m20194m = "getActiveUsersFromActiveList")
    /* renamed from: mg.f1$i */
    /* loaded from: classes2.dex */
    public static final class C7265i extends AbstractC6757d {

        /* renamed from: w */
        Object f19217w;

        /* renamed from: x */
        /* synthetic */ Object f19218x;

        /* renamed from: z */
        int f19220z;

        C7265i(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19218x = obj;
            this.f19220z |= Integer.MIN_VALUE;
            return C7256f1.this.m18819t(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ShoppingListManager", m20196f = "ShoppingListManager.kt", m20195l = {235, 238}, m20194m = "getAllLists")
    /* renamed from: mg.f1$j */
    /* loaded from: classes2.dex */
    public static final class C7266j extends AbstractC6757d {

        /* renamed from: w */
        Object f19221w;

        /* renamed from: x */
        /* synthetic */ Object f19222x;

        /* renamed from: z */
        int f19224z;

        C7266j(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19222x = obj;
            this.f19224z |= Integer.MIN_VALUE;
            return C7256f1.this.m18818u(this);
        }
    }

    /* compiled from: Comparisons.kt */
    /* renamed from: mg.f1$k */
    /* loaded from: classes2.dex */
    public static final class C7267k<T> implements Comparator {
        public final int compare(Object obj, Object obj2) {
            int m41795a;
            m41795a = C0127b.m41795a(Boolean.valueOf(!((Friend) obj).m14394j()), Boolean.valueOf(!((Friend) obj2).m14394j()));
            return m41795a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ShoppingListManager", m20196f = "ShoppingListManager.kt", m20195l = {261}, m20194m = "getDefaultList")
    /* renamed from: mg.f1$l */
    /* loaded from: classes2.dex */
    public static final class C7268l extends AbstractC6757d {

        /* renamed from: w */
        Object f19225w;

        /* renamed from: x */
        /* synthetic */ Object f19226x;

        /* renamed from: z */
        int f19228z;

        C7268l(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19226x = obj;
            this.f19228z |= Integer.MIN_VALUE;
            return C7256f1.this.m18816w(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ShoppingListManager", m20196f = "ShoppingListManager.kt", m20195l = {251}, m20194m = "getListsCount")
    /* renamed from: mg.f1$m */
    /* loaded from: classes2.dex */
    public static final class C7269m extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19229w;

        /* renamed from: y */
        int f19231y;

        C7269m(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19229w = obj;
            this.f19231y |= Integer.MIN_VALUE;
            return C7256f1.this.m18860A(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ShoppingListManager$getListsCount$result$1", m20196f = "ShoppingListManager.kt", m20195l = {252}, m20194m = "invokeSuspend")
    /* renamed from: mg.f1$n */
    /* loaded from: classes2.dex */
    public static final class C7270n extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19232x;

        C7270n(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7270n(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7270n) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19232x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListService m18836c = C7256f1.m18836c(C7256f1.this);
                this.f19232x = 1;
                obj = m18836c.m5579t(this);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ShoppingListManager$isActiveListOwner$1", m20196f = "ShoppingListManager.kt", m20195l = {C0868i.f2763F0}, m20194m = "invokeSuspend")
    /* renamed from: mg.f1$o */
    /* loaded from: classes2.dex */
    public static final class C7271o extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f19234x;

        C7271o(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C7271o(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C7271o) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19234x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C7256f1 c7256f1 = C7256f1.this;
                ShoppingList m18837b = C7256f1.m18837b(c7256f1);
                this.f19234x = 1;
                obj = c7256f1.m18856E(m18837b, this);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ShoppingListManager", m20196f = "ShoppingListManager.kt", m20195l = {C0868i.f2768G0}, m20194m = "isListOwner")
    /* renamed from: mg.f1$p */
    /* loaded from: classes2.dex */
    public static final class C7272p extends AbstractC6757d {

        /* renamed from: w */
        Object f19236w;

        /* renamed from: x */
        /* synthetic */ Object f19237x;

        /* renamed from: z */
        int f19239z;

        C7272p(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19237x = obj;
            this.f19239z |= Integer.MIN_VALUE;
            return C7256f1.this.m18856E(null, this);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: mg.f1$q */
    /* loaded from: classes2.dex */
    public static final class C7273q implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f19240w;

        /* compiled from: Emitters.kt */
        /* renamed from: mg.f1$q$a */
        /* loaded from: classes2.dex */
        public static final class C7274a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f19241w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ShoppingListManager$observeHasLoyaltyCard$$inlined$map$1$2", m20196f = "ShoppingListManager.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: mg.f1$q$a$a */
            /* loaded from: classes2.dex */
            public static final class C7275a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f19242w;

                /* renamed from: x */
                int f19243x;

                public C7275a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f19242w = obj;
                    this.f19243x |= Integer.MIN_VALUE;
                    return C7274a.this.mo4529a(null, this);
                }
            }

            public C7274a(InterfaceC6787d interfaceC6787d) {
                this.f19241w = interfaceC6787d;
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
                    boolean r0 = r6 instanceof mg.C7256f1.C7273q.C7274a.C7275a
                    if (r0 == 0) goto L13
                    r0 = r6
                    mg.f1$q$a$a r0 = (mg.C7256f1.C7273q.C7274a.C7275a) r0
                    int r1 = r0.f19243x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f19243x = r1
                    goto L18
                L13:
                    mg.f1$q$a$a r0 = new mg.f1$q$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f19242w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f19243x
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
                    kotlinx.coroutines.flow.d r6 = r4.f19241w
                    pt.pingodoce.app.data.remote.models.response.LoyaltyCard r5 = (pt.pingodoce.app.data.remote.models.response.LoyaltyCard) r5
                    pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardStatus r5 = r5.m13808b()
                    boolean r5 = r5.isApproved()
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r5)
                    r0.f19243x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L4d
                    return r1
                L4d:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: mg.C7256f1.C7273q.C7274a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C7273q(InterfaceC6785c interfaceC6785c) {
            this.f19240w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f19240w.mo20086d(new C7274a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ShoppingListManager", m20196f = "ShoppingListManager.kt", m20195l = {275}, m20194m = "setDefault")
    /* renamed from: mg.f1$r */
    /* loaded from: classes2.dex */
    public static final class C7276r extends AbstractC6757d {

        /* renamed from: w */
        Object f19245w;

        /* renamed from: x */
        /* synthetic */ Object f19246x;

        /* renamed from: z */
        int f19248z;

        C7276r(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19246x = obj;
            this.f19248z |= Integer.MIN_VALUE;
            return C7256f1.this.m18851J(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ShoppingListManager", m20196f = "ShoppingListManager.kt", m20195l = {285, 289}, m20194m = "sync")
    /* renamed from: mg.f1$s */
    /* loaded from: classes2.dex */
    public static final class C7277s extends AbstractC6757d {

        /* renamed from: A */
        int f19249A;

        /* renamed from: w */
        Object f19250w;

        /* renamed from: x */
        boolean f19251x;

        /* renamed from: y */
        /* synthetic */ Object f19252y;

        C7277s(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19252y = obj;
            this.f19249A |= Integer.MIN_VALUE;
            return C7256f1.this.m18847N(false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ShoppingListManager", m20196f = "ShoppingListManager.kt", m20195l = {348}, m20194m = "updateWritePermissions")
    /* renamed from: mg.f1$t */
    /* loaded from: classes2.dex */
    public static final class C7278t extends AbstractC6757d {

        /* renamed from: A */
        int f19254A;

        /* renamed from: w */
        Object f19255w;

        /* renamed from: x */
        Object f19256x;

        /* renamed from: y */
        /* synthetic */ Object f19257y;

        C7278t(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19257y = obj;
            this.f19254A |= Integer.MIN_VALUE;
            return C7256f1.this.m18839V(null, this);
        }
    }

    public C7256f1(ShoppingListService shoppingListService, PrefsManager prefsManager, EncryptedPrefsManager encryptedPrefsManager, LoyaltyCardAgent loyaltyCardAgent, UserProfileAgent userProfileAgent, SimpleDateFormat simpleDateFormat) {
        Map m322q;
        Intrinsics.isThisObjectNull(shoppingListService, "service");
        Intrinsics.isThisObjectNull(prefsManager, "prefsManager");
        Intrinsics.isThisObjectNull(encryptedPrefsManager, "encryptedPrefsManager");
        Intrinsics.isThisObjectNull(loyaltyCardAgent, "loyaltyCardAgent");
        Intrinsics.isThisObjectNull(userProfileAgent, "userProfileAgent");
        Intrinsics.isThisObjectNull(simpleDateFormat, "dateFormat");
        this.f19186a = shoppingListService;
        this.f19187b = prefsManager;
        this.f19188c = loyaltyCardAgent;
        this.f19189d = userProfileAgent;
        this.f19190e = simpleDateFormat;
        this.f19191f = DateTimeFormat.forPattern("dd/MM/YY, HH:mm").withLocale(new Locale("pt"));
        ShoppingList m18528i = prefsManager.m18528i();
        this.f19192g = m18528i;
        this.f19193h = m18853H(m18528i.m13735m());
        m322q = C13769l0.m322q(prefsManager.m18531f());
        this.f19194i = m322q;
    }

    /* renamed from: H */
    private final LinkedHashMap m18853H(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ShoppingListProduct shoppingListProduct = (ShoppingListProduct) it.next();
            linkedHashMap.put(shoppingListProduct.m14331k(), shoppingListProduct.m14340a());
        }
        return linkedHashMap;
    }

    /* renamed from: K */
    private final void m18850K() {
        ShoppingList m18528i = this.f19187b.m18528i();
        this.f19192g = m18528i;
        this.f19193h = m18853H(m18528i.m13735m());
    }

    /* renamed from: L */
    private final void m18849L(ShoppingList shoppingList) {
        this.f19192g = shoppingList;
        this.f19193h = m18853H(shoppingList.m13735m());
        m18845P();
    }

    /* renamed from: O */
    public static /* synthetic */ Object m18846O(C7256f1 c7256f1, boolean z, InterfaceC1886d interfaceC1886d, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c7256f1.m18847N(z, interfaceC1886d);
    }

    /* renamed from: P */
    private final void m18845P() {
        this.f19192g.m13735m().clear();
        List m13735m = this.f19192g.m13735m();
        Collection values = this.f19193h.values();
        Intrinsics.checkIfNull(values, "activeProductMap.values");
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (obj instanceof ShoppingListProduct) {
                arrayList.add(obj);
            }
        }
        m13735m.addAll(arrayList);
        this.f19187b.m18549K(this.f19192g);
    }

    /* renamed from: a */
    public static /* synthetic */ int m18838a(InterfaceC6661b interfaceC6661b, InterfaceC6661b interfaceC6661b2) {
        return m18820s(interfaceC6661b, interfaceC6661b2);
    }

    /* renamed from: b */
    public static final /* synthetic */ ShoppingList m18837b(C7256f1 c7256f1) {
        return c7256f1.f19192g;
    }

    /* renamed from: c */
    public static final /* synthetic */ ShoppingListService m18836c(C7256f1 c7256f1) {
        return c7256f1.f19186a;
    }

    /* renamed from: s */
    private static final int m18820s(InterfaceC6661b interfaceC6661b, InterfaceC6661b interfaceC6661b2) {
        boolean z = interfaceC6661b instanceof ShoppingListCategory;
        if (z && (interfaceC6661b2 instanceof ShoppingListCategory)) {
            return ((ShoppingListCategory) interfaceC6661b).m14360b((ShoppingListCategory) interfaceC6661b2);
        }
        if (z && !(interfaceC6661b2 instanceof ShoppingListCategory)) {
            Objects.requireNonNull(interfaceC6661b2, "null cannot be cast to non-null type pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct");
            return ((ShoppingListCategory) interfaceC6661b).m14360b(((ShoppingListProduct) interfaceC6661b2).m14335f());
        } else if (!z && (interfaceC6661b2 instanceof ShoppingListCategory)) {
            Objects.requireNonNull(interfaceC6661b, "null cannot be cast to non-null type pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct");
            return ((ShoppingListProduct) interfaceC6661b).m14335f().m14360b((ShoppingListCategory) interfaceC6661b2);
        } else {
            Objects.requireNonNull(interfaceC6661b, "null cannot be cast to non-null type pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct");
            ShoppingListProduct shoppingListProduct = (ShoppingListProduct) interfaceC6661b;
            Objects.requireNonNull(interfaceC6661b2, "null cannot be cast to non-null type pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct");
            ShoppingListProduct shoppingListProduct2 = (ShoppingListProduct) interfaceC6661b2;
            if (Intrinsics.equals(shoppingListProduct.m14335f(), shoppingListProduct2.m14335f())) {
                return Intrinsics.compare(shoppingListProduct.m14324w(), shoppingListProduct2.m14324w());
            }
            return shoppingListProduct.m14335f().m14360b(shoppingListProduct2.m14335f());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18860A(bd.InterfaceC1886d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof mg.C7256f1.C7269m
            if (r0 == 0) goto L13
            r0 = r5
            mg.f1$m r0 = (mg.C7256f1.C7269m) r0
            int r1 = r0.f19231y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19231y = r1
            goto L18
        L13:
            mg.f1$m r0 = new mg.f1$m
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19229w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19231y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r5)
            mg.f1$n r5 = new mg.f1$n
            r2 = 0
            r5.<init>(r2)
            r0.f19231y = r3
            java.lang.Object r5 = p276og.C8079b.m16960b(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            og.a r5 = (p276og.Result) r5
            boolean r0 = r5 instanceof p276og.Result.C8078c
            if (r0 == 0) goto L56
            og.a$c r5 = (p276og.Result.C8078c) r5
            java.lang.Object r5 = r5.m16962b()
            java.lang.Number r5 = (java.lang.Number) r5
            int r3 = r5.intValue()
            goto L5a
        L56:
            boolean r5 = r5 instanceof p276og.Result.C8077b
            if (r5 == 0) goto L5f
        L5a:
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.C6755b.m20199c(r3)
            return r5
        L5f:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7256f1.m18860A(bd.d):java.lang.Object");
    }

    /* renamed from: B */
    public final String m18859B() {
        return this.f19192g.m13736k();
    }

    /* renamed from: C */
    public final ShoppingListCategory m18858C(int i) {
        return (ShoppingListCategory) this.f19194i.get(Integer.valueOf(i));
    }

    /* renamed from: D */
    public final boolean m18857D() {
        Object m20162b;
        m20162b = C6770c.m20162b(null, new C7271o(null), 1, null);
        return ((Boolean) m20162b).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18856E(pt.pingodoce.app.data.remote.models.response.ShoppingList r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mg.C7256f1.C7272p
            if (r0 == 0) goto L13
            r0 = r6
            mg.f1$p r0 = (mg.C7256f1.C7272p) r0
            int r1 = r0.f19239z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19239z = r1
            goto L18
        L13:
            mg.f1$p r0 = new mg.f1$p
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19237x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19239z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f19236w
            java.lang.String r5 = (java.lang.String) r5
            p468yc.C13186n.m1453b(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            p468yc.C13186n.m1453b(r6)
            java.lang.String r5 = r5.m13734n()
            dg.b0 r6 = r4.f19189d
            r0.f19236w = r5
            r0.f19239z = r3
            java.lang.Object r6 = r6.m25771D(r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            module.network.data.remote.models.user.User r6 = (module.network.data.remote.models.user.User) r6
            if (r6 == 0) goto L52
            java.lang.String r6 = r6.m18174y()
            goto L53
        L52:
            r6 = 0
        L53:
            boolean r5 = p181jd.Intrinsics.equals(r5, r6)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7256f1.m18856E(pt.pingodoce.app.data.remote.models.response.ShoppingList, bd.d):java.lang.Object");
    }

    /* renamed from: F */
    public final boolean m18855F(int i) {
        return this.f19194i.containsKey(Integer.valueOf(i));
    }

    /* renamed from: G */
    public final InterfaceC6785c m18854G() {
        return new C7273q(this.f19188c.m25740E());
    }

    /* renamed from: I */
    public final void m18852I(ShoppingListProduct shoppingListProduct, boolean z) {
        Intrinsics.isThisObjectNull(shoppingListProduct, "item");
        InterfaceC6661b interfaceC6661b = (InterfaceC6661b) this.f19193h.get(shoppingListProduct.m14331k());
        if (interfaceC6661b != null) {
            ShoppingListProduct shoppingListProduct2 = (ShoppingListProduct) interfaceC6661b;
            HashMap hashMap = this.f19193h;
            String m14331k = shoppingListProduct2.m14331k();
            ShoppingListProduct m14340a = shoppingListProduct2.m14340a();
            m14340a.m14345I(true);
            String format = this.f19190e.format(new Date());
            Intrinsics.checkIfNull(format, "dateFormat.format(Date())");
            m14340a.m14346H(format);
            hashMap.put(m14331k, m14340a);
            this.f19195j = shoppingListProduct2.m14331k();
        }
        if (!z) {
            this.f19195j = null;
        }
        m18845P();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18851J(java.lang.String r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mg.C7256f1.C7276r
            if (r0 == 0) goto L13
            r0 = r6
            mg.f1$r r0 = (mg.C7256f1.C7276r) r0
            int r1 = r0.f19248z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19248z = r1
            goto L18
        L13:
            mg.f1$r r0 = new mg.f1$r
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19246x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19248z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f19245w
            mg.f1 r5 = (mg.C7256f1) r5
            p468yc.C13186n.m1453b(r6)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            p468yc.C13186n.m1453b(r6)
            vg.c0 r6 = r4.f19186a
            r0.f19245w = r4
            r0.f19248z = r3
            java.lang.Object r6 = r6.m5577v(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            df.d r6 = (p065df.NetworkResult) r6
            boolean r0 = r6 instanceof p065df.NetworkResult.C4792b
            if (r0 == 0) goto L5a
            df.d$b r6 = (p065df.NetworkResult.C4792b) r6
            java.lang.Object r6 = r6.m26590a()
            pt.pingodoce.app.data.remote.models.response.ShoppingList r6 = (pt.pingodoce.app.data.remote.models.response.ShoppingList) r6
            r5.m18849L(r6)
            yc.u r5 = p468yc.C13195u.f34156a
            return r5
        L5a:
            boolean r5 = r6 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L65
            df.d$a r6 = (p065df.NetworkResult.C4791a) r6
            we.b r5 = r6.m26591a()
            throw r5
        L65:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7256f1.m18851J(java.lang.String, bd.d):java.lang.Object");
    }

    /* renamed from: M */
    public final boolean m18848M() {
        return this.f19192g.m13730v() && !this.f19187b.m18518s();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18847N(boolean r6, bd.InterfaceC1886d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof mg.C7256f1.C7277s
            if (r0 == 0) goto L13
            r0 = r7
            mg.f1$s r0 = (mg.C7256f1.C7277s) r0
            int r1 = r0.f19249A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19249A = r1
            goto L18
        L13:
            mg.f1$s r0 = new mg.f1$s
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19252y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19249A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f19250w
            mg.f1 r6 = (mg.C7256f1) r6
            p468yc.C13186n.m1453b(r7)
            goto L77
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            boolean r6 = r0.f19251x
            java.lang.Object r2 = r0.f19250w
            mg.f1 r2 = (mg.C7256f1) r2
            p468yc.C13186n.m1453b(r7)
            goto L60
        L42:
            p468yc.C13186n.m1453b(r7)
            mg.s0 r7 = r5.f19187b
            r7.m18542R(r4)
            pt.pingodoce.app.data.remote.models.response.ShoppingList r7 = r5.f19192g
            boolean r7 = r7.m13730v()
            if (r7 == 0) goto L63
            r0.f19250w = r5
            r0.f19251x = r6
            r0.f19249A = r4
            java.lang.Object r7 = r5.m18816w(r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            r2 = r5
        L60:
            r7 = r6
            r6 = r2
            goto L68
        L63:
            r5.m18845P()
            r7 = r6
            r6 = r5
        L68:
            vg.c0 r2 = r6.f19186a
            pt.pingodoce.app.data.remote.models.response.ShoppingList r4 = r6.f19192g
            r0.f19250w = r6
            r0.f19249A = r3
            java.lang.Object r7 = r2.m5576w(r4, r7, r0)
            if (r7 != r1) goto L77
            return r1
        L77:
            df.d r7 = (p065df.NetworkResult) r7
            boolean r0 = r7 instanceof p065df.NetworkResult.C4792b
            if (r0 == 0) goto La9
            pt.pingodoce.app.data.remote.models.response.ShoppingList r0 = r6.f19192g
            df.d$b r7 = (p065df.NetworkResult.C4792b) r7
            java.lang.Object r1 = r7.m26590a()
            pt.pingodoce.app.data.remote.models.response.ShoppingListUpdateResponse r1 = (pt.pingodoce.app.data.remote.models.response.ShoppingListUpdateResponse) r1
            java.lang.String r1 = r1.m13722a()
            r0.m13748A(r1)
            java.lang.Object r7 = r7.m26590a()
            pt.pingodoce.app.data.remote.models.response.ShoppingListUpdateResponse r7 = (pt.pingodoce.app.data.remote.models.response.ShoppingListUpdateResponse) r7
            pt.pingodoce.app.data.remote.models.response.ShoppingList r7 = r7.m13721b()
            if (r7 == 0) goto L9d
            r6.m18849L(r7)
        L9d:
            mg.s0 r6 = r6.f19187b
            long r0 = java.lang.System.currentTimeMillis()
            r6.m18541S(r0)
            mg.l1$d r6 = mg.AbstractC7337l1.C7341d.f19478a
            goto Lca
        La9:
            boolean r6 = r7 instanceof p065df.NetworkResult.C4791a
            if (r6 == 0) goto Lcb
            df.d$a r7 = (p065df.NetworkResult.C4791a) r7
            we.b r6 = r7.m26591a()
            boolean r0 = r6 instanceof p339rg.ShoppingListNotFoundException
            if (r0 == 0) goto Lba
            mg.l1$c r6 = mg.AbstractC7337l1.C7340c.f19477a
            goto Lca
        Lba:
            boolean r6 = r6 instanceof p339rg.ShoppingListNotSharedException
            if (r6 == 0) goto Lc1
            mg.l1$b r6 = mg.AbstractC7337l1.C7339b.f19476a
            goto Lca
        Lc1:
            mg.l1$a r6 = new mg.l1$a
            we.b r7 = r7.m26591a()
            r6.<init>(r7)
        Lca:
            return r6
        Lcb:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7256f1.m18847N(boolean, bd.d):java.lang.Object");
    }

    /* renamed from: Q */
    public final void m18844Q() {
        Collection values = this.f19193h.values();
        Intrinsics.checkIfNull(values, "activeProductMap.values");
        ArrayList<ShoppingListProduct> arrayList = new ArrayList();
        for (Object obj : values) {
            if (obj instanceof ShoppingListProduct) {
                arrayList.add(obj);
            }
        }
        for (ShoppingListProduct shoppingListProduct : arrayList) {
            if ((shoppingListProduct.m14334h() ? shoppingListProduct : null) != null) {
                HashMap hashMap = this.f19193h;
                String m14331k = shoppingListProduct.m14331k();
                ShoppingListProduct m14340a = shoppingListProduct.m14340a();
                m14340a.m14347G(false);
                hashMap.put(m14331k, m14340a);
            }
        }
        m18845P();
    }

    /* renamed from: R */
    public final void m18843R() {
        String str = this.f19195j;
        if (str != null) {
            InterfaceC6661b interfaceC6661b = (InterfaceC6661b) this.f19193h.get(str);
            if (interfaceC6661b != null) {
                HashMap hashMap = this.f19193h;
                ShoppingListProduct m14340a = ((ShoppingListProduct) interfaceC6661b).m14340a();
                m14340a.m14345I(false);
                String format = this.f19190e.format(new Date());
                Intrinsics.checkIfNull(format, "dateFormat.format(Date())");
                m14340a.m14346H(format);
                hashMap.put(str, m14340a);
            }
            this.f19195j = null;
        }
    }

    /* renamed from: S */
    public final void m18842S(ShoppingListProduct shoppingListProduct) {
        Intrinsics.isThisObjectNull(shoppingListProduct, "item");
        HashMap hashMap = this.f19193h;
        String m14331k = shoppingListProduct.m14331k();
        ShoppingListProduct m14340a = shoppingListProduct.m14340a();
        String format = this.f19190e.format(new Date());
        Intrinsics.checkIfNull(format, "dateFormat.format(Date())");
        m14340a.m14346H(format);
        hashMap.put(m14331k, m14340a);
        m18845P();
    }

    /* renamed from: T */
    public final void m18841T(List list) {
        Intrinsics.isThisObjectNull(list, "items");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PriceCalculation priceCalculation = (PriceCalculation) it.next();
            Object obj = this.f19193h.get(priceCalculation.m14474b());
            Objects.requireNonNull(obj, "null cannot be cast to non-null type pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct");
            HashMap hashMap = this.f19193h;
            String m14474b = priceCalculation.m14474b();
            ShoppingListProduct m14340a = ((ShoppingListProduct) obj).m14340a();
            m14340a.m14341M(priceCalculation.m14472d());
            m14340a.m14342L(priceCalculation.m14475a());
            String format = this.f19190e.format(new Date());
            Intrinsics.checkIfNull(format, "dateFormat.format(Date())");
            m14340a.m14346H(format);
            hashMap.put(m14474b, m14340a);
        }
        m18845P();
    }

    /* renamed from: U */
    public final void m18840U(String str) {
        CharSequence m8915K0;
        Intrinsics.isThisObjectNull(str, "name");
        ShoppingList shoppingList = this.f19192g;
        m8915K0 = C10171u.m8915K0(str);
        shoppingList.m13747D(m8915K0.toString());
        m18845P();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18839V(java.util.List r6, bd.InterfaceC1886d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof mg.C7256f1.C7278t
            if (r0 == 0) goto L13
            r0 = r7
            mg.f1$t r0 = (mg.C7256f1.C7278t) r0
            int r1 = r0.f19254A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19254A = r1
            goto L18
        L13:
            mg.f1$t r0 = new mg.f1$t
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19257y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19254A
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f19256x
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r0 = r0.f19255w
            mg.f1 r0 = (mg.C7256f1) r0
            p468yc.C13186n.m1453b(r7)
            goto L56
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            p468yc.C13186n.m1453b(r7)
            vg.c0 r7 = r5.f19186a
            pt.pingodoce.app.data.remote.models.response.ShoppingList r2 = r5.f19192g
            java.lang.String r2 = r2.m13737j()
            java.util.List r4 = ug.ShoppingList.m6793b(r6)
            r0.f19255w = r5
            r0.f19256x = r6
            r0.f19254A = r3
            java.lang.Object r7 = r7.m5578u(r2, r4, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            r0 = r5
        L56:
            df.d r7 = (p065df.NetworkResult) r7
            boolean r1 = r7 instanceof p065df.NetworkResult.C4792b
            if (r1 == 0) goto L65
            pt.pingodoce.app.data.remote.models.response.ShoppingList r7 = r0.f19192g
            r7.m13746E(r6)
            r0.m18845P()
            goto L69
        L65:
            boolean r6 = r7 instanceof p065df.NetworkResult.C4791a
            if (r6 != 0) goto L6c
        L69:
            yc.u r6 = p468yc.C13195u.f34156a
            return r6
        L6c:
            df.d$a r7 = (p065df.NetworkResult.C4791a) r7
            we.b r6 = r7.m26591a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7256f1.m18839V(java.util.List, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18835d(pt.pingodoce.app.data.remote.models.response.ShoppingList r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mg.C7256f1.C7257a
            if (r0 == 0) goto L13
            r0 = r6
            mg.f1$a r0 = (mg.C7256f1.C7257a) r0
            int r1 = r0.f19198y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19198y = r1
            goto L18
        L13:
            mg.f1$a r0 = new mg.f1$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19196w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19198y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r6)
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r6)
            vg.c0 r6 = r4.f19186a
            r2 = 0
            r0.f19198y = r3
            java.lang.Object r6 = r6.m5576w(r5, r2, r0)
            if (r6 != r1) goto L40
            return r1
        L40:
            df.d r6 = (p065df.NetworkResult) r6
            boolean r5 = r6 instanceof p065df.NetworkResult.C4792b
            if (r5 == 0) goto L4b
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r3)
            return r5
        L4b:
            boolean r5 = r6 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L56
            df.d$a r6 = (p065df.NetworkResult.C4791a) r6
            we.b r5 = r6.m26591a()
            throw r5
        L56:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7256f1.m18835d(pt.pingodoce.app.data.remote.models.response.ShoppingList, bd.d):java.lang.Object");
    }

    /* renamed from: e */
    public final void m18834e(List list) {
        Intrinsics.isThisObjectNull(list, "values");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Category category = (Category) it.next();
            this.f19194i.put(Integer.valueOf(category.m14491b()), new ShoppingListCategory(category.m14487f(), category.m14488e(), category.m14491b()));
        }
        this.f19187b.m18551I(this.f19194i);
    }

    /* renamed from: f */
    public final void m18833f(ShoppingListProduct shoppingListProduct) {
        Intrinsics.isThisObjectNull(shoppingListProduct, "item");
        if (this.f19193h.containsKey(shoppingListProduct.m14331k())) {
            if (shoppingListProduct.m14327s() == 0) {
                m18852I(shoppingListProduct, false);
                return;
            } else {
                m18842S(shoppingListProduct);
                return;
            }
        }
        HashMap hashMap = this.f19193h;
        String m14331k = shoppingListProduct.m14331k();
        String format = this.f19190e.format(new Date());
        Intrinsics.checkIfNull(format, "dateFormat.format(Date())");
        shoppingListProduct.m14346H(format);
        shoppingListProduct.m14344J(Reader.READ_DONE);
        hashMap.put(m14331k, shoppingListProduct);
        m18845P();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18832g(java.util.List r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mg.C7256f1.C7258b
            if (r0 == 0) goto L13
            r0 = r6
            mg.f1$b r0 = (mg.C7256f1.C7258b) r0
            int r1 = r0.f19201y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19201y = r1
            goto L18
        L13:
            mg.f1$b r0 = new mg.f1$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19199w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19201y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r6)
            vg.c0 r6 = r4.f19186a
            r0.f19201y = r3
            java.lang.Object r6 = r6.m5586m(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            df.d r6 = (p065df.NetworkResult) r6
            boolean r5 = r6 instanceof p065df.NetworkResult.C4792b
            if (r5 == 0) goto L53
            mg.u0$b r5 = new mg.u0$b
            df.d$b r6 = (p065df.NetworkResult.C4792b) r6
            java.lang.Object r6 = r6.m26590a()
            java.util.List r6 = (java.util.List) r6
            r5.<init>(r6)
            goto L62
        L53:
            boolean r5 = r6 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L63
            mg.u0$a r5 = new mg.u0$a
            df.d$a r6 = (p065df.NetworkResult.C4791a) r6
            we.b r6 = r6.m26591a()
            r5.<init>(r6)
        L62:
            return r5
        L63:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7256f1.m18832g(java.util.List, bd.d):java.lang.Object");
    }

    /* renamed from: h */
    public final boolean m18831h() {
        if (m18857D()) {
            List m18817v = m18817v();
            ArrayList arrayList = new ArrayList();
            for (Object obj : m18817v) {
                if (!((Friend) obj).m14394j()) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18830i(bd.InterfaceC1886d r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r1 instanceof mg.C7256f1.C7259c
            if (r2 == 0) goto L17
            r2 = r1
            mg.f1$c r2 = (mg.C7256f1.C7259c) r2
            int r3 = r2.f19204y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f19204y = r3
            goto L1c
        L17:
            mg.f1$c r2 = new mg.f1$c
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f19202w
            java.lang.Object r3 = cd.C2111b.m34640d()
            int r4 = r2.f19204y
            r5 = 1
            if (r4 == 0) goto L35
            if (r4 != r5) goto L2d
            p468yc.C13186n.m1453b(r1)
            goto L80
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L35:
            p468yc.C13186n.m1453b(r1)
            vg.c0 r1 = r0.f19186a
            pt.pingodoce.app.data.remote.models.response.ShoppingList r6 = r0.f19192g
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            java.util.List r4 = r6.m13735m()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r4 = r4.iterator()
        L4e:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L65
            java.lang.Object r13 = r4.next()
            r14 = r13
            pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct r14 = (pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct) r14
            boolean r14 = r14.m14350D()
            if (r14 != 0) goto L4e
            r12.add(r13)
            goto L4e
        L65:
            r4 = 0
            java.util.List r13 = p489zc.C13777q.m221p0(r12)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 959(0x3bf, float:1.344E-42)
            r18 = 0
            r12 = r4
            pt.pingodoce.app.data.remote.models.response.ShoppingList r4 = pt.pingodoce.app.data.remote.models.response.ShoppingList.m13742d(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2.f19204y = r5
            java.lang.Object r1 = r1.m5585n(r4, r2)
            if (r1 != r3) goto L80
            return r3
        L80:
            df.d r1 = (p065df.NetworkResult) r1
            boolean r2 = r1 instanceof p065df.NetworkResult.C4792b
            if (r2 == 0) goto L98
            mg.n$b r2 = new mg.n$b
            df.d$b r1 = (p065df.NetworkResult.C4792b) r1
            java.lang.Object r1 = r1.m26590a()
            pt.pingodoce.app.data.remote.models.response.CheckoutResponse r1 = (pt.pingodoce.app.data.remote.models.response.CheckoutResponse) r1
            java.lang.String r1 = r1.m13878a()
            r2.<init>(r1)
            goto La7
        L98:
            boolean r2 = r1 instanceof p065df.NetworkResult.C4791a
            if (r2 == 0) goto La8
            mg.n$a r2 = new mg.n$a
            df.d$a r1 = (p065df.NetworkResult.C4791a) r1
            we.b r1 = r1.m26591a()
            r2.<init>(r1)
        La7:
            return r2
        La8:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7256f1.m18830i(bd.d):java.lang.Object");
    }

    /* renamed from: j */
    public final void m18829j() {
        this.f19192g = new ShoppingList(null, null, null, null, null, false, null, null, null, null, 1023, null);
        this.f19193h.clear();
        this.f19195j = null;
    }

    /* renamed from: k */
    public final void m18828k() {
        Collection<InterfaceC6661b> values = this.f19193h.values();
        Intrinsics.checkIfNull(values, "activeProductMap.values");
        for (InterfaceC6661b interfaceC6661b : values) {
            if (interfaceC6661b instanceof ShoppingListProduct) {
                HashMap hashMap = this.f19193h;
                ShoppingListProduct shoppingListProduct = (ShoppingListProduct) interfaceC6661b;
                String m14331k = shoppingListProduct.m14331k();
                ShoppingListProduct m14340a = shoppingListProduct.m14340a();
                m14340a.m14345I(true);
                String format = this.f19190e.format(new Date());
                Intrinsics.checkIfNull(format, "dateFormat.format(Date())");
                m14340a.m14346H(format);
                hashMap.put(m14331k, m14340a);
            }
        }
        m18845P();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18827l(bd.InterfaceC1886d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof mg.C7256f1.C7260d
            if (r0 == 0) goto L13
            r0 = r5
            mg.f1$d r0 = (mg.C7256f1.C7260d) r0
            int r1 = r0.f19207y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19207y = r1
            goto L18
        L13:
            mg.f1$d r0 = new mg.f1$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19205w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19207y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r5)
            vg.c0 r5 = r4.f19186a
            r0.f19207y = r3
            java.lang.Object r5 = r5.m5584o(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            df.d r5 = (p065df.NetworkResult) r5
            boolean r0 = r5 instanceof p065df.NetworkResult.C4792b
            if (r0 == 0) goto L4a
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r3)
            return r5
        L4a:
            boolean r0 = r5 instanceof p065df.NetworkResult.C4791a
            if (r0 == 0) goto L55
            df.d$a r5 = (p065df.NetworkResult.C4791a) r5
            we.b r5 = r5.m26591a()
            throw r5
        L55:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7256f1.m18827l(bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18826m(pt.pingodoce.app.data.remote.models.response.ShoppingList r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mg.C7256f1.C7261e
            if (r0 == 0) goto L13
            r0 = r6
            mg.f1$e r0 = (mg.C7256f1.C7261e) r0
            int r1 = r0.f19210y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19210y = r1
            goto L18
        L13:
            mg.f1$e r0 = new mg.f1$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19208w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19210y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r6)
            vg.c0 r6 = r4.f19186a
            java.lang.String r5 = r5.m13737j()
            r0.f19210y = r3
            java.lang.Object r6 = r6.m5583p(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            df.d r6 = (p065df.NetworkResult) r6
            boolean r5 = r6 instanceof p065df.NetworkResult.C4792b
            if (r5 == 0) goto L4e
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r3)
            return r5
        L4e:
            boolean r5 = r6 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L59
            df.d$a r6 = (p065df.NetworkResult.C4791a) r6
            we.b r5 = r6.m26591a()
            throw r5
        L59:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7256f1.m18826m(pt.pingodoce.app.data.remote.models.response.ShoppingList, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18825n(bd.InterfaceC1886d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof mg.C7256f1.C7262f
            if (r0 == 0) goto L13
            r0 = r6
            mg.f1$f r0 = (mg.C7256f1.C7262f) r0
            int r1 = r0.f19213y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19213y = r1
            goto L18
        L13:
            mg.f1$f r0 = new mg.f1$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19211w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19213y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p468yc.C13186n.m1453b(r6)
            goto L65
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            p468yc.C13186n.m1453b(r6)
            goto L55
        L38:
            p468yc.C13186n.m1453b(r6)
            pt.pingodoce.app.data.remote.models.response.ShoppingList r6 = r5.f19192g
            java.lang.String r6 = r6.m13737j()
            int r6 = r6.length()
            if (r6 != 0) goto L49
            r6 = r4
            goto L4a
        L49:
            r6 = 0
        L4a:
            if (r6 == 0) goto L5a
            r0.f19213y = r4
            java.lang.Object r6 = r5.m18816w(r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r4)
            return r6
        L5a:
            pt.pingodoce.app.data.remote.models.response.ShoppingList r6 = r5.f19192g
            r0.f19213y = r3
            java.lang.Object r6 = r5.m18826m(r6, r0)
            if (r6 != r1) goto L65
            return r1
        L65:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7256f1.m18825n(bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, pt.pingodoce.app.data.local.models.stores.Coordinates] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18824o(com.google.android.gms.maps.model.LatLng r9, bd.InterfaceC1886d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof mg.C7256f1.C7263g
            if (r0 == 0) goto L13
            r0 = r10
            mg.f1$g r0 = (mg.C7256f1.C7263g) r0
            int r1 = r0.f19216y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19216y = r1
            goto L18
        L13:
            mg.f1$g r0 = new mg.f1$g
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f19214w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19216y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r10)
            goto L5b
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            p468yc.C13186n.m1453b(r10)
            jd.y r10 = new jd.y
            r10.<init>()
            if (r9 == 0) goto L46
            pt.pingodoce.app.data.local.models.stores.Coordinates r2 = new pt.pingodoce.app.data.local.models.stores.Coordinates
            double r4 = r9.f8253w
            double r6 = r9.f8254x
            r2.<init>(r4, r6)
            r10.f17533w = r2
        L46:
            vg.c0 r9 = r8.f19186a
            pt.pingodoce.app.data.remote.models.response.ShoppingList r2 = r8.f19192g
            java.lang.String r2 = r2.m13737j()
            T r10 = r10.f17533w
            pt.pingodoce.app.data.local.models.stores.Coordinates r10 = (pt.pingodoce.app.data.local.models.stores.Coordinates) r10
            r0.f19216y = r3
            java.lang.Object r10 = r9.m5582q(r2, r10, r0)
            if (r10 != r1) goto L5b
            return r1
        L5b:
            df.d r10 = (p065df.NetworkResult) r10
            boolean r9 = r10 instanceof p065df.NetworkResult.C4792b
            if (r9 == 0) goto L62
            goto L67
        L62:
            boolean r9 = r10 instanceof p065df.NetworkResult.C4791a
            if (r9 == 0) goto L6c
            r3 = 0
        L67:
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r3)
            return r9
        L6c:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7256f1.m18824o(com.google.android.gms.maps.model.LatLng, bd.d):java.lang.Object");
    }

    /* renamed from: p */
    public final ShoppingList m18823p() {
        return this.f19192g;
    }

    /* renamed from: q */
    public final List m18822q() {
        List m461h0;
        List m453p0;
        Collection values = this.f19193h.values();
        Intrinsics.checkIfNull(values, "activeProductMap.values");
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (obj instanceof ShoppingListProduct) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((ShoppingListProduct) obj2).m14332j()) {
                arrayList2.add(obj2);
            }
        }
        m461h0 = _Collections.m461h0(arrayList2, new C7264h());
        m453p0 = _Collections.m453p0(m461h0);
        return m453p0;
    }

    /* renamed from: r */
    public final List m18821r() {
        List m461h0;
        List m453p0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ShoppingListProduct shoppingListProduct : m18822q()) {
            linkedHashMap.put(shoppingListProduct.m14335f().m14357e(), shoppingListProduct.m14335f());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        HashMap hashMap = this.f19193h;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!(entry.getValue() instanceof ShoppingListCategory)) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        linkedHashMap2.putAll(linkedHashMap3);
        this.f19193h.clear();
        this.f19193h.putAll(linkedHashMap);
        this.f19193h.putAll(linkedHashMap2);
        Collection values = this.f19193h.values();
        Intrinsics.checkIfNull(values, "activeProductMap.values");
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            InterfaceC6661b interfaceC6661b = (InterfaceC6661b) obj;
            if ((interfaceC6661b instanceof ShoppingListCategory) || ((interfaceC6661b instanceof ShoppingListProduct) && !((ShoppingListProduct) interfaceC6661b).m14332j())) {
                arrayList.add(obj);
            }
        }
        m461h0 = _Collections.m461h0(arrayList, C7253e1.f19181w);
        m453p0 = _Collections.m453p0(m461h0);
        return m453p0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18819t(bd.InterfaceC1886d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof mg.C7256f1.C7265i
            if (r0 == 0) goto L13
            r0 = r6
            mg.f1$i r0 = (mg.C7256f1.C7265i) r0
            int r1 = r0.f19220z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19220z = r1
            goto L18
        L13:
            mg.f1$i r0 = new mg.f1$i
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19218x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19220z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f19217w
            pt.pingodoce.app.data.remote.models.response.ShoppingList r0 = (pt.pingodoce.app.data.remote.models.response.ShoppingList) r0
            p468yc.C13186n.m1453b(r6)
            goto L4a
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            p468yc.C13186n.m1453b(r6)
            pt.pingodoce.app.data.remote.models.response.ShoppingList r6 = r5.f19192g
            dg.b0 r2 = r5.f19189d
            r0.f19217w = r6
            r0.f19220z = r3
            java.lang.Object r0 = r2.m25771D(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r4 = r0
            r0 = r6
            r6 = r4
        L4a:
            p181jd.Intrinsics.ifNullDoSomething(r6)
            module.network.data.remote.models.user.User r6 = (module.network.data.remote.models.user.User) r6
            java.lang.String r6 = r6.m18174y()
            java.util.List r6 = r0.m13745a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7256f1.m18819t(bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082 A[LOOP:0: B:27:0x007c->B:29:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18818u(bd.InterfaceC1886d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof mg.C7256f1.C7266j
            if (r0 == 0) goto L13
            r0 = r7
            mg.f1$j r0 = (mg.C7256f1.C7266j) r0
            int r1 = r0.f19224z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19224z = r1
            goto L18
        L13:
            mg.f1$j r0 = new mg.f1$j
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19222x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19224z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f19221w
            java.util.List r0 = (java.util.List) r0
            p468yc.C13186n.m1453b(r7)
            goto L6f
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            java.lang.Object r2 = r0.f19221w
            mg.f1 r2 = (mg.C7256f1) r2
            p468yc.C13186n.m1453b(r7)
            goto L51
        L40:
            p468yc.C13186n.m1453b(r7)
            vg.c0 r7 = r6.f19186a
            r0.f19221w = r6
            r0.f19224z = r4
            java.lang.Object r7 = r7.m5581r(r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r2 = r6
        L51:
            df.d r7 = (p065df.NetworkResult) r7
            boolean r4 = r7 instanceof p065df.NetworkResult.C4792b
            if (r4 == 0) goto L96
            df.d$b r7 = (p065df.NetworkResult.C4792b) r7
            java.lang.Object r7 = r7.m26590a()
            java.util.List r7 = (java.util.List) r7
            dg.b0 r2 = r2.f19189d
            r0.f19221w = r7
            r0.f19224z = r3
            java.lang.Object r0 = r2.m25771D(r0)
            if (r0 != r1) goto L6c
            return r1
        L6c:
            r5 = r0
            r0 = r7
            r7 = r5
        L6f:
            p181jd.Intrinsics.ifNullDoSomething(r7)
            module.network.data.remote.models.user.User r7 = (module.network.data.remote.models.user.User) r7
            java.lang.String r7 = r7.m18174y()
            java.util.Iterator r1 = r0.iterator()
        L7c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L90
            java.lang.Object r2 = r1.next()
            pt.pingodoce.app.data.remote.models.response.ShoppingList r2 = (pt.pingodoce.app.data.remote.models.response.ShoppingList) r2
            boolean r3 = r2.m13731t(r7)
            r2.m13727z(r3)
            goto L7c
        L90:
            mg.b0$b r7 = new mg.b0$b
            r7.<init>(r0)
            goto Lae
        L96:
            boolean r0 = r7 instanceof p065df.NetworkResult.C4791a
            if (r0 == 0) goto Lb4
            df.d$a r7 = (p065df.NetworkResult.C4791a) r7
            we.b r0 = r7.m26591a()
            boolean r0 = r0 instanceof p447xe.NoConnectionException
            if (r0 == 0) goto Laf
            mg.b0$a$a r0 = new mg.b0$a$a
            we.b r7 = r7.m26591a()
            r0.<init>(r7)
            r7 = r0
        Lae:
            return r7
        Laf:
            we.b r7 = r7.m26591a()
            throw r7
        Lb4:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7256f1.m18818u(bd.d):java.lang.Object");
    }

    /* renamed from: v */
    public final List m18817v() {
        List m461h0;
        m461h0 = _Collections.m461h0(this.f19192g.m13733r(), new C7267k());
        return m461h0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18816w(bd.InterfaceC1886d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof mg.C7256f1.C7268l
            if (r0 == 0) goto L13
            r0 = r5
            mg.f1$l r0 = (mg.C7256f1.C7268l) r0
            int r1 = r0.f19228z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19228z = r1
            goto L18
        L13:
            mg.f1$l r0 = new mg.f1$l
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19226x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19228z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f19225w
            mg.f1 r0 = (mg.C7256f1) r0
            p468yc.C13186n.m1453b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            p468yc.C13186n.m1453b(r5)
            vg.c0 r5 = r4.f19186a
            r0.f19225w = r4
            r0.f19228z = r3
            java.lang.Object r5 = r5.m5580s(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            df.d r5 = (p065df.NetworkResult) r5
            boolean r1 = r5 instanceof p065df.NetworkResult.C4792b
            if (r1 == 0) goto L5e
            df.d$b r5 = (p065df.NetworkResult.C4792b) r5
            java.lang.Object r5 = r5.m26590a()
            pt.pingodoce.app.data.remote.models.response.ShoppingList r5 = (pt.pingodoce.app.data.remote.models.response.ShoppingList) r5
            r0.m18849L(r5)
            pt.pingodoce.app.data.remote.models.response.ShoppingList r5 = r0.f19192g
            java.lang.String r5 = r5.m13736k()
            goto L6b
        L5e:
            boolean r5 = r5 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L6c
            r0.m18850K()
            pt.pingodoce.app.data.remote.models.response.ShoppingList r5 = r0.f19192g
            java.lang.String r5 = r5.m13736k()
        L6b:
            return r5
        L6c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7256f1.m18816w(bd.d):java.lang.Object");
    }

    /* renamed from: x */
    public final ShoppingListProduct m18815x(String str) {
        Intrinsics.isThisObjectNull(str, "id");
        return (ShoppingListProduct) this.f19193h.get(str);
    }

    /* renamed from: y */
    public final int m18814y() {
        int m186r;
        List<ShoppingListProduct> m18822q = m18822q();
        m186r = Iterables.m186r(m18822q, 10);
        ArrayList<Number> arrayList = new ArrayList(m186r);
        for (ShoppingListProduct shoppingListProduct : m18822q) {
            arrayList.add(Integer.valueOf(shoppingListProduct.m14327s()));
        }
        int i = 0;
        for (Number number : arrayList) {
            i += number.intValue();
        }
        return i;
    }

    /* renamed from: z */
    public final String m18813z() {
        long m18517t = this.f19187b.m18517t();
        if (m18517t == 0) {
            return BuildConfig.VERSION_NAME;
        }
        String print = this.f19191f.print(m18517t);
        Intrinsics.checkIfNull(print, "syncFormat.print(sync)");
        return print;
    }
}
