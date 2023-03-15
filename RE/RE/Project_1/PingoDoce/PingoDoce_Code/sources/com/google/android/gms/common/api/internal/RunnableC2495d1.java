package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zak;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.d1 */
/* loaded from: classes.dex */
final class RunnableC2495d1 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ zak f7221w;

    /* renamed from: x */
    final /* synthetic */ BinderC2501f1 f7222x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2495d1(BinderC2501f1 binderC2501f1, zak zakVar) {
        this.f7222x = binderC2501f1;
        this.f7221w = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC2501f1.m33404U1(this.f7222x, this.f7221w);
    }
}
