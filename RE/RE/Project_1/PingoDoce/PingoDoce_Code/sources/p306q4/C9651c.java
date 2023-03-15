package p306q4;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: q4.c */
/* loaded from: classes.dex */
public final class C9651c {

    /* renamed from: a */
    public final String f25467a;

    /* renamed from: b */
    public final int f25468b;

    /* renamed from: c */
    public final int f25469c;

    /* renamed from: d */
    public final String f25470d;

    /* renamed from: e */
    public final String f25471e;

    /* renamed from: f */
    public final String f25472f;

    /* renamed from: g */
    public final String f25473g;

    /* renamed from: h */
    public final int f25474h;

    /* compiled from: PathComponent.java */
    /* renamed from: q4.c$a */
    /* loaded from: classes.dex */
    public enum EnumC9652a {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        
        private final int value;

        EnumC9652a(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9651c(JSONObject jSONObject) throws JSONException {
        this.f25467a = jSONObject.getString("class_name");
        this.f25468b = jSONObject.optInt("index", -1);
        this.f25469c = jSONObject.optInt("id");
        this.f25470d = jSONObject.optString("text");
        this.f25471e = jSONObject.optString("tag");
        this.f25472f = jSONObject.optString("description");
        this.f25473g = jSONObject.optString("hint");
        this.f25474h = jSONObject.optInt("match_bitmask");
    }
}
