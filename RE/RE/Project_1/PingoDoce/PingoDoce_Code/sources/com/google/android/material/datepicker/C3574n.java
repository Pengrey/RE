package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: com.google.android.material.datepicker.n */
/* loaded from: classes.dex */
class C3574n {

    /* renamed from: c */
    private static final C3574n f9929c = new C3574n(null, null);

    /* renamed from: a */
    private final Long f9930a;

    /* renamed from: b */
    private final TimeZone f9931b;

    private C3574n(Long l, TimeZone timeZone) {
        this.f9930a = l;
        this.f9931b = timeZone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C3574n m29854c() {
        return f9929c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Calendar m29856a() {
        return m29855b(this.f9931b);
    }

    /* renamed from: b */
    Calendar m29855b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.f9930a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
