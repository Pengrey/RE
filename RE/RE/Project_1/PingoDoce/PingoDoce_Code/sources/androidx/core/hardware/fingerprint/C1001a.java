package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.p020os.C1008b;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@Deprecated
/* renamed from: androidx.core.hardware.fingerprint.a */
/* loaded from: classes.dex */
public class C1001a {

    /* renamed from: a */
    private final Context f3306a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FingerprintManagerCompat.java */
    /* renamed from: androidx.core.hardware.fingerprint.a$a */
    /* loaded from: classes.dex */
    public class C1002a extends FingerprintManager.AuthenticationCallback {

        /* renamed from: a */
        final /* synthetic */ AbstractC1004c f3307a;

        C1002a(AbstractC1004c abstractC1004c) {
            this.f3307a = abstractC1004c;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i, CharSequence charSequence) {
            this.f3307a.mo38769a(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f3307a.mo38768b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            this.f3307a.mo38767c(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f3307a.mo38766d(new C1005d(C1001a.m38779f(C1003b.m38775b(authenticationResult))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FingerprintManagerCompat.java */
    /* renamed from: androidx.core.hardware.fingerprint.a$b */
    /* loaded from: classes.dex */
    public static class C1003b {
        /* renamed from: a */
        static void m38776a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        /* renamed from: b */
        static FingerprintManager.CryptoObject m38775b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        /* renamed from: c */
        public static FingerprintManager m38774c(Context context) {
            int i = Build.VERSION.SDK_INT;
            if (i == 23) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            if (i <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return null;
            }
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }

        /* renamed from: d */
        static boolean m38773d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        /* renamed from: e */
        static boolean m38772e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        /* renamed from: f */
        public static C1006e m38771f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new C1006e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new C1006e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new C1006e(cryptoObject.getMac());
            }
            return null;
        }

        /* renamed from: g */
        public static FingerprintManager.CryptoObject m38770g(C1006e c1006e) {
            if (c1006e == null) {
                return null;
            }
            if (c1006e.m38764a() != null) {
                return new FingerprintManager.CryptoObject(c1006e.m38764a());
            }
            if (c1006e.m38762c() != null) {
                return new FingerprintManager.CryptoObject(c1006e.m38762c());
            }
            if (c1006e.m38763b() != null) {
                return new FingerprintManager.CryptoObject(c1006e.m38763b());
            }
            return null;
        }
    }

    /* compiled from: FingerprintManagerCompat.java */
    /* renamed from: androidx.core.hardware.fingerprint.a$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1004c {
        /* renamed from: a */
        public abstract void mo38769a(int i, CharSequence charSequence);

        /* renamed from: b */
        public abstract void mo38768b();

        /* renamed from: c */
        public abstract void mo38767c(int i, CharSequence charSequence);

        /* renamed from: d */
        public abstract void mo38766d(C1005d c1005d);
    }

    /* compiled from: FingerprintManagerCompat.java */
    /* renamed from: androidx.core.hardware.fingerprint.a$d */
    /* loaded from: classes.dex */
    public static final class C1005d {

        /* renamed from: a */
        private final C1006e f3308a;

        public C1005d(C1006e c1006e) {
            this.f3308a = c1006e;
        }

        /* renamed from: a */
        public C1006e m38765a() {
            return this.f3308a;
        }
    }

    private C1001a(Context context) {
        this.f3306a = context;
    }

    /* renamed from: b */
    public static C1001a m38783b(Context context) {
        return new C1001a(context);
    }

    /* renamed from: c */
    private static FingerprintManager m38782c(Context context) {
        return C1003b.m38774c(context);
    }

    /* renamed from: f */
    static C1006e m38779f(FingerprintManager.CryptoObject cryptoObject) {
        return C1003b.m38771f(cryptoObject);
    }

    /* renamed from: g */
    private static FingerprintManager.AuthenticationCallback m38778g(AbstractC1004c abstractC1004c) {
        return new C1002a(abstractC1004c);
    }

    /* renamed from: h */
    private static FingerprintManager.CryptoObject m38777h(C1006e c1006e) {
        return C1003b.m38770g(c1006e);
    }

    /* renamed from: a */
    public void m38784a(C1006e c1006e, int i, C1008b c1008b, AbstractC1004c abstractC1004c, Handler handler) {
        FingerprintManager m38782c;
        if (Build.VERSION.SDK_INT < 23 || (m38782c = m38782c(this.f3306a)) == null) {
            return;
        }
        C1003b.m38776a(m38782c, m38777h(c1006e), c1008b != null ? (CancellationSignal) c1008b.m38759b() : null, i, m38778g(abstractC1004c), handler);
    }

    /* renamed from: d */
    public boolean m38781d() {
        FingerprintManager m38782c;
        return Build.VERSION.SDK_INT >= 23 && (m38782c = m38782c(this.f3306a)) != null && C1003b.m38773d(m38782c);
    }

    /* renamed from: e */
    public boolean m38780e() {
        FingerprintManager m38782c;
        return Build.VERSION.SDK_INT >= 23 && (m38782c = m38782c(this.f3306a)) != null && C1003b.m38772e(m38782c);
    }

    /* compiled from: FingerprintManagerCompat.java */
    /* renamed from: androidx.core.hardware.fingerprint.a$e */
    /* loaded from: classes.dex */
    public static class C1006e {

        /* renamed from: a */
        private final Signature f3309a;

        /* renamed from: b */
        private final Cipher f3310b;

        /* renamed from: c */
        private final Mac f3311c;

        public C1006e(Signature signature) {
            this.f3309a = signature;
            this.f3310b = null;
            this.f3311c = null;
        }

        /* renamed from: a */
        public Cipher m38764a() {
            return this.f3310b;
        }

        /* renamed from: b */
        public Mac m38763b() {
            return this.f3311c;
        }

        /* renamed from: c */
        public Signature m38762c() {
            return this.f3309a;
        }

        public C1006e(Cipher cipher) {
            this.f3310b = cipher;
            this.f3309a = null;
            this.f3311c = null;
        }

        public C1006e(Mac mac) {
            this.f3311c = mac;
            this.f3310b = null;
            this.f3309a = null;
        }
    }
}
