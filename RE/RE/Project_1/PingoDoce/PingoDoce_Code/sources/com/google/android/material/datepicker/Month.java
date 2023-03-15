package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C3539a();

    /* renamed from: A */
    final int f9822A;

    /* renamed from: B */
    final long f9823B;

    /* renamed from: C */
    private String f9824C;

    /* renamed from: w */
    private final Calendar f9825w;

    /* renamed from: x */
    final int f9826x;

    /* renamed from: y */
    final int f9827y;

    /* renamed from: z */
    final int f9828z;

    /* renamed from: com.google.android.material.datepicker.Month$a */
    /* loaded from: classes.dex */
    class C3539a implements Parcelable.Creator<Month> {
        C3539a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Month createFromParcel(Parcel parcel) {
            return Month.m29960c(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Month[] newArray(int i) {
            return new Month[i];
        }
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar m29850d = C3575o.m29850d(calendar);
        this.f9825w = m29850d;
        this.f9826x = m29850d.get(2);
        this.f9827y = m29850d.get(1);
        this.f9828z = m29850d.getMaximum(7);
        this.f9822A = m29850d.getActualMaximum(5);
        this.f9823B = m29850d.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Month m29960c(int i, int i2) {
        Calendar m29843k = C3575o.m29843k();
        m29843k.set(1, i);
        m29843k.set(2, i2);
        return new Month(m29843k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Month m29959d(long j) {
        Calendar m29843k = C3575o.m29843k();
        m29843k.setTimeInMillis(j);
        return new Month(m29843k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static Month m29958e() {
        return new Month(C3575o.m29845i());
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(Month month) {
        return this.f9825w.compareTo(month.f9825w);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Month) {
            Month month = (Month) obj;
            return this.f9826x == month.f9826x && this.f9827y == month.f9827y;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m29957f() {
        int firstDayOfWeek = this.f9825w.get(7) - this.f9825w.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f9828z : firstDayOfWeek;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public long m29956h(int i) {
        Calendar m29850d = C3575o.m29850d(this.f9825w);
        m29850d.set(5, i);
        return m29850d.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9826x), Integer.valueOf(this.f9827y)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m29955i(long j) {
        Calendar m29850d = C3575o.m29850d(this.f9825w);
        m29850d.setTimeInMillis(j);
        return m29850d.get(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public String m29954j() {
        if (this.f9824C == null) {
            this.f9824C = C3542c.m29942c(this.f9825w.getTimeInMillis());
        }
        return this.f9824C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public long m29953k() {
        return this.f9825w.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public Month m29952m(int i) {
        Calendar m29850d = C3575o.m29850d(this.f9825w);
        m29850d.add(2, i);
        return new Month(m29850d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public int m29951n(Month month) {
        if (this.f9825w instanceof GregorianCalendar) {
            return ((month.f9827y - this.f9827y) * 12) + (month.f9826x - this.f9826x);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9827y);
        parcel.writeInt(this.f9826x);
    }
}
