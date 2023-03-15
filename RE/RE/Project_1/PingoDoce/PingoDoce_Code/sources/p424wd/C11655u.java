package p424wd;

import bd.CoroutineContext;
import id.InterfaceC6112p;
import kotlinx.coroutines.internal.C6859d0;
import p181jd.AbstractC6438m;
import td.InterfaceC10574t1;

/* compiled from: SafeCollector.common.kt */
/* renamed from: wd.u */
/* loaded from: classes2.dex */
public final class C11655u {

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: wd.u$a */
    /* loaded from: classes2.dex */
    static final class C11656a extends AbstractC6438m implements InterfaceC6112p<Integer, CoroutineContext.InterfaceC1891b, Integer> {

        /* renamed from: w */
        final /* synthetic */ C11651s<?> f29792w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11656a(C11651s<?> c11651s) {
            super(2);
            this.f29792w = c11651s;
        }

        @Override // id.InterfaceC6112p
        /* renamed from: F */
        public /* bridge */ /* synthetic */ Integer mo39856d(Integer num, CoroutineContext.InterfaceC1891b interfaceC1891b) {
            return m4530a(num.intValue(), interfaceC1891b);
        }

        /* renamed from: a */
        public final Integer m4530a(int i, CoroutineContext.InterfaceC1891b interfaceC1891b) {
            CoroutineContext.InterfaceC1893c key = interfaceC1891b.getKey();
            CoroutineContext.InterfaceC1891b mo4546c = this.f29792w.f29786x.mo4546c(key);
            if (key != InterfaceC10574t1.f27288s) {
                return Integer.valueOf(interfaceC1891b != mo4546c ? Integer.MIN_VALUE : i + 1);
            }
            InterfaceC10574t1 interfaceC10574t1 = (InterfaceC10574t1) mo4546c;
            InterfaceC10574t1 m4531b = C11655u.m4531b((InterfaceC10574t1) interfaceC1891b, interfaceC10574t1);
            if (m4531b == interfaceC10574t1) {
                if (interfaceC10574t1 != null) {
                    i++;
                }
                return Integer.valueOf(i);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + m4531b + ", expected child of " + interfaceC10574t1 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }
    }

    /* renamed from: a */
    public static final void m4532a(C11651s<?> c11651s, CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.mo4547M(0, new C11656a(c11651s))).intValue() == c11651s.f29787y) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + c11651s.f29786x + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* renamed from: b */
    public static final InterfaceC10574t1 m4531b(InterfaceC10574t1 interfaceC10574t1, InterfaceC10574t1 interfaceC10574t12) {
        while (interfaceC10574t1 != null) {
            if (interfaceC10574t1 == interfaceC10574t12 || !(interfaceC10574t1 instanceof C6859d0)) {
                return interfaceC10574t1;
            }
            interfaceC10574t1 = ((C6859d0) interfaceC10574t1).m20002a1();
        }
        return null;
    }
}
