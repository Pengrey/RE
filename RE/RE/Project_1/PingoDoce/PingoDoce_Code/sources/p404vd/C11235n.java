package p404vd;

import id.InterfaceC6108l;
import java.util.ArrayList;
import kotlinx.coroutines.internal.C6867h0;
import kotlinx.coroutines.internal.C6907z;
import kotlinx.coroutines.internal.OnUndeliveredElement;
import p404vd.AbstractC11217c;
import p468yc.C13195u;

/* renamed from: vd.n */
/* loaded from: classes2.dex */
public class C11235n<E> extends AbstractC11208a<E> {
    public C11235n(InterfaceC6108l<? super E, C13195u> interfaceC6108l) {
        super(interfaceC6108l);
    }

    @Override // p404vd.AbstractC11208a
    /* renamed from: I */
    protected final boolean mo5647I() {
        return true;
    }

    @Override // p404vd.AbstractC11208a
    /* renamed from: J */
    protected final boolean mo5646J() {
        return true;
    }

    @Override // p404vd.AbstractC11208a
    /* renamed from: M */
    protected void mo5666M(Object obj, C11233l<?> c11233l) {
        OnUndeliveredElement onUndeliveredElement = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                AbstractC11243v abstractC11243v = (AbstractC11243v) obj;
                if (abstractC11243v instanceof AbstractC11217c.C11218a) {
                    InterfaceC6108l interfaceC6108l = this.f28794w;
                    if (interfaceC6108l != null) {
                        onUndeliveredElement = C6907z.m19834c(interfaceC6108l, ((AbstractC11217c.C11218a) abstractC11243v).f28796z, null);
                    }
                } else {
                    abstractC11243v.mo5637D(c11233l);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                OnUndeliveredElement onUndeliveredElement2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    AbstractC11243v abstractC11243v2 = (AbstractC11243v) arrayList.get(size);
                    if (abstractC11243v2 instanceof AbstractC11217c.C11218a) {
                        InterfaceC6108l interfaceC6108l2 = this.f28794w;
                        onUndeliveredElement2 = interfaceC6108l2 != null ? C6907z.m19834c(interfaceC6108l2, ((AbstractC11217c.C11218a) abstractC11243v2).f28796z, onUndeliveredElement2) : null;
                    } else {
                        abstractC11243v2.mo5637D(c11233l);
                    }
                }
                onUndeliveredElement = onUndeliveredElement2;
            }
        }
        if (onUndeliveredElement != null) {
            throw onUndeliveredElement;
        }
    }

    @Override // p404vd.AbstractC11217c
    /* renamed from: u */
    protected final boolean mo5645u() {
        return false;
    }

    @Override // p404vd.AbstractC11217c
    /* renamed from: v */
    protected final boolean mo5644v() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p404vd.AbstractC11217c
    /* renamed from: x */
    public Object mo5665x(E e) {
        InterfaceC11241t m5710z;
        do {
            Object mo5665x = super.mo5665x(e);
            C6867h0 c6867h0 = C11216b.f28788b;
            if (mo5665x == c6867h0) {
                return c6867h0;
            }
            if (mo5665x == C11216b.f28789c) {
                m5710z = m5710z(e);
                if (m5710z == null) {
                    return c6867h0;
                }
            } else if (mo5665x instanceof C11233l) {
                return mo5665x;
            } else {
                throw new IllegalStateException(("Invalid offerInternal result " + mo5665x).toString());
            }
        } while (!(m5710z instanceof C11233l));
        return m5710z;
    }
}
