package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.remoteconfig.internal.c */
/* loaded from: classes.dex */
public class C4344c {

    /* renamed from: c */
    private static final Date f11801c = new Date(0);

    /* renamed from: a */
    private JSONObject f11802a;

    /* renamed from: b */
    private Date f11803b;

    /* compiled from: ConfigContainer.java */
    /* renamed from: com.google.firebase.remoteconfig.internal.c$b */
    /* loaded from: classes.dex */
    public static class C4346b {

        /* renamed from: a */
        private JSONObject f11804a;

        /* renamed from: b */
        private Date f11805b;

        /* renamed from: c */
        private JSONArray f11806c;

        /* renamed from: d */
        private JSONObject f11807d;

        /* renamed from: a */
        public C4344c m27823a() throws JSONException {
            return new C4344c(this.f11804a, this.f11805b, this.f11806c, this.f11807d);
        }

        /* renamed from: b */
        public C4346b m27822b(JSONObject jSONObject) {
            try {
                this.f11804a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: c */
        public C4346b m27821c(JSONArray jSONArray) {
            try {
                this.f11806c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: d */
        public C4346b m27820d(Date date) {
            this.f11805b = date;
            return this;
        }

        /* renamed from: e */
        public C4346b m27819e(JSONObject jSONObject) {
            try {
                this.f11807d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        private C4346b() {
            this.f11804a = new JSONObject();
            this.f11805b = C4344c.f11801c;
            this.f11806c = new JSONArray();
            this.f11807d = new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C4344c m27826b(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new C4344c(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject);
    }

    /* renamed from: d */
    public static C4346b m27824d() {
        return new C4346b();
    }

    /* renamed from: c */
    public Date m27825c() {
        return this.f11803b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4344c) {
            return this.f11802a.toString().equals(((C4344c) obj).toString());
        }
        return false;
    }

    public int hashCode() {
        return this.f11802a.hashCode();
    }

    public String toString() {
        return this.f11802a.toString();
    }

    private C4344c(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        this.f11803b = date;
        this.f11802a = jSONObject3;
    }
}
