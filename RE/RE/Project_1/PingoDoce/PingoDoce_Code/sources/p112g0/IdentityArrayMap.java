package p112g0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p092f0.C5157c;
import p181jd.Intrinsics;
import p489zc.C13768k;
import p489zc._ArraysJvm;

/* renamed from: g0.b */
/* loaded from: classes.dex */
public final class IdentityArrayMap<Key, Value> {

    /* renamed from: a */
    private Object[] f15781a;

    /* renamed from: b */
    private Object[] f15782b;

    /* renamed from: c */
    private int f15783c;

    public IdentityArrayMap(int i) {
        this.f15781a = new Object[i];
        this.f15782b = new Object[i];
    }

    /* renamed from: b */
    private final int m23690b(Object obj) {
        int m25522a = C5157c.m25522a(obj);
        int i = this.f15783c - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.f15781a[i3];
            int m25522a2 = C5157c.m25522a(obj2) - m25522a;
            if (m25522a2 < 0) {
                i2 = i3 + 1;
            } else if (m25522a2 <= 0) {
                return obj == obj2 ? i3 : m23689c(i3, obj, m25522a);
            } else {
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: c */
    private final int m23689c(int i, Object obj, int i2) {
        int i3 = i - 1;
        if (i3 >= 0) {
            while (true) {
                int i4 = i3 - 1;
                Object obj2 = this.f15781a[i3];
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
        int i6 = this.f15783c;
        while (i5 < i6) {
            int i7 = i5 + 1;
            Object obj3 = this.f15781a[i5];
            if (obj3 == obj) {
                return i5;
            }
            if (C5157c.m25522a(obj3) != i2) {
                return -i7;
            }
            i5 = i7;
        }
        return -(this.f15783c + 1);
    }

    /* renamed from: a */
    public final boolean m23691a(Object obj) {
        Intrinsics.isThisObjectNull(obj, "key");
        return m23690b(obj) >= 0;
    }

    /* renamed from: d */
    public final Object m23688d(Object obj) {
        Intrinsics.isThisObjectNull(obj, "key");
        int m23690b = m23690b(obj);
        if (m23690b >= 0) {
            return this.f15782b[m23690b];
        }
        return null;
    }

    /* renamed from: e */
    public final Object[] m23687e() {
        return this.f15781a;
    }

    /* renamed from: f */
    public final int m23686f() {
        return this.f15783c;
    }

    /* renamed from: g */
    public final Object[] m23685g() {
        return this.f15782b;
    }

    /* renamed from: h */
    public final boolean m23684h() {
        return this.f15783c > 0;
    }

    /* renamed from: i */
    public final boolean m23683i(Object obj) {
        Intrinsics.isThisObjectNull(obj, "key");
        int m23690b = m23690b(obj);
        if (m23690b >= 0) {
            int i = this.f15783c;
            Object[] objArr = this.f15781a;
            Object[] objArr2 = this.f15782b;
            int i2 = m23690b + 1;
            C13768k.m353i(objArr, objArr, m23690b, i2, i);
            C13768k.m353i(objArr2, objArr2, m23690b, i2, i);
            int i3 = i - 1;
            objArr[i3] = null;
            objArr2[i3] = null;
            this.f15783c = i3;
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m23682j(Object obj, Object obj2) {
        Object[] objArr;
        Intrinsics.isThisObjectNull(obj, "key");
        int m23690b = m23690b(obj);
        if (m23690b >= 0) {
            this.f15782b[m23690b] = obj2;
            return;
        }
        int i = -(m23690b + 1);
        int i2 = this.f15783c;
        Object[] objArr2 = this.f15781a;
        boolean z = i2 == objArr2.length;
        Object[] objArr3 = z ? new Object[i2 * 2] : objArr2;
        int i3 = i + 1;
        C13768k.m353i(objArr2, objArr3, i3, i, i2);
        if (z) {
            _ArraysJvm.m311m(this.f15781a, objArr3, 0, 0, i, 6, null);
        }
        objArr3[i] = obj;
        this.f15781a = objArr3;
        if (z) {
            objArr = new Object[this.f15783c * 2];
        } else {
            objArr = this.f15782b;
        }
        C13768k.m353i(this.f15782b, objArr, i3, i, this.f15783c);
        if (z) {
            _ArraysJvm.m311m(this.f15782b, objArr, 0, 0, i, 6, null);
        }
        objArr[i] = obj2;
        this.f15782b = objArr;
        this.f15783c++;
    }

    public /* synthetic */ IdentityArrayMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }
}
