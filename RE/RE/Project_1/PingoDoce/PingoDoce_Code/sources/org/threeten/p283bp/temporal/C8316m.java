package org.threeten.p283bp.temporal;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.p283bp.C8274l;
import org.threeten.p283bp.EnumC8168a;
import org.threeten.p283bp.chrono.AbstractC8188h;
import p405vf.C11251d;

/* renamed from: org.threeten.bp.temporal.m */
/* loaded from: classes2.dex */
public final class C8316m implements Serializable {

    /* renamed from: C */
    private static final ConcurrentMap<String, C8316m> f21518C = new ConcurrentHashMap(4, 0.75f, 2);

    /* renamed from: A */
    private final transient InterfaceC8304h f21519A;

    /* renamed from: B */
    private final transient InterfaceC8304h f21520B;

    /* renamed from: w */
    private final EnumC8168a f21521w;

    /* renamed from: x */
    private final int f21522x;

    /* renamed from: y */
    private final transient InterfaceC8304h f21523y = C8317a.m15830e(this);

    /* renamed from: z */
    private final transient InterfaceC8304h f21524z = C8317a.m15828g(this);

    /* compiled from: WeekFields.java */
    /* renamed from: org.threeten.bp.temporal.m$a */
    /* loaded from: classes2.dex */
    static class C8317a implements InterfaceC8304h {

        /* renamed from: B */
        private static final C8315l f21525B = C8315l.m15846i(1, 7);

        /* renamed from: C */
        private static final C8315l f21526C = C8315l.m15844k(0, 1, 4, 6);

        /* renamed from: D */
        private static final C8315l f21527D = C8315l.m15844k(0, 1, 52, 54);

        /* renamed from: E */
        private static final C8315l f21528E = C8315l.m15845j(1, 52, 53);

        /* renamed from: F */
        private static final C8315l f21529F = EnumC8288a.YEAR.range();

        /* renamed from: A */
        private final C8315l f21530A;

        /* renamed from: w */
        private final String f21531w;

        /* renamed from: x */
        private final C8316m f21532x;

        /* renamed from: y */
        private final InterfaceC8314k f21533y;

        /* renamed from: z */
        private final InterfaceC8314k f21534z;

        private C8317a(String str, C8316m c8316m, InterfaceC8314k interfaceC8314k, InterfaceC8314k interfaceC8314k2, C8315l c8315l) {
            this.f21531w = str;
            this.f21532x = c8316m;
            this.f21533y = interfaceC8314k;
            this.f21534z = interfaceC8314k2;
            this.f21530A = c8315l;
        }

        /* renamed from: a */
        private int m15834a(int i, int i2) {
            return ((i + 7) + (i2 - 1)) / 7;
        }

        /* renamed from: b */
        private int m15833b(InterfaceC8299e interfaceC8299e) {
            int m5626f = C11251d.m5626f(interfaceC8299e.get(EnumC8288a.DAY_OF_WEEK) - this.f21532x.m15841c().getValue(), 7) + 1;
            int i = interfaceC8299e.get(EnumC8288a.YEAR);
            long m15831d = m15831d(interfaceC8299e, m5626f);
            if (m15831d == 0) {
                return i - 1;
            }
            if (m15831d < 53) {
                return i;
            }
            return m15831d >= ((long) m15834a(m15824k(interfaceC8299e.get(EnumC8288a.DAY_OF_YEAR), m5626f), (C8274l.m15960j((long) i) ? 366 : 365) + this.f21532x.m15840d())) ? i + 1 : i;
        }

        /* renamed from: c */
        private int m15832c(InterfaceC8299e interfaceC8299e) {
            int m5626f = C11251d.m5626f(interfaceC8299e.get(EnumC8288a.DAY_OF_WEEK) - this.f21532x.m15841c().getValue(), 7) + 1;
            long m15831d = m15831d(interfaceC8299e, m5626f);
            if (m15831d == 0) {
                return ((int) m15831d(AbstractC8188h.m16348h(interfaceC8299e).mo16236c(interfaceC8299e).mo5632d(1L, EnumC8289b.WEEKS), m5626f)) + 1;
            }
            if (m15831d >= 53) {
                int m15834a = m15834a(m15824k(interfaceC8299e.get(EnumC8288a.DAY_OF_YEAR), m5626f), (C8274l.m15960j((long) interfaceC8299e.get(EnumC8288a.YEAR)) ? 366 : 365) + this.f21532x.m15840d());
                if (m15831d >= m15834a) {
                    return (int) (m15831d - (m15834a - 1));
                }
            }
            return (int) m15831d;
        }

        /* renamed from: d */
        private long m15831d(InterfaceC8299e interfaceC8299e, int i) {
            int i2 = interfaceC8299e.get(EnumC8288a.DAY_OF_YEAR);
            return m15834a(m15824k(i2, i), i2);
        }

        /* renamed from: e */
        static C8317a m15830e(C8316m c8316m) {
            return new C8317a("DayOfWeek", c8316m, EnumC8289b.DAYS, EnumC8289b.WEEKS, f21525B);
        }

