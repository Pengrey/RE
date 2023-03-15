package ne;

import androidx.lifecycle.InterfaceC1440f0;
import id.InterfaceC6108l;
import p181jd.Intrinsics;

/* renamed from: ne.c */
/* loaded from: classes2.dex */
public final class EventObserver<T> implements InterfaceC1440f0 {

    /* renamed from: a */
    private final InterfaceC6108l f20305a;

    public EventObserver(InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "onEventUnhandledContent");
        this.f20305a = interfaceC6108l;
    }

    /* renamed from: a */
    public void mo37325a(AbstractC7703b abstractC7703b) {
        Object m17671a;
        if (abstractC7703b == null || (m17671a = abstractC7703b.m17671a()) == null) {
            return;
        }
        this.f20305a.mo9587d(m17671a);
    }
}
