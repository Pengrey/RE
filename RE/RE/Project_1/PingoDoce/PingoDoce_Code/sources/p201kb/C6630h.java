package p201kb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import p201kb.C6630h;

/* renamed from: kb.h */
/* loaded from: classes2.dex */
public final class C6630h {

    /* renamed from: a */
    private final Context f17899a;

    /* renamed from: e */
    private Runnable f17903e;

    /* renamed from: f */
    private boolean f17904f;

    /* renamed from: c */
    private boolean f17901c = false;

    /* renamed from: b */
    private final BroadcastReceiver f17900b = new C6632b();

    /* renamed from: d */
    private Handler f17902d = new Handler();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: InactivityTimer.java */
    /* renamed from: kb.h$b */
    /* loaded from: classes2.dex */
    public final class C6632b extends BroadcastReceiver {
        private C6632b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m20418b(boolean z) {
            C6630h.this.m20423f(z);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                final boolean z = intent.getIntExtra("plugged", -1) <= 0;
                C6630h.this.f17902d.post(new Runnable() { // from class: kb.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6630h.C6632b.this.m20418b(z);
                    }
                });
            }
        }
    }

    public C6630h(Context context, Runnable runnable) {
        this.f17899a = context;
        this.f17903e = runnable;
    }

    /* renamed from: e */
    private void m20424e() {
        this.f17902d.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m20423f(boolean z) {
        this.f17904f = z;
        if (this.f17901c) {
            m20426c();
        }
    }

    /* renamed from: g */
    private void m20422g() {
        if (this.f17901c) {
            return;
        }
        this.f17899a.registerReceiver(this.f17900b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f17901c = true;
    }

    /* renamed from: i */
    private void m20420i() {
        if (this.f17901c) {
            this.f17899a.unregisterReceiver(this.f17900b);
            this.f17901c = false;
        }
    }

    /* renamed from: c */
    public void m20426c() {
        m20424e();
        if (this.f17904f) {
            this.f17902d.postDelayed(this.f17903e, 300000L);
        }
    }

    /* renamed from: d */
    public void m20425d() {
        m20424e();
        m20420i();
    }

    /* renamed from: h */
    public void m20421h() {
        m20422g();
        m20426c();
    }
}
