package android.support.p016v4.media;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p016v4.media.session.MediaSessionCompat;
import p301q.C9545a;

/* renamed from: android.support.v4.media.MediaMetadataCompat */
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: y */
    static final C9545a<String, Integer> f559y;

    /* renamed from: w */
    final Bundle f560w;

    /* renamed from: x */
    private Object f561x;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    /* loaded from: classes.dex */
    static class C0242a implements Parcelable.Creator<MediaMetadataCompat> {
        C0242a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        C9545a<String, Integer> c9545a = new C9545a<>();
        f559y = c9545a;
        c9545a.put("android.media.metadata.TITLE", 1);
        c9545a.put("android.media.metadata.ARTIST", 1);
        c9545a.put("android.media.metadata.DURATION", 0);
        c9545a.put("android.media.metadata.ALBUM", 1);
        c9545a.put("android.media.metadata.AUTHOR", 1);
        c9545a.put("android.media.metadata.WRITER", 1);
        c9545a.put("android.media.metadata.COMPOSER", 1);
        c9545a.put("android.media.metadata.COMPILATION", 1);
        c9545a.put("android.media.metadata.DATE", 1);
        c9545a.put("android.media.metadata.YEAR", 0);
        c9545a.put("android.media.metadata.GENRE", 1);
        c9545a.put("android.media.metadata.TRACK_NUMBER", 0);
        c9545a.put("android.media.metadata.NUM_TRACKS", 0);
        c9545a.put("android.media.metadata.DISC_NUMBER", 0);
        c9545a.put("android.media.metadata.ALBUM_ARTIST", 1);
        c9545a.put("android.media.metadata.ART", 2);
        c9545a.put("android.media.metadata.ART_URI", 1);
        c9545a.put("android.media.metadata.ALBUM_ART", 2);
        c9545a.put("android.media.metadata.ALBUM_ART_URI", 1);
        c9545a.put("android.media.metadata.USER_RATING", 3);
        c9545a.put("android.media.metadata.RATING", 3);
        c9545a.put("android.media.metadata.DISPLAY_TITLE", 1);
        c9545a.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c9545a.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c9545a.put("android.media.metadata.DISPLAY_ICON", 2);
        c9545a.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c9545a.put("android.media.metadata.MEDIA_ID", 1);
        c9545a.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c9545a.put("android.media.metadata.MEDIA_URI", 1);
        c9545a.put("android.media.metadata.ADVERTISEMENT", 0);
        c9545a.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new C0242a();
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f560w = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    /* renamed from: a */
    public static MediaMetadataCompat m41478a(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        C0248c.m41453a(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f561x = obj;
        return createFromParcel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f560w);
    }
}
