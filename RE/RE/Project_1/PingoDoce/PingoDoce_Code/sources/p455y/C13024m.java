package p455y;

import androidx.compose.foundation.lazy.LazyListState;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import p092f0.C5209j1;
import p092f0.C5232o1;
import p092f0.Effects;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5220m0;
import p092f0.InterfaceC5242r1;
import p169j1.C6267j0;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p297pd.C8611f;
import p297pd._Ranges;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13769l0;
import td.InterfaceC10524i0;

/* compiled from: LazyListItemsProviderImpl.kt */
/* renamed from: y.m */
/* loaded from: classes.dex */
public final class C13024m {

    /* renamed from: a */
    private static final int f33806a = 30;

    /* renamed from: b */
    private static final int f33807b = 100;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyListItemsProviderImpl.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.lazy.list.LazyListItemsProviderImplKt$rememberStateOfItemsProvider$1", m20196f = "LazyListItemsProviderImpl.kt", m20195l = {151}, m20194m = "invokeSuspend")
    /* renamed from: y.m$a */
    /* loaded from: classes.dex */
    public static final class C13025a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f33808x;

        /* renamed from: y */
        final /* synthetic */ LazyListState f33809y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC5220m0 f33810z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LazyListItemsProviderImpl.kt */
        /* renamed from: y.m$a$a */
        /* loaded from: classes.dex */
        public static final class C13026a extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ LazyListState f33811w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13026a(LazyListState lazyListState) {
                super(0);
                this.f33811w = lazyListState;
            }

            /* renamed from: a */
            public final C8611f mo42214q() {
                return C13024m.m1880a(this.f33811w.m40029g());
            }
        }

        /* compiled from: Collect.kt */
        /* renamed from: y.m$a$b */
        /* loaded from: classes.dex */
        public static final class C13027b implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC5220m0 f33812w;

            public C13027b(InterfaceC5220m0 interfaceC5220m0) {
                this.f33812w = interfaceC5220m0;
            }

            /* renamed from: a */
            public Object mo4529a(Object obj, InterfaceC1886d interfaceC1886d) {
                this.f33812w.setValue((C8611f) obj);
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13025a(LazyListState lazyListState, InterfaceC5220m0 interfaceC5220m0, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f33809y = lazyListState;
            this.f33810z = interfaceC5220m0;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C13025a(this.f33809y, this.f33810z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C13025a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f33808x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC6785c m25066l = C5209j1.m25066l(new C13026a(this.f33809y));
                C13027b c13027b = new C13027b(this.f33810z);
                this.f33808x = 1;
                if (m25066l.mo20086d(c13027b, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyListItemsProviderImpl.kt */
    /* renamed from: y.m$b */
    /* loaded from: classes.dex */
    public static final class C13028b extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ InterfaceC5242r1 f33813w;

        /* renamed from: x */
        final /* synthetic */ C6267j0 f33814x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC5220m0 f33815y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13028b(InterfaceC5242r1 interfaceC5242r1, C6267j0 c6267j0, InterfaceC5220m0 interfaceC5220m0) {
            super(0);
            this.f33813w = interfaceC5242r1;
            this.f33814x = c6267j0;
            this.f33815y = interfaceC5220m0;
        }

        /* renamed from: a */
        public final InterfaceC13023k mo42214q() {
            C13039s c13039s = new C13039s();
            ((InterfaceC6108l) this.f33813w.getValue()).mo9587d(c13039s);
            return new LazyListItemsProviderImpl(this.f33814x, c13039s.m1821c(), c13039s.m1822b(), (C8611f) this.f33815y.getValue());
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C8611f m1880a(int i) {
        return m1879b(i);
    }

    /* renamed from: b */
    private static final C8611f m1879b(int i) {
        C8611f m14992q;
        int i2 = f33806a;
        int i3 = (i / i2) * i2;
        int i4 = f33807b;
        m14992q = _Ranges.m14992q(Math.max(i3 - i4, 0), i3 + i2 + i4);
        return m14992q;
    }

    /* renamed from: c */
    public static final Map m1878c(C8611f c8611f, InterfaceC13017c interfaceC13017c) {
        Map m334e;
        Intrinsics.isThisObjectNull(c8611f, "range");
        Intrinsics.isThisObjectNull(interfaceC13017c, "list");
        int m15034f = c8611f.m15034f();
        if (m15034f >= 0) {
            int min = Math.min(c8611f.m15033h(), interfaceC13017c.mo1782b() - 1);
            if (min < m15034f) {
                m334e = C13769l0.m334e();
                return m334e;
            }
            HashMap hashMap = new HashMap();
            int m1907c = IntervalList.m1907c(interfaceC13017c, m15034f);
            while (m15034f <= min) {
                C13016b c13016b = (C13016b) interfaceC13017c.mo1783a().get(m1907c);
                InterfaceC6108l m1898b = ((LazyListScopeImpl) c13016b.m1912a()).m1898b();
                if (m1898b != null) {
                    int m1910c = m15034f - c13016b.m1910c();
                    if (m1910c == c13016b.m1911b()) {
                        m1907c++;
                    } else {
                        hashMap.put(m1898b.mo9587d(Integer.valueOf(m1910c)), Integer.valueOf(m15034f));
                        m15034f++;
                    }
                } else {
                    m1907c++;
                    m15034f = c13016b.m1910c() + c13016b.m1911b();
                }
            }
            return hashMap;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: d */
    public static final InterfaceC5242r1 m1877d(LazyListState lazyListState, InterfaceC6108l interfaceC6108l, C6267j0 c6267j0, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(lazyListState, "state");
        Intrinsics.isThisObjectNull(interfaceC6108l, "content");
        Intrinsics.isThisObjectNull(c6267j0, "itemScope");
        interfaceC5179i.mo25263g(112461157);
        InterfaceC5242r1 m25067k = C5209j1.m25067k(interfaceC6108l, interfaceC5179i, (i >> 3) & 14);
        interfaceC5179i.mo25263g(-3686930);
        boolean mo25276I = interfaceC5179i.mo25276I(lazyListState);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            mo25262h = C5232o1.m24962d(m1879b(lazyListState.m40028h()), null, 2, null);
            interfaceC5179i.mo25247w(mo25262h);
        }
        interfaceC5179i.mo25282C();
        InterfaceC5220m0 interfaceC5220m0 = (InterfaceC5220m0) mo25262h;
        Effects.m25539c(interfaceC5220m0, new C13025a(lazyListState, interfaceC5220m0, null), interfaceC5179i, 0);
        interfaceC5179i.mo25263g(-3686930);
        boolean mo25276I2 = interfaceC5179i.mo25276I(interfaceC5220m0);
        Object mo25262h2 = interfaceC5179i.mo25262h();
        if (mo25276I2 || mo25262h2 == InterfaceC5179i.f14328a.m25243a()) {
            mo25262h2 = C5209j1.m25076b(new C13028b(m25067k, c6267j0, interfaceC5220m0));
            interfaceC5179i.mo25247w(mo25262h2);
        }
        interfaceC5179i.mo25282C();
        InterfaceC5242r1 interfaceC5242r1 = (InterfaceC5242r1) mo25262h2;
        interfaceC5179i.mo25282C();
        return interfaceC5242r1;
    }
}
