package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.FetchedAppSettingsManager;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.net.HttpURLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p181jd.Intrinsics;
import p482z4.C13633a;
import p482z4.FetchedAppSettings;

/* compiled from: FacebookRequestError.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0003 !\"B\u0083\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B#\b\u0017\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u001a\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019¢\u0006\u0004\b\u0016\u0010\u001bB\u0011\b\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u0016\u0010\u001e¨\u0006#"}, m20207d2 = {"Lcom/facebook/FacebookRequestError;", "Landroid/os/Parcelable;", BuildConfig.VERSION_NAME, "requestStatusCode", "errorCode", "subErrorCode", BuildConfig.VERSION_NAME, "errorType", "errorMessageField", "errorUserTitle", "errorUserMessage", "Lorg/json/JSONObject;", "requestResultBody", "requestResult", BuildConfig.VERSION_NAME, "batchRequestResult", "Ljava/net/HttpURLConnection;", "connection", "Lcom/facebook/FacebookException;", "exceptionField", BuildConfig.VERSION_NAME, "errorIsTransient", "<init>", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;Z)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "H", "a", "c", "d", "facebook-core_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class FacebookRequestError implements Parcelable {

    /* renamed from: A */
    private final int f6586A;

    /* renamed from: B */
    private final int f6587B;

    /* renamed from: C */
    private final String f6588C;

    /* renamed from: D */
    private final String f6589D;

    /* renamed from: E */
    private final String f6590E;

    /* renamed from: F */
    private final Object f6591F;

    /* renamed from: w */
    private final String f6592w;

    /* renamed from: x */
    private FacebookException f6593x;

    /* renamed from: y */
    private final EnumC2269a f6594y;

    /* renamed from: z */
    private final int f6595z;

    /* renamed from: H */
    public static final C2271c f6596H = new C2271c(null);

    /* renamed from: G */
    private static final C2272d f6597G = new C2272d(200, 299);
    public static final Parcelable.Creator CREATOR = new C2270b();

    /* compiled from: FacebookRequestError.kt */
    /* renamed from: com.facebook.FacebookRequestError$a */
    /* loaded from: classes.dex */
    public enum EnumC2269a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    /* compiled from: FacebookRequestError.kt */
    /* renamed from: com.facebook.FacebookRequestError$b */
    /* loaded from: classes.dex */
    public static final class C2270b implements Parcelable.Creator {
        C2270b() {
        }

        /* renamed from: a */
        public FacebookRequestError createFromParcel(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new FacebookRequestError(parcel, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public FacebookRequestError[] newArray(int i) {
            return new FacebookRequestError[i];
        }
    }

    /* compiled from: FacebookRequestError.kt */
    /* renamed from: com.facebook.FacebookRequestError$c */
    /* loaded from: classes.dex */
    public static final class C2271c {
        private C2271c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x00cd A[Catch: JSONException -> 0x012b, TryCatch #0 {JSONException -> 0x012b, blocks: (B:3:0x0012, B:5:0x0018, B:7:0x0022, B:9:0x0026, B:12:0x0034, B:14:0x003f, B:17:0x0049, B:20:0x0053, B:23:0x005b, B:25:0x0061, B:28:0x006b, B:31:0x0075, B:45:0x00cd, B:33:0x0081, B:36:0x008e, B:38:0x0097, B:42:0x00a8, B:47:0x00ee, B:49:0x00f8, B:51:0x0106, B:53:0x010f), top: B:57:0x0012 }] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.facebook.FacebookRequestError m34219a(org.json.JSONObject r20, java.lang.Object r21, java.net.HttpURLConnection r22) {
            /*
                Method dump skipped, instructions count: 300
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookRequestError.C2271c.m34219a(org.json.JSONObject, java.lang.Object, java.net.HttpURLConnection):com.facebook.FacebookRequestError");
        }

        /* renamed from: b */
        public final synchronized C13633a m34218b() {
            FetchedAppSettings m33990j = FetchedAppSettingsManager.m33990j(C2290b.m34109f());
            if (m33990j != null) {
                return m33990j.m738c();
            }
            return C13633a.f34649h.m758b();
        }

        /* renamed from: c */
        public final C2272d m34217c() {
            return FacebookRequestError.m34228a();
        }

        public /* synthetic */ C2271c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: FacebookRequestError.kt */
    /* renamed from: com.facebook.FacebookRequestError$d */
    /* loaded from: classes.dex */
    public static final class C2272d {

        /* renamed from: a */
        private final int f6598a;

        /* renamed from: b */
        private final int f6599b;

        public C2272d(int i, int i2) {
            this.f6598a = i;
            this.f6599b = i2;
        }

        /* renamed from: a */
        public final boolean m34216a(int i) {
            return this.f6598a <= i && this.f6599b >= i;
        }
    }

    public /* synthetic */ FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, facebookException, z);
    }

    /* renamed from: a */
    public static final /* synthetic */ C2272d m34228a() {
        return f6597G;
    }

    /* renamed from: b */
    public final int m34227b() {
        return this.f6586A;
    }

    /* renamed from: c */
    public final String m34226c() {
        String str = this.f6592w;
        if (str != null) {
            return str;
        }
        FacebookException facebookException = this.f6593x;
        if (facebookException != null) {
            return facebookException.getLocalizedMessage();
        }
        return null;
    }

    /* renamed from: d */
    public final String m34225d() {
        return this.f6588C;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final FacebookException m34224e() {
        return this.f6593x;
    }

    /* renamed from: f */
    public final int m34223f() {
        return this.f6595z;
    }

    /* renamed from: h */
    public final int m34222h() {
        return this.f6587B;
    }

    public String toString() {
        String str = "{HttpStatus: " + this.f6595z + ", errorCode: " + this.f6586A + ", subErrorCode: " + this.f6587B + ", errorType: " + this.f6588C + ", errorMessage: " + m34226c() + "}";
        Intrinsics.checkIfNull(str, "StringBuilder(\"{HttpStat…(\"}\")\n        .toString()");
        return str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f6595z);
        parcel.writeInt(this.f6586A);
        parcel.writeInt(this.f6587B);
        parcel.writeString(this.f6588C);
        parcel.writeString(m34226c());
        parcel.writeString(this.f6589D);
        parcel.writeString(this.f6590E);
    }

    public /* synthetic */ FacebookRequestError(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    private FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z) {
        boolean z2;
        EnumC2269a m761c;
        this.f6595z = i;
        this.f6586A = i2;
        this.f6587B = i3;
        this.f6588C = str;
        this.f6589D = str3;
        this.f6590E = str4;
        this.f6591F = obj;
        this.f6592w = str2;
        if (facebookException != null) {
            this.f6593x = facebookException;
            z2 = true;
        } else {
            this.f6593x = new FacebookServiceException(this, m34226c());
            z2 = false;
        }
        if (z2) {
            m761c = EnumC2269a.OTHER;
        } else {
            m761c = f6596H.m34218b().m761c(i2, i3, z);
        }
        this.f6594y = m761c;
        f6596H.m34218b().m760d(m761c);
    }

    public FacebookRequestError(HttpURLConnection httpURLConnection, Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc), false);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }
}
