package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.b */
/* loaded from: classes.dex */
class C3716b {

    /* renamed from: e */
    private static C3716b f10471e;

    /* renamed from: a */
    private final Object f10472a = new Object();

    /* renamed from: b */
    private final Handler f10473b = new Handler(Looper.getMainLooper(), new C3717a());

    /* renamed from: c */
    private C3719c f10474c;

    /* renamed from: d */
    private C3719c f10475d;

    /* compiled from: SnackbarManager.java */
    /* renamed from: com.google.android.material.snackbar.b$a */
    /* loaded from: classes.dex */
    class C3717a implements Handler.Callback {
        C3717a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C3716b.this.m29226d((C3719c) message.obj);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarManager.java */
    /* renamed from: com.google.android.material.snackbar.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3718b {
        /* renamed from: a */
        void mo29215a();

        /* renamed from: b */
        void mo29214b(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SnackbarManager.java */
    /* renamed from: com.google.android.material.snackbar.b$c */
    /* loaded from: classes.dex */
    public static class C3719c {

        /* renamed from: a */
        final WeakReference<InterfaceC3718b> f10477a;

        /* renamed from: b */
        int f10478b;

        /* renamed from: c */
        boolean f10479c;

        C3719c(int i, InterfaceC3718b interfaceC3718b) {
            this.f10477a = new WeakReference<>(interfaceC3718b);
            this.f10478b = i;
        }

        /* renamed from: a */
        boolean m29213a(InterfaceC3718b interfaceC3718b) {
            return interfaceC3718b != null && this.f10477a.get() == interfaceC3718b;
        }
    }

    private C3716b() {
    }

    /* renamed from: a */
    private boolean m29229a(C3719c c3719c, int i) {
        InterfaceC3718b interfaceC3718b = c3719c.f10477a.get();
        if (interfaceC3718b != null) {
            this.f10473b.removeCallbacksAndMessages(c3719c);
            interfaceC3718b.mo29214b(i);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C3716b m29227c() {
        if (f10471e == null) {
            f10471e = new C3716b();
        }
        return f10471e;
    }

    /* renamed from: f */
    private boolean m29224f(InterfaceC3718b interfaceC3718b) {
        C3719c c3719c = this.f10474c;
        return c3719c != null && c3719c.m29213a(interfaceC3718b);
    }

    /* renamed from: g */
    private boolean m29223g(InterfaceC3718b interfaceC3718b) {
        C3719c c3719c = this.f10475d;
        return c3719c != null && c3719c.m29213a(interfaceC3718b);
    }

    /* renamed from: l */
    private void m29218l(C3719c c3719c) {
        int i = c3719c.f10478b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        this.f10473b.removeCallbacksAndMessages(c3719c);
        Handler handler = this.f10473b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c3719c), i);
    }

    /* renamed from: n */
    private void m29216n() {
        C3719c c3719c = this.f10475d;
        if (c3719c != null) {
            this.f10474c = c3719c;
            this.f10475d = null;
            InterfaceC3718b interfaceC3718b = c3719c.f10477a.get();
            if (interfaceC3718b != null) {
                interfaceC3718b.mo29215a();
            } else {
                this.f10474c = null;
            }
        }
    }

    /* renamed from: b */
    public void m29228b(InterfaceC3718b interfaceC3718b, int i) {
        synchronized (this.f10472a) {
            if (m29224f(interfaceC3718b)) {
                m29229a(this.f10474c, i);
            } else if (m29223g(interfaceC3718b)) {
                m29229a(this.f10475d, i);
            }
        }
    }

    /* renamed from: d */
    void m29226d(C3719c c3719c) {
        synchronized (this.f10472a) {
            if (this.f10474c == c3719c || this.f10475d == c3719c) {
                m29229a(c3719c, 2);
            }
        }
    }

    /* renamed from: e */
    public boolean m29225e(InterfaceC3718b interfaceC3718b) {
        boolean z;
        synchronized (this.f10472a) {
            z = m29224f(interfaceC3718b) || m29223g(interfaceC3718b);
        }
        return z;
    }

    /* renamed from: h */
    public void m29222h(InterfaceC3718b interfaceC3718b) {
        synchronized (this.f10472a) {
            if (m29224f(interfaceC3718b)) {
                this.f10474c = null;
                if (this.f10475d != null) {
                    m29216n();
                }
            }
        }
    }

    /* renamed from: i */
    public void m29221i(InterfaceC3718b interfaceC3718b) {
        synchronized (this.f10472a) {
            if (m29224f(interfaceC3718b)) {
                m29218l(this.f10474c);
            }
        }
    }

    /* renamed from: j */
    public void m29220j(InterfaceC3718b interfaceC3718b) {
        synchronized (this.f10472a) {
            if (m29224f(interfaceC3718b)) {
                C3719c c3719c = this.f10474c;
                if (!c3719c.f10479c) {
                    c3719c.f10479c = true;
                    this.f10473b.removeCallbacksAndMessages(c3719c);
                }
            }
        }
    }

    /* renamed from: k */
    public void m29219k(InterfaceC3718b interfaceC3718b) {
        synchronized (this.f10472a) {
            if (m29224f(interfaceC3718b)) {
                C3719c c3719c = this.f10474c;
                if (c3719c.f10479c) {
                    c3719c.f10479c = false;
                    m29218l(c3719c);
                }
            }
        }
    }

    /* renamed from: m */
    public void m29217m(int i, InterfaceC3718b interfaceC3718b) {
        synchronized (this.f10472a) {
            if (m29224f(interfaceC3718b)) {
                C3719c c3719c = this.f10474c;
                c3719c.f10478b = i;
                this.f10473b.removeCallbacksAndMessages(c3719c);
                m29218l(this.f10474c);
                return;
            }
            if (m29223g(interfaceC3718b)) {
                this.f10475d.f10478b = i;
            } else {
                this.f10475d = new C3719c(i, interfaceC3718b);
            }
            C3719c c3719c2 = this.f10474c;
            if (c3719c2 == null || !m29229a(c3719c2, 4)) {
                this.f10474c = null;
                m29216n();
            }
        }
    }
}
