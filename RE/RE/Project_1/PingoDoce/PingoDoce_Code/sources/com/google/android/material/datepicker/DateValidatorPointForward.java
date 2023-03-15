package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* loaded from: classes.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new C3537a();

    /* renamed from: w */
    private final long f9819w;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointForward$a */
    /* loaded from: classes.dex */
    class C3537a implements Parcelable.Creator<DateValidatorPointForward> {
        C3537a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public DateValidatorPointForward[] newArray(int i) {
            return new DateValidatorPointForward[i];
        }
    }

    /* synthetic */ DateValidatorPointForward(long j, C3537a c3537a) {
        this(j);
    }

    /* renamed from: a */
    public static DateValidatorPointForward m29970a(long j) {
        return new DateValidatorPointForward(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.f9819w == ((DateValidatorPointForward) obj).f9819w;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9819w)});
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    /* renamed from: p */
    public boolean mo29969p(long j) {
        return j >= this.f9819w;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f9819w);
    }

    private DateValidatorPointForward(long j) {
        this.f9819w = j;
    }
}
