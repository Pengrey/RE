package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.AbstractC6861e0;
import kotlinx.coroutines.internal.C6867h0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.sync.i */
/* loaded from: classes2.dex */
public final class C6944i extends AbstractC6861e0<C6944i> {

    /* renamed from: e */
    /* synthetic */ AtomicReferenceArray f18456e;

    public C6944i(long j, C6944i c6944i, int i) {
        super(j, c6944i, i);
        int i2;
        i2 = C6943h.f18455f;
        this.f18456e = new AtomicReferenceArray(i2);
    }

    @Override // kotlinx.coroutines.internal.AbstractC6861e0
    /* renamed from: n */
    public int mo19735n() {
        int i;
        i = C6943h.f18455f;
        return i;
    }

    /* renamed from: q */
    public final void m19734q(int i) {
        C6867h0 c6867h0;
        c6867h0 = C6943h.f18454e;
        this.f18456e.set(i, c6867h0);
        m19996o();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + m19997m() + ", hashCode=" + hashCode() + ']';
    }
}
