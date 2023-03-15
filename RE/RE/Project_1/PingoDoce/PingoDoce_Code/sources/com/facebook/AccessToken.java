package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.LegacyTokenHelper;
import com.facebook.internal.Utility;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p181jd.Intrinsics;
import p233m4.AccessTokenManager;
import p482z4.Validate;
import p489zc.C13780s;

/* compiled from: AccessToken.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0018B\u008b\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015¨\u0006\u0019"}, m20207d2 = {"Lcom/facebook/AccessToken;", "Landroid/os/Parcelable;", BuildConfig.VERSION_NAME, "accessToken", "applicationId", "userId", BuildConfig.VERSION_NAME, "permissions", "declinedPermissions", "expiredPermissions", "Lcom/facebook/a;", "accessTokenSource", "Ljava/util/Date;", "expirationTime", "lastRefreshTime", "dataAccessExpirationTime", "graphDomain", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lcom/facebook/a;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "L", "a", "c", "facebook-core_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AccessToken implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    /* renamed from: H */
    private static final Date f6568H;

    /* renamed from: I */
    private static final Date f6569I;

    /* renamed from: J */
    private static final Date f6570J;

    /* renamed from: K */
    private static final EnumC2289a f6571K;

    /* renamed from: L */
    public static final C2265c f6572L = new C2265c(null);

    /* renamed from: A */
    private final String f6573A;

    /* renamed from: B */
    private final EnumC2289a f6574B;

    /* renamed from: C */
    private final Date f6575C;

    /* renamed from: D */
    private final String f6576D;

    /* renamed from: E */
    private final String f6577E;

    /* renamed from: F */
    private final Date f6578F;

    /* renamed from: G */
    private final String f6579G;

    /* renamed from: w */
    private final Date f6580w;

    /* renamed from: x */
    private final Set f6581x;

    /* renamed from: y */
    private final Set f6582y;

    /* renamed from: z */
    private final Set f6583z;

    /* compiled from: AccessToken.kt */
    /* renamed from: com.facebook.AccessToken$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2263a {
        /* renamed from: a */
        void m34240a(FacebookException facebookException);

        /* renamed from: b */
        void m34239b(AccessToken accessToken);
    }

    /* compiled from: AccessToken.kt */
    /* renamed from: com.facebook.AccessToken$b */
    /* loaded from: classes.dex */
    public static final class C2264b implements Parcelable.Creator {
        C2264b() {
        }

        /* renamed from: a */
        public AccessToken createFromParcel(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "source");
            return new AccessToken(parcel);
        }

        /* renamed from: b */
        public AccessToken[] newArray(int i) {
            return new AccessToken[i];
        }
    }

    /* compiled from: AccessToken.kt */
    /* renamed from: com.facebook.AccessToken$c */
    /* loaded from: classes.dex */
    public static final class C2265c {
        private C2265c() {
        }

        /* renamed from: a */
        public final AccessToken m34236a(AccessToken accessToken) {
            Intrinsics.isThisObjectNull(accessToken, "current");
            return new AccessToken(accessToken.m34246n(), accessToken.m34256b(), accessToken.m34245r(), accessToken.m34248k(), accessToken.m34253e(), accessToken.m34252f(), accessToken.m34247m(), new Date(), new Date(), accessToken.m34254d(), null, 1024, null);
        }

        /* renamed from: b */
        public final AccessToken m34235b(JSONObject jSONObject) throws JSONException {
            Collection m33976H;
            Intrinsics.isThisObjectNull(jSONObject, "jsonObject");
            if (jSONObject.getInt("version") <= 1) {
                String string = jSONObject.getString("token");
                Date date = new Date(jSONObject.getLong("expires_at"));
                JSONArray jSONArray = jSONObject.getJSONArray("permissions");
                JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
                JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
                Date date2 = new Date(jSONObject.getLong("last_refresh"));
                String string2 = jSONObject.getString("source");
                Intrinsics.checkIfNull(string2, "jsonObject.getString(SOURCE_KEY)");
                EnumC2289a valueOf = EnumC2289a.valueOf(string2);
                String string3 = jSONObject.getString("application_id");
                String string4 = jSONObject.getString("user_id");
                Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0L));
                String optString = jSONObject.optString("graph_domain", null);
                Intrinsics.checkIfNull(string, "token");
                Intrinsics.checkIfNull(string3, "applicationId");
                Intrinsics.checkIfNull(string4, "userId");
                Intrinsics.checkIfNull(jSONArray, "permissionsArray");
                List m33976H2 = Utility.m33976H(jSONArray);
                Intrinsics.checkIfNull(jSONArray2, "declinedPermissionsArray");
                List m33976H3 = Utility.m33976H(jSONArray2);
                if (optJSONArray == null) {
                    m33976H = new ArrayList();
                } else {
                    m33976H = Utility.m33976H(optJSONArray);
                }
                return new AccessToken(string, string3, string4, m33976H2, m33976H3, m33976H, valueOf, date, date2, date3, optString);
            }
            throw new FacebookException("Unknown AccessToken serialization format.");
        }

        /* renamed from: c */
        public final AccessToken m34234c(Bundle bundle) {
            String string;
            Intrinsics.isThisObjectNull(bundle, "bundle");
            List m34231f = m34231f(bundle, "com.facebook.TokenCachingStrategy.Permissions");
            List m34231f2 = m34231f(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List m34231f3 = m34231f(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            LegacyTokenHelper.C2304a c2304a = LegacyTokenHelper.f6673d;
            String m34070a = c2304a.m34070a(bundle);
            if (Utility.m33977G(m34070a)) {
                m34070a = C2290b.m34109f();
            }
            String str = m34070a;
            String m34065f = c2304a.m34065f(bundle);
            if (m34065f != null) {
                JSONObject m33956b = Utility.m33956b(m34065f);
                if (m33956b != null) {
                    try {
                        string = m33956b.getString("id");
                    } catch (JSONException unused) {
                        return null;
                    }
                } else {
                    string = null;
                }
                if (str != null && string != null) {
                    return new AccessToken(m34065f, str, string, m34231f, m34231f2, m34231f3, c2304a.m34066e(bundle), c2304a.m34068c(bundle), c2304a.m34067d(bundle), null, null, 1024, null);
                }
            }
            return null;
        }

        /* renamed from: d */
        public final void m34233d() {
            AccessToken m19175g = AccessTokenManager.f18884g.m19161e().m19175g();
            if (m19175g != null) {
                m34229h(m34236a(m19175g));
            }
        }

        /* renamed from: e */
        public final AccessToken m34232e() {
            return AccessTokenManager.f18884g.m19161e().m19175g();
        }

        /* renamed from: f */
        public final List m34231f(Bundle bundle, String str) {
            List m197g;
            Intrinsics.isThisObjectNull(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                m197g = C13780s.m197g();
                return m197g;
            }
            List unmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            Intrinsics.checkIfNull(unmodifiableList, "Collections.unmodifiable…ist(originalPermissions))");
            return unmodifiableList;
        }

        /* renamed from: g */
        public final boolean m34230g() {
            AccessToken m19175g = AccessTokenManager.f18884g.m19161e().m19175g();
            return (m19175g == null || m19175g.m34243t()) ? false : true;
        }

        /* renamed from: h */
        public final void m34229h(AccessToken accessToken) {
            AccessTokenManager.f18884g.m19161e().m19169m(accessToken);
        }

        public /* synthetic */ C2265c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f6568H = date;
        f6569I = date;
        f6570J = new Date();
        f6571K = EnumC2289a.FACEBOOK_APPLICATION_WEB;
        CREATOR = new C2264b();
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, EnumC2289a enumC2289a, Date date, Date date2, Date date3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, collection, collection2, collection3, enumC2289a, date, date2, date3, (i & 1024) != 0 ? null : str4);
    }

    /* renamed from: a */
    private final void m34257a(StringBuilder sb2) {
        sb2.append(" permissions:");
        sb2.append("[");
        sb2.append(TextUtils.join(", ", this.f6581x));
        sb2.append("]");
    }

    /* renamed from: c */
    public static final AccessToken m34255c() {
        return f6572L.m34232e();
    }

    /* renamed from: s */
    public static final boolean m34244s() {
        return f6572L.m34230g();
    }

    /* renamed from: w */
    private final String m34241w() {
        return C2290b.m34093v(EnumC2305f.INCLUDE_ACCESS_TOKENS) ? this.f6573A : "ACCESS_TOKEN_REMOVED";
    }

    /* renamed from: b */
    public final String m34256b() {
        return this.f6576D;
    }

    /* renamed from: d */
    public final Date m34254d() {
        return this.f6578F;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Set m34253e() {
        return this.f6582y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessToken) {
            AccessToken accessToken = (AccessToken) obj;
            if (Intrinsics.equals(this.f6580w, accessToken.f6580w) && Intrinsics.equals(this.f6581x, accessToken.f6581x) && Intrinsics.equals(this.f6582y, accessToken.f6582y) && Intrinsics.equals(this.f6583z, accessToken.f6583z) && Intrinsics.equals(this.f6573A, accessToken.f6573A) && this.f6574B == accessToken.f6574B && Intrinsics.equals(this.f6575C, accessToken.f6575C) && Intrinsics.equals(this.f6576D, accessToken.f6576D) && Intrinsics.equals(this.f6577E, accessToken.f6577E) && Intrinsics.equals(this.f6578F, accessToken.f6578F)) {
                String str = this.f6579G;
                String str2 = accessToken.f6579G;
                if (str == null ? str2 == null : Intrinsics.equals(str, str2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final Set m34252f() {
        return this.f6583z;
    }

    /* renamed from: h */
    public final Date m34251h() {
        return this.f6580w;
    }

    public int hashCode() {
        int hashCode = (((((((((((((((((((527 + this.f6580w.hashCode()) * 31) + this.f6581x.hashCode()) * 31) + this.f6582y.hashCode()) * 31) + this.f6583z.hashCode()) * 31) + this.f6573A.hashCode()) * 31) + this.f6574B.hashCode()) * 31) + this.f6575C.hashCode()) * 31) + this.f6576D.hashCode()) * 31) + this.f6577E.hashCode()) * 31) + this.f6578F.hashCode()) * 31;
        String str = this.f6579G;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: i */
    public final String m34250i() {
        return this.f6579G;
    }

    /* renamed from: j */
    public final Date m34249j() {
        return this.f6575C;
    }

    /* renamed from: k */
    public final Set m34248k() {
        return this.f6581x;
    }

    /* renamed from: m */
    public final EnumC2289a m34247m() {
        return this.f6574B;
    }

    /* renamed from: n */
    public final String m34246n() {
        return this.f6573A;
    }

    /* renamed from: r */
    public final String m34245r() {
        return this.f6577E;
    }

    /* renamed from: t */
    public final boolean m34243t() {
        return new Date().after(this.f6580w);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{AccessToken");
        sb2.append(" token:");
        sb2.append(m34241w());
        m34257a(sb2);
        sb2.append("}");
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "builder.toString()");
        return sb3;
    }

    /* renamed from: v */
    public final JSONObject m34242v() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f6573A);
        jSONObject.put("expires_at", this.f6580w.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f6581x));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f6582y));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f6583z));
        jSONObject.put("last_refresh", this.f6575C.getTime());
        jSONObject.put("source", this.f6574B.name());
        jSONObject.put("application_id", this.f6576D);
        jSONObject.put("user_id", this.f6577E);
        jSONObject.put("data_access_expiration_time", this.f6578F.getTime());
        String str = this.f6579G;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "dest");
        parcel.writeLong(this.f6580w.getTime());
        parcel.writeStringList(new ArrayList(this.f6581x));
        parcel.writeStringList(new ArrayList(this.f6582y));
        parcel.writeStringList(new ArrayList(this.f6583z));
        parcel.writeString(this.f6573A);
        parcel.writeString(this.f6574B.name());
        parcel.writeLong(this.f6575C.getTime());
        parcel.writeString(this.f6576D);
        parcel.writeString(this.f6577E);
        parcel.writeLong(this.f6578F.getTime());
        parcel.writeString(this.f6579G);
    }

    public AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, EnumC2289a enumC2289a, Date date, Date date2, Date date3, String str4) {
        Intrinsics.isThisObjectNull(str, "accessToken");
        Intrinsics.isThisObjectNull(str2, "applicationId");
        Intrinsics.isThisObjectNull(str3, "userId");
        Validate.m674d(str, "accessToken");
        Validate.m674d(str2, "applicationId");
        Validate.m674d(str3, "userId");
        this.f6580w = date == null ? f6569I : date;
        Set unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        Intrinsics.checkIfNull(unmodifiableSet, "Collections.unmodifiable…missions) else HashSet())");
        this.f6581x = unmodifiableSet;
        Set unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        Intrinsics.checkIfNull(unmodifiableSet2, "Collections.unmodifiable…missions) else HashSet())");
        this.f6582y = unmodifiableSet2;
        Set unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        Intrinsics.checkIfNull(unmodifiableSet3, "Collections.unmodifiable…missions) else HashSet())");
        this.f6583z = unmodifiableSet3;
        this.f6573A = str;
        this.f6574B = enumC2289a == null ? f6571K : enumC2289a;
        this.f6575C = date2 == null ? f6570J : date2;
        this.f6576D = str2;
        this.f6577E = str3;
        this.f6578F = (date3 == null || date3.getTime() == 0) ? f6569I : date3;
        this.f6579G = str4;
    }

    public AccessToken(Parcel parcel) {
        EnumC2289a enumC2289a;
        Intrinsics.isThisObjectNull(parcel, "parcel");
        this.f6580w = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkIfNull(unmodifiableSet, "Collections.unmodifiable…HashSet(permissionsList))");
        this.f6581x = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkIfNull(unmodifiableSet2, "Collections.unmodifiable…HashSet(permissionsList))");
        this.f6582y = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkIfNull(unmodifiableSet3, "Collections.unmodifiable…HashSet(permissionsList))");
        this.f6583z = unmodifiableSet3;
        String readString = parcel.readString();
        Validate.m670h(readString, "token");
        if (readString != null) {
            this.f6573A = readString;
            String readString2 = parcel.readString();
            if (readString2 != null) {
                enumC2289a = EnumC2289a.valueOf(readString2);
            } else {
                enumC2289a = f6571K;
            }
            this.f6574B = enumC2289a;
            this.f6575C = new Date(parcel.readLong());
            String readString3 = parcel.readString();
            Validate.m670h(readString3, "applicationId");
            if (readString3 != null) {
                this.f6576D = readString3;
                String readString4 = parcel.readString();
                Validate.m670h(readString4, "userId");
                if (readString4 != null) {
                    this.f6577E = readString4;
                    this.f6578F = new Date(parcel.readLong());
                    this.f6579G = parcel.readString();
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
