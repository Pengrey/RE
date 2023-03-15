package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.a9 */
/* loaded from: classes.dex */
public final class C2685a9 extends AbstractC2715c7 implements RandomAccess, InterfaceC2701b9 {

    /* renamed from: y */
    private static final C2685a9 f7642y;

    /* renamed from: x */
    private final List f7643x;

    static {
        C2685a9 c2685a9 = new C2685a9(10);
        f7642y = c2685a9;
        c2685a9.zzb();
    }

    public C2685a9() {
        this(10);
    }

    /* renamed from: g */
    private static String m32916g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC2955r7) {
            return ((AbstractC2955r7) obj).m32143y(C3048x8.f8089a);
        }
        return C3048x8.m31822h((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        m32808b();
        this.f7643x.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m32808b();
        if (collection instanceof InterfaceC2701b9) {
            collection = ((InterfaceC2701b9) collection).mo31894c();
        }
        boolean addAll = this.f7643x.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2701b9
    /* renamed from: c */
    public final List mo31894c() {
        return Collections.unmodifiableList(this.f7643x);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m32808b();
        this.f7643x.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2701b9
    /* renamed from: d */
    public final InterfaceC2701b9 mo31893d() {
        return mo31907a() ? new C3035wa(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public final String get(int i) {
        Object obj = this.f7643x.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC2955r7) {
            AbstractC2955r7 abstractC2955r7 = (AbstractC2955r7) obj;
            String m32143y = abstractC2955r7.m32143y(C3048x8.f8089a);
            if (abstractC2955r7.mo32148q()) {
                this.f7643x.set(i, m32143y);
            }
            return m32143y;
        }
        byte[] bArr = (byte[]) obj;
        String m31822h = C3048x8.m31822h(bArr);
        if (C3048x8.m31821i(bArr)) {
            this.f7643x.set(i, m31822h);
        }
        return m31822h;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2701b9
    /* renamed from: j */
    public final void mo31892j(AbstractC2955r7 abstractC2955r7) {
        m32808b();
        this.f7643x.add(abstractC2955r7);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3033w8
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ InterfaceC3033w8 mo31906k(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f7643x);
            return new C2685a9(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m32808b();
        Object remove = this.f7643x.remove(i);
        ((AbstractList) this).modCount++;
        return m32916g(remove);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2701b9
    /* renamed from: s */
    public final Object mo31891s(int i) {
        return this.f7643x.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        m32808b();
        return m32916g(this.f7643x.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7643x.size();
    }

    public C2685a9(int i) {
        this.f7643x = new ArrayList(i);
    }

    private C2685a9(ArrayList arrayList) {
        this.f7643x = arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
