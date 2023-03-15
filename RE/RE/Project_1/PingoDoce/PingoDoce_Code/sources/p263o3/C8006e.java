package p263o3;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;
import p301q.C9557f;
import p396v3.C11089a;

/* renamed from: o3.e */
/* loaded from: classes.dex */
public final class C8006e implements InterfaceC8012g {

    /* renamed from: a */
    private final InterfaceC8013h f20729a;

    /* renamed from: b */
    private final C8008b f20730b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: StrongMemoryCache.kt */
    /* renamed from: o3.e$a */
    /* loaded from: classes.dex */
    public static final class C8007a {

        /* renamed from: a */
        private final Bitmap f20731a;

        /* renamed from: b */
        private final Map<String, Object> f20732b;

        /* renamed from: c */
        private final int f20733c;

        public C8007a(Bitmap bitmap, Map<String, ? extends Object> map, int i) {
            this.f20731a = bitmap;
            this.f20732b = map;
            this.f20733c = i;
        }

        /* renamed from: a */
        public final Bitmap m17189a() {
            return this.f20731a;
        }

        /* renamed from: b */
        public final Map<String, Object> m17188b() {
            return this.f20732b;
        }

        /* renamed from: c */
        public final int m17187c() {
            return this.f20733c;
        }
    }

    /* compiled from: StrongMemoryCache.kt */
    /* renamed from: o3.e$b */
    /* loaded from: classes.dex */
    public static final class C8008b extends C9557f<MemoryCache.Key, C8007a> {

        /* renamed from: i */
        final /* synthetic */ C8006e f20734i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8008b(int i, C8006e c8006e) {
            super(i);
            this.f20734i = c8006e;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p301q.C9557f
        /* renamed from: m */
        public void mo17186m(boolean z, MemoryCache.Key key, C8007a c8007a, C8007a c8007a2) {
            this.f20734i.f20729a.mo17173c(key, c8007a.m17189a(), c8007a.m17188b(), c8007a.m17187c());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p301q.C9557f
        /* renamed from: n */
        public int mo17185n(MemoryCache.Key key, C8007a c8007a) {
            return c8007a.m17187c();
        }
    }

    public C8006e(int i, InterfaceC8013h interfaceC8013h) {
        this.f20729a = interfaceC8013h;
        this.f20730b = new C8008b(i, this);
    }

    @Override // p263o3.InterfaceC8012g
    /* renamed from: a */
    public MemoryCache.C2187b mo17178a(MemoryCache.Key key) {
        C8007a m10631d = this.f20730b.m10631d(key);
        if (m10631d != null) {
            return new MemoryCache.C2187b(m10631d.m17189a(), m10631d.m17188b());
        }
        return null;
    }

    @Override // p263o3.InterfaceC8012g
    /* renamed from: b */
    public void mo17177b(int i) {
        if (i >= 40) {
            m17192e();
            return;
        }
        boolean z = false;
        if (10 <= i && i < 20) {
            z = true;
        }
        if (z) {
            this.f20730b.m10623l(m17190g() / 2);
        }
    }

    @Override // p263o3.InterfaceC8012g
    /* renamed from: c */
    public void mo17176c(MemoryCache.Key key, Bitmap bitmap, Map<String, ? extends Object> map) {
        int m6176a = C11089a.m6176a(bitmap);
        if (m6176a <= m17191f()) {
            this.f20730b.m10629f(key, new C8007a(bitmap, map, m6176a));
            return;
        }
        this.f20730b.m10628g(key);
        this.f20729a.mo17173c(key, bitmap, map, m6176a);
    }

    /* renamed from: e */
    public void m17192e() {
        this.f20730b.m10632c();
    }

    /* renamed from: f */
    public int m17191f() {
        return this.f20730b.m10630e();
    }

    /* renamed from: g */
    public int m17190g() {
        return this.f20730b.m10626i();
    }
}
