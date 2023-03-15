package mg;

import android.content.SharedPreferences;
import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p398v5.SharedPrefsKtx;
import pt.pingodoce.app.data.remote.models.response.Consent;

/* renamed from: mg.y */
/* loaded from: classes2.dex */
public final class EncryptedPrefsManager {

    /* renamed from: a */
    private final SharedPreferences f19761a;

    /* compiled from: EncryptedPrefsManager.kt */
    /* renamed from: mg.y$a */
    /* loaded from: classes2.dex */
    public static final class C7474a {
        private C7474a() {
        }

        public /* synthetic */ C7474a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7474a(null);
    }

    public EncryptedPrefsManager(SharedPreferences sharedPreferences) {
        Intrinsics.isThisObjectNull(sharedPreferences, "prefs");
        this.f19761a = sharedPreferences;
    }

    /* renamed from: a */
    public final boolean m18425a(boolean z) {
        return SharedPrefsKtx.m6039h(this.f19761a, "KEY_FOR_BIOMETRIC_ENROLLMENT", Boolean.valueOf(z), null, 4, null);
    }

    /* renamed from: b */
    public final void m18424b() {
        try {
            this.f19761a.edit().clear().apply();
        } catch (Exception unused) {
            this.f19761a.edit().remove("KEY_FOR_PIN").apply();
            this.f19761a.edit().remove("KEY_FOR_BIOMETRIC_ACTIVE").apply();
            this.f19761a.edit().remove("KEY_FOR_BIOMETRIC_ENROLLMENT").apply();
            this.f19761a.edit().remove("KEY_FOR_GUEST_LAST_CONSENTS").apply();
            this.f19761a.edit().remove("KEY_FOR_LOCKED").apply();
        }
    }

    /* renamed from: c */
    public final void m18423c() {
        this.f19761a.edit().remove("KEY_FOR_PIN").apply();
    }

    /* renamed from: d */
    public final Consent m18422d() {
        return (Consent) SharedPrefsKtx.m6043d(this.f19761a, "KEY_FOR_GUEST_LAST_CONSENTS", C6450z.m20906b(Consent.class), new Consent(null, null, null, null, null, 31, null), null, 8, null);
    }

    /* renamed from: e */
    public final String m18421e() {
        return (String) SharedPrefsKtx.m6043d(this.f19761a, "KEY_FOR_PIN", C6450z.m20906b(String.class), BuildConfig.VERSION_NAME, null, 8, null);
    }

    /* renamed from: f */
    public final boolean m18420f() {
        return ((Boolean) SharedPrefsKtx.m6043d(this.f19761a, "KEY_FOR_BIOMETRIC_ACTIVE", C6450z.m20906b(Boolean.TYPE), Boolean.FALSE, null, 8, null)).booleanValue();
    }

    /* renamed from: g */
    public final boolean m18419g() {
        return SharedPrefsKtx.m6039h(this.f19761a, "KEY_FOR_LOCKED", Boolean.TRUE, null, 4, null);
    }

    /* renamed from: h */
    public final boolean m18418h() {
        return ((Boolean) SharedPrefsKtx.m6043d(this.f19761a, "KEY_FOR_LOCKED", C6450z.m20906b(Boolean.TYPE), Boolean.FALSE, null, 8, null)).booleanValue();
    }

    /* renamed from: i */
    public final boolean m18417i() {
        return ((Boolean) SharedPrefsKtx.m6043d(this.f19761a, "KEY_FOR_BIOMETRIC_ENROLLMENT", C6450z.m20906b(Boolean.TYPE), Boolean.TRUE, null, 8, null)).booleanValue();
    }

    /* renamed from: j */
    public final boolean m18416j(boolean z) {
        return SharedPrefsKtx.m6039h(this.f19761a, "KEY_FOR_BIOMETRIC_ACTIVE", Boolean.valueOf(z), null, 4, null);
    }

    /* renamed from: k */
    public final boolean m18415k(Consent consent) {
        Intrinsics.isThisObjectNull(consent, "consents");
        return SharedPrefsKtx.m6039h(this.f19761a, "KEY_FOR_GUEST_LAST_CONSENTS", consent, null, 4, null);
    }

    /* renamed from: l */
    public final boolean m18414l(String str) {
        Intrinsics.isThisObjectNull(str, "pin");
        return SharedPrefsKtx.m6039h(this.f19761a, "KEY_FOR_PIN", str, null, 4, null);
    }

    /* renamed from: m */
    public final boolean m18413m() {
        return SharedPrefsKtx.m6039h(this.f19761a, "KEY_FOR_LOCKED", Boolean.FALSE, null, 4, null);
    }
}
