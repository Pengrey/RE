package p219l9;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.C4196g;
import java.io.IOException;

/* renamed from: l9.e */
/* loaded from: classes.dex */
public class C7008e {

    /* renamed from: a */
    private final Context f18621a;

    /* renamed from: b */
    private C7010b f18622b = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DevelopmentPlatformProvider.java */
    /* renamed from: l9.e$b */
    /* loaded from: classes.dex */
    public class C7010b {

        /* renamed from: a */
        private final String f18623a;

        /* renamed from: b */
        private final String f18624b;

        private C7010b(C7008e c7008e) {
            int m28361q = C4196g.m28361q(c7008e.f18621a, "com.google.firebase.crashlytics.unity_version", "string");
            if (m28361q == 0) {
                if (c7008e.m19622c("flutter_assets")) {
                    this.f18623a = "Flutter";
                    this.f18624b = null;
                    C7011f.m19611f().m19608i("Development platform is: Flutter");
                    return;
                }
                this.f18623a = null;
                this.f18624b = null;
                return;
            }
            this.f18623a = "Unity";
            String string = c7008e.f18621a.getResources().getString(m28361q);
            this.f18624b = string;
            C7011f m19611f = C7011f.m19611f();
            m19611f.m19608i("Unity Editor version is: " + string);
        }
    }

    public C7008e(Context context) {
        this.f18621a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public boolean m19622c(String str) {
        String[] list;
        try {
            if (this.f18621a.getAssets() == null || (list = this.f18621a.getAssets().list(str)) == null) {
                return false;
            }
            return list.length > 0;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    private C7010b m19619f() {
        if (this.f18622b == null) {
            this.f18622b = new C7010b();
        }
        return this.f18622b;
    }

    /* renamed from: d */
    public String m19621d() {
        return m19619f().f18623a;
    }

    /* renamed from: e */
    public String m19620e() {
        return m19619f().f18624b;
    }
}
