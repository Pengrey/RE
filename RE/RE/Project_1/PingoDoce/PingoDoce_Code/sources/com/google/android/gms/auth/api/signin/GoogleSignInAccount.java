package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p008a7.C0066a;
import p078e7.C5006g;
import p364t6.C10386b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C2417c();

    /* renamed from: A */
    private String f7031A;

    /* renamed from: B */
    private Uri f7032B;

    /* renamed from: C */
    private String f7033C;

    /* renamed from: D */
    private long f7034D;

    /* renamed from: E */
    private String f7035E;

    /* renamed from: F */
    List<Scope> f7036F;

    /* renamed from: G */
    private String f7037G;

    /* renamed from: H */
    private String f7038H;

    /* renamed from: I */
    private Set<Scope> f7039I = new HashSet();

    /* renamed from: w */
    final int f7040w;

    /* renamed from: x */
    private String f7041x;

    /* renamed from: y */
    private String f7042y;

    /* renamed from: z */
    private String f7043z;

    static {
        C5006g.m25911d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f7040w = i;
        this.f7041x = str;
        this.f7042y = str2;
        this.f7043z = str3;
        this.f7031A = str4;
        this.f7032B = uri;
        this.f7033C = str5;
        this.f7034D = j;
        this.f7035E = str6;
        this.f7036F = list;
        this.f7037G = str7;
        this.f7038H = str8;
    }

    /* renamed from: I */
    public static GoogleSignInAccount m33627I(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l.longValue(), C2597i.m33080f(str7), new ArrayList((Collection) C2597i.m33076j(set)), str5, str6);
    }

    /* renamed from: J */
    public static GoogleSignInAccount m33626J(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount m33627I = m33627I(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        m33627I.f7033C = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return m33627I;
    }

    /* renamed from: D */
    public String m33632D() {
        return this.f7041x;
    }

    /* renamed from: E */
    public String m33631E() {
        return this.f7042y;
    }

    /* renamed from: F */
    public Uri m33630F() {
        return this.f7032B;
    }

    /* renamed from: G */
    public Set<Scope> m33629G() {
        HashSet hashSet = new HashSet(this.f7036F);
        hashSet.addAll(this.f7039I);
        return hashSet;
    }

    /* renamed from: H */
    public String m33628H() {
        return this.f7033C;
    }

    /* renamed from: K */
    public final String m33625K() {
        return this.f7035E;
    }

    /* renamed from: L */
    public final String m33624L() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (m33632D() != null) {
                jSONObject.put("id", m33632D());
            }
            if (m33631E() != null) {
                jSONObject.put("tokenId", m33631E());
            }
            if (m33621t() != null) {
                jSONObject.put("email", m33621t());
            }
            if (m33622h() != null) {
                jSONObject.put("displayName", m33622h());
            }
            if (m33619y() != null) {
                jSONObject.put("givenName", m33619y());
            }
            if (m33620v() != null) {
                jSONObject.put("familyName", m33620v());
            }
            Uri m33630F = m33630F();
            if (m33630F != null) {
                jSONObject.put("photoUrl", m33630F.toString());
            }
            if (m33628H() != null) {
                jSONObject.put("serverAuthCode", m33628H());
            }
            jSONObject.put("expirationTime", this.f7034D);
            jSONObject.put("obfuscatedIdentifier", this.f7035E);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = this.f7036F;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, C10386b.f27017w);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.m33512h());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public Account m33623b() {
        String str = this.f7043z;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof GoogleSignInAccount) {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
            return googleSignInAccount.f7035E.equals(this.f7035E) && googleSignInAccount.m33629G().equals(m33629G());
        }
        return false;
    }

    /* renamed from: h */
    public String m33622h() {
        return this.f7031A;
    }

    public int hashCode() {
        return ((this.f7035E.hashCode() + 527) * 31) + m33629G().hashCode();
    }

    /* renamed from: t */
    public String m33621t() {
        return this.f7043z;
    }

    /* renamed from: v */
    public String m33620v() {
        return this.f7038H;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42009l(parcel, 1, this.f7040w);
        C0066a.m42003r(parcel, 2, m33632D(), false);
        C0066a.m42003r(parcel, 3, m33631E(), false);
        C0066a.m42003r(parcel, 4, m33621t(), false);
        C0066a.m42003r(parcel, 5, m33622h(), false);
        C0066a.m42004q(parcel, 6, m33630F(), i, false);
        C0066a.m42003r(parcel, 7, m33628H(), false);
        C0066a.m42006o(parcel, 8, this.f7034D);
        C0066a.m42003r(parcel, 9, this.f7035E, false);
        C0066a.m41999v(parcel, 10, this.f7036F, false);
        C0066a.m42003r(parcel, 11, m33619y(), false);
        C0066a.m42003r(parcel, 12, m33620v(), false);
        C0066a.m42019b(parcel, m42020a);
    }

    /* renamed from: y */
    public String m33619y() {
        return this.f7037G;
    }
}
