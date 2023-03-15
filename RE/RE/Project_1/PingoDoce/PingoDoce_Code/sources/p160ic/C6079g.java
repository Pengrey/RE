package p160ic;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import p138hc.C5905q;
import p138hc.C5907s;
import p201kb.C6635k;

/* renamed from: ic.g */
/* loaded from: classes2.dex */
public class C6079g {

    /* renamed from: n */
    private static final String f16742n = "g";

    /* renamed from: a */
    private C6089k f16743a;

    /* renamed from: b */
    private C6088j f16744b;

    /* renamed from: c */
    private C6084h f16745c;

    /* renamed from: d */
    private Handler f16746d;

    /* renamed from: e */
    private C6091m f16747e;

    /* renamed from: h */
    private Handler f16750h;

    /* renamed from: f */
    private boolean f16748f = false;

    /* renamed from: g */
    private boolean f16749g = true;

    /* renamed from: i */
    private C6086i f16751i = new C6086i();

    /* renamed from: j */
    private Runnable f16752j = new RunnableC6080a();

    /* renamed from: k */
    private Runnable f16753k = new RunnableC6081b();

    /* renamed from: l */
    private Runnable f16754l = new RunnableC6082c();

    /* renamed from: m */
    private Runnable f16755m = new RunnableC6083d();

    /* compiled from: CameraInstance.java */
    /* renamed from: ic.g$a */
    /* loaded from: classes2.dex */
    class RunnableC6080a implements Runnable {
        RunnableC6080a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(C6079g.f16742n, "Opening camera");
                C6079g.this.f16745c.m22199l();
            } catch (Exception e) {
                C6079g.this.m22217t(e);
                Log.e(C6079g.f16742n, "Failed to open camera", e);
            }
        }
    }

    /* compiled from: CameraInstance.java */
    /* renamed from: ic.g$b */
    /* loaded from: classes2.dex */
    class RunnableC6081b implements Runnable {
        RunnableC6081b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(C6079g.f16742n, "Configuring camera");
                C6079g.this.f16745c.m22206e();
                if (C6079g.this.f16746d != null) {
                    C6079g.this.f16746d.obtainMessage(C6635k.zxing_prewiew_size_ready, C6079g.this.m22222o()).sendToTarget();
                }
            } catch (Exception e) {
                C6079g.this.m22217t(e);
                Log.e(C6079g.f16742n, "Failed to configure camera", e);
            }
        }
    }

    /* compiled from: CameraInstance.java */
    /* renamed from: ic.g$c */
    /* loaded from: classes2.dex */
    class RunnableC6082c implements Runnable {
        RunnableC6082c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(C6079g.f16742n, "Starting preview");
                C6079g.this.f16745c.m22192s(C6079g.this.f16744b);
                C6079g.this.f16745c.m22190u();
            } catch (Exception e) {
                C6079g.this.m22217t(e);
                Log.e(C6079g.f16742n, "Failed to start preview", e);
            }
        }
    }

    /* compiled from: CameraInstance.java */
    /* renamed from: ic.g$d */
    /* loaded from: classes2.dex */
    class RunnableC6083d implements Runnable {
        RunnableC6083d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(C6079g.f16742n, "Closing camera");
                C6079g.this.f16745c.m22189v();
                C6079g.this.f16745c.m22207d();
            } catch (Exception e) {
                Log.e(C6079g.f16742n, "Failed to close camera", e);
            }
            C6079g.this.f16749g = true;
            C6079g.this.f16746d.sendEmptyMessage(C6635k.zxing_camera_closed);
            C6079g.this.f16743a.m22175b();
        }
    }

    public C6079g(Context context) {
        C5907s.m22768a();
        this.f16743a = C6089k.m22173d();
        C6084h c6084h = new C6084h(context);
        this.f16745c = c6084h;
        c6084h.m22196o(this.f16751i);
        this.f16750h = new Handler();
    }

    /* renamed from: C */
    private void m22237C() {
        if (!this.f16748f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public C5905q m22222o() {
        return this.f16745c.m22203h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m22220q(InterfaceC6094p interfaceC6094p) {
        this.f16745c.m22198m(interfaceC6094p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m22219r(final InterfaceC6094p interfaceC6094p) {
        if (!this.f16748f) {
            Log.d(f16742n, "Camera is closed, not requesting preview");
        } else {
            this.f16743a.m22174c(new Runnable() { // from class: ic.d
                @Override // java.lang.Runnable
                public final void run() {
                    C6079g.this.m22220q(interfaceC6094p);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m22218s(boolean z) {
        this.f16745c.m22191t(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public void m22217t(Exception exc) {
        Handler handler = this.f16746d;
        if (handler != null) {
            handler.obtainMessage(C6635k.zxing_camera_error, exc).sendToTarget();
        }
    }

    /* renamed from: A */
    public void m22239A(final boolean z) {
        C5907s.m22768a();
        if (this.f16748f) {
            this.f16743a.m22174c(new Runnable() { // from class: ic.f
                @Override // java.lang.Runnable
                public final void run() {
                    C6079g.this.m22218s(z);
                }
            });
        }
    }

    /* renamed from: B */
    public void m22238B() {
        C5907s.m22768a();
        m22237C();
        this.f16743a.m22174c(this.f16754l);
    }

    /* renamed from: l */
    public void m22225l() {
        C5907s.m22768a();
        if (this.f16748f) {
            this.f16743a.m22174c(this.f16755m);
        } else {
            this.f16749g = true;
        }
        this.f16748f = false;
    }

    /* renamed from: m */
    public void m22224m() {
        C5907s.m22768a();
        m22237C();
        this.f16743a.m22174c(this.f16753k);
    }

    /* renamed from: n */
    public C6091m m22223n() {
        return this.f16747e;
    }

    /* renamed from: p */
    public boolean m22221p() {
        return this.f16749g;
    }

    /* renamed from: u */
    public void m22216u() {
        C5907s.m22768a();
        this.f16748f = true;
        this.f16749g = false;
        this.f16743a.m22172e(this.f16752j);
    }

    /* renamed from: v */
    public void m22215v(final InterfaceC6094p interfaceC6094p) {
        this.f16750h.post(new Runnable() { // from class: ic.e
            @Override // java.lang.Runnable
            public final void run() {
                C6079g.this.m22219r(interfaceC6094p);
            }
        });
    }

    /* renamed from: w */
    public void m22214w(C6086i c6086i) {
        if (this.f16748f) {
            return;
        }
        this.f16751i = c6086i;
        this.f16745c.m22196o(c6086i);
    }

    /* renamed from: x */
    public void m22213x(C6091m c6091m) {
        this.f16747e = c6091m;
        this.f16745c.m22194q(c6091m);
    }

    /* renamed from: y */
    public void m22212y(Handler handler) {
        this.f16746d = handler;
    }

    /* renamed from: z */
    public void m22211z(C6088j c6088j) {
        this.f16744b = c6088j;
    }
}
