package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.d */
/* loaded from: classes.dex */
final class C2723d implements Iterator {

    /* renamed from: w */
    final /* synthetic */ Iterator f7701w;

    /* renamed from: x */
    final /* synthetic */ Iterator f7702x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2723d(C2755f c2755f, Iterator it, Iterator it2) {
        this.f7701w = it;
        this.f7702x = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7701w.hasNext()) {
            return true;
        }
        return this.f7702x.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f7701w.hasNext()) {
            return new C2994u(((Integer) this.f7701w.next()).toString());
        }
        if (this.f7702x.hasNext()) {
            return new C2994u((String) this.f7702x.next());
        }
        throw new NoSuchElementException();
    }
}
