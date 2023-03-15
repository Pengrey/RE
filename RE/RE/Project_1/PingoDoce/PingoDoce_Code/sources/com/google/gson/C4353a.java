package com.google.gson;

import com.google.gson.stream.C4387a;
import com.google.gson.stream.C4390c;
import com.google.gson.stream.EnumC4389b;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import sa.C10121e;
import sa.C10133j;
import ua.C10861a;

/* renamed from: com.google.gson.a */
/* loaded from: classes.dex */
final class C4353a extends AbstractC4385s<Date> {

    /* renamed from: a */
    private final Class<? extends Date> f11818a;

    /* renamed from: b */
    private final List<DateFormat> f11819b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4353a(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.f11819b = arrayList;
        this.f11818a = m27809g(cls);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    /* renamed from: e */
    private Date m27811e(String str) {
        synchronized (this.f11819b) {
            for (DateFormat dateFormat : this.f11819b) {
                try {
                    return dateFormat.parse(str);
                } catch (ParseException unused) {
                }
            }
            try {
                return C10861a.m6840c(str, new ParsePosition(0));
            } catch (ParseException e) {
                throw new JsonSyntaxException(str, e);
            }
        }
    }

    /* renamed from: g */
    private static Class<? extends Date> m27809g(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    @Override // com.google.gson.AbstractC4385s
    /* renamed from: f */
    public Date mo27782e(C4387a c4387a) throws IOException {
        if (c4387a.mo8038o0() == EnumC4389b.NULL) {
            c4387a.mo8040e0();
            return null;
        }
        Date m27811e = m27811e(c4387a.mo8039j0());
        Class<? extends Date> cls = this.f11818a;
        if (cls == Date.class) {
            return m27811e;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(m27811e.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(m27811e.getTime());
        }
        throw new AssertionError();
    }

    @Override // com.google.gson.AbstractC4385s
    /* renamed from: h */
    public void mo27781f(C4390c c4390c, Date date) throws IOException {
        if (date == null) {
            c4390c.mo8031P();
            return;
        }
        synchronized (this.f11819b) {
            c4390c.mo8025t0(this.f11819b.get(0).format(date));
        }
    }

    public String toString() {
        DateFormat dateFormat = this.f11819b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public C4353a(Class<? extends Date> cls, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f11819b = arrayList;
        this.f11818a = m27809g(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C10121e.m9101e()) {
            arrayList.add(C10133j.m9080c(i, i2));
        }
    }
}
