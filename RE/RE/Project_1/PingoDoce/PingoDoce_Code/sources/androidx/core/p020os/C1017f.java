package androidx.core.p020os;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: androidx.core.os.f */
/* loaded from: classes.dex */
final class C1017f implements InterfaceC1018g {

    /* renamed from: b */
    private static final Locale[] f3317b = new Locale[0];

    /* renamed from: a */
    private final Locale[] f3318a;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        C1015e.m38748b("en-Latn");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1017f(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f3318a = f3317b;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    m38742b(sb2, locale2);
                    if (i < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException("list[" + i + "] is null");
            }
        }
        this.f3318a = (Locale[]) arrayList.toArray(new Locale[0]);
    }

    /* renamed from: b */
    static void m38742b(StringBuilder sb2, Locale locale) {
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb2.append('-');
        sb2.append(locale.getCountry());
    }

    @Override // androidx.core.p020os.InterfaceC1018g
    /* renamed from: a */
    public Object mo38741a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1017f)) {
            return false;
        }
        Locale[] localeArr = ((C1017f) obj).f3318a;
        if (this.f3318a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f3318a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    @Override // androidx.core.p020os.InterfaceC1018g
    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f3318a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        for (Locale locale : this.f3318a) {
            i = (i * 31) + locale.hashCode();
        }
        return i;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f3318a;
            if (i < localeArr.length) {
                sb2.append(localeArr[i]);
                if (i < this.f3318a.length - 1) {
                    sb2.append(',');
                }
                i++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
