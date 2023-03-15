package p125h;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C0981a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h.b */
/* loaded from: classes.dex */
public class C5724b extends Drawable implements Drawable.Callback {

    /* renamed from: B */
    private boolean f15998B;

    /* renamed from: D */
    private boolean f16000D;

    /* renamed from: E */
    private Runnable f16001E;

    /* renamed from: F */
    private long f16002F;

    /* renamed from: G */
    private long f16003G;

    /* renamed from: H */
    private C5727c f16004H;

    /* renamed from: w */
    private AbstractC5728d f16005w;

    /* renamed from: x */
    private Rect f16006x;

    /* renamed from: y */
    private Drawable f16007y;

    /* renamed from: z */
    private Drawable f16008z;

    /* renamed from: A */
    private int f15997A = 255;

    /* renamed from: C */
    private int f15999C = -1;

    /* compiled from: DrawableContainer.java */
    /* renamed from: h.b$a */
    /* loaded from: classes.dex */
    class RunnableC5725a implements Runnable {
        RunnableC5725a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5724b.this.m23256a(true);
            C5724b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DrawableContainer.java */
    /* renamed from: h.b$b */
    /* loaded from: classes.dex */
    public static class C5726b {
        /* renamed from: a */
        public static boolean m23249a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* renamed from: b */
        public static void m23248b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* renamed from: c */
        public static Resources m23247c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableContainer.java */
    /* renamed from: h.b$c */
    /* loaded from: classes.dex */
    public static class C5727c implements Drawable.Callback {

        /* renamed from: w */
        private Drawable.Callback f16010w;

        C5727c() {
        }

        /* renamed from: a */
        public Drawable.Callback m23246a() {
            Drawable.Callback callback = this.f16010w;
            this.f16010w = null;
            return callback;
        }

