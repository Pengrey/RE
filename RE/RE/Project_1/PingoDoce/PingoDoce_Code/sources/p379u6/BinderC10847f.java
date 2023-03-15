package p379u6;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.C2415a;
import com.google.android.gms.auth.api.signin.C2416b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.AbstractBinderC2433k;
import com.google.android.gms.auth.api.signin.internal.C2423a;
import p078e7.C5010k;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: u6.f */
/* loaded from: classes.dex */
public final class BinderC10847f extends AbstractBinderC2433k {

    /* renamed from: a */
    private final Context f28040a;

    public BinderC10847f(Context context) {
        this.f28040a = context;
    }

    /* renamed from: y */
    private final void m6886y() {
        if (C5010k.m25891a(this.f28040a, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb2 = new StringBuilder(52);
        sb2.append("Calling UID ");
        sb2.append(callingUid);
        sb2.append(" is not Google Play services.");
        throw new SecurityException(sb2.toString());
    }

    @Override // com.google.android.gms.auth.api.signin.internal.InterfaceC2434l
    /* renamed from: b0 */
    public final void mo6887b0() {
        m6886y();
        C10846e.m6891a(this.f28040a).m6890b();
    }

    @Override // com.google.android.gms.auth.api.signin.internal.InterfaceC2434l
    /* renamed from: z0 */
    public final void mo6885z0() {
        m6886y();
        C2423a m33579b = C2423a.m33579b(this.f28040a);
        GoogleSignInAccount m33578c = m33579b.m33578c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f7044H;
        if (m33578c != null) {
            googleSignInOptions = m33579b.m33577d();
        }
        C2416b m33591a = C2415a.m33591a(this.f28040a, googleSignInOptions);
        if (m33578c != null) {
            m33591a.m33590u();
        } else {
            m33591a.m33589v();
        }
    }
}
