package p368ta;

import com.google.gson.AbstractC4385s;
import com.google.gson.C4364f;
import com.google.gson.InterfaceC4391t;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.C4387a;
import com.google.gson.stream.C4390c;
import com.google.gson.stream.EnumC4389b;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p421wa.C11605a;
import sa.C10121e;
import sa.C10133j;
import ua.C10861a;

/* renamed from: ta.c */
/* loaded from: classes2.dex */
public final class C10407c extends AbstractC4385s<Date> {

    /* renamed from: b */
    public static final InterfaceC4391t f27050b = new C10408a();

    /* renamed from: a */
    private final List<DateFormat> f27051a;

    /* compiled from: DateTypeAdapter.java */
    /* renamed from: ta.c$a */
    /* loaded from: classes2.dex */
    class C10408a implements InterfaceC4391t {
        C10408a() {
        }

        @Override // com.google.gson.InterfaceC4391t
        /* renamed from: a */
        public <T> AbstractC4385s<T> mo7935a(C4364f c4364f, C11605a<T> c11605a) {
            if (c11605a.m4629c() == Date.class) {
                return new C10407c();
            }
            return null;
        }
    }

    public C10407c() {
        ArrayList arrayList = new ArrayList();
        this.f27051a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C10121e.m9101e()) {
            arrayList.add(C10133j.m9080c(2, 2));
        }
    }

    /* renamed from: e */
    private synchronized Date m8060e(String str) {
        for (DateFormat dateFormat : this.f27051a) {
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

    @Override // com.google.gson.AbstractC4385s
    /* renamed from: f */
    public Date mo27782e(C4387a c4387a) throws IOException {
        if (c4387a.mo8038o0() == EnumC4389b.NULL) {
            c4387a.mo8040e0();
            return null;
        }
        return m8060e(c4387a.mo8039j0());
    }

    @Override // com.google.gson.AbstractC4385s
    /* renamed from: g */
    public synchronized void mo27781f(C4390c c4390c, Date date) throws IOException {
        if (date == null) {
            c4390c.mo8031P();
        } else {
            c4390c.mo8025t0(this.f27051a.get(0).format(date));
        }
    }
}
