package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.C1072d;
import androidx.core.view.C1078a;
import androidx.core.view.C1112b0;
import androidx.core.view.accessibility.C1085c;
import com.google.android.material.internal.C3649p;
import java.util.Calendar;
import java.util.Iterator;
import p100f8.C5423f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: w */
    private final Calendar f9820w;

    /* renamed from: x */
    private final boolean f9821x;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    /* loaded from: classes.dex */
    class C3538a extends C1078a {
        C3538a(MaterialCalendarGridView materialCalendarGridView) {
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: g */
        public void mo19280g(View view, C1085c c1085c) {
            super.mo19280g(view, c1085c);
            c1085c.m38558c0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m29966a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter2().m29874i());
        } else if (i == 130) {
            setSelection(getAdapter2().m29881b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    /* renamed from: c */
    private View m29964c(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    /* renamed from: d */
    private static int m29963d(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: e */
    private static boolean m29962e(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b */
    public C3566i getAdapter2() {
        return (C3566i) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int m29882a;
        int m29963d;
        int m29882a2;
        int m29963d2;
        int width;
        int i;
        int left;
        int left2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C3566i adapter2 = getAdapter2();
        DateSelector<?> dateSelector = adapter2.f9917x;
        C3541b c3541b = adapter2.f9919z;
        int max = Math.max(adapter2.m29881b(), getFirstVisiblePosition());
        int min = Math.min(adapter2.m29874i(), getLastVisiblePosition());
        Long item = adapter2.getItem(max);
        Long item2 = adapter2.getItem(min);
        Iterator<C1072d<Long, Long>> it = dateSelector.m29974o().iterator();
        while (it.hasNext()) {
            C1072d<Long, Long> next = it.next();
            Long l = next.f3406a;
            if (l == null) {
                materialCalendarGridView = this;
            } else if (next.f3407b != null) {
                long longValue = l.longValue();
                long longValue2 = next.f3407b.longValue();
                if (!m29962e(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                    boolean m29488e = C3649p.m29488e(this);
                    if (longValue < item.longValue()) {
                        if (adapter2.m29877f(max)) {
                            left2 = 0;
                        } else if (!m29488e) {
                            left2 = materialCalendarGridView.m29964c(max - 1).getRight();
                        } else {
                            left2 = materialCalendarGridView.m29964c(max - 1).getLeft();
                        }
                        m29963d = left2;
                        m29882a = max;
                    } else {
                        materialCalendarGridView.f9820w.setTimeInMillis(longValue);
                        m29882a = adapter2.m29882a(materialCalendarGridView.f9820w.get(5));
                        m29963d = m29963d(materialCalendarGridView.m29964c(m29882a));
                    }
                    if (longValue2 > item2.longValue()) {
                        if (adapter2.m29876g(min)) {
                            left = getWidth();
                        } else if (!m29488e) {
                            left = materialCalendarGridView.m29964c(min).getRight();
                        } else {
                            left = materialCalendarGridView.m29964c(min).getLeft();
                        }
                        m29963d2 = left;
                        m29882a2 = min;
                    } else {
                        materialCalendarGridView.f9820w.setTimeInMillis(longValue2);
                        m29882a2 = adapter2.m29882a(materialCalendarGridView.f9820w.get(5));
                        m29963d2 = m29963d(materialCalendarGridView.m29964c(m29882a2));
                    }
                    int itemId = (int) adapter2.getItemId(m29882a);
                    int i2 = max;
                    int i3 = min;
                    int itemId2 = (int) adapter2.getItemId(m29882a2);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View m29964c = materialCalendarGridView.m29964c(numColumns);
                        int top = m29964c.getTop() + c3541b.f9835a.m29946c();
                        C3566i c3566i = adapter2;
                        int bottom = m29964c.getBottom() - c3541b.f9835a.m29947b();
                        if (!m29488e) {
                            i = numColumns > m29882a ? 0 : m29963d;
                            width = m29882a2 > numColumns2 ? getWidth() : m29963d2;
                        } else {
                            int i4 = m29882a2 > numColumns2 ? 0 : m29963d2;
                            width = numColumns > m29882a ? getWidth() : m29963d;
                            i = i4;
                        }
                        canvas.drawRect(i, top, width, bottom, c3541b.f9842h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        adapter2 = c3566i;
                    }
                    materialCalendarGridView = this;
                    max = i2;
                    min = i3;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m29966a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (super.onKeyDown(i, keyEvent)) {
            if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().m29881b()) {
                return true;
            }
            if (19 == i) {
                setSelection(getAdapter2().m29881b());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f9821x) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter2().m29881b()) {
            super.setSelection(getAdapter2().m29881b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9820w = C3575o.m29843k();
        if (C3557f.m29897O2(getContext())) {
            setNextFocusLeftId(C5423f.cancel_button);
            setNextFocusRightId(C5423f.confirm_button);
        }
        this.f9821x = C3557f.m29896P2(getContext());
        C1112b0.m38405s0(this, new C3538a(this));
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C3566i) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C3566i.class.getCanonicalName()));
    }
}
