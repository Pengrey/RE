package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.core.content.p019pm.C0940a;
import com.google.android.gms.common.util.C2630a;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.C4344c;
import com.google.firebase.remoteconfig.internal.C4347d;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p078e7.C5008i;

/* loaded from: classes.dex */
public class ConfigFetchHttpClient {

    /* renamed from: f */
    private static final Pattern f11790f = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a */
    private final Context f11791a;

    /* renamed from: b */
    private final String f11792b;

    /* renamed from: c */
    private final String f11793c;

    /* renamed from: d */
    private final long f11794d;

    /* renamed from: e */
    private final long f11795e;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        this.f11791a = context;
        this.f11792b = str;
        this.f11793c = str2;
        m27836d(str);
        this.f11794d = j;
        this.f11795e = j2;
    }

    /* renamed from: a */
    private boolean m27839a(JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    /* renamed from: b */
    private JSONObject m27838b(String str, String str2, Map<String, String> map) throws FirebaseRemoteConfigClientException {
        String locale;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f11792b);
            Locale locale2 = this.f11791a.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale2.getCountry());
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                locale = locale2.toLanguageTag();
            } else {
                locale = locale2.toString();
            }
            hashMap.put("languageCode", locale);
            hashMap.put("platformVersion", Integer.toString(i));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.f11791a.getPackageManager().getPackageInfo(this.f11791a.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    hashMap.put("appBuild", Long.toString(C0940a.m39077a(packageInfo)));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", this.f11791a.getPackageName());
            hashMap.put("sdkVersion", "21.0.1");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            return new JSONObject(hashMap);
        }
        throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
    }

    /* renamed from: c */
    private static C4344c m27837c(JSONObject jSONObject, Date date) throws FirebaseRemoteConfigClientException {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        try {
            C4344c.C4346b m27820d = C4344c.m27824d().m27820d(date);
            JSONObject jSONObject3 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject("entries");
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                m27820d.m27822b(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray("experimentDescriptions");
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                m27820d.m27821c(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject("personalizationMetadata");
            } catch (JSONException unused3) {
            }
            if (jSONObject3 != null) {
                m27820d.m27819e(jSONObject3);
            }
            return m27820d.m27823a();
        } catch (JSONException e) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e);
        }
    }

    /* renamed from: d */
    private static String m27836d(String str) {
        Matcher matcher = f11790f.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: e */
    private JSONObject m27835e(URLConnection uRLConnection) throws IOException, JSONException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                sb2.append((char) read);
            } else {
                return new JSONObject(sb2.toString());
            }
        }
    }

    /* renamed from: f */
    private String m27834f() {
        try {
            Context context = this.f11791a;
            byte[] m32999a = C2630a.m32999a(context, context.getPackageName());
            if (m32999a == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f11791a.getPackageName());
                return null;
            }
            return C5008i.m25903b(m32999a, false);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("FirebaseRemoteConfig", "No such package: " + this.f11791a.getPackageName(), e);
            return null;
        }
    }

    /* renamed from: g */
    private void m27833g(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f11793c);
        httpURLConnection.setRequestProperty("X-Android-Package", this.f11791a.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", m27834f());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    /* renamed from: h */
    private void m27832h(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: i */
    private void m27831i(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* renamed from: j */
    private void m27830j(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f11794d));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f11795e));
        httpURLConnection.setRequestProperty("If-None-Match", str);
        m27833g(httpURLConnection, str2);
        m27832h(httpURLConnection, map);
    }

    @Keep
    C4347d.C4348a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Date date) throws FirebaseRemoteConfigException {
        m27830j(httpURLConnection, str3, str2, map2);
        try {
            try {
                m27831i(httpURLConnection, m27838b(str, str2, map).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    String headerField = httpURLConnection.getHeaderField("ETag");
                    JSONObject m27835e = m27835e(httpURLConnection);
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (IOException unused) {
                    }
                    if (!m27839a(m27835e)) {
                        return C4347d.C4348a.m27818a(date);
                    }
                    return C4347d.C4348a.m27817b(m27837c(m27835e, date), headerField);
                }
                throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
            } catch (IOException | JSONException e) {
                throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e);
            }
        } finally {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused2) {
            }
        }
    }
}
