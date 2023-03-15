package org.threeten.p283bp.temporal;

import java.util.Locale;
import java.util.Map;
import org.threeten.p283bp.C8170b;
import org.threeten.p283bp.C8213d;
import org.threeten.p283bp.EnumC8168a;
import org.threeten.p283bp.chrono.AbstractC8188h;
import org.threeten.p283bp.chrono.C8195m;
import org.threeten.p283bp.format.EnumC8254h;
import p405vf.C11251d;

/* renamed from: org.threeten.bp.temporal.c */
/* loaded from: classes2.dex */
public final class C8290c {

    /* renamed from: a */
    public static final InterfaceC8304h f21499a;

    /* renamed from: b */
    public static final InterfaceC8304h f21500b;

    /* renamed from: c */
    public static final InterfaceC8304h f21501c;

    /* renamed from: d */
    public static final InterfaceC8314k f21502d;

    /* renamed from: e */
    public static final InterfaceC8314k f21503e;

    /* compiled from: IsoFields.java */
    /* renamed from: org.threeten.bp.temporal.c$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C8291a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21504a;

        static {
            int[] iArr = new int[EnumC8297c.values().length];
            f21504a = iArr;
            try {
                iArr[EnumC8297c.WEEK_BASED_YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21504a[EnumC8297c.QUARTER_YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IsoFields.java */
    /* renamed from: org.threeten.bp.temporal.c$b */
    /* loaded from: classes2.dex */
    public static abstract class EnumC8292b implements InterfaceC8304h {
        private static final /* synthetic */ EnumC8292b[] $VALUES;
        public static final EnumC8292b DAY_OF_QUARTER;
        private static final int[] QUARTER_DAYS;
        public static final EnumC8292b QUARTER_OF_YEAR;
        public static final EnumC8292b WEEK_BASED_YEAR;
        public static final EnumC8292b WEEK_OF_WEEK_BASED_YEAR;

