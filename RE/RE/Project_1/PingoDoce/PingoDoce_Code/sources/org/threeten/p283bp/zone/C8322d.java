package org.threeten.p283bp.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.threeten.p283bp.C8170b;
import org.threeten.p283bp.C8171c;
import org.threeten.p283bp.C8216e;
import org.threeten.p283bp.C8282o;

/* renamed from: org.threeten.bp.zone.d */
/* loaded from: classes2.dex */
public final class C8322d implements Comparable<C8322d>, Serializable {

    /* renamed from: w */
    private final C8216e f21551w;

    /* renamed from: x */
    private final C8282o f21552x;

    /* renamed from: y */
    private final C8282o f21553y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8322d(C8216e c8216e, C8282o c8282o, C8282o c8282o2) {
        this.f21551w = c8216e;
        this.f21552x = c8282o;
        this.f21553y = c8282o2;
    }

    /* renamed from: f */
    private int m15798f() {
        return m15796h().m15925r() - m15795i().m15925r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static C8322d m15792l(DataInput dataInput) throws IOException {
        long m15822b = C8318a.m15822b(dataInput);
        C8282o m15820d = C8318a.m15820d(dataInput);
        C8282o m15820d2 = C8318a.m15820d(dataInput);
        if (!m15820d.equals(m15820d2)) {
            return new C8322d(m15822b, m15820d, m15820d2);
        }
        throw new IllegalArgumentException("Offsets must not be equal");
    }

    private Object writeReplace() {
        return new C8318a((byte) 2, this);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C8322d c8322d) {
        return m15797g().compareTo(c8322d.m15797g());
    }

    /* renamed from: c */
    public C8216e m15801c() {
        return this.f21551w.m16144P(m15798f());
    }

    /* renamed from: d */
    public C8216e m15800d() {
        return this.f21551w;
    }

    /* renamed from: e */
    public C8170b m15799e() {
        return C8170b.m16403f(m15798f());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8322d) {
            C8322d c8322d = (C8322d) obj;
            return this.f21551w.equals(c8322d.f21551w) && this.f21552x.equals(c8322d.f21552x) && this.f21553y.equals(c8322d.f21553y);
        }
        return false;
    }

    /* renamed from: g */
    public C8171c m15797g() {
        return this.f21551w.m16373p(this.f21552x);
    }

    /* renamed from: h */
    public C8282o m15796h() {
        return this.f21553y;
    }

    public int hashCode() {
        return (this.f21551w.hashCode() ^ this.f21552x.hashCode()) ^ Integer.rotateLeft(this.f21553y.hashCode(), 16);
    }

    /* renamed from: i */
    public C8282o m15795i() {
        return this.f21552x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public List<C8282o> m15794j() {
        return m15793k() ? Collections.emptyList() : Arrays.asList(m15795i(), m15796h());
    }

    /* renamed from: k */
    public boolean m15793k() {
        return m15796h().m15925r() > m15795i().m15925r();
    }

    /* renamed from: m */
    public long m15791m() {
        return this.f21551w.m16374o(this.f21552x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m15790n(DataOutput dataOutput) throws IOException {
        C8318a.m15819e(m15791m(), dataOutput);
        C8318a.m15817g(this.f21552x, dataOutput);
        C8318a.m15817g(this.f21553y, dataOutput);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Transition[");
        sb2.append(m15793k() ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.f21551w);
        sb2.append(this.f21552x);
        sb2.append(" to ");
        sb2.append(this.f21553y);
        sb2.append(']');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8322d(long j, C8282o c8282o, C8282o c8282o2) {
        this.f21551w = C8216e.m16150J(j, 0, c8282o);
        this.f21552x = c8282o;
        this.f21553y = c8282o2;
    }
}
