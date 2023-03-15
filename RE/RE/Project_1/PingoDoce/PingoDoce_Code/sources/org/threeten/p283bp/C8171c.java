package org.threeten.p283bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.joda.time.DateTimeConstants;
import org.threeten.p283bp.format.C8223b;
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
import p405vf.AbstractC11250c;
import p405vf.C11251d;

/* renamed from: org.threeten.bp.c */
/* loaded from: classes2.dex */
public final class C8171c extends AbstractC11250c implements InterfaceC8298d, InterfaceC8300f, Comparable<C8171c>, Serializable {

    /* renamed from: y */
    public static final C8171c f21276y = new C8171c(0, 0);

    /* renamed from: w */
    private final long f21277w;

    /* renamed from: x */
    private final int f21278x;

    /* compiled from: Instant.java */
    /* renamed from: org.threeten.bp.c$a */
    /* loaded from: classes2.dex */
    class C8172a implements InterfaceC8313j<C8171c> {
        C8172a() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public C8171c mo16124b(InterfaceC8299e interfaceC8299e) {
            return C8171c.m16392j(interfaceC8299e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Instant.java */
    /* renamed from: org.threeten.bp.c$b */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C8173b {

        /* renamed from: a */
        static final /* synthetic */ int[] f21279a;

        /* renamed from: b */
        static final /* synthetic */ int[] f21280b;

        static {
            int[] iArr = new int[EnumC8289b.values().length];
            f21280b = iArr;
            try {
                iArr[EnumC8289b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21280b[EnumC8289b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21280b[EnumC8289b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21280b[EnumC8289b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21280b[EnumC8289b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21280b[EnumC8289b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21280b[EnumC8289b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21280b[EnumC8289b.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[EnumC8288a.values().length];
            f21279a = iArr2;
            try {
                iArr2[EnumC8288a.NANO_OF_SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21279a[EnumC8288a.MICRO_OF_SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21279a[EnumC8288a.MILLI_OF_SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21279a[EnumC8288a.INSTANT_SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        m16385q(-31557014167219200L, 0L);
        m16385q(31556889864403199L, 999999999L);
        new C8172a();
    }

    private C8171c(long j, int i) {
        this.f21277w = j;
        this.f21278x = i;
    }

    /* renamed from: A */
    private long m16399A(C8171c c8171c) {
        long m5617o = C11251d.m5617o(c8171c.f21277w, this.f21277w);
        long j = c8171c.f21278x - this.f21278x;
        int i = (m5617o > 0L ? 1 : (m5617o == 0L ? 0 : -1));
        return (i <= 0 || j >= 0) ? (i >= 0 || j <= 0) ? m5617o : m5617o + 1 : m5617o - 1;
    }

    /* renamed from: i */
    private static C8171c m16393i(long j, int i) {
        if ((i | j) == 0) {
            return f21276y;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new C8171c(j, i);
        }
        throw new DateTimeException("Instant exceeds minimum or maximum instant");
    }

    /* renamed from: j */
    public static C8171c m16392j(InterfaceC8299e interfaceC8299e) {
        try {
            return m16385q(interfaceC8299e.getLong(EnumC8288a.INSTANT_SECONDS), interfaceC8299e.get(EnumC8288a.NANO_OF_SECOND));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + interfaceC8299e + ", type " + interfaceC8299e.getClass().getName(), e);
        }
    }

    /* renamed from: n */
    private long m16388n(C8171c c8171c) {
        return C11251d.m5621k(C11251d.m5620l(C11251d.m5617o(c8171c.f21277w, this.f21277w), 1000000000), c8171c.f21278x - this.f21278x);
    }

    /* renamed from: o */
    public static C8171c m16387o(long j) {
        return m16393i(C11251d.m5627e(j, 1000L), C11251d.m5625g(j, DateTimeConstants.MILLIS_PER_SECOND) * 1000000);
    }

    /* renamed from: p */
    public static C8171c m16386p(long j) {
        return m16393i(j, 0);
    }

    /* renamed from: q */
    public static C8171c m16385q(long j, long j2) {
        return m16393i(C11251d.m5621k(j, C11251d.m5627e(j2, 1000000000L)), C11251d.m5625g(j2, 1000000000));
    }

    /* renamed from: r */
    private C8171c m16384r(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return m16385q(C11251d.m5621k(C11251d.m5621k(this.f21277w, j), j2 / 1000000000), this.f21278x + (j2 % 1000000000));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C8273k((byte) 2, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static C8171c m16379z(DataInput dataInput) throws IOException {
        return m16385q(dataInput.readLong(), dataInput.readInt());
    }

    /* renamed from: B */
    public long m16398B() {
        long j = this.f21277w;
        if (j >= 0) {
            return C11251d.m5621k(C11251d.m5619m(j, 1000L), this.f21278x / 1000000);
        }
        return C11251d.m5617o(C11251d.m5619m(j + 1, 1000L), 1000 - (this.f21278x / 1000000));
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: C */
    public C8171c mo5633b(InterfaceC8300f interfaceC8300f) {
        return (C8171c) interfaceC8300f.adjustInto(this);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: D */
    public C8171c mo15874c(InterfaceC8304h interfaceC8304h, long j) {
        if (interfaceC8304h instanceof EnumC8288a) {
            EnumC8288a enumC8288a = (EnumC8288a) interfaceC8304h;
            enumC8288a.checkValidValue(j);
            int i = C8173b.f21279a[enumC8288a.ordinal()];
            if (i == 1) {
                return j != ((long) this.f21278x) ? m16393i(this.f21277w, (int) j) : this;
            } else if (i == 2) {
                int i2 = ((int) j) * DateTimeConstants.MILLIS_PER_SECOND;
                return i2 != this.f21278x ? m16393i(this.f21277w, i2) : this;
            } else if (i == 3) {
                int i3 = ((int) j) * 1000000;
                return i3 != this.f21278x ? m16393i(this.f21277w, i3) : this;
            } else if (i == 4) {
                return j != this.f21277w ? m16393i(j, this.f21278x) : this;
            } else {
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
            }
        }
        return (C8171c) interfaceC8304h.adjustInto(this, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public void m16395F(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.f21277w);
        dataOutput.writeInt(this.f21278x);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8300f
    public InterfaceC8298d adjustInto(InterfaceC8298d interfaceC8298d) {
        return interfaceC8298d.mo15874c(EnumC8288a.INSTANT_SECONDS, this.f21277w).mo15874c(EnumC8288a.NANO_OF_SECOND, this.f21278x);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8171c) {
            C8171c c8171c = (C8171c) obj;
            return this.f21277w == c8171c.f21277w && this.f21278x == c8171c.f21278x;
        }
        return false;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: f */
    public long mo15872f(InterfaceC8298d interfaceC8298d, InterfaceC8314k interfaceC8314k) {
        C8171c m16392j = m16392j(interfaceC8298d);
        if (interfaceC8314k instanceof EnumC8289b) {
            switch (C8173b.f21280b[((EnumC8289b) interfaceC8314k).ordinal()]) {
                case 1:
                    return m16388n(m16392j);
                case 2:
                    return m16388n(m16392j) / 1000;
                case 3:
                    return C11251d.m5617o(m16392j.m16398B(), m16398B());
                case 4:
                    return m16399A(m16392j);
                case 5:
                    return m16399A(m16392j) / 60;
                case 6:
                    return m16399A(m16392j) / 3600;
                case 7:
                    return m16399A(m16392j) / 43200;
                case 8:
                    return m16399A(m16392j) / 86400;
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8314k);
            }
        }
        return interfaceC8314k.between(this, m16392j);
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(C8171c c8171c) {
        int m5630b = C11251d.m5630b(this.f21277w, c8171c.f21277w);
        return m5630b != 0 ? m5630b : this.f21278x - c8171c.f21278x;
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public int get(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            int i = C8173b.f21279a[((EnumC8288a) interfaceC8304h).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return this.f21278x / 1000000;
                    }
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
                }
                return this.f21278x / DateTimeConstants.MILLIS_PER_SECOND;
            }
            return this.f21278x;
        }
        return range(interfaceC8304h).m15854a(interfaceC8304h.getFrom(this), interfaceC8304h);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public long getLong(InterfaceC8304h interfaceC8304h) {
        int i;
        if (interfaceC8304h instanceof EnumC8288a) {
            int i2 = C8173b.f21279a[((EnumC8288a) interfaceC8304h).ordinal()];
            if (i2 == 1) {
                i = this.f21278x;
            } else if (i2 == 2) {
                i = this.f21278x / DateTimeConstants.MILLIS_PER_SECOND;
            } else if (i2 != 3) {
                if (i2 == 4) {
                    return this.f21277w;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
            } else {
                i = this.f21278x / 1000000;
            }
            return i;
        }
        return interfaceC8304h.getFrom(this);
    }

    public int hashCode() {
        long j = this.f21277w;
        return ((int) (j ^ (j >>> 32))) + (this.f21278x * 51);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public boolean isSupported(InterfaceC8304h interfaceC8304h) {
        return interfaceC8304h instanceof EnumC8288a ? interfaceC8304h == EnumC8288a.INSTANT_SECONDS || interfaceC8304h == EnumC8288a.NANO_OF_SECOND || interfaceC8304h == EnumC8288a.MICRO_OF_SECOND || interfaceC8304h == EnumC8288a.MILLI_OF_SECOND : interfaceC8304h != null && interfaceC8304h.isSupportedBy(this);
    }

    /* renamed from: k */
    public long m16391k() {
        return this.f21277w;
    }

    /* renamed from: l */
    public int m16390l() {
        return this.f21278x;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: m */
    public C8171c mo5632d(long j, InterfaceC8314k interfaceC8314k) {
        return j == Long.MIN_VALUE ? mo15873e(Long.MAX_VALUE, interfaceC8314k).mo15873e(1L, interfaceC8314k) : mo15873e(-j, interfaceC8314k);
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public <R> R query(InterfaceC8313j<R> interfaceC8313j) {
        if (interfaceC8313j == C8305i.m15865e()) {
            return (R) EnumC8289b.NANOS;
        }
        if (interfaceC8313j == C8305i.m15868b() || interfaceC8313j == C8305i.m15867c() || interfaceC8313j == C8305i.m15869a() || interfaceC8313j == C8305i.m15863g() || interfaceC8313j == C8305i.m15864f() || interfaceC8313j == C8305i.m15866d()) {
            return null;
        }
        return interfaceC8313j.mo16124b(this);
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public C8315l range(InterfaceC8304h interfaceC8304h) {
        return super.range(interfaceC8304h);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: s */
    public C8171c mo15873e(long j, InterfaceC8314k interfaceC8314k) {
        if (interfaceC8314k instanceof EnumC8289b) {
            switch (C8173b.f21280b[((EnumC8289b) interfaceC8314k).ordinal()]) {
                case 1:
                    return m16381w(j);
                case 2:
                    return m16384r(j / 1000000, (j % 1000000) * 1000);
                case 3:
                    return m16382u(j);
                case 4:
                    return m16380x(j);
                case 5:
                    return m16380x(C11251d.m5620l(j, 60));
                case 6:
                    return m16380x(C11251d.m5620l(j, DateTimeConstants.SECONDS_PER_HOUR));
                case 7:
                    return m16380x(C11251d.m5620l(j, 43200));
                case 8:
                    return m16380x(C11251d.m5620l(j, DateTimeConstants.SECONDS_PER_DAY));
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8314k);
            }
        }
        return (C8171c) interfaceC8314k.addTo(this, j);
    }

    public String toString() {
        return C8223b.f21393l.m16091a(this);
    }

    /* renamed from: u */
    public C8171c m16382u(long j) {
        return m16384r(j / 1000, (j % 1000) * 1000000);
    }

    /* renamed from: w */
    public C8171c m16381w(long j) {
        return m16384r(0L, j);
    }

    /* renamed from: x */
    public C8171c m16380x(long j) {
        return m16384r(j, 0L);
    }
}
