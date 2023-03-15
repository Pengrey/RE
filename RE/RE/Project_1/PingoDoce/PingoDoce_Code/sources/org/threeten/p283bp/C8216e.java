package org.threeten.p283bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import org.joda.time.DateTimeConstants;
import org.threeten.p283bp.chrono.AbstractC8178c;
import org.threeten.p283bp.temporal.C8305i;
import org.threeten.p283bp.temporal.C8315l;
import org.threeten.p283bp.temporal.EnumC8288a;
import org.threeten.p283bp.temporal.EnumC8289b;
import org.threeten.p283bp.temporal.InterfaceC8298d;
import org.threeten.p283bp.temporal.InterfaceC8299e;
import org.threeten.p283bp.temporal.InterfaceC8300f;
import org.threeten.p283bp.temporal.InterfaceC8304h;
import org.threeten.p283bp.temporal.InterfaceC8313j;
import org.threeten.p283bp.temporal.InterfaceC8314k;
import org.threeten.p283bp.temporal.UnsupportedTemporalTypeException;
import p387uf.AbstractC10876a;
import p405vf.C11251d;

/* renamed from: org.threeten.bp.e */
/* loaded from: classes2.dex */
public final class C8216e extends AbstractC8178c<C8213d> implements InterfaceC8298d {

    /* renamed from: y */
    public static final C8216e f21368y = m16151I(C8213d.f21362z, C8219f.f21373A);

    /* renamed from: z */
    public static final C8216e f21369z = m16151I(C8213d.f21361A, C8219f.f21374B);

    /* renamed from: w */
    private final C8213d f21370w;

    /* renamed from: x */
    private final C8219f f21371x;

