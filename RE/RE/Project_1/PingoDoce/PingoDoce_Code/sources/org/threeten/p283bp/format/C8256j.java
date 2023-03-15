package org.threeten.p283bp.format;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.p283bp.temporal.C8290c;
import org.threeten.p283bp.temporal.EnumC8288a;
import org.threeten.p283bp.temporal.InterfaceC8304h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.threeten.bp.format.j */
/* loaded from: classes2.dex */
public final class C8256j extends AbstractC8251f {

    /* renamed from: c */
    private static final Comparator<Map.Entry<String, Long>> f21462c = new C8257a();

    /* renamed from: b */
    private final ConcurrentMap<Map.Entry<InterfaceC8304h, Locale>, Object> f21463b = new ConcurrentHashMap(16, 0.75f, 2);

    /* compiled from: SimpleDateTimeTextProvider.java */
    /* renamed from: org.threeten.bp.format.j$a */
    /* loaded from: classes2.dex */
    class C8257a implements Comparator<Map.Entry<String, Long>> {
        C8257a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
            return entry2.getKey().length() - entry.getKey().length();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SimpleDateTimeTextProvider.java */
    /* renamed from: org.threeten.bp.format.j$b */
    /* loaded from: classes2.dex */
    public static final class C8258b {

        /* renamed from: a */
        private final Map<EnumC8259k, Map<Long, String>> f21464a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C8258b(Map<EnumC8259k, Map<Long, String>> map) {
            this.f21464a = map;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (EnumC8259k enumC8259k : map.keySet()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry<Long, String> entry : map.get(enumC8259k).entrySet()) {
                    hashMap2.put(entry.getValue(), C8256j.m16016f(entry.getValue(), entry.getKey()));
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.values());
                Collections.sort(arrayList2, C8256j.f21462c);
                hashMap.put(enumC8259k, arrayList2);
                arrayList.addAll(arrayList2);
                hashMap.put(null, arrayList);
            }
            Collections.sort(arrayList, C8256j.f21462c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public String m16009a(long j, EnumC8259k enumC8259k) {
            Map<Long, String> map = this.f21464a.get(enumC8259k);
            if (map != null) {
                return map.get(Long.valueOf(j));
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static <A, B> Map.Entry<A, B> m16016f(A a, B b) {
        return new AbstractMap.SimpleImmutableEntry(a, b);
    }

    /* renamed from: g */
    private static C8258b m16015g(Map<EnumC8259k, Map<Long, String>> map) {
        map.put(EnumC8259k.FULL_STANDALONE, map.get(EnumC8259k.FULL));
        map.put(EnumC8259k.SHORT_STANDALONE, map.get(EnumC8259k.SHORT));
        EnumC8259k enumC8259k = EnumC8259k.NARROW;
        if (map.containsKey(enumC8259k)) {
            EnumC8259k enumC8259k2 = EnumC8259k.NARROW_STANDALONE;
            if (!map.containsKey(enumC8259k2)) {
                map.put(enumC8259k2, map.get(enumC8259k));
            }
        }
        return new C8258b(map);
    }

    /* renamed from: h */
    private Object m16014h(InterfaceC8304h interfaceC8304h, Locale locale) {
        if (interfaceC8304h == EnumC8288a.MONTH_OF_YEAR) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap hashMap = new HashMap();
            String[] months = dateFormatSymbols.getMonths();
            HashMap hashMap2 = new HashMap();
            hashMap2.put(1L, months[0]);
            hashMap2.put(2L, months[1]);
            hashMap2.put(3L, months[2]);
            hashMap2.put(4L, months[3]);
            hashMap2.put(5L, months[4]);
            hashMap2.put(6L, months[5]);
            hashMap2.put(7L, months[6]);
            hashMap2.put(8L, months[7]);
            hashMap2.put(9L, months[8]);
            hashMap2.put(10L, months[9]);
            hashMap2.put(11L, months[10]);
            hashMap2.put(12L, months[11]);
            hashMap.put(EnumC8259k.FULL, hashMap2);
            HashMap hashMap3 = new HashMap();
            hashMap3.put(1L, m16011k(1, months[0], locale));
            hashMap3.put(2L, m16011k(2, months[1], locale));
            hashMap3.put(3L, m16011k(3, months[2], locale));
            hashMap3.put(4L, m16011k(4, months[3], locale));
            hashMap3.put(5L, m16011k(5, months[4], locale));
            hashMap3.put(6L, m16011k(6, months[5], locale));
            hashMap3.put(7L, m16011k(7, months[6], locale));
            hashMap3.put(8L, m16011k(8, months[7], locale));
            hashMap3.put(9L, m16011k(9, months[8], locale));
            hashMap3.put(10L, m16011k(10, months[9], locale));
            hashMap3.put(11L, m16011k(11, months[10], locale));
            hashMap3.put(12L, m16011k(12, months[11], locale));
            hashMap.put(EnumC8259k.NARROW, hashMap3);
            String[] shortMonths = dateFormatSymbols.getShortMonths();
            HashMap hashMap4 = new HashMap();
            hashMap4.put(1L, shortMonths[0]);
            hashMap4.put(2L, shortMonths[1]);
            hashMap4.put(3L, shortMonths[2]);
            hashMap4.put(4L, shortMonths[3]);
            hashMap4.put(5L, shortMonths[4]);
            hashMap4.put(6L, shortMonths[5]);
            hashMap4.put(7L, shortMonths[6]);
            hashMap4.put(8L, shortMonths[7]);
            hashMap4.put(9L, shortMonths[8]);
            hashMap4.put(10L, shortMonths[9]);
            hashMap4.put(11L, shortMonths[10]);
            hashMap4.put(12L, shortMonths[11]);
            hashMap.put(EnumC8259k.SHORT, hashMap4);
            return m16015g(hashMap);
        } else if (interfaceC8304h == EnumC8288a.DAY_OF_WEEK) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap5 = new HashMap();
            String[] weekdays = dateFormatSymbols2.getWeekdays();
            HashMap hashMap6 = new HashMap();
            hashMap6.put(1L, weekdays[2]);
            hashMap6.put(2L, weekdays[3]);
            hashMap6.put(3L, weekdays[4]);
            hashMap6.put(4L, weekdays[5]);
            hashMap6.put(5L, weekdays[6]);
            hashMap6.put(6L, weekdays[7]);
            hashMap6.put(7L, weekdays[1]);
            hashMap5.put(EnumC8259k.FULL, hashMap6);
            HashMap hashMap7 = new HashMap();
            hashMap7.put(1L, m16012j(1, weekdays[2], locale));
            hashMap7.put(2L, m16012j(2, weekdays[3], locale));
            hashMap7.put(3L, m16012j(3, weekdays[4], locale));
            hashMap7.put(4L, m16012j(4, weekdays[5], locale));
            hashMap7.put(5L, m16012j(5, weekdays[6], locale));
            hashMap7.put(6L, m16012j(6, weekdays[7], locale));
            hashMap7.put(7L, m16012j(7, weekdays[1], locale));
            hashMap5.put(EnumC8259k.NARROW, hashMap7);
            String[] shortWeekdays = dateFormatSymbols2.getShortWeekdays();
            HashMap hashMap8 = new HashMap();
            hashMap8.put(1L, shortWeekdays[2]);
            hashMap8.put(2L, shortWeekdays[3]);
            hashMap8.put(3L, shortWeekdays[4]);
            hashMap8.put(4L, shortWeekdays[5]);
            hashMap8.put(5L, shortWeekdays[6]);
            hashMap8.put(6L, shortWeekdays[7]);
            hashMap8.put(7L, shortWeekdays[1]);
            hashMap5.put(EnumC8259k.SHORT, hashMap8);
            return m16015g(hashMap5);
        } else if (interfaceC8304h == EnumC8288a.AMPM_OF_DAY) {
            DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap9 = new HashMap();
            String[] amPmStrings = dateFormatSymbols3.getAmPmStrings();
            HashMap hashMap10 = new HashMap();
            hashMap10.put(0L, amPmStrings[0]);
            hashMap10.put(1L, amPmStrings[1]);
            hashMap9.put(EnumC8259k.FULL, hashMap10);
            hashMap9.put(EnumC8259k.SHORT, hashMap10);
            return m16015g(hashMap9);
        } else if (interfaceC8304h == EnumC8288a.ERA) {
            DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap11 = new HashMap();
            String[] eras = dateFormatSymbols4.getEras();
            HashMap hashMap12 = new HashMap();
            hashMap12.put(0L, eras[0]);
            hashMap12.put(1L, eras[1]);
            hashMap11.put(EnumC8259k.SHORT, hashMap12);
            if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
                HashMap hashMap13 = new HashMap();
                hashMap13.put(0L, "Before Christ");
                hashMap13.put(1L, "Anno Domini");
                hashMap11.put(EnumC8259k.FULL, hashMap13);
            } else {
                hashMap11.put(EnumC8259k.FULL, hashMap12);
            }
            HashMap hashMap14 = new HashMap();
            hashMap14.put(0L, eras[0].substring(0, 1));
            hashMap14.put(1L, eras[1].substring(0, 1));
            hashMap11.put(EnumC8259k.NARROW, hashMap14);
            return m16015g(hashMap11);
        } else if (interfaceC8304h == C8290c.f21499a) {
            HashMap hashMap15 = new HashMap();
            HashMap hashMap16 = new HashMap();
            hashMap16.put(1L, "Q1");
            hashMap16.put(2L, "Q2");
            hashMap16.put(3L, "Q3");
            hashMap16.put(4L, "Q4");
            hashMap15.put(EnumC8259k.SHORT, hashMap16);
            HashMap hashMap17 = new HashMap();
            hashMap17.put(1L, "1st quarter");
            hashMap17.put(2L, "2nd quarter");
            hashMap17.put(3L, "3rd quarter");
            hashMap17.put(4L, "4th quarter");
            hashMap15.put(EnumC8259k.FULL, hashMap17);
            return m16015g(hashMap15);
        } else {
            return BuildConfig.VERSION_NAME;
        }
    }

