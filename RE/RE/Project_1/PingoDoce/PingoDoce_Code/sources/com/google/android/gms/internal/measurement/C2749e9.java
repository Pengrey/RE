package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.e9 */
/* loaded from: classes.dex */
final class C2749e9 extends AbstractC2765f9 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2749e9(C2717c9 c2717c9) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2765f9
    /* renamed from: a */
    public final void mo32703a(Object obj, long j) {
        ((InterfaceC3033w8) C2703bb.m32846k(obj, j)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2765f9
    /* renamed from: b */
    public final void mo32702b(Object obj, Object obj2, long j) {
        InterfaceC3033w8 interfaceC3033w8 = (InterfaceC3033w8) C2703bb.m32846k(obj, j);
        InterfaceC3033w8 interfaceC3033w82 = (InterfaceC3033w8) C2703bb.m32846k(obj2, j);
        int size = interfaceC3033w8.size();
        int size2 = interfaceC3033w82.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC3033w8.mo31907a()) {
                interfaceC3033w8 = interfaceC3033w8.mo31906k(size2 + size);
            }
            interfaceC3033w8.addAll(interfaceC3033w82);
        }
        if (size > 0) {
            interfaceC3033w82 = interfaceC3033w8;
        }
        C2703bb.m32833x(obj, j, interfaceC3033w82);
    }
}
