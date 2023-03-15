package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.h6 */
/* loaded from: classes.dex */
public final class C2794h6 extends AbstractC2890n6 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2794h6(C2842k6 c2842k6, String str, Boolean bool, boolean z) {
        super(c2842k6, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.AbstractC2890n6
    @Nullable
    /* renamed from: a */
    final /* bridge */ /* synthetic */ Object mo32439a(Object obj) {
        if (C2889n5.f7869c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (C2889n5.f7870d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String m32437c = super.m32437c();
        String str = (String) obj;
        StringBuilder sb2 = new StringBuilder(String.valueOf(m32437c).length() + 28 + str.length());
        sb2.append("Invalid boolean value for ");
        sb2.append(m32437c);
        sb2.append(": ");
        sb2.append(str);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
