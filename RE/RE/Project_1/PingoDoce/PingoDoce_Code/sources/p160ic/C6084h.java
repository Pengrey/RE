package p160ic;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import lb.C7027a;
import p138hc.C5905q;
import p138hc.C5906r;
import p201kb.C6624b;

/* renamed from: ic.h */
/* loaded from: classes2.dex */
public final class C6084h {

    /* renamed from: n */
    private static final String f16760n = "h";

    /* renamed from: a */
    private Camera f16761a;

    /* renamed from: b */
    private Camera.CameraInfo f16762b;

    /* renamed from: c */
    private C6071a f16763c;

    /* renamed from: d */
    private C6624b f16764d;

    /* renamed from: e */
    private boolean f16765e;

    /* renamed from: f */
    private String f16766f;

    /* renamed from: h */
    private C6091m f16768h;

    /* renamed from: i */
    private C5905q f16769i;

    /* renamed from: j */
    private C5905q f16770j;

    /* renamed from: l */
    private Context f16772l;

    /* renamed from: g */
    private C6086i f16767g = new C6086i();

    /* renamed from: k */
    private int f16771k = -1;

    /* renamed from: m */
    private final C6085a f16773m = new C6085a();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CameraManager.java */
    /* renamed from: ic.h$a */
    /* loaded from: classes2.dex */
    public final class C6085a implements Camera.PreviewCallback {

        /* renamed from: a */
        private InterfaceC6094p f16774a;

        /* renamed from: b */
        private C5905q f16775b;

        public C6085a() {
        }

        /* renamed from: a */
        public void m22188a(InterfaceC6094p interfaceC6094p) {
            this.f16774a = interfaceC6094p;
        }

        /* renamed from: b */
        public void m22187b(C5905q c5905q) {
            this.f16775b = c5905q;
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            C5905q c5905q = this.f16775b;
            InterfaceC6094p interfaceC6094p = this.f16774a;
            if (c5905q == null || interfaceC6094p == null) {
                Log.d(C6084h.f16760n, "Got preview callback, but no handler or resolution available");
                if (interfaceC6094p != null) {
                    interfaceC6094p.mo22163b(new Exception("No resolution available"));
                    return;
                }
                return;
            }
            try {
                if (bArr != null) {
                    C5906r c5906r = new C5906r(bArr, c5905q.f16352w, c5905q.f16353x, camera.getParameters().getPreviewFormat(), C6084h.this.m22205f());
                    if (C6084h.this.f16762b.facing == 1) {
                        c5906r.m22770e(true);
                    }
                    interfaceC6094p.mo22164a(c5906r);
                    return;
                }
                throw new NullPointerException("No preview data received");
            } catch (RuntimeException e) {
                Log.e(C6084h.f16760n, "Camera preview failed", e);
                interfaceC6094p.mo22163b(e);
            }
        }
    }

    public C6084h(Context context) {
        this.f16772l = context;
    }

