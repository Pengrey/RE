package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.m */
/* loaded from: classes.dex */
final class RunnableC3432m implements Runnable {

    /* renamed from: w */
    final /* synthetic */ AbstractC3419d f9251w;

    /* renamed from: x */
    final /* synthetic */ C3433n f9252x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3432m(C3433n c3433n, AbstractC3419d abstractC3419d) {
        this.f9252x = c3433n;
        this.f9251w = abstractC3419d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3424f0 c3424f0;
        C3424f0 c3424f02;
        C3424f0 c3424f03;
        InterfaceC3415b interfaceC3415b;
        C3424f0 c3424f04;
        C3424f0 c3424f05;
        if (this.f9251w.mo30782n()) {
            c3424f05 = this.f9252x.f9255c;
            c3424f05.m30775u();
            return;
        }
        try {
            interfaceC3415b = this.f9252x.f9254b;
            Object mo4684a = interfaceC3415b.mo4684a(this.f9251w);
            c3424f04 = this.f9252x.f9255c;
            c3424f04.m30776t(mo4684a);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                c3424f03 = this.f9252x.f9255c;
                c3424f03.m30777s((Exception) e.getCause());
                return;
            }
            c3424f02 = this.f9252x.f9255c;
            c3424f02.m30777s(e);
        } catch (Exception e2) {
            c3424f0 = this.f9252x.f9255c;
            c3424f0.m30777s(e2);
        }
    }
}
