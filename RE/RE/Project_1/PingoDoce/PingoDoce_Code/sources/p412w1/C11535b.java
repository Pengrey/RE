package p412w1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextUtils;
import id.InterfaceC6097a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.EnumC6754a;
import kotlin.NoWhenBranchMatchedException;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p286p1.InterfaceC8345h;
import p286p1.TextStyle;
import p303q1.TextLayout;
import p325r1.WordBoundary;
import p347s1.PlaceholderSpan;
import p373u0.C10774f;
import p373u0.Rect;
import p393v0.C10995a1;
import p393v0.C11002c;
import p393v0.InterfaceC11064u;
import p457y1.C13061c;
import p457y1.EnumC13060b;
import p457y1.TextDecoration;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p489zc.C13780s;

/* compiled from: AndroidParagraph.android.kt */
/* renamed from: w1.b */
/* loaded from: classes.dex */
public final class C11535b implements InterfaceC8345h {

    /* renamed from: a */
    private final C11539d f29538a;

    /* renamed from: b */
    private final int f29539b;

    /* renamed from: c */
    private final boolean f29540c;

    /* renamed from: d */
    private final float f29541d;

    /* renamed from: e */
    private final TextLayout f29542e;

    /* renamed from: f */
    private final List f29543f;

    /* renamed from: g */
    private final InterfaceC13178g f29544g;

    /* compiled from: AndroidParagraph.android.kt */
    /* renamed from: w1.b$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C11536a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29545a;

        static {
            int[] iArr = new int[EnumC13060b.values().length];
            iArr[EnumC13060b.Ltr.ordinal()] = 1;
            iArr[EnumC13060b.Rtl.ordinal()] = 2;
            f29545a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidParagraph.android.kt */
    /* renamed from: w1.b$b */
    /* loaded from: classes.dex */
    public static final class C11537b extends AbstractC6438m implements InterfaceC6097a {
        C11537b() {
            super(0);
        }

        /* renamed from: a */
        public final WordBoundary mo42214q() {
            return new WordBoundary(C11535b.this.m4779s(), C11535b.m4782p(C11535b.this).m10503r());
        }
    }

    public C11535b(C11539d c11539d, int i, boolean z, float f) {
        List list;
        Rect rect;
        float m4780r;
        float m10518c;
        int m9348b;
        float m10509l;
        float f2;
        float m10518c2;
        InterfaceC13178g m1463b;
        Intrinsics.isThisObjectNull(c11539d, "paragraphIntrinsics");
        this.f29538a = c11539d;
        this.f29539b = i;
        this.f29540c = z;
        this.f29541d = f;
        if ((i >= 1 ? (byte) 1 : (byte) 0) != 0) {
            if ((m4777u() >= 0.0f ? (byte) 1 : (byte) 0) != 0) {
                TextStyle m4770e = c11539d.m4770e();
                int m4764b = C11541f.m4764b(m4770e.m15510q());
                C13061c m15510q = m4770e.m15510q();
                this.f29542e = new TextLayout(c11539d.m4772c(), m4777u(), m4778t(), m4764b, z ? TextUtils.TruncateAt.END : null, c11539d.m4769f(), 1.0f, 0.0f, false, i, 0, 0, m15510q == null ? false : C13061c.m1738j(m15510q.m1735m(), C13061c.f33964b.m1732c()) ? 1 : 0, null, null, c11539d.m4771d(), 28032, null);
                CharSequence m4772c = c11539d.m4772c();
                if (m4772c instanceof Spanned) {
                    Object[] spans = ((Spanned) m4772c).getSpans(0, m4772c.length(), PlaceholderSpan.class);
                    Intrinsics.checkIfNull(spans, "getSpans(0, length, PlaceholderSpan::class.java)");
                    ArrayList arrayList = new ArrayList(spans.length);
                    int length = spans.length;
                    int i2 = 0;
                    while (i2 < length) {
                        Object obj = spans[i2];
                        i2++;
                        PlaceholderSpan placeholderSpan = (PlaceholderSpan) obj;
                        Spanned spanned = (Spanned) m4772c;
                        int spanStart = spanned.getSpanStart(placeholderSpan);
                        int spanEnd = spanned.getSpanEnd(placeholderSpan);
                        int m10512i = this.f29542e.m10512i(spanStart);
                        boolean z2 = this.f29542e.m10515f(m10512i) > 0 && spanEnd > this.f29542e.m10514g(m10512i);
                        boolean z3 = spanEnd > this.f29542e.m10513h(m10512i);
                        if (z2 || z3) {
                            rect = null;
                        } else {
                            int i3 = C11536a.f29545a[m4781q(spanStart).ordinal()];
                            if (i3 == 1) {
                                m4780r = m4780r(spanStart, true);
                            } else if (i3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            } else {
                                m4780r = m4780r(spanStart, true) - placeholderSpan.m9346d();
                            }
                            float m9346d = placeholderSpan.m9346d() + m4780r;
                            TextLayout textLayout = this.f29542e;
                            switch (placeholderSpan.m9347c()) {
                                case 0:
                                    m10518c = textLayout.m10518c(m10512i);
                                    m9348b = placeholderSpan.m9348b();
                                    m10509l = m10518c - m9348b;
                                    break;
                                case 1:
                                    m10509l = textLayout.m10509l(m10512i);
                                    break;
                                case 2:
                                    m10518c = textLayout.m10517d(m10512i);
                                    m9348b = placeholderSpan.m9348b();
                                    m10509l = m10518c - m9348b;
                                    break;
                                case 3:
                                    m10509l = ((textLayout.m10509l(m10512i) + textLayout.m10517d(m10512i)) - placeholderSpan.m9348b()) / 2;
                                    break;
                                case 4:
                                    f2 = placeholderSpan.m9349a().ascent;
                                    m10518c2 = textLayout.m10518c(m10512i);
                                    m10509l = f2 + m10518c2;
                                    break;
                                case 5:
                                    m10509l = (placeholderSpan.m9349a().descent + textLayout.m10518c(m10512i)) - placeholderSpan.m9348b();
                                    break;
                                case 6:
                                    Paint.FontMetricsInt m9349a = placeholderSpan.m9349a();
                                    f2 = ((m9349a.ascent + m9349a.descent) - placeholderSpan.m9348b()) / 2;
                                    m10518c2 = textLayout.m10518c(m10512i);
                                    m10509l = f2 + m10518c2;
                                    break;
                                default:
                                    throw new IllegalStateException("unexpected verticalAlignment");
                            }
                            rect = new Rect(m4780r, m10509l, m9346d, placeholderSpan.m9348b() + m10509l);
                        }
                        arrayList.add(rect);
                    }
                    list = arrayList;
                } else {
                    list = C13780s.m197g();
                }
                this.f29543f = list;
                m1463b = LazyJVM.m1463b(EnumC6754a.NONE, new C11537b());
                this.f29544g = m1463b;
                return;
            }
            throw new IllegalArgumentException("width should not be negative".toString());
        }
        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
    }

