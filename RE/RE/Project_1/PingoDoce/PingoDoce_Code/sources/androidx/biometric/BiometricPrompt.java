package androidx.biometric;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.ActivityC1354d;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.C1479r0;
import androidx.lifecycle.InterfaceC1442g0;
import androidx.lifecycle.InterfaceC1489u;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public class BiometricPrompt {

    /* renamed from: a */
    private FragmentManager f1823a;

    /* loaded from: classes.dex */
    private static class ResetCallbackObserver implements InterfaceC1489u {

        /* renamed from: w */
        private final WeakReference<C0582f> f1824w;

        @InterfaceC1442g0(AbstractC1469p.EnumC1471b.ON_DESTROY)
        public void resetCallback() {
            if (this.f1824w.get() != null) {
                this.f1824w.get().m40200J();
            }
        }
    }

    /* renamed from: androidx.biometric.BiometricPrompt$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0544a {
        /* renamed from: a */
        public void m40312a(int i, CharSequence charSequence) {
        }

        /* renamed from: b */
        public void m40311b() {
        }

        /* renamed from: c */
        public void mo40310c(C0545b c0545b) {
        }
    }

    /* renamed from: androidx.biometric.BiometricPrompt$b */
    /* loaded from: classes.dex */
    public static class C0545b {

        /* renamed from: a */
        private final C0546c f1825a;

        /* renamed from: b */
        private final int f1826b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0545b(C0546c c0546c, int i) {
            this.f1825a = c0546c;
            this.f1826b = i;
        }

        /* renamed from: a */
        public int m40309a() {
            return this.f1826b;
        }

        /* renamed from: b */
        public C0546c m40308b() {
            return this.f1825a;
        }
    }

    /* renamed from: androidx.biometric.BiometricPrompt$d */
    /* loaded from: classes.dex */
    public static class C0547d {

        /* renamed from: a */
        private final CharSequence f1831a;

        /* renamed from: b */
        private final CharSequence f1832b;

        /* renamed from: c */
        private final CharSequence f1833c;

        /* renamed from: d */
        private final CharSequence f1834d;

        /* renamed from: e */
        private final boolean f1835e;

        /* renamed from: f */
        private final boolean f1836f;

        /* renamed from: g */
        private final int f1837g;

        /* renamed from: androidx.biometric.BiometricPrompt$d$a */
        /* loaded from: classes.dex */
        public static class C0548a {

            /* renamed from: a */
            private CharSequence f1838a = null;

            /* renamed from: b */
            private CharSequence f1839b = null;

            /* renamed from: c */
            private CharSequence f1840c = null;

            /* renamed from: d */
            private CharSequence f1841d = null;

            /* renamed from: e */
            private boolean f1842e = true;

            /* renamed from: f */
            private boolean f1843f = false;

            /* renamed from: g */
            private int f1844g = 0;

            /* renamed from: a */
            public C0547d m40296a() {
                boolean z;
                if (!TextUtils.isEmpty(this.f1838a)) {
                    if (C0555b.m40283e(this.f1844g)) {
                        int i = this.f1844g;
                        if (i != 0) {
                            z = C0555b.m40285c(i);
                        } else {
                            z = this.f1843f;
                        }
                        if (TextUtils.isEmpty(this.f1841d) && !z) {
                            throw new IllegalArgumentException("Negative text must be set and non-empty.");
                        }
                        if (!TextUtils.isEmpty(this.f1841d) && z) {
                            throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
                        }
                        return new C0547d(this.f1838a, this.f1839b, this.f1840c, this.f1841d, this.f1842e, this.f1843f, this.f1844g);
                    }
                    throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + C0555b.m40287a(this.f1844g));
                }
                throw new IllegalArgumentException("Title must be set and non-empty.");
            }

            /* renamed from: b */
            public C0548a m40295b(int i) {
                this.f1844g = i;
                return this;
            }

            @Deprecated
            /* renamed from: c */
            public C0548a m40294c(boolean z) {
                this.f1843f = z;
                return this;
            }

            /* renamed from: d */
            public C0548a m40293d(CharSequence charSequence) {
                this.f1841d = charSequence;
                return this;
            }

            /* renamed from: e */
            public C0548a m40292e(CharSequence charSequence) {
                this.f1838a = charSequence;
                return this;
            }
        }

        C0547d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, boolean z2, int i) {
            this.f1831a = charSequence;
            this.f1832b = charSequence2;
            this.f1833c = charSequence3;
            this.f1834d = charSequence4;
            this.f1835e = z;
            this.f1836f = z2;
            this.f1837g = i;
        }

        /* renamed from: a */
        public int m40303a() {
            return this.f1837g;
        }

        /* renamed from: b */
        public CharSequence m40302b() {
            return this.f1833c;
        }

        /* renamed from: c */
        public CharSequence m40301c() {
            CharSequence charSequence = this.f1834d;
            return charSequence != null ? charSequence : BuildConfig.VERSION_NAME;
        }

        /* renamed from: d */
        public CharSequence m40300d() {
            return this.f1832b;
        }

        /* renamed from: e */
        public CharSequence m40299e() {
            return this.f1831a;
        }

        /* renamed from: f */
        public boolean m40298f() {
            return this.f1835e;
        }

        @Deprecated
        /* renamed from: g */
        public boolean m40297g() {
            return this.f1836f;
        }
    }

    @SuppressLint({"LambdaLast"})
    public BiometricPrompt(ActivityC1354d activityC1354d, Executor executor, AbstractC0544a abstractC0544a) {
        if (activityC1354d == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        if (abstractC0544a != null) {
            m40313f(activityC1354d.m37323P(), m40314e(activityC1354d), executor, abstractC0544a);
            return;
        }
        throw new IllegalArgumentException("AuthenticationCallback must not be null.");
    }

    /* renamed from: b */
    private void m40317b(C0547d c0547d, C0546c c0546c) {
        FragmentManager fragmentManager = this.f1823a;
        if (fragmentManager == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (fragmentManager.m37510M0()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            m40315d(this.f1823a).m40265g2(c0547d, c0546c);
        }
    }

    /* renamed from: c */
    private static C0557d m40316c(FragmentManager fragmentManager) {
        return (C0557d) fragmentManager.m37455j0("androidx.biometric.BiometricFragment");
    }

    /* renamed from: d */
    private static C0557d m40315d(FragmentManager fragmentManager) {
        C0557d m40316c = m40316c(fragmentManager);
        if (m40316c == null) {
            C0557d m40249w2 = C0557d.m40249w2();
            fragmentManager.m37447m().m37186d(m40249w2, "androidx.biometric.BiometricFragment").mo37183g();
            fragmentManager.m37467f0();
            return m40249w2;
        }
        return m40316c;
    }

    /* renamed from: e */
    private static C0582f m40314e(ActivityC1354d activityC1354d) {
        if (activityC1354d != null) {
            return (C0582f) new C1479r0(activityC1354d).m36981a(C0582f.class);
        }
        return null;
    }

    /* renamed from: f */
    private void m40313f(FragmentManager fragmentManager, C0582f c0582f, Executor executor, AbstractC0544a abstractC0544a) {
        this.f1823a = fragmentManager;
        if (c0582f != null) {
            if (executor != null) {
                c0582f.m40192R(executor);
            }
            c0582f.m40193Q(abstractC0544a);
        }
    }

    /* renamed from: a */
    public void m40318a(C0547d c0547d) {
        if (c0547d != null) {
            m40317b(c0547d, null);
            return;
        }
        throw new IllegalArgumentException("PromptInfo cannot be null.");
    }

    /* renamed from: androidx.biometric.BiometricPrompt$c */
    /* loaded from: classes.dex */
    public static class C0546c {

        /* renamed from: a */
        private final Signature f1827a;

        /* renamed from: b */
        private final Cipher f1828b;

        /* renamed from: c */
        private final Mac f1829c;

        /* renamed from: d */
        private final IdentityCredential f1830d;

        public C0546c(Signature signature) {
            this.f1827a = signature;
            this.f1828b = null;
            this.f1829c = null;
            this.f1830d = null;
        }

        /* renamed from: a */
        public Cipher m40307a() {
            return this.f1828b;
        }

        /* renamed from: b */
        public IdentityCredential m40306b() {
            return this.f1830d;
        }

        /* renamed from: c */
        public Mac m40305c() {
            return this.f1829c;
        }

        /* renamed from: d */
        public Signature m40304d() {
            return this.f1827a;
        }

        public C0546c(Cipher cipher) {
            this.f1827a = null;
            this.f1828b = cipher;
            this.f1829c = null;
            this.f1830d = null;
        }

        public C0546c(Mac mac) {
            this.f1827a = null;
            this.f1828b = null;
            this.f1829c = mac;
            this.f1830d = null;
        }

        public C0546c(IdentityCredential identityCredential) {
            this.f1827a = null;
            this.f1828b = null;
            this.f1829c = null;
            this.f1830d = identityCredential;
        }
    }
}
