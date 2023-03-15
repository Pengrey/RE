package p382u9;

import com.google.firebase.crashlytics.internal.common.InterfaceC4231q;
import org.json.JSONException;
import org.json.JSONObject;
import p402v9.C11169e;

/* renamed from: u9.f */
/* loaded from: classes.dex */
public class C10858f {

    /* renamed from: a */
    private final InterfaceC4231q f28064a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10858f(InterfaceC4231q interfaceC4231q) {
        this.f28064a = interfaceC4231q;
    }

    /* renamed from: a */
    private static InterfaceC10859g m6849a(int i) {
        if (i != 3) {
            return new C10853b();
        }
        return new C10860h();
    }

    /* renamed from: b */
    public C11169e m6848b(JSONObject jSONObject) throws JSONException {
        return m6849a(jSONObject.getInt("settings_version")).mo6847a(this.f28064a, jSONObject);
    }
}
