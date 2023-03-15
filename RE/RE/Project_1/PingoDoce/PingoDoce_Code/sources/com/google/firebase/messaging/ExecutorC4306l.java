package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.l */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC4306l implements Executor {

    /* renamed from: w */
    public static final /* synthetic */ ExecutorC4306l f11706w = new ExecutorC4306l();

    private /* synthetic */ ExecutorC4306l() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
