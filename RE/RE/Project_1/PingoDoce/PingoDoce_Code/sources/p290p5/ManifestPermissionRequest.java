package p290p5;

import android.content.Context;
import java.util.List;
import p181jd.Intrinsics;
import p195k5.PermissionStatus;
import p249n5.CheckPermissionsStatus;
import p265o5.BasePermissionRequest;
import p265o5.InterfaceC8020b;
import p489zc._Arrays;

/* renamed from: p5.a */
/* loaded from: classes.dex */
public final class ManifestPermissionRequest extends BasePermissionRequest {

    /* renamed from: b */
    private final Context f21830b;

    /* renamed from: c */
    private final String[] f21831c;

    public ManifestPermissionRequest(Context context, String[] strArr) {
        Intrinsics.isThisObjectNull(context, "context");
        Intrinsics.isThisObjectNull(strArr, "permissions");
        this.f21830b = context;
        this.f21831c = strArr;
    }

    /* renamed from: c */
    public void mo17141c() {
        List<? extends PermissionStatus> m15406f = m15406f();
        for (InterfaceC8020b.InterfaceC8021a interfaceC8021a : m17143e()) {
            interfaceC8021a.mo17139a(m15406f);
        }
    }

    /* renamed from: f */
    public List m15406f() {
        List m276R;
        Context context = this.f21830b;
        m276R = _Arrays.m276R(this.f21831c);
        return CheckPermissionsStatus.m17732a(context, m276R);
    }
}
