package ad;

import java.util.Comparator;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ad.e */
/* loaded from: classes2.dex */
public final class Comparisons implements Comparator {

    /* renamed from: w */
    public static final Comparisons f297w = new Comparisons();

    private Comparisons() {
    }

    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        Intrinsics.isThisObjectNull(comparable, "a");
        Intrinsics.isThisObjectNull(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    public final Comparator reversed() {
        return C0130f.f298w;
    }
}
