package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.d1 */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC4284d1 implements Executor {

    /* renamed from: w */
    public static final /* synthetic */ ExecutorC4284d1 f11664w = new ExecutorC4284d1();

    private /* synthetic */ ExecutorC4284d1() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
