package p307q5;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: q5.f */
/* loaded from: classes.dex */
public final class ResultLauncherRuntimePermissionHandlerProvider implements InterfaceC9666h {

    /* renamed from: a */
    private final FragmentManager f25497a;

    /* compiled from: ResultLauncherRuntimePermissionHandlerProvider.kt */
    /* renamed from: q5.f$a */
    /* loaded from: classes.dex */
    public static final class C9663a {
        private C9663a() {
        }

        public /* synthetic */ C9663a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C9663a(null);
    }

    public ResultLauncherRuntimePermissionHandlerProvider(FragmentManager fragmentManager) {
        Intrinsics.isThisObjectNull(fragmentManager, "manager");
        this.f25497a = fragmentManager;
    }

    /* renamed from: a */
    public InterfaceC9664g mo10233a() {
        Fragment m37455j0 = this.f25497a.m37455j0("KPermissionsFragment");
        if (!(m37455j0 instanceof InterfaceC9664g)) {
            m37455j0 = null;
        }
        InterfaceC9664g interfaceC9664g = (InterfaceC9664g) m37455j0;
        if (interfaceC9664g == null) {
            ResultLauncherRuntimePermissionHandler resultLauncherRuntimePermissionHandler = new ResultLauncherRuntimePermissionHandler();
            this.f25497a.m37447m().m37186d(resultLauncherRuntimePermissionHandler, "KPermissionsFragment").mo37183g();
            return resultLauncherRuntimePermissionHandler;
        }
        return interfaceC9664g;
    }
}
