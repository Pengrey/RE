package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p054d3.InterfaceC4723a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C1714a();

    /* renamed from: w */
    private final InterfaceC4723a f5245w;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    /* loaded from: classes.dex */
    static class C1714a implements Parcelable.Creator<ParcelImpl> {
        C1714a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f5245w = new C1715a(parcel).m35595u();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        new C1715a(parcel).m35609L(this.f5245w);
    }
}
