package p233m4;

import android.os.Handler;
import com.facebook.C2290b;
import com.facebook.GraphRequest;
import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;

/* renamed from: m4.i */
/* loaded from: classes.dex */
public final class RequestProgress {

    /* renamed from: a */
    private final long f18931a;

    /* renamed from: b */
    private long f18932b;

    /* renamed from: c */
    private long f18933c;

    /* renamed from: d */
    private long f18934d;

    /* renamed from: e */
    private final Handler f18935e;

    /* renamed from: f */
    private final GraphRequest f18936f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RequestProgress.kt */
    /* renamed from: m4.i$a */
    /* loaded from: classes.dex */
    public static final class RunnableC7130a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ GraphRequest.InterfaceC2278b f18937w;

        /* renamed from: x */
        final /* synthetic */ long f18938x;

        /* renamed from: y */
        final /* synthetic */ long f18939y;

        RunnableC7130a(GraphRequest.InterfaceC2278b interfaceC2278b, long j, long j2) {
            this.f18937w = interfaceC2278b;
            this.f18938x = j;
            this.f18939y = j2;
        }

        public final void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                ((GraphRequest.InterfaceC2282e) this.f18937w).m34140b(this.f18938x, this.f18939y);
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    public RequestProgress(Handler handler, GraphRequest graphRequest) {
        Intrinsics.isThisObjectNull(graphRequest, "request");
        this.f18935e = handler;
        this.f18936f = graphRequest;
        this.f18931a = C2290b.m34099p();
    }

    /* renamed from: a */
    public final void m19109a(long j) {
        long j2 = this.f18932b + j;
        this.f18932b = j2;
        if (j2 >= this.f18933c + this.f18931a || j2 >= this.f18934d) {
            m19107c();
        }
    }

    /* renamed from: b */
    public final void m19108b(long j) {
        this.f18934d += j;
    }

    /* renamed from: c */
    public final void m19107c() {
        if (this.f18932b > this.f18933c) {
            GraphRequest.InterfaceC2278b m34198m = this.f18936f.m34198m();
            long j = this.f18934d;
            if (j <= 0 || !(m34198m instanceof GraphRequest.InterfaceC2282e)) {
                return;
            }
            long j2 = this.f18932b;
            Handler handler = this.f18935e;
            if (handler != null) {
                handler.post(new RunnableC7130a(m34198m, j2, j));
            } else {
                ((GraphRequest.InterfaceC2282e) m34198m).m34140b(j2, j);
            }
            this.f18933c = this.f18932b;
        }
    }
}
