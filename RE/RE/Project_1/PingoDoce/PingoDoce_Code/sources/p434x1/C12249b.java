package p434x1;

import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import p181jd.Intrinsics;
import p394v1.Locale;
import p394v1.LocaleList;
import p412w1.C11542g;
import p489zc.Iterables;

/* compiled from: LocaleExtensions.android.kt */
/* renamed from: x1.b */
/* loaded from: classes.dex */
public final class C12249b {

    /* renamed from: a */
    public static final C12249b f32295a = new C12249b();

    private C12249b() {
    }

    /* renamed from: a */
    public final Object m3218a(LocaleList localeList) {
        int m186r;
        Intrinsics.isThisObjectNull(localeList, "localeList");
        m186r = Iterables.m186r(localeList, 10);
        ArrayList arrayList = new ArrayList(m186r);
        Iterator<E> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(C12248a.m3219a((Locale) it.next()));
        }
        Object[] array = arrayList.toArray(new java.util.Locale[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        java.util.Locale[] localeArr = (java.util.Locale[]) array;
        return new LocaleSpan(new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    /* renamed from: b */
    public final void m3217b(C11542g c11542g, LocaleList localeList) {
        int m186r;
        Intrinsics.isThisObjectNull(c11542g, "textPaint");
        Intrinsics.isThisObjectNull(localeList, "localeList");
        m186r = Iterables.m186r(localeList, 10);
        ArrayList arrayList = new ArrayList(m186r);
        Iterator<E> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(C12248a.m3219a((Locale) it.next()));
        }
        Object[] array = arrayList.toArray(new java.util.Locale[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        java.util.Locale[] localeArr = (java.util.Locale[]) array;
        c11542g.setTextLocales(new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
