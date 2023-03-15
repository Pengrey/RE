package org.threeten.p283bp.temporal;

import org.threeten.p283bp.AbstractC8280n;
import org.threeten.p283bp.C8213d;
import org.threeten.p283bp.C8219f;
import org.threeten.p283bp.C8282o;
import org.threeten.p283bp.chrono.AbstractC8188h;

/* renamed from: org.threeten.bp.temporal.i */
/* loaded from: classes2.dex */
public final class C8305i {

    /* renamed from: a */
    static final InterfaceC8313j<AbstractC8280n> f21507a = new C8306a();

    /* renamed from: b */
    static final InterfaceC8313j<AbstractC8188h> f21508b = new C8307b();

    /* renamed from: c */
    static final InterfaceC8313j<InterfaceC8314k> f21509c = new C8308c();

    /* renamed from: d */
    static final InterfaceC8313j<AbstractC8280n> f21510d = new C8309d();

    /* renamed from: e */
    static final InterfaceC8313j<C8282o> f21511e = new C8310e();

    /* renamed from: f */
    static final InterfaceC8313j<C8213d> f21512f = new C8311f();

    /* renamed from: g */
    static final InterfaceC8313j<C8219f> f21513g = new C8312g();

    /* compiled from: TemporalQueries.java */
    /* renamed from: org.threeten.bp.temporal.i$a */
    /* loaded from: classes2.dex */
    class C8306a implements InterfaceC8313j<AbstractC8280n> {
        C8306a() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public AbstractC8280n mo16124b(InterfaceC8299e interfaceC8299e) {
            return (AbstractC8280n) interfaceC8299e.query(this);
        }
    }

    /* compiled from: TemporalQueries.java */
    /* renamed from: org.threeten.bp.temporal.i$b */
    /* loaded from: classes2.dex */
    class C8307b implements InterfaceC8313j<AbstractC8188h> {
        C8307b() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public AbstractC8188h mo16124b(InterfaceC8299e interfaceC8299e) {
            return (AbstractC8188h) interfaceC8299e.query(this);
        }
    }

    /* compiled from: TemporalQueries.java */
    /* renamed from: org.threeten.bp.temporal.i$c */
    /* loaded from: classes2.dex */
    class C8308c implements InterfaceC8313j<InterfaceC8314k> {
        C8308c() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public InterfaceC8314k mo16124b(InterfaceC8299e interfaceC8299e) {
            return (InterfaceC8314k) interfaceC8299e.query(this);
        }
    }

    /* compiled from: TemporalQueries.java */
    /* renamed from: org.threeten.bp.temporal.i$d */
    /* loaded from: classes2.dex */
    class C8309d implements InterfaceC8313j<AbstractC8280n> {
        C8309d() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public AbstractC8280n mo16124b(InterfaceC8299e interfaceC8299e) {
            AbstractC8280n abstractC8280n = (AbstractC8280n) interfaceC8299e.query(C8305i.f21507a);
            return abstractC8280n != null ? abstractC8280n : (AbstractC8280n) interfaceC8299e.query(C8305i.f21511e);
        }
    }

    /* compiled from: TemporalQueries.java */
    /* renamed from: org.threeten.bp.temporal.i$e */
    /* loaded from: classes2.dex */
    class C8310e implements InterfaceC8313j<C8282o> {
        C8310e() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public C8282o mo16124b(InterfaceC8299e interfaceC8299e) {
            EnumC8288a enumC8288a = EnumC8288a.OFFSET_SECONDS;
            if (interfaceC8299e.isSupported(enumC8288a)) {
                return C8282o.m15922u(interfaceC8299e.get(enumC8288a));
            }
            return null;
        }
    }

    /* compiled from: TemporalQueries.java */
    /* renamed from: org.threeten.bp.temporal.i$f */
    /* loaded from: classes2.dex */
    class C8311f implements InterfaceC8313j<C8213d> {
        C8311f() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public C8213d mo16124b(InterfaceC8299e interfaceC8299e) {
            EnumC8288a enumC8288a = EnumC8288a.EPOCH_DAY;
            if (interfaceC8299e.isSupported(enumC8288a)) {
                return C8213d.m16191Q(interfaceC8299e.getLong(enumC8288a));
            }
            return null;
        }
    }

    /* compiled from: TemporalQueries.java */
    /* renamed from: org.threeten.bp.temporal.i$g */
    /* loaded from: classes2.dex */
    class C8312g implements InterfaceC8313j<C8219f> {
        C8312g() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public C8219f mo16124b(InterfaceC8299e interfaceC8299e) {
            EnumC8288a enumC8288a = EnumC8288a.NANO_OF_DAY;
            if (interfaceC8299e.isSupported(enumC8288a)) {
                return C8219f.m16097u(interfaceC8299e.getLong(enumC8288a));
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final InterfaceC8313j<AbstractC8188h> m15869a() {
        return f21508b;
    }

    /* renamed from: b */
    public static final InterfaceC8313j<C8213d> m15868b() {
        return f21512f;
    }

    /* renamed from: c */
    public static final InterfaceC8313j<C8219f> m15867c() {
        return f21513g;
    }

    /* renamed from: d */
    public static final InterfaceC8313j<C8282o> m15866d() {
        return f21511e;
    }

    /* renamed from: e */
    public static final InterfaceC8313j<InterfaceC8314k> m15865e() {
        return f21509c;
    }

    /* renamed from: f */
    public static final InterfaceC8313j<AbstractC8280n> m15864f() {
        return f21510d;
    }

    /* renamed from: g */
    public static final InterfaceC8313j<AbstractC8280n> m15863g() {
        return f21507a;
    }
}
