package org.threeten.p283bp.chrono;

import java.util.Comparator;
import org.threeten.p283bp.C8213d;
import org.threeten.p283bp.C8219f;
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

/* renamed from: org.threeten.bp.chrono.b */
/* loaded from: classes2.dex */
public abstract class AbstractC8176b extends AbstractC11249b implements InterfaceC8298d, InterfaceC8300f {

    /* compiled from: ChronoLocalDate.java */
    /* renamed from: org.threeten.bp.chrono.b$a */
    /* loaded from: classes2.dex */
    class C8177a implements Comparator<AbstractC8176b> {
        C8177a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(AbstractC8176b abstractC8176b, AbstractC8176b abstractC8176b2) {
            return C11251d.m5630b(abstractC8176b.mo16167p(), abstractC8176b2.mo16167p());
        }
    }

    static {
        new C8177a();
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8300f
    public InterfaceC8298d adjustInto(InterfaceC8298d interfaceC8298d) {
        return interfaceC8298d.mo15874c(EnumC8288a.EPOCH_DAY, mo16167p());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC8176b) && compareTo((AbstractC8176b) obj) == 0;
    }

    /* renamed from: g */
    public AbstractC8178c<?> mo16175g(C8219f c8219f) {
        return C8180d.m16362w(this, c8219f);
    }

    public int hashCode() {
        long mo16167p = mo16167p();
        return ((int) (mo16167p ^ (mo16167p >>> 32))) ^ mo16173j().hashCode();
    }

    @Override // 
    /* renamed from: i */
    public int compareTo(AbstractC8176b abstractC8176b) {
        int m5630b = C11251d.m5630b(mo16167p(), abstractC8176b.mo16167p());
        return m5630b == 0 ? mo16173j().compareTo(abstractC8176b.mo16173j()) : m5630b;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public boolean isSupported(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            return interfaceC8304h.isDateBased();
        }
        return interfaceC8304h != null && interfaceC8304h.isSupportedBy(this);
    }

    /* renamed from: j */
    public abstract AbstractC8188h mo16173j();

    /* renamed from: k */
    public InterfaceC8190i mo16172k() {
        return mo16173j().mo16235g(get(EnumC8288a.ERA));
    }

    /* renamed from: l */
    public boolean mo16171l(AbstractC8176b abstractC8176b) {
        return mo16167p() > abstractC8176b.mo16167p();
    }

    /* renamed from: m */
    public boolean mo16170m(AbstractC8176b abstractC8176b) {
        return mo16167p() < abstractC8176b.mo16167p();
    }

    @Override // p405vf.AbstractC11249b, org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: n */
    public AbstractC8176b mo5632d(long j, InterfaceC8314k interfaceC8314k) {
        return mo16173j().m16351d(super.mo5632d(j, interfaceC8314k));
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: o */
    public abstract AbstractC8176b mo15873e(long j, InterfaceC8314k interfaceC8314k);

    /* renamed from: p */
    public long mo16167p() {
        return getLong(EnumC8288a.EPOCH_DAY);
    }

    @Override // p405vf.AbstractC11249b, org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: q */
    public AbstractC8176b mo5633b(InterfaceC8300f interfaceC8300f) {
        return mo16173j().m16351d(super.mo5633b(interfaceC8300f));
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public <R> R query(InterfaceC8313j<R> interfaceC8313j) {
        if (interfaceC8313j == C8305i.m15869a()) {
            return (R) mo16173j();
        }
        if (interfaceC8313j == C8305i.m15865e()) {
            return (R) EnumC8289b.DAYS;
        }
        if (interfaceC8313j == C8305i.m15868b()) {
            return (R) C8213d.m16191Q(mo16167p());
        }
        if (interfaceC8313j == C8305i.m15867c() || interfaceC8313j == C8305i.m15864f() || interfaceC8313j == C8305i.m15863g() || interfaceC8313j == C8305i.m15866d()) {
            return null;
        }
        return (R) super.query(interfaceC8313j);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: r */
    public abstract AbstractC8176b mo15874c(InterfaceC8304h interfaceC8304h, long j);

    public String toString() {
        long j = getLong(EnumC8288a.YEAR_OF_ERA);
        long j2 = getLong(EnumC8288a.MONTH_OF_YEAR);
        long j3 = getLong(EnumC8288a.DAY_OF_MONTH);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(mo16173j().toString());
        sb2.append(" ");
        sb2.append(mo16172k());
        sb2.append(" ");
        sb2.append(j);
        sb2.append(j2 < 10 ? "-0" : "-");
        sb2.append(j2);
        sb2.append(j3 >= 10 ? "-" : "-0");
        sb2.append(j3);
        return sb2.toString();
    }
}
