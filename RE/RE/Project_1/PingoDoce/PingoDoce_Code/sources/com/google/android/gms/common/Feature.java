package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;
import p439x6.C12289d;
import p484z6.C13701c;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new C12289d();

    /* renamed from: w */
    private final String f7144w;
    @Deprecated

    /* renamed from: x */
    private final int f7145x;

    /* renamed from: y */
    private final long f7146y;

    public Feature(String str, int i, long j) {
        this.f7144w = str;
        this.f7145x = i;
        this.f7146y = j;
    }

    public Feature(String str, long j) {
        this.f7144w = str;
        this.f7146y = j;
        this.f7145x = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((m33518h() != null && m33518h().equals(feature.m33518h())) || (m33518h() == null && feature.m33518h() == null)) && m33517t() == feature.m33517t()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public String m33518h() {
        return this.f7144w;
    }

    public final int hashCode() {
        return C13701c.m574b(m33518h(), Long.valueOf(m33517t()));
    }

    /* renamed from: t */
    public long m33517t() {
        long j = this.f7146y;
        return j == -1 ? this.f7145x : j;
    }

    public final String toString() {
        C13701c.C13702a m573c = C13701c.m573c(this);
        m573c.m572a("name", m33518h());
        m573c.m572a("version", Long.valueOf(m33517t()));
        return m573c.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42003r(parcel, 1, m33518h(), false);
        C0066a.m42009l(parcel, 2, this.f7145x);
        C0066a.m42006o(parcel, 3, m33517t());
        C0066a.m42019b(parcel, m42020a);
    }
}
