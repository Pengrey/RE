package p306q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: q4.a */
/* loaded from: classes.dex */
public class C9647a {

    /* renamed from: a */
    private final String f25459a;

    /* renamed from: b */
    private final List<C9651c> f25460b;

    /* renamed from: c */
    private final List<C9650b> f25461c;

    /* renamed from: d */
    private final String f25462d;

    /* compiled from: EventBinding.java */
    /* renamed from: q4.a$a */
    /* loaded from: classes.dex */
    public enum EnumC9648a {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    /* compiled from: EventBinding.java */
    /* renamed from: q4.a$b */
    /* loaded from: classes.dex */
    public enum EnumC9649b {
        MANUAL,
        INFERENCE
    }

    public C9647a(String str, EnumC9649b enumC9649b, EnumC9648a enumC9648a, String str2, List<C9651c> list, List<C9650b> list2, String str3, String str4, String str5) {
        this.f25459a = str;
        this.f25460b = list;
        this.f25461c = list2;
        this.f25462d = str5;
    }

    /* renamed from: c */
    public static C9647a m10290c(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        String string = jSONObject.getString("event_name");
        String string2 = jSONObject.getString("method");
        Locale locale = Locale.ENGLISH;
        EnumC9649b valueOf = EnumC9649b.valueOf(string2.toUpperCase(locale));
        EnumC9648a valueOf2 = EnumC9648a.valueOf(jSONObject.getString("event_type").toUpperCase(locale));
        String string3 = jSONObject.getString("app_version");
        JSONArray jSONArray = jSONObject.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new C9651c(jSONArray.getJSONObject(i)));
        }
        String optString = jSONObject.optString("path_type", "absolute");
        JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                arrayList2.add(new C9650b(optJSONArray.getJSONObject(i2)));
            }
        }
        return new C9647a(string, valueOf, valueOf2, string3, arrayList, arrayList2, jSONObject.optString("component_id"), optString, jSONObject.optString("activity_name"));
    }

    /* renamed from: f */
    public static List<C9647a> m10287f(JSONArray jSONArray) {
        int length;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            try {
                length = jSONArray.length();
            } catch (IllegalArgumentException | JSONException unused) {
            }
        } else {
            length = 0;
        }
        for (int i = 0; i < length; i++) {
            arrayList.add(m10290c(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public String m10292a() {
        return this.f25462d;
    }

    /* renamed from: b */
    public String m10291b() {
        return this.f25459a;
    }

    /* renamed from: d */
    public List<C9650b> m10289d() {
        return Collections.unmodifiableList(this.f25461c);
    }

    /* renamed from: e */
    public List<C9651c> m10288e() {
        return Collections.unmodifiableList(this.f25460b);
    }
}
