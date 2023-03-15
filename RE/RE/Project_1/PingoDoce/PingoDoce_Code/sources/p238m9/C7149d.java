package p238m9;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import p219l9.C7011f;
import p253n9.InterfaceC7689a;
import p253n9.InterfaceC7690b;

/* renamed from: m9.d */
/* loaded from: classes.dex */
public class C7149d implements InterfaceC7147b, InterfaceC7690b {

    /* renamed from: a */
    private InterfaceC7689a f18961a;

    /* renamed from: b */
    private static String m19086b(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // p238m9.InterfaceC7147b
    /* renamed from: E */
    public void mo19087E(String str, Bundle bundle) {
        InterfaceC7689a interfaceC7689a = this.f18961a;
        if (interfaceC7689a != null) {
            try {
                interfaceC7689a.mo17711a("$A$:" + m19086b(str, bundle));
            } catch (JSONException unused) {
                C7011f.m19611f().m19606k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override // p253n9.InterfaceC7690b
    /* renamed from: a */
    public void mo17710a(InterfaceC7689a interfaceC7689a) {
        this.f18961a = interfaceC7689a;
        C7011f.m19611f().m19615b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
