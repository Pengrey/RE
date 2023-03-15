package p478z0;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p393v0.AbstractC11057s;
import p393v0.C11047p;
import p393v0.Color;
import p479z1.C13605g;

/* renamed from: z0.c */
/* loaded from: classes.dex */
public final class ImageVector {

    /* renamed from: a */
    private final String f34330a;

    /* renamed from: b */
    private final float f34331b;

    /* renamed from: c */
    private final float f34332c;

    /* renamed from: d */
    private final float f34333d;

    /* renamed from: e */
    private final float f34334e;

    /* renamed from: f */
    private final C13563n f34335f;

    /* renamed from: g */
    private final long f34336g;

    /* renamed from: h */
    private final int f34337h;

    /* compiled from: ImageVector.kt */
    /* renamed from: z0.c$b */
    /* loaded from: classes.dex */
    public static final class C13502b {
        private C13502b() {
        }

        public /* synthetic */ C13502b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C13502b(null);
    }

    private ImageVector(String str, float f, float f2, float f3, float f4, C13563n c13563n, long j, int i) {
        this.f34330a = str;
        this.f34331b = f;
        this.f34332c = f2;
        this.f34333d = f3;
        this.f34334e = f4;
        this.f34335f = c13563n;
        this.f34336g = j;
        this.f34337h = i;
    }

