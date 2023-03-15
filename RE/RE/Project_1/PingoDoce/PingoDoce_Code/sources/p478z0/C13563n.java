package p478z0;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;
import p489zc.C13780s;

/* compiled from: ImageVector.kt */
/* renamed from: z0.n */
/* loaded from: classes.dex */
public final class C13563n extends AbstractC13566p implements Iterable, InterfaceC6650a {

    /* renamed from: A */
    private final float f34517A;

    /* renamed from: B */
    private final float f34518B;

    /* renamed from: C */
    private final float f34519C;

    /* renamed from: D */
    private final float f34520D;

    /* renamed from: E */
    private final List f34521E;

    /* renamed from: F */
    private final List f34522F;

    /* renamed from: w */
    private final String f34523w;

    /* renamed from: x */
    private final float f34524x;

    /* renamed from: y */
    private final float f34525y;

    /* renamed from: z */
    private final float f34526z;

    /* compiled from: ImageVector.kt */
    /* renamed from: z0.n$a */
    /* loaded from: classes.dex */
    public static final class C13564a implements Iterator, InterfaceC6650a {

        /* renamed from: w */
        private final Iterator f34527w;

        C13564a() {
            this.f34527w = C13563n.m992b(C13563n.this).iterator();
        }

        /* renamed from: a */
        public AbstractC13566p next() {
            return (AbstractC13566p) this.f34527w.next();
        }

        public boolean hasNext() {
            return this.f34527w.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C13563n() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }

    public /* synthetic */ C13563n(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) == 0 ? f5 : 1.0f, (i & 64) != 0 ? 0.0f : f6, (i & 128) == 0 ? f7 : 0.0f, (i & 256) != 0 ? C13565o.m977e() : list, (i & 512) != 0 ? C13780s.m197g() : list2);
    }

    /* renamed from: b */
    public static final /* synthetic */ List m992b(C13563n c13563n) {
        return c13563n.f34522F;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C13563n)) {
            return false;
        }
        C13563n c13563n = (C13563n) obj;
        if (Intrinsics.equals(this.f34523w, c13563n.f34523w)) {
            if (this.f34524x == c13563n.f34524x) {
                if (this.f34525y == c13563n.f34525y) {
                    if (this.f34526z == c13563n.f34526z) {
                        if (this.f34517A == c13563n.f34517A) {
                            if (this.f34518B == c13563n.f34518B) {
                                if (this.f34519C == c13563n.f34519C) {
                                    return ((this.f34520D > c13563n.f34520D ? 1 : (this.f34520D == c13563n.f34520D ? 0 : -1)) == 0) && Intrinsics.equals(this.f34521E, c13563n.f34521E) && Intrinsics.equals(this.f34522F, c13563n.f34522F);
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
    public final List m991f() {
        return this.f34521E;
    }

    /* renamed from: h */
    public final String m990h() {
        return this.f34523w;
    }

    public int hashCode() {
        return (((((((((((((((((this.f34523w.hashCode() * 31) + Float.hashCode(this.f34524x)) * 31) + Float.hashCode(this.f34525y)) * 31) + Float.hashCode(this.f34526z)) * 31) + Float.hashCode(this.f34517A)) * 31) + Float.hashCode(this.f34518B)) * 31) + Float.hashCode(this.f34519C)) * 31) + Float.hashCode(this.f34520D)) * 31) + this.f34521E.hashCode()) * 31) + this.f34522F.hashCode();
    }

    public Iterator iterator() {
        return new C13564a();
    }

    /* renamed from: l */
    public final float m989l() {
        return this.f34525y;
    }

    /* renamed from: o */
    public final float m988o() {
        return this.f34526z;
    }

    /* renamed from: p */
    public final float m987p() {
        return this.f34524x;
    }

    /* renamed from: q */
    public final float m986q() {
        return this.f34517A;
    }

    /* renamed from: t */
    public final float m985t() {
        return this.f34518B;
    }

    /* renamed from: u */
    public final float m984u() {
        return this.f34519C;
    }

    /* renamed from: v */
    public final float m983v() {
        return this.f34520D;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13563n(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2) {
        super(null);
        Intrinsics.isThisObjectNull(str, "name");
        Intrinsics.isThisObjectNull(list, "clipPathData");
        Intrinsics.isThisObjectNull(list2, "children");
        this.f34523w = str;
        this.f34524x = f;
        this.f34525y = f2;
        this.f34526z = f3;
        this.f34517A = f4;
        this.f34518B = f5;
        this.f34519C = f6;
        this.f34520D = f7;
        this.f34521E = list;
        this.f34522F = list2;
    }
}
