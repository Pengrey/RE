package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.AbstractBinderC3102p;
import com.google.android.gms.location.AbstractBinderC3105s;
import com.google.android.gms.location.InterfaceC3103q;
import com.google.android.gms.location.InterfaceC3106t;
import p008a7.C0066a;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes.dex */
public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbc> CREATOR = new C2670q();

    /* renamed from: A */
    final InterfaceC3103q f7618A;

    /* renamed from: B */
    final InterfaceC2657d f7619B;

    /* renamed from: w */
    final int f7620w;

    /* renamed from: x */
    final zzba f7621x;

    /* renamed from: y */
    final InterfaceC3106t f7622y;

    /* renamed from: z */
    final PendingIntent f7623z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbc(int i, zzba zzbaVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.f7620w = i;
        this.f7621x = zzbaVar;
        InterfaceC2657d interfaceC2657d = null;
        this.f7622y = iBinder == null ? null : AbstractBinderC3105s.m31606y(iBinder);
        this.f7623z = pendingIntent;
        this.f7618A = iBinder2 == null ? null : AbstractBinderC3102p.m31610y(iBinder2);
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof InterfaceC2657d) {
                interfaceC2657d = (InterfaceC2657d) queryLocalInterface;
            } else {
                interfaceC2657d = new C2655b(iBinder3);
            }
        }
        this.f7619B = interfaceC2657d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.location.t, android.os.IBinder] */
    /* renamed from: h */
    public static zzbc m32932h(InterfaceC3106t interfaceC3106t, InterfaceC2657d interfaceC2657d) {
        if (interfaceC2657d == null) {
            interfaceC2657d = null;
        }
        return new zzbc(2, null, interfaceC3106t, null, null, interfaceC2657d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.location.q, android.os.IBinder] */
    /* renamed from: t */
    public static zzbc m32931t(InterfaceC3103q interfaceC3103q, InterfaceC2657d interfaceC2657d) {
        if (interfaceC2657d == null) {
            interfaceC2657d = null;
        }
        return new zzbc(2, null, null, null, interfaceC3103q, interfaceC2657d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42009l(parcel, 1, this.f7620w);
        C0066a.m42004q(parcel, 2, this.f7621x, i, false);
        InterfaceC3106t interfaceC3106t = this.f7622y;
        C0066a.m42010k(parcel, 3, interfaceC3106t == null ? null : interfaceC3106t.asBinder(), false);
        C0066a.m42004q(parcel, 4, this.f7623z, i, false);
        InterfaceC3103q interfaceC3103q = this.f7618A;
        C0066a.m42010k(parcel, 5, interfaceC3103q == null ? null : interfaceC3103q.asBinder(), false);
        InterfaceC2657d interfaceC2657d = this.f7619B;
        C0066a.m42010k(parcel, 6, interfaceC2657d != null ? interfaceC2657d.asBinder() : null, false);
        C0066a.m42019b(parcel, m42020a);
    }
}
