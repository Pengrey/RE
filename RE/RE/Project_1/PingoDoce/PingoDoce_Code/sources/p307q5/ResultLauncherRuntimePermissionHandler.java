package p307q5;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.AbstractC0304b;
import androidx.fragment.app.ActivityC1354d;
import androidx.fragment.app.Fragment;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p050d.ActivityResultContracts;
import p181jd.AbstractC6438m;
import p181jd.C6435i;
import p181jd.Intrinsics;
import p195k5.C6599b;
import p195k5.PermissionStatus;
import p249n5.CheckPermissionsStatus;
import p249n5.IsPermissionGranted;
import p307q5.InterfaceC9664g;
import p468yc.C13195u;
import p489zc._Arrays;

@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m20207d2 = {"Lq5/d;", "Landroidx/fragment/app/Fragment;", "Lq5/g;", "<init>", "()V", "a", "kpermissions_release"}, m20206k = 1, m20205mv = {1, 4, 2})
/* renamed from: q5.d */
/* loaded from: classes.dex */
public final class ResultLauncherRuntimePermissionHandler extends Fragment implements InterfaceC9664g {

    /* renamed from: A0 */
    private static final String f25489A0;

    /* renamed from: w0 */
    private AbstractC0304b f25490w0;

    /* renamed from: x0 */
    private final Map f25491x0;

    /* renamed from: y0 */
    private InterfaceC6097a f25492y0;

    /* renamed from: z0 */
    private String[] f25493z0;

    /* compiled from: ResultLauncherRuntimePermissionHandler.kt */
    /* renamed from: q5.d$a */
    /* loaded from: classes.dex */
    public static final class C9659a {
        private C9659a() {
        }

        public /* synthetic */ C9659a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ResultLauncherRuntimePermissionHandler.kt */
    /* renamed from: q5.d$b */
    /* loaded from: classes.dex */
    static final class C9660b extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: x */
        final /* synthetic */ String[] f25495x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9660b(String[] strArr) {
            super(0);
            this.f25495x = strArr;
        }

