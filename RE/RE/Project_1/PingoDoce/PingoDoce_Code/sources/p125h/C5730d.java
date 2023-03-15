package p125h;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p125h.C5724b;

@SuppressLint({"RestrictedAPI"})
/* renamed from: h.d */
/* loaded from: classes.dex */
class C5730d extends C5724b {

    /* renamed from: I */
    private C5731a f16047I;

    /* renamed from: J */
    private boolean f16048J;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StateListDrawable.java */
    /* renamed from: h.d$a */
    /* loaded from: classes.dex */
    public static class C5731a extends C5724b.AbstractC5728d {

        /* renamed from: J */
        int[][] f16049J;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C5731a(C5731a c5731a, C5730d c5730d, Resources resources) {
            super(c5731a, c5730d, resources);
            if (c5731a != null) {
                this.f16049J = c5731a.f16049J;
            } else {
                this.f16049J = new int[m23239f()];
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: A */
        public int m23215A(int[] iArr) {
            int[][] iArr2 = this.f16049J;
            int m23237h = m23237h();
            for (int i = 0; i < m23237h; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C5730d(this, null);
        }

        @Override // p125h.C5724b.AbstractC5728d
        /* renamed from: o */
        public void mo23214o(int i, int i2) {
            super.mo23214o(i, i2);
            int[][] iArr = new int[i2];
            System.arraycopy(this.f16049J, 0, iArr, 0, i);
            this.f16049J = iArr;
        }

        @Override // p125h.C5724b.AbstractC5728d
        /* renamed from: r */
        void mo23213r() {
            int[][] iArr = this.f16049J;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f16049J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f16049J = iArr2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z */
        public int m23212z(int[] iArr, Drawable drawable) {
            int m23244a = m23244a(drawable);
            this.f16049J[m23244a] = iArr;
            return m23244a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C5730d(this, resources);
        }
    }

    C5730d(C5731a c5731a, Resources resources) {
        mo23218h(new C5731a(c5731a, this, resources));
        onStateChange(getState());
    }

    @Override // p125h.C5724b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p125h.C5724b
    /* renamed from: h */
    public void mo23218h(C5724b.AbstractC5728d abstractC5728d) {
        super.mo23218h(abstractC5728d);
        if (abstractC5728d instanceof C5731a) {
            this.f16047I = (C5731a) abstractC5728d;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p125h.C5724b
    /* renamed from: j */
    public C5731a mo23219b() {
        return new C5731a(this.f16047I, this, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] m23216k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    @Override // p125h.C5724b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f16048J && super.mutate() == this) {
            this.f16047I.mo23213r();
            this.f16048J = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p125h.C5724b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int m23215A = this.f16047I.m23215A(iArr);
        if (m23215A < 0) {
            m23215A = this.f16047I.m23215A(StateSet.WILD_CARD);
        }
        return m23251g(m23215A) || onStateChange;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5730d(C5731a c5731a) {
        if (c5731a != null) {
            mo23218h(c5731a);
        }
    }
}
