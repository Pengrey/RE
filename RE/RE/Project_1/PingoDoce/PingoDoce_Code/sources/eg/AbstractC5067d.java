package eg;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hg.HashMapLocalDataProvider;
import p468yc.C13195u;
import p489zc.Iterables;
import p489zc._Collections;
import tg.InterfaceC10619b;

/* renamed from: eg.d */
/* loaded from: classes2.dex */
public abstract class AbstractC5067d<P extends InterfaceC10619b, T> {

    /* renamed from: a */
    private final HashMapLocalDataProvider f14064a;

    /* renamed from: b */
    private final long f14065b;

    /* renamed from: c */
    private final long f14066c;

    /* renamed from: d */
    private final Map f14067d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ParametersValueAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.base.ParametersValueAgent", m20196f = "ParametersValueAgent.kt", m20195l = {51}, m20194m = "clearCaches")
    /* renamed from: eg.d$a */
    /* loaded from: classes2.dex */
    public static final class C5068a extends AbstractC6757d {

        /* renamed from: A */
        int f14068A;

        /* renamed from: w */
        Object f14069w;

        /* renamed from: x */
        Object f14070x;

        /* renamed from: y */
        /* synthetic */ Object f14071y;

        C5068a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f14071y = obj;
            this.f14068A |= Integer.MIN_VALUE;
            return AbstractC5067d.this.m25755a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ParametersValueAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.base.ParametersValueAgent", m20196f = "ParametersValueAgent.kt", m20195l = {38}, m20194m = "get")
    /* renamed from: eg.d$b */
    /* loaded from: classes2.dex */
    public static final class C5069b extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f14073w;

        /* renamed from: y */
        int f14075y;

        C5069b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f14073w = obj;
            this.f14075y |= Integer.MIN_VALUE;
            return AbstractC5067d.this.m25752d(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ParametersValueAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.base.ParametersValueAgent", m20196f = "ParametersValueAgent.kt", m20195l = {46}, m20194m = "getFlow")
    /* renamed from: eg.d$c */
    /* loaded from: classes2.dex */
    public static final class C5070c extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f14076w;

        /* renamed from: y */
        int f14078y;

        C5070c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f14076w = obj;
            this.f14078y |= Integer.MIN_VALUE;
            return AbstractC5067d.this.m25749g(null, this);
        }
    }

    public AbstractC5067d() {
        this(null, 1, null);
    }

    public AbstractC5067d(HashMapLocalDataProvider hashMapLocalDataProvider) {
        this.f14064a = hashMapLocalDataProvider;
        this.f14065b = 300L;
        this.f14066c = 86400L;
        this.f14067d = new LinkedHashMap();
    }

    /* renamed from: b */
    private final ParametersValueAgent m25754b(InterfaceC10619b interfaceC10619b) {
        return ParametersValueAgent.f14058e.m25762a(interfaceC10619b, m25746j(), m25747i(), getClass().getSimpleName(), this.f14067d.size(), this.f14064a, m25748h());
    }

