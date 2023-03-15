package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.f */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC4289f implements Executor {

    /* renamed from: w */
    public static final /* synthetic */ ExecutorC4289f f11672w = new ExecutorC4289f();

    private /* synthetic */ ExecutorC4289f() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
