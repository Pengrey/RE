package p346s0;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;

/* compiled from: DrawModifier.kt */
/* renamed from: s0.f */
/* loaded from: classes.dex */
public final class C10026f {

    /* compiled from: InspectableValue.kt */
    /* renamed from: s0.f$a */
    /* loaded from: classes.dex */
    public static final class C10027a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f26211w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10027a(InterfaceC6108l interfaceC6108l) {
            super(1);
            this.f26211w = interfaceC6108l;
        }

        /* renamed from: a */
        public final void m9370a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("drawBehind");
            c0816w0.m39492a().m39649b("onDraw", this.f26211w);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m9370a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: s0.f$b */
    /* loaded from: classes.dex */
    public static final class C10028b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f26212w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10028b(InterfaceC6108l interfaceC6108l) {
            super(1);
            this.f26212w = interfaceC6108l;
        }

        /* renamed from: a */
        public final void m9369a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("drawWithContent");
            c0816w0.m39492a().m39649b("onDraw", this.f26212w);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m9369a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC9570f m9372a(InterfaceC9570f interfaceC9570f, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6108l, "onDraw");
        return interfaceC9570f.mo7205u(new DrawModifier(interfaceC6108l, C0812v0.m39495c() ? new C10027a(interfaceC6108l) : C0812v0.m39497a()));
    }

    /* renamed from: b */
    public static final InterfaceC9570f m9371b(InterfaceC9570f interfaceC9570f, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6108l, "onDraw");
        return interfaceC9570f.mo7205u(new C10029g(interfaceC6108l, C0812v0.m39495c() ? new C10028b(interfaceC6108l) : C0812v0.m39497a()));
    }
}
