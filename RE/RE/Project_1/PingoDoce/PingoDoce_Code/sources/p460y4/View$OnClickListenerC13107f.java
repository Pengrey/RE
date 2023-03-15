package p460y4;

import android.os.Bundle;
import android.view.View;
import com.facebook.C2290b;
import com.facebook.GraphRequest;
import com.facebook.internal.Utility;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;
import p248n4.InternalAppEventsLogger;
import p306q4.C9655f;
import p397v4.ModelManager;

/* renamed from: y4.f */
/* loaded from: classes.dex */
public final class View$OnClickListenerC13107f implements View.OnClickListener {

    /* renamed from: A */
    private static final Set<Integer> f34073A = new HashSet();

    /* renamed from: w */
    private View.OnClickListener f34074w;

    /* renamed from: x */
    private WeakReference<View> f34075x;

    /* renamed from: y */
    private WeakReference<View> f34076y;

    /* renamed from: z */
    private String f34077z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOnClickListener.java */
    /* renamed from: y4.f$a */
    /* loaded from: classes.dex */
    public static class RunnableC13108a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ String f34078w;

        /* renamed from: x */
        final /* synthetic */ String f34079x;

        RunnableC13108a(String str, String str2) {
            this.f34078w = str;
            this.f34079x = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                View$OnClickListenerC13107f.m1593a(this.f34078w, this.f34079x, new float[0]);
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOnClickListener.java */
    /* renamed from: y4.f$b */
    /* loaded from: classes.dex */
    public class RunnableC13109b implements Runnable {

        /* renamed from: w */
        final /* synthetic */ JSONObject f34080w;

        /* renamed from: x */
        final /* synthetic */ String f34081x;

        /* renamed from: y */
        final /* synthetic */ String f34082y;

        RunnableC13109b(JSONObject jSONObject, String str, String str2) {
            this.f34080w = jSONObject;
            this.f34081x = str;
            this.f34082y = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String[] m6083o;
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                String lowerCase = Utility.m33944n(C2290b.m34110e()).toLowerCase();
                float[] m1630a = C13100a.m1630a(this.f34080w, lowerCase);
                String m1628c = C13100a.m1628c(this.f34081x, View$OnClickListenerC13107f.m1592b(View$OnClickListenerC13107f.this), lowerCase);
                if (m1630a == null || (m6083o = ModelManager.m6083o(ModelManager.EnumC11117a.MTML_APP_EVENT_PREDICTION, new float[][]{m1630a}, new String[]{m1628c})) == null) {
                    return;
                }
                String str = m6083o[0];
                C13101b.m1616a(this.f34082y, str);
                if (str.equals("other")) {
                    return;
                }
                View$OnClickListenerC13107f.m1593a(str, this.f34081x, m1630a);
            } catch (Exception unused) {
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    private View$OnClickListenerC13107f(View view, View view2, String str) {
        this.f34074w = C9655f.m10270g(view);
        this.f34076y = new WeakReference<>(view);
        this.f34075x = new WeakReference<>(view2);
        this.f34077z = str.toLowerCase().replace("activity", BuildConfig.VERSION_NAME);
    }

    /* renamed from: a */
    static /* synthetic */ void m1593a(String str, String str2, float[] fArr) {
        if (CrashShieldHandler.m25963d(View$OnClickListenerC13107f.class)) {
            return;
        }
        try {
            m1588f(str, str2, fArr);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, View$OnClickListenerC13107f.class);
        }
    }

    /* renamed from: b */
    static /* synthetic */ String m1592b(View$OnClickListenerC13107f view$OnClickListenerC13107f) {
        if (CrashShieldHandler.m25963d(View$OnClickListenerC13107f.class)) {
            return null;
        }
        try {
            return view$OnClickListenerC13107f.f34077z;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, View$OnClickListenerC13107f.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m1591c(View view, View view2, String str) {
        if (CrashShieldHandler.m25963d(View$OnClickListenerC13107f.class)) {
            return;
        }
        try {
            int hashCode = view.hashCode();
            Set<Integer> set = f34073A;
            if (set.contains(Integer.valueOf(hashCode))) {
                return;
            }
            C9655f.m10259r(view, new View$OnClickListenerC13107f(view, view2, str));
            set.add(Integer.valueOf(hashCode));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, View$OnClickListenerC13107f.class);
        }
    }

    /* renamed from: d */
    private void m1590d(String str, String str2, JSONObject jSONObject) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            Utility.m33963U(new RunnableC13109b(jSONObject, str2, str));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: e */
    private void m1589e() {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            View view = this.f34075x.get();
            View view2 = this.f34076y.get();
            if (view != null && view2 != null) {
                try {
                    String m1609d = C13102c.m1609d(view2);
                    String m1615b = C13101b.m1615b(view2, m1609d);
                    if (m1615b == null || m1587g(m1615b, m1609d)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("view", C13102c.m1611b(view, view2));
                    jSONObject.put("screenname", this.f34077z);
                    m1590d(m1615b, m1609d, jSONObject);
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: f */
    private static void m1588f(String str, String str2, float[] fArr) {
        if (CrashShieldHandler.m25963d(View$OnClickListenerC13107f.class)) {
            return;
        }
        try {
            if (C13103d.m1602f(str)) {
                new InternalAppEventsLogger(C2290b.m34110e()).m17759f(str, str2);
            } else if (C13103d.m1603e(str)) {
                m1586h(str, str2, fArr);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, View$OnClickListenerC13107f.class);
        }
    }

    /* renamed from: g */
    private static boolean m1587g(String str, String str2) {
        if (CrashShieldHandler.m25963d(View$OnClickListenerC13107f.class)) {
            return false;
        }
        try {
            String m1613d = C13101b.m1613d(str);
            if (m1613d == null) {
                return false;
            }
            if (m1613d.equals("other")) {
                return true;
            }
            Utility.m33963U(new RunnableC13108a(m1613d, str2));
            return true;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, View$OnClickListenerC13107f.class);
            return false;
        }
    }

    /* renamed from: h */
    private static void m1586h(String str, String str2, float[] fArr) {
        if (CrashShieldHandler.m25963d(View$OnClickListenerC13107f.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb2 = new StringBuilder();
                for (float f : fArr) {
                    sb2.append(f);
                    sb2.append(",");
                }
                jSONObject.put("dense", sb2.toString());
                jSONObject.put("button_text", str2);
                bundle.putString("metadata", jSONObject.toString());
                GraphRequest m34187x = GraphRequest.m34187x(null, String.format(Locale.US, "%s/suggested_events", C2290b.m34109f()), null, null);
                m34187x.m34213C(bundle);
                m34187x.m34201j();
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, View$OnClickListenerC13107f.class);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            View.OnClickListener onClickListener = this.f34074w;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            m1589e();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }
}
