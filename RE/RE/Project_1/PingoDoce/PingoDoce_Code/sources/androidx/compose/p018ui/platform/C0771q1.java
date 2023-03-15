package androidx.compose.p018ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p169j1.InterfaceC6250e0;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p373u0.C10773d;
import p373u0.C10774f;
import p373u0.C10783m;
import p393v0.AbstractC11073x0;
import p393v0.C10997b;
import p393v0.C11022g1;
import p393v0.C11068v;
import p393v0.InterfaceC11001b1;
import p393v0.InterfaceC11052q0;
import p393v0.InterfaceC11064u;
import p393v0.RectangleShape;
import p468yc.C13195u;
import p479z1.C13612k;
import p479z1.C13615m;
import p479z1.Density;
import p479z1.EnumC13618o;

/* compiled from: ViewLayer.android.kt */
/* renamed from: androidx.compose.ui.platform.q1 */
/* loaded from: classes.dex */
public final class C0771q1 extends View implements InterfaceC6250e0 {

    /* renamed from: I */
    public static final C0774c f2338I = new C0774c(null);

    /* renamed from: J */
    private static final InterfaceC6112p f2339J = C0773b.f2357w;

    /* renamed from: K */
    private static final ViewOutlineProvider f2340K = new C0772a();

    /* renamed from: L */
    private static Method f2341L;

    /* renamed from: M */
    private static Field f2342M;

    /* renamed from: N */
    private static boolean f2343N;

    /* renamed from: O */
    private static boolean f2344O;

    /* renamed from: A */
    private final C0688b1 f2345A;

    /* renamed from: B */
    private boolean f2346B;

    /* renamed from: C */
    private Rect f2347C;

    /* renamed from: D */
    private boolean f2348D;

    /* renamed from: E */
    private boolean f2349E;

    /* renamed from: F */
    private final C11068v f2350F;

    /* renamed from: G */
    private final LayerMatrixCache f2351G;

    /* renamed from: H */
    private long f2352H;

    /* renamed from: w */
    private final AndroidComposeView f2353w;

    /* renamed from: x */
    private final C0778r0 f2354x;

    /* renamed from: y */
    private InterfaceC6108l f2355y;

    /* renamed from: z */
    private InterfaceC6097a f2356z;

    /* compiled from: ViewLayer.android.kt */
    /* renamed from: androidx.compose.ui.platform.q1$a */
    /* loaded from: classes.dex */
    public static final class C0772a extends ViewOutlineProvider {
        C0772a() {
        }

        public void getOutline(View view, Outline outline) {
            Intrinsics.isThisObjectNull(view, "view");
            Intrinsics.isThisObjectNull(outline, "outline");
            Outline m39822c = C0771q1.m39627l((C0771q1) view).m39822c();
            Intrinsics.ifNullDoSomething(m39822c);
            outline.set(m39822c);
        }
    }

    /* compiled from: ViewLayer.android.kt */
    /* renamed from: androidx.compose.ui.platform.q1$b */
    /* loaded from: classes.dex */
    static final class C0773b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C0773b f2357w = new C0773b();

