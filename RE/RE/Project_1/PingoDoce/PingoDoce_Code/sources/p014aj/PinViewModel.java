package p014aj;

import androidx.biometric.BiometricPrompt;
import p181jd.Intrinsics;

/* renamed from: aj.b */
/* loaded from: classes2.dex */
public final class PinViewModel {

    /* renamed from: a */
    private final BiometricPrompt.C0547d f356a;

    /* renamed from: b */
    private final BiometricPrompt.C0546c f357b;

    /* renamed from: c */
    private final int f358c;

    public PinViewModel(BiometricPrompt.C0547d c0547d, BiometricPrompt.C0546c c0546c, int i) {
        Intrinsics.isThisObjectNull(c0547d, "promptInfo");
        this.f356a = c0547d;
        this.f357b = c0546c;
        this.f358c = i;
    }

    /* renamed from: a */
    public final BiometricPrompt.C0547d m41704a() {
        return this.f356a;
    }

    /* renamed from: b */
    public final int m41703b() {
        return this.f358c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PinViewModel) {
            PinViewModel pinViewModel = (PinViewModel) obj;
            return Intrinsics.equals(this.f356a, pinViewModel.f356a) && Intrinsics.equals(this.f357b, pinViewModel.f357b) && this.f358c == pinViewModel.f358c;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f356a.hashCode() * 31;
        BiometricPrompt.C0546c c0546c = this.f357b;
        return ((hashCode + (c0546c == null ? 0 : c0546c.hashCode())) * 31) + Integer.hashCode(this.f358c);
    }

    public String toString() {
        BiometricPrompt.C0547d c0547d = this.f356a;
        BiometricPrompt.C0546c c0546c = this.f357b;
        int i = this.f358c;
        return "BiometricParams(promptInfo=" + c0547d + ", cryptoObject=" + c0546c + ", status=" + i + ")";
    }
}
