package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C2597i;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
/* loaded from: classes.dex */
public class C2423a {

    /* renamed from: c */
    private static final Lock f7085c = new ReentrantLock();
    @GuardedBy("sLk")

    /* renamed from: d */
    private static C2423a f7086d;

    /* renamed from: a */
    private final Lock f7087a = new ReentrantLock();
    @GuardedBy("mLk")

    /* renamed from: b */
    private final SharedPreferences f7088b;

    C2423a(Context context) {
        this.f7088b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: b */
    public static C2423a m33579b(Context context) {
        C2597i.m33076j(context);
        Lock lock = f7085c;
        lock.lock();
        try {
            if (f7086d == null) {
                f7086d = new C2423a(context.getApplicationContext());
            }
            C2423a c2423a = f7086d;
            lock.unlock();
            return c2423a;
        } catch (Throwable th2) {
            f7085c.unlock();
            throw th2;
        }
    }

    /* renamed from: i */
    private static final String m33572i(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: a */
    public void m33580a() {
        this.f7087a.lock();
        try {
            this.f7088b.edit().clear().apply();
        } finally {
            this.f7087a.unlock();
        }
    }

    /* renamed from: c */
    public GoogleSignInAccount m33578c() {
        String m33574g;
        String m33574g2 = m33574g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(m33574g2) || (m33574g = m33574g(m33572i("googleSignInAccount", m33574g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m33626J(m33574g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public GoogleSignInOptions m33577d() {
        String m33574g;
        String m33574g2 = m33574g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(m33574g2) || (m33574g = m33574g(m33572i("googleSignInOptions", m33574g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m33614H(m33574g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public String m33576e() {
        return m33574g("refreshToken");
    }

    /* renamed from: f */
    public void m33575f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C2597i.m33076j(googleSignInAccount);
        C2597i.m33076j(googleSignInOptions);
        m33573h("defaultGoogleSignInAccount", googleSignInAccount.m33625K());
        C2597i.m33076j(googleSignInAccount);
        C2597i.m33076j(googleSignInOptions);
        String m33625K = googleSignInAccount.m33625K();
        m33573h(m33572i("googleSignInAccount", m33625K), googleSignInAccount.m33624L());
        m33573h(m33572i("googleSignInOptions", m33625K), googleSignInOptions.m33610L());
    }

    /* renamed from: g */
    protected final String m33574g(String str) {
        this.f7087a.lock();
        try {
            return this.f7088b.getString(str, null);
        } finally {
            this.f7087a.unlock();
        }
    }

    /* renamed from: h */
    protected final void m33573h(String str, String str2) {
        this.f7087a.lock();
        try {
            this.f7088b.edit().putString(str, str2).apply();
        } finally {
            this.f7087a.unlock();
        }
    }
}
