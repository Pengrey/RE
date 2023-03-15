package org.threeten.p283bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.util.List;
import org.threeten.p283bp.chrono.AbstractC8183f;
import org.threeten.p283bp.temporal.C8305i;
import org.threeten.p283bp.temporal.C8315l;
import org.threeten.p283bp.temporal.EnumC8288a;
import org.threeten.p283bp.temporal.EnumC8289b;
import org.threeten.p283bp.temporal.InterfaceC8298d;
import org.threeten.p283bp.temporal.InterfaceC8299e;
import org.threeten.p283bp.temporal.InterfaceC8300f;
import org.threeten.p283bp.temporal.InterfaceC8304h;
import org.threeten.p283bp.temporal.InterfaceC8313j;
import org.threeten.p283bp.temporal.InterfaceC8314k;
import org.threeten.p283bp.zone.AbstractC8326f;
import org.threeten.p283bp.zone.C8322d;
import p405vf.C11251d;

/* renamed from: org.threeten.bp.q */
/* loaded from: classes2.dex */
public final class C8285q extends AbstractC8183f<C8213d> implements InterfaceC8298d {

    /* renamed from: w */
    private final C8216e f21495w;

    /* renamed from: x */
    private final C8282o f21496x;

    /* renamed from: y */
    private final AbstractC8280n f21497y;

