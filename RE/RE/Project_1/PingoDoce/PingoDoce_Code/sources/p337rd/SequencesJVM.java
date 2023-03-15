package p337rd;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p181jd.Intrinsics;

/* renamed from: rd.a */
/* loaded from: classes2.dex */
public final class SequencesJVM<T> implements InterfaceC9870e {

    /* renamed from: a */
    private final AtomicReference f25851a;

    public SequencesJVM(InterfaceC9870e interfaceC9870e) {
        Intrinsics.isThisObjectNull(interfaceC9870e, "sequence");
        this.f25851a = new AtomicReference(interfaceC9870e);
    }

    public Iterator iterator() {
        InterfaceC9870e interfaceC9870e = (InterfaceC9870e) this.f25851a.getAndSet(null);
        if (interfaceC9870e != null) {
            return interfaceC9870e.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
