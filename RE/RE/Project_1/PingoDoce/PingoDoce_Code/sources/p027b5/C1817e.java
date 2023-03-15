package p027b5;

import com.facebook.C2290b;
import com.facebook.internal.FeatureManager;
import p041c5.ANRHandler;
import p056d5.CrashHandler;
import p076e5.CrashShieldHandler;
import p097f5.ErrorReportHandler;
import p117g5.C5609a;

/* renamed from: b5.e */
/* loaded from: classes.dex */
public final class C1817e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InstrumentManager.kt */
    /* renamed from: b5.e$a */
    /* loaded from: classes.dex */
    public static final class C1818a implements FeatureManager.InterfaceC2316a {

        /* renamed from: a */
        public static final C1818a f5518a = new C1818a();

        C1818a() {
        }

        @Override // com.facebook.internal.FeatureManager.InterfaceC2316a
        /* renamed from: a */
        public final void mo17769a(boolean z) {
            if (z) {
                CrashHandler.f13013d.m26722a();
                if (FeatureManager.m34002g(FeatureManager.EnumC2317b.CrashShield)) {
                    ExceptionAnalyzer.m35326a();
                    CrashShieldHandler.m25966a();
                }
                if (FeatureManager.m34002g(FeatureManager.EnumC2317b.ThreadCheck)) {
                    C5609a.m23579a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InstrumentManager.kt */
    /* renamed from: b5.e$b */
    /* loaded from: classes.dex */
    public static final class C1819b implements FeatureManager.InterfaceC2316a {

        /* renamed from: a */
        public static final C1819b f5519a = new C1819b();

        C1819b() {
        }

        @Override // com.facebook.internal.FeatureManager.InterfaceC2316a
        /* renamed from: a */
        public final void mo17769a(boolean z) {
            if (z) {
                ErrorReportHandler.m24387a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InstrumentManager.kt */
    /* renamed from: b5.e$c */
    /* loaded from: classes.dex */
    public static final class C1820c implements FeatureManager.InterfaceC2316a {

        /* renamed from: a */
        public static final C1820c f5520a = new C1820c();

        C1820c() {
        }

        @Override // com.facebook.internal.FeatureManager.InterfaceC2316a
        /* renamed from: a */
        public final void mo17769a(boolean z) {
            if (z) {
                ANRHandler.m34701a();
            }
        }
    }

    static {
        new C1817e();
    }

    private C1817e() {
    }

    /* renamed from: a */
    public static final void m35309a() {
        if (C2290b.m34106i()) {
            FeatureManager.m34008a(FeatureManager.EnumC2317b.CrashReport, C1818a.f5518a);
            FeatureManager.m34008a(FeatureManager.EnumC2317b.ErrorReport, C1819b.f5519a);
            FeatureManager.m34008a(FeatureManager.EnumC2317b.AnrReport, C1820c.f5520a);
        }
    }
}
