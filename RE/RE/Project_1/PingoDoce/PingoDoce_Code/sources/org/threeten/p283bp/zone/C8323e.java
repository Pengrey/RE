package org.threeten.p283bp.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import org.joda.time.DateTimeConstants;
import org.threeten.p283bp.C8213d;
import org.threeten.p283bp.C8216e;
import org.threeten.p283bp.C8219f;
import org.threeten.p283bp.C8282o;
import org.threeten.p283bp.EnumC8168a;
import org.threeten.p283bp.EnumC8260g;
import org.threeten.p283bp.chrono.C8195m;
import org.threeten.p283bp.temporal.C8301g;
import p405vf.C11251d;

/* renamed from: org.threeten.bp.zone.e */
/* loaded from: classes2.dex */
public final class C8323e implements Serializable {

    /* renamed from: A */
    private final int f21554A;

    /* renamed from: B */
    private final EnumC8325b f21555B;

    /* renamed from: C */
    private final C8282o f21556C;

    /* renamed from: D */
    private final C8282o f21557D;

    /* renamed from: E */
    private final C8282o f21558E;

    /* renamed from: w */
    private final EnumC8260g f21559w;

    /* renamed from: x */
    private final byte f21560x;

    /* renamed from: y */
    private final EnumC8168a f21561y;

    /* renamed from: z */
    private final C8219f f21562z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ZoneOffsetTransitionRule.java */
    /* renamed from: org.threeten.bp.zone.e$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C8324a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21563a;

        static {
            int[] iArr = new int[EnumC8325b.values().length];
            f21563a = iArr;
            try {
                iArr[EnumC8325b.UTC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21563a[EnumC8325b.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ZoneOffsetTransitionRule.java */
    /* renamed from: org.threeten.bp.zone.e$b */
    /* loaded from: classes2.dex */
    public enum EnumC8325b {
        UTC,
        WALL,
        STANDARD;

        public C8216e createDateTime(C8216e c8216e, C8282o c8282o, C8282o c8282o2) {
            int i = C8324a.f21563a[ordinal()];
            if (i != 1) {
                return i != 2 ? c8216e : c8216e.m16144P(c8282o2.m15925r() - c8282o.m15925r());
            }
            return c8216e.m16144P(c8282o2.m15925r() - C8282o.f21486B.m15925r());
        }
    }

    C8323e(EnumC8260g enumC8260g, int i, EnumC8168a enumC8168a, C8219f c8219f, int i2, EnumC8325b enumC8325b, C8282o c8282o, C8282o c8282o2, C8282o c8282o3) {
        this.f21559w = enumC8260g;
        this.f21560x = (byte) i;
        this.f21561y = enumC8168a;
        this.f21562z = c8219f;
        this.f21554A = i2;
        this.f21555B = enumC8325b;
        this.f21556C = c8282o;
        this.f21557D = c8282o2;
        this.f21558E = c8282o3;
    }

