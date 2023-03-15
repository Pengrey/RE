package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p079e8.C5020g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.i */
/* loaded from: classes.dex */
public final class C3428i implements InterfaceC3429j {

    /* renamed from: a */
    private final CountDownLatch f9241a = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3428i(C5020g c5020g) {
    }

    @Override // p079e8.InterfaceC5015b
    /* renamed from: a */
    public final void mo25883a() {
        this.f9241a.countDown();
    }

    @Override // p079e8.InterfaceC5018e
    /* renamed from: b */
    public final void mo20210b(Object obj) {
        this.f9241a.countDown();
    }

    @Override // p079e8.InterfaceC5017d
    /* renamed from: c */
    public final void mo25882c(Exception exc) {
        this.f9241a.countDown();
    }

    /* renamed from: d */
    public final void m30760d() throws InterruptedException {
        this.f9241a.await();
    }

    /* renamed from: e */
    public final boolean m30759e(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f9241a.await(j, timeUnit);
    }
}
