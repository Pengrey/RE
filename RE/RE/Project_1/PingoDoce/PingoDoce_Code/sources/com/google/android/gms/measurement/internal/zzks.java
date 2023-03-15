package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* loaded from: classes.dex */
public final class zzks extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzks> CREATOR = new C3170d9();

    /* renamed from: A */
    public final String f9179A;

    /* renamed from: B */
    public final String f9180B;

    /* renamed from: C */
    public final Double f9181C;

    /* renamed from: w */
    public final int f9182w;

    /* renamed from: x */
    public final String f9183x;

    /* renamed from: y */
    public final long f9184y;

    /* renamed from: z */
    public final Long f9185z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzks(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f9182w = i;
        this.f9183x = str;
        this.f9184y = j;
        this.f9185z = l;
        if (i == 1) {
            this.f9181C = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f9181C = d;
        }
        this.f9179A = str2;
        this.f9180B = str3;
    }

    /* renamed from: h */
    public final Object m30815h() {
        Long l = this.f9185z;
        if (l != null) {
            return l;
        }
        Double d = this.f9181C;
        if (d != null) {
            return d;
        }
        String str = this.f9179A;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C3170d9.m31399a(this, parcel, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzks(C3181e9 c3181e9) {
        this(c3181e9.f8424c, c3181e9.f8425d, c3181e9.f8426e, c3181e9.f8423b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzks(String str, long j, Object obj, String str2) {
        C2597i.m33080f(str);
        this.f9182w = 2;
        this.f9183x = str;
        this.f9184y = j;
        this.f9180B = str2;
        if (obj == null) {
            this.f9185z = null;
            this.f9181C = null;
            this.f9179A = null;
        } else if (obj instanceof Long) {
            this.f9185z = (Long) obj;
            this.f9181C = null;
            this.f9179A = null;
        } else if (obj instanceof String) {
            this.f9185z = null;
            this.f9181C = null;
            this.f9179A = (String) obj;
        } else if (obj instanceof Double) {
            this.f9185z = null;
            this.f9181C = (Double) obj;
            this.f9179A = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
