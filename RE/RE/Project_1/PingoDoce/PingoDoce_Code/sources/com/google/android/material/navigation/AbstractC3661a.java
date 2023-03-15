package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0382g;
import androidx.appcompat.view.menu.InterfaceC0389k;
import androidx.appcompat.widget.C0526u0;
import androidx.core.content.C0928a;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.view.C1112b0;
import androidx.core.view.C1215y;
import androidx.core.view.accessibility.C1085c;
import androidx.core.widget.C1240i;
import com.google.android.material.badge.C3469a;
import com.google.android.material.badge.C3471b;
import p100f8.C5419b;
import p100f8.C5421d;
import p100f8.C5422e;
import p100f8.C5423f;
import p100f8.C5424g;
import p100f8.C5427j;
import p120g8.C5616a;
import p310q8.C9698a;
import p354s8.C10086c;

/* renamed from: com.google.android.material.navigation.a */
/* loaded from: classes.dex */
public abstract class AbstractC3661a extends FrameLayout implements InterfaceC0389k.InterfaceC0390a {

    /* renamed from: b0 */
    private static final int[] f10254b0 = {16842912};

    /* renamed from: c0 */
    private static final C3665d f10255c0 = new C3665d(null);

    /* renamed from: d0 */
    private static final C3665d f10256d0 = new C3666e(null);

    /* renamed from: A */
    private float f10257A;

    /* renamed from: B */
    private float f10258B;

    /* renamed from: C */
    private int f10259C;

    /* renamed from: D */
    private boolean f10260D;

    /* renamed from: E */
    private final FrameLayout f10261E;

    /* renamed from: F */
    private final View f10262F;

    /* renamed from: G */
    private final ImageView f10263G;

    /* renamed from: H */
    private final ViewGroup f10264H;

    /* renamed from: I */
    private final TextView f10265I;

    /* renamed from: J */
    private final TextView f10266J;

    /* renamed from: K */
    private int f10267K;

    /* renamed from: L */
    private C0382g f10268L;

    /* renamed from: M */
    private ColorStateList f10269M;

    /* renamed from: N */
    private Drawable f10270N;

    /* renamed from: O */
    private Drawable f10271O;

    /* renamed from: P */
    private ValueAnimator f10272P;

    /* renamed from: Q */
    private C3665d f10273Q;

    /* renamed from: R */
    private float f10274R;

    /* renamed from: S */
    private boolean f10275S;

    /* renamed from: T */
    private int f10276T;

    /* renamed from: U */
    private int f10277U;

    /* renamed from: V */
    private boolean f10278V;

    /* renamed from: W */
    private int f10279W;

    /* renamed from: a0 */
    private C3469a f10280a0;

    /* renamed from: w */
    private boolean f10281w;

    /* renamed from: x */
    private int f10282x;

    /* renamed from: y */
    private int f10283y;

    /* renamed from: z */
    private float f10284z;

