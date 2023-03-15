package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.C2597i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import p079e8.InterfaceC5015b;
import p079e8.InterfaceC5016c;
import p079e8.InterfaceC5017d;
import p079e8.InterfaceC5018e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.f0 */
/* loaded from: classes.dex */
public final class C3424f0<TResult> extends AbstractC3419d<TResult> {

    /* renamed from: a */
    private final Object f9232a = new Object();

    /* renamed from: b */
    private final C3416b0<TResult> f9233b = new C3416b0<>();
    @GuardedBy("mLock")

    /* renamed from: c */
    private boolean f9234c;

    /* renamed from: d */
    private volatile boolean f9235d;
    @GuardedBy("mLock")

    /* renamed from: e */
    private TResult f9236e;
    @GuardedBy("mLock")

    /* renamed from: f */
    private Exception f9237f;

    /* renamed from: A */
    private final void m30796A() {
        synchronized (this.f9232a) {
            if (this.f9234c) {
                this.f9233b.m30803b(this);
            }
        }
    }

    @GuardedBy("mLock")
    /* renamed from: x */
    private final void m30772x() {
        C2597i.m33072n(this.f9234c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    /* renamed from: y */
    private final void m30771y() {
        if (this.f9235d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    @GuardedBy("mLock")
    /* renamed from: z */
    private final void m30770z() {
        if (this.f9234c) {
            throw DuplicateTaskCompletionException.m30807a(this);
        }
    }

    @Override // com.google.android.gms.tasks.AbstractC3419d
    /* renamed from: a */
    public final AbstractC3419d<TResult> mo30795a(Executor executor, InterfaceC5015b interfaceC5015b) {
        this.f9233b.m30804a(new C3437r(executor, interfaceC5015b));
        m30796A();
        return this;
    }

    @Override // com.google.android.gms.tasks.AbstractC3419d
    /* renamed from: b */
    public final AbstractC3419d<TResult> mo30794b(InterfaceC5016c<TResult> interfaceC5016c) {
        this.f9233b.m30804a(new C3439t(C3423f.f9230a, interfaceC5016c));
        m30796A();
        return this;
    }

    @Override // com.google.android.gms.tasks.AbstractC3419d
    /* renamed from: c */
    public final AbstractC3419d<TResult> mo30793c(Executor executor, InterfaceC5016c<TResult> interfaceC5016c) {
        this.f9233b.m30804a(new C3439t(executor, interfaceC5016c));
        m30796A();
        return this;
    }

    @Override // com.google.android.gms.tasks.AbstractC3419d
    /* renamed from: d */
    public final AbstractC3419d<TResult> mo30792d(Executor executor, InterfaceC5017d interfaceC5017d) {
        this.f9233b.m30804a(new C3441v(executor, interfaceC5017d));
        m30796A();
        return this;
    }

    @Override // com.google.android.gms.tasks.AbstractC3419d
    /* renamed from: e */
    public final AbstractC3419d<TResult> mo30791e(InterfaceC5018e<? super TResult> interfaceC5018e) {
        mo30790f(C3423f.f9230a, interfaceC5018e);
        return this;
    }

    @Override // com.google.android.gms.tasks.AbstractC3419d
    /* renamed from: f */
    public final AbstractC3419d<TResult> mo30790f(Executor executor, InterfaceC5018e<? super TResult> interfaceC5018e) {
        this.f9233b.m30804a(new C3443x(executor, interfaceC5018e));
        m30796A();
        return this;
    }

    @Override // com.google.android.gms.tasks.AbstractC3419d
    /* renamed from: g */
    public final <TContinuationResult> AbstractC3419d<TContinuationResult> mo30789g(InterfaceC3415b<TResult, TContinuationResult> interfaceC3415b) {
        return mo30788h(C3423f.f9230a, interfaceC3415b);
    }

    @Override // com.google.android.gms.tasks.AbstractC3419d
    /* renamed from: h */
    public final <TContinuationResult> AbstractC3419d<TContinuationResult> mo30788h(Executor executor, InterfaceC3415b<TResult, TContinuationResult> interfaceC3415b) {
        C3424f0 c3424f0 = new C3424f0();
        this.f9233b.m30804a(new C3433n(executor, interfaceC3415b, c3424f0));
        m30796A();
        return c3424f0;
    }

    @Override // com.google.android.gms.tasks.AbstractC3419d
    /* renamed from: i */
    public final <TContinuationResult> AbstractC3419d<TContinuationResult> mo30787i(InterfaceC3415b<TResult, AbstractC3419d<TContinuationResult>> interfaceC3415b) {
        return mo30786j(C3423f.f9230a, interfaceC3415b);
    }

    @Override // com.google.android.gms.tasks.AbstractC3419d
    /* renamed from: j */
    public final <TContinuationResult> AbstractC3419d<TContinuationResult> mo30786j(Executor executor, InterfaceC3415b<TResult, AbstractC3419d<TContinuationResult>> interfaceC3415b) {
        C3424f0 c3424f0 = new C3424f0();
        this.f9233b.m30804a(new C3435p(executor, interfaceC3415b, c3424f0));
        m30796A();
        return c3424f0;
    }

    @Override // com.google.android.gms.tasks.AbstractC3419d
    /* renamed from: k */
    public final Exception mo30785k() {
        Exception exc;
        synchronized (this.f9232a) {
            exc = this.f9237f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.AbstractC3419d
    /* renamed from: l */
    public final TResult mo30784l() {
        TResult tresult;
        synchronized (this.f9232a) {
            m30772x();
            m30771y();
            Exception exc = this.f9237f;
            if (exc == null) {
                tresult = this.f9236e;
            } else {
                throw new RuntimeExecutionException(exc);
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.AbstractC3419d
    /* renamed from: m */
    public final <X extends Throwable> TResult mo30783m(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f9232a) {
            m30772x();
            m30771y();
            if (!cls.isInstance(this.f9237f)) {
                Exception exc = this.f9237f;
                if (exc == null) {
                    tresult = this.f9236e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw cls.cast(this.f9237f);
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.AbstractC3419d
    /* renamed from: n */
    public final boolean mo30782n() {
        return this.f9235d;
    }

    @Override // com.google.android.gms.tasks.AbstractC3419d
    /* renamed from: o */
    public final boolean mo30781o() {
        boolean z;
        synchronized (this.f9232a) {
            z = this.f9234c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.AbstractC3419d
    /* renamed from: p */
    public final boolean mo30780p() {
        boolean z;
        synchronized (this.f9232a) {
            z = false;
            if (this.f9234c && !this.f9235d && this.f9237f == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.AbstractC3419d
    /* renamed from: q */
    public final <TContinuationResult> AbstractC3419d<TContinuationResult> mo30779q(InterfaceC3417c<TResult, TContinuationResult> interfaceC3417c) {
        Executor executor = C3423f.f9230a;
        C3424f0 c3424f0 = new C3424f0();
        this.f9233b.m30804a(new C3445z(executor, interfaceC3417c, c3424f0));
        m30796A();
        return c3424f0;
    }

    @Override // com.google.android.gms.tasks.AbstractC3419d
    /* renamed from: r */
    public final <TContinuationResult> AbstractC3419d<TContinuationResult> mo30778r(Executor executor, InterfaceC3417c<TResult, TContinuationResult> interfaceC3417c) {
        C3424f0 c3424f0 = new C3424f0();
        this.f9233b.m30804a(new C3445z(executor, interfaceC3417c, c3424f0));
        m30796A();
        return c3424f0;
    }

    /* renamed from: s */
    public final void m30777s(Exception exc) {
        C2597i.m33075k(exc, "Exception must not be null");
        synchronized (this.f9232a) {
            m30770z();
            this.f9234c = true;
            this.f9237f = exc;
        }
        this.f9233b.m30803b(this);
    }

    /* renamed from: t */
    public final void m30776t(TResult tresult) {
        synchronized (this.f9232a) {
            m30770z();
            this.f9234c = true;
            this.f9236e = tresult;
        }
        this.f9233b.m30803b(this);
    }

    /* renamed from: u */
    public final boolean m30775u() {
        synchronized (this.f9232a) {
            if (this.f9234c) {
                return false;
            }
            this.f9234c = true;
            this.f9235d = true;
            this.f9233b.m30803b(this);
            return true;
        }
    }

    /* renamed from: v */
    public final boolean m30774v(Exception exc) {
        C2597i.m33075k(exc, "Exception must not be null");
        synchronized (this.f9232a) {
            if (this.f9234c) {
                return false;
            }
            this.f9234c = true;
            this.f9237f = exc;
            this.f9233b.m30803b(this);
            return true;
        }
    }

    /* renamed from: w */
    public final boolean m30773w(TResult tresult) {
        synchronized (this.f9232a) {
            if (this.f9234c) {
                return false;
            }
            this.f9234c = true;
            this.f9236e = tresult;
            this.f9233b.m30803b(this);
            return true;
        }
    }
}
