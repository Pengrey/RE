package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import p079e8.InterfaceC5015b;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.r */
/* loaded from: classes.dex */
final class C3437r<TResult> implements InterfaceC3414a0<TResult> {

    /* renamed from: a */
    private final Executor f9262a;

    /* renamed from: b */
    private final Object f9263b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c */
    private InterfaceC5015b f9264c;

    public C3437r(Executor executor, InterfaceC5015b interfaceC5015b) {
        this.f9262a = executor;
        this.f9264c = interfaceC5015b;
    }

    @Override // com.google.android.gms.tasks.InterfaceC3414a0
    /* renamed from: d */
    public final void mo30744d(AbstractC3419d<TResult> abstractC3419d) {
        if (abstractC3419d.mo30782n()) {
            synchronized (this.f9263b) {
                if (this.f9264c == null) {
                    return;
                }
                this.f9262a.execute(new RunnableC3436q(this));
            }
        }
    }
}
