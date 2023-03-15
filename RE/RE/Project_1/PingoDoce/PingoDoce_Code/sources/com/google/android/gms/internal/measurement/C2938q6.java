package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.q6 */
/* loaded from: classes.dex */
final class C2938q6 extends AbstractC2970s6 {

    /* renamed from: w */
    static final C2938q6 f7950w = new C2938q6();

    private C2938q6() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2970s6
    /* renamed from: a */
    public final Object mo32006a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2970s6
    /* renamed from: b */
    public final boolean mo32005b() {
        return false;
    }

    public final boolean equals(@CheckForNull Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
