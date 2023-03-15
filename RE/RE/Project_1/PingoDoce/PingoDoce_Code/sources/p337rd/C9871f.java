package p337rd;

import bd.C1894h;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.jvm.internal.DebugProbes;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;
import p468yc.C13183m;
import p468yc.C13186n;
import p468yc.C13195u;

/* renamed from: rd.f */
/* loaded from: classes2.dex */
final class C9871f<T> extends AbstractC9872g implements Iterator, InterfaceC1886d, InterfaceC6650a {

    /* renamed from: w */
    private int f25861w;

    /* renamed from: x */
    private Object f25862x;

    /* renamed from: y */
    private Iterator f25863y;

    /* renamed from: z */
    private InterfaceC1886d f25864z;

    /* renamed from: b */
    private final Throwable m9775b() {
        int i = this.f25861w;
        if (i != 4) {
            if (i != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f25861w);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    /* renamed from: c */
    private final Object m9774c() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    public Object mo9772a(Object obj, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m34636d2;
        Object m34636d3;
        this.f25862x = obj;
        this.f25861w = 3;
        this.f25864z = interfaceC1886d;
        m34636d = C2116d.m34636d();
        m34636d2 = C2116d.m34636d();
        if (m34636d == m34636d2) {
            DebugProbes.m20186c(interfaceC1886d);
        }
        m34636d3 = C2116d.m34636d();
        return m34636d == m34636d3 ? m34636d : C13195u.f34156a;
    }

    /* renamed from: d */
    public final void m9773d(InterfaceC1886d interfaceC1886d) {
        this.f25864z = interfaceC1886d;
    }

    public CoroutineContext getContext() {
        return C1894h.f5621w;
    }

    public boolean hasNext() {
        while (true) {
            int i = this.f25861w;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m9775b();
                }
                Iterator it = this.f25863y;
                Intrinsics.ifNullDoSomething(it);
                if (it.hasNext()) {
                    this.f25861w = 2;
                    return true;
                }
                this.f25863y = null;
            }
            this.f25861w = 5;
            InterfaceC1886d interfaceC1886d = this.f25864z;
            Intrinsics.ifNullDoSomething(interfaceC1886d);
            this.f25864z = null;
            C13183m.C13184a c13184a = C13183m.f34143w;
            interfaceC1886d.resumeWith(C13183m.m1458a(C13195u.f34156a));
        }
    }

    public Object next() {
        int i = this.f25861w;
        if (i == 0 || i == 1) {
            return m9774c();
        }
        if (i == 2) {
            this.f25861w = 1;
            Iterator it = this.f25863y;
            Intrinsics.ifNullDoSomething(it);
            return it.next();
        } else if (i == 3) {
            this.f25861w = 0;
            Object obj = this.f25862x;
            this.f25862x = null;
            return obj;
        } else {
            throw m9775b();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void resumeWith(Object obj) {
        C13186n.m1453b(obj);
        this.f25861w = 4;
    }
}
