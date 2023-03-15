package p095f3;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p129h3.InterfaceC5830g;
import p181jd.Intrinsics;
import p193k3.C6592l;
import p193k3.InterfaceC6580h;
import p213l3.InterfaceC6978b;
import p232m3.InterfaceC7113b;
import p247n3.InterfaceC7638d;
import p305q3.C9635k;
import p396v3.C11091c;
import p468yc.C13182l;
import p468yc.C13191r;
import p489zc._Collections;

/* renamed from: f3.b */
/* loaded from: classes.dex */
public final class C5349b {

    /* renamed from: a */
    private final List<InterfaceC6978b> f14759a;

    /* renamed from: b */
    private final List<C13182l<InterfaceC7638d<? extends Object, ? extends Object>, Class<? extends Object>>> f14760b;

    /* renamed from: c */
    private final List<C13182l<InterfaceC7113b<? extends Object>, Class<? extends Object>>> f14761c;

    /* renamed from: d */
    private final List<C13182l<InterfaceC6580h.InterfaceC6581a<? extends Object>, Class<? extends Object>>> f14762d;

    /* renamed from: e */
    private final List<InterfaceC5830g.InterfaceC5831a> f14763e;

    /* compiled from: ComponentRegistry.kt */
    /* renamed from: f3.b$a */
    /* loaded from: classes.dex */
    public static final class C5350a {

        /* renamed from: a */
        private final List<InterfaceC6978b> f14764a;

        /* renamed from: b */
        private final List<C13182l<InterfaceC7638d<? extends Object, ?>, Class<? extends Object>>> f14765b;

        /* renamed from: c */
        private final List<C13182l<InterfaceC7113b<? extends Object>, Class<? extends Object>>> f14766c;

        /* renamed from: d */
        private final List<C13182l<InterfaceC6580h.InterfaceC6581a<? extends Object>, Class<? extends Object>>> f14767d;

        /* renamed from: e */
        private final List<InterfaceC5830g.InterfaceC5831a> f14768e;

        public C5350a(C5349b c5349b) {
            List<InterfaceC6978b> m453p0;
            List<C13182l<InterfaceC7638d<? extends Object, ?>, Class<? extends Object>>> m453p02;
            List<C13182l<InterfaceC7113b<? extends Object>, Class<? extends Object>>> m453p03;
            List<C13182l<InterfaceC6580h.InterfaceC6581a<? extends Object>, Class<? extends Object>>> m453p04;
            List<InterfaceC5830g.InterfaceC5831a> m453p05;
            m453p0 = _Collections.m453p0(c5349b.m24544c());
            this.f14764a = m453p0;
            m453p02 = _Collections.m453p0(c5349b.m24542e());
            this.f14765b = m453p02;
            m453p03 = _Collections.m453p0(c5349b.m24543d());
            this.f14766c = m453p03;
            m453p04 = _Collections.m453p0(c5349b.m24545b());
            this.f14767d = m453p04;
            m453p05 = _Collections.m453p0(c5349b.m24546a());
            this.f14768e = m453p05;
        }

        /* renamed from: a */
        public final C5350a m24536a(InterfaceC5830g.InterfaceC5831a interfaceC5831a) {
            this.f14768e.add(interfaceC5831a);
            return this;
        }

        /* renamed from: b */
        public final <T> C5350a m24535b(InterfaceC6580h.InterfaceC6581a<T> interfaceC6581a, Class<T> cls) {
            this.f14767d.add(C13191r.m1447a(interfaceC6581a, cls));
            return this;
        }

        /* renamed from: c */
        public final <T> C5350a m24534c(InterfaceC7113b<T> interfaceC7113b, Class<T> cls) {
            this.f14766c.add(C13191r.m1447a(interfaceC7113b, cls));
            return this;
        }

        /* renamed from: d */
        public final <T> C5350a m24533d(InterfaceC7638d<T, ?> interfaceC7638d, Class<T> cls) {
            this.f14765b.add(C13191r.m1447a(interfaceC7638d, cls));
            return this;
        }

        /* renamed from: e */
        public final C5349b m24532e() {
            return new C5349b(C11091c.m6170a(this.f14764a), C11091c.m6170a(this.f14765b), C11091c.m6170a(this.f14766c), C11091c.m6170a(this.f14767d), C11091c.m6170a(this.f14768e), null);
        }

        /* renamed from: f */
        public final List<InterfaceC5830g.InterfaceC5831a> m24531f() {
            return this.f14768e;
        }

