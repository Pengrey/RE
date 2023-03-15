package org.threeten.p283bp.chrono;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.util.Iterator;
import java.util.Locale;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import org.threeten.p283bp.AbstractC8280n;
import org.threeten.p283bp.C8171c;
import org.threeten.p283bp.C8219f;
import org.threeten.p283bp.DateTimeException;
import org.threeten.p283bp.temporal.C8305i;
import org.threeten.p283bp.temporal.InterfaceC8298d;
import org.threeten.p283bp.temporal.InterfaceC8299e;
import org.threeten.p283bp.temporal.InterfaceC8313j;
import p405vf.C11251d;

/* renamed from: org.threeten.bp.chrono.h */
/* loaded from: classes2.dex */
public abstract class AbstractC8188h implements Comparable<AbstractC8188h> {

    /* renamed from: w */
    private static final ConcurrentHashMap<String, AbstractC8188h> f21290w;

    /* renamed from: x */
    private static final ConcurrentHashMap<String, AbstractC8188h> f21291x;

    /* compiled from: Chronology.java */
    /* renamed from: org.threeten.bp.chrono.h$a */
    /* loaded from: classes2.dex */
    class C8189a implements InterfaceC8313j<AbstractC8188h> {
        C8189a() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public AbstractC8188h mo16124b(InterfaceC8299e interfaceC8299e) {
            return AbstractC8188h.m16348h(interfaceC8299e);
        }
    }

    static {
        new C8189a();
        f21290w = new ConcurrentHashMap<>();
        f21291x = new ConcurrentHashMap<>();
        try {
            Locale.class.getMethod("getUnicodeLocaleType", String.class);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: h */
    public static AbstractC8188h m16348h(InterfaceC8299e interfaceC8299e) {
        C11251d.m5623i(interfaceC8299e, "temporal");
        AbstractC8188h abstractC8188h = (AbstractC8188h) interfaceC8299e.query(C8305i.m15869a());
        return abstractC8188h != null ? abstractC8188h : C8195m.f21328y;
    }

    /* renamed from: k */
    private static void m16347k() {
        ConcurrentHashMap<String, AbstractC8188h> concurrentHashMap = f21290w;
        if (concurrentHashMap.isEmpty()) {
            m16344o(C8195m.f21328y);
            m16344o(C8208v.f21356y);
            m16344o(C8202r.f21350y);
            m16344o(C8197o.f21334z);
            C8191j c8191j = C8191j.f21294y;
            m16344o(c8191j);
            concurrentHashMap.putIfAbsent("Hijrah", c8191j);
            f21291x.putIfAbsent("islamic", c8191j);
            Iterator it = ServiceLoader.load(AbstractC8188h.class, AbstractC8188h.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                AbstractC8188h abstractC8188h = (AbstractC8188h) it.next();
                f21290w.putIfAbsent(abstractC8188h.mo16233j(), abstractC8188h);
                String mo16234i = abstractC8188h.mo16234i();
                if (mo16234i != null) {
                    f21291x.putIfAbsent(mo16234i, abstractC8188h);
                }
            }
        }
    }

    /* renamed from: m */
    public static AbstractC8188h m16346m(String str) {
        m16347k();
        AbstractC8188h abstractC8188h = f21290w.get(str);
        if (abstractC8188h != null) {
            return abstractC8188h;
        }
        AbstractC8188h abstractC8188h2 = f21291x.get(str);
        if (abstractC8188h2 != null) {
            return abstractC8188h2;
        }
        throw new DateTimeException("Unknown chronology: " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static AbstractC8188h m16345n(DataInput dataInput) throws IOException {
        return m16346m(dataInput.readUTF());
    }

    /* renamed from: o */
    private static void m16344o(AbstractC8188h abstractC8188h) {
        f21290w.putIfAbsent(abstractC8188h.mo16233j(), abstractC8188h);
        String mo16234i = abstractC8188h.mo16234i();
        if (mo16234i != null) {
            f21291x.putIfAbsent(mo16234i, abstractC8188h);
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C8207u((byte) 11, this);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(AbstractC8188h abstractC8188h) {
        return mo16233j().compareTo(abstractC8188h.mo16233j());
    }

    /* renamed from: c */
    public abstract AbstractC8176b mo16236c(InterfaceC8299e interfaceC8299e);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public <D extends AbstractC8176b> D m16351d(InterfaceC8298d interfaceC8298d) {
        D d = (D) interfaceC8298d;
        if (equals(d.mo16173j())) {
            return d;
        }
        throw new ClassCastException("Chrono mismatch, expected: " + mo16233j() + ", actual: " + d.mo16173j().mo16233j());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public <D extends AbstractC8176b> C8180d<D> m16350e(InterfaceC8298d interfaceC8298d) {
        C8180d<D> c8180d = (C8180d) interfaceC8298d;
        if (equals(c8180d.mo42219q().mo16173j())) {
            return c8180d;
        }
        throw new ClassCastException("Chrono mismatch, required: " + mo16233j() + ", supplied: " + c8180d.mo42219q().mo16173j().mo16233j());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC8188h) && compareTo((AbstractC8188h) obj) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public <D extends AbstractC8176b> C8186g<D> m16349f(InterfaceC8298d interfaceC8298d) {
        C8186g<D> c8186g = (C8186g) interfaceC8298d;
        if (equals(c8186g.mo15885n().mo16173j())) {
            return c8186g;
        }
        throw new ClassCastException("Chrono mismatch, required: " + mo16233j() + ", supplied: " + c8186g.mo15885n().mo16173j().mo16233j());
    }

    /* renamed from: g */
    public abstract InterfaceC8190i mo16235g(int i);

    public int hashCode() {
        return getClass().hashCode() ^ mo16233j().hashCode();
    }

    /* renamed from: i */
    public abstract String mo16234i();

    /* renamed from: j */
    public abstract String mo16233j();

    /* renamed from: l */
    public AbstractC8178c<?> mo16232l(InterfaceC8299e interfaceC8299e) {
        try {
            return mo16236c(interfaceC8299e).mo16175g(C8219f.m16106k(interfaceC8299e));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + interfaceC8299e.getClass(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m16343p(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(mo16233j());
    }

    /* renamed from: q */
    public AbstractC8183f<?> mo16231q(C8171c c8171c, AbstractC8280n abstractC8280n) {
        return C8186g.m16353z(this, c8171c, abstractC8280n);
    }

    /* renamed from: r */
    public AbstractC8183f<?> mo16230r(InterfaceC8299e interfaceC8299e) {
        try {
            AbstractC8280n m15934g = AbstractC8280n.m15934g(interfaceC8299e);
            try {
                return mo16231q(C8171c.m16392j(interfaceC8299e), m15934g);
            } catch (DateTimeException unused) {
                return C8186g.m16354x(m16350e(mo16232l(interfaceC8299e)), m15934g, null);
            }
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + interfaceC8299e.getClass(), e);
        }
    }

    public String toString() {
        return mo16233j();
    }
}
