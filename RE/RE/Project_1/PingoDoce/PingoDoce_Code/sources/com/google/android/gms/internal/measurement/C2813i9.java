package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.i9 */
/* loaded from: classes.dex */
final class C2813i9 implements InterfaceC2941q9 {

    /* renamed from: a */
    private final InterfaceC2941q9[] f7790a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2813i9(InterfaceC2941q9... interfaceC2941q9Arr) {
        this.f7790a = interfaceC2941q9Arr;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2941q9
    /* renamed from: a */
    public final InterfaceC2909o9 mo32178a(Class cls) {
        InterfaceC2941q9[] interfaceC2941q9Arr = this.f7790a;
        for (int i = 0; i < 2; i++) {
            InterfaceC2941q9 interfaceC2941q9 = interfaceC2941q9Arr[i];
            if (interfaceC2941q9.mo32177b(cls)) {
                return interfaceC2941q9.mo32178a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2941q9
    /* renamed from: b */
    public final boolean mo32177b(Class cls) {
        InterfaceC2941q9[] interfaceC2941q9Arr = this.f7790a;
        for (int i = 0; i < 2; i++) {
            if (interfaceC2941q9Arr[i].mo32177b(cls)) {
                return true;
            }
        }
        return false;
    }
}
