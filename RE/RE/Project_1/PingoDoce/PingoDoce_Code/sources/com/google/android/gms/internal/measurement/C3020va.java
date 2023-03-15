package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.va */
/* loaded from: classes.dex */
final class C3020va implements Iterator {

    /* renamed from: w */
    final Iterator f8061w;

    /* renamed from: x */
    final /* synthetic */ C3035wa f8062x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3020va(C3035wa c3035wa) {
        InterfaceC2701b9 interfaceC2701b9;
        this.f8062x = c3035wa;
        interfaceC2701b9 = c3035wa.f8075w;
        this.f8061w = interfaceC2701b9.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8061w.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f8061w.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
