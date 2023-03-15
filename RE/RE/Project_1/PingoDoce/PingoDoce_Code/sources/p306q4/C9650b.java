package p306q4;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: q4.b */
/* loaded from: classes.dex */
public final class C9650b {

    /* renamed from: a */
    public final String f25463a;

    /* renamed from: b */
    public final String f25464b;

    /* renamed from: c */
    public final List<C9651c> f25465c;

    /* renamed from: d */
    public final String f25466d;

    public C9650b(JSONObject jSONObject) throws JSONException {
        this.f25463a = jSONObject.getString("name");
        this.f25464b = jSONObject.optString("value");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new C9651c(optJSONArray.getJSONObject(i)));
            }
        }
        this.f25465c = arrayList;
        this.f25466d = jSONObject.optString("path_type", "absolute");
    }
}
