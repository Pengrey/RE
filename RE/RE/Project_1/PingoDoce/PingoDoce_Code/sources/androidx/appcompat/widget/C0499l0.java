package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0319a;
import androidx.appcompat.widget.LinearLayoutCompat;
import p070e.C4897a;
import p189k.C6540a;

/* renamed from: androidx.appcompat.widget.l0 */
/* loaded from: classes.dex */
public class C0499l0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: A */
    private boolean f1659A;

    /* renamed from: B */
    int f1660B;

    /* renamed from: C */
    int f1661C;

    /* renamed from: D */
    private int f1662D;

    /* renamed from: E */
    private int f1663E;

    /* renamed from: w */
    Runnable f1664w;

    /* renamed from: x */
    private View$OnClickListenerC0502c f1665x;

    /* renamed from: y */
    LinearLayoutCompat f1666y;

    /* renamed from: z */
    private Spinner f1667z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScrollingTabContainerView.java */
    /* renamed from: androidx.appcompat.widget.l0$a */
    /* loaded from: classes.dex */
    public class RunnableC0500a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ View f1668w;

        RunnableC0500a(View view) {
            this.f1668w = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0499l0.this.smoothScrollTo(this.f1668w.getLeft() - ((C0499l0.this.getWidth() - this.f1668w.getWidth()) / 2), 0);
            C0499l0.this.f1664w = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollingTabContainerView.java */
    /* renamed from: androidx.appcompat.widget.l0$b */
    /* loaded from: classes.dex */
    public class C0501b extends BaseAdapter {
        C0501b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return C0499l0.this.f1666y.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((C0503d) C0499l0.this.f1666y.getChildAt(i)).m40525b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0499l0.this.m40530c((AbstractC0319a.AbstractC0322c) getItem(i), true);
            }
            ((C0503d) view).m40526a((AbstractC0319a.AbstractC0322c) getItem(i));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollingTabContainerView.java */
    /* renamed from: androidx.appcompat.widget.l0$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0502c implements View.OnClickListener {
        View$OnClickListenerC0502c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((C0503d) view).m40525b().m41283e();
            int childCount = C0499l0.this.f1666y.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0499l0.this.f1666y.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollingTabContainerView.java */
    /* renamed from: androidx.appcompat.widget.l0$d */
    /* loaded from: classes.dex */
    public class C0503d extends LinearLayout {

        /* renamed from: A */
        private View f1672A;

        /* renamed from: w */
        private final int[] f1674w;

        /* renamed from: x */
        private AbstractC0319a.AbstractC0322c f1675x;

        /* renamed from: y */
        private TextView f1676y;

        /* renamed from: z */
        private ImageView f1677z;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C0503d(android.content.Context r6, androidx.appcompat.app.AbstractC0319a.AbstractC0322c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.C0499l0.this = r5
                int r5 = p070e.C4897a.actionBarTabStyle
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1674w = r1
                r4.f1675x = r7
                androidx.appcompat.widget.s0 r5 = androidx.appcompat.widget.C0520s0.m40453v(r6, r0, r1, r5, r3)
                boolean r6 = r5.m40456s(r3)
                if (r6 == 0) goto L26
                android.graphics.drawable.Drawable r6 = r5.m40468g(r3)
                r4.setBackgroundDrawable(r6)
            L26:
                r5.m40452w()
                if (r8 == 0) goto L31
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L31:
                r4.m40524c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0499l0.C0503d.<init>(androidx.appcompat.widget.l0, android.content.Context, androidx.appcompat.app.a$c, boolean):void");
        }

        /* renamed from: a */
        public void m40526a(AbstractC0319a.AbstractC0322c abstractC0322c) {
            this.f1675x = abstractC0322c;
            m40524c();
        }

        /* renamed from: b */
        public AbstractC0319a.AbstractC0322c m40525b() {
            return this.f1675x;
        }

        /* renamed from: c */
        public void m40524c() {
            AbstractC0319a.AbstractC0322c abstractC0322c = this.f1675x;
            View m41286b = abstractC0322c.m41286b();
            if (m41286b != null) {
                ViewParent parent = m41286b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(m41286b);
                    }
                    addView(m41286b);
                }
                this.f1672A = m41286b;
                TextView textView = this.f1676y;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1677z;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1677z.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1672A;
            if (view != null) {
                removeView(view);
                this.f1672A = null;
            }
            Drawable m41285c = abstractC0322c.m41285c();
            CharSequence m41284d = abstractC0322c.m41284d();
            if (m41285c != null) {
                if (this.f1677z == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1677z = appCompatImageView;
                }
                this.f1677z.setImageDrawable(m41285c);
                this.f1677z.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1677z;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1677z.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(m41284d);
            if (z) {
                if (this.f1676y == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, C4897a.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1676y = appCompatTextView;
                }
                this.f1676y.setText(m41284d);
                this.f1676y.setVisibility(0);
            } else {
                TextView textView2 = this.f1676y;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1676y.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1677z;
            if (imageView3 != null) {
                imageView3.setContentDescription(abstractC0322c.m41287a());
            }
            C0526u0.m40411a(this, z ? null : abstractC0322c.m41287a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0499l0.this.f1660B > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = C0499l0.this.f1660B;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    /* renamed from: b */
    private Spinner m40531b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, C4897a.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.C0425a(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* renamed from: d */
    private boolean m40529d() {
        Spinner spinner = this.f1667z;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: e */
    private void m40528e() {
        if (m40529d()) {
            return;
        }
        if (this.f1667z == null) {
            this.f1667z = m40531b();
        }
        removeView(this.f1666y);
        addView(this.f1667z, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1667z.getAdapter() == null) {
            this.f1667z.setAdapter((SpinnerAdapter) new C0501b());
        }
        Runnable runnable = this.f1664w;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1664w = null;
        }
        this.f1667z.setSelection(this.f1663E);
    }

    /* renamed from: f */
    private boolean m40527f() {
        if (m40529d()) {
            removeView(this.f1667z);
            addView(this.f1666y, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.f1667z.getSelectedItemPosition());
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public void m40532a(int i) {
        View childAt = this.f1666y.getChildAt(i);
        Runnable runnable = this.f1664w;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        RunnableC0500a runnableC0500a = new RunnableC0500a(childAt);
        this.f1664w = runnableC0500a;
        post(runnableC0500a);
    }

    /* renamed from: c */
    C0503d m40530c(AbstractC0319a.AbstractC0322c abstractC0322c, boolean z) {
        C0503d c0503d = new C0503d(getContext(), abstractC0322c, z);
        if (z) {
            c0503d.setBackgroundDrawable(null);
            c0503d.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1662D));
        } else {
            c0503d.setFocusable(true);
            if (this.f1665x == null) {
                this.f1665x = new View$OnClickListenerC0502c();
            }
            c0503d.setOnClickListener(this.f1665x);
        }
        return c0503d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1664w;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C6540a m20663b = C6540a.m20663b(getContext());
        setContentHeight(m20663b.m20659f());
        this.f1661C = m20663b.m20660e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1664w;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0503d) view).m40525b().m41283e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1666y.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.f1660B = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f1660B = View.MeasureSpec.getSize(i) / 2;
            }
            this.f1660B = Math.min(this.f1660B, this.f1661C);
        } else {
            this.f1660B = -1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1662D, 1073741824);
        if (z2 || !this.f1659A) {
            z = false;
        }
        if (z) {
            this.f1666y.measure(0, makeMeasureSpec);
            if (this.f1666y.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m40528e();
            } else {
                m40527f();
            }
        } else {
            m40527f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z2 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f1663E);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1659A = z;
    }

    public void setContentHeight(int i) {
        this.f1662D = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f1663E = i;
        int childCount = this.f1666y.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1666y.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m40532a(i);
            }
            i2++;
        }
        Spinner spinner = this.f1667z;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
