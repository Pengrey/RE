package org.threeten.p283bp.chrono;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.joda.time.DateTimeConstants;
import org.threeten.p283bp.AbstractC8280n;
import org.threeten.p283bp.C8219f;
import org.threeten.p283bp.chrono.AbstractC8176b;
import org.threeten.p283bp.temporal.C8315l;
import org.threeten.p283bp.temporal.EnumC8288a;
import org.threeten.p283bp.temporal.EnumC8289b;
import org.threeten.p283bp.temporal.InterfaceC8298d;
import org.threeten.p283bp.temporal.InterfaceC8300f;
import org.threeten.p283bp.temporal.InterfaceC8304h;
import org.threeten.p283bp.temporal.InterfaceC8314k;
import p405vf.C11251d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.threeten.bp.chrono.d */
/* loaded from: classes2.dex */
public final class C8180d<D extends AbstractC8176b> extends AbstractC8178c<D> implements InterfaceC8298d {

    /* renamed from: w */
    private final D f21282w;

    /* renamed from: x */
    private final C8219f f21283x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChronoLocalDateTimeImpl.java */
    /* renamed from: org.threeten.bp.chrono.d$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C8181a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21284a;

        static {
            int[] iArr = new int[EnumC8289b.values().length];
            f21284a = iArr;
            try {
                iArr[EnumC8289b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21284a[EnumC8289b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21284a[EnumC8289b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21284a[EnumC8289b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21284a[EnumC8289b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21284a[EnumC8289b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21284a[EnumC8289b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private C8180d(D d, C8219f c8219f) {
        C11251d.m5623i(d, "date");
        C11251d.m5623i(c8219f, "time");
        this.f21282w = d;
        this.f21283x = c8219f;
    }

    /* renamed from: A */
    private C8180d<D> m16371A(long j) {
        return m16367F(this.f21282w, j, 0L, 0L, 0L);
    }

    /* renamed from: B */
    private C8180d<D> m16370B(long j) {
        return m16367F(this.f21282w, 0L, j, 0L, 0L);
    }

    /* renamed from: C */
    private C8180d<D> m16369C(long j) {
        return m16367F(this.f21282w, 0L, 0L, 0L, j);
    }

    /* renamed from: F */
    private C8180d<D> m16367F(D d, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return m16365H(d, this.f21283x);
        }
        long m16118G = this.f21283x.m16118G();
        long j5 = (j4 % 86400000000000L) + ((j3 % 86400) * 1000000000) + ((j2 % 1440) * 60000000000L) + ((j % 24) * 3600000000000L) + m16118G;
        long m5627e = (j4 / 86400000000000L) + (j3 / 86400) + (j2 / 1440) + (j / 24) + C11251d.m5627e(j5, 86400000000000L);
        long m5624h = C11251d.m5624h(j5, 86400000000000L);
        return m16365H(d.mo15873e(m5627e, EnumC8289b.DAYS), m5624h == m16118G ? this.f21283x : C8219f.m16097u(m5624h));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static AbstractC8178c<?> m16366G(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        return ((AbstractC8176b) objectInput.readObject()).mo16175g((C8219f) objectInput.readObject());
    }

