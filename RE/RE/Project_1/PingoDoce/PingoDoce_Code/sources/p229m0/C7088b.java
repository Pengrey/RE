package p229m0;

import id.InterfaceC6112p;
import id.InterfaceC6113q;
import id.InterfaceC6114r;
import id.InterfaceC6115s;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p092f0.InterfaceC5151a1;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5258v0;
import p181jd.AbstractC6438m;
import p181jd.C6431d0;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* compiled from: ComposableLambda.jvm.kt */
/* renamed from: m0.b */
/* loaded from: classes.dex */
public final class C7088b implements InterfaceC7087a {

    /* renamed from: A */
    private List f18810A;

    /* renamed from: w */
    private final int f18811w;

    /* renamed from: x */
    private final boolean f18812x;

    /* renamed from: y */
    private Object f18813y;

    /* renamed from: z */
    private InterfaceC5258v0 f18814z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComposableLambda.jvm.kt */
    /* renamed from: m0.b$a */
    /* loaded from: classes.dex */
    public static final class C7089a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: x */
        final /* synthetic */ Object f18816x;

        /* renamed from: y */
        final /* synthetic */ int f18817y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7089a(Object obj, int i) {
            super(2);
            this.f18816x = obj;
            this.f18817y = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m19331a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m19331a(InterfaceC5179i interfaceC5179i, int i) {
            Intrinsics.isThisObjectNull(interfaceC5179i, "nc");
            C7088b.this.m19337b(this.f18816x, interfaceC5179i, this.f18817y | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComposableLambda.jvm.kt */
    /* renamed from: m0.b$b */
    /* loaded from: classes.dex */
    public static final class C7090b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: x */
        final /* synthetic */ Object f18819x;

        /* renamed from: y */
        final /* synthetic */ Object f18820y;

        /* renamed from: z */
        final /* synthetic */ int f18821z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7090b(Object obj, Object obj2, int i) {
            super(2);
            this.f18819x = obj;
            this.f18820y = obj2;
            this.f18821z = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m19330a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m19330a(InterfaceC5179i interfaceC5179i, int i) {
            Intrinsics.isThisObjectNull(interfaceC5179i, "nc");
            C7088b.this.m19336c(this.f18819x, this.f18820y, interfaceC5179i, this.f18821z | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComposableLambda.jvm.kt */
    /* renamed from: m0.b$c */
    /* loaded from: classes.dex */
    public static final class C7091c extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ int f18822A;

        /* renamed from: x */
        final /* synthetic */ Object f18824x;

        /* renamed from: y */
        final /* synthetic */ Object f18825y;

        /* renamed from: z */
        final /* synthetic */ Object f18826z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7091c(Object obj, Object obj2, Object obj3, int i) {
            super(2);
            this.f18824x = obj;
            this.f18825y = obj2;
            this.f18826z = obj3;
            this.f18822A = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m19329a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m19329a(InterfaceC5179i interfaceC5179i, int i) {
            Intrinsics.isThisObjectNull(interfaceC5179i, "nc");
            C7088b.this.m19335d(this.f18824x, this.f18825y, this.f18826z, interfaceC5179i, this.f18822A | 1);
        }
    }

    public C7088b(int i, boolean z) {
        this.f18811w = i;
        this.f18812x = z;
    }

    /* renamed from: e */
    private final void m19334e(InterfaceC5179i interfaceC5179i) {
        InterfaceC5258v0 mo25268b;
        if (!this.f18812x || (mo25268b = interfaceC5179i.mo25268b()) == null) {
            return;
        }
        interfaceC5179i.mo25271N(mo25268b);
        if (ComposableLambda.m19324e(this.f18814z, mo25268b)) {
            this.f18814z = mo25268b;
            return;
        }
        List list = this.f18810A;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.f18810A = arrayList;
            arrayList.add(mo25268b);
            return;
        }
        int i = 0;
        int size = list.size();
        while (i < size) {
            int i2 = i + 1;
            if (ComposableLambda.m19324e((InterfaceC5258v0) list.get(i), mo25268b)) {
                list.set(i, mo25268b);
                return;
            }
            i = i2;
        }
        list.add(mo25268b);
    }

    /* renamed from: f */
    private final void m19333f() {
        if (this.f18812x) {
            InterfaceC5258v0 interfaceC5258v0 = this.f18814z;
            if (interfaceC5258v0 != null) {
                interfaceC5258v0.invalidate();
                this.f18814z = null;
            }
            List list = this.f18810A;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC5258v0) list.get(i)).invalidate();
                }
                list.clear();
            }
        }
    }

    /* renamed from: C */
    public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
        return m19337b(obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
    }

    /* renamed from: F */
    public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
        return m19339a((InterfaceC5179i) obj, ((Number) obj2).intValue());
    }

