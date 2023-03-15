package p248n4;

import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import p076e5.CrashShieldHandler;
import p264o4.C8014a;
import p328r4.EventDeactivationManager;
import p350s4.C10059f;
import p397v4.ModelManager;
import p437x4.RestrictiveDataManager;
import p482z4.FetchedAppSettings;

/* renamed from: n4.i */
/* loaded from: classes.dex */
public class C7664i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppEventsManager.java */
    /* renamed from: n4.i$a */
    /* loaded from: classes.dex */
    public static class C7665a implements FetchedAppSettingsManager.InterfaceC2321b {

        /* compiled from: AppEventsManager.java */
        /* renamed from: n4.i$a$a */
        /* loaded from: classes.dex */
        class C7666a implements FeatureManager.InterfaceC2316a {
            C7666a(C7665a c7665a) {
            }

            @Override // com.facebook.internal.FeatureManager.InterfaceC2316a
            /* renamed from: a */
            public void mo17769a(boolean z) {
                if (z) {
                    C8014a.m17170c();
                }
            }
        }

        /* compiled from: AppEventsManager.java */
        /* renamed from: n4.i$a$b */
        /* loaded from: classes.dex */
        class C7667b implements FeatureManager.InterfaceC2316a {
            C7667b(C7665a c7665a) {
            }

            @Override // com.facebook.internal.FeatureManager.InterfaceC2316a
            /* renamed from: a */
            public void mo17769a(boolean z) {
                if (z) {
                    RestrictiveDataManager.m3137a();
                }
            }
        }

        /* compiled from: AppEventsManager.java */
        /* renamed from: n4.i$a$c */
        /* loaded from: classes.dex */
        class C7668c implements FeatureManager.InterfaceC2316a {
            C7668c(C7665a c7665a) {
            }

            @Override // com.facebook.internal.FeatureManager.InterfaceC2316a
            /* renamed from: a */
            public void mo17769a(boolean z) {
                if (z) {
                    ModelManager.m6091g();
                }
            }
        }

        /* compiled from: AppEventsManager.java */
        /* renamed from: n4.i$a$d */
        /* loaded from: classes.dex */
        class C7669d implements FeatureManager.InterfaceC2316a {
            C7669d(C7665a c7665a) {
            }

            @Override // com.facebook.internal.FeatureManager.InterfaceC2316a
            /* renamed from: a */
            public void mo17769a(boolean z) {
                if (z) {
                    EventDeactivationManager.m9927a();
                }
            }
        }

        /* compiled from: AppEventsManager.java */
        /* renamed from: n4.i$a$e */
        /* loaded from: classes.dex */
        class C7670e implements FeatureManager.InterfaceC2316a {
            C7670e(C7665a c7665a) {
            }

            @Override // com.facebook.internal.FeatureManager.InterfaceC2316a
            /* renamed from: a */
            public void mo17769a(boolean z) {
                if (z) {
                    C10059f.m9287a();
                }
            }
        }

        C7665a() {
        }

        @Override // com.facebook.internal.FetchedAppSettingsManager.InterfaceC2321b
        /* renamed from: a */
        public void mo17771a(FetchedAppSettings fetchedAppSettings) {
            FeatureManager.m34008a(FeatureManager.EnumC2317b.AAM, new C7666a(this));
            FeatureManager.m34008a(FeatureManager.EnumC2317b.RestrictiveDataFiltering, new C7667b(this));
            FeatureManager.m34008a(FeatureManager.EnumC2317b.PrivacyProtection, new C7668c(this));
            FeatureManager.m34008a(FeatureManager.EnumC2317b.EventDeactivation, new C7669d(this));
            FeatureManager.m34008a(FeatureManager.EnumC2317b.IapLogging, new C7670e(this));
        }

        @Override // com.facebook.internal.FetchedAppSettingsManager.InterfaceC2321b
        /* renamed from: b */
        public void mo17770b() {
        }
    }

    /* renamed from: a */
    public static void m17772a() {
        if (CrashShieldHandler.m25963d(C7664i.class)) {
            return;
        }
        try {
            FetchedAppSettingsManager.m33992h(new C7665a());
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C7664i.class);
        }
    }
}
