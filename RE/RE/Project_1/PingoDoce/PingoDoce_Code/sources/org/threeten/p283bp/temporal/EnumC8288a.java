package org.threeten.p283bp.temporal;

import java.util.Locale;
import java.util.Map;
import org.threeten.p283bp.format.EnumC8254h;
import p405vf.C11251d;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum NANO_OF_SECOND uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: org.threeten.bp.temporal.a */
/* loaded from: classes2.dex */
public final class EnumC8288a implements InterfaceC8304h {
    private static final /* synthetic */ EnumC8288a[] $VALUES;
    public static final EnumC8288a ALIGNED_DAY_OF_WEEK_IN_MONTH;
    public static final EnumC8288a ALIGNED_DAY_OF_WEEK_IN_YEAR;
    public static final EnumC8288a ALIGNED_WEEK_OF_MONTH;
    public static final EnumC8288a ALIGNED_WEEK_OF_YEAR;
    public static final EnumC8288a AMPM_OF_DAY;
    public static final EnumC8288a CLOCK_HOUR_OF_AMPM;
    public static final EnumC8288a CLOCK_HOUR_OF_DAY;
    public static final EnumC8288a DAY_OF_MONTH;
    public static final EnumC8288a DAY_OF_WEEK;
    public static final EnumC8288a DAY_OF_YEAR;
    public static final EnumC8288a EPOCH_DAY;
    public static final EnumC8288a ERA;
    public static final EnumC8288a HOUR_OF_AMPM;
    public static final EnumC8288a HOUR_OF_DAY;
    public static final EnumC8288a INSTANT_SECONDS;
    public static final EnumC8288a MICRO_OF_DAY;
    public static final EnumC8288a MICRO_OF_SECOND;
    public static final EnumC8288a MILLI_OF_DAY;
    public static final EnumC8288a MILLI_OF_SECOND;
    public static final EnumC8288a MINUTE_OF_DAY;
    public static final EnumC8288a MINUTE_OF_HOUR;
    public static final EnumC8288a MONTH_OF_YEAR;
    public static final EnumC8288a NANO_OF_DAY;
    public static final EnumC8288a NANO_OF_SECOND;
    public static final EnumC8288a OFFSET_SECONDS;
    public static final EnumC8288a PROLEPTIC_MONTH;
    public static final EnumC8288a SECOND_OF_DAY;
    public static final EnumC8288a SECOND_OF_MINUTE;
    public static final EnumC8288a YEAR;
    public static final EnumC8288a YEAR_OF_ERA;
    private final InterfaceC8314k baseUnit;
    private final String name;
    private final C8315l range;
    private final InterfaceC8314k rangeUnit;

