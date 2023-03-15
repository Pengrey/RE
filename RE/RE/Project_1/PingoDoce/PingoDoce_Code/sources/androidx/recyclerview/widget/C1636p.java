package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.crypto.tink.shaded.protobuf.Reader;

/* renamed from: androidx.recyclerview.widget.p */
/* loaded from: classes.dex */
public class C1636p extends AbstractC1651y {

    /* renamed from: d */
    private AbstractC1642t f4995d;

    /* renamed from: e */
    private AbstractC1642t f4996e;

    /* renamed from: m */
    private float m35908m(RecyclerView.AbstractC1546o abstractC1546o, AbstractC1642t abstractC1642t) {
        int m36483K = abstractC1546o.m36483K();
        if (m36483K == 0) {
            return 1.0f;
        }
        View view = null;
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i3 = 0; i3 < m36483K; i3++) {
            View m36484J = abstractC1546o.m36484J(i3);
            int m36442i0 = abstractC1546o.m36442i0(m36484J);
            if (m36442i0 != -1) {
                if (m36442i0 < i2) {
                    view = m36484J;
                    i2 = m36442i0;
                }
                if (m36442i0 > i) {
                    view2 = m36484J;
                    i = m36442i0;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(abstractC1642t.mo35881d(view), abstractC1642t.mo35881d(view2)) - Math.min(abstractC1642t.mo35878g(view), abstractC1642t.mo35878g(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (max * 1.0f) / ((i - i2) + 1);
    }

    /* renamed from: n */
    private int m35907n(RecyclerView.AbstractC1546o abstractC1546o, View view, AbstractC1642t abstractC1642t) {
        return (abstractC1642t.mo35878g(view) + (abstractC1642t.mo35880e(view) / 2)) - (abstractC1642t.mo35872m() + (abstractC1642t.mo35871n() / 2));
    }

    /* renamed from: o */
    private int m35906o(RecyclerView.AbstractC1546o abstractC1546o, AbstractC1642t abstractC1642t, int i, int i2) {
        int[] m35819d = m35819d(i, i2);
        float m35908m = m35908m(abstractC1546o, abstractC1642t);
        if (m35908m <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(m35819d[0]) > Math.abs(m35819d[1]) ? m35819d[0] : m35819d[1]) / m35908m);
    }

    /* renamed from: p */
    private View m35905p(RecyclerView.AbstractC1546o abstractC1546o, AbstractC1642t abstractC1642t) {
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

    /* renamed from: q */
    private AbstractC1642t m35904q(RecyclerView.AbstractC1546o abstractC1546o) {
        AbstractC1642t abstractC1642t = this.f4996e;
        if (abstractC1642t == null || abstractC1642t.f5001a != abstractC1546o) {
            this.f4996e = AbstractC1642t.m35886a(abstractC1546o);
        }
        return this.f4996e;
    }

    /* renamed from: r */
    private AbstractC1642t m35903r(RecyclerView.AbstractC1546o abstractC1546o) {
        AbstractC1642t abstractC1642t = this.f4995d;
        if (abstractC1642t == null || abstractC1642t.f5001a != abstractC1546o) {
            this.f4995d = AbstractC1642t.m35884c(abstractC1546o);
        }
        return this.f4995d;
    }

    @Override // androidx.recyclerview.widget.AbstractC1651y
    /* renamed from: c */
    public int[] mo35820c(RecyclerView.AbstractC1546o abstractC1546o, View view) {
        int[] iArr = new int[2];
        if (abstractC1546o.mo36256l()) {
            iArr[0] = m35907n(abstractC1546o, view, m35904q(abstractC1546o));
        } else {
            iArr[0] = 0;
        }
        if (abstractC1546o.mo36253m()) {
            iArr[1] = m35907n(abstractC1546o, view, m35903r(abstractC1546o));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC1651y
    /* renamed from: h */
    public View mo35450h(RecyclerView.AbstractC1546o abstractC1546o) {
        if (abstractC1546o.mo36253m()) {
            return m35905p(abstractC1546o, m35903r(abstractC1546o));
        }
        if (abstractC1546o.mo36256l()) {
            return m35905p(abstractC1546o, m35904q(abstractC1546o));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1651y
    /* renamed from: i */
    public int mo35815i(RecyclerView.AbstractC1546o abstractC1546o, int i, int i2) {
        int m36462Z;
        View mo35450h;
        int m36442i0;
        int i3;
        PointF mo36272a;
        int i4;
        int i5;
        if (!(abstractC1546o instanceof RecyclerView.AbstractC1561y.InterfaceC1563b) || (m36462Z = abstractC1546o.m36462Z()) == 0 || (mo35450h = mo35450h(abstractC1546o)) == null || (m36442i0 = abstractC1546o.m36442i0(mo35450h)) == -1 || (mo36272a = ((RecyclerView.AbstractC1561y.InterfaceC1563b) abstractC1546o).mo36272a(m36462Z - 1)) == null) {
            return -1;
        }
        if (abstractC1546o.mo36256l()) {
            i4 = m35906o(abstractC1546o, m35904q(abstractC1546o), i, 0);
            if (mo36272a.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (abstractC1546o.mo36253m()) {
            i5 = m35906o(abstractC1546o, m35903r(abstractC1546o), 0, i2);
            if (mo36272a.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (abstractC1546o.mo36253m()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i6 = m36442i0 + i4;
        int i7 = i6 >= 0 ? i6 : 0;
        return i7 >= m36462Z ? i3 : i7;
    }
}
