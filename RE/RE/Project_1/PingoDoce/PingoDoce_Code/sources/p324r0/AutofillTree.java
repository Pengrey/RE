package p324r0;

import id.InterfaceC6108l;
import java.util.LinkedHashMap;
import java.util.Map;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* renamed from: r0.i */
/* loaded from: classes.dex */
public final class AutofillTree {

    /* renamed from: a */
    private final Map f25728a = new LinkedHashMap();

    /* renamed from: a */
    public final Map m9949a() {
        return this.f25728a;
    }

    /* renamed from: b */
    public final C13195u m9948b(int i, String str) {
        InterfaceC6108l m9950c;
        Intrinsics.isThisObjectNull(str, "value");
        C9788h c9788h = (C9788h) this.f25728a.get(Integer.valueOf(i));
        if (c9788h == null || (m9950c = c9788h.m9950c()) == null) {
            return null;
        }
        m9950c.mo9587d(str);
        return C13195u.f34156a;
    }
}
