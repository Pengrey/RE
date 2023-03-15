package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2597i;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.o */
/* loaded from: classes.dex */
public final class C3281o {

    /* renamed from: a */
    final String f8720a;

    /* renamed from: b */
    final String f8721b;

    /* renamed from: c */
    final String f8722c;

    /* renamed from: d */
    final long f8723d;

    /* renamed from: e */
    final long f8724e;

    /* renamed from: f */
    final zzas f8725f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3281o(C3242k4 c3242k4, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzas zzasVar;
        C2597i.m33080f(str2);
        C2597i.m33080f(str3);
        this.f8720a = str2;
        this.f8721b = str3;
        this.f8722c = true == TextUtils.isEmpty(str) ? null : str;
        this.f8723d = j;
        this.f8724e = j2;
        if (j2 != 0 && j2 > j) {
            c3242k4.mo31116d().m31327w().m31397b("Event created with reverse previous/current timestamps. appId", C3197g3.m31324z(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c3242k4.mo31116d().m31332r().m31398a("Param name can't be null");
                    it.remove();
                } else {
                    Object m31283o = c3242k4.m31124N().m31283o(next, bundle2.get(next));
                    if (m31283o == null) {
                        c3242k4.mo31116d().m31327w().m31397b("Param value can't be null", c3242k4.m31134D().m31453e(next));
                        it.remove();
                    } else {
                        c3242k4.m31124N().m31322B(bundle2, next, m31283o);
                    }
                }
            }
            zzasVar = new zzas(bundle2);
        } else {
            zzasVar = new zzas(new Bundle());
        }
        this.f8725f = zzasVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C3281o m31058a(C3242k4 c3242k4, long j) {
        return new C3281o(c3242k4, this.f8722c, this.f8720a, this.f8721b, this.f8723d, j, this.f8725f);
    }

    public final String toString() {
        String str = this.f8720a;
        String str2 = this.f8721b;
        String obj = this.f8725f.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + obj.length());
        sb2.append("Event{appId='");
        sb2.append(str);
        sb2.append("', name='");
        sb2.append(str2);
        sb2.append("', params=");
        sb2.append(obj);
        sb2.append('}');
        return sb2.toString();
    }

    private C3281o(C3242k4 c3242k4, String str, String str2, String str3, long j, long j2, zzas zzasVar) {
        C2597i.m33080f(str2);
        C2597i.m33080f(str3);
        C2597i.m33076j(zzasVar);
        this.f8720a = str2;
        this.f8721b = str3;
        this.f8722c = true == TextUtils.isEmpty(str) ? null : str;
        this.f8723d = j;
        this.f8724e = j2;
        if (j2 != 0 && j2 > j) {
            c3242k4.mo31116d().m31327w().m31396c("Event created with reverse previous/current timestamps. appId, name", C3197g3.m31324z(str2), C3197g3.m31324z(str3));
        }
        this.f8725f = zzasVar;
    }
}
