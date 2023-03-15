package p405vf;

import org.threeten.p283bp.temporal.C8305i;
import org.threeten.p283bp.temporal.C8315l;
import org.threeten.p283bp.temporal.EnumC8288a;
import org.threeten.p283bp.temporal.InterfaceC8299e;
import org.threeten.p283bp.temporal.InterfaceC8304h;
import org.threeten.p283bp.temporal.InterfaceC8313j;
import org.threeten.p283bp.temporal.UnsupportedTemporalTypeException;

/* renamed from: vf.c */
/* loaded from: classes2.dex */
public abstract class AbstractC11250c implements InterfaceC8299e {
    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public int get(InterfaceC8304h interfaceC8304h) {
        return range(interfaceC8304h).m15854a(getLong(interfaceC8304h), interfaceC8304h);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public <R> R query(InterfaceC8313j<R> interfaceC8313j) {
        if (interfaceC8313j == C8305i.m15863g() || interfaceC8313j == C8305i.m15869a() || interfaceC8313j == C8305i.m15865e()) {
            return null;
        }
        return interfaceC8313j.mo16124b(this);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public C8315l range(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            if (isSupported(interfaceC8304h)) {
                return interfaceC8304h.range();
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
        }
        return interfaceC8304h.rangeRefinedBy(this);
    }
}
