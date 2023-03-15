package p181jd;

import kotlin.jvm.internal.AbstractC6765a;
import p314qd.InterfaceC9716a;
import p314qd.InterfaceC9719d;

/* renamed from: jd.h */
/* loaded from: classes2.dex */
public class C6434h extends AbstractC6765a implements InterfaceC6433g, InterfaceC9719d {

    /* renamed from: D */
    private final int f17525D;

    /* renamed from: E */
    private final int f17526E;

    public C6434h(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f17525D = i;
        this.f17526E = i2 >> 1;
    }

    /* renamed from: c */
    protected InterfaceC9716a mo20182c() {
        return C6450z.m20907a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6434h) {
            C6434h c6434h = (C6434h) obj;
            return m20180e().equals(c6434h.m20180e()) && m20177h().equals(c6434h.m20177h()) && this.f17526E == c6434h.f17526E && this.f17525D == c6434h.f17525D && Intrinsics.equals(m20181d(), c6434h.m20181d()) && Intrinsics.equals(m20179f(), c6434h.m20179f());
        } else if (obj instanceof InterfaceC9719d) {
            return obj.equals(m20183b());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.f17525D;
    }

    public int hashCode() {
        return (((m20179f() == null ? 0 : m20179f().hashCode() * 31) + m20180e().hashCode()) * 31) + m20177h().hashCode();
    }

    public String toString() {
        InterfaceC9716a m20183b = m20183b();
        if (m20183b != this) {
            return m20183b.toString();
        }
        if ("<init>".equals(m20180e())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + m20180e() + " (Kotlin reflection is not available)";
    }
}
