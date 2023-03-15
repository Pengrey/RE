package p489zc;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zc.w */
/* loaded from: classes2.dex */
public class MutableCollectionsJVM extends C13782v {
    /* renamed from: s */
    public static void m185s(List list) {
        Intrinsics.isThisObjectNull(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* renamed from: t */
    public static void m184t(List list, Comparator comparator) {
        Intrinsics.isThisObjectNull(list, "<this>");
        Intrinsics.isThisObjectNull(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
