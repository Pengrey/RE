package ad;

import java.util.Comparator;
import p181jd.Intrinsics;

/* compiled from: Comparisons.kt */
/* renamed from: ad.f */
/* loaded from: classes2.dex */
final class C0130f implements Comparator {

    /* renamed from: w */
    public static final C0130f f298w = new C0130f();

    private C0130f() {
    }

    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        Intrinsics.isThisObjectNull(comparable, "a");
        Intrinsics.isThisObjectNull(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    public final Comparator reversed() {
        return Comparisons.f297w;
    }
}