    /* renamed from: e */
    private final ParametersValueAgent m25751e(InterfaceC10619b interfaceC10619b) {
        Map map = this.f14067d;
        String key = interfaceC10619b.getKey();
        Object obj = map.get(key);
        if (obj == null) {
            obj = m25754b(interfaceC10619b);
            map.put(key, obj);
        }
        return (ParametersValueAgent) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m25755a(bd.InterfaceC1886d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof eg.AbstractC5067d.C5068a
            if (r0 == 0) goto L13
            r0 = r6
            eg.d$a r0 = (eg.AbstractC5067d.C5068a) r0
            int r1 = r0.f14068A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14068A = r1
            goto L18
        L13:
            eg.d$a r0 = new eg.d$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f14071y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f14068A
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r2 = r0.f14070x
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f14069w
            eg.d r4 = (eg.AbstractC5067d) r4
            p468yc.C13186n.m1453b(r6)
            goto L48
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L39:
            p468yc.C13186n.m1453b(r6)
            java.util.Map r6 = r5.f14067d
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
            r4 = r5
            r2 = r6
        L48:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L61
            java.lang.Object r6 = r2.next()
            eg.c r6 = (eg.ParametersValueAgent) r6
            r0.f14069w = r4
            r0.f14070x = r2
            r0.f14068A = r3
            java.lang.Object r6 = r6.m25801g(r0)
            if (r6 != r1) goto L48
            return r1
        L61:
            hg.a r6 = r4.f14064a
            if (r6 == 0) goto L68
            r6.m22705d()
        L68:
            yc.u r6 = p468yc.C13195u.f34156a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.AbstractC5067d.m25755a(bd.d):java.lang.Object");
    }

    /* renamed from: c */
    public final Object m25753c(InterfaceC10619b interfaceC10619b, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m25797k = AbstractC5050a.m25797k(m25751e(interfaceC10619b), interfaceC10619b, false, interfaceC1886d, 2, null);
        m34636d = C2116d.m34636d();
        return m25797k == m34636d ? m25797k : C13195u.f34156a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m25752d(tg.InterfaceC10619b r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof eg.AbstractC5067d.C5069b
            if (r0 == 0) goto L13
            r0 = r6
            eg.d$b r0 = (eg.AbstractC5067d.C5069b) r0
            int r1 = r0.f14075y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14075y = r1
            goto L18
        L13:
            eg.d$b r0 = new eg.d$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f14073w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f14075y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r6)
            eg.c r5 = r4.m25751e(r5)
            r0.f14075y = r3
            java.lang.Object r6 = r5.m25764B(r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            p181jd.Intrinsics.ifNullDoSomething(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.AbstractC5067d.m25752d(tg.b, bd.d):java.lang.Object");
    }

    /* renamed from: f */
    public final List m25750f() {
        int m186r;
        List m455n0;
        Collection<ParametersValueAgent> values = this.f14067d.values();
        m186r = Iterables.m186r(values, 10);
        ArrayList arrayList = new ArrayList(m186r);
        for (ParametersValueAgent parametersValueAgent : values) {
            arrayList.add(parametersValueAgent);
        }
        m455n0 = _Collections.m455n0(arrayList);
        return m455n0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m25749g(tg.InterfaceC10619b r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof eg.AbstractC5067d.C5070c
            if (r0 == 0) goto L13
            r0 = r6
            eg.d$c r0 = (eg.AbstractC5067d.C5070c) r0
            int r1 = r0.f14078y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14078y = r1
            goto L18
        L13:
            eg.d$c r0 = new eg.d$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f14076w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f14078y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r6)
            eg.c r5 = r4.m25751e(r5)
            r0.f14078y = r3
            java.lang.Object r6 = r5.m25763C(r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            kotlinx.coroutines.flow.c r6 = (kotlinx.coroutines.flow.InterfaceC6785c) r6
            kotlinx.coroutines.flow.c r5 = kotlinx.coroutines.flow.C6788e.m20137k(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.AbstractC5067d.m25749g(tg.b, bd.d):java.lang.Object");
    }

    /* renamed from: h */
    public abstract InterfaceC6112p m25748h();

    /* renamed from: i */
    public long m25747i() {
        return this.f14066c;
    }

    /* renamed from: j */
    public long m25746j() {
        return this.f14065b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public final Object m25745k(InterfaceC10619b interfaceC10619b, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m25784x = m25751e(interfaceC10619b).m25784x(interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m25784x == m34636d ? m25784x : C13195u.f34156a;
    }

    /* renamed from: l */
    public final Object m25744l(InterfaceC10619b interfaceC10619b, Object obj, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m25783y = m25751e(interfaceC10619b).m25783y(obj, interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m25783y == m34636d ? m25783y : C13195u.f34156a;
    }

    public /* synthetic */ AbstractC5067d(HashMapLocalDataProvider hashMapLocalDataProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hashMapLocalDataProvider);
    }
}