        /* renamed from: a */
        public final void m10238a() {
            ResultLauncherRuntimePermissionHandler.m10242g2(ResultLauncherRuntimePermissionHandler.this, this.f25495x);
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m10238a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResultLauncherRuntimePermissionHandler.kt */
    /* renamed from: q5.d$c */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class C9661c extends C6435i implements InterfaceC6108l {
        C9661c(ResultLauncherRuntimePermissionHandler resultLauncherRuntimePermissionHandler) {
            super(1, resultLauncherRuntimePermissionHandler, ResultLauncherRuntimePermissionHandler.class, "onPermissionsResult", "onPermissionsResult(Ljava/util/Map;)V", 0);
        }

        /* renamed from: i */
        public final void m10237i(Map map) {
            Intrinsics.isThisObjectNull(map, "p1");
            ((ResultLauncherRuntimePermissionHandler) this.f18132x).m10240i2(map);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m10237i((Map) obj);
            return C13195u.f34156a;
        }
    }

    static {
        new C9659a(null);
        f25489A0 = ResultLauncherRuntimePermissionHandler.class.getSimpleName();
    }

    public ResultLauncherRuntimePermissionHandler() {
        AbstractC0304b m37661D1 = m37661D1(new ActivityResultContracts(), new C9662e(new C9661c(this)));
        Intrinsics.checkIfNull(m37661D1, "registerForActivityResul…onPermissionsResult\n    )");
        this.f25490w0 = m37661D1;
        this.f25491x0 = new LinkedHashMap();
    }

    /* renamed from: g2 */
    public static final /* synthetic */ void m10242g2(ResultLauncherRuntimePermissionHandler resultLauncherRuntimePermissionHandler, String[] strArr) {
        resultLauncherRuntimePermissionHandler.m10241h2(strArr);
    }

    /* renamed from: h2 */
    private final void m10241h2(String[] strArr) {
        Set m273U;
        List m276R;
        Map map = this.f25491x0;
        m273U = _Arrays.m273U(strArr);
        InterfaceC9664g.InterfaceC9665a interfaceC9665a = (InterfaceC9664g.InterfaceC9665a) map.get(m273U);
        if (interfaceC9665a != null) {
            ActivityC1354d m37652G1 = m37652G1();
            Intrinsics.checkIfNull(m37652G1, "requireActivity()");
            m276R = _Arrays.m276R(strArr);
            List<? extends PermissionStatus> m17731b = CheckPermissionsStatus.m17731b(m37652G1, m276R);
            if (!C6599b.m20515a(m17731b)) {
                if (this.f25493z0 != null) {
                    return;
                }
                m10239j2(strArr);
                return;
            }
            interfaceC9665a.mo10234a(m17731b);
        }
    }

    /* renamed from: A0 */
    public void mo5750A0(Context context) {
        Intrinsics.isThisObjectNull(context, "context");
        super.mo5750A0(context);
        InterfaceC6097a interfaceC6097a = this.f25492y0;
        if (interfaceC6097a != null) {
            C13195u c13195u = (C13195u) interfaceC6097a.mo42214q();
        }
        this.f25492y0 = null;
    }

    /* renamed from: D0 */
    public void mo29886D0(Bundle bundle) {
        super.mo29886D0(bundle);
        if (this.f25493z0 == null) {
            this.f25493z0 = bundle != null ? bundle.getStringArray("pending_permissions") : null;
        }
    }

    /* renamed from: Z0 */
    public void mo29884Z0(Bundle bundle) {
        Intrinsics.isThisObjectNull(bundle, "outState");
        super.mo29884Z0(bundle);
        bundle.putStringArray("pending_permissions", this.f25493z0);
    }

    /* renamed from: i2 */
    public final void m10240i2(Map map) {
        Set m273U;
        Object c6596b;
        Intrinsics.isThisObjectNull(map, "permissionsResult");
        String[] strArr = this.f25493z0;
        if (strArr != null) {
            this.f25493z0 = null;
            Map map2 = this.f25491x0;
            m273U = _Arrays.m273U(strArr);
            InterfaceC9664g.InterfaceC9665a interfaceC9665a = (InterfaceC9664g.InterfaceC9665a) map2.get(m273U);
            if (interfaceC9665a != null) {
                Context m37650H1 = m37650H1();
                Intrinsics.checkIfNull(m37650H1, "requireContext()");
                ArrayList arrayList = new ArrayList(strArr.length);
                for (String str : strArr) {
                    Object obj = map.get(str);
                    if (obj == null) {
                        obj = Boolean.valueOf(IsPermissionGranted.m17730a(m37650H1, str));
                    }
                    if (((Boolean) obj).booleanValue()) {
                        c6596b = new PermissionStatus.C6597b(str);
                    } else {
                        c6596b = m37598b2(str) ? new PermissionStatus.AbstractC6594a.C6596b(str) : new PermissionStatus.AbstractC6594a.C6595a(str);
                    }
                    arrayList.add(c6596b);
                }
                interfaceC9665a.mo10234a(arrayList);
            }
        }
    }

    /* renamed from: j2 */
    public void m10239j2(String[] strArr) {
        String m285I;
        Intrinsics.isThisObjectNull(strArr, "permissions");
        this.f25493z0 = strArr;
        String str = f25489A0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("requesting permissions: ");
        m285I = _Arrays.m285I(strArr, null, null, null, 0, null, null, 63, null);
        sb2.append(m285I);
        Log.d(str, sb2.toString());
        this.f25490w0.m41324a(strArr);
    }

    /* renamed from: k */
    public void mo10236k(String[] strArr) {
        Intrinsics.isThisObjectNull(strArr, "permissions");
        if (m37573n0()) {
            m10241h2(strArr);
        } else {
            this.f25492y0 = new C9660b(strArr);
        }
    }

    /* renamed from: o */
    public void mo10235o(String[] strArr, InterfaceC9664g.InterfaceC9665a interfaceC9665a) {
        Set m273U;
        Intrinsics.isThisObjectNull(strArr, "permissions");
        Intrinsics.isThisObjectNull(interfaceC9665a, "listener");
        Map map = this.f25491x0;
        m273U = _Arrays.m273U(strArr);
        map.put(m273U, interfaceC9665a);
    }
}
