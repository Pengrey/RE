package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.y */
/* loaded from: classes.dex */
final class RunnableC3444y implements Runnable {

    /* renamed from: w */
    final /* synthetic */ AbstractC3419d f9280w;

    /* renamed from: x */
    final /* synthetic */ C3445z f9281x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3444y(C3445z c3445z, AbstractC3419d abstractC3419d) {
        this.f9281x = c3445z;
        this.f9280w = abstractC3419d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3417c interfaceC3417c;
        try {
            interfaceC3417c = this.f9281x.f9283b;
            AbstractC3419d mo6853a = interfaceC3417c.mo6853a(this.f9280w.mo30784l());
            if (mo6853a == null) {
                this.f9281x.mo25882c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C3423f.f9231b;
            mo6853a.mo30790f(executor, this.f9281x);
            mo6853a.mo30792d(executor, this.f9281x);
            mo6853a.mo30795a(executor, this.f9281x);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f9281x.mo25882c((Exception) e.getCause());
            } else {
                this.f9281x.mo25882c(e);
            }
        } catch (CancellationException unused) {
            this.f9281x.mo25883a();
        } catch (Exception e2) {
            this.f9281x.mo25882c(e2);
        }
    }
}
