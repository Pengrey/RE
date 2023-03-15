package com.google.firebase.crashlytics.internal.common;

import android.os.Process;

/* renamed from: com.google.firebase.crashlytics.internal.common.c */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC4188c implements Runnable {
    /* renamed from: a */
    protected abstract void mo28209a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        mo28209a();
    }
}
