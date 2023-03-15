package p168j0;

import java.util.Arrays;
import p181jd.Intrinsics;
import p489zc.C13768k;
import p489zc._ArraysJvm;

/* renamed from: j0.x */
/* loaded from: classes.dex */
public final class C6224x {
    /* renamed from: a */
    public static final /* synthetic */ Object[] m21793a(Object[] objArr, int i, Object obj, Object obj2) {
        return m21787g(objArr, i, obj, obj2);
    }

    /* renamed from: b */
    public static final /* synthetic */ Object[] m21792b(Object[] objArr, int i) {
        return m21786h(objArr, i);
    }

    /* renamed from: c */
    public static final /* synthetic */ Object[] m21791c(Object[] objArr, int i) {
        return m21785i(objArr, i);
    }

    /* renamed from: d */
    public static final /* synthetic */ Object[] m21790d(Object[] objArr, int i, int i2, TrieNode trieNode) {
        return m21784j(objArr, i, i2, trieNode);
    }

    /* renamed from: e */
    public static final /* synthetic */ Object[] m21789e(Object[] objArr, int i, int i2, Object obj, Object obj2) {
        return m21783k(objArr, i, i2, obj, obj2);
    }

    /* renamed from: f */
    public static final int m21788f(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* renamed from: g */
    private static final Object[] m21787g(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        _ArraysJvm.m311m(objArr, objArr2, 0, 0, i, 6, null);
        C13768k.m353i(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    /* renamed from: h */
    private static final Object[] m21786h(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 2];
        _ArraysJvm.m311m(objArr, objArr2, 0, 0, i, 6, null);
        C13768k.m353i(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    /* renamed from: i */
    private static final Object[] m21785i(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        _ArraysJvm.m311m(objArr, objArr2, 0, 0, i, 6, null);
        C13768k.m353i(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    /* renamed from: j */
    private static final Object[] m21784j(Object[] objArr, int i, int i2, TrieNode trieNode) {
        int i3 = i2 - 2;
        Object[] objArr2 = new Object[(objArr.length - 2) + 1];
        _ArraysJvm.m311m(objArr, objArr2, 0, 0, i, 6, null);
        C13768k.m353i(objArr, objArr2, i, i + 2, i2);
        objArr2[i3] = trieNode;
        C13768k.m353i(objArr, objArr2, i3 + 1, i2, objArr.length);
        return objArr2;
    }

    /* renamed from: k */
    private static final Object[] m21783k(Object[] objArr, int i, int i2, Object obj, Object obj2) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
        C13768k.m353i(copyOf, copyOf, i + 2, i + 1, objArr.length);
        C13768k.m353i(copyOf, copyOf, i2 + 2, i2, i);
        copyOf[i2] = obj;
        copyOf[i2 + 1] = obj2;
        return copyOf;
    }
}
