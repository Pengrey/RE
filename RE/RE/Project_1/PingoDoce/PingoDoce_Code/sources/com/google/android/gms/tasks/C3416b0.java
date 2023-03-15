package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.b0 */
/* loaded from: classes.dex */
public final class C3416b0<TResult> {

    /* renamed from: a */
    private final Object f9224a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    private Queue<InterfaceC3414a0<TResult>> f9225b;
    @GuardedBy("mLock")

    /* renamed from: c */
    private boolean f9226c;

    /* renamed from: a */
    public final void m30804a(InterfaceC3414a0<TResult> interfaceC3414a0) {
        synchronized (this.f9224a) {
            if (this.f9225b == null) {
                this.f9225b = new ArrayDeque();
            }
            this.f9225b.add(interfaceC3414a0);
        }
    }

    /* renamed from: b */
    public final void m30803b(AbstractC3419d<TResult> abstractC3419d) {
        InterfaceC3414a0<TResult> poll;
        synchronized (this.f9224a) {
            if (this.f9225b != null && !this.f9226c) {
                this.f9226c = true;
                while (true) {
                    synchronized (this.f9224a) {
                        poll = this.f9225b.poll();
                        if (poll == null) {
                            this.f9226c = false;
                            return;
                        }
                    }
                    poll.mo30744d(abstractC3419d);
                }
            }
        }
    }
}
