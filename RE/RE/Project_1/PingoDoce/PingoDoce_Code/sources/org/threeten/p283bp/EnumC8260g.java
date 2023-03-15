package org.threeten.p283bp;

import java.util.Locale;
import org.threeten.p283bp.chrono.AbstractC8188h;
import org.threeten.p283bp.chrono.C8195m;
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
import p070e.C4906j;

/* renamed from: org.threeten.bp.g */
/* loaded from: classes2.dex */
public enum EnumC8260g implements InterfaceC8299e, InterfaceC8300f {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    
    public static final InterfaceC8313j<EnumC8260g> FROM = new InterfaceC8313j<EnumC8260g>() { // from class: org.threeten.bp.g.a
        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public EnumC8260g mo16124b(InterfaceC8299e interfaceC8299e) {
            return EnumC8260g.from(interfaceC8299e);
        }
    };
    private static final EnumC8260g[] ENUMS = values();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Month.java */
    /* renamed from: org.threeten.bp.g$b */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C8262b {

        /* renamed from: a */
        static final /* synthetic */ int[] f21465a;

        static {
            int[] iArr = new int[EnumC8260g.values().length];
            f21465a = iArr;
            try {
                iArr[EnumC8260g.FEBRUARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21465a[EnumC8260g.APRIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21465a[EnumC8260g.JUNE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21465a[EnumC8260g.SEPTEMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21465a[EnumC8260g.NOVEMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21465a[EnumC8260g.JANUARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21465a[EnumC8260g.MARCH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21465a[EnumC8260g.MAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21465a[EnumC8260g.JULY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21465a[EnumC8260g.AUGUST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21465a[EnumC8260g.OCTOBER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21465a[EnumC8260g.DECEMBER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static EnumC8260g from(InterfaceC8299e interfaceC8299e) {
        if (interfaceC8299e instanceof EnumC8260g) {
            return (EnumC8260g) interfaceC8299e;
        }
        try {
            if (!C8195m.f21328y.equals(AbstractC8188h.m16348h(interfaceC8299e))) {
                interfaceC8299e = C8213d.m16160z(interfaceC8299e);
            }
            return m16008of(interfaceC8299e.get(EnumC8288a.MONTH_OF_YEAR));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain Month from TemporalAccessor: " + interfaceC8299e + ", type " + interfaceC8299e.getClass().getName(), e);
        }
    }

    /* renamed from: of */
    public static EnumC8260g m16008of(int i) {
        if (i >= 1 && i <= 12) {
            return ENUMS[i - 1];
        }
        throw new DateTimeException("Invalid value for MonthOfYear: " + i);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8300f
    public InterfaceC8298d adjustInto(InterfaceC8298d interfaceC8298d) {
        if (AbstractC8188h.m16348h(interfaceC8298d).equals(C8195m.f21328y)) {
            return interfaceC8298d.mo15874c(EnumC8288a.MONTH_OF_YEAR, getValue());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    public int firstDayOfYear(boolean z) {
        switch (C8262b.f21465a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + 152;
            case 4:
                return (z ? 1 : 0) + 244;
            case 5:
                return (z ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + C4906j.f13395D0;
            case 9:
                return (z ? 1 : 0) + 182;
            case 10:
                return (z ? 1 : 0) + 213;
            case 11:
                return (z ? 1 : 0) + 274;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    public EnumC8260g firstMonthOfQuarter() {
        return ENUMS[(ordinal() / 3) * 3];
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public int get(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h == EnumC8288a.MONTH_OF_YEAR) {
            return getValue();
        }
        return range(interfaceC8304h).m15854a(getLong(interfaceC8304h), interfaceC8304h);
    }

    public String getDisplayName(EnumC8259k enumC8259k, Locale locale) {
        return new C8226c().m16062l(EnumC8288a.MONTH_OF_YEAR, enumC8259k).m16075E(locale).m16091a(this);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public long getLong(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h == EnumC8288a.MONTH_OF_YEAR) {
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
        return interfaceC8304h instanceof EnumC8288a ? interfaceC8304h == EnumC8288a.MONTH_OF_YEAR : interfaceC8304h != null && interfaceC8304h.isSupportedBy(this);
    }

    public int length(boolean z) {
        int i = C8262b.f21465a[ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : z ? 29 : 28;
    }

    public int maxLength() {
        int i = C8262b.f21465a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    public int minLength() {
        int i = C8262b.f21465a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 28;
    }

    public EnumC8260g minus(long j) {
        return plus(-(j % 12));
    }

    public EnumC8260g plus(long j) {
        return ENUMS[(ordinal() + (((int) (j % 12)) + 12)) % 12];
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public <R> R query(InterfaceC8313j<R> interfaceC8313j) {
        if (interfaceC8313j == C8305i.m15869a()) {
            return (R) C8195m.f21328y;
        }
        if (interfaceC8313j == C8305i.m15865e()) {
            return (R) EnumC8289b.MONTHS;
        }
        if (interfaceC8313j == C8305i.m15868b() || interfaceC8313j == C8305i.m15867c() || interfaceC8313j == C8305i.m15864f() || interfaceC8313j == C8305i.m15863g() || interfaceC8313j == C8305i.m15866d()) {
            return null;
        }
        return interfaceC8313j.mo16124b(this);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public C8315l range(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h == EnumC8288a.MONTH_OF_YEAR) {
            return interfaceC8304h.range();
        }
        if (!(interfaceC8304h instanceof EnumC8288a)) {
            return interfaceC8304h.rangeRefinedBy(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
    }
}
