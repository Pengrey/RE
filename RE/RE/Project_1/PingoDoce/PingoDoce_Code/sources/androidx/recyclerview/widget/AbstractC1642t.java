package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.t */
/* loaded from: classes.dex */
public abstract class AbstractC1642t {

    /* renamed from: a */
    protected final RecyclerView.AbstractC1546o f5001a;

    /* renamed from: b */
    private int f5002b;

    /* renamed from: c */
    final Rect f5003c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrientationHelper.java */
    /* renamed from: androidx.recyclerview.widget.t$a */
    /* loaded from: classes.dex */
    public static class C1643a extends AbstractC1642t {
        C1643a(RecyclerView.AbstractC1546o abstractC1546o) {
            super(abstractC1546o, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: d */
        public int mo35881d(View view) {
            return this.f5001a.m36468U(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1551p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: e */
        public int mo35880e(View view) {
            RecyclerView.C1551p c1551p = (RecyclerView.C1551p) view.getLayoutParams();
            return this.f5001a.m36469T(view) + ((ViewGroup.MarginLayoutParams) c1551p).leftMargin + ((ViewGroup.MarginLayoutParams) c1551p).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: f */
        public int mo35879f(View view) {
            RecyclerView.C1551p c1551p = (RecyclerView.C1551p) view.getLayoutParams();
            return this.f5001a.m36470S(view) + ((ViewGroup.MarginLayoutParams) c1551p).topMargin + ((ViewGroup.MarginLayoutParams) c1551p).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: g */
        public int mo35878g(View view) {
            return this.f5001a.m36472R(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1551p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: h */
        public int mo35877h() {
            return this.f5001a.m36427p0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: i */
        public int mo35876i() {
            return this.f5001a.m36427p0() - this.f5001a.m36447g0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: j */
        public int mo35875j() {
            return this.f5001a.m36447g0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: k */
        public int mo35874k() {
            return this.f5001a.m36424q0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: l */
        public int mo35873l() {
            return this.f5001a.m36463Y();
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: m */
        public int mo35872m() {
            return this.f5001a.m36449f0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: n */
        public int mo35871n() {
            return (this.f5001a.m36427p0() - this.f5001a.m36449f0()) - this.f5001a.m36447g0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: p */
        public int mo35870p(View view) {
            this.f5001a.m36429o0(view, true, this.f5003c);
            return this.f5003c.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: q */
        public int mo35869q(View view) {
            this.f5001a.m36429o0(view, true, this.f5003c);
            return this.f5003c.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: r */
        public void mo35868r(int i) {
            this.f5001a.mo36320D0(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrientationHelper.java */
    /* renamed from: androidx.recyclerview.widget.t$b */
    /* loaded from: classes.dex */
    public static class C1644b extends AbstractC1642t {
        C1644b(RecyclerView.AbstractC1546o abstractC1546o) {
            super(abstractC1546o, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: d */
        public int mo35881d(View view) {
            return this.f5001a.m36475P(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1551p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: e */
        public int mo35880e(View view) {
            RecyclerView.C1551p c1551p = (RecyclerView.C1551p) view.getLayoutParams();
            return this.f5001a.m36470S(view) + ((ViewGroup.MarginLayoutParams) c1551p).topMargin + ((ViewGroup.MarginLayoutParams) c1551p).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: f */
        public int mo35879f(View view) {
            RecyclerView.C1551p c1551p = (RecyclerView.C1551p) view.getLayoutParams();
            return this.f5001a.m36469T(view) + ((ViewGroup.MarginLayoutParams) c1551p).leftMargin + ((ViewGroup.MarginLayoutParams) c1551p).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: g */
        public int mo35878g(View view) {
            return this.f5001a.m36467V(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1551p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: h */
        public int mo35877h() {
            return this.f5001a.m36464X();
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: i */
        public int mo35876i() {
            return this.f5001a.m36464X() - this.f5001a.m36451e0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: j */
        public int mo35875j() {
            return this.f5001a.m36451e0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: k */
        public int mo35874k() {
            return this.f5001a.m36463Y();
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: l */
        public int mo35873l() {
            return this.f5001a.m36424q0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: m */
        public int mo35872m() {
            return this.f5001a.m36445h0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: n */
        public int mo35871n() {
            return (this.f5001a.m36464X() - this.f5001a.m36445h0()) - this.f5001a.m36451e0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: p */
        public int mo35870p(View view) {
            this.f5001a.m36429o0(view, true, this.f5003c);
            return this.f5003c.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: q */
        public int mo35869q(View view) {
            this.f5001a.m36429o0(view, true, this.f5003c);
            return this.f5003c.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC1642t
        /* renamed from: r */
        public void mo35868r(int i) {
            this.f5001a.mo36316E0(i);
        }
    }

    /* synthetic */ AbstractC1642t(RecyclerView.AbstractC1546o abstractC1546o, C1643a c1643a) {
        this(abstractC1546o);
    }

    /* renamed from: a */
    public static AbstractC1642t m35886a(RecyclerView.AbstractC1546o abstractC1546o) {
        return new C1643a(abstractC1546o);
    }

    /* renamed from: b */
    public static AbstractC1642t m35885b(RecyclerView.AbstractC1546o abstractC1546o, int i) {
        if (i != 0) {
            if (i == 1) {
                return m35884c(abstractC1546o);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return m35886a(abstractC1546o);
    }

    /* renamed from: c */
    public static AbstractC1642t m35884c(RecyclerView.AbstractC1546o abstractC1546o) {
        return new C1644b(abstractC1546o);
    }

    /* renamed from: d */
    public abstract int mo35881d(View view);

    /* renamed from: e */
    public abstract int mo35880e(View view);

    /* renamed from: f */
    public abstract int mo35879f(View view);

    /* renamed from: g */
    public abstract int mo35878g(View view);

    /* renamed from: h */
    public abstract int mo35877h();

    /* renamed from: i */
    public abstract int mo35876i();

    /* renamed from: j */
    public abstract int mo35875j();

    /* renamed from: k */
    public abstract int mo35874k();

    /* renamed from: l */
    public abstract int mo35873l();

    /* renamed from: m */
    public abstract int mo35872m();

    /* renamed from: n */
    public abstract int mo35871n();

    /* renamed from: o */
    public int m35883o() {
        if (Integer.MIN_VALUE == this.f5002b) {
            return 0;
        }
        return mo35871n() - this.f5002b;
    }

    /* renamed from: p */
    public abstract int mo35870p(View view);

    /* renamed from: q */
    public abstract int mo35869q(View view);

    /* renamed from: r */
    public abstract void mo35868r(int i);

    /* renamed from: s */
    public void m35882s() {
        this.f5002b = mo35871n();
    }

    private AbstractC1642t(RecyclerView.AbstractC1546o abstractC1546o) {
        this.f5002b = Integer.MIN_VALUE;
        this.f5003c = new Rect();
        this.f5001a = abstractC1546o;
    }
}
