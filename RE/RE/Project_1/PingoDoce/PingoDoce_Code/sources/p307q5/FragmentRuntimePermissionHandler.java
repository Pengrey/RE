package p307q5;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p307q5.InterfaceC9664g;
import p489zc._Arrays;

@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m20207d2 = {"Lq5/b;", "Landroidx/fragment/app/Fragment;", "Lq5/g;", "<init>", "()V", "a", "kpermissions_release"}, m20206k = 1, m20205mv = {1, 4, 2})
/* renamed from: q5.b */
/* loaded from: classes.dex */
public abstract class FragmentRuntimePermissionHandler extends Fragment implements InterfaceC9664g {

    /* renamed from: x0 */
    private static final String f25485x0;

    /* renamed from: y0 */
    public static final C9657a f25486y0 = new C9657a(null);

    /* renamed from: w0 */
    private final Map f25487w0 = new LinkedHashMap();

    /* compiled from: FragmentRuntimePermissionHandler.kt */
    /* renamed from: q5.b$a */
    /* loaded from: classes.dex */
    public static final class C9657a {
        private C9657a() {
        }

        /* renamed from: a */
        public final String m10246a() {
            return FragmentRuntimePermissionHandler.m10250g2();
        }

        public /* synthetic */ C9657a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String simpleName = FragmentRuntimePermissionHandler.class.getSimpleName();
        Intrinsics.checkIfNull(simpleName, "FragmentRuntimePermissio…er::class.java.simpleName");
        f25485x0 = simpleName;
    }

    /* renamed from: g2 */
    public static final /* synthetic */ String m10250g2() {
        return f25485x0;
    }

    /* renamed from: D0 */
    public void mo29886D0(Bundle bundle) {
        super.mo29886D0(bundle);
        m37602Z1(true);
    }

    /* renamed from: X0 */
    public final void mo37607X0(int i, String[] strArr, int[] iArr) {
        Intrinsics.isThisObjectNull(strArr, "permissions");
        Intrinsics.isThisObjectNull(iArr, "grantResults");
        super.mo37607X0(i, strArr, iArr);
        if (i == 986) {
            if (strArr.length == 0) {
                return;
            }
            m10248i2(strArr, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h2 */
    public final InterfaceC9664g.InterfaceC9665a m10249h2(String[] strArr) {
        Set m273U;
        Intrinsics.isThisObjectNull(strArr, "permissions");
        Map map = this.f25487w0;
        m273U = _Arrays.m273U(strArr);
        return (InterfaceC9664g.InterfaceC9665a) map.get(m273U);
    }

    /* renamed from: i2 */
    protected abstract void m10248i2(String[] strArr, int[] iArr);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j2 */
    public final void m10247j2(String[] strArr) {
        Intrinsics.isThisObjectNull(strArr, "permissions");
        m37655F1(strArr, 986);
    }

    /* renamed from: o */
    public void mo10235o(String[] strArr, InterfaceC9664g.InterfaceC9665a interfaceC9665a) {
        Set m273U;
        Intrinsics.isThisObjectNull(strArr, "permissions");
        Intrinsics.isThisObjectNull(interfaceC9665a, "listener");
        Map map = this.f25487w0;
        m273U = _Arrays.m273U(strArr);
        map.put(m273U, interfaceC9665a);
    }
}
