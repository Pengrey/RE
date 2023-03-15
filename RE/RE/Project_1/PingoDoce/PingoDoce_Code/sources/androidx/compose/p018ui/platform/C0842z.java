package androidx.compose.p018ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.core.content.res.C0955h;
import p181jd.Intrinsics;
import p359t1.C10373m;
import p359t1.InterfaceC10362d;

/* compiled from: AndroidFontResourceLoader.android.kt */
/* renamed from: androidx.compose.ui.platform.z */
/* loaded from: classes.dex */
public final class C0842z implements InterfaceC10362d.InterfaceC10363a {

    /* renamed from: a */
    private final Context f2477a;

    public C0842z(Context context) {
        Intrinsics.isThisObjectNull(context, "context");
        this.f2477a = context;
    }

    /* renamed from: b */
    public Typeface mo8152a(InterfaceC10362d interfaceC10362d) {
        Intrinsics.isThisObjectNull(interfaceC10362d, "font");
        if (interfaceC10362d instanceof C10373m) {
            if (Build.VERSION.SDK_INT >= 26) {
                return C0684a0.f2158a.m39833a(this.f2477a, ((C10373m) interfaceC10362d).m8094d());
            }
            Typeface m38994g = C0955h.m38994g(this.f2477a, ((C10373m) interfaceC10362d).m8094d());
            Intrinsics.ifNullDoSomething(m38994g);
            Intrinsics.checkIfNull(m38994g, "{\n                    Re…esId)!!\n                }");
            return m38994g;
        }
        throw new IllegalArgumentException(Intrinsics.addStrAndObj("Unknown font type: ", interfaceC10362d));
    }
}
