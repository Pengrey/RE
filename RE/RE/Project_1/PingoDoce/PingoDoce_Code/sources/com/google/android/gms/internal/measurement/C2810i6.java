package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.i6 */
/* loaded from: classes.dex */
public final class C2810i6 extends AbstractC2890n6 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2810i6(C2842k6 c2842k6, String str, Double d, boolean z) {
        super(c2842k6, "measurement.test.double_flag", d, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2890n6
    @Nullable
    /* renamed from: a */
    final /* bridge */ /* synthetic */ Object mo32439a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String m32437c = super.m32437c();
            String str = (String) obj;
            StringBuilder sb2 = new StringBuilder(String.valueOf(m32437c).length() + 27 + str.length());
            sb2.append("Invalid double value for ");
            sb2.append(m32437c);
            sb2.append(": ");
            sb2.append(str);
            Log.e("PhenotypeFlag", sb2.toString());
            return null;
        }
    }
}
