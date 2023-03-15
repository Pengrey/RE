package p302q0;

import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p181jd.C6431d0;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;

/* compiled from: ComposedModifier.kt */
/* renamed from: q0.e */
/* loaded from: classes.dex */
public final class C9567e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComposedModifier.kt */
    /* renamed from: q0.e$a */
    /* loaded from: classes.dex */
    public static final class C9568a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C9568a f25162w = new C9568a();

        C9568a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean mo9587d(InterfaceC9570f.InterfaceC9573c interfaceC9573c) {
            Intrinsics.isThisObjectNull(interfaceC9573c, "it");
            return Boolean.valueOf(!(interfaceC9573c instanceof ComposedModifier));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComposedModifier.kt */
    /* renamed from: q0.e$b */
    /* loaded from: classes.dex */
    public static final class C9569b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC5179i f25163w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9569b(InterfaceC5179i interfaceC5179i) {
            super(2);
            this.f25163w = interfaceC5179i;
        }

        /* renamed from: a */
        public final InterfaceC9570f mo39856d(InterfaceC9570f interfaceC9570f, InterfaceC9570f.InterfaceC9573c interfaceC9573c) {
            Intrinsics.isThisObjectNull(interfaceC9570f, "acc");
            Intrinsics.isThisObjectNull(interfaceC9573c, "element");
            boolean z = interfaceC9573c instanceof ComposedModifier;
            InterfaceC9570f.InterfaceC9573c interfaceC9573c2 = interfaceC9573c;
            if (z) {
                interfaceC9573c2 = C9567e.m10580b(this.f25163w, (InterfaceC9570f) ((InterfaceC6113q) C6431d0.m20951d(((ComposedModifier) interfaceC9573c).m10582b(), 3)).mo4533i(InterfaceC9570f.f25164r, this.f25163w, 0));
            }
            return interfaceC9570f.mo7205u(interfaceC9573c2);
        }
    }

    /* renamed from: a */
    public static final InterfaceC9570f m10581a(InterfaceC9570f interfaceC9570f, InterfaceC6108l interfaceC6108l, InterfaceC6113q interfaceC6113q) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6108l, "inspectorInfo");
        Intrinsics.isThisObjectNull(interfaceC6113q, "factory");
        return interfaceC9570f.mo7205u(new ComposedModifier(interfaceC6108l, interfaceC6113q));
    }

    /* renamed from: b */
    public static final InterfaceC9570f m10580b(InterfaceC5179i interfaceC5179i, InterfaceC9570f interfaceC9570f) {
        Intrinsics.isThisObjectNull(interfaceC5179i, "<this>");
        Intrinsics.isThisObjectNull(interfaceC9570f, "modifier");
        if (interfaceC9570f.mo7209C(C9568a.f25162w)) {
            return interfaceC9570f;
        }
        interfaceC5179i.mo25263g(1219399079);
        InterfaceC9570f interfaceC9570f2 = (InterfaceC9570f) interfaceC9570f.mo7206o(InterfaceC9570f.f25164r, new C9569b(interfaceC5179i));
        interfaceC5179i.mo25282C();
        return interfaceC9570f2;
    }
}
