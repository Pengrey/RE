package org.joda.time;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.Serializable;
import java.util.Comparator;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.InstantConverter;
import p070e.C4906j;

/* loaded from: classes2.dex */
public class DateTimeComparator implements Comparator<Object>, Serializable {
    private static final DateTimeComparator ALL_INSTANCE = new DateTimeComparator(null, null);
    private static final DateTimeComparator DATE_INSTANCE = new DateTimeComparator(DateTimeFieldType.dayOfYear(), null);
    private static final DateTimeComparator TIME_INSTANCE = new DateTimeComparator(null, DateTimeFieldType.dayOfYear());
    private static final long serialVersionUID = -6097339773320178364L;
    private final DateTimeFieldType iLowerLimit;
    private final DateTimeFieldType iUpperLimit;

    protected DateTimeComparator(DateTimeFieldType dateTimeFieldType, DateTimeFieldType dateTimeFieldType2) {
        this.iLowerLimit = dateTimeFieldType;
        this.iUpperLimit = dateTimeFieldType2;
    }

    public static DateTimeComparator getDateOnlyInstance() {
        return DATE_INSTANCE;
    }

    public static DateTimeComparator getInstance() {
        return ALL_INSTANCE;
    }

    public static DateTimeComparator getTimeOnlyInstance() {
        return TIME_INSTANCE;
    }

    private Object readResolve() {
        return getInstance(this.iLowerLimit, this.iUpperLimit);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        InstantConverter instantConverter = ConverterManager.getInstance().getInstantConverter(obj);
        Chronology chronology = instantConverter.getChronology(obj, (Chronology) null);
        long instantMillis = instantConverter.getInstantMillis(obj, chronology);
        if (obj == obj2) {
            return 0;
        }
        InstantConverter instantConverter2 = ConverterManager.getInstance().getInstantConverter(obj2);
        Chronology chronology2 = instantConverter2.getChronology(obj2, (Chronology) null);
        long instantMillis2 = instantConverter2.getInstantMillis(obj2, chronology2);
        DateTimeFieldType dateTimeFieldType = this.iLowerLimit;
        if (dateTimeFieldType != null) {
            instantMillis = dateTimeFieldType.getField(chronology).roundFloor(instantMillis);
            instantMillis2 = this.iLowerLimit.getField(chronology2).roundFloor(instantMillis2);
        }
        DateTimeFieldType dateTimeFieldType2 = this.iUpperLimit;
        if (dateTimeFieldType2 != null) {
            instantMillis = dateTimeFieldType2.getField(chronology).remainder(instantMillis);
            instantMillis2 = this.iUpperLimit.getField(chronology2).remainder(instantMillis2);
        }
        int i = (instantMillis > instantMillis2 ? 1 : (instantMillis == instantMillis2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        DateTimeFieldType dateTimeFieldType;
        DateTimeFieldType dateTimeFieldType2;
        if (obj instanceof DateTimeComparator) {
            DateTimeComparator dateTimeComparator = (DateTimeComparator) obj;
            if (this.iLowerLimit == dateTimeComparator.getLowerLimit() || ((dateTimeFieldType2 = this.iLowerLimit) != null && dateTimeFieldType2.equals(dateTimeComparator.getLowerLimit()))) {
                return this.iUpperLimit == dateTimeComparator.getUpperLimit() || ((dateTimeFieldType = this.iUpperLimit) != null && dateTimeFieldType.equals(dateTimeComparator.getUpperLimit()));
            }
            return false;
        }
        return false;
    }

    public DateTimeFieldType getLowerLimit() {
        return this.iLowerLimit;
    }

    public DateTimeFieldType getUpperLimit() {
        return this.iUpperLimit;
    }

    public int hashCode() {
        DateTimeFieldType dateTimeFieldType = this.iLowerLimit;
        int hashCode = dateTimeFieldType == null ? 0 : dateTimeFieldType.hashCode();
        DateTimeFieldType dateTimeFieldType2 = this.iUpperLimit;
        return hashCode + ((dateTimeFieldType2 != null ? dateTimeFieldType2.hashCode() : 0) * C4906j.f13405F0);
    }

    public String toString() {
        DateTimeFieldType dateTimeFieldType = this.iLowerLimit;
        DateTimeFieldType dateTimeFieldType2 = this.iUpperLimit;
        String str = BuildConfig.VERSION_NAME;
        if (dateTimeFieldType == dateTimeFieldType2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DateTimeComparator[");
            DateTimeFieldType dateTimeFieldType3 = this.iLowerLimit;
            if (dateTimeFieldType3 != null) {
                str = dateTimeFieldType3.getName();
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("DateTimeComparator[");
        DateTimeFieldType dateTimeFieldType4 = this.iLowerLimit;
        sb3.append(dateTimeFieldType4 == null ? BuildConfig.VERSION_NAME : dateTimeFieldType4.getName());
        sb3.append("-");
        DateTimeFieldType dateTimeFieldType5 = this.iUpperLimit;
        if (dateTimeFieldType5 != null) {
            str = dateTimeFieldType5.getName();
        }
        sb3.append(str);
        sb3.append("]");
        return sb3.toString();
    }

    public static DateTimeComparator getInstance(DateTimeFieldType dateTimeFieldType) {
        return getInstance(dateTimeFieldType, null);
    }

    public static DateTimeComparator getInstance(DateTimeFieldType dateTimeFieldType, DateTimeFieldType dateTimeFieldType2) {
        if (dateTimeFieldType == null && dateTimeFieldType2 == null) {
            return ALL_INSTANCE;
        }
        if (dateTimeFieldType == DateTimeFieldType.dayOfYear() && dateTimeFieldType2 == null) {
            return DATE_INSTANCE;
        }
        if (dateTimeFieldType == null && dateTimeFieldType2 == DateTimeFieldType.dayOfYear()) {
            return TIME_INSTANCE;
        }
        return new DateTimeComparator(dateTimeFieldType, dateTimeFieldType2);
    }
}
