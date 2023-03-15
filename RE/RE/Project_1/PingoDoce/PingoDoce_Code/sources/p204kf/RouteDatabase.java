package p204kf;

import java.util.LinkedHashSet;
import java.util.Set;
import p107ff.Route;
import p181jd.Intrinsics;

/* renamed from: kf.b */
/* loaded from: classes2.dex */
public final class RouteDatabase {

    /* renamed from: a */
    private final Set f17954a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void m20368a(Route route) {
        Intrinsics.isThisObjectNull(route, "route");
        this.f17954a.remove(route);
    }

    /* renamed from: b */
    public final synchronized void m20367b(Route route) {
        Intrinsics.isThisObjectNull(route, "failedRoute");
        this.f17954a.add(route);
    }

    /* renamed from: c */
    public final synchronized boolean m20366c(Route route) {
        Intrinsics.isThisObjectNull(route, "route");
        return this.f17954a.contains(route);
    }
}
