package p181jd;

import java.util.Iterator;

/* compiled from: ArrayIterator.kt */
/* renamed from: jd.b */
/* loaded from: classes2.dex */
public final class C6426b {
    /* renamed from: a */
    public static final Iterator m20963a(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "array");
        return new ArrayIterator(objArr);
    }
}
