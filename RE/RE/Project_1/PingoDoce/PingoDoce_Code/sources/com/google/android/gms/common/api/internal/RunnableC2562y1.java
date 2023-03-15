package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.api.internal.y1 */
/* loaded from: classes.dex */
final class RunnableC2562y1 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ LifecycleCallback f7375w;

    /* renamed from: x */
    final /* synthetic */ String f7376x;

    /* renamed from: y */
    final /* synthetic */ FragmentC2565z1 f7377y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2562y1(FragmentC2565z1 fragmentC2565z1, LifecycleCallback lifecycleCallback, String str) {
        this.f7377y = fragmentC2565z1;
        this.f7375w = lifecycleCallback;
        this.f7376x = str;
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
        FragmentC2565z1 fragmentC2565z1 = this.f7377y;
        i = fragmentC2565z1.f7383x;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.f7375w;
            bundle = fragmentC2565z1.f7384y;
            if (bundle != null) {
                bundle3 = fragmentC2565z1.f7384y;
                bundle2 = bundle3.getBundle(this.f7376x);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo33276f(bundle2);
        }
        i2 = this.f7377y.f7383x;
        if (i2 >= 2) {
            this.f7375w.mo33259j();
        }
        i3 = this.f7377y.f7383x;
        if (i3 >= 3) {
            this.f7375w.mo33260h();
        }
        i4 = this.f7377y.f7383x;
        if (i4 >= 4) {
            this.f7375w.mo33258k();
        }
        i5 = this.f7377y.f7383x;
        if (i5 >= 5) {
            this.f7375w.m33462g();
        }
    }
}
