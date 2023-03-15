package androidx.core.widget;

import android.widget.ListView;

/* renamed from: androidx.core.widget.f */
/* loaded from: classes.dex */
public class C1234f extends AbstractView$OnTouchListenerC1222a {

    /* renamed from: O */
    private final ListView f3646O;

    public C1234f(ListView listView) {
        super(listView);
        this.f3646O = listView;
    }

    @Override // androidx.core.widget.AbstractView$OnTouchListenerC1222a
    /* renamed from: a */
    public boolean mo37903a(int i) {
        return false;
    }

    @Override // androidx.core.widget.AbstractView$OnTouchListenerC1222a
    /* renamed from: b */
    public boolean mo37902b(int i) {
        ListView listView = this.f3646O;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.AbstractView$OnTouchListenerC1222a
    /* renamed from: j */
    public void mo37901j(int i, int i2) {
        C1235g.m37899b(this.f3646O, i2);
    }
}
