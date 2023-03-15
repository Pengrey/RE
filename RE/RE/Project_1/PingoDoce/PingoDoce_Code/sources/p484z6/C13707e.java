package p484z6;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: z6.e */
/* loaded from: classes.dex */
public final class C13707e {

    /* renamed from: b */
    private static C13707e f34821b;

    /* renamed from: c */
    private static final RootTelemetryConfiguration f34822c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* renamed from: a */
    private RootTelemetryConfiguration f34823a;

    private C13707e() {
    }

    /* renamed from: b */
    public static synchronized C13707e m565b() {
        C13707e c13707e;
        synchronized (C13707e.class) {
            if (f34821b == null) {
                f34821b = new C13707e();
            }
            c13707e = f34821b;
        }
        return c13707e;
    }

    /* renamed from: a */
    public RootTelemetryConfiguration m566a() {
        return this.f34823a;
    }

    /* renamed from: c */
    public final synchronized void m564c(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f34823a = f34822c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f34823a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.m33192D() < rootTelemetryConfiguration.m33192D()) {
            this.f34823a = rootTelemetryConfiguration;
        }
    }
}