    /* renamed from: K */
    public /* bridge */ /* synthetic */ Object mo22156K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m19335d(obj, obj2, obj3, (InterfaceC5179i) obj4, ((Number) obj5).intValue());
    }

    /* renamed from: a */
    public Object m19339a(InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(interfaceC5179i, "c");
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(this.f18811w);
        m19334e(mo25249u);
        int m19325d = i | (mo25249u.mo25276I(this) ? ComposableLambda.m19325d(0) : ComposableLambda.m19323f(0));
        Object obj = this.f18813y;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object mo39856d = ((InterfaceC6112p) C6431d0.m20951d(obj, 2)).mo39856d(mo25249u, Integer.valueOf(m19325d));
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K != null) {
            mo25274K.mo25532a((InterfaceC6112p) C6431d0.m20951d(this, 2));
        }
        return mo39856d;
    }

    /* renamed from: a0 */
    public /* bridge */ /* synthetic */ Object mo22157a0(Object obj, Object obj2, Object obj3, Object obj4) {
        return m19336c(obj, obj2, (InterfaceC5179i) obj3, ((Number) obj4).intValue());
    }

    /* renamed from: b */
    public Object m19337b(Object obj, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(interfaceC5179i, "c");
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(this.f18811w);
        m19334e(mo25249u);
        int m19325d = mo25249u.mo25276I(this) ? ComposableLambda.m19325d(1) : ComposableLambda.m19323f(1);
        Object obj2 = this.f18813y;
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object mo4533i = ((InterfaceC6113q) C6431d0.m20951d(obj2, 3)).mo4533i(obj, mo25249u, Integer.valueOf(m19325d | i));
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K != null) {
            mo25274K.mo25532a(new C7089a(obj, i));
        }
        return mo4533i;
    }

    /* renamed from: c */
    public Object m19336c(Object obj, Object obj2, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(interfaceC5179i, "c");
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(this.f18811w);
        m19334e(mo25249u);
        int m19325d = mo25249u.mo25276I(this) ? ComposableLambda.m19325d(2) : ComposableLambda.m19323f(2);
        Object obj3 = this.f18813y;
        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object mo22157a0 = ((InterfaceC6114r) C6431d0.m20951d(obj3, 4)).mo22157a0(obj, obj2, mo25249u, Integer.valueOf(m19325d | i));
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K != null) {
            mo25274K.mo25532a(new C7090b(obj, obj2, i));
        }
        return mo22157a0;
    }

    /* renamed from: d */
    public Object m19335d(Object obj, Object obj2, Object obj3, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(interfaceC5179i, "c");
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(this.f18811w);
        m19334e(mo25249u);
        int m19325d = mo25249u.mo25276I(this) ? ComposableLambda.m19325d(3) : ComposableLambda.m19323f(3);
        Object obj4 = this.f18813y;
        Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object mo22156K = ((InterfaceC6115s) C6431d0.m20951d(obj4, 5)).mo22156K(obj, obj2, obj3, mo25249u, Integer.valueOf(m19325d | i));
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K != null) {
            mo25274K.mo25532a(new C7091c(obj, obj2, obj3, i));
        }
        return mo22156K;
    }

    /* renamed from: g */
    public final void m19332g(Object obj) {
        Intrinsics.isThisObjectNull(obj, "block");
        if (Intrinsics.equals(this.f18813y, obj)) {
            return;
        }
        boolean z = this.f18813y == null;
        this.f18813y = obj;
        if (z) {
            return;
        }
        m19333f();
    }
}
