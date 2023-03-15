package p337rd;

import id.InterfaceC6108l;
import java.util.Iterator;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;

/* compiled from: Sequences.kt */
/* renamed from: rd.n */
/* loaded from: classes2.dex */
public final class C9880n<T, R> implements InterfaceC9870e {

    /* renamed from: a */
    private final InterfaceC9870e f25868a;

    /* renamed from: b */
    private final InterfaceC6108l f25869b;

    /* compiled from: Sequences.kt */
    /* renamed from: rd.n$a */
    /* loaded from: classes2.dex */
    public static final class C9881a implements Iterator, InterfaceC6650a {

        /* renamed from: w */
        private final Iterator f25870w;

        C9881a() {
            this.f25870w = C9880n.m9749b(C9880n.this).iterator();
        }

        public boolean hasNext() {
            return this.f25870w.hasNext();
        }

        public Object next() {
            return C9880n.m9748c(C9880n.this).mo9587d(this.f25870w.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C9880n(InterfaceC9870e interfaceC9870e, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC9870e, "sequence");
        Intrinsics.isThisObjectNull(interfaceC6108l, "transformer");
        this.f25868a = interfaceC9870e;
        this.f25869b = interfaceC6108l;
    }

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC9870e m9749b(C9880n c9880n) {
        return c9880n.f25868a;
    }

    /* renamed from: c */
    public static final /* synthetic */ InterfaceC6108l m9748c(C9880n c9880n) {
        return c9880n.f25869b;
    }

    public Iterator iterator() {
        return new C9881a();
    }
}
