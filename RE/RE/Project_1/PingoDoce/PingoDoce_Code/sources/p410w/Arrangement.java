package p410w;

import p181jd.Intrinsics;
import p220ld.C7037c;
import p479z1.C13605g;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: w.c */
/* loaded from: classes.dex */
public final class Arrangement {

    /* renamed from: a */
    public static final Arrangement f29297a = new Arrangement();

    /* renamed from: b */
    private static final InterfaceC11416d f29298b = new C11422i();

    /* renamed from: c */
    private static final InterfaceC11424k f29299c;

    /* renamed from: d */
    private static final InterfaceC11424k f29300d;

    /* renamed from: e */
    private static final InterfaceC11418e f29301e;

    /* compiled from: Arrangement.kt */
    /* renamed from: w.c$a */
    /* loaded from: classes.dex */
    public static final class C11413a implements InterfaceC11424k {
        C11413a() {
        }

        /* renamed from: a */
        public float m5168a() {
            return InterfaceC11424k.C11425a.m5143a(this);
        }

        /* renamed from: b */
        public void m5167b(Density density, int i, int[] iArr, int[] iArr2) {
            Intrinsics.isThisObjectNull(density, "<this>");
            Intrinsics.isThisObjectNull(iArr, "sizes");
            Intrinsics.isThisObjectNull(iArr2, "outPositions");
            Arrangement.f29297a.m5172g(i, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* compiled from: Arrangement.kt */
    /* renamed from: w.c$b */
    /* loaded from: classes.dex */
    public static final class C11414b implements InterfaceC11418e {

        /* renamed from: a */
        private final float f29302a = C13605g.m875g(0);

        C11414b() {
        }

        /* renamed from: a */
        public float m5166a() {
            return this.f29302a;
        }

        /* renamed from: b */
        public void m5165b(Density density, int i, int[] iArr, int[] iArr2) {
            Intrinsics.isThisObjectNull(density, "<this>");
            Intrinsics.isThisObjectNull(iArr, "sizes");
            Intrinsics.isThisObjectNull(iArr2, "outPositions");
            Arrangement.f29297a.m5174e(i, iArr, iArr2, false);
        }

        /* renamed from: c */
        public void m5164c(Density density, int i, int[] iArr, EnumC13618o enumC13618o, int[] iArr2) {
            Intrinsics.isThisObjectNull(density, "<this>");
            Intrinsics.isThisObjectNull(iArr, "sizes");
            Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
            Intrinsics.isThisObjectNull(iArr2, "outPositions");
            if (enumC13618o == EnumC13618o.Ltr) {
                Arrangement.f29297a.m5174e(i, iArr, iArr2, false);
            } else {
                Arrangement.f29297a.m5174e(i, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Center";
        }
    }

    /* compiled from: Arrangement.kt */
    /* renamed from: w.c$c */
    /* loaded from: classes.dex */
    public static final class C11415c implements InterfaceC11416d {
        C11415c() {
        }

        /* renamed from: a */
        public float m5163a() {
            return InterfaceC11416d.C11417a.m5159a(this);
        }

        /* renamed from: c */
        public void m5162c(Density density, int i, int[] iArr, EnumC13618o enumC13618o, int[] iArr2) {
            Intrinsics.isThisObjectNull(density, "<this>");
            Intrinsics.isThisObjectNull(iArr, "sizes");
            Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
            Intrinsics.isThisObjectNull(iArr2, "outPositions");
            if (enumC13618o == EnumC13618o.Ltr) {
                Arrangement.f29297a.m5172g(i, iArr, iArr2, false);
            } else {
                Arrangement.f29297a.m5173f(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    }

    /* compiled from: Arrangement.kt */
    /* renamed from: w.c$d */
    /* loaded from: classes.dex */
    public interface InterfaceC11416d {

        /* compiled from: Arrangement.kt */
        /* renamed from: w.c$d$a */
        /* loaded from: classes.dex */
        public static final class C11417a {
            /* renamed from: a */
            public static float m5159a(InterfaceC11416d interfaceC11416d) {
                Intrinsics.isThisObjectNull(interfaceC11416d, "this");
                return C13605g.m875g(0);
            }
        }

        /* renamed from: a */
        float m5161a();

        /* renamed from: c */
        void m5160c(Density density, int i, int[] iArr, EnumC13618o enumC13618o, int[] iArr2);
    }

    /* compiled from: Arrangement.kt */
    /* renamed from: w.c$e */
    /* loaded from: classes.dex */
    public interface InterfaceC11418e extends InterfaceC11416d, InterfaceC11424k {
    }

    /* compiled from: Arrangement.kt */
    /* renamed from: w.c$f */
    /* loaded from: classes.dex */
    public static final class C11419f implements InterfaceC11418e {

        /* renamed from: a */
        private final float f29303a = C13605g.m875g(0);

        C11419f() {
        }

        /* renamed from: a */
        public float m5158a() {
            return this.f29303a;
        }

        /* renamed from: b */
        public void m5157b(Density density, int i, int[] iArr, int[] iArr2) {
            Intrinsics.isThisObjectNull(density, "<this>");
            Intrinsics.isThisObjectNull(iArr, "sizes");
            Intrinsics.isThisObjectNull(iArr2, "outPositions");
            Arrangement.f29297a.m5171h(i, iArr, iArr2, false);
        }

        /* renamed from: c */
        public void m5156c(Density density, int i, int[] iArr, EnumC13618o enumC13618o, int[] iArr2) {
            Intrinsics.isThisObjectNull(density, "<this>");
            Intrinsics.isThisObjectNull(iArr, "sizes");
            Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
            Intrinsics.isThisObjectNull(iArr2, "outPositions");
            if (enumC13618o == EnumC13618o.Ltr) {
                Arrangement.f29297a.m5171h(i, iArr, iArr2, false);
            } else {
                Arrangement.f29297a.m5171h(i, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* compiled from: Arrangement.kt */
    /* renamed from: w.c$g */
    /* loaded from: classes.dex */
    public static final class C11420g implements InterfaceC11418e {

        /* renamed from: a */
        private final float f29304a = C13605g.m875g(0);

        C11420g() {
        }

        /* renamed from: a */
        public float m5155a() {
            return this.f29304a;
        }

        /* renamed from: b */
        public void m5154b(Density density, int i, int[] iArr, int[] iArr2) {
            Intrinsics.isThisObjectNull(density, "<this>");
            Intrinsics.isThisObjectNull(iArr, "sizes");
            Intrinsics.isThisObjectNull(iArr2, "outPositions");
            Arrangement.f29297a.m5170i(i, iArr, iArr2, false);
        }

        /* renamed from: c */
        public void m5153c(Density density, int i, int[] iArr, EnumC13618o enumC13618o, int[] iArr2) {
            Intrinsics.isThisObjectNull(density, "<this>");
            Intrinsics.isThisObjectNull(iArr, "sizes");
            Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
            Intrinsics.isThisObjectNull(iArr2, "outPositions");
            if (enumC13618o == EnumC13618o.Ltr) {
                Arrangement.f29297a.m5170i(i, iArr, iArr2, false);
            } else {
                Arrangement.f29297a.m5170i(i, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* compiled from: Arrangement.kt */
    /* renamed from: w.c$h */
    /* loaded from: classes.dex */
    public static final class C11421h implements InterfaceC11418e {

        /* renamed from: a */
        private final float f29305a = C13605g.m875g(0);

        C11421h() {
        }

        /* renamed from: a */
        public float m5152a() {
            return this.f29305a;
        }

        /* renamed from: b */
        public void m5151b(Density density, int i, int[] iArr, int[] iArr2) {
            Intrinsics.isThisObjectNull(density, "<this>");
            Intrinsics.isThisObjectNull(iArr, "sizes");
            Intrinsics.isThisObjectNull(iArr2, "outPositions");
            Arrangement.f29297a.m5169j(i, iArr, iArr2, false);
        }

        /* renamed from: c */
        public void m5150c(Density density, int i, int[] iArr, EnumC13618o enumC13618o, int[] iArr2) {
            Intrinsics.isThisObjectNull(density, "<this>");
            Intrinsics.isThisObjectNull(iArr, "sizes");
            Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
            Intrinsics.isThisObjectNull(iArr2, "outPositions");
            if (enumC13618o == EnumC13618o.Ltr) {
                Arrangement.f29297a.m5169j(i, iArr, iArr2, false);
            } else {
                Arrangement.f29297a.m5169j(i, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* compiled from: Arrangement.kt */
    /* renamed from: w.c$i */
    /* loaded from: classes.dex */
    public static final class C11422i implements InterfaceC11416d {
        C11422i() {
        }

        /* renamed from: a */
        public float m5149a() {
            return InterfaceC11416d.C11417a.m5159a(this);
        }

        /* renamed from: c */
        public void m5148c(Density density, int i, int[] iArr, EnumC13618o enumC13618o, int[] iArr2) {
            Intrinsics.isThisObjectNull(density, "<this>");
            Intrinsics.isThisObjectNull(iArr, "sizes");
            Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
            Intrinsics.isThisObjectNull(iArr2, "outPositions");
            if (enumC13618o == EnumC13618o.Ltr) {
                Arrangement.f29297a.m5173f(iArr, iArr2, false);
            } else {
                Arrangement.f29297a.m5172g(i, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    }

    /* compiled from: Arrangement.kt */
    /* renamed from: w.c$j */
    /* loaded from: classes.dex */
    public static final class C11423j implements InterfaceC11424k {
        C11423j() {
        }

        /* renamed from: a */
        public float m5147a() {
            return InterfaceC11424k.C11425a.m5143a(this);
        }

        /* renamed from: b */
        public void m5146b(Density density, int i, int[] iArr, int[] iArr2) {
            Intrinsics.isThisObjectNull(density, "<this>");
            Intrinsics.isThisObjectNull(iArr, "sizes");
            Intrinsics.isThisObjectNull(iArr2, "outPositions");
            Arrangement.f29297a.m5173f(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    }

    /* compiled from: Arrangement.kt */
    /* renamed from: w.c$k */
    /* loaded from: classes.dex */
    public interface InterfaceC11424k {

        /* compiled from: Arrangement.kt */
        /* renamed from: w.c$k$a */
        /* loaded from: classes.dex */
        public static final class C11425a {
            /* renamed from: a */
            public static float m5143a(InterfaceC11424k interfaceC11424k) {
                Intrinsics.isThisObjectNull(interfaceC11424k, "this");
                return C13605g.m875g(0);
            }
        }

        /* renamed from: a */
        float m5145a();

        /* renamed from: b */
        void m5144b(Density density, int i, int[] iArr, int[] iArr2);
    }

    static {
        new C11415c();
        f29299c = new C11423j();
        f29300d = new C11413a();
        f29301e = new C11414b();
        new C11421h();
        new C11420g();
        new C11419f();
    }

    private Arrangement() {
    }

    /* renamed from: a */
    public final InterfaceC11424k m5178a() {
        return f29300d;
    }

    /* renamed from: b */
    public final InterfaceC11418e m5177b() {
        return f29301e;
    }

    /* renamed from: c */
    public final InterfaceC11416d m5176c() {
        return f29298b;
    }

    /* renamed from: d */
    public final InterfaceC11424k m5175d() {
        return f29299c;
    }

    /* renamed from: e */
    public final void m5174e(int i, int[] iArr, int[] iArr2, boolean z) {
        int m19530c;
        int m19530c2;
        Intrinsics.isThisObjectNull(iArr, "size");
        Intrinsics.isThisObjectNull(iArr2, "outPosition");
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            i3++;
            i4 += i5;
        }
        float f = (i - i4) / 2;
        if (!z) {
            int length2 = iArr.length;
            int i6 = 0;
            while (i2 < length2) {
                int i7 = iArr[i2];
                i2++;
                m19530c2 = C7037c.m19530c(f);
                iArr2[i6] = m19530c2;
                f += i7;
                i6++;
            }
            return;
        }
        int length3 = iArr.length - 1;
        if (length3 < 0) {
            return;
        }
        while (true) {
            int i8 = length3 - 1;
            int i9 = iArr[length3];
            m19530c = C7037c.m19530c(f);
            iArr2[length3] = m19530c;
            f += i9;
            if (i8 < 0) {
                return;
            }
            length3 = i8;
        }
    }

    /* renamed from: f */
    public final void m5173f(int[] iArr, int[] iArr2, boolean z) {
        Intrinsics.isThisObjectNull(iArr, "size");
        Intrinsics.isThisObjectNull(iArr2, "outPosition");
        int i = 0;
        if (!z) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = iArr[i];
                i++;
                iArr2[i2] = i3;
                i3 += i4;
                i2++;
            }
            return;
        }
        int length2 = iArr.length - 1;
        if (length2 < 0) {
            return;
        }
        while (true) {
            int i5 = length2 - 1;
            int i6 = iArr[length2];
            iArr2[length2] = i;
            i += i6;
            if (i5 < 0) {
                return;
            }
            length2 = i5;
        }
    }

    /* renamed from: g */
    public final void m5172g(int i, int[] iArr, int[] iArr2, boolean z) {
        Intrinsics.isThisObjectNull(iArr, "size");
        Intrinsics.isThisObjectNull(iArr2, "outPosition");
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            i3++;
            i4 += i5;
        }
        int i6 = i - i4;
        if (!z) {
            int length2 = iArr.length;
            int i7 = 0;
            while (i2 < length2) {
                int i8 = iArr[i2];
                i2++;
                iArr2[i7] = i6;
                i6 += i8;
                i7++;
            }
            return;
        }
        int length3 = iArr.length - 1;
        if (length3 < 0) {
            return;
        }
        while (true) {
            int i9 = length3 - 1;
            int i10 = iArr[length3];
            iArr2[length3] = i6;
            i6 += i10;
            if (i9 < 0) {
                return;
            }
            length3 = i9;
        }
    }

    /* renamed from: h */
    public final void m5171h(int i, int[] iArr, int[] iArr2, boolean z) {
        int m19530c;
        int m19530c2;
        Intrinsics.isThisObjectNull(iArr, "size");
        Intrinsics.isThisObjectNull(iArr2, "outPosition");
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            i3++;
            i4 += i5;
        }
        float length2 = (iArr.length == 0) ^ true ? (i - i4) / iArr.length : 0.0f;
        float f = length2 / 2;
        if (!z) {
            int length3 = iArr.length;
            int i6 = 0;
            while (i2 < length3) {
                int i7 = iArr[i2];
                i2++;
                m19530c2 = C7037c.m19530c(f);
                iArr2[i6] = m19530c2;
                f += i7 + length2;
                i6++;
            }
            return;
        }
        int length4 = iArr.length - 1;
        if (length4 < 0) {
            return;
        }
        while (true) {
            int i8 = length4 - 1;
            int i9 = iArr[length4];
            m19530c = C7037c.m19530c(f);
            iArr2[length4] = m19530c;
            f += i9 + length2;
            if (i8 < 0) {
                return;
            }
            length4 = i8;
        }
    }

    /* renamed from: i */
    public final void m5170i(int i, int[] iArr, int[] iArr2, boolean z) {
        int m19530c;
        int m19530c2;
        Intrinsics.isThisObjectNull(iArr, "size");
        Intrinsics.isThisObjectNull(iArr2, "outPosition");
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            i3++;
            i4 += i5;
        }
        float f = 0.0f;
        float length2 = iArr.length > 1 ? (i - i4) / (iArr.length - 1) : 0.0f;
        if (!z) {
            int length3 = iArr.length;
            int i6 = 0;
            while (i2 < length3) {
                int i7 = iArr[i2];
                i2++;
                m19530c2 = C7037c.m19530c(f);
                iArr2[i6] = m19530c2;
                f += i7 + length2;
                i6++;
            }
            return;
        }
        int length4 = iArr.length - 1;
        if (length4 < 0) {
            return;
        }
        while (true) {
            int i8 = length4 - 1;
            int i9 = iArr[length4];
            m19530c = C7037c.m19530c(f);
            iArr2[length4] = m19530c;
            f += i9 + length2;
            if (i8 < 0) {
                return;
            }
            length4 = i8;
        }
    }

    /* renamed from: j */
    public final void m5169j(int i, int[] iArr, int[] iArr2, boolean z) {
        int m19530c;
        int m19530c2;
        Intrinsics.isThisObjectNull(iArr, "size");
        Intrinsics.isThisObjectNull(iArr2, "outPosition");
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            i3++;
            i4 += i5;
        }
        float length2 = (i - i4) / (iArr.length + 1);
        if (!z) {
            int length3 = iArr.length;
            float f = length2;
            int i6 = 0;
            while (i2 < length3) {
                int i7 = iArr[i2];
                i2++;
                m19530c2 = C7037c.m19530c(f);
                iArr2[i6] = m19530c2;
                f += i7 + length2;
                i6++;
            }
            return;
        }
        int length4 = iArr.length - 1;
        if (length4 < 0) {
            return;
        }
        float f2 = length2;
        while (true) {
            int i8 = length4 - 1;
            int i9 = iArr[length4];
            m19530c = C7037c.m19530c(f2);
            iArr2[length4] = m19530c;
            f2 += i9 + length2;
            if (i8 < 0) {
                return;
            }
            length4 = i8;
        }
    }
}
