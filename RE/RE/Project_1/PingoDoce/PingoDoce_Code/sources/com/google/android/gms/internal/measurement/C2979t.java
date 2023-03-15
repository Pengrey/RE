package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.t */
/* loaded from: classes.dex */
final class C2979t implements Iterator {

    /* renamed from: w */
    private int f7995w = 0;

    /* renamed from: x */
    final /* synthetic */ C2994u f7996x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2979t(C2994u c2994u) {
        this.f7996x = c2994u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i = this.f7995w;
        str = this.f7996x.f8017w;
        return i < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        String str2;
        int i = this.f7995w;
        C2994u c2994u = this.f7996x;
        str = c2994u.f8017w;
        if (i < str.length()) {
            str2 = c2994u.f8017w;
            this.f7995w = i + 1;
            return new C2994u(String.valueOf(str2.charAt(i)));
        }
        throw new NoSuchElementException();
    }
}
