package p095f3;

import android.content.Context;
import coil.memory.MemoryCache;
import id.InterfaceC6097a;
import p095f3.InterfaceC5351c;
import p107ff.InterfaceC5469e;
import p107ff.OkHttpClient;
import p151i3.InterfaceC5996a;
import p181jd.AbstractC6438m;
import p305q3.C9623a;
import p305q3.C9629g;
import p305q3.InterfaceC9625c;
import p396v3.C11096h;
import p396v3.C11104n;
import p396v3.C11109r;
import p396v3.InterfaceC11108q;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;

/* renamed from: f3.e */
/* loaded from: classes.dex */
public interface InterfaceC5359e {

    /* compiled from: ImageLoader.kt */
    /* renamed from: f3.e$a */
    /* loaded from: classes.dex */
    public static final class C5360a {

        /* renamed from: a */
        private final Context f14774a;

        /* renamed from: b */
        private C9623a f14775b = C11096h.m6158b();

        /* renamed from: c */
        private InterfaceC13178g<? extends MemoryCache> f14776c = null;

        /* renamed from: d */
        private InterfaceC13178g<? extends InterfaceC5996a> f14777d = null;

        /* renamed from: e */
        private InterfaceC13178g<? extends InterfaceC5469e.InterfaceC5470a> f14778e = null;

        /* renamed from: f */
        private InterfaceC5351c.InterfaceC5355d f14779f = null;

        /* renamed from: g */
        private C5349b f14780g = null;

        /* renamed from: h */
        private C11104n f14781h = new C11104n(false, false, false, 0, null, 31, null);

        /* renamed from: i */
        private InterfaceC11108q f14782i = null;

        /* compiled from: ImageLoader.kt */
        /* renamed from: f3.e$a$a */
        /* loaded from: classes.dex */
        static final class C5361a extends AbstractC6438m implements InterfaceC6097a<MemoryCache> {
            C5361a() {
                super(0);
            }

            @Override // id.InterfaceC6097a
            /* renamed from: a */
            public final MemoryCache mo42214q() {
                return new MemoryCache.C2186a(C5360a.this.f14774a).m34482a();
            }
        }

        /* compiled from: ImageLoader.kt */
        /* renamed from: f3.e$a$b */
        /* loaded from: classes.dex */
        static final class C5362b extends AbstractC6438m implements InterfaceC6097a<InterfaceC5996a> {
            C5362b() {
                super(0);
            }

            @Override // id.InterfaceC6097a
            /* renamed from: a */
            public final InterfaceC5996a mo42214q() {
                return C11109r.f28506a.m6114a(C5360a.this.f14774a);
            }
        }

        /* compiled from: ImageLoader.kt */
        /* renamed from: f3.e$a$c */
        /* loaded from: classes.dex */
        static final class C5363c extends AbstractC6438m implements InterfaceC6097a<OkHttpClient> {

            /* renamed from: w */
            public static final C5363c f14785w = new C5363c();

            C5363c() {
                super(0);
            }

            @Override // id.InterfaceC6097a
            /* renamed from: a */
            public final OkHttpClient mo42214q() {
                return new OkHttpClient();
            }
        }

        public C5360a(Context context) {
            this.f14774a = context.getApplicationContext();
        }

        /* renamed from: b */
        public final InterfaceC5359e m24487b() {
            Context context = this.f14774a;
            C9623a c9623a = this.f14775b;
            InterfaceC13178g<? extends MemoryCache> interfaceC13178g = this.f14776c;
            if (interfaceC13178g == null) {
                interfaceC13178g = LazyJVM.m1464a(new C5361a());
            }
            InterfaceC13178g<? extends MemoryCache> interfaceC13178g2 = interfaceC13178g;
            InterfaceC13178g<? extends InterfaceC5996a> interfaceC13178g3 = this.f14777d;
            if (interfaceC13178g3 == null) {
                interfaceC13178g3 = LazyJVM.m1464a(new C5362b());
            }
            InterfaceC13178g<? extends InterfaceC5996a> interfaceC13178g4 = interfaceC13178g3;
            InterfaceC13178g<? extends InterfaceC5469e.InterfaceC5470a> interfaceC13178g5 = this.f14778e;
            if (interfaceC13178g5 == null) {
                interfaceC13178g5 = LazyJVM.m1464a(C5363c.f14785w);
            }
            InterfaceC13178g<? extends InterfaceC5469e.InterfaceC5470a> interfaceC13178g6 = interfaceC13178g5;
            InterfaceC5351c.InterfaceC5355d interfaceC5355d = this.f14779f;
            if (interfaceC5355d == null) {
                interfaceC5355d = InterfaceC5351c.InterfaceC5355d.f14771a;
            }
            InterfaceC5351c.InterfaceC5355d interfaceC5355d2 = interfaceC5355d;
            C5349b c5349b = this.f14780g;
            if (c5349b == null) {
                c5349b = new C5349b();
            }
            return new C5366h(context, c9623a, interfaceC13178g2, interfaceC13178g4, interfaceC13178g6, interfaceC5355d2, c5349b, this.f14781h, this.f14782i);
        }
    }

    /* renamed from: a */
    MemoryCache mo24490a();

    /* renamed from: b */
    InterfaceC9625c mo24489b(C9629g c9629g);

    C5349b getComponents();
}
