package ad;

import java.util.Comparator;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ad.b */
/* loaded from: classes2.dex */
public class C0127b {
    /* renamed from: a */
    public static <T extends Comparable<?>> int m41795a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    /* renamed from: b */
    public static <T extends Comparable<? super T>> Comparator<T> m41794b() {
        Comparisons comparisons = Comparisons.f297w;
        Intrinsics.m20929f(comparisons, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return comparisons;
    }
}
