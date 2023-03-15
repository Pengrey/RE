package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C1112b0;
import androidx.core.view.accessibility.C1085c;
import androidx.core.view.accessibility.InterfaceC1097f;
import androidx.recyclerview.widget.C1645u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.InterfaceC1737b;
import p074e3.C4977a;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: Q */
    static boolean f5352Q = true;

    /* renamed from: A */
    boolean f5353A;

    /* renamed from: B */
    private RecyclerView.AbstractC1537i f5354B;

    /* renamed from: C */
    private LinearLayoutManager f5355C;

    /* renamed from: D */
    private int f5356D;

    /* renamed from: E */
    private Parcelable f5357E;

    /* renamed from: F */
    RecyclerView f5358F;

    /* renamed from: G */
    private C1645u f5359G;

    /* renamed from: H */
    C1761e f5360H;

    /* renamed from: I */
    private C1758b f5361I;

    /* renamed from: J */
    private C1759c f5362J;

    /* renamed from: K */
    private C1760d f5363K;

    /* renamed from: L */
    private RecyclerView.AbstractC1540l f5364L;

    /* renamed from: M */
    private boolean f5365M;

    /* renamed from: N */
    private boolean f5366N;

    /* renamed from: O */
    private int f5367O;

    /* renamed from: P */
    AbstractC1743e f5368P;

    /* renamed from: w */
    private final Rect f5369w;

    /* renamed from: x */
    private final Rect f5370x;

    /* renamed from: y */
    private C1758b f5371y;

    /* renamed from: z */
    int f5372z;

    /* renamed from: androidx.viewpager2.widget.ViewPager2$a */
    /* loaded from: classes.dex */
    class C1739a extends AbstractC1745g {
        C1739a() {
            super(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
        /* renamed from: a */
        public void mo29102a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f5353A = true;
            viewPager2.f5360H.m35429l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$b */
    /* loaded from: classes.dex */
    public class C1740b extends AbstractC1747i {
        C1740b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1747i
        /* renamed from: a */
        public void mo29096a(int i) {
            if (i == 0) {
                ViewPager2.this.m35484o();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1747i
        /* renamed from: c */
        public void mo29094c(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f5372z != i) {
                viewPager2.f5372z = i;
                viewPager2.f5368P.mo35458q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$c */
    /* loaded from: classes.dex */
    public class C1741c extends AbstractC1747i {
        C1741c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1747i
        /* renamed from: c */
        public void mo29094c(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f5358F.requestFocus(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$d */
    /* loaded from: classes.dex */
    public class C1742d implements RecyclerView.InterfaceC1552q {
        C1742d(ViewPager2 viewPager2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1552q
        /* renamed from: b */
        public void mo35479b(View view) {
            RecyclerView.C1551p c1551p = (RecyclerView.C1551p) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) c1551p).width != -1 || ((ViewGroup.MarginLayoutParams) c1551p).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1552q
        /* renamed from: d */
        public void mo35478d(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$e */
    /* loaded from: classes.dex */
    public abstract class AbstractC1743e {
        private AbstractC1743e(ViewPager2 viewPager2) {
        }

        /* renamed from: a */
        boolean mo35469a() {
            return false;
        }

        /* renamed from: b */
        boolean mo35477b(int i) {
            return false;
        }

        /* renamed from: c */
        boolean mo35468c(int i, Bundle bundle) {
            return false;
        }

        /* renamed from: d */
        boolean mo35476d() {
            return false;
        }

        /* renamed from: e */
        void mo35467e(RecyclerView.AbstractC1535g<?> abstractC1535g) {
        }

        /* renamed from: f */
        void mo35466f(RecyclerView.AbstractC1535g<?> abstractC1535g) {
        }

        /* renamed from: g */
        String mo35465g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: h */
        void mo35464h(C1758b c1758b, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        void mo35463i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* renamed from: j */
        void mo35475j(C1085c c1085c) {
        }

        /* renamed from: k */
        boolean mo35474k(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: l */
        boolean mo35462l(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: m */
        void mo35461m() {
        }

        /* renamed from: n */
        CharSequence mo35473n() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: o */
        void mo35460o(AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: p */
        void mo35459p() {
        }

        /* renamed from: q */
        void mo35458q() {
        }

        /* renamed from: r */
        void mo35457r() {
        }

        /* renamed from: s */
        void mo35456s() {
        }

        /* synthetic */ AbstractC1743e(ViewPager2 viewPager2, C1739a c1739a) {
            this(viewPager2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$f */
    /* loaded from: classes.dex */
    public class C1744f extends AbstractC1743e {
        C1744f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1743e
        /* renamed from: b */
        public boolean mo35477b(int i) {
            return (i == 8192 || i == 4096) && !ViewPager2.this.m35494e();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1743e
        /* renamed from: d */
        public boolean mo35476d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1743e
        /* renamed from: j */
        public void mo35475j(C1085c c1085c) {
            if (ViewPager2.this.m35494e()) {
                return;
            }
            c1085c.m38571S(C1085c.C1086a.f3429i);
            c1085c.m38571S(C1085c.C1086a.f3428h);
            c1085c.m38598B0(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1743e
        /* renamed from: k */
        public boolean mo35474k(int i) {
            if (mo35477b(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1743e
        /* renamed from: n */
        public CharSequence mo35473n() {
            if (mo35476d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$g */
    /* loaded from: classes.dex */
    private static abstract class AbstractC1745g extends RecyclerView.AbstractC1537i {
        private AbstractC1745g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
        /* renamed from: b */
        public final void mo29101b(int i, int i2) {
            mo29102a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
        /* renamed from: c */
        public final void mo29100c(int i, int i2, Object obj) {
            mo29102a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
        /* renamed from: d */
        public final void mo29099d(int i, int i2) {
            mo29102a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
        /* renamed from: e */
        public final void mo29098e(int i, int i2, int i3) {
            mo29102a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
        /* renamed from: f */
        public final void mo29097f(int i, int i2) {
            mo29102a();
        }

        /* synthetic */ AbstractC1745g(C1739a c1739a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$h */
    /* loaded from: classes.dex */
    public class C1746h extends LinearLayoutManager {
        C1746h(Context context) {
            super(context);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: N1 */
        public void mo29916N1(RecyclerView.C1564z c1564z, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.mo29916N1(c1564z, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
        /* renamed from: O0 */
        public void mo35472O0(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z, C1085c c1085c) {
            super.mo35472O0(c1558v, c1564z, c1085c);
            ViewPager2.this.f5368P.mo35475j(c1085c);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
        /* renamed from: i1 */
        public boolean mo35471i1(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z, int i, Bundle bundle) {
            if (ViewPager2.this.f5368P.mo35477b(i)) {
                return ViewPager2.this.f5368P.mo35474k(i);
            }
            return super.mo35471i1(c1558v, c1564z, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
        /* renamed from: t1 */
        public boolean mo35470t1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1747i {
        /* renamed from: a */
        public void mo29096a(int i) {
        }

        /* renamed from: b */
        public void mo29095b(int i, float f, int i2) {
        }

        /* renamed from: c */
        public void mo29094c(int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$j */
    /* loaded from: classes.dex */
    public class C1748j extends AbstractC1743e {

        /* renamed from: a */
        private final InterfaceC1097f f5381a;

        /* renamed from: b */
        private final InterfaceC1097f f5382b;

        /* renamed from: c */
        private RecyclerView.AbstractC1537i f5383c;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$a */
        /* loaded from: classes.dex */
        class C1749a implements InterfaceC1097f {
            C1749a() {
            }

            @Override // androidx.core.view.accessibility.InterfaceC1097f
            /* renamed from: a */
            public boolean mo30335a(View view, InterfaceC1097f.AbstractC1098a abstractC1098a) {
                C1748j.this.m35453v(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$b */
        /* loaded from: classes.dex */
        class C1750b implements InterfaceC1097f {
            C1750b() {
            }

            @Override // androidx.core.view.accessibility.InterfaceC1097f
            /* renamed from: a */
            public boolean mo30335a(View view, InterfaceC1097f.AbstractC1098a abstractC1098a) {
                C1748j.this.m35453v(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$c */
        /* loaded from: classes.dex */
        class C1751c extends AbstractC1745g {
            C1751c() {
                super(null);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
            /* renamed from: a */
            public void mo29102a() {
                C1748j.this.m35452w();
            }
        }

        C1748j() {
            super(ViewPager2.this, null);
            this.f5381a = new C1749a();
            this.f5382b = new C1750b();
        }

        /* renamed from: t */
        private void m35455t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            int i2;
            if (ViewPager2.this.getAdapter() == null) {
                i = 0;
                i2 = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                i = ViewPager2.this.getAdapter().mo29834f();
                i2 = 0;
            } else {
                i2 = ViewPager2.this.getAdapter().mo29834f();
                i = 0;
            }
            C1085c.m38578L0(accessibilityNodeInfo).m38558c0(C1085c.C1087b.m38507a(i, i2, false, 0));
        }

        /* renamed from: u */
        private void m35454u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int mo29834f;
            RecyclerView.AbstractC1535g adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (mo29834f = adapter.mo29834f()) == 0 || !ViewPager2.this.m35494e()) {
                return;
            }
            if (ViewPager2.this.f5372z > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (ViewPager2.this.f5372z < mo29834f - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1743e
        /* renamed from: a */
        public boolean mo35469a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1743e
        /* renamed from: c */
        public boolean mo35468c(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1743e
        /* renamed from: e */
        public void mo35467e(RecyclerView.AbstractC1535g<?> abstractC1535g) {
            m35452w();
            if (abstractC1535g != null) {
                abstractC1535g.m36550A(this.f5383c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1743e
        /* renamed from: f */
        public void mo35466f(RecyclerView.AbstractC1535g<?> abstractC1535g) {
            if (abstractC1535g != null) {
                abstractC1535g.m36548C(this.f5383c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1743e
        /* renamed from: g */
        public String mo35465g() {
            if (mo35469a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1743e
        /* renamed from: h */
        public void mo35464h(C1758b c1758b, RecyclerView recyclerView) {
            C1112b0.m38479C0(recyclerView, 2);
            this.f5383c = new C1751c();
            if (C1112b0.m38480C(ViewPager2.this) == 0) {
                C1112b0.m38479C0(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1743e
        /* renamed from: i */
        public void mo35463i(AccessibilityNodeInfo accessibilityNodeInfo) {
            m35455t(accessibilityNodeInfo);
            if (Build.VERSION.SDK_INT >= 16) {
                m35454u(accessibilityNodeInfo);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1743e
        /* renamed from: l */
        public boolean mo35462l(int i, Bundle bundle) {
            int currentItem;
            if (mo35468c(i, bundle)) {
                if (i == 8192) {
                    currentItem = ViewPager2.this.getCurrentItem() - 1;
                } else {
                    currentItem = ViewPager2.this.getCurrentItem() + 1;
                }
                m35453v(currentItem);
                return true;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1743e
        /* renamed from: m */
        public void mo35461m() {
            m35452w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1743e
        /* renamed from: o */
        public void mo35460o(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(mo35465g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1743e
        /* renamed from: p */
        public void mo35459p() {
            m35452w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1743e
        /* renamed from: q */
        public void mo35458q() {
            m35452w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1743e
        /* renamed from: r */
        public void mo35457r() {
            m35452w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1743e
        /* renamed from: s */
        public void mo35456s() {
            m35452w();
            if (Build.VERSION.SDK_INT < 21) {
                ViewPager2.this.sendAccessibilityEvent(2048);
            }
        }

        /* renamed from: v */
        void m35453v(int i) {
            if (ViewPager2.this.m35494e()) {
                ViewPager2.this.m35488k(i, true);
            }
        }

        /* renamed from: w */
        void m35452w() {
            int mo29834f;
            ViewPager2 viewPager2 = ViewPager2.this;
            C1112b0.m38417m0(viewPager2, 16908360);
            C1112b0.m38417m0(viewPager2, 16908361);
            C1112b0.m38417m0(viewPager2, 16908358);
            C1112b0.m38417m0(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() == null || (mo29834f = ViewPager2.this.getAdapter().mo29834f()) == 0 || !ViewPager2.this.m35494e()) {
                return;
            }
            if (ViewPager2.this.getOrientation() == 0) {
                boolean m35495d = ViewPager2.this.m35495d();
                int i = m35495d ? 16908360 : 16908361;
                int i2 = m35495d ? 16908361 : 16908360;
                if (ViewPager2.this.f5372z < mo29834f - 1) {
                    C1112b0.m38413o0(viewPager2, new C1085c.C1086a(i, null), null, this.f5381a);
                }
                if (ViewPager2.this.f5372z > 0) {
                    C1112b0.m38413o0(viewPager2, new C1085c.C1086a(i2, null), null, this.f5382b);
                    return;
                }
                return;
            }
            if (ViewPager2.this.f5372z < mo29834f - 1) {
                C1112b0.m38413o0(viewPager2, new C1085c.C1086a(16908359, null), null, this.f5381a);
            }
            if (ViewPager2.this.f5372z > 0) {
                C1112b0.m38413o0(viewPager2, new C1085c.C1086a(16908358, null), null, this.f5382b);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$k */
    /* loaded from: classes.dex */
    public interface InterfaceC1752k {
        /* renamed from: a */
        void m35451a(View view, float f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$l */
    /* loaded from: classes.dex */
    public class C1753l extends C1645u {
        C1753l() {
        }

        @Override // androidx.recyclerview.widget.C1645u, androidx.recyclerview.widget.AbstractC1651y
        /* renamed from: h */
        public View mo35450h(RecyclerView.AbstractC1546o abstractC1546o) {
            if (ViewPager2.this.m35496c()) {
                return null;
            }
            return super.mo35450h(abstractC1546o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$m */
    /* loaded from: classes.dex */
    public class C1754m extends RecyclerView {
        C1754m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            if (ViewPager2.this.f5368P.mo35476d()) {
                return ViewPager2.this.f5368P.mo35473n();
            }
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f5372z);
            accessibilityEvent.setToIndex(ViewPager2.this.f5372z);
            ViewPager2.this.f5368P.mo35460o(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.m35494e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.m35494e() && super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$n */
    /* loaded from: classes.dex */
    public static class RunnableC1755n implements Runnable {

        /* renamed from: w */
        private final int f5390w;

        /* renamed from: x */
        private final RecyclerView f5391x;

        RunnableC1755n(int i, RecyclerView recyclerView) {
            this.f5390w = i;
            this.f5391x = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5391x.m36619t1(this.f5390w);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5369w = new Rect();
        this.f5370x = new Rect();
        this.f5371y = new C1758b(3);
        this.f5353A = false;
        this.f5354B = new C1739a();
        this.f5356D = -1;
        this.f5364L = null;
        this.f5365M = false;
        this.f5366N = true;
        this.f5367O = -1;
        m35497b(context, attributeSet);
    }

    /* renamed from: a */
    private RecyclerView.InterfaceC1552q m35498a() {
        return new C1742d(this);
    }

    /* renamed from: b */
    private void m35497b(Context context, AttributeSet attributeSet) {
        this.f5368P = f5352Q ? new C1748j() : new C1744f();
        C1754m c1754m = new C1754m(context);
        this.f5358F = c1754m;
        c1754m.setId(C1112b0.m38418m());
        this.f5358F.setDescendantFocusability(131072);
        C1746h c1746h = new C1746h(context);
        this.f5355C = c1746h;
        this.f5358F.setLayoutManager(c1746h);
        this.f5358F.setScrollingTouchSlop(1);
        m35487l(context, attributeSet);
        this.f5358F.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f5358F.m36651j(m35498a());
        C1761e c1761e = new C1761e(this);
        this.f5360H = c1761e;
        this.f5362J = new C1759c(this, c1761e, this.f5358F);
        C1753l c1753l = new C1753l();
        this.f5359G = c1753l;
        c1753l.m35821b(this.f5358F);
        this.f5358F.m36645l(this.f5360H);
        C1758b c1758b = new C1758b(3);
        this.f5361I = c1758b;
        this.f5360H.m35426o(c1758b);
        C1740b c1740b = new C1740b();
        C1741c c1741c = new C1741c();
        this.f5361I.m35444d(c1740b);
        this.f5361I.m35444d(c1741c);
        this.f5368P.mo35464h(this.f5361I, this.f5358F);
        this.f5361I.m35444d(this.f5371y);
        C1760d c1760d = new C1760d(this.f5355C);
        this.f5363K = c1760d;
        this.f5361I.m35444d(c1760d);
        RecyclerView recyclerView = this.f5358F;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* renamed from: f */
    private void m35493f(RecyclerView.AbstractC1535g<?> abstractC1535g) {
        if (abstractC1535g != null) {
            abstractC1535g.m36550A(this.f5354B);
        }
    }

    /* renamed from: i */
    private void m35490i() {
        RecyclerView.AbstractC1535g adapter;
        if (this.f5356D == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.f5357E;
        if (parcelable != null) {
            if (adapter instanceof InterfaceC1737b) {
                ((InterfaceC1737b) adapter).mo35499b(parcelable);
            }
            this.f5357E = null;
        }
        int max = Math.max(0, Math.min(this.f5356D, adapter.mo29834f() - 1));
        this.f5372z = max;
        this.f5356D = -1;
        this.f5358F.m36643l1(max);
        this.f5368P.mo35461m();
    }

    /* renamed from: l */
    private void m35487l(Context context, AttributeSet attributeSet) {
        int[] iArr = C4977a.f13906a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(C4977a.f13907b, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: m */
    private void m35486m(RecyclerView.AbstractC1535g<?> abstractC1535g) {
        if (abstractC1535g != null) {
            abstractC1535g.m36548C(this.f5354B);
        }
    }

    /* renamed from: c */
    public boolean m35496c() {
        return this.f5362J.m35441a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.f5358F.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.f5358F.canScrollVertically(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m35495d() {
        return this.f5355C.m36461a0() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).f5373w;
            sparseArray.put(this.f5358F.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m35490i();
    }

    /* renamed from: e */
    public boolean m35494e() {
        return this.f5366N;
    }

    /* renamed from: g */
    public void m35492g(AbstractC1747i abstractC1747i) {
        this.f5371y.m35444d(abstractC1747i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (this.f5368P.mo35469a()) {
            return this.f5368P.mo35465g();
        }
        return super.getAccessibilityClassName();
    }

    public RecyclerView.AbstractC1535g getAdapter() {
        return this.f5358F.getAdapter();
    }

    public int getCurrentItem() {
        return this.f5372z;
    }

    public int getItemDecorationCount() {
        return this.f5358F.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f5367O;
    }

    public int getOrientation() {
        return this.f5355C.m36754s2();
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f5358F;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f5360H.m35433h();
    }

    /* renamed from: h */
    public void m35491h() {
        if (this.f5363K.m35440d() == null) {
            return;
        }
        double m35434g = this.f5360H.m35434g();
        int i = (int) m35434g;
        float f = (float) (m35434g - i);
        this.f5363K.mo29095b(i, f, Math.round(getPageSize() * f));
    }

    /* renamed from: j */
    public void m35489j(int i, boolean z) {
        if (!m35496c()) {
            m35488k(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    /* renamed from: k */
    void m35488k(int i, boolean z) {
        RecyclerView.AbstractC1535g adapter = getAdapter();
        if (adapter == null) {
            if (this.f5356D != -1) {
                this.f5356D = Math.max(i, 0);
            }
        } else if (adapter.mo29834f() <= 0) {
        } else {
            int min = Math.min(Math.max(i, 0), adapter.mo29834f() - 1);
            if (min == this.f5372z && this.f5360H.m35431j()) {
                return;
            }
            int i2 = this.f5372z;
            if (min == i2 && z) {
                return;
            }
            double d = i2;
            this.f5372z = min;
            this.f5368P.mo35458q();
            if (!this.f5360H.m35431j()) {
                d = this.f5360H.m35434g();
            }
            this.f5360H.m35428m(min, z);
            if (!z) {
                this.f5358F.m36643l1(min);
                return;
            }
            double d2 = min;
            if (Math.abs(d2 - d) > 3.0d) {
                this.f5358F.m36643l1(d2 > d ? min - 3 : min + 3);
                RecyclerView recyclerView = this.f5358F;
                recyclerView.post(new RunnableC1755n(min, recyclerView));
                return;
            }
            this.f5358F.m36619t1(min);
        }
    }

    /* renamed from: n */
    public void m35485n(AbstractC1747i abstractC1747i) {
        this.f5371y.m35443e(abstractC1747i);
    }

    /* renamed from: o */
    void m35484o() {
        C1645u c1645u = this.f5359G;
        if (c1645u != null) {
            View mo35450h = c1645u.mo35450h(this.f5355C);
            if (mo35450h == null) {
                return;
            }
            int m36442i0 = this.f5355C.m36442i0(mo35450h);
            if (m36442i0 != this.f5372z && getScrollState() == 0) {
                this.f5361I.mo29094c(m36442i0);
            }
            this.f5353A = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f5368P.mo35463i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f5358F.getMeasuredWidth();
        int measuredHeight = this.f5358F.getMeasuredHeight();
        this.f5369w.left = getPaddingLeft();
        this.f5369w.right = (i3 - i) - getPaddingRight();
        this.f5369w.top = getPaddingTop();
        this.f5369w.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f5369w, this.f5370x);
        RecyclerView recyclerView = this.f5358F;
        Rect rect = this.f5370x;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f5353A) {
            m35484o();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        measureChild(this.f5358F, i, i2);
        int measuredWidth = this.f5358F.getMeasuredWidth();
        int measuredHeight = this.f5358F.getMeasuredHeight();
        int measuredState = this.f5358F.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), ViewGroup.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f5356D = savedState.f5374x;
        this.f5357E = savedState.f5375y;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5373w = this.f5358F.getId();
        int i = this.f5356D;
        if (i == -1) {
            i = this.f5372z;
        }
        savedState.f5374x = i;
        Parcelable parcelable = this.f5357E;
        if (parcelable != null) {
            savedState.f5375y = parcelable;
        } else {
            RecyclerView.AbstractC1535g adapter = this.f5358F.getAdapter();
            if (adapter instanceof InterfaceC1737b) {
                savedState.f5375y = ((InterfaceC1737b) adapter).mo35500a();
            }
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (this.f5368P.mo35468c(i, bundle)) {
            return this.f5368P.mo35462l(i, bundle);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public void setAdapter(RecyclerView.AbstractC1535g abstractC1535g) {
        RecyclerView.AbstractC1535g adapter = this.f5358F.getAdapter();
        this.f5368P.mo35466f(adapter);
        m35486m(adapter);
        this.f5358F.setAdapter(abstractC1535g);
        this.f5372z = 0;
        m35490i();
        this.f5368P.mo35467e(abstractC1535g);
        m35493f(abstractC1535g);
    }

    public void setCurrentItem(int i) {
        m35489j(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f5368P.mo35459p();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f5367O = i;
        this.f5358F.requestLayout();
    }

    public void setOrientation(int i) {
        this.f5355C.m36795H2(i);
        this.f5368P.mo35457r();
    }

    public void setPageTransformer(InterfaceC1752k interfaceC1752k) {
        if (interfaceC1752k != null) {
            if (!this.f5365M) {
                this.f5364L = this.f5358F.getItemAnimator();
                this.f5365M = true;
            }
            this.f5358F.setItemAnimator(null);
        } else if (this.f5365M) {
            this.f5358F.setItemAnimator(this.f5364L);
            this.f5364L = null;
            this.f5365M = false;
        }
        if (interfaceC1752k == this.f5363K.m35440d()) {
            return;
        }
        this.f5363K.m35439e(interfaceC1752k);
        m35491h();
    }

    public void setUserInputEnabled(boolean z) {
        this.f5366N = z;
        this.f5368P.mo35456s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1738a();

        /* renamed from: w */
        int f5373w;

        /* renamed from: x */
        int f5374x;

        /* renamed from: y */
        Parcelable f5375y;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$SavedState$a */
        /* loaded from: classes.dex */
        static class C1738a implements Parcelable.ClassLoaderCreator<SavedState> {
            C1738a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState mo35482a(Parcel parcel) {
                return mo35481b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState mo35481b(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new SavedState(parcel, classLoader) : new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] mo35480c(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m35483a(parcel, classLoader);
        }

        /* renamed from: a */
        private void m35483a(Parcel parcel, ClassLoader classLoader) {
            this.f5373w = parcel.readInt();
            this.f5374x = parcel.readInt();
            this.f5375y = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5373w);
            parcel.writeInt(this.f5374x);
            parcel.writeParcelable(this.f5375y, i);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            m35483a(parcel, null);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
