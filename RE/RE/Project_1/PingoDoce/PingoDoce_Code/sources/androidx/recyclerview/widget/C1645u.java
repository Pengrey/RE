package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.crypto.tink.shaded.protobuf.Reader;

/* renamed from: androidx.recyclerview.widget.u */
/* loaded from: classes.dex */
public class C1645u extends AbstractC1651y {

    /* renamed from: d */
    private AbstractC1642t f5004d;

    /* renamed from: e */
    private AbstractC1642t f5005e;

    /* compiled from: PagerSnapHelper.java */
    /* renamed from: androidx.recyclerview.widget.u$a */
    /* loaded from: classes.dex */
    class C1646a extends C1635o {
        C1646a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1635o, androidx.recyclerview.widget.RecyclerView.AbstractC1561y
        /* renamed from: o */
        protected void mo35811o(View view, RecyclerView.C1564z c1564z, RecyclerView.AbstractC1561y.C1562a c1562a) {
            C1645u c1645u = C1645u.this;
            int[] mo35820c = c1645u.mo35820c(c1645u.f5012a.getLayoutManager(), view);
            int i = mo35820c[0];
            int i2 = mo35820c[1];
            int m35911w = m35911w(Math.max(Math.abs(i), Math.abs(i2)));
            if (m35911w > 0) {
                c1562a.m36332d(i, i2, m35911w, this.f4988j);
            }
        }

        @Override // androidx.recyclerview.widget.C1635o
        /* renamed from: v */
        protected float mo29857v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C1635o
        /* renamed from: x */
        protected int mo35860x(int i) {
            return Math.min(100, super.mo35860x(i));
        }
    }

    /* renamed from: m */
    private int m35867m(RecyclerView.AbstractC1546o abstractC1546o, View view, AbstractC1642t abstractC1642t) {
        return (abstractC1642t.mo35878g(view) + (abstractC1642t.mo35880e(view) / 2)) - (abstractC1642t.mo35872m() + (abstractC1642t.mo35871n() / 2));
    }

    /* renamed from: n */
    private View m35866n(RecyclerView.AbstractC1546o abstractC1546o, AbstractC1642t abstractC1642t) {
        int m36483K = abstractC1546o.m36483K();
        View view = null;
        if (m36483K == 0) {
            return null;
        }
        int mo35872m = abstractC1642t.mo35872m() + (abstractC1642t.mo35871n() / 2);
        int i = Reader.READ_DONE;
        for (int i2 = 0; i2 < m36483K; i2++) {
            View m36484J = abstractC1546o.m36484J(i2);
            int abs = Math.abs((abstractC1642t.mo35878g(m36484J) + (abstractC1642t.mo35880e(m36484J) / 2)) - mo35872m);
            if (abs < i) {
                view = m36484J;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: o */
    private AbstractC1642t m35865o(RecyclerView.AbstractC1546o abstractC1546o) {
        AbstractC1642t abstractC1642t = this.f5005e;
        if (abstractC1642t == null || abstractC1642t.f5001a != abstractC1546o) {
            this.f5005e = AbstractC1642t.m35886a(abstractC1546o);
        }
        return this.f5005e;
    }

    /* renamed from: p */
    private AbstractC1642t m35864p(RecyclerView.AbstractC1546o abstractC1546o) {
        if (abstractC1546o.mo36253m()) {
            return m35863q(abstractC1546o);
        }
        if (abstractC1546o.mo36256l()) {
            return m35865o(abstractC1546o);
        }
        return null;
    }

    /* renamed from: q */
    private AbstractC1642t m35863q(RecyclerView.AbstractC1546o abstractC1546o) {
        AbstractC1642t abstractC1642t = this.f5004d;
        if (abstractC1642t == null || abstractC1642t.f5001a != abstractC1546o) {
            this.f5004d = AbstractC1642t.m35884c(abstractC1546o);
        }
        return this.f5004d;
    }

    /* renamed from: r */
    private boolean m35862r(RecyclerView.AbstractC1546o abstractC1546o, int i, int i2) {
        return abstractC1546o.mo36256l() ? i > 0 : i2 > 0;
    }

    /* renamed from: s */
    private boolean m35861s(RecyclerView.AbstractC1546o abstractC1546o) {
        PointF mo36272a;
        int m36462Z = abstractC1546o.m36462Z();
        if (!(abstractC1546o instanceof RecyclerView.AbstractC1561y.InterfaceC1563b) || (mo36272a = ((RecyclerView.AbstractC1561y.InterfaceC1563b) abstractC1546o).mo36272a(m36462Z - 1)) == null) {
            return false;
        }
        return mo36272a.x < 0.0f || mo36272a.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.AbstractC1651y
    /* renamed from: c */
    public int[] mo35820c(RecyclerView.AbstractC1546o abstractC1546o, View view) {
        int[] iArr = new int[2];
        if (abstractC1546o.mo36256l()) {
            iArr[0] = m35867m(abstractC1546o, view, m35865o(abstractC1546o));
        } else {
            iArr[0] = 0;
        }
        if (abstractC1546o.mo36253m()) {
            iArr[1] = m35867m(abstractC1546o, view, m35863q(abstractC1546o));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC1651y
    /* renamed from: f */
    protected C1635o mo35817f(RecyclerView.AbstractC1546o abstractC1546o) {
        if (abstractC1546o instanceof RecyclerView.AbstractC1561y.InterfaceC1563b) {
            return new C1646a(this.f5012a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1651y
    /* renamed from: h */
    public View mo35450h(RecyclerView.AbstractC1546o abstractC1546o) {
        if (abstractC1546o.mo36253m()) {
            return m35866n(abstractC1546o, m35863q(abstractC1546o));
        }
        if (abstractC1546o.mo36256l()) {
            return m35866n(abstractC1546o, m35865o(abstractC1546o));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1651y
    /* renamed from: i */
    public int mo35815i(RecyclerView.AbstractC1546o abstractC1546o, int i, int i2) {
        AbstractC1642t m35864p;
        int m36462Z = abstractC1546o.m36462Z();
        if (m36462Z == 0 || (m35864p = m35864p(abstractC1546o)) == null) {
            return -1;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Reader.READ_DONE;
        int m36483K = abstractC1546o.m36483K();
        View view = null;
        View view2 = null;
        for (int i5 = 0; i5 < m36483K; i5++) {
            View m36484J = abstractC1546o.m36484J(i5);
            if (m36484J != null) {
                int m35867m = m35867m(abstractC1546o, m36484J, m35864p);
                if (m35867m <= 0 && m35867m > i3) {
                    view2 = m36484J;
                    i3 = m35867m;
                }
                if (m35867m >= 0 && m35867m < i4) {
                    view = m36484J;
                    i4 = m35867m;
                }
            }
        }
        boolean m35862r = m35862r(abstractC1546o, i, i2);
        if (!m35862r || view == null) {
            if (m35862r || view2 == null) {
                if (m35862r) {
                    view = view2;
                }
                if (view == null) {
                    return -1;
                }
                int m36442i0 = abstractC1546o.m36442i0(view) + (m35861s(abstractC1546o) == m35862r ? -1 : 1);
                if (m36442i0 < 0 || m36442i0 >= m36462Z) {
                    return -1;
                }
                return m36442i0;
            }
            return abstractC1546o.m36442i0(view2);
        }
        return abstractC1546o.m36442i0(view);
    }
}
