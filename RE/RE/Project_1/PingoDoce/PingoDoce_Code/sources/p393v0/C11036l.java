package p393v0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import p181jd.Intrinsics;

/* compiled from: AndroidPathMeasure.android.kt */
/* renamed from: v0.l */
/* loaded from: classes.dex */
public final class C11036l implements InterfaceC11063t0 {

    /* renamed from: a */
    private final PathMeasure f28395a;

    public C11036l(PathMeasure pathMeasure) {
        Intrinsics.isThisObjectNull(pathMeasure, "internalPathMeasure");
        this.f28395a = pathMeasure;
    }

    /* renamed from: a */
    public boolean mo6279a(float f, float f2, InterfaceC11052q0 interfaceC11052q0, boolean z) {
        Intrinsics.isThisObjectNull(interfaceC11052q0, "destination");
        PathMeasure pathMeasure = this.f28395a;
        if (interfaceC11052q0 instanceof C11033j) {
            return pathMeasure.getSegment(f, f2, ((C11033j) interfaceC11052q0).m6440q(), z);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: b */
    public float mo6278b() {
        return this.f28395a.getLength();
    }

    /* renamed from: c */
    public void mo6277c(InterfaceC11052q0 interfaceC11052q0, boolean z) {
        Path m6440q;
        PathMeasure pathMeasure = this.f28395a;
        if (interfaceC11052q0 == null) {
            m6440q = null;
        } else if (interfaceC11052q0 instanceof C11033j) {
            m6440q = ((C11033j) interfaceC11052q0).m6440q();
        } else {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        pathMeasure.setPath(m6440q, z);
    }
}
