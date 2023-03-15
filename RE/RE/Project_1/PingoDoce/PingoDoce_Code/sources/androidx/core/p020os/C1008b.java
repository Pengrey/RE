package androidx.core.p020os;

import android.os.Build;
import android.os.CancellationSignal;

/* renamed from: androidx.core.os.b */
/* loaded from: classes.dex */
public final class C1008b {

    /* renamed from: a */
    private boolean f3312a;

    /* renamed from: b */
    private InterfaceC1010b f3313b;

    /* renamed from: c */
    private Object f3314c;

    /* renamed from: d */
    private boolean f3315d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CancellationSignal.java */
    /* renamed from: androidx.core.os.b$a */
    /* loaded from: classes.dex */
    public static class C1009a {
        /* renamed from: a */
        static void m38755a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        /* renamed from: b */
        static CancellationSignal m38754b() {
            return new CancellationSignal();
        }
    }

    /* compiled from: CancellationSignal.java */
    /* renamed from: androidx.core.os.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1010b {
        /* renamed from: a */
        void mo37090a();
    }

    /* renamed from: e */
    private void m38756e() {
        while (this.f3315d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: a */
    public void m38760a() {
        synchronized (this) {
            if (this.f3312a) {
                return;
            }
            this.f3312a = true;
            this.f3315d = true;
            InterfaceC1010b interfaceC1010b = this.f3313b;
            Object obj = this.f3314c;
            if (interfaceC1010b != null) {
                try {
                    interfaceC1010b.mo37090a();
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f3315d = false;
                        notifyAll();
                        throw th2;
                    }
                }
            }
            if (obj != null && Build.VERSION.SDK_INT >= 16) {
                C1009a.m38755a(obj);
            }
            synchronized (this) {
                this.f3315d = false;
                notifyAll();
            }
        }
    }

    /* renamed from: b */
    public Object m38759b() {
        Object obj;
        if (Build.VERSION.SDK_INT < 16) {
            return null;
        }
        synchronized (this) {
            if (this.f3314c == null) {
                CancellationSignal m38754b = C1009a.m38754b();
                this.f3314c = m38754b;
                if (this.f3312a) {
                    C1009a.m38755a(m38754b);
                }
            }
            obj = this.f3314c;
        }
        return obj;
    }

    /* renamed from: c */
    public boolean m38758c() {
        boolean z;
        synchronized (this) {
            z = this.f3312a;
        }
        return z;
    }

    /* renamed from: d */
    public void m38757d(InterfaceC1010b interfaceC1010b) {
        synchronized (this) {
            m38756e();
            if (this.f3313b == interfaceC1010b) {
                return;
            }
            this.f3313b = interfaceC1010b;
            if (this.f3312a && interfaceC1010b != null) {
                interfaceC1010b.mo37090a();
            }
        }
    }
}
