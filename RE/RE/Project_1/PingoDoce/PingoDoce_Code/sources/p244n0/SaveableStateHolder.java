package p244n0;

import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p092f0.C5255u0;
import p092f0.C5266y;
import p092f0.CompositionLocal;
import p092f0.Effects;
import p092f0.InterfaceC5151a1;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5264x;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13195u;
import p489zc.C13769l0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: n0.d */
/* loaded from: classes.dex */
public final class SaveableStateHolder implements InterfaceC7559c {

    /* renamed from: d */
    public static final C7562c f20024d = new C7562c(null);

    /* renamed from: e */
    private static final InterfaceC7575i f20025e = Saver.m18111a(C7560a.f20029w, C7561b.f20030w);

    /* renamed from: a */
    private final Map f20026a;

    /* renamed from: b */
    private final Map f20027b;

    /* renamed from: c */
    private InterfaceC7570f f20028c;

    /* compiled from: SaveableStateHolder.kt */
    /* renamed from: n0.d$a */
    /* loaded from: classes.dex */
    static final class C7560a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C7560a f20029w = new C7560a();

        C7560a() {
            super(2);
        }

        /* renamed from: a */
        public final Map mo39856d(InterfaceC7579k interfaceC7579k, SaveableStateHolder saveableStateHolder) {
            Intrinsics.isThisObjectNull(interfaceC7579k, "$this$Saver");
            Intrinsics.isThisObjectNull(saveableStateHolder, "it");
            return SaveableStateHolder.m18142e(saveableStateHolder);
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    /* renamed from: n0.d$b */
    /* loaded from: classes.dex */
    static final class C7561b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C7561b f20030w = new C7561b();

        C7561b() {
            super(1);
        }

        /* renamed from: a */
        public final SaveableStateHolder mo9587d(Map map) {
            Intrinsics.isThisObjectNull(map, "it");
            return new SaveableStateHolder(map);
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    /* renamed from: n0.d$c */
    /* loaded from: classes.dex */
    public static final class C7562c {
        private C7562c() {
        }

        public /* synthetic */ C7562c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC7575i m18136a() {
            return SaveableStateHolder.m18143d();
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    /* renamed from: n0.d$d */
    /* loaded from: classes.dex */
    public final class C7563d {

        /* renamed from: a */
        private final Object f20031a;

        /* renamed from: b */
        private boolean f20032b;

        /* renamed from: c */
        private final InterfaceC7570f f20033c;

        /* renamed from: d */
        final /* synthetic */ SaveableStateHolder f20034d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SaveableStateHolder.kt */
        /* renamed from: n0.d$d$a */
        /* loaded from: classes.dex */
        public static final class C7564a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ SaveableStateHolder f20035w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7564a(SaveableStateHolder saveableStateHolder) {
                super(1);
                this.f20035w = saveableStateHolder;
            }

            /* renamed from: a */
            public final Boolean mo9587d(Object obj) {
                Intrinsics.isThisObjectNull(obj, "it");
                InterfaceC7570f m18141f = this.f20035w.m18141f();
                return Boolean.valueOf(m18141f == null ? true : m18141f.mo18127a(obj));
            }
        }

        public C7563d(SaveableStateHolder saveableStateHolder, Object obj) {
            Intrinsics.isThisObjectNull(saveableStateHolder, "this$0");
            Intrinsics.isThisObjectNull(obj, "key");
            this.f20034d = saveableStateHolder;
            this.f20031a = obj;
            this.f20032b = true;
            this.f20033c = C7573h.m18116a((Map) SaveableStateHolder.m18144c(saveableStateHolder).get(obj), new C7564a(saveableStateHolder));
        }

        /* renamed from: a */
        public final InterfaceC7570f m18135a() {
            return this.f20033c;
        }

        /* renamed from: b */
        public final void m18134b(Map map) {
            Intrinsics.isThisObjectNull(map, "map");
            if (this.f20032b) {
                map.put(this.f20031a, this.f20033c.mo18126b());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SaveableStateHolder.kt */
    /* renamed from: n0.d$e */
    /* loaded from: classes.dex */
    public static final class C7565e extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: x */
        final /* synthetic */ Object f20037x;

        /* renamed from: y */
        final /* synthetic */ C7563d f20038y;

        /* compiled from: Effects.kt */
        /* renamed from: n0.d$e$a */
        /* loaded from: classes.dex */
        public static final class C7566a implements InterfaceC5264x {

            /* renamed from: a */
            final /* synthetic */ C7563d f20039a;

            /* renamed from: b */
            final /* synthetic */ SaveableStateHolder f20040b;

            /* renamed from: c */
            final /* synthetic */ Object f20041c;

            public C7566a(C7563d c7563d, SaveableStateHolder saveableStateHolder, Object obj) {
                this.f20039a = c7563d;
                this.f20040b = saveableStateHolder;
                this.f20041c = obj;
            }

            /* renamed from: b */
            public void mo24852b() {
                this.f20039a.m18134b(SaveableStateHolder.m18144c(this.f20040b));
                SaveableStateHolder.m18145b(this.f20040b).remove(this.f20041c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7565e(Object obj, C7563d c7563d) {
            super(1);
            this.f20037x = obj;
            this.f20038y = c7563d;
        }

        /* renamed from: a */
        public final InterfaceC5264x mo9587d(C5266y c5266y) {
            Intrinsics.isThisObjectNull(c5266y, "$this$DisposableEffect");
            boolean z = !SaveableStateHolder.m18145b(SaveableStateHolder.this).containsKey(this.f20037x);
            Object obj = this.f20037x;
            if (z) {
                SaveableStateHolder.m18144c(SaveableStateHolder.this).remove(this.f20037x);
                SaveableStateHolder.m18145b(SaveableStateHolder.this).put(this.f20037x, this.f20038y);
                return new C7566a(this.f20038y, SaveableStateHolder.this, this.f20037x);
            }
            throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SaveableStateHolder.kt */
    /* renamed from: n0.d$f */
    /* loaded from: classes.dex */
    public static final class C7567f extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: x */
        final /* synthetic */ Object f20043x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6112p f20044y;

        /* renamed from: z */
        final /* synthetic */ int f20045z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7567f(Object obj, InterfaceC6112p interfaceC6112p, int i) {
            super(2);
            this.f20043x = obj;
            this.f20044y = interfaceC6112p;
            this.f20045z = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m18130a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m18130a(InterfaceC5179i interfaceC5179i, int i) {
            SaveableStateHolder.this.mo18147a(this.f20043x, this.f20044y, interfaceC5179i, this.f20045z | 1);
        }
    }

    public SaveableStateHolder() {
        this(null, 1, null);
    }

    public SaveableStateHolder(Map map) {
        Intrinsics.isThisObjectNull(map, "savedStates");
        this.f20026a = map;
        this.f20027b = new LinkedHashMap();
    }

    /* renamed from: b */
    public static final /* synthetic */ Map m18145b(SaveableStateHolder saveableStateHolder) {
        return saveableStateHolder.f20027b;
    }

    /* renamed from: c */
    public static final /* synthetic */ Map m18144c(SaveableStateHolder saveableStateHolder) {
        return saveableStateHolder.f20026a;
    }

    /* renamed from: d */
    public static final /* synthetic */ InterfaceC7575i m18143d() {
        return f20025e;
    }

    /* renamed from: e */
    public static final /* synthetic */ Map m18142e(SaveableStateHolder saveableStateHolder) {
        return saveableStateHolder.m18140g();
    }

    /* renamed from: g */
    private final Map m18140g() {
        Map m322q;
        m322q = C13769l0.m322q(this.f20026a);
        for (C7563d c7563d : this.f20027b.values()) {
            c7563d.m18134b(m322q);
        }
        return m322q;
    }

    /* renamed from: a */
    public void mo18147a(Object obj, InterfaceC6112p interfaceC6112p, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(obj, "key");
        Intrinsics.isThisObjectNull(interfaceC6112p, "content");
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(-111644091);
        mo25249u.mo25263g(-1530021272);
        mo25249u.mo25275J(207, obj);
        mo25249u.mo25263g(1516495192);
        mo25249u.mo25263g(-3687241);
        Object mo25262h = mo25249u.mo25262h();
        if (mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            InterfaceC7570f m18141f = m18141f();
            if (m18141f == null ? true : m18141f.mo18127a(obj)) {
                mo25262h = new C7563d(this, obj);
                mo25249u.mo25247w(mo25262h);
            } else {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
        }
        mo25249u.mo25282C();
        C7563d c7563d = (C7563d) mo25262h;
        CompositionLocal.m24954a(new C5255u0[]{C7573h.m18115b().m24909c(c7563d.m18135a())}, interfaceC6112p, mo25249u, (i & 112) | 8);
        Effects.m25541a(C13195u.f34156a, new C7565e(obj, c7563d), mo25249u, 0);
        mo25249u.mo25282C();
        mo25249u.mo25265e();
        mo25249u.mo25282C();
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K == null) {
            return;
        }
        mo25274K.mo25532a(new C7567f(obj, interfaceC6112p, i));
    }

    /* renamed from: f */
    public final InterfaceC7570f m18141f() {
        return this.f20028c;
    }

    /* renamed from: h */
    public final void m18139h(InterfaceC7570f interfaceC7570f) {
        this.f20028c = interfaceC7570f;
    }

    public /* synthetic */ SaveableStateHolder(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }
}
