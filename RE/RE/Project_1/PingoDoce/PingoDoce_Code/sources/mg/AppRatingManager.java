package mg;

import ai.AbstractC0151j;
import p181jd.Intrinsics;

/* renamed from: mg.c */
/* loaded from: classes2.dex */
public final class AppRatingManager {

    /* renamed from: a */
    private final PrefsManager f19047a;

    public AppRatingManager(PrefsManager prefsManager) {
        Intrinsics.isThisObjectNull(prefsManager, "prefsManager");
        this.f19047a = prefsManager;
    }

    /* renamed from: a */
    public final int m18949a(AbstractC0151j abstractC0151j) {
        Intrinsics.isThisObjectNull(abstractC0151j, "event");
        return this.f19047a.m18519r(abstractC0151j.toString());
    }

    /* renamed from: b */
    public final boolean m18948b() {
        return this.f19047a.m18512y();
    }

    /* renamed from: c */
    public final void m18947c(AbstractC0151j abstractC0151j) {
        Intrinsics.isThisObjectNull(abstractC0151j, "event");
        this.f19047a.m18511z(abstractC0151j.toString());
    }

    /* renamed from: d */
    public final void m18946d() {
        this.f19047a.m18538V();
    }
}
