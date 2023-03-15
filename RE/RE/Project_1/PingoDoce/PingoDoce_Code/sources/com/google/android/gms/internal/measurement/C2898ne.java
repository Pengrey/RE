package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.ne */
/* loaded from: classes.dex */
public final class C2898ne extends AbstractC2819j {

    /* renamed from: y */
    private final Callable f7904y;

    public C2898ne(String str, Callable callable) {
        super("internal.appMetadata");
        this.f7904y = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2819j
    /* renamed from: a */
    public final InterfaceC2931q mo32094a(C2952r4 c2952r4, List list) {
        try {
            return C2986t6.m32064b(this.f7904y.call());
        } catch (Exception unused) {
            return InterfaceC2931q.f7930f;
        }
    }
}
