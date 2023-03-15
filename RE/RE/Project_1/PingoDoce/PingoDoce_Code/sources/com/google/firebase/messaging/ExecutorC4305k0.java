package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.k0 */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC4305k0 implements Executor {

    /* renamed from: w */
    public static final /* synthetic */ ExecutorC4305k0 f11705w = new ExecutorC4305k0();

    private /* synthetic */ ExecutorC4305k0() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
