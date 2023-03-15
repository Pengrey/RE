package org.threeten.p283bp;

import java.util.Locale;
import org.threeten.p283bp.format.C8226c;
import org.threeten.p283bp.format.EnumC8259k;
import org.threeten.p283bp.temporal.C8305i;
import org.threeten.p283bp.temporal.C8315l;
import org.threeten.p283bp.temporal.EnumC8288a;
import org.threeten.p283bp.temporal.EnumC8289b;
import org.threeten.p283bp.temporal.InterfaceC8298d;
import org.threeten.p283bp.temporal.InterfaceC8299e;
import org.threeten.p283bp.temporal.InterfaceC8300f;
import org.threeten.p283bp.temporal.InterfaceC8304h;
import org.threeten.p283bp.temporal.InterfaceC8313j;
import org.threeten.p283bp.temporal.UnsupportedTemporalTypeException;

/* renamed from: org.threeten.bp.a */
/* loaded from: classes2.dex */
public enum EnumC8168a implements InterfaceC8299e, InterfaceC8300f {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    
    public static final InterfaceC8313j<EnumC8168a> FROM = new InterfaceC8313j<EnumC8168a>() { // from class: org.threeten.bp.a.a
        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public EnumC8168a mo16124b(InterfaceC8299e interfaceC8299e) {
            return EnumC8168a.from(interfaceC8299e);
        }
    };
    private static final EnumC8168a[] ENUMS = values();

    public static EnumC8168a from(InterfaceC8299e interfaceC8299e) {
        if (interfaceC8299e instanceof EnumC8168a) {
            return (EnumC8168a) interfaceC8299e;
        }
        try {
            return m16409of(interfaceC8299e.get(EnumC8288a.DAY_OF_WEEK));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain DayOfWeek from TemporalAccessor: " + interfaceC8299e + ", type " + interfaceC8299e.getClass().getName(), e);
        }
    }

    /* renamed from: of */
    public static EnumC8168a m16409of(int i) {
        if (i >= 1 && i <= 7) {
            return ENUMS[i - 1];
        }
        throw new DateTimeException("Invalid value for DayOfWeek: " + i);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8300f
    public InterfaceC8298d adjustInto(InterfaceC8298d interfaceC8298d) {
        return interfaceC8298d.mo15874c(EnumC8288a.DAY_OF_WEEK, getValue());
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public int get(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h == EnumC8288a.DAY_OF_WEEK) {
            return getValue();
        }
        return range(interfaceC8304h).m15854a(getLong(interfaceC8304h), interfaceC8304h);
    }

    public String getDisplayName(EnumC8259k enumC8259k, Locale locale) {
        return new C8226c().m16062l(EnumC8288a.DAY_OF_WEEK, enumC8259k).m16075E(locale).m16091a(this);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public long getLong(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h == EnumC8288a.DAY_OF_WEEK) {
            return getValue();
        }
        if (!(interfaceC8304h instanceof EnumC8288a)) {
            return interfaceC8304h.getFrom(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public boolean isSupported(InterfaceC8304h interfaceC8304h) {
        return interfaceC8304h instanceof EnumC8288a ? interfaceC8304h == EnumC8288a.DAY_OF_WEEK : interfaceC8304h != null && interfaceC8304h.isSupportedBy(this);
    }

    public EnumC8168a minus(long j) {
        return plus(-(j % 7));
    }

    public EnumC8168a plus(long j) {
        return ENUMS[(ordinal() + (((int) (j % 7)) + 7)) % 7];
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public <R> R query(InterfaceC8313j<R> interfaceC8313j) {
        if (interfaceC8313j == C8305i.m15865e()) {
            return (R) EnumC8289b.DAYS;
        }
        if (interfaceC8313j == C8305i.m15868b() || interfaceC8313j == C8305i.m15867c() || interfaceC8313j == C8305i.m15869a() || interfaceC8313j == C8305i.m15864f() || interfaceC8313j == C8305i.m15863g() || interfaceC8313j == C8305i.m15866d()) {
            return null;
        }
        return interfaceC8313j.mo16124b(this);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public C8315l range(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h == EnumC8288a.DAY_OF_WEEK) {
            return interfaceC8304h.range();
        }
        if (!(interfaceC8304h instanceof EnumC8288a)) {
            return interfaceC8304h.rangeRefinedBy(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
    }
}
