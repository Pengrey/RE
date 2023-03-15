package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.internal.Utility;
import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p181jd.Intrinsics;
import p233m4.ProfileManager;
import p482z4.Validate;

/* compiled from: Profile.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013BE\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eB\u0011\b\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0011¨\u0006\u0014"}, m20207d2 = {"Lcom/facebook/Profile;", "Landroid/os/Parcelable;", BuildConfig.VERSION_NAME, "id", "firstName", "middleName", "lastName", "name", "Landroid/net/Uri;", "linkUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V", "Lorg/json/JSONObject;", "jsonObject", "(Lorg/json/JSONObject;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "D", "b", "facebook-core_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class Profile implements Parcelable {

    /* renamed from: C */
    private static final String f6632C;
    public static final Parcelable.Creator CREATOR;

    /* renamed from: D */
    public static final C2287b f6633D = new C2287b(null);

    /* renamed from: A */
    private final String f6634A;

    /* renamed from: B */
    private final Uri f6635B;

    /* renamed from: w */
    private final String f6636w;

    /* renamed from: x */
    private final String f6637x;

    /* renamed from: y */
    private final String f6638y;

    /* renamed from: z */
    private final String f6639z;

    /* compiled from: Profile.kt */
    /* renamed from: com.facebook.Profile$a */
    /* loaded from: classes.dex */
    public static final class C2286a implements Parcelable.Creator {
        C2286a() {
        }

        /* renamed from: a */
        public Profile createFromParcel(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "source");
            return new Profile(parcel, null);
        }

        /* renamed from: b */
        public Profile[] newArray(int i) {
            return new Profile[i];
        }
    }

    /* compiled from: Profile.kt */
    /* renamed from: com.facebook.Profile$b */
    /* loaded from: classes.dex */
    public static final class C2287b {

        /* compiled from: Profile.kt */
        /* renamed from: com.facebook.Profile$b$a */
        /* loaded from: classes.dex */
        public static final class C2288a implements Utility.InterfaceC2327a {
            C2288a() {
            }

            /* renamed from: a */
            public void m34117a(FacebookException facebookException) {
                String m34126a = Profile.m34126a();
                Log.e(m34126a, "Got unexpected exception: " + facebookException);
            }

            /* renamed from: b */
            public void m34116b(JSONObject jSONObject) {
                String optString = jSONObject != null ? jSONObject.optString("id") : null;
                if (optString == null) {
                    Log.w(Profile.m34126a(), "No user ID returned on Me request");
                    return;
                }
                String optString2 = jSONObject.optString("link");
                Profile.f6633D.m34118c(new Profile(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), optString2 != null ? Uri.parse(optString2) : null));
            }
        }

        private C2287b() {
        }

        /* renamed from: a */
        public final void m34120a() {
            AccessToken.C2265c c2265c = AccessToken.f6572L;
            AccessToken m34232e = c2265c.m34232e();
            if (m34232e != null) {
                if (!c2265c.m34230g()) {
                    m34118c(null);
                } else {
                    Utility.m33938t(m34232e.m34246n(), new C2288a());
                }
            }
        }

        /* renamed from: b */
        public final Profile m34119b() {
            return ProfileManager.f18922e.m19114a().m19120c();
        }

        /* renamed from: c */
        public final void m34118c(Profile profile) {
            ProfileManager.f18922e.m19114a().m19116g(profile);
        }

        public /* synthetic */ C2287b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String simpleName = Profile.class.getSimpleName();
        Intrinsics.checkIfNull(simpleName, "Profile::class.java.simpleName");
        f6632C = simpleName;
        CREATOR = new C2286a();
    }

    public /* synthetic */ Profile(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    /* renamed from: a */
    public static final /* synthetic */ String m34126a() {
        return f6632C;
    }

    /* renamed from: b */
    public static final void m34125b() {
        f6633D.m34120a();
    }

    /* renamed from: c */
    public static final Profile m34124c() {
        return f6633D.m34119b();
    }

    /* renamed from: d */
    public final JSONObject m34123d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f6636w);
            jSONObject.put("first_name", this.f6637x);
            jSONObject.put("middle_name", this.f6638y);
            jSONObject.put("last_name", this.f6639z);
            jSONObject.put("name", this.f6634A);
            Uri uri = this.f6635B;
            if (uri != null) {
                jSONObject.put("link_uri", uri.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        if (this == obj) {
            return true;
        }
        if (obj instanceof Profile) {
            String str5 = this.f6636w;
            return ((str5 == null && ((Profile) obj).f6636w == null) || Intrinsics.equals(str5, ((Profile) obj).f6636w)) && (((str = this.f6637x) == null && ((Profile) obj).f6637x == null) || Intrinsics.equals(str, ((Profile) obj).f6637x)) && ((((str2 = this.f6638y) == null && ((Profile) obj).f6638y == null) || Intrinsics.equals(str2, ((Profile) obj).f6638y)) && ((((str3 = this.f6639z) == null && ((Profile) obj).f6639z == null) || Intrinsics.equals(str3, ((Profile) obj).f6639z)) && ((((str4 = this.f6634A) == null && ((Profile) obj).f6634A == null) || Intrinsics.equals(str4, ((Profile) obj).f6634A)) && (((uri = this.f6635B) == null && ((Profile) obj).f6635B == null) || Intrinsics.equals(uri, ((Profile) obj).f6635B)))));
        }
        return false;
    }

    public int hashCode() {
        String str = this.f6636w;
        int hashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.f6637x;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.f6638y;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.f6639z;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        String str5 = this.f6634A;
        if (str5 != null) {
            hashCode = (hashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f6635B;
        return uri != null ? (hashCode * 31) + uri.hashCode() : hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "dest");
        parcel.writeString(this.f6636w);
        parcel.writeString(this.f6637x);
        parcel.writeString(this.f6638y);
        parcel.writeString(this.f6639z);
        parcel.writeString(this.f6634A);
        Uri uri = this.f6635B;
        parcel.writeString(uri != null ? uri.toString() : null);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri) {
        Validate.m670h(str, "id");
        this.f6636w = str;
        this.f6637x = str2;
        this.f6638y = str3;
        this.f6639z = str4;
        this.f6634A = str5;
        this.f6635B = uri;
    }

    public Profile(JSONObject jSONObject) {
        Intrinsics.isThisObjectNull(jSONObject, "jsonObject");
        this.f6636w = jSONObject.optString("id", null);
        this.f6637x = jSONObject.optString("first_name", null);
        this.f6638y = jSONObject.optString("middle_name", null);
        this.f6639z = jSONObject.optString("last_name", null);
        this.f6634A = jSONObject.optString("name", null);
        String optString = jSONObject.optString("link_uri", null);
        this.f6635B = optString != null ? Uri.parse(optString) : null;
    }

    private Profile(Parcel parcel) {
        this.f6636w = parcel.readString();
        this.f6637x = parcel.readString();
        this.f6638y = parcel.readString();
        this.f6639z = parcel.readString();
        this.f6634A = parcel.readString();
        String readString = parcel.readString();
        this.f6635B = readString == null ? null : Uri.parse(readString);
    }
}
