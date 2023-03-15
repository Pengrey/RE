package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.q */
/* loaded from: classes.dex */
final class C3303q implements Iterator {

    /* renamed from: w */
    final Iterator f8791w;

    /* renamed from: x */
    final /* synthetic */ zzas f8792x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3303q(zzas zzasVar) {
        Bundle bundle;
        this.f8792x = zzasVar;
        bundle = zzasVar.f9174w;
        this.f8791w = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final String next() {
        return (String) this.f8791w.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8791w.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
