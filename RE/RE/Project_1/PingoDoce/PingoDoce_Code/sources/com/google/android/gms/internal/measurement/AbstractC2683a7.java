package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2683a7;
import com.google.android.gms.internal.measurement.AbstractC2699b7;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.a7 */
/* loaded from: classes.dex */
public abstract class AbstractC2683a7<MessageType extends AbstractC2699b7<MessageType, BuilderType>, BuilderType extends AbstractC2683a7<MessageType, BuilderType>> implements InterfaceC2957r9 {
    /* renamed from: g */
    protected abstract AbstractC2683a7 mo32434g(AbstractC2699b7 abstractC2699b7);

    @Override // com.google.android.gms.internal.measurement.InterfaceC2957r9
    /* renamed from: h */
    public final /* synthetic */ InterfaceC2957r9 mo32137h(byte[] bArr) throws zzkh {
        return mo32433i(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public abstract AbstractC2683a7 mo32433i(byte[] bArr, int i, int i2) throws zzkh;

    /* renamed from: j */
    public abstract AbstractC2683a7 mo32432j(byte[] bArr, int i, int i2, C2732d8 c2732d8) throws zzkh;

    @Override // com.google.android.gms.internal.measurement.InterfaceC2957r9
    /* renamed from: t */
    public final /* synthetic */ InterfaceC2957r9 mo32136t(byte[] bArr, C2732d8 c2732d8) throws zzkh {
        return mo32432j(bArr, 0, bArr.length, c2732d8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2957r9
    /* renamed from: y */
    public final /* bridge */ /* synthetic */ InterfaceC2957r9 mo32134y(InterfaceC2973s9 interfaceC2973s9) {
        if (mo32062c().getClass().isInstance(interfaceC2973s9)) {
            return mo32434g((AbstractC2699b7) interfaceC2973s9);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
