package p489zc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zc.n */
/* loaded from: classes2.dex */
public class _ArraysJvm extends C13770m {

    /* compiled from: _ArraysJvm.kt */
    /* renamed from: zc.n$a */
    /* loaded from: classes2.dex */
    public static final class C13772a extends AbstractList implements RandomAccess {

        /* renamed from: x */
        final /* synthetic */ float[] f34890x;

        C13772a(float[] fArr) {
            this.f34890x = fArr;
        }

        /* renamed from: b */
        public int m298b() {
            return this.f34890x.length;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Float) {
                return m297f(((Number) obj).floatValue());
            }
            return false;
        }

        /* renamed from: f */
        public boolean m297f(float f) {
            for (float f2 : this.f34890x) {
                if (Float.floatToIntBits(f2) == Float.floatToIntBits(f)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: h */
        public Float get(int i) {
            return Float.valueOf(this.f34890x[i]);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Float) {
                return m295l(((Number) obj).floatValue());
            }
            return -1;
        }

        public boolean isEmpty() {
            return this.f34890x.length == 0;
        }

        /* renamed from: l */
        public int m295l(float f) {
            float[] fArr = this.f34890x;
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                if (Float.floatToIntBits(fArr[i]) == Float.floatToIntBits(f)) {
                    return i;
                }
            }
            return -1;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Float) {
                return m294o(((Number) obj).floatValue());
            }
            return -1;
        }

        /* renamed from: o */
        public int m294o(float f) {
            float[] fArr = this.f34890x;
            int length = fArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f)) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        }
    }

    /* renamed from: c */
    public static final List m321c(float[] fArr) {
        Intrinsics.isThisObjectNull(fArr, "<this>");
        return new C13772a(fArr);
    }

    /* renamed from: d */
    public static List m320d(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "<this>");
        List m267a = C13775p.m267a(objArr);
        Intrinsics.checkIfNull(m267a, "asList(this)");
        return m267a;
    }

    /* renamed from: e */
    public static byte[] m319e(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        Intrinsics.isThisObjectNull(bArr, "<this>");
        Intrinsics.isThisObjectNull(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    /* renamed from: f */
    public static float[] m318f(float[] fArr, float[] fArr2, int i, int i2, int i3) {
        Intrinsics.isThisObjectNull(fArr, "<this>");
        Intrinsics.isThisObjectNull(fArr2, "destination");
        System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
        return fArr2;
    }

    /* renamed from: g */
    public static int[] m317g(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        Intrinsics.isThisObjectNull(iArr, "<this>");
        Intrinsics.isThisObjectNull(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
        return iArr2;
    }

    /* renamed from: h */
    public static long[] m316h(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        Intrinsics.isThisObjectNull(jArr, "<this>");
        Intrinsics.isThisObjectNull(jArr2, "destination");
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
        return jArr2;
    }

    /* renamed from: i */
    public static Object[] m315i(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        Intrinsics.isThisObjectNull(objArr, "<this>");
        Intrinsics.isThisObjectNull(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
        return objArr2;
    }

    /* renamed from: j */
    public static /* synthetic */ byte[] m314j(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        byte[] m319e;
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        m319e = m319e(bArr, bArr2, i, i2, i3);
        return m319e;
    }

    /* renamed from: k */
    public static /* synthetic */ float[] m313k(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, Object obj) {
        float[] m318f;
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        m318f = m318f(fArr, fArr2, i, i2, i3);
        return m318f;
    }

    /* renamed from: l */
    public static /* synthetic */ int[] m312l(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        int[] m317g;
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        m317g = m317g(iArr, iArr2, i, i2, i3);
        return m317g;
    }

    /* renamed from: m */
    public static /* synthetic */ Object[] m311m(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return C13768k.m353i(objArr, objArr2, i, i2, i3);
    }

    /* renamed from: n */
    public static byte[] m310n(byte[] bArr, int i, int i2) {
        Intrinsics.isThisObjectNull(bArr, "<this>");
        ArraysJVM.m335b(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        Intrinsics.checkIfNull(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: o */
    public static final float[] m309o(float[] fArr, int i, int i2) {
        Intrinsics.isThisObjectNull(fArr, "<this>");
        ArraysJVM.m335b(i2, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i, i2);
        Intrinsics.checkIfNull(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: p */
    public static Object[] m308p(Object[] objArr, int i, int i2) {
        Intrinsics.isThisObjectNull(objArr, "<this>");
        ArraysJVM.m335b(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        Intrinsics.checkIfNull(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: q */
    public static final void m307q(int[] iArr, int i, int i2, int i3) {
        Intrinsics.isThisObjectNull(iArr, "<this>");
        Arrays.fill(iArr, i2, i3, i);
    }

    /* renamed from: r */
    public static void m306r(Object[] objArr, Object obj, int i, int i2) {
        Intrinsics.isThisObjectNull(objArr, "<this>");
        Arrays.fill(objArr, i, i2, obj);
    }

    /* renamed from: s */
    public static /* synthetic */ void m305s(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        m307q(iArr, i, i2, i3);
    }

    /* renamed from: t */
    public static /* synthetic */ void m304t(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        m306r(objArr, obj, i, i2);
    }

    /* renamed from: u */
    public static Object[] m303u(Object[] objArr, Object obj) {
        Intrinsics.isThisObjectNull(objArr, "<this>");
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + 1);
        copyOf[length] = obj;
        Intrinsics.checkIfNull(copyOf, "result");
        return copyOf;
    }

    /* renamed from: v */
    public static void m302v(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    /* renamed from: w */
    public static final void m301w(Object[] objArr, Comparator comparator) {
        Intrinsics.isThisObjectNull(objArr, "<this>");
        Intrinsics.isThisObjectNull(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    /* renamed from: x */
    public static void m300x(Object[] objArr, Comparator comparator, int i, int i2) {
        Intrinsics.isThisObjectNull(objArr, "<this>");
        Intrinsics.isThisObjectNull(comparator, "comparator");
        Arrays.sort(objArr, i, i2, comparator);
    }

    /* renamed from: y */
    public static final Character[] m299y(char[] cArr) {
        Intrinsics.isThisObjectNull(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            chArr[i] = Character.valueOf(cArr[i]);
        }
        return chArr;
    }
}
