package pg;

import android.content.SharedPreferences;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: pg.b */
/* loaded from: classes2.dex */
public final class C8622b implements InterfaceC11614c<OnboardingFlowDataSharedPreferences> {

    /* renamed from: a */
    private final InterfaceC12341a<SharedPreferences> f22233a;

    public C8622b(InterfaceC12341a<SharedPreferences> interfaceC12341a) {
        this.f22233a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C8622b m14988a(InterfaceC12341a<SharedPreferences> interfaceC12341a) {
        return new C8622b(interfaceC12341a);
    }

    /* renamed from: c */
    public static OnboardingFlowDataSharedPreferences m14986c(SharedPreferences sharedPreferences) {
        return new OnboardingFlowDataSharedPreferences(sharedPreferences);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public OnboardingFlowDataSharedPreferences mo42226get() {
        return m14986c(this.f22233a.mo42226get());
    }
}
