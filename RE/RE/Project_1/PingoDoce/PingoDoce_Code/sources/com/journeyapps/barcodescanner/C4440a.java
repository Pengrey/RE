package com.journeyapps.barcodescanner;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.C4440a;
import java.util.ArrayList;
import java.util.List;
import p138hc.C5903p;
import p138hc.C5905q;
import p138hc.C5907s;
import p138hc.InterfaceC5902o;
import p160ic.AbstractC6095q;
import p160ic.C6079g;
import p160ic.C6086i;
import p160ic.C6088j;
import p160ic.C6090l;
import p160ic.C6091m;
import p160ic.C6092n;
import p160ic.C6093o;
import p201kb.C6635k;
import p201kb.C6639o;

/* renamed from: com.journeyapps.barcodescanner.a */
/* loaded from: classes2.dex */
public class C4440a extends ViewGroup {

    /* renamed from: W */
    private static final String f11992W = C4440a.class.getSimpleName();

    /* renamed from: A */
    private SurfaceView f11993A;

    /* renamed from: B */
    private TextureView f11994B;

    /* renamed from: C */
    private boolean f11995C;

    /* renamed from: D */
    private C5903p f11996D;

    /* renamed from: E */
    private int f11997E;

    /* renamed from: F */
    private List<InterfaceC4446f> f11998F;

    /* renamed from: G */
    private C6091m f11999G;

    /* renamed from: H */
    private C6086i f12000H;

    /* renamed from: I */
    private C5905q f12001I;

    /* renamed from: J */
    private C5905q f12002J;

    /* renamed from: K */
    private Rect f12003K;

    /* renamed from: L */
    private C5905q f12004L;

    /* renamed from: M */
    private Rect f12005M;

    /* renamed from: N */
    private Rect f12006N;

    /* renamed from: O */
    private C5905q f12007O;

    /* renamed from: P */
    private double f12008P;

    /* renamed from: Q */
    private AbstractC6095q f12009Q;

    /* renamed from: R */
    private boolean f12010R;

    /* renamed from: S */
    private final SurfaceHolder.Callback f12011S;

    /* renamed from: T */
    private final Handler.Callback f12012T;

    /* renamed from: U */
    private InterfaceC5902o f12013U;

    /* renamed from: V */
    private final InterfaceC4446f f12014V;

    /* renamed from: w */
    private C6079g f12015w;

    /* renamed from: x */
    private WindowManager f12016x;

    /* renamed from: y */
    private Handler f12017y;

    /* renamed from: z */
    private boolean f12018z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CameraPreview.java */
    /* renamed from: com.journeyapps.barcodescanner.a$a */
    /* loaded from: classes2.dex */
    public class TextureView$SurfaceTextureListenerC4441a implements TextureView.SurfaceTextureListener {
        TextureView$SurfaceTextureListenerC4441a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C4440a.this.f12004L = new C5905q(i, i2);
            C4440a.this.m27569C();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* compiled from: CameraPreview.java */
    /* renamed from: com.journeyapps.barcodescanner.a$b */
    /* loaded from: classes2.dex */
    class SurfaceHolder$CallbackC4442b implements SurfaceHolder.Callback {
        SurfaceHolder$CallbackC4442b() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (surfaceHolder == null) {
                Log.e(C4440a.f11992W, "*** WARNING *** surfaceChanged() gave us a null surface!");
                return;
            }
            C4440a.this.f12004L = new C5905q(i2, i3);
            C4440a.this.m27569C();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C4440a.this.f12004L = null;
        }
    }

