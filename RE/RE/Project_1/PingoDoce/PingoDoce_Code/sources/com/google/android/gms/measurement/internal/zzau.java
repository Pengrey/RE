package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* loaded from: classes.dex */
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new C3325s();

    /* renamed from: w */
    public final String f9175w;

    /* renamed from: x */
    public final zzas f9176x;

    /* renamed from: y */
    public final String f9177y;

    /* renamed from: z */
    public final long f9178z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzau(zzau zzauVar, long j) {
        C2597i.m33076j(zzauVar);
        this.f9175w = zzauVar.f9175w;
        this.f9176x = zzauVar.f9176x;
        this.f9177y = zzauVar.f9177y;
        this.f9178z = j;
    }

    public final String toString() {
        String str = this.f9177y;
        String str2 = this.f9175w;
        String valueOf = String.valueOf(this.f9176x);
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 21 + String.valueOf(str2).length() + valueOf.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C3325s.m31019a(this, parcel, i);
    }

    public zzau(String str, zzas zzasVar, String str2, long j) {
        this.f9175w = str;
        this.f9176x = zzasVar;
        this.f9177y = str2;
        this.f9178z = j;
    }
}
