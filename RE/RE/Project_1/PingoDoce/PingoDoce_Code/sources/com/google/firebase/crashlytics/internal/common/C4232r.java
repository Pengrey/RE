package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3421e;
import com.google.firebase.C4175c;
import java.util.concurrent.Executor;
import p219l9.C7011f;

/* renamed from: com.google.firebase.crashlytics.internal.common.r */
/* loaded from: classes.dex */
public class C4232r {

    /* renamed from: a */
    private final SharedPreferences f11534a;

    /* renamed from: b */
    private final C4175c f11535b;

    /* renamed from: c */
    private final Object f11536c;

    /* renamed from: d */
    C3421e<Void> f11537d;

    /* renamed from: e */
    private boolean f11538e;

    /* renamed from: f */
    private Boolean f11539f;

    /* renamed from: g */
    private final C3421e<Void> f11540g;

    public C4232r(C4175c c4175c) {
        Object obj = new Object();
        this.f11536c = obj;
        this.f11537d = new C3421e<>();
        this.f11538e = false;
        this.f11540g = new C3421e<>();
        Context m28441h = c4175c.m28441h();
        this.f11535b = c4175c;
        this.f11534a = C4196g.m28360r(m28441h);
        Boolean m28221b = m28221b();
        this.f11539f = m28221b == null ? m28222a(m28441h) : m28221b;
        synchronized (obj) {
            if (m28219d()) {
                this.f11537d.m30798e(null);
            }
        }
    }

    /* renamed from: a */
    private Boolean m28222a(Context context) {
        Boolean m28217f = m28217f(context);
        if (m28217f == null) {
            this.f11538e = false;
            return null;
        }
        this.f11538e = true;
        return Boolean.valueOf(Boolean.TRUE.equals(m28217f));
    }

    /* renamed from: b */
    private Boolean m28221b() {
        if (this.f11534a.contains("firebase_crashlytics_collection_enabled")) {
            this.f11538e = false;
            return Boolean.valueOf(this.f11534a.getBoolean("firebase_crashlytics_collection_enabled", true));
        }
        return null;
    }

    /* renamed from: e */
    private void m28218e(boolean z) {
        String str;
        String str2 = z ? "ENABLED" : "DISABLED";
        if (this.f11539f == null) {
            str = "global Firebase setting";
        } else {
            str = this.f11538e ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        C7011f.m19611f().m19615b(String.format("Crashlytics automatic data collection %s by %s.", str2, str));
    }

    /* renamed from: f */
    private static Boolean m28217f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e) {
            C7011f.m19611f().m19612e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    /* renamed from: c */
    public void m28220c(boolean z) {
        if (z) {
            this.f11540g.m30798e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    /* renamed from: d */
    public synchronized boolean m28219d() {
        boolean m28432q;
        Boolean bool = this.f11539f;
        if (bool != null) {
            m28432q = bool.booleanValue();
        } else {
            m28432q = this.f11535b.m28432q();
        }
        m28218e(m28432q);
        return m28432q;
    }

    /* renamed from: g */
    public AbstractC3419d<Void> m28216g() {
        AbstractC3419d<Void> m30802a;
        synchronized (this.f11536c) {
            m30802a = this.f11537d.m30802a();
        }
        return m30802a;
    }

    /* renamed from: h */
    public AbstractC3419d<Void> m28215h(Executor executor) {
        return C4204h0.m28331j(executor, this.f11540g.m30802a(), m28216g());
    }
}
