package p489zc;

import java.util.Iterator;
import p203kd.InterfaceC6650a;

/* renamed from: zc.g0 */
/* loaded from: classes2.dex */
public abstract class AbstractC13762g0 implements Iterator<Integer>, InterfaceC6650a {
    /* renamed from: a */
    public abstract int mo404a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(mo404a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
