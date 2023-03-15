package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C2597i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.s3 */
/* loaded from: classes.dex */
public final class C3329s3 {

    /* renamed from: a */
    private final String f8864a;

    /* renamed from: b */
    private boolean f8865b;

    /* renamed from: c */
    private String f8866c;

    /* renamed from: d */
    final /* synthetic */ C3340t3 f8867d;

    public C3329s3(C3340t3 c3340t3, String str, String str2) {
        this.f8867d = c3340t3;
        C2597i.m33080f(str);
        this.f8864a = str;
    }

    /* renamed from: a */
    public final String m31016a() {
        if (!this.f8865b) {
            this.f8865b = true;
            this.f8866c = this.f8867d.m31006o().getString(this.f8864a, null);
        }
        return this.f8866c;
    }

    /* renamed from: b */
    public final void m31015b(String str) {
        SharedPreferences.Editor edit = this.f8867d.m31006o().edit();
        edit.putString(this.f8864a, str);
        edit.apply();
        this.f8866c = str;
    }
}
