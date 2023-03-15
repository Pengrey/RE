package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.x */
/* loaded from: classes.dex */
public abstract class AbstractC1650x extends RecyclerView.AbstractC1540l {

    /* renamed from: g */
    boolean f5011g = true;

    /* renamed from: A */
    public abstract boolean mo35848A(RecyclerView.AbstractC1531c0 abstractC1531c0);

    /* renamed from: B */
    public final void m35847B(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        m35839J(abstractC1531c0);
        m36524h(abstractC1531c0);
    }

    /* renamed from: C */
    public final void m35846C(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        m35838K(abstractC1531c0);
    }

    /* renamed from: D */
    public final void m35845D(RecyclerView.AbstractC1531c0 abstractC1531c0, boolean z) {
        m35837L(abstractC1531c0, z);
        m36524h(abstractC1531c0);
    }

    /* renamed from: E */
    public final void m35844E(RecyclerView.AbstractC1531c0 abstractC1531c0, boolean z) {
        m35836M(abstractC1531c0, z);
    }

    /* renamed from: F */
    public final void m35843F(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        m35835N(abstractC1531c0);
        m36524h(abstractC1531c0);
    }

    /* renamed from: G */
    public final void m35842G(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        m35834O(abstractC1531c0);
    }

    /* renamed from: H */
    public final void m35841H(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        m35833P(abstractC1531c0);
        m36524h(abstractC1531c0);
    }

    /* renamed from: I */
    public final void m35840I(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        m35832Q(abstractC1531c0);
    }

    /* renamed from: J */
    public void m35839J(RecyclerView.AbstractC1531c0 abstractC1531c0) {
    }

    /* renamed from: K */
    public void m35838K(RecyclerView.AbstractC1531c0 abstractC1531c0) {
    }

    /* renamed from: L */
    public void m35837L(RecyclerView.AbstractC1531c0 abstractC1531c0, boolean z) {
    }

    /* renamed from: M */
    public void m35836M(RecyclerView.AbstractC1531c0 abstractC1531c0, boolean z) {
    }

    /* renamed from: N */
    public void m35835N(RecyclerView.AbstractC1531c0 abstractC1531c0) {
    }

    /* renamed from: O */
    public void m35834O(RecyclerView.AbstractC1531c0 abstractC1531c0) {
    }

    /* renamed from: P */
    public void m35833P(RecyclerView.AbstractC1531c0 abstractC1531c0) {
    }

    /* renamed from: Q */
    public void m35832Q(RecyclerView.AbstractC1531c0 abstractC1531c0) {
    }

    /* renamed from: R */
    public void m35831R(boolean z) {
        this.f5011g = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1540l
    /* renamed from: a */
    public boolean mo35830a(RecyclerView.AbstractC1531c0 abstractC1531c0, RecyclerView.AbstractC1540l.C1543c c1543c, RecyclerView.AbstractC1540l.C1543c c1543c2) {
        int i;
        int i2;
        if (c1543c != null && ((i = c1543c.f4610a) != (i2 = c1543c2.f4610a) || c1543c.f4611b != c1543c2.f4611b)) {
            return mo35823z(abstractC1531c0, i, c1543c.f4611b, i2, c1543c2.f4611b);
        }
        return mo35825x(abstractC1531c0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1540l
    /* renamed from: b */
    public boolean mo35829b(RecyclerView.AbstractC1531c0 abstractC1531c0, RecyclerView.AbstractC1531c0 abstractC1531c02, RecyclerView.AbstractC1540l.C1543c c1543c, RecyclerView.AbstractC1540l.C1543c c1543c2) {
        int i;
        int i2;
        int i3 = c1543c.f4610a;
        int i4 = c1543c.f4611b;
        if (abstractC1531c02.m36580J()) {
            int i5 = c1543c.f4610a;
            i2 = c1543c.f4611b;
            i = i5;
        } else {
            i = c1543c2.f4610a;
            i2 = c1543c2.f4611b;
        }
        return mo35824y(abstractC1531c0, abstractC1531c02, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1540l
    /* renamed from: c */
    public boolean mo35828c(RecyclerView.AbstractC1531c0 abstractC1531c0, RecyclerView.AbstractC1540l.C1543c c1543c, RecyclerView.AbstractC1540l.C1543c c1543c2) {
        int i = c1543c.f4610a;
        int i2 = c1543c.f4611b;
        View view = abstractC1531c0.f4581a;
        int left = c1543c2 == null ? view.getLeft() : c1543c2.f4610a;
        int top = c1543c2 == null ? view.getTop() : c1543c2.f4611b;
        if (!abstractC1531c0.m36556v() && (i != left || i2 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            return mo35823z(abstractC1531c0, i, i2, left, top);
        }
        return mo35848A(abstractC1531c0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1540l
    /* renamed from: d */
    public boolean mo35827d(RecyclerView.AbstractC1531c0 abstractC1531c0, RecyclerView.AbstractC1540l.C1543c c1543c, RecyclerView.AbstractC1540l.C1543c c1543c2) {
        int i = c1543c.f4610a;
        int i2 = c1543c2.f4610a;
        if (i == i2 && c1543c.f4611b == c1543c2.f4611b) {
            m35843F(abstractC1531c0);
            return false;
        }
        return mo35823z(abstractC1531c0, i, c1543c.f4611b, i2, c1543c2.f4611b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1540l
    /* renamed from: f */
    public boolean mo35826f(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        return !this.f5011g || abstractC1531c0.m36558t();
    }

    /* renamed from: x */
    public abstract boolean mo35825x(RecyclerView.AbstractC1531c0 abstractC1531c0);

    /* renamed from: y */
    public abstract boolean mo35824y(RecyclerView.AbstractC1531c0 abstractC1531c0, RecyclerView.AbstractC1531c0 abstractC1531c02, int i, int i2, int i3, int i4);

    /* renamed from: z */
    public abstract boolean mo35823z(RecyclerView.AbstractC1531c0 abstractC1531c0, int i, int i2, int i3, int i4);
}
