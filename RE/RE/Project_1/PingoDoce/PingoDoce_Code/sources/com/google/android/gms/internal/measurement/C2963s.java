package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.s */
/* loaded from: classes.dex */
final class C2963s implements Iterator {

    /* renamed from: w */
    private int f7974w = 0;

    /* renamed from: x */
    final /* synthetic */ C2994u f7975x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2963s(C2994u c2994u) {
        this.f7975x = c2994u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i = this.f7974w;
        str = this.f7975x.f8017w;
        return i < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        int i = this.f7974w;
        str = this.f7975x.f8017w;
        if (i < str.length()) {
            this.f7974w = i + 1;
            return new C2994u(String.valueOf(i));
        }
        throw new NoSuchElementException();
    }
}
