package p099f7;

import android.os.Process;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: f7.c */
/* loaded from: classes.dex */
final class RunnableC5417c implements Runnable {

    /* renamed from: w */
    private final Runnable f14880w;

    public RunnableC5417c(Runnable runnable, int i) {
        this.f14880w = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f14880w.run();
    }
}
