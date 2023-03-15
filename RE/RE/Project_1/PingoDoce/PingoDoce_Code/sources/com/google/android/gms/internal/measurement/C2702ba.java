package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.ba */
/* loaded from: classes.dex */
final class C2702ba extends AbstractC2715c7 implements RandomAccess {

    /* renamed from: z */
    private static final C2702ba f7663z;

    /* renamed from: x */
    private Object[] f7664x;

    /* renamed from: y */
    private int f7665y;

    static {
        C2702ba c2702ba = new C2702ba(new Object[0], 0);
        f7663z = c2702ba;
        c2702ba.zzb();
    }

    private C2702ba(Object[] objArr, int i) {
        this.f7664x = objArr;
        this.f7665y = i;
    }

    /* renamed from: f */
    public static C2702ba m32864f() {
        return f7663z;
    }

    /* renamed from: g */
    private final String m32863g(int i) {
        int i2 = this.f7665y;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i);
        sb2.append(", Size:");
        sb2.append(i2);
        return sb2.toString();
    }

    /* renamed from: h */
    private final void m32862h(int i) {
        if (i < 0 || i >= this.f7665y) {
            throw new IndexOutOfBoundsException(m32863g(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m32808b();
        if (i >= 0 && i <= (i2 = this.f7665y)) {
            Object[] objArr = this.f7664x;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f7664x, i, objArr2, i + 1, this.f7665y - i);
                this.f7664x = objArr2;
            }
            this.f7664x[i] = obj;
            this.f7665y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m32863g(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m32862h(i);
        return this.f7664x[i];
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3033w8
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ InterfaceC3033w8 mo31906k(int i) {
        if (i >= this.f7665y) {
            return new C2702ba(Arrays.copyOf(this.f7664x, i), this.f7665y);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m32808b();
        m32862h(i);
        Object[] objArr = this.f7664x;
        Object obj = objArr[i];
        if (i < this.f7665y - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f7665y--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m32808b();
        m32862h(i);
        Object[] objArr = this.f7664x;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7665y;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m32808b();
        int i = this.f7665y;
        Object[] objArr = this.f7664x;
        if (i == objArr.length) {
            this.f7664x = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f7664x;
        int i2 = this.f7665y;
        this.f7665y = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
