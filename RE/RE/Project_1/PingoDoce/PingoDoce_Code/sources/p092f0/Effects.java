package p092f0;

import bd.CoroutineContext;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.Arrays;
import p181jd.Intrinsics;
import td.C10531j0;
import td.C10588w1;
import td.C10596y1;
import td.InterfaceC10524i0;
import td.InterfaceC10574t1;
import td.InterfaceC10582v;

/* renamed from: f0.a0 */
/* loaded from: classes.dex */
public final class Effects {

    /* renamed from: a */
    private static final C5266y f14234a = new C5266y();

    /* renamed from: a */
    public static final void m25541a(Object obj, InterfaceC6108l interfaceC6108l, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "effect");
        interfaceC5179i.mo25263g(592131046);
        interfaceC5179i.mo25263g(-3686930);
        boolean mo25276I = interfaceC5179i.mo25276I(obj);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            interfaceC5179i.mo25247w(new C5260w(interfaceC6108l));
        }
        interfaceC5179i.mo25282C();
        interfaceC5179i.mo25282C();
    }

    /* renamed from: b */
    public static final void m25540b(Object obj, Object obj2, Object obj3, InterfaceC6108l interfaceC6108l, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "effect");
        interfaceC5179i.mo25263g(592134824);
        interfaceC5179i.mo25263g(-3686095);
        boolean mo25276I = interfaceC5179i.mo25276I(obj) | interfaceC5179i.mo25276I(obj2) | interfaceC5179i.mo25276I(obj3);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            interfaceC5179i.mo25247w(new C5260w(interfaceC6108l));
        }
        interfaceC5179i.mo25282C();
        interfaceC5179i.mo25282C();
    }

    /* renamed from: c */
    public static final void m25539c(Object obj, InterfaceC6112p interfaceC6112p, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "block");
        interfaceC5179i.mo25263g(1036442245);
        CoroutineContext mo25255o = interfaceC5179i.mo25255o();
        interfaceC5179i.mo25263g(-3686930);
        boolean mo25276I = interfaceC5179i.mo25276I(obj);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            interfaceC5179i.mo25247w(new C5182i0(mo25255o, interfaceC6112p));
        }
        interfaceC5179i.mo25282C();
        interfaceC5179i.mo25282C();
    }

    /* renamed from: d */
    public static final void m25538d(Object obj, Object obj2, InterfaceC6112p interfaceC6112p, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "block");
        interfaceC5179i.mo25263g(1036443237);
        CoroutineContext mo25255o = interfaceC5179i.mo25255o();
        interfaceC5179i.mo25263g(-3686552);
        boolean mo25276I = interfaceC5179i.mo25276I(obj) | interfaceC5179i.mo25276I(obj2);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            interfaceC5179i.mo25247w(new C5182i0(mo25255o, interfaceC6112p));
        }
        interfaceC5179i.mo25282C();
        interfaceC5179i.mo25282C();
    }

    /* renamed from: e */
    public static final void m25537e(Object obj, Object obj2, Object obj3, InterfaceC6112p interfaceC6112p, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "block");
        interfaceC5179i.mo25263g(1036444259);
        CoroutineContext mo25255o = interfaceC5179i.mo25255o();
        interfaceC5179i.mo25263g(-3686095);
        boolean mo25276I = interfaceC5179i.mo25276I(obj) | interfaceC5179i.mo25276I(obj2) | interfaceC5179i.mo25276I(obj3);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            interfaceC5179i.mo25247w(new C5182i0(mo25255o, interfaceC6112p));
        }
        interfaceC5179i.mo25282C();
        interfaceC5179i.mo25282C();
    }

    /* renamed from: f */
    public static final void m25536f(Object[] objArr, InterfaceC6112p interfaceC6112p, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(objArr, "keys");
        Intrinsics.isThisObjectNull(interfaceC6112p, "block");
        interfaceC5179i.mo25263g(1036445312);
        CoroutineContext mo25255o = interfaceC5179i.mo25255o();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        interfaceC5179i.mo25263g(-3685570);
        int length = copyOf.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            Object obj = copyOf[i2];
            i2++;
            z |= interfaceC5179i.mo25276I(obj);
        }
        Object mo25262h = interfaceC5179i.mo25262h();
        if (z || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            interfaceC5179i.mo25247w(new C5182i0(mo25255o, interfaceC6112p));
        }
        interfaceC5179i.mo25282C();
        interfaceC5179i.mo25282C();
    }

    /* renamed from: g */
    public static final void m25535g(InterfaceC6097a interfaceC6097a, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "effect");
        interfaceC5179i.mo25263g(-2102467972);
        interfaceC5179i.mo25267c(interfaceC6097a);
        interfaceC5179i.mo25282C();
    }

    /* renamed from: h */
    public static final /* synthetic */ C5266y m25534h() {
        return f14234a;
    }

    /* renamed from: i */
    public static final InterfaceC10524i0 m25533i(CoroutineContext coroutineContext, InterfaceC5179i interfaceC5179i) {
        InterfaceC10582v m7598b;
        Intrinsics.isThisObjectNull(coroutineContext, "coroutineContext");
        Intrinsics.isThisObjectNull(interfaceC5179i, "composer");
        InterfaceC10574t1.C10576b c10576b = InterfaceC10574t1.f27288s;
        if (coroutineContext.mo4546c(c10576b) != null) {
            m7598b = C10596y1.m7598b(null, 1, null);
            m7598b.mo7632L(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            return C10531j0.m7771a(m7598b);
        }
        CoroutineContext mo25255o = interfaceC5179i.mo25255o();
        return C10531j0.m7771a(mo25255o.mo4545f0(C10588w1.m7618a((InterfaceC10574t1) mo25255o.mo4546c(c10576b))).mo4545f0(coroutineContext));
    }
}
