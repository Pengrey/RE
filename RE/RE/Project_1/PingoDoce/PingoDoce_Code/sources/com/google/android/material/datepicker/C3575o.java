package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.material.datepicker.o */
/* loaded from: classes.dex */
class C3575o {

    /* renamed from: a */
    static AtomicReference<C3574n> f9932a = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m29853a(long j) {
        Calendar m29843k = m29843k();
        m29843k.setTimeInMillis(j);
        return m29850d(m29843k).getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    /* renamed from: b */
    public static DateFormat m29852b(Locale locale) {
        return m29851c("MMMEd", locale);
    }

    @TargetApi(24)
    /* renamed from: c */
    private static DateFormat m29851c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m29844j());
        return instanceForSkeleton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Calendar m29850d(Calendar calendar) {
        Calendar m29842l = m29842l(calendar);
        Calendar m29843k = m29843k();
        m29843k.set(m29842l.get(1), m29842l.get(2), m29842l.get(5));
        return m29843k;
    }

    /* renamed from: e */
    private static java.text.DateFormat m29849e(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m29846h());
        return dateInstance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static java.text.DateFormat m29848f(Locale locale) {
        return m29849e(0, locale);
    }

    /* renamed from: g */
    static C3574n m29847g() {
        C3574n c3574n = f9932a.get();
        return c3574n == null ? C3574n.m29854c() : c3574n;
    }

    /* renamed from: h */
    private static TimeZone m29846h() {
        return TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static Calendar m29845i() {
        Calendar m29856a = m29847g().m29856a();
        m29856a.set(11, 0);
        m29856a.set(12, 0);
        m29856a.set(13, 0);
        m29856a.set(14, 0);
        m29856a.setTimeZone(m29846h());
        return m29856a;
    }

    @TargetApi(24)
    /* renamed from: j */
    private static android.icu.util.TimeZone m29844j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static Calendar m29843k() {
        return m29842l(null);
    }

    /* renamed from: l */
    static Calendar m29842l(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m29846h());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    /* renamed from: m */
    public static DateFormat m29841m(Locale locale) {
        return m29851c("yMMMEd", locale);
    }
}
