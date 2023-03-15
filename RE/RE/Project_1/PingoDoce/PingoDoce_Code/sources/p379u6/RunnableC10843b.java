package p379u6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C2538r;
import com.google.android.gms.common.internal.C2597i;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p043c7.C2093a;
import p462y6.AbstractC13119b;
import p462y6.C13121c;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: u6.b */
/* loaded from: classes.dex */
public final class RunnableC10843b implements Runnable {

    /* renamed from: y */
    private static final C2093a f28033y = new C2093a("RevokeAccessOperation", new String[0]);

    /* renamed from: w */
    private final String f28034w;

    /* renamed from: x */
    private final C2538r f28035x = new C2538r(null);

    public RunnableC10843b(String str) {
        this.f28034w = C2597i.m33080f(str);
    }

    /* renamed from: a */
    public static AbstractC13119b<Status> m6892a(String str) {
        if (str == null) {
            return C13121c.m1570a(new Status(4), null);
        }
        RunnableC10843b runnableC10843b = new RunnableC10843b(str);
        new Thread(runnableC10843b).start();
        return runnableC10843b.f28035x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f7157D;
        try {
            String valueOf = String.valueOf(this.f28034w);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(valueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f7155B;
            } else {
                f28033y.m34697b("Unable to revoke access!", new Object[0]);
            }
            C2093a c2093a = f28033y;
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("Response Code: ");
            sb2.append(responseCode);
            c2093a.m34698a(sb2.toString(), new Object[0]);
        } catch (IOException e) {
            C2093a c2093a2 = f28033y;
            String valueOf2 = String.valueOf(e.toString());
            c2093a2.m34697b(valueOf2.length() != 0 ? "IOException when revoking access: ".concat(valueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e2) {
            C2093a c2093a3 = f28033y;
            String valueOf3 = String.valueOf(e2.toString());
            c2093a3.m34697b(valueOf3.length() != 0 ? "Exception when revoking access: ".concat(valueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.f28035x.m33473f(status);
    }
}
