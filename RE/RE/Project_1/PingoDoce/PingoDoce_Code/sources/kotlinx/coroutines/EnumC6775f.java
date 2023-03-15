package kotlinx.coroutines;

import bd.Continuation;
import bd.InterfaceC1886d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.NoWhenBranchMatchedException;
import p446xd.C12342a;
import p446xd.C12343b;

/* renamed from: kotlinx.coroutines.f */
/* loaded from: classes2.dex */
public enum EnumC6775f {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* compiled from: CoroutineStart.kt */
    /* renamed from: kotlinx.coroutines.f$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C6776a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18144a;

        static {
            int[] iArr = new int[EnumC6775f.values().length];
            iArr[EnumC6775f.DEFAULT.ordinal()] = 1;
            iArr[EnumC6775f.ATOMIC.ordinal()] = 2;
            iArr[EnumC6775f.UNDISPATCHED.ordinal()] = 3;
            iArr[EnumC6775f.LAZY.ordinal()] = 4;
            f18144a = iArr;
        }
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    public final <T> void invoke(InterfaceC6108l<? super InterfaceC1886d<? super T>, ? extends Object> interfaceC6108l, InterfaceC1886d<? super T> interfaceC1886d) {
        int i = C6776a.f18144a[ordinal()];
        if (i == 1) {
            C12342a.m3025c(interfaceC6108l, interfaceC1886d);
        } else if (i == 2) {
            Continuation.m35188b(interfaceC6108l, interfaceC1886d);
        } else if (i == 3) {
            C12343b.m3022a(interfaceC6108l, interfaceC1886d);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public final <R, T> void invoke(InterfaceC6112p<? super R, ? super InterfaceC1886d<? super T>, ? extends Object> interfaceC6112p, R r, InterfaceC1886d<? super T> interfaceC1886d) {
        int i = C6776a.f18144a[ordinal()];
        if (i == 1) {
            C12342a.m3023e(interfaceC6112p, r, interfaceC1886d, null, 4, null);
        } else if (i == 2) {
            Continuation.m35187c(interfaceC6112p, r, interfaceC1886d);
        } else if (i == 3) {
            C12343b.m3021b(interfaceC6112p, r, interfaceC1886d);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
