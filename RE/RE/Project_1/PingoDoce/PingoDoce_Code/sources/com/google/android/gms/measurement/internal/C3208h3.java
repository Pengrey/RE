package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.h3 */
/* loaded from: classes.dex */
public final class C3208h3 {

    /* renamed from: a */
    public final String f8490a;

    /* renamed from: b */
    public final String f8491b;

    /* renamed from: c */
    public final long f8492c;

    /* renamed from: d */
    public final Bundle f8493d;

    public C3208h3(String str, String str2, Bundle bundle, long j) {
        this.f8490a = str;
        this.f8491b = str2;
        this.f8493d = bundle;
        this.f8492c = j;
    }

    /* renamed from: b */
    public static C3208h3 m31261b(zzau zzauVar) {
        return new C3208h3(zzauVar.f9175w, zzauVar.f9177y, zzauVar.f9176x.m30817v(), zzauVar.f9178z);
    }

    /* renamed from: a */
    public final zzau m31262a() {
        return new zzau(this.f8490a, new zzas(new Bundle(this.f8493d)), this.f8491b, this.f8492c);
    }

    public final String toString() {
        String str = this.f8491b;
        String str2 = this.f8490a;
        String obj = this.f8493d.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + obj.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(obj);
        return sb2.toString();
    }
}
