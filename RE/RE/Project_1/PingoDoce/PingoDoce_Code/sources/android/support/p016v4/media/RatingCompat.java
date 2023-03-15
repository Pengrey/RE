package android.support.p016v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.RatingCompat */
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0243a();

    /* renamed from: w */
    private final int f562w;

    /* renamed from: x */
    private final float f563x;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    /* loaded from: classes.dex */
    static class C0243a implements Parcelable.Creator<RatingCompat> {
        C0243a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    RatingCompat(int i, float f) {
        this.f562w = i;
        this.f563x = f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f562w;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Rating:style=");
        sb2.append(this.f562w);
        sb2.append(" rating=");
        float f = this.f563x;
        sb2.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f562w);
        parcel.writeFloat(this.f563x);
    }
}
