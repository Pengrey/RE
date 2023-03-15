package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2597i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.p */
/* loaded from: classes.dex */
final class C3292p {

    /* renamed from: a */
    final String f8750a;

    /* renamed from: b */
    final String f8751b;

    /* renamed from: c */
    final long f8752c;

    /* renamed from: d */
    final long f8753d;

    /* renamed from: e */
    final long f8754e;

    /* renamed from: f */
    final long f8755f;

    /* renamed from: g */
    final long f8756g;

    /* renamed from: h */
    final Long f8757h;

    /* renamed from: i */
    final Long f8758i;

    /* renamed from: j */
    final Long f8759j;

    /* renamed from: k */
    final Boolean f8760k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3292p(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        C2597i.m33080f(str);
        C2597i.m33080f(str2);
        C2597i.m33085a(j >= 0);
        C2597i.m33085a(j2 >= 0);
        C2597i.m33085a(j3 >= 0);
        C2597i.m33085a(j5 >= 0);
        this.f8750a = str;
        this.f8751b = str2;
        this.f8752c = j;
        this.f8753d = j2;
        this.f8754e = j3;
        this.f8755f = j4;
        this.f8756g = j5;
        this.f8757h = l;
        this.f8758i = l2;
        this.f8759j = l3;
        this.f8760k = bool;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C3292p m31052a(Long l, Long l2, Boolean bool) {
        return new C3292p(this.f8750a, this.f8751b, this.f8752c, this.f8753d, this.f8754e, this.f8755f, this.f8756g, this.f8757h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C3292p m31051b(long j, long j2) {
        return new C3292p(this.f8750a, this.f8751b, this.f8752c, this.f8753d, this.f8754e, this.f8755f, j, Long.valueOf(j2), this.f8758i, this.f8759j, this.f8760k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C3292p m31050c(long j) {
        return new C3292p(this.f8750a, this.f8751b, this.f8752c, this.f8753d, this.f8754e, j, this.f8756g, this.f8757h, this.f8758i, this.f8759j, this.f8760k);
    }
}
