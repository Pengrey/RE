package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.crypto.tink.shaded.protobuf.Reader;

/* renamed from: androidx.recyclerview.widget.y */
/* loaded from: classes.dex */
public abstract class AbstractC1651y extends RecyclerView.AbstractC1553r {

    /* renamed from: a */
    RecyclerView f5012a;

    /* renamed from: b */
    private Scroller f5013b;

    /* renamed from: c */
    private final RecyclerView.AbstractC1555t f5014c = new C1652a();

    /* compiled from: SnapHelper.java */
    /* renamed from: androidx.recyclerview.widget.y$a */
    /* loaded from: classes.dex */
    class C1652a extends RecyclerView.AbstractC1555t {

        /* renamed from: a */
        boolean f5015a = false;

        C1652a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1555t
        /* renamed from: a */
        public void mo29914a(RecyclerView recyclerView, int i) {
            super.mo29914a(recyclerView, i);
            if (i == 0 && this.f5015a) {
                this.f5015a = false;
                AbstractC1651y.this.m35812l();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1555t
        /* renamed from: b */
        public void mo29913b(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f5015a = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnapHelper.java */
    /* renamed from: androidx.recyclerview.widget.y$b */
    /* loaded from: classes.dex */
    public class C1653b extends C1635o {
        C1653b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1635o, androidx.recyclerview.widget.RecyclerView.AbstractC1561y
        /* renamed from: o */
        protected void mo35811o(View view, RecyclerView.C1564z c1564z, RecyclerView.AbstractC1561y.C1562a c1562a) {
            AbstractC1651y abstractC1651y = AbstractC1651y.this;
            RecyclerView recyclerView = abstractC1651y.f5012a;
            if (recyclerView == null) {
                return;
            }
            int[] mo35820c = abstractC1651y.mo35820c(recyclerView.getLayoutManager(), view);
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
    }

    /* renamed from: g */
    private void m35816g() {
        this.f5012a.m36670c1(this.f5014c);
        this.f5012a.setOnFlingListener(null);
    }

    /* renamed from: j */
    private void m35814j() throws IllegalStateException {
        if (this.f5012a.getOnFlingListener() == null) {
            this.f5012a.m36645l(this.f5014c);
            this.f5012a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: k */
    private boolean m35813k(RecyclerView.AbstractC1546o abstractC1546o, int i, int i2) {
        RecyclerView.AbstractC1561y m35818e;
        int mo35815i;
        if (!(abstractC1546o instanceof RecyclerView.AbstractC1561y.InterfaceC1563b) || (m35818e = m35818e(abstractC1546o)) == null || (mo35815i = mo35815i(abstractC1546o, i, i2)) == -1) {
            return false;
        }
        m35818e.m36338p(mo35815i);
        abstractC1546o.m36482K1(m35818e);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1553r
    /* renamed from: a */
    public boolean mo35822a(int i, int i2) {
        RecyclerView.AbstractC1546o layoutManager = this.f5012a.getLayoutManager();
        if (layoutManager == null || this.f5012a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f5012a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m35813k(layoutManager, i, i2);
    }

    /* renamed from: b */
    public void m35821b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f5012a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m35816g();
        }
        this.f5012a = recyclerView;
        if (recyclerView != null) {
            m35814j();
            this.f5013b = new Scroller(this.f5012a.getContext(), new DecelerateInterpolator());
            m35812l();
        }
    }

    /* renamed from: c */
    public abstract int[] mo35820c(RecyclerView.AbstractC1546o abstractC1546o, View view);

    /* renamed from: d */
    public int[] m35819d(int i, int i2) {
        this.f5013b.fling(0, 0, i, i2, Integer.MIN_VALUE, Reader.READ_DONE, Integer.MIN_VALUE, Reader.READ_DONE);
        return new int[]{this.f5013b.getFinalX(), this.f5013b.getFinalY()};
    }

    /* renamed from: e */
    protected RecyclerView.AbstractC1561y m35818e(RecyclerView.AbstractC1546o abstractC1546o) {
        return mo35817f(abstractC1546o);
    }

    @Deprecated
    /* renamed from: f */
    protected C1635o mo35817f(RecyclerView.AbstractC1546o abstractC1546o) {
        if (abstractC1546o instanceof RecyclerView.AbstractC1561y.InterfaceC1563b) {
            return new C1653b(this.f5012a.getContext());
        }
        return null;
    }

    /* renamed from: h */
    public abstract View mo35450h(RecyclerView.AbstractC1546o abstractC1546o);

    /* renamed from: i */
    public abstract int mo35815i(RecyclerView.AbstractC1546o abstractC1546o, int i, int i2);

    /* renamed from: l */
    void m35812l() {
        RecyclerView.AbstractC1546o layoutManager;
        View mo35450h;
        RecyclerView recyclerView = this.f5012a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (mo35450h = mo35450h(layoutManager)) == null) {
            return;
        }
        int[] mo35820c = mo35820c(layoutManager, mo35450h);
        if (mo35820c[0] == 0 && mo35820c[1] == 0) {
            return;
        }
        this.f5012a.m36631p1(mo35820c[0], mo35820c[1]);
    }
}