    /* renamed from: c */
    private int m22208c() {
        int i;
        int m22168c = this.f16768h.m22168c();
        int i2 = 0;
        if (m22168c != 0) {
            if (m22168c == 1) {
                i2 = 90;
            } else if (m22168c == 2) {
                i2 = 180;
            } else if (m22168c == 3) {
                i2 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f16762b;
        if (cameraInfo.facing == 1) {
            i = (360 - ((cameraInfo.orientation + i2) % 360)) % 360;
        } else {
            i = ((cameraInfo.orientation - i2) + 360) % 360;
        }
        String str = f16760n;
        Log.i(str, "Camera Display Orientation: " + i);
        return i;
    }

    /* renamed from: g */
    private Camera.Parameters m22204g() {
        Camera.Parameters parameters = this.f16761a.getParameters();
        String str = this.f16766f;
        if (str == null) {
            this.f16766f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        return parameters;
    }

    /* renamed from: i */
    private static List<C5905q> m22202i(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                new C5905q(previewSize.width, previewSize.height);
                arrayList.add(new C5905q(previewSize.width, previewSize.height));
            }
            return arrayList;
        }
        for (Camera.Size size : supportedPreviewSizes) {
            arrayList.add(new C5905q(size.width, size.height));
        }
        return arrayList;
    }

    /* renamed from: n */
    private void m22197n(int i) {
        this.f16761a.setDisplayOrientation(i);
    }

    /* renamed from: p */
    private void m22195p(boolean z) {
        Camera.Parameters m22204g = m22204g();
        if (m22204g == null) {
            Log.w(f16760n, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        String str = f16760n;
        Log.i(str, "Initial camera parameters: " + m22204g.flatten());
        if (z) {
            Log.w(str, "In camera config safe mode -- most settings will not be honored");
        }
        C6075c.m22247g(m22204g, this.f16767g.m22186a(), z);
        if (!z) {
            C6075c.m22243k(m22204g, false);
            if (this.f16767g.m22179h()) {
                C6075c.m22245i(m22204g);
            }
            if (this.f16767g.m22182e()) {
                C6075c.m22251c(m22204g);
            }
            if (this.f16767g.m22180g() && Build.VERSION.SDK_INT >= 15) {
                C6075c.m22242l(m22204g);
                C6075c.m22246h(m22204g);
                C6075c.m22244j(m22204g);
            }
        }
        List<C5905q> m22202i = m22202i(m22204g);
        if (m22202i.size() == 0) {
            this.f16769i = null;
        } else {
            C5905q m22170a = this.f16768h.m22170a(m22202i, m22201j());
            this.f16769i = m22170a;
            m22204g.setPreviewSize(m22170a.f16352w, m22170a.f16353x);
        }
        if (Build.DEVICE.equals("glass-1")) {
            C6075c.m22249e(m22204g);
        }
        Log.i(str, "Final camera parameters: " + m22204g.flatten());
        this.f16761a.setParameters(m22204g);
    }

    /* renamed from: r */
    private void m22193r() {
        try {
            int m22208c = m22208c();
            this.f16771k = m22208c;
            m22197n(m22208c);
        } catch (Exception unused) {
            Log.w(f16760n, "Failed to set rotation.");
        }
        try {
            m22195p(false);
        } catch (Exception unused2) {
            try {
                m22195p(true);
            } catch (Exception unused3) {
                Log.w(f16760n, "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.f16761a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.f16770j = this.f16769i;
        } else {
            this.f16770j = new C5905q(previewSize.width, previewSize.height);
        }
        this.f16773m.m22187b(this.f16770j);
    }

    /* renamed from: d */
    public void m22207d() {
        Camera camera = this.f16761a;
        if (camera != null) {
            camera.release();
            this.f16761a = null;
        }
    }

    /* renamed from: e */
    public void m22206e() {
        if (this.f16761a != null) {
            m22193r();
            return;
        }
        throw new RuntimeException("Camera not open");
    }

    /* renamed from: f */
    public int m22205f() {
        return this.f16771k;
    }

    /* renamed from: h */
    public C5905q m22203h() {
        if (this.f16770j == null) {
            return null;
        }
        if (m22201j()) {
            return this.f16770j.m22777c();
        }
        return this.f16770j;
    }

    /* renamed from: j */
    public boolean m22201j() {
        int i = this.f16771k;
        if (i != -1) {
            return i % 180 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    /* renamed from: k */
    public boolean m22200k() {
        String flashMode;
        Camera.Parameters parameters = this.f16761a.getParameters();
        if (parameters == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    /* renamed from: l */
    public void m22199l() {
        Camera m19552b = C7027a.m19552b(this.f16767g.m22185b());
        this.f16761a = m19552b;
        if (m19552b != null) {
            int m19553a = C7027a.m19553a(this.f16767g.m22185b());
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            this.f16762b = cameraInfo;
            Camera.getCameraInfo(m19553a, cameraInfo);
            return;
        }
        throw new RuntimeException("Failed to open camera");
    }

    /* renamed from: m */
    public void m22198m(InterfaceC6094p interfaceC6094p) {
        Camera camera = this.f16761a;
        if (camera == null || !this.f16765e) {
            return;
        }
        this.f16773m.m22188a(interfaceC6094p);
        camera.setOneShotPreviewCallback(this.f16773m);
    }

    /* renamed from: o */
    public void m22196o(C6086i c6086i) {
        this.f16767g = c6086i;
    }

    /* renamed from: q */
    public void m22194q(C6091m c6091m) {
        this.f16768h = c6091m;
    }

    /* renamed from: s */
    public void m22192s(C6088j c6088j) throws IOException {
        c6088j.m22177a(this.f16761a);
    }

    /* renamed from: t */
    public void m22191t(boolean z) {
        if (this.f16761a != null) {
            try {
                if (z != m22200k()) {
                    C6071a c6071a = this.f16763c;
                    if (c6071a != null) {
                        c6071a.m22256j();
                    }
                    Camera.Parameters parameters = this.f16761a.getParameters();
                    C6075c.m22243k(parameters, z);
                    if (this.f16767g.m22181f()) {
                        C6075c.m22250d(parameters, z);
                    }
                    this.f16761a.setParameters(parameters);
                    C6071a c6071a2 = this.f16763c;
                    if (c6071a2 != null) {
                        c6071a2.m22257i();
                    }
                }
            } catch (RuntimeException e) {
                Log.e(f16760n, "Failed to set torch", e);
            }
        }
    }

    /* renamed from: u */
    public void m22190u() {
        Camera camera = this.f16761a;
        if (camera == null || this.f16765e) {
            return;
        }
        camera.startPreview();
        this.f16765e = true;
        this.f16763c = new C6071a(this.f16761a, this.f16767g);
        C6624b c6624b = new C6624b(this.f16772l, this, this.f16767g);
        this.f16764d = c6624b;
        c6624b.m20440d();
    }

    /* renamed from: v */
    public void m22189v() {
        C6071a c6071a = this.f16763c;
        if (c6071a != null) {
            c6071a.m22256j();
            this.f16763c = null;
        }
        C6624b c6624b = this.f16764d;
        if (c6624b != null) {
            c6624b.m20439e();
            this.f16764d = null;
        }
        Camera camera = this.f16761a;
        if (camera == null || !this.f16765e) {
            return;
        }
        camera.stopPreview();
        this.f16773m.m22188a(null);
        this.f16765e = false;
    }
}
