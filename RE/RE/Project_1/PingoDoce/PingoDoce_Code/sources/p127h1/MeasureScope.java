package p127h1;

import id.InterfaceC6108l;
import java.util.Map;
import p127h1.IntrinsicMeasureScope;
import p127h1.Placeable;
import p181jd.Intrinsics;
import p479z1.EnumC13618o;
import p489zc.C13769l0;

/* renamed from: h1.u */
/* loaded from: classes.dex */
public interface MeasureScope extends IntrinsicMeasureScope {

    /* compiled from: MeasureScope.kt */
    /* renamed from: h1.u$a */
    /* loaded from: classes.dex */
    public static final class C5806a {

        /* compiled from: MeasureScope.kt */
        /* renamed from: h1.u$a$a */
        /* loaded from: classes.dex */
        public static final class C5807a implements InterfaceC5805t {

            /* renamed from: a */
            private final int f16133a;

            /* renamed from: b */
            private final int f16134b;

            /* renamed from: c */
            private final Map f16135c;

            /* renamed from: d */
            final /* synthetic */ int f16136d;

            /* renamed from: e */
            final /* synthetic */ int f16137e;

            /* renamed from: f */
            final /* synthetic */ Map f16138f;

            /* renamed from: g */
            final /* synthetic */ MeasureScope f16139g;

            /* renamed from: h */
            final /* synthetic */ InterfaceC6108l f16140h;

            C5807a(int i, int i2, Map map, MeasureScope measureScope, InterfaceC6108l interfaceC6108l) {
                this.f16136d = i;
                this.f16137e = i2;
                this.f16138f = map;
                this.f16139g = measureScope;
                this.f16140h = interfaceC6108l;
                this.f16133a = i;
                this.f16134b = i2;
                this.f16135c = map;
            }

            /* renamed from: a */
            public int mo23005a() {
                return this.f16134b;
            }

            /* renamed from: b */
            public int mo23004b() {
                return this.f16133a;
            }

            /* renamed from: d */
            public void mo23003d() {
                Placeable.AbstractC5751a.C5752a c5752a = Placeable.AbstractC5751a.f16066a;
                int i = this.f16136d;
                EnumC13618o layoutDirection = this.f16139g.getLayoutDirection();
                InterfaceC6108l interfaceC6108l = this.f16140h;
                int m23145z = Placeable.AbstractC5751a.C5752a.m23145z(c5752a);
                EnumC13618o m23146y = Placeable.AbstractC5751a.C5752a.m23146y(c5752a);
                Placeable.AbstractC5751a.m23167f(i);
                Placeable.AbstractC5751a.m23168e(layoutDirection);
                interfaceC6108l.mo9587d(c5752a);
                Placeable.AbstractC5751a.m23167f(m23145z);
                Placeable.AbstractC5751a.m23168e(m23146y);
            }

            /* renamed from: e */
            public Map mo23002e() {
                return this.f16135c;
            }
        }

        /* renamed from: a */
        public static InterfaceC5805t m23000a(MeasureScope measureScope, int i, int i2, Map map, InterfaceC6108l interfaceC6108l) {
            Intrinsics.isThisObjectNull(measureScope, "this");
            Intrinsics.isThisObjectNull(map, "alignmentLines");
            Intrinsics.isThisObjectNull(interfaceC6108l, "placementBlock");
            return new C5807a(i, i2, map, measureScope, interfaceC6108l);
        }

        /* renamed from: b */
        public static /* synthetic */ InterfaceC5805t m22999b(MeasureScope measureScope, int i, int i2, Map map, InterfaceC6108l interfaceC6108l, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    map = C13769l0.m334e();
                }
                return measureScope.m23001s(i, i2, map, interfaceC6108l);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }

        /* renamed from: c */
        public static int m22998c(MeasureScope measureScope, float f) {
            Intrinsics.isThisObjectNull(measureScope, "this");
            return IntrinsicMeasureScope.C5774a.m23116a(measureScope, f);
        }

        /* renamed from: d */
        public static float m22997d(MeasureScope measureScope, int i) {
            Intrinsics.isThisObjectNull(measureScope, "this");
            return IntrinsicMeasureScope.C5774a.m23115b(measureScope, i);
        }

        /* renamed from: e */
        public static float m22996e(MeasureScope measureScope, long j) {
            Intrinsics.isThisObjectNull(measureScope, "this");
            return IntrinsicMeasureScope.C5774a.m23114c(measureScope, j);
        }

        /* renamed from: f */
        public static float m22995f(MeasureScope measureScope, float f) {
            Intrinsics.isThisObjectNull(measureScope, "this");
            return IntrinsicMeasureScope.C5774a.m23113d(measureScope, f);
        }

        /* renamed from: g */
        public static long m22994g(MeasureScope measureScope, long j) {
            Intrinsics.isThisObjectNull(measureScope, "this");
            return IntrinsicMeasureScope.C5774a.m23112e(measureScope, j);
        }
    }

    /* renamed from: s */
    InterfaceC5805t m23001s(int i, int i2, Map map, InterfaceC6108l interfaceC6108l);
}
