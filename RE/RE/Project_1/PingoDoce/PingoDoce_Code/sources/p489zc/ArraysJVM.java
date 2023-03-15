package p489zc;

import java.lang.reflect.Array;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zc.l */
/* loaded from: classes2.dex */
public class ArraysJVM {
    /* renamed from: a */
    public static final Object[] m336a(Object[] objArr, int i) {
        Intrinsics.isThisObjectNull(objArr, "reference");
        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
        Intrinsics.m20929f(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }

    /* renamed from: b */
    public static final void m335b(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }
}
