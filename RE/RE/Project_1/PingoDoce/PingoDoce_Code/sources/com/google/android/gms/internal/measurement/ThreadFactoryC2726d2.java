package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.d2 */
/* loaded from: classes.dex */
public final class ThreadFactoryC2726d2 implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f7703a = Executors.defaultThreadFactory();

    /* JADX INFO: Access modifiers changed from: package-private */
    public ThreadFactoryC2726d2(C2997u2 c2997u2) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f7703a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
