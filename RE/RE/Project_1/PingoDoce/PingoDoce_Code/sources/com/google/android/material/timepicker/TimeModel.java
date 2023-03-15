package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new C3800a();

    /* renamed from: w */
    final int f10825w;

    /* renamed from: x */
    int f10826x;

    /* renamed from: y */
    int f10827y;

    /* renamed from: z */
    int f10828z;

    /* renamed from: com.google.android.material.timepicker.TimeModel$a */
    /* loaded from: classes.dex */
    class C3800a implements Parcelable.Creator<TimeModel> {
        C3800a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }
    }

    public TimeModel() {
        this(0);
    }

    /* renamed from: a */
    public static String m28828a(Resources resources, CharSequence charSequence) {
        return m28827b(resources, charSequence, "%02d");
    }

    /* renamed from: b */
    public static String m28827b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    /* renamed from: c */
    private static int m28826c(int i) {
        return i >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TimeModel) {
            TimeModel timeModel = (TimeModel) obj;
            return this.f10826x == timeModel.f10826x && this.f10827y == timeModel.f10827y && this.f10825w == timeModel.f10825w && this.f10828z == timeModel.f10828z;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10825w), Integer.valueOf(this.f10826x), Integer.valueOf(this.f10827y), Integer.valueOf(this.f10828z)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10826x);
        parcel.writeInt(this.f10827y);
        parcel.writeInt(this.f10828z);
        parcel.writeInt(this.f10825w);
    }

    public TimeModel(int i) {
        this(0, 0, 10, i);
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.f10826x = i;
        this.f10827y = i2;
        this.f10828z = i3;
        this.f10825w = i4;
        m28826c(i);
        new C3808a(59);
        new C3808a(i4 == 1 ? 24 : 12);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
