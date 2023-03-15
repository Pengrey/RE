package p307q5;

import android.app.Activity;
import java.util.List;
import p181jd.Intrinsics;
import p265o5.BasePermissionRequest;
import p265o5.InterfaceC8020b;
import p307q5.InterfaceC9664g;

/* renamed from: q5.i */
/* loaded from: classes.dex */
public final class RuntimePermissionRequest extends BasePermissionRequest implements InterfaceC9664g.InterfaceC9665a {

    /* renamed from: b */
    private final String[] f25498b;

    /* renamed from: c */
    private final InterfaceC9664g f25499c;

    public RuntimePermissionRequest(Activity activity, String[] strArr, InterfaceC9664g interfaceC9664g) {
        Intrinsics.isThisObjectNull(activity, "activity");
        Intrinsics.isThisObjectNull(strArr, "permissions");
        Intrinsics.isThisObjectNull(interfaceC9664g, "handler");
        this.f25498b = strArr;
        this.f25499c = interfaceC9664g;
        interfaceC9664g.mo10235o(strArr, this);
    }

    /* renamed from: a */
    public void mo10234a(List list) {
        Intrinsics.isThisObjectNull(list, "result");
        for (InterfaceC8020b.InterfaceC8021a interfaceC8021a : m17143e()) {
            interfaceC8021a.mo17139a(list);
        }
    }

    /* renamed from: c */
    public void mo17141c() {
        this.f25499c.mo10236k(this.f25498b);
    }
}
