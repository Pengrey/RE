package org.joda.time.convert;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/* loaded from: classes2.dex */
final class CalendarConverter extends AbstractConverter implements InstantConverter, PartialConverter {
    static final CalendarConverter INSTANCE = new CalendarConverter();

    protected CalendarConverter() {
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter, org.joda.time.convert.PartialConverter
    public Chronology getChronology(Object obj, Chronology chronology) {
        DateTimeZone dateTimeZone;
        if (chronology != null) {
            return chronology;
        }
        Calendar calendar = (Calendar) obj;
        try {
            dateTimeZone = DateTimeZone.forTimeZone(calendar.getTimeZone());
        } catch (IllegalArgumentException unused) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        return getChronology(calendar, dateTimeZone);
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter
    public long getInstantMillis(Object obj, Chronology chronology) {
        return ((Calendar) obj).getTime().getTime();
    }

    @Override // org.joda.time.convert.Converter
    public Class<?> getSupportedType() {
        return Calendar.class;
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter, org.joda.time.convert.PartialConverter
    public Chronology getChronology(Object obj, DateTimeZone dateTimeZone) {
        if (obj.getClass().getName().endsWith(".BuddhistCalendar")) {
            return BuddhistChronology.getInstance(dateTimeZone);
        }
        if (obj instanceof GregorianCalendar) {
            long time = ((GregorianCalendar) obj).getGregorianChange().getTime();
            if (time == Long.MIN_VALUE) {
                return GregorianChronology.getInstance(dateTimeZone);
            }
            if (time == Long.MAX_VALUE) {
                return JulianChronology.getInstance(dateTimeZone);
            }
            return GJChronology.getInstance(dateTimeZone, time, 4);
        }
        return ISOChronology.getInstance(dateTimeZone);
    }
}
