package androidx.biometric;

import java.util.Arrays;

/* renamed from: androidx.biometric.c */
/* loaded from: classes.dex */
class C0556c {

    /* renamed from: a */
    private final int f1850a;

    /* renamed from: b */
    private final CharSequence f1851b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0556c(int i, CharSequence charSequence) {
        this.f1850a = i;
        this.f1851b = charSequence;
    }

    /* renamed from: a */
    private static String m40281a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: d */
    private boolean m40278d(CharSequence charSequence) {
        String m40281a = m40281a(this.f1851b);
        String m40281a2 = m40281a(charSequence);
        return (m40281a == null && m40281a2 == null) || (m40281a != null && m40281a.equals(m40281a2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m40280b() {
        return this.f1850a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public CharSequence m40279c() {
        return this.f1851b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0556c) {
            C0556c c0556c = (C0556c) obj;
            return this.f1850a == c0556c.f1850a && m40278d(c0556c.f1851b);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1850a), m40281a(this.f1851b)});
    }
}
