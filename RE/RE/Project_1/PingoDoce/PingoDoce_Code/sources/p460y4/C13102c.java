package p460y4;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;
import p306q4.C9655f;

/* renamed from: y4.c */
/* loaded from: classes.dex */
class C13102c {

    /* renamed from: a */
    private static final List<Class<? extends View>> f34064a = new ArrayList(Arrays.asList(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class));

    C13102c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static List<View> m1612a(View view) {
        if (CrashShieldHandler.m25963d(C13102c.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Class<? extends View> cls : f34064a) {
                if (cls.isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            for (View view2 : C9655f.m10275b(view)) {
                arrayList.addAll(m1612a(view2));
            }
            return arrayList;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13102c.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static JSONObject m1611b(View view, View view2) {
        if (CrashShieldHandler.m25963d(C13102c.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            m1608e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            for (View view3 : C9655f.m10275b(view)) {
                jSONArray.put(m1611b(view3, view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13102c.class);
            return null;
        }
    }

    /* renamed from: c */
    private static List<String> m1610c(View view) {
        if (CrashShieldHandler.m25963d(C13102c.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : C9655f.m10275b(view)) {
                String m10266k = C9655f.m10266k(view2);
                if (!m10266k.isEmpty()) {
                    arrayList.add(m10266k);
                }
                arrayList.addAll(m1610c(view2));
            }
            return arrayList;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13102c.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static String m1609d(View view) {
        if (CrashShieldHandler.m25963d(C13102c.class)) {
            return null;
        }
        try {
            String m10266k = C9655f.m10266k(view);
            return !m10266k.isEmpty() ? m10266k : TextUtils.join(" ", m1610c(view));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13102c.class);
            return null;
        }
    }

    /* renamed from: e */
    static void m1608e(View view, JSONObject jSONObject) {
        if (CrashShieldHandler.m25963d(C13102c.class)) {
            return;
        }
        try {
            String m10266k = C9655f.m10266k(view);
            String m10268i = C9655f.m10268i(view);
            jSONObject.put("classname", view.getClass().getSimpleName());
            jSONObject.put("classtypebitmask", C9655f.m10274c(view));
            if (!m10266k.isEmpty()) {
                jSONObject.put("text", m10266k);
            }
            if (!m10268i.isEmpty()) {
                jSONObject.put("hint", m10268i);
            }
            if (view instanceof EditText) {
                jSONObject.put("inputtype", ((EditText) view).getInputType());
            }
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13102c.class);
        }
    }
}
