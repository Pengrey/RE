package p009a8;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.measurement.internal.C3197g3;
import com.google.android.gms.measurement.internal.C3242k4;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: a8.g */
/* loaded from: classes.dex */
public final class C0074g {

    /* renamed from: a */
    private final InterfaceC0073f f180a;

    public C0074g(InterfaceC0073f interfaceC0073f) {
        C2597i.m33076j(interfaceC0073f);
        this.f180a = interfaceC0073f;
    }

    /* renamed from: a */
    public final void m41979a(Context context, Intent intent) {
        C3242k4 m31130H = C3242k4.m31130H(context, null, null);
        C3197g3 mo31116d = m31130H.mo31116d();
        if (intent == null) {
            mo31116d.m31327w().m31398a("Receiver called with null intent");
            return;
        }
        m31130H.mo31114f();
        String action = intent.getAction();
        mo31116d.m31328v().m31397b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            mo31116d.m31328v().m31398a("Starting wakeful intent.");
            this.f180a.mo31532a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            mo31116d.m31327w().m31398a("Install Referrer Broadcasts are deprecated");
        }
    }
}
