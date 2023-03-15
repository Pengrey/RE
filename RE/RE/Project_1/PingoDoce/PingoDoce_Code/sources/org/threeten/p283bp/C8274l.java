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

/* renamed from: org.threeten.bp.l */
/* loaded from: classes2.dex */
public final class C8274l extends AbstractC11250c implements InterfaceC8298d, InterfaceC8300f, Comparable<C8274l>, Serializable {

    /* renamed from: w */
    private final int f21477w;

    /* compiled from: Year.java */
    /* renamed from: org.threeten.bp.l$a */
    /* loaded from: classes2.dex */
    class C8275a implements InterfaceC8313j<C8274l> {
        C8275a() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public C8274l mo16124b(InterfaceC8299e interfaceC8299e) {
            return C8274l.m15961i(interfaceC8299e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Year.java */
    /* renamed from: org.threeten.bp.l$b */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C8276b {

        /* renamed from: a */
        static final /* synthetic */ int[] f21478a;

        /* renamed from: b */
        static final /* synthetic */ int[] f21479b;

        static {
            int[] iArr = new int[EnumC8289b.values().length];
            f21479b = iArr;
            try {
                iArr[EnumC8289b.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21479b[EnumC8289b.DECADES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21479b[EnumC8289b.CENTURIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21479b[EnumC8289b.MILLENNIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21479b[EnumC8289b.ERAS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[EnumC8288a.values().length];
            f21478a = iArr2;
            try {
                iArr2[EnumC8288a.YEAR_OF_ERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21478a[EnumC8288a.YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21478a[EnumC8288a.ERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        new C8275a();
        new C8226c().m16058p(EnumC8288a.YEAR, 4, 10, EnumC8255i.EXCEEDS_PAD).m16076D();
    }

    private C8274l(int i) {
        this.f21477w = i;
    }

    /* renamed from: i */
    public static C8274l m15961i(InterfaceC8299e interfaceC8299e) {
        if (interfaceC8299e instanceof C8274l) {
            return (C8274l) interfaceC8299e;
        }
        try {
            if (!C8195m.f21328y.equals(AbstractC8188h.m16348h(interfaceC8299e))) {
                interfaceC8299e = C8213d.m16160z(interfaceC8299e);
            }
            return m15958l(interfaceC8299e.get(EnumC8288a.YEAR));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain Year from TemporalAccessor: " + interfaceC8299e + ", type " + interfaceC8299e.getClass().getName());
        }
    }

    /* renamed from: j */
    public static boolean m15960j(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    /* renamed from: l */
    public static C8274l m15958l(int i) {
        EnumC8288a.YEAR.checkValidValue(i);
        return new C8274l(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static C8274l m15955o(DataInput dataInput) throws IOException {
        return m15958l(dataInput.readInt());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C8273k((byte) 67, this);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8300f
    public InterfaceC8298d adjustInto(InterfaceC8298d interfaceC8298d) {
        if (AbstractC8188h.m16348h(interfaceC8298d).equals(C8195m.f21328y)) {
            return interfaceC8298d.mo15874c(EnumC8288a.YEAR, this.f21477w);
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8274l) && this.f21477w == ((C8274l) obj).f21477w;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: f */
    public long mo15872f(InterfaceC8298d interfaceC8298d, InterfaceC8314k interfaceC8314k) {
        C8274l m15961i = m15961i(interfaceC8298d);
        if (interfaceC8314k instanceof EnumC8289b) {
            long j = m15961i.f21477w - this.f21477w;
            int i = C8276b.f21479b[((EnumC8289b) interfaceC8314k).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                EnumC8288a enumC8288a = EnumC8288a.ERA;
                                return m15961i.getLong(enumC8288a) - getLong(enumC8288a);
                            }
                            throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8314k);
                        }
                        return j / 1000;
                    }
                    return j / 100;
                }
                return j / 10;
            }
            return j;
        }
        return interfaceC8314k.between(this, m15961i);
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(C8274l c8274l) {
        return this.f21477w - c8274l.f21477w;
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public int get(InterfaceC8304h interfaceC8304h) {
        return range(interfaceC8304h).m15854a(getLong(interfaceC8304h), interfaceC8304h);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public long getLong(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            int i = C8276b.f21478a[((EnumC8288a) interfaceC8304h).ordinal()];
            if (i == 1) {
                int i2 = this.f21477w;
                if (i2 < 1) {
                    i2 = 1 - i2;
                }
                return i2;
            } else if (i != 2) {
                if (i == 3) {
                    return this.f21477w < 1 ? 0 : 1;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
            } else {
                return this.f21477w;
            }
        }
        return interfaceC8304h.getFrom(this);
    }

    public int hashCode() {
        return this.f21477w;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public boolean isSupported(InterfaceC8304h interfaceC8304h) {
        return interfaceC8304h instanceof EnumC8288a ? interfaceC8304h == EnumC8288a.YEAR || interfaceC8304h == EnumC8288a.YEAR_OF_ERA || interfaceC8304h == EnumC8288a.ERA : interfaceC8304h != null && interfaceC8304h.isSupportedBy(this);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: k */
    public C8274l mo5632d(long j, InterfaceC8314k interfaceC8314k) {
        return j == Long.MIN_VALUE ? mo15873e(Long.MAX_VALUE, interfaceC8314k).mo15873e(1L, interfaceC8314k) : mo15873e(-j, interfaceC8314k);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: m */
    public C8274l mo15873e(long j, InterfaceC8314k interfaceC8314k) {
        if (interfaceC8314k instanceof EnumC8289b) {
            int i = C8276b.f21479b[((EnumC8289b) interfaceC8314k).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                EnumC8288a enumC8288a = EnumC8288a.ERA;
                                return mo15874c(enumC8288a, C11251d.m5621k(getLong(enumC8288a), j));
                            }
                            throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8314k);
                        }
                        return m15956n(C11251d.m5620l(j, DateTimeConstants.MILLIS_PER_SECOND));
                    }
                    return m15956n(C11251d.m5620l(j, 100));
                }
                return m15956n(C11251d.m5620l(j, 10));
            }
            return m15956n(j);
        }
        return (C8274l) interfaceC8314k.addTo(this, j);
    }

    /* renamed from: n */
    public C8274l m15956n(long j) {
        return j == 0 ? this : m15958l(EnumC8288a.YEAR.checkValidIntValue(this.f21477w + j));
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: p */
    public C8274l mo5633b(InterfaceC8300f interfaceC8300f) {
        return (C8274l) interfaceC8300f.adjustInto(this);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: q */
    public C8274l mo15874c(InterfaceC8304h interfaceC8304h, long j) {
        if (interfaceC8304h instanceof EnumC8288a) {
            EnumC8288a enumC8288a = (EnumC8288a) interfaceC8304h;
            enumC8288a.checkValidValue(j);
            int i = C8276b.f21478a[enumC8288a.ordinal()];
            if (i == 1) {
                if (this.f21477w < 1) {
                    j = 1 - j;
                }
                return m15958l((int) j);
            } else if (i != 2) {
                if (i == 3) {
                    return getLong(EnumC8288a.ERA) == j ? this : m15958l(1 - this.f21477w);
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
            } else {
                return m15958l((int) j);
            }
        }
        return (C8274l) interfaceC8304h.adjustInto(this, j);
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public <R> R query(InterfaceC8313j<R> interfaceC8313j) {
        if (interfaceC8313j == C8305i.m15869a()) {
            return (R) C8195m.f21328y;
        }
        if (interfaceC8313j == C8305i.m15865e()) {
            return (R) EnumC8289b.YEARS;
        }
        if (interfaceC8313j == C8305i.m15868b() || interfaceC8313j == C8305i.m15867c() || interfaceC8313j == C8305i.m15864f() || interfaceC8313j == C8305i.m15863g() || interfaceC8313j == C8305i.m15866d()) {
            return null;
        }
        return (R) super.query(interfaceC8313j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m15952r(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f21477w);
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public C8315l range(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h == EnumC8288a.YEAR_OF_ERA) {
            return C8315l.m15846i(1L, this.f21477w <= 0 ? 1000000000L : 999999999L);
        }
        return super.range(interfaceC8304h);
    }

    public String toString() {
        return Integer.toString(this.f21477w);
    }
}
