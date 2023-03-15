package p230m1;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p018ui.platform.C0824y;
import p092f0.InterfaceC5179i;
import p181jd.Intrinsics;

/* compiled from: StringResources.android.kt */
/* renamed from: m1.d */
/* loaded from: classes.dex */
public final class C7098d {
    /* renamed from: a */
    private static final Resources m19307a(InterfaceC5179i interfaceC5179i, int i) {
        interfaceC5179i.mo25256n(C0824y.m39472f());
        Resources resources = ((Context) interfaceC5179i.mo25256n(C0824y.m39471g())).getResources();
        Intrinsics.checkIfNull(resources, "LocalContext.current.resources");
        return resources;
    }

    /* renamed from: b */
    public static final String m19306b(int i, InterfaceC5179i interfaceC5179i, int i2) {
        String string = m19307a(interfaceC5179i, 0).getString(i);
        Intrinsics.checkIfNull(string, "resources.getString(id)");
        return string;
    }
}
