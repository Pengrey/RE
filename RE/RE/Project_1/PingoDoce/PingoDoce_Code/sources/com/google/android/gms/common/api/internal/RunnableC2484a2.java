package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.api.internal.a2 */
/* loaded from: classes.dex */
final class RunnableC2484a2 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ LifecycleCallback f7201w;

    /* renamed from: x */
    final /* synthetic */ String f7202x;

    /* renamed from: y */
    final /* synthetic */ C2488b2 f7203y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2484a2(C2488b2 c2488b2, LifecycleCallback lifecycleCallback, String str) {
        this.f7203y = c2488b2;
        this.f7201w = lifecycleCallback;
        this.f7202x = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        C2488b2 c2488b2 = this.f7203y;
        i = c2488b2.f7211x0;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.f7201w;
            bundle = c2488b2.f7212y0;
            if (bundle != null) {
                bundle3 = c2488b2.f7212y0;
                bundle2 = bundle3.getBundle(this.f7202x);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo33276f(bundle2);
        }
        i2 = this.f7203y.f7211x0;
        if (i2 >= 2) {
            this.f7201w.mo33259j();
        }
        i3 = this.f7203y.f7211x0;
        if (i3 >= 3) {
            this.f7201w.mo33260h();
        }
        i4 = this.f7203y.f7211x0;
        if (i4 >= 4) {
            this.f7201w.mo33258k();
        }
        i5 = this.f7203y.f7211x0;
        if (i5 >= 5) {
            this.f7201w.m33462g();
        }
    }
}
