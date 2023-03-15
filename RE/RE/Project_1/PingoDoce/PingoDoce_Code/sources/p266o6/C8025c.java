package p266o6;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* renamed from: o6.c */
/* loaded from: classes.dex */
final class C8025c extends Thread {

    /* renamed from: w */
    private final WeakReference<C8022a> f20766w;

    /* renamed from: x */
    private final long f20767x;

    /* renamed from: y */
    final CountDownLatch f20768y = new CountDownLatch(1);

    /* renamed from: z */
    boolean f20769z = false;

    public C8025c(C8022a c8022a, long j) {
        this.f20766w = new WeakReference<>(c8022a);
        this.f20767x = j;
        start();
    }

    /* renamed from: a */
    private final void m17129a() {
        C8022a c8022a = this.f20766w.get();
        if (c8022a != null) {
            c8022a.m17136c();
            this.f20769z = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f20768y.await(this.f20767x, TimeUnit.MILLISECONDS)) {
                return;
            }
            m17129a();
        } catch (InterruptedException unused) {
            m17129a();
        }
    }
}
