package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import p031b9.C1869z;

/* renamed from: com.google.android.play.core.internal.n */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3945n extends BinderC3941j implements InterfaceC3946o {
    public AbstractBinderC3945n() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // com.google.android.play.core.internal.BinderC3941j
    /* renamed from: s */
    protected final boolean mo28536s(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                mo28546F0(parcel.readInt(), (Bundle) C1869z.m35242a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) C1869z.m35242a(parcel, Bundle.CREATOR);
                mo28549C(readInt);
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) C1869z.m35242a(parcel, Bundle.CREATOR);
                mo28544S(readInt2);
                return true;
            case 5:
                mo28539r(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) C1869z.m35242a(parcel, creator);
                mo28548D((Bundle) C1869z.m35242a(parcel, creator));
                return true;
            case 7:
                mo28540i((Bundle) C1869z.m35242a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) C1869z.m35242a(parcel, creator2);
                mo28542b1((Bundle) C1869z.m35242a(parcel, creator2));
                return true;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle5 = (Bundle) C1869z.m35242a(parcel, creator3);
                mo28545H0((Bundle) C1869z.m35242a(parcel, creator3));
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                mo28537z((Bundle) C1869z.m35242a(parcel, creator4), (Bundle) C1869z.m35242a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                mo28547D1((Bundle) C1869z.m35242a(parcel, creator5), (Bundle) C1869z.m35242a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                mo28543V((Bundle) C1869z.m35242a(parcel, creator6), (Bundle) C1869z.m35242a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                Bundle bundle6 = (Bundle) C1869z.m35242a(parcel, creator7);
                Bundle bundle7 = (Bundle) C1869z.m35242a(parcel, creator7);
                mo28538s0();
                return true;
            case 15:
                Bundle bundle8 = (Bundle) C1869z.m35242a(parcel, Bundle.CREATOR);
                mo28541c();
                return true;
        }
    }
}
