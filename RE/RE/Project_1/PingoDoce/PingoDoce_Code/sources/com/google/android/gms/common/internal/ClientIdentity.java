package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;
import p484z6.C13701c;
import p484z6.C13713j;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new C13713j();

    /* renamed from: w */
    public final int f7404w;

    /* renamed from: x */
    public final String f7405x;

    public ClientIdentity(int i, String str) {
        this.f7404w = i;
        this.f7405x = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ClientIdentity) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            return clientIdentity.f7404w == this.f7404w && C13701c.m575a(clientIdentity.f7405x, this.f7405x);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7404w;
    }

    public final String toString() {
        int i = this.f7404w;
        String str = this.f7405x;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
        sb2.append(i);
        sb2.append(":");
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42009l(parcel, 1, this.f7404w);
        C0066a.m42003r(parcel, 2, this.f7405x, false);
        C0066a.m42019b(parcel, m42020a);
    }
}
