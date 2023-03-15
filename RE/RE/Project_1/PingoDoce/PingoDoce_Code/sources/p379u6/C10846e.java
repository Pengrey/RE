package p379u6;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C2423a;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: u6.e */
/* loaded from: classes.dex */
public final class C10846e {

    /* renamed from: b */
    private static C10846e f28038b;

    /* renamed from: a */
    final C2423a f28039a;

    private C10846e(Context context) {
        C2423a m33579b = C2423a.m33579b(context);
        this.f28039a = m33579b;
        m33579b.m33578c();
        m33579b.m33577d();
    }

    /* renamed from: a */
    public static synchronized C10846e m6891a(Context context) {
        C10846e m6888d;
        synchronized (C10846e.class) {
            m6888d = m6888d(context.getApplicationContext());
        }
        return m6888d;
    }

    /* renamed from: d */
    private static synchronized C10846e m6888d(Context context) {
        synchronized (C10846e.class) {
            C10846e c10846e = f28038b;
            if (c10846e != null) {
                return c10846e;
            }
            C10846e c10846e2 = new C10846e(context);
            f28038b = c10846e2;
            return c10846e2;
        }
    }

    /* renamed from: b */
    public final synchronized void m6890b() {
        this.f28039a.m33580a();
    }

    /* renamed from: c */
    public final synchronized void m6889c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f28039a.m33575f(googleSignInAccount, googleSignInOptions);
    }
}
