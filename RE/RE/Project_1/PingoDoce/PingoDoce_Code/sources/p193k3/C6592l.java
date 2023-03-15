package p193k3;

import p129h3.AbstractC5840n;
import p129h3.EnumC5826d;
import p181jd.Intrinsics;

/* renamed from: k3.l */
/* loaded from: classes.dex */
public final class C6592l extends AbstractC6579g {

    /* renamed from: a */
    private final AbstractC5840n f17837a;

    /* renamed from: b */
    private final String f17838b;

    /* renamed from: c */
    private final EnumC5826d f17839c;

    public C6592l(AbstractC5840n abstractC5840n, String str, EnumC5826d enumC5826d) {
        super(null);
        this.f17837a = abstractC5840n;
        this.f17838b = str;
        this.f17839c = enumC5826d;
    }

    /* renamed from: a */
    public final EnumC5826d m20523a() {
        return this.f17839c;
    }

    /* renamed from: b */
    public final AbstractC5840n m20522b() {
        return this.f17837a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6592l) {
            C6592l c6592l = (C6592l) obj;
            if (Intrinsics.equals(this.f17837a, c6592l.f17837a) && Intrinsics.equals(this.f17838b, c6592l.f17838b) && this.f17839c == c6592l.f17839c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f17837a.hashCode() * 31;
        String str = this.f17838b;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f17839c.hashCode();
    }
}
