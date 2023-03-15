package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.C1001a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.biometric.a */
/* loaded from: classes.dex */
public class C0549a {

    /* renamed from: a */
    private BiometricPrompt.AuthenticationCallback f1845a;

    /* renamed from: b */
    private C1001a.AbstractC1004c f1846b;

    /* renamed from: c */
    final C0554d f1847c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AuthenticationCallbackProvider.java */
    /* renamed from: androidx.biometric.a$a */
    /* loaded from: classes.dex */
    public class C0550a extends C1001a.AbstractC1004c {
        C0550a() {
        }

        @Override // androidx.core.hardware.fingerprint.C1001a.AbstractC1004c
        /* renamed from: a */
        public void mo38769a(int i, CharSequence charSequence) {
            C0549a.this.f1847c.mo40157a(i, charSequence);
        }

        @Override // androidx.core.hardware.fingerprint.C1001a.AbstractC1004c
        /* renamed from: b */
        public void mo38768b() {
            C0549a.this.f1847c.mo40156b();
        }

        @Override // androidx.core.hardware.fingerprint.C1001a.AbstractC1004c
        /* renamed from: c */
        public void mo38767c(int i, CharSequence charSequence) {
            C0549a.this.f1847c.mo40155c(charSequence);
        }

        @Override // androidx.core.hardware.fingerprint.C1001a.AbstractC1004c
        /* renamed from: d */
        public void mo38766d(C1001a.C1005d c1005d) {
            C0549a.this.f1847c.mo40154d(new BiometricPrompt.C0545b(c1005d != null ? C0591h.m40144c(c1005d.m38765a()) : null, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AuthenticationCallbackProvider.java */
    /* renamed from: androidx.biometric.a$b */
    /* loaded from: classes.dex */
    public static class C0551b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AuthenticationCallbackProvider.java */
        /* renamed from: androidx.biometric.a$b$a */
        /* loaded from: classes.dex */
        public class C0552a extends BiometricPrompt.AuthenticationCallback {

            /* renamed from: a */
            final /* synthetic */ C0554d f1849a;

            C0552a(C0554d c0554d) {
                this.f1849a = c0554d;
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationError(int i, CharSequence charSequence) {
                this.f1849a.mo40157a(i, charSequence);
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationFailed() {
                this.f1849a.mo40156b();
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationHelp(int i, CharSequence charSequence) {
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                BiometricPrompt.C0546c m40145b = authenticationResult != null ? C0591h.m40145b(authenticationResult.getCryptoObject()) : null;
                int i = Build.VERSION.SDK_INT;
                int i2 = -1;
                if (i >= 30) {
                    if (authenticationResult != null) {
                        i2 = C0553c.m40288a(authenticationResult);
                    }
                } else if (i != 29) {
                    i2 = 2;
                }
                this.f1849a.mo40154d(new BiometricPrompt.C0545b(m40145b, i2));
            }
        }

        /* renamed from: a */
        static BiometricPrompt.AuthenticationCallback m40289a(C0554d c0554d) {
            return new C0552a(c0554d);
        }
    }

    /* compiled from: AuthenticationCallbackProvider.java */
    /* renamed from: androidx.biometric.a$c */
    /* loaded from: classes.dex */
    private static class C0553c {
        /* renamed from: a */
        static int m40288a(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AuthenticationCallbackProvider.java */
    /* renamed from: androidx.biometric.a$d */
    /* loaded from: classes.dex */
    public static class C0554d {
        /* renamed from: a */
        void mo40157a(int i, CharSequence charSequence) {
            throw null;
        }

        /* renamed from: b */
        void mo40156b() {
            throw null;
        }

        /* renamed from: c */
        void mo40155c(CharSequence charSequence) {
            throw null;
        }

        /* renamed from: d */
        void mo40154d(BiometricPrompt.C0545b c0545b) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0549a(C0554d c0554d) {
        this.f1847c = c0554d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public BiometricPrompt.AuthenticationCallback m40291a() {
        if (this.f1845a == null) {
            this.f1845a = C0551b.m40289a(this.f1847c);
        }
        return this.f1845a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C1001a.AbstractC1004c m40290b() {
        if (this.f1846b == null) {
            this.f1846b = new C0550a();
        }
        return this.f1846b;
    }
}
