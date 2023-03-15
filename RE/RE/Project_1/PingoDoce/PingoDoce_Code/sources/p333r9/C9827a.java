package p333r9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import p219l9.C7011f;

/* renamed from: r9.a */
/* loaded from: classes.dex */
public class C9827a {

    /* renamed from: a */
    private final String f25772a;

    /* renamed from: b */
    private final Map<String, String> f25773b;

    /* renamed from: c */
    private final Map<String, String> f25774c = new HashMap();

    public C9827a(String str, Map<String, String> map) {
        this.f25772a = str;
        this.f25773b = map;
    }

    /* renamed from: a */
    private String m9911a(Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(next.getKey());
        sb3.append("=");
        sb3.append(next.getValue() != null ? next.getValue() : BuildConfig.VERSION_NAME);
        sb2.append(sb3.toString());
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("&");
            sb4.append(next2.getKey());
            sb4.append("=");
            sb4.append(next2.getValue() != null ? next2.getValue() : BuildConfig.VERSION_NAME);
            sb2.append(sb4.toString());
        }
        return sb2.toString();
    }

    /* renamed from: b */
    private String m9910b(String str, Map<String, String> map) {
        String m9911a = m9911a(map);
        if (m9911a.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                m9911a = "&" + m9911a;
            }
            return str + m9911a;
        }
        return str + "?" + m9911a;
    }

    /* renamed from: e */
    private String m9907e(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb2.append(cArr, 0, read);
            } else {
                return sb2.toString();
            }
        }
    }

    /* renamed from: c */
    public C9829c m9909c() throws IOException {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String m9907e = null;
        inputStream = null;
        try {
            String m9910b = m9910b(this.f25772a, this.f25773b);
            C7011f.m19611f().m19608i("GET Request URL: " + m9910b);
            httpsURLConnection = (HttpsURLConnection) new URL(m9910b).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.f25774c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        m9907e = m9907e(inputStream2);
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new C9829c(responseCode, m9907e);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }

    /* renamed from: d */
    public C9827a m9908d(String str, String str2) {
        this.f25774c.put(str, str2);
        return this;
    }
}
