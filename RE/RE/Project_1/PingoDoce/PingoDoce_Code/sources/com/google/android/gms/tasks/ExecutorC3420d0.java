package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.d0 */
/* loaded from: classes.dex */
final class ExecutorC3420d0 implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
