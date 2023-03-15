package com.google.android.gms.measurement.internal;

import p119g7.C5614b;
import p119g7.C5615c;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.w3 */
/* loaded from: classes.dex */
public final class C3370w3 {

    /* renamed from: a */
    final C3242k4 f9051a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3370w3(C3137a9 c3137a9) {
        this.f9051a = c3137a9.m31488b0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m30908a() {
        try {
            C5614b m23567a = C5615c.m23567a(this.f9051a.mo31117c());
            if (m23567a != null) {
                return m23567a.m23570e("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f9051a.mo31116d().m31328v().m31398a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.f9051a.mo31116d().m31328v().m31397b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
