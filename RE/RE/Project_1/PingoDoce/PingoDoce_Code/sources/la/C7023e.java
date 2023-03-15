package la;

import com.google.firebase.installations.C4267h;
import java.util.concurrent.TimeUnit;

/* renamed from: la.e */
/* loaded from: classes.dex */
class C7023e {

    /* renamed from: d */
    private static final long f18651d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    private static final long f18652e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    private final C4267h f18653a = C4267h.m28135c();

    /* renamed from: b */
    private long f18654b;

    /* renamed from: c */
    private int f18655c;

    /* renamed from: a */
    private synchronized long m19567a(int i) {
        if (!m19565c(i)) {
            return f18651d;
        }
        return (long) Math.min(Math.pow(2.0d, this.f18655c) + this.f18653a.m28133e(), f18652e);
    }

    /* renamed from: c */
    private static boolean m19565c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    /* renamed from: d */
    private static boolean m19564d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    /* renamed from: e */
    private synchronized void m19563e() {
        this.f18655c = 0;
    }

    /* renamed from: b */
    public synchronized boolean m19566b() {
        boolean z;
        if (this.f18655c != 0) {
            z = this.f18653a.m28137a() > this.f18654b;
        }
        return z;
    }

    /* renamed from: f */
    public synchronized void m19562f(int i) {
        if (m19564d(i)) {
            m19563e();
            return;
        }
        this.f18655c++;
        this.f18654b = this.f18653a.m28137a() + m19567a(i);
    }
}
