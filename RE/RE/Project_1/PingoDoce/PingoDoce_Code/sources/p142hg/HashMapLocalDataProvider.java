package p142hg;

import android.content.SharedPreferences;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.squareup.moshi.C4516s;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.sync.C6939e;
import kotlinx.coroutines.sync.InterfaceC6930c;
import org.threeten.p283bp.C8216e;
import p181jd.Intrinsics;
import p398v5.SharedPrefsKtx;
import p468yc.C13195u;
import tg.InterfaceC10619b;

/* renamed from: hg.a */
/* loaded from: classes2.dex */
public abstract class HashMapLocalDataProvider<P extends InterfaceC10619b, T> {

    /* renamed from: d */
    protected SharedPreferences f16390d;

    /* renamed from: a */
    private final long f16387a = 300;

    /* renamed from: b */
    private final long f16388b = 3600;

    /* renamed from: c */
    private final InterfaceC6930c f16389c = C6939e.m19759b(false, 1, null);

    /* renamed from: e */
    private final ParameterizedType f16391e = C4516s.m27327j(Map.class, String.class, C4516s.m27327j(pt.pingodoce.app.data.local.dataProviders.base.HashMapLocalDataProvider.class, mo23359l()));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HashMapLocalDataProvider.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.local.dataProviders.base.HashMapLocalDataProvider", m20196f = "HashMapLocalDataProvider.kt", m20195l = {157}, m20194m = "get")
    /* renamed from: hg.a$a */
    /* loaded from: classes2.dex */
    public static final class C5926a extends AbstractC6757d {

        /* renamed from: B */
        int f16393B;

        /* renamed from: w */
        Object f16394w;

        /* renamed from: x */
        Object f16395x;

        /* renamed from: y */
        Object f16396y;

        /* renamed from: z */
        /* synthetic */ Object f16397z;

