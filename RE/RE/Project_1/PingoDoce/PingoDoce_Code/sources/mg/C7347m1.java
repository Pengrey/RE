package mg;

import bd.InterfaceC1886d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p223lg.InterfaceC7054a;
import p489zc.Iterables;
import p489zc._Collections;
import pt.pingodoce.app.data.local.models.stores.TakeAwaySchedule;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct;
import pt.pingodoce.app.data.remote.models.response.Store;
import vg.TakeAwayService;

/* compiled from: TakeAwayManager.kt */
/* renamed from: mg.m1 */
/* loaded from: classes2.dex */
public final class C7347m1 {

    /* renamed from: a */
    private final TakeAwayService f19493a;

    /* renamed from: b */
    private final PrefsManager f19494b;

    /* renamed from: c */
    private Store f19495c;

    /* renamed from: d */
    private final List f19496d;

    /* renamed from: e */
    private final List f19497e;

    /* renamed from: f */
    private Map f19498f;

    /* renamed from: g */
    private InterfaceC7054a f19499g;

    /* compiled from: TakeAwayManager.kt */
    /* renamed from: mg.m1$a */
    /* loaded from: classes2.dex */
    public static final class C7348a {
        private C7348a() {
        }

        public /* synthetic */ C7348a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.TakeAwayManager", m20196f = "TakeAwayManager.kt", m20195l = {192}, m20194m = "cancelOrder")
    /* renamed from: mg.m1$b */
    /* loaded from: classes2.dex */
    public static final class C7349b extends AbstractC6757d {

        /* renamed from: A */
        int f19500A;

        /* renamed from: w */
        Object f19501w;

        /* renamed from: x */
        Object f19502x;

        /* renamed from: y */
        /* synthetic */ Object f19503y;

        C7349b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19503y = obj;
            this.f19500A |= Integer.MIN_VALUE;
            return C7347m1.this.m18690b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.TakeAwayManager", m20196f = "TakeAwayManager.kt", m20195l = {148}, m20194m = "getCategories")
    /* renamed from: mg.m1$c */
    /* loaded from: classes2.dex */
    public static final class C7350c extends AbstractC6757d {

        /* renamed from: w */
        Object f19505w;

        /* renamed from: x */
        /* synthetic */ Object f19506x;

        /* renamed from: z */
        int f19508z;

