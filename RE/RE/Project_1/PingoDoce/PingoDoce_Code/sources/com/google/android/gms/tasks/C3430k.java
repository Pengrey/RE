package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.k */
/* loaded from: classes.dex */
public final class C3430k implements InterfaceC3429j {

    /* renamed from: a */
    private final Object f9242a = new Object();

    /* renamed from: b */
    private final int f9243b;

    /* renamed from: c */
    private final C3424f0<Void> f9244c;
    @GuardedBy("mLock")

    /* renamed from: d */
    private int f9245d;
    @GuardedBy("mLock")

    /* renamed from: e */
    private int f9246e;
    @GuardedBy("mLock")

    /* renamed from: f */
    private int f9247f;
    @GuardedBy("mLock")

    /* renamed from: g */
    private Exception f9248g;
    @GuardedBy("mLock")

    /* renamed from: h */
    private boolean f9249h;

    public C3430k(int i, C3424f0<Void> c3424f0) {
        this.f9243b = i;
        this.f9244c = c3424f0;
    }

    @GuardedBy("mLock")
    /* renamed from: d */
    private final void m30758d() {
        if (this.f9245d + this.f9246e + this.f9247f == this.f9243b) {
            if (this.f9248g == null) {
                if (this.f9249h) {
                    this.f9244c.m30775u();
                    return;
                } else {
                    this.f9244c.m30776t(null);
                    return;
                }
            }
            C3424f0<Void> c3424f0 = this.f9244c;
            int i = this.f9246e;
            int i2 = this.f9243b;
            StringBuilder sb2 = new StringBuilder(54);
            sb2.append(i);
            sb2.append(" out of ");
            sb2.append(i2);
            sb2.append(" underlying tasks failed");
            c3424f0.m30777s(new ExecutionException(sb2.toString(), this.f9248g));
        }
    }

    @Override // p079e8.InterfaceC5015b
    /* renamed from: a */
    public final void mo25883a() {
        synchronized (this.f9242a) {
            this.f9247f++;
            this.f9249h = true;
            m30758d();
        }
    }

    @Override // p079e8.InterfaceC5018e
    /* renamed from: b */
    public final void mo20210b(Object obj) {
        synchronized (this.f9242a) {
            this.f9245d++;
            m30758d();
        }
    }

    @Override // p079e8.InterfaceC5017d
    /* renamed from: c */
    public final void mo25882c(Exception exc) {
        synchronized (this.f9242a) {
            this.f9246e++;
            this.f9248g = exc;
            m30758d();
        }
    }
}
