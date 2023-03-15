package p482z4;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.facebook.C2290b;
import p181jd.Intrinsics;

/* renamed from: z4.h */
/* loaded from: classes.dex */
public final class InstallReferrerUtil {

    /* renamed from: a */
    public static final InstallReferrerUtil f34685a = new InstallReferrerUtil();

    /* compiled from: InstallReferrerUtil.kt */
    /* renamed from: z4.h$a */
    /* loaded from: classes.dex */
    public interface InterfaceC13644a {
        /* renamed from: a */
        void m720a(String str);
    }

    /* compiled from: InstallReferrerUtil.kt */
    /* renamed from: z4.h$b */
    /* loaded from: classes.dex */
    public static final class C13645b implements InstallReferrerStateListener {

        /* renamed from: a */
        final /* synthetic */ InstallReferrerClient f34686a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC13644a f34687b;

        C13645b(InstallReferrerClient installReferrerClient, InterfaceC13644a interfaceC13644a) {
            this.f34686a = installReferrerClient;
            this.f34687b = interfaceC13644a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
            if (r0 != false) goto L20;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo34278a(int r5) {
            /*
                r4 = this;
                boolean r0 = p076e5.CrashShieldHandler.m25963d(r4)
                if (r0 == 0) goto L7
                return
            L7:
                r0 = 2
                if (r5 == 0) goto L13
                if (r5 == r0) goto Ld
                goto L45
            Ld:
                z4.h r5 = p482z4.InstallReferrerUtil.f34685a     // Catch: java.lang.Throwable -> L46
                p482z4.InstallReferrerUtil.m725a(r5)     // Catch: java.lang.Throwable -> L46
                goto L45
            L13:
                com.android.installreferrer.api.InstallReferrerClient r5 = r4.f34686a     // Catch: java.lang.Throwable -> L46 android.os.RemoteException -> L4a
                java.lang.String r1 = "referrerClient"
                p181jd.Intrinsics.checkIfNull(r5, r1)     // Catch: java.lang.Throwable -> L46 android.os.RemoteException -> L4a
                com.android.installreferrer.api.ReferrerDetails r5 = r5.mo34275a()     // Catch: java.lang.Throwable -> L46 android.os.RemoteException -> L4a
                java.lang.String r1 = "referrerClient.installReferrer"
                p181jd.Intrinsics.checkIfNull(r5, r1)     // Catch: java.lang.Throwable -> L46 android.os.RemoteException -> L4a
                java.lang.String r5 = r5.m34276a()     // Catch: java.lang.Throwable -> L46
                if (r5 == 0) goto L40
                java.lang.String r1 = "fb"
                r2 = 0
                r3 = 0
                boolean r1 = sd.C10163k.m9002H(r5, r1, r3, r0, r2)     // Catch: java.lang.Throwable -> L46
                if (r1 != 0) goto L3b
                java.lang.String r1 = "facebook"
                boolean r0 = sd.C10163k.m9002H(r5, r1, r3, r0, r2)     // Catch: java.lang.Throwable -> L46
                if (r0 == 0) goto L40
            L3b:
                z4.h$a r0 = r4.f34687b     // Catch: java.lang.Throwable -> L46
                r0.m720a(r5)     // Catch: java.lang.Throwable -> L46
            L40:
                z4.h r5 = p482z4.InstallReferrerUtil.f34685a     // Catch: java.lang.Throwable -> L46
                p482z4.InstallReferrerUtil.m725a(r5)     // Catch: java.lang.Throwable -> L46
            L45:
                return
            L46:
                r5 = move-exception
                p076e5.CrashShieldHandler.m25965b(r5, r4)
            L4a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p482z4.InstallReferrerUtil.C13645b.mo34278a(int):void");
        }

        /* renamed from: b */
        public void mo34277b() {
        }
    }

    private InstallReferrerUtil() {
    }

    /* renamed from: a */
    public static final /* synthetic */ void m725a(InstallReferrerUtil installReferrerUtil) {
        installReferrerUtil.m721e();
    }

    /* renamed from: b */
    private final boolean m724b() {
        return C2290b.m34110e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    /* renamed from: c */
    private final void m723c(InterfaceC13644a interfaceC13644a) {
        InstallReferrerClient m34279a = InstallReferrerClient.m34280b(C2290b.m34110e()).m34279a();
        try {
            m34279a.mo34274c(new C13645b(m34279a, interfaceC13644a));
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static final void m722d(InterfaceC13644a interfaceC13644a) {
        Intrinsics.isThisObjectNull(interfaceC13644a, "callback");
        InstallReferrerUtil installReferrerUtil = f34685a;
        if (installReferrerUtil.m724b()) {
            return;
        }
        installReferrerUtil.m723c(interfaceC13644a);
    }

    /* renamed from: e */
    private final void m721e() {
        C2290b.m34110e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}
