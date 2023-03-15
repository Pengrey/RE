package p265o5;

import java.util.LinkedHashSet;
import java.util.Set;
import p181jd.Intrinsics;
import p265o5.InterfaceC8020b;

/* renamed from: o5.a */
/* loaded from: classes.dex */
public abstract class BasePermissionRequest implements InterfaceC8020b {

    /* renamed from: a */
    private final Set f20755a = new LinkedHashSet();

    /* renamed from: b */
    public void mo17142b(InterfaceC8020b.InterfaceC8021a interfaceC8021a) {
        Intrinsics.isThisObjectNull(interfaceC8021a, "listener");
        this.f20755a.remove(interfaceC8021a);
    }

    /* renamed from: d */
    public void mo17140d(InterfaceC8020b.InterfaceC8021a interfaceC8021a) {
        Intrinsics.isThisObjectNull(interfaceC8021a, "listener");
        this.f20755a.add(interfaceC8021a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final Set m17143e() {
        return this.f20755a;
    }
}