    /* compiled from: NavigationBarItemView.java */
    /* renamed from: com.google.android.material.navigation.a$a */
    /* loaded from: classes.dex */
    class View$OnLayoutChangeListenerC3662a implements View.OnLayoutChangeListener {
        View$OnLayoutChangeListenerC3662a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (AbstractC3661a.this.f10263G.getVisibility() == 0) {
                AbstractC3661a abstractC3661a = AbstractC3661a.this;
                abstractC3661a.m29436u(abstractC3661a.f10263G);
            }
        }
    }

    /* compiled from: NavigationBarItemView.java */
    /* renamed from: com.google.android.material.navigation.a$b */
    /* loaded from: classes.dex */
    class RunnableC3663b implements Runnable {

        /* renamed from: w */
        final /* synthetic */ int f10286w;

        RunnableC3663b(int i) {
            this.f10286w = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC3661a.this.m29435v(this.f10286w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavigationBarItemView.java */
    /* renamed from: com.google.android.material.navigation.a$c */
    /* loaded from: classes.dex */
    public class C3664c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ float f10288a;

        C3664c(float f) {
            this.f10288a = f;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            AbstractC3661a.this.m29442o(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f10288a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NavigationBarItemView.java */
    /* renamed from: com.google.android.material.navigation.a$d */
    /* loaded from: classes.dex */
    public static class C3665d {
        private C3665d() {
        }

        /* renamed from: a */
        protected float m29432a(float f, float f2) {
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            return C5616a.m23564b(0.0f, 1.0f, i == 0 ? 0.8f : 0.0f, i == 0 ? 1.0f : 0.2f, f);
        }

        /* renamed from: b */
        protected float m29431b(float f, float f2) {
            return C5616a.m23565a(0.4f, 1.0f, f);
        }

        /* renamed from: c */
        protected float mo29429c(float f, float f2) {
            return 1.0f;
        }

        /* renamed from: d */
        public void m29430d(float f, float f2, View view) {
            view.setScaleX(m29431b(f, f2));
            view.setScaleY(mo29429c(f, f2));
            view.setAlpha(m29432a(f, f2));
        }

        /* synthetic */ C3665d(View$OnLayoutChangeListenerC3662a view$OnLayoutChangeListenerC3662a) {
            this();
        }
    }

    /* compiled from: NavigationBarItemView.java */
    /* renamed from: com.google.android.material.navigation.a$e */
    /* loaded from: classes.dex */
    private static class C3666e extends C3665d {
        private C3666e() {
            super(null);
        }

        @Override // com.google.android.material.navigation.AbstractC3661a.C3665d
        /* renamed from: c */
        protected float mo29429c(float f, float f2) {
            return m29431b(f, f2);
        }

        /* synthetic */ C3666e(View$OnLayoutChangeListenerC3662a view$OnLayoutChangeListenerC3662a) {
            this();
        }
    }

    public AbstractC3661a(Context context) {
        super(context);
        this.f10281w = false;
        this.f10267K = -1;
        this.f10273Q = f10255c0;
        this.f10274R = 0.0f;
        this.f10275S = false;
        this.f10276T = 0;
        this.f10277U = 0;
        this.f10278V = false;
        this.f10279W = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f10261E = (FrameLayout) findViewById(C5423f.navigation_bar_item_icon_container);
        this.f10262F = findViewById(C5423f.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(C5423f.navigation_bar_item_icon_view);
        this.f10263G = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(C5423f.navigation_bar_item_labels_group);
        this.f10264H = viewGroup;
        TextView textView = (TextView) findViewById(C5423f.navigation_bar_item_small_label_view);
        this.f10265I = textView;
        TextView textView2 = (TextView) findViewById(C5423f.navigation_bar_item_large_label_view);
        this.f10266J = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f10282x = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f10283y = viewGroup.getPaddingBottom();
        C1112b0.m38479C0(textView, 2);
        C1112b0.m38479C0(textView2, 2);
        setFocusable(true);
        m29450g(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC3662a());
        }
    }

    /* renamed from: g */
    private void m29450g(float f, float f2) {
        this.f10284z = f - f2;
        this.f10257A = (f2 * 1.0f) / f;
        this.f10258B = (f * 1.0f) / f2;
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f10261E;
        return frameLayout != null ? frameLayout : this.f10263G;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof AbstractC3661a) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        C3469a c3469a = this.f10280a0;
        int minimumHeight = c3469a != null ? c3469a.getMinimumHeight() / 2 : 0;
        return Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + this.f10263G.getMeasuredWidth() + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        C3469a c3469a = this.f10280a0;
        int minimumWidth = c3469a == null ? 0 : c3469a.getMinimumWidth() - this.f10280a0.m30525i();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.f10263G.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    /* renamed from: i */
    private FrameLayout m29448i(View view) {
        ImageView imageView = this.f10263G;
        if (view == imageView && C3471b.f9441a) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    /* renamed from: j */
    private boolean m29447j() {
        return this.f10280a0 != null;
    }

    /* renamed from: k */
    private boolean m29446k() {
        return this.f10278V && this.f10259C == 2;
    }

    /* renamed from: l */
    private void m29445l(float f) {
        if (this.f10275S && this.f10281w && C1112b0.m38447V(this)) {
            ValueAnimator valueAnimator = this.f10272P;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f10272P = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f10274R, f);
            this.f10272P = ofFloat;
            ofFloat.addUpdateListener(new C3664c(f));
            this.f10272P.setInterpolator(C9698a.m10187e(getContext(), C5419b.motionEasingStandard, C5616a.f15854b));
            this.f10272P.setDuration(C9698a.m10188d(getContext(), C5419b.motionDurationLong1, getResources().getInteger(C5424g.material_motion_duration_long_1)));
            this.f10272P.start();
            return;
        }
        m29442o(f, f);
    }

    /* renamed from: m */
    private void m29444m() {
        C0382g c0382g = this.f10268L;
        if (c0382g != null) {
            setChecked(c0382g.isChecked());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m29442o(float f, float f2) {
        View view = this.f10262F;
        if (view != null) {
            this.f10273Q.m29430d(f, f2, view);
        }
        this.f10274R = f;
    }

    /* renamed from: p */
    private static void m29441p(TextView textView, int i) {
        C1240i.m37872q(textView, i);
        int m9222h = C10086c.m9222h(textView.getContext(), i, 0);
        if (m9222h != 0) {
            textView.setTextSize(0, m9222h);
        }
    }

    /* renamed from: q */
    private static void m29440q(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* renamed from: r */
    private static void m29439r(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: s */
    private void m29438s(View view) {
        if (m29447j() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            C3471b.m30507a(this.f10280a0, view, m29448i(view));
        }
    }

    /* renamed from: t */
    private void m29437t(View view) {
        if (m29447j()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C3471b.m30504d(this.f10280a0, view);
            }
            this.f10280a0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m29436u(View view) {
        if (m29447j()) {
            C3471b.m30503e(this.f10280a0, view, m29448i(view));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m29435v(int i) {
        if (this.f10262F == null) {
            return;
        }
        int min = Math.min(this.f10276T, i - (this.f10279W * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f10262F.getLayoutParams();
        layoutParams.height = m29446k() ? min : this.f10277U;
        layoutParams.width = min;
        this.f10262F.setLayoutParams(layoutParams);
    }

    /* renamed from: w */
    private void m29434w() {
        if (m29446k()) {
            this.f10273Q = f10256d0;
        } else {
            this.f10273Q = f10255c0;
        }
    }

    /* renamed from: x */
    private static void m29433x(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0389k.InterfaceC0390a
    /* renamed from: d */
    public boolean mo29453d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0389k.InterfaceC0390a
    /* renamed from: e */
    public void mo29452e(C0382g c0382g, int i) {
        CharSequence title;
        this.f10268L = c0382g;
        setCheckable(c0382g.isCheckable());
        setChecked(c0382g.isChecked());
        setEnabled(c0382g.isEnabled());
        setIcon(c0382g.getIcon());
        setTitle(c0382g.getTitle());
        setId(c0382g.getItemId());
        if (!TextUtils.isEmpty(c0382g.getContentDescription())) {
            setContentDescription(c0382g.getContentDescription());
        }
        if (!TextUtils.isEmpty(c0382g.getTooltipText())) {
            title = c0382g.getTooltipText();
        } else {
            title = c0382g.getTitle();
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21 || i2 > 23) {
            C0526u0.m40411a(this, title);
        }
        setVisibility(c0382g.isVisible() ? 0 : 8);
        this.f10281w = true;
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f10262F;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public C3469a getBadge() {
        return this.f10280a0;
    }

    protected int getItemBackgroundResId() {
        return C5422e.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0389k.InterfaceC0390a
    public C0382g getItemData() {
        return this.f10268L;
    }

    protected int getItemDefaultMarginResId() {
        return C5421d.mtrl_navigation_bar_item_default_margin;
    }

    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f10267K;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f10264H.getLayoutParams();
        return getSuggestedIconHeight() + layoutParams.topMargin + this.f10264H.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f10264H.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.f10264H.getMeasuredWidth() + layoutParams.rightMargin);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m29449h() {
        m29443n();
        this.f10268L = null;
        this.f10274R = 0.0f;
        this.f10281w = false;
    }

    /* renamed from: n */
    void m29443n() {
        m29437t(this.f10263G);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0382g c0382g = this.f10268L;
        if (c0382g != null && c0382g.isCheckable() && this.f10268L.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f10254b0);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3469a c3469a = this.f10280a0;
        if (c3469a != null && c3469a.isVisible()) {
            CharSequence title = this.f10268L.getTitle();
            if (!TextUtils.isEmpty(this.f10268L.getContentDescription())) {
                title = this.f10268L.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f10280a0.m30527g()));
        }
        C1085c m38578L0 = C1085c.m38578L0(accessibilityNodeInfo);
        m38578L0.m38556d0(C1085c.C1088c.m38506a(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            m38578L0.m38560b0(false);
            m38578L0.m38571S(C1085c.C1086a.f3425e);
        }
        m38578L0.m38512z0(getResources().getString(C5427j.item_view_role_description));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new RunnableC3663b(i));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f10262F;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.f10275S = z;
        View view = this.f10262F;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.f10277U = i;
        m29435v(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.f10279W = i;
        m29435v(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.f10278V = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.f10276T = i;
        m29435v(getWidth());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBadge(C3469a c3469a) {
        if (this.f10280a0 == c3469a) {
            return;
        }
        if (m29447j() && this.f10263G != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            m29437t(this.f10263G);
        }
        this.f10280a0 = c3469a;
        ImageView imageView = this.f10263G;
        if (imageView != null) {
            m29438s(imageView);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.f10266J;
        textView.setPivotX(textView.getWidth() / 2);
        TextView textView2 = this.f10266J;
        textView2.setPivotY(textView2.getBaseline());
        TextView textView3 = this.f10265I;
        textView3.setPivotX(textView3.getWidth() / 2);
        TextView textView4 = this.f10265I;
        textView4.setPivotY(textView4.getBaseline());
        m29445l(z ? 1.0f : 0.0f);
        int i = this.f10259C;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    m29439r(getIconOrContainer(), this.f10282x, 49);
                    m29433x(this.f10264H, this.f10283y);
                    this.f10266J.setVisibility(0);
                } else {
                    m29439r(getIconOrContainer(), this.f10282x, 17);
                    m29433x(this.f10264H, 0);
                    this.f10266J.setVisibility(4);
                }
                this.f10265I.setVisibility(4);
            } else if (i == 1) {
                m29433x(this.f10264H, this.f10283y);
                if (z) {
                    m29439r(getIconOrContainer(), (int) (this.f10282x + this.f10284z), 49);
                    m29440q(this.f10266J, 1.0f, 1.0f, 0);
                    TextView textView5 = this.f10265I;
                    float f = this.f10257A;
                    m29440q(textView5, f, f, 4);
                } else {
                    m29439r(getIconOrContainer(), this.f10282x, 49);
                    TextView textView6 = this.f10266J;
                    float f2 = this.f10258B;
                    m29440q(textView6, f2, f2, 4);
                    m29440q(this.f10265I, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                m29439r(getIconOrContainer(), this.f10282x, 17);
                this.f10266J.setVisibility(8);
                this.f10265I.setVisibility(8);
            }
        } else if (this.f10260D) {
            if (z) {
                m29439r(getIconOrContainer(), this.f10282x, 49);
                m29433x(this.f10264H, this.f10283y);
                this.f10266J.setVisibility(0);
            } else {
                m29439r(getIconOrContainer(), this.f10282x, 17);
                m29433x(this.f10264H, 0);
                this.f10266J.setVisibility(4);
            }
            this.f10265I.setVisibility(4);
        } else {
            m29433x(this.f10264H, this.f10283y);
            if (z) {
                m29439r(getIconOrContainer(), (int) (this.f10282x + this.f10284z), 49);
                m29440q(this.f10266J, 1.0f, 1.0f, 0);
                TextView textView7 = this.f10265I;
                float f3 = this.f10257A;
                m29440q(textView7, f3, f3, 4);
            } else {
                m29439r(getIconOrContainer(), this.f10282x, 49);
                TextView textView8 = this.f10266J;
                float f4 = this.f10258B;
                m29440q(textView8, f4, f4, 4);
                m29440q(this.f10265I, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f10265I.setEnabled(z);
        this.f10266J.setEnabled(z);
        this.f10263G.setEnabled(z);
        if (z) {
            C1112b0.m38471G0(this, C1215y.m38013b(getContext(), 1002));
        } else {
            C1112b0.m38471G0(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f10270N) {
            return;
        }
        this.f10270N = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = C0981a.m38859r(drawable).mutate();
            this.f10271O = drawable;
            ColorStateList colorStateList = this.f10269M;
            if (colorStateList != null) {
                C0981a.m38862o(drawable, colorStateList);
            }
        }
        this.f10263G.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f10263G.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f10263G.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f10269M = colorStateList;
        if (this.f10268L == null || (drawable = this.f10271O) == null) {
            return;
        }
        C0981a.m38862o(drawable, colorStateList);
        this.f10271O.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : C0928a.m39111f(getContext(), i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.f10283y != i) {
            this.f10283y = i;
            m29444m();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f10282x != i) {
            this.f10282x = i;
            m29444m();
        }
    }

    public void setItemPosition(int i) {
        this.f10267K = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f10259C != i) {
            this.f10259C = i;
            m29434w();
            m29435v(getWidth());
            m29444m();
        }
    }

    public void setShifting(boolean z) {
        if (this.f10260D != z) {
            this.f10260D = z;
            m29444m();
        }
    }

    public void setTextAppearanceActive(int i) {
        m29441p(this.f10266J, i);
        m29450g(this.f10265I.getTextSize(), this.f10266J.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        m29441p(this.f10265I, i);
        m29450g(this.f10265I.getTextSize(), this.f10266J.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f10265I.setTextColor(colorStateList);
            this.f10266J.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f10265I.setText(charSequence);
        this.f10266J.setText(charSequence);
        C0382g c0382g = this.f10268L;
        if (c0382g == null || TextUtils.isEmpty(c0382g.getContentDescription())) {
            setContentDescription(charSequence);
        }
        C0382g c0382g2 = this.f10268L;
        if (c0382g2 != null && !TextUtils.isEmpty(c0382g2.getTooltipText())) {
            charSequence = this.f10268L.getTooltipText();
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 21 || i > 23) {
            C0526u0.m40411a(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        C1112b0.m38399v0(this, drawable);
    }
}
