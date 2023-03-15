package p045c9;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p031b9.C1844a;
import p060d9.C4754a;

/* renamed from: c9.c */
/* loaded from: classes.dex */
public abstract class AbstractC2098c<StateT> {

    /* renamed from: a */
    protected final C1844a f6080a;

    /* renamed from: b */
    private final IntentFilter f6081b;

    /* renamed from: c */
    private final Context f6082c;

    /* renamed from: d */
    protected final Set<InterfaceC2096a<StateT>> f6083d = new HashSet();

    /* renamed from: e */
    private C2097b f6084e = null;

    /* renamed from: f */
    private volatile boolean f6085f = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2098c(C1844a c1844a, IntentFilter intentFilter, Context context) {
        this.f6080a = c1844a;
        this.f6081b = intentFilter;
        this.f6082c = C4754a.m26695a(context);
    }

    /* renamed from: e */
    private final void m34690e() {
        C2097b c2097b;
        if ((this.f6085f || !this.f6083d.isEmpty()) && this.f6084e == null) {
            C2097b c2097b2 = new C2097b(this);
            this.f6084e = c2097b2;
            this.f6082c.registerReceiver(c2097b2, this.f6081b);
        }
        if (this.f6085f || !this.f6083d.isEmpty() || (c2097b = this.f6084e) == null) {
            return;
        }
        this.f6082c.unregisterReceiver(c2097b);
        this.f6084e = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28641a(Context context, Intent intent);

    /* renamed from: b */
    public final synchronized void m34693b(StateT statet) {
        Iterator it = new HashSet(this.f6083d).iterator();
        while (it.hasNext()) {
            ((InterfaceC2096a) it.next()).m34694a(statet);
        }
    }

    /* renamed from: c */
    public final synchronized void m34692c(boolean z) {
        this.f6085f = z;
        m34690e();
    }

    /* renamed from: d */
    public final synchronized boolean m34691d() {
        return this.f6084e != null;
    }
}
