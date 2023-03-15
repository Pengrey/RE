package p266o6;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p175j7.C6371i;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* renamed from: o6.d */
/* loaded from: classes.dex */
public final class C8026d {
    /* renamed from: a */
    public static final void m17128a(String str) {
        try {
            try {
                C6371i.m21124b(263);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 65);
                        sb2.append("Received non-success response code ");
                        sb2.append(responseCode);
                        sb2.append(" from pinging URL: ");
                        sb2.append(str);
                        Log.w("HttpUrlPinger", sb2.toString());
                    }
                    C6371i.m21125a();
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                e = e;
                String message = e.getMessage();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
                sb3.append("Error while pinging URL: ");
                sb3.append(str);
                sb3.append(". ");
                sb3.append(message);
                Log.w("HttpUrlPinger", sb3.toString(), e);
                C6371i.m21125a();
            } catch (IndexOutOfBoundsException e2) {
                String message2 = e2.getMessage();
                StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
                sb4.append("Error while parsing ping URL: ");
                sb4.append(str);
                sb4.append(". ");
                sb4.append(message2);
                Log.w("HttpUrlPinger", sb4.toString(), e2);
                C6371i.m21125a();
            } catch (RuntimeException e3) {
                e = e3;
                String message3 = e.getMessage();
                StringBuilder sb32 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
                sb32.append("Error while pinging URL: ");
                sb32.append(str);
                sb32.append(". ");
                sb32.append(message3);
                Log.w("HttpUrlPinger", sb32.toString(), e);
                C6371i.m21125a();
            }
        } catch (Throwable th2) {
            C6371i.m21125a();
            throw th2;
        }
    }
}
