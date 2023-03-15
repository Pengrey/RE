package ne;

import me.InterfaceC7186c;
import p181jd.Intrinsics;
import p468yc.C13182l;

/* renamed from: ne.d */
/* loaded from: classes2.dex */
public class NavigationWithExtraEvent<T> extends AbstractC7703b {

    /* renamed from: b */
    private InterfaceC7186c f20306b;

    /* renamed from: c */
    private Object f20307c;

    public NavigationWithExtraEvent(InterfaceC7186c interfaceC7186c, Object obj) {
        Intrinsics.isThisObjectNull(interfaceC7186c, "type");
        this.f20306b = interfaceC7186c;
        this.f20307c = obj;
    }

    /* renamed from: c */
    public C13182l mo17670b() {
        return new C13182l(this.f20306b, this.f20307c);
    }
}
