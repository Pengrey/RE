package org.threeten.p283bp.chrono;

import java.util.Locale;
import org.threeten.p283bp.DateTimeException;
import org.threeten.p283bp.format.C8226c;
import org.threeten.p283bp.format.EnumC8259k;
import org.threeten.p283bp.temporal.C8305i;
import org.threeten.p283bp.temporal.C8315l;
import org.threeten.p283bp.temporal.EnumC8288a;
import org.threeten.p283bp.temporal.EnumC8289b;
import org.threeten.p283bp.temporal.InterfaceC8298d;
import org.threeten.p283bp.temporal.InterfaceC8304h;
import org.threeten.p283bp.temporal.InterfaceC8313j;
import org.threeten.p283bp.temporal.UnsupportedTemporalTypeException;

/* renamed from: org.threeten.bp.chrono.n */
/* loaded from: classes2.dex */
public enum EnumC8196n implements InterfaceC8190i {
    BCE,
    CE;

    /* renamed from: of */
    public static EnumC8196n m16287of(int i) {
        if (i != 0) {
            if (i == 1) {
                return CE;
            }
            throw new DateTimeException("Invalid era: " + i);
        }
        return BCE;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8300f
    public InterfaceC8298d adjustInto(InterfaceC8298d interfaceC8298d) {
        return interfaceC8298d.mo15874c(EnumC8288a.ERA, getValue());
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public int get(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h == EnumC8288a.ERA) {
            return getValue();
        }
        return range(interfaceC8304h).m15854a(getLong(interfaceC8304h), interfaceC8304h);
    }

    public String getDisplayName(EnumC8259k enumC8259k, Locale locale) {
        return new C8226c().m16062l(EnumC8288a.ERA, enumC8259k).m16075E(locale).m16091a(this);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public long getLong(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h == EnumC8288a.ERA) {
            return getValue();
        }
        if (!(interfaceC8304h instanceof EnumC8288a)) {
            return interfaceC8304h.getFrom(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
    }

    @Override // org.threeten.p283bp.chrono.InterfaceC8190i
    public int getValue() {
        return ordinal();
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public boolean isSupported(InterfaceC8304h interfaceC8304h) {
        return interfaceC8304h instanceof EnumC8288a ? interfaceC8304h == EnumC8288a.ERA : interfaceC8304h != null && interfaceC8304h.isSupportedBy(this);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public <R> R query(InterfaceC8313j<R> interfaceC8313j) {
        if (interfaceC8313j == C8305i.m15865e()) {
            return (R) EnumC8289b.ERAS;
        }
        if (interfaceC8313j == C8305i.m15869a() || interfaceC8313j == C8305i.m15864f() || interfaceC8313j == C8305i.m15863g() || interfaceC8313j == C8305i.m15866d() || interfaceC8313j == C8305i.m15868b() || interfaceC8313j == C8305i.m15867c()) {
            return null;
        }
        return interfaceC8313j.mo16124b(this);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public C8315l range(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h == EnumC8288a.ERA) {
            return interfaceC8304h.range();
        }
        if (!(interfaceC8304h instanceof EnumC8288a)) {
            return interfaceC8304h.rangeRefinedBy(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
    }
}