    static {
        EnumC8289b enumC8289b = EnumC8289b.NANOS;
        EnumC8289b enumC8289b2 = EnumC8289b.SECONDS;
        EnumC8288a enumC8288a = new EnumC8288a("NANO_OF_SECOND", 0, "NanoOfSecond", enumC8289b, enumC8289b2, C8315l.m15846i(0L, 999999999L));
        NANO_OF_SECOND = enumC8288a;
        EnumC8289b enumC8289b3 = EnumC8289b.DAYS;
        EnumC8288a enumC8288a2 = new EnumC8288a("NANO_OF_DAY", 1, "NanoOfDay", enumC8289b, enumC8289b3, C8315l.m15846i(0L, 86399999999999L));
        NANO_OF_DAY = enumC8288a2;
        EnumC8289b enumC8289b4 = EnumC8289b.MICROS;
        EnumC8288a enumC8288a3 = new EnumC8288a("MICRO_OF_SECOND", 2, "MicroOfSecond", enumC8289b4, enumC8289b2, C8315l.m15846i(0L, 999999L));
        MICRO_OF_SECOND = enumC8288a3;
        EnumC8288a enumC8288a4 = new EnumC8288a("MICRO_OF_DAY", 3, "MicroOfDay", enumC8289b4, enumC8289b3, C8315l.m15846i(0L, 86399999999L));
        MICRO_OF_DAY = enumC8288a4;
        EnumC8289b enumC8289b5 = EnumC8289b.MILLIS;
        EnumC8288a enumC8288a5 = new EnumC8288a("MILLI_OF_SECOND", 4, "MilliOfSecond", enumC8289b5, enumC8289b2, C8315l.m15846i(0L, 999L));
        MILLI_OF_SECOND = enumC8288a5;
        EnumC8288a enumC8288a6 = new EnumC8288a("MILLI_OF_DAY", 5, "MilliOfDay", enumC8289b5, enumC8289b3, C8315l.m15846i(0L, 86399999L));
        MILLI_OF_DAY = enumC8288a6;
        EnumC8289b enumC8289b6 = EnumC8289b.MINUTES;
        EnumC8288a enumC8288a7 = new EnumC8288a("SECOND_OF_MINUTE", 6, "SecondOfMinute", enumC8289b2, enumC8289b6, C8315l.m15846i(0L, 59L));
        SECOND_OF_MINUTE = enumC8288a7;
        EnumC8288a enumC8288a8 = new EnumC8288a("SECOND_OF_DAY", 7, "SecondOfDay", enumC8289b2, enumC8289b3, C8315l.m15846i(0L, 86399L));
        SECOND_OF_DAY = enumC8288a8;
        EnumC8289b enumC8289b7 = EnumC8289b.HOURS;
        EnumC8288a enumC8288a9 = new EnumC8288a("MINUTE_OF_HOUR", 8, "MinuteOfHour", enumC8289b6, enumC8289b7, C8315l.m15846i(0L, 59L));
        MINUTE_OF_HOUR = enumC8288a9;
        EnumC8288a enumC8288a10 = new EnumC8288a("MINUTE_OF_DAY", 9, "MinuteOfDay", enumC8289b6, enumC8289b3, C8315l.m15846i(0L, 1439L));
        MINUTE_OF_DAY = enumC8288a10;
        EnumC8289b enumC8289b8 = EnumC8289b.HALF_DAYS;
        EnumC8288a enumC8288a11 = new EnumC8288a("HOUR_OF_AMPM", 10, "HourOfAmPm", enumC8289b7, enumC8289b8, C8315l.m15846i(0L, 11L));
        HOUR_OF_AMPM = enumC8288a11;
        EnumC8288a enumC8288a12 = new EnumC8288a("CLOCK_HOUR_OF_AMPM", 11, "ClockHourOfAmPm", enumC8289b7, enumC8289b8, C8315l.m15846i(1L, 12L));
        CLOCK_HOUR_OF_AMPM = enumC8288a12;
        EnumC8288a enumC8288a13 = new EnumC8288a("HOUR_OF_DAY", 12, "HourOfDay", enumC8289b7, enumC8289b3, C8315l.m15846i(0L, 23L));
        HOUR_OF_DAY = enumC8288a13;
        EnumC8288a enumC8288a14 = new EnumC8288a("CLOCK_HOUR_OF_DAY", 13, "ClockHourOfDay", enumC8289b7, enumC8289b3, C8315l.m15846i(1L, 24L));
        CLOCK_HOUR_OF_DAY = enumC8288a14;
        EnumC8288a enumC8288a15 = new EnumC8288a("AMPM_OF_DAY", 14, "AmPmOfDay", enumC8289b8, enumC8289b3, C8315l.m15846i(0L, 1L));
        AMPM_OF_DAY = enumC8288a15;
        EnumC8289b enumC8289b9 = EnumC8289b.WEEKS;
        EnumC8288a enumC8288a16 = new EnumC8288a("DAY_OF_WEEK", 15, "DayOfWeek", enumC8289b3, enumC8289b9, C8315l.m15846i(1L, 7L));
        DAY_OF_WEEK = enumC8288a16;
        EnumC8288a enumC8288a17 = new EnumC8288a("ALIGNED_DAY_OF_WEEK_IN_MONTH", 16, "AlignedDayOfWeekInMonth", enumC8289b3, enumC8289b9, C8315l.m15846i(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_MONTH = enumC8288a17;
        EnumC8288a enumC8288a18 = new EnumC8288a("ALIGNED_DAY_OF_WEEK_IN_YEAR", 17, "AlignedDayOfWeekInYear", enumC8289b3, enumC8289b9, C8315l.m15846i(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_YEAR = enumC8288a18;
        EnumC8289b enumC8289b10 = EnumC8289b.MONTHS;
        EnumC8288a enumC8288a19 = new EnumC8288a("DAY_OF_MONTH", 18, "DayOfMonth", enumC8289b3, enumC8289b10, C8315l.m15845j(1L, 28L, 31L));
        DAY_OF_MONTH = enumC8288a19;
        EnumC8289b enumC8289b11 = EnumC8289b.YEARS;
        EnumC8288a enumC8288a20 = new EnumC8288a("DAY_OF_YEAR", 19, "DayOfYear", enumC8289b3, enumC8289b11, C8315l.m15845j(1L, 365L, 366L));
        DAY_OF_YEAR = enumC8288a20;
        EnumC8289b enumC8289b12 = EnumC8289b.FOREVER;
        EnumC8288a enumC8288a21 = new EnumC8288a("EPOCH_DAY", 20, "EpochDay", enumC8289b3, enumC8289b12, C8315l.m15846i(-365243219162L, 365241780471L));
        EPOCH_DAY = enumC8288a21;
        EnumC8288a enumC8288a22 = new EnumC8288a("ALIGNED_WEEK_OF_MONTH", 21, "AlignedWeekOfMonth", enumC8289b9, enumC8289b10, C8315l.m15845j(1L, 4L, 5L));
        ALIGNED_WEEK_OF_MONTH = enumC8288a22;
        EnumC8288a enumC8288a23 = new EnumC8288a("ALIGNED_WEEK_OF_YEAR", 22, "AlignedWeekOfYear", enumC8289b9, enumC8289b11, C8315l.m15846i(1L, 53L));
        ALIGNED_WEEK_OF_YEAR = enumC8288a23;
        EnumC8288a enumC8288a24 = new EnumC8288a("MONTH_OF_YEAR", 23, "MonthOfYear", enumC8289b10, enumC8289b11, C8315l.m15846i(1L, 12L));
        MONTH_OF_YEAR = enumC8288a24;
        EnumC8288a enumC8288a25 = new EnumC8288a("PROLEPTIC_MONTH", 24, "ProlepticMonth", enumC8289b10, enumC8289b12, C8315l.m15846i(-11999999988L, 11999999999L));
        PROLEPTIC_MONTH = enumC8288a25;
        EnumC8288a enumC8288a26 = new EnumC8288a("YEAR_OF_ERA", 25, "YearOfEra", enumC8289b11, enumC8289b12, C8315l.m15845j(1L, 999999999L, 1000000000L));
        YEAR_OF_ERA = enumC8288a26;
        EnumC8288a enumC8288a27 = new EnumC8288a("YEAR", 26, "Year", enumC8289b11, enumC8289b12, C8315l.m15846i(-999999999L, 999999999L));
        YEAR = enumC8288a27;
        EnumC8288a enumC8288a28 = new EnumC8288a("ERA", 27, "Era", EnumC8289b.ERAS, enumC8289b12, C8315l.m15846i(0L, 1L));
        ERA = enumC8288a28;
        EnumC8288a enumC8288a29 = new EnumC8288a("INSTANT_SECONDS", 28, "InstantSeconds", enumC8289b2, enumC8289b12, C8315l.m15846i(Long.MIN_VALUE, Long.MAX_VALUE));
        INSTANT_SECONDS = enumC8288a29;
        EnumC8288a enumC8288a30 = new EnumC8288a("OFFSET_SECONDS", 29, "OffsetSeconds", enumC8289b2, enumC8289b12, C8315l.m15846i(-64800L, 64800L));
        OFFSET_SECONDS = enumC8288a30;
        $VALUES = new EnumC8288a[]{enumC8288a, enumC8288a2, enumC8288a3, enumC8288a4, enumC8288a5, enumC8288a6, enumC8288a7, enumC8288a8, enumC8288a9, enumC8288a10, enumC8288a11, enumC8288a12, enumC8288a13, enumC8288a14, enumC8288a15, enumC8288a16, enumC8288a17, enumC8288a18, enumC8288a19, enumC8288a20, enumC8288a21, enumC8288a22, enumC8288a23, enumC8288a24, enumC8288a25, enumC8288a26, enumC8288a27, enumC8288a28, enumC8288a29, enumC8288a30};
    }

    private EnumC8288a(String str, int i, String str2, InterfaceC8314k interfaceC8314k, InterfaceC8314k interfaceC8314k2, C8315l c8315l) {
        this.name = str2;
        this.baseUnit = interfaceC8314k;
        this.rangeUnit = interfaceC8314k2;
        this.range = c8315l;
    }

    public static EnumC8288a valueOf(String str) {
        return (EnumC8288a) Enum.valueOf(EnumC8288a.class, str);
    }

    public static EnumC8288a[] values() {
        return (EnumC8288a[]) $VALUES.clone();
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8304h
    public <R extends InterfaceC8298d> R adjustInto(R r, long j) {
        return (R) r.mo15874c(this, j);
    }

    public int checkValidIntValue(long j) {
        return range().m15854a(j, this);
    }

    public long checkValidValue(long j) {
        return range().m15853b(j, this);
    }

    public InterfaceC8314k getBaseUnit() {
        return this.baseUnit;
    }

    public String getDisplayName(Locale locale) {
        C11251d.m5623i(locale, "locale");
        return toString();
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8304h
    public long getFrom(InterfaceC8299e interfaceC8299e) {
        return interfaceC8299e.getLong(this);
    }

    public InterfaceC8314k getRangeUnit() {
        return this.rangeUnit;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8304h
    public boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8304h
    public boolean isSupportedBy(InterfaceC8299e interfaceC8299e) {
        return interfaceC8299e.isSupported(this);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8304h
    public boolean isTimeBased() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8304h
    public C8315l range() {
        return this.range;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8304h
    public C8315l rangeRefinedBy(InterfaceC8299e interfaceC8299e) {
        return interfaceC8299e.range(this);
    }

    public InterfaceC8299e resolve(Map<InterfaceC8304h, Long> map, InterfaceC8299e interfaceC8299e, EnumC8254h enumC8254h) {
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
