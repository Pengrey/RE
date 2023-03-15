package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.ua */
/* loaded from: classes.dex */
final class C3005ua implements ListIterator {

    /* renamed from: w */
    final ListIterator f8032w;

    /* renamed from: x */
    final /* synthetic */ int f8033x;

    /* renamed from: y */
    final /* synthetic */ C3035wa f8034y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3005ua(C3035wa c3035wa, int i) {
        InterfaceC2701b9 interfaceC2701b9;
        this.f8034y = c3035wa;
        this.f8033x = i;
        interfaceC2701b9 = c3035wa.f8075w;
        this.f8032w = interfaceC2701b9.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f8032w.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8032w.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f8032w.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8032w.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f8032w.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8032w.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
