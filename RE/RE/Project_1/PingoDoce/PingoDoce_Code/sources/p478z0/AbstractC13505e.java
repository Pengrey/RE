package p478z0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: z0.e */
/* loaded from: classes.dex */
public abstract class AbstractC13505e {

    /* renamed from: a */
    private final boolean f34379a;

    /* renamed from: b */
    private final boolean f34380b;

    /* compiled from: PathNode.kt */
    /* renamed from: z0.e$a */
    /* loaded from: classes.dex */
    public static final class C13506a extends AbstractC13505e {

        /* renamed from: c */
        private final float f34381c;

        /* renamed from: d */
        private final float f34382d;

        /* renamed from: e */
        private final float f34383e;

        /* renamed from: f */
        private final boolean f34384f;

        /* renamed from: g */
        private final boolean f34385g;

        /* renamed from: h */
        private final float f34386h;

        /* renamed from: i */
        private final float f34387i;

        public C13506a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3, null);
            this.f34381c = f;
            this.f34382d = f2;
            this.f34383e = f3;
            this.f34384f = z;
            this.f34385g = z2;
            this.f34386h = f4;
            this.f34387i = f5;
        }

        /* renamed from: c */
        public final float m1183c() {
            return this.f34386h;
        }

        /* renamed from: d */
        public final float m1182d() {
            return this.f34387i;
        }

        /* renamed from: e */
        public final float m1181e() {
            return this.f34381c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13506a) {
                C13506a c13506a = (C13506a) obj;
                return Intrinsics.equals(Float.valueOf(this.f34381c), Float.valueOf(c13506a.f34381c)) && Intrinsics.equals(Float.valueOf(this.f34382d), Float.valueOf(c13506a.f34382d)) && Intrinsics.equals(Float.valueOf(this.f34383e), Float.valueOf(c13506a.f34383e)) && this.f34384f == c13506a.f34384f && this.f34385g == c13506a.f34385g && Intrinsics.equals(Float.valueOf(this.f34386h), Float.valueOf(c13506a.f34386h)) && Intrinsics.equals(Float.valueOf(this.f34387i), Float.valueOf(c13506a.f34387i));
            }
            return false;
        }

        /* renamed from: f */
        public final float m1180f() {
            return this.f34383e;
        }

        /* renamed from: g */
        public final float m1179g() {
            return this.f34382d;
        }

        /* renamed from: h */
        public final boolean m1178h() {
            return this.f34384f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((Float.hashCode(this.f34381c) * 31) + Float.hashCode(this.f34382d)) * 31) + Float.hashCode(this.f34383e)) * 31;
            boolean z = this.f34384f;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            boolean z2 = this.f34385g;
            return ((((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Float.hashCode(this.f34386h)) * 31) + Float.hashCode(this.f34387i);
        }

        /* renamed from: i */
        public final boolean m1177i() {
            return this.f34385g;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f34381c + ", verticalEllipseRadius=" + this.f34382d + ", theta=" + this.f34383e + ", isMoreThanHalf=" + this.f34384f + ", isPositiveArc=" + this.f34385g + ", arcStartX=" + this.f34386h + ", arcStartY=" + this.f34387i + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* renamed from: z0.e$b */
    /* loaded from: classes.dex */
    public static final class C13507b extends AbstractC13505e {

        /* renamed from: c */
        public static final C13507b f34388c = new C13507b();

        private C13507b() {
            super(false, false, 3, null);
        }
    }

    /* compiled from: PathNode.kt */
    /* renamed from: z0.e$c */
    /* loaded from: classes.dex */
    public static final class C13508c extends AbstractC13505e {

        /* renamed from: c */
        private final float f34389c;

        /* renamed from: d */
        private final float f34390d;

        /* renamed from: e */
        private final float f34391e;

        /* renamed from: f */
        private final float f34392f;

        /* renamed from: g */
        private final float f34393g;

        /* renamed from: h */
        private final float f34394h;

        public C13508c(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.f34389c = f;
            this.f34390d = f2;
            this.f34391e = f3;
            this.f34392f = f4;
            this.f34393g = f5;
            this.f34394h = f6;
        }

        /* renamed from: c */
        public final float m1176c() {
            return this.f34389c;
        }

        /* renamed from: d */
        public final float m1175d() {
            return this.f34391e;
        }

        /* renamed from: e */
        public final float m1174e() {
            return this.f34393g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13508c) {
                C13508c c13508c = (C13508c) obj;
                return Intrinsics.equals(Float.valueOf(this.f34389c), Float.valueOf(c13508c.f34389c)) && Intrinsics.equals(Float.valueOf(this.f34390d), Float.valueOf(c13508c.f34390d)) && Intrinsics.equals(Float.valueOf(this.f34391e), Float.valueOf(c13508c.f34391e)) && Intrinsics.equals(Float.valueOf(this.f34392f), Float.valueOf(c13508c.f34392f)) && Intrinsics.equals(Float.valueOf(this.f34393g), Float.valueOf(c13508c.f34393g)) && Intrinsics.equals(Float.valueOf(this.f34394h), Float.valueOf(c13508c.f34394h));
            }
            return false;
        }

        /* renamed from: f */
        public final float m1173f() {
            return this.f34390d;
        }

        /* renamed from: g */
        public final float m1172g() {
            return this.f34392f;
        }

        /* renamed from: h */
        public final float m1171h() {
            return this.f34394h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f34389c) * 31) + Float.hashCode(this.f34390d)) * 31) + Float.hashCode(this.f34391e)) * 31) + Float.hashCode(this.f34392f)) * 31) + Float.hashCode(this.f34393g)) * 31) + Float.hashCode(this.f34394h);
        }

        public String toString() {
            return "CurveTo(x1=" + this.f34389c + ", y1=" + this.f34390d + ", x2=" + this.f34391e + ", y2=" + this.f34392f + ", x3=" + this.f34393g + ", y3=" + this.f34394h + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* renamed from: z0.e$d */
    /* loaded from: classes.dex */
    public static final class C13509d extends AbstractC13505e {

        /* renamed from: c */
        private final float f34395c;

        public C13509d(float f) {
            super(false, false, 3, null);
            this.f34395c = f;
        }

        /* renamed from: c */
        public final float m1170c() {
            return this.f34395c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13509d) && Intrinsics.equals(Float.valueOf(this.f34395c), Float.valueOf(((C13509d) obj).f34395c));
        }

        public int hashCode() {
            return Float.hashCode(this.f34395c);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f34395c + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* renamed from: z0.e$e */
    /* loaded from: classes.dex */
    public static final class C13510e extends AbstractC13505e {

        /* renamed from: c */
        private final float f34396c;

        /* renamed from: d */
        private final float f34397d;

        public C13510e(float f, float f2) {
            super(false, false, 3, null);
            this.f34396c = f;
            this.f34397d = f2;
        }

        /* renamed from: c */
        public final float m1169c() {
            return this.f34396c;
        }

        /* renamed from: d */
        public final float m1168d() {
            return this.f34397d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13510e) {
                C13510e c13510e = (C13510e) obj;
                return Intrinsics.equals(Float.valueOf(this.f34396c), Float.valueOf(c13510e.f34396c)) && Intrinsics.equals(Float.valueOf(this.f34397d), Float.valueOf(c13510e.f34397d));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f34396c) * 31) + Float.hashCode(this.f34397d);
        }

        public String toString() {
            return "LineTo(x=" + this.f34396c + ", y=" + this.f34397d + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* renamed from: z0.e$f */
    /* loaded from: classes.dex */
    public static final class C13511f extends AbstractC13505e {

        /* renamed from: c */
        private final float f34398c;

        /* renamed from: d */
        private final float f34399d;

        public C13511f(float f, float f2) {
            super(false, false, 3, null);
            this.f34398c = f;
            this.f34399d = f2;
        }

        /* renamed from: c */
        public final float m1167c() {
            return this.f34398c;
        }

        /* renamed from: d */
        public final float m1166d() {
            return this.f34399d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13511f) {
                C13511f c13511f = (C13511f) obj;
                return Intrinsics.equals(Float.valueOf(this.f34398c), Float.valueOf(c13511f.f34398c)) && Intrinsics.equals(Float.valueOf(this.f34399d), Float.valueOf(c13511f.f34399d));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f34398c) * 31) + Float.hashCode(this.f34399d);
        }

        public String toString() {
            return "MoveTo(x=" + this.f34398c + ", y=" + this.f34399d + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* renamed from: z0.e$g */
    /* loaded from: classes.dex */
    public static final class C13512g extends AbstractC13505e {

        /* renamed from: c */
        private final float f34400c;

        /* renamed from: d */
        private final float f34401d;

        /* renamed from: e */
        private final float f34402e;

        /* renamed from: f */
        private final float f34403f;

        public C13512g(float f, float f2, float f3, float f4) {
            super(false, true, 1, null);
            this.f34400c = f;
            this.f34401d = f2;
            this.f34402e = f3;
            this.f34403f = f4;
        }

        /* renamed from: c */
        public final float m1165c() {
            return this.f34400c;
        }

        /* renamed from: d */
        public final float m1164d() {
            return this.f34402e;
        }

        /* renamed from: e */
        public final float m1163e() {
            return this.f34401d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13512g) {
                C13512g c13512g = (C13512g) obj;
                return Intrinsics.equals(Float.valueOf(this.f34400c), Float.valueOf(c13512g.f34400c)) && Intrinsics.equals(Float.valueOf(this.f34401d), Float.valueOf(c13512g.f34401d)) && Intrinsics.equals(Float.valueOf(this.f34402e), Float.valueOf(c13512g.f34402e)) && Intrinsics.equals(Float.valueOf(this.f34403f), Float.valueOf(c13512g.f34403f));
            }
            return false;
        }

        /* renamed from: f */
        public final float m1162f() {
            return this.f34403f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f34400c) * 31) + Float.hashCode(this.f34401d)) * 31) + Float.hashCode(this.f34402e)) * 31) + Float.hashCode(this.f34403f);
        }

        public String toString() {
            return "QuadTo(x1=" + this.f34400c + ", y1=" + this.f34401d + ", x2=" + this.f34402e + ", y2=" + this.f34403f + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* renamed from: z0.e$h */
    /* loaded from: classes.dex */
    public static final class C13513h extends AbstractC13505e {

        /* renamed from: c */
        private final float f34404c;

        /* renamed from: d */
        private final float f34405d;

        /* renamed from: e */
        private final float f34406e;

        /* renamed from: f */
        private final float f34407f;

        public C13513h(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.f34404c = f;
            this.f34405d = f2;
            this.f34406e = f3;
            this.f34407f = f4;
        }

        /* renamed from: c */
        public final float m1161c() {
            return this.f34404c;
        }

        /* renamed from: d */
        public final float m1160d() {
            return this.f34406e;
        }

        /* renamed from: e */
        public final float m1159e() {
            return this.f34405d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13513h) {
                C13513h c13513h = (C13513h) obj;
                return Intrinsics.equals(Float.valueOf(this.f34404c), Float.valueOf(c13513h.f34404c)) && Intrinsics.equals(Float.valueOf(this.f34405d), Float.valueOf(c13513h.f34405d)) && Intrinsics.equals(Float.valueOf(this.f34406e), Float.valueOf(c13513h.f34406e)) && Intrinsics.equals(Float.valueOf(this.f34407f), Float.valueOf(c13513h.f34407f));
            }
            return false;
        }

        /* renamed from: f */
        public final float m1158f() {
            return this.f34407f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f34404c) * 31) + Float.hashCode(this.f34405d)) * 31) + Float.hashCode(this.f34406e)) * 31) + Float.hashCode(this.f34407f);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f34404c + ", y1=" + this.f34405d + ", x2=" + this.f34406e + ", y2=" + this.f34407f + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* renamed from: z0.e$i */
    /* loaded from: classes.dex */
    public static final class C13514i extends AbstractC13505e {

        /* renamed from: c */
        private final float f34408c;

        /* renamed from: d */
        private final float f34409d;

        public C13514i(float f, float f2) {
            super(false, true, 1, null);
            this.f34408c = f;
            this.f34409d = f2;
        }

        /* renamed from: c */
        public final float m1157c() {
            return this.f34408c;
        }

        /* renamed from: d */
        public final float m1156d() {
            return this.f34409d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13514i) {
                C13514i c13514i = (C13514i) obj;
                return Intrinsics.equals(Float.valueOf(this.f34408c), Float.valueOf(c13514i.f34408c)) && Intrinsics.equals(Float.valueOf(this.f34409d), Float.valueOf(c13514i.f34409d));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f34408c) * 31) + Float.hashCode(this.f34409d);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f34408c + ", y=" + this.f34409d + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* renamed from: z0.e$j */
    /* loaded from: classes.dex */
    public static final class C13515j extends AbstractC13505e {

        /* renamed from: c */
        private final float f34410c;

        /* renamed from: d */
        private final float f34411d;

        /* renamed from: e */
        private final float f34412e;

        /* renamed from: f */
        private final boolean f34413f;

        /* renamed from: g */
        private final boolean f34414g;

        /* renamed from: h */
        private final float f34415h;

        /* renamed from: i */
        private final float f34416i;

        public C13515j(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3, null);
            this.f34410c = f;
            this.f34411d = f2;
            this.f34412e = f3;
            this.f34413f = z;
            this.f34414g = z2;
            this.f34415h = f4;
            this.f34416i = f5;
        }

        /* renamed from: c */
        public final float m1155c() {
            return this.f34415h;
        }

        /* renamed from: d */
        public final float m1154d() {
            return this.f34416i;
        }

        /* renamed from: e */
        public final float m1153e() {
            return this.f34410c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13515j) {
                C13515j c13515j = (C13515j) obj;
                return Intrinsics.equals(Float.valueOf(this.f34410c), Float.valueOf(c13515j.f34410c)) && Intrinsics.equals(Float.valueOf(this.f34411d), Float.valueOf(c13515j.f34411d)) && Intrinsics.equals(Float.valueOf(this.f34412e), Float.valueOf(c13515j.f34412e)) && this.f34413f == c13515j.f34413f && this.f34414g == c13515j.f34414g && Intrinsics.equals(Float.valueOf(this.f34415h), Float.valueOf(c13515j.f34415h)) && Intrinsics.equals(Float.valueOf(this.f34416i), Float.valueOf(c13515j.f34416i));
            }
            return false;
        }

        /* renamed from: f */
        public final float m1152f() {
            return this.f34412e;
        }

        /* renamed from: g */
        public final float m1151g() {
            return this.f34411d;
        }

        /* renamed from: h */
        public final boolean m1150h() {
            return this.f34413f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((Float.hashCode(this.f34410c) * 31) + Float.hashCode(this.f34411d)) * 31) + Float.hashCode(this.f34412e)) * 31;
            boolean z = this.f34413f;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            boolean z2 = this.f34414g;
            return ((((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Float.hashCode(this.f34415h)) * 31) + Float.hashCode(this.f34416i);
        }

        /* renamed from: i */
        public final boolean m1149i() {
            return this.f34414g;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f34410c + ", verticalEllipseRadius=" + this.f34411d + ", theta=" + this.f34412e + ", isMoreThanHalf=" + this.f34413f + ", isPositiveArc=" + this.f34414g + ", arcStartDx=" + this.f34415h + ", arcStartDy=" + this.f34416i + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* renamed from: z0.e$k */
    /* loaded from: classes.dex */
    public static final class C13516k extends AbstractC13505e {

        /* renamed from: c */
        private final float f34417c;

        /* renamed from: d */
        private final float f34418d;

        /* renamed from: e */
        private final float f34419e;

        /* renamed from: f */
        private final float f34420f;

        /* renamed from: g */
        private final float f34421g;

        /* renamed from: h */
        private final float f34422h;

        public C13516k(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.f34417c = f;
            this.f34418d = f2;
            this.f34419e = f3;
            this.f34420f = f4;
            this.f34421g = f5;
            this.f34422h = f6;
        }

        /* renamed from: c */
        public final float m1148c() {
            return this.f34417c;
        }

        /* renamed from: d */
        public final float m1147d() {
            return this.f34419e;
        }

        /* renamed from: e */
        public final float m1146e() {
            return this.f34421g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13516k) {
                C13516k c13516k = (C13516k) obj;
                return Intrinsics.equals(Float.valueOf(this.f34417c), Float.valueOf(c13516k.f34417c)) && Intrinsics.equals(Float.valueOf(this.f34418d), Float.valueOf(c13516k.f34418d)) && Intrinsics.equals(Float.valueOf(this.f34419e), Float.valueOf(c13516k.f34419e)) && Intrinsics.equals(Float.valueOf(this.f34420f), Float.valueOf(c13516k.f34420f)) && Intrinsics.equals(Float.valueOf(this.f34421g), Float.valueOf(c13516k.f34421g)) && Intrinsics.equals(Float.valueOf(this.f34422h), Float.valueOf(c13516k.f34422h));
            }
            return false;
        }

        /* renamed from: f */
        public final float m1145f() {
            return this.f34418d;
        }

        /* renamed from: g */
        public final float m1144g() {
            return this.f34420f;
        }

        /* renamed from: h */
        public final float m1143h() {
            return this.f34422h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f34417c) * 31) + Float.hashCode(this.f34418d)) * 31) + Float.hashCode(this.f34419e)) * 31) + Float.hashCode(this.f34420f)) * 31) + Float.hashCode(this.f34421g)) * 31) + Float.hashCode(this.f34422h);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f34417c + ", dy1=" + this.f34418d + ", dx2=" + this.f34419e + ", dy2=" + this.f34420f + ", dx3=" + this.f34421g + ", dy3=" + this.f34422h + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* renamed from: z0.e$l */
    /* loaded from: classes.dex */
    public static final class C13517l extends AbstractC13505e {

        /* renamed from: c */
        private final float f34423c;

        public C13517l(float f) {
            super(false, false, 3, null);
            this.f34423c = f;
        }

        /* renamed from: c */
        public final float m1142c() {
            return this.f34423c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13517l) && Intrinsics.equals(Float.valueOf(this.f34423c), Float.valueOf(((C13517l) obj).f34423c));
        }

        public int hashCode() {
            return Float.hashCode(this.f34423c);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f34423c + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* renamed from: z0.e$m */
    /* loaded from: classes.dex */
    public static final class C13518m extends AbstractC13505e {

        /* renamed from: c */
        private final float f34424c;

        /* renamed from: d */
        private final float f34425d;

        public C13518m(float f, float f2) {
            super(false, false, 3, null);
            this.f34424c = f;
            this.f34425d = f2;
        }

        /* renamed from: c */
        public final float m1141c() {
            return this.f34424c;
        }

        /* renamed from: d */
        public final float m1140d() {
            return this.f34425d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13518m) {
                C13518m c13518m = (C13518m) obj;
                return Intrinsics.equals(Float.valueOf(this.f34424c), Float.valueOf(c13518m.f34424c)) && Intrinsics.equals(Float.valueOf(this.f34425d), Float.valueOf(c13518m.f34425d));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f34424c) * 31) + Float.hashCode(this.f34425d);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.f34424c + ", dy=" + this.f34425d + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* renamed from: z0.e$n */
    /* loaded from: classes.dex */
    public static final class C13519n extends AbstractC13505e {

        /* renamed from: c */
        private final float f34426c;

        /* renamed from: d */
        private final float f34427d;

        public C13519n(float f, float f2) {
            super(false, false, 3, null);
            this.f34426c = f;
            this.f34427d = f2;
        }

        /* renamed from: c */
        public final float m1139c() {
            return this.f34426c;
        }

        /* renamed from: d */
        public final float m1138d() {
            return this.f34427d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13519n) {
                C13519n c13519n = (C13519n) obj;
                return Intrinsics.equals(Float.valueOf(this.f34426c), Float.valueOf(c13519n.f34426c)) && Intrinsics.equals(Float.valueOf(this.f34427d), Float.valueOf(c13519n.f34427d));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f34426c) * 31) + Float.hashCode(this.f34427d);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.f34426c + ", dy=" + this.f34427d + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* renamed from: z0.e$o */
    /* loaded from: classes.dex */
    public static final class C13520o extends AbstractC13505e {

        /* renamed from: c */
        private final float f34428c;

        /* renamed from: d */
        private final float f34429d;

        /* renamed from: e */
        private final float f34430e;

        /* renamed from: f */
        private final float f34431f;

        public C13520o(float f, float f2, float f3, float f4) {
            super(false, true, 1, null);
            this.f34428c = f;
            this.f34429d = f2;
            this.f34430e = f3;
            this.f34431f = f4;
        }

        /* renamed from: c */
        public final float m1137c() {
            return this.f34428c;
        }

        /* renamed from: d */
        public final float m1136d() {
            return this.f34430e;
        }

        /* renamed from: e */
        public final float m1135e() {
            return this.f34429d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13520o) {
                C13520o c13520o = (C13520o) obj;
                return Intrinsics.equals(Float.valueOf(this.f34428c), Float.valueOf(c13520o.f34428c)) && Intrinsics.equals(Float.valueOf(this.f34429d), Float.valueOf(c13520o.f34429d)) && Intrinsics.equals(Float.valueOf(this.f34430e), Float.valueOf(c13520o.f34430e)) && Intrinsics.equals(Float.valueOf(this.f34431f), Float.valueOf(c13520o.f34431f));
            }
            return false;
        }

        /* renamed from: f */
        public final float m1134f() {
            return this.f34431f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f34428c) * 31) + Float.hashCode(this.f34429d)) * 31) + Float.hashCode(this.f34430e)) * 31) + Float.hashCode(this.f34431f);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f34428c + ", dy1=" + this.f34429d + ", dx2=" + this.f34430e + ", dy2=" + this.f34431f + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* renamed from: z0.e$p */
    /* loaded from: classes.dex */
    public static final class C13521p extends AbstractC13505e {

        /* renamed from: c */
        private final float f34432c;

        /* renamed from: d */
        private final float f34433d;

        /* renamed from: e */
        private final float f34434e;

        /* renamed from: f */
        private final float f34435f;

        public C13521p(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.f34432c = f;
            this.f34433d = f2;
            this.f34434e = f3;
            this.f34435f = f4;
        }

        /* renamed from: c */
        public final float m1133c() {
            return this.f34432c;
        }

        /* renamed from: d */
        public final float m1132d() {
            return this.f34434e;
        }

        /* renamed from: e */
        public final float m1131e() {
            return this.f34433d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13521p) {
                C13521p c13521p = (C13521p) obj;
                return Intrinsics.equals(Float.valueOf(this.f34432c), Float.valueOf(c13521p.f34432c)) && Intrinsics.equals(Float.valueOf(this.f34433d), Float.valueOf(c13521p.f34433d)) && Intrinsics.equals(Float.valueOf(this.f34434e), Float.valueOf(c13521p.f34434e)) && Intrinsics.equals(Float.valueOf(this.f34435f), Float.valueOf(c13521p.f34435f));
            }
            return false;
        }

        /* renamed from: f */
        public final float m1130f() {
            return this.f34435f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f34432c) * 31) + Float.hashCode(this.f34433d)) * 31) + Float.hashCode(this.f34434e)) * 31) + Float.hashCode(this.f34435f);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f34432c + ", dy1=" + this.f34433d + ", dx2=" + this.f34434e + ", dy2=" + this.f34435f + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* renamed from: z0.e$q */
    /* loaded from: classes.dex */
    public static final class C13522q extends AbstractC13505e {

        /* renamed from: c */
        private final float f34436c;

        /* renamed from: d */
        private final float f34437d;

        public C13522q(float f, float f2) {
            super(false, true, 1, null);
            this.f34436c = f;
            this.f34437d = f2;
        }

        /* renamed from: c */
        public final float m1129c() {
            return this.f34436c;
        }

        /* renamed from: d */
        public final float m1128d() {
            return this.f34437d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13522q) {
                C13522q c13522q = (C13522q) obj;
                return Intrinsics.equals(Float.valueOf(this.f34436c), Float.valueOf(c13522q.f34436c)) && Intrinsics.equals(Float.valueOf(this.f34437d), Float.valueOf(c13522q.f34437d));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f34436c) * 31) + Float.hashCode(this.f34437d);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f34436c + ", dy=" + this.f34437d + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* renamed from: z0.e$r */
    /* loaded from: classes.dex */
    public static final class C13523r extends AbstractC13505e {

        /* renamed from: c */
        private final float f34438c;

        public C13523r(float f) {
            super(false, false, 3, null);
            this.f34438c = f;
        }

        /* renamed from: c */
        public final float m1127c() {
            return this.f34438c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13523r) && Intrinsics.equals(Float.valueOf(this.f34438c), Float.valueOf(((C13523r) obj).f34438c));
        }

        public int hashCode() {
            return Float.hashCode(this.f34438c);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f34438c + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* renamed from: z0.e$s */
    /* loaded from: classes.dex */
    public static final class C13524s extends AbstractC13505e {

        /* renamed from: c */
        private final float f34439c;

        public C13524s(float f) {
            super(false, false, 3, null);
            this.f34439c = f;
        }

        /* renamed from: c */
        public final float m1126c() {
            return this.f34439c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13524s) && Intrinsics.equals(Float.valueOf(this.f34439c), Float.valueOf(((C13524s) obj).f34439c));
        }

        public int hashCode() {
            return Float.hashCode(this.f34439c);
        }

        public String toString() {
            return "VerticalTo(y=" + this.f34439c + ')';
        }
    }

    private AbstractC13505e(boolean z, boolean z2) {
        this.f34379a = z;
        this.f34380b = z2;
    }

    public /* synthetic */ AbstractC13505e(boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2);
    }

    /* renamed from: a */
    public final boolean m1185a() {
        return this.f34379a;
    }

    /* renamed from: b */
    public final boolean m1184b() {
        return this.f34380b;
    }

    public /* synthetic */ AbstractC13505e(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, null);
    }
}
