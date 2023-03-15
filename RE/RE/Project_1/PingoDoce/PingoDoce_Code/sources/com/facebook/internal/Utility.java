package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.C2290b;
import com.facebook.EnumC2303d;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p076e5.CrashShieldHandler;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p248n4.UserDataStore;
import p482z4.ProfileInformationCache;
import p482z4.Validate;
import sd.C10150d;
import sd.C10171u;

/* renamed from: com.facebook.internal.f */
/* loaded from: classes.dex */
public final class Utility {

    /* renamed from: a */
    private static int f6733a;

    /* renamed from: h */
    public static final Utility f6734h = new Utility();

    /* renamed from: b */
    private static long f6735b = -1;

    /* renamed from: c */
    private static long f6736c = -1;

    /* renamed from: d */
    private static long f6737d = -1;

    /* renamed from: e */
    private static String f6738e = BuildConfig.VERSION_NAME;

    /* renamed from: f */
    private static String f6739f = BuildConfig.VERSION_NAME;

    /* renamed from: g */
    private static String f6740g = "NoCarrier";

    /* compiled from: Utility.kt */
    /* renamed from: com.facebook.internal.f$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2327a {
        /* renamed from: a */
        void m33931a(FacebookException facebookException);

        /* renamed from: b */
        void m33930b(JSONObject jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Utility.kt */
    /* renamed from: com.facebook.internal.f$b */
    /* loaded from: classes.dex */
    public static final class C2328b implements GraphRequest.InterfaceC2278b {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2327a f6741a;

        /* renamed from: b */
        final /* synthetic */ String f6742b;

        C2328b(InterfaceC2327a interfaceC2327a, String str) {
            this.f6741a = interfaceC2327a;
            this.f6742b = str;
        }

        /* renamed from: a */
        public final void mo15411a(GraphResponse graphResponse) {
            Intrinsics.isThisObjectNull(graphResponse, "response");
            if (graphResponse.m34083b() != null) {
                this.f6741a.m33931a(graphResponse.m34083b().m34224e());
                return;
            }
            String str = this.f6742b;
            JSONObject m34081d = graphResponse.m34081d();
            if (m34081d != null) {
                ProfileInformationCache.m681b(str, m34081d);
                this.f6741a.m33930b(graphResponse.m34081d());
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Utility.kt */
    /* renamed from: com.facebook.internal.f$c */
    /* loaded from: classes.dex */
    public static final class C2329c implements FilenameFilter {

        /* renamed from: a */
        public static final C2329c f6743a = new C2329c();

        C2329c() {
        }

        public final boolean accept(File file, String str) {
            return Pattern.matches("cpu[0-9]+", str);
        }
    }

    private Utility() {
    }

    /* renamed from: A */
    private final String m33983A(String str, String str2) {
        Charset charset = C10150d.f26472b;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = str2.getBytes(charset);
        Intrinsics.checkIfNull(bytes, "(this as java.lang.String).getBytes(charset)");
        return m33982B(str, bytes);
    }

    /* renamed from: B */
    private final String m33982B(String str, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            Intrinsics.checkIfNull(messageDigest, "hash");
            return m33932z(messageDigest, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: C */
    public static final Object m33981C(Object obj, Method method, Object... objArr) {
        Intrinsics.isThisObjectNull(method, "method");
        Intrinsics.isThisObjectNull(objArr, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static final boolean m33980D() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            C6429c0 c6429c0 = C6429c0.f17515a;
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{C2290b.m34109f()}, 1));
            Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            Context m34110e = C2290b.m34110e();
            Intrinsics.checkIfNull(m34110e, "ctx");
            PackageManager packageManager = m34110e.getPackageManager();
            String packageName = m34110e.getPackageName();
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 65536)) {
                if (Intrinsics.equals(packageName, resolveInfo.activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: E */
    public static final boolean m33979E(AccessToken accessToken) {
        return accessToken != null && Intrinsics.equals(accessToken, AccessToken.f6572L.m34232e());
    }

    /* renamed from: F */
    public static final boolean m33978F() {
        if (CrashShieldHandler.m25963d(Utility.class)) {
            return false;
        }
        try {
            JSONObject m33940r = m33940r();
            if (m33940r != null) {
                try {
                    JSONArray jSONArray = m33940r.getJSONArray("data_processing_options");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String string = jSONArray.getString(i);
                        Intrinsics.checkIfNull(string, "options.getString(i)");
                        if (string != null) {
                            String lowerCase = string.toLowerCase();
                            Intrinsics.checkIfNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                            if (Intrinsics.equals(lowerCase, "ldu")) {
                                return true;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, Utility.class);
            return false;
        }
    }

    /* renamed from: G */
    public static final boolean m33977G(String str) {
        if (str != null) {
            if (!(str.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    public static final List m33976H(JSONArray jSONArray) throws JSONException {
        Intrinsics.isThisObjectNull(jSONArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: I */
    public static final Map m33975I(String str) {
        Intrinsics.isThisObjectNull(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Intrinsics.checkIfNull(next, "key");
                String string = jSONObject.getString(next);
                Intrinsics.checkIfNull(string, "jsonObject.getString(key)");
                hashMap.put(next, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* renamed from: J */
    public static final void m33974J(String str, Exception exc) {
        if (!C2290b.m34097r() || str == null || exc == null) {
            return;
        }
        Log.d(str, exc.getClass().getSimpleName() + ": " + exc.getMessage());
    }

    /* renamed from: K */
    public static final void m33973K(String str, String str2) {
        if (!C2290b.m34097r() || str == null || str2 == null) {
            return;
        }
        Log.d(str, str2);
    }

    /* renamed from: L */
    public static final String m33972L(Map map) {
        Intrinsics.isThisObjectNull(map, "map");
        boolean isEmpty = map.isEmpty();
        String str = BuildConfig.VERSION_NAME;
        if (!isEmpty) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                }
                str = jSONObject.toString();
            } catch (JSONException unused) {
            }
            Intrinsics.checkIfNull(str, "try {\n        val jsonOb…ion) {\n        \"\"\n      }");
        }
        return str;
    }

    /* renamed from: M */
    public static final String m33971M(String str) {
        Intrinsics.isThisObjectNull(str, "key");
        return f6734h.m33983A("MD5", str);
    }

    /* renamed from: N */
    public static final String m33970N(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream;
        Throwable th2;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
            } catch (Throwable th3) {
                th2 = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th2 = th4;
            inputStreamReader = null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            char[] cArr = new char[2048];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read != -1) {
                    sb2.append(cArr, 0, read);
                } else {
                    String sb3 = sb2.toString();
                    Intrinsics.checkIfNull(sb3, "stringBuilder.toString()");
                    m33953e(bufferedInputStream);
                    m33953e(inputStreamReader);
                    return sb3;
                }
            }
        } catch (Throwable th5) {
            th2 = th5;
            m33953e(bufferedInputStream);
            m33953e(inputStreamReader);
            throw th2;
        }
    }

    /* renamed from: O */
    private final void m33969O() {
        try {
            if (m33946l()) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                Intrinsics.checkIfNull(externalStorageDirectory, "path");
                StatFs statFs = new StatFs(externalStorageDirectory.getPath());
                f6737d = statFs.getAvailableBlocks() * statFs.getBlockSize();
            }
            f6737d = m33951g(f6737d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: P */
    private final int m33968P() {
        int i = f6733a;
        if (i > 0) {
            return i;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(C2329c.f6743a);
            if (listFiles != null) {
                f6733a = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f6733a <= 0) {
            f6733a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f6733a;
    }

    /* renamed from: Q */
    private final void m33967Q(Context context) {
        if (Intrinsics.equals(f6740g, "NoCarrier")) {
            try {
                Object systemService = context.getSystemService("phone");
                if (systemService != null) {
                    String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                    Intrinsics.checkIfNull(networkOperatorName, "telephonyManager.networkOperatorName");
                    f6740g = networkOperatorName;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: R */
    private final void m33966R(Context context) {
        if (f6735b == -1 || System.currentTimeMillis() - f6735b >= 1800000) {
            f6735b = System.currentTimeMillis();
            m33965S();
            m33967Q(context);
            m33964T();
            m33969O();
        }
    }

    /* renamed from: S */
    private final void m33965S() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            Intrinsics.checkIfNull(displayName, "tz.getDisplayName(tz.inD…(Date()), TimeZone.SHORT)");
            f6738e = displayName;
            Intrinsics.checkIfNull(timeZone, "tz");
            String id2 = timeZone.getID();
            Intrinsics.checkIfNull(id2, "tz.id");
            f6739f = id2;
        } catch (AssertionError | Exception unused) {
        }
    }

    /* renamed from: T */
    private final void m33964T() {
        try {
            if (m33946l()) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                Intrinsics.checkIfNull(externalStorageDirectory, "path");
                StatFs statFs = new StatFs(externalStorageDirectory.getPath());
                f6736c = statFs.getBlockCount() * statFs.getBlockSize();
            }
            f6736c = m33951g(f6736c);
        } catch (Exception unused) {
        }
    }

    /* renamed from: U */
    public static final void m33963U(Runnable runnable) {
        try {
            C2290b.m34103l().execute(runnable);
        } catch (Exception unused) {
        }
    }

    /* renamed from: V */
    public static final void m33962V(JSONObject jSONObject, AttributionIdentifiers attributionIdentifiers, String str, boolean z) throws JSONException {
        Intrinsics.isThisObjectNull(jSONObject, "params");
        jSONObject.put("anon_id", str);
        jSONObject.put("application_tracking_enabled", !z);
        jSONObject.put("advertiser_id_collection_enabled", C2290b.m34111d());
        if (attributionIdentifiers != null) {
            if (attributionIdentifiers.m34030j() != null) {
                jSONObject.put("attribution", attributionIdentifiers.m34030j());
            }
            if (attributionIdentifiers.m34032h() != null) {
                jSONObject.put("advertiser_id", attributionIdentifiers.m34032h());
                jSONObject.put("advertiser_tracking_enabled", !attributionIdentifiers.m34028l());
            }
            if (!attributionIdentifiers.m34028l()) {
                String m17739d = UserDataStore.m17739d();
                if (!(m17739d.length() == 0)) {
                    jSONObject.put("ud", m17739d);
                }
            }
            if (attributionIdentifiers.m34031i() != null) {
                jSONObject.put("installer_package", attributionIdentifiers.m34031i());
            }
        }
    }

    /* renamed from: W */
    public static final void m33961W(JSONObject jSONObject, Context context) throws JSONException {
        String str;
        Locale locale;
        int i;
        Display display;
        PackageInfo packageInfo;
        Intrinsics.isThisObjectNull(jSONObject, "params");
        Intrinsics.isThisObjectNull(context, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        f6734h.m33966R(context);
        String packageName = context.getPackageName();
        int i2 = 0;
        int i3 = -1;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            str = BuildConfig.VERSION_NAME;
        }
        if (packageInfo != null) {
            i3 = packageInfo.versionCode;
            str = packageInfo.versionName;
            jSONArray.put(packageName);
            jSONArray.put(i3);
            jSONArray.put(str);
            jSONArray.put(Build.VERSION.RELEASE);
            jSONArray.put(Build.MODEL);
            try {
                Resources resources = context.getResources();
                Intrinsics.checkIfNull(resources, "appContext.resources");
                locale = resources.getConfiguration().locale;
            } catch (Exception unused2) {
                locale = Locale.getDefault();
            }
            StringBuilder sb2 = new StringBuilder();
            Intrinsics.checkIfNull(locale, "locale");
            sb2.append(locale.getLanguage());
            sb2.append("_");
            sb2.append(locale.getCountry());
            jSONArray.put(sb2.toString());
            jSONArray.put(f6738e);
            jSONArray.put(f6740g);
            double d = 0.0d;
            try {
                display = null;
                if (Build.VERSION.SDK_INT >= 17) {
                    Object systemService = context.getSystemService("display");
                    if (!(systemService instanceof DisplayManager)) {
                        systemService = null;
                    }
                    DisplayManager displayManager = (DisplayManager) systemService;
                    if (displayManager != null) {
                        display = displayManager.getDisplay(0);
                    }
                } else {
                    Object systemService2 = context.getSystemService("window");
                    if (!(systemService2 instanceof WindowManager)) {
                        systemService2 = null;
                    }
                    WindowManager windowManager = (WindowManager) systemService2;
                    if (windowManager != null) {
                        display = windowManager.getDefaultDisplay();
                    }
                }
            } catch (Exception unused3) {
            }
            if (display != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getMetrics(displayMetrics);
                int i4 = displayMetrics.widthPixels;
                try {
                    i2 = displayMetrics.heightPixels;
                    d = displayMetrics.density;
                } catch (Exception unused4) {
                }
                i = i2;
                i2 = i4;
                jSONArray.put(i2);
                jSONArray.put(i);
                jSONArray.put(new DecimalFormat("#.##").format(d));
                jSONArray.put(f6734h.m33968P());
                jSONArray.put(f6736c);
                jSONArray.put(f6737d);
                jSONArray.put(f6739f);
                jSONObject.put("extinfo", jSONArray.toString());
            }
            i = 0;
            jSONArray.put(i2);
            jSONArray.put(i);
            jSONArray.put(new DecimalFormat("#.##").format(d));
            jSONArray.put(f6734h.m33968P());
            jSONArray.put(f6736c);
            jSONArray.put(f6737d);
            jSONArray.put(f6739f);
            jSONObject.put("extinfo", jSONArray.toString());
        }
    }

    /* renamed from: X */
    public static final String m33960X(byte[] bArr) {
        Intrinsics.isThisObjectNull(bArr, "bytes");
        return f6734h.m33982B("SHA-1", bArr);
    }

    /* renamed from: Y */
    public static final String m33959Y(String str) {
        if (str == null) {
            return null;
        }
        return f6734h.m33983A("SHA-256", str);
    }

    /* renamed from: Z */
    public static final Collection m33958Z(Object... objArr) {
        Intrinsics.isThisObjectNull(objArr, "ts");
        Collection unmodifiableCollection = Collections.unmodifiableCollection(Arrays.asList(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkIfNull(unmodifiableCollection, "Collections.unmodifiable…ction(Arrays.asList(*ts))");
        return unmodifiableCollection;
    }

    /* renamed from: a */
    public static final boolean m33957a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return Intrinsics.equals(obj, obj2);
    }

    /* renamed from: b */
    public static final JSONObject m33956b(String str) {
        Intrinsics.isThisObjectNull(str, "accessToken");
        JSONObject m682a = ProfileInformationCache.m682a(str);
        if (m682a != null) {
            return m682a;
        }
        GraphResponse m34201j = f6734h.m33939s(str).m34201j();
        if (m34201j.m34083b() != null) {
            return null;
        }
        return m34201j.m34081d();
    }

    /* renamed from: c */
    private final void m33955c(Context context, String str) {
        List m8883q0;
        List m8883q02;
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie != null) {
            m8883q0 = C10171u.m8883q0(cookie, new String[]{";"}, false, 0, 6, null);
            Object[] array = m8883q0.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            for (String str2 : (String[]) array) {
                m8883q02 = C10171u.m8883q0(str2, new String[]{"="}, false, 0, 6, null);
                Object[] array2 = m8883q02.toArray(new String[0]);
                Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array2;
                if (strArr.length > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    String str3 = strArr[0];
                    int length = str3.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        boolean z2 = Intrinsics.isLessOrEqual(str3.charAt(!z ? i : length), 32) <= 0;
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (z2) {
                            i++;
                        } else {
                            z = true;
                        }
                    }
                    sb2.append(str3.subSequence(i, length + 1).toString());
                    sb2.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                    cookieManager.setCookie(str, sb2.toString());
                }
            }
            cookieManager.removeExpiredCookie();
        }
    }

    /* renamed from: d */
    public static final void m33954d(Context context) {
        Intrinsics.isThisObjectNull(context, "context");
        Utility utility = f6734h;
        utility.m33955c(context, "facebook.com");
        utility.m33955c(context, ".facebook.com");
        utility.m33955c(context, "https://facebook.com");
        utility.m33955c(context, "https://.facebook.com");
    }

    /* renamed from: e */
    public static final void m33953e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: f */
    public static final String m33952f(String str, String str2) {
        return m33977G(str) ? str2 : str;
    }

    /* renamed from: g */
    private final long m33951g(double d) {
        return Math.round(d / 1.073741824E9d);
    }

    /* renamed from: h */
    public static final List m33950h(JSONArray jSONArray) {
        Intrinsics.isThisObjectNull(jSONArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                Intrinsics.checkIfNull(string, "jsonArray.getString(i)");
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    /* renamed from: i */
    public static final Map m33949i(JSONObject jSONObject) {
        Intrinsics.isThisObjectNull(jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                Intrinsics.checkIfNull(next, "key");
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    /* renamed from: j */
    public static final int m33948j(InputStream inputStream, OutputStream outputStream) throws IOException {
        BufferedInputStream bufferedInputStream;
        Intrinsics.isThisObjectNull(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr = new byte[8192];
            int i = 0;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
                i += read;
            }
            bufferedInputStream.close();
            if (inputStream != null) {
                inputStream.close();
            }
            return i;
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: k */
    public static final void m33947k(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    /* renamed from: l */
    private final boolean m33946l() {
        return Intrinsics.equals("mounted", Environment.getExternalStorageState());
    }

    /* renamed from: m */
    public static final String m33945m(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        Intrinsics.checkIfNull(simpleName, "context.javaClass.simpleName");
        return simpleName;
    }

    /* renamed from: n */
    public static final String m33944n(Context context) {
        String string;
        Intrinsics.isThisObjectNull(context, "context");
        try {
            String m34108g = C2290b.m34108g();
            if (m34108g != null) {
                return m34108g;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i);
                Intrinsics.checkIfNull(string, "context.getString(stringId)");
            }
            return string;
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    /* renamed from: o */
    public static final String m33943o() {
        Context m34110e = C2290b.m34110e();
        if (m34110e != null) {
            try {
                PackageInfo packageInfo = m34110e.getPackageManager().getPackageInfo(m34110e.getPackageName(), 0);
                if (packageInfo != null) {
                    return packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return null;
    }

    /* renamed from: p */
    public static final long m33942p(Uri uri) {
        Intrinsics.isThisObjectNull(uri, "contentUri");
        Cursor cursor = null;
        try {
            Context m34110e = C2290b.m34110e();
            Intrinsics.checkIfNull(m34110e, "FacebookSdk.getApplicationContext()");
            cursor = m34110e.getContentResolver().query(uri, null, null, null, null);
            if (cursor == null) {
                return 0L;
            }
            int columnIndex = cursor.getColumnIndex("_size");
            cursor.moveToFirst();
            long j = cursor.getLong(columnIndex);
            cursor.close();
            return j;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* renamed from: q */
    public static final Locale m33941q() {
        Locale m33934x = m33934x();
        if (m33934x != null) {
            return m33934x;
        }
        Locale locale = Locale.getDefault();
        Intrinsics.checkIfNull(locale, "Locale.getDefault()");
        return locale;
    }

    /* renamed from: r */
    public static final JSONObject m33940r() {
        if (CrashShieldHandler.m25963d(Utility.class)) {
            return null;
        }
        try {
            String string = C2290b.m34110e().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, Utility.class);
            return null;
        }
    }

    /* renamed from: s */
    private final GraphRequest m33939s(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name");
        bundle.putString("access_token", str);
        return new GraphRequest(null, "me", bundle, EnumC2303d.GET, null, null, 32, null);
    }

    /* renamed from: t */
    public static final void m33938t(String str, InterfaceC2327a interfaceC2327a) {
        Intrinsics.isThisObjectNull(str, "accessToken");
        Intrinsics.isThisObjectNull(interfaceC2327a, "callback");
        JSONObject m682a = ProfileInformationCache.m682a(str);
        if (m682a != null) {
            interfaceC2327a.m33930b(m682a);
            return;
        }
        C2328b c2328b = new C2328b(interfaceC2327a, str);
        GraphRequest m33939s = f6734h.m33939s(str);
        m33939s.m34185z(c2328b);
        m33939s.m34200k();
    }

    /* renamed from: u */
    public static final String m33937u(Context context) {
        Validate.m671g(context, "context");
        String m34109f = C2290b.m34109f();
        Intrinsics.checkIfNull(m34109f, "FacebookSdk.getApplicationId()");
        return m34109f;
    }

    /* renamed from: v */
    public static final Method m33936v(Class cls, String str, Class... clsArr) {
        Intrinsics.isThisObjectNull(cls, "clazz");
        Intrinsics.isThisObjectNull(str, "methodName");
        Intrinsics.isThisObjectNull(clsArr, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: w */
    public static final Method m33935w(String str, String str2, Class... clsArr) {
        Intrinsics.isThisObjectNull(str, "className");
        Intrinsics.isThisObjectNull(str2, "methodName");
        Intrinsics.isThisObjectNull(clsArr, "parameterTypes");
        try {
            Class<?> cls = Class.forName(str);
            Intrinsics.checkIfNull(cls, "Class.forName(className)");
            return m33936v(cls, str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: x */
    public static final Locale m33934x() {
        try {
            Context m34110e = C2290b.m34110e();
            Intrinsics.checkIfNull(m34110e, "FacebookSdk.getApplicationContext()");
            Resources resources = m34110e.getResources();
            Intrinsics.checkIfNull(resources, "FacebookSdk.getApplicationContext().resources");
            return resources.getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: y */
    public static final Object m33933y(JSONObject jSONObject, String str, String str2) throws JSONException {
        Intrinsics.isThisObjectNull(jSONObject, "jsonObject");
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new FacebookException("Got an unexpected non-JSON object.");
    }

    /* renamed from: z */
    private final String m33932z(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb2 = new StringBuilder();
        for (byte b : digest) {
            sb2.append(Integer.toHexString((b >> 4) & 15));
            sb2.append(Integer.toHexString((b >> 0) & 15));
        }
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "builder.toString()");
        return sb3;
    }
}
