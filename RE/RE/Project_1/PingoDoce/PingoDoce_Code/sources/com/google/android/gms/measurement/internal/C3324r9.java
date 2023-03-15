package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C2695b3;
import com.google.android.gms.internal.measurement.C2807i3;
import com.google.android.gms.internal.measurement.C2976sc;
import com.google.android.gms.internal.measurement.C3074z4;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.r9 */
/* loaded from: classes.dex */
public final class C3324r9 extends AbstractC3313q9 {

    /* renamed from: g */
    private final C2807i3 f8852g;

    /* renamed from: h */
    final /* synthetic */ C3335s9 f8853h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3324r9(C3335s9 c3335s9, String str, int i, C2807i3 c2807i3) {
        super(str, i);
        this.f8853h = c3335s9;
        this.f8852g = c2807i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC3313q9
    /* renamed from: a */
    public final int mo31023a() {
        return this.f8852g.m32590A();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC3313q9
    /* renamed from: b */
    public final boolean mo31022b() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC3313q9
    /* renamed from: c */
    public final boolean mo31021c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean m31020k(Long l, Long l2, C3074z4 c3074z4, boolean z) {
        C2976sc.m32098b();
        boolean m31373B = this.f8853h.f8410a.m31094z().m31373B(this.f8821a, C3339t2.f8905W);
        boolean m32584G = this.f8852g.m32584G();
        boolean m32583H = this.f8852g.m32583H();
        boolean m32582I = this.f8852g.m32582I();
        byte b = (m32584G || m32583H || m32582I) ? (byte) 1 : (byte) 0;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z && b == 0) {
            this.f8853h.f8410a.mo31116d().m31328v().m31396c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f8822b), this.f8852g.m32581J() ? Integer.valueOf(this.f8852g.m32590A()) : null);
            return true;
        }
        C2695b3 m32589B = this.f8852g.m32589B();
        boolean m32885G = m32589B.m32885G();
        if (c3074z4.m31695Q()) {
            if (!m32589B.m32883I()) {
                this.f8853h.f8410a.mo31116d().m31327w().m31397b("No number filter for long property. property", this.f8853h.f8410a.m31134D().m31452f(c3074z4.m31706F()));
            } else {
                bool = AbstractC3313q9.m31031j(AbstractC3313q9.m31033h(c3074z4.m31710B(), m32589B.m32889C()), m32885G);
            }
        } else if (c3074z4.m31696P()) {
            if (!m32589B.m32883I()) {
                this.f8853h.f8410a.mo31116d().m31327w().m31397b("No number filter for double property. property", this.f8853h.f8410a.m31134D().m31452f(c3074z4.m31706F()));
            } else {
                bool = AbstractC3313q9.m31031j(AbstractC3313q9.m31034g(c3074z4.m31711A(), m32589B.m32889C()), m32885G);
            }
        } else if (c3074z4.m31693S()) {
            if (!m32589B.m32881K()) {
                if (!m32589B.m32883I()) {
                    this.f8853h.f8410a.mo31116d().m31327w().m31397b("No string or number filter defined. property", this.f8853h.f8410a.m31134D().m31452f(c3074z4.m31706F()));
                } else if (C3159c9.m31425N(c3074z4.m31705G())) {
                    bool = AbstractC3313q9.m31031j(AbstractC3313q9.m31032i(c3074z4.m31705G(), m32589B.m32889C()), m32885G);
                } else {
                    this.f8853h.f8410a.mo31116d().m31327w().m31396c("Invalid user property value for Numeric number filter. property, value", this.f8853h.f8410a.m31134D().m31452f(c3074z4.m31706F()), c3074z4.m31705G());
                }
            } else {
                bool = AbstractC3313q9.m31031j(AbstractC3313q9.m31035f(c3074z4.m31705G(), m32589B.m32888D(), this.f8853h.f8410a.mo31116d()), m32885G);
            }
        } else {
            this.f8853h.f8410a.mo31116d().m31327w().m31397b("User property has no value, property", this.f8853h.f8410a.m31134D().m31452f(c3074z4.m31706F()));
        }
        this.f8853h.f8410a.mo31116d().m31328v().m31397b("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.f8823c = Boolean.TRUE;
        if (!m32582I || bool.booleanValue()) {
            if (!z || this.f8852g.m32584G()) {
                this.f8824d = bool;
            }
            if (bool.booleanValue() && b != 0 && c3074z4.m31694R()) {
                long m31709C = c3074z4.m31709C();
                if (l != null) {
                    m31709C = l.longValue();
                }
                if (m31373B && this.f8852g.m32584G() && !this.f8852g.m32583H() && l2 != null) {
                    m31709C = l2.longValue();
                }
                if (this.f8852g.m32583H()) {
                    this.f8826f = Long.valueOf(m31709C);
                } else {
                    this.f8825e = Long.valueOf(m31709C);
                }
            }
            return true;
        }
        return true;
    }
}
