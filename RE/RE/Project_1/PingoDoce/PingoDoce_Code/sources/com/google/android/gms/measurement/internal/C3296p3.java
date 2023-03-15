package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.C2597i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.p3 */
/* loaded from: classes.dex */
public final class C3296p3 {

    /* renamed from: a */
    private final String f8764a;

    /* renamed from: b */
    private final Bundle f8765b;

    /* renamed from: c */
    private Bundle f8766c;

    /* renamed from: d */
    final /* synthetic */ C3340t3 f8767d;

    public C3296p3(C3340t3 c3340t3, String str, Bundle bundle) {
        this.f8767d = c3340t3;
        C2597i.m33080f("default_event_parameters");
        this.f8764a = "default_event_parameters";
        this.f8765b = new Bundle();
    }

    /* renamed from: a */
    public final Bundle m31049a() {
        char c;
        if (this.f8766c == null) {
            String string = this.f8767d.m31006o().getString(this.f8764a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode == 100) {
                                if (string3.equals("d")) {
                                    c = 1;
                                }
                                c = 65535;
                            } else if (hashCode != 108) {
                                if (hashCode == 115 && string3.equals("s")) {
                                    c = 0;
                                }
                                c = 65535;
                            } else {
                                if (string3.equals("l")) {
                                    c = 2;
                                }
                                c = 65535;
                            }
                            if (c == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (c == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (c != 2) {
                                this.f8767d.f8410a.mo31116d().m31332r().m31397b("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f8767d.f8410a.mo31116d().m31332r().m31398a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f8766c = bundle;
                } catch (JSONException unused2) {
                    this.f8767d.f8410a.mo31116d().m31332r().m31398a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f8766c == null) {
                this.f8766c = this.f8765b;
            }
        }
        return this.f8766c;
    }

    /* renamed from: b */
    public final void m31048b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f8767d.m31006o().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f8764a);
        } else {
            String str = this.f8764a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            this.f8767d.f8410a.mo31116d().m31332r().m31397b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        this.f8767d.f8410a.mo31116d().m31332r().m31397b("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f8766c = bundle;
    }
}
