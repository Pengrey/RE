package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.core.view.C1112b0;
import androidx.core.widget.C1237h;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.lang.reflect.Method;
import p070e.C4897a;
import p070e.C4906j;
import p209l.InterfaceC6954e;

/* renamed from: androidx.appcompat.widget.f0 */
/* loaded from: classes.dex */
public class C0471f0 implements InterfaceC6954e {

    /* renamed from: b0 */
    private static Method f1570b0;

    /* renamed from: c0 */
    private static Method f1571c0;

    /* renamed from: d0 */
    private static Method f1572d0;

    /* renamed from: A */
    private int f1573A;

    /* renamed from: B */
    private int f1574B;

    /* renamed from: C */
    private int f1575C;

    /* renamed from: D */
    private int f1576D;

    /* renamed from: E */
    private boolean f1577E;

    /* renamed from: F */
    private boolean f1578F;

    /* renamed from: G */
    private boolean f1579G;

    /* renamed from: H */
    private int f1580H;

    /* renamed from: I */
    private boolean f1581I;

    /* renamed from: J */
    private boolean f1582J;

    /* renamed from: K */
    int f1583K;

    /* renamed from: L */
    private View f1584L;

    /* renamed from: M */
    private int f1585M;

    /* renamed from: N */
    private DataSetObserver f1586N;

    /* renamed from: O */
    private View f1587O;

    /* renamed from: P */
    private Drawable f1588P;

    /* renamed from: Q */
    private AdapterView.OnItemClickListener f1589Q;

    /* renamed from: R */
    private AdapterView.OnItemSelectedListener f1590R;

    /* renamed from: S */
    final RunnableC0478g f1591S;

    /* renamed from: T */
    private final View$OnTouchListenerC0477f f1592T;

    /* renamed from: U */
    private final C0476e f1593U;

    /* renamed from: V */
    private final RunnableC0474c f1594V;

    /* renamed from: W */
    final Handler f1595W;

    /* renamed from: X */
    private final Rect f1596X;

    /* renamed from: Y */
    private Rect f1597Y;

    /* renamed from: Z */
    private boolean f1598Z;

    /* renamed from: a0 */
    PopupWindow f1599a0;

    /* renamed from: w */
    private Context f1600w;

    /* renamed from: x */
    private ListAdapter f1601x;

    /* renamed from: y */
    C0460c0 f1602y;

    /* renamed from: z */
    private int f1603z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.f0$a */
    /* loaded from: classes.dex */
    public class RunnableC0472a implements Runnable {
        RunnableC0472a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View m40613t = C0471f0.this.m40613t();
            if (m40613t == null || m40613t.getWindowToken() == null) {
                return;
            }
            C0471f0.this.mo19710a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.f0$b */
    /* loaded from: classes.dex */
    public class C0473b implements AdapterView.OnItemSelectedListener {
        C0473b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C0460c0 c0460c0;
            if (i == -1 || (c0460c0 = C0471f0.this.f1602y) == null) {
                return;
            }
            c0460c0.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.f0$c */
    /* loaded from: classes.dex */
    public class RunnableC0474c implements Runnable {
        RunnableC0474c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0471f0.this.m40614r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.f0$d */
    /* loaded from: classes.dex */
    public class C0475d extends DataSetObserver {
        C0475d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C0471f0.this.mo19709c()) {
                C0471f0.this.mo19710a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C0471f0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.f0$e */
    /* loaded from: classes.dex */
    public class C0476e implements AbsListView.OnScrollListener {
        C0476e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || C0471f0.this.m40639A() || C0471f0.this.f1599a0.getContentView() == null) {
                return;
            }
            C0471f0 c0471f0 = C0471f0.this;
            c0471f0.f1595W.removeCallbacks(c0471f0.f1591S);
            C0471f0.this.f1591S.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.f0$f */
    /* loaded from: classes.dex */
    public class View$OnTouchListenerC0477f implements View.OnTouchListener {
        View$OnTouchListenerC0477f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0471f0.this.f1599a0) != null && popupWindow.isShowing() && x >= 0 && x < C0471f0.this.f1599a0.getWidth() && y >= 0 && y < C0471f0.this.f1599a0.getHeight()) {
                C0471f0 c0471f0 = C0471f0.this;
                c0471f0.f1595W.postDelayed(c0471f0.f1591S, 250L);
                return false;
            } else if (action == 1) {
                C0471f0 c0471f02 = C0471f0.this;
                c0471f02.f1595W.removeCallbacks(c0471f02.f1591S);
                return false;
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.f0$g */
    /* loaded from: classes.dex */
    public class RunnableC0478g implements Runnable {
        RunnableC0478g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0460c0 c0460c0 = C0471f0.this.f1602y;
            if (c0460c0 == null || !C1112b0.m38447V(c0460c0) || C0471f0.this.f1602y.getCount() <= C0471f0.this.f1602y.getChildCount()) {
                return;
            }
            int childCount = C0471f0.this.f1602y.getChildCount();
            C0471f0 c0471f0 = C0471f0.this;
            if (childCount <= c0471f0.f1583K) {
                c0471f0.f1599a0.setInputMethodMode(2);
                C0471f0.this.mo19710a();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f1570b0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1572d0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f1571c0 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0471f0(Context context) {
        this(context, null, C4897a.listPopupWindowStyle);
    }

    /* renamed from: C */
    private void m40637C() {
        View view = this.f1584L;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1584L);
            }
        }
    }

