package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import p073e2.C4966e;
import p073e2.C4969f;
import p073e2.C4970g;
import p073e2.C4974j;
import p073e2.C4975k;
import p094f2.C5325b;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: A */
    private int f2497A;

    /* renamed from: B */
    private int f2498B;

    /* renamed from: C */
    private int f2499C;

    /* renamed from: D */
    protected boolean f2500D;

    /* renamed from: E */
    private int f2501E;

    /* renamed from: F */
    private C0857d f2502F;

    /* renamed from: G */
    protected C0854c f2503G;

    /* renamed from: H */
    private int f2504H;

    /* renamed from: I */
    private HashMap<String, Integer> f2505I;

    /* renamed from: J */
    private int f2506J;

    /* renamed from: K */
    private int f2507K;

    /* renamed from: L */
    private SparseArray<C4966e> f2508L;

    /* renamed from: M */
    C0849c f2509M;

    /* renamed from: N */
    private int f2510N;

    /* renamed from: O */
    private int f2511O;

    /* renamed from: w */
    SparseArray<View> f2512w;

    /* renamed from: x */
    private ArrayList<AbstractC0853b> f2513x;

    /* renamed from: y */
    protected C4969f f2514y;

    /* renamed from: z */
    private int f2515z;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0846a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2516a;

        static {
            int[] iArr = new int[C4966e.EnumC4968b.values().length];
            f2516a = iArr;
            try {
                iArr[C4966e.EnumC4968b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2516a[C4966e.EnumC4968b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2516a[C4966e.EnumC4968b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2516a[C4966e.EnumC4968b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$c */
    /* loaded from: classes.dex */
    public class C0849c implements C5325b.InterfaceC5327b {

        /* renamed from: a */
        ConstraintLayout f2583a;

        /* renamed from: b */
        int f2584b;

        /* renamed from: c */
        int f2585c;

        /* renamed from: d */
        int f2586d;

        /* renamed from: e */
        int f2587e;

        /* renamed from: f */
        int f2588f;

        /* renamed from: g */
        int f2589g;

        public C0849c(ConstraintLayout constraintLayout) {
            this.f2583a = constraintLayout;
        }

        /* renamed from: d */
        private boolean m39424d(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        @Override // p094f2.C5325b.InterfaceC5327b
        /* renamed from: a */
        public final void mo24619a() {
            int childCount = this.f2583a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f2583a.getChildAt(i);
                if (childAt instanceof C0866g) {
                    ((C0866g) childAt).m39366a(this.f2583a);
                }
            }
            int size = this.f2583a.f2513x.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((AbstractC0853b) this.f2583a.f2513x.get(i2)).m39410k(this.f2583a);
                }
            }
        }

        @Override // p094f2.C5325b.InterfaceC5327b
        @SuppressLint({"WrongCall"})
        /* renamed from: b */
        public final void mo24618b(C4966e c4966e, C5325b.C5326a c5326a) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int baseline;
            int max;
            int i;
            int i2;
            int i3;
            if (c4966e == null) {
                return;
            }
            if (c4966e.m26108Q() == 8 && !c4966e.m26090a0()) {
                c5326a.f14701e = 0;
                c5326a.f14702f = 0;
                c5326a.f14703g = 0;
            } else if (c4966e.m26124I() == null) {
            } else {
                C4966e.EnumC4968b enumC4968b = c5326a.f14697a;
                C4966e.EnumC4968b enumC4968b2 = c5326a.f14698b;
                int i4 = c5326a.f14699c;
                int i5 = c5326a.f14700d;
                int i6 = this.f2584b + this.f2585c;
                int i7 = this.f2586d;
                View view = (View) c4966e.m26068q();
                int[] iArr = C0846a.f2516a;
                int i8 = iArr[enumC4968b.ordinal()];
                if (i8 == 1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                } else if (i8 == 2) {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2588f, i7, -2);
                } else if (i8 == 3) {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2588f, i7 + c4966e.m26050z(), -1);
                } else if (i8 != 4) {
                    makeMeasureSpec = 0;
                } else {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2588f, i7, -2);
                    boolean z = c4966e.f13859n == 1;
                    int i9 = c5326a.f14706j;
                    if (i9 == C5325b.C5326a.f14695l || i9 == C5325b.C5326a.f14696m) {
                        if (c5326a.f14706j == C5325b.C5326a.f14696m || !z || (z && (view.getMeasuredHeight() == c4966e.m26058v())) || (view instanceof C0866g) || c4966e.mo26012e0()) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c4966e.m26106R(), 1073741824);
                        }
                    }
                }
                int i10 = iArr[enumC4968b2.ordinal()];
                if (i10 == 1) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                } else if (i10 == 2) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2589g, i6, -2);
                } else if (i10 == 3) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2589g, i6 + c4966e.m26110P(), -1);
                } else if (i10 != 4) {
                    makeMeasureSpec2 = 0;
                } else {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2589g, i6, -2);
                    boolean z2 = c4966e.f13861o == 1;
                    int i11 = c5326a.f14706j;
                    if (i11 == C5325b.C5326a.f14695l || i11 == C5325b.C5326a.f14696m) {
                        if (c5326a.f14706j == C5325b.C5326a.f14696m || !z2 || (z2 && (view.getMeasuredWidth() == c4966e.m26106R())) || (view instanceof C0866g) || c4966e.mo26010f0()) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c4966e.m26058v(), 1073741824);
                        }
                    }
                }
                C4969f c4969f = (C4969f) c4966e.m26124I();
                if (c4969f != null && C4974j.m25996b(ConstraintLayout.this.f2501E, 256) && view.getMeasuredWidth() == c4966e.m26106R() && view.getMeasuredWidth() < c4969f.m26106R() && view.getMeasuredHeight() == c4966e.m26058v() && view.getMeasuredHeight() < c4969f.m26058v() && view.getBaseline() == c4966e.m26074n() && !c4966e.m26086d0()) {
                    if (m39424d(c4966e.m26140A(), makeMeasureSpec, c4966e.m26106R()) && m39424d(c4966e.m26138B(), makeMeasureSpec2, c4966e.m26058v())) {
                        c5326a.f14701e = c4966e.m26106R();
                        c5326a.f14702f = c4966e.m26058v();
                        c5326a.f14703g = c4966e.m26074n();
                        return;
                    }
                }
                C4966e.EnumC4968b enumC4968b3 = C4966e.EnumC4968b.MATCH_CONSTRAINT;
                boolean z3 = enumC4968b == enumC4968b3;
                boolean z4 = enumC4968b2 == enumC4968b3;
                C4966e.EnumC4968b enumC4968b4 = C4966e.EnumC4968b.MATCH_PARENT;
                boolean z5 = enumC4968b2 == enumC4968b4 || enumC4968b2 == C4966e.EnumC4968b.FIXED;
                boolean z6 = enumC4968b == enumC4968b4 || enumC4968b == C4966e.EnumC4968b.FIXED;
                boolean z7 = z3 && c4966e.f13827U > 0.0f;
                boolean z8 = z4 && c4966e.f13827U > 0.0f;
                if (view == null) {
                    return;
                }
                C0847b c0847b = (C0847b) view.getLayoutParams();
                int i12 = c5326a.f14706j;
                if (i12 != C5325b.C5326a.f14695l && i12 != C5325b.C5326a.f14696m && z3 && c4966e.f13859n == 0 && z4 && c4966e.f13861o == 0) {
                    i3 = -1;
                    i2 = 0;
                    baseline = 0;
                    max = 0;
                } else {
                    if ((view instanceof AbstractC0869j) && (c4966e instanceof C4975k)) {
                        ((AbstractC0869j) view).m39363o((C4975k) c4966e, makeMeasureSpec, makeMeasureSpec2);
                    } else {
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    c4966e.m26129F0(makeMeasureSpec, makeMeasureSpec2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    int i13 = c4966e.f13863q;
                    max = i13 > 0 ? Math.max(i13, measuredWidth) : measuredWidth;
                    int i14 = c4966e.f13864r;
                    if (i14 > 0) {
                        max = Math.min(i14, max);
                    }
                    int i15 = c4966e.f13866t;
                    if (i15 > 0) {
                        i2 = Math.max(i15, measuredHeight);
                        i = makeMeasureSpec;
                    } else {
                        i = makeMeasureSpec;
                        i2 = measuredHeight;
                    }
                    int i16 = c4966e.f13867u;
                    if (i16 > 0) {
                        i2 = Math.min(i16, i2);
                    }
                    if (!C4974j.m25996b(ConstraintLayout.this.f2501E, 1)) {
                        if (z7 && z5) {
                            max = (int) ((i2 * c4966e.f13827U) + 0.5f);
                        } else if (z8 && z6) {
                            i2 = (int) ((max / c4966e.f13827U) + 0.5f);
                        }
                    }
                    if (measuredWidth != max || measuredHeight != i2) {
                        int makeMeasureSpec3 = measuredWidth != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i;
                        if (measuredHeight != i2) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
                        }
                        view.measure(makeMeasureSpec3, makeMeasureSpec2);
                        c4966e.m26129F0(makeMeasureSpec3, makeMeasureSpec2);
                        max = view.getMeasuredWidth();
                        i2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i3 = -1;
                }
                boolean z9 = baseline != i3;
                c5326a.f14705i = (max == c5326a.f14699c && i2 == c5326a.f14700d) ? false : true;
                if (c0847b.f2540X) {
                    z9 = true;
                }
                if (z9 && baseline != -1 && c4966e.m26074n() != baseline) {
                    c5326a.f14705i = true;
                }
                c5326a.f14701e = max;
                c5326a.f14702f = i2;
                c5326a.f14704h = z9;
                c5326a.f14703g = baseline;
            }
        }

        /* renamed from: c */
        public void m39425c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f2584b = i3;
            this.f2585c = i4;
            this.f2586d = i5;
            this.f2587e = i6;
            this.f2588f = i;
            this.f2589g = i2;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2512w = new SparseArray<>();
        this.f2513x = new ArrayList<>(4);
        this.f2514y = new C4969f();
        this.f2515z = 0;
        this.f2497A = 0;
        this.f2498B = Reader.READ_DONE;
        this.f2499C = Reader.READ_DONE;
        this.f2500D = true;
        this.f2501E = 257;
        this.f2502F = null;
        this.f2503G = null;
        this.f2504H = -1;
        this.f2505I = new HashMap<>();
        this.f2506J = -1;
        this.f2507K = -1;
        this.f2508L = new SparseArray<>();
        this.f2509M = new C0849c(this);
        this.f2510N = 0;
        this.f2511O = 0;
        m39436k(attributeSet, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Build.VERSION.SDK_INT >= 17 ? Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart()) : 0;
        return max2 > 0 ? max2 : max;
    }

    /* renamed from: h */
    private final C4966e m39439h(int i) {
        if (i == 0) {
            return this.f2514y;
        }
        View view = this.f2512w.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f2514y;
        }
        if (view == null) {
            return null;
        }
        return ((C0847b) view.getLayoutParams()).f2568m0;
    }

    /* renamed from: k */
    private void m39436k(AttributeSet attributeSet, int i, int i2) {
        this.f2514y.m26076l0(this);
        this.f2514y.m26045D1(this.f2509M);
        this.f2512w.put(getId(), this);
        this.f2502F = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0868i.f2783J0, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C0868i.f2808O0) {
                    this.f2515z = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2515z);
                } else if (index == C0868i.f2813P0) {
                    this.f2497A = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2497A);
                } else if (index == C0868i.f2798M0) {
                    this.f2498B = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2498B);
                } else if (index == C0868i.f2803N0) {
                    this.f2499C = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2499C);
                } else if (index == C0868i.f2849W1) {
                    this.f2501E = obtainStyledAttributes.getInt(index, this.f2501E);
                } else if (index == C0868i.f2853X0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m39433n(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f2503G = null;
                        }
                    }
                } else if (index == C0868i.f2838U0) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0857d c0857d = new C0857d();
                        this.f2502F = c0857d;
                        c0857d.m39389n(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f2502F = null;
                    }
                    this.f2504H = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2514y.m26044E1(this.f2501E);
    }

    /* renamed from: m */
    private void m39434m() {
        this.f2500D = true;
        this.f2506J = -1;
        this.f2507K = -1;
    }

    /* renamed from: q */
    private void m39430q() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C4966e m39437j = m39437j(getChildAt(i));
            if (m39437j != null) {
                m39437j.mo25987h0();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    m39429r(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    m39439h(childAt.getId()).m26075m0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f2504H != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.f2504H && (childAt2 instanceof C0863e)) {
                    this.f2502F = ((C0863e) childAt2).getConstraintSet();
                }
            }
        }
        C0857d c0857d = this.f2502F;
        if (c0857d != null) {
            c0857d.m39399d(this, true);
        }
        this.f2514y.m25988d1();
        int size = this.f2513x.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.f2513x.get(i4).m39408m(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof C0866g) {
                ((C0866g) childAt3).m39365b(this);
            }
        }
        this.f2508L.clear();
        this.f2508L.put(0, this.f2514y);
        this.f2508L.put(getId(), this.f2514y);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.f2508L.put(childAt4.getId(), m39437j(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            C4966e m39437j2 = m39437j(childAt5);
            if (m39437j2 != null) {
                C0847b c0847b = (C0847b) childAt5.getLayoutParams();
                this.f2514y.m25991b(m39437j2);
                m39443d(isInEditMode, childAt5, m39437j2, c0847b, this.f2508L);
            }
        }
    }

    /* renamed from: t */
    private boolean m39427t() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            m39430q();
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0847b;
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f3  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void m39443d(boolean r18, android.view.View r19, p073e2.C4966e r20, androidx.constraintlayout.widget.ConstraintLayout.C0847b r21, android.util.SparseArray<p073e2.C4966e> r22) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m39443d(boolean, android.view.View, e2.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<AbstractC0853b> arrayList = this.f2513x;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.f2513x.get(i).m39409l(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: e */
    public C0847b mo39442e() {
        return new C0847b(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f */
    public C0847b mo39441f(AttributeSet attributeSet) {
        return new C0847b(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void forceLayout() {
        m39434m();
        super.forceLayout();
    }

    /* renamed from: g */
    public Object m39440g(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.f2505I;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return null;
            }
            return this.f2505I.get(str);
        }
        return null;
    }

    public int getMaxHeight() {
        return this.f2499C;
    }

    public int getMaxWidth() {
        return this.f2498B;
    }

    public int getMinHeight() {
        return this.f2497A;
    }

    public int getMinWidth() {
        return this.f2515z;
    }

    public int getOptimizationLevel() {
        return this.f2514y.m26025s1();
    }

    /* renamed from: i */
    public View m39438i(int i) {
        return this.f2512w.get(i);
    }

    /* renamed from: j */
    public final C4966e m39437j(View view) {
        if (view == this) {
            return this.f2514y;
        }
        if (view == null) {
            return null;
        }
        return ((C0847b) view.getLayoutParams()).f2568m0;
    }

    /* renamed from: l */
    protected boolean m39435l() {
        if (Build.VERSION.SDK_INT >= 17) {
            return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
        }
        return false;
    }

    /* renamed from: n */
    protected void m39433n(int i) {
        this.f2503G = new C0854c(getContext(), this, i);
    }

    /* renamed from: o */
    protected void m39432o(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C0849c c0849c = this.f2509M;
        int i5 = c0849c.f2587e;
        int i6 = i3 + c0849c.f2586d;
        int i7 = i4 + i5;
        if (Build.VERSION.SDK_INT >= 11) {
            int resolveSizeAndState = ViewGroup.resolveSizeAndState(i6, i, 0);
            int min = Math.min(this.f2498B, resolveSizeAndState & 16777215);
            int min2 = Math.min(this.f2499C, ViewGroup.resolveSizeAndState(i7, i2, 0) & 16777215);
            if (z) {
                min |= 16777216;
            }
            if (z2) {
                min2 |= 16777216;
            }
            setMeasuredDimension(min, min2);
            this.f2506J = min;
            this.f2507K = min2;
            return;
        }
        setMeasuredDimension(i6, i7);
        this.f2506J = i6;
        this.f2507K = i7;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0847b c0847b = (C0847b) childAt.getLayoutParams();
            C4966e c4966e = c0847b.f2568m0;
            if ((childAt.getVisibility() != 8 || c0847b.f2541Y || c0847b.f2542Z || c0847b.f2546b0 || isInEditMode) && !c0847b.f2544a0) {
                int m26104S = c4966e.m26104S();
                int m26102T = c4966e.m26102T();
                int m26106R = c4966e.m26106R() + m26104S;
                int m26058v = c4966e.m26058v() + m26102T;
                childAt.layout(m26104S, m26102T, m26106R, m26058v);
                if ((childAt instanceof C0866g) && (content = ((C0866g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(m26104S, m26102T, m26106R, m26058v);
                }
            }
        }
        int size = this.f2513x.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f2513x.get(i6).mo39411j(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.f2500D) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                } else if (getChildAt(i3).isLayoutRequested()) {
                    this.f2500D = true;
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (!this.f2500D) {
            int i4 = this.f2510N;
            if (i4 == i && this.f2511O == i2) {
                m39432o(i, i2, this.f2514y.m26106R(), this.f2514y.m26058v(), this.f2514y.m26019y1(), this.f2514y.m26021w1());
                return;
            } else if (i4 == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.f2511O) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) >= this.f2514y.m26058v()) {
                this.f2510N = i;
                this.f2511O = i2;
                m39432o(i, i2, this.f2514y.m26106R(), this.f2514y.m26058v(), this.f2514y.m26019y1(), this.f2514y.m26021w1());
                return;
            }
        }
        this.f2510N = i;
        this.f2511O = i2;
        this.f2514y.m26043F1(m39435l());
        if (this.f2500D) {
            this.f2500D = false;
            if (m39427t()) {
                this.f2514y.m26041H1();
            }
        }
        m39431p(this.f2514y, this.f2501E, i, i2);
        m39432o(i, i2, this.f2514y.m26106R(), this.f2514y.m26058v(), this.f2514y.m26019y1(), this.f2514y.m26021w1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C4966e m39437j = m39437j(view);
        if ((view instanceof Guideline) && !(m39437j instanceof C4970g)) {
            C0847b c0847b = (C0847b) view.getLayoutParams();
            C4970g c4970g = new C4970g();
            c0847b.f2568m0 = c4970g;
            c0847b.f2541Y = true;
            c4970g.m26003j1(c0847b.f2534R);
        }
        if (view instanceof AbstractC0853b) {
            AbstractC0853b abstractC0853b = (AbstractC0853b) view;
            abstractC0853b.m39407n();
            ((C0847b) view.getLayoutParams()).f2542Z = true;
            if (!this.f2513x.contains(abstractC0853b)) {
                this.f2513x.add(abstractC0853b);
            }
        }
        this.f2512w.put(view.getId(), view);
        this.f2500D = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f2512w.remove(view.getId());
        this.f2514y.m25989c1(m39437j(view));
        this.f2513x.remove(view);
        this.f2500D = true;
    }

    /* renamed from: p */
    protected void m39431p(C4969f c4969f, int i, int i2, int i3) {
        int max;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max2 = Math.max(0, getPaddingTop());
        int max3 = Math.max(0, getPaddingBottom());
        int i4 = max2 + max3;
        int paddingWidth = getPaddingWidth();
        this.f2509M.m39425c(i2, i3, max2, max3, paddingWidth, i4);
        if (Build.VERSION.SDK_INT >= 17) {
            int max4 = Math.max(0, getPaddingStart());
            int max5 = Math.max(0, getPaddingEnd());
            if (max4 <= 0 && max5 <= 0) {
                max4 = Math.max(0, getPaddingLeft());
            } else if (m39435l()) {
                max4 = max5;
            }
            max = max4;
        } else {
            max = Math.max(0, getPaddingLeft());
        }
        int i5 = size - paddingWidth;
        int i6 = size2 - i4;
        m39428s(c4969f, mode, i5, mode2, i6);
        c4969f.m26018z1(i, mode, i5, mode2, i6, this.f2506J, this.f2507K, max, max2);
    }

    /* renamed from: r */
    public void m39429r(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f2505I == null) {
                this.f2505I = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f2505I.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        m39434m();
        super.requestLayout();
    }

    /* renamed from: s */
    protected void m39428s(C4969f c4969f, int i, int i2, int i3, int i4) {
        C4966e.EnumC4968b enumC4968b;
        C0849c c0849c = this.f2509M;
        int i5 = c0849c.f2587e;
        int i6 = c0849c.f2586d;
        C4966e.EnumC4968b enumC4968b2 = C4966e.EnumC4968b.FIXED;
        int childCount = getChildCount();
        if (i == Integer.MIN_VALUE) {
            enumC4968b = C4966e.EnumC4968b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.f2515z);
            }
        } else if (i == 0) {
            enumC4968b = C4966e.EnumC4968b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.f2515z);
            }
            i2 = 0;
        } else if (i != 1073741824) {
            enumC4968b = enumC4968b2;
            i2 = 0;
        } else {
            i2 = Math.min(this.f2498B - i6, i2);
            enumC4968b = enumC4968b2;
        }
        if (i3 == Integer.MIN_VALUE) {
            enumC4968b2 = C4966e.EnumC4968b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.f2497A);
            }
        } else if (i3 != 0) {
            if (i3 == 1073741824) {
                i4 = Math.min(this.f2499C - i5, i4);
            }
            i4 = 0;
        } else {
            enumC4968b2 = C4966e.EnumC4968b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.f2497A);
            }
            i4 = 0;
        }
        if (i2 != c4969f.m26106R() || i4 != c4969f.m26058v()) {
            c4969f.m26022v1();
        }
        c4969f.m26097V0(0);
        c4969f.m26095W0(0);
        c4969f.m26125H0(this.f2498B - i6);
        c4969f.m26127G0(this.f2499C - i5);
        c4969f.m26119K0(0);
        c4969f.m26121J0(0);
        c4969f.m26049z0(enumC4968b);
        c4969f.m26099U0(i2);
        c4969f.m26107Q0(enumC4968b2);
        c4969f.m26057v0(i4);
        c4969f.m26119K0(this.f2515z - i6);
        c4969f.m26121J0(this.f2497A - i5);
    }

    public void setConstraintSet(C0857d c0857d) {
        this.f2502F = c0857d;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.f2512w.remove(getId());
        super.setId(i);
        this.f2512w.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f2499C) {
            return;
        }
        this.f2499C = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f2498B) {
            return;
        }
        this.f2498B = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f2497A) {
            return;
        }
        this.f2497A = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f2515z) {
            return;
        }
        this.f2515z = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0865f abstractC0865f) {
        C0854c c0854c = this.f2503G;
        if (c0854c != null) {
            c0854c.m39404c(abstractC0865f);
        }
    }

    public void setOptimizationLevel(int i) {
        this.f2501E = i;
        this.f2514y.m26044E1(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0847b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2512w = new SparseArray<>();
        this.f2513x = new ArrayList<>(4);
        this.f2514y = new C4969f();
        this.f2515z = 0;
        this.f2497A = 0;
        this.f2498B = Reader.READ_DONE;
        this.f2499C = Reader.READ_DONE;
        this.f2500D = true;
        this.f2501E = 257;
        this.f2502F = null;
        this.f2503G = null;
        this.f2504H = -1;
        this.f2505I = new HashMap<>();
        this.f2506J = -1;
        this.f2507K = -1;
        this.f2508L = new SparseArray<>();
        this.f2509M = new C0849c(this);
        this.f2510N = 0;
        this.f2511O = 0;
        m39436k(attributeSet, i, 0);
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    /* loaded from: classes.dex */
    public static class C0847b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f2517A;

        /* renamed from: B */
        public String f2518B;

        /* renamed from: C */
        int f2519C;

        /* renamed from: D */
        public float f2520D;

        /* renamed from: E */
        public float f2521E;

        /* renamed from: F */
        public int f2522F;

        /* renamed from: G */
        public int f2523G;

        /* renamed from: H */
        public int f2524H;

        /* renamed from: I */
        public int f2525I;

        /* renamed from: J */
        public int f2526J;

        /* renamed from: K */
        public int f2527K;

        /* renamed from: L */
        public int f2528L;

        /* renamed from: M */
        public int f2529M;

        /* renamed from: N */
        public float f2530N;

        /* renamed from: O */
        public float f2531O;

        /* renamed from: P */
        public int f2532P;

        /* renamed from: Q */
        public int f2533Q;

        /* renamed from: R */
        public int f2534R;

        /* renamed from: S */
        public boolean f2535S;

        /* renamed from: T */
        public boolean f2536T;

        /* renamed from: U */
        public String f2537U;

        /* renamed from: V */
        boolean f2538V;

        /* renamed from: W */
        boolean f2539W;

        /* renamed from: X */
        boolean f2540X;

        /* renamed from: Y */
        boolean f2541Y;

        /* renamed from: Z */
        boolean f2542Z;

        /* renamed from: a */
        public int f2543a;

        /* renamed from: a0 */
        boolean f2544a0;

        /* renamed from: b */
        public int f2545b;

        /* renamed from: b0 */
        boolean f2546b0;

        /* renamed from: c */
        public float f2547c;

        /* renamed from: c0 */
        int f2548c0;

        /* renamed from: d */
        public int f2549d;

        /* renamed from: d0 */
        int f2550d0;

        /* renamed from: e */
        public int f2551e;

        /* renamed from: e0 */
        int f2552e0;

        /* renamed from: f */
        public int f2553f;

        /* renamed from: f0 */
        int f2554f0;

        /* renamed from: g */
        public int f2555g;

        /* renamed from: g0 */
        int f2556g0;

        /* renamed from: h */
        public int f2557h;

        /* renamed from: h0 */
        int f2558h0;

        /* renamed from: i */
        public int f2559i;

        /* renamed from: i0 */
        float f2560i0;

        /* renamed from: j */
        public int f2561j;

        /* renamed from: j0 */
        int f2562j0;

        /* renamed from: k */
        public int f2563k;

        /* renamed from: k0 */
        int f2564k0;

        /* renamed from: l */
        public int f2565l;

        /* renamed from: l0 */
        float f2566l0;

        /* renamed from: m */
        public int f2567m;

        /* renamed from: m0 */
        C4966e f2568m0;

        /* renamed from: n */
        public int f2569n;

        /* renamed from: o */
        public float f2570o;

        /* renamed from: p */
        public int f2571p;

        /* renamed from: q */
        public int f2572q;

        /* renamed from: r */
        public int f2573r;

        /* renamed from: s */
        public int f2574s;

        /* renamed from: t */
        public int f2575t;

        /* renamed from: u */
        public int f2576u;

        /* renamed from: v */
        public int f2577v;

        /* renamed from: w */
        public int f2578w;

        /* renamed from: x */
        public int f2579x;

        /* renamed from: y */
        public int f2580y;

        /* renamed from: z */
        public float f2581z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b$a */
        /* loaded from: classes.dex */
        private static class C0848a {

            /* renamed from: a */
            public static final SparseIntArray f2582a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2582a = sparseIntArray;
                sparseIntArray.append(C0868i.f2984w1, 8);
                sparseIntArray.append(C0868i.f2989x1, 9);
                sparseIntArray.append(C0868i.f2999z1, 10);
                sparseIntArray.append(C0868i.f2739A1, 11);
                sparseIntArray.append(C0868i.f2769G1, 12);
                sparseIntArray.append(C0868i.f2764F1, 13);
                sparseIntArray.append(C0868i.f2893e1, 14);
                sparseIntArray.append(C0868i.f2887d1, 15);
                sparseIntArray.append(C0868i.f2875b1, 16);
                sparseIntArray.append(C0868i.f2899f1, 2);
                sparseIntArray.append(C0868i.f2909h1, 3);
                sparseIntArray.append(C0868i.f2904g1, 4);
                sparseIntArray.append(C0868i.f2809O1, 49);
                sparseIntArray.append(C0868i.f2814P1, 50);
                sparseIntArray.append(C0868i.f2929l1, 5);
                sparseIntArray.append(C0868i.f2934m1, 6);
                sparseIntArray.append(C0868i.f2939n1, 7);
                sparseIntArray.append(C0868i.f2788K0, 1);
                sparseIntArray.append(C0868i.f2744B1, 17);
                sparseIntArray.append(C0868i.f2749C1, 18);
                sparseIntArray.append(C0868i.f2924k1, 19);
                sparseIntArray.append(C0868i.f2919j1, 20);
                sparseIntArray.append(C0868i.f2829S1, 21);
                sparseIntArray.append(C0868i.f2844V1, 22);
                sparseIntArray.append(C0868i.f2834T1, 23);
                sparseIntArray.append(C0868i.f2819Q1, 24);
                sparseIntArray.append(C0868i.f2839U1, 25);
                sparseIntArray.append(C0868i.f2824R1, 26);
                sparseIntArray.append(C0868i.f2964s1, 29);
                sparseIntArray.append(C0868i.f2774H1, 30);
                sparseIntArray.append(C0868i.f2914i1, 44);
                sparseIntArray.append(C0868i.f2974u1, 45);
                sparseIntArray.append(C0868i.f2784J1, 46);
                sparseIntArray.append(C0868i.f2969t1, 47);
                sparseIntArray.append(C0868i.f2779I1, 48);
                sparseIntArray.append(C0868i.f2863Z0, 27);
                sparseIntArray.append(C0868i.f2858Y0, 28);
                sparseIntArray.append(C0868i.f2789K1, 31);
                sparseIntArray.append(C0868i.f2944o1, 32);
                sparseIntArray.append(C0868i.f2799M1, 33);
                sparseIntArray.append(C0868i.f2794L1, 34);
                sparseIntArray.append(C0868i.f2804N1, 35);
                sparseIntArray.append(C0868i.f2954q1, 36);
                sparseIntArray.append(C0868i.f2949p1, 37);
                sparseIntArray.append(C0868i.f2959r1, 38);
                sparseIntArray.append(C0868i.f2979v1, 39);
                sparseIntArray.append(C0868i.f2759E1, 40);
                sparseIntArray.append(C0868i.f2994y1, 41);
                sparseIntArray.append(C0868i.f2881c1, 42);
                sparseIntArray.append(C0868i.f2869a1, 43);
                sparseIntArray.append(C0868i.f2754D1, 51);
            }
        }

        public C0847b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            this.f2543a = -1;
            this.f2545b = -1;
            this.f2547c = -1.0f;
            this.f2549d = -1;
            this.f2551e = -1;
            this.f2553f = -1;
            this.f2555g = -1;
            this.f2557h = -1;
            this.f2559i = -1;
            this.f2561j = -1;
            this.f2563k = -1;
            this.f2565l = -1;
            this.f2567m = -1;
            this.f2569n = 0;
            this.f2570o = 0.0f;
            this.f2571p = -1;
            this.f2572q = -1;
            this.f2573r = -1;
            this.f2574s = -1;
            this.f2575t = -1;
            this.f2576u = -1;
            this.f2577v = -1;
            this.f2578w = -1;
            this.f2579x = -1;
            this.f2580y = -1;
            this.f2581z = 0.5f;
            this.f2517A = 0.5f;
            this.f2518B = null;
            this.f2519C = 1;
            this.f2520D = -1.0f;
            this.f2521E = -1.0f;
            this.f2522F = 0;
            this.f2523G = 0;
            this.f2524H = 0;
            this.f2525I = 0;
            this.f2526J = 0;
            this.f2527K = 0;
            this.f2528L = 0;
            this.f2529M = 0;
            this.f2530N = 1.0f;
            this.f2531O = 1.0f;
            this.f2532P = -1;
            this.f2533Q = -1;
            this.f2534R = -1;
            this.f2535S = false;
            this.f2536T = false;
            this.f2537U = null;
            this.f2538V = true;
            this.f2539W = true;
            this.f2540X = false;
            this.f2541Y = false;
            this.f2542Z = false;
            this.f2544a0 = false;
            this.f2546b0 = false;
            this.f2548c0 = -1;
            this.f2550d0 = -1;
            this.f2552e0 = -1;
            this.f2554f0 = -1;
            this.f2556g0 = -1;
            this.f2558h0 = -1;
            this.f2560i0 = 0.5f;
            this.f2568m0 = new C4966e();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0868i.f2783J0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C0848a.f2582a.get(index);
                switch (i3) {
                    case 1:
                        this.f2534R = obtainStyledAttributes.getInt(index, this.f2534R);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f2567m);
                        this.f2567m = resourceId;
                        if (resourceId == -1) {
                            this.f2567m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f2569n = obtainStyledAttributes.getDimensionPixelSize(index, this.f2569n);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f2570o) % 360.0f;
                        this.f2570o = f;
                        if (f < 0.0f) {
                            this.f2570o = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f2543a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2543a);
                        break;
                    case 6:
                        this.f2545b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2545b);
                        break;
                    case 7:
                        this.f2547c = obtainStyledAttributes.getFloat(index, this.f2547c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f2549d);
                        this.f2549d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f2549d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f2551e);
                        this.f2551e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f2551e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f2553f);
                        this.f2553f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f2553f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f2555g);
                        this.f2555g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f2555g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f2557h);
                        this.f2557h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f2557h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f2559i);
                        this.f2559i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f2559i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f2561j);
                        this.f2561j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f2561j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f2563k);
                        this.f2563k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f2563k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f2565l);
                        this.f2565l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f2565l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f2571p);
                        this.f2571p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f2571p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f2572q);
                        this.f2572q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f2572q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f2573r);
                        this.f2573r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f2573r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f2574s);
                        this.f2574s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f2574s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f2575t = obtainStyledAttributes.getDimensionPixelSize(index, this.f2575t);
                        break;
                    case 22:
                        this.f2576u = obtainStyledAttributes.getDimensionPixelSize(index, this.f2576u);
                        break;
                    case 23:
                        this.f2577v = obtainStyledAttributes.getDimensionPixelSize(index, this.f2577v);
                        break;
                    case 24:
                        this.f2578w = obtainStyledAttributes.getDimensionPixelSize(index, this.f2578w);
                        break;
                    case 25:
                        this.f2579x = obtainStyledAttributes.getDimensionPixelSize(index, this.f2579x);
                        break;
                    case 26:
                        this.f2580y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2580y);
                        break;
                    case 27:
                        this.f2535S = obtainStyledAttributes.getBoolean(index, this.f2535S);
                        break;
                    case 28:
                        this.f2536T = obtainStyledAttributes.getBoolean(index, this.f2536T);
                        break;
                    case 29:
                        this.f2581z = obtainStyledAttributes.getFloat(index, this.f2581z);
                        break;
                    case 30:
                        this.f2517A = obtainStyledAttributes.getFloat(index, this.f2517A);
                        break;
                    case 31:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.f2524H = i4;
                        if (i4 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.f2525I = i5;
                        if (i5 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f2526J = obtainStyledAttributes.getDimensionPixelSize(index, this.f2526J);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f2526J) == -2) {
                                this.f2526J = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f2528L = obtainStyledAttributes.getDimensionPixelSize(index, this.f2528L);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f2528L) == -2) {
                                this.f2528L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f2530N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f2530N));
                        this.f2524H = 2;
                        break;
                    case 36:
                        try {
                            this.f2527K = obtainStyledAttributes.getDimensionPixelSize(index, this.f2527K);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f2527K) == -2) {
                                this.f2527K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f2529M = obtainStyledAttributes.getDimensionPixelSize(index, this.f2529M);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f2529M) == -2) {
                                this.f2529M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f2531O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f2531O));
                        this.f2525I = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f2518B = string;
                                this.f2519C = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.f2518B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.f2518B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f2519C = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f2519C = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.f2518B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.f2518B.substring(i, indexOf2);
                                        String substring3 = this.f2518B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.f2519C == 1) {
                                                        Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.f2518B.substring(i);
                                        if (substring4.length() > 0) {
                                            Float.parseFloat(substring4);
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            case 45:
                                this.f2520D = obtainStyledAttributes.getFloat(index, this.f2520D);
                                continue;
                            case 46:
                                this.f2521E = obtainStyledAttributes.getFloat(index, this.f2521E);
                                continue;
                            case 47:
                                this.f2522F = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.f2523G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.f2532P = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2532P);
                                continue;
                            case 50:
                                this.f2533Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2533Q);
                                continue;
                            case 51:
                                this.f2537U = obtainStyledAttributes.getString(index);
                                continue;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            m39426a();
        }

        /* renamed from: a */
        public void m39426a() {
            this.f2541Y = false;
            this.f2538V = true;
            this.f2539W = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.f2535S) {
                this.f2538V = false;
                if (this.f2524H == 0) {
                    this.f2524H = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.f2536T) {
                this.f2539W = false;
                if (this.f2525I == 0) {
                    this.f2525I = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f2538V = false;
                if (i == 0 && this.f2524H == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f2535S = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f2539W = false;
                if (i2 == 0 && this.f2525I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f2536T = true;
                }
            }
            if (this.f2547c == -1.0f && this.f2543a == -1 && this.f2545b == -1) {
                return;
            }
            this.f2541Y = true;
            this.f2538V = true;
            this.f2539W = true;
            if (!(this.f2568m0 instanceof C4970g)) {
                this.f2568m0 = new C4970g();
            }
            ((C4970g) this.f2568m0).m26003j1(this.f2534R);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0847b.resolveLayoutDirection(int):void");
        }

        public C0847b(int i, int i2) {
            super(i, i2);
            this.f2543a = -1;
            this.f2545b = -1;
            this.f2547c = -1.0f;
            this.f2549d = -1;
            this.f2551e = -1;
            this.f2553f = -1;
            this.f2555g = -1;
            this.f2557h = -1;
            this.f2559i = -1;
            this.f2561j = -1;
            this.f2563k = -1;
            this.f2565l = -1;
            this.f2567m = -1;
            this.f2569n = 0;
            this.f2570o = 0.0f;
            this.f2571p = -1;
            this.f2572q = -1;
            this.f2573r = -1;
            this.f2574s = -1;
            this.f2575t = -1;
            this.f2576u = -1;
            this.f2577v = -1;
            this.f2578w = -1;
            this.f2579x = -1;
            this.f2580y = -1;
            this.f2581z = 0.5f;
            this.f2517A = 0.5f;
            this.f2518B = null;
            this.f2519C = 1;
            this.f2520D = -1.0f;
            this.f2521E = -1.0f;
            this.f2522F = 0;
            this.f2523G = 0;
            this.f2524H = 0;
            this.f2525I = 0;
            this.f2526J = 0;
            this.f2527K = 0;
            this.f2528L = 0;
            this.f2529M = 0;
            this.f2530N = 1.0f;
            this.f2531O = 1.0f;
            this.f2532P = -1;
            this.f2533Q = -1;
            this.f2534R = -1;
            this.f2535S = false;
            this.f2536T = false;
            this.f2537U = null;
            this.f2538V = true;
            this.f2539W = true;
            this.f2540X = false;
            this.f2541Y = false;
            this.f2542Z = false;
            this.f2544a0 = false;
            this.f2546b0 = false;
            this.f2548c0 = -1;
            this.f2550d0 = -1;
            this.f2552e0 = -1;
            this.f2554f0 = -1;
            this.f2556g0 = -1;
            this.f2558h0 = -1;
            this.f2560i0 = 0.5f;
            this.f2568m0 = new C4966e();
        }

        public C0847b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2543a = -1;
            this.f2545b = -1;
            this.f2547c = -1.0f;
            this.f2549d = -1;
            this.f2551e = -1;
            this.f2553f = -1;
            this.f2555g = -1;
            this.f2557h = -1;
            this.f2559i = -1;
            this.f2561j = -1;
            this.f2563k = -1;
            this.f2565l = -1;
            this.f2567m = -1;
            this.f2569n = 0;
            this.f2570o = 0.0f;
            this.f2571p = -1;
            this.f2572q = -1;
            this.f2573r = -1;
            this.f2574s = -1;
            this.f2575t = -1;
            this.f2576u = -1;
            this.f2577v = -1;
            this.f2578w = -1;
            this.f2579x = -1;
            this.f2580y = -1;
            this.f2581z = 0.5f;
            this.f2517A = 0.5f;
            this.f2518B = null;
            this.f2519C = 1;
            this.f2520D = -1.0f;
            this.f2521E = -1.0f;
            this.f2522F = 0;
            this.f2523G = 0;
            this.f2524H = 0;
            this.f2525I = 0;
            this.f2526J = 0;
            this.f2527K = 0;
            this.f2528L = 0;
            this.f2529M = 0;
            this.f2530N = 1.0f;
            this.f2531O = 1.0f;
            this.f2532P = -1;
            this.f2533Q = -1;
            this.f2534R = -1;
            this.f2535S = false;
            this.f2536T = false;
            this.f2537U = null;
            this.f2538V = true;
            this.f2539W = true;
            this.f2540X = false;
            this.f2541Y = false;
            this.f2542Z = false;
            this.f2544a0 = false;
            this.f2546b0 = false;
            this.f2548c0 = -1;
            this.f2550d0 = -1;
            this.f2552e0 = -1;
            this.f2554f0 = -1;
            this.f2556g0 = -1;
            this.f2558h0 = -1;
            this.f2560i0 = 0.5f;
            this.f2568m0 = new C4966e();
        }
    }
}
