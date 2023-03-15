package androidx.biometric;

import android.os.Build;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.p020os.C1008b;

/* renamed from: androidx.biometric.g */
/* loaded from: classes.dex */
class C0587g {

    /* renamed from: a */
    private final InterfaceC0590c f1905a = new C0588a(this);

    /* renamed from: b */
    private CancellationSignal f1906b;

    /* renamed from: c */
    private C1008b f1907c;

    /* compiled from: CancellationSignalProvider.java */
    /* renamed from: androidx.biometric.g$a */
    /* loaded from: classes.dex */
    class C0588a implements InterfaceC0590c {
        C0588a(C0587g c0587g) {
        }

        @Override // androidx.biometric.C0587g.InterfaceC0590c
        /* renamed from: a */
        public CancellationSignal mo40148a() {
            return C0589b.m40149b();
        }

        @Override // androidx.biometric.C0587g.InterfaceC0590c
        /* renamed from: b */
        public C1008b mo40147b() {
            return new C1008b();
        }
    }

    /* compiled from: CancellationSignalProvider.java */
    /* renamed from: androidx.biometric.g$b */
    /* loaded from: classes.dex */
    private static class C0589b {
        /* renamed from: a */
        static void m40150a(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        /* renamed from: b */
        static CancellationSignal m40149b() {
            return new CancellationSignal();
        }
    }

    /* compiled from: CancellationSignalProvider.java */
    /* renamed from: androidx.biometric.g$c */
    /* loaded from: classes.dex */
    interface InterfaceC0590c {
        /* renamed from: a */
        CancellationSignal mo40148a();

        /* renamed from: b */
        C1008b mo40147b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m40153a() {
        CancellationSignal cancellationSignal;
        if (Build.VERSION.SDK_INT >= 16 && (cancellationSignal = this.f1906b) != null) {
            try {
                C0589b.m40150a(cancellationSignal);
            } catch (NullPointerException e) {
                Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
            }
            this.f1906b = null;
        }
        C1008b c1008b = this.f1907c;
        if (c1008b != null) {
            try {
                c1008b.m38760a();
            } catch (NullPointerException e2) {
                Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
            }
            this.f1907c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public CancellationSignal m40152b() {
        if (this.f1906b == null) {
            this.f1906b = this.f1905a.mo40148a();
        }
        return this.f1906b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C1008b m40151c() {
        if (this.f1907c == null) {
            this.f1907c = this.f1905a.mo40147b();
        }
        return this.f1907c;
    }
}
