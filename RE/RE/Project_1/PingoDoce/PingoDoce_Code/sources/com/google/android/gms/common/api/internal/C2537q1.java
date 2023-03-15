package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.C3421e;
import java.util.Map;
import java.util.Set;
import p301q.C9545a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.q1 */
/* loaded from: classes.dex */
public final class C2537q1 {

    /* renamed from: a */
    private final C9545a<C2485b<?>, ConnectionResult> f7323a;

    /* renamed from: b */
    private final C9545a<C2485b<?>, String> f7324b;

    /* renamed from: c */
    private final C3421e<Map<C2485b<?>, String>> f7325c;

    /* renamed from: d */
    private int f7326d;

    /* renamed from: e */
    private boolean f7327e;

    /* renamed from: a */
    public final Set<C2485b<?>> m33299a() {
        return this.f7323a.keySet();
    }

    /* renamed from: b */
    public final void m33298b(C2485b<?> c2485b, ConnectionResult connectionResult, String str) {
        this.f7323a.put(c2485b, connectionResult);
        this.f7324b.put(c2485b, str);
        this.f7326d--;
        if (!connectionResult.m33524D()) {
            this.f7327e = true;
        }
        if (this.f7326d == 0) {
            if (this.f7327e) {
                this.f7325c.m30801b(new AvailabilityException(this.f7323a));
                return;
            }
            this.f7325c.m30800c(this.f7324b);
        }
    }
}
