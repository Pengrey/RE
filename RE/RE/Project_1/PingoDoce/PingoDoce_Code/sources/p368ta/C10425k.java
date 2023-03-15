package p368ta;

import com.google.gson.AbstractC4385s;
import com.google.gson.C4364f;
import com.google.gson.InterfaceC4391t;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.C4387a;
import com.google.gson.stream.C4390c;
import com.google.gson.stream.EnumC4389b;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import p421wa.C11605a;

/* renamed from: ta.k */
/* loaded from: classes2.dex */
public final class C10425k extends AbstractC4385s<Time> {

    /* renamed from: b */
    public static final InterfaceC4391t f27090b = new C10426a();

    /* renamed from: a */
    private final DateFormat f27091a = new SimpleDateFormat("hh:mm:ss a");

    /* compiled from: TimeTypeAdapter.java */
    /* renamed from: ta.k$a */
    /* loaded from: classes2.dex */
    class C10426a implements InterfaceC4391t {
        C10426a() {
        }

        @Override // com.google.gson.InterfaceC4391t
        /* renamed from: a */
        public <T> AbstractC4385s<T> mo7935a(C4364f c4364f, C11605a<T> c11605a) {
            if (c11605a.m4629c() == Time.class) {
                return new C10425k();
            }
            return null;
        }
    }

    @Override // com.google.gson.AbstractC4385s
    /* renamed from: e */
    public synchronized Time mo27782e(C4387a c4387a) throws IOException {
        if (c4387a.mo8038o0() == EnumC4389b.NULL) {
            c4387a.mo8040e0();
            return null;
        }
        try {
            return new Time(this.f27091a.parse(c4387a.mo8039j0()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // com.google.gson.AbstractC4385s
    /* renamed from: f */
    public synchronized void mo27781f(C4390c c4390c, Time time) throws IOException {
        c4390c.mo8025t0(time == null ? null : this.f27091a.format((Date) time));
    }
}
