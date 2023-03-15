package p238m9;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p219l9.C7011f;

/* renamed from: m9.c */
/* loaded from: classes.dex */
public class C7148c implements InterfaceC7147b, InterfaceC7146a {

    /* renamed from: a */
    private final C7150e f18956a;

    /* renamed from: b */
    private final int f18957b;

    /* renamed from: c */
    private final TimeUnit f18958c;

    /* renamed from: d */
    private final Object f18959d = new Object();

    /* renamed from: e */
    private CountDownLatch f18960e;

    public C7148c(C7150e c7150e, int i, TimeUnit timeUnit) {
        this.f18956a = c7150e;
        this.f18957b = i;
        this.f18958c = timeUnit;
    }

    @Override // p238m9.InterfaceC7147b
    /* renamed from: E */
    public void mo19087E(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f18960e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // p238m9.InterfaceC7146a
    /* renamed from: a */
    public void mo19085a(String str, Bundle bundle) {
        synchronized (this.f18959d) {
            C7011f m19611f = C7011f.m19611f();
            m19611f.m19608i("Logging event " + str + " to Firebase Analytics with params " + bundle);
            this.f18960e = new CountDownLatch(1);
            this.f18956a.mo19085a(str, bundle);
            C7011f.m19611f().m19608i("Awaiting app exception callback from Analytics...");
            try {
                if (this.f18960e.await(this.f18957b, this.f18958c)) {
                    C7011f.m19611f().m19608i("App exception callback received from Analytics listener.");
                } else {
                    C7011f.m19611f().m19606k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                C7011f.m19611f().m19613d("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.f18960e = null;
        }
    }
}