        /* renamed from: f */
        static C8317a m15829f(C8316m c8316m) {
            return new C8317a("WeekBasedYear", c8316m, C8290c.f21502d, EnumC8289b.FOREVER, f21529F);
        }

        /* renamed from: g */
        static C8317a m15828g(C8316m c8316m) {
            return new C8317a("WeekOfMonth", c8316m, EnumC8289b.WEEKS, EnumC8289b.MONTHS, f21526C);
        }

        /* renamed from: h */
        static C8317a m15827h(C8316m c8316m) {
            return new C8317a("WeekOfWeekBasedYear", c8316m, EnumC8289b.WEEKS, C8290c.f21502d, f21528E);
        }

        /* renamed from: i */
        static C8317a m15826i(C8316m c8316m) {
            return new C8317a("WeekOfYear", c8316m, EnumC8289b.WEEKS, EnumC8289b.YEARS, f21527D);
        }

        /* renamed from: j */
        private C8315l m15825j(InterfaceC8299e interfaceC8299e) {
            int m5626f = C11251d.m5626f(interfaceC8299e.get(EnumC8288a.DAY_OF_WEEK) - this.f21532x.m15841c().getValue(), 7) + 1;
            long m15831d = m15831d(interfaceC8299e, m5626f);
            if (m15831d == 0) {
                return m15825j(AbstractC8188h.m16348h(interfaceC8299e).mo16236c(interfaceC8299e).mo5632d(2L, EnumC8289b.WEEKS));
            }
            int m15834a = m15834a(m15824k(interfaceC8299e.get(EnumC8288a.DAY_OF_YEAR), m5626f), (C8274l.m15960j((long) interfaceC8299e.get(EnumC8288a.YEAR)) ? 366 : 365) + this.f21532x.m15840d());
            if (m15831d >= m15834a) {
                return m15825j(AbstractC8188h.m16348h(interfaceC8299e).mo16236c(interfaceC8299e).mo15873e(2L, EnumC8289b.WEEKS));
            }
            return C8315l.m15846i(1L, m15834a - 1);
        }

