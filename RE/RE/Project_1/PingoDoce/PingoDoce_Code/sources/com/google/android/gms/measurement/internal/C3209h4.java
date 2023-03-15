package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.C2597i;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.h4 */
/* loaded from: classes.dex */
public final class C3209h4 extends Thread {

    /* renamed from: w */
    private final Object f8494w;

    /* renamed from: x */
    private final BlockingQueue f8495x;

    /* renamed from: y */
    private boolean f8496y = false;

    /* renamed from: z */
    final /* synthetic */ C3220i4 f8497z;

    public C3209h4(C3220i4 c3220i4, String str, BlockingQueue blockingQueue) {
        this.f8497z = c3220i4;
        C2597i.m33076j(str);
        C2597i.m33076j(blockingQueue);
        this.f8494w = new Object();
        this.f8495x = blockingQueue;
        setName(str);
    }

    /* renamed from: b */
    private final void m31259b() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        C3209h4 c3209h4;
        C3209h4 c3209h42;
        obj = this.f8497z.f8522i;
        synchronized (obj) {
            if (!this.f8496y) {
                semaphore = this.f8497z.f8523j;
                semaphore.release();
                obj2 = this.f8497z.f8522i;
                obj2.notifyAll();
                C3220i4 c3220i4 = this.f8497z;
                c3209h4 = c3220i4.f8516c;
                if (this == c3209h4) {
                    c3220i4.f8516c = null;
                } else {
                    c3209h42 = c3220i4.f8517d;
                    if (this == c3209h42) {
                        c3220i4.f8517d = null;
                    } else {
                        c3220i4.f8410a.mo31116d().m31332r().m31398a("Current scheduler thread is neither worker nor network");
                    }
                }
                this.f8496y = true;
            }
        }
    }

    /* renamed from: c */
    private final void m31258c(InterruptedException interruptedException) {
        this.f8497z.f8410a.mo31116d().m31327w().m31397b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: a */
    public final void m31260a() {
        synchronized (this.f8494w) {
            this.f8494w.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z = false;
        while (!z) {
            try {
                semaphore = this.f8497z.f8523j;
                semaphore.acquire();
                z = true;
            } catch (InterruptedException e) {
                m31258c(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C3198g4 c3198g4 = (C3198g4) this.f8495x.poll();
                if (c3198g4 != null) {
                    Process.setThreadPriority(true != c3198g4.f8460x ? 10 : threadPriority);
                    c3198g4.run();
                } else {
                    synchronized (this.f8494w) {
                        if (this.f8495x.peek() == null) {
                            boolean unused = this.f8497z.f8524k;
                            try {
                                this.f8494w.wait(30000L);
                            } catch (InterruptedException e2) {
                                m31258c(e2);
                            }
                        }
                    }
                    obj = this.f8497z.f8522i;
                    synchronized (obj) {
                        if (this.f8495x.peek() == null) {
                            break;
                        }
                    }
                }
            }
            if (this.f8497z.f8410a.m31094z().m31373B(null, C3339t2.f8922g0)) {
                m31259b();
            }
        } finally {
            m31259b();
        }
    }
}
