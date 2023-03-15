package p215l5;

import android.app.Activity;
import android.os.Build;
import p181jd.Intrinsics;
import p265o5.InterfaceC8020b;
import p290p5.ManifestPermissionRequest;
import p307q5.InterfaceC9666h;
import p307q5.RuntimePermissionRequest;

/* renamed from: l5.b */
/* loaded from: classes.dex */
public final class CompatPermissionRequestBuilder extends BasePermissionRequestBuilder {

    /* renamed from: c */
    private final Activity f18601c;

    public CompatPermissionRequestBuilder(Activity activity) {
        Intrinsics.isThisObjectNull(activity, "activity");
        this.f18601c = activity;
    }

    /* renamed from: b */
    protected InterfaceC8020b m19656b(String[] strArr, InterfaceC9666h interfaceC9666h) {
        Intrinsics.isThisObjectNull(strArr, "permissions");
        Intrinsics.isThisObjectNull(interfaceC9666h, "runtimeHandlerProvider");
        if (Build.VERSION.SDK_INT >= 23) {
            return new RuntimePermissionRequest(this.f18601c, strArr, interfaceC9666h.mo10233a());
        }
        return new ManifestPermissionRequest(this.f18601c, strArr);
    }
}
