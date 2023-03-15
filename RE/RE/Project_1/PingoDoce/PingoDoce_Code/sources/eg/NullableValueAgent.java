package eg;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.InterfaceC6785c;
import p142hg.ValueLocalDataProvider;
import p181jd.Intrinsics;
import p317qg.C9729a;
import p468yc.C13186n;
import p468yc.C13195u;

/* renamed from: eg.b */
/* loaded from: classes2.dex */
public abstract class NullableValueAgent<T> extends AbstractC5050a {

    /* renamed from: e */
    private final C9729a f14053e;

    /* renamed from: f */
    private final ValueLocalDataProvider f14054f;

    /* renamed from: g */
    private final InterfaceC6112p f14055g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NullableValueAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.base.NullableValueAgent$getFreshDataWithParameters$1", m20196f = "NullableValueAgent.kt", m20195l = {15}, m20194m = "invokeSuspend")
    /* renamed from: eg.b$a */
    /* loaded from: classes2.dex */
    public static final class C5064a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f14056x;

        C5064a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5064a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(C13195u c13195u, InterfaceC1886d interfaceC1886d) {
            return ((C5064a) create(c13195u, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f14056x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC6108l m25768G = NullableValueAgent.this.m25768G();
                this.f14056x = 1;
                obj = m25768G.mo9587d(this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return obj;
        }
    }

    public /* synthetic */ NullableValueAgent(C9729a c9729a, ValueLocalDataProvider valueLocalDataProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C9729a(0L, 0L, 3, null) : c9729a, (i & 2) != 0 ? null : valueLocalDataProvider);
    }

    /* renamed from: C */
    public static /* synthetic */ Object m25772C(NullableValueAgent nullableValueAgent, boolean z, InterfaceC1886d interfaceC1886d, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            return nullableValueAgent.m25773B(z, interfaceC1886d);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchFromNetwork");
    }

    /* renamed from: E */
    static /* synthetic */ Object m25770E(NullableValueAgent nullableValueAgent, InterfaceC1886d interfaceC1886d) {
        return nullableValueAgent.m25795m(C13195u.f34156a, interfaceC1886d);
    }

    /* renamed from: B */
    public final Object m25773B(boolean z, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        C13195u c13195u = C13195u.f34156a;
        Object m25798j = m25798j(c13195u, z, interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m25798j == m34636d ? m25798j : c13195u;
    }

    /* renamed from: D */
    public Object m25771D(InterfaceC1886d interfaceC1886d) {
        return m25770E(this, interfaceC1886d);
    }

    /* renamed from: F */
    public InterfaceC6785c m25769F() {
        return m25792p(C13195u.f34156a);
    }

    /* renamed from: G */
    public abstract InterfaceC6108l m25768G();

    /* renamed from: q */
    protected final InterfaceC6112p m25767q() {
        return this.f14055g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public C9729a m25766s() {
        return this.f14053e;
    }

    public NullableValueAgent(C9729a c9729a, ValueLocalDataProvider valueLocalDataProvider) {
        Intrinsics.isThisObjectNull(c9729a, "memoryDataProvider");
        this.f14053e = c9729a;
        this.f14054f = valueLocalDataProvider;
        this.f14055g = new C5064a(null);
    }
}
