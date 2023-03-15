package androidx.lifecycle;

import android.annotation.SuppressLint;
import bd.CoroutineContext;
import java.util.ArrayDeque;
import java.util.Queue;
import p181jd.Intrinsics;
import td.AbstractC10492c2;
import td.C10587w0;

/* renamed from: androidx.lifecycle.i */
/* loaded from: classes.dex */
public final class DispatchQueue {

    /* renamed from: b */
    private boolean f4300b;

    /* renamed from: c */
    private boolean f4301c;

    /* renamed from: a */
    private boolean f4302a = true;

    /* renamed from: d */
    private final Queue f4303d = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DispatchQueue.kt */
    /* renamed from: androidx.lifecycle.i$a */
    /* loaded from: classes.dex */
    public static final class RunnableC1444a implements Runnable {

        /* renamed from: x */
        final /* synthetic */ CoroutineContext f4305x;

        /* renamed from: y */
        final /* synthetic */ Runnable f4306y;

        RunnableC1444a(CoroutineContext coroutineContext, Runnable runnable) {
            this.f4305x = coroutineContext;
            this.f4306y = runnable;
        }

        public final void run() {
            DispatchQueue.m37040a(DispatchQueue.this, this.f4306y);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m37040a(DispatchQueue dispatchQueue, Runnable runnable) {
        dispatchQueue.m37036e(runnable);
    }

    /* renamed from: e */
    private final void m37036e(Runnable runnable) {
        if (this.f4303d.offer(runnable)) {
            m37037d();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables".toString());
    }

    /* renamed from: b */
    public final boolean m37039b() {
        return this.f4300b || !this.f4302a;
    }

    @SuppressLint({"WrongThread"})
    /* renamed from: c */
    public final void m37038c(CoroutineContext coroutineContext, Runnable runnable) {
        Intrinsics.isThisObjectNull(coroutineContext, "context");
        Intrinsics.isThisObjectNull(runnable, "runnable");
        AbstractC10492c2 mo7830H0 = C10587w0.m7619c().mo7830H0();
        if (!mo7830H0.mo7627F0(coroutineContext) && !m37039b()) {
            m37036e(runnable);
        } else {
            mo7830H0.mo7628D0(coroutineContext, new RunnableC1444a(coroutineContext, runnable));
        }
    }

    /* renamed from: d */
    public final void m37037d() {
        if (this.f4301c) {
            return;
        }
        try {
            this.f4301c = true;
            while ((!this.f4303d.isEmpty()) && m37039b()) {
                Runnable runnable = (Runnable) this.f4303d.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.f4301c = false;
        }
    }

    /* renamed from: f */
    public final void m37035f() {
        this.f4300b = true;
        m37037d();
    }

    /* renamed from: g */
    public final void m37034g() {
        this.f4302a = true;
    }

    /* renamed from: h */
    public final void m37033h() {
        if (this.f4302a) {
            if (!this.f4300b) {
                this.f4302a = false;
                m37037d();
                return;
            }
            throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
        }
    }
}
