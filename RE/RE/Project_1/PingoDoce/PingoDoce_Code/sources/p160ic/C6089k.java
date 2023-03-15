package p160ic;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ic.k */
/* loaded from: classes2.dex */
public class C6089k {

    /* renamed from: e */
    private static C6089k f16787e;

    /* renamed from: a */
    private Handler f16788a;

    /* renamed from: b */
    private HandlerThread f16789b;

    /* renamed from: c */
    private int f16790c = 0;

    /* renamed from: d */
    private final Object f16791d = new Object();

    private C6089k() {
    }

    /* renamed from: a */
    private void m22176a() {
        synchronized (this.f16791d) {
            if (this.f16788a == null) {
                if (this.f16790c > 0) {
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.f16789b = handlerThread;
                    handlerThread.start();
                    this.f16788a = new Handler(this.f16789b.getLooper());
                } else {
                    throw new IllegalStateException("CameraThread is not open");
                }
            }
        }
    }

    /* renamed from: d */
    public static C6089k m22173d() {
        if (f16787e == null) {
            f16787e = new C6089k();
        }
        return f16787e;
    }

    /* renamed from: f */
    private void m22171f() {
        synchronized (this.f16791d) {
            this.f16789b.quit();
            this.f16789b = null;
            this.f16788a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m22175b() {
        synchronized (this.f16791d) {
            int i = this.f16790c - 1;
            this.f16790c = i;
            if (i == 0) {
                m22171f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m22174c(Runnable runnable) {
        synchronized (this.f16791d) {
            m22176a();
            this.f16788a.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void m22172e(Runnable runnable) {
        synchronized (this.f16791d) {
            this.f16790c++;
            m22174c(runnable);
        }
    }
}
