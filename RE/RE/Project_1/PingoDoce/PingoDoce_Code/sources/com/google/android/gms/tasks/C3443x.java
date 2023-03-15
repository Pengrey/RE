package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import p079e8.InterfaceC5018e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.x */
/* loaded from: classes.dex */
public final class C3443x<TResult> implements InterfaceC3414a0<TResult> {

    /* renamed from: a */
    private final Executor f9277a;

    /* renamed from: b */
    private final Object f9278b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c */
    private InterfaceC5018e<? super TResult> f9279c;

    public C3443x(Executor executor, InterfaceC5018e<? super TResult> interfaceC5018e) {
        this.f9277a = executor;
        this.f9279c = interfaceC5018e;
    }

    @Override // com.google.android.gms.tasks.InterfaceC3414a0
    /* renamed from: d */
    public final void mo30744d(AbstractC3419d<TResult> abstractC3419d) {
        if (abstractC3419d.mo30780p()) {
            synchronized (this.f9278b) {
                if (this.f9279c == null) {
                    return;
                }
                this.f9277a.execute(new RunnableC3442w(this, abstractC3419d));
            }
        }
    }
}
