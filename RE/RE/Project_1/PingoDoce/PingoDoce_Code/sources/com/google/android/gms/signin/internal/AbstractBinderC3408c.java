package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import p251n7.BinderC7683b;
import p251n7.C7684c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.signin.internal.c */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3408c extends BinderC7683b implements InterfaceC3409d {
    public AbstractBinderC3408c() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // p251n7.BinderC7683b
    /* renamed from: S1 */
    protected final boolean mo17722S1(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) C7684c.m17721a(parcel, ConnectionResult.CREATOR);
                zaa zaaVar = (zaa) C7684c.m17721a(parcel, zaa.CREATOR);
                break;
            case 4:
                Status status = (Status) C7684c.m17721a(parcel, Status.CREATOR);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) C7684c.m17721a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) C7684c.m17721a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) C7684c.m17721a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                mo30811D0((zak) C7684c.m17721a(parcel, zak.CREATOR));
                break;
            case 9:
                zag zagVar = (zag) C7684c.m17721a(parcel, zag.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
