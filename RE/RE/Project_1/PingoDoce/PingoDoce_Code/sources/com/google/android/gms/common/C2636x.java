package com.google.android.gms.common;

import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.x */
/* loaded from: classes.dex */
public class C2636x {

    /* renamed from: d */
    private static final C2636x f7555d = new C2636x(true, null, null);

    /* renamed from: a */
    final boolean f7556a;
    @Nullable

    /* renamed from: b */
    final String f7557b;
    @Nullable

    /* renamed from: c */
    final Throwable f7558c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2636x(boolean z, @Nullable String str, @Nullable Throwable th2) {
        this.f7556a = z;
        this.f7557b = str;
        this.f7558c = th2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C2636x m32990b() {
        return f7555d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C2636x m32989c(String str) {
        return new C2636x(false, str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C2636x m32988d(String str, Throwable th2) {
        return new C2636x(false, str, th2);
    }

    @Nullable
    /* renamed from: a */
    String mo32991a() {
        return this.f7557b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m32987e() {
        if (this.f7556a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f7558c != null) {
            Log.d("GoogleCertificatesRslt", mo32991a(), this.f7558c);
        } else {
            Log.d("GoogleCertificatesRslt", mo32991a());
        }
    }
}
