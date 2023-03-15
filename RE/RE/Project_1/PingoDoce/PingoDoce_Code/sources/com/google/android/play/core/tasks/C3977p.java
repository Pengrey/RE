package com.google.android.play.core.tasks;

import java.util.concurrent.CountDownLatch;
import p101f9.InterfaceC5431b;
import p101f9.InterfaceC5432c;

/* renamed from: com.google.android.play.core.tasks.p */
/* loaded from: classes.dex */
final class C3977p implements InterfaceC5432c, InterfaceC5431b {

    /* renamed from: a */
    private final CountDownLatch f11276a = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3977p(byte[] bArr) {
    }

    /* renamed from: a */
    public final void m28490a() throws InterruptedException {
        this.f11276a.await();
    }

    @Override // p101f9.InterfaceC5432c
    /* renamed from: b */
    public final void mo24374b(Object obj) {
        this.f11276a.countDown();
    }

    @Override // p101f9.InterfaceC5431b
    /* renamed from: c */
    public final void mo24375c(Exception exc) {
        this.f11276a.countDown();
    }
}
