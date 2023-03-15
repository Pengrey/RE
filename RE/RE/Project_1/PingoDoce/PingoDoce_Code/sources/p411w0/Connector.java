package p411w0;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p411w0.C11507b;

/* renamed from: w0.f */
/* loaded from: classes.dex */
public class Connector {

    /* renamed from: d */
    public static final C11514a f29485d = new C11514a(null);

    /* renamed from: a */
    private final AbstractC11509c f29486a;

    /* renamed from: b */
    private final AbstractC11509c f29487b;

    /* renamed from: c */
    private final float[] f29488c;

    /* compiled from: Connector.kt */
    /* renamed from: w0.f$a */
    /* loaded from: classes.dex */
    public static final class C11514a {

        /* compiled from: Connector.kt */
        /* renamed from: w0.f$a$a */
        /* loaded from: classes.dex */
        public static final class C11515a extends Connector {
            C11515a(AbstractC11509c abstractC11509c, int i) {
                super(abstractC11509c, abstractC11509c, i, null);
            }

            /* renamed from: a */
            public float[] m4873a(float[] fArr) {
                Intrinsics.isThisObjectNull(fArr, "v");
                return fArr;
            }
        }

        private C11514a() {
        }

        public /* synthetic */ C11514a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static final /* synthetic */ float[] m4876a(C11514a c11514a, AbstractC11509c abstractC11509c, AbstractC11509c abstractC11509c2, int i) {
            return c11514a.m4875b(abstractC11509c, abstractC11509c2, i);
        }

        /* renamed from: b */
        private final float[] m4875b(AbstractC11509c abstractC11509c, AbstractC11509c abstractC11509c2, int i) {
            if (C11520j.m4853e(i, C11520j.f29502a.m4852a())) {
                long m4920f = abstractC11509c.m4920f();
                C11507b.C11508a c11508a = C11507b.f29451a;
                boolean m4932e = C11507b.m4932e(m4920f, c11508a.m4927b());
                boolean m4932e2 = C11507b.m4932e(abstractC11509c2.m4920f(), c11508a.m4927b());
                if (m4932e && m4932e2) {
                    return null;
                }
                if (m4932e || m4932e2) {
                    if (!m4932e) {
                        abstractC11509c = abstractC11509c2;
                    }
                    Rgb rgb = (Rgb) abstractC11509c;
                    float[] m4805c = m4932e ? rgb.m4836r().m4805c() : C11517g.f29492a.m4868c();
                    float[] m4805c2 = m4932e2 ? rgb.m4836r().m4805c() : C11517g.f29492a.m4868c();
                    return new float[]{m4805c[0] / m4805c2[0], m4805c[1] / m4805c2[1], m4805c[2] / m4805c2[2]};
                }
                return null;
            }
            return null;
        }

        /* renamed from: c */
        public final Connector m4874c(AbstractC11509c abstractC11509c) {
            Intrinsics.isThisObjectNull(abstractC11509c, "source");
            return new C11515a(abstractC11509c, C11520j.f29502a.m4850c());
        }
    }

    /* compiled from: Connector.kt */
    /* renamed from: w0.f$b */
    /* loaded from: classes.dex */
    public static final class C11516b extends Connector {

        /* renamed from: e */
        private final Rgb f29489e;

        /* renamed from: f */
        private final Rgb f29490f;

        /* renamed from: g */
        private final float[] f29491g;

        private C11516b(Rgb rgb, Rgb rgb2, int i) {
            super(rgb, rgb2, rgb, rgb2, i, null, null);
            this.f29489e = rgb;
            this.f29490f = rgb2;
            this.f29491g = m4871b(rgb, rgb2, i);
        }

        public /* synthetic */ C11516b(Rgb rgb, Rgb rgb2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rgb, rgb2, i);
        }

        /* renamed from: b */
        private final float[] m4871b(Rgb rgb, Rgb rgb2, int i) {
            if (ColorSpace.m4911f(rgb.m4836r(), rgb2.m4836r())) {
                return ColorSpace.m4906k(rgb2.m4840n(), rgb.m4837q());
            }
            float[] m4837q = rgb.m4837q();
            float[] m4840n = rgb2.m4840n();
            float[] m4805c = rgb.m4836r().m4805c();
            float[] m4805c2 = rgb2.m4836r().m4805c();
            C11533m m4836r = rgb.m4836r();
            C11517g c11517g = C11517g.f29492a;
            if (!ColorSpace.m4911f(m4836r, c11517g.m4869b())) {
                float[] m4939c = AbstractC11502a.f29447b.m4938a().m4939c();
                float[] m4868c = c11517g.m4868c();
                float[] copyOf = Arrays.copyOf(m4868c, m4868c.length);
                Intrinsics.checkIfNull(copyOf, "copyOf(this, size)");
                m4837q = ColorSpace.m4906k(ColorSpace.m4912e(m4939c, m4805c, copyOf), rgb.m4837q());
            }
            if (!ColorSpace.m4911f(rgb2.m4836r(), c11517g.m4869b())) {
                float[] m4939c2 = AbstractC11502a.f29447b.m4938a().m4939c();
                float[] m4868c2 = c11517g.m4868c();
                float[] copyOf2 = Arrays.copyOf(m4868c2, m4868c2.length);
                Intrinsics.checkIfNull(copyOf2, "copyOf(this, size)");
                m4840n = ColorSpace.m4907j(ColorSpace.m4906k(ColorSpace.m4912e(m4939c2, m4805c2, copyOf2), rgb2.m4837q()));
            }
            if (C11520j.m4853e(i, C11520j.f29502a.m4852a())) {
                m4837q = ColorSpace.m4905l(new float[]{m4805c[0] / m4805c2[0], m4805c[1] / m4805c2[1], m4805c[2] / m4805c2[2]}, m4837q);
            }
            return ColorSpace.m4906k(m4840n, m4837q);
        }