        C5926a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f16397z = obj;
            this.f16393B |= Integer.MIN_VALUE;
            return HashMapLocalDataProvider.this.m22704e(null, this);
        }
    }

    /* compiled from: HashMapLocalDataProvider.kt */
    /* renamed from: hg.a$b */
    /* loaded from: classes2.dex */
    public static final class C5927b extends AbstractC5932c {

        /* renamed from: b */
        final /* synthetic */ InterfaceC10619b f16399b;

        C5927b(InterfaceC10619b interfaceC10619b) {
            this.f16399b = interfaceC10619b;
        }

        /* renamed from: a */
        public Object mo22690a(InterfaceC1886d interfaceC1886d) {
            HashMapLocalDataProvider hashMapLocalDataProvider = HashMapLocalDataProvider.this;
            Map m22707b = HashMapLocalDataProvider.m22707b(hashMapLocalDataProvider);
            m22707b.remove(this.f16399b.getKey());
            HashMapLocalDataProvider.m22706c(hashMapLocalDataProvider, m22707b);
            return C13195u.f34156a;
        }

        /* renamed from: b */
        public boolean mo22689b() {
            return HashMapLocalDataProvider.m22708a(HashMapLocalDataProvider.this, this.f16399b) != null;
        }

        /* renamed from: c */
        public Object mo22688c(InterfaceC1886d interfaceC1886d) {
            return HashMapLocalDataProvider.this.m22704e(this.f16399b, interfaceC1886d);
        }

        /* renamed from: d */
        public C8216e mo22687d() {
            C8216e m14781c;
            pt.pingodoce.app.data.local.dataProviders.base.HashMapLocalDataProvider m22708a = HashMapLocalDataProvider.m22708a(HashMapLocalDataProvider.this, this.f16399b);
            if (m22708a == null || (m14781c = m22708a.m14781c()) == null) {
                C8216e c8216e = C8216e.f21368y;
                Intrinsics.checkIfNull(c8216e, "MIN");
                return c8216e;
            }
            return m14781c;
        }

        /* renamed from: e */
        public C8216e mo22686e() {
            C8216e m14780d;
            pt.pingodoce.app.data.local.dataProviders.base.HashMapLocalDataProvider m22708a = HashMapLocalDataProvider.m22708a(HashMapLocalDataProvider.this, this.f16399b);
            if (m22708a == null || (m14780d = m22708a.m14780d()) == null) {
                C8216e c8216e = C8216e.f21368y;
                Intrinsics.checkIfNull(c8216e, "MIN");
                return c8216e;
            }
            return m14780d;
        }

        /* renamed from: g */
        public Object mo22684g(InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object m22695n = HashMapLocalDataProvider.this.m22695n(this.f16399b, interfaceC1886d);
            m34636d = C2116d.m34636d();
            return m22695n == m34636d ? m22695n : C13195u.f34156a;
        }

        /* renamed from: h */
        public Object mo22683h(InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object m22694o = HashMapLocalDataProvider.this.m22694o(this.f16399b, interfaceC1886d);
            m34636d = C2116d.m34636d();
            return m22694o == m34636d ? m22694o : C13195u.f34156a;
        }

        /* renamed from: i */
        public Object mo22682i(Object obj, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object m22693p = HashMapLocalDataProvider.this.m22693p(this.f16399b, obj, interfaceC1886d);
            m34636d = C2116d.m34636d();
            return m22693p == m34636d ? m22693p : C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HashMapLocalDataProvider.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.local.dataProviders.base.HashMapLocalDataProvider", m20196f = "HashMapLocalDataProvider.kt", m20195l = {157}, m20194m = "markAsExpired")
    /* renamed from: hg.a$c */
    /* loaded from: classes2.dex */
    public static final class C5928c extends AbstractC6757d {

        /* renamed from: B */
        int f16401B;

        /* renamed from: w */
        Object f16402w;

        /* renamed from: x */
        Object f16403x;

        /* renamed from: y */
        Object f16404y;

        /* renamed from: z */
        /* synthetic */ Object f16405z;

        C5928c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f16405z = obj;
            this.f16401B |= Integer.MIN_VALUE;
            return HashMapLocalDataProvider.this.m22695n(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HashMapLocalDataProvider.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.local.dataProviders.base.HashMapLocalDataProvider", m20196f = "HashMapLocalDataProvider.kt", m20195l = {157}, m20194m = "markAsNotFresh")
    /* renamed from: hg.a$d */
    /* loaded from: classes2.dex */
    public static final class C5929d extends AbstractC6757d {

        /* renamed from: B */
        int f16407B;

        /* renamed from: w */
        Object f16408w;

        /* renamed from: x */
        Object f16409x;

        /* renamed from: y */
        Object f16410y;

        /* renamed from: z */
        /* synthetic */ Object f16411z;

        C5929d(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f16411z = obj;
            this.f16407B |= Integer.MIN_VALUE;
            return HashMapLocalDataProvider.this.m22694o(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HashMapLocalDataProvider.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.local.dataProviders.base.HashMapLocalDataProvider", m20196f = "HashMapLocalDataProvider.kt", m20195l = {157}, m20194m = "put")
    /* renamed from: hg.a$e */
    /* loaded from: classes2.dex */
    public static final class C5930e extends AbstractC6757d {

        /* renamed from: A */
        /* synthetic */ Object f16412A;

        /* renamed from: C */
        int f16414C;

        /* renamed from: w */
        Object f16415w;

        /* renamed from: x */
        Object f16416x;

        /* renamed from: y */
        Object f16417y;

        /* renamed from: z */
        Object f16418z;

        C5930e(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f16412A = obj;
            this.f16414C |= Integer.MIN_VALUE;
            return HashMapLocalDataProvider.this.m22693p(null, null, this);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ pt.pingodoce.app.data.local.dataProviders.base.HashMapLocalDataProvider m22708a(HashMapLocalDataProvider hashMapLocalDataProvider, InterfaceC10619b interfaceC10619b) {
        return hashMapLocalDataProvider.m22702g(interfaceC10619b);
    }

    /* renamed from: b */
    public static final /* synthetic */ Map m22707b(HashMapLocalDataProvider hashMapLocalDataProvider) {
        return hashMapLocalDataProvider.m22701h();
    }

    /* renamed from: c */
    public static final /* synthetic */ void m22706c(HashMapLocalDataProvider hashMapLocalDataProvider, Map map) {
        hashMapLocalDataProvider.m22692q(map);
    }

    /* renamed from: g */
    private final pt.pingodoce.app.data.local.dataProviders.base.HashMapLocalDataProvider m22702g(InterfaceC10619b interfaceC10619b) {
        return (pt.pingodoce.app.data.local.dataProviders.base.HashMapLocalDataProvider) m22701h().get(interfaceC10619b.getKey());
    }

    /* renamed from: h */
    private final Map m22701h() {
        SharedPreferences m22700i = m22700i();
        String mo23360f = mo23360f();
        ParameterizedType parameterizedType = this.f16391e;
        Intrinsics.checkIfNull(parameterizedType, "hashMapType");
        Map map = (Map) C5935e.m22649a(m22700i, mo23360f, parameterizedType, null);
        if (map == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            m22692q(linkedHashMap);
            return linkedHashMap;
        }
        return map;
    }

    /* renamed from: q */
    private final void m22692q(Map map) {
        SharedPreferences m22700i = m22700i();
        String mo23360f = mo23360f();
        ParameterizedType parameterizedType = this.f16391e;
        Intrinsics.checkIfNull(parameterizedType, "hashMapType");
        SharedPrefsKtx.m6038i(m22700i, mo23360f, map, parameterizedType, null, 8, null);
    }

    /* renamed from: d */
    public final void m22705d() {
        m22692q(new LinkedHashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:18:0x0055, B:20:0x005b), top: B:28:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m22704e(tg.InterfaceC10619b r6, bd.InterfaceC1886d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p142hg.HashMapLocalDataProvider.C5926a
            if (r0 == 0) goto L13
            r0 = r7
            hg.a$a r0 = (p142hg.HashMapLocalDataProvider.C5926a) r0
            int r1 = r0.f16393B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16393B = r1
            goto L18
        L13:
            hg.a$a r0 = new hg.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f16397z
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f16393B
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.f16396y
            kotlinx.coroutines.sync.c r6 = (kotlinx.coroutines.sync.InterfaceC6930c) r6
            java.lang.Object r1 = r0.f16395x
            tg.b r1 = (tg.InterfaceC10619b) r1
            java.lang.Object r0 = r0.f16394w
            hg.a r0 = (p142hg.HashMapLocalDataProvider) r0
            p468yc.C13186n.m1453b(r7)
            r7 = r6
            r6 = r1
            goto L55
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            p468yc.C13186n.m1453b(r7)
            kotlinx.coroutines.sync.c r7 = r5.f16389c
            r0.f16394w = r5
            r0.f16395x = r6
            r0.f16396y = r7
            r0.f16393B = r3
            java.lang.Object r0 = r7.mo19768c(r4, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r5
        L55:
            pt.pingodoce.app.data.local.dataProviders.base.LocalCacheType r6 = r0.m22702g(r6)     // Catch: java.lang.Throwable -> L65
            if (r6 == 0) goto L60
            java.lang.Object r6 = r6.m14779e()     // Catch: java.lang.Throwable -> L65
            goto L61
        L60:
            r6 = r4
        L61:
            r7.mo19770a(r4)
            return r6
        L65:
            r6 = move-exception
            r7.mo19770a(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p142hg.HashMapLocalDataProvider.m22704e(tg.b, bd.d):java.lang.Object");
    }

    /* renamed from: f */
    public abstract String mo23360f();

    /* renamed from: i */
    protected final SharedPreferences m22700i() {
        SharedPreferences sharedPreferences = this.f16390d;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitPropException("prefs");
        return null;
    }

    /* renamed from: j */
    public long m22699j() {
        return this.f16388b;
    }

    /* renamed from: k */
    public long m22698k() {
        return this.f16387a;
    }

    /* renamed from: l */
    protected abstract Type mo23359l();

    /* renamed from: m */
    public final AbstractC5932c m22696m(InterfaceC10619b interfaceC10619b) {
        Intrinsics.isThisObjectNull(interfaceC10619b, "parameters");
        return new C5927b(interfaceC10619b);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[Catch: all -> 0x007e, TryCatch #0 {all -> 0x007e, blocks: (B:18:0x0055, B:20:0x005b, B:21:0x0078), top: B:27:0x0055 }] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m22695n(tg.InterfaceC10619b r11, bd.InterfaceC1886d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof p142hg.HashMapLocalDataProvider.C5928c
            if (r0 == 0) goto L13
            r0 = r12
            hg.a$c r0 = (p142hg.HashMapLocalDataProvider.C5928c) r0
            int r1 = r0.f16401B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16401B = r1
            goto L18
        L13:
            hg.a$c r0 = new hg.a$c
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f16405z
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f16401B
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r11 = r0.f16404y
            kotlinx.coroutines.sync.c r11 = (kotlinx.coroutines.sync.InterfaceC6930c) r11
            java.lang.Object r1 = r0.f16403x
            tg.b r1 = (tg.InterfaceC10619b) r1
            java.lang.Object r0 = r0.f16402w
            hg.a r0 = (p142hg.HashMapLocalDataProvider) r0
            p468yc.C13186n.m1453b(r12)
            r12 = r11
            r11 = r1
            goto L55
        L38:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L40:
            p468yc.C13186n.m1453b(r12)
            kotlinx.coroutines.sync.c r12 = r10.f16389c
            r0.f16402w = r10
            r0.f16403x = r11
            r0.f16404y = r12
            r0.f16401B = r4
            java.lang.Object r0 = r12.mo19768c(r3, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r10
        L55:
            pt.pingodoce.app.data.local.dataProviders.base.LocalCacheType r4 = r0.m22702g(r11)     // Catch: java.lang.Throwable -> L7e
            if (r4 == 0) goto L78
            java.util.Map r1 = r0.m22701h()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r11 = r11.getKey()     // Catch: java.lang.Throwable -> L7e
            r5 = 0
            org.threeten.bp.e r6 = org.threeten.p283bp.C8216e.f21368y     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = "MIN"
            p181jd.Intrinsics.checkIfNull(r6, r2)     // Catch: java.lang.Throwable -> L7e
            r7 = 0
            r8 = 5
            r9 = 0
            pt.pingodoce.app.data.local.dataProviders.base.LocalCacheType r2 = pt.pingodoce.app.data.local.dataProviders.base.HashMapLocalDataProvider.m14782b(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L7e
            r1.put(r11, r2)     // Catch: java.lang.Throwable -> L7e
            r0.m22692q(r1)     // Catch: java.lang.Throwable -> L7e
        L78:
            yc.u r11 = p468yc.C13195u.f34156a     // Catch: java.lang.Throwable -> L7e
            r12.mo19770a(r3)
            return r11
        L7e:
            r11 = move-exception
            r12.mo19770a(r3)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p142hg.HashMapLocalDataProvider.m22695n(tg.b, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[Catch: all -> 0x007e, TryCatch #0 {all -> 0x007e, blocks: (B:18:0x0055, B:20:0x005b, B:21:0x0078), top: B:27:0x0055 }] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m22694o(tg.InterfaceC10619b r11, bd.InterfaceC1886d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof p142hg.HashMapLocalDataProvider.C5929d
            if (r0 == 0) goto L13
            r0 = r12
            hg.a$d r0 = (p142hg.HashMapLocalDataProvider.C5929d) r0
            int r1 = r0.f16407B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16407B = r1
            goto L18
        L13:
            hg.a$d r0 = new hg.a$d
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f16411z
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f16407B
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r11 = r0.f16410y
            kotlinx.coroutines.sync.c r11 = (kotlinx.coroutines.sync.InterfaceC6930c) r11
            java.lang.Object r1 = r0.f16409x
            tg.b r1 = (tg.InterfaceC10619b) r1
            java.lang.Object r0 = r0.f16408w
            hg.a r0 = (p142hg.HashMapLocalDataProvider) r0
            p468yc.C13186n.m1453b(r12)
            r12 = r11
            r11 = r1
            goto L55
        L38:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L40:
            p468yc.C13186n.m1453b(r12)
            kotlinx.coroutines.sync.c r12 = r10.f16389c
            r0.f16408w = r10
            r0.f16409x = r11
            r0.f16410y = r12
            r0.f16407B = r4
            java.lang.Object r0 = r12.mo19768c(r3, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r10
        L55:
            pt.pingodoce.app.data.local.dataProviders.base.LocalCacheType r4 = r0.m22702g(r11)     // Catch: java.lang.Throwable -> L7e
            if (r4 == 0) goto L78
            java.util.Map r1 = r0.m22701h()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r11 = r11.getKey()     // Catch: java.lang.Throwable -> L7e
            org.threeten.bp.e r5 = org.threeten.p283bp.C8216e.f21368y     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = "MIN"
            p181jd.Intrinsics.checkIfNull(r5, r2)     // Catch: java.lang.Throwable -> L7e
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            pt.pingodoce.app.data.local.dataProviders.base.LocalCacheType r2 = pt.pingodoce.app.data.local.dataProviders.base.HashMapLocalDataProvider.m14782b(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L7e
            r1.put(r11, r2)     // Catch: java.lang.Throwable -> L7e
            r0.m22692q(r1)     // Catch: java.lang.Throwable -> L7e
        L78:
            yc.u r11 = p468yc.C13195u.f34156a     // Catch: java.lang.Throwable -> L7e
            r12.mo19770a(r3)
            return r11
        L7e:
            r11 = move-exception
            r12.mo19770a(r3)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p142hg.HashMapLocalDataProvider.m22694o(tg.b, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:18:0x0059, B:20:0x005f, B:21:0x0067), top: B:27:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067 A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {all -> 0x00a0, blocks: (B:18:0x0059, B:20:0x005f, B:21:0x0067), top: B:27:0x0059 }] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m22693p(tg.InterfaceC10619b r8, java.lang.Object r9, bd.InterfaceC1886d r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p142hg.HashMapLocalDataProvider.C5930e
            if (r0 == 0) goto L13
            r0 = r10
            hg.a$e r0 = (p142hg.HashMapLocalDataProvider.C5930e) r0
            int r1 = r0.f16414C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16414C = r1
            goto L18
        L13:
            hg.a$e r0 = new hg.a$e
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f16412A
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f16414C
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 != r4) goto L3a
            java.lang.Object r8 = r0.f16418z
            kotlinx.coroutines.sync.c r8 = (kotlinx.coroutines.sync.InterfaceC6930c) r8
            java.lang.Object r9 = r0.f16417y
            java.lang.Object r1 = r0.f16416x
            tg.b r1 = (tg.InterfaceC10619b) r1
            java.lang.Object r0 = r0.f16415w
            hg.a r0 = (p142hg.HashMapLocalDataProvider) r0
            p468yc.C13186n.m1453b(r10)
            r10 = r8
            r8 = r1
            goto L59
        L3a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L42:
            p468yc.C13186n.m1453b(r10)
            kotlinx.coroutines.sync.c r10 = r7.f16389c
            r0.f16415w = r7
            r0.f16416x = r8
            r0.f16417y = r9
            r0.f16418z = r10
            r0.f16414C = r4
            java.lang.Object r0 = r10.mo19768c(r3, r0)
            if (r0 != r1) goto L58
            return r1
        L58:
            r0 = r7
        L59:
            java.util.Map r1 = r0.m22701h()     // Catch: java.lang.Throwable -> La0
            if (r9 != 0) goto L67
            java.lang.String r8 = r8.getKey()     // Catch: java.lang.Throwable -> La0
            r1.remove(r8)     // Catch: java.lang.Throwable -> La0
            goto L9a
        L67:
            org.threeten.bp.e r2 = org.threeten.p283bp.C8216e.m16153G()     // Catch: java.lang.Throwable -> La0
            long r4 = r0.m22698k()     // Catch: java.lang.Throwable -> La0
            org.threeten.bp.e r2 = r2.m16144P(r4)     // Catch: java.lang.Throwable -> La0
            org.threeten.bp.e r4 = org.threeten.p283bp.C8216e.m16153G()     // Catch: java.lang.Throwable -> La0
            long r5 = r0.m22699j()     // Catch: java.lang.Throwable -> La0
            org.threeten.bp.e r4 = r4.m16144P(r5)     // Catch: java.lang.Throwable -> La0
            pt.pingodoce.app.data.local.dataProviders.base.LocalCacheType r5 = new pt.pingodoce.app.data.local.dataProviders.base.LocalCacheType     // Catch: java.lang.Throwable -> La0
            java.lang.String r6 = "refreshDate"
            p181jd.Intrinsics.checkIfNull(r2, r6)     // Catch: java.lang.Throwable -> La0
            java.lang.String r6 = "expiryDate"
            p181jd.Intrinsics.checkIfNull(r4, r6)     // Catch: java.lang.Throwable -> La0
            r5.<init>(r2, r4, r9)     // Catch: java.lang.Throwable -> La0
            java.lang.String r8 = r8.getKey()     // Catch: java.lang.Throwable -> La0
            r1.put(r8, r5)     // Catch: java.lang.Throwable -> La0
            r0.m22692q(r1)     // Catch: java.lang.Throwable -> La0
            yc.u r8 = p468yc.C13195u.f34156a     // Catch: java.lang.Throwable -> La0
        L9a:
            r10.mo19770a(r3)
            yc.u r8 = p468yc.C13195u.f34156a
            return r8
        La0:
            r8 = move-exception
            r10.mo19770a(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p142hg.HashMapLocalDataProvider.m22693p(tg.b, java.lang.Object, bd.d):java.lang.Object");
    }
}
