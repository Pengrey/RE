package mg;

import androidx.biometric.C0577e;
import p181jd.Intrinsics;

/* renamed from: mg.j */
/* loaded from: classes2.dex */
public final class BiometricsManager {

    /* renamed from: a */
    private final EncryptedPrefsManager f19325a;

    public BiometricsManager(EncryptedPrefsManager encryptedPrefsManager, C0577e c0577e) {
        Intrinsics.isThisObjectNull(encryptedPrefsManager, "encryptedPrefsManager");
        Intrinsics.isThisObjectNull(c0577e, "biometricManager");
        this.f19325a = encryptedPrefsManager;
    }

    /* renamed from: a */
    public final boolean m18775a(boolean z) {
        return this.f19325a.m18425a(z);
    }

    /* renamed from: b */
    public final boolean m18774b() {
        return this.f19325a.m18420f();
    }

    /* renamed from: c */
    public final boolean m18773c() {
        return this.f19325a.m18417i();
    }

    /* renamed from: d */
    public final boolean m18772d(boolean z) {
        return this.f19325a.m18416j(z);
    }
}