    /* renamed from: N */
    private void m40626N(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1570b0;
            if (method != null) {
                try {
                    method.invoke(this.f1599a0, Boolean.valueOf(z));
                    return;
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        this.f1599a0.setIsClippedToScreen(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    private int m40615q() {
        int i;
        int i2;
        int makeMeasureSpec;
        int i3;
        if (this.f1602y == null) {
            Context context = this.f1600w;
            new RunnableC0472a();
            C0460c0 mo40592s = mo40592s(context, !this.f1598Z);
            this.f1602y = mo40592s;
            Drawable drawable = this.f1588P;
            if (drawable != null) {
                mo40592s.setSelector(drawable);
            }
            this.f1602y.setAdapter(this.f1601x);
            this.f1602y.setOnItemClickListener(this.f1589Q);
            this.f1602y.setFocusable(true);
            this.f1602y.setFocusableInTouchMode(true);
            this.f1602y.setOnItemSelectedListener(new C0473b());
            this.f1602y.setOnScrollListener(this.f1593U);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1590R;
            if (onItemSelectedListener != null) {
                this.f1602y.setOnItemSelectedListener(onItemSelectedListener);
            }
            C0460c0 c0460c0 = this.f1602y;
            View view = this.f1584L;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i4 = this.f1585M;
                if (i4 == 0) {
                    linearLayout.addView(view);
                    linearLayout.addView(c0460c0, layoutParams);
                } else if (i4 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f1585M);
                } else {
                    linearLayout.addView(c0460c0, layoutParams);
                    linearLayout.addView(view);
                }
                int i5 = this.f1573A;
                if (i5 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i3 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i5, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                c0460c0 = linearLayout;
            } else {
                i = 0;
            }
            this.f1599a0.setContentView(c0460c0);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f1599a0.getContentView();
            View view2 = this.f1584L;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.f1599a0.getBackground();
        if (background != null) {
            background.getPadding(this.f1596X);
            Rect rect = this.f1596X;
            int i6 = rect.top;
            i2 = rect.bottom + i6;
            if (!this.f1577E) {
                this.f1575C = -i6;
            }
        } else {
            this.f1596X.setEmpty();
            i2 = 0;
        }
        int m40612u = m40612u(m40613t(), this.f1575C, this.f1599a0.getInputMethodMode() == 2);
        if (this.f1581I || this.f1603z == -1) {
            return m40612u + i2;
        }
        int i7 = this.f1573A;
        if (i7 == -2) {
            int i8 = this.f1600w.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f1596X;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i7 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else {
            int i9 = this.f1600w.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f1596X;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect3.left + rect3.right), 1073741824);
        }
        int m40672d = this.f1602y.m40672d(makeMeasureSpec, 0, -1, m40612u - i, -1);
        if (m40672d > 0) {
            i += i2 + this.f1602y.getPaddingTop() + this.f1602y.getPaddingBottom();
        }
        return m40672d + i;
    }

    /* renamed from: u */
    private int m40612u(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f1571c0;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.f1599a0, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.f1599a0.getMaxAvailableHeight(view, i);
        }
        return this.f1599a0.getMaxAvailableHeight(view, i, z);
    }

    /* renamed from: A */
    public boolean m40639A() {
        return this.f1599a0.getInputMethodMode() == 2;
    }

    /* renamed from: B */
    public boolean m40638B() {
        return this.f1598Z;
    }

    /* renamed from: D */
    public void m40636D(View view) {
        this.f1587O = view;
    }

    /* renamed from: E */
    public void m40635E(int i) {
        this.f1599a0.setAnimationStyle(i);
    }

    /* renamed from: F */
    public void m40634F(int i) {
        Drawable background = this.f1599a0.getBackground();
        if (background != null) {
            background.getPadding(this.f1596X);
            Rect rect = this.f1596X;
            this.f1573A = rect.left + rect.right + i;
            return;
        }
        m40623Q(i);
    }

    /* renamed from: G */
    public void m40633G(int i) {
        this.f1580H = i;
    }

    /* renamed from: H */
    public void m40632H(Rect rect) {
        this.f1597Y = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: I */
    public void m40631I(int i) {
        this.f1599a0.setInputMethodMode(i);
    }

    /* renamed from: J */
    public void m40630J(boolean z) {
        this.f1598Z = z;
        this.f1599a0.setFocusable(z);
    }

    /* renamed from: K */
    public void m40629K(PopupWindow.OnDismissListener onDismissListener) {
        this.f1599a0.setOnDismissListener(onDismissListener);
    }

    /* renamed from: L */
    public void m40628L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1589Q = onItemClickListener;
    }

    /* renamed from: M */
    public void m40627M(boolean z) {
        this.f1579G = true;
        this.f1578F = z;
    }

    /* renamed from: O */
    public void m40625O(int i) {
        this.f1585M = i;
    }

    /* renamed from: P */
    public void m40624P(int i) {
        C0460c0 c0460c0 = this.f1602y;
        if (!mo19709c() || c0460c0 == null) {
            return;
        }
        c0460c0.setListSelectionHidden(false);
        c0460c0.setSelection(i);
        if (c0460c0.getChoiceMode() != 0) {
            c0460c0.setItemChecked(i, true);
        }
    }

    /* renamed from: Q */
    public void m40623Q(int i) {
        this.f1573A = i;
    }

    @Override // p209l.InterfaceC6954e
    /* renamed from: a */
    public void mo19710a() {
        int m40615q = m40615q();
        boolean m40639A = m40639A();
        C1237h.m37895b(this.f1599a0, this.f1576D);
        boolean z = true;
        if (this.f1599a0.isShowing()) {
            if (C1112b0.m38447V(m40613t())) {
                int i = this.f1573A;
                if (i == -1) {
                    i = -1;
                } else if (i == -2) {
                    i = m40613t().getWidth();
                }
                int i2 = this.f1603z;
                if (i2 == -1) {
                    if (!m40639A) {
                        m40615q = -1;
                    }
                    if (m40639A) {
                        this.f1599a0.setWidth(this.f1573A == -1 ? -1 : 0);
                        this.f1599a0.setHeight(0);
                    } else {
                        this.f1599a0.setWidth(this.f1573A == -1 ? -1 : 0);
                        this.f1599a0.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    m40615q = i2;
                }
                PopupWindow popupWindow = this.f1599a0;
                if (this.f1582J || this.f1581I) {
                    z = false;
                }
                popupWindow.setOutsideTouchable(z);
                this.f1599a0.update(m40613t(), this.f1574B, this.f1575C, i < 0 ? -1 : i, m40615q < 0 ? -1 : m40615q);
                return;
            }
            return;
        }
        int i3 = this.f1573A;
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = m40613t().getWidth();
        }
        int i4 = this.f1603z;
        if (i4 == -1) {
            m40615q = -1;
        } else if (i4 != -2) {
            m40615q = i4;
        }
        this.f1599a0.setWidth(i3);
        this.f1599a0.setHeight(m40615q);
        m40626N(true);
        this.f1599a0.setOutsideTouchable((this.f1582J || this.f1581I) ? false : true);
        this.f1599a0.setTouchInterceptor(this.f1592T);
        if (this.f1579G) {
            C1237h.m37896a(this.f1599a0, this.f1578F);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1572d0;
            if (method != null) {
                try {
                    method.invoke(this.f1599a0, this.f1597Y);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            this.f1599a0.setEpicenterBounds(this.f1597Y);
        }
        C1237h.m37894c(this.f1599a0, m40613t(), this.f1574B, this.f1575C, this.f1580H);
        this.f1602y.setSelection(-1);
        if (!this.f1598Z || this.f1602y.isInTouchMode()) {
            m40614r();
        }
        if (this.f1598Z) {
            return;
        }
        this.f1595W.post(this.f1594V);
    }

    /* renamed from: b */
    public void m40622b(Drawable drawable) {
        this.f1599a0.setBackgroundDrawable(drawable);
    }

    @Override // p209l.InterfaceC6954e
    /* renamed from: c */
    public boolean mo19709c() {
        return this.f1599a0.isShowing();
    }

    /* renamed from: d */
    public int m40621d() {
        return this.f1574B;
    }

    @Override // p209l.InterfaceC6954e
    public void dismiss() {
        this.f1599a0.dismiss();
        m40637C();
        this.f1599a0.setContentView(null);
        this.f1602y = null;
        this.f1595W.removeCallbacks(this.f1591S);
    }

    /* renamed from: g */
    public Drawable m40620g() {
        return this.f1599a0.getBackground();
    }

    @Override // p209l.InterfaceC6954e
    /* renamed from: h */
    public ListView mo19708h() {
        return this.f1602y;
    }

    /* renamed from: j */
    public void m40619j(int i) {
        this.f1575C = i;
        this.f1577E = true;
    }

    /* renamed from: l */
    public void m40618l(int i) {
        this.f1574B = i;
    }

    /* renamed from: n */
    public int m40617n() {
        if (this.f1577E) {
            return this.f1575C;
        }
        return 0;
    }

    /* renamed from: p */
    public void mo40616p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1586N;
        if (dataSetObserver == null) {
            this.f1586N = new C0475d();
        } else {
            ListAdapter listAdapter2 = this.f1601x;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1601x = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1586N);
        }
        C0460c0 c0460c0 = this.f1602y;
        if (c0460c0 != null) {
            c0460c0.setAdapter(this.f1601x);
        }
    }

    /* renamed from: r */
    public void m40614r() {
        C0460c0 c0460c0 = this.f1602y;
        if (c0460c0 != null) {
            c0460c0.setListSelectionHidden(true);
            c0460c0.requestLayout();
        }
    }

    /* renamed from: s */
    C0460c0 mo40592s(Context context, boolean z) {
        return new C0460c0(context, z);
    }

    /* renamed from: t */
    public View m40613t() {
        return this.f1587O;
    }

    /* renamed from: v */
    public Object m40611v() {
        if (mo19709c()) {
            return this.f1602y.getSelectedItem();
        }
        return null;
    }

    /* renamed from: w */
    public long m40610w() {
        if (mo19709c()) {
            return this.f1602y.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: x */
    public int m40609x() {
        if (mo19709c()) {
            return this.f1602y.getSelectedItemPosition();
        }
        return -1;
    }

    /* renamed from: y */
    public View m40608y() {
        if (mo19709c()) {
            return this.f1602y.getSelectedView();
        }
        return null;
    }

    /* renamed from: z */
    public int m40607z() {
        return this.f1573A;
    }

    public C0471f0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0471f0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1603z = -2;
        this.f1573A = -2;
        this.f1576D = 1002;
        this.f1580H = 0;
        this.f1581I = false;
        this.f1582J = false;
        this.f1583K = Reader.READ_DONE;
        this.f1585M = 0;
        this.f1591S = new RunnableC0478g();
        this.f1592T = new View$OnTouchListenerC0477f();
        this.f1593U = new C0476e();
        this.f1594V = new RunnableC0474c();
        this.f1596X = new Rect();
        this.f1600w = context;
        this.f1595W = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4906j.f13493a1, i, i2);
        this.f1574B = obtainStyledAttributes.getDimensionPixelOffset(C4906j.f13498b1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C4906j.f13503c1, 0);
        this.f1575C = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1577E = true;
        }
        obtainStyledAttributes.recycle();
        C0509o c0509o = new C0509o(context, attributeSet, i, i2);
        this.f1599a0 = c0509o;
        c0509o.setInputMethodMode(1);
    }
}
