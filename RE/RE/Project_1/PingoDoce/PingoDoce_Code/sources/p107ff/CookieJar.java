package p107ff;

import java.util.List;
import p181jd.Intrinsics;
import p489zc.C13780s;

/* renamed from: ff.n */
/* loaded from: classes2.dex */
public interface CookieJar {

    /* renamed from: a */
    public static final CookieJar f15515a;

    /* compiled from: CookieJar.kt */
    /* renamed from: ff.n$a */
    /* loaded from: classes2.dex */
    public static final class C5486a {

        /* renamed from: a */
        static final /* synthetic */ C5486a f15516a = new C5486a();

        /* compiled from: CookieJar.kt */
        /* renamed from: ff.n$a$a */
        /* loaded from: classes2.dex */
        private static final class C5487a implements CookieJar {
            /* renamed from: a */
            public void m24074a(HttpUrl httpUrl, List list) {
                Intrinsics.isThisObjectNull(httpUrl, "url");
                Intrinsics.isThisObjectNull(list, "cookies");
            }

            /* renamed from: b */
            public List m24073b(HttpUrl httpUrl) {
                List m197g;
                Intrinsics.isThisObjectNull(httpUrl, "url");
                m197g = C13780s.m197g();
                return m197g;
            }
        }

        private C5486a() {
        }
    }

    static {
        C5486a c5486a = C5486a.f15516a;
        f15515a = new C5486a.C5487a();
    }

    /* renamed from: a */
    void m24076a(HttpUrl httpUrl, List list);

    /* renamed from: b */
    List m24075b(HttpUrl httpUrl);
}
