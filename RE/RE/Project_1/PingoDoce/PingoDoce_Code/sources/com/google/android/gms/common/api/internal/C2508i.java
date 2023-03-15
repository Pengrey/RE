package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.C2597i;
import java.util.concurrent.Executor;
import p099f7.ExecutorC5415a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.i */
/* loaded from: classes.dex */
public final class C2508i<L> {

    /* renamed from: a */
    private final Executor f7271a;

    /* renamed from: b */
    private volatile L f7272b;

    /* renamed from: c */
    private volatile C2509a<L> f7273c;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.internal.i$a */
    /* loaded from: classes.dex */
    public static final class C2509a<L> {

        /* renamed from: a */
        private final L f7274a;

        /* renamed from: b */
        private final String f7275b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C2509a(L l, String str) {
            this.f7274a = l;
            this.f7275b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2509a) {
                C2509a c2509a = (C2509a) obj;
                return this.f7274a == c2509a.f7274a && this.f7275b.equals(c2509a.f7275b);
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f7274a) * 31) + this.f7275b.hashCode();
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.internal.i$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2510b<L> {
        /* renamed from: a */
        void mo32951a(L l);

        /* renamed from: b */
        void mo32950b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2508i(Looper looper, L l, String str) {
        this.f7271a = new ExecutorC5415a(looper);
        this.f7272b = (L) C2597i.m33075k(l, "Listener must not be null");
        this.f7273c = new C2509a<>(l, C2597i.m33080f(str));
    }

    /* renamed from: a */
    public void m33356a() {
        this.f7272b = null;
        this.f7273c = null;
    }

    /* renamed from: b */
    public C2509a<L> m33355b() {
        return this.f7273c;
    }

    /* renamed from: c */
    public void m33354c(final InterfaceC2510b<? super L> interfaceC2510b) {
        C2597i.m33075k(interfaceC2510b, "Notifier must not be null");
        this.f7271a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.q0
            @Override // java.lang.Runnable
            public final void run() {
                C2508i.this.m33353d(interfaceC2510b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m33353d(InterfaceC2510b<? super L> interfaceC2510b) {
        Object obj = (L) this.f7272b;
        if (obj == null) {
            interfaceC2510b.mo32950b();
            return;
        }
        try {
            interfaceC2510b.mo32951a(obj);
        } catch (RuntimeException e) {
            interfaceC2510b.mo32950b();
            throw e;
        }
    }
}
