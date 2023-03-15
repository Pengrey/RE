package p099f7;

import com.google.android.gms.common.internal.C2597i;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: f7.b */
/* loaded from: classes.dex */
public class ThreadFactoryC5416b implements ThreadFactory {

    /* renamed from: a */
    private final String f14878a;

    /* renamed from: b */
    private final ThreadFactory f14879b = Executors.defaultThreadFactory();

    public ThreadFactoryC5416b(String str) {
        C2597i.m33075k(str, "Name must not be null");
        this.f14878a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f14879b.newThread(new RunnableC5417c(runnable, 0));
        newThread.setName(this.f14878a);
        return newThread;
    }
}
