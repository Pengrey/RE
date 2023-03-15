package p233m4;

import android.content.SharedPreferences;
import com.facebook.C2290b;
import com.facebook.Profile;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p181jd.Intrinsics;

/* renamed from: m4.e */
/* loaded from: classes.dex */
public final class ProfileCache {

    /* renamed from: a */
    private final SharedPreferences f18920a;

    /* compiled from: ProfileCache.kt */
    /* renamed from: m4.e$a */
    /* loaded from: classes.dex */
    public static final class C7127a {
        private C7127a() {
        }

        public /* synthetic */ C7127a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7127a(null);
    }

    public ProfileCache() {
        SharedPreferences sharedPreferences = C2290b.m34110e().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkIfNull(sharedPreferences, "FacebookSdk.getApplicati…ME, Context.MODE_PRIVATE)");
        this.f18920a = sharedPreferences;
    }

    /* renamed from: a */
    public final void m19125a() {
        this.f18920a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    /* renamed from: b */
    public final Profile m19124b() {
        String string = this.f18920a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void m19123c(Profile profile) {
        Intrinsics.isThisObjectNull(profile, "profile");
        JSONObject m34123d = profile.m34123d();
        if (m34123d != null) {
            this.f18920a.edit().putString("com.facebook.ProfileManager.CachedProfile", m34123d.toString()).apply();
        }
    }
}
