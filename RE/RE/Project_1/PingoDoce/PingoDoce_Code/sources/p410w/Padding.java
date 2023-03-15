package p410w;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;
import p479z1.C13605g;
import p479z1.EnumC13618o;

/* renamed from: w.v */
/* loaded from: classes.dex */
public final class Padding {

    /* compiled from: InspectableValue.kt */
    /* renamed from: w.v$a */
    /* loaded from: classes.dex */
    public static final class C11492a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC11498x f29423w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11492a(InterfaceC11498x interfaceC11498x) {
            super(1);
            this.f29423w = interfaceC11498x;
        }

        /* renamed from: a */
        public final void m4975a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("padding");
            c0816w0.m39492a().m39649b("paddingValues", this.f29423w);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m4975a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: w.v$b */
    /* loaded from: classes.dex */
    public static final class C11493b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ float f29424w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11493b(float f) {
            super(1);
            this.f29424w = f;
        }

        /* renamed from: a */
        public final void m4974a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("padding");
            c0816w0.m39490c(C13605g.m878d(this.f29424w));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m4974a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: w.v$c */
    /* loaded from: classes.dex */
    public static final class C11494c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ float f29425w;

        /* renamed from: x */
        final /* synthetic */ float f29426x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11494c(float f, float f2) {
            super(1);
            this.f29425w = f;
            this.f29426x = f2;
        }

        /* renamed from: a */
        public final void m4973a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("padding");
            c0816w0.m39492a().m39649b("horizontal", C13605g.m878d(this.f29425w));
            c0816w0.m39492a().m39649b("vertical", C13605g.m878d(this.f29426x));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m4973a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: w.v$d */
    /* loaded from: classes.dex */
    public static final class C11495d extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ float f29427w;

        /* renamed from: x */
        final /* synthetic */ float f29428x;

        /* renamed from: y */
        final /* synthetic */ float f29429y;

        /* renamed from: z */
        final /* synthetic */ float f29430z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11495d(float f, float f2, float f3, float f4) {
            super(1);
            this.f29427w = f;
            this.f29428x = f2;
            this.f29429y = f3;
            this.f29430z = f4;
        }

        /* renamed from: a */
        public final void m4972a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("padding");
            c0816w0.m39492a().m39649b("start", C13605g.m878d(this.f29427w));
            c0816w0.m39492a().m39649b("top", C13605g.m878d(this.f29428x));
            c0816w0.m39492a().m39649b("end", C13605g.m878d(this.f29429y));
            c0816w0.m39492a().m39649b("bottom", C13605g.m878d(this.f29430z));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m4972a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC11498x m4988a(float f) {
        return new C11499y(f, f, f, f, null);
    }

    /* renamed from: b */
    public static final InterfaceC11498x m4987b(float f, float f2) {
        return new C11499y(f, f2, f, f2, null);
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC11498x m4986c(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C13605g.m875g(0);
        }
        if ((i & 2) != 0) {
            f2 = C13605g.m875g(0);
        }
        return m4987b(f, f2);
    }

    /* renamed from: d */
    public static final InterfaceC11498x m4985d(float f, float f2, float f3, float f4) {
        return new C11499y(f, f2, f3, f4, null);
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC11498x m4984e(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C13605g.m875g(0);
        }
        if ((i & 2) != 0) {
            f2 = C13605g.m875g(0);
        }
        if ((i & 4) != 0) {
            f3 = C13605g.m875g(0);
        }
        if ((i & 8) != 0) {
            f4 = C13605g.m875g(0);
        }
        return m4985d(f, f2, f3, f4);
    }

    /* renamed from: f */
    public static final float m4983f(InterfaceC11498x interfaceC11498x, EnumC13618o enumC13618o) {
        Intrinsics.isThisObjectNull(interfaceC11498x, "<this>");
        Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
        if (enumC13618o == EnumC13618o.Ltr) {
            return interfaceC11498x.mo4960a(enumC13618o);
        }
        return interfaceC11498x.mo4957d(enumC13618o);
    }

    /* renamed from: g */
    public static final float m4982g(InterfaceC11498x interfaceC11498x, EnumC13618o enumC13618o) {
        Intrinsics.isThisObjectNull(interfaceC11498x, "<this>");
        Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
        if (enumC13618o == EnumC13618o.Ltr) {
            return interfaceC11498x.mo4957d(enumC13618o);
        }
        return interfaceC11498x.mo4960a(enumC13618o);
    }

    /* renamed from: h */
    public static final InterfaceC9570f m4981h(InterfaceC9570f interfaceC9570f, InterfaceC11498x interfaceC11498x) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC11498x, "paddingValues");
        return interfaceC9570f.mo7205u(new C11500z(interfaceC11498x, C0812v0.m39495c() ? new C11492a(interfaceC11498x) : C0812v0.m39497a()));
    }

    /* renamed from: i */
    public static final InterfaceC9570f m4980i(InterfaceC9570f interfaceC9570f, float f) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "$this$padding");
        return interfaceC9570f.mo7205u(new C11496w(f, f, f, f, true, C0812v0.m39495c() ? new C11493b(f) : C0812v0.m39497a(), null));
    }

    /* renamed from: j */
    public static final InterfaceC9570f m4979j(InterfaceC9570f interfaceC9570f, float f, float f2) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "$this$padding");
        return interfaceC9570f.mo7205u(new C11496w(f, f2, f, f2, true, C0812v0.m39495c() ? new C11494c(f, f2) : C0812v0.m39497a(), null));
    }

    /* renamed from: k */
    public static /* synthetic */ InterfaceC9570f m4978k(InterfaceC9570f interfaceC9570f, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C13605g.m875g(0);
        }
        if ((i & 2) != 0) {
            f2 = C13605g.m875g(0);
        }
        return m4979j(interfaceC9570f, f, f2);
    }

    /* renamed from: l */
    public static final InterfaceC9570f m4977l(InterfaceC9570f interfaceC9570f, float f, float f2, float f3, float f4) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "$this$padding");
        return interfaceC9570f.mo7205u(new C11496w(f, f2, f3, f4, true, C0812v0.m39495c() ? new C11495d(f, f2, f3, f4) : C0812v0.m39497a(), null));
    }

    /* renamed from: m */
    public static /* synthetic */ InterfaceC9570f m4976m(InterfaceC9570f interfaceC9570f, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C13605g.m875g(0);
        }
        if ((i & 2) != 0) {
            f2 = C13605g.m875g(0);
        }
        if ((i & 4) != 0) {
            f3 = C13605g.m875g(0);
        }
        if ((i & 8) != 0) {
            f4 = C13605g.m875g(0);
        }
        return m4977l(interfaceC9570f, f, f2, f3, f4);
    }
}
