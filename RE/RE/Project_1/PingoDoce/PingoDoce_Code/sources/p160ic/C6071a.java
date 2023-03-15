package p160ic;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import p160ic.C6071a;

/* renamed from: ic.a */
/* loaded from: classes2.dex */
public final class C6071a {

    /* renamed from: i */
    private static final String f16723i = "a";

    /* renamed from: j */
    private static final Collection<String> f16724j;

    /* renamed from: a */
    private boolean f16725a;

    /* renamed from: b */
    private boolean f16726b;

    /* renamed from: c */
    private final boolean f16727c;

    /* renamed from: d */
    private final Camera f16728d;

    /* renamed from: e */
    private Handler f16729e;

    /* renamed from: f */
    private int f16730f = 1;

    /* renamed from: g */
    private final Handler.Callback f16731g;

    /* renamed from: h */
    private final Camera.AutoFocusCallback f16732h;

    /* compiled from: AutoFocusManager.java */
    /* renamed from: ic.a$a */
    /* loaded from: classes2.dex */
    class C6072a implements Handler.Callback {
        C6072a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == C6071a.this.f16730f) {
                C6071a.this.m22258h();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoFocusManager.java */
    /* renamed from: ic.a$b */
    /* loaded from: classes2.dex */
    public class C6073b implements Camera.AutoFocusCallback {
        C6073b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m22254b() {
            C6071a.this.f16726b = false;
            C6071a.this.m22260f();
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z, Camera camera) {
            C6071a.this.f16729e.post(new Runnable() { // from class: ic.b
                @Override // java.lang.Runnable
                public final void run() {
                    C6071a.C6073b.this.m22254b();
                }
            });
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f16724j = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public C6071a(Camera camera, C6086i c6086i) {
        boolean z = true;
        C6072a c6072a = new C6072a();
        this.f16731g = c6072a;
        this.f16732h = new C6073b();
        this.f16729e = new Handler(c6072a);
        this.f16728d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        z = (c6086i.m22184c() && f16724j.contains(focusMode)) ? false : false;
        this.f16727c = z;
        String str = f16723i;
        Log.i(str, "Current focus mode '" + focusMode + "'; use auto focus? " + z);
        m22257i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public synchronized void m22260f() {
        if (!this.f16725a && !this.f16729e.hasMessages(this.f16730f)) {
            Handler handler = this.f16729e;
            handler.sendMessageDelayed(handler.obtainMessage(this.f16730f), 2000L);
        }
    }

    /* renamed from: g */
    private void m22259g() {
        this.f16729e.removeMessages(this.f16730f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m22258h() {
        if (!this.f16727c || this.f16725a || this.f16726b) {
            return;
        }
        try {
            this.f16728d.autoFocus(this.f16732h);
            this.f16726b = true;
        } catch (RuntimeException e) {
            Log.w(f16723i, "Unexpected exception while focusing", e);
            m22260f();
        }
    }

    /* renamed from: i */
    public void m22257i() {
        this.f16725a = false;
        m22258h();
    }

    /* renamed from: j */
    public void m22256j() {
        this.f16725a = true;
        this.f16726b = false;
        m22259g();
        if (this.f16727c) {
            try {
                this.f16728d.cancelAutoFocus();
            } catch (RuntimeException e) {
                Log.w(f16723i, "Unexpected exception while cancelling focusing", e);
            }
        }
    }
}
