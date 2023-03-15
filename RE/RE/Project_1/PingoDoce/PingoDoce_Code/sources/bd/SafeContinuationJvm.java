package bd;

import cd.C2116d;
import cd.EnumC2110a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.InterfaceC6758e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: bd.i */
/* loaded from: classes2.dex */
public final class SafeContinuationJvm<T> implements InterfaceC1886d, InterfaceC6758e {
    @Deprecated

    /* renamed from: x */
    private static final AtomicReferenceFieldUpdater f5622x;
    private volatile Object result;

    /* renamed from: w */
    private final InterfaceC1886d f5623w;

    /* compiled from: SafeContinuationJvm.kt */
    /* renamed from: bd.i$a */
    /* loaded from: classes2.dex */
    private static final class C1895a {
        private C1895a() {
        }

        public /* synthetic */ C1895a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C1895a(null);
        f5622x = AtomicReferenceFieldUpdater.newUpdater(SafeContinuationJvm.class, Object.class, "result");
    }

    public SafeContinuationJvm(InterfaceC1886d interfaceC1886d, Object obj) {
        Intrinsics.isThisObjectNull(interfaceC1886d, "delegate");
        this.f5623w = interfaceC1886d;
        this.result = obj;
    }

    public InterfaceC6758e getCallerFrame() {
        InterfaceC1886d interfaceC1886d = this.f5623w;
        if (interfaceC1886d instanceof InterfaceC6758e) {
            return (InterfaceC6758e) interfaceC1886d;
        }
        return null;
    }

    public CoroutineContext getContext() {
        return this.f5623w.getContext();
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public void resumeWith(Object obj) {
        Object m34636d;
        Object m34636d2;
        while (true) {
            Object obj2 = this.result;
            EnumC2110a enumC2110a = EnumC2110a.UNDECIDED;
            if (obj2 != enumC2110a) {
                m34636d = C2116d.m34636d();
                if (obj2 != m34636d) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5622x;
                m34636d2 = C2116d.m34636d();
                if (atomicReferenceFieldUpdater.compareAndSet(this, m34636d2, EnumC2110a.RESUMED)) {
                    this.f5623w.resumeWith(obj);
                    return;
                }
            } else if (f5622x.compareAndSet(this, enumC2110a, obj)) {
                return;
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f5623w;
    }
}