    /* renamed from: H */
    private C8180d<D> m16365H(InterfaceC8298d interfaceC8298d, C8219f c8219f) {
        D d = this.f21282w;
        return (d == interfaceC8298d && this.f21283x == c8219f) ? this : new C8180d<>(d.mo16173j().m16351d(interfaceC8298d), c8219f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static <R extends AbstractC8176b> C8180d<R> m16362w(R r, C8219f c8219f) {
        return new C8180d<>(r, c8219f);
    }

    private Object writeReplace() {
        return new C8207u((byte) 12, this);
    }

    /* renamed from: z */
    private C8180d<D> m16360z(long j) {
        return m16365H(this.f21282w.mo15873e(j, EnumC8289b.DAYS), this.f21283x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public C8180d<D> m16368D(long j) {
        return m16367F(this.f21282w, 0L, 0L, j, 0L);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8178c
    /* renamed from: I */
    public C8180d<D> mo42220s(InterfaceC8300f interfaceC8300f) {
        if (interfaceC8300f instanceof AbstractC8176b) {
            return m16365H((AbstractC8176b) interfaceC8300f, this.f21283x);
        }
        if (interfaceC8300f instanceof C8219f) {
            return m16365H(this.f21282w, (C8219f) interfaceC8300f);
        }
        if (interfaceC8300f instanceof C8180d) {
            return this.f21282w.mo16173j().m16350e((C8180d) interfaceC8300f);
        }
        return this.f21282w.mo16173j().m16350e((C8180d) interfaceC8300f.adjustInto(this));
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8178c
    /* renamed from: J */
    public C8180d<D> mo42221u(InterfaceC8304h interfaceC8304h, long j) {
        if (interfaceC8304h instanceof EnumC8288a) {
            if (interfaceC8304h.isTimeBased()) {
                return m16365H(this.f21282w, this.f21283x.mo15874c(interfaceC8304h, j));
            }
            return m16365H(this.f21282w.mo15874c(interfaceC8304h, j), this.f21283x);
        }
        return this.f21282w.mo16173j().m16350e(interfaceC8304h.adjustInto(this, j));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [org.threeten.bp.chrono.b] */
    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: f */
    public long mo15872f(InterfaceC8298d interfaceC8298d, InterfaceC8314k interfaceC8314k) {
        AbstractC8178c<?> mo16232l = mo42219q().mo16173j().mo16232l(interfaceC8298d);
        if (interfaceC8314k instanceof EnumC8289b) {
            EnumC8289b enumC8289b = (EnumC8289b) interfaceC8314k;
            if (enumC8289b.isTimeBased()) {
                EnumC8288a enumC8288a = EnumC8288a.EPOCH_DAY;
                long j = mo16232l.getLong(enumC8288a) - this.f21282w.getLong(enumC8288a);
                switch (C8181a.f21284a[enumC8289b.ordinal()]) {
                    case 1:
                        j = C11251d.m5619m(j, 86400000000000L);
                        break;
                    case 2:
                        j = C11251d.m5619m(j, 86400000000L);
                        break;
                    case 3:
                        j = C11251d.m5619m(j, 86400000L);
                        break;
                    case 4:
                        j = C11251d.m5620l(j, DateTimeConstants.SECONDS_PER_DAY);
                        break;
                    case 5:
                        j = C11251d.m5620l(j, DateTimeConstants.MINUTES_PER_DAY);
                        break;
                    case 6:
                        j = C11251d.m5620l(j, 24);
                        break;
                    case 7:
                        j = C11251d.m5620l(j, 2);
                        break;
                }
                return C11251d.m5621k(j, this.f21283x.mo15872f(mo16232l.mo16130r(), interfaceC8314k));
            }
            ?? mo42219q = mo16232l.mo42219q();
            AbstractC8176b abstractC8176b = mo42219q;
            if (mo16232l.mo16130r().m16100q(this.f21283x)) {
                abstractC8176b = mo42219q.mo5632d(1L, EnumC8289b.DAYS);
            }
            return this.f21282w.mo15872f(abstractC8176b, interfaceC8314k);
        }
        return interfaceC8314k.between(this, mo16232l);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8178c
    /* renamed from: g */
    public AbstractC8183f<D> mo16126x(AbstractC8280n abstractC8280n) {
        return C8186g.m16354x(this, abstractC8280n, null);
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public int get(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            return interfaceC8304h.isTimeBased() ? this.f21283x.get(interfaceC8304h) : this.f21282w.get(interfaceC8304h);
        }
        return range(interfaceC8304h).m15854a(getLong(interfaceC8304h), interfaceC8304h);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public long getLong(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            return interfaceC8304h.isTimeBased() ? this.f21283x.getLong(interfaceC8304h) : this.f21282w.getLong(interfaceC8304h);
        }
        return interfaceC8304h.getFrom(this);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public boolean isSupported(InterfaceC8304h interfaceC8304h) {
        return interfaceC8304h instanceof EnumC8288a ? interfaceC8304h.isDateBased() || interfaceC8304h.isTimeBased() : interfaceC8304h != null && interfaceC8304h.isSupportedBy(this);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8178c
    /* renamed from: q */
    public D mo42219q() {
        return this.f21282w;
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8178c
    /* renamed from: r */
    public C8219f mo16130r() {
        return this.f21283x;
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public C8315l range(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            return interfaceC8304h.isTimeBased() ? this.f21283x.range(interfaceC8304h) : this.f21282w.range(interfaceC8304h);
        }
        return interfaceC8304h.rangeRefinedBy(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f21282w);
        objectOutput.writeObject(this.f21283x);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8178c
    /* renamed from: x */
    public C8180d<D> mo42218n(long j, InterfaceC8314k interfaceC8314k) {
        if (interfaceC8314k instanceof EnumC8289b) {
            switch (C8181a.f21284a[((EnumC8289b) interfaceC8314k).ordinal()]) {
                case 1:
                    return m16369C(j);
                case 2:
                    return m16360z(j / 86400000000L).m16369C((j % 86400000000L) * 1000);
                case 3:
                    return m16360z(j / 86400000).m16369C((j % 86400000) * 1000000);
                case 4:
                    return m16368D(j);
                case 5:
                    return m16370B(j);
                case 6:
                    return m16371A(j);
                case 7:
                    return m16360z(j / 256).m16371A((j % 256) * 12);
                default:
                    return m16365H(this.f21282w.mo15873e(j, interfaceC8314k), this.f21283x);
            }
        }
        return this.f21282w.mo16173j().m16350e(interfaceC8314k.addTo(this, j));
    }
}