        /* renamed from: a */
        public float[] m4872a(float[] fArr) {
            Intrinsics.isThisObjectNull(fArr, "v");
            fArr[0] = (float) ((Number) this.f29489e.m4842l().mo9587d(Double.valueOf(fArr[0]))).doubleValue();
            fArr[1] = (float) ((Number) this.f29489e.m4842l().mo9587d(Double.valueOf(fArr[1]))).doubleValue();
            fArr[2] = (float) ((Number) this.f29489e.m4842l().mo9587d(Double.valueOf(fArr[2]))).doubleValue();
            ColorSpace.m4904m(this.f29491g, fArr);
            fArr[0] = (float) ((Number) this.f29490f.m4839o().mo9587d(Double.valueOf(fArr[0]))).doubleValue();
            fArr[1] = (float) ((Number) this.f29490f.m4839o().mo9587d(Double.valueOf(fArr[1]))).doubleValue();
            fArr[2] = (float) ((Number) this.f29490f.m4839o().mo9587d(Double.valueOf(fArr[2]))).doubleValue();
            return fArr;
        }
    }

    public /* synthetic */ Connector(AbstractC11509c abstractC11509c, AbstractC11509c abstractC11509c2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC11509c, abstractC11509c2, i);
    }

    private Connector(AbstractC11509c abstractC11509c, AbstractC11509c abstractC11509c2, AbstractC11509c abstractC11509c3, AbstractC11509c abstractC11509c4, int i, float[] fArr) {
        this.f29486a = abstractC11509c3;
        this.f29487b = abstractC11509c4;
        this.f29488c = fArr;
    }

    public /* synthetic */ Connector(AbstractC11509c abstractC11509c, AbstractC11509c abstractC11509c2, AbstractC11509c abstractC11509c3, AbstractC11509c abstractC11509c4, int i, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC11509c, abstractC11509c2, abstractC11509c3, abstractC11509c4, i, fArr);
    }

    /* renamed from: a */
    public float[] m4877a(float[] fArr) {
        Intrinsics.isThisObjectNull(fArr, "v");
        float[] m4917i = this.f29486a.m4917i(fArr);
        float[] fArr2 = this.f29488c;
        if (fArr2 != null) {
            m4917i[0] = m4917i[0] * fArr2[0];
            m4917i[1] = m4917i[1] * fArr2[1];
            m4917i[2] = m4917i[2] * fArr2[2];
        }
        return this.f29487b.m4925a(m4917i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private Connector(p411w0.AbstractC11509c r13, p411w0.AbstractC11509c r14, int r15) {
        /*
            r12 = this;
            long r0 = r13.m4920f()
            w0.b$a r2 = p411w0.C11507b.f29451a
            long r3 = r2.m4927b()
            boolean r0 = p411w0.C11507b.m4932e(r0, r3)
            r1 = 2
            r3 = 0
            if (r0 == 0) goto L1e
            w0.g r0 = p411w0.C11517g.f29492a
            w0.m r0 = r0.m4869b()
            w0.c r0 = p411w0.ColorSpace.m4913d(r13, r0, r3, r1, r3)
            r7 = r0
            goto L1f
        L1e:
            r7 = r13
        L1f:
            long r4 = r14.m4920f()
            long r8 = r2.m4927b()
            boolean r0 = p411w0.C11507b.m4932e(r4, r8)
            if (r0 == 0) goto L39
            w0.g r0 = p411w0.C11517g.f29492a
            w0.m r0 = r0.m4869b()
            w0.c r0 = p411w0.ColorSpace.m4913d(r14, r0, r3, r1, r3)
            r8 = r0
            goto L3a
        L39:
            r8 = r14
        L3a:
            w0.f$a r0 = p411w0.Connector.f29485d
            float[] r10 = p411w0.Connector.C11514a.m4876a(r0, r13, r14, r15)
            r11 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p411w0.Connector.<init>(w0.c, w0.c, int):void");
    }
}
