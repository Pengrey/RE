package p396v3;

import android.content.Context;
import gd.Utils;
import java.io.File;
import p151i3.InterfaceC5996a;

/* renamed from: v3.r */
/* loaded from: classes.dex */
public final class C11109r {

    /* renamed from: a */
    public static final C11109r f28506a = new C11109r();

    /* renamed from: b */
    private static InterfaceC5996a f28507b;

    private C11109r() {
    }

    /* renamed from: a */
    public final synchronized InterfaceC5996a m6114a(Context context) {
        InterfaceC5996a interfaceC5996a;
        File m23449e;
        interfaceC5996a = f28507b;
        if (interfaceC5996a == null) {
            InterfaceC5996a.C5997a c5997a = new InterfaceC5996a.C5997a();
            m23449e = Utils.m23449e(C11098i.m6142n(context), "image_cache");
            interfaceC5996a = c5997a.m22441b(m23449e).m22442a();
            f28507b = interfaceC5996a;
        }
        return interfaceC5996a;
    }
}