    /* compiled from: LocalDateTime.java */
    /* renamed from: org.threeten.bp.e$a */
    /* loaded from: classes2.dex */
    class C8217a implements InterfaceC8313j<C8216e> {
        C8217a() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public C8216e mo16124b(InterfaceC8299e interfaceC8299e) {
            return C8216e.m16158A(interfaceC8299e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalDateTime.java */
    /* renamed from: org.threeten.bp.e$b */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C8218b {

        /* renamed from: a */
        static final /* synthetic */ int[] f21372a;

        static {
            int[] iArr = new int[EnumC8289b.values().length];
            f21372a = iArr;
            try {
                iArr[EnumC8289b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21372a[EnumC8289b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21372a[EnumC8289b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21372a[EnumC8289b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21372a[EnumC8289b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21372a[EnumC8289b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21372a[EnumC8289b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        new C8217a();
    }

    private C8216e(C8213d c8213d, C8219f c8219f) {
        this.f21370w = c8213d;
        this.f21371x = c8219f;
    }

    /* renamed from: A */
    public static C8216e m16158A(InterfaceC8299e interfaceC8299e) {
        if (interfaceC8299e instanceof C8216e) {
            return (C8216e) interfaceC8299e;
        }
        if (interfaceC8299e instanceof C8285q) {
            return ((C8285q) interfaceC8299e).mo15884o();
        }
        try {
            return new C8216e(C8213d.m16160z(interfaceC8299e), C8219f.m16106k(interfaceC8299e));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + interfaceC8299e + ", type " + interfaceC8299e.getClass().getName());
        }
    }

    /* renamed from: G */
    public static C8216e m16153G() {
        return m16152H(AbstractC10876a.m6798c());
    }

    /* renamed from: H */
    public static C8216e m16152H(AbstractC10876a abstractC10876a) {
        C11251d.m5623i(abstractC10876a, "clock");
        C8171c mo6796b = abstractC10876a.mo6796b();
        return m16150J(mo6796b.m16391k(), mo6796b.m16390l(), abstractC10876a.mo6797a().mo15914i().mo15784a(mo6796b));
    }

    /* renamed from: I */
    public static C8216e m16151I(C8213d c8213d, C8219f c8219f) {
        C11251d.m5623i(c8213d, "date");
        C11251d.m5623i(c8219f, "time");
        return new C8216e(c8213d, c8219f);
    }

    /* renamed from: J */
    public static C8216e m16150J(long j, int i, C8282o c8282o) {
        C11251d.m5623i(c8282o, "offset");
        long m15925r = j + c8282o.m15925r();
        return new C8216e(C8213d.m16191Q(C11251d.m5627e(m15925r, 86400L)), C8219f.m16095x(C11251d.m5625g(m15925r, DateTimeConstants.SECONDS_PER_DAY), i));
    }

    /* renamed from: Q */
    private C8216e m16143Q(C8213d c8213d, long j, long j2, long j3, long j4, int i) {
        if ((j | j2 | j3 | j4) == 0) {
            return m16140T(c8213d, this.f21371x);
        }
        long j5 = i;
        long m16118G = this.f21371x.m16118G();
        long j6 = (((j4 % 86400000000000L) + ((j3 % 86400) * 1000000000) + ((j2 % 1440) * 60000000000L) + ((j % 24) * 3600000000000L)) * j5) + m16118G;
        long m5627e = (((j4 / 86400000000000L) + (j3 / 86400) + (j2 / 1440) + (j / 24)) * j5) + C11251d.m5627e(j6, 86400000000000L);
        long m5624h = C11251d.m5624h(j6, 86400000000000L);
        return m16140T(c8213d.m16188T(m5627e), m5624h == m16118G ? this.f21371x : C8219f.m16097u(m5624h));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public static C8216e m16142R(DataInput dataInput) throws IOException {
        return m16151I(C8213d.m16184X(dataInput), C8219f.m16119F(dataInput));
    }

    /* renamed from: T */
    private C8216e m16140T(C8213d c8213d, C8219f c8219f) {
        return (this.f21370w == c8213d && this.f21371x == c8219f) ? this : new C8216e(c8213d, c8219f);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C8273k((byte) 4, this);
    }

    /* renamed from: z */
    private int m16125z(C8216e c8216e) {
        int m16163u = this.f21370w.m16163u(c8216e.mo16141S());
        return m16163u == 0 ? this.f21371x.compareTo(c8216e.mo16130r()) : m16163u;
    }

    /* renamed from: B */
    public int m16157B() {
        return this.f21371x.m16103n();
    }

    /* renamed from: C */
    public int m16156C() {
        return this.f21371x.m16102o();
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8178c
    /* renamed from: D */
    public C8216e mo42217m(long j, InterfaceC8314k interfaceC8314k) {
        return j == Long.MIN_VALUE ? mo16149K(Long.MAX_VALUE, interfaceC8314k).mo16149K(1L, interfaceC8314k) : mo16149K(-j, interfaceC8314k);
    }

    /* renamed from: F */
    public C8216e m16154F(long j) {
        return m16143Q(this.f21370w, 0L, 0L, j, 0L, -1);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8178c
    /* renamed from: K */
    public C8216e mo42218n(long j, InterfaceC8314k interfaceC8314k) {
        if (interfaceC8314k instanceof EnumC8289b) {
            switch (C8218b.f21372a[((EnumC8289b) interfaceC8314k).ordinal()]) {
                case 1:
                    return m16145O(j);
                case 2:
                    return m16148L(j / 86400000000L).m16145O((j % 86400000000L) * 1000);
                case 3:
                    return m16148L(j / 86400000).m16145O((j % 86400000) * 1000000);
                case 4:
                    return m16144P(j);
                case 5:
                    return m16146N(j);
                case 6:
                    return m16147M(j);
                case 7:
                    return m16148L(j / 256).m16147M((j % 256) * 12);
                default:
                    return m16140T(this.f21370w.mo16168o(j, interfaceC8314k), this.f21371x);
            }
        }
        return (C8216e) interfaceC8314k.addTo(this, j);
    }

    /* renamed from: L */
    public C8216e m16148L(long j) {
        return m16140T(this.f21370w.m16188T(j), this.f21371x);
    }

    /* renamed from: M */
    public C8216e m16147M(long j) {
        return m16143Q(this.f21370w, j, 0L, 0L, 0L, 1);
    }

    /* renamed from: N */
    public C8216e m16146N(long j) {
        return m16143Q(this.f21370w, 0L, j, 0L, 0L, 1);
    }

    /* renamed from: O */
    public C8216e m16145O(long j) {
        return m16143Q(this.f21370w, 0L, 0L, 0L, j, 1);
    }

    /* renamed from: P */
    public C8216e m16144P(long j) {
        return m16143Q(this.f21370w, 0L, 0L, j, 0L, 1);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8178c
    /* renamed from: S */
    public C8213d mo42219q() {
        return this.f21370w;
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8178c
    /* renamed from: U */
    public C8216e mo42220s(InterfaceC8300f interfaceC8300f) {
        if (interfaceC8300f instanceof C8213d) {
            return m16140T((C8213d) interfaceC8300f, this.f21371x);
        }
        if (interfaceC8300f instanceof C8219f) {
            return m16140T(this.f21370w, (C8219f) interfaceC8300f);
        }
        if (interfaceC8300f instanceof C8216e) {
            return (C8216e) interfaceC8300f;
        }
        return (C8216e) interfaceC8300f.adjustInto(this);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8178c
    /* renamed from: V */
    public C8216e mo42221u(InterfaceC8304h interfaceC8304h, long j) {
        if (interfaceC8304h instanceof EnumC8288a) {
            if (interfaceC8304h.isTimeBased()) {
                return m16140T(this.f21370w, this.f21371x.mo15874c(interfaceC8304h, j));
            }
            return m16140T(this.f21370w.mo16165r(interfaceC8304h, j), this.f21371x);
        }
        return (C8216e) interfaceC8304h.adjustInto(this, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public void m16137W(DataOutput dataOutput) throws IOException {
        this.f21370w.m16176f0(dataOutput);
        this.f21371x.m16110O(dataOutput);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8178c, org.threeten.p283bp.temporal.InterfaceC8300f
    public InterfaceC8298d adjustInto(InterfaceC8298d interfaceC8298d) {
        return super.adjustInto(interfaceC8298d);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8178c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8216e) {
            C8216e c8216e = (C8216e) obj;
            return this.f21370w.equals(c8216e.f21370w) && this.f21371x.equals(c8216e.f21371x);
        }
        return false;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: f */
    public long mo15872f(InterfaceC8298d interfaceC8298d, InterfaceC8314k interfaceC8314k) {
        C8216e m16158A = m16158A(interfaceC8298d);
        if (interfaceC8314k instanceof EnumC8289b) {
            EnumC8289b enumC8289b = (EnumC8289b) interfaceC8314k;
            if (enumC8289b.isTimeBased()) {
                long m16161x = this.f21370w.m16161x(m16158A.f21370w);
                long m16118G = m16158A.f21371x.m16118G() - this.f21371x.m16118G();
                int i = (m16161x > 0L ? 1 : (m16161x == 0L ? 0 : -1));
                if (i > 0 && m16118G < 0) {
                    m16161x--;
                    m16118G += 86400000000000L;
                } else if (i < 0 && m16118G > 0) {
                    m16161x++;
                    m16118G -= 86400000000000L;
                }
                switch (C8218b.f21372a[enumC8289b.ordinal()]) {
                    case 1:
                        return C11251d.m5621k(C11251d.m5619m(m16161x, 86400000000000L), m16118G);
                    case 2:
                        return C11251d.m5621k(C11251d.m5619m(m16161x, 86400000000L), m16118G / 1000);
                    case 3:
                        return C11251d.m5621k(C11251d.m5619m(m16161x, 86400000L), m16118G / 1000000);
                    case 4:
                        return C11251d.m5621k(C11251d.m5620l(m16161x, DateTimeConstants.SECONDS_PER_DAY), m16118G / 1000000000);
                    case 5:
                        return C11251d.m5621k(C11251d.m5620l(m16161x, DateTimeConstants.MINUTES_PER_DAY), m16118G / 60000000000L);
                    case 6:
                        return C11251d.m5621k(C11251d.m5620l(m16161x, 24), m16118G / 3600000000000L);
                    case 7:
                        return C11251d.m5621k(C11251d.m5620l(m16161x, 2), m16118G / 43200000000000L);
                    default:
                        throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8314k);
                }
            }
            C8213d c8213d = m16158A.f21370w;
            if (c8213d.mo16171l(this.f21370w) && m16158A.f21371x.m16100q(this.f21371x)) {
                c8213d = c8213d.m16196L(1L);
            } else if (c8213d.mo16170m(this.f21370w) && m16158A.f21371x.m16101p(this.f21371x)) {
                c8213d = c8213d.m16188T(1L);
            }
            return this.f21370w.mo15872f(c8213d, interfaceC8314k);
        }
        return interfaceC8314k.between(this, m16158A);
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public int get(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            return interfaceC8304h.isTimeBased() ? this.f21371x.get(interfaceC8304h) : this.f21370w.get(interfaceC8304h);
        }
        return super.get(interfaceC8304h);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public long getLong(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            return interfaceC8304h.isTimeBased() ? this.f21371x.getLong(interfaceC8304h) : this.f21370w.getLong(interfaceC8304h);
        }
        return interfaceC8304h.getFrom(this);
    }

    public int getYear() {
        return this.f21370w.getYear();
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8178c
    public int hashCode() {
        return this.f21370w.hashCode() ^ this.f21371x.hashCode();
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8178c
    /* renamed from: i */
    public int mo16376i(AbstractC8178c<?> abstractC8178c) {
        if (abstractC8178c instanceof C8216e) {
            return m16125z((C8216e) abstractC8178c);
        }
        return super.mo16376i(abstractC8178c);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public boolean isSupported(InterfaceC8304h interfaceC8304h) {
        return interfaceC8304h instanceof EnumC8288a ? interfaceC8304h.isDateBased() || interfaceC8304h.isTimeBased() : interfaceC8304h != null && interfaceC8304h.isSupportedBy(this);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8178c
    /* renamed from: k */
    public boolean mo16135k(AbstractC8178c<?> abstractC8178c) {
        if (abstractC8178c instanceof C8216e) {
            return m16125z((C8216e) abstractC8178c) > 0;
        }
        return super.mo16135k(abstractC8178c);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8178c
    /* renamed from: l */
    public boolean mo16134l(AbstractC8178c<?> abstractC8178c) {
        if (abstractC8178c instanceof C8216e) {
            return m16125z((C8216e) abstractC8178c) < 0;
        }
        return super.mo16134l(abstractC8178c);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8178c, p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public <R> R query(InterfaceC8313j<R> interfaceC8313j) {
        if (interfaceC8313j == C8305i.m15868b()) {
            return (R) mo16141S();
        }
        return (R) super.query(interfaceC8313j);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8178c
    /* renamed from: r */
    public C8219f mo16130r() {
        return this.f21371x;
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public C8315l range(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            return interfaceC8304h.isTimeBased() ? this.f21371x.range(interfaceC8304h) : this.f21370w.range(interfaceC8304h);
        }
        return interfaceC8304h.rangeRefinedBy(this);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8178c
    public String toString() {
        return this.f21370w.toString() + 'T' + this.f21371x.toString();
    }

    /* renamed from: w */
    public C8266i m16127w(C8282o c8282o) {
        return C8266i.m15991m(this, c8282o);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8178c
    /* renamed from: x */
    public C8285q mo16126x(AbstractC8280n abstractC8280n) {
        return C8285q.m15907B(this, abstractC8280n);
    }
}