        /* renamed from: g */
        public final List<C13182l<InterfaceC6580h.InterfaceC6581a<? extends Object>, Class<? extends Object>>> m24530g() {
            return this.f14767d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C5349b(List<? extends InterfaceC6978b> list, List<? extends C13182l<? extends InterfaceC7638d<? extends Object, ? extends Object>, ? extends Class<? extends Object>>> list2, List<? extends C13182l<? extends InterfaceC7113b<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends C13182l<? extends InterfaceC6580h.InterfaceC6581a<? extends Object>, ? extends Class<? extends Object>>> list4, List<? extends InterfaceC5830g.InterfaceC5831a> list5) {
        this.f14759a = list;
        this.f14760b = list2;
        this.f14761c = list3;
        this.f14762d = list4;
        this.f14763e = list5;
    }

    public /* synthetic */ C5349b(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    /* renamed from: a */
    public final List<InterfaceC5830g.InterfaceC5831a> m24546a() {
        return this.f14763e;
    }

    /* renamed from: b */
    public final List<C13182l<InterfaceC6580h.InterfaceC6581a<? extends Object>, Class<? extends Object>>> m24545b() {
        return this.f14762d;
    }

    /* renamed from: c */
    public final List<InterfaceC6978b> m24544c() {
        return this.f14759a;
    }

    /* renamed from: d */
    public final List<C13182l<InterfaceC7113b<? extends Object>, Class<? extends Object>>> m24543d() {
        return this.f14761c;
    }

    /* renamed from: e */
    public final List<C13182l<InterfaceC7638d<? extends Object, ? extends Object>, Class<? extends Object>>> m24542e() {
        return this.f14760b;
    }

    /* renamed from: f */
    public final String m24541f(Object obj, C9635k c9635k) {
        List<C13182l<InterfaceC7113b<? extends Object>, Class<? extends Object>>> list = this.f14761c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C13182l<InterfaceC7113b<? extends Object>, Class<? extends Object>> c13182l = list.get(i);
            InterfaceC7113b<? extends Object> m1462a = c13182l.m1462a();
            if (c13182l.m1461b().isAssignableFrom(obj.getClass())) {
                Intrinsics.m20929f(m1462a, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String mo19194b = m1462a.mo19194b(obj, c9635k);
                if (mo19194b != null) {
                    return mo19194b;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public final Object m24540g(Object obj, C9635k c9635k) {
        List<C13182l<InterfaceC7638d<? extends Object, ? extends Object>, Class<? extends Object>>> list = this.f14760b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C13182l<InterfaceC7638d<? extends Object, ? extends Object>, Class<? extends Object>> c13182l = list.get(i);
            InterfaceC7638d<? extends Object, ? extends Object> m1462a = c13182l.m1462a();
            if (c13182l.m1461b().isAssignableFrom(obj.getClass())) {
                Intrinsics.m20929f(m1462a, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object mo17877b = m1462a.mo17877b(obj, c9635k);
                if (mo17877b != null) {
                    obj = mo17877b;
                }
            }
        }
        return obj;
    }

    /* renamed from: h */
    public final C5350a m24539h() {
        return new C5350a(this);
    }

    /* renamed from: i */
    public final C13182l<InterfaceC5830g, Integer> m24538i(C6592l c6592l, C9635k c9635k, InterfaceC5359e interfaceC5359e, int i) {
        int size = this.f14763e.size();
        while (i < size) {
            InterfaceC5830g mo22967a = this.f14763e.get(i).mo22967a(c6592l, c9635k, interfaceC5359e);
            if (mo22967a != null) {
                return C13191r.m1447a(mo22967a, Integer.valueOf(i));
            }
            i++;
        }
        return null;
    }

    /* renamed from: j */
    public final C13182l<InterfaceC6580h, Integer> m24537j(Object obj, C9635k c9635k, InterfaceC5359e interfaceC5359e, int i) {
        int size = this.f14762d.size();
        while (i < size) {
            C13182l<InterfaceC6580h.InterfaceC6581a<? extends Object>, Class<? extends Object>> c13182l = this.f14762d.get(i);
            InterfaceC6580h.InterfaceC6581a<? extends Object> m1462a = c13182l.m1462a();
            if (c13182l.m1461b().isAssignableFrom(obj.getClass())) {
                Intrinsics.m20929f(m1462a, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                InterfaceC6580h mo20560b = m1462a.mo20560b(obj, c9635k, interfaceC5359e);
                if (mo20560b != null) {
                    return C13191r.m1447a(mo20560b, Integer.valueOf(i));
                }
            }
            i++;
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5349b() {
        /*
            r6 = this;
            java.util.List r1 = p489zc.C13777q.m237g()
            java.util.List r2 = p489zc.C13777q.m237g()
            java.util.List r3 = p489zc.C13777q.m237g()
            java.util.List r4 = p489zc.C13777q.m237g()
            java.util.List r5 = p489zc.C13777q.m237g()
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p095f3.C5349b.<init>():void");
    }
}
