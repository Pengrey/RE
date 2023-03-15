package org.threeten.p283bp.chrono;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import org.threeten.p283bp.AbstractC8280n;
import org.threeten.p283bp.C8171c;
import org.threeten.p283bp.C8216e;
import org.threeten.p283bp.C8282o;
import org.threeten.p283bp.chrono.AbstractC8176b;
import org.threeten.p283bp.temporal.EnumC8288a;
import org.threeten.p283bp.temporal.EnumC8289b;
import org.threeten.p283bp.temporal.InterfaceC8298d;
import org.threeten.p283bp.temporal.InterfaceC8304h;
import org.threeten.p283bp.temporal.InterfaceC8314k;
import org.threeten.p283bp.zone.AbstractC8326f;
import org.threeten.p283bp.zone.C8322d;
import p405vf.C11251d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.threeten.bp.chrono.g */
/* loaded from: classes2.dex */
public final class C8186g<D extends AbstractC8176b> extends AbstractC8183f<D> implements Serializable {

    /* renamed from: w */
    private final C8180d<D> f21286w;

    /* renamed from: x */
    private final C8282o f21287x;

    /* renamed from: y */
    private final AbstractC8280n f21288y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChronoZonedDateTimeImpl.java */
    /* renamed from: org.threeten.bp.chrono.g$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C8187a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21289a;

        static {
            int[] iArr = new int[EnumC8288a.values().length];
            f21289a = iArr;
            try {
                iArr[EnumC8288a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21289a[EnumC8288a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private C8186g(C8180d<D> c8180d, C8282o c8282o, AbstractC8280n abstractC8280n) {
        this.f21286w = (C8180d) C11251d.m5623i(c8180d, "dateTime");
        this.f21287x = (C8282o) C11251d.m5623i(c8282o, "offset");
        this.f21288y = (AbstractC8280n) C11251d.m5623i(abstractC8280n, "zone");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static AbstractC8183f<?> m16356A(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        return (AbstractC8183f<D>) ((AbstractC8178c) objectInput.readObject()).mo16126x((C8282o) objectInput.readObject()).mo15879u((AbstractC8280n) objectInput.readObject());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: w */
    private C8186g<D> m16355w(C8171c c8171c, AbstractC8280n abstractC8280n) {
        return m16353z(mo15885n().mo16173j(), c8171c, abstractC8280n);
    }

    private Object writeReplace() {
        return new C8207u((byte) 13, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static <R extends AbstractC8176b> AbstractC8183f<R> m16354x(C8180d<R> c8180d, AbstractC8280n abstractC8280n, C8282o c8282o) {
        C11251d.m5623i(c8180d, "localDateTime");
        C11251d.m5623i(abstractC8280n, "zone");
        if (abstractC8280n instanceof C8282o) {
            return new C8186g(c8180d, (C8282o) abstractC8280n, abstractC8280n);
        }
        AbstractC8326f mo15914i = abstractC8280n.mo15914i();
        C8216e m16158A = C8216e.m16158A(c8180d);
        List<C8282o> mo15782c = mo15914i.mo15782c(m16158A);
        if (mo15782c.size() == 1) {
            c8282o = mo15782c.get(0);
        } else if (mo15782c.size() == 0) {
            C8322d mo15783b = mo15914i.mo15783b(m16158A);
            c8180d = c8180d.m16368D(mo15783b.m15799e().m16405d());
            c8282o = mo15783b.m15796h();
        } else if (c8282o == null || !mo15782c.contains(c8282o)) {
            c8282o = mo15782c.get(0);
        }
        C11251d.m5623i(c8282o, "offset");
        return new C8186g(c8180d, c8282o, abstractC8280n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static <R extends AbstractC8176b> C8186g<R> m16353z(AbstractC8188h abstractC8188h, C8171c c8171c, AbstractC8280n abstractC8280n) {
        C8282o mo15784a = abstractC8280n.mo15914i().mo15784a(c8171c);
        C11251d.m5623i(mo15784a, "offset");
        return new C8186g<>((C8180d) abstractC8188h.mo16232l(C8216e.m16150J(c8171c.m16391k(), c8171c.m16390l(), mo15784a)), mo15784a, abstractC8280n);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC8183f) && compareTo((AbstractC8183f) obj) == 0;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: f */
    public long mo15872f(InterfaceC8298d interfaceC8298d, InterfaceC8314k interfaceC8314k) {
        AbstractC8183f<?> mo16230r = mo15885n().mo16173j().mo16230r(interfaceC8298d);
        if (interfaceC8314k instanceof EnumC8289b) {
            return this.f21286w.mo15872f(mo16230r.mo15880s(this.f21287x).mo15884o(), interfaceC8314k);
        }
        return interfaceC8314k.between(this, mo16230r);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f
    public int hashCode() {
        return (mo15884o().hashCode() ^ mo15889i().hashCode()) ^ Integer.rotateLeft(mo15888j().hashCode(), 3);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f
    /* renamed from: i */
    public C8282o mo15889i() {
        return this.f21287x;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public boolean isSupported(InterfaceC8304h interfaceC8304h) {
        return (interfaceC8304h instanceof EnumC8288a) || (interfaceC8304h != null && interfaceC8304h.isSupportedBy(this));
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f
    /* renamed from: j */
    public AbstractC8280n mo15888j() {
        return this.f21288y;
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f, org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: l */
    public AbstractC8183f<D> mo15873e(long j, InterfaceC8314k interfaceC8314k) {
        if (interfaceC8314k instanceof EnumC8289b) {
            return mo5633b(this.f21286w.mo42218n(j, interfaceC8314k));
        }
        return mo15885n().mo16173j().m16349f(interfaceC8314k.addTo(this, j));
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f
    /* renamed from: o */
    public AbstractC8178c<D> mo15884o() {
        return this.f21286w;
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f, org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: r */
    public AbstractC8183f<D> mo15874c(InterfaceC8304h interfaceC8304h, long j) {
        if (interfaceC8304h instanceof EnumC8288a) {
            EnumC8288a enumC8288a = (EnumC8288a) interfaceC8304h;
            int i = C8187a.f21289a[enumC8288a.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return m16354x(this.f21286w.mo42221u(interfaceC8304h, j), this.f21288y, this.f21287x);
                }
                return m16355w(this.f21286w.m16373p(C8282o.m15922u(enumC8288a.checkValidIntValue(j))), this.f21288y);
            }
            return mo15873e(j - m16358m(), EnumC8289b.SECONDS);
        }
        return mo15885n().mo16173j().m16349f(interfaceC8304h.adjustInto(this, j));
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f
    /* renamed from: s */
    public AbstractC8183f<D> mo15880s(AbstractC8280n abstractC8280n) {
        C11251d.m5623i(abstractC8280n, "zone");
        return this.f21288y.equals(abstractC8280n) ? this : m16355w(this.f21286w.m16373p(this.f21287x), abstractC8280n);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f
    public String toString() {
        String str = mo15884o().toString() + mo15889i().toString();
        if (mo15889i() != mo15888j()) {
            return str + '[' + mo15888j().toString() + ']';
        }
        return str;
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8183f
    /* renamed from: u */
    public AbstractC8183f<D> mo15879u(AbstractC8280n abstractC8280n) {
        return m16354x(this.f21286w, abstractC8280n, this.f21287x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f21286w);
        objectOutput.writeObject(this.f21287x);
        objectOutput.writeObject(this.f21288y);
    }
}
