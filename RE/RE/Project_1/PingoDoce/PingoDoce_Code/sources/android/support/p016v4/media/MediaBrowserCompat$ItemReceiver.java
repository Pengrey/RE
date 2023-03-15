package android.support.p016v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p016v4.media.session.MediaSessionCompat;
import android.support.p016v4.p017os.ResultReceiver;

/* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends ResultReceiver {
    @Override // android.support.p016v4.p017os.ResultReceiver
    /* renamed from: a */
    protected void mo41379a(int i, Bundle bundle) {
        MediaSessionCompat.m41451a(bundle);
        if (i == 0 && bundle != null && bundle.containsKey("media_item")) {
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
                throw null;
            }
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) parcelable;
            throw null;
        }
        throw null;
    }
}
