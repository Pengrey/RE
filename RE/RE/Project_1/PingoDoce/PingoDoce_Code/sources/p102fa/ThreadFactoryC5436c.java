package p102fa;

import java.util.concurrent.ThreadFactory;

/* renamed from: fa.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class ThreadFactoryC5436c implements ThreadFactory {

    /* renamed from: a */
    public static final /* synthetic */ ThreadFactoryC5436c f15319a = new ThreadFactoryC5436c();

    private /* synthetic */ ThreadFactoryC5436c() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread m24360h;
        m24360h = C5437d.m24360h(runnable);
        return m24360h;
    }
}
