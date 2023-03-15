package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.internal.measurement.zzcl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.i5 */
/* loaded from: classes.dex */
public final class C3221i5 {

    /* renamed from: a */
    final Context f8525a;

    /* renamed from: b */
    String f8526b;

    /* renamed from: c */
    String f8527c;

    /* renamed from: d */
    String f8528d;

    /* renamed from: e */
    Boolean f8529e;

    /* renamed from: f */
    long f8530f;

    /* renamed from: g */
    zzcl f8531g;

    /* renamed from: h */
    boolean f8532h;

    /* renamed from: i */
    final Long f8533i;

    /* renamed from: j */
    String f8534j;

    public C3221i5(Context context, zzcl zzclVar, Long l) {
        this.f8532h = true;
        C2597i.m33076j(context);
        Context applicationContext = context.getApplicationContext();
        C2597i.m33076j(applicationContext);
        this.f8525a = applicationContext;
        this.f8533i = l;
        if (zzclVar != null) {
            this.f8531g = zzclVar;
            this.f8526b = zzclVar.f8154B;
            this.f8527c = zzclVar.f8153A;
            this.f8528d = zzclVar.f8160z;
            this.f8532h = zzclVar.f8159y;
            this.f8530f = zzclVar.f8158x;
            this.f8534j = zzclVar.f8156D;
            Bundle bundle = zzclVar.f8155C;
            if (bundle != null) {
                this.f8529e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
