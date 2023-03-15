package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.view.C1166h0;
import androidx.core.widget.C1234f;
import java.lang.reflect.Field;
import p070e.C4897a;
import p125h.C5729c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.c0 */
/* loaded from: classes.dex */
public class C0460c0 extends ListView {

    /* renamed from: A */
    private int f1532A;

    /* renamed from: B */
    private int f1533B;

    /* renamed from: C */
    private Field f1534C;

    /* renamed from: D */
    private C0461a f1535D;

    /* renamed from: E */
    private boolean f1536E;

    /* renamed from: F */
    private boolean f1537F;

    /* renamed from: G */
    private boolean f1538G;

    /* renamed from: H */
    private C1166h0 f1539H;

    /* renamed from: I */
    private C1234f f1540I;

    /* renamed from: J */
    RunnableC0462b f1541J;

    /* renamed from: w */
    private final Rect f1542w;

    /* renamed from: x */
    private int f1543x;

    /* renamed from: y */
    private int f1544y;

    /* renamed from: z */
    private int f1545z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DropDownListView.java */
    /* renamed from: androidx.appcompat.widget.c0$a */
    /* loaded from: classes.dex */
    public static class C0461a extends C5729c {

        /* renamed from: x */
        private boolean f1546x;

        C0461a(Drawable drawable) {
            super(drawable);
            this.f1546x = true;
        }

        /* renamed from: c */
        void m40664c(boolean z) {
            this.f1546x = z;
        }

        @Override // p125h.C5729c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1546x) {
                super.draw(canvas);
            }
        }

        @Override // p125h.C5729c, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f1546x) {
                super.setHotspot(f, f2);
            }
        }

        @Override // p125h.C5729c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1546x) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // p125h.C5729c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1546x) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p125h.C5729c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1546x) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DropDownListView.java */
    /* renamed from: androidx.appcompat.widget.c0$b */
    /* loaded from: classes.dex */
    public class RunnableC0462b implements Runnable {
        RunnableC0462b() {
        }

        /* renamed from: a */
        public void m40663a() {
            C0460c0 c0460c0 = C0460c0.this;
            c0460c0.f1541J = null;
            c0460c0.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m40662b() {
            C0460c0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C0460c0 c0460c0 = C0460c0.this;
            c0460c0.f1541J = null;
            c0460c0.drawableStateChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0460c0(Context context, boolean z) {
        super(context, null, C4897a.dropDownListViewStyle);
        this.f1542w = new Rect();
        this.f1543x = 0;
        this.f1544y = 0;
        this.f1545z = 0;
        this.f1532A = 0;
        this.f1537F = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1534C = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m40675a() {
        this.f1538G = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1533B - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C1166h0 c1166h0 = this.f1539H;
        if (c1166h0 != null) {
            c1166h0.m38169c();
            this.f1539H = null;
        }
    }

    /* renamed from: b */
    private void m40674b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    private void m40673c(Canvas canvas) {
        Drawable selector;
        if (this.f1542w.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1542w);
        selector.draw(canvas);
    }

    /* renamed from: f */
    private void m40670f(int i, View view) {
        Rect rect = this.f1542w;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1543x;
        rect.top -= this.f1544y;
        rect.right += this.f1545z;
        rect.bottom += this.f1532A;
        try {
            boolean z = this.f1534C.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f1534C.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m40669g(int i, View view) {
        Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        m40670f(i, view);
        if (z) {
            Rect rect = this.f1542w;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            C0981a.m38866k(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    private void m40668h(int i, View view, float f, float f2) {
        m40669g(i, view);
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        C0981a.m38866k(selector, f, f2);
    }

    /* renamed from: i */
    private void m40667i(View view, int i, float f, float f2) {
        View childAt;
        this.f1538G = true;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i3 = this.f1533B;
        if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1533B = i;
        float left = f - view.getLeft();
        float top = f2 - view.getTop();
        if (i2 >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m40668h(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: j */
    private boolean m40666j() {
        return this.f1538G;
    }

    /* renamed from: k */
    private void m40665k() {
        Drawable selector = getSelector();
        if (selector != null && m40666j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0461a c0461a = this.f1535D;
        if (c0461a != null) {
            c0461a.m40664c(z);
        }
    }

    /* renamed from: d */
    public int m40672d(int i, int i2, int i3, int i4, int i5) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        View view = null;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            if (i10 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, makeMeasureSpec);
            view.forceLayout();
            if (i7 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                return (i5 < 0 || i7 <= i5 || i9 <= 0 || i6 == i4) ? i4 : i9;
            }
            if (i5 >= 0 && i7 >= i5) {
                i9 = i6;
            }
            i7++;
        }
        return i6;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m40673c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f1541J != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m40665k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r0 != 3) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m40671e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = r1
            r3 = r2
            goto L46
        L11:
            r9 = r1
            r3 = r9
            goto L46
        L14:
            r3 = r2
            goto L17
        L16:
            r3 = r1
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r2
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m40667i(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.m40674b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.m40675a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.f r9 = r7.f1540I
            if (r9 != 0) goto L5a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.f1540I = r9
        L5a:
            androidx.core.widget.f r9 = r7.f1540I
            r9.m37951m(r2)
            androidx.core.widget.f r9 = r7.f1540I
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.f r8 = r7.f1540I
            if (r8 == 0) goto L6c
            r8.m37951m(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0460c0.m40671e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1537F || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1537F || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1537F || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1537F && this.f1536E) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f1541J = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1541J == null) {
            RunnableC0462b runnableC0462b = new RunnableC0462b();
            this.f1541J = runnableC0462b;
            runnableC0462b.m40662b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m40665k();
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1533B = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0462b runnableC0462b = this.f1541J;
        if (runnableC0462b != null) {
            runnableC0462b.m40663a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f1536E = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0461a c0461a = drawable != null ? new C0461a(drawable) : null;
        this.f1535D = c0461a;
        super.setSelector(c0461a);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1543x = rect.left;
        this.f1544y = rect.top;
        this.f1545z = rect.right;
        this.f1532A = rect.bottom;
    }
}
