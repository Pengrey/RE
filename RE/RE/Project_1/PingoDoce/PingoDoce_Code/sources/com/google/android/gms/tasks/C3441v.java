package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import p079e8.InterfaceC5017d;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.v */
/* loaded from: classes.dex */
final class C3441v<TResult> implements InterfaceC3414a0<TResult> {

    /* renamed from: a */
    private final Executor f9272a;

    /* renamed from: b */
    private final Object f9273b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c */
    private InterfaceC5017d f9274c;

    public C3441v(Executor executor, InterfaceC5017d interfaceC5017d) {
        this.f9272a = executor;
        this.f9274c = interfaceC5017d;
    }

    @Override // com.google.android.gms.tasks.InterfaceC3414a0
    /* renamed from: d */
    public final void mo30744d(AbstractC3419d<TResult> abstractC3419d) {
        if (abstractC3419d.mo30780p() || abstractC3419d.mo30782n()) {
            return;
        }
        synchronized (this.f9273b) {
            if (this.f9274c == null) {
                return;
            }
            this.f9272a.execute(new RunnableC3440u(this, abstractC3419d));
        }
    }
}
