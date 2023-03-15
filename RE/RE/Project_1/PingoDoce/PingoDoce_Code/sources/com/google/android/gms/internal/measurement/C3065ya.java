package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.ya */
/* loaded from: classes.dex */
final class C3065ya extends AbstractC2687ab {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3065ya(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2687ab
    /* renamed from: a */
    public final double mo31649a(Object obj, long j) {
        return Double.longBitsToDouble(m32910k(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2687ab
    /* renamed from: b */
    public final float mo31648b(Object obj, long j) {
        return Float.intBitsToFloat(m32911j(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2687ab
    /* renamed from: c */
    public final void mo31647c(Object obj, long j, boolean z) {
        if (C2703bb.f7673h) {
            C2703bb.m32853d(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            C2703bb.m32852e(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2687ab
    /* renamed from: d */
    public final void mo31646d(Object obj, long j, byte b) {
        if (C2703bb.f7673h) {
            C2703bb.m32853d(obj, j, b);
        } else {
            C2703bb.m32852e(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2687ab
    /* renamed from: e */
    public final void mo31645e(Object obj, long j, double d) {
        m32906o(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2687ab
    /* renamed from: f */
    public final void mo31644f(Object obj, long j, float f) {
        m32907n(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2687ab
    /* renamed from: g */
    public final boolean mo31643g(Object obj, long j) {
        if (C2703bb.f7673h) {
            return C2703bb.m32832y(obj, j);
        }
        return C2703bb.m32831z(obj, j);
    }
}
