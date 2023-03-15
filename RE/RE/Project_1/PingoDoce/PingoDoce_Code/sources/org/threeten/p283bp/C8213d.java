package org.threeten.p283bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.joda.time.DateTimeConstants;
import org.threeten.p283bp.chrono.AbstractC8176b;
import org.threeten.p283bp.chrono.C8195m;
import org.threeten.p283bp.chrono.InterfaceC8190i;
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
import p405vf.C11251d;

/* renamed from: org.threeten.bp.d */
/* loaded from: classes2.dex */
public final class C8213d extends AbstractC8176b implements Serializable {

    /* renamed from: w */
    private final int f21363w;

    /* renamed from: x */
    private final short f21364x;

    /* renamed from: y */
    private final short f21365y;

    /* renamed from: z */
    public static final C8213d f21362z = m16193O(-999999999, 1, 1);

    /* renamed from: A */
    public static final C8213d f21361A = m16193O(999999999, 12, 31);

    /* compiled from: LocalDate.java */
    /* renamed from: org.threeten.bp.d$a */
    /* loaded from: classes2.dex */
    class C8214a implements InterfaceC8313j<C8213d> {
        C8214a() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public C8213d mo16124b(InterfaceC8299e interfaceC8299e) {
            return C8213d.m16160z(interfaceC8299e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalDate.java */
    /* renamed from: org.threeten.bp.d$b */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C8215b {

        /* renamed from: a */
        static final /* synthetic */ int[] f21366a;

        /* renamed from: b */
        static final /* synthetic */ int[] f21367b;

        static {
            int[] iArr = new int[EnumC8289b.values().length];
            f21367b = iArr;
            try {
                iArr[EnumC8289b.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21367b[EnumC8289b.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21367b[EnumC8289b.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21367b[EnumC8289b.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21367b[EnumC8289b.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21367b[EnumC8289b.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21367b[EnumC8289b.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21367b[EnumC8289b.ERAS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[EnumC8288a.values().length];
            f21366a = iArr2;
            try {
                iArr2[EnumC8288a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21366a[EnumC8288a.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21366a[EnumC8288a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21366a[EnumC8288a.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21366a[EnumC8288a.DAY_OF_WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21366a[EnumC8288a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21366a[EnumC8288a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21366a[EnumC8288a.EPOCH_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21366a[EnumC8288a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f21366a[EnumC8288a.MONTH_OF_YEAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f21366a[EnumC8288a.PROLEPTIC_MONTH.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f21366a[EnumC8288a.YEAR.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f21366a[EnumC8288a.ERA.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    static {
        new C8214a();
    }

    private C8213d(int i, int i2, int i3) {
        this.f21363w = i;
        this.f21364x = (short) i2;
        this.f21365y = (short) i3;
    }

    /* renamed from: A */
    private int m16206A(InterfaceC8304h interfaceC8304h) {
        switch (C8215b.f21366a[((EnumC8288a) interfaceC8304h).ordinal()]) {
            case 1:
                return this.f21365y;
            case 2:
                return getDayOfYear();
            case 3:
                return ((this.f21365y - 1) / 7) + 1;
            case 4:
                int i = this.f21363w;
                return i >= 1 ? i : 1 - i;
            case 5:
                return m16204C().getValue();
            case 6:
                return ((this.f21365y - 1) % 7) + 1;
            case 7:
                return ((getDayOfYear() - 1) % 7) + 1;
            case 8:
                throw new DateTimeException("Field too large for an int: " + interfaceC8304h);
            case 9:
                return ((getDayOfYear() - 1) / 7) + 1;
            case 10:
                return this.f21364x;
            case 11:
                throw new DateTimeException("Field too large for an int: " + interfaceC8304h);
            case 12:
                return this.f21363w;
            case 13:
                return this.f21363w >= 1 ? 1 : 0;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
        }
    }

    /* renamed from: G */
    private long m16201G() {
        return (this.f21363w * 12) + (this.f21364x - 1);
    }

    /* renamed from: N */
    private long m16194N(C8213d c8213d) {
        return (((c8213d.m16201G() * 32) + c8213d.getDayOfMonth()) - ((m16201G() * 32) + getDayOfMonth())) / 32;
    }

    /* renamed from: O */
    public static C8213d m16193O(int i, int i2, int i3) {
        EnumC8288a.YEAR.checkValidValue(i);
        EnumC8288a.MONTH_OF_YEAR.checkValidValue(i2);
        EnumC8288a.DAY_OF_MONTH.checkValidValue(i3);
        return m16162w(i, EnumC8260g.m16008of(i2), i3);
    }

    /* renamed from: P */
    public static C8213d m16192P(int i, EnumC8260g enumC8260g, int i2) {
        EnumC8288a.YEAR.checkValidValue(i);
        C11251d.m5623i(enumC8260g, "month");
        EnumC8288a.DAY_OF_MONTH.checkValidValue(i2);
        return m16162w(i, enumC8260g, i2);
    }

    /* renamed from: Q */
    public static C8213d m16191Q(long j) {
        long j2;
        EnumC8288a.EPOCH_DAY.checkValidValue(j);
        long j3 = (j + 719528) - 60;
        if (j3 < 0) {
            long j4 = ((j3 + 1) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((((j5 * 365) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((((365 * j5) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new C8213d(EnumC8288a.YEAR.checkValidIntValue(j5 + j2 + (i2 / 10)), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    /* renamed from: R */
    public static C8213d m16190R(int i, int i2) {
        long j = i;
        EnumC8288a.YEAR.checkValidValue(j);
        EnumC8288a.DAY_OF_YEAR.checkValidValue(i2);
        boolean m16291u = C8195m.f21328y.m16291u(j);
        if (i2 == 366 && !m16291u) {
            throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        EnumC8260g m16008of = EnumC8260g.m16008of(((i2 - 1) / 31) + 1);
        if (i2 > (m16008of.firstDayOfYear(m16291u) + m16008of.length(m16291u)) - 1) {
            m16008of = m16008of.plus(1L);
        }
        return m16162w(i, m16008of, (i2 - m16008of.firstDayOfYear(m16291u)) + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public static C8213d m16184X(DataInput dataInput) throws IOException {
        return m16193O(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    /* renamed from: Y */
    private static C8213d m16183Y(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, C8195m.f21328y.m16291u((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return m16193O(i, i2, i3);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: w */
    private static C8213d m16162w(int i, EnumC8260g enumC8260g, int i2) {
        if (i2 <= 28 || i2 <= enumC8260g.length(C8195m.f21328y.m16291u(i))) {
            return new C8213d(i, enumC8260g.getValue(), i2);
        }
        if (i2 == 29) {
            throw new DateTimeException("Invalid date 'February 29' as '" + i + "' is not a leap year");
        }
        throw new DateTimeException("Invalid date '" + enumC8260g.name() + " " + i2 + "'");
    }

    private Object writeReplace() {
        return new C8273k((byte) 3, this);
    }

    /* renamed from: z */
    public static C8213d m16160z(InterfaceC8299e interfaceC8299e) {
        C8213d c8213d = (C8213d) interfaceC8299e.query(C8305i.m15868b());
        if (c8213d != null) {
            return c8213d;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + interfaceC8299e + ", type " + interfaceC8299e.getClass().getName());
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: B */
    public C8195m mo16173j() {
        return C8195m.f21328y;
    }

    /* renamed from: C */
    public EnumC8168a m16204C() {
        return EnumC8168a.m16409of(C11251d.m5625g(mo16167p() + 3, 7) + 1);
    }

    /* renamed from: D */
    public EnumC8260g m16203D() {
        return EnumC8260g.m16008of(this.f21364x);
    }

    /* renamed from: F */
    public int m16202F() {
        return this.f21364x;
    }

    /* renamed from: H */
    public boolean m16200H() {
        return C8195m.f21328y.m16291u(this.f21363w);
    }

    /* renamed from: I */
    public int m16199I() {
        short s = this.f21364x;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : m16200H() ? 29 : 28;
    }

    /* renamed from: J */
    public int m16198J() {
        return m16200H() ? 366 : 365;
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: K */
    public C8213d mo16169n(long j, InterfaceC8314k interfaceC8314k) {
        return j == Long.MIN_VALUE ? mo16168o(Long.MAX_VALUE, interfaceC8314k).mo16168o(1L, interfaceC8314k) : mo16168o(-j, interfaceC8314k);
    }

    /* renamed from: L */
    public C8213d m16196L(long j) {
        return j == Long.MIN_VALUE ? m16188T(Long.MAX_VALUE).m16188T(1L) : m16188T(-j);
    }

    /* renamed from: M */
    public C8213d m16195M(long j) {
        return j == Long.MIN_VALUE ? m16185W(Long.MAX_VALUE).m16185W(1L) : m16185W(-j);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: S */
    public C8213d mo16168o(long j, InterfaceC8314k interfaceC8314k) {
        if (interfaceC8314k instanceof EnumC8289b) {
            switch (C8215b.f21367b[((EnumC8289b) interfaceC8314k).ordinal()]) {
                case 1:
                    return m16188T(j);
                case 2:
                    return m16186V(j);
                case 3:
                    return m16187U(j);
                case 4:
                    return m16185W(j);
                case 5:
                    return m16185W(C11251d.m5620l(j, 10));
                case 6:
                    return m16185W(C11251d.m5620l(j, 100));
                case 7:
                    return m16185W(C11251d.m5620l(j, DateTimeConstants.MILLIS_PER_SECOND));
                case 8:
                    EnumC8288a enumC8288a = EnumC8288a.ERA;
                    return mo16165r(enumC8288a, C11251d.m5621k(getLong(enumC8288a), j));
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8314k);
            }
        }
        return (C8213d) interfaceC8314k.addTo(this, j);
    }

    /* renamed from: T */
    public C8213d m16188T(long j) {
        return j == 0 ? this : m16191Q(C11251d.m5621k(mo16167p(), j));
    }

    /* renamed from: U */
    public C8213d m16187U(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.f21363w * 12) + (this.f21364x - 1) + j;
        return m16183Y(EnumC8288a.YEAR.checkValidIntValue(C11251d.m5627e(j2, 12L)), C11251d.m5625g(j2, 12) + 1, this.f21365y);
    }

    /* renamed from: V */
    public C8213d m16186V(long j) {
        return m16188T(C11251d.m5620l(j, 7));
    }

    /* renamed from: W */
    public C8213d m16185W(long j) {
        return j == 0 ? this : m16183Y(EnumC8288a.YEAR.checkValidIntValue(this.f21363w + j), this.f21364x, this.f21365y);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: Z */
    public C8213d mo16166q(InterfaceC8300f interfaceC8300f) {
        if (interfaceC8300f instanceof C8213d) {
            return (C8213d) interfaceC8300f;
        }
        return (C8213d) interfaceC8300f.adjustInto(this);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: a0 */
    public C8213d mo16165r(InterfaceC8304h interfaceC8304h, long j) {
        if (interfaceC8304h instanceof EnumC8288a) {
            EnumC8288a enumC8288a = (EnumC8288a) interfaceC8304h;
            enumC8288a.checkValidValue(j);
            switch (C8215b.f21366a[enumC8288a.ordinal()]) {
                case 1:
                    return m16180b0((int) j);
                case 2:
                    return m16179c0((int) j);
                case 3:
                    return m16186V(j - getLong(EnumC8288a.ALIGNED_WEEK_OF_MONTH));
                case 4:
                    if (this.f21363w < 1) {
                        j = 1 - j;
                    }
                    return m16177e0((int) j);
                case 5:
                    return m16188T(j - m16204C().getValue());
                case 6:
                    return m16188T(j - getLong(EnumC8288a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 7:
                    return m16188T(j - getLong(EnumC8288a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 8:
                    return m16191Q(j);
                case 9:
                    return m16186V(j - getLong(EnumC8288a.ALIGNED_WEEK_OF_YEAR));
                case 10:
                    return m16178d0((int) j);
                case 11:
                    return m16187U(j - getLong(EnumC8288a.PROLEPTIC_MONTH));
                case 12:
                    return m16177e0((int) j);
                case 13:
                    return getLong(EnumC8288a.ERA) == j ? this : m16177e0(1 - this.f21363w);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
            }
        }
        return (C8213d) interfaceC8304h.adjustInto(this, j);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b, org.threeten.p283bp.temporal.InterfaceC8300f
    public InterfaceC8298d adjustInto(InterfaceC8298d interfaceC8298d) {
        return super.adjustInto(interfaceC8298d);
    }

    /* renamed from: b0 */
    public C8213d m16180b0(int i) {
        return this.f21365y == i ? this : m16193O(this.f21363w, this.f21364x, i);
    }

    /* renamed from: c0 */
    public C8213d m16179c0(int i) {
        return getDayOfYear() == i ? this : m16190R(this.f21363w, i);
    }

    /* renamed from: d0 */
    public C8213d m16178d0(int i) {
        if (this.f21364x == i) {
            return this;
        }
        EnumC8288a.MONTH_OF_YEAR.checkValidValue(i);
        return m16183Y(this.f21363w, i, this.f21365y);
    }

    /* renamed from: e0 */
    public C8213d m16177e0(int i) {
        if (this.f21363w == i) {
            return this;
        }
        EnumC8288a.YEAR.checkValidValue(i);
        return m16183Y(i, this.f21364x, this.f21365y);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8213d) && m16163u((C8213d) obj) == 0;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: f */
    public long mo15872f(InterfaceC8298d interfaceC8298d, InterfaceC8314k interfaceC8314k) {
        C8213d m16160z = m16160z(interfaceC8298d);
        if (interfaceC8314k instanceof EnumC8289b) {
            switch (C8215b.f21367b[((EnumC8289b) interfaceC8314k).ordinal()]) {
                case 1:
                    return m16161x(m16160z);
                case 2:
                    return m16161x(m16160z) / 7;
                case 3:
                    return m16194N(m16160z);
                case 4:
                    return m16194N(m16160z) / 12;
                case 5:
                    return m16194N(m16160z) / 120;
                case 6:
                    return m16194N(m16160z) / 1200;
                case 7:
                    return m16194N(m16160z) / 12000;
                case 8:
                    EnumC8288a enumC8288a = EnumC8288a.ERA;
                    return m16160z.getLong(enumC8288a) - getLong(enumC8288a);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8314k);
            }
        }
        return interfaceC8314k.between(this, m16160z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void m16176f0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f21363w);
        dataOutput.writeByte(this.f21364x);
        dataOutput.writeByte(this.f21365y);
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public int get(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            return m16206A(interfaceC8304h);
        }
        return super.get(interfaceC8304h);
    }

    public int getDayOfMonth() {
        return this.f21365y;
    }

    public int getDayOfYear() {
        return (m16203D().firstDayOfYear(m16200H()) + this.f21365y) - 1;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public long getLong(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            if (interfaceC8304h == EnumC8288a.EPOCH_DAY) {
                return mo16167p();
            }
            if (interfaceC8304h == EnumC8288a.PROLEPTIC_MONTH) {
                return m16201G();
            }
            return m16206A(interfaceC8304h);
        }
        return interfaceC8304h.getFrom(this);
    }

    public int getYear() {
        return this.f21363w;
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    public int hashCode() {
        int i = this.f21363w;
        return (((i << 11) + (this.f21364x << 6)) + this.f21365y) ^ (i & (-2048));
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: i */
    public int compareTo(AbstractC8176b abstractC8176b) {
        if (abstractC8176b instanceof C8213d) {
            return m16163u((C8213d) abstractC8176b);
        }
        return super.compareTo(abstractC8176b);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b, org.threeten.p283bp.temporal.InterfaceC8299e
    public boolean isSupported(InterfaceC8304h interfaceC8304h) {
        return super.isSupported(interfaceC8304h);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: k */
    public InterfaceC8190i mo16172k() {
        return super.mo16172k();
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: l */
    public boolean mo16171l(AbstractC8176b abstractC8176b) {
        if (abstractC8176b instanceof C8213d) {
            return m16163u((C8213d) abstractC8176b) > 0;
        }
        return super.mo16171l(abstractC8176b);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: m */
    public boolean mo16170m(AbstractC8176b abstractC8176b) {
        if (abstractC8176b instanceof C8213d) {
            return m16163u((C8213d) abstractC8176b) < 0;
        }
        return super.mo16170m(abstractC8176b);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: p */
    public long mo16167p() {
        long j;
        long j2 = this.f21363w;
        long j3 = this.f21364x;
        long j4 = (365 * j2) + 0;
        if (j2 >= 0) {
            j = j4 + (((3 + j2) / 4) - ((99 + j2) / 100)) + ((j2 + 399) / 400);
        } else {
            j = j4 - (((j2 / (-4)) - (j2 / (-100))) + (j2 / (-400)));
        }
        long j5 = j + (((367 * j3) - 362) / 12) + (this.f21365y - 1);
        if (j3 > 2) {
            j5--;
            if (!m16200H()) {
                j5--;
            }
        }
        return j5 - 719528;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.threeten.p283bp.chrono.AbstractC8176b, p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public <R> R query(InterfaceC8313j<R> interfaceC8313j) {
        return interfaceC8313j == C8305i.m15868b() ? this : (R) super.query(interfaceC8313j);
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public C8315l range(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            EnumC8288a enumC8288a = (EnumC8288a) interfaceC8304h;
            if (enumC8288a.isDateBased()) {
                int i = C8215b.f21366a[enumC8288a.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            return C8315l.m15846i(1L, (m16203D() != EnumC8260g.FEBRUARY || m16200H()) ? 5L : 4L);
                        } else if (i != 4) {
                            return interfaceC8304h.range();
                        } else {
                            return C8315l.m15846i(1L, getYear() <= 0 ? 1000000000L : 999999999L);
                        }
                    }
                    return C8315l.m15846i(1L, m16198J());
                }
                return C8315l.m15846i(1L, m16199I());
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
        }
        return interfaceC8304h.rangeRefinedBy(this);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: s */
    public C8216e mo16175g(C8219f c8219f) {
        return C8216e.m16151I(this, c8219f);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    public String toString() {
        int i = this.f21363w;
        short s = this.f21364x;
        short s2 = this.f21365y;
        int abs = Math.abs(i);
        StringBuilder sb2 = new StringBuilder(10);
        if (abs >= 1000) {
            if (i > 9999) {
                sb2.append('+');
            }
            sb2.append(i);
        } else if (i < 0) {
            sb2.append(i - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i + 10000);
            sb2.deleteCharAt(0);
        }
        sb2.append(s < 10 ? "-0" : "-");
        sb2.append((int) s);
        sb2.append(s2 >= 10 ? "-" : "-0");
        sb2.append((int) s2);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public int m16163u(C8213d c8213d) {
        int i = this.f21363w - c8213d.f21363w;
        if (i == 0) {
            int i2 = this.f21364x - c8213d.f21364x;
            return i2 == 0 ? this.f21365y - c8213d.f21365y : i2;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public long m16161x(C8213d c8213d) {
        return c8213d.mo16167p() - mo16167p();
    }
}
