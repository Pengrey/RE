package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.p */
/* loaded from: classes.dex */
final class C2456p extends AbstractC2455o<Bundle> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2456p(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.cloudmessaging.AbstractC2455o
    /* renamed from: a */
    public final void mo33537a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        m33538d(bundle2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.cloudmessaging.AbstractC2455o
    /* renamed from: b */
    public final boolean mo33536b() {
        return false;
    }
}
