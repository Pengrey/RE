package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2597i;
import p078e7.InterfaceC5003d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.n8 */
/* loaded from: classes.dex */
public final class C3279n8 {

    /* renamed from: a */
    private final InterfaceC5003d f8710a;

    /* renamed from: b */
    private long f8711b;

    public C3279n8(InterfaceC5003d interfaceC5003d) {
        C2597i.m33076j(interfaceC5003d);
        this.f8710a = interfaceC5003d;
    }

    /* renamed from: a */
    public final void m31064a() {
        this.f8711b = 0L;
    }

    /* renamed from: b */
    public final void m31063b() {
        this.f8711b = this.f8710a.mo25912c();
    }

    /* renamed from: c */
    public final boolean m31062c(long j) {
        return this.f8711b == 0 || this.f8710a.mo25912c() - this.f8711b >= 3600000;
    }
}
