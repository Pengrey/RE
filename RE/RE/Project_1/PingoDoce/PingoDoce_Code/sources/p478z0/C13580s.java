package p478z0;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p393v0.AbstractC11057s;
import p393v0.C11012e1;
import p393v0.C11018f1;
import p393v0.C11059s0;

/* renamed from: z0.s */
/* loaded from: classes.dex */
public final class C13580s extends AbstractC13566p {

    /* renamed from: a */
    private final String f34560a;

    /* renamed from: b */
    private final List f34561b;

    /* renamed from: c */
    private final int f34562c;

    /* renamed from: d */
    private final AbstractC11057s f34563d;

    /* renamed from: e */
    private final float f34564e;

    /* renamed from: f */
    private final AbstractC11057s f34565f;

    /* renamed from: g */
    private final float f34566g;

    /* renamed from: h */
    private final float f34567h;

    /* renamed from: i */
    private final int f34568i;

    /* renamed from: j */
    private final int f34569j;

    /* renamed from: k */
    private final float f34570k;

    /* renamed from: l */
    private final float f34571l;

    /* renamed from: m */
    private final float f34572m;

    /* renamed from: n */
    private final float f34573n;

    private C13580s(String str, List list, int i, AbstractC11057s abstractC11057s, float f, AbstractC11057s abstractC11057s2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        super(null);
        this.f34560a = str;
        this.f34561b = list;
        this.f34562c = i;
        this.f34563d = abstractC11057s;
        this.f34564e = f;
        this.f34565f = abstractC11057s2;
        this.f34566g = f2;
        this.f34567h = f3;
        this.f34568i = i2;
        this.f34569j = i3;
        this.f34570k = f4;
        this.f34571l = f5;
        this.f34572m = f6;
        this.f34573n = f7;
    }

    public /* synthetic */ C13580s(String str, List list, int i, AbstractC11057s abstractC11057s, float f, AbstractC11057s abstractC11057s2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i, abstractC11057s, f, abstractC11057s2, f2, f3, i2, i3, f4, f5, f6, f7);
    }

    /* renamed from: B */
    public final float m944B() {
        return this.f34573n;
    }

    /* renamed from: C */
    public final float m943C() {
        return this.f34571l;
    }

    /* renamed from: b */
    public final AbstractC11057s m942b() {
        return this.f34563d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.equals(C6450z.m20906b(C13580s.class), C6450z.m20906b(obj.getClass()))) {
            return false;
        }
        C13580s c13580s = (C13580s) obj;
        if (Intrinsics.equals(this.f34560a, c13580s.f34560a) && Intrinsics.equals(this.f34563d, c13580s.f34563d)) {
            if ((this.f34564e == c13580s.f34564e) && Intrinsics.equals(this.f34565f, c13580s.f34565f)) {
                if (this.f34566g == c13580s.f34566g) {
                    if ((this.f34567h == c13580s.f34567h) && C11012e1.m6541g(m935t(), c13580s.m935t()) && C11018f1.m6518g(m934u(), c13580s.m934u())) {
                        if (this.f34570k == c13580s.f34570k) {
                            if (this.f34571l == c13580s.f34571l) {
                                if (this.f34572m == c13580s.f34572m) {
                                    return ((this.f34573n > c13580s.f34573n ? 1 : (this.f34573n == c13580s.f34573n ? 0 : -1)) == 0) && C11059s0.m6287f(m938o(), c13580s.m938o()) && Intrinsics.equals(this.f34561b, c13580s.f34561b);
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final float m941f() {
        return this.f34564e;
    }

    /* renamed from: h */
    public final String m940h() {
        return this.f34560a;
    }

    public int hashCode() {
        int hashCode = ((this.f34560a.hashCode() * 31) + this.f34561b.hashCode()) * 31;
        AbstractC11057s abstractC11057s = this.f34563d;
        int hashCode2 = (((hashCode + (abstractC11057s == null ? 0 : abstractC11057s.hashCode())) * 31) + Float.hashCode(this.f34564e)) * 31;
        AbstractC11057s abstractC11057s2 = this.f34565f;
        return ((((((((((((((((((hashCode2 + (abstractC11057s2 != null ? abstractC11057s2.hashCode() : 0)) * 31) + Float.hashCode(this.f34566g)) * 31) + Float.hashCode(this.f34567h)) * 31) + C11012e1.m6540h(m935t())) * 31) + C11018f1.m6517h(m934u())) * 31) + Float.hashCode(this.f34570k)) * 31) + Float.hashCode(this.f34571l)) * 31) + Float.hashCode(this.f34572m)) * 31) + Float.hashCode(this.f34573n)) * 31) + C11059s0.m6286g(m938o());
    }

    /* renamed from: l */
    public final List m939l() {
        return this.f34561b;
    }

    /* renamed from: o */
    public final int m938o() {
        return this.f34562c;
    }

    /* renamed from: p */
    public final AbstractC11057s m937p() {
        return this.f34565f;
    }

    /* renamed from: q */
    public final float m936q() {
        return this.f34566g;
    }

    /* renamed from: t */
    public final int m935t() {
        return this.f34568i;
    }

    /* renamed from: u */
    public final int m934u() {
        return this.f34569j;
    }

    /* renamed from: v */
    public final float m933v() {
        return this.f34570k;
    }

    /* renamed from: x */
    public final float m932x() {
        return this.f34567h;
    }

    /* renamed from: y */
    public final float m931y() {
        return this.f34572m;
    }
}
