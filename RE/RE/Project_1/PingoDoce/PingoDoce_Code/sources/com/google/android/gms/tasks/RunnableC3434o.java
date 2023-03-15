package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.o */
/* loaded from: classes.dex */
final class RunnableC3434o implements Runnable {

    /* renamed from: w */
    final /* synthetic */ AbstractC3419d f9256w;

    /* renamed from: x */
    final /* synthetic */ C3435p f9257x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3434o(C3435p c3435p, AbstractC3419d abstractC3419d) {
        this.f9257x = c3435p;
        this.f9256w = abstractC3419d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3424f0 c3424f0;
        C3424f0 c3424f02;
        C3424f0 c3424f03;
        InterfaceC3415b interfaceC3415b;
        try {
            interfaceC3415b = this.f9257x.f9259b;
            AbstractC3419d abstractC3419d = (AbstractC3419d) interfaceC3415b.mo4684a(this.f9256w);
            if (abstractC3419d == null) {
                this.f9257x.mo25882c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C3423f.f9231b;
            abstractC3419d.mo30790f(executor, this.f9257x);
            abstractC3419d.mo30792d(executor, this.f9257x);
            abstractC3419d.mo30795a(executor, this.f9257x);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                c3424f03 = this.f9257x.f9260c;
                c3424f03.m30777s((Exception) e.getCause());
                return;
            }
            c3424f02 = this.f9257x.f9260c;
            c3424f02.m30777s(e);
        } catch (Exception e2) {
            c3424f0 = this.f9257x.f9260c;
            c3424f0.m30777s(e2);
        }
    }
}
