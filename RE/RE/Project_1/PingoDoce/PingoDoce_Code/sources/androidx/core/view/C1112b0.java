package androidx.core.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.C1078a;
import androidx.core.view.C1112b0;
import androidx.core.view.C1183m0;
import androidx.core.view.accessibility.C1085c;
import androidx.core.view.accessibility.InterfaceC1097f;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p128h2.C5816c;
import p301q.C9558g;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.view.b0 */
/* loaded from: classes.dex */
public class C1112b0 {

    /* renamed from: b */
    private static Field f3449b;

    /* renamed from: c */
    private static boolean f3450c;

    /* renamed from: d */
    private static Field f3451d;

    /* renamed from: e */
    private static boolean f3452e;

    /* renamed from: f */
    private static WeakHashMap<View, String> f3453f;

    /* renamed from: h */
    private static Field f3454h;

    /* renamed from: j */
    private static ThreadLocal<Rect> f3455j;

    /* renamed from: a */
    private static final AtomicInteger f3456a = new AtomicInteger(1);

    /* renamed from: g */
    private static WeakHashMap<View, C1166h0> f3457g = null;

    /* renamed from: i */
    private static boolean f3458i = false;

    /* renamed from: k */
    private static final int[] f3459k = {C5816c.f16150b, C5816c.f16151c, C5816c.f16162n, C5816c.f16173y, C5816c.f16144B, C5816c.f16145C, C5816c.f16146D, C5816c.f16147E, C5816c.f16148F, C5816c.f16149G, C5816c.f16152d, C5816c.f16153e, C5816c.f16154f, C5816c.f16155g, C5816c.f16156h, C5816c.f16157i, C5816c.f16158j, C5816c.f16159k, C5816c.f16160l, C5816c.f16161m, C5816c.f16163o, C5816c.f16164p, C5816c.f16165q, C5816c.f16166r, C5816c.f16167s, C5816c.f16168t, C5816c.f16169u, C5816c.f16170v, C5816c.f16171w, C5816c.f16172x, C5816c.f16174z, C5816c.f16143A};