        /* compiled from: IsoFields.java */
        /* renamed from: org.threeten.bp.temporal.c$b$a */
        /* loaded from: classes2.dex */
        enum C8293a extends EnumC8292b {
            C8293a(String str, int i) {
                super(str, i, null);
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b, org.threeten.p283bp.temporal.InterfaceC8304h
            public <R extends InterfaceC8298d> R adjustInto(R r, long j) {
                long from = getFrom(r);
                range().m15853b(j, this);
                EnumC8288a enumC8288a = EnumC8288a.DAY_OF_YEAR;
                return (R) r.mo15874c(enumC8288a, r.getLong(enumC8288a) + (j - from));
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b
            public InterfaceC8314k getBaseUnit() {
                return EnumC8289b.DAYS;
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b, org.threeten.p283bp.temporal.InterfaceC8304h
            public long getFrom(InterfaceC8299e interfaceC8299e) {
                if (interfaceC8299e.isSupported(this)) {
                    return interfaceC8299e.get(EnumC8288a.DAY_OF_YEAR) - EnumC8292b.QUARTER_DAYS[((interfaceC8299e.get(EnumC8288a.MONTH_OF_YEAR) - 1) / 3) + (C8195m.f21328y.m16291u(interfaceC8299e.getLong(EnumC8288a.YEAR)) ? 4 : 0)];
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b
            public InterfaceC8314k getRangeUnit() {
                return C8290c.f21503e;
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b, org.threeten.p283bp.temporal.InterfaceC8304h
            public boolean isSupportedBy(InterfaceC8299e interfaceC8299e) {
                return interfaceC8299e.isSupported(EnumC8288a.DAY_OF_YEAR) && interfaceC8299e.isSupported(EnumC8288a.MONTH_OF_YEAR) && interfaceC8299e.isSupported(EnumC8288a.YEAR) && EnumC8292b.isIso(interfaceC8299e);
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b, org.threeten.p283bp.temporal.InterfaceC8304h
            public C8315l range() {
                return C8315l.m15845j(1L, 90L, 92L);
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b, org.threeten.p283bp.temporal.InterfaceC8304h
            public C8315l rangeRefinedBy(InterfaceC8299e interfaceC8299e) {
                if (interfaceC8299e.isSupported(this)) {
                    long j = interfaceC8299e.getLong(EnumC8292b.QUARTER_OF_YEAR);
                    if (j == 1) {
                        return C8195m.f21328y.m16291u(interfaceC8299e.getLong(EnumC8288a.YEAR)) ? C8315l.m15846i(1L, 91L) : C8315l.m15846i(1L, 90L);
                    } else if (j == 2) {
                        return C8315l.m15846i(1L, 91L);
                    } else {
                        if (j != 3 && j != 4) {
                            return range();
                        }
                        return C8315l.m15846i(1L, 92L);
                    }
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
                if (r2 == 2) goto L19;
             */
            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public org.threeten.p283bp.temporal.InterfaceC8299e resolve(java.util.Map<org.threeten.p283bp.temporal.InterfaceC8304h, java.lang.Long> r13, org.threeten.p283bp.temporal.InterfaceC8299e r14, org.threeten.p283bp.format.EnumC8254h r15) {
                /*
                    r12 = this;
                    org.threeten.bp.temporal.a r14 = org.threeten.p283bp.temporal.EnumC8288a.YEAR
                    java.lang.Object r0 = r13.get(r14)
                    java.lang.Long r0 = (java.lang.Long) r0
                    org.threeten.bp.temporal.c$b r1 = org.threeten.p283bp.temporal.C8290c.EnumC8292b.QUARTER_OF_YEAR
                    java.lang.Object r2 = r13.get(r1)
                    java.lang.Long r2 = (java.lang.Long) r2
                    if (r0 == 0) goto L9c
                    if (r2 != 0) goto L16
                    goto L9c
                L16:
                    long r3 = r0.longValue()
                    int r0 = r14.checkValidIntValue(r3)
                    org.threeten.bp.temporal.c$b r3 = org.threeten.p283bp.temporal.C8290c.EnumC8292b.DAY_OF_QUARTER
                    java.lang.Object r3 = r13.get(r3)
                    java.lang.Long r3 = (java.lang.Long) r3
                    long r3 = r3.longValue()
                    org.threeten.bp.format.h r5 = org.threeten.p283bp.format.EnumC8254h.LENIENT
                    r6 = 3
                    r7 = 1
                    r9 = 1
                    if (r15 != r5) goto L4f
                    long r10 = r2.longValue()
                    org.threeten.bp.d r15 = org.threeten.p283bp.C8213d.m16193O(r0, r9, r9)
                    long r9 = p405vf.C11251d.m5617o(r10, r7)
                    long r5 = p405vf.C11251d.m5620l(r9, r6)
                    org.threeten.bp.d r15 = r15.m16187U(r5)
                    long r2 = p405vf.C11251d.m5617o(r3, r7)
                    org.threeten.bp.d r15 = r15.m16188T(r2)
                    goto L92
                L4f:
                    org.threeten.bp.temporal.l r5 = r1.range()
                    long r10 = r2.longValue()
                    int r2 = r5.m15854a(r10, r1)
                    org.threeten.bp.format.h r5 = org.threeten.p283bp.format.EnumC8254h.STRICT
                    if (r15 != r5) goto L7f
                    r15 = 92
                    r5 = 91
                    if (r2 != r9) goto L72
                    org.threeten.bp.chrono.m r15 = org.threeten.p283bp.chrono.C8195m.f21328y
                    long r10 = (long) r0
                    boolean r15 = r15.m16291u(r10)
                    if (r15 == 0) goto L6f
                    goto L75
                L6f:
                    r15 = 90
                    goto L76
                L72:
                    r10 = 2
                    if (r2 != r10) goto L76
                L75:
                    r15 = r5
                L76:
                    long r10 = (long) r15
                    org.threeten.bp.temporal.l r15 = org.threeten.p283bp.temporal.C8315l.m15846i(r7, r10)
                    r15.m15853b(r3, r12)
                    goto L86
                L7f:
                    org.threeten.bp.temporal.l r15 = r12.range()
                    r15.m15853b(r3, r12)
                L86:
                    int r2 = r2 - r9
                    int r2 = r2 * r6
                    int r2 = r2 + r9
                    org.threeten.bp.d r15 = org.threeten.p283bp.C8213d.m16193O(r0, r2, r9)
                    long r3 = r3 - r7
                    org.threeten.bp.d r15 = r15.m16188T(r3)
                L92:
                    r13.remove(r12)
                    r13.remove(r14)
                    r13.remove(r1)
                    return r15
                L9c:
                    r13 = 0
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: org.threeten.p283bp.temporal.C8290c.EnumC8292b.C8293a.resolve(java.util.Map, org.threeten.bp.temporal.e, org.threeten.bp.format.h):org.threeten.bp.temporal.e");
            }

            @Override // java.lang.Enum
            public String toString() {
                return "DayOfQuarter";
            }
        }

        /* compiled from: IsoFields.java */
        /* renamed from: org.threeten.bp.temporal.c$b$b */
        /* loaded from: classes2.dex */
        enum C8294b extends EnumC8292b {
            C8294b(String str, int i) {
                super(str, i, null);
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b, org.threeten.p283bp.temporal.InterfaceC8304h
            public <R extends InterfaceC8298d> R adjustInto(R r, long j) {
                long from = getFrom(r);
                range().m15853b(j, this);
                EnumC8288a enumC8288a = EnumC8288a.MONTH_OF_YEAR;
                return (R) r.mo15874c(enumC8288a, r.getLong(enumC8288a) + ((j - from) * 3));
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b
            public InterfaceC8314k getBaseUnit() {
                return C8290c.f21503e;
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b, org.threeten.p283bp.temporal.InterfaceC8304h
            public long getFrom(InterfaceC8299e interfaceC8299e) {
                if (interfaceC8299e.isSupported(this)) {
                    return (interfaceC8299e.getLong(EnumC8288a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b
            public InterfaceC8314k getRangeUnit() {
                return EnumC8289b.YEARS;
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b, org.threeten.p283bp.temporal.InterfaceC8304h
            public boolean isSupportedBy(InterfaceC8299e interfaceC8299e) {
                return interfaceC8299e.isSupported(EnumC8288a.MONTH_OF_YEAR) && EnumC8292b.isIso(interfaceC8299e);
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b, org.threeten.p283bp.temporal.InterfaceC8304h
            public C8315l range() {
                return C8315l.m15846i(1L, 4L);
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b, org.threeten.p283bp.temporal.InterfaceC8304h
            public C8315l rangeRefinedBy(InterfaceC8299e interfaceC8299e) {
                return range();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "QuarterOfYear";
            }
        }

        /* compiled from: IsoFields.java */
        /* renamed from: org.threeten.bp.temporal.c$b$c */
        /* loaded from: classes2.dex */
        enum C8295c extends EnumC8292b {
            C8295c(String str, int i) {
                super(str, i, null);
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b, org.threeten.p283bp.temporal.InterfaceC8304h
            public <R extends InterfaceC8298d> R adjustInto(R r, long j) {
                range().m15853b(j, this);
                return (R) r.mo15873e(C11251d.m5617o(j, getFrom(r)), EnumC8289b.WEEKS);
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b
            public InterfaceC8314k getBaseUnit() {
                return EnumC8289b.WEEKS;
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b
            public String getDisplayName(Locale locale) {
                C11251d.m5623i(locale, "locale");
                return "Week";
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b, org.threeten.p283bp.temporal.InterfaceC8304h
            public long getFrom(InterfaceC8299e interfaceC8299e) {
                if (interfaceC8299e.isSupported(this)) {
                    return EnumC8292b.getWeek(C8213d.m16160z(interfaceC8299e));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b
            public InterfaceC8314k getRangeUnit() {
                return C8290c.f21502d;
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b, org.threeten.p283bp.temporal.InterfaceC8304h
            public boolean isSupportedBy(InterfaceC8299e interfaceC8299e) {
                return interfaceC8299e.isSupported(EnumC8288a.EPOCH_DAY) && EnumC8292b.isIso(interfaceC8299e);
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b, org.threeten.p283bp.temporal.InterfaceC8304h
            public C8315l range() {
                return C8315l.m15845j(1L, 52L, 53L);
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b, org.threeten.p283bp.temporal.InterfaceC8304h
            public C8315l rangeRefinedBy(InterfaceC8299e interfaceC8299e) {
                if (interfaceC8299e.isSupported(this)) {
                    return EnumC8292b.getWeekRange(C8213d.m16160z(interfaceC8299e));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b
            public InterfaceC8299e resolve(Map<InterfaceC8304h, Long> map, InterfaceC8299e interfaceC8299e, EnumC8254h enumC8254h) {
                InterfaceC8304h interfaceC8304h;
                C8213d mo16165r;
                InterfaceC8304h interfaceC8304h2 = EnumC8292b.WEEK_BASED_YEAR;
                Long l = map.get(interfaceC8304h2);
                EnumC8288a enumC8288a = EnumC8288a.DAY_OF_WEEK;
                Long l2 = map.get(enumC8288a);
                if (l == null || l2 == null) {
                    return null;
                }
                int m15854a = interfaceC8304h2.range().m15854a(l.longValue(), interfaceC8304h2);
                long longValue = map.get(EnumC8292b.WEEK_OF_WEEK_BASED_YEAR).longValue();
                if (enumC8254h == EnumC8254h.LENIENT) {
                    long longValue2 = l2.longValue();
                    long j = 0;
                    if (longValue2 > 7) {
                        long j2 = longValue2 - 1;
                        j = j2 / 7;
                        longValue2 = (j2 % 7) + 1;
                    } else if (longValue2 < 1) {
                        j = (longValue2 / 7) - 1;
                        longValue2 = (longValue2 % 7) + 7;
                    }
                    interfaceC8304h = interfaceC8304h2;
                    mo16165r = C8213d.m16193O(m15854a, 1, 4).m16186V(longValue - 1).m16186V(j).mo16165r(enumC8288a, longValue2);
                } else {
                    interfaceC8304h = interfaceC8304h2;
                    int checkValidIntValue = enumC8288a.checkValidIntValue(l2.longValue());
                    if (enumC8254h == EnumC8254h.STRICT) {
                        EnumC8292b.getWeekRange(C8213d.m16193O(m15854a, 1, 4)).m15853b(longValue, this);
                    } else {
                        range().m15853b(longValue, this);
                    }
                    mo16165r = C8213d.m16193O(m15854a, 1, 4).m16186V(longValue - 1).mo16165r(enumC8288a, checkValidIntValue);
                }
                map.remove(this);
                map.remove(interfaceC8304h);
                map.remove(enumC8288a);
                return mo16165r;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekOfWeekBasedYear";
            }
        }

        /* compiled from: IsoFields.java */
        /* renamed from: org.threeten.bp.temporal.c$b$d */
        /* loaded from: classes2.dex */
        enum C8296d extends EnumC8292b {
            C8296d(String str, int i) {
                super(str, i, null);
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b, org.threeten.p283bp.temporal.InterfaceC8304h
            public <R extends InterfaceC8298d> R adjustInto(R r, long j) {
                EnumC8288a enumC8288a;
                C8213d m16193O;
                if (isSupportedBy(r)) {
                    int m15854a = range().m15854a(j, EnumC8292b.WEEK_BASED_YEAR);
                    C8213d m16160z = C8213d.m16160z(r);
                    int i = m16160z.get(EnumC8288a.DAY_OF_WEEK);
                    int week = EnumC8292b.getWeek(m16160z);
                    if (week == 53 && EnumC8292b.getWeekRange(m15854a) == 52) {
                        week = 52;
                    }
                    return (R) r.mo5633b(C8213d.m16193O(m15854a, 1, 4).m16188T((i - m16193O.get(enumC8288a)) + ((week - 1) * 7)));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b
            public InterfaceC8314k getBaseUnit() {
                return C8290c.f21502d;
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b, org.threeten.p283bp.temporal.InterfaceC8304h
            public long getFrom(InterfaceC8299e interfaceC8299e) {
                if (interfaceC8299e.isSupported(this)) {
                    return EnumC8292b.getWeekBasedYear(C8213d.m16160z(interfaceC8299e));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b
            public InterfaceC8314k getRangeUnit() {
                return EnumC8289b.FOREVER;
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b, org.threeten.p283bp.temporal.InterfaceC8304h
            public boolean isSupportedBy(InterfaceC8299e interfaceC8299e) {
                return interfaceC8299e.isSupported(EnumC8288a.EPOCH_DAY) && EnumC8292b.isIso(interfaceC8299e);
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b, org.threeten.p283bp.temporal.InterfaceC8304h
            public C8315l range() {
                return EnumC8288a.YEAR.range();
            }

            @Override // org.threeten.p283bp.temporal.C8290c.EnumC8292b, org.threeten.p283bp.temporal.InterfaceC8304h
            public C8315l rangeRefinedBy(InterfaceC8299e interfaceC8299e) {
                return EnumC8288a.YEAR.range();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekBasedYear";
            }
        }

        static {
            C8293a c8293a = new C8293a("DAY_OF_QUARTER", 0);
            DAY_OF_QUARTER = c8293a;
            C8294b c8294b = new C8294b("QUARTER_OF_YEAR", 1);
            QUARTER_OF_YEAR = c8294b;
            C8295c c8295c = new C8295c("WEEK_OF_WEEK_BASED_YEAR", 2);
            WEEK_OF_WEEK_BASED_YEAR = c8295c;
            C8296d c8296d = new C8296d("WEEK_BASED_YEAR", 3);
            WEEK_BASED_YEAR = c8296d;
            $VALUES = new EnumC8292b[]{c8293a, c8294b, c8295c, c8296d};
            QUARTER_DAYS = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
        }

        private EnumC8292b(String str, int i) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeek(C8213d c8213d) {
            int ordinal = c8213d.m16204C().ordinal();
            int dayOfYear = c8213d.getDayOfYear() - 1;
            int i = (3 - ordinal) + dayOfYear;
            int i2 = (i - ((i / 7) * 7)) - 3;
            if (i2 < -3) {
                i2 += 7;
            }
            if (dayOfYear < i2) {
                return (int) getWeekRange(c8213d.m16179c0(180).m16195M(1L)).m15852c();
            }
            int i3 = ((dayOfYear - i2) / 7) + 1;
            if (i3 == 53) {
                if (!(i2 == -3 || (i2 == -2 && c8213d.m16200H()))) {
                    return 1;
                }
            }
            return i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeekBasedYear(C8213d c8213d) {
            int year = c8213d.getYear();
            int dayOfYear = c8213d.getDayOfYear();
            if (dayOfYear <= 3) {
                return dayOfYear - c8213d.m16204C().ordinal() < -2 ? year - 1 : year;
            } else if (dayOfYear >= 363) {
                return ((dayOfYear - 363) - (c8213d.m16200H() ? 1 : 0)) - c8213d.m16204C().ordinal() >= 0 ? year + 1 : year;
            } else {
                return year;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C8315l getWeekRange(C8213d c8213d) {
            return C8315l.m15846i(1L, getWeekRange(getWeekBasedYear(c8213d)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isIso(InterfaceC8299e interfaceC8299e) {
            return AbstractC8188h.m16348h(interfaceC8299e).equals(C8195m.f21328y);
        }

        public static EnumC8292b valueOf(String str) {
            return (EnumC8292b) Enum.valueOf(EnumC8292b.class, str);
        }

        public static EnumC8292b[] values() {
            return (EnumC8292b[]) $VALUES.clone();
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8304h
        public abstract /* synthetic */ <R extends InterfaceC8298d> R adjustInto(R r, long j);

        public abstract /* synthetic */ InterfaceC8314k getBaseUnit();

        public String getDisplayName(Locale locale) {
            C11251d.m5623i(locale, "locale");
            return toString();
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8304h
        public abstract /* synthetic */ long getFrom(InterfaceC8299e interfaceC8299e);

        public abstract /* synthetic */ InterfaceC8314k getRangeUnit();

        @Override // org.threeten.p283bp.temporal.InterfaceC8304h
        public boolean isDateBased() {
            return true;
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8304h
        public abstract /* synthetic */ boolean isSupportedBy(InterfaceC8299e interfaceC8299e);

        @Override // org.threeten.p283bp.temporal.InterfaceC8304h
        public boolean isTimeBased() {
            return false;
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8304h
        public abstract /* synthetic */ C8315l range();

        @Override // org.threeten.p283bp.temporal.InterfaceC8304h
        public abstract /* synthetic */ C8315l rangeRefinedBy(InterfaceC8299e interfaceC8299e);

        public InterfaceC8299e resolve(Map<InterfaceC8304h, Long> map, InterfaceC8299e interfaceC8299e, EnumC8254h enumC8254h) {
            return null;
        }

        /* synthetic */ EnumC8292b(String str, int i, C8291a c8291a) {
            this(str, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeekRange(int i) {
            C8213d m16193O = C8213d.m16193O(i, 1, 1);
            if (m16193O.m16204C() != EnumC8168a.THURSDAY) {
                return (m16193O.m16204C() == EnumC8168a.WEDNESDAY && m16193O.m16200H()) ? 53 : 52;
            }
            return 53;
        }
    }

    /* compiled from: IsoFields.java */
    /* renamed from: org.threeten.bp.temporal.c$c */
    /* loaded from: classes2.dex */
    private enum EnumC8297c implements InterfaceC8314k {
        WEEK_BASED_YEARS("WeekBasedYears", C8170b.m16403f(31556952)),
        QUARTER_YEARS("QuarterYears", C8170b.m16403f(7889238));
        
        private final C8170b duration;
        private final String name;

        EnumC8297c(String str, C8170b c8170b) {
            this.name = str;
            this.duration = c8170b;
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8314k
        public <R extends InterfaceC8298d> R addTo(R r, long j) {
            int i = C8291a.f21504a[ordinal()];
            if (i == 1) {
                InterfaceC8304h interfaceC8304h = C8290c.f21501c;
                return (R) r.mo15874c(interfaceC8304h, C11251d.m5621k(r.get(interfaceC8304h), j));
            } else if (i == 2) {
                return (R) r.mo15873e(j / 256, EnumC8289b.YEARS).mo15873e((j % 256) * 3, EnumC8289b.MONTHS);
            } else {
                throw new IllegalStateException("Unreachable");
            }
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8314k
        public long between(InterfaceC8298d interfaceC8298d, InterfaceC8298d interfaceC8298d2) {
            int i = C8291a.f21504a[ordinal()];
            if (i == 1) {
                InterfaceC8304h interfaceC8304h = C8290c.f21501c;
                return C11251d.m5617o(interfaceC8298d2.getLong(interfaceC8304h), interfaceC8298d.getLong(interfaceC8304h));
            } else if (i == 2) {
                return interfaceC8298d.mo15872f(interfaceC8298d2, EnumC8289b.MONTHS) / 3;
            } else {
                throw new IllegalStateException("Unreachable");
            }
        }

        public C8170b getDuration() {
            return this.duration;
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8314k
        public boolean isDateBased() {
            return true;
        }

        public boolean isDurationEstimated() {
            return true;
        }

        public boolean isSupportedBy(InterfaceC8298d interfaceC8298d) {
            return interfaceC8298d.isSupported(EnumC8288a.EPOCH_DAY);
        }

        public boolean isTimeBased() {
            return false;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }

    static {
        EnumC8292b enumC8292b = EnumC8292b.DAY_OF_QUARTER;
        f21499a = EnumC8292b.QUARTER_OF_YEAR;
        f21500b = EnumC8292b.WEEK_OF_WEEK_BASED_YEAR;
        f21501c = EnumC8292b.WEEK_BASED_YEAR;
        f21502d = EnumC8297c.WEEK_BASED_YEARS;
        f21503e = EnumC8297c.QUARTER_YEARS;
    }
}
