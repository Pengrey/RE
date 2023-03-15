package p051d0;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p018ui.platform.C0824y;
import com.github.aachartmodel.aainfographics.BuildConfig;
import p051d0.C4697z0;
import p092f0.InterfaceC5179i;
import p181jd.Intrinsics;
import p302q0.C9576h;

/* compiled from: Strings.android.kt */
/* renamed from: d0.a1 */
/* loaded from: classes.dex */
public final class C4526a1 {
    /* renamed from: a */
    public static final String m27294a(int i, InterfaceC5179i interfaceC5179i, int i2) {
        String str;
        interfaceC5179i.mo25263g(-845575816);
        interfaceC5179i.mo25256n(C0824y.m39472f());
        Resources resources = ((Context) interfaceC5179i.mo25256n(C0824y.m39471g())).getResources();
        C4697z0.C4698a c4698a = C4697z0.f12808a;
        if (C4697z0.m26945g(i, c4698a.m26940e())) {
            str = resources.getString(C9576h.navigation_menu);
            Intrinsics.checkIfNull(str, "resources.getString(R.string.navigation_menu)");
        } else if (C4697z0.m26945g(i, c4698a.m26944a())) {
            str = resources.getString(C9576h.close_drawer);
            Intrinsics.checkIfNull(str, "resources.getString(R.string.close_drawer)");
        } else if (C4697z0.m26945g(i, c4698a.m26943b())) {
            str = resources.getString(C9576h.close_sheet);
            Intrinsics.checkIfNull(str, "resources.getString(R.string.close_sheet)");
        } else if (C4697z0.m26945g(i, c4698a.m26942c())) {
            str = resources.getString(C9576h.default_error_message);
            Intrinsics.checkIfNull(str, "resources.getString(R.st…ng.default_error_message)");
        } else if (C4697z0.m26945g(i, c4698a.m26941d())) {
            str = resources.getString(C9576h.dropdown_menu);
            Intrinsics.checkIfNull(str, "resources.getString(R.string.dropdown_menu)");
        } else {
            str = BuildConfig.VERSION_NAME;
        }
        interfaceC5179i.mo25282C();
        return str;
    }
}
