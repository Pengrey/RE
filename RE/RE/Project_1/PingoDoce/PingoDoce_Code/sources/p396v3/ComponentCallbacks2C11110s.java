package p396v3;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p095f3.C5366h;
import p288p3.C8406c;
import p288p3.C8409e;
import p288p3.InterfaceC8407d;
import p468yc.C13195u;

/* renamed from: v3.s */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C11110s implements ComponentCallbacks2, InterfaceC8407d.InterfaceC8408a {

    /* renamed from: A */
    private final AtomicBoolean f28508A;

    /* renamed from: w */
    private final Context f28509w;

    /* renamed from: x */
    private final WeakReference<C5366h> f28510x;

    /* renamed from: y */
    private final InterfaceC8407d f28511y;

    /* renamed from: z */
    private volatile boolean f28512z;

    /* compiled from: SystemCallbacks.kt */
    /* renamed from: v3.s$a */
    /* loaded from: classes.dex */
    public static final class C11111a {
        private C11111a() {
        }

        public /* synthetic */ C11111a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C11111a(null);
    }

    public ComponentCallbacks2C11110s(C5366h c5366h, Context context, boolean z) {
        InterfaceC8407d c8406c;
        this.f28509w = context;
        this.f28510x = new WeakReference<>(c5366h);
        if (z) {
            c8406c = C8409e.m15476a(context, this, c5366h.m24475g());
        } else {
            c8406c = new C8406c();
        }
        this.f28511y = c8406c;
        this.f28512z = c8406c.mo15477b();
        this.f28508A = new AtomicBoolean(false);
    }

    @Override // p288p3.InterfaceC8407d.InterfaceC8408a
    /* renamed from: a */
    public void mo6113a(boolean z) {
        C5366h c5366h = this.f28510x.get();
        C13195u c13195u = null;
        if (c5366h != null) {
            InterfaceC11108q m24475g = c5366h.m24475g();
            if (m24475g != null && m24475g.m6116a() <= 4) {
                m24475g.m6115b("NetworkObserver", 4, z ? "ONLINE" : "OFFLINE", null);
            }
            this.f28512z = z;
            c13195u = C13195u.f34156a;
        }
        if (c13195u == null) {
            m6110d();
        }
    }

    /* renamed from: b */
    public final boolean m6112b() {
        return this.f28512z;
    }

    /* renamed from: c */
    public final void m6111c() {
        this.f28509w.registerComponentCallbacks(this);
    }

    /* renamed from: d */
    public final void m6110d() {
        if (this.f28508A.getAndSet(true)) {
            return;
        }
        this.f28509w.unregisterComponentCallbacks(this);
        this.f28511y.mo15478a();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (this.f28510x.get() == null) {
            m6110d();
            C13195u c13195u = C13195u.f34156a;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        C5366h c5366h = this.f28510x.get();
        C13195u c13195u = null;
        if (c5366h != null) {
            InterfaceC11108q m24475g = c5366h.m24475g();
            if (m24475g != null && m24475g.m6116a() <= 2) {
                m24475g.m6115b("NetworkObserver", 2, "trimMemory, level=" + i, null);
            }
            c5366h.m24471k(i);
            c13195u = C13195u.f34156a;
        }
        if (c13195u == null) {
            m6110d();
        }
    }
}