        /* renamed from: b */
        public C5727c m23245b(Drawable.Callback callback) {
            this.f16010w = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f16010w;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f16010w;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableContainer.java */
    /* renamed from: h.b$d */
    /* loaded from: classes.dex */
    public static abstract class AbstractC5728d extends Drawable.ConstantState {

        /* renamed from: A */
        int f16011A;

        /* renamed from: B */
        int f16012B;

        /* renamed from: C */
        boolean f16013C;

        /* renamed from: D */
        ColorFilter f16014D;

        /* renamed from: E */
        boolean f16015E;

        /* renamed from: F */
        ColorStateList f16016F;

        /* renamed from: G */
        PorterDuff.Mode f16017G;

        /* renamed from: H */
        boolean f16018H;

        /* renamed from: I */
        boolean f16019I;

        /* renamed from: a */
        final C5724b f16020a;

        /* renamed from: b */
        Resources f16021b;

        /* renamed from: c */
        int f16022c;

        /* renamed from: d */
        int f16023d;

        /* renamed from: e */
        int f16024e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f16025f;

        /* renamed from: g */
        Drawable[] f16026g;

        /* renamed from: h */
        int f16027h;

        /* renamed from: i */
        boolean f16028i;

        /* renamed from: j */
        boolean f16029j;

        /* renamed from: k */
        Rect f16030k;

        /* renamed from: l */
        boolean f16031l;

        /* renamed from: m */
        boolean f16032m;

        /* renamed from: n */
        int f16033n;

        /* renamed from: o */
        int f16034o;

        /* renamed from: p */
        int f16035p;

        /* renamed from: q */
        int f16036q;

        /* renamed from: r */
        boolean f16037r;

        /* renamed from: s */
        int f16038s;

        /* renamed from: t */
        boolean f16039t;

        /* renamed from: u */
        boolean f16040u;

        /* renamed from: v */
        boolean f16041v;

        /* renamed from: w */
        boolean f16042w;

        /* renamed from: x */
        boolean f16043x;

        /* renamed from: y */
        boolean f16044y;

        /* renamed from: z */
        int f16045z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC5728d(AbstractC5728d abstractC5728d, C5724b c5724b, Resources resources) {
            Resources resources2;
            this.f16028i = false;
            this.f16031l = false;
            this.f16043x = true;
            this.f16011A = 0;
            this.f16012B = 0;
            this.f16020a = c5724b;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = abstractC5728d != null ? abstractC5728d.f16021b : null;
            }
            this.f16021b = resources2;
            int m23252f = C5724b.m23252f(resources, abstractC5728d != null ? abstractC5728d.f16022c : 0);
            this.f16022c = m23252f;
            if (abstractC5728d != null) {
                this.f16023d = abstractC5728d.f16023d;
                this.f16024e = abstractC5728d.f16024e;
                this.f16041v = true;
                this.f16042w = true;
                this.f16028i = abstractC5728d.f16028i;
                this.f16031l = abstractC5728d.f16031l;
                this.f16043x = abstractC5728d.f16043x;
                this.f16044y = abstractC5728d.f16044y;
                this.f16045z = abstractC5728d.f16045z;
                this.f16011A = abstractC5728d.f16011A;
                this.f16012B = abstractC5728d.f16012B;
                this.f16013C = abstractC5728d.f16013C;
                this.f16014D = abstractC5728d.f16014D;
                this.f16015E = abstractC5728d.f16015E;
                this.f16016F = abstractC5728d.f16016F;
                this.f16017G = abstractC5728d.f16017G;
                this.f16018H = abstractC5728d.f16018H;
                this.f16019I = abstractC5728d.f16019I;
                if (abstractC5728d.f16022c == m23252f) {
                    if (abstractC5728d.f16029j) {
                        this.f16030k = abstractC5728d.f16030k != null ? new Rect(abstractC5728d.f16030k) : null;
                        this.f16029j = true;
                    }
                    if (abstractC5728d.f16032m) {
                        this.f16033n = abstractC5728d.f16033n;
                        this.f16034o = abstractC5728d.f16034o;
                        this.f16035p = abstractC5728d.f16035p;
                        this.f16036q = abstractC5728d.f16036q;
                        this.f16032m = true;
                    }
                }
                if (abstractC5728d.f16037r) {
                    this.f16038s = abstractC5728d.f16038s;
                    this.f16037r = true;
                }
                if (abstractC5728d.f16039t) {
                    this.f16040u = abstractC5728d.f16040u;
                    this.f16039t = true;
                }
                Drawable[] drawableArr = abstractC5728d.f16026g;
                this.f16026g = new Drawable[drawableArr.length];
                this.f16027h = abstractC5728d.f16027h;
                SparseArray<Drawable.ConstantState> sparseArray = abstractC5728d.f16025f;
                if (sparseArray != null) {
                    this.f16025f = sparseArray.clone();
                } else {
                    this.f16025f = new SparseArray<>(this.f16027h);
                }
                int i = this.f16027h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f16025f.put(i2, constantState);
                        } else {
                            this.f16026g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f16026g = new Drawable[10];
            this.f16027h = 0;
        }

        /* renamed from: e */
        private void m23240e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f16025f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f16026g[this.f16025f.keyAt(i)] = m23228s(this.f16025f.valueAt(i).newDrawable(this.f16021b));
                }
                this.f16025f = null;
            }
        }

        /* renamed from: s */
        private Drawable m23228s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                C0981a.m38864m(drawable, this.f16045z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f16020a);
            return mutate;
        }

        /* renamed from: a */
        public final int m23244a(Drawable drawable) {
            int i = this.f16027h;
            if (i >= this.f16026g.length) {
                mo23214o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f16020a);
            this.f16026g[i] = drawable;
            this.f16027h++;
            this.f16024e = drawable.getChangingConfigurations() | this.f16024e;
            m23230p();
            this.f16030k = null;
            this.f16029j = false;
            this.f16032m = false;
            this.f16041v = false;
            return i;
        }

        /* renamed from: b */
        final void m23243b(Resources.Theme theme) {
            if (theme != null) {
                m23240e();
                int i = this.f16027h;
                Drawable[] drawableArr = this.f16026g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && C0981a.m38875b(drawableArr[i2])) {
                        C0981a.m38876a(drawableArr[i2], theme);
                        this.f16024e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                m23222y(C5726b.m23247c(theme));
            }
        }

