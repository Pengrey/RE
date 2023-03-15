package p112g0;

import p092f0.C5157c;
import p181jd.Intrinsics;
import p489zc.C13768k;
import p489zc._ArraysJvm;

/* renamed from: g0.a */
/* loaded from: classes.dex */
public final class IdentityArrayIntMap {

    /* renamed from: a */
    private int f15778a;

    /* renamed from: b */
    private Object[] f15779b = new Object[4];

    /* renamed from: c */
    private int[] f15780c = new int[4];

    /* renamed from: b */
    private final int m23697b(Object obj) {
        int i = this.f15778a - 1;
        int m25522a = C5157c.m25522a(obj);
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.f15779b[i3];
            int m25522a2 = C5157c.m25522a(obj2) - m25522a;
            if (m25522a2 < 0) {
                i2 = i3 + 1;
            } else if (m25522a2 <= 0) {
                return obj2 == obj ? i3 : m23696c(i3, obj, m25522a);
            } else {
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: c */
    private final int m23696c(int i, Object obj, int i2) {
        int i3 = i - 1;
        if (i3 >= 0) {
            while (true) {
                int i4 = i3 - 1;
                Object obj2 = this.f15779b[i3];
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
        int i6 = this.f15778a;
        while (i5 < i6) {
            int i7 = i5 + 1;
            Object obj3 = this.f15779b[i5];
            if (obj3 == obj) {
                return i5;
            }
            if (C5157c.m25522a(obj3) != i2) {
                return -i7;
            }
            i5 = i7;
        }
        return -(this.f15778a + 1);
    }

    /* renamed from: a */
    public final void m23698a(Object obj, int i) {
        int i2;
        Intrinsics.isThisObjectNull(obj, "key");
        if (this.f15778a > 0) {
            i2 = m23697b(obj);
            if (i2 >= 0) {
                this.f15780c[i2] = i;
                return;
            }
        } else {
            i2 = -1;
        }
        int i3 = -(i2 + 1);
        int i4 = this.f15778a;
        Object[] objArr = this.f15779b;
        if (i4 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr = new int[objArr.length * 2];
            int i5 = i3 + 1;
            C13768k.m353i(objArr, objArr2, i5, i3, i4);
            _ArraysJvm.m317g(this.f15780c, iArr, i5, i3, this.f15778a);
            _ArraysJvm.m311m(this.f15779b, objArr2, 0, 0, i3, 6, null);
            _ArraysJvm.m312l(this.f15780c, iArr, 0, 0, i3, 6, null);
            this.f15779b = objArr2;
            this.f15780c = iArr;
        } else {
            int i6 = i3 + 1;
            C13768k.m353i(objArr, objArr, i6, i3, i4);
            int[] iArr2 = this.f15780c;
            _ArraysJvm.m317g(iArr2, iArr2, i6, i3, this.f15778a);
        }
        this.f15779b[i3] = obj;
        this.f15780c[i3] = i;
        this.f15778a++;
    }

    /* renamed from: d */
    public final Object[] m23695d() {
        return this.f15779b;
    }

    /* renamed from: e */
    public final int m23694e() {
        return this.f15778a;
    }

    /* renamed from: f */
    public final int[] m23693f() {
        return this.f15780c;
    }

    /* renamed from: g */
    public final void m23692g(int i) {
        this.f15778a = i;
    }
}
