package p489zc;

import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6108l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p181jd.Intrinsics;
import p297pd.C8611f;
import sd.Appendable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zc.o */
/* loaded from: classes2.dex */
public class _Arrays extends _ArraysJvm {
    /* renamed from: A */
    public static List m293A(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "<this>");
        return (List) m292B(objArr, new ArrayList());
    }

    /* renamed from: B */
    public static final Collection m292B(Object[] objArr, Collection collection) {
        Intrinsics.isThisObjectNull(objArr, "<this>");
        Intrinsics.isThisObjectNull(collection, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    /* renamed from: C */
    public static Object m291C(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "<this>");
        if (!(objArr.length == 0)) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: D */
    public static int m290D(int[] iArr) {
        Intrinsics.isThisObjectNull(iArr, "<this>");
        return iArr.length - 1;
    }

    /* renamed from: E */
    public static int m289E(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "<this>");
        return objArr.length - 1;
    }

    /* renamed from: F */
    public static int m288F(Object[] objArr, Object obj) {
        Intrinsics.isThisObjectNull(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (Intrinsics.equals(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: G */
    public static final Appendable m287G(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(objArr, "<this>");
        Intrinsics.isThisObjectNull(appendable, "buffer");
        Intrinsics.isThisObjectNull(charSequence, "separator");
        Intrinsics.isThisObjectNull(charSequence2, "prefix");
        Intrinsics.isThisObjectNull(charSequence3, "postfix");
        Intrinsics.isThisObjectNull(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            Appendable.m8964a(appendable, obj, interfaceC6108l);
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    /* renamed from: H */
    public static final String m286H(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(objArr, "<this>");
        Intrinsics.isThisObjectNull(charSequence, "separator");
        Intrinsics.isThisObjectNull(charSequence2, "prefix");
        Intrinsics.isThisObjectNull(charSequence3, "postfix");
        Intrinsics.isThisObjectNull(charSequence4, "truncated");
        String sb2 = ((StringBuilder) m287G(objArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, interfaceC6108l)).toString();
        Intrinsics.checkIfNull(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: I */
    public static /* synthetic */ String m285I(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6108l interfaceC6108l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        int i3 = i2 & 2;
        CharSequence charSequence5 = BuildConfig.VERSION_NAME;
        CharSequence charSequence6 = i3 != 0 ? BuildConfig.VERSION_NAME : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i4 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            interfaceC6108l = null;
        }
        return m286H(objArr, charSequence, charSequence6, charSequence5, i4, charSequence7, interfaceC6108l);
    }

    /* renamed from: J */
    public static int m284J(Object[] objArr, Object obj) {
        Intrinsics.isThisObjectNull(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (Intrinsics.equals(obj, objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    /* renamed from: K */
    public static char m283K(char[] cArr) {
        Intrinsics.isThisObjectNull(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: L */
    public static Object m282L(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    /* renamed from: M */
    public static List m281M(float[] fArr, C8611f c8611f) {
        List m197g;
        Intrinsics.isThisObjectNull(fArr, "<this>");
        Intrinsics.isThisObjectNull(c8611f, "indices");
        if (c8611f.isEmpty()) {
            m197g = C13780s.m197g();
            return m197g;
        }
        return _ArraysJvm.m321c(_ArraysJvm.m309o(fArr, c8611f.m15026u().intValue(), c8611f.m15027t().intValue() + 1));
    }

    /* renamed from: N */
    public static List m280N(char[] cArr) {
        List m320d;
        Intrinsics.isThisObjectNull(cArr, "<this>");
        Character[] m299y = _ArraysJvm.m299y(cArr);
        Intrinsics.m20929f(m299y, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        _ArraysJvm.m302v(m299y);
        m320d = _ArraysJvm.m320d(m299y);
        return m320d;
    }

    /* renamed from: O */
    public static final Object[] m279O(Object[] objArr, Comparator comparator) {
        Intrinsics.isThisObjectNull(objArr, "<this>");
        Intrinsics.isThisObjectNull(comparator, "comparator");
        if (objArr.length == 0) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkIfNull(copyOf, "copyOf(this, size)");
        _ArraysJvm.m301w(copyOf, comparator);
        return copyOf;
    }

    /* renamed from: P */
    public static List m278P(Object[] objArr, Comparator comparator) {
        List m320d;
        Intrinsics.isThisObjectNull(objArr, "<this>");
        Intrinsics.isThisObjectNull(comparator, "comparator");
        m320d = _ArraysJvm.m320d(m279O(objArr, comparator));
        return m320d;
    }

    /* renamed from: Q */
    public static final Collection m277Q(Object[] objArr, Collection collection) {
        Intrinsics.isThisObjectNull(objArr, "<this>");
        Intrinsics.isThisObjectNull(collection, "destination");
        for (Object obj : objArr) {
            collection.add(obj);
        }
        return collection;
    }

    /* renamed from: R */
    public static List m276R(Object[] objArr) {
        List m197g;
        List m202b;
        List m274T;
        Intrinsics.isThisObjectNull(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            m197g = C13780s.m197g();
            return m197g;
        } else if (length != 1) {
            m274T = m274T(objArr);
            return m274T;
        } else {
            m202b = CollectionsJVM.m202b(objArr[0]);
            return m202b;
        }
    }

    /* renamed from: S */
    public static List m275S(int[] iArr) {
        Intrinsics.isThisObjectNull(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    /* renamed from: T */
    public static List m274T(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "<this>");
        return new ArrayList(C13780s.m200d(objArr));
    }

    /* renamed from: U */
    public static Set m273U(Object[] objArr) {
        Set m208b;
        int m339b;
        Intrinsics.isThisObjectNull(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            m208b = C13778q0.m208b();
            return m208b;
        } else if (length != 1) {
            m339b = MapsJVM.m339b(objArr.length);
            return (Set) m277Q(objArr, new LinkedHashSet(m339b));
        } else {
            return C13776p0.m266a(objArr[0]);
        }
    }

    /* renamed from: z */
    public static boolean m272z(Object[] objArr, Object obj) {
        int m288F;
        Intrinsics.isThisObjectNull(objArr, "<this>");
        m288F = m288F(objArr, obj);
        return m288F >= 0;
    }
}
