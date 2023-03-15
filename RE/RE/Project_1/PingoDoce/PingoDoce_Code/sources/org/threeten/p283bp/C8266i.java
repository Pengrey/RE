package org.threeten.p283bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.util.Comparator;
import org.threeten.p283bp.chrono.C8195m;
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
import p405vf.AbstractC11249b;
import p405vf.C11251d;

/* renamed from: org.threeten.bp.i */
/* loaded from: classes2.dex */
public final class C8266i extends AbstractC11249b implements InterfaceC8298d, InterfaceC8300f, Comparable<C8266i> {

    /* renamed from: w */
    private final C8216e f21469w;

    /* renamed from: x */
    private final C8282o f21470x;

    /* compiled from: OffsetDateTime.java */
    /* renamed from: org.threeten.bp.i$a */
    /* loaded from: classes2.dex */
    class C8267a implements InterfaceC8313j<C8266i> {
        C8267a() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public C8266i mo16124b(InterfaceC8299e interfaceC8299e) {
            return C8266i.m15995i(interfaceC8299e);
        }
    }

    /* compiled from: OffsetDateTime.java */
    /* renamed from: org.threeten.bp.i$b */
    /* loaded from: classes2.dex */
    class C8268b implements Comparator<C8266i> {
        C8268b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C8266i c8266i, C8266i c8266i2) {
            int m5630b = C11251d.m5630b(c8266i.m15987q(), c8266i2.m15987q());
            return m5630b == 0 ? C11251d.m5630b(c8266i.m15994j(), c8266i2.m15994j()) : m5630b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OffsetDateTime.java */
    /* renamed from: org.threeten.bp.i$c */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C8269c {

        /* renamed from: a */
        static final /* synthetic */ int[] f21471a;

        static {
            int[] iArr = new int[EnumC8288a.values().length];
            f21471a = iArr;
            try {
                iArr[EnumC8288a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21471a[EnumC8288a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        C8216e.f21368y.m16127w(C8282o.f21488D);
        C8216e.f21369z.m16127w(C8282o.f21487C);
        new C8267a();
        new C8268b();
    }

    private C8266i(C8216e c8216e, C8282o c8282o) {
        this.f21469w = (C8216e) C11251d.m5623i(c8216e, "dateTime");
        this.f21470x = (C8282o) C11251d.m5623i(c8282o, "offset");
    }

    /* renamed from: i */
    public static C8266i m15995i(InterfaceC8299e interfaceC8299e) {
        if (interfaceC8299e instanceof C8266i) {
            return (C8266i) interfaceC8299e;
        }
        try {
            C8282o m15926q = C8282o.m15926q(interfaceC8299e);
            try {
                return m15991m(C8216e.m16158A(interfaceC8299e), m15926q);
            } catch (DateTimeException unused) {
                return m15990n(C8171c.m16392j(interfaceC8299e), m15926q);
            }
        } catch (DateTimeException unused2) {
            throw new DateTimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + interfaceC8299e + ", type " + interfaceC8299e.getClass().getName());
        }
    }

    /* renamed from: m */
    public static C8266i m15991m(C8216e c8216e, C8282o c8282o) {
        return new C8266i(c8216e, c8282o);
    }

    /* renamed from: n */
    public static C8266i m15990n(C8171c c8171c, AbstractC8280n abstractC8280n) {
        C11251d.m5623i(c8171c, "instant");
        C11251d.m5623i(abstractC8280n, "zone");
        C8282o mo15784a = abstractC8280n.mo15914i().mo15784a(c8171c);
        return new C8266i(C8216e.m16150J(c8171c.m16391k(), c8171c.m16390l(), mo15784a), mo15784a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static C8266i m15988p(DataInput dataInput) throws IOException {
        return m15991m(C8216e.m16142R(dataInput), C8282o.m15920w(dataInput));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: w */
    private C8266i m15983w(C8216e c8216e, C8282o c8282o) {
        return (this.f21469w == c8216e && this.f21470x.equals(c8282o)) ? this : new C8266i(c8216e, c8282o);
    }

    private Object writeReplace() {
        return new C8273k((byte) 69, this);
    }

    /* renamed from: A */
    public C8266i m15998A(C8282o c8282o) {
        if (c8282o.equals(this.f21470x)) {
            return this;
        }
        return new C8266i(this.f21469w.m16144P(c8282o.m15925r() - this.f21470x.m15925r()), c8282o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m15997B(DataOutput dataOutput) throws IOException {
        this.f21469w.m16137W(dataOutput);
        this.f21470x.m15917z(dataOutput);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8300f
    public InterfaceC8298d adjustInto(InterfaceC8298d interfaceC8298d) {
        return interfaceC8298d.mo15874c(EnumC8288a.EPOCH_DAY, m15986r().mo16167p()).mo15874c(EnumC8288a.NANO_OF_DAY, m15984u().m16118G()).mo15874c(EnumC8288a.OFFSET_SECONDS, m15993k().m15925r());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8266i) {
            C8266i c8266i = (C8266i) obj;
            return this.f21469w.equals(c8266i.f21469w) && this.f21470x.equals(c8266i.f21470x);
        }
        return false;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: f */
    public long mo15872f(InterfaceC8298d interfaceC8298d, InterfaceC8314k interfaceC8314k) {
        C8266i m15995i = m15995i(interfaceC8298d);
        if (interfaceC8314k instanceof EnumC8289b) {
            return this.f21469w.mo15872f(m15995i.m15998A(this.f21470x).f21469w, interfaceC8314k);
        }
        return interfaceC8314k.between(this, m15995i);
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(C8266i c8266i) {
        if (m15993k().equals(c8266i.m15993k())) {
            return m15985s().mo16136i(c8266i.m15985s());
        }
        int m5630b = C11251d.m5630b(m15987q(), c8266i.m15987q());
        if (m5630b == 0) {
            int m16103n = m15984u().m16103n() - c8266i.m15984u().m16103n();
            return m16103n == 0 ? m15985s().mo16136i(c8266i.m15985s()) : m16103n;
        }
        return m5630b;
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public int get(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            int i = C8269c.f21471a[((EnumC8288a) interfaceC8304h).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return this.f21469w.get(interfaceC8304h);
                }
                return m15993k().m15925r();
            }
            throw new DateTimeException("Field too large for an int: " + interfaceC8304h);
        }
        return super.get(interfaceC8304h);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public long getLong(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            int i = C8269c.f21471a[((EnumC8288a) interfaceC8304h).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return this.f21469w.getLong(interfaceC8304h);
                }
                return m15993k().m15925r();
            }
            return m15987q();
        }
        return interfaceC8304h.getFrom(this);
    }

    public int hashCode() {
        return this.f21469w.hashCode() ^ this.f21470x.hashCode();
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public boolean isSupported(InterfaceC8304h interfaceC8304h) {
        return (interfaceC8304h instanceof EnumC8288a) || (interfaceC8304h != null && interfaceC8304h.isSupportedBy(this));
    }

    /* renamed from: j */
    public int m15994j() {
        return this.f21469w.m16157B();
    }

    /* renamed from: k */
    public C8282o m15993k() {
        return this.f21470x;
    }

    @Override // p405vf.AbstractC11249b, org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: l */
    public C8266i mo5632d(long j, InterfaceC8314k interfaceC8314k) {
        return j == Long.MIN_VALUE ? mo15873e(Long.MAX_VALUE, interfaceC8314k).mo15873e(1L, interfaceC8314k) : mo15873e(-j, interfaceC8314k);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: o */
    public C8266i mo15873e(long j, InterfaceC8314k interfaceC8314k) {
        if (interfaceC8314k instanceof EnumC8289b) {
            return m15983w(this.f21469w.mo16149K(j, interfaceC8314k), this.f21470x);
        }
        return (C8266i) interfaceC8314k.addTo(this, j);
    }

    /* renamed from: q */
    public long m15987q() {
        return this.f21469w.m16374o(this.f21470x);
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public <R> R query(InterfaceC8313j<R> interfaceC8313j) {
        if (interfaceC8313j == C8305i.m15869a()) {
            return (R) C8195m.f21328y;
        }
        if (interfaceC8313j == C8305i.m15865e()) {
            return (R) EnumC8289b.NANOS;
        }
        if (interfaceC8313j != C8305i.m15866d() && interfaceC8313j != C8305i.m15864f()) {
            if (interfaceC8313j == C8305i.m15868b()) {
                return (R) m15986r();
            }
            if (interfaceC8313j == C8305i.m15867c()) {
                return (R) m15984u();
            }
            if (interfaceC8313j == C8305i.m15863g()) {
                return null;
            }
            return (R) super.query(interfaceC8313j);
        }
        return (R) m15993k();
    }

    /* renamed from: r */
    public C8213d m15986r() {
        return this.f21469w.mo16141S();
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public C8315l range(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            if (interfaceC8304h != EnumC8288a.INSTANT_SECONDS && interfaceC8304h != EnumC8288a.OFFSET_SECONDS) {
                return this.f21469w.range(interfaceC8304h);
            }
            return interfaceC8304h.range();
        }
        return interfaceC8304h.rangeRefinedBy(this);
    }

    /* renamed from: s */
    public C8216e m15985s() {
        return this.f21469w;
    }

    public String toString() {
        return this.f21469w.toString() + this.f21470x.toString();
    }

    /* renamed from: u */
    public C8219f m15984u() {
        return this.f21469w.mo16130r();
    }

    @Override // p405vf.AbstractC11249b, org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: x */
    public C8266i mo5633b(InterfaceC8300f interfaceC8300f) {
        if (!(interfaceC8300f instanceof C8213d) && !(interfaceC8300f instanceof C8219f) && !(interfaceC8300f instanceof C8216e)) {
            if (interfaceC8300f instanceof C8171c) {
                return m15990n((C8171c) interfaceC8300f, this.f21470x);
            }
            if (interfaceC8300f instanceof C8282o) {
                return m15983w(this.f21469w, (C8282o) interfaceC8300f);
            }
            if (interfaceC8300f instanceof C8266i) {
                return (C8266i) interfaceC8300f;
            }
            return (C8266i) interfaceC8300f.adjustInto(this);
        }
        return m15983w(this.f21469w.mo16139U(interfaceC8300f), this.f21470x);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: z */
    public C8266i mo15874c(InterfaceC8304h interfaceC8304h, long j) {
        if (interfaceC8304h instanceof EnumC8288a) {
            EnumC8288a enumC8288a = (EnumC8288a) interfaceC8304h;
            int i = C8269c.f21471a[enumC8288a.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return m15983w(this.f21469w.mo16138V(interfaceC8304h, j), this.f21470x);
                }
                return m15983w(this.f21469w, C8282o.m15922u(enumC8288a.checkValidIntValue(j)));
            }
            return m15990n(C8171c.m16385q(j, m15994j()), this.f21470x);
        }
        return (C8266i) interfaceC8304h.adjustInto(this, j);
    }
}
