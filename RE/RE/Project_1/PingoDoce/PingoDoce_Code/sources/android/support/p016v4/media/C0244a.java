package android.support.p016v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: android.support.v4.media.a */
/* loaded from: classes.dex */
class C0244a {

    /* compiled from: MediaDescriptionCompatApi21.java */
    /* renamed from: android.support.v4.media.a$a */
    /* loaded from: classes.dex */
    static class C0245a {
        /* renamed from: a */
        public static Object m41464a(Object obj) {
            return ((MediaDescription.Builder) obj).build();
        }

        /* renamed from: b */
        public static Object m41463b() {
            return new MediaDescription.Builder();
        }

        /* renamed from: c */
        public static void m41462c(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setDescription(charSequence);
        }

        /* renamed from: d */
        public static void m41461d(Object obj, Bundle bundle) {
            ((MediaDescription.Builder) obj).setExtras(bundle);
        }

        /* renamed from: e */
        public static void m41460e(Object obj, Bitmap bitmap) {
            ((MediaDescription.Builder) obj).setIconBitmap(bitmap);
        }

        /* renamed from: f */
        public static void m41459f(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setIconUri(uri);
        }

        /* renamed from: g */
        public static void m41458g(Object obj, String str) {
            ((MediaDescription.Builder) obj).setMediaId(str);
        }

        /* renamed from: h */
        public static void m41457h(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setSubtitle(charSequence);
        }

        /* renamed from: i */
        public static void m41456i(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setTitle(charSequence);
        }
    }

    /* renamed from: a */
    public static Object m41473a(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static CharSequence m41472b(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    /* renamed from: c */
    public static Bundle m41471c(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }

    /* renamed from: d */
    public static Bitmap m41470d(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    /* renamed from: e */
    public static Uri m41469e(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    /* renamed from: f */
    public static String m41468f(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    /* renamed from: g */
    public static CharSequence m41467g(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    /* renamed from: h */
    public static CharSequence m41466h(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    /* renamed from: i */
    public static void m41465i(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }
}