    /* renamed from: i */
    private Object m16013i(InterfaceC8304h interfaceC8304h, Locale locale) {
        Map.Entry<InterfaceC8304h, Locale> m16016f = m16016f(interfaceC8304h, locale);
        Object obj = this.f21463b.get(m16016f);
        if (obj == null) {
            this.f21463b.putIfAbsent(m16016f, m16014h(interfaceC8304h, locale));
            return this.f21463b.get(m16016f);
        }
        return obj;
    }

    /* renamed from: j */
    private String m16012j(int i, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "日";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i) {
                case 1:
                    return "ن";
                case 2:
                    return "ث";
                case 3:
                    return "ر";
                case 4:
                    return "خ";
                case 5:
                    return "ج";
                case 6:
                    return "س";
                case 7:
                    return "ح";
            }
        }
        return str.substring(0, 1);
    }

    /* renamed from: k */
    private String m16011k(int i, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "七";
                case 8:
                    return "八";
                case 9:
                    return "九";
                case 10:
                    return "十";
                case 11:
                    return "十一";
                case 12:
                    return "十二";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i) {
                case 1:
                    return "ي";
                case 2:
                    return "ف";
                case 3:
                    return "م";
                case 4:
                    return "أ";
                case 5:
                    return "و";
                case 6:
                    return "ن";
                case 7:
                    return "ل";
                case 8:
                    return "غ";
                case 9:
                    return "س";
                case 10:
                    return "ك";
                case 11:
                    return "ب";
                case 12:
                    return "د";
            }
        }
        if (locale.getLanguage().equals("ja") && locale.getCountry().equals("JP")) {
            return Integer.toString(i);
        }
        return str.substring(0, 1);
    }

    @Override // org.threeten.p283bp.format.AbstractC8251f
    /* renamed from: c */
    public String mo16019c(InterfaceC8304h interfaceC8304h, long j, EnumC8259k enumC8259k, Locale locale) {
        Object m16013i = m16013i(interfaceC8304h, locale);
        if (m16013i instanceof C8258b) {
            return ((C8258b) m16013i).m16009a(j, enumC8259k);
        }
        return null;
    }
}
