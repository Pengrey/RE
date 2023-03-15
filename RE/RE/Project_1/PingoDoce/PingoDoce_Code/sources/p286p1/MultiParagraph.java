package p286p1;

import java.util.ArrayList;
import java.util.List;
import p181jd.Intrinsics;
import p373u0.C10774f;
import p373u0.Rect;
import p393v0.C10995a1;
import p393v0.InterfaceC11064u;
import p457y1.EnumC13060b;
import p457y1.TextDecoration;
import p489zc.C13777q;
import p489zc.C13780s;
import p489zc.MutableCollections;
import p489zc._Collections;

/* renamed from: p1.d */
/* loaded from: classes.dex */
public final class MultiParagraph {

    /* renamed from: a */
    private final MultiParagraphIntrinsics f21591a;

    /* renamed from: b */
    private final int f21592b;

    /* renamed from: c */
    private final boolean f21593c;

    /* renamed from: d */
    private final float f21594d;

    /* renamed from: e */
    private final float f21595e;

    /* renamed from: f */
    private final int f21596f;

    /* renamed from: g */
    private final List f21597g;

    /* renamed from: h */
    private final List f21598h;

    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i, boolean z, float f) {
        boolean z2;
        int m195i;
        Intrinsics.isThisObjectNull(multiParagraphIntrinsics, "intrinsics");
        this.f21591a = multiParagraphIntrinsics;
        this.f21592b = i;
        ArrayList arrayList = new ArrayList();
        List m15728e = multiParagraphIntrinsics.m15728e();
        int size = m15728e.size();
        float f2 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            int i4 = i2 + 1;
            C8347j c8347j = (C8347j) m15728e.get(i2);
            InterfaceC8345h m15681a = Paragraph.m15681a(c8347j.m15686b(), this.f21592b - i3, z, f);
            float mo15718a = f2 + m15681a.mo15718a();
            int mo15713f = i3 + m15681a.mo15713f();
            arrayList.add(new C8346i(m15681a, c8347j.m15685c(), c8347j.m15687a(), i3, mo15713f, f2, mo15718a));
            if (m15681a.mo15711h()) {
                i3 = mo15713f;
            } else {
                i3 = mo15713f;
                if (i3 == this.f21592b) {
                    m195i = C13780s.m195i(this.f21591a.m15728e());
                    if (i2 != m195i) {
                    }
                }
                i2 = i4;
                f2 = mo15718a;
            }
            z2 = true;
            f2 = mo15718a;
            break;
        }
        z2 = false;
        this.f21595e = f2;
        this.f21596f = i3;
        this.f21593c = z2;
        this.f21598h = arrayList;
        this.f21594d = f;
        List arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            int i6 = i5 + 1;
            C8346i c8346i = (C8346i) arrayList.get(i5);
            List<Rect> mo15716c = c8346i.m15699e().mo15716c();
            ArrayList arrayList3 = new ArrayList(mo15716c.size());
            int size3 = mo15716c.size();
            int i7 = 0;
            while (i7 < size3) {
                int i8 = i7 + 1;
                Rect rect = mo15716c.get(i7);
                arrayList3.add(rect == null ? null : c8346i.m15695i(rect));
                i7 = i8;
            }
            MutableCollections.m181u(arrayList2, arrayList3);
            i5 = i6;
        }
        if (arrayList2.size() < m15746f().m15727f().size()) {
            int size4 = m15746f().m15727f().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            int i9 = 0;
            while (i9 < size4) {
                i9++;
                arrayList4.add(null);
            }
            arrayList2 = _Collections.m467b0(arrayList2, arrayList4);
        }
        this.f21597g = arrayList2;
    }

    /* renamed from: a */
    private final AnnotatedString m15751a() {
        return this.f21591a.m15729d();
    }

    /* renamed from: s */
    private final void m15733s(int i) {
        boolean z = false;
        if (i >= 0 && i < m15751a().m15771f().length()) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + m15751a().length() + ')').toString());
    }

    /* renamed from: t */
    private final void m15732t(int i) {
        boolean z = false;
        if (i >= 0 && i <= m15751a().m15771f().length()) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + m15751a().length() + ']').toString());
    }

    /* renamed from: u */
    private final void m15731u(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f21596f) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("lineIndex(" + i + ") is out of bounds [0, " + i + ')').toString());
    }

    /* renamed from: b */
    public final Rect m15750b(int i) {
        m15733s(i);
        C8346i c8346i = (C8346i) this.f21598h.get(C8344g.m15721a(this.f21598h, i));
        return c8346i.m15695i(c8346i.m15699e().mo15717b(c8346i.m15690n(i)));
    }

    /* renamed from: c */
    public final boolean m15749c() {
        return this.f21593c;
    }

    /* renamed from: d */
    public final float m15748d() {
        if (this.f21598h.isEmpty()) {
            return 0.0f;
        }
        return ((C8346i) this.f21598h.get(0)).m15699e().mo15706m();
    }

    /* renamed from: e */
    public final float m15747e() {
        return this.f21595e;
    }

    /* renamed from: f */
    public final MultiParagraphIntrinsics m15746f() {
        return this.f21591a;
    }

    /* renamed from: g */
    public final float m15745g() {
        if (this.f21598h.isEmpty()) {
            return 0.0f;
        }
        C8346i c8346i = (C8346i) C13777q.m249W(this.f21598h);
        return c8346i.m15692l(c8346i.m15699e().mo15709j());
    }

    /* renamed from: h */
    public final int m15744h() {
        return this.f21596f;
    }

    /* renamed from: i */
    public final int m15743i(int i, boolean z) {
        m15731u(i);
        C8346i c8346i = (C8346i) this.f21598h.get(C8344g.m15720b(this.f21598h, i));
        return c8346i.m15694j(c8346i.m15699e().mo15714e(c8346i.m15689o(i), z));
    }

    /* renamed from: j */
    public final int m15742j(int i) {
        int m15721a;
        m15732t(i);
        if (i == m15751a().length()) {
            m15721a = C13780s.m195i(this.f21598h);
        } else {
            m15721a = C8344g.m15721a(this.f21598h, i);
        }
        C8346i c8346i = (C8346i) this.f21598h.get(m15721a);
        return c8346i.m15693k(c8346i.m15699e().mo15707l(c8346i.m15690n(i)));
    }

    /* renamed from: k */
    public final int m15741k(float f) {
        int m195i;
        if (f <= 0.0f) {
            m195i = 0;
        } else {
            m195i = f >= this.f21595e ? C13780s.m195i(this.f21598h) : C8344g.m15719c(this.f21598h, f);
        }
        C8346i c8346i = (C8346i) this.f21598h.get(m195i);
        if (c8346i.m15700d() == 0) {
            return Math.max(0, c8346i.m15698f() - 1);
        }
        return c8346i.m15693k(c8346i.m15699e().mo15708k(c8346i.m15688p(f)));
    }

    /* renamed from: l */
    public final int m15740l(int i) {
        m15731u(i);
        C8346i c8346i = (C8346i) this.f21598h.get(C8344g.m15720b(this.f21598h, i));
        return c8346i.m15694j(c8346i.m15699e().mo15715d(c8346i.m15689o(i)));
    }

    /* renamed from: m */
    public final float m15739m(int i) {
        m15731u(i);
        C8346i c8346i = (C8346i) this.f21598h.get(C8344g.m15720b(this.f21598h, i));
        return c8346i.m15692l(c8346i.m15699e().mo15710i(c8346i.m15689o(i)));
    }

    /* renamed from: n */
    public final int m15738n(long j) {
        int m195i;
        if (C10774f.m7144l(j) <= 0.0f) {
            m195i = 0;
        } else {
            m195i = C10774f.m7144l(j) >= this.f21595e ? C13780s.m195i(this.f21598h) : C8344g.m15719c(this.f21598h, C10774f.m7144l(j));
        }
        C8346i c8346i = (C8346i) this.f21598h.get(m195i);
        if (c8346i.m15700d() == 0) {
            return Math.max(0, c8346i.m15698f() - 1);
        }
        return c8346i.m15694j(c8346i.m15699e().mo15704o(c8346i.m15691m(j)));
    }

    /* renamed from: o */
    public final EnumC13060b m15737o(int i) {
        int m15721a;
        m15732t(i);
        if (i == m15751a().length()) {
            m15721a = C13780s.m195i(this.f21598h);
        } else {
            m15721a = C8344g.m15721a(this.f21598h, i);
        }
        C8346i c8346i = (C8346i) this.f21598h.get(m15721a);
        return c8346i.m15699e().mo15712g(c8346i.m15690n(i));
    }

    /* renamed from: p */
    public final List m15736p() {
        return this.f21597g;
    }

    /* renamed from: q */
    public final float m15735q() {
        return this.f21594d;
    }

    /* renamed from: r */
    public final void m15734r(InterfaceC11064u interfaceC11064u, long j, C10995a1 c10995a1, TextDecoration textDecoration) {
        Intrinsics.isThisObjectNull(interfaceC11064u, "canvas");
        interfaceC11064u.m6269h();
        List list = this.f21598h;
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            C8346i c8346i = (C8346i) list.get(i);
            c8346i.m15699e().mo15705n(interfaceC11064u, j, c10995a1, textDecoration);
            interfaceC11064u.m6275b(0.0f, c8346i.m15699e().mo15718a());
            i = i2;
        }
        interfaceC11064u.m6270g();
    }
}
