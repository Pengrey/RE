package p420w9;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.C4221l;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p219l9.C7011f;
import p333r9.C9827a;
import p333r9.C9828b;
import p333r9.C9829c;
import p402v9.C11170f;

/* renamed from: w9.a */
/* loaded from: classes.dex */
public class C11603a implements InterfaceC11604b {

    /* renamed from: a */
    private final String f29672a;

    /* renamed from: b */
    private final C9828b f29673b;

    /* renamed from: c */
    private final C7011f f29674c;

    public C11603a(String str, C9828b c9828b) {
        this(str, c9828b, C7011f.m19611f());
    }

    /* renamed from: b */
    private C9827a m4639b(C9827a c9827a, C11170f c11170f) {
        m4638c(c9827a, "X-CRASHLYTICS-GOOGLE-APP-ID", c11170f.f28699a);
        m4638c(c9827a, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m4638c(c9827a, "X-CRASHLYTICS-API-CLIENT-VERSION", C4221l.m28268i());
        m4638c(c9827a, "Accept", "application/json");
        m4638c(c9827a, "X-CRASHLYTICS-DEVICE-MODEL", c11170f.f28700b);
        m4638c(c9827a, "X-CRASHLYTICS-OS-BUILD-VERSION", c11170f.f28701c);
        m4638c(c9827a, "X-CRASHLYTICS-OS-DISPLAY-VERSION", c11170f.f28702d);
        m4638c(c9827a, "X-CRASHLYTICS-INSTALLATION-ID", c11170f.f28703e.mo28195a());
        return c9827a;
    }

    /* renamed from: c */
    private void m4638c(C9827a c9827a, String str, String str2) {
        if (str2 != null) {
            c9827a.m9908d(str, str2);
        }
    }

    /* renamed from: e */
    private JSONObject m4636e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            C7011f c7011f = this.f29674c;
            c7011f.m19605l("Failed to parse settings JSON from " + this.f29672a, e);
            C7011f c7011f2 = this.f29674c;
            c7011f2.m19606k("Settings response " + str);
            return null;
        }
    }

    /* renamed from: f */
    private Map<String, String> m4635f(C11170f c11170f) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", c11170f.f28706h);
        hashMap.put("display_version", c11170f.f28705g);
        hashMap.put("source", Integer.toString(c11170f.f28707i));
        String str = c11170f.f28704f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // p420w9.InterfaceC11604b
    /* renamed from: a */
    public JSONObject mo4632a(C11170f c11170f, boolean z) {
        if (z) {
            try {
                Map<String, String> m4635f = m4635f(c11170f);
                C9827a m4639b = m4639b(m4637d(m4635f), c11170f);
                C7011f c7011f = this.f29674c;
                c7011f.m19615b("Requesting settings from " + this.f29672a);
                C7011f c7011f2 = this.f29674c;
                c7011f2.m19608i("Settings query params were: " + m4635f);
                return m4634g(m4639b.m9909c());
            } catch (IOException e) {
                this.f29674c.m19612e("Settings request failed.", e);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    /* renamed from: d */
    protected C9827a m4637d(Map<String, String> map) {
        C9827a m9906a = this.f29673b.m9906a(this.f29672a, map);
        return m9906a.m9908d("User-Agent", "Crashlytics Android SDK/" + C4221l.m28268i()).m9908d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* renamed from: g */
    JSONObject m4634g(C9829c c9829c) {
        int m9904b = c9829c.m9904b();
        C7011f c7011f = this.f29674c;
        c7011f.m19608i("Settings response code was: " + m9904b);
        if (m4633h(m9904b)) {
            return m4636e(c9829c.m9905a());
        }
        C7011f c7011f2 = this.f29674c;
        c7011f2.m19613d("Settings request failed; (status: " + m9904b + ") from " + this.f29672a);
        return null;
    }

    /* renamed from: h */
    boolean m4633h(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    C11603a(String str, C9828b c9828b, C7011f c7011f) {
        if (str != null) {
            this.f29674c = c7011f;
            this.f29673b = c9828b;
            this.f29672a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