    /* renamed from: p */
    public static final /* synthetic */ TextLayout m4782p(C11535b c11535b) {
        return c11535b.f29542e;
    }

    /* renamed from: a */
    public float mo15718a() {
        return this.f29542e.m10519b();
    }

    /* renamed from: b */
    public Rect mo15717b(int i) {
        float m10505p = this.f29542e.m10505p(i);
        float m10505p2 = this.f29542e.m10505p(i + 1);
        int m10512i = this.f29542e.m10512i(i);
        return new Rect(m10505p, this.f29542e.m10509l(m10512i), m10505p2, this.f29542e.m10517d(m10512i));
    }

    /* renamed from: c */
    public List mo15716c() {
        return this.f29543f;
    }

    /* renamed from: d */
    public int mo15715d(int i) {
        return this.f29542e.m10510k(i);
    }

    /* renamed from: e */
    public int mo15714e(int i, boolean z) {
        if (z) {
            return this.f29542e.m10508m(i);
        }
        return this.f29542e.m10513h(i);
    }

    /* renamed from: f */
    public int mo15713f() {
        return this.f29542e.m10516e();
    }

    /* renamed from: g */
    public EnumC13060b mo15712g(int i) {
        return this.f29542e.m10506o(this.f29542e.m10512i(i)) == 1 ? EnumC13060b.Ltr : EnumC13060b.Rtl;
    }

    /* renamed from: h */
    public boolean mo15711h() {
        return this.f29542e.m10520a();
    }

    /* renamed from: i */
    public float mo15710i(int i) {
        return this.f29542e.m10509l(i);
    }

    /* renamed from: j */
    public float mo15709j() {
        if (this.f29539b < mo15713f()) {
            return this.f29542e.m10518c(this.f29539b - 1);
        }
        return this.f29542e.m10518c(mo15713f() - 1);
    }

    /* renamed from: k */
    public int mo15708k(float f) {
        return this.f29542e.m10511j((int) f);
    }

    /* renamed from: l */
    public int mo15707l(int i) {
        return this.f29542e.m10512i(i);
    }

    /* renamed from: m */
    public float mo15706m() {
        return this.f29542e.m10518c(0);
    }

    /* renamed from: n */
    public void mo15705n(InterfaceC11064u interfaceC11064u, long j, C10995a1 c10995a1, TextDecoration textDecoration) {
        Intrinsics.isThisObjectNull(interfaceC11064u, "canvas");
        m4778t().m4762a(j);
        m4778t().m4761b(c10995a1);
        m4778t().m4760c(textDecoration);
        Canvas m6596c = C11002c.m6596c(interfaceC11064u);
        if (mo15711h()) {
            m6596c.save();
            m6596c.clipRect(0.0f, 0.0f, m4777u(), mo15718a());
        }
        this.f29542e.m10501t(m6596c);
        if (mo15711h()) {
            m6596c.restore();
        }
    }

    /* renamed from: o */
    public int mo15704o(long j) {
        return this.f29542e.m10507n(this.f29542e.m10511j((int) C10774f.m7144l(j)), C10774f.m7145k(j));
    }

    /* renamed from: q */
    public EnumC13060b m4781q(int i) {
        if (this.f29542e.m10502s(i)) {
            return EnumC13060b.Rtl;
        }
        return EnumC13060b.Ltr;
    }

    /* renamed from: r */
    public float m4780r(int i, boolean z) {
        if (z) {
            return this.f29542e.m10505p(i);
        }
        return this.f29542e.m10504q(i);
    }

    /* renamed from: s */
    public final Locale m4779s() {
        Locale textLocale = this.f29538a.m4768g().getTextLocale();
        Intrinsics.checkIfNull(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return textLocale;
    }

    /* renamed from: t */
    public final C11542g m4778t() {
        return this.f29538a.m4768g();
    }

    /* renamed from: u */
    public float m4777u() {
        return this.f29541d;
    }
}
