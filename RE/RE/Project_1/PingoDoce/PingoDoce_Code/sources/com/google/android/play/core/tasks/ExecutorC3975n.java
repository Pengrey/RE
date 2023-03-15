package com.google.android.play.core.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.n */
/* loaded from: classes.dex */
final class ExecutorC3975n implements Executor {

    /* renamed from: w */
    private final Handler f11270w = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f11270w.post(runnable);
    }
}
