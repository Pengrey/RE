package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.i7 */
/* loaded from: classes.dex */
final class C2811i7 extends AbstractC2859l7 {

    /* renamed from: w */
    private int f7783w = 0;

    /* renamed from: x */
    private final int f7784x;

    /* renamed from: y */
    final /* synthetic */ AbstractC2955r7 f7785y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2811i7(AbstractC2955r7 abstractC2955r7) {
        this.f7785y = abstractC2955r7;
        this.f7784x = abstractC2955r7.mo32153g();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7783w < this.f7784x;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2891n7
    public final byte zza() {
        int i = this.f7783w;
        if (i < this.f7784x) {
            this.f7783w = i + 1;
            return this.f7785y.mo32154f(i);
        }
        throw new NoSuchElementException();
    }
}
