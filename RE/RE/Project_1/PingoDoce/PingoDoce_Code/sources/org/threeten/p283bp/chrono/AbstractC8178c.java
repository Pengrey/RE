package org.threeten.p283bp.chrono;

import java.util.Comparator;
import org.threeten.p283bp.AbstractC8280n;
import org.threeten.p283bp.C8171c;
import org.threeten.p283bp.C8213d;
import org.threeten.p283bp.C8219f;
import org.threeten.p283bp.C8282o;
import org.threeten.p283bp.chrono.AbstractC8176b;
import org.threeten.p283bp.temporal.C8305i;
import org.threeten.p283bp.temporal.EnumC8288a;
import org.threeten.p283bp.temporal.EnumC8289b;
import org.threeten.p283bp.temporal.InterfaceC8298d;
import org.threeten.p283bp.temporal.InterfaceC8300f;
import org.threeten.p283bp.temporal.InterfaceC8304h;
import org.threeten.p283bp.temporal.InterfaceC8313j;
import org.threeten.p283bp.temporal.InterfaceC8314k;
import p405vf.AbstractC11249b;
import p405vf.C11251d;

/* renamed from: org.threeten.bp.chrono.c */
/* loaded from: classes2.dex */
public abstract class AbstractC8178c<D extends AbstractC8176b> extends AbstractC11249b implements InterfaceC8298d, InterfaceC8300f {

    /* compiled from: ChronoLocalDateTime.java */
    /* renamed from: org.threeten.bp.chrono.c$a */
    /* loaded from: classes2.dex */
    class C8179a implements Comparator<AbstractC8178c<?>> {
        C8179a() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [org.threeten.bp.chrono.b] */
        /* JADX WARN: Type inference failed for: r2v0, types: [org.threeten.bp.chrono.b] */
        @Override // java.util.Comparator
        /* renamed from: a */
        public int mo16372a(AbstractC8178c<?> abstractC8178c, AbstractC8178c<?> abstractC8178c2) {
            int m5630b = C11251d.m5630b(abstractC8178c.mo42219q().mo16167p(), abstractC8178c2.mo42219q().mo16167p());
            return m5630b == 0 ? C11251d.m5630b(abstractC8178c.mo16130r().m16118G(), abstractC8178c2.mo16130r().m16118G()) : m5630b;
        }
    }

    static {
        new C8179a();
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8300f
    public InterfaceC8298d adjustInto(InterfaceC8298d interfaceC8298d) {
        return interfaceC8298d.mo15874c(EnumC8288a.EPOCH_DAY, mo42219q().mo16167p()).mo15874c(EnumC8288a.NANO_OF_DAY, mo16130r().m16118G());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC8178c) && mo16376i((AbstractC8178c) obj) == 0;
    }

    /* renamed from: g */
    public abstract AbstractC8183f<D> mo16126x(AbstractC8280n abstractC8280n);

    public int hashCode() {
        return mo42219q().hashCode() ^ mo16130r().hashCode();
    }

    @Override // 
    /* renamed from: i */
    public int mo16376i(AbstractC8178c<?> abstractC8178c) {
        int compareTo = mo42219q().compareTo(abstractC8178c.mo42219q());
        if (compareTo == 0) {
            int compareTo2 = mo16130r().compareTo(abstractC8178c.mo16130r());
            return compareTo2 == 0 ? m16375j().compareTo(abstractC8178c.m16375j()) : compareTo2;
        }
        return compareTo;
    }

    /* renamed from: j */
    public AbstractC8188h m16375j() {
        return mo42219q().mo16173j();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [org.threeten.bp.chrono.b] */
    /* renamed from: k */
    public boolean mo16135k(AbstractC8178c<?> abstractC8178c) {
        int i = (mo42219q().mo16167p() > abstractC8178c.mo42219q().mo16167p() ? 1 : (mo42219q().mo16167p() == abstractC8178c.mo42219q().mo16167p() ? 0 : -1));
        return i > 0 || (i == 0 && mo16130r().m16118G() > abstractC8178c.mo16130r().m16118G());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [org.threeten.bp.chrono.b] */
    /* renamed from: l */
    public boolean mo16134l(AbstractC8178c<?> abstractC8178c) {
        int i = (mo42219q().mo16167p() > abstractC8178c.mo42219q().mo16167p() ? 1 : (mo42219q().mo16167p() == abstractC8178c.mo42219q().mo16167p() ? 0 : -1));
        return i < 0 || (i == 0 && mo16130r().m16118G() < abstractC8178c.mo16130r().m16118G());
    }

    @Override // p405vf.AbstractC11249b, org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: m */
    public AbstractC8178c<D> mo5632d(long j, InterfaceC8314k interfaceC8314k) {
        return mo42219q().mo16173j().m16350e(super.mo5632d(j, interfaceC8314k));
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: n */
    public abstract AbstractC8178c<D> mo15873e(long j, InterfaceC8314k interfaceC8314k);

    /* renamed from: o */
    public long m16374o(C8282o c8282o) {
        C11251d.m5623i(c8282o, "offset");
        return ((mo42219q().mo16167p() * 86400) + mo16130r().m16117H()) - c8282o.m15925r();
    }

    /* renamed from: p */
    public C8171c m16373p(C8282o c8282o) {
        return C8171c.m16385q(m16374o(c8282o), mo16130r().m16103n());
    }

    /* renamed from: q */
    public abstract D mo42219q();

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public <R> R query(InterfaceC8313j<R> interfaceC8313j) {
        if (interfaceC8313j == C8305i.m15869a()) {
            return (R) m16375j();
        }
        if (interfaceC8313j == C8305i.m15865e()) {
            return (R) EnumC8289b.NANOS;
        }
        if (interfaceC8313j == C8305i.m15868b()) {
            return (R) C8213d.m16191Q(mo42219q().mo16167p());
        }
        if (interfaceC8313j == C8305i.m15867c()) {
            return (R) mo16130r();
        }
        if (interfaceC8313j == C8305i.m15864f() || interfaceC8313j == C8305i.m15863g() || interfaceC8313j == C8305i.m15866d()) {
            return null;
        }
        return (R) super.query(interfaceC8313j);
    }

    /* renamed from: r */
    public abstract C8219f mo16130r();

    @Override // p405vf.AbstractC11249b, org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: s */
    public AbstractC8178c<D> mo5633b(InterfaceC8300f interfaceC8300f) {
        return mo42219q().mo16173j().m16350e(super.mo5633b(interfaceC8300f));
    }

    public String toString() {
        return mo42219q().toString() + 'T' + mo16130r().toString();
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: u */
    public abstract AbstractC8178c<D> mo15874c(InterfaceC8304h interfaceC8304h, long j);
}
