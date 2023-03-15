package p432x;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p092f0.InterfaceC5269z0;
import p127h1.C5784k0;
import p181jd.Intrinsics;
import p432x.C12222l;
import p468yc.C13195u;

/* compiled from: LazyLayoutPrefetcher.android.kt */
/* renamed from: x.n */
/* loaded from: classes.dex */
public final class RunnableC12225n implements InterfaceC5269z0, InterfaceC12221i, C12222l.InterfaceC12223a, Runnable, Choreographer.FrameCallback {

    /* renamed from: J */
    public static final C12226a f32243J = new C12226a(null);

    /* renamed from: K */
    private static long f32244K;

    /* renamed from: A */
    private final View f32245A;

    /* renamed from: B */
    private int f32246B;

    /* renamed from: C */
    private C5784k0.InterfaceC5786b f32247C;

    /* renamed from: D */
    private long f32248D;

    /* renamed from: E */
    private long f32249E;

    /* renamed from: F */
    private boolean f32250F;

    /* renamed from: G */
    private boolean f32251G;

    /* renamed from: H */
    private final Choreographer f32252H;

    /* renamed from: I */
    private boolean f32253I;

    /* renamed from: w */
    private final C12222l f32254w;

    /* renamed from: x */
    private final LazyLayoutState f32255x;

    /* renamed from: y */
    private final C5784k0 f32256y;

    /* renamed from: z */
    private final LazyLayoutItemContentFactory f32257z;

    /* compiled from: LazyLayoutPrefetcher.android.kt */
    /* renamed from: x.n$a */
    /* loaded from: classes.dex */
    public static final class C12226a {
        private C12226a() {
        }

        public /* synthetic */ C12226a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static final /* synthetic */ void m3345a(C12226a c12226a, View view) {
            c12226a.m3344b(view);
        }

        /* renamed from: b */
        private final void m3344b(View view) {
            if (RunnableC12225n.m3349g() == 0) {
                Display display = view.getDisplay();
                float f = 60.0f;
                if (!view.isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                RunnableC12225n.m3348h(1000000000 / f);
            }
        }
    }

    public RunnableC12225n(C12222l c12222l, LazyLayoutState lazyLayoutState, C5784k0 c5784k0, LazyLayoutItemContentFactory lazyLayoutItemContentFactory, View view) {
        Intrinsics.isThisObjectNull(c12222l, "prefetchPolicy");
        Intrinsics.isThisObjectNull(lazyLayoutState, "state");
        Intrinsics.isThisObjectNull(c5784k0, "subcomposeLayoutState");
        Intrinsics.isThisObjectNull(lazyLayoutItemContentFactory, "itemContentFactory");
        Intrinsics.isThisObjectNull(view, "view");
        this.f32254w = c12222l;
        this.f32255x = lazyLayoutState;
        this.f32256y = c5784k0;
        this.f32257z = lazyLayoutItemContentFactory;
        this.f32245A = view;
        this.f32246B = -1;
        this.f32252H = Choreographer.getInstance();
        C12226a.m3345a(f32243J, view);
    }

    /* renamed from: g */
    public static final /* synthetic */ long m3349g() {
        return f32244K;
    }

    /* renamed from: h */
    public static final /* synthetic */ void m3348h(long j) {
        f32244K = j;
    }

    /* renamed from: i */
    private final long m3347i(long j, long j2) {
        if (j2 == 0) {
            return j;
        }
        long j3 = 4;
        return (j / j3) + ((j2 / j3) * 3);
    }

    /* renamed from: j */
    private final C5784k0.InterfaceC5786b m3346j(InterfaceC12217f interfaceC12217f, int i) {
        Object key = interfaceC12217f.getKey(i);
        return this.f32256y.m23086D(key, this.f32257z.m3385d(i, key));
    }

    /* renamed from: a */
    public void mo24845a() {
        this.f32254w.m3359e(this);
        this.f32255x.m3332i(this);
        this.f32253I = true;
    }

    /* renamed from: b */
    public void mo24844b() {
    }

