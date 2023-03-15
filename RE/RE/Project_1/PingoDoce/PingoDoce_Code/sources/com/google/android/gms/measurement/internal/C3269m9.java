package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.m9 */
/* loaded from: classes.dex */
public final class C3269m9 {

    /* renamed from: a */
    private final C3242k4 f8690a;

    public C3269m9(C3242k4 c3242k4) {
        this.f8690a = c3242k4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m31077a(String str, Bundle bundle) {
        String uri;
        this.f8690a.mo31118b().mo30825h();
        if (this.f8690a.m31105o()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        this.f8690a.m31132F().f8977u.m31015b(uri);
        this.f8690a.m31132F().f8978v.m31038b(this.f8690a.mo31115e().mo25914a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m31076b() {
        this.f8690a.mo31118b().mo30825h();
        if (m31074d()) {
            if (m31073e()) {
                this.f8690a.m31132F().f8977u.m31015b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f8690a.m31129I().m31150u("auto", "_cmpx", bundle);
            } else {
                String m31016a = this.f8690a.m31132F().f8977u.m31016a();
                if (TextUtils.isEmpty(m31016a)) {
                    this.f8690a.mo31116d().m31330t().m31398a("Cache still valid but referrer not found");
                } else {
                    long m31039a = ((this.f8690a.m31132F().f8978v.m31039a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(m31016a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", m31039a);
                    Object obj = pair.first;
                    this.f8690a.m31129I().m31150u(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f8690a.m31132F().f8977u.m31015b(null);
            }
            this.f8690a.m31132F().f8978v.m31038b(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m31075c() {
        if (m31074d() && m31073e()) {
            this.f8690a.m31132F().f8977u.m31015b(null);
        }
    }

    /* renamed from: d */
    final boolean m31074d() {
        return this.f8690a.m31132F().f8978v.m31039a() > 0;
    }

    /* renamed from: e */
    final boolean m31073e() {
        return m31074d() && this.f8690a.mo31115e().mo25914a() - this.f8690a.m31132F().f8978v.m31039a() > this.f8690a.m31094z().m31356r(null, C3339t2.f8901S);
    }
}
