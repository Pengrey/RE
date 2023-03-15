package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzs;
import java.util.Collections;
import java.util.List;
import p008a7.C0066a;
import p484z6.C13701c;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {

    /* renamed from: w */
    final zzs f7626w;

    /* renamed from: x */
    final List<ClientIdentity> f7627x;

    /* renamed from: y */
    final String f7628y;

    /* renamed from: z */
    static final List<ClientIdentity> f7625z = Collections.emptyList();

    /* renamed from: A */
    static final zzs f7624A = new zzs();
    public static final Parcelable.Creator<zzj> CREATOR = new C2673t();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(zzs zzsVar, List<ClientIdentity> list, String str) {
        this.f7626w = zzsVar;
        this.f7627x = list;
        this.f7628y = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzj) {
            zzj zzjVar = (zzj) obj;
            return C13701c.m575a(this.f7626w, zzjVar.f7626w) && C13701c.m575a(this.f7627x, zzjVar.f7627x) && C13701c.m575a(this.f7628y, zzjVar.f7628y);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7626w.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7626w);
        String valueOf2 = String.valueOf(this.f7627x);
        String str = this.f7628y;
        int length = valueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 77 + valueOf2.length() + String.valueOf(str).length());
        sb2.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb2.append(valueOf);
        sb2.append(", clients=");
        sb2.append(valueOf2);
        sb2.append(", tag='");
        sb2.append(str);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42004q(parcel, 1, this.f7626w, i, false);
        C0066a.m41999v(parcel, 2, this.f7627x, false);
        C0066a.m42003r(parcel, 3, this.f7628y, false);
        C0066a.m42019b(parcel, m42020a);
    }
}
