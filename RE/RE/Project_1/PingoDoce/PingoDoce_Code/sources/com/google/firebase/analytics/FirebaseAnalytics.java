package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.internal.measurement.C2997u2;
import com.google.android.gms.tasks.C3425g;
import com.google.firebase.installations.C4259c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p009a8.InterfaceC0085r;

/* compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b */
    private static volatile FirebaseAnalytics f11378b;

    /* renamed from: a */
    private final C2997u2 f11379a;

    public FirebaseAnalytics(C2997u2 c2997u2) {
        C2597i.m33076j(c2997u2);
        this.f11379a = c2997u2;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f11378b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f11378b == null) {
                    f11378b = new FirebaseAnalytics(C2997u2.m32022s(context, null, null, null, null));
                }
            }
        }
        return f11378b;
    }

    @Keep
    public static InterfaceC0085r getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C2997u2 m32022s = C2997u2.m32022s(context, null, null, null, bundle);
        if (m32022s == null) {
            return null;
        }
        return new C4167a(m32022s);
    }

    /* renamed from: a */
    public void m28471a(String str, Bundle bundle) {
        this.f11379a.m32042G(str, bundle);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) C3425g.m30768b(C4259c.m28160n().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f11379a.m32037d(activity, str, str2);
    }
}