        C0773b() {
            super(2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m39616a((View) obj, (Matrix) obj2);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m39616a(View view, Matrix matrix) {
            Intrinsics.isThisObjectNull(view, "view");
            Intrinsics.isThisObjectNull(matrix, "matrix");
            matrix.set(view.getMatrix());
        }
    }

    /* compiled from: ViewLayer.android.kt */
    /* renamed from: androidx.compose.ui.platform.q1$c */
    /* loaded from: classes.dex */
    public static final class C0774c {
        private C0774c() {
        }

        public /* synthetic */ C0774c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean m39615a() {
            return C0771q1.m39628k();
        }

        /* renamed from: b */
        public final boolean m39614b() {
            return C0771q1.m39625n();
        }

        /* renamed from: c */
        public final void m39613c(boolean z) {
            C0771q1.m39621r(z);
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: d */
        public final void m39612d(View view) {
            Intrinsics.isThisObjectNull(view, "view");
            try {
                if (!m39615a()) {
                    C0771q1.m39623p(true);
                    if (Build.VERSION.SDK_INT < 28) {
                        C0771q1.m39620s(View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]));
                        C0771q1.m39622q(View.class.getDeclaredField("mRecreateDisplayList"));
                    } else {
                        C0771q1.m39620s((Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]));
                        C0771q1.m39622q((Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList"));
                    }
                    Method m39624o = C0771q1.m39624o();
                    if (m39624o != null) {
                        m39624o.setAccessible(true);
                    }
                    Field m39626m = C0771q1.m39626m();
                    if (m39626m != null) {
                        m39626m.setAccessible(true);
                    }
                }
                Field m39626m2 = C0771q1.m39626m();
                if (m39626m2 != null) {
                    m39626m2.setBoolean(view, true);
                }
                Method m39624o2 = C0771q1.m39624o();
                if (m39624o2 == null) {
                    return;
                }
                m39624o2.invoke(view, new Object[0]);
            } catch (Throwable unused) {
                m39613c(true);
            }
        }
    }

    /* compiled from: ViewLayer.android.kt */
    /* renamed from: androidx.compose.ui.platform.q1$d */
    /* loaded from: classes.dex */
    private static final class C0775d {

        /* renamed from: a */
        public static final C0776a f2358a = new C0776a(null);

        /* compiled from: ViewLayer.android.kt */
        /* renamed from: androidx.compose.ui.platform.q1$d$a */
        /* loaded from: classes.dex */
        public static final class C0776a {
            private C0776a() {
            }

            public /* synthetic */ C0776a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final long m39611a(View view) {
                Intrinsics.isThisObjectNull(view, "view");
                return view.getUniqueDrawingId();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0771q1(AndroidComposeView androidComposeView, C0778r0 c0778r0, InterfaceC6108l interfaceC6108l, InterfaceC6097a interfaceC6097a) {
        super(androidComposeView.getContext());
        Intrinsics.isThisObjectNull(androidComposeView, "ownerView");
        Intrinsics.isThisObjectNull(c0778r0, "container");
        Intrinsics.isThisObjectNull(interfaceC6108l, "drawBlock");
        Intrinsics.isThisObjectNull(interfaceC6097a, "invalidateParentLayer");
        this.f2353w = androidComposeView;
        this.f2354x = c0778r0;
        this.f2355y = interfaceC6108l;
        this.f2356z = interfaceC6097a;
        this.f2345A = new C0688b1(androidComposeView.getDensity());
        this.f2350F = new C11068v();
        this.f2351G = new LayerMatrixCache(f2339J);
        this.f2352H = C11022g1.f28371b.m6480a();
        setWillNotDraw(false);
        setId(View.generateViewId());
        c0778r0.addView(this);
    }

    private final InterfaceC11052q0 getManualClipPath() {
        if (!getClipToOutline() || this.f2345A.m39821d()) {
            return null;
        }
        return this.f2345A.m39823b();
    }

    /* renamed from: k */
    public static final /* synthetic */ boolean m39628k() {
        return f2343N;
    }

    /* renamed from: l */
    public static final /* synthetic */ C0688b1 m39627l(C0771q1 c0771q1) {
        return c0771q1.f2345A;
    }

    /* renamed from: m */
    public static final /* synthetic */ Field m39626m() {
        return f2342M;
    }

    /* renamed from: n */
    public static final /* synthetic */ boolean m39625n() {
        return f2344O;
    }

    /* renamed from: o */
    public static final /* synthetic */ Method m39624o() {
        return f2341L;
    }

    /* renamed from: p */
    public static final /* synthetic */ void m39623p(boolean z) {
        f2343N = z;
    }

    /* renamed from: q */
    public static final /* synthetic */ void m39622q(Field field) {
        f2342M = field;
    }

    /* renamed from: r */
    public static final /* synthetic */ void m39621r(boolean z) {
        f2344O = z;
    }

    /* renamed from: s */
    public static final /* synthetic */ void m39620s(Method method) {
        f2341L = method;
    }

    private final void setInvalidated(boolean z) {
        if (z != this.f2348D) {
            this.f2348D = z;
            this.f2353w.m39901Y(this, z);
        }
    }

    /* renamed from: u */
    private final void m39618u() {
        Rect rect;
        if (this.f2346B) {
            Rect rect2 = this.f2347C;
            if (rect2 == null) {
                this.f2347C = new Rect(0, 0, getWidth(), getHeight());
            } else {
                Intrinsics.ifNullDoSomething(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f2347C;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    /* renamed from: v */
    private final void m39617v() {
        setOutlineProvider(this.f2345A.m39822c() != null ? f2340K : null);
    }

    /* renamed from: a */
    public void mo21676a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC11001b1 interfaceC11001b1, boolean z, AbstractC11073x0 abstractC11073x0, EnumC13618o enumC13618o, Density density) {
        InterfaceC6097a interfaceC6097a;
        Intrinsics.isThisObjectNull(interfaceC11001b1, "shape");
        Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
        Intrinsics.isThisObjectNull(density, "density");
        this.f2352H = j;
        setScaleX(f);
        setScaleY(f2);
        setAlpha(f3);
        setTranslationX(f4);
        setTranslationY(f5);
        setElevation(f6);
        setRotation(f9);
        setRotationX(f7);
        setRotationY(f8);
        setPivotX(C11022g1.m6485f(this.f2352H) * getWidth());
        setPivotY(C11022g1.m6484g(this.f2352H) * getHeight());
        setCameraDistancePx(f10);
        this.f2346B = z && interfaceC11001b1 == RectangleShape.m6240a();
        m39618u();
        boolean z2 = getManualClipPath() != null;
        setClipToOutline(z && interfaceC11001b1 != RectangleShape.m6240a());
        boolean m39818g = this.f2345A.m39818g(interfaceC11001b1, getAlpha(), getClipToOutline(), getElevation(), enumC13618o, density);
        m39617v();
        boolean z3 = getManualClipPath() != null;
        if (z2 != z3 || (z3 && m39818g)) {
            invalidate();
        }
        if (!this.f2349E && getElevation() > 0.0f && (interfaceC6097a = this.f2356z) != null) {
            interfaceC6097a.mo42214q();
        }
        this.f2351G.m39830c();
        if (Build.VERSION.SDK_INT >= 31) {
            C0800s1.f2416a.m39529a(this, abstractC11073x0);
        }
    }

    /* renamed from: b */
    public long mo21675b(long j, boolean z) {
        if (z) {
            float[] m39832a = this.f2351G.m39832a(this);
            C10774f m7152d = m39832a == null ? null : C10774f.m7152d(p393v0.Matrix.m6434c(m39832a, j));
            return m7152d == null ? C10774f.f27866b.m7136a() : m7152d.m7137s();
        }
        return p393v0.Matrix.m6434c(this.f2351G.m39831b(this), j);
    }

    /* renamed from: c */
    public void mo21674c(InterfaceC11064u interfaceC11064u) {
        Intrinsics.isThisObjectNull(interfaceC11064u, "canvas");
        boolean z = getElevation() > 0.0f;
        this.f2349E = z;
        if (z) {
            interfaceC11064u.m6263n();
        }
        this.f2354x.m39610a(interfaceC11064u, this, getDrawingTime());
        if (this.f2349E) {
            interfaceC11064u.m6267j();
        }
    }

    /* renamed from: d */
    public void mo21673d(InterfaceC6108l interfaceC6108l, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "drawBlock");
        Intrinsics.isThisObjectNull(interfaceC6097a, "invalidateParentLayer");
        if (Build.VERSION.SDK_INT < 23 && !f2344O) {
            setVisibility(0);
        } else {
            this.f2354x.addView(this);
        }
        this.f2346B = false;
        this.f2349E = false;
        this.f2352H = C11022g1.f28371b.m6480a();
        this.f2355y = interfaceC6108l;
        this.f2356z = interfaceC6097a;
    }

    protected void dispatchDraw(Canvas canvas) {
        Intrinsics.isThisObjectNull(canvas, "canvas");
        boolean z = false;
        setInvalidated(false);
        C11068v c11068v = this.f2350F;
        Canvas m6608r = c11068v.m6245a().m6608r();
        c11068v.m6245a().m6606t(canvas);
        C10997b m6245a = c11068v.m6245a();
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            z = true;
            m6245a.m6269h();
            this.f2345A.m39824a(m6245a);
        }
        InterfaceC6108l interfaceC6108l = this.f2355y;
        if (interfaceC6108l != null) {
            interfaceC6108l.mo9587d(m6245a);
        }
        if (z) {
            m6245a.m6270g();
        }
        c11068v.m6245a().m6606t(m6608r);
    }

    /* renamed from: e */
    public void mo21672e(long j) {
        int m824g = C13615m.m824g(j);
        int m825f = C13615m.m825f(j);
        if (m824g == getWidth() && m825f == getHeight()) {
            return;
        }
        float f = m824g;
        setPivotX(C11022g1.m6485f(this.f2352H) * f);
        float f2 = m825f;
        setPivotY(C11022g1.m6484g(this.f2352H) * f2);
        this.f2345A.m39817h(C10783m.m7085a(f, f2));
        m39617v();
        layout(getLeft(), getTop(), getLeft() + m824g, getTop() + m825f);
        m39618u();
        this.f2351G.m39830c();
    }

    /* renamed from: f */
    public void mo21671f(C10773d c10773d, boolean z) {
        Intrinsics.isThisObjectNull(c10773d, "rect");
        if (z) {
            float[] m39832a = this.f2351G.m39832a(this);
            if (m39832a != null) {
                p393v0.Matrix.m6433d(m39832a, c10773d);
                return;
            } else {
                c10773d.m7161g(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
        }
        p393v0.Matrix.m6433d(this.f2351G.m39831b(this), c10773d);
    }

    public void forceLayout() {
    }

    /* renamed from: g */
    public void mo21670g() {
        setInvalidated(false);
        this.f2353w.m39894f0();
        this.f2355y = null;
        this.f2356z = null;
        boolean m39895e0 = this.f2353w.m39895e0(this);
        if (Build.VERSION.SDK_INT < 23 && !f2344O && m39895e0) {
            setVisibility(8);
        } else {
            this.f2354x.removeViewInLayout(this);
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final C0778r0 getContainer() {
        return this.f2354x;
    }

    public long getLayerId() {
        return getId();
    }

    public final AndroidComposeView getOwnerView() {
        return this.f2353w;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C0775d.f2358a.m39611a(this.f2353w);
        }
        return -1L;
    }

    /* renamed from: h */
    public void mo21669h(long j) {
        int m839h = C13612k.m839h(j);
        if (m839h != getLeft()) {
            offsetLeftAndRight(m839h - getLeft());
            this.f2351G.m39830c();
        }
        int m838i = C13612k.m838i(j);
        if (m838i != getTop()) {
            offsetTopAndBottom(m838i - getTop());
            this.f2351G.m39830c();
        }
    }

    /* renamed from: i */
    public void mo21668i() {
        if (!this.f2348D || f2344O) {
            return;
        }
        setInvalidated(false);
        f2338I.m39612d(this);
    }

    public void invalidate() {
        if (this.f2348D) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f2353w.invalidate();
    }

    /* renamed from: j */
    public boolean mo21667j(long j) {
        float m7145k = C10774f.m7145k(j);
        float m7144l = C10774f.m7144l(j);
        if (this.f2346B) {
            return 0.0f <= m7145k && m7145k < ((float) getWidth()) && 0.0f <= m7144l && m7144l < ((float) getHeight());
        } else if (getClipToOutline()) {
            return this.f2345A.m39820e(j);
        } else {
            return true;
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    /* renamed from: t */
    public final boolean m39619t() {
        return this.f2348D;
    }
}
