package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.a */
/* loaded from: classes.dex */
public final class RunnableC3127a implements Runnable {

    /* renamed from: w */
    final /* synthetic */ String f8291w;

    /* renamed from: x */
    final /* synthetic */ long f8292x;

    /* renamed from: y */
    final /* synthetic */ C3398z1 f8293y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3127a(C3398z1 c3398z1, String str, long j) {
        this.f8293y = c3398z1;
        this.f8291w = str;
        this.f8292x = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3398z1.m30834i(this.f8293y, this.f8291w, this.f8292x);
    }
}
