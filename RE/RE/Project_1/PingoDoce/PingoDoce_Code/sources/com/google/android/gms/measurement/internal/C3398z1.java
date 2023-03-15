package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C2597i;
import java.util.Map;
import p301q.C9545a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.z1 */
/* loaded from: classes.dex */
public final class C3398z1 extends C3399z2 {

    /* renamed from: b */
    private final Map f9142b;

    /* renamed from: c */
    private final Map f9143c;

    /* renamed from: d */
    private long f9144d;

    public C3398z1(C3242k4 c3242k4) {
        super(c3242k4);
        this.f9143c = new C9545a();
        this.f9142b = new C9545a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static /* synthetic */ void m30834i(C3398z1 c3398z1, String str, long j) {
        c3398z1.mo30825h();
        C2597i.m33080f(str);
        if (c3398z1.f9143c.isEmpty()) {
            c3398z1.f9144d = j;
        }
        Integer num = (Integer) c3398z1.f9143c.get(str);
        if (num != null) {
            c3398z1.f9143c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (c3398z1.f9143c.size() >= 100) {
            c3398z1.f8410a.mo31116d().m31327w().m31398a("Too many ads visible");
        } else {
            c3398z1.f9143c.put(str, 1);
            c3398z1.f9142b.put(str, Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static /* synthetic */ void m30833j(C3398z1 c3398z1, String str, long j) {
        c3398z1.mo30825h();
        C2597i.m33080f(str);
        Integer num = (Integer) c3398z1.f9143c.get(str);
        if (num != null) {
            C3299p6 m30894t = c3398z1.f8410a.m31127K().m30894t(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                c3398z1.f9143c.remove(str);
                Long l = (Long) c3398z1.f9142b.get(str);
                if (l == null) {
                    c3398z1.f8410a.mo31116d().m31332r().m31398a("First ad unit exposure time was never set");
                } else {
                    long longValue = l.longValue();
                    c3398z1.f9142b.remove(str);
                    c3398z1.m30827p(str, j - longValue, m30894t);
                }
                if (c3398z1.f9143c.isEmpty()) {
                    long j2 = c3398z1.f9144d;
                    if (j2 == 0) {
                        c3398z1.f8410a.mo31116d().m31332r().m31398a("First ad exposure time was never set");
                        return;
                    }
                    c3398z1.m30828o(j - j2, m30894t);
                    c3398z1.f9144d = 0L;
                    return;
                }
                return;
            }
            c3398z1.f9143c.put(str, Integer.valueOf(intValue));
            return;
        }
        c3398z1.f8410a.mo31116d().m31332r().m31397b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: o */
    private final void m30828o(long j, C3299p6 c3299p6) {
        if (c3299p6 == null) {
            this.f8410a.mo31116d().m31328v().m31398a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            this.f8410a.mo31116d().m31328v().m31397b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C3203g9.m31265x(c3299p6, bundle, true);
            this.f8410a.m31129I().m31150u("am", "_xa", bundle);
        }
    }

    /* renamed from: p */
    private final void m30827p(String str, long j, C3299p6 c3299p6) {
        if (c3299p6 == null) {
            this.f8410a.mo31116d().m31328v().m31398a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            this.f8410a.mo31116d().m31328v().m31397b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C3203g9.m31265x(c3299p6, bundle, true);
            this.f8410a.m31129I().m31150u("am", "_xu", bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m30826q(long j) {
        for (String str : this.f9142b.keySet()) {
            this.f9142b.put(str, Long.valueOf(j));
        }
        if (this.f9142b.isEmpty()) {
            return;
        }
        this.f9144d = j;
    }

    /* renamed from: l */
    public final void m30831l(String str, long j) {
        if (str != null && str.length() != 0) {
            this.f8410a.mo31118b().m31239z(new RunnableC3127a(this, str, j));
        } else {
            this.f8410a.mo31116d().m31332r().m31398a("Ad unit id must be a non-empty string");
        }
    }

    /* renamed from: m */
    public final void m30830m(String str, long j) {
        if (str != null && str.length() != 0) {
            this.f8410a.mo31118b().m31239z(new RunnableC3376x(this, str, j));
        } else {
            this.f8410a.mo31116d().m31332r().m31398a("Ad unit id must be a non-empty string");
        }
    }

    /* renamed from: n */
    public final void m30829n(long j) {
        C3299p6 m30894t = this.f8410a.m31127K().m30894t(false);
        for (String str : this.f9142b.keySet()) {
            m30827p(str, j - ((Long) this.f9142b.get(str)).longValue(), m30894t);
        }
        if (!this.f9142b.isEmpty()) {
            m30828o(j - this.f9144d, m30894t);
        }
        m30826q(j);
    }
}
