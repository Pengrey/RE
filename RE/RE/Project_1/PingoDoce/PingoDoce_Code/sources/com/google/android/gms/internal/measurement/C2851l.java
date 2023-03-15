package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.l */
/* loaded from: classes.dex */
public final class C2851l implements Iterator {

    /* renamed from: w */
    final /* synthetic */ Iterator f7831w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2851l(Iterator it) {
        this.f7831w = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7831w.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C2994u((String) this.f7831w.next());
    }
}
