package org.threeten.p283bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
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
import org.threeten.p283bp.temporal.UnsupportedTemporalTypeException;
import p405vf.AbstractC11250c;
import p405vf.C11251d;

/* renamed from: org.threeten.bp.j */
/* loaded from: classes2.dex */
public final class C8270j extends AbstractC11250c implements InterfaceC8298d, InterfaceC8300f, Comparable<C8270j>, Serializable {

    /* renamed from: w */
    private final C8219f f21472w;

    /* renamed from: x */
    private final C8282o f21473x;

    /* compiled from: OffsetTime.java */
    /* renamed from: org.threeten.bp.j$a */
    /* loaded from: classes2.dex */
    class C8271a implements InterfaceC8313j<C8270j> {
        C8271a() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public C8270j mo16124b(InterfaceC8299e interfaceC8299e) {
            return C8270j.m15977i(interfaceC8299e);
        }
    }

    /* compiled from: OffsetTime.java */
    /* renamed from: org.threeten.bp.j$b */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C8272b {

        /* renamed from: a */
        static final /* synthetic */ int[] f21474a;

        static {
            int[] iArr = new int[EnumC8289b.values().length];
            f21474a = iArr;
            try {
                iArr[EnumC8289b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21474a[EnumC8289b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21474a[EnumC8289b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21474a[EnumC8289b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21474a[EnumC8289b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21474a[EnumC8289b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21474a[EnumC8289b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        C8219f.f21373A.m16109g(C8282o.f21488D);
        C8219f.f21374B.m16109g(C8282o.f21487C);
        new C8271a();
    }

    private C8270j(C8219f c8219f, C8282o c8282o) {
        this.f21472w = (C8219f) C11251d.m5623i(c8219f, "time");
        this.f21473x = (C8282o) C11251d.m5623i(c8282o, "offset");
    }

    /* renamed from: i */
    public static C8270j m15977i(InterfaceC8299e interfaceC8299e) {
        if (interfaceC8299e instanceof C8270j) {
            return (C8270j) interfaceC8299e;
        }
        try {
            return new C8270j(C8219f.m16106k(interfaceC8299e), C8282o.m15926q(interfaceC8299e));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain OffsetTime from TemporalAccessor: " + interfaceC8299e + ", type " + interfaceC8299e.getClass().getName());
        }
    }

    /* renamed from: l */
    public static C8270j m15974l(C8219f c8219f, C8282o c8282o) {
        return new C8270j(c8219f, c8282o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static C8270j m15972n(DataInput dataInput) throws IOException {
        return m15974l(C8219f.m16119F(dataInput), C8282o.m15920w(dataInput));
    }

    /* renamed from: o */
    private long m15971o() {
        return this.f21472w.m16118G() - (this.f21473x.m15925r() * 1000000000);
    }

    /* renamed from: p */
    private C8270j m15970p(C8219f c8219f, C8282o c8282o) {
        return (this.f21472w == c8219f && this.f21473x.equals(c8282o)) ? this : new C8270j(c8219f, c8282o);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C8273k((byte) 66, this);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8300f
    public InterfaceC8298d adjustInto(InterfaceC8298d interfaceC8298d) {
        return interfaceC8298d.mo15874c(EnumC8288a.NANO_OF_DAY, this.f21472w.m16118G()).mo15874c(EnumC8288a.OFFSET_SECONDS, m15976j().m15925r());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8270j) {
            C8270j c8270j = (C8270j) obj;
            return this.f21472w.equals(c8270j.f21472w) && this.f21473x.equals(c8270j.f21473x);
        }
        return false;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: f */
    public long mo15872f(InterfaceC8298d interfaceC8298d, InterfaceC8314k interfaceC8314k) {
        C8270j m15977i = m15977i(interfaceC8298d);
        if (interfaceC8314k instanceof EnumC8289b) {
            long m15971o = m15977i.m15971o() - m15971o();
            switch (C8272b.f21474a[((EnumC8289b) interfaceC8314k).ordinal()]) {
                case 1:
                    return m15971o;
                case 2:
                    return m15971o / 1000;
                case 3:
                    return m15971o / 1000000;
                case 4:
                    return m15971o / 1000000000;
                case 5:
                    return m15971o / 60000000000L;
                case 6:
                    return m15971o / 3600000000000L;
                case 7:
                    return m15971o / 43200000000000L;
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8314k);
            }
        }
        return interfaceC8314k.between(this, m15977i);
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(C8270j c8270j) {
        if (this.f21473x.equals(c8270j.f21473x)) {
            return this.f21472w.compareTo(c8270j.f21472w);
        }
        int m5630b = C11251d.m5630b(m15971o(), c8270j.m15971o());
        return m5630b == 0 ? this.f21472w.compareTo(c8270j.f21472w) : m5630b;
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public int get(InterfaceC8304h interfaceC8304h) {
        return super.get(interfaceC8304h);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public long getLong(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            if (interfaceC8304h == EnumC8288a.OFFSET_SECONDS) {
                return m15976j().m15925r();
            }
            return this.f21472w.getLong(interfaceC8304h);
        }
        return interfaceC8304h.getFrom(this);
    }

    public int hashCode() {
        return this.f21472w.hashCode() ^ this.f21473x.hashCode();
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public boolean isSupported(InterfaceC8304h interfaceC8304h) {
        return interfaceC8304h instanceof EnumC8288a ? interfaceC8304h.isTimeBased() || interfaceC8304h == EnumC8288a.OFFSET_SECONDS : interfaceC8304h != null && interfaceC8304h.isSupportedBy(this);
    }

    /* renamed from: j */
    public C8282o m15976j() {
        return this.f21473x;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: k */
    public C8270j mo5632d(long j, InterfaceC8314k interfaceC8314k) {
        return j == Long.MIN_VALUE ? mo15873e(Long.MAX_VALUE, interfaceC8314k).mo15873e(1L, interfaceC8314k) : mo15873e(-j, interfaceC8314k);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: m */
    public C8270j mo15873e(long j, InterfaceC8314k interfaceC8314k) {
        if (interfaceC8314k instanceof EnumC8289b) {
            return m15970p(this.f21472w.mo15873e(j, interfaceC8314k), this.f21473x);
        }
        return (C8270j) interfaceC8314k.addTo(this, j);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: q */
    public C8270j mo5633b(InterfaceC8300f interfaceC8300f) {
        if (interfaceC8300f instanceof C8219f) {
            return m15970p((C8219f) interfaceC8300f, this.f21473x);
        }
        if (interfaceC8300f instanceof C8282o) {
            return m15970p(this.f21472w, (C8282o) interfaceC8300f);
        }
        if (interfaceC8300f instanceof C8270j) {
            return (C8270j) interfaceC8300f;
        }
        return (C8270j) interfaceC8300f.adjustInto(this);
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public <R> R query(InterfaceC8313j<R> interfaceC8313j) {
        if (interfaceC8313j == C8305i.m15865e()) {
            return (R) EnumC8289b.NANOS;
        }
        if (interfaceC8313j != C8305i.m15866d() && interfaceC8313j != C8305i.m15864f()) {
            if (interfaceC8313j == C8305i.m15867c()) {
                return (R) this.f21472w;
            }
            if (interfaceC8313j == C8305i.m15869a() || interfaceC8313j == C8305i.m15868b() || interfaceC8313j == C8305i.m15863g()) {
                return null;
            }
            return (R) super.query(interfaceC8313j);
        }
        return (R) m15976j();
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: r */
    public C8270j mo15874c(InterfaceC8304h interfaceC8304h, long j) {
        if (interfaceC8304h instanceof EnumC8288a) {
            if (interfaceC8304h == EnumC8288a.OFFSET_SECONDS) {
                return m15970p(this.f21472w, C8282o.m15922u(((EnumC8288a) interfaceC8304h).checkValidIntValue(j)));
            }
            return m15970p(this.f21472w.mo15874c(interfaceC8304h, j), this.f21473x);
        }
        return (C8270j) interfaceC8304h.adjustInto(this, j);
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public C8315l range(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            if (interfaceC8304h == EnumC8288a.OFFSET_SECONDS) {
                return interfaceC8304h.range();
            }
            return this.f21472w.range(interfaceC8304h);
        }
        return interfaceC8304h.rangeRefinedBy(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m15967s(DataOutput dataOutput) throws IOException {
        this.f21472w.m16110O(dataOutput);
        this.f21473x.m15917z(dataOutput);
    }

    public String toString() {
        return this.f21472w.toString() + this.f21473x.toString();
    }
}
