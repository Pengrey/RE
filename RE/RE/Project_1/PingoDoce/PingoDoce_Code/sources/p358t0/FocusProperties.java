package p358t0;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import p149i1.C5992f;
import p149i1.ModifierLocal;
import p169j1.ModifiedFocusNode;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;

/* renamed from: t0.q */
/* loaded from: classes.dex */
public final class FocusProperties {

    /* renamed from: a */
    private static final C5992f f26935a = ModifierLocal.m22448a(C10345a.f26936w);

    /* compiled from: FocusProperties.kt */
    /* renamed from: t0.q$a */
    /* loaded from: classes.dex */
    static final class C10345a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C10345a f26936w = new C10345a();

        C10345a() {
            super(0);
        }

        /* renamed from: a */
        public final InterfaceC10344p mo42214q() {
            return C10321a.f26897a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: t0.q$b */
    /* loaded from: classes.dex */
    public static final class C10346b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f26937w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10346b(InterfaceC6108l interfaceC6108l) {
            super(1);
            this.f26937w = interfaceC6108l;
        }

        /* renamed from: a */
        public final void m8196a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("focusProperties");
            c0816w0.m39492a().m39649b("scope", this.f26937w);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m8196a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC9570f m8200a(InterfaceC9570f interfaceC9570f, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6108l, "scope");
        return interfaceC9570f.mo7205u(new C10347r(interfaceC6108l, C0812v0.m39495c() ? new C10346b(interfaceC6108l) : C0812v0.m39497a()));
    }

    /* renamed from: b */
    public static final C5992f m8199b() {
        return f26935a;
    }

    /* renamed from: c */
    public static final void m8198c(ModifiedFocusNode modifiedFocusNode, InterfaceC10344p interfaceC10344p) {
        Intrinsics.isThisObjectNull(modifiedFocusNode, "<this>");
        Intrinsics.isThisObjectNull(interfaceC10344p, "properties");
        if (interfaceC10344p.mo8202a()) {
            FocusTransactions.m8186a(modifiedFocusNode);
        } else {
            FocusTransactions.m8182e(modifiedFocusNode);
        }
    }
}
