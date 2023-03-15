package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import p079e8.InterfaceC5016c;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.t */
/* loaded from: classes.dex */
final class C3439t<TResult> implements InterfaceC3414a0<TResult> {

    /* renamed from: a */
    private final Executor f9267a;

    /* renamed from: b */
    private final Object f9268b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c */
    private InterfaceC5016c<TResult> f9269c;

    public C3439t(Executor executor, InterfaceC5016c<TResult> interfaceC5016c) {
        this.f9267a = executor;
        this.f9269c = interfaceC5016c;
    }

    @Override // com.google.android.gms.tasks.InterfaceC3414a0
    /* renamed from: d */
    public final void mo30744d(AbstractC3419d<TResult> abstractC3419d) {
        synchronized (this.f9268b) {
            if (this.f9269c == null) {
                return;
            }
            this.f9267a.execute(new RunnableC3438s(this, abstractC3419d));
        }
    }
}