        /* renamed from: c */
        public boolean m23242c() {
            if (this.f16041v) {
                return this.f16042w;
            }
            m23240e();
            this.f16041v = true;
            int i = this.f16027h;
            Drawable[] drawableArr = this.f16026g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f16042w = false;
                    return false;
                }
            }
            this.f16042w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.f16027h;
            Drawable[] drawableArr = this.f16026g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    if (C0981a.m38875b(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.f16025f.get(i2);
                    if (constantState != null && C5726b.m23249a(constantState)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: d */
        protected void m23241d() {
            this.f16032m = true;
            m23240e();
            int i = this.f16027h;
            Drawable[] drawableArr = this.f16026g;
            this.f16034o = -1;
            this.f16033n = -1;
            this.f16036q = 0;
            this.f16035p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f16033n) {
                    this.f16033n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f16034o) {
                    this.f16034o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f16035p) {
                    this.f16035p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f16036q) {
                    this.f16036q = minimumHeight;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public final int m23239f() {
            return this.f16026g.length;
        }

        /* renamed from: g */
        public final Drawable m23238g(int i) {
            int indexOfKey;
            Drawable drawable = this.f16026g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f16025f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable m23228s = m23228s(this.f16025f.valueAt(indexOfKey).newDrawable(this.f16021b));
            this.f16026g[i] = m23228s;
            this.f16025f.removeAt(indexOfKey);
            if (this.f16025f.size() == 0) {
                this.f16025f = null;
            }
            return m23228s;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f16023d | this.f16024e;
        }

        /* renamed from: h */
        public final int m23237h() {
            return this.f16027h;
        }

        /* renamed from: i */
        public final int m23236i() {
            if (!this.f16032m) {
                m23241d();
            }
            return this.f16034o;
        }

        /* renamed from: j */
        public final int m23235j() {
            if (!this.f16032m) {
                m23241d();
            }
            return this.f16036q;
        }

        /* renamed from: k */
        public final int m23234k() {
            if (!this.f16032m) {
                m23241d();
            }
            return this.f16035p;
        }

        /* renamed from: l */
        public final Rect m23233l() {
            Rect rect = null;
            if (this.f16028i) {
                return null;
            }
            Rect rect2 = this.f16030k;
            if (rect2 != null || this.f16029j) {
                return rect2;
            }
            m23240e();
            Rect rect3 = new Rect();
            int i = this.f16027h;
            Drawable[] drawableArr = this.f16026g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f16029j = true;
            this.f16030k = rect;
            return rect;
        }

        /* renamed from: m */
        public final int m23232m() {
            if (!this.f16032m) {
                m23241d();
            }
            return this.f16033n;
        }

        /* renamed from: n */
        public final int m23231n() {
            if (this.f16037r) {
                return this.f16038s;
            }
            m23240e();
            int i = this.f16027h;
            Drawable[] drawableArr = this.f16026g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f16038s = opacity;
            this.f16037r = true;
            return opacity;
        }

        /* renamed from: o */
        public void mo23214o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.f16026g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f16026g = drawableArr;
        }

        /* renamed from: p */
        void m23230p() {
            this.f16037r = false;
            this.f16039t = false;
        }

        /* renamed from: q */
        public final boolean m23229q() {
            return this.f16031l;
        }

        /* renamed from: r */
        abstract void mo23213r();

        /* renamed from: t */
        public final void m23227t(boolean z) {
            this.f16031l = z;
        }

        /* renamed from: u */
        public final void m23226u(int i) {
            this.f16011A = i;
        }

        /* renamed from: v */
        public final void m23225v(int i) {
            this.f16012B = i;
        }

        /* renamed from: w */
        final boolean m23224w(int i, int i2) {
            int i3 = this.f16027h;
            Drawable[] drawableArr = this.f16026g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean m38864m = Build.VERSION.SDK_INT >= 23 ? C0981a.m38864m(drawableArr[i4], i) : false;
                    if (i4 == i2) {
                        z = m38864m;
                    }
                }
            }
            this.f16045z = i;
            return z;
        }

        /* renamed from: x */
        public final void m23223x(boolean z) {
            this.f16028i = z;
        }

        /* renamed from: y */
        final void m23222y(Resources resources) {
            if (resources != null) {
                this.f16021b = resources;
                int m23252f = C5724b.m23252f(resources, this.f16022c);
                int i = this.f16022c;
                this.f16022c = m23252f;
                if (i != m23252f) {
                    this.f16032m = false;
                    this.f16029j = false;
                }
            }
        }
    }

