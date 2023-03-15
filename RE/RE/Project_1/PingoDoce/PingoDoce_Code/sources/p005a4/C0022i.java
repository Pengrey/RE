package p005a4;

import androidx.core.util.C1072d;

/* renamed from: a4.i */
/* loaded from: classes.dex */
public class C0022i<T> {

    /* renamed from: a */
    T f84a;

    /* renamed from: b */
    T f85b;

    /* renamed from: a */
    private static boolean m42106a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public void m42105b(T t, T t2) {
        this.f84a = t;
        this.f85b = t2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1072d) {
            C1072d c1072d = (C1072d) obj;
            return m42106a(c1072d.f3406a, this.f84a) && m42106a(c1072d.f3407b, this.f85b);
        }
        return false;
    }

    public int hashCode() {
        T t = this.f84a;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f85b;
        return hashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f84a) + " " + String.valueOf(this.f85b) + "}";
    }
}
