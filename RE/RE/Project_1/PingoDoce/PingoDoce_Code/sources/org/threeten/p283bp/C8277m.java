package org.threeten.p283bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.joda.time.DateTimeConstants;
import org.threeten.p283bp.chrono.AbstractC8188h;
import org.threeten.p283bp.chrono.C8195m;
import org.threeten.p283bp.format.C8226c;
import org.threeten.p283bp.format.EnumC8255i;
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

/* renamed from: org.threeten.bp.m */
/* loaded from: classes2.dex */
public final class C8277m extends AbstractC11250c implements InterfaceC8298d, InterfaceC8300f, Comparable<C8277m>, Serializable {

    /* renamed from: w */
    private final int f21480w;

    /* renamed from: x */
    private final int f21481x;

    /* compiled from: YearMonth.java */
    /* renamed from: org.threeten.bp.m$a */
    /* loaded from: classes2.dex */
    class C8278a implements InterfaceC8313j<C8277m> {
        C8278a() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public C8277m mo16124b(InterfaceC8299e interfaceC8299e) {
            return C8277m.m15949i(interfaceC8299e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: YearMonth.java */
    /* renamed from: org.threeten.bp.m$b */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C8279b {

        /* renamed from: a */
        static final /* synthetic */ int[] f21482a;

        /* renamed from: b */
        static final /* synthetic */ int[] f21483b;

        static {
            int[] iArr = new int[EnumC8289b.values().length];
            f21483b = iArr;
            try {
                iArr[EnumC8289b.MONTHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21483b[EnumC8289b.YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21483b[EnumC8289b.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21483b[EnumC8289b.CENTURIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21483b[EnumC8289b.MILLENNIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21483b[EnumC8289b.ERAS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[EnumC8288a.values().length];
            f21482a = iArr2;
            try {
                iArr2[EnumC8288a.MONTH_OF_YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21482a[EnumC8288a.PROLEPTIC_MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21482a[EnumC8288a.YEAR_OF_ERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21482a[EnumC8288a.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21482a[EnumC8288a.ERA.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static {
        new C8278a();
        new C8226c().m16058p(EnumC8288a.YEAR, 4, 10, EnumC8255i.EXCEEDS_PAD).m16069e('-').m16059o(EnumC8288a.MONTH_OF_YEAR, 2).m16076D();
    }

    private C8277m(int i, int i2) {
        this.f21480w = i;
        this.f21481x = i2;
    }

    /* renamed from: i */
    public static C8277m m15949i(InterfaceC8299e interfaceC8299e) {
        if (interfaceC8299e instanceof C8277m) {
            return (C8277m) interfaceC8299e;
        }
        try {
            if (!C8195m.f21328y.equals(AbstractC8188h.m16348h(interfaceC8299e))) {
                interfaceC8299e = C8213d.m16160z(interfaceC8299e);
            }
            return m15946l(interfaceC8299e.get(EnumC8288a.YEAR), interfaceC8299e.get(EnumC8288a.MONTH_OF_YEAR));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain YearMonth from TemporalAccessor: " + interfaceC8299e + ", type " + interfaceC8299e.getClass().getName());
        }
    }

    /* renamed from: j */
    private long m15948j() {
        return (this.f21480w * 12) + (this.f21481x - 1);
    }

    /* renamed from: l */
    public static C8277m m15946l(int i, int i2) {
        EnumC8288a.YEAR.checkValidValue(i);
        EnumC8288a.MONTH_OF_YEAR.checkValidValue(i2);
        return new C8277m(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static C8277m m15942p(DataInput dataInput) throws IOException {
        return m15946l(dataInput.readInt(), dataInput.readByte());
    }

    /* renamed from: q */
    private C8277m m15941q(int i, int i2) {
        return (this.f21480w == i && this.f21481x == i2) ? this : new C8277m(i, i2);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C8273k((byte) 68, this);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8300f
    public InterfaceC8298d adjustInto(InterfaceC8298d interfaceC8298d) {
        if (AbstractC8188h.m16348h(interfaceC8298d).equals(C8195m.f21328y)) {
            return interfaceC8298d.mo15874c(EnumC8288a.PROLEPTIC_MONTH, m15948j());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8277m) {
            C8277m c8277m = (C8277m) obj;
            return this.f21480w == c8277m.f21480w && this.f21481x == c8277m.f21481x;
        }
        return false;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: f */
    public long mo15872f(InterfaceC8298d interfaceC8298d, InterfaceC8314k interfaceC8314k) {
        C8277m m15949i = m15949i(interfaceC8298d);
        if (interfaceC8314k instanceof EnumC8289b) {
            long m15948j = m15949i.m15948j() - m15948j();
            switch (C8279b.f21483b[((EnumC8289b) interfaceC8314k).ordinal()]) {
                case 1:
                    return m15948j;
                case 2:
                    return m15948j / 12;
                case 3:
                    return m15948j / 120;
                case 4:
                    return m15948j / 1200;
                case 5:
                    return m15948j / 12000;
                case 6:
                    EnumC8288a enumC8288a = EnumC8288a.ERA;
                    return m15949i.getLong(enumC8288a) - getLong(enumC8288a);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8314k);
            }
        }
        return interfaceC8314k.between(this, m15949i);
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(C8277m c8277m) {
        int i = this.f21480w - c8277m.f21480w;
        return i == 0 ? this.f21481x - c8277m.f21481x : i;
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public int get(InterfaceC8304h interfaceC8304h) {
        return range(interfaceC8304h).m15854a(getLong(interfaceC8304h), interfaceC8304h);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public long getLong(InterfaceC8304h interfaceC8304h) {
        int i;
        if (interfaceC8304h instanceof EnumC8288a) {
            int i2 = C8279b.f21482a[((EnumC8288a) interfaceC8304h).ordinal()];
            if (i2 == 1) {
                i = this.f21481x;
            } else if (i2 == 2) {
                return m15948j();
            } else {
                if (i2 == 3) {
                    int i3 = this.f21480w;
                    if (i3 < 1) {
                        i3 = 1 - i3;
                    }
                    return i3;
                } else if (i2 != 4) {
                    if (i2 == 5) {
                        return this.f21480w < 1 ? 0 : 1;
                    }
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
                } else {
                    i = this.f21480w;
                }
            }
            return i;
        }
        return interfaceC8304h.getFrom(this);
    }

    public int getYear() {
        return this.f21480w;
    }

    public int hashCode() {
        return this.f21480w ^ (this.f21481x << 27);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public boolean isSupported(InterfaceC8304h interfaceC8304h) {
        return interfaceC8304h instanceof EnumC8288a ? interfaceC8304h == EnumC8288a.YEAR || interfaceC8304h == EnumC8288a.MONTH_OF_YEAR || interfaceC8304h == EnumC8288a.PROLEPTIC_MONTH || interfaceC8304h == EnumC8288a.YEAR_OF_ERA || interfaceC8304h == EnumC8288a.ERA : interfaceC8304h != null && interfaceC8304h.isSupportedBy(this);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: k */
    public C8277m mo5632d(long j, InterfaceC8314k interfaceC8314k) {
        return j == Long.MIN_VALUE ? mo15873e(Long.MAX_VALUE, interfaceC8314k).mo15873e(1L, interfaceC8314k) : mo15873e(-j, interfaceC8314k);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: m */
    public C8277m mo15873e(long j, InterfaceC8314k interfaceC8314k) {
        if (interfaceC8314k instanceof EnumC8289b) {
            switch (C8279b.f21483b[((EnumC8289b) interfaceC8314k).ordinal()]) {
                case 1:
                    return m15944n(j);
                case 2:
                    return m15943o(j);
                case 3:
                    return m15943o(C11251d.m5620l(j, 10));
                case 4:
                    return m15943o(C11251d.m5620l(j, 100));
                case 5:
                    return m15943o(C11251d.m5620l(j, DateTimeConstants.MILLIS_PER_SECOND));
                case 6:
                    EnumC8288a enumC8288a = EnumC8288a.ERA;
                    return mo15874c(enumC8288a, C11251d.m5621k(getLong(enumC8288a), j));
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8314k);
            }
        }
        return (C8277m) interfaceC8314k.addTo(this, j);
    }

    /* renamed from: n */
    public C8277m m15944n(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.f21480w * 12) + (this.f21481x - 1) + j;
        return m15941q(EnumC8288a.YEAR.checkValidIntValue(C11251d.m5627e(j2, 12L)), C11251d.m5625g(j2, 12) + 1);
    }

    /* renamed from: o */
    public C8277m m15943o(long j) {
        return j == 0 ? this : m15941q(EnumC8288a.YEAR.checkValidIntValue(this.f21480w + j), this.f21481x);
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public <R> R query(InterfaceC8313j<R> interfaceC8313j) {
        if (interfaceC8313j == C8305i.m15869a()) {
            return (R) C8195m.f21328y;
        }
        if (interfaceC8313j == C8305i.m15865e()) {
            return (R) EnumC8289b.MONTHS;
        }
        if (interfaceC8313j == C8305i.m15868b() || interfaceC8313j == C8305i.m15867c() || interfaceC8313j == C8305i.m15864f() || interfaceC8313j == C8305i.m15863g() || interfaceC8313j == C8305i.m15866d()) {
            return null;
        }
        return (R) super.query(interfaceC8313j);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: r */
    public C8277m mo5633b(InterfaceC8300f interfaceC8300f) {
        return (C8277m) interfaceC8300f.adjustInto(this);
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public C8315l range(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h == EnumC8288a.YEAR_OF_ERA) {
            return C8315l.m15846i(1L, getYear() <= 0 ? 1000000000L : 999999999L);
        }
        return super.range(interfaceC8304h);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: s */
    public C8277m mo15874c(InterfaceC8304h interfaceC8304h, long j) {
        if (interfaceC8304h instanceof EnumC8288a) {
            EnumC8288a enumC8288a = (EnumC8288a) interfaceC8304h;
            enumC8288a.checkValidValue(j);
            int i = C8279b.f21482a[enumC8288a.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (this.f21480w < 1) {
                            j = 1 - j;
                        }
                        return m15937w((int) j);
                    } else if (i != 4) {
                        if (i == 5) {
                            return getLong(EnumC8288a.ERA) == j ? this : m15937w(1 - this.f21480w);
                        }
                        throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
                    } else {
                        return m15937w((int) j);
                    }
                }
                return m15944n(j - getLong(EnumC8288a.PROLEPTIC_MONTH));
            }
            return m15938u((int) j);
        }
        return (C8277m) interfaceC8304h.adjustInto(this, j);
    }

    public String toString() {
        int abs = Math.abs(this.f21480w);
        StringBuilder sb2 = new StringBuilder(9);
        if (abs < 1000) {
            int i = this.f21480w;
            if (i < 0) {
                sb2.append(i - 10000);
                sb2.deleteCharAt(1);
            } else {
                sb2.append(i + 10000);
                sb2.deleteCharAt(0);
            }
        } else {
            sb2.append(this.f21480w);
        }
        sb2.append(this.f21481x < 10 ? "-0" : "-");
        sb2.append(this.f21481x);
        return sb2.toString();
    }

    /* renamed from: u */
    public C8277m m15938u(int i) {
        EnumC8288a.MONTH_OF_YEAR.checkValidValue(i);
        return m15941q(this.f21480w, i);
    }

    /* renamed from: w */
    public C8277m m15937w(int i) {
        EnumC8288a.YEAR.checkValidValue(i);
        return m15941q(i, this.f21481x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m15936x(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f21480w);
        dataOutput.writeByte(this.f21481x);
    }
}
