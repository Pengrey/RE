package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.g8 */
/* loaded from: classes.dex */
final class C2780g8 {

    /* renamed from: a */
    private static final AbstractC2748e8 f7753a = new C2764f8();

    /* renamed from: b */
    private static final AbstractC2748e8 f7754b;

    static {
        AbstractC2748e8 abstractC2748e8;
        try {
            abstractC2748e8 = (AbstractC2748e8) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC2748e8 = null;
        }
        f7754b = abstractC2748e8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC2748e8 m32621a() {
        AbstractC2748e8 abstractC2748e8 = f7754b;
        if (abstractC2748e8 != null) {
            return abstractC2748e8;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC2748e8 m32620b() {
        return f7753a;
    }
}
