package org.threeten.p283bp.chrono;

import java.util.Comparator;
import org.threeten.p283bp.AbstractC8280n;
import org.threeten.p283bp.C8213d;
import org.threeten.p283bp.C8219f;
import org.threeten.p283bp.C8282o;
import org.threeten.p283bp.chrono.AbstractC8176b;
import org.threeten.p283bp.temporal.C8305i;
import org.threeten.p283bp.temporal.C8315l;
import org.threeten.p283bp.temporal.EnumC8288a;
import org.threeten.p283bp.temporal.EnumC8289b;
import org.threeten.p283bp.temporal.InterfaceC8298d;
import org.threeten.p283bp.temporal.InterfaceC8300f;
import org.threeten.p283bp.temporal.InterfaceC8304h;
import org.threeten.p283bp.temporal.InterfaceC8313j;
import org.threeten.p283bp.temporal.InterfaceC8314k;
import org.threeten.p283bp.temporal.UnsupportedTemporalTypeException;
import p405vf.AbstractC11249b;
import p405vf.C11251d;

/* renamed from: org.threeten.bp.chrono.f */
/* loaded from: classes2.dex */
public abstract class AbstractC8183f<D extends AbstractC8176b> extends AbstractC11249b implements InterfaceC8298d {

    /* compiled from: ChronoZonedDateTime.java */
    /* renamed from: org.threeten.bp.chrono.f$a */
    /* loaded from: classes2.dex */
    class C8184a implements Comparator<AbstractC8183f<?>> {
        C8184a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(AbstractC8183f<?> abstractC8183f, AbstractC8183f<?> abstractC8183f2) {
            int m5630b = C11251d.m5630b(abstractC8183f.m16358m(), abstractC8183f2.m16358m());
            return m5630b == 0 ? C11251d.m5630b(abstractC8183f.mo15883p().m16118G(), abstractC8183f2.mo15883p().m16118G()) : m5630b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChronoZonedDateTime.java */
    /* renamed from: org.threeten.bp.chrono.f$b */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C8185b {

        /* renamed from: a */
        static final /* synthetic */ int[] f21285a;

        static {
            int[] iArr = new int[EnumC8288a.values().length];
            f21285a = iArr;
            try {
                iArr[EnumC8288a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21285a[EnumC8288a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        new C8184a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC8183f) && compareTo((AbstractC8183f) obj) == 0;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [org.threeten.bp.chrono.b] */
    /* renamed from: g */
    public int compareTo(AbstractC8183f<?> abstractC8183f) {
        int m5630b = C11251d.m5630b(m16358m(), abstractC8183f.m16358m());
        if (m5630b == 0) {
            int m16103n = mo15883p().m16103n() - abstractC8183f.mo15883p().m16103n();
            if (m16103n == 0) {
                int mo16376i = mo15884o().mo16376i(abstractC8183f.mo15884o());
                if (mo16376i == 0) {
                    int compareTo = mo15888j().mo15915h().compareTo(abstractC8183f.mo15888j().mo15915h());
                    return compareTo == 0 ? mo15885n().mo16173j().compareTo(abstractC8183f.mo15885n().mo16173j()) : compareTo;
                }
                return mo16376i;
            }
            return m16103n;
        }
        return m5630b;
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public int get(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            int i = C8185b.f21285a[((EnumC8288a) interfaceC8304h).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return mo15884o().get(interfaceC8304h);
                }
                return mo15889i().m15925r();
            }
            throw new UnsupportedTemporalTypeException("Field too large for an int: " + interfaceC8304h);
        }
        return super.get(interfaceC8304h);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public long getLong(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            int i = C8185b.f21285a[((EnumC8288a) interfaceC8304h).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return mo15884o().getLong(interfaceC8304h);
                }
                return mo15889i().m15925r();
            }
            return m16358m();
        }
        return interfaceC8304h.getFrom(this);
    }

    public int hashCode() {
        return (mo15884o().hashCode() ^ mo15889i().hashCode()) ^ Integer.rotateLeft(mo15888j().hashCode(), 3);
    }

    /* renamed from: i */
    public abstract C8282o mo15889i();

    /* renamed from: j */
    public abstract AbstractC8280n mo15888j();

    @Override // p405vf.AbstractC11249b, org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: k */
    public AbstractC8183f<D> mo5632d(long j, InterfaceC8314k interfaceC8314k) {
        return mo15885n().mo16173j().m16349f(super.mo5632d(j, interfaceC8314k));
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: l */
    public abstract AbstractC8183f<D> mo15873e(long j, InterfaceC8314k interfaceC8314k);

    /* renamed from: m */
    public long m16358m() {
        return ((mo15885n().mo16167p() * 86400) + mo15883p().m16117H()) - mo15889i().m15925r();
    }

    /* renamed from: n */
    public D mo15885n() {
        return mo15884o().mo42219q();
    }

    /* renamed from: o */
    public abstract AbstractC8178c<D> mo15884o();

    /* renamed from: p */
    public C8219f mo15883p() {
        return mo15884o().mo16130r();
    }

    @Override // p405vf.AbstractC11249b, org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: q */
    public AbstractC8183f<D> mo5633b(InterfaceC8300f interfaceC8300f) {
        return mo15885n().mo16173j().m16349f(super.mo5633b(interfaceC8300f));
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public <R> R query(InterfaceC8313j<R> interfaceC8313j) {
        if (interfaceC8313j != C8305i.m15863g() && interfaceC8313j != C8305i.m15864f()) {
            if (interfaceC8313j == C8305i.m15869a()) {
                return (R) mo15885n().mo16173j();
            }
            if (interfaceC8313j == C8305i.m15865e()) {
                return (R) EnumC8289b.NANOS;
            }
            if (interfaceC8313j == C8305i.m15866d()) {
                return (R) mo15889i();
            }
            if (interfaceC8313j == C8305i.m15868b()) {
                return (R) C8213d.m16191Q(mo15885n().mo16167p());
            }
            if (interfaceC8313j == C8305i.m15867c()) {
                return (R) mo15883p();
            }
            return (R) super.query(interfaceC8313j);
        }
        return (R) mo15888j();
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: r */
    public abstract AbstractC8183f<D> mo15874c(InterfaceC8304h interfaceC8304h, long j);

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public C8315l range(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            if (interfaceC8304h != EnumC8288a.INSTANT_SECONDS && interfaceC8304h != EnumC8288a.OFFSET_SECONDS) {
                return mo15884o().range(interfaceC8304h);
            }
            return interfaceC8304h.range();
        }
        return interfaceC8304h.rangeRefinedBy(this);
    }

    /* renamed from: s */
    public abstract AbstractC8183f<D> mo15880s(AbstractC8280n abstractC8280n);

    public String toString() {
        String str = mo15884o().toString() + mo15889i().toString();
        if (mo15889i() != mo15888j()) {
            return str + '[' + mo15888j().toString() + ']';
        }
        return str;
    }

    /* renamed from: u */
    public abstract AbstractC8183f<D> mo15879u(AbstractC8280n abstractC8280n);
}
