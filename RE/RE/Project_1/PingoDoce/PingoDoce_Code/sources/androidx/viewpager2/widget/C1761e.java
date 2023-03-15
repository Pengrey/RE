package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.viewpager2.widget.e */
/* loaded from: classes.dex */
public final class C1761e extends RecyclerView.AbstractC1555t {

    /* renamed from: a */
    private ViewPager2.AbstractC1747i f5398a;

    /* renamed from: b */
    private final ViewPager2 f5399b;

    /* renamed from: c */
    private final RecyclerView f5400c;

    /* renamed from: d */
    private final LinearLayoutManager f5401d;

    /* renamed from: e */
    private int f5402e;

    /* renamed from: f */
    private int f5403f;

    /* renamed from: g */
    private C1762a f5404g;

    /* renamed from: h */
    private int f5405h;

    /* renamed from: i */
    private int f5406i;

    /* renamed from: j */
    private boolean f5407j;

    /* renamed from: k */
    private boolean f5408k;

    /* renamed from: l */
    private boolean f5409l;

    /* renamed from: m */
    private boolean f5410m;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollEventAdapter.java */
    /* renamed from: androidx.viewpager2.widget.e$a */
    /* loaded from: classes.dex */
    public static final class C1762a {

        /* renamed from: a */
        int f5411a;

        /* renamed from: b */
        float f5412b;

        /* renamed from: c */
        int f5413c;

        C1762a() {
        }

