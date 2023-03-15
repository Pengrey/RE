package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.r7 */
/* loaded from: classes.dex */
final class RunnableC3322r7 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ ComponentName f8849w;

    /* renamed from: x */
    final /* synthetic */ ServiceConnectionC3364v7 f8850x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3322r7(ServiceConnectionC3364v7 serviceConnectionC3364v7, ComponentName componentName) {
        this.f8850x = serviceConnectionC3364v7;
        this.f8849w = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3374w7.m30875M(this.f8850x.f9046c, this.f8849w);
    }
}
