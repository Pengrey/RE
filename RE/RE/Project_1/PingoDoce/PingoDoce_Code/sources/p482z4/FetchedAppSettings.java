package p482z4;

import android.net.Uri;
import com.facebook.internal.Utility;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;
import p181jd.Intrinsics;
import p489zc.C13777q;
import sd.C10171u;

/* renamed from: z4.g */
/* loaded from: classes.dex */
public final class FetchedAppSettings {

    /* renamed from: a */
    private final boolean f34670a;

    /* renamed from: b */
    private final int f34671b;

    /* renamed from: c */
    private final Map f34672c;

    /* renamed from: d */
    private final boolean f34673d;

    /* renamed from: e */
    private final C13633a f34674e;

    /* renamed from: f */
    private final boolean f34675f;

    /* renamed from: g */
    private final boolean f34676g;

    /* renamed from: h */
    private final JSONArray f34677h;

    /* renamed from: i */
    private final String f34678i;

    /* renamed from: j */
    private final String f34679j;

    /* renamed from: k */
    private final String f34680k;

    /* renamed from: l */
    private final String f34681l;

    /* compiled from: FetchedAppSettings.kt */
    /* renamed from: z4.g$a */
    /* loaded from: classes.dex */
    public static final class C13641a {
        private C13641a() {
        }

        public /* synthetic */ C13641a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: FetchedAppSettings.kt */
    /* renamed from: z4.g$b */
    /* loaded from: classes.dex */
    public static final class C13642b {

        /* renamed from: c */
        public static final C13643a f34682c = new C13643a(null);

        /* renamed from: a */
        private final String f34683a;

        /* renamed from: b */
        private final String f34684b;

        /* compiled from: FetchedAppSettings.kt */
        /* renamed from: z4.g$b$a */
        /* loaded from: classes.dex */
        public static final class C13643a {
            private C13643a() {
            }

            /* renamed from: b */
            private final int[] m726b(JSONArray jSONArray) {
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    int[] iArr = new int[length];
                    for (int i = 0; i < length; i++) {
                        int i2 = -1;
                        int optInt = jSONArray.optInt(i, -1);
                        if (optInt == -1) {
                            String optString = jSONArray.optString(i);
                            if (!Utility.m33977G(optString)) {
                                try {
                                    Intrinsics.checkIfNull(optString, "versionString");
                                    i2 = Integer.parseInt(optString);
                                } catch (NumberFormatException e) {
                                    Utility.m33974J("FacebookSDK", e);
                                }
                                optInt = i2;
                            }
                        }
                        iArr[i] = optInt;
                    }
                    return iArr;
                }
                return null;
            }

            /* renamed from: a */
            public final C13642b m727a(JSONObject jSONObject) {
                List m8883q0;
                Intrinsics.isThisObjectNull(jSONObject, "dialogConfigJSON");
                String optString = jSONObject.optString("name");
                if (Utility.m33977G(optString)) {
                    return null;
                }
                Intrinsics.checkIfNull(optString, "dialogNameWithFeature");
                m8883q0 = C10171u.m8883q0(optString, new String[]{"|"}, false, 0, 6, null);
                if (m8883q0.size() != 2) {
                    return null;
                }
                String str = (String) C13777q.m256L(m8883q0);
                String str2 = (String) C13777q.m249W(m8883q0);
                if (Utility.m33977G(str) || Utility.m33977G(str2)) {
                    return null;
                }
                String optString2 = jSONObject.optString("url");
                return new C13642b(str, str2, Utility.m33977G(optString2) ? null : Uri.parse(optString2), m726b(jSONObject.optJSONArray("versions")), null);
            }

            public /* synthetic */ C13643a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ C13642b(String str, String str2, Uri uri, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, uri, iArr);
        }

        /* renamed from: a */
        public final String m729a() {
            return this.f34683a;
        }

        /* renamed from: b */
        public final String m728b() {
            return this.f34684b;
        }

        private C13642b(String str, String str2, Uri uri, int[] iArr) {
            this.f34683a = str;
            this.f34684b = str2;
        }
    }

    static {
        new C13641a(null);
    }

    public FetchedAppSettings(boolean z, String str, boolean z2, int i, EnumSet enumSet, Map map, boolean z3, C13633a c13633a, String str2, String str3, boolean z4, boolean z5, JSONArray jSONArray, String str4, boolean z6, boolean z7, String str5, String str6, String str7) {
        Intrinsics.isThisObjectNull(str, "nuxContent");
        Intrinsics.isThisObjectNull(enumSet, "smartLoginOptions");
        Intrinsics.isThisObjectNull(map, "dialogConfigurations");
        Intrinsics.isThisObjectNull(c13633a, "errorClassification");
        Intrinsics.isThisObjectNull(str2, "smartLoginBookmarkIconURL");
        Intrinsics.isThisObjectNull(str3, "smartLoginMenuIconURL");
        Intrinsics.isThisObjectNull(str4, "sdkUpdateMessage");
        this.f34670a = z;
        this.f34671b = i;
        this.f34672c = map;
        this.f34673d = z3;
        this.f34674e = c13633a;
        this.f34675f = z4;
        this.f34676g = z5;
        this.f34677h = jSONArray;
        this.f34678i = str4;
        this.f34679j = str5;
        this.f34680k = str6;
        this.f34681l = str7;
    }

    /* renamed from: a */
    public final boolean m740a() {
        return this.f34673d;
    }

    /* renamed from: b */
    public final boolean m739b() {
        return this.f34676g;
    }

    /* renamed from: c */
    public final C13633a m738c() {
        return this.f34674e;
    }

    /* renamed from: d */
    public final JSONArray m737d() {
        return this.f34677h;
    }

    /* renamed from: e */
    public final boolean m736e() {
        return this.f34675f;
    }

    /* renamed from: f */
    public final String m735f() {
        return this.f34679j;
    }

    /* renamed from: g */
    public final String m734g() {
        return this.f34681l;
    }

    /* renamed from: h */
    public final String m733h() {
        return this.f34678i;
    }

    /* renamed from: i */
    public final int m732i() {
        return this.f34671b;
    }

    /* renamed from: j */
    public final String m731j() {
        return this.f34680k;
    }

    /* renamed from: k */
    public final boolean m730k() {
        return this.f34670a;
    }
}
