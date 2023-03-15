package p071e0;

import java.util.LinkedHashMap;
import java.util.Map;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RippleContainer.android.kt */
/* renamed from: e0.j */
/* loaded from: classes.dex */
public final class C4924j {

    /* renamed from: a */
    private final Map f13691a = new LinkedHashMap();

    /* renamed from: b */
    private final Map f13692b = new LinkedHashMap();

    /* renamed from: a */
    public final C4907a m26272a(C4926l c4926l) {
        Intrinsics.isThisObjectNull(c4926l, "rippleHostView");
        return (C4907a) this.f13692b.get(c4926l);
    }

    /* renamed from: b */
    public final C4926l m26271b(C4907a c4907a) {
        Intrinsics.isThisObjectNull(c4907a, "indicationInstance");
        return (C4926l) this.f13691a.get(c4907a);
    }

    /* renamed from: c */
    public final void m26270c(C4907a c4907a) {
        Intrinsics.isThisObjectNull(c4907a, "indicationInstance");
        C4926l c4926l = (C4926l) this.f13691a.get(c4907a);
        if (c4926l != null) {
            C4907a c4907a2 = (C4907a) this.f13692b.remove(c4926l);
        }
        this.f13691a.remove(c4907a);
    }

    /* renamed from: d */
    public final void m26269d(C4907a c4907a, C4926l c4926l) {
        Intrinsics.isThisObjectNull(c4907a, "indicationInstance");
        Intrinsics.isThisObjectNull(c4926l, "rippleHostView");
        this.f13691a.put(c4907a, c4926l);
        this.f13692b.put(c4926l, c4907a);
    }
}
