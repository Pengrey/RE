package org.threeten.p283bp.format;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import org.threeten.p283bp.AbstractC8280n;
import org.threeten.p283bp.DateTimeException;
import org.threeten.p283bp.chrono.AbstractC8188h;
import org.threeten.p283bp.chrono.C8195m;
import org.threeten.p283bp.format.C8226c;
import org.threeten.p283bp.temporal.C8290c;
import org.threeten.p283bp.temporal.EnumC8288a;
import org.threeten.p283bp.temporal.InterfaceC8299e;
import org.threeten.p283bp.temporal.InterfaceC8304h;
import org.threeten.p283bp.temporal.InterfaceC8313j;
import p387uf.C10878b;
import p405vf.C11251d;

/* renamed from: org.threeten.bp.format.b */
/* loaded from: classes2.dex */
public final class C8223b {

    /* renamed from: h */
    public static final C8223b f21389h;

    /* renamed from: i */
    public static final C8223b f21390i;

    /* renamed from: j */
    public static final C8223b f21391j;

    /* renamed from: k */
    public static final C8223b f21392k;

    /* renamed from: l */
    public static final C8223b f21393l;

    /* renamed from: a */
    private final C8226c.C8232f f21394a;

    /* renamed from: b */
    private final Locale f21395b;

    /* renamed from: c */
    private final C8253g f21396c;

    /* renamed from: d */
    private final EnumC8254h f21397d;

    /* renamed from: e */
    private final Set<InterfaceC8304h> f21398e;

    /* renamed from: f */
    private final AbstractC8188h f21399f;

    /* renamed from: g */
    private final AbstractC8280n f21400g;

    /* compiled from: DateTimeFormatter.java */
    /* renamed from: org.threeten.bp.format.b$a */
    /* loaded from: classes2.dex */
    class C8224a implements InterfaceC8313j<C10878b> {
        C8224a() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public C10878b mo16124b(InterfaceC8299e interfaceC8299e) {
            if (interfaceC8299e instanceof C8222a) {
                return ((C8222a) interfaceC8299e).f21384C;
            }
            return C10878b.f28093z;
        }
    }

    /* compiled from: DateTimeFormatter.java */
    /* renamed from: org.threeten.bp.format.b$b */
    /* loaded from: classes2.dex */
    class C8225b implements InterfaceC8313j<Boolean> {
        C8225b() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public Boolean mo16124b(InterfaceC8299e interfaceC8299e) {
            if (interfaceC8299e instanceof C8222a) {
                return Boolean.valueOf(((C8222a) interfaceC8299e).f21383B);
            }
            return Boolean.FALSE;
        }
    }