    /* renamed from: a */
    private void m15789a(StringBuilder sb2, long j) {
        if (j < 10) {
            sb2.append(0);
        }
        sb2.append(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C8323e m15787c(DataInput dataInput) throws IOException {
        int readInt = dataInput.readInt();
        EnumC8260g m16008of = EnumC8260g.m16008of(readInt >>> 28);
        int i = ((264241152 & readInt) >>> 22) - 32;
        int i2 = (3670016 & readInt) >>> 19;
        EnumC8168a m16409of = i2 == 0 ? null : EnumC8168a.m16409of(i2);
        int i3 = (507904 & readInt) >>> 14;
        EnumC8325b enumC8325b = EnumC8325b.values()[(readInt & 12288) >>> 12];
        int i4 = (readInt & 4080) >>> 4;
        int i5 = (readInt & 12) >>> 2;
        int i6 = readInt & 3;
        int readInt2 = i3 == 31 ? dataInput.readInt() : i3 * DateTimeConstants.SECONDS_PER_HOUR;
        C8282o m15922u = C8282o.m15922u(i4 == 255 ? dataInput.readInt() : (i4 - 128) * 900);
        C8282o m15922u2 = C8282o.m15922u(i5 == 3 ? dataInput.readInt() : m15922u.m15925r() + (i5 * 1800));
        C8282o m15922u3 = C8282o.m15922u(i6 == 3 ? dataInput.readInt() : m15922u.m15925r() + (i6 * 1800));
        if (i >= -28 && i <= 31 && i != 0) {
            return new C8323e(m16008of, i, m16409of, C8219f.m16096w(C11251d.m5626f(readInt2, DateTimeConstants.SECONDS_PER_DAY)), C11251d.m5628d(readInt2, DateTimeConstants.SECONDS_PER_DAY), enumC8325b, m15922u, m15922u2, m15922u3);
        }
        throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
    }

    private Object writeReplace() {
        return new C8318a((byte) 3, this);
    }

    /* renamed from: b */
    public C8322d m15788b(int i) {
        C8213d m16192P;
        byte b = this.f21560x;
        if (b < 0) {
            EnumC8260g enumC8260g = this.f21559w;
            m16192P = C8213d.m16192P(i, enumC8260g, enumC8260g.length(C8195m.f21328y.m16291u(i)) + 1 + this.f21560x);
            EnumC8168a enumC8168a = this.f21561y;
            if (enumC8168a != null) {
                m16192P = m16192P.mo16166q(C8301g.m15870b(enumC8168a));
            }
        } else {
            m16192P = C8213d.m16192P(i, this.f21559w, b);
            EnumC8168a enumC8168a2 = this.f21561y;
            if (enumC8168a2 != null) {
                m16192P = m16192P.mo16166q(C8301g.m15871a(enumC8168a2));
            }
        }
        return new C8322d(this.f21555B.createDateTime(C8216e.m16151I(m16192P.m16188T(this.f21554A), this.f21562z), this.f21556C, this.f21557D), this.f21557D, this.f21558E);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m15786d(DataOutput dataOutput) throws IOException {
        int i;
        int m16117H = this.f21562z.m16117H() + (this.f21554A * DateTimeConstants.SECONDS_PER_DAY);
        int m15925r = this.f21556C.m15925r();
        int m15925r2 = this.f21557D.m15925r() - m15925r;
        int m15925r3 = this.f21558E.m15925r() - m15925r;
        if (m16117H % DateTimeConstants.SECONDS_PER_HOUR != 0 || m16117H > 86400) {
            i = 31;
        } else {
            i = m16117H == 86400 ? 24 : this.f21562z.m16104m();
        }
        int i2 = m15925r % 900 == 0 ? (m15925r / 900) + 128 : 255;
        int i3 = (m15925r2 == 0 || m15925r2 == 1800 || m15925r2 == 3600) ? m15925r2 / 1800 : 3;
        int i4 = (m15925r3 == 0 || m15925r3 == 1800 || m15925r3 == 3600) ? m15925r3 / 1800 : 3;
        EnumC8168a enumC8168a = this.f21561y;
        dataOutput.writeInt((this.f21559w.getValue() << 28) + ((this.f21560x + 32) << 22) + ((enumC8168a == null ? 0 : enumC8168a.getValue()) << 19) + (i << 14) + (this.f21555B.ordinal() << 12) + (i2 << 4) + (i3 << 2) + i4);
        if (i == 31) {
            dataOutput.writeInt(m16117H);
        }
        if (i2 == 255) {
            dataOutput.writeInt(m15925r);
        }
        if (i3 == 3) {
            dataOutput.writeInt(this.f21557D.m15925r());
        }
        if (i4 == 3) {
            dataOutput.writeInt(this.f21558E.m15925r());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8323e) {
            C8323e c8323e = (C8323e) obj;
            return this.f21559w == c8323e.f21559w && this.f21560x == c8323e.f21560x && this.f21561y == c8323e.f21561y && this.f21555B == c8323e.f21555B && this.f21554A == c8323e.f21554A && this.f21562z.equals(c8323e.f21562z) && this.f21556C.equals(c8323e.f21556C) && this.f21557D.equals(c8323e.f21557D) && this.f21558E.equals(c8323e.f21558E);
        }
        return false;
    }

    public int hashCode() {
        int m16117H = ((this.f21562z.m16117H() + this.f21554A) << 15) + (this.f21559w.ordinal() << 11) + ((this.f21560x + 32) << 5);
        EnumC8168a enumC8168a = this.f21561y;
        return ((((m16117H + ((enumC8168a == null ? 7 : enumC8168a.ordinal()) << 2)) + this.f21555B.ordinal()) ^ this.f21556C.hashCode()) ^ this.f21557D.hashCode()) ^ this.f21558E.hashCode();
    }

    public String toString() {
        long j;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TransitionRule[");
        sb2.append(this.f21557D.compareTo(this.f21558E) > 0 ? "Gap " : "Overlap ");
        sb2.append(this.f21557D);
        sb2.append(" to ");
        sb2.append(this.f21558E);
        sb2.append(", ");
        EnumC8168a enumC8168a = this.f21561y;
        if (enumC8168a != null) {
            byte b = this.f21560x;
            if (b == -1) {
                sb2.append(enumC8168a.name());
                sb2.append(" on or before last day of ");
                sb2.append(this.f21559w.name());
            } else if (b < 0) {
                sb2.append(enumC8168a.name());
                sb2.append(" on or before last day minus ");
                sb2.append((-this.f21560x) - 1);
                sb2.append(" of ");
                sb2.append(this.f21559w.name());
            } else {
                sb2.append(enumC8168a.name());
                sb2.append(" on or after ");
                sb2.append(this.f21559w.name());
                sb2.append(' ');
                sb2.append((int) this.f21560x);
            }
        } else {
            sb2.append(this.f21559w.name());
            sb2.append(' ');
            sb2.append((int) this.f21560x);
        }
        sb2.append(" at ");
        if (this.f21554A == 0) {
            sb2.append(this.f21562z);
        } else {
            m15789a(sb2, C11251d.m5627e((this.f21562z.m16117H() / 60) + (this.f21554A * 24 * 60), 60L));
            sb2.append(':');
            m15789a(sb2, C11251d.m5625g(j, 60));
        }
        sb2.append(" ");
        sb2.append(this.f21555B);
        sb2.append(", standard offset ");
        sb2.append(this.f21556C);
        sb2.append(']');
        return sb2.toString();
    }
}
