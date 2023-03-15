package android.support.p016v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
/* loaded from: classes.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0239a();

    /* renamed from: w */
    private final int f540w;

    /* renamed from: x */
    private final MediaDescriptionCompat f541x;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
    /* loaded from: classes.dex */
    static class C0239a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        C0239a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaBrowserCompat$MediaItem[] newArray(int i) {
            return new MediaBrowserCompat$MediaItem[i];
        }
    }

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f540w = parcel.readInt();
        this.f541x = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{mFlags=" + this.f540w + ", mDescription=" + this.f541x + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f540w);
        this.f541x.writeToParcel(parcel, i);
    }
}
