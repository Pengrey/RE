package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.C0928a;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.util.C1070c;
import androidx.core.util.C1075g;
import androidx.core.util.InterfaceC1073e;
import androidx.core.view.C1112b0;
import androidx.core.view.C1158f;
import androidx.core.view.C1183m0;
import androidx.core.view.C1210t;
import androidx.core.view.InterfaceC1207q;
import androidx.core.view.InterfaceC1208r;
import androidx.core.view.InterfaceC1211u;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p114g2.C5598a;
import p114g2.C5599b;
import p114g2.C5600c;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC1207q, InterfaceC1208r {

    /* renamed from: Q */
    static final String f3004Q;

    /* renamed from: R */
    static final Class<?>[] f3005R;

    /* renamed from: S */
    static final ThreadLocal<Map<String, Constructor<AbstractC0873c>>> f3006S;

    /* renamed from: T */
    static final Comparator<View> f3007T;

    /* renamed from: U */
    private static final InterfaceC1073e<Rect> f3008U;

    /* renamed from: A */
    private Paint f3009A;

    /* renamed from: B */
    private final int[] f3010B;

    /* renamed from: C */
    private final int[] f3011C;

    /* renamed from: D */
    private boolean f3012D;

    /* renamed from: E */
    private boolean f3013E;

    /* renamed from: F */
    private int[] f3014F;

    /* renamed from: G */
    private View f3015G;

    /* renamed from: H */
    private View f3016H;

    /* renamed from: I */
    private ViewTreeObserver$OnPreDrawListenerC0877g f3017I;

    /* renamed from: J */
    private boolean f3018J;

    /* renamed from: K */
    private C1183m0 f3019K;

    /* renamed from: L */
    private boolean f3020L;

    /* renamed from: M */
    private Drawable f3021M;

    /* renamed from: N */
    ViewGroup.OnHierarchyChangeListener f3022N;

    /* renamed from: O */
    private InterfaceC1211u f3023O;

    /* renamed from: P */
    private final C1210t f3024P;

    /* renamed from: w */
    private final List<View> f3025w;

    /* renamed from: x */
    private final C0879a<View> f3026x;

    /* renamed from: y */
    private final List<View> f3027y;

    /* renamed from: z */
    private final List<View> f3028z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    /* loaded from: classes.dex */
    public class C0871a implements InterfaceC1211u {
        C0871a() {
        }

        @Override // androidx.core.view.InterfaceC1211u
        /* renamed from: a */
        public C1183m0 mo29259a(View view, C1183m0 c1183m0) {
            return CoordinatorLayout.this.m39340W(c1183m0);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0872b {
        AbstractC0873c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0873c<V extends View> {
        public AbstractC0873c() {
        }

        /* renamed from: A */
        public boolean mo30690n0(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return m39304z(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        /* renamed from: B */
        public void m39315B(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: C */
        public void mo30689o0(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                m39315B(coordinatorLayout, v, view);
            }
        }

        /* renamed from: D */
        public boolean mo28779D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean m39314a(CoordinatorLayout coordinatorLayout, V v) {
            return m39312d(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: b */
        public boolean mo29771E(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: c */
        public int m39313c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: d */
        public float m39312d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: e */
        public boolean mo28776e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: f */
        public C1183m0 m39311f(CoordinatorLayout coordinatorLayout, V v, C1183m0 c1183m0) {
            return c1183m0;
        }

        /* renamed from: g */
        public void mo28780g(C0876f c0876f) {
        }

        /* renamed from: h */
        public boolean mo29768H(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: i */
        public void mo30674i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: j */
        public void mo30363j() {
        }

        /* renamed from: k */
        public boolean mo29260k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: l */
        public boolean mo30696h0(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: m */
        public boolean mo30695i0(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: n */
        public boolean m39310n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: o */
        public boolean mo30356o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        /* renamed from: p */
        public void m39309p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: q */
        public void mo30694j0(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                m39309p(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: r */
        public void m39308r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: s */
        public void m39307s(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                m39308r(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: t */
        public void mo30693k0(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            m39307s(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        /* renamed from: u */
        public void m39306u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: v */
        public void m39305v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                m39306u(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: w */
        public boolean mo30673w(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: x */
        public void mo30692l0(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: y */
        public Parcelable mo30691m0(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: z */
        public boolean m39304z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public AbstractC0873c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    /* loaded from: classes.dex */
    public @interface InterfaceC0874d {
        Class<? extends AbstractC0873c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    /* loaded from: classes.dex */
    private class ViewGroup$OnHierarchyChangeListenerC0875e implements ViewGroup.OnHierarchyChangeListener {
        ViewGroup$OnHierarchyChangeListenerC0875e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3022N;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m39355H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3022N;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnPreDrawListenerC0877g implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC0877g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m39355H(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    /* loaded from: classes.dex */
    static class C0878h implements Comparator<View> {
        C0878h() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            float m38452Q = C1112b0.m38452Q(view);
            float m38452Q2 = C1112b0.m38452Q(view2);
            if (m38452Q > m38452Q2) {
                return -1;
            }
            return m38452Q < m38452Q2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f3004Q = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            f3007T = new C0878h();
        } else {
            f3007T = null;
        }
        f3005R = new Class[]{Context.class, AttributeSet.class};
        f3006S = new ThreadLocal<>();
        f3008U = new C1075g(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5598a.coordinatorLayoutStyle);
    }

    /* renamed from: A */
    private boolean m39362A(View view) {
        return this.f3026x.m39273j(view);
    }

    /* renamed from: C */
    private void m39360C(View view, int i) {
        C0876f c0876f = (C0876f) view.getLayoutParams();
        Rect m39338a = m39338a();
        m39338a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0876f).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0876f).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0876f).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0876f).bottomMargin);
        if (this.f3019K != null && C1112b0.m38482B(this) && !C1112b0.m38482B(view)) {
            m39338a.left += this.f3019K.m38105i();
            m39338a.top += this.f3019K.m38103k();
            m39338a.right -= this.f3019K.m38104j();
            m39338a.bottom -= this.f3019K.m38106h();
        }
        Rect m39338a2 = m39338a();
        C1158f.m38198a(m39344S(c0876f.f3034c), view.getMeasuredWidth(), view.getMeasuredHeight(), m39338a, m39338a2, i);
        view.layout(m39338a2.left, m39338a2.top, m39338a2.right, m39338a2.bottom);
        m39348O(m39338a);
        m39348O(m39338a2);
    }

    /* renamed from: D */
    private void m39359D(View view, View view2, int i) {
        Rect m39338a = m39338a();
        Rect m39338a2 = m39338a();
        try {
            m39325t(view2, m39338a);
            m39324u(view, i, m39338a, m39338a2);
            view.layout(m39338a2.left, m39338a2.top, m39338a2.right, m39338a2.bottom);
        } finally {
            m39348O(m39338a);
            m39348O(m39338a2);
        }
    }

    /* renamed from: E */
    private void m39358E(View view, int i, int i2) {
        C0876f c0876f = (C0876f) view.getLayoutParams();
        int m38197b = C1158f.m38197b(m39343T(c0876f.f3034c), i2);
        int i3 = m38197b & 7;
        int i4 = m38197b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int m39322w = m39322w(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            m39322w += measuredWidth / 2;
        } else if (i3 == 5) {
            m39322w += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0876f).leftMargin, Math.min(m39322w, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c0876f).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0876f).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0876f).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: F */
    private void m39357F(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (C1112b0.m38446W(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0876f c0876f = (C0876f) view.getLayoutParams();
            AbstractC0873c m39298f = c0876f.m39298f();
            Rect m39338a = m39338a();
            Rect m39338a2 = m39338a();
            m39338a2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (m39298f != null && m39298f.mo29771E(this, view, m39338a)) {
                if (!m39338a2.contains(m39338a)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + m39338a.toShortString() + " | Bounds:" + m39338a2.toShortString());
                }
            } else {
                m39338a.set(m39338a2);
            }
            m39348O(m39338a2);
            if (m39338a.isEmpty()) {
                m39348O(m39338a);
                return;
            }
            int m38197b = C1158f.m38197b(c0876f.f3039h, i);
            boolean z3 = true;
            if ((m38197b & 48) != 48 || (i6 = (m39338a.top - ((ViewGroup.MarginLayoutParams) c0876f).topMargin) - c0876f.f3041j) >= (i7 = rect.top)) {
                z = false;
            } else {
                m39341V(view, i7 - i6);
                z = true;
            }
            if ((m38197b & 80) == 80 && (height = ((getHeight() - m39338a.bottom) - ((ViewGroup.MarginLayoutParams) c0876f).bottomMargin) + c0876f.f3041j) < (i5 = rect.bottom)) {
                m39341V(view, height - i5);
                z = true;
            }
            if (!z) {
                m39341V(view, 0);
            }
            if ((m38197b & 3) != 3 || (i3 = (m39338a.left - ((ViewGroup.MarginLayoutParams) c0876f).leftMargin) - c0876f.f3040i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                m39342U(view, i4 - i3);
                z2 = true;
            }
            if ((m38197b & 5) != 5 || (width = ((getWidth() - m39338a.right) - ((ViewGroup.MarginLayoutParams) c0876f).rightMargin) + c0876f.f3040i) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                m39342U(view, width - i2);
            }
            if (!z3) {
                m39342U(view, 0);
            }
            m39348O(m39338a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K */
    static AbstractC0873c m39352K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f3004Q;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<AbstractC0873c>>> threadLocal = f3006S;
            Map<String, Constructor<AbstractC0873c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<AbstractC0873c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f3005R);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: L */
    private boolean m39351L(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f3027y;
        m39319z(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            C0876f c0876f = (C0876f) view.getLayoutParams();
            AbstractC0873c m39298f = c0876f.m39298f();
            if (!(z || z2) || actionMasked == 0) {
                if (!z && m39298f != null) {
                    if (i == 0) {
                        z = m39298f.mo29260k(this, view, motionEvent);
                    } else if (i == 1) {
                        z = m39298f.mo28779D(this, view, motionEvent);
                    }
                    if (z) {
                        this.f3015G = view;
                    }
                }
                boolean m39301c = c0876f.m39301c();
                boolean m39295i = c0876f.m39295i(this, view);
                z2 = m39295i && !m39301c;
                if (m39295i && !z2) {
                    break;
                }
            } else if (m39298f != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    m39298f.mo29260k(this, view, motionEvent2);
                } else if (i == 1) {
                    m39298f.mo28779D(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: M */
    private void m39350M() {
        this.f3025w.clear();
        this.f3026x.m39280c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0876f m39320y = m39320y(childAt);
            m39320y.m39300d(this, childAt);
            this.f3026x.m39281b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (m39320y.m39302b(this, childAt, childAt2)) {
                        if (!this.f3026x.m39279d(childAt2)) {
                            this.f3026x.m39281b(childAt2);
                        }
                        this.f3026x.m39282a(childAt2, childAt);
                    }
                }
            }
        }
        this.f3025w.addAll(this.f3026x.m39274i());
        Collections.reverse(this.f3025w);
    }

    /* renamed from: O */
    private static void m39348O(Rect rect) {
        rect.setEmpty();
        f3008U.mo38626a(rect);
    }

    /* renamed from: Q */
    private void m39346Q(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0873c m39298f = ((C0876f) childAt.getLayoutParams()).m39298f();
            if (m39298f != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    m39298f.mo29260k(this, childAt, obtain);
                } else {
                    m39298f.mo28779D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0876f) getChildAt(i2).getLayoutParams()).m39291m();
        }
        this.f3015G = null;
        this.f3012D = false;
    }

    /* renamed from: R */
    private static int m39345R(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: S */
    private static int m39344S(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: T */
    private static int m39343T(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: U */
    private void m39342U(View view, int i) {
        C0876f c0876f = (C0876f) view.getLayoutParams();
        int i2 = c0876f.f3040i;
        if (i2 != i) {
            C1112b0.m38437c0(view, i - i2);
            c0876f.f3040i = i;
        }
    }

    /* renamed from: V */
    private void m39341V(View view, int i) {
        C0876f c0876f = (C0876f) view.getLayoutParams();
        int i2 = c0876f.f3041j;
        if (i2 != i) {
            C1112b0.m38435d0(view, i - i2);
            c0876f.f3041j = i;
        }
    }

    /* renamed from: X */
    private void m39339X() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (C1112b0.m38482B(this)) {
            if (this.f3023O == null) {
                this.f3023O = new C0871a();
            }
            C1112b0.m38475E0(this, this.f3023O);
            setSystemUiVisibility(1280);
            return;
        }
        C1112b0.m38475E0(this, null);
    }

    /* renamed from: a */
    private static Rect m39338a() {
        Rect mo38625b = f3008U.mo38625b();
        return mo38625b == null ? new Rect() : mo38625b;
    }

    /* renamed from: c */
    private static int m39336c(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: d */
    private void m39335d(C0876f c0876f, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0876f).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0876f).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0876f).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0876f).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: e */
    private C1183m0 m39334e(C1183m0 c1183m0) {
        AbstractC0873c m39298f;
        if (c1183m0.m38100n()) {
            return c1183m0;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C1112b0.m38482B(childAt) && (m39298f = ((C0876f) childAt.getLayoutParams()).m39298f()) != null) {
                c1183m0 = m39298f.m39311f(this, childAt, c1183m0);
                if (c1183m0.m38100n()) {
                    break;
                }
            }
        }
        return c1183m0;
    }

    /* renamed from: v */
    private void m39323v(View view, int i, Rect rect, Rect rect2, C0876f c0876f, int i2, int i3) {
        int width;
        int height;
        int m38197b = C1158f.m38197b(m39345R(c0876f.f3034c), i);
        int m38197b2 = C1158f.m38197b(m39344S(c0876f.f3035d), i);
        int i4 = m38197b & 7;
        int i5 = m38197b & 112;
        int i6 = m38197b2 & 7;
        int i7 = m38197b2 & 112;
        if (i6 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i6 != 5) {
            width = rect.left;
        } else {
            width = rect.right;
        }
        if (i7 == 16) {
            height = rect.top + (rect.height() / 2);
        } else if (i7 != 80) {
            height = rect.top;
        } else {
            height = rect.bottom;
        }
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* renamed from: w */
    private int m39322w(int i) {
        int[] iArr = this.f3014F;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    /* renamed from: z */
    private void m39319z(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = f3007T;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: B */
    public boolean m39361B(View view, int i, int i2) {
        Rect m39338a = m39338a();
        m39325t(view, m39338a);
        try {
            return m39338a.contains(i, i2);
        } finally {
            m39348O(m39338a);
        }
    }

    /* renamed from: G */
    void m39356G(View view, int i) {
        AbstractC0873c m39298f;
        C0876f c0876f = (C0876f) view.getLayoutParams();
        if (c0876f.f3042k != null) {
            Rect m39338a = m39338a();
            Rect m39338a2 = m39338a();
            Rect m39338a3 = m39338a();
            m39325t(c0876f.f3042k, m39338a);
            boolean z = false;
            m39328q(view, false, m39338a2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m39323v(view, i, m39338a, m39338a3, c0876f, measuredWidth, measuredHeight);
            z = (m39338a3.left == m39338a2.left && m39338a3.top == m39338a2.top) ? true : true;
            m39335d(c0876f, m39338a3, measuredWidth, measuredHeight);
            int i2 = m39338a3.left - m39338a2.left;
            int i3 = m39338a3.top - m39338a2.top;
            if (i2 != 0) {
                C1112b0.m38437c0(view, i2);
            }
            if (i3 != 0) {
                C1112b0.m38435d0(view, i3);
            }
            if (z && (m39298f = c0876f.m39298f()) != null) {
                m39298f.mo29768H(this, view, c0876f.f3042k);
            }
            m39348O(m39338a);
            m39348O(m39338a2);
            m39348O(m39338a3);
        }
    }

    /* renamed from: H */
    final void m39355H(int i) {
        boolean z;
        int m38476E = C1112b0.m38476E(this);
        int size = this.f3025w.size();
        Rect m39338a = m39338a();
        Rect m39338a2 = m39338a();
        Rect m39338a3 = m39338a();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f3025w.get(i2);
            C0876f c0876f = (C0876f) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (c0876f.f3043l == this.f3025w.get(i3)) {
                        m39356G(view, m38476E);
                    }
                }
                m39328q(view, true, m39338a2);
                if (c0876f.f3038g != 0 && !m39338a2.isEmpty()) {
                    int m38197b = C1158f.m38197b(c0876f.f3038g, m38476E);
                    int i4 = m38197b & 112;
                    if (i4 == 48) {
                        m39338a.top = Math.max(m39338a.top, m39338a2.bottom);
                    } else if (i4 == 80) {
                        m39338a.bottom = Math.max(m39338a.bottom, getHeight() - m39338a2.top);
                    }
                    int i5 = m38197b & 7;
                    if (i5 == 3) {
                        m39338a.left = Math.max(m39338a.left, m39338a2.right);
                    } else if (i5 == 5) {
                        m39338a.right = Math.max(m39338a.right, getWidth() - m39338a2.left);
                    }
                }
                if (c0876f.f3039h != 0 && view.getVisibility() == 0) {
                    m39357F(view, m39338a, m38476E);
                }
                if (i != 2) {
                    m39321x(view, m39338a3);
                    if (!m39338a3.equals(m39338a2)) {
                        m39349N(view, m39338a2);
                    }
                }
                for (int i6 = i2 + 1; i6 < size; i6++) {
                    View view2 = this.f3025w.get(i6);
                    C0876f c0876f2 = (C0876f) view2.getLayoutParams();
                    AbstractC0873c m39298f = c0876f2.m39298f();
                    if (m39298f != null && m39298f.mo28776e(this, view2, view)) {
                        if (i == 0 && c0876f2.m39297g()) {
                            c0876f2.m39293k();
                        } else {
                            if (i != 2) {
                                z = m39298f.mo29768H(this, view2, view);
                            } else {
                                m39298f.mo30674i(this, view2, view);
                                z = true;
                            }
                            if (i == 1) {
                                c0876f2.m39288p(z);
                            }
                        }
                    }
                }
            }
        }
        m39348O(m39338a);
        m39348O(m39338a2);
        m39348O(m39338a3);
    }

    /* renamed from: I */
    public void m39354I(View view, int i) {
        C0876f c0876f = (C0876f) view.getLayoutParams();
        if (!c0876f.m39303a()) {
            View view2 = c0876f.f3042k;
            if (view2 != null) {
                m39359D(view, view2, i);
                return;
            }
            int i2 = c0876f.f3036e;
            if (i2 >= 0) {
                m39358E(view, i2, i);
                return;
            } else {
                m39360C(view, i);
                return;
            }
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    /* renamed from: J */
    public void m39353J(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* renamed from: N */
    void m39349N(View view, Rect rect) {
        ((C0876f) view.getLayoutParams()).m39287q(rect);
    }

    /* renamed from: P */
    void m39347P() {
        if (this.f3013E && this.f3017I != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3017I);
        }
        this.f3018J = false;
    }

    /* renamed from: W */
    final C1183m0 m39340W(C1183m0 c1183m0) {
        if (C1070c.m38634a(this.f3019K, c1183m0)) {
            return c1183m0;
        }
        this.f3019K = c1183m0;
        boolean z = true;
        boolean z2 = c1183m0 != null && c1183m0.m38103k() > 0;
        this.f3020L = z2;
        if (z2 || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        C1183m0 m39334e = m39334e(c1183m0);
        requestLayout();
        return m39334e;
    }

    /* renamed from: b */
    void m39337b() {
        if (this.f3013E) {
            if (this.f3017I == null) {
                this.f3017I = new ViewTreeObserver$OnPreDrawListenerC0877g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3017I);
        }
        this.f3018J = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0876f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        C0876f c0876f = (C0876f) view.getLayoutParams();
        AbstractC0873c abstractC0873c = c0876f.f3032a;
        if (abstractC0873c != null) {
            float m39312d = abstractC0873c.m39312d(this, view);
            if (m39312d > 0.0f) {
                if (this.f3009A == null) {
                    this.f3009A = new Paint();
                }
                this.f3009A.setColor(c0876f.f3032a.m39313c(this, view));
                this.f3009A.setAlpha(m39336c(Math.round(m39312d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f3009A);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3021M;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: f */
    public void m39333f(View view) {
        List m39276g = this.f3026x.m39276g(view);
        if (m39276g == null || m39276g.isEmpty()) {
            return;
        }
        for (int i = 0; i < m39276g.size(); i++) {
            View view2 = (View) m39276g.get(i);
            AbstractC0873c m39298f = ((C0876f) view2.getLayoutParams()).m39298f();
            if (m39298f != null) {
                m39298f.mo29768H(this, view2, view);
            }
        }
    }

    /* renamed from: g */
    void m39332g() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m39362A(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z != this.f3018J) {
            if (z) {
                m39337b();
            } else {
                m39347P();
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        m39350M();
        return Collections.unmodifiableList(this.f3025w);
    }

    public final C1183m0 getLastWindowInsets() {
        return this.f3019K;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3024P.m38022a();
    }

    public Drawable getStatusBarBackground() {
        return this.f3021M;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // androidx.core.view.InterfaceC1207q
    /* renamed from: h */
    public void mo37982h(View view, View view2, int i, int i2) {
        AbstractC0873c m39298f;
        this.f3024P.m38020c(view, view2, i, i2);
        this.f3016H = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0876f c0876f = (C0876f) childAt.getLayoutParams();
            if (c0876f.m39294j(i2) && (m39298f = c0876f.m39298f()) != null) {
                m39298f.m39305v(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // androidx.core.view.InterfaceC1207q
    /* renamed from: i */
    public void mo37981i(View view, int i) {
        this.f3024P.m38018e(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0876f c0876f = (C0876f) childAt.getLayoutParams();
            if (c0876f.m39294j(i)) {
                AbstractC0873c m39298f = c0876f.m39298f();
                if (m39298f != null) {
                    m39298f.mo30689o0(this, childAt, view, i);
                }
                c0876f.m39292l(i);
                c0876f.m39293k();
            }
        }
        this.f3016H = null;
    }

    @Override // androidx.core.view.InterfaceC1207q
    /* renamed from: j */
    public void mo37980j(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0873c m39298f;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0876f c0876f = (C0876f) childAt.getLayoutParams();
                if (c0876f.m39294j(i3) && (m39298f = c0876f.m39298f()) != null) {
                    int[] iArr2 = this.f3010B;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    m39298f.mo30694j0(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f3010B;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f3010B;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            m39355H(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: k */
    public C0876f generateDefaultLayoutParams() {
        return new C0876f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: l */
    public C0876f generateLayoutParams(AttributeSet attributeSet) {
        return new C0876f(getContext(), attributeSet);
    }

    @Override // androidx.core.view.InterfaceC1208r
    /* renamed from: m */
    public void mo37977m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC0873c m39298f;
        boolean z;
        int min;
        int childCount = getChildCount();
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0876f c0876f = (C0876f) childAt.getLayoutParams();
                if (c0876f.m39294j(i5) && (m39298f = c0876f.m39298f()) != null) {
                    int[] iArr2 = this.f3010B;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    m39298f.mo30693k0(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f3010B;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    if (i4 > 0) {
                        z = true;
                        min = Math.max(i7, this.f3010B[1]);
                    } else {
                        z = true;
                        min = Math.min(i7, this.f3010B[1]);
                    }
                    i7 = min;
                    z2 = z;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z2) {
            m39355H(1);
        }
    }

    @Override // androidx.core.view.InterfaceC1207q
    /* renamed from: n */
    public void mo37976n(View view, int i, int i2, int i3, int i4, int i5) {
        mo37977m(view, i, i2, i3, i4, 0, this.f3011C);
    }

    @Override // androidx.core.view.InterfaceC1207q
    /* renamed from: o */
    public boolean mo37975o(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0876f c0876f = (C0876f) childAt.getLayoutParams();
                AbstractC0873c m39298f = c0876f.m39298f();
                if (m39298f != null) {
                    boolean mo30690n0 = m39298f.mo30690n0(this, childAt, view, view2, i, i2);
                    z |= mo30690n0;
                    c0876f.m39286r(i2, mo30690n0);
                } else {
                    c0876f.m39286r(i2, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m39346Q(false);
        if (this.f3018J) {
            if (this.f3017I == null) {
                this.f3017I = new ViewTreeObserver$OnPreDrawListenerC0877g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3017I);
        }
        if (this.f3019K == null && C1112b0.m38482B(this)) {
            C1112b0.m38411p0(this);
        }
        this.f3013E = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m39346Q(false);
        if (this.f3018J && this.f3017I != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3017I);
        }
        View view = this.f3016H;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f3013E = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f3020L || this.f3021M == null) {
            return;
        }
        C1183m0 c1183m0 = this.f3019K;
        int m38103k = c1183m0 != null ? c1183m0.m38103k() : 0;
        if (m38103k > 0) {
            this.f3021M.setBounds(0, 0, getWidth(), m38103k);
            this.f3021M.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m39346Q(true);
        }
        boolean m39351L = m39351L(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m39346Q(true);
        }
        return m39351L;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0873c m39298f;
        int m38476E = C1112b0.m38476E(this);
        int size = this.f3025w.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f3025w.get(i5);
            if (view.getVisibility() != 8 && ((m39298f = ((C0876f) view.getLayoutParams()).m39298f()) == null || !m39298f.mo30696h0(this, view, m38476E))) {
                m39354I(view, m38476E);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011a, code lost:
        if (r0.mo30695i0(r30, r20, r11, r21, r23, 0) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        AbstractC0873c m39298f;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0876f c0876f = (C0876f) childAt.getLayoutParams();
                if (c0876f.m39294j(0) && (m39298f = c0876f.m39298f()) != null) {
                    z2 |= m39298f.m39310n(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            m39355H(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0873c m39298f;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0876f c0876f = (C0876f) childAt.getLayoutParams();
                if (c0876f.m39294j(0) && (m39298f = c0876f.m39298f()) != null) {
                    z |= m39298f.mo30356o(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo37980j(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo37976n(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo37982h(view, view2, i, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m37835a());
        SparseArray<Parcelable> sparseArray = savedState.f3029y;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id2 = childAt.getId();
            AbstractC0873c m39298f = m39320y(childAt).m39298f();
            if (id2 != -1 && m39298f != null && (parcelable2 = sparseArray.get(id2)) != null) {
                m39298f.mo30692l0(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable mo30691m0;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id2 = childAt.getId();
            AbstractC0873c m39298f = ((C0876f) childAt.getLayoutParams()).m39298f();
            if (id2 != -1 && m39298f != null && (mo30691m0 = m39298f.mo30691m0(this, childAt)) != null) {
                sparseArray.append(id2, mo30691m0);
            }
        }
        savedState.f3029y = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo37975o(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public void onStopNestedScroll(View view) {
        mo37981i(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f3015G
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.m39351L(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.f3015G
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0876f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.m39298f()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.f3015G
            boolean r6 = r6.mo28779D(r0, r7, r1)
            goto L2c
        L2b:
            r6 = r5
        L2c:
            android.view.View r7 = r0.f3015G
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.m39346Q(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: p */
    public C0876f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0876f) {
            return new C0876f((C0876f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0876f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0876f(layoutParams);
    }

    /* renamed from: q */
    void m39328q(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m39325t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: r */
    public List<View> m39327r(View view) {
        List<View> m39275h = this.f3026x.m39275h(view);
        this.f3028z.clear();
        if (m39275h != null) {
            this.f3028z.addAll(m39275h);
        }
        return this.f3028z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0873c m39298f = ((C0876f) view.getLayoutParams()).m39298f();
        if (m39298f == null || !m39298f.mo30673w(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f3012D) {
            return;
        }
        m39346Q(false);
        this.f3012D = true;
    }

    /* renamed from: s */
    public List<View> m39326s(View view) {
        List m39276g = this.f3026x.m39276g(view);
        this.f3028z.clear();
        if (m39276g != null) {
            this.f3028z.addAll(m39276g);
        }
        return this.f3028z;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m39339X();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3022N = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f3021M;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f3021M = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f3021M.setState(getDrawableState());
                }
                C0981a.m38864m(this.f3021M, C1112b0.m38476E(this));
                this.f3021M.setVisible(getVisibility() == 0, false);
                this.f3021M.setCallback(this);
            }
            C1112b0.m38423j0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0928a.m39111f(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f3021M;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f3021M.setVisible(z, false);
    }

    /* renamed from: t */
    void m39325t(View view, Rect rect) {
        C0880b.m39271a(this, view, rect);
    }

    /* renamed from: u */
    void m39324u(View view, int i, Rect rect, Rect rect2) {
        C0876f c0876f = (C0876f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m39323v(view, i, rect, rect2, c0876f, measuredWidth, measuredHeight);
        m39335d(c0876f, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3021M;
    }

    /* renamed from: x */
    void m39321x(View view, Rect rect) {
        rect.set(((C0876f) view.getLayoutParams()).m39296h());
    }

    /* renamed from: y */
    C0876f m39320y(View view) {
        C0876f c0876f = (C0876f) view.getLayoutParams();
        if (!c0876f.f3033b) {
            if (view instanceof InterfaceC0872b) {
                AbstractC0873c behavior = ((InterfaceC0872b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c0876f.m39289o(behavior);
                c0876f.f3033b = true;
            } else {
                InterfaceC0874d interfaceC0874d = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    interfaceC0874d = (InterfaceC0874d) cls.getAnnotation(InterfaceC0874d.class);
                    if (interfaceC0874d != null) {
                        break;
                    }
                }
                if (interfaceC0874d != null) {
                    try {
                        c0876f.m39289o(interfaceC0874d.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0874d.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                c0876f.f3033b = true;
            }
        }
        return c0876f;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.f3025w = new ArrayList();
        this.f3026x = new C0879a<>();
        this.f3027y = new ArrayList();
        this.f3028z = new ArrayList();
        this.f3010B = new int[2];
        this.f3011C = new int[2];
        this.f3024P = new C1210t(this);
        if (i == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5600c.f15817a, 0, C5599b.Widget_Support_CoordinatorLayout);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5600c.f15817a, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, C5600c.f15817a, attributeSet, obtainStyledAttributes, 0, C5599b.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, C5600c.f15817a, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(C5600c.f15818b, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f3014F = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f3014F.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f3014F;
                iArr[i2] = (int) (iArr[i2] * f);
            }
        }
        this.f3021M = obtainStyledAttributes.getDrawable(C5600c.f15819c);
        obtainStyledAttributes.recycle();
        m39339X();
        super.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC0875e());
        if (C1112b0.m38480C(this) == 0) {
            C1112b0.m38479C0(this, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0870a();

        /* renamed from: y */
        SparseArray<Parcelable> f3029y;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        /* loaded from: classes.dex */
        static class C0870a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0870a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f3029y = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f3029y.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f3029y;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f3029y.keyAt(i2);
                parcelableArr[i2] = this.f3029y.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    /* loaded from: classes.dex */
    public static class C0876f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        AbstractC0873c f3032a;

        /* renamed from: b */
        boolean f3033b;

        /* renamed from: c */
        public int f3034c;

        /* renamed from: d */
        public int f3035d;

        /* renamed from: e */
        public int f3036e;

        /* renamed from: f */
        int f3037f;

        /* renamed from: g */
        public int f3038g;

        /* renamed from: h */
        public int f3039h;

        /* renamed from: i */
        int f3040i;

        /* renamed from: j */
        int f3041j;

        /* renamed from: k */
        View f3042k;

        /* renamed from: l */
        View f3043l;

        /* renamed from: m */
        private boolean f3044m;

        /* renamed from: n */
        private boolean f3045n;

        /* renamed from: o */
        private boolean f3046o;

        /* renamed from: p */
        private boolean f3047p;

        /* renamed from: q */
        final Rect f3048q;

        public C0876f(int i, int i2) {
            super(i, i2);
            this.f3033b = false;
            this.f3034c = 0;
            this.f3035d = 0;
            this.f3036e = -1;
            this.f3037f = -1;
            this.f3038g = 0;
            this.f3039h = 0;
            this.f3048q = new Rect();
        }

        /* renamed from: n */
        private void m39290n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f3037f);
            this.f3042k = findViewById;
            if (findViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f3043l = null;
                    this.f3042k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f3037f) + " to anchor view " + view);
            } else if (findViewById == coordinatorLayout) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f3043l = null;
                    this.f3042k = null;
                    return;
                }
                throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
            } else {
                for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                    if (parent == view) {
                        if (coordinatorLayout.isInEditMode()) {
                            this.f3043l = null;
                            this.f3042k = null;
                            return;
                        }
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    if (parent instanceof View) {
                        findViewById = (View) parent;
                    }
                }
                this.f3043l = findViewById;
            }
        }

        /* renamed from: s */
        private boolean m39285s(View view, int i) {
            int m38197b = C1158f.m38197b(((C0876f) view.getLayoutParams()).f3038g, i);
            return m38197b != 0 && (C1158f.m38197b(this.f3039h, i) & m38197b) == m38197b;
        }

        /* renamed from: t */
        private boolean m39284t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f3042k.getId() != this.f3037f) {
                return false;
            }
            View view2 = this.f3042k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent != null && parent != view) {
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    }
                } else {
                    this.f3043l = null;
                    this.f3042k = null;
                    return false;
                }
            }
            this.f3043l = view2;
            return true;
        }

        /* renamed from: a */
        boolean m39303a() {
            return this.f3042k == null && this.f3037f != -1;
        }

        /* renamed from: b */
        boolean m39302b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC0873c abstractC0873c;
            return view2 == this.f3043l || m39285s(view2, C1112b0.m38476E(coordinatorLayout)) || ((abstractC0873c = this.f3032a) != null && abstractC0873c.mo28776e(coordinatorLayout, view, view2));
        }

        /* renamed from: c */
        boolean m39301c() {
            if (this.f3032a == null) {
                this.f3044m = false;
            }
            return this.f3044m;
        }

        /* renamed from: d */
        View m39300d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f3037f == -1) {
                this.f3043l = null;
                this.f3042k = null;
                return null;
            }
            if (this.f3042k == null || !m39284t(view, coordinatorLayout)) {
                m39290n(view, coordinatorLayout);
            }
            return this.f3042k;
        }

        /* renamed from: e */
        public int m39299e() {
            return this.f3037f;
        }

        /* renamed from: f */
        public AbstractC0873c m39298f() {
            return this.f3032a;
        }

        /* renamed from: g */
        boolean m39297g() {
            return this.f3047p;
        }

        /* renamed from: h */
        Rect m39296h() {
            return this.f3048q;
        }

        /* renamed from: i */
        boolean m39295i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f3044m;
            if (z) {
                return true;
            }
            AbstractC0873c abstractC0873c = this.f3032a;
            boolean m39314a = (abstractC0873c != null ? abstractC0873c.m39314a(coordinatorLayout, view) : false) | z;
            this.f3044m = m39314a;
            return m39314a;
        }

        /* renamed from: j */
        boolean m39294j(int i) {
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                return this.f3046o;
            }
            return this.f3045n;
        }

        /* renamed from: k */
        void m39293k() {
            this.f3047p = false;
        }

        /* renamed from: l */
        void m39292l(int i) {
            m39286r(i, false);
        }

        /* renamed from: m */
        void m39291m() {
            this.f3044m = false;
        }

        /* renamed from: o */
        public void m39289o(AbstractC0873c abstractC0873c) {
            AbstractC0873c abstractC0873c2 = this.f3032a;
            if (abstractC0873c2 != abstractC0873c) {
                if (abstractC0873c2 != null) {
                    abstractC0873c2.mo30363j();
                }
                this.f3032a = abstractC0873c;
                this.f3033b = true;
                if (abstractC0873c != null) {
                    abstractC0873c.mo28780g(this);
                }
            }
        }

        /* renamed from: p */
        void m39288p(boolean z) {
            this.f3047p = z;
        }

        /* renamed from: q */
        void m39287q(Rect rect) {
            this.f3048q.set(rect);
        }

        /* renamed from: r */
        void m39286r(int i, boolean z) {
            if (i == 0) {
                this.f3045n = z;
            } else if (i != 1) {
            } else {
                this.f3046o = z;
            }
        }

        C0876f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3033b = false;
            this.f3034c = 0;
            this.f3035d = 0;
            this.f3036e = -1;
            this.f3037f = -1;
            this.f3038g = 0;
            this.f3039h = 0;
            this.f3048q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5600c.f15820d);
            this.f3034c = obtainStyledAttributes.getInteger(C5600c.f15821e, 0);
            this.f3037f = obtainStyledAttributes.getResourceId(C5600c.f15822f, -1);
            this.f3035d = obtainStyledAttributes.getInteger(C5600c.f15823g, 0);
            this.f3036e = obtainStyledAttributes.getInteger(C5600c.f15827k, -1);
            this.f3038g = obtainStyledAttributes.getInt(C5600c.f15826j, 0);
            this.f3039h = obtainStyledAttributes.getInt(C5600c.f15825i, 0);
            int i = C5600c.f15824h;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.f3033b = hasValue;
            if (hasValue) {
                this.f3032a = CoordinatorLayout.m39352K(context, attributeSet, obtainStyledAttributes.getString(i));
            }
            obtainStyledAttributes.recycle();
            AbstractC0873c abstractC0873c = this.f3032a;
            if (abstractC0873c != null) {
                abstractC0873c.mo28780g(this);
            }
        }

        public C0876f(C0876f c0876f) {
            super((ViewGroup.MarginLayoutParams) c0876f);
            this.f3033b = false;
            this.f3034c = 0;
            this.f3035d = 0;
            this.f3036e = -1;
            this.f3037f = -1;
            this.f3038g = 0;
            this.f3039h = 0;
            this.f3048q = new Rect();
        }

        public C0876f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3033b = false;
            this.f3034c = 0;
            this.f3035d = 0;
            this.f3036e = -1;
            this.f3037f = -1;
            this.f3038g = 0;
            this.f3039h = 0;
            this.f3048q = new Rect();
        }

        public C0876f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3033b = false;
            this.f3034c = 0;
            this.f3035d = 0;
            this.f3036e = -1;
            this.f3037f = -1;
            this.f3038g = 0;
            this.f3039h = 0;
            this.f3048q = new Rect();
        }
    }
}
