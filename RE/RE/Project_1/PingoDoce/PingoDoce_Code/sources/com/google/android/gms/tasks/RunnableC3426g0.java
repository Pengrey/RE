package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.g0 */
/* loaded from: classes.dex */
public final class RunnableC3426g0 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ C3424f0 f9238w;

    /* renamed from: x */
    final /* synthetic */ Callable f9239x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3426g0(C3424f0 c3424f0, Callable callable) {
        this.f9238w = c3424f0;
        this.f9239x = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f9238w.m30776t(this.f9239x.call());
        } catch (Exception e) {
            this.f9238w.m30777s(e);
        } catch (Throwable th2) {
            this.f9238w.m30777s(new RuntimeException(th2));
        }
    }
}
