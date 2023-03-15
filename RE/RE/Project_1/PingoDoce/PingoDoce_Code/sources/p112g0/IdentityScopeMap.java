package p112g0;

import java.util.Arrays;
import p092f0.C5157c;
import p181jd.Intrinsics;
import p489zc._ArraysJvm;

/* renamed from: g0.d */
/* loaded from: classes.dex */
public final class IdentityScopeMap<T> {

    /* renamed from: a */
    private int[] f15788a;

    /* renamed from: b */
    private Object[] f15789b;

    /* renamed from: c */
    private IdentityArraySet[] f15790c;

    /* renamed from: d */
    private int f15791d;

    public IdentityScopeMap() {
        int[] iArr = new int[50];
        for (int i = 0; i < 50; i++) {
            iArr[i] = i;
        }
        this.f15788a = iArr;
        this.f15789b = new Object[50];
        this.f15790c = new IdentityArraySet[50];
    }

    /* renamed from: a */
    public static final /* synthetic */ int m23675a(IdentityScopeMap identityScopeMap, Object obj) {
        return identityScopeMap.m23670f(obj);
    }

    /* renamed from: b */
    public static final /* synthetic */ IdentityArraySet m23674b(IdentityScopeMap identityScopeMap, int i) {
        return identityScopeMap.m23662n(i);
    }

    /* renamed from: f */
    private final int m23670f(Object obj) {
        int m25522a = C5157c.m25522a(obj);
        int i = this.f15791d - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = m23664l()[m23665k()[i3]];
            Intrinsics.ifNullDoSomething(obj2);
            int m25522a2 = C5157c.m25522a(obj2) - m25522a;
            if (m25522a2 < 0) {
                i2 = i3 + 1;
            } else if (m25522a2 <= 0) {
                return obj == obj2 ? i3 : m23669g(i3, obj, m25522a);
            } else {
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: g */
    private final int m23669g(int i, Object obj, int i2) {
        int i3 = i - 1;
        if (i3 >= 0) {
            while (true) {
                int i4 = i3 - 1;
                Object obj2 = m23664l()[m23665k()[i3]];
                Intrinsics.ifNullDoSomething(obj2);
                if (obj2 != obj) {
                    if (C5157c.m25522a(obj2) != i2 || i4 < 0) {
                        break;
                    }
                    i3 = i4;
                } else {
                    return i3;
                }
            }
        }
        int i5 = i + 1;
        int i6 = this.f15791d;
        while (i5 < i6) {
            int i7 = i5 + 1;
            Object obj3 = m23664l()[m23665k()[i5]];
            Intrinsics.ifNullDoSomething(obj3);
            if (obj3 == obj) {
                return i5;
            }
            if (C5157c.m25522a(obj3) != i2) {
                return -i7;
            }
            i5 = i7;
        }
        return -(this.f15791d + 1);
    }

    /* renamed from: h */
    private final IdentityArraySet m23668h(Object obj) {
        int i;
        if (this.f15791d > 0) {
            i = m23670f(obj);
            if (i >= 0) {
                return m23662n(i);
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        int i3 = this.f15791d;
        int[] iArr = this.f15788a;
        if (i3 < iArr.length) {
            int i4 = iArr[i3];
            this.f15789b[i4] = obj;
            IdentityArraySet identityArraySet = this.f15790c[i4];
            if (identityArraySet == null) {
                identityArraySet = new IdentityArraySet();
                m23667i()[i4] = identityArraySet;
            }
            int i5 = this.f15791d;
            if (i2 < i5) {
                int[] iArr2 = this.f15788a;
                _ArraysJvm.m317g(iArr2, iArr2, i2 + 1, i2, i5);
            }
            this.f15788a[i2] = i4;
            this.f15791d++;
            return identityArraySet;
        }
        int length = iArr.length * 2;
        Object[] copyOf = Arrays.copyOf(this.f15790c, length);
        Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
        this.f15790c = (IdentityArraySet[]) copyOf;
        IdentityArraySet identityArraySet2 = new IdentityArraySet();
        this.f15790c[i3] = identityArraySet2;
        Object[] copyOf2 = Arrays.copyOf(this.f15789b, length);
        Intrinsics.checkIfNull(copyOf2, "copyOf(this, newSize)");
        this.f15789b = copyOf2;
        copyOf2[i3] = obj;
        int[] iArr3 = new int[length];
        for (int i6 = this.f15791d + 1; i6 < length; i6++) {
            iArr3[i6] = i6;
        }
        int i7 = this.f15791d;
        if (i2 < i7) {
            _ArraysJvm.m317g(this.f15788a, iArr3, i2 + 1, i2, i7);
        }
        iArr3[i2] = i3;
        if (i2 > 0) {
            _ArraysJvm.m312l(this.f15788a, iArr3, 0, 0, i2, 6, null);
        }
        this.f15788a = iArr3;
        this.f15791d++;
        return identityArraySet2;
    }

    /* renamed from: n */
    private final IdentityArraySet m23662n(int i) {
        IdentityArraySet identityArraySet = this.f15790c[this.f15788a[i]];
        Intrinsics.ifNullDoSomething(identityArraySet);
        return identityArraySet;
    }

    /* renamed from: c */
    public final boolean m23673c(Object obj, Object obj2) {
        Intrinsics.isThisObjectNull(obj, "value");
        Intrinsics.isThisObjectNull(obj2, "scope");
        return m23668h(obj).add(obj2);
    }

    /* renamed from: d */
    public final void m23672d() {
        int length = this.f15790c.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            IdentityArraySet identityArraySet = this.f15790c[i];
            if (identityArraySet != null) {
                identityArraySet.clear();
            }
            this.f15788a[i] = i;
            this.f15789b[i] = null;
            i = i2;
        }
        this.f15791d = 0;
    }

    /* renamed from: e */
    public final boolean m23671e(Object obj) {
        Intrinsics.isThisObjectNull(obj, "element");
        return m23670f(obj) >= 0;
    }

    /* renamed from: i */
    public final IdentityArraySet[] m23667i() {
        return this.f15790c;
    }

    /* renamed from: j */
    public final int m23666j() {
        return this.f15791d;
    }

    /* renamed from: k */
    public final int[] m23665k() {
        return this.f15788a;
    }

    /* renamed from: l */
    public final Object[] m23664l() {
        return this.f15789b;
    }

    /* renamed from: m */
    public final boolean m23663m(Object obj, Object obj2) {
        int i;
        IdentityArraySet identityArraySet;
        Intrinsics.isThisObjectNull(obj, "value");
        Intrinsics.isThisObjectNull(obj2, "scope");
        int m23670f = m23670f(obj);
        if (m23670f < 0 || (identityArraySet = this.f15790c[(i = this.f15788a[m23670f])]) == null) {
            return false;
        }
        boolean remove = identityArraySet.remove(obj2);
        if (identityArraySet.size() == 0) {
            int i2 = m23670f + 1;
            int i3 = this.f15791d;
            if (i2 < i3) {
                int[] iArr = this.f15788a;
                _ArraysJvm.m317g(iArr, iArr, m23670f, i2, i3);
            }
            int[] iArr2 = this.f15788a;
            int i4 = this.f15791d;
            iArr2[i4 - 1] = i;
            this.f15789b[i] = null;
            this.f15791d = i4 - 1;
        }
        return remove;
    }

    /* renamed from: o */
    public final void m23661o(int i) {
        this.f15791d = i;
    }
}
