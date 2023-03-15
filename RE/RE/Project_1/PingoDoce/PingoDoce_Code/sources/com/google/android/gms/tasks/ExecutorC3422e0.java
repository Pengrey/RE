package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p380u7.HandlerC10849a;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.e0 */
/* loaded from: classes.dex */
final class ExecutorC3422e0 implements Executor {

    /* renamed from: w */
    private final Handler f9229w = new HandlerC10849a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f9229w.post(runnable);
    }
}
