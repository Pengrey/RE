package p248n4;

import android.os.Build;
import android.os.Bundle;
import com.facebook.EnumC2305f;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.joda.time.DateTimeConstants;
import org.json.JSONException;
import org.json.JSONObject;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p328r4.EventDeactivationManager;
import p362t4.C10380a;
import p377u4.AppEventUtility;
import p437x4.RestrictiveDataManager;
import p468yc.C13195u;
import p482z4.Logger;
import p489zc.MutableCollectionsJVM;
import sd.C10156i;

/* renamed from: n4.c */
/* loaded from: classes.dex */
public final class AppEvent implements Serializable {

    /* renamed from: A */
    private final String f20202A;

    /* renamed from: w */
    private final JSONObject f20203w;

    /* renamed from: x */
    private final boolean f20204x;

    /* renamed from: y */
    private final boolean f20205y;

    /* renamed from: z */
    private final String f20206z;

    /* renamed from: C */
    public static final C7647a f20207C = new C7647a(null);

    /* renamed from: B */
    private static final HashSet f20208B = new HashSet();

    /* compiled from: AppEvent.kt */
    /* renamed from: n4.c$a */
    /* loaded from: classes.dex */
    public static final class C7647a {
        private C7647a() {
        }

        /* renamed from: a */
        public static final /* synthetic */ String m17849a(C7647a c7647a, String str) {
            return c7647a.m17847c(str);
        }

        /* renamed from: b */
        public static final /* synthetic */ void m17848b(C7647a c7647a, String str) {
            c7647a.m17846d(str);
        }

        /* renamed from: c */
        private final String m17847c(String str) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Charset forName = Charset.forName("UTF-8");
                Intrinsics.checkIfNull(forName, "Charset.forName(charsetName)");
                if (str != null) {
                    byte[] bytes = str.getBytes(forName);
                    Intrinsics.checkIfNull(bytes, "(this as java.lang.String).getBytes(charset)");
                    messageDigest.update(bytes, 0, bytes.length);
                    byte[] digest = messageDigest.digest();
                    Intrinsics.checkIfNull(digest, "digest.digest()");
                    return AppEventUtility.m6945c(digest);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (UnsupportedEncodingException e) {
                Utility.m33974J("Failed to generate checksum: ", e);
                return "1";
            } catch (NoSuchAlgorithmException e2) {
                Utility.m33974J("Failed to generate checksum: ", e2);
                return "0";
            }
        }

        /* renamed from: d */
        private final void m17846d(String str) {
            boolean contains;
            if (str != null) {
                if (!(str.length() == 0) && str.length() <= 40) {
                    synchronized (AppEvent.m17858a()) {
                        contains = AppEvent.m17858a().contains(str);
                        C13195u c13195u = C13195u.f34156a;
                    }
                    if (contains) {
                        return;
                    }
                    if (new C10156i("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").m9021d(str)) {
                        synchronized (AppEvent.m17858a()) {
                            AppEvent.m17858a().add(str);
                        }
                        return;
                    }
                    C6429c0 c6429c0 = C6429c0.f17515a;
                    String format = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
                    Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
                    throw new FacebookException(format);
                }
            }
            if (str == null) {
                str = "<None Provided>";
            }
            C6429c0 c6429c02 = C6429c0.f17515a;
            String format2 = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
            Intrinsics.checkIfNull(format2, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format2);
        }

        public /* synthetic */ C7647a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AppEvent.kt */
    /* renamed from: n4.c$b */
    /* loaded from: classes.dex */
    public static final class C7648b implements Serializable {

        /* renamed from: w */
        private final String f20209w;

        /* renamed from: x */
        private final boolean f20210x;

        /* renamed from: y */
        private final boolean f20211y;

        /* renamed from: z */
        private final String f20212z;

        /* compiled from: AppEvent.kt */
        /* renamed from: n4.c$b$a */
        /* loaded from: classes.dex */
        public static final class C7649a {
            private C7649a() {
            }

            public /* synthetic */ C7649a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C7649a(null);
        }

        public C7648b(String str, boolean z, boolean z2, String str2) {
            Intrinsics.isThisObjectNull(str, "jsonString");
            this.f20209w = str;
            this.f20210x = z;
            this.f20211y = z2;
            this.f20212z = str2;
        }

        private final Object readResolve() throws JSONException, ObjectStreamException {
            return new AppEvent(this.f20209w, this.f20210x, this.f20211y, this.f20212z, null);
        }
    }

    public /* synthetic */ AppEvent(String str, boolean z, boolean z2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z2, str2);
    }

