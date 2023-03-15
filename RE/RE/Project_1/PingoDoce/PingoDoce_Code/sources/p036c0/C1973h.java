package p036c0;

import id.InterfaceC6097a;
import java.util.Map;
import p092f0.AbstractC5250t0;
import p092f0.CompositionLocal;
import p181jd.AbstractC6438m;

/* renamed from: c0.h */
/* loaded from: classes.dex */
public final class C1973h {

    /* renamed from: a */
    private static final AbstractC5250t0<InterfaceC1972g> f5786a = CompositionLocal.m24952c(null, C1974a.f5787w, 1, null);

    /* compiled from: SelectionRegistrar.kt */
    /* renamed from: c0.h$a */
    /* loaded from: classes.dex */
    static final class C1974a extends AbstractC6438m implements InterfaceC6097a<InterfaceC1972g> {

        /* renamed from: w */
        public static final C1974a f5787w = new C1974a();

        C1974a() {
            super(0);
        }

        @Override // id.InterfaceC6097a
        /* renamed from: a */
        public final InterfaceC1972g mo42214q() {
            return null;
        }
    }

    /* renamed from: a */
    public static final AbstractC5250t0<InterfaceC1972g> m35000a() {
        return f5786a;
    }

    /* renamed from: b */
    public static final boolean m34999b(InterfaceC1972g interfaceC1972g, long j) {
        Map<Long, C1963e> m35006e;
        if (interfaceC1972g == null || (m35006e = interfaceC1972g.m35006e()) == null) {
            return false;
        }
        return m35006e.containsKey(Long.valueOf(j));
    }
}
