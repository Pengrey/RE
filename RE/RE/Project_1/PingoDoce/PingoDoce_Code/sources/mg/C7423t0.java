package mg;

import android.content.SharedPreferences;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import pg.OnboardingFlowDataSharedPreferences;

/* renamed from: mg.t0 */
/* loaded from: classes2.dex */
public final class C7423t0 implements InterfaceC11614c<PrefsManager> {

    /* renamed from: a */
    private final InterfaceC12341a<SharedPreferences> f19698a;

    /* renamed from: b */
    private final InterfaceC12341a<OnboardingFlowDataSharedPreferences> f19699b;

    public C7423t0(InterfaceC12341a<SharedPreferences> interfaceC12341a, InterfaceC12341a<OnboardingFlowDataSharedPreferences> interfaceC12341a2) {
        this.f19698a = interfaceC12341a;
        this.f19699b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C7423t0 m18469a(InterfaceC12341a<SharedPreferences> interfaceC12341a, InterfaceC12341a<OnboardingFlowDataSharedPreferences> interfaceC12341a2) {
        return new C7423t0(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static PrefsManager m18467c(SharedPreferences sharedPreferences, OnboardingFlowDataSharedPreferences onboardingFlowDataSharedPreferences) {
        return new PrefsManager(sharedPreferences, onboardingFlowDataSharedPreferences);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public PrefsManager mo42226get() {
        return m18467c(this.f19698a.mo42226get(), this.f19699b.mo42226get());
    }
}
