package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.n */
/* loaded from: classes.dex */
final class C2454n extends AbstractC2455o<Void> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2454n(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.cloudmessaging.AbstractC2455o
    /* renamed from: a */
    public final void mo33537a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m33538d(null);
        } else {
            m33539c(new zzq(4, "Invalid response to one way request", null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.cloudmessaging.AbstractC2455o
    /* renamed from: b */
    public final boolean mo33536b() {
        return true;
    }
}
