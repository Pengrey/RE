package android.support.p016v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p016v4.media.C0244a;
import android.support.p016v4.media.C0246b;
import android.text.TextUtils;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0240a();

    /* renamed from: A */
    private final Bitmap f542A;

    /* renamed from: B */
    private final Uri f543B;

    /* renamed from: C */
    private final Bundle f544C;

    /* renamed from: D */
    private final Uri f545D;

    /* renamed from: E */
    private Object f546E;

    /* renamed from: w */
    private final String f547w;

    /* renamed from: x */
    private final CharSequence f548x;

    /* renamed from: y */
    private final CharSequence f549y;

    /* renamed from: z */
    private final CharSequence f550z;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    /* loaded from: classes.dex */
    static class C0240a implements Parcelable.Creator<MediaDescriptionCompat> {
        C0240a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.m41491a(C0244a.m41473a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    /* loaded from: classes.dex */
    public static final class C0241b {

        /* renamed from: a */
        private String f551a;

        /* renamed from: b */
        private CharSequence f552b;

        /* renamed from: c */
        private CharSequence f553c;

        /* renamed from: d */
        private CharSequence f554d;

        /* renamed from: e */
        private Bitmap f555e;

        /* renamed from: f */
        private Uri f556f;

        /* renamed from: g */
        private Bundle f557g;

        /* renamed from: h */
        private Uri f558h;

        /* renamed from: a */
        public MediaDescriptionCompat m41487a() {
            return new MediaDescriptionCompat(this.f551a, this.f552b, this.f553c, this.f554d, this.f555e, this.f556f, this.f557g, this.f558h);
        }

        /* renamed from: b */
        public C0241b m41486b(CharSequence charSequence) {
            this.f554d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0241b m41485c(Bundle bundle) {
            this.f557g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0241b m41484d(Bitmap bitmap) {
            this.f555e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0241b m41483e(Uri uri) {
            this.f556f = uri;
            return this;
        }

        /* renamed from: f */
        public C0241b m41482f(String str) {
            this.f551a = str;
            return this;
        }

        /* renamed from: g */
        public C0241b m41481g(Uri uri) {
            this.f558h = uri;
            return this;
        }

        /* renamed from: h */
        public C0241b m41480h(CharSequence charSequence) {
            this.f553c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0241b m41479i(CharSequence charSequence) {
            this.f552b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f547w = str;
        this.f548x = charSequence;
        this.f549y = charSequence2;
        this.f550z = charSequence3;
        this.f542A = bitmap;
        this.f543B = uri;
        this.f544C = bundle;
        this.f545D = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.p016v4.media.MediaDescriptionCompat m41491a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L7e
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L7e
            android.support.v4.media.MediaDescriptionCompat$b r2 = new android.support.v4.media.MediaDescriptionCompat$b
            r2.<init>()
            java.lang.String r3 = android.support.p016v4.media.C0244a.m41468f(r9)
            r2.m41482f(r3)
            java.lang.CharSequence r3 = android.support.p016v4.media.C0244a.m41466h(r9)
            r2.m41479i(r3)
            java.lang.CharSequence r3 = android.support.p016v4.media.C0244a.m41467g(r9)
            r2.m41480h(r3)
            java.lang.CharSequence r3 = android.support.p016v4.media.C0244a.m41472b(r9)
            r2.m41486b(r3)
            android.graphics.Bitmap r3 = android.support.p016v4.media.C0244a.m41470d(r9)
            r2.m41484d(r3)
            android.net.Uri r3 = android.support.p016v4.media.C0244a.m41469e(r9)
            r2.m41483e(r3)
            android.os.Bundle r3 = android.support.p016v4.media.C0244a.m41471c(r9)
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L4a
            android.support.p016v4.media.session.MediaSessionCompat.m41451a(r3)
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L4b
        L4a:
            r5 = r0
        L4b:
            if (r5 == 0) goto L63
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L5d
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L5d
            goto L64
        L5d:
            r3.remove(r4)
            r3.remove(r6)
        L63:
            r0 = r3
        L64:
            r2.m41485c(r0)
            if (r5 == 0) goto L6d
            r2.m41481g(r5)
            goto L78
        L6d:
            r0 = 23
            if (r1 < r0) goto L78
            android.net.Uri r0 = android.support.p016v4.media.C0246b.m41455a(r9)
            r2.m41481g(r0)
        L78:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.m41487a()
            r0.f546E = r9
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p016v4.media.MediaDescriptionCompat.m41491a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: b */
    public Object m41490b() {
        int i;
        Object obj = this.f546E;
        if (obj != null || (i = Build.VERSION.SDK_INT) < 21) {
            return obj;
        }
        Object m41463b = C0244a.C0245a.m41463b();
        C0244a.C0245a.m41458g(m41463b, this.f547w);
        C0244a.C0245a.m41456i(m41463b, this.f548x);
        C0244a.C0245a.m41457h(m41463b, this.f549y);
        C0244a.C0245a.m41462c(m41463b, this.f550z);
        C0244a.C0245a.m41460e(m41463b, this.f542A);
        C0244a.C0245a.m41459f(m41463b, this.f543B);
        Bundle bundle = this.f544C;
        if (i < 23 && this.f545D != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f545D);
        }
        C0244a.C0245a.m41461d(m41463b, bundle);
        if (i >= 23) {
            C0246b.C0247a.m41454a(m41463b, this.f545D);
        }
        Object m41464a = C0244a.C0245a.m41464a(m41463b);
        this.f546E = m41464a;
        return m41464a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f548x) + ", " + ((Object) this.f549y) + ", " + ((Object) this.f550z);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f547w);
            TextUtils.writeToParcel(this.f548x, parcel, i);
            TextUtils.writeToParcel(this.f549y, parcel, i);
            TextUtils.writeToParcel(this.f550z, parcel, i);
            parcel.writeParcelable(this.f542A, i);
            parcel.writeParcelable(this.f543B, i);
            parcel.writeBundle(this.f544C);
            parcel.writeParcelable(this.f545D, i);
            return;
        }
        C0244a.m41465i(m41490b(), parcel, i);
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f547w = parcel.readString();
        this.f548x = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f549y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f550z = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f542A = (Bitmap) parcel.readParcelable(classLoader);
        this.f543B = (Uri) parcel.readParcelable(classLoader);
        this.f544C = parcel.readBundle(classLoader);
        this.f545D = (Uri) parcel.readParcelable(classLoader);
    }
}
