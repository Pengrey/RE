package p377u4;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.C2290b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: u4.j */
/* loaded from: classes.dex */
public final class C10839j {

    /* renamed from: c */
    public static final C10840a f28027c = new C10840a(null);

    /* renamed from: a */
    private final String f28028a;

    /* renamed from: b */
    private final boolean f28029b;

    /* compiled from: SourceApplicationInfo.kt */
    /* renamed from: u4.j$a */
    /* loaded from: classes.dex */
    public static final class C10840a {
        private C10840a() {
        }

        /* renamed from: a */
        public final void m6901a() {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C2290b.m34110e()).edit();
            edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            edit.apply();
        }

        /* renamed from: b */
        public final C10839j m6900b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C2290b.m34110e());
            if (defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                return new C10839j(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), null);
            }
            return null;
        }

        public /* synthetic */ C10840a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C10839j(String str, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z);
    }

    /* renamed from: a */
    public final void m6902a() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C2290b.m34110e()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f28028a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f28029b);
        edit.apply();
    }

    public String toString() {
        String str = this.f28029b ? "Applink" : "Unclassified";
        if (this.f28028a != null) {
            return str + '(' + this.f28028a + ')';
        }
        return str;
    }

    private C10839j(String str, boolean z) {
        this.f28028a = str;
        this.f28029b = z;
    }
}
