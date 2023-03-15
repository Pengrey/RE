package androidx.core.p020os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: androidx.core.os.e */
/* loaded from: classes.dex */
public final class C1015e {

    /* renamed from: a */
    private final InterfaceC1018g f3316a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocaleListCompat.java */
    /* renamed from: androidx.core.os.e$a */
    /* loaded from: classes.dex */
    public static class C1016a {
        /* renamed from: a */
        static LocaleList m38745a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        /* renamed from: b */
        static LocaleList m38744b() {
            return LocaleList.getAdjustedDefault();
        }

        /* renamed from: c */
        static LocaleList m38743c() {
            return LocaleList.getDefault();
        }
    }

    static {
        m38749a(new Locale[0]);
    }

    private C1015e(InterfaceC1018g interfaceC1018g) {
        this.f3316a = interfaceC1018g;
    }

    /* renamed from: a */
    public static C1015e m38749a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m38746d(C1016a.m38745a(localeArr));
        }
        return new C1015e(new C1017f(localeArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Locale m38748b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (str.contains("_")) {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        } else {
            return new Locale(str);
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    /* renamed from: d */
    public static C1015e m38746d(LocaleList localeList) {
        return new C1015e(new C1019h(localeList));
    }

    /* renamed from: c */
    public Locale m38747c(int i) {
        return this.f3316a.get(i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1015e) && this.f3316a.equals(((C1015e) obj).f3316a);
    }

    public int hashCode() {
        return this.f3316a.hashCode();
    }

    public String toString() {
        return this.f3316a.toString();
    }
}