        /* renamed from: k */
        private int m15824k(int i, int i2) {
            int m5626f = C11251d.m5626f(i - i2, 7);
            return m5626f + 1 > this.f21532x.m15840d() ? 7 - m5626f : -m5626f;
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8304h
        public <R extends InterfaceC8298d> R adjustInto(R r, long j) {
            int m15854a = this.f21530A.m15854a(j, this);
            int i = r.get(this);
            if (m15854a == i) {
                return r;
            }
            if (this.f21534z == EnumC8289b.FOREVER) {
                int i2 = r.get(this.f21532x.f21519A);
                EnumC8289b enumC8289b = EnumC8289b.WEEKS;
                InterfaceC8298d mo15873e = r.mo15873e((long) ((j - i) * 52.1775d), enumC8289b);
                if (mo15873e.get(this) > m15854a) {
                    return (R) mo15873e.mo5632d(mo15873e.get(this.f21532x.f21519A), enumC8289b);
                }
                if (mo15873e.get(this) < m15854a) {
                    mo15873e = mo15873e.mo15873e(2L, enumC8289b);
                }
                R r2 = (R) mo15873e.mo15873e(i2 - mo15873e.get(this.f21532x.f21519A), enumC8289b);
                return r2.get(this) > m15854a ? (R) r2.mo5632d(1L, enumC8289b) : r2;
            }
            return (R) r.mo15873e(m15854a - i, this.f21533y);
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8304h
        public long getFrom(InterfaceC8299e interfaceC8299e) {
            int m15833b;
            int m5626f = C11251d.m5626f(interfaceC8299e.get(EnumC8288a.DAY_OF_WEEK) - this.f21532x.m15841c().getValue(), 7) + 1;
            InterfaceC8314k interfaceC8314k = this.f21534z;
            if (interfaceC8314k == EnumC8289b.WEEKS) {
                return m5626f;
            }
            if (interfaceC8314k == EnumC8289b.MONTHS) {
                int i = interfaceC8299e.get(EnumC8288a.DAY_OF_MONTH);
                m15833b = m15834a(m15824k(i, m5626f), i);
            } else if (interfaceC8314k == EnumC8289b.YEARS) {
                int i2 = interfaceC8299e.get(EnumC8288a.DAY_OF_YEAR);
                m15833b = m15834a(m15824k(i2, m5626f), i2);
            } else if (interfaceC8314k == C8290c.f21502d) {
                m15833b = m15832c(interfaceC8299e);
            } else if (interfaceC8314k == EnumC8289b.FOREVER) {
                m15833b = m15833b(interfaceC8299e);
            } else {
                throw new IllegalStateException("unreachable");
            }
            return m15833b;
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8304h
        public boolean isDateBased() {
            return true;
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8304h
        public boolean isSupportedBy(InterfaceC8299e interfaceC8299e) {
            if (interfaceC8299e.isSupported(EnumC8288a.DAY_OF_WEEK)) {
                InterfaceC8314k interfaceC8314k = this.f21534z;
                if (interfaceC8314k == EnumC8289b.WEEKS) {
                    return true;
                }
                if (interfaceC8314k == EnumC8289b.MONTHS) {
                    return interfaceC8299e.isSupported(EnumC8288a.DAY_OF_MONTH);
                }
                if (interfaceC8314k == EnumC8289b.YEARS) {
                    return interfaceC8299e.isSupported(EnumC8288a.DAY_OF_YEAR);
                }
                if (interfaceC8314k == C8290c.f21502d) {
                    return interfaceC8299e.isSupported(EnumC8288a.EPOCH_DAY);
                }
                if (interfaceC8314k == EnumC8289b.FOREVER) {
                    return interfaceC8299e.isSupported(EnumC8288a.EPOCH_DAY);
                }
                return false;
            }
            return false;
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8304h
        public boolean isTimeBased() {
            return false;
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8304h
        public C8315l range() {
            return this.f21530A;
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8304h
        public C8315l rangeRefinedBy(InterfaceC8299e interfaceC8299e) {
            EnumC8288a enumC8288a;
            InterfaceC8314k interfaceC8314k = this.f21534z;
            if (interfaceC8314k == EnumC8289b.WEEKS) {
                return this.f21530A;
            }
            if (interfaceC8314k == EnumC8289b.MONTHS) {
                enumC8288a = EnumC8288a.DAY_OF_MONTH;
            } else if (interfaceC8314k == EnumC8289b.YEARS) {
                enumC8288a = EnumC8288a.DAY_OF_YEAR;
            } else if (interfaceC8314k == C8290c.f21502d) {
                return m15825j(interfaceC8299e);
            } else {
                if (interfaceC8314k == EnumC8289b.FOREVER) {
                    return interfaceC8299e.range(EnumC8288a.YEAR);
                }
                throw new IllegalStateException("unreachable");
            }
            int value = this.f21532x.m15841c().getValue();
            int m15824k = m15824k(interfaceC8299e.get(enumC8288a), C11251d.m5626f(interfaceC8299e.get(EnumC8288a.DAY_OF_WEEK) - value, 7) + 1);
            C8315l range = interfaceC8299e.range(enumC8288a);
            return C8315l.m15846i(m15834a(m15824k, (int) range.m15851d()), m15834a(m15824k, (int) range.m15852c()));
        }

        public String toString() {
            return this.f21531w + "[" + this.f21532x.toString() + "]";
        }
    }

    static {
        new C8316m(EnumC8168a.MONDAY, 4);
        m15838f(EnumC8168a.SUNDAY, 1);
    }

    private C8316m(EnumC8168a enumC8168a, int i) {
        C8317a.m15826i(this);
        this.f21519A = C8317a.m15827h(this);
        this.f21520B = C8317a.m15829f(this);
        C11251d.m5623i(enumC8168a, "firstDayOfWeek");
        if (i >= 1 && i <= 7) {
            this.f21521w = enumC8168a;
            this.f21522x = i;
            return;
        }
        throw new IllegalArgumentException("Minimal number of days is invalid");
    }

    /* renamed from: e */
    public static C8316m m15839e(Locale locale) {
        C11251d.m5623i(locale, "locale");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(new Locale(locale.getLanguage(), locale.getCountry()));
        return m15838f(EnumC8168a.SUNDAY.plus(gregorianCalendar.getFirstDayOfWeek() - 1), gregorianCalendar.getMinimalDaysInFirstWeek());
    }

    /* renamed from: f */
    public static C8316m m15838f(EnumC8168a enumC8168a, int i) {
        String str = enumC8168a.toString() + i;
        ConcurrentMap<String, C8316m> concurrentMap = f21518C;
        C8316m c8316m = concurrentMap.get(str);
        if (c8316m == null) {
            concurrentMap.putIfAbsent(str, new C8316m(enumC8168a, i));
            return concurrentMap.get(str);
        }
        return c8316m;
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return m15838f(this.f21521w, this.f21522x);
        } catch (IllegalArgumentException e) {
            throw new InvalidObjectException("Invalid WeekFields" + e.getMessage());
        }
    }

    /* renamed from: b */
    public InterfaceC8304h m15842b() {
        return this.f21523y;
    }

    /* renamed from: c */
    public EnumC8168a m15841c() {
        return this.f21521w;
    }

    /* renamed from: d */
    public int m15840d() {
        return this.f21522x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8316m) && hashCode() == obj.hashCode();
    }

    /* renamed from: g */
    public InterfaceC8304h m15837g() {
        return this.f21520B;
    }

    /* renamed from: h */
    public InterfaceC8304h m15836h() {
        return this.f21524z;
    }

    public int hashCode() {
        return (this.f21521w.ordinal() * 7) + this.f21522x;
    }

    /* renamed from: i */
    public InterfaceC8304h m15835i() {
        return this.f21519A;
    }

    public String toString() {
        return "WeekFields[" + this.f21521w + ',' + this.f21522x + ']';
    }
}
