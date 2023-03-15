package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;
import p031b9.C1855l;
import p101f9.AbstractC5433d;
import p101f9.InterfaceC5430a;
import p101f9.InterfaceC5431b;
import p101f9.InterfaceC5432c;

/* renamed from: com.google.android.play.core.tasks.o */
/* loaded from: classes.dex */
final class C3976o<ResultT> extends AbstractC5433d<ResultT> {

    /* renamed from: a */
    private final Object f11271a = new Object();

    /* renamed from: b */
    private final C3972k<ResultT> f11272b = new C3972k<>();

    /* renamed from: c */
    private boolean f11273c;

    /* renamed from: d */
    private ResultT f11274d;

    /* renamed from: e */
    private Exception f11275e;

    /* renamed from: h */
    private final void m28497h() {
        C1855l.m35253c(this.f11273c, "Task is not yet complete");
    }

    /* renamed from: k */
    private final void m28494k() {
        C1855l.m35253c(!this.f11273c, "Task is already complete");
    }

    /* renamed from: n */
    private final void m28491n() {
        synchronized (this.f11271a) {
            if (this.f11273c) {
                this.f11272b.m28503b(this);
            }
        }
    }

    @Override // p101f9.AbstractC5433d
    /* renamed from: a */
    public final AbstractC5433d<ResultT> mo24373a(InterfaceC5430a<ResultT> interfaceC5430a) {
        this.f11272b.m28504a(new C3965d(C3962a.f11249a, interfaceC5430a));
        m28491n();
        return this;
    }

    @Override // p101f9.AbstractC5433d
    /* renamed from: b */
    public final AbstractC5433d<ResultT> mo24372b(Executor executor, InterfaceC5431b interfaceC5431b) {
        this.f11272b.m28504a(new C3967f(executor, interfaceC5431b));
        m28491n();
        return this;
    }

    @Override // p101f9.AbstractC5433d
    /* renamed from: c */
    public final AbstractC5433d<ResultT> mo24371c(Executor executor, InterfaceC5432c<? super ResultT> interfaceC5432c) {
        this.f11272b.m28504a(new C3969h(executor, interfaceC5432c));
        m28491n();
        return this;
    }

    @Override // p101f9.AbstractC5433d
    /* renamed from: d */
    public final Exception mo24370d() {
        Exception exc;
        synchronized (this.f11271a) {
            exc = this.f11275e;
        }
        return exc;
    }

    @Override // p101f9.AbstractC5433d
    /* renamed from: e */
    public final ResultT mo24369e() {
        ResultT resultt;
        synchronized (this.f11271a) {
            m28497h();
            Exception exc = this.f11275e;
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            resultt = this.f11274d;
        }
        return resultt;
    }

    @Override // p101f9.AbstractC5433d
    /* renamed from: f */
    public final boolean mo24368f() {
        boolean z;
        synchronized (this.f11271a) {
            z = this.f11273c;
        }
        return z;
    }

    @Override // p101f9.AbstractC5433d
    /* renamed from: g */
    public final boolean mo24367g() {
        boolean z;
        synchronized (this.f11271a) {
            z = false;
            if (this.f11273c && this.f11275e == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: i */
    public final void m28496i(Exception exc) {
        synchronized (this.f11271a) {
            m28494k();
            this.f11273c = true;
            this.f11275e = exc;
        }
        this.f11272b.m28503b(this);
    }

    /* renamed from: j */
    public final void m28495j(ResultT resultt) {
        synchronized (this.f11271a) {
            m28494k();
            this.f11273c = true;
            this.f11274d = resultt;
        }
        this.f11272b.m28503b(this);
    }

    /* renamed from: l */
    public final boolean m28493l(Exception exc) {
        synchronized (this.f11271a) {
            if (this.f11273c) {
                return false;
            }
            this.f11273c = true;
            this.f11275e = exc;
            this.f11272b.m28503b(this);
            return true;
        }
    }

    /* renamed from: m */
    public final boolean m28492m(ResultT resultt) {
        synchronized (this.f11271a) {
            if (this.f11273c) {
                return false;
            }
            this.f11273c = true;
            this.f11274d = resultt;
            this.f11272b.m28503b(this);
            return true;
        }
    }
}
