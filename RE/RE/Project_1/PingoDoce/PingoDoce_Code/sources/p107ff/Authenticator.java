package p107ff;

import java.io.IOException;
import p141hf.JavaNetAuthenticator;
import p181jd.Intrinsics;

/* renamed from: ff.b */
/* loaded from: classes2.dex */
public interface Authenticator {

    /* renamed from: a */
    public static final Authenticator f15373a;

    /* compiled from: Authenticator.kt */
    /* renamed from: ff.b$a */
    /* loaded from: classes2.dex */
    public static final class C5458a {

        /* renamed from: a */
        static final /* synthetic */ C5458a f15374a = new C5458a();

        /* compiled from: Authenticator.kt */
        /* renamed from: ff.b$a$a */
        /* loaded from: classes2.dex */
        private static final class C5459a implements Authenticator {
            /* renamed from: a */
            public Request m24276a(Route route, Response response) {
                Intrinsics.isThisObjectNull(response, "response");
                return null;
            }
        }

        private C5458a() {
        }
    }

    static {
        C5458a c5458a = C5458a.f15374a;
        f15373a = new C5458a.C5459a();
        new JavaNetAuthenticator(null, 1, null);
    }

    /* renamed from: a */
    Request m24277a(Route route, Response response) throws IOException;
}
