package p155i7;

import android.os.Process;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: i7.a */
/* loaded from: classes.dex */
final class C6042a extends Thread {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C6042a(ThreadGroup threadGroup, String str) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
