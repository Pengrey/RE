package p449xg;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import androidx.biometric.C0577e;
import androidx.security.crypto.C1671b;
import androidx.security.crypto.SharedPreferencesC1665a;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.play.core.review.C3955d;
import com.google.android.play.core.review.InterfaceC3954c;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import mg.AnalyticsManager;
import ng.FacebookTracker;
import ng.FirebaseTracker;
import org.threeten.p283bp.format.C8223b;
import p107ff.CertificatePinner;
import p107ff.InterfaceC5503w;
import p108fg.AppInterceptorDataProvider;
import p181jd.Intrinsics;
import p214l4.ChuckerInterceptor;
import p248n4.AppEventsLogger;
import p370te.OAuthManager;
import p378u5.ResourcesProvider;
import p489zc.C13780s;
import sg.AppInterceptor;

/* renamed from: xg.b */
/* loaded from: classes2.dex */
public final class AppProviders {

    /* renamed from: a */
    public static final AppProviders f32545a = new AppProviders();

    private AppProviders() {
    }

    /* renamed from: a */
    public final AnalyticsManager m2981a(FirebaseAnalytics firebaseAnalytics, AppEventsLogger appEventsLogger) {
        List m194j;
        Intrinsics.isThisObjectNull(firebaseAnalytics, "firebase");
        Intrinsics.isThisObjectNull(appEventsLogger, "facebook");
        m194j = C13780s.m194j(new FirebaseTracker(firebaseAnalytics), new FacebookTracker(appEventsLogger));
        return new AnalyticsManager(m194j);
    }

    /* renamed from: b */
    public final SimpleDateFormat m2980b() {
        return new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
    }

    /* renamed from: c */
    public final C8223b m2979c() {
        C8223b m16085g = C8223b.m16085g("dd/MM/yyyy, HH:mm", Locale.getDefault());
        Intrinsics.ifNullDoSomething(m16085g);
        return m16085g;
    }

    /* renamed from: d */
    public final C0577e m2978d(Context context) {
        Intrinsics.isThisObjectNull(context, "context");
        C0577e m40220h = C0577e.m40220h(context);
        Intrinsics.checkIfNull(m40220h, "from(context)");
        return m40220h;
    }

    /* renamed from: e */
    public final SimpleDateFormat m2977e() {
        return new SimpleDateFormat("dd/MMM/yyyy", Locale.getDefault());
    }

    /* renamed from: f */
    public final CertificatePinner m2976f() {
        return new CertificatePinner.C5475a().m24142a("*.pingodoce.pt", "sha256/cUaw3QqfwKplugvKTcV5YMMXqUiho8KhrtT+Sxg/8vo=").m24141b();
    }

    /* renamed from: g */
    public final InterfaceC5503w m2975g(Context context) {
        Intrinsics.isThisObjectNull(context, "context");
        return new ChuckerInterceptor.C6982a(context).m19661a(true).m19659c("Authorization", "Bearer").m19660b();
    }

    /* renamed from: h */
    public final InterfaceC5503w m2974h(OAuthManager oAuthManager, AppInterceptorDataProvider appInterceptorDataProvider) {
        Intrinsics.isThisObjectNull(oAuthManager, "oAuthManager");
        Intrinsics.isThisObjectNull(appInterceptorDataProvider, "appInterceptorDataProvider");
        return new AppInterceptor(appInterceptorDataProvider, oAuthManager);
    }

    /* renamed from: i */
    public final int m2973i() {
        return 2131951633;
    }

    /* renamed from: j */
    public final int m2972j() {
        return 2131951632;
    }

    /* renamed from: k */
    public final SharedPreferences m2971k(Context context, KeyGenParameterSpec keyGenParameterSpec) {
        Intrinsics.isThisObjectNull(context, "context");
        Intrinsics.isThisObjectNull(keyGenParameterSpec, "masterKeySpec");
        String packageName = context.getPackageName();
        SharedPreferences m35781a = SharedPreferencesC1665a.m35781a(context, packageName + "_encrypted", new C1671b.C1672a(context).m35767c(keyGenParameterSpec).m35769a(), SharedPreferencesC1665a.EnumC1669d.AES256_SIV, SharedPreferencesC1665a.EnumC1670e.AES256_GCM);
        Intrinsics.checkIfNull(m35781a, "create(\n            cont…heme.AES256_GCM\n        )");
        return m35781a;
    }

    /* renamed from: l */
    public final AppEventsLogger m2970l(Context context) {
        Intrinsics.isThisObjectNull(context, "context");
        return AppEventsLogger.f20233b.m17809f(context);
    }

    /* renamed from: m */
    public final FirebaseAnalytics m2969m(Context context) {
        Intrinsics.isThisObjectNull(context, "context");
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        Intrinsics.checkIfNull(firebaseAnalytics, "getInstance(context)");
        return firebaseAnalytics;
    }

    /* renamed from: n */
    public final InterfaceC3954c m2968n(Context context) {
        Intrinsics.isThisObjectNull(context, "context");
        InterfaceC3954c m28525a = C3955d.m28525a(context);
        Intrinsics.checkIfNull(m28525a, "{\n            ReviewMana…create(context)\n        }");
        return m28525a;
    }

    /* renamed from: o */
    public final KeyGenParameterSpec m2967o() {
        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).setKeySize(256).build();
        Intrinsics.checkIfNull(build, "Builder(\n            Mas…IZE)\n            .build()");
        return build;
    }

    /* renamed from: p */
    public final SharedPreferences m2966p(Context context, KeyGenParameterSpec keyGenParameterSpec) {
        Intrinsics.isThisObjectNull(context, "context");
        Intrinsics.isThisObjectNull(keyGenParameterSpec, "masterKeySpec");
        String packageName = context.getPackageName();
        SharedPreferences m35781a = SharedPreferencesC1665a.m35781a(context, packageName + "_oauth", new C1671b.C1672a(context).m35767c(keyGenParameterSpec).m35769a(), SharedPreferencesC1665a.EnumC1669d.AES256_SIV, SharedPreferencesC1665a.EnumC1670e.AES256_GCM);
        Intrinsics.checkIfNull(m35781a, "create(\n            cont…heme.AES256_GCM\n        )");
        return m35781a;
    }

    /* renamed from: q */
    public final ResourcesProvider m2965q(Context context) {
        Intrinsics.isThisObjectNull(context, "context");
        return new ResourcesProvider(context, C2336R.style.App);
    }

    /* renamed from: r */
    public final SimpleDateFormat m2964r() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.getDefault());
    }

    /* renamed from: s */
    public final SimpleDateFormat m2963s() {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    }

    /* renamed from: t */
    public final SharedPreferences m2962t(Context context) {
        Intrinsics.isThisObjectNull(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName(), 0);
        Intrinsics.checkIfNull(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}
