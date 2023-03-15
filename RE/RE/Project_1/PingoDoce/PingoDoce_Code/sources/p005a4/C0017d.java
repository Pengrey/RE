package p005a4;

import java.util.List;
import p040c4.C2080n;

/* renamed from: a4.d */
/* loaded from: classes.dex */
public class C0017d {

    /* renamed from: a */
    private final List<C2080n> f70a;

    /* renamed from: b */
    private final char f71b;

    /* renamed from: c */
    private final double f72c;

    /* renamed from: d */
    private final String f73d;

    /* renamed from: e */
    private final String f74e;

    public C0017d(List<C2080n> list, char c, double d, double d2, String str, String str2) {
        this.f70a = list;
        this.f71b = c;
        this.f72c = d2;
        this.f73d = str;
        this.f74e = str2;
    }

    /* renamed from: c */
    public static int m42120c(char c, String str, String str2) {
        return ((((0 + c) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    /* renamed from: a */
    public List<C2080n> m42122a() {
        return this.f70a;
    }

    /* renamed from: b */
    public double m42121b() {
        return this.f72c;
    }

    public int hashCode() {
        return m42120c(this.f71b, this.f74e, this.f73d);
    }
}
