package org.threeten.p283bp;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.joda.time.DateTimeConstants;
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

/* renamed from: org.threeten.bp.f */
/* loaded from: classes2.dex */
public final class C8219f extends AbstractC11250c implements InterfaceC8298d, InterfaceC8300f, Comparable<C8219f>, Serializable {

    /* renamed from: A */
    public static final C8219f f21373A;

    /* renamed from: B */
    public static final C8219f f21374B;

    /* renamed from: C */
    private static final C8219f[] f21375C;

    /* renamed from: w */
    private final byte f21376w;

    /* renamed from: x */
    private final byte f21377x;

    /* renamed from: y */
    private final byte f21378y;

    /* renamed from: z */
    private final int f21379z;

    /* compiled from: LocalTime.java */
    /* renamed from: org.threeten.bp.f$a */
    /* loaded from: classes2.dex */
    class C8220a implements InterfaceC8313j<C8219f> {
        C8220a() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public C8219f mo16124b(InterfaceC8299e interfaceC8299e) {
            return C8219f.m16106k(interfaceC8299e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalTime.java */
    /* renamed from: org.threeten.bp.f$b */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C8221b {

        /* renamed from: a */
        static final /* synthetic */ int[] f21380a;

        /* renamed from: b */
        static final /* synthetic */ int[] f21381b;

        static {
            int[] iArr = new int[EnumC8289b.values().length];
            f21381b = iArr;
            try {
                iArr[EnumC8289b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21381b[EnumC8289b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21381b[EnumC8289b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21381b[EnumC8289b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21381b[EnumC8289b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21381b[EnumC8289b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21381b[EnumC8289b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[EnumC8288a.values().length];
            f21380a = iArr2;
            try {
                iArr2[EnumC8288a.NANO_OF_SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21380a[EnumC8288a.NANO_OF_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21380a[EnumC8288a.MICRO_OF_SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21380a[EnumC8288a.MICRO_OF_DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21380a[EnumC8288a.MILLI_OF_SECOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21380a[EnumC8288a.MILLI_OF_DAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21380a[EnumC8288a.SECOND_OF_MINUTE.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21380a[EnumC8288a.SECOND_OF_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21380a[EnumC8288a.MINUTE_OF_HOUR.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21380a[EnumC8288a.MINUTE_OF_DAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f21380a[EnumC8288a.HOUR_OF_AMPM.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f21380a[EnumC8288a.CLOCK_HOUR_OF_AMPM.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f21380a[EnumC8288a.HOUR_OF_DAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f21380a[EnumC8288a.CLOCK_HOUR_OF_DAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f21380a[EnumC8288a.AMPM_OF_DAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    static {
        new C8220a();
        f21375C = new C8219f[24];
        int i = 0;
        while (true) {
            C8219f[] c8219fArr = f21375C;
            if (i < c8219fArr.length) {
                c8219fArr[i] = new C8219f(i, 0, 0, 0);
                i++;
            } else {
                C8219f c8219f = c8219fArr[0];
                C8219f c8219f2 = c8219fArr[12];
                f21373A = c8219fArr[0];
                f21374B = new C8219f(23, 59, 59, 999999999);
                return;
            }
        }
    }

    private C8219f(int i, int i2, int i3, int i4) {
        this.f21376w = (byte) i;
        this.f21377x = (byte) i2;
        this.f21378y = (byte) i3;
        this.f21379z = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static C8219f m16119F(DataInput dataInput) throws IOException {
        int i;
        int i2;
        int readByte = dataInput.readByte();
        int i3 = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i = 0;
            i2 = 0;
        } else {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                int i4 = ~readByte2;
                i2 = 0;
                i3 = i4;
                i = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    i = ~readByte3;
                } else {
                    i3 = dataInput.readInt();
                    i = readByte3;
                }
                i2 = i3;
                i3 = readByte2;
            }
        }
        return m16098s(readByte, i3, i, i2);
    }

    /* renamed from: j */
    private static C8219f m16107j(int i, int i2, int i3, int i4) {
        if ((i2 | i3 | i4) == 0) {
            return f21375C[i];
        }
        return new C8219f(i, i2, i3, i4);
    }

    /* renamed from: k */
    public static C8219f m16106k(InterfaceC8299e interfaceC8299e) {
        C8219f c8219f = (C8219f) interfaceC8299e.query(C8305i.m15867c());
        if (c8219f != null) {
            return c8219f;
        }
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + interfaceC8299e + ", type " + interfaceC8299e.getClass().getName());
    }

    /* renamed from: l */
    private int m16105l(InterfaceC8304h interfaceC8304h) {
        switch (C8221b.f21380a[((EnumC8288a) interfaceC8304h).ordinal()]) {
            case 1:
                return this.f21379z;
            case 2:
                throw new DateTimeException("Field too large for an int: " + interfaceC8304h);
            case 3:
                return this.f21379z / DateTimeConstants.MILLIS_PER_SECOND;
            case 4:
                throw new DateTimeException("Field too large for an int: " + interfaceC8304h);
            case 5:
                return this.f21379z / 1000000;
            case 6:
                return (int) (m16118G() / 1000000);
            case 7:
                return this.f21378y;
            case 8:
                return m16117H();
            case 9:
                return this.f21377x;
            case 10:
                return (this.f21376w * 60) + this.f21377x;
            case 11:
                return this.f21376w % 12;
            case 12:
                int i = this.f21376w % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.f21376w;
            case 14:
                byte b = this.f21376w;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.f21376w / 12;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: s */
    public static C8219f m16098s(int i, int i2, int i3, int i4) {
        EnumC8288a.HOUR_OF_DAY.checkValidValue(i);
        EnumC8288a.MINUTE_OF_HOUR.checkValidValue(i2);
        EnumC8288a.SECOND_OF_MINUTE.checkValidValue(i3);
        EnumC8288a.NANO_OF_SECOND.checkValidValue(i4);
        return m16107j(i, i2, i3, i4);
    }

    /* renamed from: u */
    public static C8219f m16097u(long j) {
        EnumC8288a.NANO_OF_DAY.checkValidValue(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return m16107j(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    /* renamed from: w */
    public static C8219f m16096w(long j) {
        EnumC8288a.SECOND_OF_DAY.checkValidValue(j);
        int i = (int) (j / 3600);
        long j2 = j - (i * DateTimeConstants.SECONDS_PER_HOUR);
        int i2 = (int) (j2 / 60);
        return m16107j(i, i2, (int) (j2 - (i2 * 60)), 0);
    }

    private Object writeReplace() {
        return new C8273k((byte) 5, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static C8219f m16095x(long j, int i) {
        EnumC8288a.SECOND_OF_DAY.checkValidValue(j);
        EnumC8288a.NANO_OF_SECOND.checkValidValue(i);
        int i2 = (int) (j / 3600);
        long j2 = j - (i2 * DateTimeConstants.SECONDS_PER_HOUR);
        int i3 = (int) (j2 / 60);
        return m16107j(i2, i3, (int) (j2 - (i3 * 60)), i);
    }

    /* renamed from: A */
    public C8219f m16123A(long j) {
        return j == 0 ? this : m16107j(((((int) (j % 24)) + this.f21376w) + 24) % 24, this.f21377x, this.f21378y, this.f21379z);
    }

    /* renamed from: B */
    public C8219f m16122B(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.f21376w * 60) + this.f21377x;
        int i2 = ((((int) (j % 1440)) + i) + DateTimeConstants.MINUTES_PER_DAY) % DateTimeConstants.MINUTES_PER_DAY;
        return i == i2 ? this : m16107j(i2 / 60, i2 % 60, this.f21378y, this.f21379z);
    }

    /* renamed from: C */
    public C8219f m16121C(long j) {
        if (j == 0) {
            return this;
        }
        long m16118G = m16118G();
        long j2 = (((j % 86400000000000L) + m16118G) + 86400000000000L) % 86400000000000L;
        return m16118G == j2 ? this : m16107j((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    /* renamed from: D */
    public C8219f m16120D(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.f21376w * 3600) + (this.f21377x * 60) + this.f21378y;
        int i2 = ((((int) (j % 86400)) + i) + DateTimeConstants.SECONDS_PER_DAY) % DateTimeConstants.SECONDS_PER_DAY;
        return i == i2 ? this : m16107j(i2 / DateTimeConstants.SECONDS_PER_HOUR, (i2 / 60) % 60, i2 % 60, this.f21379z);
    }

    /* renamed from: G */
    public long m16118G() {
        return (this.f21376w * 3600000000000L) + (this.f21377x * 60000000000L) + (this.f21378y * 1000000000) + this.f21379z;
    }

    /* renamed from: H */
    public int m16117H() {
        return (this.f21376w * 3600) + (this.f21377x * 60) + this.f21378y;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: I */
    public C8219f mo5633b(InterfaceC8300f interfaceC8300f) {
        if (interfaceC8300f instanceof C8219f) {
            return (C8219f) interfaceC8300f;
        }
        return (C8219f) interfaceC8300f.adjustInto(this);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: J */
    public C8219f mo15874c(InterfaceC8304h interfaceC8304h, long j) {
        if (interfaceC8304h instanceof EnumC8288a) {
            EnumC8288a enumC8288a = (EnumC8288a) interfaceC8304h;
            enumC8288a.checkValidValue(j);
            switch (C8221b.f21380a[enumC8288a.ordinal()]) {
                case 1:
                    return m16112M((int) j);
                case 2:
                    return m16097u(j);
                case 3:
                    return m16112M(((int) j) * DateTimeConstants.MILLIS_PER_SECOND);
                case 4:
                    return m16097u(j * 1000);
                case 5:
                    return m16112M(((int) j) * 1000000);
                case 6:
                    return m16097u(j * 1000000);
                case 7:
                    return m16111N((int) j);
                case 8:
                    return m16120D(j - m16117H());
                case 9:
                    return m16113L((int) j);
                case 10:
                    return m16122B(j - ((this.f21376w * 60) + this.f21377x));
                case 11:
                    return m16123A(j - (this.f21376w % 12));
                case 12:
                    if (j == 12) {
                        j = 0;
                    }
                    return m16123A(j - (this.f21376w % 12));
                case 13:
                    return m16114K((int) j);
                case 14:
                    if (j == 24) {
                        j = 0;
                    }
                    return m16114K((int) j);
                case 15:
                    return m16123A((j - (this.f21376w / 12)) * 12);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
            }
        }
        return (C8219f) interfaceC8304h.adjustInto(this, j);
    }

    /* renamed from: K */
    public C8219f m16114K(int i) {
        if (this.f21376w == i) {
            return this;
        }
        EnumC8288a.HOUR_OF_DAY.checkValidValue(i);
        return m16107j(i, this.f21377x, this.f21378y, this.f21379z);
    }

    /* renamed from: L */
    public C8219f m16113L(int i) {
        if (this.f21377x == i) {
            return this;
        }
        EnumC8288a.MINUTE_OF_HOUR.checkValidValue(i);
        return m16107j(this.f21376w, i, this.f21378y, this.f21379z);
    }

    /* renamed from: M */
    public C8219f m16112M(int i) {
        if (this.f21379z == i) {
            return this;
        }
        EnumC8288a.NANO_OF_SECOND.checkValidValue(i);
        return m16107j(this.f21376w, this.f21377x, this.f21378y, i);
    }

    /* renamed from: N */
    public C8219f m16111N(int i) {
        if (this.f21378y == i) {
            return this;
        }
        EnumC8288a.SECOND_OF_MINUTE.checkValidValue(i);
        return m16107j(this.f21376w, this.f21377x, i, this.f21379z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public void m16110O(DataOutput dataOutput) throws IOException {
        if (this.f21379z == 0) {
            if (this.f21378y == 0) {
                if (this.f21377x == 0) {
                    dataOutput.writeByte(~this.f21376w);
                    return;
                }
                dataOutput.writeByte(this.f21376w);
                dataOutput.writeByte(~this.f21377x);
                return;
            }
            dataOutput.writeByte(this.f21376w);
            dataOutput.writeByte(this.f21377x);
            dataOutput.writeByte(~this.f21378y);
            return;
        }
        dataOutput.writeByte(this.f21376w);
        dataOutput.writeByte(this.f21377x);
        dataOutput.writeByte(this.f21378y);
        dataOutput.writeInt(this.f21379z);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8300f
    public InterfaceC8298d adjustInto(InterfaceC8298d interfaceC8298d) {
        return interfaceC8298d.mo15874c(EnumC8288a.NANO_OF_DAY, m16118G());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8219f) {
            C8219f c8219f = (C8219f) obj;
            return this.f21376w == c8219f.f21376w && this.f21377x == c8219f.f21377x && this.f21378y == c8219f.f21378y && this.f21379z == c8219f.f21379z;
        }
        return false;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: f */
    public long mo15872f(InterfaceC8298d interfaceC8298d, InterfaceC8314k interfaceC8314k) {
        C8219f m16106k = m16106k(interfaceC8298d);
        if (interfaceC8314k instanceof EnumC8289b) {
            long m16118G = m16106k.m16118G() - m16118G();
            switch (C8221b.f21381b[((EnumC8289b) interfaceC8314k).ordinal()]) {
                case 1:
                    return m16118G;
                case 2:
                    return m16118G / 1000;
                case 3:
                    return m16118G / 1000000;
                case 4:
                    return m16118G / 1000000000;
                case 5:
                    return m16118G / 60000000000L;
                case 6:
                    return m16118G / 3600000000000L;
                case 7:
                    return m16118G / 43200000000000L;
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8314k);
            }
        }
        return interfaceC8314k.between(this, m16106k);
    }

    /* renamed from: g */
    public C8270j m16109g(C8282o c8282o) {
        return C8270j.m15974l(this, c8282o);
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public int get(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            return m16105l(interfaceC8304h);
        }
        return super.get(interfaceC8304h);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public long getLong(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            if (interfaceC8304h == EnumC8288a.NANO_OF_DAY) {
                return m16118G();
            }
            if (interfaceC8304h == EnumC8288a.MICRO_OF_DAY) {
                return m16118G() / 1000;
            }
            return m16105l(interfaceC8304h);
        }
        return interfaceC8304h.getFrom(this);
    }

    public int hashCode() {
        long m16118G = m16118G();
        return (int) (m16118G ^ (m16118G >>> 32));
    }

    @Override // java.lang.Comparable
    /* renamed from: i */
    public int compareTo(C8219f c8219f) {
        int m5631a = C11251d.m5631a(this.f21376w, c8219f.f21376w);
        if (m5631a == 0) {
            int m5631a2 = C11251d.m5631a(this.f21377x, c8219f.f21377x);
            if (m5631a2 == 0) {
                int m5631a3 = C11251d.m5631a(this.f21378y, c8219f.f21378y);
                return m5631a3 == 0 ? C11251d.m5631a(this.f21379z, c8219f.f21379z) : m5631a3;
            }
            return m5631a2;
        }
        return m5631a;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public boolean isSupported(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            return interfaceC8304h.isTimeBased();
        }
        return interfaceC8304h != null && interfaceC8304h.isSupportedBy(this);
    }

    /* renamed from: m */
    public int m16104m() {
        return this.f21376w;
    }

    /* renamed from: n */
    public int m16103n() {
        return this.f21379z;
    }

    /* renamed from: o */
    public int m16102o() {
        return this.f21378y;
    }

    /* renamed from: p */
    public boolean m16101p(C8219f c8219f) {
        return compareTo(c8219f) > 0;
    }

    /* renamed from: q */
    public boolean m16100q(C8219f c8219f) {
        return compareTo(c8219f) < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public <R> R query(InterfaceC8313j<R> interfaceC8313j) {
        if (interfaceC8313j == C8305i.m15865e()) {
            return (R) EnumC8289b.NANOS;
        }
        if (interfaceC8313j == C8305i.m15867c()) {
            return this;
        }
        if (interfaceC8313j == C8305i.m15869a() || interfaceC8313j == C8305i.m15863g() || interfaceC8313j == C8305i.m15864f() || interfaceC8313j == C8305i.m15866d() || interfaceC8313j == C8305i.m15868b()) {
            return null;
        }
        return interfaceC8313j.mo16124b(this);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: r */
    public C8219f mo5632d(long j, InterfaceC8314k interfaceC8314k) {
        return j == Long.MIN_VALUE ? mo15873e(Long.MAX_VALUE, interfaceC8314k).mo15873e(1L, interfaceC8314k) : mo15873e(-j, interfaceC8314k);
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public C8315l range(InterfaceC8304h interfaceC8304h) {
        return super.range(interfaceC8304h);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(18);
        byte b = this.f21376w;
        byte b2 = this.f21377x;
        byte b3 = this.f21378y;
        int i = this.f21379z;
        sb2.append(b < 10 ? "0" : BuildConfig.VERSION_NAME);
        sb2.append((int) b);
        sb2.append(b2 < 10 ? ":0" : ":");
        sb2.append((int) b2);
        if (b3 > 0 || i > 0) {
            sb2.append(b3 >= 10 ? ":" : ":0");
            sb2.append((int) b3);
            if (i > 0) {
                sb2.append('.');
                if (i % 1000000 == 0) {
                    sb2.append(Integer.toString((i / 1000000) + DateTimeConstants.MILLIS_PER_SECOND).substring(1));
                } else if (i % DateTimeConstants.MILLIS_PER_SECOND == 0) {
                    sb2.append(Integer.toString((i / DateTimeConstants.MILLIS_PER_SECOND) + 1000000).substring(1));
                } else {
                    sb2.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb2.toString();
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: z */
    public C8219f mo15873e(long j, InterfaceC8314k interfaceC8314k) {
        if (interfaceC8314k instanceof EnumC8289b) {
            switch (C8221b.f21381b[((EnumC8289b) interfaceC8314k).ordinal()]) {
                case 1:
                    return m16121C(j);
                case 2:
                    return m16121C((j % 86400000000L) * 1000);
                case 3:
                    return m16121C((j % 86400000) * 1000000);
                case 4:
                    return m16120D(j);
                case 5:
                    return m16122B(j);
                case 6:
                    return m16123A(j);
                case 7:
                    return m16123A((j % 2) * 12);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8314k);
            }
        }
        return (C8219f) interfaceC8314k.addTo(this, j);
    }
}