    static {
        C8226c c8226c = new C8226c();
        EnumC8288a enumC8288a = EnumC8288a.YEAR;
        EnumC8255i enumC8255i = EnumC8255i.EXCEEDS_PAD;
        C8226c m16069e = c8226c.m16058p(enumC8288a, 4, 10, enumC8255i).m16069e('-');
        EnumC8288a enumC8288a2 = EnumC8288a.MONTH_OF_YEAR;
        C8226c m16069e2 = m16069e.m16059o(enumC8288a2, 2).m16069e('-');
        EnumC8288a enumC8288a3 = EnumC8288a.DAY_OF_MONTH;
        C8226c m16059o = m16069e2.m16059o(enumC8288a3, 2);
        EnumC8254h enumC8254h = EnumC8254h.STRICT;
        C8223b m16074F = m16059o.m16074F(enumC8254h);
        C8195m c8195m = C8195m.f21328y;
        C8223b m16083i = m16074F.m16083i(c8195m);
        f21389h = m16083i;
        new C8226c().m16049y().m16073a(m16083i).m16065i().m16074F(enumC8254h).m16083i(c8195m);
        new C8226c().m16049y().m16073a(m16083i).m16052v().m16065i().m16074F(enumC8254h).m16083i(c8195m);
        C8226c c8226c2 = new C8226c();
        EnumC8288a enumC8288a4 = EnumC8288a.HOUR_OF_DAY;
        C8226c m16069e3 = c8226c2.m16059o(enumC8288a4, 2).m16069e(':');
        EnumC8288a enumC8288a5 = EnumC8288a.MINUTE_OF_HOUR;
        C8226c m16069e4 = m16069e3.m16059o(enumC8288a5, 2).m16052v().m16069e(':');
        EnumC8288a enumC8288a6 = EnumC8288a.SECOND_OF_MINUTE;
        C8223b m16074F2 = m16069e4.m16059o(enumC8288a6, 2).m16052v().m16072b(EnumC8288a.NANO_OF_SECOND, 0, 9, true).m16074F(enumC8254h);
        f21390i = m16074F2;
        new C8226c().m16049y().m16073a(m16074F2).m16065i().m16074F(enumC8254h);
        new C8226c().m16049y().m16073a(m16074F2).m16052v().m16065i().m16074F(enumC8254h);
        C8223b m16083i2 = new C8226c().m16049y().m16073a(m16083i).m16069e('T').m16073a(m16074F2).m16074F(enumC8254h).m16083i(c8195m);
        f21391j = m16083i2;
        C8223b m16083i3 = new C8226c().m16049y().m16073a(m16083i2).m16065i().m16074F(enumC8254h).m16083i(c8195m);
        f21392k = m16083i3;
        new C8226c().m16073a(m16083i3).m16052v().m16069e('[').m16048z().m16055s().m16069e(']').m16074F(enumC8254h).m16083i(c8195m);
        new C8226c().m16073a(m16083i2).m16052v().m16065i().m16052v().m16069e('[').m16048z().m16055s().m16069e(']').m16074F(enumC8254h).m16083i(c8195m);
        new C8226c().m16049y().m16058p(enumC8288a, 4, 10, enumC8255i).m16069e('-').m16059o(EnumC8288a.DAY_OF_YEAR, 3).m16052v().m16065i().m16074F(enumC8254h).m16083i(c8195m);
        C8226c m16069e5 = new C8226c().m16049y().m16058p(C8290c.f21501c, 4, 10, enumC8255i).m16068f("-W").m16059o(C8290c.f21500b, 2).m16069e('-');
        EnumC8288a enumC8288a7 = EnumC8288a.DAY_OF_WEEK;
        m16069e5.m16059o(enumC8288a7, 1).m16052v().m16065i().m16074F(enumC8254h).m16083i(c8195m);
        f21393l = new C8226c().m16049y().m16071c().m16074F(enumC8254h);
        new C8226c().m16049y().m16059o(enumC8288a, 4).m16059o(enumC8288a2, 2).m16059o(enumC8288a3, 2).m16052v().m16066h("+HHMMss", "Z").m16074F(enumC8254h).m16083i(c8195m);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        new C8226c().m16049y().m16078B().m16052v().m16063k(enumC8288a7, hashMap).m16068f(", ").m16053u().m16058p(enumC8288a3, 1, 2, EnumC8255i.NOT_NEGATIVE).m16069e(' ').m16063k(enumC8288a2, hashMap2).m16069e(' ').m16059o(enumC8288a, 4).m16069e(' ').m16059o(enumC8288a4, 2).m16069e(':').m16059o(enumC8288a5, 2).m16052v().m16069e(':').m16059o(enumC8288a6, 2).m16053u().m16069e(' ').m16066h("+HHMM", "GMT").m16074F(EnumC8254h.SMART).m16083i(c8195m);
        new C8224a();
        new C8225b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8223b(C8226c.C8232f c8232f, Locale locale, C8253g c8253g, EnumC8254h enumC8254h, Set<InterfaceC8304h> set, AbstractC8188h abstractC8188h, AbstractC8280n abstractC8280n) {
        this.f21394a = (C8226c.C8232f) C11251d.m5623i(c8232f, "printerParser");
        this.f21395b = (Locale) C11251d.m5623i(locale, "locale");
        this.f21396c = (C8253g) C11251d.m5623i(c8253g, "decimalStyle");
        this.f21397d = (EnumC8254h) C11251d.m5623i(enumC8254h, "resolverStyle");
        this.f21398e = set;
        this.f21399f = abstractC8188h;
        this.f21400g = abstractC8280n;
    }

    /* renamed from: g */
    public static C8223b m16085g(String str, Locale locale) {
        return new C8226c().m16064j(str).m16075E(locale);
    }

    /* renamed from: a */
    public String m16091a(InterfaceC8299e interfaceC8299e) {
        StringBuilder sb2 = new StringBuilder(32);
        m16090b(interfaceC8299e, sb2);
        return sb2.toString();
    }

    /* renamed from: b */
    public void m16090b(InterfaceC8299e interfaceC8299e, Appendable appendable) {
        C11251d.m5623i(interfaceC8299e, "temporal");
        C11251d.m5623i(appendable, "appendable");
        try {
            C8249e c8249e = new C8249e(interfaceC8299e, this);
            if (appendable instanceof StringBuilder) {
                this.f21394a.print(c8249e, (StringBuilder) appendable);
                return;
            }
            StringBuilder sb2 = new StringBuilder(32);
            this.f21394a.print(c8249e, sb2);
            appendable.append(sb2);
        } catch (IOException e) {
            throw new DateTimeException(e.getMessage(), e);
        }
    }

    /* renamed from: c */
    public AbstractC8188h m16089c() {
        return this.f21399f;
    }

    /* renamed from: d */
    public C8253g m16088d() {
        return this.f21396c;
    }

    /* renamed from: e */
    public Locale m16087e() {
        return this.f21395b;
    }

    /* renamed from: f */
    public AbstractC8280n m16086f() {
        return this.f21400g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C8226c.C8232f m16084h(boolean z) {
        return this.f21394a.m16045a(z);
    }

    /* renamed from: i */
    public C8223b m16083i(AbstractC8188h abstractC8188h) {
        return C11251d.m5629c(this.f21399f, abstractC8188h) ? this : new C8223b(this.f21394a, this.f21395b, this.f21396c, this.f21397d, this.f21398e, abstractC8188h, this.f21400g);
    }

    /* renamed from: j */
    public C8223b m16082j(EnumC8254h enumC8254h) {
        C11251d.m5623i(enumC8254h, "resolverStyle");
        return C11251d.m5629c(this.f21397d, enumC8254h) ? this : new C8223b(this.f21394a, this.f21395b, this.f21396c, enumC8254h, this.f21398e, this.f21399f, this.f21400g);
    }

    public String toString() {
        String c8232f = this.f21394a.toString();
        return c8232f.startsWith("[") ? c8232f : c8232f.substring(1, c8232f.length() - 1);
    }
}
