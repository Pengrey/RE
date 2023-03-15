package p417w6;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.InterfaceC3415b;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: w6.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C11575f implements InterfaceC3415b {

    /* renamed from: a */
    public static final /* synthetic */ C11575f f29625a = new C11575f();

    private /* synthetic */ C11575f() {
    }

    @Override // com.google.android.gms.tasks.InterfaceC3415b
    /* renamed from: a */
    public final Object mo4684a(AbstractC3419d abstractC3419d) {
        if (abstractC3419d.mo30780p()) {
            return (Bundle) abstractC3419d.mo30784l();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(abstractC3419d.mo30785k());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
            sb2.append("Error making request: ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", abstractC3419d.mo30785k());
    }
}
