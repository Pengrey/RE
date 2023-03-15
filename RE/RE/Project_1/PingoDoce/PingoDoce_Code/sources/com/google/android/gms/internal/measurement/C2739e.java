package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.e */
/* loaded from: classes.dex */
public final class C2739e implements Iterator {

    /* renamed from: w */
    private int f7714w = 0;

    /* renamed from: x */
    final /* synthetic */ C2755f f7715x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2739e(C2755f c2755f) {
        this.f7715x = c2755f;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7714w < this.f7715x.m32746u();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f7714w < this.f7715x.m32746u()) {
            C2755f c2755f = this.f7715x;
            int i = this.f7714w;
            this.f7714w = i + 1;
            return c2755f.m32745v(i);
        }
        int i2 = this.f7714w;
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Out of bounds index: ");
        sb2.append(i2);
        throw new NoSuchElementException(sb2.toString());
    }
}
