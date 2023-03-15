package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import androidx.constraintlayout.widget.C0868i;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC2576b;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.tasks.AbstractC3419d;
import p078e7.C5000a;
import p079e8.InterfaceC5016c;
import p484z6.C13707e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.r0 */
/* loaded from: classes.dex */
public final class C2539r0<T> implements InterfaceC5016c<T> {

    /* renamed from: a */
    private final C2499f f7328a;

    /* renamed from: b */
    private final int f7329b;

    /* renamed from: c */
    private final C2485b<?> f7330c;

    /* renamed from: d */
    private final long f7331d;

    /* renamed from: e */
    private final long f7332e;

    C2539r0(C2499f c2499f, int i, C2485b<?> c2485b, long j, long j2, String str, String str2) {
        this.f7328a = c2499f;
        this.f7329b = i;
        this.f7330c = c2485b;
        this.f7331d = j;
        this.f7332e = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> C2539r0<T> m33297b(C2499f c2499f, int i, C2485b<?> c2485b) {
        boolean z;
        if (c2499f.m33425g()) {
            RootTelemetryConfiguration m566a = C13707e.m565b().m566a();
            if (m566a == null) {
                z = true;
            } else if (!m566a.m33189v()) {
                return null;
            } else {
                z = m566a.m33188y();
                C2506h0 m33408x = c2499f.m33408x(c2485b);
                if (m33408x != null) {
                    if (!(m33408x.m33362t() instanceof AbstractC2576b)) {
                        return null;
                    }
                    AbstractC2576b abstractC2576b = (AbstractC2576b) m33408x.m33362t();
                    if (abstractC2576b.m33178J() && !abstractC2576b.m33149i()) {
                        ConnectionTelemetryConfiguration m33296c = m33296c(m33408x, abstractC2576b, i);
                        if (m33296c == null) {
                            return null;
                        }
                        m33408x.m33392F();
                        z = m33296c.m33199D();
                    }
                }
            }
            return new C2539r0<>(c2499f, i, c2485b, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L, null, null);
        }
        return null;
    }

    /* renamed from: c */
    private static ConnectionTelemetryConfiguration m33296c(C2506h0<?> c2506h0, AbstractC2576b<?> abstractC2576b, int i) {
        int[] m33196t;
        int[] m33195v;
        ConnectionTelemetryConfiguration m33180H = abstractC2576b.m33180H();
        if (m33180H == null || !m33180H.m33194y() || ((m33196t = m33180H.m33196t()) != null ? !C5000a.m25921b(m33196t, i) : !((m33195v = m33180H.m33195v()) == null || !C5000a.m25921b(m33195v, i))) || c2506h0.m33366p() >= m33180H.m33197h()) {
            return null;
        }
        return m33180H;
    }

    @Override // p079e8.InterfaceC5016c
    /* renamed from: a */
    public final void mo4683a(AbstractC3419d<T> abstractC3419d) {
        C2506h0 m33408x;
        int i;
        int i2;
        int i3;
        int m33522h;
        long j;
        long j2;
        int i4;
        if (this.f7328a.m33425g()) {
            RootTelemetryConfiguration m566a = C13707e.m565b().m566a();
            if ((m566a == null || m566a.m33189v()) && (m33408x = this.f7328a.m33408x(this.f7330c)) != null && (m33408x.m33362t() instanceof AbstractC2576b)) {
                AbstractC2576b abstractC2576b = (AbstractC2576b) m33408x.m33362t();
                boolean z = true;
                int i5 = 0;
                boolean z2 = this.f7331d > 0;
                int m33138z = abstractC2576b.m33138z();
                if (m566a != null) {
                    z2 &= m566a.m33188y();
                    int m33191h = m566a.m33191h();
                    int m33190t = m566a.m33190t();
                    i = m566a.m33192D();
                    if (abstractC2576b.m33178J() && !abstractC2576b.m33149i()) {
                        ConnectionTelemetryConfiguration m33296c = m33296c(m33408x, abstractC2576b, this.f7329b);
                        if (m33296c == null) {
                            return;
                        }
                        if (!m33296c.m33199D() || this.f7331d <= 0) {
                            z = false;
                        }
                        m33190t = m33296c.m33197h();
                        z2 = z;
                    }
                    i3 = m33191h;
                    i2 = m33190t;
                } else {
                    i = 0;
                    i2 = 100;
                    i3 = 5000;
                }
                C2499f c2499f = this.f7328a;
                if (abstractC3419d.mo30780p()) {
                    m33522h = 0;
                } else {
                    if (abstractC3419d.mo30782n()) {
                        i5 = 100;
                    } else {
                        Exception mo30785k = abstractC3419d.mo30785k();
                        if (mo30785k instanceof ApiException) {
                            Status m33515a = ((ApiException) mo30785k).m33515a();
                            int m33508t = m33515a.m33508t();
                            ConnectionResult m33509h = m33515a.m33509h();
                            m33522h = m33509h == null ? -1 : m33509h.m33522h();
                            i5 = m33508t;
                        } else {
                            i5 = C0868i.f2743B0;
                        }
                    }
                    m33522h = -1;
                }
                if (z2) {
                    long j3 = this.f7331d;
                    long currentTimeMillis = System.currentTimeMillis();
                    i4 = (int) (SystemClock.elapsedRealtime() - this.f7332e);
                    j = j3;
                    j2 = currentTimeMillis;
                } else {
                    j = 0;
                    j2 = 0;
                    i4 = -1;
                }
                c2499f.m33433I(new MethodInvocation(this.f7329b, i5, m33522h, j, j2, null, null, m33138z, i4), i, i3, i2);
            }
        }
    }
}
