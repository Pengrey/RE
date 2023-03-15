package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.wa */
/* loaded from: classes.dex */
public final class C3035wa extends AbstractList implements RandomAccess, InterfaceC2701b9 {

    /* renamed from: w */
    private final InterfaceC2701b9 f8075w;

    public C3035wa(InterfaceC2701b9 interfaceC2701b9) {
        this.f8075w = interfaceC2701b9;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2701b9
    /* renamed from: c */
    public final List mo31894c() {
        return this.f8075w.mo31894c();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2701b9
    /* renamed from: d */
    public final InterfaceC2701b9 mo31893d() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C2685a9) this.f8075w).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C3020va(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2701b9
    /* renamed from: j */
    public final void mo31892j(AbstractC2955r7 abstractC2955r7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C3005ua(this, i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2701b9
    /* renamed from: s */
    public final Object mo31891s(int i) {
        return this.f8075w.mo31891s(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8075w.size();
    }
}
