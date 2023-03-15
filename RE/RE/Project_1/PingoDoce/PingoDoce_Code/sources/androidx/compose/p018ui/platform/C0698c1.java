package androidx.compose.p018ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import id.InterfaceC6108l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p393v0.AbstractC11073x0;
import p393v0.C10997b;
import p393v0.C11068v;
import p393v0.InterfaceC11052q0;
import p393v0.InterfaceC11064u;

/* compiled from: RenderNodeApi23.android.kt */
/* renamed from: androidx.compose.ui.platform.c1 */
/* loaded from: classes.dex */
public final class C0698c1 implements InterfaceC0756n0 {

    /* renamed from: i */
    private static boolean f2211i;

    /* renamed from: a */
    private final AndroidComposeView f2213a;

    /* renamed from: b */
    private final RenderNode f2214b;

    /* renamed from: c */
    private int f2215c;

    /* renamed from: d */
    private int f2216d;

    /* renamed from: e */
    private int f2217e;

    /* renamed from: f */
    private int f2218f;

    /* renamed from: g */
    private boolean f2219g;

    /* renamed from: h */
    public static final C0699a f2210h = new C0699a(null);

    /* renamed from: j */
    private static boolean f2212j = true;

    /* compiled from: RenderNodeApi23.android.kt */
    /* renamed from: androidx.compose.ui.platform.c1$a */
    /* loaded from: classes.dex */
    public static final class C0699a {
        private C0699a() {
        }

        public /* synthetic */ C0699a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C0698c1(AndroidComposeView androidComposeView) {
        Intrinsics.isThisObjectNull(androidComposeView, "ownerView");
        this.f2213a = androidComposeView;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        Intrinsics.checkIfNull(create, "create(\"Compose\", ownerView)");
        this.f2214b = create;
        if (f2212j) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            create.discardDisplayList();
            f2212j = false;
        }
        if (f2211i) {
            throw new NoClassDefFoundError();
        }
    }

    /* renamed from: A */
    public int mo39684A() {
        return this.f2217e;
    }

    /* renamed from: B */
    public boolean mo39683B() {
        return this.f2214b.getClipToOutline();
    }

    /* renamed from: C */
    public void mo39682C(int i) {
        m39779M(mo39658r() + i);
        m39782J(mo39661o() + i);
        this.f2214b.offsetTopAndBottom(i);
    }

    /* renamed from: D */
    public void mo39681D(boolean z) {
        this.f2214b.setClipToOutline(z);
    }

    /* renamed from: E */
    public boolean mo39680E(boolean z) {
        return this.f2214b.setHasOverlappingRendering(z);
    }

    /* renamed from: F */
    public boolean mo39679F() {
        return this.f2214b.isValid();
    }

    /* renamed from: G */
    public void mo39678G(Outline outline) {
        this.f2214b.setOutline(outline);
    }

    /* renamed from: H */
    public void mo39677H(Matrix matrix) {
        Intrinsics.isThisObjectNull(matrix, "matrix");
        this.f2214b.getMatrix(matrix);
    }

    /* renamed from: I */
    public float mo39676I() {
        return this.f2214b.getElevation();
    }

    /* renamed from: J */
    public void m39782J(int i) {
        this.f2218f = i;
    }

    /* renamed from: K */
    public void m39781K(int i) {
        this.f2215c = i;
    }

    /* renamed from: L */
    public void m39780L(int i) {
        this.f2217e = i;
    }

    /* renamed from: M */
    public void m39779M(int i) {
        this.f2216d = i;
    }

    /* renamed from: a */
    public int mo39675a() {
        return mo39661o() - mo39658r();
    }

    /* renamed from: b */
    public int mo39674b() {
        return mo39684A() - mo39657s();
    }

    /* renamed from: c */
    public void mo39673c(float f) {
        this.f2214b.setAlpha(f);
    }

    /* renamed from: d */
    public void mo39672d(float f) {
        this.f2214b.setRotationY(f);
    }

    /* renamed from: e */
    public void mo39671e(float f) {
        this.f2214b.setRotation(f);
    }

    /* renamed from: f */
    public void mo39670f(float f) {
        this.f2214b.setTranslationY(f);
    }

    /* renamed from: g */
    public void mo39669g(float f) {
        this.f2214b.setScaleX(f);
    }

    /* renamed from: h */
    public void mo39668h(AbstractC11073x0 abstractC11073x0) {
    }

    /* renamed from: i */
    public void mo39667i(float f) {
        this.f2214b.setTranslationX(f);
    }

    /* renamed from: j */
    public void mo39666j(float f) {
        this.f2214b.setScaleY(f);
    }

    /* renamed from: k */
    public float mo39665k() {
        return this.f2214b.getAlpha();
    }

    /* renamed from: l */
    public void mo39664l(float f) {
        this.f2214b.setCameraDistance(-f);
    }

    /* renamed from: m */
    public void mo39663m(float f) {
        this.f2214b.setRotationX(f);
    }

    /* renamed from: n */
    public void mo39662n(int i) {
        m39781K(mo39657s() + i);
        m39780L(mo39684A() + i);
        this.f2214b.offsetLeftAndRight(i);
    }

    /* renamed from: o */
    public int mo39661o() {
        return this.f2218f;
    }

    /* renamed from: p */
    public boolean mo39660p() {
        return this.f2219g;
    }

    /* renamed from: q */
    public void mo39659q(Canvas canvas) {
        Intrinsics.isThisObjectNull(canvas, "canvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f2214b);
    }

    /* renamed from: r */
    public int mo39658r() {
        return this.f2216d;
    }

    /* renamed from: s */
    public int mo39657s() {
        return this.f2215c;
    }

    /* renamed from: t */
    public void mo39656t(float f) {
        this.f2214b.setPivotX(f);
    }

    /* renamed from: u */
    public void mo39655u(boolean z) {
        this.f2219g = z;
        this.f2214b.setClipToBounds(z);
    }

    /* renamed from: v */
    public boolean mo39654v(int i, int i2, int i3, int i4) {
        m39781K(i);
        m39779M(i2);
        m39780L(i3);
        m39782J(i4);
        return this.f2214b.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: w */
    public void mo39653w() {
        this.f2214b.discardDisplayList();
    }

    /* renamed from: x */
    public void mo39652x(C11068v c11068v, InterfaceC11052q0 interfaceC11052q0, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(c11068v, "canvasHolder");
        Intrinsics.isThisObjectNull(interfaceC6108l, "drawBlock");
        DisplayListCanvas start = this.f2214b.start(mo39674b(), mo39675a());
        Intrinsics.checkIfNull(start, "renderNode.start(width, height)");
        Canvas m6608r = c11068v.m6245a().m6608r();
        c11068v.m6245a().m6606t((Canvas) start);
        C10997b m6245a = c11068v.m6245a();
        if (interfaceC11052q0 != null) {
            m6245a.m6269h();
            InterfaceC11064u.C11065a.m6260a(m6245a, interfaceC11052q0, 0, 2, null);
        }
        interfaceC6108l.mo9587d(m6245a);
        if (interfaceC11052q0 != null) {
            m6245a.m6270g();
        }
        c11068v.m6245a().m6606t(m6608r);
        this.f2214b.end(start);
    }

    /* renamed from: y */
    public void mo39651y(float f) {
        this.f2214b.setPivotY(f);
    }

    /* renamed from: z */
    public void mo39650z(float f) {
        this.f2214b.setElevation(f);
    }
}
