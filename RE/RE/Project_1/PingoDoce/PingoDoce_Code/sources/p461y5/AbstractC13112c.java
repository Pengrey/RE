package p461y5;

import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: y5.c */
/* loaded from: classes.dex */
public abstract class AbstractC13112c<T> {
    /* renamed from: d */
    public static <T> AbstractC13112c<T> m1580d(T t) {
        return new C13110a(null, t, EnumC13113d.VERY_LOW);
    }

    /* renamed from: e */
    public static <T> AbstractC13112c<T> m1579e(T t) {
        return new C13110a(null, t, EnumC13113d.HIGHEST);
    }

    /* renamed from: a */
    public abstract Integer mo1583a();

    /* renamed from: b */
    public abstract T mo1582b();

    /* renamed from: c */
    public abstract EnumC13113d mo1581c();
}
