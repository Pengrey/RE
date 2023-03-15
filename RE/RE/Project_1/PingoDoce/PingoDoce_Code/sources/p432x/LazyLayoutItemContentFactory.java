package p432x;

import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.LinkedHashMap;
import java.util.Map;
import p092f0.C5232o1;
import p092f0.C5266y;
import p092f0.Effects;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5220m0;
import p092f0.InterfaceC5264x;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p229m0.ComposableLambda;
import p244n0.InterfaceC7559c;
import p468yc.C13195u;
import p479z1.C13599b;
import p479z1.C13601c;
import p479z1.C13604f;
import p479z1.Density;

/* renamed from: x.c */
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactory {

    /* renamed from: a */
    private final InterfaceC7559c f32210a;

    /* renamed from: b */
    private final InterfaceC6097a f32211b;

    /* renamed from: c */
    private final Map f32212c;

    /* renamed from: d */
    private Density f32213d;

    /* renamed from: e */
    private long f32214e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LazyLayoutItemContentFactory.kt */
    /* renamed from: x.c$a */
    /* loaded from: classes.dex */
    public final class C12211a {

        /* renamed from: a */
        private final Object f32215a;

        /* renamed from: b */
        private final InterfaceC5220m0 f32216b;

        /* renamed from: c */
        private final InterfaceC6112p f32217c;

        /* renamed from: d */
        final /* synthetic */ LazyLayoutItemContentFactory f32218d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LazyLayoutItemContentFactory.kt */
        /* renamed from: x.c$a$a */
        /* loaded from: classes.dex */
        public static final class C12212a extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            final /* synthetic */ LazyLayoutItemContentFactory f32219w;

            /* renamed from: x */
            final /* synthetic */ C12211a f32220x;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: LazyLayoutItemContentFactory.kt */
            /* renamed from: x.c$a$a$a */
            /* loaded from: classes.dex */
            public static final class C12213a extends AbstractC6438m implements InterfaceC6108l {

                /* renamed from: w */
                final /* synthetic */ LazyLayoutItemContentFactory f32221w;

                /* renamed from: x */
                final /* synthetic */ C12211a f32222x;

                /* compiled from: Effects.kt */
                /* renamed from: x.c$a$a$a$a */
                /* loaded from: classes.dex */
                public static final class C12214a implements InterfaceC5264x {

                    /* renamed from: a */
                    final /* synthetic */ LazyLayoutItemContentFactory f32223a;

                    /* renamed from: b */
                    final /* synthetic */ C12211a f32224b;

                    public C12214a(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, C12211a c12211a) {
                        this.f32223a = lazyLayoutItemContentFactory;
                        this.f32224b = c12211a;
                    }

                    /* renamed from: b */
                    public void mo24852b() {
                        LazyLayoutItemContentFactory.m3387b(this.f32223a).remove(this.f32224b.m3381c());
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C12213a(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, C12211a c12211a) {
                    super(1);
                    this.f32221w = lazyLayoutItemContentFactory;
                    this.f32222x = c12211a;
                }

                /* renamed from: a */
                public final InterfaceC5264x mo9587d(C5266y c5266y) {
                    Intrinsics.isThisObjectNull(c5266y, "$this$DisposableEffect");
                    return new C12214a(this.f32221w, this.f32222x);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12212a(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, C12211a c12211a) {
                super(2);
                this.f32219w = lazyLayoutItemContentFactory;
                this.f32220x = c12211a;
            }

            /* renamed from: F */
            public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                m3377a((InterfaceC5179i) obj, ((Number) obj2).intValue());
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m3377a(InterfaceC5179i interfaceC5179i, int i) {
                int intValue;
                if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                    interfaceC5179i.mo25264f();
                    return;
                }
                InterfaceC12217f interfaceC12217f = (InterfaceC12217f) LazyLayoutItemContentFactory.m3388a(this.f32219w).mo42214q();
                Integer num = interfaceC12217f.mo3323a().get(this.f32220x.m3381c());
                if (num == null) {
                    num = null;
                } else {
                    C12211a.m3383a(this.f32220x, num.intValue());
                }
                if (num == null) {
                    intValue = this.f32220x.m3380d();
                } else {
                    intValue = num.intValue();
                }
                interfaceC5179i.mo25263g(494375263);
                if (intValue < interfaceC12217f.mo3321c()) {
                    Object key = interfaceC12217f.getKey(intValue);
                    if (Intrinsics.equals(key, this.f32220x.m3381c())) {
                        LazyLayoutItemContentFactory.m3386c(this.f32219w).mo18147a(key, interfaceC12217f.mo3322b(intValue), interfaceC5179i, 520);
                    }
                }
                interfaceC5179i.mo25282C();
                Effects.m25541a(this.f32220x.m3381c(), new C12213a(this.f32219w, this.f32220x), interfaceC5179i, 8);
            }
        }

        public C12211a(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, int i, Object obj) {
            InterfaceC5220m0 m24962d;
            Intrinsics.isThisObjectNull(lazyLayoutItemContentFactory, "this$0");
            Intrinsics.isThisObjectNull(obj, "key");
            this.f32218d = lazyLayoutItemContentFactory;
            this.f32215a = obj;
            m24962d = C5232o1.m24962d(Integer.valueOf(i), null, 2, null);
            this.f32216b = m24962d;
            this.f32217c = ComposableLambda.m19326c(-985530431, true, new C12212a(lazyLayoutItemContentFactory, this));
        }

        /* renamed from: a */
        public static final /* synthetic */ void m3383a(C12211a c12211a, int i) {
            c12211a.m3379e(i);
        }

        /* renamed from: e */
        private final void m3379e(int i) {
            this.f32216b.setValue(Integer.valueOf(i));
        }

        /* renamed from: b */
        public final InterfaceC6112p m3382b() {
            return this.f32217c;
        }

        /* renamed from: c */
        public final Object m3381c() {
            return this.f32215a;
        }

        /* renamed from: d */
        public final int m3380d() {
            return ((Number) this.f32216b.getValue()).intValue();
        }
    }

    public LazyLayoutItemContentFactory(InterfaceC7559c interfaceC7559c, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC7559c, "saveableStateHolder");
        Intrinsics.isThisObjectNull(interfaceC6097a, "itemsProvider");
        this.f32210a = interfaceC7559c;
        this.f32211b = interfaceC6097a;
        this.f32212c = new LinkedHashMap();
        this.f32213d = C13604f.m882a(0.0f, 0.0f);
        this.f32214e = C13601c.m906b(0, 0, 0, 0, 15, null);
    }

    /* renamed from: a */
    public static final /* synthetic */ InterfaceC6097a m3388a(LazyLayoutItemContentFactory lazyLayoutItemContentFactory) {
        return lazyLayoutItemContentFactory.f32211b;
    }

    /* renamed from: b */
    public static final /* synthetic */ Map m3387b(LazyLayoutItemContentFactory lazyLayoutItemContentFactory) {
        return lazyLayoutItemContentFactory.f32212c;
    }

    /* renamed from: c */
    public static final /* synthetic */ InterfaceC7559c m3386c(LazyLayoutItemContentFactory lazyLayoutItemContentFactory) {
        return lazyLayoutItemContentFactory.f32210a;
    }

    /* renamed from: d */
    public final InterfaceC6112p m3385d(int i, Object obj) {
        Intrinsics.isThisObjectNull(obj, "key");
        C12211a c12211a = (C12211a) this.f32212c.get(obj);
        if (c12211a != null && c12211a.m3380d() == i) {
            return c12211a.m3382b();
        }
        C12211a c12211a2 = new C12211a(this, i, obj);
        this.f32212c.put(obj, c12211a2);
        return c12211a2.m3382b();
    }

    /* renamed from: e */
    public final void m3384e(Density density, long j) {
        Intrinsics.isThisObjectNull(density, "density");
        if (Intrinsics.equals(density, this.f32213d) && C13599b.m923g(j, this.f32214e)) {
            return;
        }
        this.f32213d = density;
        this.f32214e = j;
        this.f32212c.clear();
    }
}
