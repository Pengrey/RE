package p022b0;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p286p1.AnnotatedString;
import p286p1.C8392u;
import p286p1.C8397z;
import p286p1.MultiParagraph;
import p286p1.MultiParagraphIntrinsics;
import p286p1.TextLayoutResult;
import p286p1.TextPainter;
import p286p1.TextStyle;
import p297pd._Ranges;
import p359t1.InterfaceC10362d;
import p393v0.InterfaceC11064u;
import p457y1.C13070h;
import p479z1.C13599b;
import p479z1.C13601c;
import p479z1.C13617n;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: b0.e */
/* loaded from: classes.dex */
public final class TextDelegate {

    /* renamed from: k */
    public static final C1786a f5460k = new C1786a(null);

    /* renamed from: a */
    private final AnnotatedString f5461a;

    /* renamed from: b */
    private final TextStyle f5462b;

    /* renamed from: c */
    private final int f5463c;

    /* renamed from: d */
    private final boolean f5464d;

    /* renamed from: e */
    private final int f5465e;

    /* renamed from: f */
    private final Density f5466f;

    /* renamed from: g */
    private final InterfaceC10362d.InterfaceC10363a f5467g;

    /* renamed from: h */
    private final List f5468h;

    /* renamed from: i */
    private MultiParagraphIntrinsics f5469i;

    /* renamed from: j */
    private EnumC13618o f5470j;

    /* compiled from: TextDelegate.kt */
    /* renamed from: b0.e$a */
    /* loaded from: classes.dex */
    public static final class C1786a {
        private C1786a() {
        }

        public /* synthetic */ C1786a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m35371a(InterfaceC11064u interfaceC11064u, C8392u c8392u) {
            Intrinsics.isThisObjectNull(interfaceC11064u, "canvas");
            Intrinsics.isThisObjectNull(c8392u, "textLayoutResult");
            TextPainter.f21717a.m15545a(interfaceC11064u, c8392u);
        }
    }

    private TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i, boolean z, int i2, Density density, InterfaceC10362d.InterfaceC10363a interfaceC10363a, List list) {
        this.f5461a = annotatedString;
        this.f5462b = textStyle;
        this.f5463c = i;
        this.f5464d = z;
        this.f5465e = i2;
        this.f5466f = density;
        this.f5467g = interfaceC10363a;
        this.f5468h = list;
        if (!(i > 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i, boolean z, int i2, Density density, InterfaceC10362d.InterfaceC10363a interfaceC10363a, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, i, z, i2, density, interfaceC10363a, list);
    }

    /* renamed from: c */
    private final MultiParagraphIntrinsics m35379c() {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f5469i;
        if (multiParagraphIntrinsics != null) {
            return multiParagraphIntrinsics;
        }
        throw new IllegalStateException("layoutForIntrinsics must be called first");
    }

    /* renamed from: j */
    private final MultiParagraph m35372j(long j, EnumC13618o enumC13618o) {
        m35373i(enumC13618o);
        float m914p = C13599b.m914p(j);
        float m916n = ((this.f5464d || C13070h.m1692d(m35378d(), C13070h.f33992a.m1688b())) && C13599b.m920j(j)) ? C13599b.m916n(j) : Float.POSITIVE_INFINITY;
        int i = !this.f5464d && C13070h.m1692d(m35378d(), C13070h.f33992a.m1688b()) ? 1 : this.f5463c;
        if (!(m914p == m916n)) {
            m916n = _Ranges.m14997l(m35379c().mo15683b(), m914p, m916n);
        }
        return new MultiParagraph(m35379c(), i, C13070h.m1692d(m35378d(), C13070h.f33992a.m1688b()), m916n);
    }

    /* renamed from: a */
    public final Density m35381a() {
        return this.f5466f;
    }

    /* renamed from: b */
    public final int m35380b() {
        return this.f5463c;
    }

    /* renamed from: d */
    public final int m35378d() {
        return this.f5465e;
    }

    /* renamed from: e */
    public final boolean m35377e() {
        return this.f5464d;
    }

    /* renamed from: f */
    public final TextStyle m35376f() {
        return this.f5462b;
    }

    /* renamed from: g */
    public final AnnotatedString m35375g() {
        return this.f5461a;
    }

    /* renamed from: h */
    public final C8392u m35374h(long j, EnumC13618o enumC13618o, C8392u c8392u) {
        Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
        if (c8392u != null && TextLayoutHelper.m35366a(c8392u, this.f5461a, this.f5462b, this.f5468h, this.f5463c, this.f5464d, m35378d(), this.f5466f, enumC13618o, this.f5467g, j)) {
            return c8392u.m15565a(TextLayoutResult.m15576b(c8392u.m15558h(), null, m35376f(), null, 0, false, 0, null, null, null, j, 509, null), C13601c.m904d(j, C13617n.m819a((int) Math.ceil(c8392u.m15550p().m15735q()), (int) Math.ceil(c8392u.m15550p().m15747e()))));
        }
        MultiParagraph m35372j = m35372j(j, enumC13618o);
        return new C8392u(new TextLayoutResult(this.f5461a, this.f5462b, this.f5468h, this.f5463c, this.f5464d, m35378d(), this.f5466f, enumC13618o, this.f5467g, j, null), m35372j, C13601c.m904d(j, C13617n.m819a((int) Math.ceil(m35372j.m15735q()), (int) Math.ceil(m35372j.m15747e()))), null);
    }

    /* renamed from: i */
    public final void m35373i(EnumC13618o enumC13618o) {
        Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f5469i;
        if (multiParagraphIntrinsics == null || enumC13618o != this.f5470j) {
            this.f5470j = enumC13618o;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.f5461a, C8397z.m15500a(this.f5462b, enumC13618o), this.f5468h, this.f5466f, this.f5467g);
        }
        this.f5469i = multiParagraphIntrinsics;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ TextDelegate(p286p1.AnnotatedString r13, p286p1.TextStyle r14, int r15, boolean r16, int r17, p479z1.Density r18, p359t1.InterfaceC10362d.InterfaceC10363a r19, java.util.List r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 4
            if (r1 == 0) goto Lb
            r1 = 2147483647(0x7fffffff, float:NaN)
            r5 = r1
            goto Lc
        Lb:
            r5 = r15
        Lc:
            r1 = r0 & 8
            if (r1 == 0) goto L13
            r1 = 1
            r6 = r1
            goto L15
        L13:
            r6 = r16
        L15:
            r1 = r0 & 16
            if (r1 == 0) goto L21
            y1.h$a r1 = p457y1.C13070h.f33992a
            int r1 = r1.m1689a()
            r7 = r1
            goto L23
        L21:
            r7 = r17
        L23:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L2d
            java.util.List r0 = p489zc.C13777q.m237g()
            r10 = r0
            goto L2f
        L2d:
            r10 = r20
        L2f:
            r11 = 0
            r2 = r12
            r3 = r13
            r4 = r14
            r8 = r18
            r9 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p022b0.TextDelegate.<init>(p1.a, p1.y, int, boolean, int, z1.d, t1.d$a, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
