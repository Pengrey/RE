package android.support.p016v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p016v4.media.session.MediaSessionCompat;
import android.support.p016v4.p017os.ResultReceiver;
import java.util.ArrayList;

/* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends ResultReceiver {
    @Override // android.support.p016v4.p017os.ResultReceiver
    /* renamed from: a */
    protected void mo41379a(int i, Bundle bundle) {
        MediaSessionCompat.m41451a(bundle);
        if (i == 0 && bundle != null && bundle.containsKey("search_results")) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            if (parcelableArray != null) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
                }
            }
            throw null;
        }
        throw null;
    }
}