    /* compiled from: CameraPreview.java */
    /* renamed from: com.journeyapps.barcodescanner.a$c */
    /* loaded from: classes2.dex */
    class C4443c implements Handler.Callback {
        C4443c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == C6635k.zxing_prewiew_size_ready) {
                C4440a.this.m27545w((C5905q) message.obj);
                return true;
            } else if (i == C6635k.zxing_camera_error) {
                Exception exc = (Exception) message.obj;
                if (C4440a.this.m27550r()) {
                    C4440a.this.mo27547u();
                    C4440a.this.f12014V.mo27505b(exc);
                    return false;
                }
                return false;
            } else if (i == C6635k.zxing_camera_closed) {
                C4440a.this.f12014V.mo27502e();
                return false;
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CameraPreview.java */
    /* renamed from: com.journeyapps.barcodescanner.a$d */
    /* loaded from: classes2.dex */
    public class C4444d implements InterfaceC5902o {
        C4444d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m27540c() {
            C4440a.this.m27542z();
        }

        @Override // p138hc.InterfaceC5902o
        /* renamed from: a */
        public void mo22785a(int i) {
            C4440a.this.f12017y.postDelayed(new Runnable() { // from class: com.journeyapps.barcodescanner.b
                @Override // java.lang.Runnable
                public final void run() {
                    C4440a.C4444d.this.m27540c();
                }
            }, 250L);
        }
    }

    /* compiled from: CameraPreview.java */
    /* renamed from: com.journeyapps.barcodescanner.a$e */
    /* loaded from: classes2.dex */
    class C4445e implements InterfaceC4446f {
        C4445e() {
        }

        @Override // com.journeyapps.barcodescanner.C4440a.InterfaceC4446f
        /* renamed from: a */
        public void mo27506a() {
            for (InterfaceC4446f interfaceC4446f : C4440a.this.f11998F) {
                interfaceC4446f.mo27506a();
            }
        }

        @Override // com.journeyapps.barcodescanner.C4440a.InterfaceC4446f
        /* renamed from: b */
        public void mo27505b(Exception exc) {
            for (InterfaceC4446f interfaceC4446f : C4440a.this.f11998F) {
                interfaceC4446f.mo27505b(exc);
            }
        }

        @Override // com.journeyapps.barcodescanner.C4440a.InterfaceC4446f
        /* renamed from: c */
        public void mo27504c() {
            for (InterfaceC4446f interfaceC4446f : C4440a.this.f11998F) {
                interfaceC4446f.mo27504c();
            }
        }

        @Override // com.journeyapps.barcodescanner.C4440a.InterfaceC4446f
        /* renamed from: d */
        public void mo27503d() {
            for (InterfaceC4446f interfaceC4446f : C4440a.this.f11998F) {
                interfaceC4446f.mo27503d();
            }
        }

        @Override // com.journeyapps.barcodescanner.C4440a.InterfaceC4446f
        /* renamed from: e */
        public void mo27502e() {
            for (InterfaceC4446f interfaceC4446f : C4440a.this.f11998F) {
                interfaceC4446f.mo27502e();
            }
        }
    }

    /* compiled from: CameraPreview.java */
    /* renamed from: com.journeyapps.barcodescanner.a$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC4446f {
        /* renamed from: a */
        void mo27506a();

        /* renamed from: b */
        void mo27505b(Exception exc);

        /* renamed from: c */
        void mo27504c();

        /* renamed from: d */
        void mo27503d();

        /* renamed from: e */
        void mo27502e();
    }

