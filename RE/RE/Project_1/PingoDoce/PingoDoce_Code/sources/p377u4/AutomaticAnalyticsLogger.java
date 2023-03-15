package p377u4;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C2290b;
import com.facebook.internal.FetchedAppSettingsManager;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p181jd.Intrinsics;
import p248n4.AppEventsLogger;
import p248n4.InternalAppEventsLogger;
import p350s4.C10057d;
import p482z4.FetchedAppGateKeepersManager;
import p482z4.FetchedAppSettings;
import p482z4.Validate;

/* renamed from: u4.d */
/* loaded from: classes.dex */
public final class AutomaticAnalyticsLogger {

    /* renamed from: c */
    public static final AutomaticAnalyticsLogger f28003c = new AutomaticAnalyticsLogger();

    /* renamed from: a */
    private static final String f28001a = AutomaticAnalyticsLogger.class.getCanonicalName();

    /* renamed from: b */
    private static final InternalAppEventsLogger f28002b = new InternalAppEventsLogger(C2290b.m34110e());

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutomaticAnalyticsLogger.kt */
    /* renamed from: u4.d$a */
    /* loaded from: classes.dex */
    public static final class C10834a {

        /* renamed from: a */
        private BigDecimal f28004a;

        /* renamed from: b */
        private Currency f28005b;

        /* renamed from: c */
        private Bundle f28006c;

        public C10834a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            Intrinsics.isThisObjectNull(bigDecimal, "purchaseAmount");
            Intrinsics.isThisObjectNull(currency, "currency");
            Intrinsics.isThisObjectNull(bundle, "param");
            this.f28004a = bigDecimal;
            this.f28005b = currency;
            this.f28006c = bundle;
        }

        /* renamed from: a */
        public final Currency m6933a() {
            return this.f28005b;
        }

        /* renamed from: b */
        public final Bundle m6932b() {
            return this.f28006c;
        }

        /* renamed from: c */
        public final BigDecimal m6931c() {
            return this.f28004a;
        }
    }

    private AutomaticAnalyticsLogger() {
    }

    /* renamed from: a */
    private final C10834a m6939a(String str, String str2) {
        return m6938b(str, str2, new HashMap());
    }

    /* renamed from: b */
    private final C10834a m6938b(String str, String str2, Map map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            boolean z = true;
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString("type");
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (Intrinsics.equals(optString, "subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String optString2 = jSONObject2.optString("introductoryPriceCycles");
                Intrinsics.checkIfNull(optString2, "introductoryPriceCycles");
                if (optString2.length() != 0) {
                    z = false;
                }
                if (!z) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", optString2);
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                bundle.putCharSequence((String) entry.getKey(), (String) entry.getValue());
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
            Intrinsics.checkIfNull(currency, "Currency.getInstance(sku…g(\"price_currency_code\"))");
            return new C10834a(bigDecimal, currency, bundle);
        } catch (JSONException e) {
            Log.e(f28001a, "Error parsing in-app subscription data.", e);
            return null;
        }
    }

    /* renamed from: c */
    public static final boolean m6937c() {
        FetchedAppSettings m33990j = FetchedAppSettingsManager.m33990j(C2290b.m34109f());
        return m33990j != null && C2290b.m34106i() && m33990j.m736e();
    }

    /* renamed from: d */
    public static final void m6936d() {
        Context m34110e = C2290b.m34110e();
        String m34109f = C2290b.m34109f();
        boolean m34106i = C2290b.m34106i();
        Validate.m671g(m34110e, "context");
        if (m34106i) {
            if (m34110e instanceof Application) {
                AppEventsLogger.f20233b.m17814a((Application) m34110e, m34109f);
            } else {
                Log.w(f28001a, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    /* renamed from: e */
    public static final void m6935e(String str, long j) {
        Context m34110e = C2290b.m34110e();
        String m34109f = C2290b.m34109f();
        Validate.m671g(m34110e, "context");
        Intrinsics.checkIfNull(m34109f, "appId");
        FetchedAppSettings m33985o = FetchedAppSettingsManager.m33985o(m34109f, false);
        if (m33985o == null || !m33985o.m740a() || j <= 0) {
            return;
        }
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(m34110e);
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence("fb_aa_time_spent_view_name", str);
        internalAppEventsLogger.m17761d("fb_aa_time_spent_on_view", j, bundle);
    }

    /* renamed from: f */
    public static final void m6934f(String str, String str2, boolean z) {
        C10834a m6939a;
        Intrinsics.isThisObjectNull(str, "purchase");
        Intrinsics.isThisObjectNull(str2, "skuDetails");
        if (m6937c() && (m6939a = f28003c.m6939a(str, str2)) != null) {
            boolean z2 = false;
            if (z && FetchedAppGateKeepersManager.m749f("app_events_if_auto_log_subs", C2290b.m34109f(), false)) {
                z2 = true;
            }
            if (z2) {
                f28002b.m17758g(C10057d.m9299m(str2) ? "StartTrial" : "Subscribe", m6939a.m6931c(), m6939a.m6933a(), m6939a.m6932b());
            } else {
                f28002b.m17757h(m6939a.m6931c(), m6939a.m6933a(), m6939a.m6932b());
            }
        }
    }
}
