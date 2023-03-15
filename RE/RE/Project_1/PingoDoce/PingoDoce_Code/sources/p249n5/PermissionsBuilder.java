package p249n5;

import androidx.fragment.app.ActivityC1354d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Arrays;
import p181jd.Intrinsics;
import p195k5.C6600c;
import p215l5.CompatPermissionRequestBuilder;
import p215l5.InterfaceC6983c;
import p307q5.FragmentRuntimePermissionHandlerProvider;
import p307q5.InterfaceC9666h;
import p307q5.ResultLauncherRuntimePermissionHandlerProvider;

/* renamed from: n5.c */
/* loaded from: classes.dex */
public final class PermissionsBuilder {
    /* renamed from: a */
    public static final InterfaceC6983c m17729a(Fragment fragment, String str, String... strArr) {
        Intrinsics.isThisObjectNull(fragment, "$this$permissionsBuilder");
        Intrinsics.isThisObjectNull(str, "firstPermission");
        Intrinsics.isThisObjectNull(strArr, "otherPermissions");
        ActivityC1354d m37652G1 = fragment.m37652G1();
        Intrinsics.checkIfNull(m37652G1, "requireActivity()");
        return m17728b(m37652G1, str, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: b */
    public static final InterfaceC6983c m17728b(ActivityC1354d activityC1354d, String str, String... strArr) {
        InterfaceC9666h resultLauncherRuntimePermissionHandlerProvider;
        Intrinsics.isThisObjectNull(activityC1354d, "$this$permissionsBuilder");
        Intrinsics.isThisObjectNull(str, "firstPermission");
        Intrinsics.isThisObjectNull(strArr, "otherPermissions");
        if (C6600c.m20510a()) {
            FragmentManager m37323P = activityC1354d.m37323P();
            Intrinsics.checkIfNull(m37323P, "supportFragmentManager");
            resultLauncherRuntimePermissionHandlerProvider = new FragmentRuntimePermissionHandlerProvider(m37323P);
        } else {
            FragmentManager m37323P2 = activityC1354d.m37323P();
            Intrinsics.checkIfNull(m37323P2, "supportFragmentManager");
            resultLauncherRuntimePermissionHandlerProvider = new ResultLauncherRuntimePermissionHandlerProvider(m37323P2);
        }
        return new CompatPermissionRequestBuilder(activityC1354d).m19657c(str, (String[]) Arrays.copyOf(strArr, strArr.length)).mo19655a(resultLauncherRuntimePermissionHandlerProvider);
    }
}
