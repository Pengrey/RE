package androidx.lifecycle;

import p181jd.Intrinsics;
import td.C10549n2;
import td.C10587w0;

/* compiled from: Lifecycle.kt */
/* renamed from: androidx.lifecycle.t */
/* loaded from: classes.dex */
public final class C1487t {
    /* renamed from: a */
    public static final AbstractC1474q m36971a(AbstractC1469p abstractC1469p) {
        Lifecycle lifecycle;
        Intrinsics.isThisObjectNull(abstractC1469p, "$this$coroutineScope");
        do {
            Lifecycle lifecycle2 = (Lifecycle) abstractC1469p.f4347a.get();
            if (lifecycle2 != null) {
                return lifecycle2;
            }
            lifecycle = new Lifecycle(abstractC1469p, C10549n2.m7695b(null, 1, null).mo4545f0(C10587w0.m7619c().mo7830H0()));
        } while (!abstractC1469p.f4347a.compareAndSet(null, lifecycle));
        lifecycle.m37084j();
        return lifecycle;
    }
}
