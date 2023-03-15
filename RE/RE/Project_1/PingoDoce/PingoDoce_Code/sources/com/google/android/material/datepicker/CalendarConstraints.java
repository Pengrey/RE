package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.util.C1070c;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C3535a();

    /* renamed from: A */
    private final int f9807A;

    /* renamed from: B */
    private final int f9808B;

    /* renamed from: w */
    private final Month f9809w;

    /* renamed from: x */
    private final Month f9810x;

    /* renamed from: y */
    private final DateValidator f9811y;

    /* renamed from: z */
    private Month f9812z;

    /* loaded from: classes.dex */
    public interface DateValidator extends Parcelable {
        /* renamed from: p */
        boolean mo29969p(long j);
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$a */
    /* loaded from: classes.dex */
    class C3535a implements Parcelable.Creator<CalendarConstraints> {
        C3535a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$b */
    /* loaded from: classes.dex */
    public static final class C3536b {

        /* renamed from: e */
        static final long f9813e = C3575o.m29853a(Month.m29960c(1900, 0).f9823B);

        /* renamed from: f */
        static final long f9814f = C3575o.m29853a(Month.m29960c(2100, 11).f9823B);

        /* renamed from: a */
        private long f9815a;

        /* renamed from: b */
        private long f9816b;

        /* renamed from: c */
        private Long f9817c;

        /* renamed from: d */
        private DateValidator f9818d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C3536b(CalendarConstraints calendarConstraints) {
            this.f9815a = f9813e;
            this.f9816b = f9814f;
            this.f9818d = DateValidatorPointForward.m29970a(Long.MIN_VALUE);
            this.f9815a = calendarConstraints.f9809w.f9823B;
            this.f9816b = calendarConstraints.f9810x.f9823B;
            this.f9817c = Long.valueOf(calendarConstraints.f9812z.f9823B);
            this.f9818d = calendarConstraints.f9811y;
        }

        /* renamed from: a */
        public CalendarConstraints m29980a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f9818d);
            Month m29959d = Month.m29959d(this.f9815a);
            Month m29959d2 = Month.m29959d(this.f9816b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.f9817c;
            return new CalendarConstraints(m29959d, m29959d2, dateValidator, l == null ? null : Month.m29959d(l.longValue()), null);
        }

        /* renamed from: b */
        public C3536b m29979b(long j) {
            this.f9817c = Long.valueOf(j);
            return this;
        }
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, C3535a c3535a) {
        this(month, month2, dateValidator, month3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Month m29989e(Month month) {
        if (month.compareTo(this.f9809w) < 0) {
            return this.f9809w;
        }
        return month.compareTo(this.f9810x) > 0 ? this.f9810x : month;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CalendarConstraints) {
            CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
            return this.f9809w.equals(calendarConstraints.f9809w) && this.f9810x.equals(calendarConstraints.f9810x) && C1070c.m38634a(this.f9812z, calendarConstraints.f9812z) && this.f9811y.equals(calendarConstraints.f9811y);
        }
        return false;
    }

    /* renamed from: f */
    public DateValidator m29988f() {
        return this.f9811y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Month m29987h() {
        return this.f9810x;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9809w, this.f9810x, this.f9812z, this.f9811y});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m29986i() {
        return this.f9808B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public Month m29985j() {
        return this.f9812z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public Month m29984k() {
        return this.f9809w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m29983m() {
        return this.f9807A;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f9809w, 0);
        parcel.writeParcelable(this.f9810x, 0);
        parcel.writeParcelable(this.f9812z, 0);
        parcel.writeParcelable(this.f9811y, 0);
    }

    private CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3) {
        this.f9809w = month;
        this.f9810x = month2;
        this.f9812z = month3;
        this.f9811y = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f9808B = month.m29951n(month2) + 1;
        this.f9807A = (month2.f9827y - month.f9827y) + 1;
    }
}