    /* renamed from: c */
    public void mo3358c(int i) {
        if (i == this.f32246B) {
            C5784k0.InterfaceC5786b interfaceC5786b = this.f32247C;
            if (interfaceC5786b != null) {
                interfaceC5786b.m23045b();
            }
            this.f32246B = -1;
        }
    }

    /* renamed from: d */
    public void mo3367d(InterfaceC12220h interfaceC12220h, LazyMeasurePolicy lazyMeasurePolicy) {
        boolean z;
        Intrinsics.isThisObjectNull(interfaceC12220h, "result");
        Intrinsics.isThisObjectNull(lazyMeasurePolicy, "placeablesProvider");
        int i = this.f32246B;
        if (!this.f32250F || i == -1) {
            return;
        }
        if (this.f32253I) {
            if (i < ((InterfaceC12217f) this.f32255x.m3339b().mo42214q()).mo3321c()) {
                List<InterfaceC12216e> mo3368c = interfaceC12220h.mo3368c();
                int size = mo3368c.size();
                int i2 = 0;
                while (true) {
                    z = true;
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    int i3 = i2 + 1;
                    if (mo3368c.get(i2).getIndex() == i) {
                        break;
                    }
                    i2 = i3;
                }
                if (z) {
                    this.f32250F = false;
                    return;
                } else {
                    lazyMeasurePolicy.m3364a(i, this.f32254w.m3363a());
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public void doFrame(long j) {
        if (this.f32253I) {
            this.f32245A.post(this);
        }
    }

    /* renamed from: e */
    public void mo24843e() {
        this.f32253I = false;
        this.f32254w.m3359e(null);
        this.f32255x.m3332i(null);
        this.f32245A.removeCallbacks(this);
        this.f32252H.removeFrameCallback(this);
    }

    /* renamed from: f */
    public void mo3357f(int i) {
        this.f32246B = i;
        this.f32247C = null;
        this.f32250F = false;
        if (this.f32251G) {
            return;
        }
        this.f32251G = true;
        this.f32245A.post(this);
    }

    public void run() {
        if (this.f32246B != -1 && this.f32251G && this.f32253I) {
            boolean z = true;
            if (this.f32247C == null) {
                Trace.beginSection("compose:lazylist:prefetch:compose");
                try {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(this.f32245A.getDrawingTime()) + f32244K;
                    long nanoTime = System.nanoTime();
                    if (nanoTime <= nanos && this.f32248D + nanoTime >= nanos) {
                        this.f32252H.postFrameCallback(this);
                        C13195u c13195u = C13195u.f34156a;
                        return;
                    }
                    int i = this.f32246B;
                    InterfaceC12217f interfaceC12217f = (InterfaceC12217f) this.f32255x.m3339b().mo42214q();
                    if (this.f32245A.getWindowVisibility() == 0) {
                        if (i < 0 || i >= interfaceC12217f.mo3321c()) {
                            z = false;
                        }
                        if (z) {
                            this.f32247C = m3346j(interfaceC12217f, i);
                            this.f32248D = m3347i(System.nanoTime() - nanoTime, this.f32248D);
                            this.f32252H.postFrameCallback(this);
                            C13195u c13195u2 = C13195u.f34156a;
                            return;
                        }
                    }
                    this.f32251G = false;
                    C13195u c13195u22 = C13195u.f34156a;
                    return;
                } finally {
                }
            }
            Trace.beginSection("compose:lazylist:prefetch:measure");
            try {
                long nanos2 = TimeUnit.MILLISECONDS.toNanos(this.f32245A.getDrawingTime()) + f32244K;
                long nanoTime2 = System.nanoTime();
                if (nanoTime2 <= nanos2 && this.f32249E + nanoTime2 >= nanos2) {
                    this.f32252H.postFrameCallback(this);
                    C13195u c13195u3 = C13195u.f34156a;
                }
                if (this.f32245A.getWindowVisibility() == 0) {
                    this.f32250F = true;
                    this.f32255x.m3335f();
                    this.f32249E = m3347i(System.nanoTime() - nanoTime2, this.f32249E);
                }
                this.f32251G = false;
                C13195u c13195u32 = C13195u.f34156a;
            } finally {
            }
        }
    }
}
