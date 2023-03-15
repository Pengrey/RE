package mg;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p489zc.C13777q;

/* renamed from: mg.z0 */
/* loaded from: classes2.dex */
public final class RecentProductManager {

    /* renamed from: a */
    private final PrefsManager f19765a;

    /* renamed from: b */
    private Set f19766b;

    /* compiled from: RecentProductManager.kt */
    /* renamed from: mg.z0$a */
    /* loaded from: classes2.dex */
    public static final class C7477a {
        private C7477a() {
        }

        public /* synthetic */ C7477a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7477a(null);
    }

    public RecentProductManager(PrefsManager prefsManager) {
        Intrinsics.isThisObjectNull(prefsManager, "prefsManager");
        this.f19765a = prefsManager;
        this.f19766b = prefsManager.m18529h();
    }

    /* renamed from: a */
    public final void m18406a(String str) {
        Intrinsics.isThisObjectNull(str, "name");
        Set set = this.f19766b;
        if (set.contains(str)) {
            set.remove(str);
        }
        set.add(str);
        if (set.size() == 11) {
            set.remove(C13777q.m257K(set));
        }
        this.f19766b = set;
        m18404c();
    }

    /* renamed from: b */
    public final Set m18405b() {
        return this.f19766b;
    }

    /* renamed from: c */
    public final void m18404c() {
        this.f19765a.m18550J(this.f19766b);
    }
}
