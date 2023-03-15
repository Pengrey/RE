package p036c0;

import androidx.compose.p018ui.platform.ViewConfiguration;
import p093f1.C5306m;
import p093f1.C5318u;
import p181jd.Intrinsics;
import p373u0.C10774f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c0.a */
/* loaded from: classes.dex */
public final class TextSelectionMouseDetector {

    /* renamed from: a */
    private final ViewConfiguration f5772a;

    /* renamed from: b */
    private int f5773b;

    /* renamed from: c */
    private C5318u f5774c;

    public TextSelectionMouseDetector(ViewConfiguration viewConfiguration) {
        Intrinsics.isThisObjectNull(viewConfiguration, "viewConfiguration");
        this.f5772a = viewConfiguration;
    }

    /* renamed from: a */
    public final int m35025a() {
        return this.f5773b;
    }

    /* renamed from: b */
    public final boolean m35024b(C5318u c5318u, C5318u c5318u2) {
        Intrinsics.isThisObjectNull(c5318u, "prevClick");
        Intrinsics.isThisObjectNull(c5318u2, "newClick");
        return ((double) C10774f.m7146j(C10774f.m7141o(c5318u2.m24651h(), c5318u.m24651h()))) < 100.0d;
    }

    /* renamed from: c */
    public final boolean m35023c(C5318u c5318u, C5318u c5318u2) {
        Intrinsics.isThisObjectNull(c5318u, "prevClick");
        Intrinsics.isThisObjectNull(c5318u2, "newClick");
        return c5318u2.m24645n() - c5318u.m24645n() < this.f5772a.m39644a();
    }

    /* renamed from: d */
    public final void m35022d(C5306m c5306m) {
        Intrinsics.isThisObjectNull(c5306m, "event");
        C5318u c5318u = this.f5774c;
        C5318u c5318u2 = (C5318u) c5306m.m24707b().get(0);
        if (c5318u != null && m35023c(c5318u, c5318u2) && m35024b(c5318u, c5318u2)) {
            this.f5773b++;
        } else {
            this.f5773b = 1;
        }
        this.f5774c = c5318u2;
    }
}
