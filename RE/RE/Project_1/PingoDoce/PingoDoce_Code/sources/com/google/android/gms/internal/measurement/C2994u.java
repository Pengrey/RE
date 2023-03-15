package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.u */
/* loaded from: classes.dex */
public final class C2994u implements Iterable, InterfaceC2931q {

    /* renamed from: w */
    private final String f8017w;

    public C2994u(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f8017w = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: b */
    public final InterfaceC2931q mo31993b() {
        return new C2994u(this.f8017w);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: c */
    public final Double mo31992c() {
        if (this.f8017w.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.f8017w);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2994u) {
            return this.f8017w.equals(((C2994u) obj).f8017w);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: f */
    public final Boolean mo31991f() {
        return Boolean.valueOf(!this.f8017w.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: g */
    public final String mo31990g() {
        return this.f8017w;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: h */
    public final Iterator mo31989h() {
        return new C2963s(this);
    }

    public final int hashCode() {
        return this.f8017w.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2979t(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: p */
    public final InterfaceC2931q mo31988p(String str, C2952r4 c2952r4, List list) {
        String str2;
        Object obj;
        String str3;
        String str4;
        char c;
        C2994u c2994u;
        int i;
        InterfaceC2931q c2803i;
        double doubleValue;
        String str5;
        Matcher matcher;
        double min;
        double min2;
        C2994u c2994u2;
        int i2;
        int i3;
        C2952r4 c2952r42;
        int i4;
        int length;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
        } else {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str) && !"trim".equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                obj = "charAt";
                str3 = "hasOwnProperty";
                if (str.equals(str3)) {
                    str4 = "toString";
                    c = 2;
                    break;
                }
                c = 65535;
                str4 = "toString";
                break;
            case -1776922004:
                obj = "charAt";
                if (str.equals("toString")) {
                    c = 14;
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -1464939364:
                obj = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    c = '\f';
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -1361633751:
                obj = "charAt";
                if (str.equals(obj)) {
                    str3 = "hasOwnProperty";
                    c = 0;
                    str4 = "toString";
                    break;
                }
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -1354795244:
                if (str.equals("concat")) {
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    c = 1;
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    c = '\r';
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -906336856:
                if (str.equals("search")) {
                    c = 7;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -726908483:
                if (str.equals(str2)) {
                    c = 11;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = 4;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -399551817:
                if (str.equals("toUpperCase")) {
                    c = 15;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 3568674:
                if (str.equals("trim")) {
                    c = 16;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 103668165:
                if (str.equals("match")) {
                    c = 5;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 109526418:
                if (str.equals("slice")) {
                    c = '\b';
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 109648666:
                if (str.equals("split")) {
                    c = '\t';
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 530542161:
                if (str.equals("substring")) {
                    c = '\n';
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 1094496948:
                if (str.equals("replace")) {
                    c = 6;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 1943291465:
                if (str.equals("indexOf")) {
                    c = 3;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            default:
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
                break;
        }
        String str6 = BuildConfig.VERSION_NAME;
        String str7 = obj;
        switch (c) {
            case 0:
                C2969s5.m32118j(str7, 1, list);
                int m32127a = list.size() > 0 ? (int) C2969s5.m32127a(c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31992c().doubleValue()) : 0;
                String str8 = this.f8017w;
                if (m32127a >= 0 && m32127a < str8.length()) {
                    return new C2994u(String.valueOf(str8.charAt(m32127a)));
                }
                return InterfaceC2931q.f7937m;
            case 1:
                c2994u = this;
                if (list.size() != 0) {
                    StringBuilder sb2 = new StringBuilder(c2994u.f8017w);
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        sb2.append(c2952r4.m32162b((InterfaceC2931q) list.get(i5)).mo31990g());
                    }
                    return new C2994u(sb2.toString());
                }
                return c2994u;
            case 2:
                C2969s5.m32120h(str3, 1, list);
                String str9 = this.f8017w;
                InterfaceC2931q m32162b = c2952r4.m32162b((InterfaceC2931q) list.get(0));
                if ("length".equals(m32162b.mo31990g())) {
                    return InterfaceC2931q.f7935k;
                }
                double doubleValue2 = m32162b.mo31992c().doubleValue();
                return (doubleValue2 != Math.floor(doubleValue2) || (i = (int) doubleValue2) < 0 || i >= str9.length()) ? InterfaceC2931q.f7936l : InterfaceC2931q.f7935k;
            case 3:
                C2969s5.m32118j("indexOf", 2, list);
                c2803i = new C2803i(Double.valueOf(this.f8017w.indexOf(list.size() > 0 ? c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31990g() : "undefined", (int) C2969s5.m32127a(list.size() < 2 ? 0.0d : c2952r4.m32162b((InterfaceC2931q) list.get(1)).mo31992c().doubleValue()))));
                return c2803i;
            case 4:
                C2969s5.m32118j("lastIndexOf", 2, list);
                String str10 = this.f8017w;
                String mo31990g = list.size() > 0 ? c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31990g() : "undefined";
                return new C2803i(Double.valueOf(str10.lastIndexOf(mo31990g, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : c2952r4.m32162b((InterfaceC2931q) list.get(1)).mo31992c().doubleValue()) ? Double.POSITIVE_INFINITY : C2969s5.m32127a(doubleValue)))));
            case 5:
                C2969s5.m32118j("match", 1, list);
                String str11 = this.f8017w;
                if (list.size() > 0) {
                    str6 = c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31990g();
                }
                Matcher matcher2 = Pattern.compile(str6).matcher(str11);
                return matcher2.find() ? new C2755f(Arrays.asList(new C2994u(matcher2.group()))) : InterfaceC2931q.f7931g;
            case 6:
                c2994u = this;
                C2969s5.m32118j("replace", 2, list);
                InterfaceC2931q interfaceC2931q = InterfaceC2931q.f7930f;
                if (list.size() > 0) {
                    str5 = c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31990g();
                    if (list.size() > 1) {
                        interfaceC2931q = c2952r4.m32162b((InterfaceC2931q) list.get(1));
                    }
                }
                String str12 = str5;
                String str13 = c2994u.f8017w;
                int indexOf = str13.indexOf(str12);
                if (indexOf >= 0) {
                    if (interfaceC2931q instanceof AbstractC2819j) {
                        interfaceC2931q = ((AbstractC2819j) interfaceC2931q).mo32094a(c2952r4, Arrays.asList(new C2994u(str12), new C2803i(Double.valueOf(indexOf)), c2994u));
                    }
                    String substring = str13.substring(0, indexOf);
                    String mo31990g2 = interfaceC2931q.mo31990g();
                    String substring2 = str13.substring(indexOf + str12.length());
                    StringBuilder sb3 = new StringBuilder(String.valueOf(substring).length() + String.valueOf(mo31990g2).length() + String.valueOf(substring2).length());
                    sb3.append(substring);
                    sb3.append(mo31990g2);
                    sb3.append(substring2);
                    c2803i = new C2994u(sb3.toString());
                    return c2803i;
                }
                return c2994u;
            case 7:
                C2969s5.m32118j("search", 1, list);
                if (Pattern.compile(list.size() > 0 ? c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31990g() : "undefined").matcher(this.f8017w).find()) {
                    return new C2803i(Double.valueOf(matcher.start()));
                }
                return new C2803i(Double.valueOf(-1.0d));
            case '\b':
                C2969s5.m32118j("slice", 2, list);
                String str14 = this.f8017w;
                double m32127a2 = C2969s5.m32127a(list.size() > 0 ? c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31992c().doubleValue() : 0.0d);
                if (m32127a2 < 0.0d) {
                    min = Math.max(str14.length() + m32127a2, 0.0d);
                } else {
                    min = Math.min(m32127a2, str14.length());
                }
                int i6 = (int) min;
                double m32127a3 = C2969s5.m32127a(list.size() > 1 ? c2952r4.m32162b((InterfaceC2931q) list.get(1)).mo31992c().doubleValue() : str14.length());
                if (m32127a3 < 0.0d) {
                    min2 = Math.max(str14.length() + m32127a3, 0.0d);
                } else {
                    min2 = Math.min(m32127a3, str14.length());
                }
                c2994u2 = new C2994u(str14.substring(i6, Math.max(0, ((int) min2) - i6) + i6));
                return c2994u2;
            case '\t':
                C2969s5.m32118j("split", 2, list);
                String str15 = this.f8017w;
                if (str15.length() == 0) {
                    return new C2755f(Arrays.asList(this));
                }
                ArrayList arrayList = new ArrayList();
                if (list.size() == 0) {
                    arrayList.add(this);
                } else {
                    String mo31990g3 = c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31990g();
                    long m32124d = list.size() > 1 ? C2969s5.m32124d(c2952r4.m32162b((InterfaceC2931q) list.get(1)).mo31992c().doubleValue()) : 2147483647L;
                    if (m32124d == 0) {
                        return new C2755f();
                    }
                    String[] split = str15.split(Pattern.quote(mo31990g3), ((int) m32124d) + 1);
                    int length2 = split.length;
                    if (!mo31990g3.equals(BuildConfig.VERSION_NAME) || length2 <= 0) {
                        i2 = length2;
                        i3 = 0;
                    } else {
                        boolean equals = split[0].equals(BuildConfig.VERSION_NAME);
                        i2 = length2 - 1;
                        if (!split[i2].equals(BuildConfig.VERSION_NAME)) {
                            i2 = length2;
                        }
                        i3 = equals;
                    }
                    if (length2 > m32124d) {
                        i2--;
                    }
                    for (int i7 = i3; i7 < i2; i7++) {
                        arrayList.add(new C2994u(split[i7]));
                    }
                }
                return new C2755f(arrayList);
            case '\n':
                C2969s5.m32118j("substring", 2, list);
                String str16 = this.f8017w;
                if (list.size() > 0) {
                    c2952r42 = c2952r4;
                    i4 = (int) C2969s5.m32127a(c2952r42.m32162b((InterfaceC2931q) list.get(0)).mo31992c().doubleValue());
                } else {
                    c2952r42 = c2952r4;
                    i4 = 0;
                }
                if (list.size() > 1) {
                    length = (int) C2969s5.m32127a(c2952r42.m32162b((InterfaceC2931q) list.get(1)).mo31992c().doubleValue());
                } else {
                    length = str16.length();
                }
                int min3 = Math.min(Math.max(i4, 0), str16.length());
                int min4 = Math.min(Math.max(length, 0), str16.length());
                c2994u2 = new C2994u(str16.substring(Math.min(min3, min4), Math.max(min3, min4)));
                return c2994u2;
            case 11:
                C2969s5.m32120h(str2, 0, list);
                return new C2994u(this.f8017w.toUpperCase());
            case '\f':
                C2969s5.m32120h("toLocaleLowerCase", 0, list);
                return new C2994u(this.f8017w.toLowerCase());
            case '\r':
                C2969s5.m32120h("toLowerCase", 0, list);
                return new C2994u(this.f8017w.toLowerCase(Locale.ENGLISH));
            case 14:
                c2994u = this;
                C2969s5.m32120h(str4, 0, list);
                return c2994u;
            case 15:
                C2969s5.m32120h("toUpperCase", 0, list);
                return new C2994u(this.f8017w.toUpperCase(Locale.ENGLISH));
            case 16:
                C2969s5.m32120h("toUpperCase", 0, list);
                return new C2994u(this.f8017w.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public final String toString() {
        String str = this.f8017w;
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append('\"');
        sb2.append(str);
        sb2.append('\"');
        return sb2.toString();
    }
}
