package com.google.android.play.core.tasks;

import java.util.ArrayDeque;
import java.util.Queue;
import p101f9.AbstractC5433d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.tasks.k */
/* loaded from: classes.dex */
public final class C3972k<ResultT> {

    /* renamed from: a */
    private final Object f11266a = new Object();

    /* renamed from: b */
    private Queue<InterfaceC3970i<ResultT>> f11267b;

    /* renamed from: c */
    private boolean f11268c;

    /* renamed from: a */
    public final void m28504a(InterfaceC3970i<ResultT> interfaceC3970i) {
        synchronized (this.f11266a) {
            if (this.f11267b == null) {
                this.f11267b = new ArrayDeque();
            }
            this.f11267b.add(interfaceC3970i);
        }
    }

    /* renamed from: b */
    public final void m28503b(AbstractC5433d<ResultT> abstractC5433d) {
        InterfaceC3970i<ResultT> poll;
        synchronized (this.f11266a) {
            if (this.f11267b != null && !this.f11268c) {
                this.f11268c = true;
                while (true) {
                    synchronized (this.f11266a) {
                        poll = this.f11267b.poll();
                        if (poll == null) {
                            this.f11268c = false;
                            return;
                        }
                    }
                    poll.mo28505a(abstractC5433d);
                }
            }
        }
    }
}
