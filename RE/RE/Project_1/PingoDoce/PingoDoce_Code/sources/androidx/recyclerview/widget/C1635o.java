package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.o */
/* loaded from: classes.dex */
public class C1635o extends RecyclerView.AbstractC1561y {

    /* renamed from: k */
    protected PointF f4989k;

    /* renamed from: l */
    private final DisplayMetrics f4990l;

    /* renamed from: n */
    private float f4992n;

    /* renamed from: i */
    protected final LinearInterpolator f4987i = new LinearInterpolator();

    /* renamed from: j */
    protected final DecelerateInterpolator f4988j = new DecelerateInterpolator();

    /* renamed from: m */
    private boolean f4991m = false;

    /* renamed from: o */
    protected int f4993o = 0;

    /* renamed from: p */
    protected int f4994p = 0;

    public C1635o(Context context) {
        this.f4990l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: A */
    private float m35920A() {
        if (!this.f4991m) {
            this.f4992n = mo29857v(this.f4990l);
            this.f4991m = true;
        }
        return this.f4992n;
    }

    /* renamed from: y */
    private int m35910y(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* renamed from: B */
    protected int m35919B() {
        PointF pointF = this.f4989k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* renamed from: C */
    protected void m35918C(RecyclerView.AbstractC1561y.C1562a c1562a) {
        PointF m36349a = m36349a(m36344f());
        if (m36349a != null && (m36349a.x != 0.0f || m36349a.y != 0.0f)) {
            m36341i(m36349a);
            this.f4989k = m36349a;
            this.f4993o = (int) (m36349a.x * 10000.0f);
            this.f4994p = (int) (m36349a.y * 10000.0f);
            c1562a.m36332d((int) (this.f4993o * 1.2f), (int) (this.f4994p * 1.2f), (int) (mo35860x(10000) * 1.2f), this.f4987i);
            return;
        }
        c1562a.m36334b(m36344f());
        m36336r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1561y
    /* renamed from: l */
    protected void mo35917l(int i, int i2, RecyclerView.C1564z c1564z, RecyclerView.AbstractC1561y.C1562a c1562a) {
        if (m36347c() == 0) {
            m36336r();
            return;
        }
        this.f4993o = m35910y(this.f4993o, i);
        int m35910y = m35910y(this.f4994p, i2);
        this.f4994p = m35910y;
        if (this.f4993o == 0 && m35910y == 0) {
            m35918C(c1562a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1561y
    /* renamed from: m */
    protected void mo35916m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1561y
    /* renamed from: n */
    protected void mo35915n() {
        this.f4994p = 0;
        this.f4993o = 0;
        this.f4989k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1561y
    /* renamed from: o */
    protected void mo35811o(View view, RecyclerView.C1564z c1564z, RecyclerView.AbstractC1561y.C1562a c1562a) {
        int m35913t = m35913t(view, m35909z());
        int m35912u = m35912u(view, m35919B());
        int m35911w = m35911w((int) Math.sqrt((m35913t * m35913t) + (m35912u * m35912u)));
        if (m35911w > 0) {
            c1562a.m36332d(-m35913t, -m35912u, m35911w, this.f4988j);
        }
    }

    /* renamed from: s */
    public int m35914s(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }

    /* renamed from: t */
    public int m35913t(View view, int i) {
        RecyclerView.AbstractC1546o m36345e = m36345e();
        if (m36345e == null || !m36345e.mo36256l()) {
            return 0;
        }
        RecyclerView.C1551p c1551p = (RecyclerView.C1551p) view.getLayoutParams();
        return m35914s(m36345e.m36472R(view) - ((ViewGroup.MarginLayoutParams) c1551p).leftMargin, m36345e.m36468U(view) + ((ViewGroup.MarginLayoutParams) c1551p).rightMargin, m36345e.m36449f0(), m36345e.m36427p0() - m36345e.m36447g0(), i);
    }

    /* renamed from: u */
    public int m35912u(View view, int i) {
        RecyclerView.AbstractC1546o m36345e = m36345e();
        if (m36345e == null || !m36345e.mo36253m()) {
            return 0;
        }
        RecyclerView.C1551p c1551p = (RecyclerView.C1551p) view.getLayoutParams();
        return m35914s(m36345e.m36467V(view) - ((ViewGroup.MarginLayoutParams) c1551p).topMargin, m36345e.m36475P(view) + ((ViewGroup.MarginLayoutParams) c1551p).bottomMargin, m36345e.m36445h0(), m36345e.m36464X() - m36345e.m36451e0(), i);
    }

    /* renamed from: v */
    protected float mo29857v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public int m35911w(int i) {
        return (int) Math.ceil(mo35860x(i) / 0.3356d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public int mo35860x(int i) {
        return (int) Math.ceil(Math.abs(i) * m35920A());
    }

    /* renamed from: z */
    protected int m35909z() {
        PointF pointF = this.f4989k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