    public C4440a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12018z = false;
        this.f11995C = false;
        this.f11997E = -1;
        this.f11998F = new ArrayList();
        this.f12000H = new C6086i();
        this.f12005M = null;
        this.f12006N = null;
        this.f12007O = null;
        this.f12008P = 0.1d;
        this.f12009Q = null;
        this.f12010R = false;
        this.f12011S = new SurfaceHolder$CallbackC4442b();
        this.f12012T = new C4443c();
        this.f12013U = new C4444d();
        this.f12014V = new C4445e();
        m27552p(context, attributeSet, 0, 0);
    }

    /* renamed from: A */
    private void m27571A() {
        if (this.f12018z) {
            TextureView textureView = new TextureView(getContext());
            this.f11994B = textureView;
            textureView.setSurfaceTextureListener(m27568D());
            addView(this.f11994B);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.f11993A = surfaceView;
        surfaceView.getHolder().addCallback(this.f12011S);
        addView(this.f11993A);
    }

    /* renamed from: B */
    private void m27570B(C6088j c6088j) {
        if (this.f11995C || this.f12015w == null) {
            return;
        }
        Log.i(f11992W, "Starting preview");
        this.f12015w.m22211z(c6088j);
        this.f12015w.m22238B();
        this.f11995C = true;
        mo27544x();
        this.f12014V.mo27504c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m27569C() {
        Rect rect;
        C5905q c5905q = this.f12004L;
        if (c5905q == null || this.f12002J == null || (rect = this.f12003K) == null) {
            return;
        }
        if (this.f11993A != null && c5905q.equals(new C5905q(rect.width(), this.f12003K.height()))) {
            m27570B(new C6088j(this.f11993A.getHolder()));
            return;
        }
        TextureView textureView = this.f11994B;
        if (textureView == null || textureView.getSurfaceTexture() == null) {
            return;
        }
        if (this.f12002J != null) {
            this.f11994B.setTransform(m27556l(new C5905q(this.f11994B.getWidth(), this.f11994B.getHeight()), this.f12002J));
        }
        m27570B(new C6088j(this.f11994B.getSurfaceTexture()));
    }

    @TargetApi(14)
    /* renamed from: D */
    private TextureView.SurfaceTextureListener m27568D() {
        return new TextureView$SurfaceTextureListenerC4441a();
    }

    private int getDisplayRotation() {
        return this.f12016x.getDefaultDisplay().getRotation();
    }

    /* renamed from: j */
    private void m27558j() {
        C5905q c5905q;
        C6091m c6091m;
        C5905q c5905q2 = this.f12001I;
        if (c5905q2 != null && (c5905q = this.f12002J) != null && (c6091m = this.f11999G) != null) {
            int i = c5905q.f16352w;
            int i2 = c5905q.f16353x;
            int i3 = c5905q2.f16352w;
            int i4 = c5905q2.f16353x;
            Rect m22167d = c6091m.m22167d(c5905q);
            if (m22167d.width() <= 0 || m22167d.height() <= 0) {
                return;
            }
            this.f12003K = m22167d;
            this.f12005M = m27557k(new Rect(0, 0, i3, i4), this.f12003K);
            Rect rect = new Rect(this.f12005M);
            Rect rect2 = this.f12003K;
            rect.offset(-rect2.left, -rect2.top);
            Rect rect3 = new Rect((rect.left * i) / this.f12003K.width(), (rect.top * i2) / this.f12003K.height(), (rect.right * i) / this.f12003K.width(), (rect.bottom * i2) / this.f12003K.height());
            this.f12006N = rect3;
            if (rect3.width() > 0 && this.f12006N.height() > 0) {
                this.f12014V.mo27506a();
                return;
            }
            this.f12006N = null;
            this.f12005M = null;
            Log.w(f11992W, "Preview frame is too small");
            return;
        }
        this.f12006N = null;
        this.f12005M = null;
        this.f12003K = null;
        throw new IllegalStateException("containerSize or previewSize is not set yet");
    }

    /* renamed from: m */
    private void m27555m(C5905q c5905q) {
        this.f12001I = c5905q;
        C6079g c6079g = this.f12015w;
        if (c6079g == null || c6079g.m22223n() != null) {
            return;
        }
        C6091m c6091m = new C6091m(getDisplayRotation(), c5905q);
        this.f11999G = c6091m;
        c6091m.m22166e(getPreviewScalingStrategy());
        this.f12015w.m22213x(this.f11999G);
        this.f12015w.m22224m();
        boolean z = this.f12010R;
        if (z) {
            this.f12015w.m22239A(z);
        }
    }

    /* renamed from: o */
    private void m27553o() {
        if (this.f12015w != null) {
            Log.w(f11992W, "initCamera called twice");
            return;
        }
        C6079g m27554n = m27554n();
        this.f12015w = m27554n;
        m27554n.m22212y(this.f12017y);
        this.f12015w.m22216u();
        this.f11997E = getDisplayRotation();
    }

    /* renamed from: p */
    private void m27552p(Context context, AttributeSet attributeSet, int i, int i2) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        m27551q(attributeSet);
        this.f12016x = (WindowManager) context.getSystemService("window");
        this.f12017y = new Handler(this.f12012T);
        this.f11996D = new C5903p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m27545w(C5905q c5905q) {
        this.f12002J = c5905q;
        if (this.f12001I != null) {
            m27558j();
            requestLayout();
            m27569C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public void m27542z() {
        if (!m27550r() || getDisplayRotation() == this.f11997E) {
            return;
        }
        mo27547u();
        m27543y();
    }

    public C6079g getCameraInstance() {
        return this.f12015w;
    }

    public C6086i getCameraSettings() {
        return this.f12000H;
    }

    public Rect getFramingRect() {
        return this.f12005M;
    }

    public C5905q getFramingRectSize() {
        return this.f12007O;
    }

    public double getMarginFraction() {
        return this.f12008P;
    }

    public Rect getPreviewFramingRect() {
        return this.f12006N;
    }

    public AbstractC6095q getPreviewScalingStrategy() {
        AbstractC6095q abstractC6095q = this.f12009Q;
        if (abstractC6095q != null) {
            return abstractC6095q;
        }
        if (this.f11994B != null) {
            return new C6090l();
        }
        return new C6092n();
    }

    public C5905q getPreviewSize() {
        return this.f12002J;
    }

    /* renamed from: i */
    public void m27559i(InterfaceC4446f interfaceC4446f) {
        this.f11998F.add(interfaceC4446f);
    }

    /* renamed from: k */
    protected Rect m27557k(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.f12007O != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.f12007O.f16352w) / 2), Math.max(0, (rect3.height() - this.f12007O.f16353x) / 2));
            return rect3;
        }
        int min = (int) Math.min(rect3.width() * this.f12008P, rect3.height() * this.f12008P);
        rect3.inset(min, min);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    /* renamed from: l */
    protected Matrix m27556l(C5905q c5905q, C5905q c5905q2) {
        float f;
        float f2 = c5905q.f16352w / c5905q.f16353x;
        float f3 = c5905q2.f16352w / c5905q2.f16353x;
        float f4 = 1.0f;
        if (f2 < f3) {
            float f5 = f3 / f2;
            f = 1.0f;
            f4 = f5;
        } else {
            f = f2 / f3;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f4, f);
        int i = c5905q.f16352w;
        int i2 = c5905q.f16353x;
        matrix.postTranslate((i - (i * f4)) / 2.0f, (i2 - (i2 * f)) / 2.0f);
        return matrix;
    }

    /* renamed from: n */
    protected C6079g m27554n() {
        C6079g c6079g = new C6079g(getContext());
        c6079g.m22214w(this.f12000H);
        return c6079g;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m27571A();
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"DrawAllocation"})
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m27555m(new C5905q(i3 - i, i4 - i2));
        SurfaceView surfaceView = this.f11993A;
        if (surfaceView != null) {
            Rect rect = this.f12003K;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
                return;
            } else {
                surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
                return;
            }
        }
        TextureView textureView = this.f11994B;
        if (textureView != null) {
            textureView.layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.f12010R);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public void m27551q(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C6639o.f17908a);
        int dimension = (int) obtainStyledAttributes.getDimension(C6639o.f17910c, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(C6639o.f17909b, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f12007O = new C5905q(dimension, dimension2);
        }
        this.f12018z = obtainStyledAttributes.getBoolean(C6639o.f17912e, true);
        int integer = obtainStyledAttributes.getInteger(C6639o.f17911d, -1);
        if (integer == 1) {
            this.f12009Q = new C6090l();
        } else if (integer == 2) {
            this.f12009Q = new C6092n();
        } else if (integer == 3) {
            this.f12009Q = new C6093o();
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: r */
    protected boolean m27550r() {
        return this.f12015w != null;
    }

    /* renamed from: s */
    public boolean m27549s() {
        C6079g c6079g = this.f12015w;
        return c6079g == null || c6079g.m22221p();
    }

    public void setCameraSettings(C6086i c6086i) {
        this.f12000H = c6086i;
    }

    public void setFramingRectSize(C5905q c5905q) {
        this.f12007O = c5905q;
    }

    public void setMarginFraction(double d) {
        if (d < 0.5d) {
            this.f12008P = d;
            return;
        }
        throw new IllegalArgumentException("The margin fraction must be less than 0.5");
    }

    public void setPreviewScalingStrategy(AbstractC6095q abstractC6095q) {
        this.f12009Q = abstractC6095q;
    }

    public void setTorch(boolean z) {
        this.f12010R = z;
        C6079g c6079g = this.f12015w;
        if (c6079g != null) {
            c6079g.m22239A(z);
        }
    }

    public void setUseTextureView(boolean z) {
        this.f12018z = z;
    }

    /* renamed from: t */
    public boolean m27548t() {
        return this.f11995C;
    }

    /* renamed from: u */
    public void mo27547u() {
        TextureView textureView;
        SurfaceView surfaceView;
        C5907s.m22768a();
        Log.d(f11992W, "pause()");
        this.f11997E = -1;
        C6079g c6079g = this.f12015w;
        if (c6079g != null) {
            c6079g.m22225l();
            this.f12015w = null;
            this.f11995C = false;
        } else {
            this.f12017y.sendEmptyMessage(C6635k.zxing_camera_closed);
        }
        if (this.f12004L == null && (surfaceView = this.f11993A) != null) {
            surfaceView.getHolder().removeCallback(this.f12011S);
        }
        if (this.f12004L == null && (textureView = this.f11994B) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.f12001I = null;
        this.f12002J = null;
        this.f12006N = null;
        this.f11996D.m22779f();
        this.f12014V.mo27503d();
    }

    /* renamed from: v */
    public void m27546v() {
        C6079g cameraInstance = getCameraInstance();
        mo27547u();
        long nanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.m22221p() && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public void mo27544x() {
    }

    /* renamed from: y */
    public void m27543y() {
        C5907s.m22768a();
        Log.d(f11992W, "resume()");
        m27553o();
        if (this.f12004L != null) {
            m27569C();
        } else {
            SurfaceView surfaceView = this.f11993A;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f12011S);
            } else {
                TextureView textureView = this.f11994B;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        m27568D().onSurfaceTextureAvailable(this.f11994B.getSurfaceTexture(), this.f11994B.getWidth(), this.f11994B.getHeight());
                    } else {
                        this.f11994B.setSurfaceTextureListener(m27568D());
                    }
                }
            }
        }
        requestLayout();
        this.f11996D.m22780e(getContext(), this.f12013U);
    }
}
