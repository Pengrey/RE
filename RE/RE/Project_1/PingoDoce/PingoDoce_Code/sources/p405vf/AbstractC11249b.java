package p405vf;

import org.threeten.p283bp.temporal.InterfaceC8298d;
import org.threeten.p283bp.temporal.InterfaceC8300f;
import org.threeten.p283bp.temporal.InterfaceC8314k;

/* renamed from: vf.b */
/* loaded from: classes2.dex */
public abstract class AbstractC11249b extends AbstractC11250c implements InterfaceC8298d {
    /* renamed from: b */
    public InterfaceC8298d mo5633b(InterfaceC8300f interfaceC8300f) {
        return interfaceC8300f.adjustInto(this);
    }

    /* renamed from: d */
    public InterfaceC8298d mo5632d(long j, InterfaceC8314k interfaceC8314k) {
        return j == Long.MIN_VALUE ? mo15873e(Long.MAX_VALUE, interfaceC8314k).mo15873e(1L, interfaceC8314k) : mo15873e(-j, interfaceC8314k);
    }
}
