package p219l9;

import android.util.Log;

/* renamed from: l9.f */
/* loaded from: classes.dex */
public class C7011f {

    /* renamed from: c */
    static final C7011f f18625c = new C7011f("FirebaseCrashlytics");

    /* renamed from: a */
    private final String f18626a;

    /* renamed from: b */
    private int f18627b = 4;

    public C7011f(String str) {
        this.f18626a = str;
    }

    /* renamed from: a */
    private boolean m19616a(int i) {
        return this.f18627b <= i || Log.isLoggable(this.f18626a, i);
    }

    /* renamed from: f */
    public static C7011f m19611f() {
        return f18625c;
    }

    /* renamed from: b */
    public void m19615b(String str) {
        m19614c(str, null);
    }

    /* renamed from: c */
    public void m19614c(String str, Throwable th2) {
        if (m19616a(3)) {
            Log.d(this.f18626a, str, th2);
        }
    }

    /* renamed from: d */
    public void m19613d(String str) {
        m19612e(str, null);
    }

    /* renamed from: e */
    public void m19612e(String str, Throwable th2) {
        if (m19616a(6)) {
            Log.e(this.f18626a, str, th2);
        }
    }

    /* renamed from: g */
    public void m19610g(String str) {
        m19609h(str, null);
    }

    /* renamed from: h */
    public void m19609h(String str, Throwable th2) {
        if (m19616a(4)) {
            Log.i(this.f18626a, str, th2);
        }
    }

    /* renamed from: i */
    public void m19608i(String str) {
        m19607j(str, null);
    }

    /* renamed from: j */
    public void m19607j(String str, Throwable th2) {
        if (m19616a(2)) {
            Log.v(this.f18626a, str, th2);
        }
    }

    /* renamed from: k */
    public void m19606k(String str) {
        m19605l(str, null);
    }

    /* renamed from: l */
    public void m19605l(String str, Throwable th2) {
        if (m19616a(5)) {
            Log.w(this.f18626a, str, th2);
        }
    }
}
