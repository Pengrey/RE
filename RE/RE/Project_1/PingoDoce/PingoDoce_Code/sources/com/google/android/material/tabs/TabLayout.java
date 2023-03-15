package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0526u0;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.util.C1075g;
import androidx.core.util.InterfaceC1073e;
import androidx.core.view.C1112b0;
import androidx.core.view.C1170i;
import androidx.core.view.C1215y;
import androidx.core.view.accessibility.C1085c;
import androidx.core.widget.C1240i;
import androidx.viewpager.widget.AbstractC1726a;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.badge.C3469a;
import com.google.android.material.badge.C3471b;
import com.google.android.material.internal.C3649p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p100f8.C5419b;
import p100f8.C5425h;
import p100f8.C5427j;
import p100f8.C5428k;
import p111g.C5586a;
import p120g8.C5616a;
import p366t8.C10399b;
import p401v8.C11145h;

@ViewPager.InterfaceC1719c
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: o0 */
    private static final int f10487o0 = C5428k.Widget_Design_TabLayout;

    /* renamed from: p0 */
    private static final InterfaceC1073e<C3728f> f10488p0 = new C1075g(16);

    /* renamed from: A */
    int f10489A;

    /* renamed from: B */
    int f10490B;

    /* renamed from: C */
    int f10491C;

    /* renamed from: D */
    int f10492D;

    /* renamed from: E */
    ColorStateList f10493E;

    /* renamed from: F */
    ColorStateList f10494F;

    /* renamed from: G */
    ColorStateList f10495G;

    /* renamed from: H */
    Drawable f10496H;

    /* renamed from: I */
    private int f10497I;

    /* renamed from: J */
    PorterDuff.Mode f10498J;

    /* renamed from: K */
    float f10499K;

    /* renamed from: L */
    float f10500L;

    /* renamed from: M */
    final int f10501M;

    /* renamed from: N */
    int f10502N;

    /* renamed from: O */
    private final int f10503O;

    /* renamed from: P */
    private final int f10504P;

    /* renamed from: Q */
    private final int f10505Q;

    /* renamed from: R */
    private int f10506R;

    /* renamed from: S */
    int f10507S;

    /* renamed from: T */
    int f10508T;

    /* renamed from: U */
    int f10509U;

    /* renamed from: V */
    int f10510V;

    /* renamed from: W */
    boolean f10511W;

    /* renamed from: a0 */
    boolean f10512a0;

    /* renamed from: b0 */
    int f10513b0;

    /* renamed from: c0 */
    int f10514c0;

    /* renamed from: d0 */
    boolean f10515d0;

    /* renamed from: e0 */
    private C3735c f10516e0;

    /* renamed from: f0 */
    private InterfaceC3723c f10517f0;

    /* renamed from: g0 */
    private final ArrayList<InterfaceC3723c> f10518g0;

    /* renamed from: h0 */
    private InterfaceC3723c f10519h0;

    /* renamed from: i0 */
    private ValueAnimator f10520i0;

    /* renamed from: j0 */
    ViewPager f10521j0;

    /* renamed from: k0 */
    private C3729g f10522k0;

    /* renamed from: l0 */
    private C3722b f10523l0;

    /* renamed from: m0 */
    private boolean f10524m0;

    /* renamed from: n0 */
    private final InterfaceC1073e<C3730h> f10525n0;

    /* renamed from: w */
    private final ArrayList<C3728f> f10526w;

    /* renamed from: x */
    private C3728f f10527x;

    /* renamed from: y */
    final C3725e f10528y;

    /* renamed from: z */
    int f10529z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    /* loaded from: classes.dex */
    public class C3721a implements ValueAnimator.AnimatorUpdateListener {
        C3721a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    /* loaded from: classes.dex */
    public class C3722b implements ViewPager.InterfaceC1722f {

        /* renamed from: a */
        private boolean f10531a;

        C3722b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1722f
        /* renamed from: a */
        public void mo29167a(ViewPager viewPager, AbstractC1726a abstractC1726a, AbstractC1726a abstractC1726a2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f10521j0 == viewPager) {
                tabLayout.m29201I(abstractC1726a2, this.f10531a);
            }
        }

        /* renamed from: b */
        void m29166b(boolean z) {
            this.f10531a = z;
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    /* loaded from: classes.dex */
    public interface InterfaceC3723c<T extends C3728f> {
        /* renamed from: a */
        void mo29092a(T t);

        /* renamed from: b */
        void mo29091b(T t);

        /* renamed from: c */
        void mo29090c(T t);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    /* loaded from: classes.dex */
    public interface InterfaceC3724d extends InterfaceC3723c<C3728f> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    /* loaded from: classes.dex */
    public class C3725e extends LinearLayout {

        /* renamed from: w */
        ValueAnimator f10534w;

        /* renamed from: x */
        int f10535x;

        /* renamed from: y */
        float f10536y;

        /* renamed from: z */
        private int f10537z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.tabs.TabLayout$e$a */
        /* loaded from: classes.dex */
        public class C3726a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ View f10538a;

            /* renamed from: b */
            final /* synthetic */ View f10539b;

            C3726a(View view, View view2) {
                this.f10538a = view;
                this.f10539b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C3725e.this.m29158h(this.f10538a, this.f10539b, valueAnimator.getAnimatedFraction());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.tabs.TabLayout$e$b */
        /* loaded from: classes.dex */
        public class C3727b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ int f10541a;

            C3727b(int i) {
                this.f10541a = i;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C3725e.this.f10535x = this.f10541a;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C3725e.this.f10535x = this.f10541a;
            }
        }

        C3725e(Context context) {
            super(context);
            this.f10535x = -1;
            this.f10537z = -1;
            setWillNotDraw(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public void m29161e() {
            View childAt = getChildAt(this.f10535x);
            C3735c c3735c = TabLayout.this.f10516e0;
            TabLayout tabLayout = TabLayout.this;
            c3735c.m29106c(tabLayout, childAt, tabLayout.f10496H);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public void m29158h(View view, View view2, float f) {
            if (view != null && view.getWidth() > 0) {
                C3735c c3735c = TabLayout.this.f10516e0;
                TabLayout tabLayout = TabLayout.this;
                c3735c.mo29105d(tabLayout, view, view2, f, tabLayout.f10496H);
            } else {
                Drawable drawable = TabLayout.this.f10496H;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f10496H.getBounds().bottom);
            }
            C1112b0.m38423j0(this);
        }

        /* renamed from: i */
        private void m29157i(boolean z, int i, int i2) {
            View childAt = getChildAt(this.f10535x);
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                m29161e();
                return;
            }
            C3726a c3726a = new C3726a(childAt, childAt2);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f10534w = valueAnimator;
                valueAnimator.setInterpolator(C5616a.f15854b);
                valueAnimator.setDuration(i2);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(c3726a);
                valueAnimator.addListener(new C3727b(i));
                valueAnimator.start();
                return;
            }
            this.f10534w.removeAllUpdateListeners();
            this.f10534w.addUpdateListener(c3726a);
        }

        /* renamed from: c */
        void m29163c(int i, int i2) {
            ValueAnimator valueAnimator = this.f10534w;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f10534w.cancel();
            }
            m29157i(true, i, i2);
        }

        /* renamed from: d */
        boolean m29162d() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height = TabLayout.this.f10496H.getBounds().height();
            if (height < 0) {
                height = TabLayout.this.f10496H.getIntrinsicHeight();
            }
            int i = TabLayout.this.f10509U;
            int i2 = 0;
            if (i == 0) {
                i2 = getHeight() - height;
                height = getHeight();
            } else if (i == 1) {
                i2 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            } else if (i != 2) {
                height = i != 3 ? 0 : getHeight();
            }
            if (TabLayout.this.f10496H.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f10496H.getBounds();
                TabLayout.this.f10496H.setBounds(bounds.left, i2, bounds.right, height);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.f10496H;
                if (tabLayout.f10497I != 0) {
                    drawable = C0981a.m38859r(drawable);
                    if (Build.VERSION.SDK_INT == 21) {
                        drawable.setColorFilter(TabLayout.this.f10497I, PorterDuff.Mode.SRC_IN);
                    } else {
                        C0981a.m38863n(drawable, TabLayout.this.f10497I);
                    }
                } else if (Build.VERSION.SDK_INT == 21) {
                    drawable.setColorFilter(null);
                } else {
                    C0981a.m38862o(drawable, null);
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        /* renamed from: f */
        void m29160f(int i, float f) {
            ValueAnimator valueAnimator = this.f10534w;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f10534w.cancel();
            }
            this.f10535x = i;
            this.f10536y = f;
            m29158h(getChildAt(i), getChildAt(this.f10535x + 1), this.f10536y);
        }

        /* renamed from: g */
        void m29159g(int i) {
            Rect bounds = TabLayout.this.f10496H.getBounds();
            TabLayout.this.f10496H.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f10534w;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                m29157i(false, this.f10535x, -1);
            } else {
                m29161e();
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.f10507S == 1 || tabLayout.f10510V == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 <= 0) {
                    return;
                }
                if (i3 * childCount <= getMeasuredWidth() - (((int) C3649p.m29491b(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                        if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i3;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f10507S = 0;
                    tabLayout2.m29194P(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT >= 23 || this.f10537z == i) {
                return;
            }
            requestLayout();
            this.f10537z = i;
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    /* loaded from: classes.dex */
    public static class C3728f {

        /* renamed from: a */
        private Drawable f10543a;

        /* renamed from: b */
        private CharSequence f10544b;

        /* renamed from: c */
        private CharSequence f10545c;

        /* renamed from: e */
        private View f10546e;

        /* renamed from: g */
        public TabLayout f10547g;

        /* renamed from: h */
        public C3730h f10548h;

        /* renamed from: d */
        private int f10549d = -1;

        /* renamed from: f */
        private int f10550f = 1;

        /* renamed from: i */
        private int f10551i = -1;

        /* renamed from: e */
        public View m29152e() {
            return this.f10546e;
        }

        /* renamed from: f */
        public Drawable m29151f() {
            return this.f10543a;
        }

        /* renamed from: g */
        public int m29150g() {
            return this.f10549d;
        }

        /* renamed from: h */
        public int m29149h() {
            return this.f10550f;
        }

        /* renamed from: i */
        public CharSequence m29148i() {
            return this.f10544b;
        }

        /* renamed from: j */
        public boolean m29147j() {
            TabLayout tabLayout = this.f10547g;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                return selectedTabPosition != -1 && selectedTabPosition == this.f10549d;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: k */
        void m29146k() {
            this.f10547g = null;
            this.f10548h = null;
            this.f10543a = null;
            this.f10551i = -1;
            this.f10544b = null;
            this.f10545c = null;
            this.f10549d = -1;
            this.f10546e = null;
        }

        /* renamed from: l */
        public void m29145l() {
            TabLayout tabLayout = this.f10547g;
            if (tabLayout != null) {
                tabLayout.m29203G(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: m */
        public C3728f m29144m(CharSequence charSequence) {
            this.f10545c = charSequence;
            m29138s();
            return this;
        }

        /* renamed from: n */
        public C3728f m29143n(int i) {
            return m29142o(LayoutInflater.from(this.f10548h.getContext()).inflate(i, (ViewGroup) this.f10548h, false));
        }

        /* renamed from: o */
        public C3728f m29142o(View view) {
            this.f10546e = view;
            m29138s();
            return this;
        }

        /* renamed from: p */
        public C3728f m29141p(Drawable drawable) {
            this.f10543a = drawable;
            TabLayout tabLayout = this.f10547g;
            if (tabLayout.f10507S == 1 || tabLayout.f10510V == 2) {
                tabLayout.m29194P(true);
            }
            m29138s();
            if (C3471b.f9441a && this.f10548h.m29122l() && this.f10548h.f10555A.isVisible()) {
                this.f10548h.invalidate();
            }
            return this;
        }

        /* renamed from: q */
        void m29140q(int i) {
            this.f10549d = i;
        }

        /* renamed from: r */
        public C3728f m29139r(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f10545c) && !TextUtils.isEmpty(charSequence)) {
                this.f10548h.setContentDescription(charSequence);
            }
            this.f10544b = charSequence;
            m29138s();
            return this;
        }

        /* renamed from: s */
        void m29138s() {
            C3730h c3730h = this.f10548h;
            if (c3730h != null) {
                c3730h.m29114t();
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    /* loaded from: classes.dex */
    public static class C3729g implements ViewPager.InterfaceC1723g {

        /* renamed from: a */
        private final WeakReference<TabLayout> f10552a;

        /* renamed from: b */
        private int f10553b;

        /* renamed from: c */
        private int f10554c;

        public C3729g(TabLayout tabLayout) {
            this.f10552a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1723g
        /* renamed from: a */
        public void mo29137a(int i, float f, int i2) {
            TabLayout tabLayout = this.f10552a.get();
            if (tabLayout != null) {
                int i3 = this.f10554c;
                boolean z = false;
                boolean z2 = i3 != 2 || this.f10553b == 1;
                if (i3 != 2 || this.f10553b != 0) {
                    z = true;
                }
                tabLayout.m29199K(i, f, z2, z);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1723g
        /* renamed from: b */
        public void mo29136b(int i) {
            this.f10553b = this.f10554c;
            this.f10554c = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1723g
        /* renamed from: c */
        public void mo29135c(int i) {
            TabLayout tabLayout = this.f10552a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f10554c;
            tabLayout.m29202H(tabLayout.m29170x(i), i2 == 0 || (i2 == 2 && this.f10553b == 0));
        }

        /* renamed from: d */
        void m29134d() {
            this.f10554c = 0;
            this.f10553b = 0;
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    /* loaded from: classes.dex */
    public final class C3730h extends LinearLayout {

        /* renamed from: A */
        private C3469a f10555A;

        /* renamed from: B */
        private View f10556B;

        /* renamed from: C */
        private TextView f10557C;

        /* renamed from: D */
        private ImageView f10558D;

        /* renamed from: E */
        private Drawable f10559E;

        /* renamed from: F */
        private int f10560F;

        /* renamed from: w */
        private C3728f f10562w;

        /* renamed from: x */
        private TextView f10563x;

        /* renamed from: y */
        private ImageView f10564y;

        /* renamed from: z */
        private View f10565z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.tabs.TabLayout$h$a */
        /* loaded from: classes.dex */
        public class View$OnLayoutChangeListenerC3731a implements View.OnLayoutChangeListener {

            /* renamed from: a */
            final /* synthetic */ View f10566a;

            View$OnLayoutChangeListenerC3731a(View view) {
                this.f10566a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.f10566a.getVisibility() == 0) {
                    C3730h.this.m29115s(this.f10566a);
                }
            }
        }

        public C3730h(Context context) {
            super(context);
            this.f10560F = 2;
            m29113u(context);
            C1112b0.m38473F0(this, TabLayout.this.f10529z, TabLayout.this.f10489A, TabLayout.this.f10490B, TabLayout.this.f10491C);
            setGravity(17);
            setOrientation(!TabLayout.this.f10511W ? 1 : 0);
            setClickable(true);
            C1112b0.m38471G0(this, C1215y.m38013b(getContext(), 1002));
        }

        /* renamed from: f */
        private void m29128f(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC3731a(view));
        }

        /* renamed from: g */
        private float m29127g(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        private C3469a getBadge() {
            return this.f10555A;
        }

        private C3469a getOrCreateBadge() {
            if (this.f10555A == null) {
                this.f10555A = C3469a.m30531c(getContext());
            }
            m29116r();
            C3469a c3469a = this.f10555A;
            if (c3469a != null) {
                return c3469a;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* renamed from: h */
        private void m29126h(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        /* renamed from: i */
        private FrameLayout m29125i() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public void m29124j(Canvas canvas) {
            Drawable drawable = this.f10559E;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f10559E.draw(canvas);
            }
        }

        /* renamed from: k */
        private FrameLayout m29123k(View view) {
            if ((view == this.f10564y || view == this.f10563x) && C3471b.f9441a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public boolean m29122l() {
            return this.f10555A != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: m */
        private void m29121m() {
            FrameLayout frameLayout;
            if (C3471b.f9441a) {
                frameLayout = m29125i();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C5425h.design_layout_tab_icon, (ViewGroup) frameLayout, false);
            this.f10564y = imageView;
            frameLayout.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: n */
        private void m29120n() {
            FrameLayout frameLayout;
            if (C3471b.f9441a) {
                frameLayout = m29125i();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C5425h.design_layout_tab_text, (ViewGroup) frameLayout, false);
            this.f10563x = textView;
            frameLayout.addView(textView);
        }

        /* renamed from: p */
        private void m29118p(View view) {
            if (m29122l() && view != null) {
                m29126h(false);
                C3471b.m30507a(this.f10555A, view, m29123k(view));
                this.f10565z = view;
            }
        }

        /* renamed from: q */
        private void m29117q() {
            if (m29122l()) {
                m29126h(true);
                View view = this.f10565z;
                if (view != null) {
                    C3471b.m30504d(this.f10555A, view);
                    this.f10565z = null;
                }
            }
        }

        /* renamed from: r */
        private void m29116r() {
            C3728f c3728f;
            C3728f c3728f2;
            if (m29122l()) {
                if (this.f10556B != null) {
                    m29117q();
                } else if (this.f10564y != null && (c3728f2 = this.f10562w) != null && c3728f2.m29151f() != null) {
                    View view = this.f10565z;
                    ImageView imageView = this.f10564y;
                    if (view != imageView) {
                        m29117q();
                        m29118p(this.f10564y);
                        return;
                    }
                    m29115s(imageView);
                } else if (this.f10563x != null && (c3728f = this.f10562w) != null && c3728f.m29149h() == 1) {
                    View view2 = this.f10565z;
                    TextView textView = this.f10563x;
                    if (view2 != textView) {
                        m29117q();
                        m29118p(this.f10563x);
                        return;
                    }
                    m29115s(textView);
                } else {
                    m29117q();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public void m29115s(View view) {
            if (m29122l() && view == this.f10565z) {
                C3471b.m30503e(this.f10555A, view, m29123k(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        /* renamed from: u */
        public void m29113u(Context context) {
            int i = TabLayout.this.f10501M;
            if (i != 0) {
                Drawable m23699b = C5586a.m23699b(context, i);
                this.f10559E = m23699b;
                if (m23699b != null && m23699b.isStateful()) {
                    this.f10559E.setState(getDrawableState());
                }
            } else {
                this.f10559E = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.f10495G != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList m8074a = C10399b.m8074a(TabLayout.this.f10495G);
                if (Build.VERSION.SDK_INT >= 21) {
                    boolean z = TabLayout.this.f10515d0;
                    if (z) {
                        gradientDrawable = null;
                    }
                    gradientDrawable = new RippleDrawable(m8074a, gradientDrawable, z ? null : gradientDrawable2);
                } else {
                    Drawable m38859r = C0981a.m38859r(gradientDrawable2);
                    C0981a.m38862o(m38859r, m8074a);
                    gradientDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, m38859r});
                }
            }
            C1112b0.m38399v0(this, gradientDrawable);
            TabLayout.this.invalidate();
        }

        /* renamed from: w */
        private void m29111w(TextView textView, ImageView imageView) {
            C3728f c3728f = this.f10562w;
            Drawable mutate = (c3728f == null || c3728f.m29151f() == null) ? null : C0981a.m38859r(this.f10562w.m29151f()).mutate();
            if (mutate != null) {
                C0981a.m38862o(mutate, TabLayout.this.f10494F);
                PorterDuff.Mode mode = TabLayout.this.f10498J;
                if (mode != null) {
                    C0981a.m38861p(mutate, mode);
                }
            }
            C3728f c3728f2 = this.f10562w;
            CharSequence m29148i = c3728f2 != null ? c3728f2.m29148i() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(m29148i);
            if (textView != null) {
                if (z) {
                    textView.setText(m29148i);
                    if (this.f10562w.f10550f == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int m29491b = (z && imageView.getVisibility() == 0) ? (int) C3649p.m29491b(getContext(), 8) : 0;
                if (TabLayout.this.f10511W) {
                    if (m29491b != C1170i.m38157a(marginLayoutParams)) {
                        C1170i.m38155c(marginLayoutParams, m29491b);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (m29491b != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = m29491b;
                    C1170i.m38155c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C3728f c3728f3 = this.f10562w;
            CharSequence charSequence = c3728f3 != null ? c3728f3.f10545c : null;
            int i = Build.VERSION.SDK_INT;
            if (i < 21 || i > 23) {
                if (!z) {
                    m29148i = charSequence;
                }
                C0526u0.m40411a(this, m29148i);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f10559E;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f10559E.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getContentHeight() {
            View[] viewArr = {this.f10563x, this.f10564y, this.f10556B};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getTop()) : view.getTop();
                    i = z ? Math.max(i, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return i - i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getContentWidth() {
            View[] viewArr = {this.f10563x, this.f10564y, this.f10556B};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        public C3728f getTab() {
            return this.f10562w;
        }

        /* renamed from: o */
        void m29119o() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            C3469a c3469a = this.f10555A;
            if (c3469a != null && c3469a.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(((Object) contentDescription) + ", " + ((Object) this.f10555A.m30527g()));
            }
            C1085c m38578L0 = C1085c.m38578L0(accessibilityNodeInfo);
            m38578L0.m38556d0(C1085c.C1088c.m38506a(0, 1, this.f10562w.m29150g(), 1, false, isSelected()));
            if (isSelected()) {
                m38578L0.m38560b0(false);
                m38578L0.m38571S(C1085c.C1086a.f3425e);
            }
            m38578L0.m38512z0(getResources().getString(C5427j.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f10502N, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f10563x != null) {
                float f = TabLayout.this.f10499K;
                int i3 = this.f10560F;
                ImageView imageView = this.f10564y;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f10563x;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f10500L;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f10563x.getTextSize();
                int lineCount = this.f10563x.getLineCount();
                int m37885d = C1240i.m37885d(this.f10563x);
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (m37885d >= 0 && i3 != m37885d)) {
                    if (TabLayout.this.f10510V == 1 && i4 > 0 && lineCount == 1 && ((layout = this.f10563x.getLayout()) == null || m29127g(layout, 0, f) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z = false;
                    }
                    if (z) {
                        this.f10563x.setTextSize(0, f);
                        this.f10563x.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f10562w != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.f10562w.m29145l();
                return true;
            }
            return performClick;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f10563x;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f10564y;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f10556B;
            if (view != null) {
                view.setSelected(z);
            }
        }

        void setTab(C3728f c3728f) {
            if (c3728f != this.f10562w) {
                this.f10562w = c3728f;
                m29114t();
            }
        }

        /* renamed from: t */
        final void m29114t() {
            C3728f c3728f = this.f10562w;
            View m29152e = c3728f != null ? c3728f.m29152e() : null;
            if (m29152e != null) {
                ViewParent parent = m29152e.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(m29152e);
                    }
                    addView(m29152e);
                }
                this.f10556B = m29152e;
                TextView textView = this.f10563x;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f10564y;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f10564y.setImageDrawable(null);
                }
                TextView textView2 = (TextView) m29152e.findViewById(16908308);
                this.f10557C = textView2;
                if (textView2 != null) {
                    this.f10560F = C1240i.m37885d(textView2);
                }
                this.f10558D = (ImageView) m29152e.findViewById(16908294);
            } else {
                View view = this.f10556B;
                if (view != null) {
                    removeView(view);
                    this.f10556B = null;
                }
                this.f10557C = null;
                this.f10558D = null;
            }
            if (this.f10556B == null) {
                if (this.f10564y == null) {
                    m29121m();
                }
                if (this.f10563x == null) {
                    m29120n();
                    this.f10560F = C1240i.m37885d(this.f10563x);
                }
                C1240i.m37872q(this.f10563x, TabLayout.this.f10492D);
                ColorStateList colorStateList = TabLayout.this.f10493E;
                if (colorStateList != null) {
                    this.f10563x.setTextColor(colorStateList);
                }
                m29111w(this.f10563x, this.f10564y);
                m29116r();
                m29128f(this.f10564y);
                m29128f(this.f10563x);
            } else {
                TextView textView3 = this.f10557C;
                if (textView3 != null || this.f10558D != null) {
                    m29111w(textView3, this.f10558D);
                }
            }
            if (c3728f != null && !TextUtils.isEmpty(c3728f.f10545c)) {
                setContentDescription(c3728f.f10545c);
            }
            setSelected(c3728f != null && c3728f.m29147j());
        }

        /* renamed from: v */
        final void m29112v() {
            setOrientation(!TabLayout.this.f10511W ? 1 : 0);
            TextView textView = this.f10557C;
            if (textView == null && this.f10558D == null) {
                m29111w(this.f10563x, this.f10564y);
            } else {
                m29111w(textView, this.f10558D);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    /* loaded from: classes.dex */
    public static class C3732i implements InterfaceC3724d {

        /* renamed from: a */
        private final ViewPager f10568a;

        public C3732i(ViewPager viewPager) {
            this.f10568a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC3723c
        /* renamed from: a */
        public void mo29092a(C3728f c3728f) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC3723c
        /* renamed from: b */
        public void mo29091b(C3728f c3728f) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC3723c
        /* renamed from: c */
        public void mo29090c(C3728f c3728f) {
            this.f10568a.setCurrentItem(c3728f.m29150g());
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5419b.tabStyle);
    }

    /* renamed from: F */
    private void m29204F(int i) {
        C3730h c3730h = (C3730h) this.f10528y.getChildAt(i);
        this.f10528y.removeViewAt(i);
        if (c3730h != null) {
            c3730h.m29119o();
            this.f10525n0.mo38626a(c3730h);
        }
        requestLayout();
    }

    /* renamed from: M */
    private void m29197M(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f10521j0;
        if (viewPager2 != null) {
            C3729g c3729g = this.f10522k0;
            if (c3729g != null) {
                viewPager2.m35573C(c3729g);
            }
            C3722b c3722b = this.f10523l0;
            if (c3722b != null) {
                this.f10521j0.m35574B(c3722b);
            }
        }
        InterfaceC3723c interfaceC3723c = this.f10519h0;
        if (interfaceC3723c != null) {
            m29205E(interfaceC3723c);
            this.f10519h0 = null;
        }
        if (viewPager != null) {
            this.f10521j0 = viewPager;
            if (this.f10522k0 == null) {
                this.f10522k0 = new C3729g(this);
            }
            this.f10522k0.m29134d();
            viewPager.m35563b(this.f10522k0);
            C3732i c3732i = new C3732i(viewPager);
            this.f10519h0 = c3732i;
            m29191c(c3732i);
            viewPager.getAdapter();
            if (this.f10523l0 == null) {
                this.f10523l0 = new C3722b();
            }
            this.f10523l0.m29166b(z);
            viewPager.m35564a(this.f10523l0);
            m29200J(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f10521j0 = null;
            m29201I(null, false);
        }
        this.f10524m0 = z2;
    }

    /* renamed from: N */
    private void m29196N() {
        int size = this.f10526w.size();
        for (int i = 0; i < size; i++) {
            this.f10526w.get(i).m29138s();
        }
    }

    /* renamed from: O */
    private void m29195O(LinearLayout.LayoutParams layoutParams) {
        if (this.f10510V == 1 && this.f10507S == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    private int getDefaultHeight() {
        int size = this.f10526w.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C3728f c3728f = this.f10526w.get(i);
                if (c3728f != null && c3728f.m29151f() != null && !TextUtils.isEmpty(c3728f.m29148i())) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return (!z || this.f10511W) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.f10503O;
        if (i != -1) {
            return i;
        }
        int i2 = this.f10510V;
        if (i2 == 0 || i2 == 2) {
            return this.f10505Q;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f10528y.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: h */
    private void m29186h(C3736d c3736d) {
        C3728f m29209A = m29209A();
        CharSequence charSequence = c3736d.f10569w;
        if (charSequence != null) {
            m29209A.m29139r(charSequence);
        }
        Drawable drawable = c3736d.f10570x;
        if (drawable != null) {
            m29209A.m29141p(drawable);
        }
        int i = c3736d.f10571y;
        if (i != 0) {
            m29209A.m29143n(i);
        }
        if (!TextUtils.isEmpty(c3736d.getContentDescription())) {
            m29209A.m29144m(c3736d.getContentDescription());
        }
        m29189e(m29209A);
    }

    /* renamed from: i */
    private void m29185i(C3728f c3728f) {
        C3730h c3730h = c3728f.f10548h;
        c3730h.setSelected(false);
        c3730h.setActivated(false);
        this.f10528y.addView(c3730h, c3728f.m29150g(), m29177q());
    }

    /* renamed from: j */
    private void m29184j(View view) {
        if (view instanceof C3736d) {
            m29186h((C3736d) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: k */
    private void m29183k(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && C1112b0.m38446W(this) && !this.f10528y.m29162d()) {
            int scrollX = getScrollX();
            int m29180n = m29180n(i, 0.0f);
            if (scrollX != m29180n) {
                m29171w();
                this.f10520i0.setIntValues(scrollX, m29180n);
                this.f10520i0.start();
            }
            this.f10528y.m29163c(i, this.f10508T);
            return;
        }
        m29200J(i, 0.0f, true);
    }

    /* renamed from: l */
    private void m29182l(int i) {
        if (i == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i == 1) {
            this.f10528y.setGravity(1);
            return;
        } else if (i != 2) {
            return;
        }
        this.f10528y.setGravity(8388611);
    }

    /* renamed from: m */
    private void m29181m() {
        int i = this.f10510V;
        C1112b0.m38473F0(this.f10528y, (i == 0 || i == 2) ? Math.max(0, this.f10506R - this.f10529z) : 0, 0, 0, 0);
        int i2 = this.f10510V;
        if (i2 == 0) {
            m29182l(this.f10507S);
        } else if (i2 == 1 || i2 == 2) {
            if (this.f10507S == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f10528y.setGravity(1);
        }
        m29194P(true);
    }

    /* renamed from: n */
    private int m29180n(int i, float f) {
        View childAt;
        int i2 = this.f10510V;
        if ((i2 == 0 || i2 == 2) && (childAt = this.f10528y.getChildAt(i)) != null) {
            int i3 = i + 1;
            View childAt2 = i3 < this.f10528y.getChildCount() ? this.f10528y.getChildAt(i3) : null;
            int width = childAt.getWidth();
            int width2 = childAt2 != null ? childAt2.getWidth() : 0;
            int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
            int i4 = (int) ((width + width2) * 0.5f * f);
            return C1112b0.m38476E(this) == 0 ? left + i4 : left - i4;
        }
        return 0;
    }

    /* renamed from: o */
    private void m29179o(C3728f c3728f, int i) {
        c3728f.m29140q(i);
        this.f10526w.add(i, c3728f);
        int size = this.f10526w.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            }
            this.f10526w.get(i).m29140q(i);
        }
    }

    /* renamed from: p */
    private static ColorStateList m29178p(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    /* renamed from: q */
    private LinearLayout.LayoutParams m29177q() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m29195O(layoutParams);
        return layoutParams;
    }

    /* renamed from: s */
    private C3730h m29175s(C3728f c3728f) {
        InterfaceC1073e<C3730h> interfaceC1073e = this.f10525n0;
        C3730h mo38625b = interfaceC1073e != null ? interfaceC1073e.mo38625b() : null;
        if (mo38625b == null) {
            mo38625b = new C3730h(getContext());
        }
        mo38625b.setTab(c3728f);
        mo38625b.setFocusable(true);
        mo38625b.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c3728f.f10545c)) {
            mo38625b.setContentDescription(c3728f.f10544b);
        } else {
            mo38625b.setContentDescription(c3728f.f10545c);
        }
        return mo38625b;
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f10528y.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f10528y.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    /* renamed from: t */
    private void m29174t(C3728f c3728f) {
        for (int size = this.f10518g0.size() - 1; size >= 0; size--) {
            this.f10518g0.get(size).mo29092a(c3728f);
        }
    }

    /* renamed from: u */
    private void m29173u(C3728f c3728f) {
        for (int size = this.f10518g0.size() - 1; size >= 0; size--) {
            this.f10518g0.get(size).mo29090c(c3728f);
        }
    }

    /* renamed from: v */
    private void m29172v(C3728f c3728f) {
        for (int size = this.f10518g0.size() - 1; size >= 0; size--) {
            this.f10518g0.get(size).mo29091b(c3728f);
        }
    }

    /* renamed from: w */
    private void m29171w() {
        if (this.f10520i0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f10520i0 = valueAnimator;
            valueAnimator.setInterpolator(C5616a.f15854b);
            this.f10520i0.setDuration(this.f10508T);
            this.f10520i0.addUpdateListener(new C3721a());
        }
    }

    /* renamed from: y */
    private boolean m29169y() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    /* renamed from: A */
    public C3728f m29209A() {
        C3728f m29176r = m29176r();
        m29176r.f10547g = this;
        m29176r.f10548h = m29175s(m29176r);
        if (m29176r.f10551i != -1) {
            m29176r.f10548h.setId(m29176r.f10551i);
        }
        return m29176r;
    }

    /* renamed from: B */
    void m29208B() {
        m29206D();
    }

    /* renamed from: C */
    protected boolean m29207C(C3728f c3728f) {
        return f10488p0.mo38626a(c3728f);
    }

    /* renamed from: D */
    public void m29206D() {
        for (int childCount = this.f10528y.getChildCount() - 1; childCount >= 0; childCount--) {
            m29204F(childCount);
        }
        Iterator<C3728f> it = this.f10526w.iterator();
        while (it.hasNext()) {
            C3728f next = it.next();
            it.remove();
            next.m29146k();
            m29207C(next);
        }
        this.f10527x = null;
    }

    @Deprecated
    /* renamed from: E */
    public void m29205E(InterfaceC3723c interfaceC3723c) {
        this.f10518g0.remove(interfaceC3723c);
    }

    /* renamed from: G */
    public void m29203G(C3728f c3728f) {
        m29202H(c3728f, true);
    }

    /* renamed from: H */
    public void m29202H(C3728f c3728f, boolean z) {
        C3728f c3728f2 = this.f10527x;
        if (c3728f2 == c3728f) {
            if (c3728f2 != null) {
                m29174t(c3728f);
                m29183k(c3728f.m29150g());
                return;
            }
            return;
        }
        int m29150g = c3728f != null ? c3728f.m29150g() : -1;
        if (z) {
            if ((c3728f2 == null || c3728f2.m29150g() == -1) && m29150g != -1) {
                m29200J(m29150g, 0.0f, true);
            } else {
                m29183k(m29150g);
            }
            if (m29150g != -1) {
                setSelectedTabView(m29150g);
            }
        }
        this.f10527x = c3728f;
        if (c3728f2 != null) {
            m29172v(c3728f2);
        }
        if (c3728f != null) {
            m29173u(c3728f);
        }
    }

    /* renamed from: I */
    void m29201I(AbstractC1726a abstractC1726a, boolean z) {
        m29208B();
    }

    /* renamed from: J */
    public void m29200J(int i, float f, boolean z) {
        m29199K(i, f, z, true);
    }

    /* renamed from: K */
    public void m29199K(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.f10528y.getChildCount()) {
            return;
        }
        if (z2) {
            this.f10528y.m29160f(i, f);
        }
        ValueAnimator valueAnimator = this.f10520i0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f10520i0.cancel();
        }
        scrollTo(i < 0 ? 0 : m29180n(i, f), 0);
        if (z) {
            setSelectedTabView(round);
        }
    }

    /* renamed from: L */
    public void m29198L(ViewPager viewPager, boolean z) {
        m29197M(viewPager, z, false);
    }

    /* renamed from: P */
    void m29194P(boolean z) {
        for (int i = 0; i < this.f10528y.getChildCount(); i++) {
            View childAt = this.f10528y.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m29195O((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m29184j(view);
    }

    @Deprecated
    /* renamed from: c */
    public void m29191c(InterfaceC3723c interfaceC3723c) {
        if (this.f10518g0.contains(interfaceC3723c)) {
            return;
        }
        this.f10518g0.add(interfaceC3723c);
    }

    /* renamed from: d */
    public void m29190d(InterfaceC3724d interfaceC3724d) {
        m29191c(interfaceC3724d);
    }

    /* renamed from: e */
    public void m29189e(C3728f c3728f) {
        m29187g(c3728f, this.f10526w.isEmpty());
    }

    /* renamed from: f */
    public void m29188f(C3728f c3728f, int i, boolean z) {
        if (c3728f.f10547g == this) {
            m29179o(c3728f, i);
            m29185i(c3728f);
            if (z) {
                c3728f.m29145l();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: g */
    public void m29187g(C3728f c3728f, boolean z) {
        m29188f(c3728f, this.f10526w.size(), z);
    }

    public int getSelectedTabPosition() {
        C3728f c3728f = this.f10527x;
        if (c3728f != null) {
            return c3728f.m29150g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f10526w.size();
    }

    public int getTabGravity() {
        return this.f10507S;
    }

    public ColorStateList getTabIconTint() {
        return this.f10494F;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f10514c0;
    }

    public int getTabIndicatorGravity() {
        return this.f10509U;
    }

    int getTabMaxWidth() {
        return this.f10502N;
    }

    public int getTabMode() {
        return this.f10510V;
    }

    public ColorStateList getTabRippleColor() {
        return this.f10495G;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f10496H;
    }

    public ColorStateList getTabTextColors() {
        return this.f10493E;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C11145h.m5961e(this);
        if (this.f10521j0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m29197M((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f10524m0) {
            setupWithViewPager(null);
            this.f10524m0 = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i = 0; i < this.f10528y.getChildCount(); i++) {
            View childAt = this.f10528y.getChildAt(i);
            if (childAt instanceof C3730h) {
                ((C3730h) childAt).m29124j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1085c.m38578L0(accessibilityNodeInfo).m38558c0(C1085c.C1087b.m38507a(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return m29169y() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (r0 != 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L25;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.C3649p.m29491b(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f10504P
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.C3649p.m29491b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f10502N = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f10510V
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = r5
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || m29169y()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: r */
    protected C3728f m29176r() {
        C3728f mo38625b = f10488p0.mo38625b();
        return mo38625b == null ? new C3728f() : mo38625b;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C11145h.m5962d(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f10511W != z) {
            this.f10511W = z;
            for (int i = 0; i < this.f10528y.getChildCount(); i++) {
                View childAt = this.f10528y.getChildAt(i);
                if (childAt instanceof C3730h) {
                    ((C3730h) childAt).m29112v();
                }
            }
            m29181m();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC3724d interfaceC3724d) {
        setOnTabSelectedListener((InterfaceC3723c) interfaceC3724d);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m29171w();
        this.f10520i0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f10496H != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f10496H = drawable;
            int i = this.f10513b0;
            if (i == -1) {
                i = drawable.getIntrinsicHeight();
            }
            this.f10528y.m29159g(i);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f10497I = i;
        m29194P(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f10509U != i) {
            this.f10509U = i;
            C1112b0.m38423j0(this.f10528y);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f10513b0 = i;
        this.f10528y.m29159g(i);
    }

    public void setTabGravity(int i) {
        if (this.f10507S != i) {
            this.f10507S = i;
            m29181m();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f10494F != colorStateList) {
            this.f10494F = colorStateList;
            m29196N();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C5586a.m23700a(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f10514c0 = i;
        if (i == 0) {
            this.f10516e0 = new C3735c();
        } else if (i == 1) {
            this.f10516e0 = new C3733a();
        } else if (i == 2) {
            this.f10516e0 = new C3734b();
        } else {
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f10512a0 = z;
        this.f10528y.m29161e();
        C1112b0.m38423j0(this.f10528y);
    }

    public void setTabMode(int i) {
        if (i != this.f10510V) {
            this.f10510V = i;
            m29181m();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f10495G != colorStateList) {
            this.f10495G = colorStateList;
            for (int i = 0; i < this.f10528y.getChildCount(); i++) {
                View childAt = this.f10528y.getChildAt(i);
                if (childAt instanceof C3730h) {
                    ((C3730h) childAt).m29113u(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C5586a.m23700a(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f10493E != colorStateList) {
            this.f10493E = colorStateList;
            m29196N();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC1726a abstractC1726a) {
        m29201I(abstractC1726a, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f10515d0 != z) {
            this.f10515d0 = z;
            for (int i = 0; i < this.f10528y.getChildCount(); i++) {
                View childAt = this.f10528y.getChildAt(i);
                if (childAt instanceof C3730h) {
                    ((C3730h) childAt).m29113u(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m29198L(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* renamed from: x */
    public C3728f m29170x(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f10526w.get(i);
    }

    /* renamed from: z */
    public boolean m29168z() {
        return this.f10512a0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TabLayout(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        m29184j(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC3723c interfaceC3723c) {
        InterfaceC3723c interfaceC3723c2 = this.f10517f0;
        if (interfaceC3723c2 != null) {
            m29205E(interfaceC3723c2);
        }
        this.f10517f0 = interfaceC3723c;
        if (interfaceC3723c != null) {
            m29191c(interfaceC3723c);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m29184j(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m29184j(view);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C5586a.m23699b(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