    public /* synthetic */ ImageVector(String str, float f, float f2, float f3, float f4, C13563n c13563n, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, f2, f3, f4, c13563n, j, i);
    }

    /* renamed from: a */
    public final float m1235a() {
        return this.f34332c;
    }

    /* renamed from: b */
    public final float m1234b() {
        return this.f34331b;
    }

    /* renamed from: c */
    public final String m1233c() {
        return this.f34330a;
    }

    /* renamed from: d */
    public final C13563n m1232d() {
        return this.f34335f;
    }

    /* renamed from: e */
    public final int m1231e() {
        return this.f34337h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImageVector) {
            ImageVector imageVector = (ImageVector) obj;
            if (Intrinsics.equals(this.f34330a, imageVector.f34330a) && C13605g.m873i(m1234b(), imageVector.m1234b()) && C13605g.m873i(m1235a(), imageVector.m1235a())) {
                if (this.f34333d == imageVector.f34333d) {
                    return ((this.f34334e > imageVector.f34334e ? 1 : (this.f34334e == imageVector.f34334e ? 0 : -1)) == 0) && Intrinsics.equals(this.f34335f, imageVector.f34335f) && Color.m6646n(m1230f(), imageVector.m1230f()) && C11047p.m6380E(m1231e(), imageVector.m1231e());
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final long m1230f() {
        return this.f34336g;
    }

    /* renamed from: g */
    public final float m1229g() {
        return this.f34334e;
    }

    /* renamed from: h */
    public final float m1228h() {
        return this.f34333d;
    }

    public int hashCode() {
        return (((((((((((((this.f34330a.hashCode() * 31) + C13605g.m872j(m1234b())) * 31) + C13605g.m872j(m1235a())) * 31) + Float.hashCode(this.f34333d)) * 31) + Float.hashCode(this.f34334e)) * 31) + this.f34335f.hashCode()) * 31) + Color.m6640t(m1230f())) * 31) + C11047p.m6379F(m1231e());
    }

    /* compiled from: ImageVector.kt */
    /* renamed from: z0.c$a */
    /* loaded from: classes.dex */
    public static final class C13500a {

        /* renamed from: a */
        private final String f34338a;

        /* renamed from: b */
        private final float f34339b;

        /* renamed from: c */
        private final float f34340c;

        /* renamed from: d */
        private final float f34341d;

        /* renamed from: e */
        private final float f34342e;

        /* renamed from: f */
        private final long f34343f;

        /* renamed from: g */
        private final int f34344g;

        /* renamed from: h */
        private final ArrayList f34345h;

        /* renamed from: i */
        private C13501a f34346i;

        /* renamed from: j */
        private boolean f34347j;

        private C13500a(String str, float f, float f2, float f3, float f4, long j, int i) {
            this.f34338a = str;
            this.f34339b = f;
            this.f34340c = f2;
            this.f34341d = f3;
            this.f34342e = f4;
            this.f34343f = j;
            this.f34344g = i;
            ArrayList m1082b = C13527h.m1082b(null, 1, null);
            this.f34345h = m1082b;
            C13501a c13501a = new C13501a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.f34346i = c13501a;
            C13527h.m1078f(m1082b, c13501a);
        }

        public /* synthetic */ C13500a(String str, float f, float f2, float f3, float f4, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f, f2, f3, f4, j, i);
        }

        /* renamed from: b */
        public static /* synthetic */ C13500a m1226b(C13500a c13500a, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i, Object obj) {
            return c13500a.m1227a((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) == 0 ? f5 : 1.0f, (i & 64) != 0 ? 0.0f : f6, (i & 128) == 0 ? f7 : 0.0f, (i & 256) != 0 ? C13565o.m977e() : list);
        }

        /* renamed from: d */
        private final C13563n m1224d(C13501a c13501a) {
            return new C13563n(c13501a.m1217c(), c13501a.m1214f(), c13501a.m1216d(), c13501a.m1215e(), c13501a.m1213g(), c13501a.m1212h(), c13501a.m1211i(), c13501a.m1210j(), c13501a.m1218b(), c13501a.m1219a());
        }

        /* renamed from: g */
        private final void m1221g() {
            if (!(!this.f34347j)) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
            }
        }

        /* renamed from: h */
        private final C13501a m1220h() {
            return (C13501a) C13527h.m1080d(this.f34345h);
        }

        /* renamed from: a */
        public final C13500a m1227a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list) {
            Intrinsics.isThisObjectNull(str, "name");
            Intrinsics.isThisObjectNull(list, "clipPathData");
            m1221g();
            C13527h.m1078f(this.f34345h, new C13501a(str, f, f2, f3, f4, f5, f6, f7, list, null, 512, null));
            return this;
        }

        /* renamed from: c */
        public final C13500a m1225c(List list, int i, String str, AbstractC11057s abstractC11057s, float f, AbstractC11057s abstractC11057s2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
            Intrinsics.isThisObjectNull(list, "pathData");
            Intrinsics.isThisObjectNull(str, "name");
            m1221g();
            m1220h().m1219a().add(new C13580s(str, list, i, abstractC11057s, f, abstractC11057s2, f2, f3, i2, i3, f4, f5, f6, f7, null));
            return this;
        }

        /* renamed from: e */
        public final ImageVector m1223e() {
            m1221g();
            while (C13527h.m1081c(this.f34345h) > 1) {
                m1222f();
            }
            ImageVector imageVector = new ImageVector(this.f34338a, this.f34339b, this.f34340c, this.f34341d, this.f34342e, m1224d(this.f34346i), this.f34343f, this.f34344g, null);
            this.f34347j = true;
            return imageVector;
        }

        /* renamed from: f */
        public final C13500a m1222f() {
            m1221g();
            m1220h().m1219a().add(m1224d((C13501a) C13527h.m1079e(this.f34345h)));
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: ImageVector.kt */
        /* renamed from: z0.c$a$a */
        /* loaded from: classes.dex */
        public static final class C13501a {

            /* renamed from: a */
            private String f34348a;

            /* renamed from: b */
            private float f34349b;

            /* renamed from: c */
            private float f34350c;

            /* renamed from: d */
            private float f34351d;

            /* renamed from: e */
            private float f34352e;

            /* renamed from: f */
            private float f34353f;

            /* renamed from: g */
            private float f34354g;

            /* renamed from: h */
            private float f34355h;

            /* renamed from: i */
            private List f34356i;

            /* renamed from: j */
            private List f34357j;

            public C13501a() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            }

            public C13501a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2) {
                Intrinsics.isThisObjectNull(str, "name");
                Intrinsics.isThisObjectNull(list, "clipPathData");
                Intrinsics.isThisObjectNull(list2, "children");
                this.f34348a = str;
                this.f34349b = f;
                this.f34350c = f2;
                this.f34351d = f3;
                this.f34352e = f4;
                this.f34353f = f5;
                this.f34354g = f6;
                this.f34355h = f7;
                this.f34356i = list;
                this.f34357j = list2;
            }

            /* renamed from: a */
            public final List m1219a() {
                return this.f34357j;
            }

            /* renamed from: b */
            public final List m1218b() {
                return this.f34356i;
            }

            /* renamed from: c */
            public final String m1217c() {
                return this.f34348a;
            }

            /* renamed from: d */
            public final float m1216d() {
                return this.f34350c;
            }

            /* renamed from: e */
            public final float m1215e() {
                return this.f34351d;
            }

            /* renamed from: f */
            public final float m1214f() {
                return this.f34349b;
            }

            /* renamed from: g */
            public final float m1213g() {
                return this.f34352e;
            }

            /* renamed from: h */
            public final float m1212h() {
                return this.f34353f;
            }

            /* renamed from: i */
            public final float m1211i() {
                return this.f34354g;
            }

            /* renamed from: j */
            public final float m1210j() {
                return this.f34355h;
            }

            public /* synthetic */ C13501a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) == 0 ? f5 : 1.0f, (i & 64) != 0 ? 0.0f : f6, (i & 128) == 0 ? f7 : 0.0f, (i & 256) != 0 ? C13565o.m977e() : list, (i & 512) != 0 ? new ArrayList() : list2);
            }
        }

        public /* synthetic */ C13500a(String str, float f, float f2, float f3, float f4, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? BuildConfig.VERSION_NAME : str, f, f2, f3, f4, (i2 & 32) != 0 ? Color.f28297b.m6632f() : j, (i2 & 64) != 0 ? C11047p.f28401a.m6324z() : i, null);
        }
    }
}
