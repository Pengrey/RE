package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0378e;
import androidx.appcompat.widget.C0520s0;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0378e.InterfaceC0380b, InterfaceC0389k, AdapterView.OnItemClickListener {

    /* renamed from: y */
    private static final int[] f980y = {16842964, 16843049};

    /* renamed from: w */
    private C0378e f981w;

    /* renamed from: x */
    private int f982x;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    @Override // androidx.appcompat.view.menu.C0378e.InterfaceC0380b
    /* renamed from: a */
    public boolean mo40859a(C0382g c0382g) {
        return this.f981w.m41038N(c0382g, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0389k
    /* renamed from: b */
    public void mo29426b(C0378e c0378e) {
        this.f981w = c0378e;
    }

    public int getWindowAnimations() {
        return this.f982x;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo40859a((C0382g) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0520s0 m40453v = C0520s0.m40453v(context, attributeSet, f980y, i, 0);
        if (m40453v.m40456s(0)) {
            setBackgroundDrawable(m40453v.m40468g(0));
        }
        if (m40453v.m40456s(1)) {
            setDivider(m40453v.m40468g(1));
        }
        m40453v.m40452w();
    }
}
