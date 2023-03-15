package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.m8 */
/* loaded from: classes.dex */
final class C2876m8 implements InterfaceC2941q9 {

    /* renamed from: a */
    private static final C2876m8 f7858a = new C2876m8();

    private C2876m8() {
    }

    /* renamed from: c */
    public static C2876m8 m32467c() {
        return f7858a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2941q9
    /* renamed from: a */
    public final InterfaceC2909o9 mo32178a(Class cls) {
        if (!AbstractC2940q8.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (InterfaceC2909o9) AbstractC2940q8.m32184q(cls.asSubclass(AbstractC2940q8.class)).mo31692z(3, null, null);
        } catch (Exception e) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2941q9
    /* renamed from: b */
    public final boolean mo32177b(Class cls) {
        return AbstractC2940q8.class.isAssignableFrom(cls);
    }
}
