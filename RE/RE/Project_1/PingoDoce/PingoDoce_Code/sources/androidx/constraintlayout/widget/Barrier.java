package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import p073e2.C4960a;
import p073e2.C4966e;

/* loaded from: classes.dex */
public class Barrier extends AbstractC0853b {

    /* renamed from: E */
    private int f2494E;

    /* renamed from: F */
    private int f2495F;

    /* renamed from: G */
    private C4960a f2496G;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: p */
    private void m39446p(C4966e c4966e, int i, boolean z) {
        this.f2495F = i;
        if (Build.VERSION.SDK_INT < 17) {
            int i2 = this.f2494E;
            if (i2 == 5) {
                this.f2495F = 0;
            } else if (i2 == 6) {
                this.f2495F = 1;
            }
        } else if (z) {
            int i3 = this.f2494E;
            if (i3 == 5) {
                this.f2495F = 1;
            } else if (i3 == 6) {
                this.f2495F = 0;
            }
        } else {
            int i4 = this.f2494E;
            if (i4 == 5) {
                this.f2495F = 0;
            } else if (i4 == 6) {
                this.f2495F = 1;
            }
        }
        if (c4966e instanceof C4960a) {
            ((C4960a) c4966e).m26166j1(this.f2495F);
        }
    }

    public int getMargin() {
        return this.f2496G.m26170f1();
    }

    public int getType() {
        return this.f2494E;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC0853b
    /* renamed from: h */
    public void mo39364h(AttributeSet attributeSet) {
        super.mo39364h(attributeSet);
        this.f2496G = new C4960a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0868i.f2783J0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0868i.f2828S0) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0868i.f2823R0) {
                    this.f2496G.m26167i1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == C0868i.f2833T0) {
                    this.f2496G.m26165k1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2606z = this.f2496G;
        m39407n();
    }

    @Override // androidx.constraintlayout.widget.AbstractC0853b
    /* renamed from: i */
    public void mo39412i(C4966e c4966e, boolean z) {
        m39446p(c4966e, this.f2494E, z);
    }

    /* renamed from: o */
    public boolean m39447o() {
        return this.f2496G.m26172d1();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f2496G.m26167i1(z);
    }

    public void setDpMargin(int i) {
        C4960a c4960a = this.f2496G;
        c4960a.m26165k1((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f2496G.m26165k1(i);
    }

    public void setType(int i) {
        this.f2494E = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
