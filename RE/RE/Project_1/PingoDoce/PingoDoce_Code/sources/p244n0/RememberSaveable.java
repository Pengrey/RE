package p244n0;

import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.util.Arrays;
import java.util.Objects;
import p092f0.C5175h;
import p092f0.C5209j1;
import p092f0.C5232o1;
import p092f0.C5266y;
import p092f0.Effects;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5220m0;
import p092f0.InterfaceC5264x;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p244n0.InterfaceC7570f;
import p260o0.InterfaceC7981q;
import sd.CharJVM;

/* renamed from: n0.b */
/* loaded from: classes.dex */
public final class RememberSaveable {

    /* renamed from: a */
    private static final int f20014a = 36;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RememberSaveable.kt */
    /* renamed from: n0.b$a */
    /* loaded from: classes.dex */
    public static final class C7555a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC7570f f20015w;

        /* renamed from: x */
        final /* synthetic */ String f20016x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC5220m0 f20017y;

        /* renamed from: z */
        final /* synthetic */ Object f20018z;

        /* compiled from: Effects.kt */
        /* renamed from: n0.b$a$a */
        /* loaded from: classes.dex */
        public static final class C7556a implements InterfaceC5264x {

            /* renamed from: a */
            final /* synthetic */ InterfaceC7570f.InterfaceC7571a f20019a;

            public C7556a(InterfaceC7570f.InterfaceC7571a interfaceC7571a) {
                this.f20019a = interfaceC7571a;
            }

            /* renamed from: b */
            public void mo24852b() {
                this.f20019a.mo18123a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RememberSaveable.kt */
        /* renamed from: n0.b$a$b */
        /* loaded from: classes.dex */
        public static final class C7557b extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ InterfaceC5220m0 f20020w;

            /* renamed from: x */
            final /* synthetic */ Object f20021x;

            /* renamed from: y */
            final /* synthetic */ InterfaceC7570f f20022y;

            /* compiled from: RememberSaveable.kt */
            /* renamed from: n0.b$a$b$a */
            /* loaded from: classes.dex */
            static final class C7558a implements InterfaceC7579k {

                /* renamed from: a */
                final /* synthetic */ InterfaceC7570f f20023a;

                C7558a(InterfaceC7570f interfaceC7570f) {
                    this.f20023a = interfaceC7570f;
                }

                /* renamed from: a */
                public final boolean mo18106a(Object obj) {
                    Intrinsics.isThisObjectNull(obj, "it");
                    return this.f20023a.mo18127a(obj);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7557b(InterfaceC5220m0 interfaceC5220m0, Object obj, InterfaceC7570f interfaceC7570f) {
                super(0);
                this.f20020w = interfaceC5220m0;
                this.f20021x = obj;
                this.f20022y = interfaceC7570f;
            }

            /* renamed from: q */
            public final Object mo42214q() {
                Object value = this.f20020w.getValue();
                return ((InterfaceC7575i) value).mo18113a(new C7558a(this.f20022y), this.f20021x);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7555a(InterfaceC7570f interfaceC7570f, String str, InterfaceC5220m0 interfaceC5220m0, Object obj) {
            super(1);
            this.f20015w = interfaceC7570f;
            this.f20016x = str;
            this.f20017y = interfaceC5220m0;
            this.f20018z = obj;
        }

        /* renamed from: a */
        public final InterfaceC5264x mo9587d(C5266y c5266y) {
            Intrinsics.isThisObjectNull(c5266y, "$this$DisposableEffect");
            C7557b c7557b = new C7557b(this.f20017y, this.f20018z, this.f20015w);
            RememberSaveable.m18152a(this.f20015w, c7557b.mo42214q());
            return new C7556a(this.f20015w.mo18125c(this.f20016x, c7557b));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m18152a(InterfaceC7570f interfaceC7570f, Object obj) {
        m18150c(interfaceC7570f, obj);
    }

    /* renamed from: b */
    public static final Object m18151b(Object[] objArr, InterfaceC7575i interfaceC7575i, String str, InterfaceC6097a interfaceC6097a, InterfaceC5179i interfaceC5179i, int i, int i2) {
        Object mo18124d;
        int m9044a;
        Intrinsics.isThisObjectNull(objArr, "inputs");
        Intrinsics.isThisObjectNull(interfaceC6097a, "init");
        interfaceC5179i.mo25263g(1059366159);
        if ((i2 & 2) != 0) {
            interfaceC7575i = Saver.m18110b();
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        interfaceC5179i.mo25263g(1059366416);
        int i3 = 0;
        if (str == null || str.length() == 0) {
            int m25299a = C5175h.m25299a(interfaceC5179i, 0);
            m9044a = CharJVM.m9044a(f20014a);
            str = Integer.toString(m25299a, m9044a);
            Intrinsics.checkIfNull(str, "toString(this, checkRadix(radix))");
        }
        String str2 = str;
        interfaceC5179i.mo25282C();
        Objects.requireNonNull(interfaceC7575i, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        InterfaceC7570f interfaceC7570f = (InterfaceC7570f) interfaceC5179i.mo25256n(C7573h.m18115b());
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        interfaceC5179i.mo25263g(-3685570);
        int length = copyOf.length;
        boolean z = false;
        while (i3 < length) {
            Object obj = copyOf[i3];
            i3++;
            z |= interfaceC5179i.mo25276I(obj);
        }
        Object mo25262h = interfaceC5179i.mo25262h();
        if (z || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            mo25262h = (interfaceC7570f == null || (mo18124d = interfaceC7570f.mo18124d(str2)) == null) ? null : interfaceC7575i.mo18112b(mo18124d);
            if (mo25262h == null) {
                mo25262h = interfaceC6097a.mo42214q();
            }
            interfaceC5179i.mo25247w(mo25262h);
        }
        interfaceC5179i.mo25282C();
        interfaceC5179i.mo25263g(-3687241);
        Object mo25262h2 = interfaceC5179i.mo25262h();
        if (mo25262h2 == InterfaceC5179i.f14328a.m25243a()) {
            mo25262h2 = C5232o1.m24962d(interfaceC7575i, null, 2, null);
            interfaceC5179i.mo25247w(mo25262h2);
        }
        interfaceC5179i.mo25282C();
        InterfaceC5220m0 interfaceC5220m0 = (InterfaceC5220m0) mo25262h2;
        interfaceC5220m0.setValue(interfaceC7575i);
        if (interfaceC7570f != null) {
            Effects.m25540b(interfaceC7570f, str2, mo25262h, new C7555a(interfaceC7570f, str2, interfaceC5220m0, mo25262h), interfaceC5179i, 0);
        }
        interfaceC5179i.mo25282C();
        return mo25262h;
    }

    /* renamed from: c */
    private static final void m18150c(InterfaceC7570f interfaceC7570f, Object obj) {
        String str;
        if (obj == null || interfaceC7570f.mo18127a(obj)) {
            return;
        }
        if (obj instanceof InterfaceC7981q) {
            InterfaceC7981q interfaceC7981q = (InterfaceC7981q) obj;
            if (interfaceC7981q.mo17279d() == C5209j1.m25071g() || interfaceC7981q.mo17279d() == C5209j1.m25065m() || interfaceC7981q.mo17279d() == C5209j1.m25068j()) {
                str = "MutableState containing " + interfaceC7981q.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            str = obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
        }
        throw new IllegalArgumentException(str);
    }
}
