package p077e6;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p007a6.AbstractC0051l;
import p061da.InterfaceC4759d;

/* renamed from: e6.a */
/* loaded from: classes.dex */
public final class C4987a {

    /* renamed from: a */
    private final C4998f f13915a;

    /* renamed from: b */
    private final List<C4994d> f13916b;

    /* renamed from: c */
    private final C4989b f13917c;

    /* renamed from: d */
    private final String f13918d;

    /* compiled from: ClientMetrics.java */
    /* renamed from: e6.a$a */
    /* loaded from: classes.dex */
    public static final class C4988a {

        /* renamed from: a */
        private C4998f f13919a = null;

        /* renamed from: b */
        private List<C4994d> f13920b = new ArrayList();

        /* renamed from: c */
        private C4989b f13921c = null;

        /* renamed from: d */
        private String f13922d = BuildConfig.VERSION_NAME;

        C4988a() {
        }

        /* renamed from: a */
        public C4988a m25955a(C4994d c4994d) {
            this.f13920b.add(c4994d);
            return this;
        }

        /* renamed from: b */
        public C4987a m25954b() {
            return new C4987a(this.f13919a, Collections.unmodifiableList(this.f13920b), this.f13921c, this.f13922d);
        }

        /* renamed from: c */
        public C4988a m25953c(String str) {
            this.f13922d = str;
            return this;
        }

        /* renamed from: d */
        public C4988a m25952d(C4989b c4989b) {
            this.f13921c = c4989b;
            return this;
        }

        /* renamed from: e */
        public C4988a m25951e(C4998f c4998f) {
            this.f13919a = c4998f;
            return this;
        }
    }

    static {
        new C4988a().m25954b();
    }

    C4987a(C4998f c4998f, List<C4994d> list, C4989b c4989b, String str) {
        this.f13915a = c4998f;
        this.f13916b = list;
        this.f13917c = c4989b;
        this.f13918d = str;
    }

    /* renamed from: e */
    public static C4988a m25957e() {
        return new C4988a();
    }

    @InterfaceC4759d(tag = 4)
    /* renamed from: a */
    public String m25961a() {
        return this.f13918d;
    }

    @InterfaceC4759d(tag = 3)
    /* renamed from: b */
    public C4989b m25960b() {
        return this.f13917c;
    }

    @InterfaceC4759d(tag = 2)
    /* renamed from: c */
    public List<C4994d> m25959c() {
        return this.f13916b;
    }

    @InterfaceC4759d(tag = 1)
    /* renamed from: d */
    public C4998f m25958d() {
        return this.f13915a;
    }

    /* renamed from: f */
    public byte[] m25956f() {
        return AbstractC0051l.m42060a(this);
    }
}
