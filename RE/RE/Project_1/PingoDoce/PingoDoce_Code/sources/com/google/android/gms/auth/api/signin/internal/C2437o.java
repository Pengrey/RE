package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.constraintlayout.widget.C0868i;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p217l7.C6992a;
import p217l7.C6996e;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: com.google.android.gms.auth.api.signin.internal.o */
/* loaded from: classes.dex */
public final class C2437o extends C6992a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2437o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: H */
    public final void m33564H(InterfaceC2436n interfaceC2436n, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel m19643s = m19643s();
        C6996e.m19636c(m19643s, interfaceC2436n);
        C6996e.m19637b(m19643s, googleSignInOptions);
        m19642y(C0868i.f2753D0, m19643s);
    }

    /* renamed from: S1 */
    public final void m33563S1(InterfaceC2436n interfaceC2436n, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel m19643s = m19643s();
        C6996e.m19636c(m19643s, interfaceC2436n);
        C6996e.m19637b(m19643s, googleSignInOptions);
        m19642y(C0868i.f2748C0, m19643s);
    }
}
