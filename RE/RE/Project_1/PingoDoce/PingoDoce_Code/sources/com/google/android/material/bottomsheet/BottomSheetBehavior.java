package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1112b0;
import androidx.core.view.accessibility.C1085c;
import androidx.core.view.accessibility.InterfaceC1097f;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C3649p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTimeConstants;
import p100f8.C5419b;
import p100f8.C5421d;
import p100f8.C5427j;
import p100f8.C5428k;
import p100f8.C5429l;
import p170j2.C6298a;
import p231m2.C7108c;
import p354s8.C10086c;
import p401v8.C11141g;
import p401v8.C11148k;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0873c<V> {

    /* renamed from: c0 */
    private static final int f9517c0 = C5428k.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    private ValueAnimator f9518A;

    /* renamed from: B */
    int f9519B;

    /* renamed from: C */
    int f9520C;

    /* renamed from: D */
    int f9521D;

    /* renamed from: E */
    float f9522E;

    /* renamed from: F */
    int f9523F;

    /* renamed from: G */
    float f9524G;

    /* renamed from: H */
    boolean f9525H;

    /* renamed from: I */
    private boolean f9526I;

    /* renamed from: J */
    private boolean f9527J;

    /* renamed from: K */
    int f9528K;

    /* renamed from: L */
    C7108c f9529L;

    /* renamed from: M */
    private boolean f9530M;

    /* renamed from: N */
    private int f9531N;

    /* renamed from: O */
    private boolean f9532O;

    /* renamed from: P */
    private int f9533P;

    /* renamed from: Q */
    int f9534Q;

    /* renamed from: R */
    int f9535R;

    /* renamed from: S */
    WeakReference<V> f9536S;

    /* renamed from: T */
    WeakReference<View> f9537T;

    /* renamed from: U */
    private final ArrayList<AbstractC3499f> f9538U;

    /* renamed from: V */
    private VelocityTracker f9539V;

    /* renamed from: W */
    int f9540W;

    /* renamed from: X */
    private int f9541X;

    /* renamed from: Y */
    boolean f9542Y;

    /* renamed from: Z */
    private Map<View, Integer> f9543Z;

    /* renamed from: a */
    private int f9544a;

    /* renamed from: a0 */
    private int f9545a0;

    /* renamed from: b */
    private boolean f9546b;

    /* renamed from: b0 */
    private final C7108c.AbstractC7111c f9547b0;

    /* renamed from: c */
    private boolean f9548c;

    /* renamed from: d */
    private float f9549d;

    /* renamed from: e */
    private int f9550e;

    /* renamed from: f */
    private boolean f9551f;

    /* renamed from: g */
    private int f9552g;

    /* renamed from: h */
    private int f9553h;

    /* renamed from: i */
    private C11141g f9554i;

    /* renamed from: j */
    private ColorStateList f9555j;

    /* renamed from: k */
    private int f9556k;

    /* renamed from: l */
    private int f9557l;

    /* renamed from: m */
    private int f9558m;

    /* renamed from: n */
    private boolean f9559n;

    /* renamed from: o */
    private boolean f9560o;

    /* renamed from: p */
    private boolean f9561p;

    /* renamed from: q */
    private boolean f9562q;

    /* renamed from: r */
    private boolean f9563r;

    /* renamed from: s */
    private boolean f9564s;

    /* renamed from: t */
    private boolean f9565t;

    /* renamed from: u */
    private boolean f9566u;

    /* renamed from: v */
    private int f9567v;

    /* renamed from: w */
    private int f9568w;

    /* renamed from: x */
    private C11148k f9569x;

    /* renamed from: y */
    private boolean f9570y;

    /* renamed from: z */
    private final BottomSheetBehavior<V>.C3500g f9571z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    /* loaded from: classes.dex */
    public class RunnableC3494a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ View f9577w;

        /* renamed from: x */
        final /* synthetic */ int f9578x;

        RunnableC3494a(View view, int i) {
            this.f9577w = view;
            this.f9578x = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.m30386Q0(this.f9577w, this.f9578x, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    /* loaded from: classes.dex */
    public class C3495b implements ValueAnimator.AnimatorUpdateListener {
        C3495b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f9554i != null) {
                BottomSheetBehavior.this.f9554i.m6003a0(floatValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    /* loaded from: classes.dex */
    public class C3496c implements C3649p.InterfaceC3653d {

        /* renamed from: a */
        final /* synthetic */ boolean f9581a;

        C3496c(boolean z) {
            this.f9581a = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
        @Override // com.google.android.material.internal.C3649p.InterfaceC3653d
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.core.view.C1183m0 mo29484a(android.view.View r11, androidx.core.view.C1183m0 r12, com.google.android.material.internal.C3649p.C3654e r13) {
            /*
                r10 = this;
                int r0 = androidx.core.view.C1183m0.C1196m.m38053c()
                androidx.core.graphics.b r0 = r12.m38108f(r0)
                int r1 = androidx.core.view.C1183m0.C1196m.m38054b()
                androidx.core.graphics.b r1 = r12.m38108f(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.f3252b
                com.google.android.material.bottomsheet.BottomSheetBehavior.m30393N(r2, r3)
                boolean r2 = com.google.android.material.internal.C3649p.m29488e(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.m30391O(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.m38106h()
                com.google.android.material.bottomsheet.BottomSheetBehavior.m30387Q(r3, r6)
                int r3 = r13.f10237d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.m30389P(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.m30385R(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.f10236c
                goto L50
            L4e:
                int r4 = r13.f10234a
            L50:
                int r6 = r0.f3251a
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.m30383S(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.f10234a
                goto L62
            L60:
                int r13 = r13.f10236c
            L62:
                int r2 = r0.f3253c
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.m30381T(r2)
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.f3251a
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = r7
                goto L81
            L80:
                r2 = r6
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.m30379U(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.f3253c
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                r2 = r7
            L92:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.m30409F(r8)
                if (r8 == 0) goto La3
                int r8 = r13.topMargin
                int r0 = r0.f3252b
                if (r8 == r0) goto La3
                r13.topMargin = r0
                goto La4
            La3:
                r7 = r2
            La4:
                if (r7 == 0) goto La9
                r11.setLayoutParams(r13)
            La9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.f9581a
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.f3254d
                com.google.android.material.bottomsheet.BottomSheetBehavior.m30407G(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.m30391O(r11)
                if (r11 != 0) goto Lc7
                boolean r11 = r10.f9581a
                if (r11 == 0) goto Lcc
            Lc7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.m30405H(r11, r6)
            Lcc:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C3496c.mo29484a(android.view.View, androidx.core.view.m0, com.google.android.material.internal.p$e):androidx.core.view.m0");
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    /* loaded from: classes.dex */
    class C3497d extends C7108c.AbstractC7111c {

        /* renamed from: a */
        private long f9583a;

        C3497d() {
        }

        /* renamed from: n */
        private boolean m30336n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f9535R + bottomSheetBehavior.m30365h0()) / 2;
        }

        @Override // p231m2.C7108c.AbstractC7111c
        /* renamed from: a */
        public int mo19207a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // p231m2.C7108c.AbstractC7111c
        /* renamed from: b */
        public int mo19206b(View view, int i, int i2) {
            int m30365h0 = BottomSheetBehavior.this.m30365h0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C6298a.m21277b(i, m30365h0, bottomSheetBehavior.f9525H ? bottomSheetBehavior.f9535R : bottomSheetBehavior.f9523F);
        }

        @Override // p231m2.C7108c.AbstractC7111c
        /* renamed from: e */
        public int mo19203e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f9525H) {
                return bottomSheetBehavior.f9535R;
            }
            return bottomSheetBehavior.f9523F;
        }

        @Override // p231m2.C7108c.AbstractC7111c
        /* renamed from: j */
        public void mo19198j(int i) {
            if (i == 1 && BottomSheetBehavior.this.f9527J) {
                BottomSheetBehavior.this.m30400J0(1);
            }
        }

        @Override // p231m2.C7108c.AbstractC7111c
        /* renamed from: k */
        public void mo19197k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.m30369d0(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (r7.f9584b.m27995L0(r0, (r9 * 100.0f) / r10.f9535R) != false) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
            if (r9 > r7.f9584b.f9521D) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
            if (java.lang.Math.abs(r8.getTop() - r7.f9584b.m27964h0()) < java.lang.Math.abs(r8.getTop() - r7.f9584b.f9521D)) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
            if (r7.f9584b.m27989O0() == false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00eb, code lost:
            if (java.lang.Math.abs(r9 - r7.f9584b.f9520C) < java.lang.Math.abs(r9 - r7.f9584b.f9523F)) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0107, code lost:
            if (r7.f9584b.m27989O0() != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0121, code lost:
            if (r7.f9584b.m27989O0() == false) goto L6;
         */
        @Override // p231m2.C7108c.AbstractC7111c
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo19196l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C3497d.mo19196l(android.view.View, float, float):void");
        }

        @Override // p231m2.C7108c.AbstractC7111c
        /* renamed from: m */
        public boolean mo19195m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f9528K;
            if (i2 == 1 || bottomSheetBehavior.f9542Y) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f9540W == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f9537T;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f9583a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f9536S;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    /* loaded from: classes.dex */
    public class C3498e implements InterfaceC1097f {

        /* renamed from: a */
        final /* synthetic */ int f9585a;

        C3498e(int i) {
            this.f9585a = i;
        }

        @Override // androidx.core.view.accessibility.InterfaceC1097f
        /* renamed from: a */
        public boolean mo30335a(View view, InterfaceC1097f.AbstractC1098a abstractC1098a) {
            BottomSheetBehavior.this.m30402I0(this.f9585a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3499f {
        /* renamed from: a */
        void mo30319a(View view) {
        }

        /* renamed from: b */
        public abstract void mo30311b(View view, float f);

        /* renamed from: c */
        public abstract void mo30310c(View view, int i);
    }

    public BottomSheetBehavior() {
        this.f9544a = 0;
        this.f9546b = true;
        this.f9548c = false;
        this.f9556k = -1;
        this.f9557l = -1;
        this.f9571z = new C3500g(this, null);
        this.f9522E = 0.5f;
        this.f9524G = -1.0f;
        this.f9527J = true;
        this.f9528K = 4;
        this.f9538U = new ArrayList<>();
        this.f9545a0 = -1;
        this.f9547b0 = new C3497d();
    }

    /* renamed from: K0 */
    private void m30398K0(View view) {
        boolean z = (Build.VERSION.SDK_INT < 29 || m30357n0() || this.f9551f) ? false : true;
        if (this.f9560o || this.f9561p || this.f9562q || this.f9564s || this.f9565t || this.f9566u || z) {
            C3649p.m29492a(view, new C3496c(z));
        }
    }

    /* renamed from: M0 */
    private boolean m30394M0() {
        return this.f9529L != null && (this.f9527J || this.f9528K == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q0 */
    public void m30386Q0(View view, int i, boolean z) {
        int m30360l0 = m30360l0(i);
        C7108c c7108c = this.f9529L;
        if (c7108c != null && (!z ? !c7108c.m19235H(view, view.getLeft(), m30360l0) : !c7108c.m19237F(view.getLeft(), m30360l0))) {
            m30400J0(2);
            m30382S0(i);
            this.f9571z.m30332c(i);
            return;
        }
        m30400J0(i);
    }

    /* renamed from: R0 */
    private void m30384R0() {
        V v;
        WeakReference<V> weakReference = this.f9536S;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        C1112b0.m38417m0(v, 524288);
        C1112b0.m38417m0(v, 262144);
        C1112b0.m38417m0(v, 1048576);
        int i = this.f9545a0;
        if (i != -1) {
            C1112b0.m38417m0(v, i);
        }
        if (!this.f9546b && this.f9528K != 6) {
            this.f9545a0 = m30377V(v, C5427j.bottomsheet_action_expand_halfway, 6);
        }
        if (this.f9525H && this.f9528K != 5) {
            m30350s0(v, C1085c.C1086a.f3432l, 5);
        }
        int i2 = this.f9528K;
        if (i2 == 3) {
            m30350s0(v, C1085c.C1086a.f3431k, this.f9546b ? 4 : 6);
        } else if (i2 == 4) {
            m30350s0(v, C1085c.C1086a.f3430j, this.f9546b ? 3 : 6);
        } else if (i2 != 6) {
        } else {
            m30350s0(v, C1085c.C1086a.f3431k, 4);
            m30350s0(v, C1085c.C1086a.f3430j, 3);
        }
    }

    /* renamed from: S0 */
    private void m30382S0(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.f9570y != z) {
            this.f9570y = z;
            if (this.f9554i == null || (valueAnimator = this.f9518A) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f9518A.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            this.f9518A.setFloatValues(1.0f - f, f);
            this.f9518A.start();
        }
    }

    /* renamed from: T0 */
    private void m30380T0(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f9536S;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                if (this.f9543Z != null) {
                    return;
                }
                this.f9543Z = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f9536S.get()) {
                    if (z) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f9543Z.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        if (this.f9548c) {
                            C1112b0.m38479C0(childAt, 4);
                        }
                    } else if (this.f9548c && (map = this.f9543Z) != null && map.containsKey(childAt)) {
                        C1112b0.m38479C0(childAt, this.f9543Z.get(childAt).intValue());
                    }
                }
            }
            if (!z) {
                this.f9543Z = null;
            } else if (this.f9548c) {
                this.f9536S.get().sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public void m30378U0(boolean z) {
        V v;
        if (this.f9536S != null) {
            m30375X();
            if (this.f9528K != 4 || (v = this.f9536S.get()) == null) {
                return;
            }
            if (z) {
                m30402I0(4);
            } else {
                v.requestLayout();
            }
        }
    }

    /* renamed from: V */
    private int m30377V(V v, int i, int i2) {
        return C1112b0.m38438c(v, v.getResources().getString(i), m30372a0(i2));
    }

    /* renamed from: X */
    private void m30375X() {
        int m30373Z = m30373Z();
        if (this.f9546b) {
            this.f9523F = Math.max(this.f9535R - m30373Z, this.f9520C);
        } else {
            this.f9523F = this.f9535R - m30373Z;
        }
    }

    /* renamed from: Y */
    private void m30374Y() {
        this.f9521D = (int) (this.f9535R * (1.0f - this.f9522E));
    }

    /* renamed from: Z */
    private int m30373Z() {
        int i;
        if (this.f9551f) {
            return Math.min(Math.max(this.f9552g, this.f9535R - ((this.f9534Q * 9) / 16)), this.f9533P) + this.f9567v;
        }
        if (!this.f9559n && !this.f9560o && (i = this.f9558m) > 0) {
            return Math.max(this.f9550e, i + this.f9553h);
        }
        return this.f9550e + this.f9567v;
    }

    /* renamed from: a0 */
    private InterfaceC1097f m30372a0(int i) {
        return new C3498e(i);
    }

    /* renamed from: b0 */
    private void m30371b0(Context context) {
        if (this.f9569x == null) {
            return;
        }
        C11141g c11141g = new C11141g(this.f9569x);
        this.f9554i = c11141g;
        c11141g.m6015O(context);
        ColorStateList colorStateList = this.f9555j;
        if (colorStateList != null) {
            this.f9554i.m6004Z(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        this.f9554i.setTint(typedValue.data);
    }

    /* renamed from: c0 */
    private void m30370c0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f9518A = ofFloat;
        ofFloat.setDuration(500L);
        this.f9518A.addUpdateListener(new C3495b());
    }

    /* renamed from: f0 */
    public static <V extends View> BottomSheetBehavior<V> m30367f0(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C0876f) {
            CoordinatorLayout.AbstractC0873c m39298f = ((CoordinatorLayout.C0876f) layoutParams).m39298f();
            if (m39298f instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) m39298f;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: g0 */
    private int m30366g0(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i3 = Math.min(size, i3);
            }
            return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
    }

    /* renamed from: l0 */
    private int m30360l0(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return this.f9521D;
                    }
                    throw new IllegalArgumentException("Invalid state to get top offset: " + i);
                }
                return this.f9535R;
            }
            return this.f9523F;
        }
        return m30365h0();
    }

    /* renamed from: m0 */
    private float m30358m0() {
        VelocityTracker velocityTracker = this.f9539V;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(DateTimeConstants.MILLIS_PER_SECOND, this.f9549d);
        return this.f9539V.getYVelocity(this.f9540W);
    }

    /* renamed from: p0 */
    private boolean m30354p0(V v) {
        ViewParent parent = v.getParent();
        return parent != null && parent.isLayoutRequested() && C1112b0.m38447V(v);
    }

    /* renamed from: s0 */
    private void m30350s0(V v, C1085c.C1086a c1086a, int i) {
        C1112b0.m38413o0(v, c1086a, null, m30372a0(i));
    }

    /* renamed from: t0 */
    private void m30348t0() {
        this.f9540W = -1;
        VelocityTracker velocityTracker = this.f9539V;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f9539V = null;
        }
    }

    /* renamed from: u0 */
    private void m30347u0(SavedState savedState) {
        int i = this.f9544a;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.f9550e = savedState.f9576z;
        }
        if (i == -1 || (i & 2) == 2) {
            this.f9546b = savedState.f9572A;
        }
        if (i == -1 || (i & 4) == 4) {
            this.f9525H = savedState.f9573B;
        }
        if (i == -1 || (i & 8) == 8) {
            this.f9526I = savedState.f9574C;
        }
    }

    /* renamed from: v0 */
    private void m30346v0(V v, Runnable runnable) {
        if (m30354p0(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: A */
    public boolean mo30690n0(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f9531N = 0;
        this.f9532O = false;
        return (i & 2) != 0;
    }

    /* renamed from: A0 */
    public void m30416A0(float f) {
        if (f > 0.0f && f < 1.0f) {
            this.f9522E = f;
            if (this.f9536S != null) {
                m30374Y();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    /* renamed from: B0 */
    public void m30415B0(boolean z) {
        if (this.f9525H != z) {
            this.f9525H = z;
            if (!z && this.f9528K == 5) {
                m30402I0(4);
            }
            m30384R0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
        if (r4.getTop() <= r2.f9521D) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
        if (java.lang.Math.abs(r3 - r2.f9520C) < java.lang.Math.abs(r3 - r2.f9523F)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
        if (m27989O0() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f9523F)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
        if (java.lang.Math.abs(r3 - r2.f9521D) < java.lang.Math.abs(r3 - r2.f9523F)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
        r0 = 6;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo30689o0(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.m30365h0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.m30400J0(r0)
            return
        Lf:
            boolean r3 = r2.m30352q0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference<android.view.View> r3 = r2.f9537T
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.f9532O
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.f9531N
            r5 = 6
            r6 = 4
            if (r3 <= 0) goto L3a
            boolean r3 = r2.f9546b
            if (r3 == 0) goto L30
            goto Laa
        L30:
            int r3 = r4.getTop()
            int r6 = r2.f9521D
            if (r3 <= r6) goto Laa
            goto La9
        L3a:
            boolean r3 = r2.f9525H
            if (r3 == 0) goto L4a
            float r3 = r2.m30358m0()
            boolean r3 = r2.m30392N0(r4, r3)
            if (r3 == 0) goto L4a
            r0 = 5
            goto Laa
        L4a:
            int r3 = r2.f9531N
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f9546b
            if (r1 == 0) goto L68
            int r5 = r2.f9520C
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f9523F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.f9521D
            if (r3 >= r1) goto L7e
            int r1 = r2.f9523F
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.m30390O0()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f9523F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f9546b
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.f9521D
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f9523F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.m30386Q0(r4, r0, r3)
            r2.f9532O = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo30689o0(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    /* renamed from: C0 */
    public void m30413C0(int i) {
        this.f9557l = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: D */
    public boolean mo28779D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (v.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.f9528K == 1 && actionMasked == 0) {
                return true;
            }
            if (m30394M0()) {
                this.f9529L.m19208z(motionEvent);
            }
            if (actionMasked == 0) {
                m30348t0();
            }
            if (this.f9539V == null) {
                this.f9539V = VelocityTracker.obtain();
            }
            this.f9539V.addMovement(motionEvent);
            if (m30394M0() && actionMasked == 2 && !this.f9530M && Math.abs(this.f9541X - motionEvent.getY()) > this.f9529L.m19213u()) {
                this.f9529L.m19232b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            return !this.f9530M;
        }
        return false;
    }

    /* renamed from: D0 */
    public void m30412D0(int i) {
        this.f9556k = i;
    }

    /* renamed from: E0 */
    public void m30410E0(int i) {
        m30408F0(i, false);
    }

    /* renamed from: F0 */
    public final void m30408F0(int i, boolean z) {
        boolean z2 = true;
        if (i == -1) {
            if (!this.f9551f) {
                this.f9551f = true;
            }
            z2 = false;
        } else {
            if (this.f9551f || this.f9550e != i) {
                this.f9551f = false;
                this.f9550e = Math.max(0, i);
            }
            z2 = false;
        }
        if (z2) {
            m30378U0(z);
        }
    }

    /* renamed from: G0 */
    public void m30406G0(int i) {
        this.f9544a = i;
    }

    /* renamed from: H0 */
    public void m30404H0(boolean z) {
        this.f9526I = z;
    }

    /* renamed from: I0 */
    public void m30402I0(int i) {
        if (i != 1 && i != 2) {
            if (!this.f9525H && i == 5) {
                Log.w("BottomSheetBehavior", "Cannot set state: " + i);
                return;
            }
            int i2 = (i == 6 && this.f9546b && m30360l0(i) <= this.f9520C) ? 3 : i;
            WeakReference<V> weakReference = this.f9536S;
            if (weakReference != null && weakReference.get() != null) {
                V v = this.f9536S.get();
                m30346v0(v, new RunnableC3494a(v, i2));
                return;
            }
            m30400J0(i);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("STATE_");
        sb2.append(i == 1 ? "DRAGGING" : "SETTLING");
        sb2.append(" should not be set externally.");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: J0 */
    void m30400J0(int i) {
        V v;
        if (this.f9528K == i) {
            return;
        }
        this.f9528K = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.f9525H;
        }
        WeakReference<V> weakReference = this.f9536S;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m30380T0(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m30380T0(false);
        }
        m30382S0(i);
        for (int i2 = 0; i2 < this.f9538U.size(); i2++) {
            this.f9538U.get(i2).mo30310c(v, i);
        }
        m30384R0();
    }

    /* renamed from: L0 */
    public boolean m30396L0(long j, float f) {
        return false;
    }

    /* renamed from: N0 */
    boolean m30392N0(View view, float f) {
        if (this.f9526I) {
            return true;
        }
        if (view.getTop() < this.f9523F) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f9523F)) / ((float) m30373Z()) > 0.5f;
    }

    /* renamed from: O0 */
    public boolean m30390O0() {
        return false;
    }

    /* renamed from: P0 */
    public boolean m30388P0() {
        return true;
    }

    /* renamed from: W */
    public void m30376W(AbstractC3499f abstractC3499f) {
        if (this.f9538U.contains(abstractC3499f)) {
            return;
        }
        this.f9538U.add(abstractC3499f);
    }

    /* renamed from: d0 */
    void m30369d0(int i) {
        float f;
        float f2;
        V v = this.f9536S.get();
        if (v == null || this.f9538U.isEmpty()) {
            return;
        }
        int i2 = this.f9523F;
        if (i <= i2 && i2 != m30365h0()) {
            int i3 = this.f9523F;
            f = i3 - i;
            f2 = i3 - m30365h0();
        } else {
            int i4 = this.f9523F;
            f = i4 - i;
            f2 = this.f9535R - i4;
        }
        float f3 = f / f2;
        for (int i5 = 0; i5 < this.f9538U.size(); i5++) {
            this.f9538U.get(i5).mo30311b(v, f3);
        }
    }

    /* renamed from: e0 */
    View m30368e0(View view) {
        if (C1112b0.m38445X(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View m30368e0 = m30368e0(viewGroup.getChildAt(i));
                if (m30368e0 != null) {
                    return m30368e0;
                }
            }
            return null;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: g */
    public void mo28780g(CoordinatorLayout.C0876f c0876f) {
        super.mo28780g(c0876f);
        this.f9536S = null;
        this.f9529L = null;
    }

    /* renamed from: h0 */
    public int m30365h0() {
        if (this.f9546b) {
            return this.f9520C;
        }
        return Math.max(this.f9519B, this.f9563r ? 0 : this.f9568w);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public C11141g m30364i0() {
        return this.f9554i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: j */
    public void mo30363j() {
        super.mo30363j();
        this.f9536S = null;
        this.f9529L = null;
    }

    /* renamed from: j0 */
    public int m30362j0() {
        if (this.f9551f) {
            return -1;
        }
        return this.f9550e;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: k */
    public boolean mo29260k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C7108c c7108c;
        if (v.isShown() && this.f9527J) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m30348t0();
            }
            if (this.f9539V == null) {
                this.f9539V = VelocityTracker.obtain();
            }
            this.f9539V.addMovement(motionEvent);
            if (actionMasked == 0) {
                int x = (int) motionEvent.getX();
                this.f9541X = (int) motionEvent.getY();
                if (this.f9528K != 2) {
                    WeakReference<View> weakReference = this.f9537T;
                    View view = weakReference != null ? weakReference.get() : null;
                    if (view != null && coordinatorLayout.m39361B(view, x, this.f9541X)) {
                        this.f9540W = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f9542Y = true;
                    }
                }
                this.f9530M = this.f9540W == -1 && !coordinatorLayout.m39361B(v, x, this.f9541X);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.f9542Y = false;
                this.f9540W = -1;
                if (this.f9530M) {
                    this.f9530M = false;
                    return false;
                }
            }
            if (this.f9530M || (c7108c = this.f9529L) == null || !c7108c.m19236G(motionEvent)) {
                WeakReference<View> weakReference2 = this.f9537T;
                View view2 = weakReference2 != null ? weakReference2.get() : null;
                return (actionMasked != 2 || view2 == null || this.f9530M || this.f9528K == 1 || coordinatorLayout.m39361B(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f9529L == null || Math.abs(((float) this.f9541X) - motionEvent.getY()) <= ((float) this.f9529L.m19213u())) ? false : true;
            }
            return true;
        }
        this.f9530M = true;
        return false;
    }

    /* renamed from: k0 */
    public int m30361k0() {
        return this.f9528K;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: l */
    public boolean mo30696h0(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (C1112b0.m38482B(coordinatorLayout) && !C1112b0.m38482B(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f9536S == null) {
            this.f9552g = coordinatorLayout.getResources().getDimensionPixelSize(C5421d.design_bottom_sheet_peek_height_min);
            m30398K0(v);
            this.f9536S = new WeakReference<>(v);
            C11141g c11141g = this.f9554i;
            if (c11141g != null) {
                C1112b0.m38399v0(v, c11141g);
                C11141g c11141g2 = this.f9554i;
                float f = this.f9524G;
                if (f == -1.0f) {
                    f = C1112b0.m38394y(v);
                }
                c11141g2.m6005Y(f);
                boolean z = this.f9528K == 3;
                this.f9570y = z;
                this.f9554i.m6003a0(z ? 0.0f : 1.0f);
            } else {
                ColorStateList colorStateList = this.f9555j;
                if (colorStateList != null) {
                    C1112b0.m38397w0(v, colorStateList);
                }
            }
            m30384R0();
            if (C1112b0.m38480C(v) == 0) {
                C1112b0.m38479C0(v, 1);
            }
        }
        if (this.f9529L == null) {
            this.f9529L = C7108c.m19221m(coordinatorLayout, this.f9547b0);
        }
        int top = v.getTop();
        coordinatorLayout.m39354I(v, i);
        this.f9534Q = coordinatorLayout.getWidth();
        this.f9535R = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f9533P = height;
        int i2 = this.f9535R;
        int i3 = i2 - height;
        int i4 = this.f9568w;
        if (i3 < i4) {
            if (this.f9563r) {
                this.f9533P = i2;
            } else {
                this.f9533P = i2 - i4;
            }
        }
        this.f9520C = Math.max(0, i2 - this.f9533P);
        m30374Y();
        m30375X();
        int i5 = this.f9528K;
        if (i5 == 3) {
            C1112b0.m38435d0(v, m30365h0());
        } else if (i5 == 6) {
            C1112b0.m38435d0(v, this.f9521D);
        } else if (this.f9525H && i5 == 5) {
            C1112b0.m38435d0(v, this.f9535R);
        } else if (i5 == 4) {
            C1112b0.m38435d0(v, this.f9523F);
        } else if (i5 == 1 || i5 == 2) {
            C1112b0.m38435d0(v, top - v.getTop());
        }
        this.f9537T = new WeakReference<>(m30368e0(v));
        for (int i6 = 0; i6 < this.f9538U.size(); i6++) {
            this.f9538U.get(i6).mo30319a(v);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: m */
    public boolean mo30695i0(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(m30366g0(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f9556k, marginLayoutParams.width), m30366g0(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.f9557l, marginLayoutParams.height));
        return true;
    }

    /* renamed from: n0 */
    public boolean m30357n0() {
        return this.f9559n;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: o */
    public boolean mo30356o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference;
        if (m30352q0() && (weakReference = this.f9537T) != null && view == weakReference.get()) {
            return this.f9528K != 3 || super.mo30356o(coordinatorLayout, v, view, f, f2);
        }
        return false;
    }

    /* renamed from: o0 */
    public boolean m30355o0() {
        return this.f9525H;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: q */
    public void mo30694j0(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f9537T;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!m30352q0() || view == view2) {
            int top = v.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < m30365h0()) {
                    iArr[1] = top - m30365h0();
                    C1112b0.m38435d0(v, -iArr[1]);
                    m30400J0(3);
                } else if (!this.f9527J) {
                    return;
                } else {
                    iArr[1] = i2;
                    C1112b0.m38435d0(v, -i2);
                    m30400J0(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i5 = this.f9523F;
                if (i4 > i5 && !this.f9525H) {
                    iArr[1] = top - i5;
                    C1112b0.m38435d0(v, -iArr[1]);
                    m30400J0(4);
                } else if (!this.f9527J) {
                    return;
                } else {
                    iArr[1] = i2;
                    C1112b0.m38435d0(v, -i2);
                    m30400J0(1);
                }
            }
            m30369d0(v.getTop());
            this.f9531N = i2;
            this.f9532O = true;
        }
    }

    /* renamed from: q0 */
    public boolean m30352q0() {
        return true;
    }

    /* renamed from: r0 */
    public void m30351r0(AbstractC3499f abstractC3499f) {
        this.f9538U.remove(abstractC3499f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: t */
    public void mo30693k0(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* renamed from: w0 */
    public void m30345w0(boolean z) {
        this.f9527J = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: x */
    public void mo30692l0(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo30692l0(coordinatorLayout, v, savedState.m37835a());
        m30347u0(savedState);
        int i = savedState.f9575y;
        if (i != 1 && i != 2) {
            this.f9528K = i;
        } else {
            this.f9528K = 4;
        }
    }

    /* renamed from: x0 */
    public void m30343x0(int i) {
        if (i >= 0) {
            this.f9519B = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: y */
    public Parcelable mo30691m0(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo30691m0(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    /* renamed from: y0 */
    public void m30341y0(boolean z) {
        if (this.f9546b == z) {
            return;
        }
        this.f9546b = z;
        if (this.f9536S != null) {
            m30375X();
        }
        m30400J0((this.f9546b && this.f9528K == 6) ? 3 : this.f9528K);
        m30384R0();
    }

    /* renamed from: z0 */
    public void m30340z0(boolean z) {
        this.f9559n = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    /* loaded from: classes.dex */
    public class C3500g {

        /* renamed from: a */
        private int f9587a;

        /* renamed from: b */
        private boolean f9588b;

        /* renamed from: c */
        private final Runnable f9589c;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g$a */
        /* loaded from: classes.dex */
        class RunnableC3501a implements Runnable {
            RunnableC3501a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C3500g.this.f9588b = false;
                C7108c c7108c = BottomSheetBehavior.this.f9529L;
                if (c7108c != null && c7108c.m19223k(true)) {
                    C3500g c3500g = C3500g.this;
                    c3500g.m30332c(c3500g.f9587a);
                    return;
                }
                C3500g c3500g2 = C3500g.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f9528K == 2) {
                    bottomSheetBehavior.m30400J0(c3500g2.f9587a);
                }
            }
        }

        private C3500g() {
            this.f9589c = new RunnableC3501a();
        }

        /* renamed from: c */
        void m30332c(int i) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.f9536S;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f9587a = i;
            if (this.f9588b) {
                return;
            }
            C1112b0.m38421k0(BottomSheetBehavior.this.f9536S.get(), this.f9589c);
            this.f9588b = true;
        }

        /* synthetic */ C3500g(BottomSheetBehavior bottomSheetBehavior, RunnableC3494a runnableC3494a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3493a();

        /* renamed from: A */
        boolean f9572A;

        /* renamed from: B */
        boolean f9573B;

        /* renamed from: C */
        boolean f9574C;

        /* renamed from: y */
        final int f9575y;

        /* renamed from: z */
        int f9576z;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        /* loaded from: classes.dex */
        class C3493a implements Parcelable.ClassLoaderCreator<SavedState> {
            C3493a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState mo30339a(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState mo30338b(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] mo30337c(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9575y = parcel.readInt();
            this.f9576z = parcel.readInt();
            this.f9572A = parcel.readInt() == 1;
            this.f9573B = parcel.readInt() == 1;
            this.f9574C = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f9575y);
            parcel.writeInt(this.f9576z);
            parcel.writeInt(this.f9572A ? 1 : 0);
            parcel.writeInt(this.f9573B ? 1 : 0);
            parcel.writeInt(this.f9574C ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f9575y = bottomSheetBehavior.f9528K;
            this.f9576z = ((BottomSheetBehavior) bottomSheetBehavior).f9550e;
            this.f9572A = ((BottomSheetBehavior) bottomSheetBehavior).f9546b;
            this.f9573B = bottomSheetBehavior.f9525H;
            this.f9574C = ((BottomSheetBehavior) bottomSheetBehavior).f9526I;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.f9544a = 0;
        this.f9546b = true;
        this.f9548c = false;
        this.f9556k = -1;
        this.f9557l = -1;
        this.f9571z = new C3500g(this, null);
        this.f9522E = 0.5f;
        this.f9524G = -1.0f;
        this.f9527J = true;
        this.f9528K = 4;
        this.f9538U = new ArrayList<>();
        this.f9545a0 = -1;
        this.f9547b0 = new C3497d();
        this.f9553h = context.getResources().getDimensionPixelSize(C5421d.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5429l.f14987M);
        int i2 = C5429l.f15019Q;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f9555j = C10086c.m9229a(context, obtainStyledAttributes, i2);
        }
        if (obtainStyledAttributes.hasValue(C5429l.f15163h0)) {
            this.f9569x = C11148k.m5953e(context, attributeSet, C5419b.bottomSheetStyle, f9517c0).m5914m();
        }
        m30371b0(context);
        m30370c0();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f9524G = obtainStyledAttributes.getDimension(C5429l.f15011P, -1.0f);
        }
        int i3 = C5429l.f14995N;
        if (obtainStyledAttributes.hasValue(i3)) {
            m30412D0(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        }
        int i4 = C5429l.f15003O;
        if (obtainStyledAttributes.hasValue(i4)) {
            m30413C0(obtainStyledAttributes.getDimensionPixelSize(i4, -1));
        }
        int i5 = C5429l.f15067W;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i5);
        if (peekValue != null && (i = peekValue.data) == -1) {
            m30410E0(i);
        } else {
            m30410E0(obtainStyledAttributes.getDimensionPixelSize(i5, -1));
        }
        m30415B0(obtainStyledAttributes.getBoolean(C5429l.f15059V, false));
        m30340z0(obtainStyledAttributes.getBoolean(C5429l.f15091Z, false));
        m30341y0(obtainStyledAttributes.getBoolean(C5429l.f15043T, true));
        m30404H0(obtainStyledAttributes.getBoolean(C5429l.f15083Y, false));
        m30345w0(obtainStyledAttributes.getBoolean(C5429l.f15027R, true));
        m30406G0(obtainStyledAttributes.getInt(C5429l.f15075X, 0));
        m30416A0(obtainStyledAttributes.getFloat(C5429l.f15051U, 0.5f));
        int i6 = C5429l.f15035S;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i6);
        if (peekValue2 != null && peekValue2.type == 16) {
            m30343x0(peekValue2.data);
        } else {
            m30343x0(obtainStyledAttributes.getDimensionPixelOffset(i6, 0));
        }
        this.f9560o = obtainStyledAttributes.getBoolean(C5429l.f15127d0, false);
        this.f9561p = obtainStyledAttributes.getBoolean(C5429l.f15136e0, false);
        this.f9562q = obtainStyledAttributes.getBoolean(C5429l.f15145f0, false);
        this.f9563r = obtainStyledAttributes.getBoolean(C5429l.f15154g0, true);
        this.f9564s = obtainStyledAttributes.getBoolean(C5429l.f15100a0, false);
        this.f9565t = obtainStyledAttributes.getBoolean(C5429l.f15109b0, false);
        this.f9566u = obtainStyledAttributes.getBoolean(C5429l.f15118c0, false);
        obtainStyledAttributes.recycle();
        this.f9549d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
