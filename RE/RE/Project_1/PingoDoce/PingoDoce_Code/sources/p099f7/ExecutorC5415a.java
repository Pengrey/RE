package p099f7;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p292p7.HandlerC8448e;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: f7.a */
/* loaded from: classes.dex */
public class ExecutorC5415a implements Executor {

    /* renamed from: w */
    private final Handler f14877w;

    public ExecutorC5415a(Looper looper) {
        this.f14877w = new HandlerC8448e(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f14877w.post(runnable);
    }
}
