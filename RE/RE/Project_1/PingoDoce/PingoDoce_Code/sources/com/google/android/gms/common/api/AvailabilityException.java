package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C2485b;
import com.google.android.gms.common.internal.C2597i;
import java.util.ArrayList;
import p301q.C9545a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public class AvailabilityException extends Exception {

    /* renamed from: w */
    private final C9545a<C2485b<?>, ConnectionResult> f7151w;

    public AvailabilityException(C9545a<C2485b<?>, ConnectionResult> c9545a) {
        this.f7151w = c9545a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C2485b<?> c2485b : this.f7151w.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) C2597i.m33076j(this.f7151w.get(c2485b));
            z &= !connectionResult.m33524D();
            String m33460b = c2485b.m33460b();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb2 = new StringBuilder(String.valueOf(m33460b).length() + 2 + valueOf.length());
            sb2.append(m33460b);
            sb2.append(": ");
            sb2.append(valueOf);
            arrayList.add(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        if (z) {
            sb3.append("None of the queried APIs are available. ");
        } else {
            sb3.append("Some of the queried APIs are unavailable. ");
        }
        sb3.append(TextUtils.join("; ", arrayList));
        return sb3.toString();
    }
}
