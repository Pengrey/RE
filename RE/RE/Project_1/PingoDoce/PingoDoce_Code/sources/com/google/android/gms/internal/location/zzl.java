package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.BinderC3100n;
import p008a7.C0066a;
import p400v7.InterfaceC11132d;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new C2674u();

    /* renamed from: w */
    final int f7629w;

    /* renamed from: x */
    final zzj f7630x;

    /* renamed from: y */
    final InterfaceC11132d f7631y;

    /* renamed from: z */
    final InterfaceC2657d f7632z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(int i, zzj zzjVar, IBinder iBinder, IBinder iBinder2) {
        this.f7629w = i;
        this.f7630x = zzjVar;
        InterfaceC2657d interfaceC2657d = null;
        this.f7631y = iBinder == null ? null : BinderC3100n.m31611y(iBinder);
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof InterfaceC2657d) {
                interfaceC2657d = (InterfaceC2657d) queryLocalInterface;
            } else {
                interfaceC2657d = new C2655b(iBinder2);
            }
        }
        this.f7632z = interfaceC2657d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42009l(parcel, 1, this.f7629w);
        C0066a.m42004q(parcel, 2, this.f7630x, i, false);
        InterfaceC11132d interfaceC11132d = this.f7631y;
        C0066a.m42010k(parcel, 3, interfaceC11132d == null ? null : interfaceC11132d.asBinder(), false);
        InterfaceC2657d interfaceC2657d = this.f7632z;
        C0066a.m42010k(parcel, 4, interfaceC2657d != null ? interfaceC2657d.asBinder() : null, false);
        C0066a.m42019b(parcel, m42020a);
    }
}
