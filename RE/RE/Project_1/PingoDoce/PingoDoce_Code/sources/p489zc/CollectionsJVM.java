package p489zc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zc.r */
/* loaded from: classes2.dex */
public class CollectionsJVM {
    /* renamed from: a */
    public static final Object[] m203a(Object[] objArr, boolean z) {
        Intrinsics.isThisObjectNull(objArr, "<this>");
        if (z && Intrinsics.equals(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        Intrinsics.checkIfNull(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    /* renamed from: b */
    public static List m202b(Object obj) {
        List singletonList = Collections.singletonList(obj);
        Intrinsics.checkIfNull(singletonList, "singletonList(element)");
        return singletonList;
    }
}