        C7350c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19506x = obj;
            this.f19508z |= Integer.MIN_VALUE;
            return C7347m1.this.m18682j(0, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.TakeAwayManager", m20196f = "TakeAwayManager.kt", m20195l = {159}, m20194m = "getProducts")
    /* renamed from: mg.m1$d */
    /* loaded from: classes2.dex */
    public static final class C7351d extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19509w;

        /* renamed from: y */
        int f19511y;

        C7351d(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19509w = obj;
            this.f19511y |= Integer.MIN_VALUE;
            return C7347m1.this.m18677o(null, 0, null, 0, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.TakeAwayManager", m20196f = "TakeAwayManager.kt", m20195l = {127}, m20194m = "getStatus")
    /* renamed from: mg.m1$e */
    /* loaded from: classes2.dex */
    public static final class C7352e extends AbstractC6757d {

        /* renamed from: w */
        Object f19512w;

        /* renamed from: x */
        /* synthetic */ Object f19513x;

        /* renamed from: z */
        int f19515z;

        C7352e(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19513x = obj;
            this.f19515z |= Integer.MIN_VALUE;
            return C7347m1.this.m18673s(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.TakeAwayManager", m20196f = "TakeAwayManager.kt", m20195l = {138}, m20194m = "getTakeAwaySchedules")
    /* renamed from: mg.m1$f */
    /* loaded from: classes2.dex */
    public static final class C7353f extends AbstractC6757d {

        /* renamed from: w */
        Object f19516w;

        /* renamed from: x */
        /* synthetic */ Object f19517x;

        /* renamed from: z */
        int f19519z;

        C7353f(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19517x = obj;
            this.f19519z |= Integer.MIN_VALUE;
            return C7347m1.this.m18672t(0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.TakeAwayManager", m20196f = "TakeAwayManager.kt", m20195l = {166}, m20194m = "orderList")
    /* renamed from: mg.m1$g */
    /* loaded from: classes2.dex */
    public static final class C7354g extends AbstractC6757d {

        /* renamed from: A */
        int f19520A;

        /* renamed from: w */
        Object f19521w;

        /* renamed from: x */
        boolean f19522x;

        /* renamed from: y */
        /* synthetic */ Object f19523y;

        C7354g(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19523y = obj;
            this.f19520A |= Integer.MIN_VALUE;
            return C7347m1.this.m18671u(false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.TakeAwayManager", m20196f = "TakeAwayManager.kt", m20195l = {179}, m20194m = "placeOrder")
    /* renamed from: mg.m1$h */
    /* loaded from: classes2.dex */
    public static final class C7355h extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19525w;

        /* renamed from: y */
        int f19527y;

        C7355h(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19525w = obj;
            this.f19527y |= Integer.MIN_VALUE;
            return C7347m1.this.m18669w(null, this);
        }
    }

    static {
        new C7348a(null);
    }

    public C7347m1(TakeAwayService takeAwayService, PrefsManager prefsManager) {
        Intrinsics.isThisObjectNull(takeAwayService, "service");
        Intrinsics.isThisObjectNull(prefsManager, "prefsManager");
        this.f19493a = takeAwayService;
        this.f19494b = prefsManager;
        this.f19496d = new ArrayList();
        this.f19497e = new ArrayList();
        this.f19498f = new LinkedHashMap();
    }

    /* renamed from: p */
    public static /* synthetic */ Object m18676p(C7347m1 c7347m1, String str, int i, String str2, int i2, int i3, InterfaceC1886d interfaceC1886d, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            i2 = 1;
        }
        int i5 = i2;
        if ((i4 & 16) != 0) {
            i3 = 12;
        }
        return c7347m1.m18677o(str, i, str2, i5, i3, interfaceC1886d);
    }

    /* renamed from: v */
    public static /* synthetic */ Object m18670v(C7347m1 c7347m1, boolean z, InterfaceC1886d interfaceC1886d, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return c7347m1.m18671u(z, interfaceC1886d);
    }

    /* renamed from: y */
    public static /* synthetic */ void m18667y(C7347m1 c7347m1, TakeAwayProduct takeAwayProduct, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c7347m1.m18668x(takeAwayProduct, z);
    }

    /* renamed from: A */
    public final void m18694A() {
        InterfaceC7054a interfaceC7054a = this.f19499g;
        if (interfaceC7054a != null) {
            TakeAwayProduct takeAwayProduct = (TakeAwayProduct) interfaceC7054a;
            this.f19498f.put(Integer.valueOf(takeAwayProduct.m14244i()), TakeAwayProduct.m14249c(takeAwayProduct, 0, 0, null, null, null, null, null, 0.0f, null, null, false, false, false, 0, null, 0, 0, 0, 262143, null));
            this.f19499g = null;
        }
    }

    /* renamed from: B */
    public final void m18693B(TakeAwayProduct takeAwayProduct) {
        Intrinsics.isThisObjectNull(takeAwayProduct, "item");
        this.f19498f.put(Integer.valueOf(takeAwayProduct.m14244i()), TakeAwayProduct.m14249c(takeAwayProduct, 0, 0, null, null, null, null, null, 0.0f, null, null, false, false, false, 0, null, 0, 0, 0, 262143, null));
    }

    /* renamed from: C */
    public final void m18692C(TakeAwayProduct takeAwayProduct, int i, int i2) {
        Intrinsics.isThisObjectNull(takeAwayProduct, "product");
        Map map = this.f19498f;
        Integer valueOf = Integer.valueOf(takeAwayProduct.m14244i());
        TakeAwayProduct m14249c = TakeAwayProduct.m14249c(takeAwayProduct, 0, 0, null, null, null, null, null, 0.0f, null, null, false, false, false, 0, null, 0, 0, 0, 262143, null);
        m14249c.m14254M(i);
        m14249c.m14253N(i2);
        map.put(valueOf, m14249c);
        takeAwayProduct.m14254M(i);
        takeAwayProduct.m14253N(i2);
    }

    /* renamed from: a */
    public final void m18691a(TakeAwayProduct takeAwayProduct) {
        Intrinsics.isThisObjectNull(takeAwayProduct, "item");
        if (this.f19498f.containsKey(Integer.valueOf(takeAwayProduct.m14244i()))) {
            if (takeAwayProduct.m14235w() == 0) {
                m18668x(takeAwayProduct, false);
                return;
            } else {
                m18693B(takeAwayProduct);
                return;
            }
        }
        this.f19498f.put(Integer.valueOf(takeAwayProduct.m14244i()), takeAwayProduct);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18690b(java.lang.String r6, bd.InterfaceC1886d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof mg.C7347m1.C7349b
            if (r0 == 0) goto L13
            r0 = r7
            mg.m1$b r0 = (mg.C7347m1.C7349b) r0
            int r1 = r0.f19500A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19500A = r1
            goto L18
        L13:
            mg.m1$b r0 = new mg.m1$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19503y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19500A
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f19502x
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r0.f19501w
            mg.m1 r0 = (mg.C7347m1) r0
            p468yc.C13186n.m1453b(r7)
            goto L4c
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            p468yc.C13186n.m1453b(r7)
            vg.i0 r7 = r5.f19493a
            r0.f19501w = r5
            r0.f19502x = r6
            r0.f19500A = r3
            java.lang.Object r7 = r7.m5503m(r6, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r0 = r5
        L4c:
            df.d r7 = (p065df.NetworkResult) r7
            boolean r1 = r7 instanceof p065df.NetworkResult.C4792b
            if (r1 == 0) goto L8a
            mg.s0 r7 = r0.f19494b
            java.util.List r7 = r7.m18516u()
            java.util.List r7 = p489zc.C13777q.m221p0(r7)
            java.util.Iterator r1 = r7.iterator()
        L60:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r2 = r1.next()
            r4 = r2
            pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder r4 = (pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder) r4
            java.lang.String r4 = r4.m14283c()
            boolean r4 = p181jd.Intrinsics.equals(r4, r6)
            if (r4 == 0) goto L60
            goto L79
        L78:
            r2 = 0
        L79:
            pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder r2 = (pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder) r2
            if (r2 == 0) goto L85
            r7.remove(r2)
            mg.s0 r6 = r0.f19494b
            r6.m18540T(r7)
        L85:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r3)
            return r6
        L8a:
            boolean r6 = r7 instanceof p065df.NetworkResult.C4791a
            if (r6 == 0) goto L95
            df.d$a r7 = (p065df.NetworkResult.C4791a) r7
            we.b r6 = r7.m26591a()
            throw r6
        L95:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7347m1.m18690b(java.lang.String, bd.d):java.lang.Object");
    }

    /* renamed from: c */
    public final void m18689c() {
        this.f19498f.clear();
        this.f19499g = null;
    }

    /* renamed from: d */
    public final void m18688d() {
        this.f19495c = null;
    }

    /* renamed from: e */
    public final List m18687e() {
        return this.f19497e;
    }

    /* renamed from: f */
    public final TakeAwayProduct m18686f(int i) {
        return (TakeAwayProduct) this.f19498f.get(Integer.valueOf(i));
    }

    /* renamed from: g */
    public final int m18685g() {
        int m186r;
        if (m18684h().isEmpty()) {
            return 0;
        }
        List<TakeAwayProduct> m18684h = m18684h();
        m186r = Iterables.m186r(m18684h, 10);
        ArrayList arrayList = new ArrayList(m186r);
        for (TakeAwayProduct takeAwayProduct : m18684h) {
            arrayList.add(Integer.valueOf(takeAwayProduct.m14235w()));
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() + ((Number) it.next()).intValue());
            }
            return ((Number) next).intValue();
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    /* renamed from: h */
    public final List m18684h() {
        List m455n0;
        Collection values = this.f19498f.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (obj instanceof TakeAwayProduct) {
                arrayList.add(obj);
            }
        }
        m455n0 = _Collections.m455n0(arrayList);
        return m455n0;
    }

    /* renamed from: i */
    public final float m18683i() {
        int m186r;
        if (m18684h().isEmpty()) {
            return 0.0f;
        }
        List<TakeAwayProduct> m18684h = m18684h();
        m186r = Iterables.m186r(m18684h, 10);
        ArrayList arrayList = new ArrayList(m186r);
        for (TakeAwayProduct takeAwayProduct : m18684h) {
            arrayList.add(Float.valueOf(takeAwayProduct.m14238s() * takeAwayProduct.m14235w()));
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Float.valueOf(((Number) next).floatValue() + ((Number) it.next()).floatValue());
            }
            return ((Number) next).floatValue();
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18682j(int r5, java.lang.String r6, bd.InterfaceC1886d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof mg.C7347m1.C7350c
            if (r0 == 0) goto L13
            r0 = r7
            mg.m1$c r0 = (mg.C7347m1.C7350c) r0
            int r1 = r0.f19508z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19508z = r1
            goto L18
        L13:
            mg.m1$c r0 = new mg.m1$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19506x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19508z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f19505w
            mg.m1 r5 = (mg.C7347m1) r5
            p468yc.C13186n.m1453b(r7)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            p468yc.C13186n.m1453b(r7)
            vg.i0 r7 = r4.f19493a
            r0.f19505w = r4
            r0.f19508z = r3
            java.lang.Object r7 = r7.m5502n(r5, r6, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            df.d r7 = (p065df.NetworkResult) r7
            boolean r6 = r7 instanceof p065df.NetworkResult.C4792b
            if (r6 == 0) goto L63
            java.util.List r6 = r5.f19496d
            r6.clear()
            java.util.List r5 = r5.f19496d
            df.d$b r7 = (p065df.NetworkResult.C4792b) r7
            java.lang.Object r6 = r7.m26590a()
            java.util.Collection r6 = (java.util.Collection) r6
            r5.addAll(r6)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r3)
            return r5
        L63:
            boolean r5 = r7 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L6e
            df.d$a r7 = (p065df.NetworkResult.C4791a) r7
            we.b r5 = r7.m26591a()
            throw r5
        L6e:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7347m1.m18682j(int, java.lang.String, bd.d):java.lang.Object");
    }

    /* renamed from: k */
    public final List m18681k() {
        List m455n0;
        m455n0 = _Collections.m455n0(this.f19496d);
        return m455n0;
    }

    /* renamed from: l */
    public final List m18680l() {
        return this.f19494b.m18516u();
    }

    /* renamed from: m */
    public final TakeAwayOrder m18679m(String str) {
        Object obj;
        Intrinsics.isThisObjectNull(str, "number");
        Iterator it = m18680l().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.equals(((TakeAwayOrder) obj).m14283c(), str)) {
                break;
            }
        }
        return (TakeAwayOrder) obj;
    }

    /* renamed from: n */
    public final Store m18678n() {
        return this.f19495c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18677o(java.lang.String r9, int r10, java.lang.String r11, int r12, int r13, bd.InterfaceC1886d r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof mg.C7347m1.C7351d
            if (r0 == 0) goto L13
            r0 = r14
            mg.m1$d r0 = (mg.C7347m1.C7351d) r0
            int r1 = r0.f19511y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19511y = r1
            goto L18
        L13:
            mg.m1$d r0 = new mg.m1$d
            r0.<init>(r14)
        L18:
            r7 = r0
            java.lang.Object r14 = r7.f19509w
            java.lang.Object r0 = cd.C2111b.m34640d()
            int r1 = r7.f19511y
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            p468yc.C13186n.m1453b(r14)
            goto L45
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            p468yc.C13186n.m1453b(r14)
            vg.i0 r1 = r8.f19493a
            r7.f19511y = r2
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r14 = r1.m5501o(r2, r3, r4, r5, r6, r7)
            if (r14 != r0) goto L45
            return r0
        L45:
            df.d r14 = (p065df.NetworkResult) r14
            boolean r9 = r14 instanceof p065df.NetworkResult.C4792b
            if (r9 == 0) goto L54
            df.d$b r14 = (p065df.NetworkResult.C4792b) r14
            java.lang.Object r9 = r14.m26590a()
            java.util.List r9 = (java.util.List) r9
            return r9
        L54:
            boolean r9 = r14 instanceof p065df.NetworkResult.C4791a
            if (r9 == 0) goto L5f
            df.d$a r14 = (p065df.NetworkResult.C4791a) r14
            we.b r9 = r14.m26591a()
            throw r9
        L5f:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7347m1.m18677o(java.lang.String, int, java.lang.String, int, int, bd.d):java.lang.Object");
    }

    /* renamed from: q */
    public final int m18675q(TakeAwayProduct takeAwayProduct) {
        Intrinsics.isThisObjectNull(takeAwayProduct, "product");
        int m18685g = 30 - m18685g();
        if (m18685g >= 10 || takeAwayProduct.m14235w() > 10) {
            return 10;
        }
        if (m18685g <= 0) {
            m18685g = 0;
        }
        if (m18685g() == 30 && takeAwayProduct.m14235w() == 1) {
            return 0;
        }
        if (m18685g() == 30 && takeAwayProduct.m14235w() == 9) {
            return 10;
        }
        return m18685g + takeAwayProduct.m14235w();
    }

    /* renamed from: r */
    public final String m18674r(Store store, String str, String str2) {
        Intrinsics.isThisObjectNull(store, "store");
        Intrinsics.isThisObjectNull(str, "dayLabel");
        Intrinsics.isThisObjectNull(str2, "hourLabel");
        Object obj = store.m13704r().get(str);
        Intrinsics.ifNullDoSomething(obj);
        String str3 = (String) ((TakeAwaySchedule) obj).m14298b().get(str2);
        return str3 == null ? BuildConfig.VERSION_NAME : str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18673s(bd.InterfaceC1886d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof mg.C7347m1.C7352e
            if (r0 == 0) goto L13
            r0 = r5
            mg.m1$e r0 = (mg.C7347m1.C7352e) r0
            int r1 = r0.f19515z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19515z = r1
            goto L18
        L13:
            mg.m1$e r0 = new mg.m1$e
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19513x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19515z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f19512w
            mg.m1 r0 = (mg.C7347m1) r0
            p468yc.C13186n.m1453b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            p468yc.C13186n.m1453b(r5)
            vg.i0 r5 = r4.f19493a
            r0.f19512w = r4
            r0.f19515z = r3
            java.lang.Object r5 = r5.m5498r(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            df.d r5 = (p065df.NetworkResult) r5
            boolean r1 = r5 instanceof p065df.NetworkResult.C4792b
            if (r1 == 0) goto L6e
            java.util.List r1 = r0.f19497e
            r1.clear()
            java.util.List r0 = r0.f19497e
            df.d$b r5 = (p065df.NetworkResult.C4792b) r5
            java.lang.Object r1 = r5.m26590a()
            pt.pingodoce.app.data.local.models.takeaway.TakeAwayStatus r1 = (pt.pingodoce.app.data.local.models.takeaway.TakeAwayStatus) r1
            java.util.List r1 = r1.m14226c()
            r0.addAll(r1)
            mg.p1$b r0 = new mg.p1$b
            java.lang.Object r5 = r5.m26590a()
            pt.pingodoce.app.data.local.models.takeaway.TakeAwayStatus r5 = (pt.pingodoce.app.data.local.models.takeaway.TakeAwayStatus) r5
            r0.<init>(r5)
            goto L7d
        L6e:
            boolean r0 = r5 instanceof p065df.NetworkResult.C4791a
            if (r0 == 0) goto L7e
            mg.p1$a r0 = new mg.p1$a
            df.d$a r5 = (p065df.NetworkResult.C4791a) r5
            we.b r5 = r5.m26591a()
            r0.<init>(r5)
        L7d:
            return r0
        L7e:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7347m1.m18673s(bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18672t(int r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mg.C7347m1.C7353f
            if (r0 == 0) goto L13
            r0 = r6
            mg.m1$f r0 = (mg.C7347m1.C7353f) r0
            int r1 = r0.f19519z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19519z = r1
            goto L18
        L13:
            mg.m1$f r0 = new mg.m1$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19517x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19519z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f19516w
            mg.m1 r5 = (mg.C7347m1) r5
            p468yc.C13186n.m1453b(r6)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            p468yc.C13186n.m1453b(r6)
            vg.i0 r6 = r4.f19493a
            r0.f19516w = r4
            r0.f19519z = r3
            java.lang.Object r6 = r6.m5497s(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            df.d r6 = (p065df.NetworkResult) r6
            boolean r0 = r6 instanceof p065df.NetworkResult.C4792b
            if (r0 == 0) goto L62
            df.d$b r6 = (p065df.NetworkResult.C4792b) r6
            java.lang.Object r0 = r6.m26590a()
            pt.pingodoce.app.data.remote.models.response.Store r0 = (pt.pingodoce.app.data.remote.models.response.Store) r0
            r5.f19495c = r0
            mg.o1$b r5 = new mg.o1$b
            java.lang.Object r6 = r6.m26590a()
            pt.pingodoce.app.data.remote.models.response.Store r6 = (pt.pingodoce.app.data.remote.models.response.Store) r6
            r5.<init>(r6)
            goto L71
        L62:
            boolean r5 = r6 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L72
            mg.o1$a r5 = new mg.o1$a
            df.d$a r6 = (p065df.NetworkResult.C4791a) r6
            we.b r6 = r6.m26591a()
            r5.<init>(r6)
        L71:
            return r5
        L72:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7347m1.m18672t(int, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18671u(boolean r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mg.C7347m1.C7354g
            if (r0 == 0) goto L13
            r0 = r6
            mg.m1$g r0 = (mg.C7347m1.C7354g) r0
            int r1 = r0.f19520A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19520A = r1
            goto L18
        L13:
            mg.m1$g r0 = new mg.m1$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19523y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19520A
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            boolean r5 = r0.f19522x
            java.lang.Object r0 = r0.f19521w
            mg.m1 r0 = (mg.C7347m1) r0
            p468yc.C13186n.m1453b(r6)
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            p468yc.C13186n.m1453b(r6)
            vg.i0 r6 = r4.f19493a
            r0.f19521w = r4
            r0.f19522x = r5
            r0.f19520A = r3
            java.lang.Object r6 = r6.m5500p(r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r0 = r4
        L4a:
            df.d r6 = (p065df.NetworkResult) r6
            boolean r1 = r6 instanceof p065df.NetworkResult.C4792b
            if (r1 == 0) goto L65
            df.d$b r6 = (p065df.NetworkResult.C4792b) r6
            java.lang.Object r6 = r6.m26590a()
            java.util.List r6 = (java.util.List) r6
            if (r5 == 0) goto L5f
            mg.s0 r5 = r0.f19494b
            r5.m18540T(r6)
        L5f:
            mg.l0$b r5 = new mg.l0$b
            r5.<init>(r6)
            goto L74
        L65:
            boolean r5 = r6 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L75
            mg.l0$a r5 = new mg.l0$a
            df.d$a r6 = (p065df.NetworkResult.C4791a) r6
            we.b r6 = r6.m26591a()
            r5.<init>(r6)
        L74:
            return r5
        L75:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7347m1.m18671u(boolean, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18669w(pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mg.C7347m1.C7355h
            if (r0 == 0) goto L13
            r0 = r6
            mg.m1$h r0 = (mg.C7347m1.C7355h) r0
            int r1 = r0.f19527y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19527y = r1
            goto L18
        L13:
            mg.m1$h r0 = new mg.m1$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19525w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19527y
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
            vg.i0 r6 = r4.f19493a
            r0.f19527y = r3
            java.lang.Object r6 = r6.m5499q(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            df.d r6 = (p065df.NetworkResult) r6
            boolean r5 = r6 instanceof p065df.NetworkResult.C4792b
            if (r5 == 0) goto L76
            df.d$b r6 = (p065df.NetworkResult.C4792b) r6
            java.lang.Object r5 = r6.m26590a()
            pt.pingodoce.app.data.remote.models.response.TakeAwayOrderResponse r5 = (pt.pingodoce.app.data.remote.models.response.TakeAwayOrderResponse) r5
            pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder r5 = r5.m13680b()
            if (r5 == 0) goto L66
            mg.m0$c r5 = new mg.m0$c
            java.lang.Object r6 = r6.m26590a()
            pt.pingodoce.app.data.remote.models.response.TakeAwayOrderResponse r6 = (pt.pingodoce.app.data.remote.models.response.TakeAwayOrderResponse) r6
            pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder r6 = r6.m13680b()
            p181jd.Intrinsics.ifNullDoSomething(r6)
            r5.<init>(r6)
            goto L85
        L66:
            mg.m0$b r5 = new mg.m0$b
            java.lang.Object r6 = r6.m26590a()
            pt.pingodoce.app.data.remote.models.response.TakeAwayOrderResponse r6 = (pt.pingodoce.app.data.remote.models.response.TakeAwayOrderResponse) r6
            java.lang.String r6 = r6.m13681a()
            r5.<init>(r6)
            goto L85
        L76:
            boolean r5 = r6 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L86
            mg.m0$a r5 = new mg.m0$a
            df.d$a r6 = (p065df.NetworkResult.C4791a) r6
            we.b r6 = r6.m26591a()
            r5.<init>(r6)
        L85:
            return r5
        L86:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7347m1.m18669w(pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder, bd.d):java.lang.Object");
    }

    /* renamed from: x */
    public final void m18668x(TakeAwayProduct takeAwayProduct, boolean z) {
        Intrinsics.isThisObjectNull(takeAwayProduct, "item");
        InterfaceC7054a interfaceC7054a = (InterfaceC7054a) this.f19498f.get(Integer.valueOf(takeAwayProduct.m14244i()));
        if (interfaceC7054a != null) {
            this.f19499g = interfaceC7054a;
            InterfaceC7054a interfaceC7054a2 = (InterfaceC7054a) this.f19498f.remove(Integer.valueOf(((TakeAwayProduct) interfaceC7054a).m14244i()));
        }
        if (z) {
            return;
        }
        this.f19499g = null;
    }

    /* renamed from: z */
    public final void m18666z(Store store) {
        Intrinsics.isThisObjectNull(store, "store");
        this.f19495c = store;
    }
}
