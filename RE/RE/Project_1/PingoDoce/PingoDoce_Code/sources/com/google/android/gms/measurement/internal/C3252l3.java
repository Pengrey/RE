package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.l3 */
/* loaded from: classes.dex */
public final class C3252l3 extends AbstractC3323r8 {
    public C3252l3(C3137a9 c3137a9) {
        super(c3137a9);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3323r8
    /* renamed from: l */
    protected final boolean mo30839l() {
        return false;
    }

    /* renamed from: m */
    public final boolean m31090m() {
        m31026i();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f8410a.mo31117c().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}