    /* renamed from: l */
    private static final InterfaceC1213w f3460l = C1081a0.f3417w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$a */
    /* loaded from: classes.dex */
    public class C1113a extends AbstractC1118f<Boolean> {
        C1113a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1112b0.AbstractC1118f
        /* renamed from: i */
        public Boolean mo38390i(View view) {
            return Boolean.valueOf(C1130q.m38270d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1112b0.AbstractC1118f
        /* renamed from: j */
        public void mo38389j(View view, Boolean bool) {
            C1130q.m38265i(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1112b0.AbstractC1118f
        /* renamed from: k */
        public boolean mo38388k(Boolean bool, Boolean bool2) {
            return !m38376a(bool, bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$b */
    /* loaded from: classes.dex */
    public class C1114b extends AbstractC1118f<CharSequence> {
        C1114b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1112b0.AbstractC1118f
        /* renamed from: i */
        public CharSequence mo38390i(View view) {
            return C1130q.m38272b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1112b0.AbstractC1118f
        /* renamed from: j */
        public void mo38389j(View view, CharSequence charSequence) {
            C1130q.m38266h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1112b0.AbstractC1118f
        /* renamed from: k */
        public boolean mo38388k(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$c */
    /* loaded from: classes.dex */
    public class C1115c extends AbstractC1118f<CharSequence> {
        C1115c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1112b0.AbstractC1118f
        /* renamed from: i */
        public CharSequence mo38390i(View view) {
            return C1132s.m38260a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1112b0.AbstractC1118f
        /* renamed from: j */
        public void mo38389j(View view, CharSequence charSequence) {
            C1132s.m38259b(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1112b0.AbstractC1118f
        /* renamed from: k */
        public boolean mo38388k(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$d */
    /* loaded from: classes.dex */
    public class C1116d extends AbstractC1118f<Boolean> {
        C1116d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1112b0.AbstractC1118f
        /* renamed from: i */
        public Boolean mo38390i(View view) {
            return Boolean.valueOf(C1130q.m38271c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1112b0.AbstractC1118f
        /* renamed from: j */
        public void mo38389j(View view, Boolean bool) {
            C1130q.m38267g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1112b0.AbstractC1118f
        /* renamed from: k */
        public boolean mo38388k(Boolean bool, Boolean bool2) {
            return !m38376a(bool, bool2);
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$e */
    /* loaded from: classes.dex */
    static class ViewTreeObserver$OnGlobalLayoutListenerC1117e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: w */
        private final WeakHashMap<View, Boolean> f3461w = new WeakHashMap<>();

        ViewTreeObserver$OnGlobalLayoutListenerC1117e() {
        }

        /* renamed from: a */
        private void m38378a(View view, boolean z) {
            boolean z2 = view.isShown() && view.getWindowVisibility() == 0;
            if (z != z2) {
                C1112b0.m38439b0(view, z2 ? 16 : 32);
                this.f3461w.put(view, Boolean.valueOf(z2));
            }
        }

        /* renamed from: b */
        private void m38377b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f3461w.entrySet()) {
                    m38378a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m38377b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1118f<T> {

        /* renamed from: a */
        private final int f3462a;

        /* renamed from: b */
        private final Class<T> f3463b;

        /* renamed from: c */
        private final int f3464c;

        /* renamed from: d */
        private final int f3465d;

        AbstractC1118f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        /* renamed from: b */
        private boolean m38375b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        /* renamed from: c */
        private boolean m38374c() {
            return Build.VERSION.SDK_INT >= this.f3464c;
        }

        /* renamed from: a */
        boolean m38376a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* renamed from: d */
        abstract T mo38390i(View view);

        /* renamed from: e */
        abstract void mo38389j(View view, T t);

        /* renamed from: f */
        T m38371f(View view) {
            if (m38374c()) {
                return mo38390i(view);
            }
            if (m38375b()) {
                T t = (T) view.getTag(this.f3462a);
                if (this.f3463b.isInstance(t)) {
                    return t;
                }
                return null;
            }
            return null;
        }

        /* renamed from: g */
        void m38370g(View view, T t) {
            if (m38374c()) {
                mo38389j(view, t);
            } else if (m38375b() && mo38388k(m38371f(view), t)) {
                C1112b0.m38420l(view);
                view.setTag(this.f3462a, t);
                C1112b0.m38439b0(view, this.f3465d);
            }
        }

        /* renamed from: h */
        abstract boolean mo38388k(T t, T t2);

        AbstractC1118f(int i, Class<T> cls, int i2, int i3) {
            this.f3462a = i;
            this.f3463b = cls;
            this.f3465d = i2;
            this.f3464c = i3;
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$g */
    /* loaded from: classes.dex */
    static class C1119g {
        /* renamed from: a */
        static boolean m38368a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$h */
    /* loaded from: classes.dex */
    public static class C1120h {
        /* renamed from: a */
        static AccessibilityNodeProvider m38367a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        /* renamed from: b */
        static boolean m38366b(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: c */
        static int m38365c(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: d */
        static int m38364d(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: e */
        static int m38363e(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: f */
        static ViewParent m38362f(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: g */
        static int m38361g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: h */
        static boolean m38360h(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: i */
        static boolean m38359i(View view) {
            return view.hasTransientState();
        }

        /* renamed from: j */
        static boolean m38358j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        /* renamed from: k */
        static void m38357k(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: l */
        static void m38356l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        /* renamed from: m */
        static void m38355m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: n */
        static void m38354n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        /* renamed from: o */
        static void m38353o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* renamed from: p */
        static void m38352p(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: q */
        static void m38351q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: r */
        static void m38350r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        /* renamed from: s */
        static void m38349s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$i */
    /* loaded from: classes.dex */
    public static class C1121i {
        /* renamed from: a */
        static int m38348a() {
            return View.generateViewId();
        }

        /* renamed from: b */
        static Display m38347b(View view) {
            return view.getDisplay();
        }

        /* renamed from: c */
        static int m38346c(View view) {
            return view.getLabelFor();
        }

        /* renamed from: d */
        static int m38345d(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: e */
        static int m38344e(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: f */
        static int m38343f(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: g */
        static boolean m38342g(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: h */
        static void m38341h(View view, int i) {
            view.setLabelFor(i);
        }

        /* renamed from: i */
        static void m38340i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* renamed from: j */
        static void m38339j(View view, int i) {
            view.setLayoutDirection(i);
        }

        /* renamed from: k */
        static void m38338k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$j */
    /* loaded from: classes.dex */
    static class C1122j {
        /* renamed from: a */
        static Rect m38337a(View view) {
            return view.getClipBounds();
        }

        /* renamed from: b */
        static boolean m38336b(View view) {
            return view.isInLayout();
        }

        /* renamed from: c */
        static void m38335c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$k */
    /* loaded from: classes.dex */
    public static class C1123k {
        /* renamed from: a */
        static int m38334a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        /* renamed from: b */
        static boolean m38333b(View view) {
            return view.isAttachedToWindow();
        }

        /* renamed from: c */
        static boolean m38332c(View view) {
            return view.isLaidOut();
        }

        /* renamed from: d */
        static boolean m38331d(View view) {
            return view.isLayoutDirectionResolved();
        }

        /* renamed from: e */
        static void m38330e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        /* renamed from: f */
        static void m38329f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        /* renamed from: g */
        static void m38328g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$l */
    /* loaded from: classes.dex */
    public static class C1124l {
        /* renamed from: a */
        static WindowInsets m38327a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* renamed from: b */
        static WindowInsets m38326b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: c */
        static void m38325c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$m */
    /* loaded from: classes.dex */
    public static class C1125m {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ViewCompat.java */
        /* renamed from: androidx.core.view.b0$m$a */
        /* loaded from: classes.dex */
        public class View$OnApplyWindowInsetsListenerC1126a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            C1183m0 f3466a = null;

            /* renamed from: b */
            final /* synthetic */ View f3467b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC1211u f3468c;

            View$OnApplyWindowInsetsListenerC1126a(View view, InterfaceC1211u interfaceC1211u) {
                this.f3467b = view;
                this.f3468c = interfaceC1211u;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C1183m0 m38092v = C1183m0.m38092v(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C1125m.m38324a(windowInsets, this.f3467b);
                    if (m38092v.equals(this.f3466a)) {
                        return this.f3468c.mo29259a(view, m38092v).m38094t();
                    }
                }
                this.f3466a = m38092v;
                C1183m0 mo29259a = this.f3468c.mo29259a(view, m38092v);
                if (i >= 30) {
                    return mo29259a.m38094t();
                }
                C1112b0.m38411p0(view);
                return mo29259a.m38094t();
            }
        }

        /* renamed from: a */
        static void m38324a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C5816c.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        static C1183m0 m38323b(View view, C1183m0 c1183m0, Rect rect) {
            WindowInsets m38094t = c1183m0.m38094t();
            if (m38094t != null) {
                return C1183m0.m38092v(view.computeSystemWindowInsets(m38094t, rect), view);
            }
            rect.setEmpty();
            return c1183m0;
        }

        /* renamed from: c */
        static boolean m38322c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        /* renamed from: d */
        static boolean m38321d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        /* renamed from: e */
        static boolean m38320e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        /* renamed from: f */
        static boolean m38319f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        /* renamed from: g */
        static ColorStateList m38318g(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: h */
        static PorterDuff.Mode m38317h(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: i */
        static float m38316i(View view) {
            return view.getElevation();
        }

        /* renamed from: j */
        public static C1183m0 m38315j(View view) {
            return C1183m0.C1184a.m38091a(view);
        }

        /* renamed from: k */
        static String m38314k(View view) {
            return view.getTransitionName();
        }

        /* renamed from: l */
        static float m38313l(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: m */
        static float m38312m(View view) {
            return view.getZ();
        }

        /* renamed from: n */
        static boolean m38311n(View view) {
            return view.hasNestedScrollingParent();
        }

        /* renamed from: o */
        static boolean m38310o(View view) {
            return view.isImportantForAccessibility();
        }

        /* renamed from: p */
        static boolean m38309p(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: q */
        static void m38308q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* renamed from: r */
        static void m38307r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* renamed from: s */
        static void m38306s(View view, float f) {
            view.setElevation(f);
        }

        /* renamed from: t */
        static void m38305t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        /* renamed from: u */
        static void m38304u(View view, InterfaceC1211u interfaceC1211u) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C5816c.tag_on_apply_window_listener, interfaceC1211u);
            }
            if (interfaceC1211u == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C5816c.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC1126a(view, interfaceC1211u));
            }
        }

        /* renamed from: v */
        static void m38303v(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: w */
        static void m38302w(View view, float f) {
            view.setTranslationZ(f);
        }

        /* renamed from: x */
        static void m38301x(View view, float f) {
            view.setZ(f);
        }

        /* renamed from: y */
        static boolean m38300y(View view, int i) {
            return view.startNestedScroll(i);
        }

        /* renamed from: z */
        static void m38299z(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$n */
    /* loaded from: classes.dex */
    private static class C1127n {
        /* renamed from: a */
        public static C1183m0 m38298a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C1183m0 m38093u = C1183m0.m38093u(rootWindowInsets);
            m38093u.m38096r(m38093u);
            m38093u.m38110d(view.getRootView());
            return m38093u;
        }

        /* renamed from: b */
        static int m38297b(View view) {
            return view.getScrollIndicators();
        }

        /* renamed from: c */
        static void m38296c(View view, int i) {
            view.setScrollIndicators(i);
        }

        /* renamed from: d */
        static void m38295d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$o */
    /* loaded from: classes.dex */
    static class C1128o {
        /* renamed from: a */
        static void m38294a(View view) {
            view.cancelDragAndDrop();
        }

        /* renamed from: b */
        static void m38293b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        /* renamed from: c */
        static void m38292c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        /* renamed from: d */
        static void m38291d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        /* renamed from: e */
        static boolean m38290e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        /* renamed from: f */
        static void m38289f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$p */
    /* loaded from: classes.dex */
    public static class C1129p {
        /* renamed from: a */
        static void m38288a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        /* renamed from: b */
        static int m38287b(View view) {
            return view.getImportantForAutofill();
        }

        /* renamed from: c */
        static int m38286c(View view) {
            return view.getNextClusterForwardId();
        }

        /* renamed from: d */
        static boolean m38285d(View view) {
            return view.hasExplicitFocusable();
        }

        /* renamed from: e */
        static boolean m38284e(View view) {
            return view.isFocusedByDefault();
        }

        /* renamed from: f */
        static boolean m38283f(View view) {
            return view.isImportantForAutofill();
        }

        /* renamed from: g */
        static boolean m38282g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        /* renamed from: h */
        static View m38281h(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        /* renamed from: i */
        static boolean m38280i(View view) {
            return view.restoreDefaultFocus();
        }

        /* renamed from: j */
        static void m38279j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        /* renamed from: k */
        static void m38278k(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        /* renamed from: l */
        static void m38277l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        /* renamed from: m */
        static void m38276m(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        /* renamed from: n */
        static void m38275n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        /* renamed from: o */
        static void m38274o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$q */
    /* loaded from: classes.dex */
    public static class C1130q {
        /* renamed from: a */
        static void m38273a(View view, final InterfaceC1135v interfaceC1135v) {
            int i = C5816c.tag_unhandled_key_listeners;
            C9558g c9558g = (C9558g) view.getTag(i);
            if (c9558g == null) {
                c9558g = new C9558g();
                view.setTag(i, c9558g);
            }
            Objects.requireNonNull(interfaceC1135v);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.c0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return C1112b0.InterfaceC1135v.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            c9558g.put(interfaceC1135v, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        /* renamed from: b */
        static CharSequence m38272b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* renamed from: c */
        static boolean m38271c(View view) {
            return view.isAccessibilityHeading();
        }

        /* renamed from: d */
        static boolean m38270d(View view) {
            return view.isScreenReaderFocusable();
        }

        /* renamed from: e */
        static void m38269e(View view, InterfaceC1135v interfaceC1135v) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            C9558g c9558g = (C9558g) view.getTag(C5816c.tag_unhandled_key_listeners);
            if (c9558g == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c9558g.get(interfaceC1135v)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        /* renamed from: f */
        static <T> T m38268f(View view, int i) {
            return (T) view.requireViewById(i);
        }

        /* renamed from: g */
        static void m38267g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        /* renamed from: h */
        static void m38266h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: i */
        static void m38265i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$r */
    /* loaded from: classes.dex */
    public static class C1131r {
        /* renamed from: a */
        static View.AccessibilityDelegate m38264a(View view) {
            return view.getAccessibilityDelegate();
        }

        /* renamed from: b */
        static List<Rect> m38263b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        /* renamed from: c */
        static void m38262c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        /* renamed from: d */
        static void m38261d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$s */
    /* loaded from: classes.dex */
    public static class C1132s {
        /* renamed from: a */
        static CharSequence m38260a(View view) {
            return view.getStateDescription();
        }

        /* renamed from: b */
        static void m38259b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$t */
    /* loaded from: classes.dex */
    private static final class C1133t {
        /* renamed from: a */
        public static String[] m38258a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        /* renamed from: b */
        public static C1137c m38257b(View view, C1137c c1137c) {
            ContentInfo m38243f = c1137c.m38243f();
            ContentInfo performReceiveContent = view.performReceiveContent(m38243f);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == m38243f ? c1137c : C1137c.m38242g(performReceiveContent);
        }

        /* renamed from: c */
        public static void m38256c(View view, String[] strArr, InterfaceC1212v interfaceC1212v) {
            if (interfaceC1212v == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC1134u(interfaceC1212v));
            }
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$u */
    /* loaded from: classes.dex */
    private static final class OnReceiveContentListenerC1134u implements OnReceiveContentListener {

        /* renamed from: a */
        private final InterfaceC1212v f3469a;

        OnReceiveContentListenerC1134u(InterfaceC1212v interfaceC1212v) {
            this.f3469a = interfaceC1212v;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C1137c m38242g = C1137c.m38242g(contentInfo);
            C1137c mo37840a = this.f3469a.mo37840a(view, m38242g);
            if (mo37840a == null) {
                return null;
            }
            return mo37840a == m38242g ? contentInfo : mo37840a.m38243f();
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$v */
    /* loaded from: classes.dex */
    public interface InterfaceC1135v {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.b0$w */
    /* loaded from: classes.dex */
    static class C1136w {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f3470d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f3471a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f3472b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f3473c = null;

        C1136w() {
        }

        /* renamed from: a */
        static C1136w m38255a(View view) {
            int i = C5816c.tag_unhandled_key_event_manager;
            C1136w c1136w = (C1136w) view.getTag(i);
            if (c1136w == null) {
                C1136w c1136w2 = new C1136w();
                view.setTag(i, c1136w2);
                return c1136w2;
            }
            return c1136w;
        }

        /* renamed from: c */
        private View m38253c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f3471a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View m38253c = m38253c(viewGroup.getChildAt(childCount), keyEvent);
                        if (m38253c != null) {
                            return m38253c;
                        }
                    }
                }
                if (m38251e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        private SparseArray<WeakReference<View>> m38252d() {
            if (this.f3472b == null) {
                this.f3472b = new SparseArray<>();
            }
            return this.f3472b;
        }

        /* renamed from: e */
        private boolean m38251e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C5816c.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((InterfaceC1135v) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        /* renamed from: g */
        private void m38249g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f3471a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f3470d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f3471a == null) {
                    this.f3471a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f3470d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f3471a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f3471a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        boolean m38254b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m38249g();
            }
            View m38253c = m38253c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (m38253c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m38252d().put(keyCode, new WeakReference<>(m38253c));
                }
            }
            return m38253c != null;
        }

        /* renamed from: f */
        boolean m38250f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f3473c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                this.f3473c = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                SparseArray<WeakReference<View>> m38252d = m38252d();
                if (keyEvent.getAction() == 1 && (indexOfKey = m38252d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = m38252d.valueAt(indexOfKey);
                    m38252d.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = m38252d.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view = weakReference2.get();
                    if (view != null && C1112b0.m38447V(view)) {
                        m38251e(view, keyEvent);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    static {
        new ViewTreeObserver$OnGlobalLayoutListenerC1117e();
    }

    /* renamed from: A */
    private static InterfaceC1213w m38484A(View view) {
        if (view instanceof InterfaceC1213w) {
            return (InterfaceC1213w) view;
        }
        return f3460l;
    }

    @Deprecated
    /* renamed from: A0 */
    public static void m38483A0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: B */
    public static boolean m38482B(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C1120h.m38366b(view);
        }
        return false;
    }

    /* renamed from: B0 */
    public static void m38481B0(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            C1120h.m38350r(view, z);
        }
    }

    /* renamed from: C */
    public static int m38480C(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C1120h.m38365c(view);
        }
        return 0;
    }

    /* renamed from: C0 */
    public static void m38479C0(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            C1120h.m38349s(view, i);
        } else if (i2 >= 16) {
            if (i == 4) {
                i = 2;
            }
            C1120h.m38349s(view, i);
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: D */
    public static int m38478D(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C1129p.m38287b(view);
        }
        return 0;
    }

    /* renamed from: D0 */
    public static void m38477D0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C1129p.m38277l(view, i);
        }
    }

    /* renamed from: E */
    public static int m38476E(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C1121i.m38345d(view);
        }
        return 0;
    }

    /* renamed from: E0 */
    public static void m38475E0(View view, InterfaceC1211u interfaceC1211u) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1125m.m38304u(view, interfaceC1211u);
        }
    }

    /* renamed from: F */
    public static int m38474F(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C1120h.m38364d(view);
        }
        if (!f3452e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f3451d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3452e = true;
        }
        Field field = f3451d;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: F0 */
    public static void m38473F0(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            C1121i.m38338k(view, i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: G */
    public static int m38472G(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C1120h.m38363e(view);
        }
        if (!f3450c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f3449b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3450c = true;
        }
        Field field = f3449b;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: G0 */
    public static void m38471G0(View view, C1215y c1215y) {
        if (Build.VERSION.SDK_INT >= 24) {
            C1128o.m38291d(view, (PointerIcon) (c1215y != null ? c1215y.m38014a() : null));
        }
    }

    /* renamed from: H */
    public static String[] m38470H(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1133t.m38258a(view);
        }
        return (String[]) view.getTag(C5816c.tag_on_receive_content_mime_types);
    }

    /* renamed from: H0 */
    public static void m38469H0(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            C1127n.m38295d(view, i, i2);
        }
    }

    /* renamed from: I */
    public static int m38468I(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C1121i.m38344e(view);
        }
        return view.getPaddingRight();
    }

    /* renamed from: I0 */
    public static void m38467I0(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            m38457N0().m38370g(view, charSequence);
        }
    }

    /* renamed from: J */
    public static int m38466J(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C1121i.m38343f(view);
        }
        return view.getPaddingLeft();
    }

    /* renamed from: J0 */
    public static void m38465J0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1125m.m38303v(view, str);
            return;
        }
        if (f3453f == null) {
            f3453f = new WeakHashMap<>();
        }
        f3453f.put(view, str);
    }

    /* renamed from: K */
    public static ViewParent m38464K(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C1120h.m38362f(view);
        }
        return view.getParent();
    }

    /* renamed from: K0 */
    public static void m38463K0(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1125m.m38302w(view, f);
        }
    }

    /* renamed from: L */
    public static C1183m0 m38462L(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return C1127n.m38298a(view);
        }
        if (i >= 21) {
            return C1125m.m38315j(view);
        }
        return null;
    }

    /* renamed from: L0 */
    private static void m38461L0(View view) {
        if (m38480C(view) == 0) {
            m38479C0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m38480C((View) parent) == 4) {
                m38479C0(view, 2);
                return;
            }
        }
    }

    /* renamed from: M */
    public static CharSequence m38460M(View view) {
        return m38457N0().m38371f(view);
    }

    /* renamed from: M0 */
    public static void m38459M0(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1125m.m38301x(view, f);
        }
    }

    /* renamed from: N */
    public static String m38458N(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1125m.m38314k(view);
        }
        WeakHashMap<View, String> weakHashMap = f3453f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: N0 */
    private static AbstractC1118f<CharSequence> m38457N0() {
        return new C1115c(C5816c.tag_state_description, CharSequence.class, 64, 30);
    }

    /* renamed from: O */
    public static float m38456O(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1125m.m38313l(view);
        }
        return 0.0f;
    }

    /* renamed from: O0 */
    public static void m38455O0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1125m.m38299z(view);
        } else if (view instanceof InterfaceC1205o) {
            ((InterfaceC1205o) view).stopNestedScroll();
        }
    }

    @Deprecated
    /* renamed from: P */
    public static int m38454P(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C1120h.m38361g(view);
        }
        return 0;
    }

    /* renamed from: P0 */
    private static void m38453P0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: Q */
    public static float m38452Q(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1125m.m38312m(view);
        }
        return 0.0f;
    }

    /* renamed from: R */
    public static boolean m38451R(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return C1119g.m38368a(view);
        }
        return false;
    }

    /* renamed from: S */
    public static boolean m38450S(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C1120h.m38360h(view);
        }
        return true;
    }

    /* renamed from: T */
    public static boolean m38449T(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C1120h.m38359i(view);
        }
        return false;
    }

    /* renamed from: U */
    public static boolean m38448U(View view) {
        Boolean m38371f = m38440b().m38371f(view);
        return m38371f != null && m38371f.booleanValue();
    }

    /* renamed from: V */
    public static boolean m38447V(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C1123k.m38333b(view);
        }
        return view.getWindowToken() != null;
    }

    /* renamed from: W */
    public static boolean m38446W(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C1123k.m38332c(view);
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: X */
    public static boolean m38445X(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1125m.m38309p(view);
        }
        if (view instanceof InterfaceC1205o) {
            return ((InterfaceC1205o) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: Y */
    public static boolean m38444Y(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C1121i.m38342g(view);
        }
        return false;
    }

    /* renamed from: Z */
    public static boolean m38443Z(View view) {
        Boolean m38371f = m38407r0().m38371f(view);
        return m38371f != null && m38371f.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static /* synthetic */ C1137c m38441a0(C1137c c1137c) {
        return c1137c;
    }

    /* renamed from: b */
    private static AbstractC1118f<Boolean> m38440b() {
        return new C1116d(C5816c.tag_accessibility_heading, Boolean.class, 28);
    }

    /* renamed from: b0 */
    static void m38439b0(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m38408r(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (m38410q(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                C1123k.m38328g(obtain, i);
                if (z) {
                    obtain.getText().add(m38408r(view));
                    m38461L0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                C1123k.m38328g(obtain2, i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m38408r(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    C1123k.m38330e(view.getParent(), view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* renamed from: c */
    public static int m38438c(View view, CharSequence charSequence, InterfaceC1097f interfaceC1097f) {
        int m38404t = m38404t(view, charSequence);
        if (m38404t != -1) {
            m38436d(view, new C1085c.C1086a(m38404t, charSequence, interfaceC1097f));
        }
        return m38404t;
    }

    /* renamed from: c0 */
    public static void m38437c0(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect m38392z = m38392z();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                m38392z.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !m38392z.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m38432f(view, i);
            if (z && m38392z.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(m38392z);
            }
        } else {
            m38432f(view, i);
        }
    }

    /* renamed from: d */
    private static void m38436d(View view, C1085c.C1086a c1086a) {
        if (Build.VERSION.SDK_INT >= 21) {
            m38420l(view);
            m38415n0(c1086a.m38510b(), view);
            m38406s(view).add(c1086a);
            m38439b0(view, 0);
        }
    }

    /* renamed from: d0 */
    public static void m38435d0(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect m38392z = m38392z();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                m38392z.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !m38392z.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m38430g(view, i);
            if (z && m38392z.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(m38392z);
            }
        } else {
            m38430g(view, i);
        }
    }

    /* renamed from: e */
    public static C1166h0 m38434e(View view) {
        if (f3457g == null) {
            f3457g = new WeakHashMap<>();
        }
        C1166h0 c1166h0 = f3457g.get(view);
        if (c1166h0 == null) {
            C1166h0 c1166h02 = new C1166h0(view);
            f3457g.put(view, c1166h02);
            return c1166h02;
        }
        return c1166h0;
    }

    /* renamed from: e0 */
    public static C1183m0 m38433e0(View view, C1183m0 c1183m0) {
        WindowInsets m38094t;
        if (Build.VERSION.SDK_INT >= 21 && (m38094t = c1183m0.m38094t()) != null) {
            WindowInsets m38326b = C1124l.m38326b(view, m38094t);
            if (!m38326b.equals(m38094t)) {
                return C1183m0.m38092v(m38326b, view);
            }
        }
        return c1183m0;
    }

    /* renamed from: f */
    private static void m38432f(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m38453P0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m38453P0((View) parent);
            }
        }
    }

    /* renamed from: f0 */
    public static void m38431f0(View view, C1085c c1085c) {
        view.onInitializeAccessibilityNodeInfo(c1085c.m38580K0());
    }

    /* renamed from: g */
    private static void m38430g(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m38453P0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m38453P0((View) parent);
            }
        }
    }

    /* renamed from: g0 */
    private static AbstractC1118f<CharSequence> m38429g0() {
        return new C1114b(C5816c.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    /* renamed from: h */
    public static C1183m0 m38428h(View view, C1183m0 c1183m0, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? C1125m.m38323b(view, c1183m0, rect) : c1183m0;
    }

    /* renamed from: h0 */
    public static boolean m38427h0(View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C1120h.m38358j(view, i, bundle);
        }
        return false;
    }

    /* renamed from: i */
    public static C1183m0 m38426i(View view, C1183m0 c1183m0) {
        WindowInsets m38094t;
        if (Build.VERSION.SDK_INT >= 21 && (m38094t = c1183m0.m38094t()) != null) {
            WindowInsets m38327a = C1124l.m38327a(view, m38094t);
            if (!m38327a.equals(m38094t)) {
                return C1183m0.m38092v(m38327a, view);
            }
        }
        return c1183m0;
    }

    /* renamed from: i0 */
    public static C1137c m38425i0(View view, C1137c c1137c) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c1137c + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C1133t.m38257b(view, c1137c);
        }
        InterfaceC1212v interfaceC1212v = (InterfaceC1212v) view.getTag(C5816c.tag_on_receive_content_listener);
        if (interfaceC1212v != null) {
            C1137c mo37840a = interfaceC1212v.mo37840a(view, c1137c);
            if (mo37840a == null) {
                return null;
            }
            return m38484A(view).mo38017a(mo37840a);
        }
        return m38484A(view).mo38017a(c1137c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static boolean m38424j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C1136w.m38255a(view).m38254b(view, keyEvent);
    }

    /* renamed from: j0 */
    public static void m38423j0(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            C1120h.m38357k(view);
        } else {
            view.postInvalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static boolean m38422k(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C1136w.m38255a(view).m38250f(keyEvent);
    }

    /* renamed from: k0 */
    public static void m38421k0(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            C1120h.m38355m(view, runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: l */
    static void m38420l(View view) {
        C1078a m38416n = m38416n(view);
        if (m38416n == null) {
            m38416n = new C1078a();
        }
        m38405s0(view, m38416n);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: l0 */
    public static void m38419l0(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            C1120h.m38354n(view, runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: m */
    public static int m38418m() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return C1121i.m38348a();
        }
        do {
            atomicInteger = f3456a;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    /* renamed from: m0 */
    public static void m38417m0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            m38415n0(i, view);
            m38439b0(view, 0);
        }
    }

    /* renamed from: n */
    public static C1078a m38416n(View view) {
        View.AccessibilityDelegate m38414o = m38414o(view);
        if (m38414o == null) {
            return null;
        }
        if (m38414o instanceof C1078a.C1079a) {
            return ((C1078a.C1079a) m38414o).f3416a;
        }
        return new C1078a(m38414o);
    }

    /* renamed from: n0 */
    private static void m38415n0(int i, View view) {
        List<C1085c.C1086a> m38406s = m38406s(view);
        for (int i2 = 0; i2 < m38406s.size(); i2++) {
            if (m38406s.get(i2).m38510b() == i) {
                m38406s.remove(i2);
                return;
            }
        }
    }

    /* renamed from: o */
    private static View.AccessibilityDelegate m38414o(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C1131r.m38264a(view);
        }
        return m38412p(view);
    }

    /* renamed from: o0 */
    public static void m38413o0(View view, C1085c.C1086a c1086a, CharSequence charSequence, InterfaceC1097f interfaceC1097f) {
        if (interfaceC1097f == null && charSequence == null) {
            m38417m0(view, c1086a.m38510b());
        } else {
            m38436d(view, c1086a.m38511a(charSequence, interfaceC1097f));
        }
    }

    /* renamed from: p */
    private static View.AccessibilityDelegate m38412p(View view) {
        if (f3458i) {
            return null;
        }
        if (f3454h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3454h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3458i = true;
                return null;
            }
        }
        try {
            Object obj = f3454h.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f3458i = true;
            return null;
        }
    }

    /* renamed from: p0 */
    public static void m38411p0(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            C1124l.m38325c(view);
        } else if (i >= 16) {
            C1120h.m38352p(view);
        }
    }

    /* renamed from: q */
    public static int m38410q(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C1123k.m38334a(view);
        }
        return 0;
    }

    /* renamed from: q0 */
    public static void m38409q0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1131r.m38262c(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: r */
    public static CharSequence m38408r(View view) {
        return m38429g0().m38371f(view);
    }

    /* renamed from: r0 */
    private static AbstractC1118f<Boolean> m38407r0() {
        return new C1113a(C5816c.tag_screen_reader_focusable, Boolean.class, 28);
    }

    /* renamed from: s */
    private static List<C1085c.C1086a> m38406s(View view) {
        int i = C5816c.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(i, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    /* renamed from: s0 */
    public static void m38405s0(View view, C1078a c1078a) {
        if (c1078a == null && (m38414o(view) instanceof C1078a.C1079a)) {
            c1078a = new C1078a();
        }
        view.setAccessibilityDelegate(c1078a == null ? null : c1078a.m38610d());
    }

    /* renamed from: t */
    private static int m38404t(View view, CharSequence charSequence) {
        List<C1085c.C1086a> m38406s = m38406s(view);
        for (int i = 0; i < m38406s.size(); i++) {
            if (TextUtils.equals(charSequence, m38406s.get(i).m38509c())) {
                return m38406s.get(i).m38510b();
            }
        }
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[] iArr = f3459k;
            if (i3 >= iArr.length || i2 != -1) {
                break;
            }
            int i4 = iArr[i3];
            boolean z = true;
            for (int i5 = 0; i5 < m38406s.size(); i5++) {
                z &= m38406s.get(i5).m38510b() != i4;
            }
            if (z) {
                i2 = i4;
            }
            i3++;
        }
        return i2;
    }

    /* renamed from: t0 */
    public static void m38403t0(View view, boolean z) {
        m38440b().m38370g(view, Boolean.valueOf(z));
    }

    /* renamed from: u */
    public static ColorStateList m38402u(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1125m.m38318g(view);
        }
        if (view instanceof InterfaceC1217z) {
            return ((InterfaceC1217z) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: u0 */
    public static void m38401u0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            C1123k.m38329f(view, i);
        }
    }

    /* renamed from: v */
    public static PorterDuff.Mode m38400v(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1125m.m38317h(view);
        }
        if (view instanceof InterfaceC1217z) {
            return ((InterfaceC1217z) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: v0 */
    public static void m38399v0(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            C1120h.m38351q(view, drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: w */
    public static Rect m38398w(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return C1122j.m38337a(view);
        }
        return null;
    }

    /* renamed from: w0 */
    public static void m38397w0(View view, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            C1125m.m38308q(view, colorStateList);
            if (i == 21) {
                Drawable background = view.getBackground();
                boolean z = (C1125m.m38318g(view) == null && C1125m.m38317h(view) == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                C1120h.m38351q(view, background);
            }
        } else if (view instanceof InterfaceC1217z) {
            ((InterfaceC1217z) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: x */
    public static Display m38396x(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C1121i.m38347b(view);
        }
        if (m38447V(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: x0 */
    public static void m38395x0(View view, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            C1125m.m38307r(view, mode);
            if (i == 21) {
                Drawable background = view.getBackground();
                boolean z = (C1125m.m38318g(view) == null && C1125m.m38317h(view) == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                C1120h.m38351q(view, background);
            }
        } else if (view instanceof InterfaceC1217z) {
            ((InterfaceC1217z) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: y */
    public static float m38394y(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1125m.m38316i(view);
        }
        return 0.0f;
    }

    /* renamed from: y0 */
    public static void m38393y0(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            C1122j.m38335c(view, rect);
        }
    }

    /* renamed from: z */
    private static Rect m38392z() {
        if (f3455j == null) {
            f3455j = new ThreadLocal<>();
        }
        Rect rect = f3455j.get();
        if (rect == null) {
            rect = new Rect();
            f3455j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: z0 */
    public static void m38391z0(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1125m.m38306s(view, f);
        }
    }
}