    /* compiled from: ZonedDateTime.java */
    /* renamed from: org.threeten.bp.q$a */
    /* loaded from: classes2.dex */
    class C8286a implements InterfaceC8313j<C8285q> {
        C8286a() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public C8285q mo16124b(InterfaceC8299e interfaceC8299e) {
            return C8285q.m15877x(interfaceC8299e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ZonedDateTime.java */
    /* renamed from: org.threeten.bp.q$b */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C8287b {

        /* renamed from: a */
        static final /* synthetic */ int[] f21498a;

        static {
            int[] iArr = new int[EnumC8288a.values().length];
            f21498a = iArr;
            try {
                iArr[EnumC8288a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21498a[EnumC8288a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        new C8286a();
    }

    private C8285q(C8216e c8216e, C8282o c8282o, AbstractC8280n abstractC8280n) {
        this.f21495w = c8216e;
        this.f21496x = c8282o;
        this.f21497y = abstractC8280n;
    }

    /* renamed from: B */
    public static C8285q m15907B(C8216e c8216e, AbstractC8280n abstractC8280n) {
        return m15903G(c8216e, abstractC8280n, null);
    }

    /* renamed from: C */
    public static C8285q m15906C(C8171c c8171c, AbstractC8280n abstractC8280n) {
        C11251d.m5623i(c8171c, "instant");
        C11251d.m5623i(abstractC8280n, "zone");
        return m15878w(c8171c.m16391k(), c8171c.m16390l(), abstractC8280n);
    }

    /* renamed from: D */
    public static C8285q m15905D(C8216e c8216e, C8282o c8282o, AbstractC8280n abstractC8280n) {
        C11251d.m5623i(c8216e, "localDateTime");
        C11251d.m5623i(c8282o, "offset");
        C11251d.m5623i(abstractC8280n, "zone");
        return m15878w(c8216e.m16374o(c8282o), c8216e.m16157B(), abstractC8280n);
    }

    /* renamed from: F */
    private static C8285q m15904F(C8216e c8216e, C8282o c8282o, AbstractC8280n abstractC8280n) {
        C11251d.m5623i(c8216e, "localDateTime");
        C11251d.m5623i(c8282o, "offset");
        C11251d.m5623i(abstractC8280n, "zone");
        if ((abstractC8280n instanceof C8282o) && !c8282o.equals(abstractC8280n)) {
            throw new IllegalArgumentException("ZoneId must match ZoneOffset");
        }
        return new C8285q(c8216e, c8282o, abstractC8280n);
    }

    /* renamed from: G */
    public static C8285q m15903G(C8216e c8216e, AbstractC8280n abstractC8280n, C8282o c8282o) {
        C11251d.m5623i(c8216e, "localDateTime");
        C11251d.m5623i(abstractC8280n, "zone");
        if (abstractC8280n instanceof C8282o) {
            return new C8285q(c8216e, (C8282o) abstractC8280n, abstractC8280n);
        }
        AbstractC8326f mo15914i = abstractC8280n.mo15914i();
        List<C8282o> mo15782c = mo15914i.mo15782c(c8216e);
        if (mo15782c.size() == 1) {
            c8282o = mo15782c.get(0);
        } else if (mo15782c.size() == 0) {
            C8322d mo15783b = mo15914i.mo15783b(c8216e);
            c8216e = c8216e.m16144P(mo15783b.m15799e().m16405d());
            c8282o = mo15783b.m15796h();
        } else if (c8282o == null || !mo15782c.contains(c8282o)) {
            c8282o = (C8282o) C11251d.m5623i(mo15782c.get(0), "offset");
        }
        return new C8285q(c8216e, c8282o, abstractC8280n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static C8285q m15901I(DataInput dataInput) throws IOException {
        return m15904F(C8216e.m16142R(dataInput), C8282o.m15920w(dataInput), (AbstractC8280n) C8273k.m15965a(dataInput));
    }

    /* renamed from: J */
    private C8285q m15900J(C8216e c8216e) {
        return m15905D(c8216e, this.f21496x, this.f21497y);
    }

    /* renamed from: K */
    private C8285q m15899K(C8216e c8216e) {
        return m15903G(c8216e, this.f21497y, this.f21496x);
    }

    /* renamed from: L */
    private C8285q m15898L(C8282o c8282o) {
        return (c8282o.equals(this.f21496x) || !this.f21497y.mo15914i().mo15779f(this.f21495w, c8282o)) ? this : new C8285q(this.f21495w, c8282o, this.f21497y);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: w */
    private static C8285q m15878w(long j, int i, AbstractC8280n abstractC8280n) {
        C8282o mo15784a = abstractC8280n.mo15914i().mo15784a(C8171c.m16385q(j, i));
        return new C8285q(C8216e.m16150J(j, i, mo15784a), mo15784a, abstractC8280n);
    }

    private Object writeReplace() {
        return new C8273k((byte) 6, this);
    }

    /* renamed from: x */
    public static C8285q m15877x(InterfaceC8299e interfaceC8299e) {
        if (interfaceC8299e instanceof C8285q) {
            return (C8285q) interfaceC8299e;
        }
        try {
            AbstractC8280n m15934g = AbstractC8280n.m15934g(interfaceC8299e);
            EnumC8288a enumC8288a = EnumC8288a.INSTANT_SECONDS;
            if (interfaceC8299e.isSupported(enumC8288a)) {
                try {
                    return m15878w(interfaceC8299e.getLong(enumC8288a), interfaceC8299e.get(EnumC8288a.NANO_OF_SECOND), m15934g);
                } catch (DateTimeException unused) {
                }
            }
            return m15907B(C8216e.m16158A(interfaceC8299e), m15934g);
        } catch (DateTimeException unused2) {
            throw new DateTimeException("Unable to obtain ZonedDateTime from TemporalAccessor: " + interfaceC8299e + ", type " + interfaceC8299e.getClass().getName());
        }
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f
    /* renamed from: A */
    public C8285q mo15887k(long j, InterfaceC8314k interfaceC8314k) {
        return j == Long.MIN_VALUE ? mo15886l(Long.MAX_VALUE, interfaceC8314k).mo15886l(1L, interfaceC8314k) : mo15886l(-j, interfaceC8314k);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f
    /* renamed from: H */
    public C8285q mo15886l(long j, InterfaceC8314k interfaceC8314k) {
        if (interfaceC8314k instanceof EnumC8289b) {
            if (interfaceC8314k.isDateBased()) {
                return m15899K(this.f21495w.mo16149K(j, interfaceC8314k));
            }
            return m15900J(this.f21495w.mo16149K(j, interfaceC8314k));
        }
        return (C8285q) interfaceC8314k.addTo(this, j);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f
    /* renamed from: M */
    public C8213d mo15885n() {
        return this.f21495w.mo16141S();
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f
    /* renamed from: N */
    public C8216e mo15884o() {
        return this.f21495w;
    }

    /* renamed from: O */
    public C8266i m15895O() {
        return C8266i.m15991m(this.f21495w, this.f21496x);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f
    /* renamed from: P */
    public C8285q mo15882q(InterfaceC8300f interfaceC8300f) {
        if (interfaceC8300f instanceof C8213d) {
            return m15899K(C8216e.m16151I((C8213d) interfaceC8300f, this.f21495w.mo16130r()));
        }
        if (interfaceC8300f instanceof C8219f) {
            return m15899K(C8216e.m16151I(this.f21495w.mo16141S(), (C8219f) interfaceC8300f));
        }
        if (interfaceC8300f instanceof C8216e) {
            return m15899K((C8216e) interfaceC8300f);
        }
        if (interfaceC8300f instanceof C8171c) {
            C8171c c8171c = (C8171c) interfaceC8300f;
            return m15878w(c8171c.m16391k(), c8171c.m16390l(), this.f21497y);
        } else if (interfaceC8300f instanceof C8282o) {
            return m15898L((C8282o) interfaceC8300f);
        } else {
            return (C8285q) interfaceC8300f.adjustInto(this);
        }
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f
    /* renamed from: Q */
    public C8285q mo15881r(InterfaceC8304h interfaceC8304h, long j) {
        if (interfaceC8304h instanceof EnumC8288a) {
            EnumC8288a enumC8288a = (EnumC8288a) interfaceC8304h;
            int i = C8287b.f21498a[enumC8288a.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return m15899K(this.f21495w.mo16138V(interfaceC8304h, j));
                }
                return m15898L(C8282o.m15922u(enumC8288a.checkValidIntValue(j)));
            }
            return m15878w(j, m15876z(), this.f21497y);
        }
        return (C8285q) interfaceC8304h.adjustInto(this, j);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f
    /* renamed from: R */
    public C8285q mo15880s(AbstractC8280n abstractC8280n) {
        C11251d.m5623i(abstractC8280n, "zone");
        return this.f21497y.equals(abstractC8280n) ? this : m15878w(this.f21495w.m16374o(this.f21496x), this.f21495w.m16157B(), abstractC8280n);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f
    /* renamed from: S */
    public C8285q mo15879u(AbstractC8280n abstractC8280n) {
        C11251d.m5623i(abstractC8280n, "zone");
        return this.f21497y.equals(abstractC8280n) ? this : m15903G(this.f21495w, abstractC8280n, this.f21496x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m15890T(DataOutput dataOutput) throws IOException {
        this.f21495w.m16137W(dataOutput);
        this.f21496x.m15917z(dataOutput);
        this.f21497y.mo15913n(dataOutput);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8285q) {
            C8285q c8285q = (C8285q) obj;
            return this.f21495w.equals(c8285q.f21495w) && this.f21496x.equals(c8285q.f21496x) && this.f21497y.equals(c8285q.f21497y);
        }
        return false;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: f */
    public long mo15872f(InterfaceC8298d interfaceC8298d, InterfaceC8314k interfaceC8314k) {
        C8285q m15877x = m15877x(interfaceC8298d);
        if (interfaceC8314k instanceof EnumC8289b) {
            C8285q mo15880s = m15877x.mo15880s(this.f21497y);
            if (interfaceC8314k.isDateBased()) {
                return this.f21495w.mo15872f(mo15880s.f21495w, interfaceC8314k);
            }
            return m15895O().mo15872f(mo15880s.m15895O(), interfaceC8314k);
        }
        return interfaceC8314k.between(this, m15877x);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f, p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public int get(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            int i = C8287b.f21498a[((EnumC8288a) interfaceC8304h).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return this.f21495w.get(interfaceC8304h);
                }
                return mo15889i().m15925r();
            }
            throw new DateTimeException("Field too large for an int: " + interfaceC8304h);
        }
        return super.get(interfaceC8304h);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f, org.threeten.p283bp.temporal.InterfaceC8299e
    public long getLong(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            int i = C8287b.f21498a[((EnumC8288a) interfaceC8304h).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return this.f21495w.getLong(interfaceC8304h);
                }
                return mo15889i().m15925r();
            }
            return m16358m();
        }
        return interfaceC8304h.getFrom(this);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f
    public int hashCode() {
        return (this.f21495w.hashCode() ^ this.f21496x.hashCode()) ^ Integer.rotateLeft(this.f21497y.hashCode(), 3);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f
    /* renamed from: i */
    public C8282o mo15889i() {
        return this.f21496x;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public boolean isSupported(InterfaceC8304h interfaceC8304h) {
        return (interfaceC8304h instanceof EnumC8288a) || (interfaceC8304h != null && interfaceC8304h.isSupportedBy(this));
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f
    /* renamed from: j */
    public AbstractC8280n mo15888j() {
        return this.f21497y;
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f
    /* renamed from: p */
    public C8219f mo15883p() {
        return this.f21495w.mo16130r();
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f, p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public <R> R query(InterfaceC8313j<R> interfaceC8313j) {
        if (interfaceC8313j == C8305i.m15868b()) {
            return (R) mo15885n();
        }
        return (R) super.query(interfaceC8313j);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f, p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public C8315l range(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            if (interfaceC8304h != EnumC8288a.INSTANT_SECONDS && interfaceC8304h != EnumC8288a.OFFSET_SECONDS) {
                return this.f21495w.range(interfaceC8304h);
            }
            return interfaceC8304h.range();
        }
        return interfaceC8304h.rangeRefinedBy(this);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f
    public String toString() {
        String str = this.f21495w.toString() + this.f21496x.toString();
        if (this.f21496x != this.f21497y) {
            return str + '[' + this.f21497y.toString() + ']';
        }
        return str;
    }

    /* renamed from: z */
    public int m15876z() {
        return this.f21495w.m16157B();
    }
}
