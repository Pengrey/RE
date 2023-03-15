package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.a2 */
/* loaded from: classes.dex */
final /* synthetic */ class RunnableC3822a2 implements Runnable {

    /* renamed from: w */
    private final C3924z f10884w;

    private RunnableC3822a2(C3924z c3924z) {
        this.f10884w = c3924z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Runnable m28766a(C3924z c3924z) {
        return new RunnableC3822a2(c3924z);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10884w.m28586p();
    }
}
