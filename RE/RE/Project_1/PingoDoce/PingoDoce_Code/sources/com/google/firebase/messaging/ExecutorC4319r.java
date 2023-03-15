package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.r */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC4319r implements Executor {

    /* renamed from: w */
    public static final /* synthetic */ ExecutorC4319r f11719w = new ExecutorC4319r();

    private /* synthetic */ ExecutorC4319r() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
