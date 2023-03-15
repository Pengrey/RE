package p364t6;

import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p462y6.InterfaceC13123e;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: t6.a */
/* loaded from: classes.dex */
public class C10385a implements InterfaceC13123e {

    /* renamed from: w */
    private Status f27015w;

    /* renamed from: x */
    private GoogleSignInAccount f27016x;

    @RecentlyNullable
    /* renamed from: a */
    public GoogleSignInAccount m8079a() {
        return this.f27016x;
    }

    @Override // p462y6.InterfaceC13123e
    public Status getStatus() {
        return this.f27015w;
    }
}
