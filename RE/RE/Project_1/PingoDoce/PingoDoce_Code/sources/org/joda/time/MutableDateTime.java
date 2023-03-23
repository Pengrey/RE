package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Objects;
import org.joda.convert.FromString;
import org.joda.time.base.BaseDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* loaded from: classes2.dex */
public class MutableDateTime extends BaseDateTime implements ReadWritableDateTime, Cloneable {
    public static final int ROUND_CEILING = 2;
    public static final int ROUND_FLOOR = 1;
    public static final int ROUND_HALF_CEILING = 4;
    public static final int ROUND_HALF_EVEN = 5;
    public static final int ROUND_HALF_FLOOR = 3;
    public static final int ROUND_NONE = 0;
    private static final long serialVersionUID = 2852608688135209575L;
    private DateTimeField iRoundingField;
    private int iRoundingMode;

    public MutableDateTime() {
    }

    public static MutableDateTime now() {
        return new MutableDateTime();
    }

    @FromString
    public static MutableDateTime parse(String str) {
        return parse(str, ISODateTimeFormat.dateTimeParser().withOffsetParsed());
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(long j) {
        setMillis(FieldUtils.safeAdd(getMillis(), j));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addDays(int i) {
        if (i != 0) {
            setMillis(getChronology().days().add(getMillis(), i));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addHours(int i) {
        if (i != 0) {
            setMillis(getChronology().hours().add(getMillis(), i));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addMillis(int i) {
        if (i != 0) {
            setMillis(getChronology().millis().add(getMillis(), i));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addMinutes(int i) {
        if (i != 0) {
            setMillis(getChronology().minutes().add(getMillis(), i));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addMonths(int i) {
        if (i != 0) {
            setMillis(getChronology().months().add(getMillis(), i));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addSeconds(int i) {
        if (i != 0) {
            setMillis(getChronology().seconds().add(getMillis(), i));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addWeeks(int i) {
        if (i != 0) {
            setMillis(getChronology().weeks().add(getMillis(), i));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addWeekyears(int i) {
        if (i != 0) {
            setMillis(getChronology().weekyears().add(getMillis(), i));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addYears(int i) {
        if (i != 0) {
            setMillis(getChronology().years().add(getMillis(), i));
        }
    }

    public Property centuryOfEra() {
        return new Property(this, getChronology().centuryOfEra());
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    public MutableDateTime copy() {
        return (MutableDateTime) clone();
    }

    public Property dayOfMonth() {
        return new Property(this, getChronology().dayOfMonth());
    }

    public Property dayOfWeek() {
        return new Property(this, getChronology().dayOfWeek());
    }

    public Property dayOfYear() {
        return new Property(this, getChronology().dayOfYear());
    }

    public Property era() {
        return new Property(this, getChronology().era());
    }

    public DateTimeField getRoundingField() {
        return this.iRoundingField;
    }

    public int getRoundingMode() {
        return this.iRoundingMode;
    }

    public Property hourOfDay() {
        return new Property(this, getChronology().hourOfDay());
    }

    public Property millisOfDay() {
        return new Property(this, getChronology().millisOfDay());
    }

    public Property millisOfSecond() {
        return new Property(this, getChronology().millisOfSecond());
    }

    public Property minuteOfDay() {
        return new Property(this, getChronology().minuteOfDay());
    }

    public Property minuteOfHour() {
        return new Property(this, getChronology().minuteOfHour());
    }

    public Property monthOfYear() {
        return new Property(this, getChronology().monthOfYear());
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            DateTimeField field = dateTimeFieldType.getField(getChronology());
            if (field.isSupported()) {
                return new Property(this, field);
            }
            throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    public Property secondOfDay() {
        return new Property(this, getChronology().secondOfDay());
    }

    public Property secondOfMinute() {
        return new Property(this, getChronology().secondOfMinute());
    }

    @Override // org.joda.time.ReadWritableInstant
    public void set(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType != null) {
            setMillis(dateTimeFieldType.getField(getChronology()).set(getMillis(), i));
            return;
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    @Override // org.joda.time.base.BaseDateTime, org.joda.time.ReadWritableInstant
    public void setChronology(Chronology chronology) {
        super.setChronology(chronology);
    }

    public void setDate(long j) {
        setMillis(getChronology().millisOfDay().set(j, getMillisOfDay()));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        setMillis(getChronology().getDateTimeMillis(i, i2, i3, i4, i5, i6, i7));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setDayOfMonth(int i) {
        setMillis(getChronology().dayOfMonth().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setDayOfWeek(int i) {
        setMillis(getChronology().dayOfWeek().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setDayOfYear(int i) {
        setMillis(getChronology().dayOfYear().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setHourOfDay(int i) {
        setMillis(getChronology().hourOfDay().set(getMillis(), i));
    }

    @Override // org.joda.time.base.BaseDateTime, org.joda.time.ReadWritableInstant
    public void setMillis(long j) {
        int i = this.iRoundingMode;
        if (i == 1) {
            j = this.iRoundingField.roundFloor(j);
        } else if (i == 2) {
            j = this.iRoundingField.roundCeiling(j);
        } else if (i == 3) {
            j = this.iRoundingField.roundHalfFloor(j);
        } else if (i == 4) {
            j = this.iRoundingField.roundHalfCeiling(j);
        } else if (i == 5) {
            j = this.iRoundingField.roundHalfEven(j);
        }
        super.setMillis(j);
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setMillisOfDay(int i) {
        setMillis(getChronology().millisOfDay().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setMillisOfSecond(int i) {
        setMillis(getChronology().millisOfSecond().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setMinuteOfDay(int i) {
        setMillis(getChronology().minuteOfDay().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setMinuteOfHour(int i) {
        setMillis(getChronology().minuteOfHour().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setMonthOfYear(int i) {
        setMillis(getChronology().monthOfYear().set(getMillis(), i));
    }

    public void setRounding(DateTimeField dateTimeField) {
        setRounding(dateTimeField, 1);
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setSecondOfDay(int i) {
        setMillis(getChronology().secondOfDay().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setSecondOfMinute(int i) {
        setMillis(getChronology().secondOfMinute().set(getMillis(), i));
    }

    public void setTime(long j) {
        setMillis(getChronology().millisOfDay().set(getMillis(), ISOChronology.getInstanceUTC().millisOfDay().get(j)));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setWeekOfWeekyear(int i) {
        setMillis(getChronology().weekOfWeekyear().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setWeekyear(int i) {
        setMillis(getChronology().weekyear().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setYear(int i) {
        setMillis(getChronology().year().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableInstant
    public void setZone(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        Chronology chronology = getChronology();
        if (chronology.getZone() != zone) {
            setChronology(chronology.withZone(zone));
        }
    }

    @Override // org.joda.time.ReadWritableInstant
    public void setZoneRetainFields(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        DateTimeZone zone2 = DateTimeUtils.getZone(getZone());
        if (zone == zone2) {
            return;
        }
        long millisKeepLocal = zone2.getMillisKeepLocal(zone, getMillis());
        setChronology(getChronology().withZone(zone));
        setMillis(millisKeepLocal);
    }

    public Property weekOfWeekyear() {
        return new Property(this, getChronology().weekOfWeekyear());
    }

    public Property weekyear() {
        return new Property(this, getChronology().weekyear());
    }

    public Property year() {
        return new Property(this, getChronology().year());
    }

    public Property yearOfCentury() {
        return new Property(this, getChronology().yearOfCentury());
    }

    public Property yearOfEra() {
        return new Property(this, getChronology().yearOfEra());
    }

    /* loaded from: classes2.dex */
    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -4481126543819298617L;
        private DateTimeField iField;
        private MutableDateTime iInstant;

        Property(MutableDateTime mutableDateTime, DateTimeField dateTimeField) {
            this.iInstant = mutableDateTime;
            this.iField = dateTimeField;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.iInstant = (MutableDateTime) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public MutableDateTime add(int i) {
            this.iInstant.setMillis(getField().add(this.iInstant.getMillis(), i));
            return this.iInstant;
        }

        public MutableDateTime addWrapField(int i) {
            this.iInstant.setMillis(getField().addWrapField(this.iInstant.getMillis(), i));
            return this.iInstant;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        protected Chronology getChronology() {
            return this.iInstant.getChronology();
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public DateTimeField getField() {
            return this.iField;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        protected long getMillis() {
            return this.iInstant.getMillis();
        }

        public MutableDateTime getMutableDateTime() {
            return this.iInstant;
        }

        public MutableDateTime roundCeiling() {
            this.iInstant.setMillis(getField().roundCeiling(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime roundFloor() {
            this.iInstant.setMillis(getField().roundFloor(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime roundHalfCeiling() {
            this.iInstant.setMillis(getField().roundHalfCeiling(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime roundHalfEven() {
            this.iInstant.setMillis(getField().roundHalfEven(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime roundHalfFloor() {
            this.iInstant.setMillis(getField().roundHalfFloor(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime set(int i) {
            this.iInstant.setMillis(getField().set(this.iInstant.getMillis(), i));
            return this.iInstant;
        }

        public MutableDateTime add(long j) {
            this.iInstant.setMillis(getField().add(this.iInstant.getMillis(), j));
            return this.iInstant;
        }

        public MutableDateTime set(String str, Locale locale) {
            this.iInstant.setMillis(getField().set(this.iInstant.getMillis(), str, locale));
            return this.iInstant;
        }

        public MutableDateTime set(String str) {
            set(str, null);
            return this.iInstant;
        }
    }

    public MutableDateTime(DateTimeZone dateTimeZone) {
        super(dateTimeZone);
    }

    public static MutableDateTime now(DateTimeZone dateTimeZone) {
        Objects.requireNonNull(dateTimeZone, "Zone must not be null");
        return new MutableDateTime(dateTimeZone);
    }

    public static MutableDateTime parse(String str, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.parseDateTime(str).toMutableDateTime();
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(ReadableDuration readableDuration) {
        add(readableDuration, 1);
    }

    public void setDate(ReadableInstant readableInstant) {
        DateTimeZone zone;
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        if ((readableInstant instanceof ReadableDateTime) && (zone = DateTimeUtils.getChronology(((ReadableDateTime) readableInstant).getChronology()).getZone()) != null) {
            instantMillis = zone.getMillisKeepLocal(getZone(), instantMillis);
        }
        setDate(instantMillis);
    }

    public void setRounding(DateTimeField dateTimeField, int i) {
        if (dateTimeField != null && (i < 0 || i > 5)) {
            throw new IllegalArgumentException("Illegal rounding mode: " + i);
        }
        this.iRoundingField = i == 0 ? null : dateTimeField;
        if (dateTimeField == null) {
            i = 0;
        }
        this.iRoundingMode = i;
        setMillis(getMillis());
    }

    public MutableDateTime(Chronology chronology) {
        super(chronology);
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(ReadableDuration readableDuration, int i) {
        if (readableDuration != null) {
            add(FieldUtils.safeMultiply(readableDuration.getMillis(), i));
        }
    }

    public void setTime(ReadableInstant readableInstant) {
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        DateTimeZone zone = DateTimeUtils.getInstantChronology(readableInstant).getZone();
        if (zone != null) {
            instantMillis = zone.getMillisKeepLocal(DateTimeZone.UTC, instantMillis);
        }
        setTime(instantMillis);
    }

    public MutableDateTime(long j) {
        super(j);
    }

    public static MutableDateTime now(Chronology chronology) {
        Objects.requireNonNull(chronology, "Chronology must not be null");
        return new MutableDateTime(chronology);
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(ReadablePeriod readablePeriod) {
        add(readablePeriod, 1);
    }

    public MutableDateTime(long j, DateTimeZone dateTimeZone) {
        super(j, dateTimeZone);
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(ReadablePeriod readablePeriod, int i) {
        if (readablePeriod != null) {
            setMillis(getChronology().add(readablePeriod, getMillis(), i));
        }
    }

    public MutableDateTime(long j, Chronology chronology) {
        super(j, chronology);
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (i != 0) {
            setMillis(durationFieldType.getField(getChronology()).add(getMillis(), i));
        }
    }

    public MutableDateTime(Object obj) {
        super(obj, (Chronology) null);
    }

    public MutableDateTime(Object obj, DateTimeZone dateTimeZone) {
        super(obj, dateTimeZone);
    }

    @Override // org.joda.time.ReadWritableInstant
    public void setMillis(ReadableInstant readableInstant) {
        setMillis(DateTimeUtils.getInstantMillis(readableInstant));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setTime(int i, int i2, int i3, int i4) {
        setMillis(getChronology().getDateTimeMillis(getMillis(), i, i2, i3, i4));
    }

    public MutableDateTime(Object obj, Chronology chronology) {
        super(obj, DateTimeUtils.getChronology(chronology));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setDate(int i, int i2, int i3) {
        setDate(getChronology().getDateTimeMillis(i, i2, i3, 0));
    }

    public MutableDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(i, i2, i3, i4, i5, i6, i7);
    }

    public MutableDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, DateTimeZone dateTimeZone) {
        super(i, i2, i3, i4, i5, i6, i7, dateTimeZone);
    }

    public MutableDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, Chronology chronology) {
        super(i, i2, i3, i4, i5, i6, i7, chronology);
    }
}