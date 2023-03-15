package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PeriodConverter;
import org.joda.time.field.FieldUtils;

/* loaded from: classes2.dex */
public abstract class BasePeriod extends AbstractPeriod implements Serializable {
    private static final ReadablePeriod DUMMY_PERIOD = new AbstractPeriod() { // from class: org.joda.time.base.BasePeriod.1
        @Override // org.joda.time.ReadablePeriod
        public PeriodType getPeriodType() {
            return PeriodType.time();
        }

        @Override // org.joda.time.ReadablePeriod
        public int getValue(int i) {
            return 0;
        }
    };
    private static final long serialVersionUID = -2110953284060001145L;
    private final PeriodType iType;
    private final int[] iValues;

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PeriodType periodType) {
        this.iType = checkPeriodType(periodType);
        this.iValues = setPeriodInternal(i, i2, i3, i4, i5, i6, i7, i8);
    }

    private void checkAndUpdate(DurationFieldType durationFieldType, int[] iArr, int i) {
        int indexOf = indexOf(durationFieldType);
        if (indexOf != -1) {
            iArr[indexOf] = i;
        } else if (i == 0) {
        } else {
            throw new IllegalArgumentException("Period does not support field '" + durationFieldType.getName() + "'");
        }
    }

    private void setPeriodInternal(ReadablePeriod readablePeriod) {
        int[] iArr = new int[size()];
        int size = readablePeriod.size();
        for (int i = 0; i < size; i++) {
            checkAndUpdate(readablePeriod.getFieldType(i), iArr, readablePeriod.getValue(i));
        }
        setValues(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addField(DurationFieldType durationFieldType, int i) {
        addFieldInto(this.iValues, durationFieldType, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addFieldInto(int[] iArr, DurationFieldType durationFieldType, int i) {
        int indexOf = indexOf(durationFieldType);
        if (indexOf != -1) {
            iArr[indexOf] = FieldUtils.safeAdd(iArr[indexOf], i);
        } else if (i != 0 || durationFieldType == null) {
            throw new IllegalArgumentException("Period does not support field '" + durationFieldType + "'");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addPeriod(ReadablePeriod readablePeriod) {
        if (readablePeriod != null) {
            setValues(addPeriodInto(getValues(), readablePeriod));
        }
    }

    protected int[] addPeriodInto(int[] iArr, ReadablePeriod readablePeriod) {
        int size = readablePeriod.size();
        for (int i = 0; i < size; i++) {
            DurationFieldType fieldType = readablePeriod.getFieldType(i);
            int value = readablePeriod.getValue(i);
            if (value != 0) {
                int indexOf = indexOf(fieldType);
                if (indexOf != -1) {
                    iArr[indexOf] = FieldUtils.safeAdd(getValue(indexOf), value);
                } else {
                    throw new IllegalArgumentException("Period does not support field '" + fieldType.getName() + "'");
                }
            }
        }
        return iArr;
    }

    protected PeriodType checkPeriodType(PeriodType periodType) {
        return DateTimeUtils.getPeriodType(periodType);
    }

    @Override // org.joda.time.ReadablePeriod
    public PeriodType getPeriodType() {
        return this.iType;
    }

    @Override // org.joda.time.ReadablePeriod
    public int getValue(int i) {
        return this.iValues[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void mergePeriod(ReadablePeriod readablePeriod) {
        if (readablePeriod != null) {
            setValues(mergePeriodInto(getValues(), readablePeriod));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int[] mergePeriodInto(int[] iArr, ReadablePeriod readablePeriod) {
        int size = readablePeriod.size();
        for (int i = 0; i < size; i++) {
            checkAndUpdate(readablePeriod.getFieldType(i), iArr, readablePeriod.getValue(i));
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setField(DurationFieldType durationFieldType, int i) {
        setFieldInto(this.iValues, durationFieldType, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setFieldInto(int[] iArr, DurationFieldType durationFieldType, int i) {
        int indexOf = indexOf(durationFieldType);
        if (indexOf != -1) {
            iArr[indexOf] = i;
        } else if (i != 0 || durationFieldType == null) {
            throw new IllegalArgumentException("Period does not support field '" + durationFieldType + "'");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setPeriod(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            setValues(new int[size()]);
        } else {
            setPeriodInternal(readablePeriod);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setValue(int i, int i2) {
        this.iValues[i] = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setValues(int[] iArr) {
        int[] iArr2 = this.iValues;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
    }

    public Duration toDurationFrom(ReadableInstant readableInstant) {
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        return new Duration(instantMillis, DateTimeUtils.getInstantChronology(readableInstant).add(this, instantMillis, 1));
    }

    public Duration toDurationTo(ReadableInstant readableInstant) {
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        return new Duration(DateTimeUtils.getInstantChronology(readableInstant).add(this, instantMillis, -1), instantMillis);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setPeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        setValues(setPeriodInternal(i, i2, i3, i4, i5, i6, i7, i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePeriod(long j, long j2, PeriodType periodType, Chronology chronology) {
        PeriodType checkPeriodType = checkPeriodType(periodType);
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        this.iType = checkPeriodType;
        this.iValues = chronology2.get(this, j, j2);
    }

    private int[] setPeriodInternal(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int[] iArr = new int[size()];
        checkAndUpdate(DurationFieldType.years(), iArr, i);
        checkAndUpdate(DurationFieldType.months(), iArr, i2);
        checkAndUpdate(DurationFieldType.weeks(), iArr, i3);
        checkAndUpdate(DurationFieldType.days(), iArr, i4);
        checkAndUpdate(DurationFieldType.hours(), iArr, i5);
        checkAndUpdate(DurationFieldType.minutes(), iArr, i6);
        checkAndUpdate(DurationFieldType.seconds(), iArr, i7);
        checkAndUpdate(DurationFieldType.millis(), iArr, i8);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePeriod(ReadableInstant readableInstant, ReadableInstant readableInstant2, PeriodType periodType) {
        PeriodType checkPeriodType = checkPeriodType(periodType);
        if (readableInstant == null && readableInstant2 == null) {
            this.iType = checkPeriodType;
            this.iValues = new int[size()];
            return;
        }
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        long instantMillis2 = DateTimeUtils.getInstantMillis(readableInstant2);
        Chronology intervalChronology = DateTimeUtils.getIntervalChronology(readableInstant, readableInstant2);
        this.iType = checkPeriodType;
        this.iValues = intervalChronology.get(this, instantMillis, instantMillis2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePeriod(ReadablePartial readablePartial, ReadablePartial readablePartial2, PeriodType periodType) {
        if (readablePartial != null && readablePartial2 != null) {
            if ((readablePartial instanceof BaseLocal) && (readablePartial2 instanceof BaseLocal) && readablePartial.getClass() == readablePartial2.getClass()) {
                PeriodType checkPeriodType = checkPeriodType(periodType);
                long localMillis = ((BaseLocal) readablePartial).getLocalMillis();
                long localMillis2 = ((BaseLocal) readablePartial2).getLocalMillis();
                Chronology chronology = DateTimeUtils.getChronology(readablePartial.getChronology());
                this.iType = checkPeriodType;
                this.iValues = chronology.get(this, localMillis, localMillis2);
                return;
            } else if (readablePartial.size() == readablePartial2.size()) {
                int size = readablePartial.size();
                for (int i = 0; i < size; i++) {
                    if (readablePartial.getFieldType(i) != readablePartial2.getFieldType(i)) {
                        throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
                    }
                }
                if (DateTimeUtils.isContiguous(readablePartial)) {
                    this.iType = checkPeriodType(periodType);
                    Chronology withUTC = DateTimeUtils.getChronology(readablePartial.getChronology()).withUTC();
                    this.iValues = withUTC.get(this, withUTC.set(readablePartial, 0L), withUTC.set(readablePartial2, 0L));
                    return;
                }
                throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
            } else {
                throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
            }
        }
        throw new IllegalArgumentException("ReadablePartial objects must not be null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePeriod(ReadableInstant readableInstant, ReadableDuration readableDuration, PeriodType periodType) {
        PeriodType checkPeriodType = checkPeriodType(periodType);
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        long safeAdd = FieldUtils.safeAdd(instantMillis, DateTimeUtils.getDurationMillis(readableDuration));
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iType = checkPeriodType;
        this.iValues = instantChronology.get(this, instantMillis, safeAdd);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePeriod(ReadableDuration readableDuration, ReadableInstant readableInstant, PeriodType periodType) {
        PeriodType checkPeriodType = checkPeriodType(periodType);
        long durationMillis = DateTimeUtils.getDurationMillis(readableDuration);
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        long safeSubtract = FieldUtils.safeSubtract(instantMillis, durationMillis);
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iType = checkPeriodType;
        this.iValues = instantChronology.get(this, safeSubtract, instantMillis);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePeriod(long j) {
        this.iType = PeriodType.standard();
        int[] iArr = ISOChronology.getInstanceUTC().get(DUMMY_PERIOD, j);
        int[] iArr2 = new int[8];
        this.iValues = iArr2;
        System.arraycopy(iArr, 0, iArr2, 4, 4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePeriod(long j, PeriodType periodType, Chronology chronology) {
        PeriodType checkPeriodType = checkPeriodType(periodType);
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        this.iType = checkPeriodType;
        this.iValues = chronology2.get(this, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePeriod(Object obj, PeriodType periodType, Chronology chronology) {
        PeriodConverter periodConverter = ConverterManager.getInstance().getPeriodConverter(obj);
        PeriodType checkPeriodType = checkPeriodType(periodType == null ? periodConverter.getPeriodType(obj) : periodType);
        this.iType = checkPeriodType;
        if (this instanceof ReadWritablePeriod) {
            this.iValues = new int[size()];
            periodConverter.setInto((ReadWritablePeriod) this, obj, DateTimeUtils.getChronology(chronology));
            return;
        }
        this.iValues = new MutablePeriod(obj, checkPeriodType, chronology).getValues();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePeriod(int[] iArr, PeriodType periodType) {
        this.iType = periodType;
        this.iValues = iArr;
    }
}
