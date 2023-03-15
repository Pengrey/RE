package p051d0;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import androidx.compose.p018ui.platform.CompositionLocals;
import androidx.compose.p018ui.platform.ViewConfiguration;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6113q;
import p092f0.AbstractC5250t0;
import p092f0.CompositionLocal;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.C9567e;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;

/* renamed from: d0.h1 */
/* loaded from: classes.dex */
public final class TouchTarget {

    /* renamed from: a */
    private static final AbstractC5250t0 f12449a = CompositionLocal.m24951d(C4582a.f12450w);

    /* compiled from: TouchTarget.kt */
    /* renamed from: d0.h1$a */
    /* loaded from: classes.dex */
    static final class C4582a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C4582a f12450w = new C4582a();

        C4582a() {
            super(0);
        }

        /* renamed from: a */
        public final Boolean mo42214q() {
            return Boolean.TRUE;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: d0.h1$b */
    /* loaded from: classes.dex */
    public static final class C4583b extends AbstractC6438m implements InterfaceC6108l {
        public C4583b() {
            super(1);
        }

        /* renamed from: a */
        public final void m27137a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("minimumTouchTargetSize");
            c0816w0.m39492a().m39649b("README", "Adds outer padding to measure at least 48.dp (default) in size to disambiguate touch interactions if the element would measure smaller");
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m27137a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TouchTarget.kt */
    /* renamed from: d0.h1$c */
    /* loaded from: classes.dex */
    public static final class C4584c extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        public static final C4584c f12451w = new C4584c();

        C4584c() {
            super(3);
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m27136a((InterfaceC9570f) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
        }

        /* renamed from: a */
        public final InterfaceC9570f m27136a(InterfaceC9570f interfaceC9570f, InterfaceC5179i interfaceC5179i, int i) {
            InterfaceC9570f interfaceC9570f2;
            Intrinsics.isThisObjectNull(interfaceC9570f, "$this$composed");
            interfaceC5179i.mo25263g(88894699);
            if (((Boolean) interfaceC5179i.mo25256n(TouchTarget.m27140a())).booleanValue()) {
                interfaceC9570f2 = new C4604m0(((ViewConfiguration) interfaceC5179i.mo25256n(CompositionLocals.m39703i())).m39640e(), null);
            } else {
                interfaceC9570f2 = InterfaceC9570f.f25164r;
            }
            interfaceC5179i.mo25282C();
            return interfaceC9570f2;
        }
    }

    /* renamed from: a */
    public static final AbstractC5250t0 m27140a() {
        return f12449a;
    }

    /* renamed from: b */
    public static final InterfaceC9570f m27139b(InterfaceC9570f interfaceC9570f) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        return C9567e.m10581a(interfaceC9570f, C0812v0.m39495c() ? new C4583b() : C0812v0.m39497a(), C4584c.f12451w);
    }
}
