package p455y;

import androidx.compose.foundation.lazy.InterfaceC0632c;
import androidx.compose.foundation.lazy.InterfaceC0635f;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6114r;
import java.util.List;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p229m0.ComposableLambda;
import p468yc.C13195u;
import p489zc.C13780s;

/* compiled from: LazyListScopeImpl.kt */
/* renamed from: y.s */
/* loaded from: classes.dex */
public final class C13039s implements InterfaceC0635f {

    /* renamed from: a */
    private final C13055y f33887a;

    /* renamed from: b */
    private final InterfaceC13017c f33888b;

    /* renamed from: c */
    private List f33889c;

    /* compiled from: LazyListScopeImpl.kt */
    /* renamed from: y.s$a */
    /* loaded from: classes.dex */
    static final class C13040a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6114r f33890w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LazyListScopeImpl.kt */
        /* renamed from: y.s$a$a */
        /* loaded from: classes.dex */
        public static final class C13041a extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6114r f33891w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC0632c f33892x;

            /* renamed from: y */
            final /* synthetic */ int f33893y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13041a(InterfaceC6114r interfaceC6114r, InterfaceC0632c interfaceC0632c, int i) {
                super(2);
                this.f33891w = interfaceC6114r;
                this.f33892x = interfaceC0632c;
                this.f33893y = i;
            }

            /* renamed from: F */
            public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                m1817a((InterfaceC5179i) obj, ((Number) obj2).intValue());
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m1817a(InterfaceC5179i interfaceC5179i, int i) {
                if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                    interfaceC5179i.mo25264f();
                } else {
                    this.f33891w.mo22157a0(this.f33892x, Integer.valueOf(this.f33893y), interfaceC5179i, 0);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13040a(InterfaceC6114r interfaceC6114r) {
            super(2);
            this.f33890w = interfaceC6114r;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            return m1819a((InterfaceC0632c) obj, ((Number) obj2).intValue());
        }

        /* renamed from: a */
        public final InterfaceC6112p m1819a(InterfaceC0632c interfaceC0632c, int i) {
            Intrinsics.isThisObjectNull(interfaceC0632c, "$this$$receiver");
            return ComposableLambda.m19326c(-985533267, true, new C13041a(this.f33890w, interfaceC0632c, i));
        }
    }

    public C13039s() {
        C13055y c13055y = new C13055y();
        this.f33887a = c13055y;
        this.f33888b = c13055y;
    }

    /* renamed from: a */
    public void mo40033a(int i, InterfaceC6108l interfaceC6108l, InterfaceC6114r interfaceC6114r) {
        Intrinsics.isThisObjectNull(interfaceC6114r, "itemContent");
        this.f33887a.m1781c(i, new LazyListScopeImpl(interfaceC6108l, new C13040a(interfaceC6114r)));
    }

    /* renamed from: b */
    public final List m1822b() {
        List m197g;
        List list = this.f33889c;
        if (list == null) {
            m197g = C13780s.m197g();
            return m197g;
        }
        return list;
    }

    /* renamed from: c */
    public final InterfaceC13017c m1821c() {
        return this.f33888b;
    }
}
