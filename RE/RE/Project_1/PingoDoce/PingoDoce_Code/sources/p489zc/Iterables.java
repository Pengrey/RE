package p489zc;

import java.util.Collection;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zc.t */
/* loaded from: classes2.dex */
public class Iterables extends C13780s {
    /* renamed from: r */
    public static int m186r(Iterable iterable, int i) {
        Intrinsics.isThisObjectNull(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