    /* renamed from: d */
    private void m23254d(Drawable drawable) {
        if (this.f16004H == null) {
            this.f16004H = new C5727c();
        }
        drawable.setCallback(this.f16004H.m23245b(drawable.getCallback()));
        try {
            if (this.f16005w.f16011A <= 0 && this.f15998B) {
                drawable.setAlpha(this.f15997A);
            }
            AbstractC5728d abstractC5728d = this.f16005w;
            if (abstractC5728d.f16015E) {
                drawable.setColorFilter(abstractC5728d.f16014D);
            } else {
                if (abstractC5728d.f16018H) {
                    C0981a.m38862o(drawable, abstractC5728d.f16016F);
                }
                AbstractC5728d abstractC5728d2 = this.f16005w;
                if (abstractC5728d2.f16019I) {
                    C0981a.m38861p(drawable, abstractC5728d2.f16017G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f16005w.f16043x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                C0981a.m38864m(drawable, C0981a.m38871f(this));
            }
            if (i >= 19) {
                C0981a.m38867j(drawable, this.f16005w.f16013C);
            }
            Rect rect = this.f16006x;
            if (i >= 21 && rect != null) {
                C0981a.m38865l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f16004H.m23246a());
        }
    }

    /* renamed from: e */
    private boolean m23253e() {
        return isAutoMirrored() && C0981a.m38871f(this) == 1;
    }

    /* renamed from: f */
    static int m23252f(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m23256a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f15998B = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f16007y
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f16002F
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f15997A
            r3.setAlpha(r9)
            r13.f16002F = r7
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            h.b$d r10 = r13.f16005w
            int r10 = r10.f16011A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f15997A
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f16002F = r7
        L38:
            r3 = r6
        L39:
            android.graphics.drawable.Drawable r9 = r13.f16008z
            if (r9 == 0) goto L61
            long r10 = r13.f16003G
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f16008z = r0
            r13.f16003G = r7
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            h.b$d r4 = r13.f16005w
            int r4 = r4.f16012B
            int r3 = r3 / r4
            int r4 = r13.f15997A
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f16003G = r7
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f16001E
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p125h.C5724b.m23256a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f16005w.m23243b(theme);
    }

    /* renamed from: b */
    AbstractC5728d mo23219b() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m23255c() {
        return this.f15999C;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f16005w.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f16007y;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f16008z;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m23251g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f15999C
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            h.b$d r0 = r9.f16005w
            int r0 = r0.f16012B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f16008z
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f16007y
            if (r0 == 0) goto L29
            r9.f16008z = r0
            h.b$d r0 = r9.f16005w
            int r0 = r0.f16012B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f16003G = r0
            goto L35
        L29:
            r9.f16008z = r4
            r9.f16003G = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f16007y
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            h.b$d r0 = r9.f16005w
            int r1 = r0.f16027h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m23238g(r10)
            r9.f16007y = r0
            r9.f15999C = r10
            if (r0 == 0) goto L5a
            h.b$d r10 = r9.f16005w
            int r10 = r10.f16011A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f16002F = r2
        L51:
            r9.m23254d(r0)
            goto L5a
        L55:
            r9.f16007y = r4
            r10 = -1
            r9.f15999C = r10
        L5a:
            long r0 = r9.f16002F
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f16003G
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f16001E
            if (r10 != 0) goto L73
            h.b$a r10 = new h.b$a
            r10.<init>()
            r9.f16001E = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.m23256a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p125h.C5724b.m23251g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f15997A;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f16005w.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f16005w.m23242c()) {
            this.f16005w.f16023d = getChangingConfigurations();
            return this.f16005w;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f16007y;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f16006x;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f16005w.m23229q()) {
            return this.f16005w.m23236i();
        }
        Drawable drawable = this.f16007y;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f16005w.m23229q()) {
            return this.f16005w.m23232m();
        }
        Drawable drawable = this.f16007y;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f16005w.m23229q()) {
            return this.f16005w.m23235j();
        }
        Drawable drawable = this.f16007y;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f16005w.m23229q()) {
            return this.f16005w.m23234k();
        }
        Drawable drawable = this.f16007y;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f16007y;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f16005w.m23231n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f16007y;
        if (drawable != null) {
            C5726b.m23248b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect m23233l = this.f16005w.m23233l();
        if (m23233l != null) {
            rect.set(m23233l);
            padding = (m23233l.right | ((m23233l.left | m23233l.top) | m23233l.bottom)) != 0;
        } else {
            Drawable drawable = this.f16007y;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (m23253e()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo23218h(AbstractC5728d abstractC5728d) {
        this.f16005w = abstractC5728d;
        int i = this.f15999C;
        if (i >= 0) {
            Drawable m23238g = abstractC5728d.m23238g(i);
            this.f16007y = m23238g;
            if (m23238g != null) {
                m23254d(m23238g);
            }
        }
        this.f16008z = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m23250i(Resources resources) {
        this.f16005w.m23222y(resources);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        AbstractC5728d abstractC5728d = this.f16005w;
        if (abstractC5728d != null) {
            abstractC5728d.m23230p();
        }
        if (drawable != this.f16007y || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f16005w.f16013C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f16008z;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f16008z = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f16007y;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f15998B) {
                this.f16007y.setAlpha(this.f15997A);
            }
        }
        if (this.f16003G != 0) {
            this.f16003G = 0L;
            z = true;
        }
        if (this.f16002F != 0) {
            this.f16002F = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f16000D && super.mutate() == this) {
            AbstractC5728d mo23219b = mo23219b();
            mo23219b.mo23213r();
            mo23218h(mo23219b);
            this.f16000D = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f16008z;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f16007y;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.f16005w.m23224w(i, m23255c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f16008z;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f16007y;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f16008z;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f16007y;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f16007y || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f15998B && this.f15997A == i) {
            return;
        }
        this.f15998B = true;
        this.f15997A = i;
        Drawable drawable = this.f16007y;
        if (drawable != null) {
            if (this.f16002F == 0) {
                drawable.setAlpha(i);
            } else {
                m23256a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        AbstractC5728d abstractC5728d = this.f16005w;
        if (abstractC5728d.f16013C != z) {
            abstractC5728d.f16013C = z;
            Drawable drawable = this.f16007y;
            if (drawable != null) {
                C0981a.m38867j(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC5728d abstractC5728d = this.f16005w;
        abstractC5728d.f16015E = true;
        if (abstractC5728d.f16014D != colorFilter) {
            abstractC5728d.f16014D = colorFilter;
            Drawable drawable = this.f16007y;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        AbstractC5728d abstractC5728d = this.f16005w;
        if (abstractC5728d.f16043x != z) {
            abstractC5728d.f16043x = z;
            Drawable drawable = this.f16007y;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f16007y;
        if (drawable != null) {
            C0981a.m38866k(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f16006x;
        if (rect == null) {
            this.f16006x = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f16007y;
        if (drawable != null) {
            C0981a.m38865l(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        AbstractC5728d abstractC5728d = this.f16005w;
        abstractC5728d.f16018H = true;
        if (abstractC5728d.f16016F != colorStateList) {
            abstractC5728d.f16016F = colorStateList;
            C0981a.m38862o(this.f16007y, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        AbstractC5728d abstractC5728d = this.f16005w;
        abstractC5728d.f16019I = true;
        if (abstractC5728d.f16017G != mode) {
            abstractC5728d.f16017G = mode;
            C0981a.m38861p(this.f16007y, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f16008z;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f16007y;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f16007y || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
