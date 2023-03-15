package p233m4;

import android.content.Intent;
import com.facebook.C2290b;
import com.facebook.Profile;
import com.facebook.internal.Utility;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p435x2.C12256a;
import p468yc.C13195u;

/* renamed from: m4.f */
/* loaded from: classes.dex */
public final class ProfileManager {

    /* renamed from: d */
    private static volatile ProfileManager f18921d;

    /* renamed from: e */
    public static final C7128a f18922e = new C7128a(null);

    /* renamed from: a */
    private Profile f18923a;

    /* renamed from: b */
    private final C12256a f18924b;

    /* renamed from: c */
    private final ProfileCache f18925c;

    /* compiled from: ProfileManager.kt */
    /* renamed from: m4.f$a */
    /* loaded from: classes.dex */
    public static final class C7128a {
        private C7128a() {
        }

        /* renamed from: a */
        public final ProfileManager m19114a() {
            if (ProfileManager.m19122a() == null) {
                synchronized (this) {
                    if (ProfileManager.m19122a() == null) {
                        C12256a m3182b = C12256a.m3182b(C2290b.m34110e());
                        Intrinsics.checkIfNull(m3182b, "LocalBroadcastManager.ge…tance(applicationContext)");
                        ProfileManager.m19121b(new ProfileManager(m3182b, new ProfileCache()));
                    }
                    C13195u c13195u = C13195u.f34156a;
                }
            }
            ProfileManager m19122a = ProfileManager.m19122a();
            if (m19122a != null) {
                return m19122a;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public /* synthetic */ C7128a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ProfileManager(C12256a c12256a, ProfileCache profileCache) {
        Intrinsics.isThisObjectNull(c12256a, "localBroadcastManager");
        Intrinsics.isThisObjectNull(profileCache, "profileCache");
        this.f18924b = c12256a;
        this.f18925c = profileCache;
    }

    /* renamed from: a */
    public static final /* synthetic */ ProfileManager m19122a() {
        return f18921d;
    }

    /* renamed from: b */
    public static final /* synthetic */ void m19121b(ProfileManager profileManager) {
        f18921d = profileManager;
    }

    /* renamed from: d */
    public static final ProfileManager m19119d() {
        return f18922e.m19114a();
    }

    /* renamed from: f */
    private final void m19117f(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.f18924b.m3180d(intent);
    }

    /* renamed from: h */
    private final void m19115h(Profile profile, boolean z) {
        Profile profile2 = this.f18923a;
        this.f18923a = profile;
        if (z) {
            if (profile != null) {
                this.f18925c.m19123c(profile);
            } else {
                this.f18925c.m19125a();
            }
        }
        if (Utility.m33957a(profile2, profile)) {
            return;
        }
        m19117f(profile2, profile);
    }

    /* renamed from: c */
    public final Profile m19120c() {
        return this.f18923a;
    }

    /* renamed from: e */
    public final boolean m19118e() {
        Profile m19124b = this.f18925c.m19124b();
        if (m19124b != null) {
            m19115h(m19124b, false);
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void m19116g(Profile profile) {
        m19115h(profile, true);
    }
}
