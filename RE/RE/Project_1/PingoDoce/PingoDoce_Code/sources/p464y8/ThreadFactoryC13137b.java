package p464y8;

import java.util.concurrent.ThreadFactory;

/* renamed from: y8.b */
/* loaded from: classes.dex */
final /* synthetic */ class ThreadFactoryC13137b implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f34092a = new ThreadFactoryC13137b();

    private ThreadFactoryC13137b() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AssetPackBackgroundExecutor");
    }
}
