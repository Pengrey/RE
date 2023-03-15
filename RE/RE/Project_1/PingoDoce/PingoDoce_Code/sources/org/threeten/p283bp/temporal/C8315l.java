package org.threeten.p283bp.temporal;

import java.io.Serializable;
import org.threeten.p283bp.DateTimeException;

/* renamed from: org.threeten.bp.temporal.l */
/* loaded from: classes2.dex */
public final class C8315l implements Serializable {

    /* renamed from: w */
    private final long f21514w;

    /* renamed from: x */
    private final long f21515x;

    /* renamed from: y */
    private final long f21516y;

    /* renamed from: z */
    private final long f21517z;

    private C8315l(long j, long j2, long j3, long j4) {
        this.f21514w = j;
        this.f21515x = j2;
        this.f21516y = j3;
        this.f21517z = j4;
    }

    /* renamed from: i */
    public static C8315l m15846i(long j, long j2) {
        if (j <= j2) {
            return new C8315l(j, j, j2, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    /* renamed from: j */
    public static C8315l m15845j(long j, long j2, long j3) {
        return m15844k(j, j, j2, j3);
    }

    /* renamed from: k */
    public static C8315l m15844k(long j, long j2, long j3, long j4) {
        if (j <= j2) {
            if (j3 <= j4) {
                if (j2 <= j4) {
                    return new C8315l(j, j2, j3, j4);
                }
                throw new IllegalArgumentException("Minimum value must be less than maximum value");
            }
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
    }

    /* renamed from: a */
    public int m15854a(long j, InterfaceC8304h interfaceC8304h) {
        if (m15848g(j)) {
            return (int) j;
        }
        throw new DateTimeException("Invalid int value for " + interfaceC8304h + ": " + j);
    }

    /* renamed from: b */
    public long m15853b(long j, InterfaceC8304h interfaceC8304h) {
        if (m15847h(j)) {
            return j;
        }
        if (interfaceC8304h != null) {
            throw new DateTimeException("Invalid value for " + interfaceC8304h + " (valid values " + this + "): " + j);
        }
        throw new DateTimeException("Invalid value (valid values " + this + "): " + j);
    }

    /* renamed from: c */
    public long m15852c() {
        return this.f21517z;
    }

    /* renamed from: d */
    public long m15851d() {
        return this.f21514w;
    }

    /* renamed from: e */
    public boolean m15850e() {
        return this.f21514w == this.f21515x && this.f21516y == this.f21517z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8315l) {
            C8315l c8315l = (C8315l) obj;
            return this.f21514w == c8315l.f21514w && this.f21515x == c8315l.f21515x && this.f21516y == c8315l.f21516y && this.f21517z == c8315l.f21517z;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m15849f() {
        return m15851d() >= -2147483648L && m15852c() <= 2147483647L;
    }

    /* renamed from: g */
    public boolean m15848g(long j) {
        return m15849f() && m15847h(j);
    }

    /* renamed from: h */
    public boolean m15847h(long j) {
        return j >= m15851d() && j <= m15852c();
    }

    public int hashCode() {
        long j = this.f21514w;
        long j2 = this.f21515x;
        long j3 = (j + j2) << ((int) (j2 + 16));
        long j4 = this.f21516y;
        long j5 = (j3 >> ((int) (j4 + 48))) << ((int) (j4 + 32));
        long j6 = this.f21517z;
        long j7 = ((j5 >> ((int) (32 + j6))) << ((int) (j6 + 48))) >> 16;
        return (int) (j7 ^ (j7 >>> 32));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f21514w);
        if (this.f21514w != this.f21515x) {
            sb2.append('/');
            sb2.append(this.f21515x);
        }
        sb2.append(" - ");
        sb2.append(this.f21516y);
        if (this.f21516y != this.f21517z) {
            sb2.append('/');
            sb2.append(this.f21517z);
        }
        return sb2.toString();
    }
}
