package la;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.util.C2630a;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import la.AbstractC7020d;
import la.AbstractC7024f;
import org.json.JSONException;
import org.json.JSONObject;
import p078e7.C5008i;
import p102fa.InterfaceC5439f;
import p136ha.InterfaceC5882b;
import pa.InterfaceC8592i;

/* renamed from: la.c */
/* loaded from: classes.dex */
public class C7019c {

    /* renamed from: e */
    private static final Pattern f18644e = Pattern.compile("[0-9]+s");

    /* renamed from: f */
    private static final Charset f18645f = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Context f18646a;

    /* renamed from: b */
    private final InterfaceC5882b<InterfaceC8592i> f18647b;

    /* renamed from: c */
    private final InterfaceC5882b<InterfaceC5439f> f18648c;

    /* renamed from: d */
    private final C7023e f18649d = new C7023e();

    public C7019c(Context context, InterfaceC5882b<InterfaceC8592i> interfaceC5882b, InterfaceC5882b<InterfaceC5439f> interfaceC5882b2) {
        this.f18646a = context;
        this.f18647b = interfaceC5882b;
        this.f18648c = interfaceC5882b2;
    }

    /* renamed from: a */
    private static String m19598a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = BuildConfig.VERSION_NAME;
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    private static JSONObject m19597b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.0");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    private static JSONObject m19596c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: f */
    private String m19593f() {
        try {
            Context context = this.f18646a;
            byte[] m32999a = C2630a.m32999a(context, context.getPackageName());
            if (m32999a == null) {
                Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f18646a.getPackageName());
                return null;
            }
            return C5008i.m25903b(m32999a, false);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("ContentValues", "No such package: " + this.f18646a.getPackageName(), e);
            return null;
        }
    }

    /* renamed from: g */
    private URL m19592g(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e) {
            throw new FirebaseInstallationsException(e.getMessage(), FirebaseInstallationsException.EnumC4254a.UNAVAILABLE);
        }
    }

    /* renamed from: h */
    private static byte[] m19591h(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: i */
    private static boolean m19590i(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: j */
    private static void m19589j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* renamed from: k */
    private static void m19588k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String m19584o = m19584o(httpURLConnection);
        if (TextUtils.isEmpty(m19584o)) {
            return;
        }
        Log.w("Firebase-Installations", m19584o);
        Log.w("Firebase-Installations", m19598a(str, str2, str3));
    }

    /* renamed from: l */
    private HttpURLConnection m19587l(URL url, String str) throws FirebaseInstallationsException {
        InterfaceC5439f.EnumC5440a mo24359a;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f18646a.getPackageName());
            if (this.f18648c.get() != null && this.f18647b.get() != null && (mo24359a = this.f18648c.get().mo24359a("fire-installations-id")) != InterfaceC5439f.EnumC5440a.NONE) {
                httpURLConnection.addRequestProperty("x-firebase-client", this.f18647b.get().mo15077a());
                httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(mo24359a.getCode()));
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m19593f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC4254a.UNAVAILABLE);
        }
    }

    /* renamed from: m */
    static long m19586m(String str) {
        C2597i.m33084b(f18644e.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: n */
    private AbstractC7020d m19585n(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f18645f));
        AbstractC7024f.AbstractC7025a m19561a = AbstractC7024f.m19561a();
        AbstractC7020d.AbstractC7021a m19579a = AbstractC7020d.m19579a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                m19579a.mo19568f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                m19579a.mo19571c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                m19579a.mo19570d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        m19561a.mo19555c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        m19561a.mo19554d(m19586m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                m19579a.mo19572b(m19561a.mo19557a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m19579a.mo19569e(AbstractC7020d.EnumC7022b.OK).mo19573a();
    }

    /* renamed from: o */
    private static String m19584o(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f18645f));
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                    sb2.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                bufferedReader.close();
                return null;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                throw th2;
            }
        } catch (IOException unused4) {
            return null;
        }
    }

    /* renamed from: p */
    private AbstractC7024f m19583p(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f18645f));
        AbstractC7024f.AbstractC7025a m19561a = AbstractC7024f.m19561a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                m19561a.mo19555c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                m19561a.mo19554d(m19586m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m19561a.mo19556b(AbstractC7024f.EnumC7026b.OK).mo19557a();
    }

    /* renamed from: q */
    private void m19582q(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        m19580s(httpURLConnection, m19591h(m19597b(str, str2)));
    }

    /* renamed from: r */
    private void m19581r(HttpURLConnection httpURLConnection) throws IOException {
        m19580s(httpURLConnection, m19591h(m19596c()));
    }

    /* renamed from: s */
    private static void m19580s(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    /* renamed from: d */
    public AbstractC7020d m19595d(String str, String str2, String str3, String str4, String str5) throws FirebaseInstallationsException {
        int responseCode;
        AbstractC7020d m19585n;
        if (this.f18649d.m19566b()) {
            URL m19592g = m19592g(String.format("projects/%s/installations", str3));
            for (int i = 0; i <= 1; i++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection m19587l = m19587l(m19592g, str);
                try {
                    m19587l.setRequestMethod("POST");
                    m19587l.setDoOutput(true);
                    if (str5 != null) {
                        m19587l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    m19582q(m19587l, str2, str4);
                    responseCode = m19587l.getResponseCode();
                    this.f18649d.m19562f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th2) {
                    m19587l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
                if (m19590i(responseCode)) {
                    m19585n = m19585n(m19587l);
                } else {
                    m19588k(m19587l, str4, str, str3);
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.EnumC4254a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        m19589j();
                        m19585n = AbstractC7020d.m19579a().mo19569e(AbstractC7020d.EnumC7022b.BAD_CONFIG).mo19573a();
                    } else {
                        m19587l.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                m19587l.disconnect();
                TrafficStats.clearThreadStatsTag();
                return m19585n;
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC4254a.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC4254a.UNAVAILABLE);
    }

    /* renamed from: e */
    public AbstractC7024f m19594e(String str, String str2, String str3, String str4) throws FirebaseInstallationsException {
        int responseCode;
        AbstractC7024f m19583p;
        if (this.f18649d.m19566b()) {
            URL m19592g = m19592g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
            for (int i = 0; i <= 1; i++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection m19587l = m19587l(m19592g, str);
                try {
                    m19587l.setRequestMethod("POST");
                    m19587l.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    m19587l.setDoOutput(true);
                    m19581r(m19587l);
                    responseCode = m19587l.getResponseCode();
                    this.f18649d.m19562f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th2) {
                    m19587l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
                if (m19590i(responseCode)) {
                    m19583p = m19583p(m19587l);
                } else {
                    m19588k(m19587l, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.EnumC4254a.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            m19589j();
                            m19583p = AbstractC7024f.m19561a().mo19556b(AbstractC7024f.EnumC7026b.BAD_CONFIG).mo19557a();
                        } else {
                            m19587l.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    m19583p = AbstractC7024f.m19561a().mo19556b(AbstractC7024f.EnumC7026b.AUTH_ERROR).mo19557a();
                }
                m19587l.disconnect();
                TrafficStats.clearThreadStatsTag();
                return m19583p;
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC4254a.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC4254a.UNAVAILABLE);
    }
}
