package android.support.p016v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0253a();

    /* renamed from: A */
    public int f575A;

    /* renamed from: w */
    public int f576w;

    /* renamed from: x */
    public int f577x;

    /* renamed from: y */
    public int f578y;

    /* renamed from: z */
    public int f579z;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    /* loaded from: classes.dex */
    static class C0253a implements Parcelable.Creator<ParcelableVolumeInfo> {
        C0253a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f576w = parcel.readInt();
        this.f578y = parcel.readInt();
        this.f579z = parcel.readInt();
        this.f575A = parcel.readInt();
        this.f577x = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f576w);
        parcel.writeInt(this.f578y);
        parcel.writeInt(this.f579z);
        parcel.writeInt(this.f575A);
        parcel.writeInt(this.f577x);
    }
}
