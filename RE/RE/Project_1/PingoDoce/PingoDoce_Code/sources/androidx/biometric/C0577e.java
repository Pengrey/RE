package androidx.biometric;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import androidx.core.hardware.fingerprint.C1001a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.biometric.e */
/* loaded from: classes.dex */
public class C0577e {

    /* renamed from: a */
    private final InterfaceC0581d f1874a;

    /* renamed from: b */
    private final BiometricManager f1875b;

    /* renamed from: c */
    private final C1001a f1876c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BiometricManager.java */
    /* renamed from: androidx.biometric.e$a */
    /* loaded from: classes.dex */
    public static class C0578a {
        /* renamed from: a */
        static int m40219a(BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        /* renamed from: b */
        static BiometricManager m40218b(Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }

        /* renamed from: c */
        static Method m40217c() {
            try {
                return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BiometricManager.java */
    /* renamed from: androidx.biometric.e$b */
    /* loaded from: classes.dex */
    public static class C0579b {
        /* renamed from: a */
        static int m40216a(BiometricManager biometricManager, int i) {
            return biometricManager.canAuthenticate(i);
        }
    }

    /* compiled from: BiometricManager.java */
    /* renamed from: androidx.biometric.e$c */
    /* loaded from: classes.dex */
    private static class C0580c implements InterfaceC0581d {

        /* renamed from: a */
        private final Context f1877a;

        C0580c(Context context) {
            this.f1877a = context.getApplicationContext();
        }

        @Override // androidx.biometric.C0577e.InterfaceC0581d
        /* renamed from: a */
        public boolean mo40215a() {
            return C0607m.m40100a(this.f1877a);
        }

        @Override // androidx.biometric.C0577e.InterfaceC0581d
        /* renamed from: b */
        public BiometricManager mo40214b() {
            return C0578a.m40218b(this.f1877a);
        }

        @Override // androidx.biometric.C0577e.InterfaceC0581d
        /* renamed from: c */
        public boolean mo40213c() {
            return C0604l.m40104b(this.f1877a);
        }

        @Override // androidx.biometric.C0577e.InterfaceC0581d
        /* renamed from: d */
        public boolean mo40212d() {
            return C0595i.m40128a(this.f1877a, Build.MODEL);
        }

        @Override // androidx.biometric.C0577e.InterfaceC0581d
        /* renamed from: e */
        public boolean mo40211e() {
            return C0604l.m40105a(this.f1877a) != null;
        }

        @Override // androidx.biometric.C0577e.InterfaceC0581d
        /* renamed from: f */
        public C1001a mo40210f() {
            return C1001a.m38783b(this.f1877a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BiometricManager.java */
    /* renamed from: androidx.biometric.e$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0581d {
        /* renamed from: a */
        boolean mo40215a();

        /* renamed from: b */
        BiometricManager mo40214b();

        /* renamed from: c */
        boolean mo40213c();

        /* renamed from: d */
        boolean mo40212d();

        /* renamed from: e */
        boolean mo40211e();

        /* renamed from: f */
        C1001a mo40210f();
    }

    C0577e(InterfaceC0581d interfaceC0581d) {
        this.f1874a = interfaceC0581d;
        int i = Build.VERSION.SDK_INT;
        this.f1875b = i >= 29 ? interfaceC0581d.mo40214b() : null;
        this.f1876c = i <= 29 ? interfaceC0581d.mo40210f() : null;
    }

    /* renamed from: c */
    private int m40225c(int i) {
        if (C0555b.m40283e(i)) {
            if (i != 0 && this.f1874a.mo40211e()) {
                if (C0555b.m40285c(i)) {
                    return this.f1874a.mo40213c() ? 0 : 11;
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 == 29) {
                    if (C0555b.m40282f(i)) {
                        return m40221g();
                    }
                    return m40222f();
                } else if (i2 == 28) {
                    if (this.f1874a.mo40215a()) {
                        return m40223e();
                    }
                    return 12;
                } else {
                    return m40224d();
                }
            }
            return 12;
        }
        return -2;
    }

    /* renamed from: d */
    private int m40224d() {
        C1001a c1001a = this.f1876c;
        if (c1001a == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        } else if (c1001a.m38780e()) {
            return !this.f1876c.m38781d() ? 11 : 0;
        } else {
            return 12;
        }
    }

    /* renamed from: e */
    private int m40223e() {
        if (this.f1874a.mo40213c()) {
            return m40224d() == 0 ? 0 : -1;
        }
        return m40224d();
    }

    /* renamed from: f */
    private int m40222f() {
        BiometricPrompt.CryptoObject m40143d;
        Method m40217c = C0578a.m40217c();
        if (m40217c != null && (m40143d = C0591h.m40143d(C0591h.m40146a())) != null) {
            try {
                Object invoke = m40217c.invoke(this.f1875b, m40143d);
                if (invoke instanceof Integer) {
                    return ((Integer) invoke).intValue();
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            }
        }
        int m40221g = m40221g();
        return (this.f1874a.mo40212d() || m40221g != 0) ? m40221g : m40223e();
    }

    /* renamed from: g */
    private int m40221g() {
        BiometricManager biometricManager = this.f1875b;
        if (biometricManager == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        return C0578a.m40219a(biometricManager);
    }

    /* renamed from: h */
    public static C0577e m40220h(Context context) {
        return new C0577e(new C0580c(context));
    }

    @Deprecated
    /* renamed from: a */
    public int m40227a() {
        return m40226b(255);
    }

    /* renamed from: b */
    public int m40226b(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            BiometricManager biometricManager = this.f1875b;
            if (biometricManager == null) {
                Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                return 1;
            }
            return C0579b.m40216a(biometricManager, i);
        }
        return m40225c(i);
    }
}
