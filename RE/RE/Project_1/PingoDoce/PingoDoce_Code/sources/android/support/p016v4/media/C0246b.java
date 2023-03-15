package android.support.p016v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* renamed from: android.support.v4.media.b */
/* loaded from: classes.dex */
class C0246b {

    /* compiled from: MediaDescriptionCompatApi23.java */
    /* renamed from: android.support.v4.media.b$a */
    /* loaded from: classes.dex */
    static class C0247a {
        /* renamed from: a */
        public static void m41454a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: a */
    public static Uri m41455a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
