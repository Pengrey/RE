package p138hc;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.google.zxing.AbstractC4403h;
import com.google.zxing.C4409m;
import p160ic.C6079g;
import p160ic.InterfaceC6094p;
import p201kb.C6635k;

/* renamed from: hc.j */
/* loaded from: classes2.dex */
public class C5895j {

    /* renamed from: k */
    private static final String f16326k = "j";

    /* renamed from: a */
    private C6079g f16327a;

    /* renamed from: b */
    private HandlerThread f16328b;

    /* renamed from: c */
    private Handler f16329c;

    /* renamed from: d */
    private C5892g f16330d;

    /* renamed from: e */
    private Handler f16331e;

    /* renamed from: f */
    private Rect f16332f;

    /* renamed from: g */
    private boolean f16333g = false;

    /* renamed from: h */
    private final Object f16334h = new Object();

    /* renamed from: i */
    private final Handler.Callback f16335i = new C5896a();

    /* renamed from: j */
    private final InterfaceC6094p f16336j = new C5897b();

    /* compiled from: DecoderThread.java */
    /* renamed from: hc.j$a */
    /* loaded from: classes2.dex */
    class C5896a implements Handler.Callback {
        C5896a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == C6635k.zxing_decode) {
                C5895j.this.m22801g((C5906r) message.obj);
                return true;
            } else if (i == C6635k.zxing_preview_failed) {
                C5895j.this.m22800h();
                return true;
            } else {
                return true;
            }
        }
    }

    /* compiled from: DecoderThread.java */
    /* renamed from: hc.j$b */
    /* loaded from: classes2.dex */
    class C5897b implements InterfaceC6094p {
        C5897b() {
        }

        @Override // p160ic.InterfaceC6094p
        /* renamed from: a */
        public void mo22164a(C5906r c5906r) {
            synchronized (C5895j.this.f16334h) {
                if (C5895j.this.f16333g) {
                    C5895j.this.f16329c.obtainMessage(C6635k.zxing_decode, c5906r).sendToTarget();
                }
            }
        }

        @Override // p160ic.InterfaceC6094p
        /* renamed from: b */
        public void mo22163b(Exception exc) {
            synchronized (C5895j.this.f16334h) {
                if (C5895j.this.f16333g) {
                    C5895j.this.f16329c.obtainMessage(C6635k.zxing_preview_failed).sendToTarget();
                }
            }
        }
    }

    public C5895j(C6079g c6079g, C5892g c5892g, Handler handler) {
        C5907s.m22768a();
        this.f16327a = c6079g;
        this.f16330d = c5892g;
        this.f16331e = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m22801g(C5906r c5906r) {
        long currentTimeMillis = System.currentTimeMillis();
        c5906r.m22771d(this.f16332f);
        AbstractC4403h m22802f = m22802f(c5906r);
        C4409m m22811c = m22802f != null ? this.f16330d.m22811c(m22802f) : null;
        if (m22811c != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            String str = f16326k;
            Log.d(str, "Found barcode in " + (currentTimeMillis2 - currentTimeMillis) + " ms");
            if (this.f16331e != null) {
                Message obtain = Message.obtain(this.f16331e, C6635k.zxing_decode_succeeded, new C5888c(m22811c, c5906r));
                obtain.setData(new Bundle());
                obtain.sendToTarget();
            }
        } else {
            Handler handler = this.f16331e;
            if (handler != null) {
                Message.obtain(handler, C6635k.zxing_decode_failed).sendToTarget();
            }
        }
        if (this.f16331e != null) {
            Message.obtain(this.f16331e, C6635k.zxing_possible_result_points, C5888c.m22813e(this.f16330d.m22810d(), c5906r)).sendToTarget();
        }
        m22800h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m22800h() {
        this.f16327a.m22215v(this.f16336j);
    }

    /* renamed from: f */
    protected AbstractC4403h m22802f(C5906r c5906r) {
        if (this.f16332f == null) {
            return null;
        }
        return c5906r.m22774a();
    }

    /* renamed from: i */
    public void m22799i(Rect rect) {
        this.f16332f = rect;
    }

    /* renamed from: j */
    public void m22798j(C5892g c5892g) {
        this.f16330d = c5892g;
    }

    /* renamed from: k */
    public void m22797k() {
        C5907s.m22768a();
        HandlerThread handlerThread = new HandlerThread(f16326k);
        this.f16328b = handlerThread;
        handlerThread.start();
        this.f16329c = new Handler(this.f16328b.getLooper(), this.f16335i);
        this.f16333g = true;
        m22800h();
    }

    /* renamed from: l */
    public void m22796l() {
        C5907s.m22768a();
        synchronized (this.f16334h) {
            this.f16333g = false;
            this.f16329c.removeCallbacksAndMessages(null);
            this.f16328b.quit();
        }
    }
}
