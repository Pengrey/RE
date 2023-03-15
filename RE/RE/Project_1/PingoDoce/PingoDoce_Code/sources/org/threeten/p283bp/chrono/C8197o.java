package org.threeten.p283bp.chrono;

import com.google.crypto.tink.shaded.protobuf.Reader;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.threeten.p283bp.AbstractC8280n;
import org.threeten.p283bp.C8171c;
import org.threeten.p283bp.C8213d;
import org.threeten.p283bp.temporal.C8315l;
import org.threeten.p283bp.temporal.EnumC8288a;
import org.threeten.p283bp.temporal.InterfaceC8299e;

/* renamed from: org.threeten.bp.chrono.o */
/* loaded from: classes2.dex */
public final class C8197o extends AbstractC8188h implements Serializable {

    /* renamed from: A */
    private static final Map<String, String[]> f21330A;

    /* renamed from: B */
    private static final Map<String, String[]> f21331B;

    /* renamed from: C */
    private static final Map<String, String[]> f21332C;

    /* renamed from: y */
    static final Locale f21333y = new Locale("ja", "JP", "JP");

    /* renamed from: z */
    public static final C8197o f21334z = new C8197o();

    /* compiled from: JapaneseChronology.java */
    /* renamed from: org.threeten.bp.chrono.o$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C8198a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21335a;

        static {
            int[] iArr = new int[EnumC8288a.values().length];
            f21335a = iArr;
            try {
                iArr[EnumC8288a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21335a[EnumC8288a.DAY_OF_WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21335a[EnumC8288a.MICRO_OF_DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21335a[EnumC8288a.MICRO_OF_SECOND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21335a[EnumC8288a.HOUR_OF_DAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21335a[EnumC8288a.HOUR_OF_AMPM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21335a[EnumC8288a.MINUTE_OF_DAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21335a[EnumC8288a.MINUTE_OF_HOUR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21335a[EnumC8288a.SECOND_OF_DAY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21335a[EnumC8288a.SECOND_OF_MINUTE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21335a[EnumC8288a.MILLI_OF_DAY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21335a[EnumC8288a.MILLI_OF_SECOND.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21335a[EnumC8288a.NANO_OF_DAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21335a[EnumC8288a.NANO_OF_SECOND.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21335a[EnumC8288a.CLOCK_HOUR_OF_DAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21335a[EnumC8288a.CLOCK_HOUR_OF_AMPM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21335a[EnumC8288a.EPOCH_DAY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f21335a[EnumC8288a.PROLEPTIC_MONTH.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f21335a[EnumC8288a.ERA.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f21335a[EnumC8288a.YEAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f21335a[EnumC8288a.YEAR_OF_ERA.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f21335a[EnumC8288a.MONTH_OF_YEAR.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f21335a[EnumC8288a.DAY_OF_YEAR.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f21330A = hashMap;
        HashMap hashMap2 = new HashMap();
        f21331B = hashMap2;
        HashMap hashMap3 = new HashMap();
        f21332C = hashMap3;
        hashMap.put("en", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        hashMap.put("ja", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        hashMap2.put("en", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        hashMap2.put("ja", new String[]{"Unknown", "慶", "明", "大", "昭", "平"});
        hashMap3.put("en", new String[]{"Unknown", "Keio", "Meiji", "Taisho", "Showa", "Heisei"});
        hashMap3.put("ja", new String[]{"Unknown", "慶応", "明治", "大正", "昭和", "平成"});
    }

    private C8197o() {
    }

    private Object readResolve() {
        return f21334z;
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: i */
    public String mo16234i() {
        return "japanese";
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: j */
    public String mo16233j() {
        return "Japanese";
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: l */
    public AbstractC8178c<C8199p> mo16232l(InterfaceC8299e interfaceC8299e) {
        return super.mo16232l(interfaceC8299e);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: q */
    public AbstractC8183f<C8199p> mo16231q(C8171c c8171c, AbstractC8280n abstractC8280n) {
        return super.mo16231q(c8171c, abstractC8280n);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: r */
    public AbstractC8183f<C8199p> mo16230r(InterfaceC8299e interfaceC8299e) {
        return super.mo16230r(interfaceC8299e);
    }

    /* renamed from: s */
    public C8199p m16286s(int i, int i2, int i3) {
        return new C8199p(C8213d.m16193O(i, i2, i3));
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: t */
    public C8199p mo16236c(InterfaceC8299e interfaceC8299e) {
        if (interfaceC8299e instanceof C8199p) {
            return (C8199p) interfaceC8299e;
        }
        return new C8199p(C8213d.m16160z(interfaceC8299e));
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: u */
    public C8201q mo16235g(int i) {
        return C8201q.m16263j(i);
    }

    /* renamed from: v */
    public int m16283v(InterfaceC8190i interfaceC8190i, int i) {
        C8201q c8201q;
        if (interfaceC8190i instanceof C8201q) {
            int year = (((C8201q) interfaceC8190i).m16260m().getYear() + i) - 1;
            C8315l.m15846i(1L, (c8201q.m16265g().getYear() - c8201q.m16260m().getYear()) + 1).m15853b(i, EnumC8288a.YEAR_OF_ERA);
            return year;
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    /* renamed from: w */
    public C8315l m16282w(EnumC8288a enumC8288a) {
        int[] iArr = C8198a.f21335a;
        switch (iArr[enumC8288a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return enumC8288a.range();
            default:
                Calendar calendar = Calendar.getInstance(f21333y);
                int i = 0;
                switch (iArr[enumC8288a.ordinal()]) {
                    case 19:
                        C8201q[] m16259n = C8201q.m16259n();
                        return C8315l.m15846i(m16259n[0].getValue(), m16259n[m16259n.length - 1].getValue());
                    case 20:
                        C8201q[] m16259n2 = C8201q.m16259n();
                        return C8315l.m15846i(C8199p.f21336z.getYear(), m16259n2[m16259n2.length - 1].m16265g().getYear());
                    case 21:
                        C8201q[] m16259n3 = C8201q.m16259n();
                        int year = (m16259n3[m16259n3.length - 1].m16265g().getYear() - m16259n3[m16259n3.length - 1].m16260m().getYear()) + 1;
                        int i2 = Reader.READ_DONE;
                        while (i < m16259n3.length) {
                            i2 = Math.min(i2, (m16259n3[i].m16265g().getYear() - m16259n3[i].m16260m().getYear()) + 1);
                            i++;
                        }
                        return C8315l.m15844k(1L, 6L, i2, year);
                    case 22:
                        return C8315l.m15844k(calendar.getMinimum(2) + 1, calendar.getGreatestMinimum(2) + 1, calendar.getLeastMaximum(2) + 1, calendar.getMaximum(2) + 1);
                    case 23:
                        C8201q[] m16259n4 = C8201q.m16259n();
                        int i3 = 366;
                        while (i < m16259n4.length) {
                            i3 = Math.min(i3, (m16259n4[i].m16260m().m16198J() - m16259n4[i].m16260m().getDayOfYear()) + 1);
                            i++;
                        }
                        return C8315l.m15845j(1L, i3, 366L);
                    default:
                        throw new UnsupportedOperationException("Unimplementable field: " + enumC8288a);
                }
        }
    }
}
