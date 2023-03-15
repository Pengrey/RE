package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;
import p008a7.C0066a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* loaded from: classes.dex */
public final class zzas extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzas> CREATOR = new C3314r();

    /* renamed from: w */
    private final Bundle f9174w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzas(Bundle bundle) {
        this.f9174w = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public final Long m30822D(String str) {
        return Long.valueOf(this.f9174w.getLong("value"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public final Object m30821E(String str) {
        return this.f9174w.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public final String m30820F(String str) {
        return this.f9174w.getString(str);
    }

    /* renamed from: h */
    public final int m30819h() {
        return this.f9174w.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C3303q(this);
    }

    public final String toString() {
        return this.f9174w.toString();
    }

    /* renamed from: v */
    public final Bundle m30817v() {
        return new Bundle(this.f9174w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42016e(parcel, 2, m30817v(), false);
        C0066a.m42019b(parcel, m42020a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final Double m30816y(String str) {
        return Double.valueOf(this.f9174w.getDouble("value"));
    }
}
