package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.j9 */
/* loaded from: classes.dex */
public final class C2829j9 implements InterfaceC2750ea {

    /* renamed from: b */
    private static final InterfaceC2941q9 f7801b = new C2797h9();

    /* renamed from: a */
    private final InterfaceC2941q9 f7802a;

    public C2829j9() {
        InterfaceC2941q9 interfaceC2941q9;
        InterfaceC2941q9[] interfaceC2941q9Arr = new InterfaceC2941q9[2];
        interfaceC2941q9Arr[0] = C2876m8.m32467c();
        try {
            interfaceC2941q9 = (InterfaceC2941q9) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC2941q9 = f7801b;
        }
        interfaceC2941q9Arr[1] = interfaceC2941q9;
        C2813i9 c2813i9 = new C2813i9(interfaceC2941q9Arr);
        C3048x8.m31824f(c2813i9, "messageInfoFactory");
        this.f7802a = c2813i9;
    }

    /* renamed from: b */
    private static boolean m32531b(InterfaceC2909o9 interfaceC2909o9) {
        return interfaceC2909o9.mo32334a() == 1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2750ea
    /* renamed from: a */
    public final InterfaceC2734da mo32532a(Class cls) {
        C2766fa.m32665g(cls);
        InterfaceC2909o9 mo32178a = this.f7802a.mo32178a(cls);
        if (mo32178a.zzb()) {
            if (AbstractC2940q8.class.isAssignableFrom(cls)) {
                return C3034w9.m31896j(C2766fa.m32671b(), C2780g8.m32620b(), mo32178a.zza());
            }
            return C3034w9.m31896j(C2766fa.m32670b0(), C2780g8.m32621a(), mo32178a.zza());
        } else if (AbstractC2940q8.class.isAssignableFrom(cls)) {
            if (m32531b(mo32178a)) {
                return C3019v9.m31950F(cls, mo32178a, C3064y9.m31771b(), AbstractC2765f9.m32700d(), C2766fa.m32671b(), C2780g8.m32620b(), C2893n9.m32423b());
            }
            return C3019v9.m31950F(cls, mo32178a, C3064y9.m31771b(), AbstractC2765f9.m32700d(), C2766fa.m32671b(), null, C2893n9.m32423b());
        } else if (m32531b(mo32178a)) {
            return C3019v9.m31950F(cls, mo32178a, C3064y9.m31772a(), AbstractC2765f9.m32701c(), C2766fa.m32670b0(), C2780g8.m32621a(), C2893n9.m32424a());
        } else {
            return C3019v9.m31950F(cls, mo32178a, C3064y9.m31772a(), AbstractC2765f9.m32701c(), C2766fa.m32673a(), null, C2893n9.m32424a());
        }
    }
}
