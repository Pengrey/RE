package p455y;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p092f0.C5232o1;
import p092f0.InterfaceC5220m0;
import p181jd.Intrinsics;

/* renamed from: y.t */
/* loaded from: classes.dex */
public final class LazyListScrollPosition {

    /* renamed from: g */
    private static final C13042a f33894g = new C13042a(null);

    /* renamed from: a */
    private int f33895a;

    /* renamed from: b */
    private int f33896b;

    /* renamed from: c */
    private final InterfaceC5220m0 f33897c;

    /* renamed from: d */
    private final InterfaceC5220m0 f33898d;

    /* renamed from: e */
    private boolean f33899e;

    /* renamed from: f */
    private Object f33900f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LazyListScrollPosition.kt */
    /* renamed from: y.t$a */
    /* loaded from: classes.dex */
    public static final class C13042a {
        private C13042a() {
        }

        public /* synthetic */ C13042a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static final /* synthetic */ int m1808a(C13042a c13042a, Object obj, int i, InterfaceC13023k interfaceC13023k) {
            return c13042a.m1807b(obj, i, interfaceC13023k);
        }

        /* renamed from: b */
        private final int m1807b(Object obj, int i, InterfaceC13023k interfaceC13023k) {
            Integer num;
            return obj == null ? i : ((i >= interfaceC13023k.mo3321c() || !Intrinsics.equals(obj, interfaceC13023k.getKey(i))) && (num = interfaceC13023k.mo3323a().get(obj)) != null) ? C13015a.m1914a(num.intValue()) : i;
        }
    }

    public LazyListScrollPosition(int i, int i2) {
        InterfaceC5220m0 m24962d;
        InterfaceC5220m0 m24962d2;
        this.f33895a = C13015a.m1914a(i);
        this.f33896b = i2;
        m24962d = C5232o1.m24962d(Integer.valueOf(m1816a()), null, 2, null);
        this.f33897c = m24962d;
        m24962d2 = C5232o1.m24962d(Integer.valueOf(this.f33896b), null, 2, null);
        this.f33898d = m24962d2;
    }

    /* renamed from: f */
    private final void m1811f(int i, int i2) {
        if (((float) i) >= 0.0f) {
            if (!C13015a.m1913b(i, m1816a())) {
                this.f33895a = i;
                this.f33897c.setValue(Integer.valueOf(i));
            }
            if (i2 != this.f33896b) {
                this.f33896b = i2;
                this.f33898d.setValue(Integer.valueOf(i2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
    }

    /* renamed from: a */
    public final int m1816a() {
        return this.f33895a;
    }

    /* renamed from: b */
    public final int m1815b() {
        return ((Number) this.f33897c.getValue()).intValue();
    }

    /* renamed from: c */
    public final int m1814c() {
        return ((Number) this.f33898d.getValue()).intValue();
    }

    /* renamed from: d */
    public final int m1813d() {
        return this.f33896b;
    }

    /* renamed from: e */
    public final void m1812e(int i, int i2) {
        m1811f(i, i2);
        this.f33900f = null;
    }

    /* renamed from: g */
    public final void m1810g(LazyListMeasureResult lazyListMeasureResult) {
        Intrinsics.isThisObjectNull(lazyListMeasureResult, "measureResult");
        C13043u m1847i = lazyListMeasureResult.m1847i();
        this.f33900f = m1847i == null ? null : m1847i.m1804c();
        if (this.f33899e || lazyListMeasureResult.mo40034f() > 0) {
            this.f33899e = true;
            int m1846j = lazyListMeasureResult.m1846j();
            if (((float) m1846j) >= 0.0f) {
                C13043u m1847i2 = lazyListMeasureResult.m1847i();
                m1811f(C13015a.m1914a(m1847i2 != null ? m1847i2.m1805b() : 0), m1846j);
                return;
            }
            throw new IllegalStateException(("scrollOffset should be non-negative (" + m1846j + ')').toString());
        }
    }

    /* renamed from: h */
    public final void m1809h(InterfaceC13023k interfaceC13023k) {
        Intrinsics.isThisObjectNull(interfaceC13023k, "itemsProvider");
        m1811f(C13042a.m1808a(f33894g, this.f33900f, m1816a(), interfaceC13023k), this.f33896b);
    }
}
