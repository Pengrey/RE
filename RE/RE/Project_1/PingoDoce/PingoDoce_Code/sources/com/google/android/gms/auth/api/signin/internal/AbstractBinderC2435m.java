package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.constraintlayout.widget.C0868i;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p217l7.BinderC6995d;
import p217l7.C6996e;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: com.google.android.gms.auth.api.signin.internal.m */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2435m extends BinderC6995d implements InterfaceC2436n {
    public AbstractBinderC2435m() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // p217l7.BinderC6995d
    /* renamed from: s */
    protected final boolean mo19639s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case C0868i.f2743B0 /* 101 */:
                mo33566N1((GoogleSignInAccount) C6996e.m19638a(parcel, GoogleSignInAccount.CREATOR), (Status) C6996e.m19638a(parcel, Status.CREATOR));
                break;
            case C0868i.f2748C0 /* 102 */:
                mo33565W((Status) C6996e.m19638a(parcel, Status.CREATOR));
                break;
            case C0868i.f2753D0 /* 103 */:
                mo33567K1((Status) C6996e.m19638a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
