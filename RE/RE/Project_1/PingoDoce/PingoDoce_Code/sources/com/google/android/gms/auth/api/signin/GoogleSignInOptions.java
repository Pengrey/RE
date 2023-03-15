package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p008a7.C0066a;
import p379u6.C10842a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements C2461a.InterfaceC2465d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: H */
    public static final GoogleSignInOptions f7044H;

    /* renamed from: I */
    public static final Scope f7045I = new Scope("profile");

    /* renamed from: J */
    public static final Scope f7046J;

    /* renamed from: K */
    public static final Scope f7047K;

    /* renamed from: L */
    public static final Scope f7048L;

    /* renamed from: M */
    private static Comparator<Scope> f7049M;

    /* renamed from: A */
    private final boolean f7050A;

    /* renamed from: B */
    private final boolean f7051B;

    /* renamed from: C */
    private String f7052C;

    /* renamed from: D */
    private String f7053D;

    /* renamed from: E */
    private ArrayList<GoogleSignInOptionsExtensionParcelable> f7054E;

    /* renamed from: F */
    private String f7055F;

    /* renamed from: G */
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> f7056G;

    /* renamed from: w */
    final int f7057w;

    /* renamed from: x */
    private final ArrayList<Scope> f7058x;

    /* renamed from: y */
    private Account f7059y;

    /* renamed from: z */
    private boolean f7060z;

    static {
        new Scope("email");
        f7046J = new Scope("openid");
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f7047K = scope;
        f7048L = new Scope("https://www.googleapis.com/auth/games");
        C2414a c2414a = new C2414a();
        c2414a.m33596b();
        c2414a.m33595c();
        f7044H = c2414a.m33597a();
        C2414a c2414a2 = new C2414a();
        c2414a2.m33594d(scope, new Scope[0]);
        c2414a2.m33597a();
        CREATOR = new C2419e();
        f7049M = new C2418d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2, String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, m33603S(arrayList2), str3);
    }

    /* renamed from: H */
    public static GoogleSignInOptions m33614H(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> m33603S(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.m33587h()), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    /* renamed from: D */
    public boolean m33618D() {
        return this.f7051B;
    }

    /* renamed from: E */
    public boolean m33617E() {
        return this.f7060z;
    }

    /* renamed from: F */
    public boolean m33616F() {
        return this.f7050A;
    }

    /* renamed from: L */
    public final String m33610L() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f7058x, f7049M);
            Iterator<Scope> it = this.f7058x.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m33512h());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f7059y;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f7060z);
            jSONObject.put("forceCodeForRefreshToken", this.f7051B);
            jSONObject.put("serverAuthRequested", this.f7050A);
            if (!TextUtils.isEmpty(this.f7052C)) {
                jSONObject.put("serverClientId", this.f7052C);
            }
            if (!TextUtils.isEmpty(this.f7053D)) {
                jSONObject.put("hostedDomain", this.f7053D);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public Account m33602b() {
        return this.f7059y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r1.equals(r4.m33602b()) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.f7054E     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 > 0) goto L90
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.f7054E     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 <= 0) goto L18
            goto L90
        L18:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f7058x     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.m33599v()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f7058x     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.m33599v()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.f7059y     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.m33602b()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.m33602b()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.f7052C     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.m33598y()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.f7052C     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.m33598y()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.f7051B     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.m33618D()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f7060z     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.m33617E()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f7050A     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.m33616F()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.f7055F     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.m33600t()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    /* renamed from: h */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> m33601h() {
        return this.f7054E;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f7058x;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList2.get(i).m33512h());
        }
        Collections.sort(arrayList);
        C10842a c10842a = new C10842a();
        c10842a.m6895a(arrayList);
        c10842a.m6895a(this.f7059y);
        c10842a.m6895a(this.f7052C);
        c10842a.m6893c(this.f7051B);
        c10842a.m6893c(this.f7060z);
        c10842a.m6893c(this.f7050A);
        c10842a.m6895a(this.f7055F);
        return c10842a.m6894b();
    }

    /* renamed from: t */
    public String m33600t() {
        return this.f7055F;
    }

    /* renamed from: v */
    public ArrayList<Scope> m33599v() {
        return new ArrayList<>(this.f7058x);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42009l(parcel, 1, this.f7057w);
        C0066a.m41999v(parcel, 2, m33599v(), false);
        C0066a.m42004q(parcel, 3, m33602b(), i, false);
        C0066a.m42018c(parcel, 4, m33617E());
        C0066a.m42018c(parcel, 5, m33616F());
        C0066a.m42018c(parcel, 6, m33618D());
        C0066a.m42003r(parcel, 7, m33598y(), false);
        C0066a.m42003r(parcel, 8, this.f7053D, false);
        C0066a.m41999v(parcel, 9, m33601h(), false);
        C0066a.m42003r(parcel, 10, m33600t(), false);
        C0066a.m42019b(parcel, m42020a);
    }

    /* renamed from: y */
    public String m33598y() {
        return this.f7052C;
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    /* loaded from: classes.dex */
    public static final class C2414a {

        /* renamed from: a */
        private Set<Scope> f7061a;

        /* renamed from: b */
        private boolean f7062b;

        /* renamed from: c */
        private boolean f7063c;

        /* renamed from: d */
        private boolean f7064d;

        /* renamed from: e */
        private String f7065e;

        /* renamed from: f */
        private Account f7066f;

        /* renamed from: g */
        private String f7067g;

        /* renamed from: h */
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> f7068h;

        /* renamed from: i */
        private String f7069i;

        public C2414a() {
            this.f7061a = new HashSet();
            this.f7068h = new HashMap();
        }

        /* renamed from: a */
        public GoogleSignInOptions m33597a() {
            if (this.f7061a.contains(GoogleSignInOptions.f7048L)) {
                Set<Scope> set = this.f7061a;
                Scope scope = GoogleSignInOptions.f7047K;
                if (set.contains(scope)) {
                    this.f7061a.remove(scope);
                }
            }
            if (this.f7064d && (this.f7066f == null || !this.f7061a.isEmpty())) {
                m33596b();
            }
            return new GoogleSignInOptions(new ArrayList(this.f7061a), this.f7066f, this.f7064d, this.f7062b, this.f7063c, this.f7065e, this.f7067g, this.f7068h, this.f7069i);
        }

        /* renamed from: b */
        public C2414a m33596b() {
            this.f7061a.add(GoogleSignInOptions.f7046J);
            return this;
        }

        /* renamed from: c */
        public C2414a m33595c() {
            this.f7061a.add(GoogleSignInOptions.f7045I);
            return this;
        }

        /* renamed from: d */
        public C2414a m33594d(Scope scope, Scope... scopeArr) {
            this.f7061a.add(scope);
            this.f7061a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: e */
        public C2414a m33593e(String str) {
            this.f7069i = str;
            return this;
        }

        public C2414a(GoogleSignInOptions googleSignInOptions) {
            this.f7061a = new HashSet();
            this.f7068h = new HashMap();
            C2597i.m33076j(googleSignInOptions);
            this.f7061a = new HashSet(googleSignInOptions.f7058x);
            this.f7062b = googleSignInOptions.f7050A;
            this.f7063c = googleSignInOptions.f7051B;
            this.f7064d = googleSignInOptions.f7060z;
            this.f7065e = googleSignInOptions.f7052C;
            this.f7066f = googleSignInOptions.f7059y;
            this.f7067g = googleSignInOptions.f7053D;
            this.f7068h = GoogleSignInOptions.m33603S(googleSignInOptions.f7054E);
            this.f7069i = googleSignInOptions.f7055F;
        }
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map, String str3) {
        this.f7057w = i;
        this.f7058x = arrayList;
        this.f7059y = account;
        this.f7060z = z;
        this.f7050A = z2;
        this.f7051B = z3;
        this.f7052C = str;
        this.f7053D = str2;
        this.f7054E = new ArrayList<>(map.values());
        this.f7056G = map;
        this.f7055F = str3;
    }
}
