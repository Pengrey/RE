package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.b0 */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC4277b0 implements Executor {

    /* renamed from: w */
    public static final /* synthetic */ ExecutorC4277b0 f11647w = new ExecutorC4277b0();

    private /* synthetic */ ExecutorC4277b0() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
