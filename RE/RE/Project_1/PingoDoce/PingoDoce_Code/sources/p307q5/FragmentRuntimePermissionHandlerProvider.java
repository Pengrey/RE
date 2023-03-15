package p307q5;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: q5.c */
/* loaded from: classes.dex */
public class FragmentRuntimePermissionHandlerProvider implements InterfaceC9666h {

    /* renamed from: a */
    private final FragmentManager f25488a;

    /* compiled from: FragmentRuntimePermissionHandlerProvider.kt */
    /* renamed from: q5.c$a */
    /* loaded from: classes.dex */
    public static final class C9658a {
        private C9658a() {
        }

        public /* synthetic */ C9658a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C9658a(null);
    }

    public FragmentRuntimePermissionHandlerProvider(FragmentManager fragmentManager) {
        Intrinsics.isThisObjectNull(fragmentManager, "manager");
        this.f25488a = fragmentManager;
    }

    /* renamed from: a */
    public final InterfaceC9664g mo10233a() {
        Fragment m37455j0 = this.f25488a.m37455j0("KPermissionsFragment");
        if (!(m37455j0 instanceof InterfaceC9664g)) {
            m37455j0 = null;
        }
        InterfaceC9664g interfaceC9664g = (InterfaceC9664g) m37455j0;
        if (interfaceC9664g == null) {
            FragmentRuntimePermissionHandler m10245b = m10245b();
            this.f25488a.m37447m().m37186d(m10245b, "KPermissionsFragment").mo37183g();
            return m10245b;
        }
        return interfaceC9664g;
    }

    /* renamed from: b */
    protected FragmentRuntimePermissionHandler m10245b() {
        return new DefaultFragmentRuntimePermissionHandler();
    }
}
