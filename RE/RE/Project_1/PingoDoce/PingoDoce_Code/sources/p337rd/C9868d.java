package p337rd;

import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sequences.kt */
/* renamed from: rd.d */
/* loaded from: classes2.dex */
public final class C9868d<T> implements InterfaceC9870e {

    /* renamed from: a */
    private final InterfaceC6097a f25856a;

    /* renamed from: b */
    private final InterfaceC6108l f25857b;

    /* compiled from: Sequences.kt */
    /* renamed from: rd.d$a */
    /* loaded from: classes2.dex */
    public static final class C9869a implements Iterator, InterfaceC6650a {

        /* renamed from: w */
        private Object f25858w;

        /* renamed from: x */
        private int f25859x = -2;

        C9869a() {
        }

        /* renamed from: a */
        private final void m9776a() {
            Object mo9587d;
            if (this.f25859x == -2) {
                mo9587d = C9868d.m9778b(C9868d.this).mo42214q();
            } else {
                InterfaceC6108l m9777c = C9868d.m9777c(C9868d.this);
                Object obj = this.f25858w;
                Intrinsics.ifNullDoSomething(obj);
                mo9587d = m9777c.mo9587d(obj);
            }
            this.f25858w = mo9587d;
            this.f25859x = mo9587d == null ? 0 : 1;
        }

        public boolean hasNext() {
            if (this.f25859x < 0) {
                m9776a();
            }
            return this.f25859x == 1;
        }

        public Object next() {
            if (this.f25859x < 0) {
                m9776a();
            }
            if (this.f25859x != 0) {
                Object obj = this.f25858w;
                Intrinsics.m20929f(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f25859x = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C9868d(InterfaceC6097a interfaceC6097a, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "getInitialValue");
        Intrinsics.isThisObjectNull(interfaceC6108l, "getNextValue");
        this.f25856a = interfaceC6097a;
        this.f25857b = interfaceC6108l;
    }

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC6097a m9778b(C9868d c9868d) {
        return c9868d.f25856a;
    }

    /* renamed from: c */
    public static final /* synthetic */ InterfaceC6108l m9777c(C9868d c9868d) {
        return c9868d.f25857b;
    }

    public Iterator iterator() {
        return new C9869a();
    }
}
