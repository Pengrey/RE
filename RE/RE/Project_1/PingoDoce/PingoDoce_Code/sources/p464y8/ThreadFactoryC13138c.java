package p464y8;

import java.util.concurrent.ThreadFactory;

/* renamed from: y8.c */
/* loaded from: classes.dex */
final /* synthetic */ class ThreadFactoryC13138c implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f34093a = new ThreadFactoryC13138c();

    private ThreadFactoryC13138c() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "UpdateListenerExecutor");
    }
}
