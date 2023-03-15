package org.threeten.p283bp.format;

import java.util.Locale;
import org.threeten.p283bp.AbstractC8280n;
import org.threeten.p283bp.C8171c;
import org.threeten.p283bp.C8282o;
import org.threeten.p283bp.DateTimeException;
import org.threeten.p283bp.chrono.AbstractC8176b;
import org.threeten.p283bp.chrono.AbstractC8188h;
import org.threeten.p283bp.chrono.C8195m;
import org.threeten.p283bp.temporal.C8305i;
import org.threeten.p283bp.temporal.C8315l;
import org.threeten.p283bp.temporal.EnumC8288a;
import org.threeten.p283bp.temporal.InterfaceC8299e;
import org.threeten.p283bp.temporal.InterfaceC8304h;
import org.threeten.p283bp.temporal.InterfaceC8313j;
import p405vf.AbstractC11250c;
import p405vf.C11251d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.threeten.bp.format.e */
/* loaded from: classes2.dex */
public final class C8249e {

    /* renamed from: a */
    private InterfaceC8299e f21447a;

    /* renamed from: b */
    private Locale f21448b;

    /* renamed from: c */
    private C8253g f21449c;

    /* renamed from: d */
    private int f21450d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimePrintContext.java */
    /* renamed from: org.threeten.bp.format.e$a */
    /* loaded from: classes2.dex */
    public class C8250a extends AbstractC11250c {

        /* renamed from: w */
        final /* synthetic */ AbstractC8176b f21451w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC8299e f21452x;

        /* renamed from: y */
        final /* synthetic */ AbstractC8188h f21453y;

        /* renamed from: z */
        final /* synthetic */ AbstractC8280n f21454z;

        C8250a(AbstractC8176b abstractC8176b, InterfaceC8299e interfaceC8299e, AbstractC8188h abstractC8188h, AbstractC8280n abstractC8280n) {
            this.f21451w = abstractC8176b;
            this.f21452x = interfaceC8299e;
            this.f21453y = abstractC8188h;
            this.f21454z = abstractC8280n;
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8299e
        public long getLong(InterfaceC8304h interfaceC8304h) {
            if (this.f21451w != null && interfaceC8304h.isDateBased()) {
                return this.f21451w.getLong(interfaceC8304h);
            }
            return this.f21452x.getLong(interfaceC8304h);
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8299e
        public boolean isSupported(InterfaceC8304h interfaceC8304h) {
            if (this.f21451w != null && interfaceC8304h.isDateBased()) {
                return this.f21451w.isSupported(interfaceC8304h);
            }
            return this.f21452x.isSupported(interfaceC8304h);
        }

        @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
        public <R> R query(InterfaceC8313j<R> interfaceC8313j) {
            if (interfaceC8313j == C8305i.m15869a()) {
                return (R) this.f21453y;
            }
            if (interfaceC8313j == C8305i.m15863g()) {
                return (R) this.f21454z;
            }
            if (interfaceC8313j == C8305i.m15865e()) {
                return (R) this.f21452x.query(interfaceC8313j);
            }
            return interfaceC8313j.mo16124b(this);
        }

        @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
        public C8315l range(InterfaceC8304h interfaceC8304h) {
            if (this.f21451w != null && interfaceC8304h.isDateBased()) {
                return this.f21451w.range(interfaceC8304h);
            }
            return this.f21452x.range(interfaceC8304h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8249e(InterfaceC8299e interfaceC8299e, C8223b c8223b) {
        this.f21447a = m16035a(interfaceC8299e, c8223b);
        this.f21448b = c8223b.m16087e();
        this.f21449c = c8223b.m16088d();
    }

    /* renamed from: a */
    private static InterfaceC8299e m16035a(InterfaceC8299e interfaceC8299e, C8223b c8223b) {
        EnumC8288a[] values;
        AbstractC8188h m16089c = c8223b.m16089c();
        AbstractC8280n m16086f = c8223b.m16086f();
        if (m16089c == null && m16086f == null) {
            return interfaceC8299e;
        }
        AbstractC8188h abstractC8188h = (AbstractC8188h) interfaceC8299e.query(C8305i.m15869a());
        AbstractC8280n abstractC8280n = (AbstractC8280n) interfaceC8299e.query(C8305i.m15863g());
        AbstractC8176b abstractC8176b = null;
        if (C11251d.m5629c(abstractC8188h, m16089c)) {
            m16089c = null;
        }
        if (C11251d.m5629c(abstractC8280n, m16086f)) {
            m16086f = null;
        }
        if (m16089c == null && m16086f == null) {
            return interfaceC8299e;
        }
        AbstractC8188h abstractC8188h2 = m16089c != null ? m16089c : abstractC8188h;
        if (m16086f != null) {
            abstractC8280n = m16086f;
        }
        if (m16086f != null) {
            if (interfaceC8299e.isSupported(EnumC8288a.INSTANT_SECONDS)) {
                if (abstractC8188h2 == null) {
                    abstractC8188h2 = C8195m.f21328y;
                }
                return abstractC8188h2.mo16231q(C8171c.m16392j(interfaceC8299e), m16086f);
            }
            AbstractC8280n m15933j = m16086f.m15933j();
            C8282o c8282o = (C8282o) interfaceC8299e.query(C8305i.m15866d());
            if ((m15933j instanceof C8282o) && c8282o != null && !m15933j.equals(c8282o)) {
                throw new DateTimeException("Invalid override zone for temporal: " + m16086f + " " + interfaceC8299e);
            }
        }
        if (m16089c != null) {
            if (interfaceC8299e.isSupported(EnumC8288a.EPOCH_DAY)) {
                abstractC8176b = abstractC8188h2.mo16236c(interfaceC8299e);
            } else if (m16089c != C8195m.f21328y || abstractC8188h != null) {
                for (EnumC8288a enumC8288a : EnumC8288a.values()) {
                    if (enumC8288a.isDateBased() && interfaceC8299e.isSupported(enumC8288a)) {
                        throw new DateTimeException("Invalid override chronology for temporal: " + m16089c + " " + interfaceC8299e);
                    }
                }
            }
        }
        return new C8250a(abstractC8176b, interfaceC8299e, abstractC8188h2, abstractC8280n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m16034b() {
        this.f21450d--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Locale m16033c() {
        return this.f21448b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C8253g m16032d() {
        return this.f21449c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public InterfaceC8299e m16031e() {
        return this.f21447a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Long m16030f(InterfaceC8304h interfaceC8304h) {
        try {
            return Long.valueOf(this.f21447a.getLong(interfaceC8304h));
        } catch (DateTimeException e) {
            if (this.f21450d > 0) {
                return null;
            }
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public <R> R m16029g(InterfaceC8313j<R> interfaceC8313j) {
        R r = (R) this.f21447a.query(interfaceC8313j);
        if (r == null && this.f21450d == 0) {
            throw new DateTimeException("Unable to extract value: " + this.f21447a.getClass());
        }
        return r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m16028h() {
        this.f21450d++;
    }

    public String toString() {
        return this.f21447a.toString();
    }
}