        /* renamed from: a */
        void m35423a() {
            this.f5411a = -1;
            this.f5412b = 0.0f;
            this.f5413c = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1761e(ViewPager2 viewPager2) {
        this.f5399b = viewPager2;
        RecyclerView recyclerView = viewPager2.f5358F;
        this.f5400c = recyclerView;
        this.f5401d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f5404g = new C1762a();
        m35427n();
    }

    /* renamed from: c */
    private void m35438c(int i, float f, int i2) {
        ViewPager2.AbstractC1747i abstractC1747i = this.f5398a;
        if (abstractC1747i != null) {
            abstractC1747i.mo29095b(i, f, i2);
        }
    }

    /* renamed from: d */
    private void m35437d(int i) {
        ViewPager2.AbstractC1747i abstractC1747i = this.f5398a;
        if (abstractC1747i != null) {
            abstractC1747i.mo29094c(i);
        }
    }

    /* renamed from: e */
    private void m35436e(int i) {
        if ((this.f5402e == 3 && this.f5403f == 0) || this.f5403f == i) {
            return;
        }
        this.f5403f = i;
        ViewPager2.AbstractC1747i abstractC1747i = this.f5398a;
        if (abstractC1747i != null) {
            abstractC1747i.mo29096a(i);
        }
    }

    /* renamed from: f */
    private int m35435f() {
        return this.f5401d.m36771b2();
    }

    /* renamed from: k */
    private boolean m35430k() {
        int i = this.f5402e;
        return i == 1 || i == 4;
    }

    /* renamed from: n */
    private void m35427n() {
        this.f5402e = 0;
        this.f5403f = 0;
        this.f5404g.m35423a();
        this.f5405h = -1;
        this.f5406i = -1;
        this.f5407j = false;
        this.f5408k = false;
        this.f5410m = false;
        this.f5409l = false;
    }

    /* renamed from: p */
    private void m35425p(boolean z) {
        this.f5410m = z;
        this.f5402e = z ? 4 : 1;
        int i = this.f5406i;
        if (i != -1) {
            this.f5405h = i;
            this.f5406i = -1;
        } else if (this.f5405h == -1) {
            this.f5405h = m35435f();
        }
        m35436e(1);
    }

    /* renamed from: q */
    private void m35424q() {
        int top;
        C1762a c1762a = this.f5404g;
        int m36771b2 = this.f5401d.m36771b2();
        c1762a.f5411a = m36771b2;
        if (m36771b2 == -1) {
            c1762a.m35423a();
            return;
        }
        View mo36496D = this.f5401d.mo36496D(m36771b2);
        if (mo36496D == null) {
            c1762a.m35423a();
            return;
        }
        int m36459b0 = this.f5401d.m36459b0(mo36496D);
        int m36437k0 = this.f5401d.m36437k0(mo36496D);
        int m36432n0 = this.f5401d.m36432n0(mo36496D);
        int m36487I = this.f5401d.m36487I(mo36496D);
        ViewGroup.LayoutParams layoutParams = mo36496D.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            m36459b0 += marginLayoutParams.leftMargin;
            m36437k0 += marginLayoutParams.rightMargin;
            m36432n0 += marginLayoutParams.topMargin;
            m36487I += marginLayoutParams.bottomMargin;
        }
        int height = mo36496D.getHeight() + m36432n0 + m36487I;
        int width = mo36496D.getWidth() + m36459b0 + m36437k0;
        if (this.f5401d.m36754s2() == 0) {
            top = (mo36496D.getLeft() - m36459b0) - this.f5400c.getPaddingLeft();
            if (this.f5399b.m35495d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (mo36496D.getTop() - m36432n0) - this.f5400c.getPaddingTop();
        }
        int i = -top;
        c1762a.f5413c = i;
        if (i < 0) {
            if (new C1756a(this.f5401d).m35446d()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(c1762a.f5413c)));
        }
        c1762a.f5412b = height == 0 ? 0.0f : i / height;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1555t
    /* renamed from: a */
    public void mo29914a(RecyclerView recyclerView, int i) {
        boolean z = true;
        if ((this.f5402e != 1 || this.f5403f != 1) && i == 1) {
            m35425p(false);
        } else if (m35430k() && i == 2) {
            if (this.f5408k) {
                m35436e(2);
                this.f5407j = true;
            }
        } else {
            if (m35430k() && i == 0) {
                m35424q();
                if (!this.f5408k) {
                    int i2 = this.f5404g.f5411a;
                    if (i2 != -1) {
                        m35438c(i2, 0.0f, 0);
                    }
                } else {
                    C1762a c1762a = this.f5404g;
                    if (c1762a.f5413c == 0) {
                        int i3 = this.f5405h;
                        int i4 = c1762a.f5411a;
                        if (i3 != i4) {
                            m35437d(i4);
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    m35436e(0);
                    m35427n();
                }
            }
            if (this.f5402e == 2 && i == 0 && this.f5409l) {
                m35424q();
                C1762a c1762a2 = this.f5404g;
                if (c1762a2.f5413c == 0) {
                    int i5 = this.f5406i;
                    int i6 = c1762a2.f5411a;
                    if (i5 != i6) {
                        if (i6 == -1) {
                            i6 = 0;
                        }
                        m35437d(i6);
                    }
                    m35436e(0);
                    m35427n();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        if ((r5 < 0) == r3.f5399b.m35495d()) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1555t
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo29913b(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f5408k = r4
            r3.m35424q()
            boolean r0 = r3.f5407j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L3d
            r3.f5407j = r2
            if (r6 > 0) goto L22
            if (r6 != 0) goto L20
            if (r5 >= 0) goto L16
            r5 = r4
            goto L17
        L16:
            r5 = r2
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f5399b
            boolean r6 = r6.m35495d()
            if (r5 != r6) goto L20
            goto L22
        L20:
            r5 = r2
            goto L23
        L22:
            r5 = r4
        L23:
            if (r5 == 0) goto L2f
            androidx.viewpager2.widget.e$a r5 = r3.f5404g
            int r6 = r5.f5413c
            if (r6 == 0) goto L2f
            int r5 = r5.f5411a
            int r5 = r5 + r4
            goto L33
        L2f:
            androidx.viewpager2.widget.e$a r5 = r3.f5404g
            int r5 = r5.f5411a
        L33:
            r3.f5406i = r5
            int r6 = r3.f5405h
            if (r6 == r5) goto L4b
            r3.m35437d(r5)
            goto L4b
        L3d:
            int r5 = r3.f5402e
            if (r5 != 0) goto L4b
            androidx.viewpager2.widget.e$a r5 = r3.f5404g
            int r5 = r5.f5411a
            if (r5 != r1) goto L48
            r5 = r2
        L48:
            r3.m35437d(r5)
        L4b:
            androidx.viewpager2.widget.e$a r5 = r3.f5404g
            int r6 = r5.f5411a
            if (r6 != r1) goto L52
            r6 = r2
        L52:
            float r0 = r5.f5412b
            int r5 = r5.f5413c
            r3.m35438c(r6, r0, r5)
            androidx.viewpager2.widget.e$a r5 = r3.f5404g
            int r6 = r5.f5411a
            int r0 = r3.f5406i
            if (r6 == r0) goto L63
            if (r0 != r1) goto L71
        L63:
            int r5 = r5.f5413c
            if (r5 != 0) goto L71
            int r5 = r3.f5403f
            if (r5 == r4) goto L71
            r3.m35436e(r2)
            r3.m35427n()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C1761e.mo29913b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public double m35434g() {
        m35424q();
        C1762a c1762a = this.f5404g;
        return c1762a.f5411a + c1762a.f5412b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m35433h() {
        return this.f5403f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean m35432i() {
        return this.f5410m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean m35431j() {
        return this.f5403f == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m35429l() {
        this.f5409l = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m35428m(int i, boolean z) {
        this.f5402e = z ? 2 : 3;
        this.f5410m = false;
        boolean z2 = this.f5406i != i;
        this.f5406i = i;
        m35436e(2);
        if (z2) {
            m35437d(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m35426o(ViewPager2.AbstractC1747i abstractC1747i) {
        this.f5398a = abstractC1747i;
    }
}
