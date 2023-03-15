package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.C1001a;
import androidx.fragment.app.ActivityC1354d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1479r0;
import androidx.lifecycle.InterfaceC1440f0;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: androidx.biometric.d */
/* loaded from: classes.dex */
public class C0557d extends Fragment {

    /* renamed from: w0 */
    Handler f1852w0 = new Handler(Looper.getMainLooper());

    /* renamed from: x0 */
    C0582f f1853x0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.d$a */
    /* loaded from: classes.dex */
    public class RunnableC0558a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ int f1854w;

        /* renamed from: x */
        final /* synthetic */ CharSequence f1855x;

        RunnableC0558a(int i, CharSequence charSequence) {
            this.f1854w = i;
            this.f1855x = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0557d.this.f1853x0.m40170n().m40312a(this.f1854w, this.f1855x);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.d$b */
    /* loaded from: classes.dex */
    public class RunnableC0559b implements Runnable {
        RunnableC0559b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0557d.this.f1853x0.m40170n().m40311b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.d$c */
    /* loaded from: classes.dex */
    public class C0560c implements InterfaceC1440f0<BiometricPrompt.C0545b> {
        C0560c() {
        }

        @Override // androidx.lifecycle.InterfaceC1440f0
        /* renamed from: a */
        public void mo37325a(BiometricPrompt.C0545b c0545b) {
            if (c0545b != null) {
                C0557d.this.m40277A2(c0545b);
                C0557d.this.f1853x0.m40196N(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.d$d */
    /* loaded from: classes.dex */
    public class C0561d implements InterfaceC1440f0<C0556c> {
        C0561d() {
        }

        @Override // androidx.lifecycle.InterfaceC1440f0
        /* renamed from: a */
        public void mo37325a(C0556c c0556c) {
            if (c0556c != null) {
                C0557d.this.m40248x2(c0556c.m40280b(), c0556c.m40279c());
                C0557d.this.f1853x0.m40199K(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.d$e */
    /* loaded from: classes.dex */
    public class C0562e implements InterfaceC1440f0<CharSequence> {
        C0562e() {
        }

        @Override // androidx.lifecycle.InterfaceC1440f0
        /* renamed from: a */
        public void mo37325a(CharSequence charSequence) {
            if (charSequence != null) {
                C0557d.this.m40246z2(charSequence);
                C0557d.this.f1853x0.m40199K(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.d$f */
    /* loaded from: classes.dex */
    public class C0563f implements InterfaceC1440f0<Boolean> {
        C0563f() {
        }

        @Override // androidx.lifecycle.InterfaceC1440f0
        /* renamed from: a */
        public void mo37325a(Boolean bool) {
            if (bool.booleanValue()) {
                C0557d.this.m40247y2();
                C0557d.this.f1853x0.m40198L(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.d$g */
    /* loaded from: classes.dex */
    public class C0564g implements InterfaceC1440f0<Boolean> {
        C0564g() {
        }

        @Override // androidx.lifecycle.InterfaceC1440f0
        /* renamed from: a */
        public void mo37325a(Boolean bool) {
            if (bool.booleanValue()) {
                if (C0557d.this.m40252t2()) {
                    C0557d.this.m40275C2();
                } else {
                    C0557d.this.m40276B2();
                }
                C0557d.this.f1853x0.m40182b0(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.d$h */
    /* loaded from: classes.dex */
    public class C0565h implements InterfaceC1440f0<Boolean> {
        C0565h() {
        }

        @Override // androidx.lifecycle.InterfaceC1440f0
        /* renamed from: a */
        public void mo37325a(Boolean bool) {
            if (bool.booleanValue()) {
                C0557d.this.m40262j2(1);
                C0557d.this.m40259m2();
                C0557d.this.f1853x0.m40188V(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.d$i */
    /* loaded from: classes.dex */
    public class RunnableC0566i implements Runnable {
        RunnableC0566i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0557d.this.f1853x0.m40187W(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.d$j */
    /* loaded from: classes.dex */
    public class RunnableC0567j implements Runnable {

        /* renamed from: w */
        final /* synthetic */ int f1865w;

        /* renamed from: x */
        final /* synthetic */ CharSequence f1866x;

        RunnableC0567j(int i, CharSequence charSequence) {
            this.f1865w = i;
            this.f1866x = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0557d.this.m40274D2(this.f1865w, this.f1866x);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.d$k */
    /* loaded from: classes.dex */
    public class RunnableC0568k implements Runnable {

        /* renamed from: w */
        final /* synthetic */ BiometricPrompt.C0545b f1868w;

        RunnableC0568k(BiometricPrompt.C0545b c0545b) {
            this.f1868w = c0545b;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0557d.this.f1853x0.m40170n().mo40310c(this.f1868w);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.d$l */
    /* loaded from: classes.dex */
    public static class C0569l {
        /* renamed from: a */
        static Intent m40239a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.d$m */
    /* loaded from: classes.dex */
    public static class C0570m {
        /* renamed from: a */
        static void m40238a(android.hardware.biometrics.BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, authenticationCallback);
        }

        /* renamed from: b */
        static void m40237b(android.hardware.biometrics.BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, authenticationCallback);
        }

        /* renamed from: c */
        static android.hardware.biometrics.BiometricPrompt m40236c(BiometricPrompt.Builder builder) {
            return builder.build();
        }

        /* renamed from: d */
        static BiometricPrompt.Builder m40235d(Context context) {
            return new BiometricPrompt.Builder(context);
        }

        /* renamed from: e */
        static void m40234e(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        /* renamed from: f */
        static void m40233f(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        /* renamed from: g */
        static void m40232g(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        /* renamed from: h */
        static void m40231h(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.d$n */
    /* loaded from: classes.dex */
    public static class C0571n {
        /* renamed from: a */
        static void m40230a(BiometricPrompt.Builder builder, boolean z) {
            builder.setConfirmationRequired(z);
        }

        /* renamed from: b */
        static void m40229b(BiometricPrompt.Builder builder, boolean z) {
            builder.setDeviceCredentialAllowed(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.d$o */
    /* loaded from: classes.dex */
    public static class C0572o {
        /* renamed from: a */
        static void m40228a(BiometricPrompt.Builder builder, int i) {
            builder.setAllowedAuthenticators(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.d$p */
    /* loaded from: classes.dex */
    public static class ExecutorC0573p implements Executor {

        /* renamed from: w */
        private final Handler f1870w = new Handler(Looper.getMainLooper());

        ExecutorC0573p() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f1870w.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.d$q */
    /* loaded from: classes.dex */
    public static class RunnableC0574q implements Runnable {

        /* renamed from: w */
        private final WeakReference<C0557d> f1871w;

        RunnableC0574q(C0557d c0557d) {
            this.f1871w = new WeakReference<>(c0557d);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1871w.get() != null) {
                this.f1871w.get().m40266L2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.d$r */
    /* loaded from: classes.dex */
    public static class RunnableC0575r implements Runnable {

        /* renamed from: w */
        private final WeakReference<C0582f> f1872w;

        RunnableC0575r(C0582f c0582f) {
            this.f1872w = new WeakReference<>(c0582f);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1872w.get() != null) {
                this.f1872w.get().m40189U(false);
            }
        }
    }

    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.d$s */
    /* loaded from: classes.dex */
    private static class RunnableC0576s implements Runnable {

        /* renamed from: w */
        private final WeakReference<C0582f> f1873w;

        RunnableC0576s(C0582f c0582f) {
            this.f1873w = new WeakReference<>(c0582f);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1873w.get() != null) {
                this.f1873w.get().m40183a0(false);
            }
        }
    }

    /* renamed from: E2 */
    private void m40273E2(int i, CharSequence charSequence) {
        if (this.f1853x0.m40207C()) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!this.f1853x0.m40209A()) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            this.f1853x0.m40195O(false);
            this.f1853x0.m40169o().execute(new RunnableC0558a(i, charSequence));
        }
    }

    /* renamed from: F2 */
    private void m40272F2() {
        if (!this.f1853x0.m40209A()) {
            Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
        } else {
            this.f1853x0.m40169o().execute(new RunnableC0559b());
        }
    }

    /* renamed from: G2 */
    private void m40271G2(BiometricPrompt.C0545b c0545b) {
        m40270H2(c0545b);
        m40259m2();
    }

    /* renamed from: H2 */
    private void m40270H2(BiometricPrompt.C0545b c0545b) {
        if (!this.f1853x0.m40209A()) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
            return;
        }
        this.f1853x0.m40195O(false);
        this.f1853x0.m40169o().execute(new RunnableC0568k(c0545b));
    }

    /* renamed from: I2 */
    private void m40269I2() {
        BiometricPrompt.Builder m40235d = C0570m.m40235d(m37650H1().getApplicationContext());
        CharSequence m40159y = this.f1853x0.m40159y();
        CharSequence m40160x = this.f1853x0.m40160x();
        CharSequence m40167q = this.f1853x0.m40167q();
        if (m40159y != null) {
            C0570m.m40231h(m40235d, m40159y);
        }
        if (m40160x != null) {
            C0570m.m40232g(m40235d, m40160x);
        }
        if (m40167q != null) {
            C0570m.m40234e(m40235d, m40167q);
        }
        CharSequence m40161w = this.f1853x0.m40161w();
        if (!TextUtils.isEmpty(m40161w)) {
            C0570m.m40233f(m40235d, m40161w, this.f1853x0.m40169o(), this.f1853x0.m40162v());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C0571n.m40230a(m40235d, this.f1853x0.m40208B());
        }
        int m40177g = this.f1853x0.m40177g();
        if (i >= 30) {
            C0572o.m40228a(m40235d, m40177g);
        } else if (i >= 29) {
            C0571n.m40229b(m40235d, C0555b.m40285c(m40177g));
        }
        m40264h2(C0570m.m40236c(m40235d), m37654G());
    }

    /* renamed from: J2 */
    private void m40268J2() {
        Context applicationContext = m37650H1().getApplicationContext();
        C1001a m38783b = C1001a.m38783b(applicationContext);
        int m40261k2 = m40261k2(m38783b);
        if (m40261k2 != 0) {
            m40274D2(m40261k2, C0596j.m40121a(applicationContext, m40261k2));
        } else if (m37573n0()) {
            this.f1853x0.m40187W(true);
            if (!C0595i.m40123f(applicationContext, Build.MODEL)) {
                this.f1852w0.postDelayed(new RunnableC0566i(), 500L);
                C0597k.m40117B2().mo3126x2(m37620T(), "androidx.biometric.FingerprintDialogFragment");
            }
            this.f1853x0.m40194P(0);
            m40263i2(m38783b, applicationContext);
        }
    }

    /* renamed from: K2 */
    private void m40267K2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = m37589f0(C0615t.default_error_msg);
        }
        this.f1853x0.m40184Z(2);
        this.f1853x0.m40186X(charSequence);
    }

    /* renamed from: k2 */
    private static int m40261k2(C1001a c1001a) {
        if (c1001a.m38780e()) {
            return !c1001a.m38781d() ? 11 : 0;
        }
        return 12;
    }

    /* renamed from: l2 */
    private void m40260l2() {
        if (m37547y() == null) {
            return;
        }
        C0582f c0582f = (C0582f) new C1479r0(m37547y()).m36981a(C0582f.class);
        this.f1853x0 = c0582f;
        c0582f.m40173k().mo171i(this, new C0560c());
        this.f1853x0.m40175i().mo171i(this, new C0561d());
        this.f1853x0.m40174j().mo171i(this, new C0562e());
        this.f1853x0.m40158z().mo171i(this, new C0563f());
        this.f1853x0.m40202H().mo171i(this, new C0564g());
        this.f1853x0.m40205E().mo171i(this, new C0565h());
    }

    /* renamed from: n2 */
    private void m40258n2() {
        this.f1853x0.m40179e0(false);
        if (m37573n0()) {
            FragmentManager m37620T = m37620T();
            C0597k c0597k = (C0597k) m37620T.m37455j0("androidx.biometric.FingerprintDialogFragment");
            if (c0597k != null) {
                if (c0597k.m37573n0()) {
                    c0597k.mo30314k2();
                } else {
                    m37620T.m37447m().mo37177m(c0597k).mo37183g();
                }
            }
        }
    }

    /* renamed from: o2 */
    private int m40257o2() {
        Context m37654G = m37654G();
        return (m37654G == null || !C0595i.m40123f(m37654G, Build.MODEL)) ? 2000 : 0;
    }

    /* renamed from: p2 */
    private void m40256p2(int i) {
        if (i == -1) {
            m40271G2(new BiometricPrompt.C0545b(null, 1));
        } else {
            m40274D2(10, m37589f0(C0615t.generic_error_user_canceled));
        }
    }

    /* renamed from: q2 */
    private boolean m40255q2() {
        ActivityC1354d m37547y = m37547y();
        return m37547y != null && m37547y.isChangingConfigurations();
    }

    /* renamed from: r2 */
    private boolean m40254r2() {
        ActivityC1354d m37547y = m37547y();
        return (m37547y == null || this.f1853x0.m40168p() == null || !C0595i.m40122g(m37547y, Build.MANUFACTURER, Build.MODEL)) ? false : true;
    }

    /* renamed from: s2 */
    private boolean m40253s2() {
        return Build.VERSION.SDK_INT == 28 && !C0607m.m40100a(m37654G());
    }

    /* renamed from: u2 */
    private boolean m40251u2() {
        return Build.VERSION.SDK_INT < 28 || m40254r2() || m40253s2();
    }

    /* renamed from: v2 */
    private void m40250v2() {
        ActivityC1354d m37547y = m37547y();
        if (m37547y == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager m40105a = C0604l.m40105a(m37547y);
        if (m40105a == null) {
            m40274D2(12, m37589f0(C0615t.generic_error_no_keyguard));
            return;
        }
        CharSequence m40159y = this.f1853x0.m40159y();
        CharSequence m40160x = this.f1853x0.m40160x();
        CharSequence m40167q = this.f1853x0.m40167q();
        if (m40160x == null) {
            m40160x = m40167q;
        }
        Intent m40239a = C0569l.m40239a(m40105a, m40159y, m40160x);
        if (m40239a == null) {
            m40274D2(14, m37589f0(C0615t.generic_error_no_device_credential));
            return;
        }
        this.f1853x0.m40191S(true);
        if (m40251u2()) {
            m40258n2();
        }
        m40239a.setFlags(134742016);
        startActivityForResult(m40239a, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w2 */
    public static C0557d m40249w2() {
        return new C0557d();
    }

    /* renamed from: A2 */
    void m40277A2(BiometricPrompt.C0545b c0545b) {
        m40271G2(c0545b);
    }

    /* renamed from: B2 */
    void m40276B2() {
        CharSequence m40161w = this.f1853x0.m40161w();
        if (m40161w == null) {
            m40161w = m37589f0(C0615t.default_error_msg);
        }
        m40274D2(13, m40161w);
        m40262j2(2);
    }

    /* renamed from: C2 */
    void m40275C2() {
        if (Build.VERSION.SDK_INT < 21) {
            Log.e("BiometricFragment", "Failed to check device credential. Not supported prior to API 21.");
        } else {
            m40250v2();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public void mo29886D0(Bundle bundle) {
        super.mo29886D0(bundle);
        m40260l2();
    }

    /* renamed from: D2 */
    void m40274D2(int i, CharSequence charSequence) {
        m40273E2(i, charSequence);
        m40259m2();
    }

    /* renamed from: L2 */
    void m40266L2() {
        if (this.f1853x0.m40201I()) {
            return;
        }
        if (m37654G() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        this.f1853x0.m40179e0(true);
        this.f1853x0.m40195O(true);
        if (m40251u2()) {
            m40268J2();
        } else {
            m40269I2();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: a1 */
    public void mo29891a1() {
        super.mo29891a1();
        if (Build.VERSION.SDK_INT == 29 && C0555b.m40285c(this.f1853x0.m40177g())) {
            this.f1853x0.m40183a0(true);
            this.f1852w0.postDelayed(new RunnableC0576s(this.f1853x0), 250L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: b1 */
    public void mo29890b1() {
        super.mo29890b1();
        if (Build.VERSION.SDK_INT >= 29 || this.f1853x0.m40207C() || m40255q2()) {
            return;
        }
        m40262j2(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g2 */
    public void m40265g2(BiometricPrompt.C0547d c0547d, BiometricPrompt.C0546c c0546c) {
        ActivityC1354d m37547y = m37547y();
        if (m37547y == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        this.f1853x0.m40180d0(c0547d);
        int m40286b = C0555b.m40286b(c0547d, c0546c);
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && i < 30 && m40286b == 15 && c0546c == null) {
            this.f1853x0.m40190T(C0591h.m40146a());
        } else {
            this.f1853x0.m40190T(c0546c);
        }
        if (m40252t2()) {
            this.f1853x0.m40181c0(m37589f0(C0615t.confirm_device_credential_password));
        } else {
            this.f1853x0.m40181c0(null);
        }
        if (i >= 21 && m40252t2() && C0577e.m40220h(m37547y).m40226b(255) != 0) {
            this.f1853x0.m40195O(true);
            m40250v2();
        } else if (this.f1853x0.m40206D()) {
            this.f1852w0.postDelayed(new RunnableC0574q(this), 600L);
        } else {
            m40266L2();
        }
    }

    /* renamed from: h2 */
    void m40264h2(android.hardware.biometrics.BiometricPrompt biometricPrompt, Context context) {
        BiometricPrompt.CryptoObject m40143d = C0591h.m40143d(this.f1853x0.m40168p());
        CancellationSignal m40152b = this.f1853x0.m40171m().m40152b();
        ExecutorC0573p executorC0573p = new ExecutorC0573p();
        BiometricPrompt.AuthenticationCallback m40291a = this.f1853x0.m40176h().m40291a();
        try {
            if (m40143d == null) {
                C0570m.m40237b(biometricPrompt, m40152b, executorC0573p, m40291a);
            } else {
                C0570m.m40238a(biometricPrompt, m40143d, m40152b, executorC0573p, m40291a);
            }
        } catch (NullPointerException e) {
            Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e);
            m40274D2(1, context != null ? context.getString(C0615t.default_error_msg) : BuildConfig.VERSION_NAME);
        }
    }

    /* renamed from: i2 */
    void m40263i2(C1001a c1001a, Context context) {
        try {
            c1001a.m38784a(C0591h.m40142e(this.f1853x0.m40168p()), 0, this.f1853x0.m40171m().m40151c(), this.f1853x0.m40176h().m40290b(), null);
        } catch (NullPointerException e) {
            Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e);
            m40274D2(1, C0596j.m40121a(context, 1));
        }
    }

    /* renamed from: j2 */
    void m40262j2(int i) {
        if (i == 3 || !this.f1853x0.m40203G()) {
            if (m40251u2()) {
                this.f1853x0.m40194P(i);
                if (i == 1) {
                    m40273E2(10, C0596j.m40121a(m37654G(), 10));
                }
            }
            this.f1853x0.m40171m().m40153a();
        }
    }

    /* renamed from: m2 */
    void m40259m2() {
        this.f1853x0.m40179e0(false);
        m40258n2();
        if (!this.f1853x0.m40207C() && m37573n0()) {
            m37620T().m37447m().mo37177m(this).mo37183g();
        }
        Context m37654G = m37654G();
        if (m37654G == null || !C0595i.m40124e(m37654G, Build.MODEL)) {
            return;
        }
        this.f1853x0.m40189U(true);
        this.f1852w0.postDelayed(new RunnableC0575r(this.f1853x0), 600L);
    }

    /* renamed from: t2 */
    boolean m40252t2() {
        return Build.VERSION.SDK_INT <= 28 && C0555b.m40285c(this.f1853x0.m40177g());
    }

    /* renamed from: x2 */
    void m40248x2(int i, CharSequence charSequence) {
        if (!C0596j.m40120b(i)) {
            i = 8;
        }
        Context m37654G = m37654G();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21 && i2 < 29 && C0596j.m40119c(i) && m37654G != null && C0604l.m40104b(m37654G) && C0555b.m40285c(this.f1853x0.m40177g())) {
            m40250v2();
        } else if (!m40251u2()) {
            if (charSequence == null) {
                charSequence = m37589f0(C0615t.default_error_msg) + " " + i;
            }
            m40274D2(i, charSequence);
        } else {
            if (charSequence == null) {
                charSequence = C0596j.m40121a(m37654G(), i);
            }
            if (i == 5) {
                int m40172l = this.f1853x0.m40172l();
                if (m40172l == 0 || m40172l == 3) {
                    m40273E2(i, charSequence);
                }
                m40259m2();
                return;
            }
            if (this.f1853x0.m40204F()) {
                m40274D2(i, charSequence);
            } else {
                m40267K2(charSequence);
                this.f1852w0.postDelayed(new RunnableC0567j(i, charSequence), m40257o2());
            }
            this.f1853x0.m40187W(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: y0 */
    public void mo33453y0(int i, int i2, Intent intent) {
        super.mo33453y0(i, i2, intent);
        if (i == 1) {
            this.f1853x0.m40191S(false);
            m40256p2(i2);
        }
    }

    /* renamed from: y2 */
    void m40247y2() {
        if (m40251u2()) {
            m40267K2(m37589f0(C0615t.fingerprint_not_recognized));
        }
        m40272F2();
    }

    /* renamed from: z2 */
    void m40246z2(CharSequence charSequence) {
        if (m40251u2()) {
            m40267K2(charSequence);
        }
    }
}
