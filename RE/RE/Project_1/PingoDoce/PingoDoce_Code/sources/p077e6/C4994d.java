package p077e6;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p061da.InterfaceC4759d;

/* renamed from: e6.d */
/* loaded from: classes.dex */
public final class C4994d {

    /* renamed from: a */
    private final String f13929a;

    /* renamed from: b */
    private final List<C4991c> f13930b;

    /* compiled from: LogSourceMetrics.java */
    /* renamed from: e6.d$a */
    /* loaded from: classes.dex */
    public static final class C4995a {

        /* renamed from: a */
        private String f13931a = BuildConfig.VERSION_NAME;

        /* renamed from: b */
        private List<C4991c> f13932b = new ArrayList();

        C4995a() {
        }

        /* renamed from: a */
        public C4994d m25937a() {
            return new C4994d(this.f13931a, Collections.unmodifiableList(this.f13932b));
        }

        /* renamed from: b */
        public C4995a m25936b(List<C4991c> list) {
            this.f13932b = list;
            return this;
        }

        /* renamed from: c */
        public C4995a m25935c(String str) {
            this.f13931a = str;
            return this;
        }
    }

    static {
        new C4995a().m25937a();
    }

    C4994d(String str, List<C4991c> list) {
        this.f13929a = str;
        this.f13930b = list;
    }

    /* renamed from: c */
    public static C4995a m25938c() {
        return new C4995a();
    }

    @InterfaceC4759d(tag = 2)
    /* renamed from: a */
    public List<C4991c> m25940a() {
        return this.f13930b;
    }

    @InterfaceC4759d(tag = 1)
    /* renamed from: b */
    public String m25939b() {
        return this.f13929a;
    }
}
