package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import p209l.InterfaceC6954e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: classes.dex */
public abstract class AbstractC0384h implements InterfaceC6954e, InterfaceC0387j, AdapterView.OnItemClickListener {

    /* renamed from: w */
    private Rect f1127w;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public static C0377d m40969A(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0377d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0377d) listAdapter;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public static int m40966q(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public static boolean m40964z(C0378e c0378e) {
        int size = c0378e.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0378e.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: d */
    public void mo29478d(Context context, C0378e c0378e) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    public int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: k */
    public boolean mo29471k(C0378e c0378e, C0382g c0382g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: l */
    public boolean mo29470l(C0378e c0378e, C0382g c0382g) {
        return false;
    }

    /* renamed from: n */
    public abstract void mo40948n(C0378e c0378e);

    /* renamed from: o */
    protected boolean mo40968o() {
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m40969A(listAdapter).f1060w.m41037O((MenuItem) listAdapter.getItem(i), this, mo40968o() ? 0 : 4);
    }

    /* renamed from: p */
    public Rect m40967p() {
        return this.f1127w;
    }

    /* renamed from: r */
    public abstract void mo40947r(View view);

    /* renamed from: s */
    public void m40965s(Rect rect) {
        this.f1127w = rect;
    }

    /* renamed from: t */
    public abstract void mo40946t(boolean z);

    /* renamed from: u */
    public abstract void mo40945u(int i);

    /* renamed from: v */
    public abstract void mo40944v(int i);

    /* renamed from: w */
    public abstract void mo40943w(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: x */
    public abstract void mo40942x(boolean z);

    /* renamed from: y */
    public abstract void mo40941y(int i);
}
