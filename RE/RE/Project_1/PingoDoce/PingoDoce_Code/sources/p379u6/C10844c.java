package p379u6;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC2475c;
import com.google.android.gms.common.api.internal.InterfaceC2532p;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p413w2.AbstractC11549a;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: u6.c */
/* loaded from: classes.dex */
public final class C10844c extends AbstractC11549a<Void> implements InterfaceC2532p {

    /* renamed from: o */
    private final Semaphore f28036o;

    /* renamed from: p */
    private final Set<AbstractC2475c> f28037p;

    public C10844c(Context context, Set<AbstractC2475c> set) {
        super(context);
        this.f28036o = new Semaphore(0);
        this.f28037p = set;
    }

    @Override // p413w2.AbstractC11549a
    /* renamed from: A */
    public final /* bridge */ /* synthetic */ Void mo4748A() {
        int i = 0;
        for (AbstractC2475c abstractC2475c : this.f28037p) {
            if (abstractC2475c.m33477d(this)) {
                i++;
            }
        }
        try {
            this.f28036o.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // p413w2.C11551b
    /* renamed from: o */
    protected final void mo4726o() {
        this.f28036o.drainPermits();
        m4733h();
    }
}
