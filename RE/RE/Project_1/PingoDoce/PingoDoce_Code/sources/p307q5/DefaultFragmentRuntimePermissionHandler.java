package p307q5;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.ActivityC1354d;
import id.InterfaceC6097a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p195k5.C6599b;
import p195k5.PermissionStatus;
import p249n5.CheckPermissionsStatus;
import p307q5.InterfaceC9664g;
import p468yc.C13195u;
import p489zc._Arrays;

@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m20207d2 = {"Lq5/a;", "Lq5/b;", "<init>", "()V", "kpermissions_release"}, m20206k = 1, m20205mv = {1, 4, 2})
/* renamed from: q5.a */
/* loaded from: classes.dex */
public final class DefaultFragmentRuntimePermissionHandler extends FragmentRuntimePermissionHandler {

    /* renamed from: A0 */
    private InterfaceC6097a f25481A0;

    /* renamed from: z0 */
    private boolean f25482z0;

    /* compiled from: DefaultFragmentRuntimePermissionHandler.kt */
    /* renamed from: q5.a$a */
    /* loaded from: classes.dex */
    static final class C9656a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: x */
        final /* synthetic */ String[] f25484x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9656a(String[] strArr) {
            super(0);
            this.f25484x = strArr;
        }

        /* renamed from: a */
        public final void m10253a() {
            DefaultFragmentRuntimePermissionHandler.m10256k2(DefaultFragmentRuntimePermissionHandler.this, this.f25484x);
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m10253a();
            return C13195u.f34156a;
        }
    }

    /* renamed from: k2 */
    public static final /* synthetic */ void m10256k2(DefaultFragmentRuntimePermissionHandler defaultFragmentRuntimePermissionHandler, String[] strArr) {
        defaultFragmentRuntimePermissionHandler.m10255l2(strArr);
    }

    /* renamed from: l2 */
    private final void m10255l2(String[] strArr) {
        List m276R;
        InterfaceC9664g.InterfaceC9665a m10249h2 = m10249h2(strArr);
        if (m10249h2 != null) {
            ActivityC1354d m37652G1 = m37652G1();
            Intrinsics.checkIfNull(m37652G1, "requireActivity()");
            m276R = _Arrays.m276R(strArr);
            List<? extends PermissionStatus> m17731b = CheckPermissionsStatus.m17731b(m37652G1, m276R);
            if (!C6599b.m20515a(m17731b)) {
                if (this.f25482z0) {
                    return;
                }
                m10254m2(strArr);
                return;
            }
            m10249h2.mo10234a(m17731b);
        }
    }

    /* renamed from: A0 */
    public void mo5750A0(Context context) {
        Intrinsics.isThisObjectNull(context, "context");
        super.mo5750A0(context);
        InterfaceC6097a interfaceC6097a = this.f25481A0;
        if (interfaceC6097a != null) {
            C13195u c13195u = (C13195u) interfaceC6097a.mo42214q();
        }
        this.f25481A0 = null;
    }

    /* renamed from: i2 */
    protected void m10257i2(String[] strArr, int[] iArr) {
        Object c6595a;
        Intrinsics.isThisObjectNull(strArr, "permissions");
        Intrinsics.isThisObjectNull(iArr, "grantResults");
        this.f25482z0 = false;
        InterfaceC9664g.InterfaceC9665a m10249h2 = m10249h2(strArr);
        if (m10249h2 != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            int length = strArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                String str = strArr[i];
                int i3 = i2 + 1;
                if (iArr[i2] == 0) {
                    c6595a = new PermissionStatus.C6597b(str);
                } else if (m37598b2(str)) {
                    c6595a = new PermissionStatus.AbstractC6594a.C6596b(str);
                } else {
                    c6595a = new PermissionStatus.AbstractC6594a.C6595a(str);
                }
                arrayList.add(c6595a);
                i++;
                i2 = i3;
            }
            m10249h2.mo10234a(arrayList);
        }
    }

    /* renamed from: k */
    public void mo10236k(String[] strArr) {
        Intrinsics.isThisObjectNull(strArr, "permissions");
        if (m37573n0()) {
            m10255l2(strArr);
        } else {
            this.f25481A0 = new C9656a(strArr);
        }
    }

    /* renamed from: m2 */
    public void m10254m2(String[] strArr) {
        String m285I;
        Intrinsics.isThisObjectNull(strArr, "permissions");
        this.f25482z0 = true;
        String m10246a = FragmentRuntimePermissionHandler.f25486y0.m10246a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("requesting permissions: ");
        m285I = _Arrays.m285I(strArr, null, null, null, 0, null, null, 63, null);
        sb2.append(m285I);
        Log.d(m10246a, sb2.toString());
        m10247j2(strArr);
    }
}