    /* renamed from: a */
    public static final /* synthetic */ HashSet m17858a() {
        return f20208B;
    }

    /* renamed from: b */
    private final String m17857b() {
        if (Build.VERSION.SDK_INT > 19) {
            C7647a c7647a = f20207C;
            String jSONObject = this.f20203w.toString();
            Intrinsics.checkIfNull(jSONObject, "jsonObject.toString()");
            return C7647a.m17849a(c7647a, jSONObject);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = this.f20203w.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        MutableCollectionsJVM.m185s(arrayList);
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb2.append(str);
            sb2.append(" = ");
            sb2.append(this.f20203w.optString(str));
            sb2.append('\n');
        }
        C7647a c7647a2 = f20207C;
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "sb.toString()");
        return C7647a.m17849a(c7647a2, sb3);
    }

    /* renamed from: d */
    private final JSONObject m17855d(String str, String str2, Double d, Bundle bundle, UUID uuid) {
        C7647a c7647a = f20207C;
        C7647a.m17848b(c7647a, str2);
        JSONObject jSONObject = new JSONObject();
        String m3133e = RestrictiveDataManager.m3133e(str2);
        jSONObject.put("_eventName", m3133e);
        jSONObject.put("_eventName_md5", C7647a.m17849a(c7647a, m3133e));
        jSONObject.put("_logTime", System.currentTimeMillis() / ((long) DateTimeConstants.MILLIS_PER_SECOND));
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map m17850i = m17850i(bundle);
            for (String str3 : m17850i.keySet()) {
                jSONObject.put(str3, m17850i.get(str3));
            }
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        if (this.f20205y) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f20204x) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            Logger.C13648a c13648a = Logger.f34697f;
            EnumC2305f enumC2305f = EnumC2305f.APP_EVENTS;
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkIfNull(jSONObject2, "eventObject.toString()");
            c13648a.m701d(enumC2305f, "AppEvents", "Created app event '%s'", jSONObject2);
        }
        return jSONObject;
    }

    /* renamed from: i */
    private final Map m17850i(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            C7647a c7647a = f20207C;
            Intrinsics.checkIfNull(str, "key");
            C7647a.m17848b(c7647a, str);
            Object obj = bundle.get(str);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                C6429c0 c6429c0 = C6429c0.f17515a;
                String format = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2));
                Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
                throw new FacebookException(format);
            }
            hashMap.put(str, obj.toString());
        }
        C10380a.m8086c(hashMap);
        RestrictiveDataManager.m3132f(hashMap, this.f20206z);
        EventDeactivationManager.m9925c(hashMap, this.f20206z);
        return hashMap;
    }

    private final Object writeReplace() throws ObjectStreamException {
        String jSONObject = this.f20203w.toString();
        Intrinsics.checkIfNull(jSONObject, "jsonObject.toString()");
        return new C7648b(jSONObject, this.f20204x, this.f20205y, this.f20202A);
    }

    /* renamed from: c */
    public final boolean m17856c() {
        return this.f20204x;
    }

    /* renamed from: e */
    public final JSONObject m17854e() {
        return this.f20203w;
    }

    /* renamed from: f */
    public final String m17853f() {
        return this.f20206z;
    }

    /* renamed from: g */
    public final boolean m17852g() {
        if (this.f20202A == null) {
            return true;
        }
        return Intrinsics.equals(m17857b(), this.f20202A);
    }

    /* renamed from: h */
    public final boolean m17851h() {
        return this.f20204x;
    }

    public String toString() {
        C6429c0 c6429c0 = C6429c0.f17515a;
        String format = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.f20203w.optString("_eventName"), Boolean.valueOf(this.f20204x), this.f20203w.toString()}, 3));
        Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public AppEvent(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid) throws JSONException, FacebookException {
        Intrinsics.isThisObjectNull(str, "contextName");
        Intrinsics.isThisObjectNull(str2, "eventName");
        this.f20204x = z;
        this.f20205y = z2;
        this.f20206z = str2;
        this.f20203w = m17855d(str, str2, d, bundle, uuid);
        this.f20202A = m17857b();
    }

    private AppEvent(String str, boolean z, boolean z2, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f20203w = jSONObject;
        this.f20204x = z;
        String optString = jSONObject.optString("_eventName");
        Intrinsics.checkIfNull(optString, "jsonObject.optString(Con…nts.EVENT_NAME_EVENT_KEY)");
        this.f20206z = optString;
        this.f20202A = str2;
        this.f20205y = z2;
    }
}
