package p075e4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import p130h4.C5848d;

/* renamed from: e4.a */
/* loaded from: classes.dex */
public class C4978a implements InterfaceC4981d {

    /* renamed from: w */
    private final HttpURLConnection f13908w;

    public C4978a(HttpURLConnection httpURLConnection) {
        this.f13908w = httpURLConnection;
    }

    /* renamed from: a */
    private String m25985a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb2.append(readLine);
                        sb2.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th2;
            }
        }
        bufferedReader.close();
        return sb2.toString();
    }

    @Override // p075e4.InterfaceC4981d
    /* renamed from: V */
    public boolean mo25984V() {
        try {
            return this.f13908w.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f13908w.disconnect();
    }

    @Override // p075e4.InterfaceC4981d
    /* renamed from: j */
    public InputStream mo25983j() throws IOException {
        return this.f13908w.getInputStream();
    }

    @Override // p075e4.InterfaceC4981d
    /* renamed from: s0 */
    public String mo25982s0() {
        return this.f13908w.getContentType();
    }

    @Override // p075e4.InterfaceC4981d
    /* renamed from: y0 */
    public String mo25981y0() {
        try {
            if (mo25984V()) {
                return null;
            }
            return "Unable to fetch " + this.f13908w.getURL() + ". Failed with " + this.f13908w.getResponseCode() + "\n" + m25985a(this.f13908w);
        } catch (IOException e) {
            C5848d.m22928d("get error failed ", e);
            return e.getMessage();
        }
    }
}
