package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.n */
/* loaded from: classes.dex */
class C1634n {

    /* renamed from: b */
    int f4979b;

    /* renamed from: c */
    int f4980c;

    /* renamed from: d */
    int f4981d;

    /* renamed from: e */
    int f4982e;

    /* renamed from: h */
    boolean f4985h;

    /* renamed from: i */
    boolean f4986i;

    /* renamed from: a */
    boolean f4978a = true;

    /* renamed from: f */
    int f4983f = 0;

    /* renamed from: g */
    int f4984g = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m35922a(RecyclerView.C1564z c1564z) {
        int i = this.f4980c;
        return i >= 0 && i < c1564z.m36329b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public View m35921b(RecyclerView.C1558v c1558v) {
        View m36363o = c1558v.m36363o(this.f4980c);
        this.f4980c += this.f4981d;
        return m36363o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f4979b + ", mCurrentPosition=" + this.f4980c + ", mItemDirection=" + this.f4981d + ", mLayoutDirection=" + this.f4982e + ", mStartLine=" + this.f4983f + ", mEndLine=" + this.f4984g + '}';
    }
}
