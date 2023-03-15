package androidx.compose.p018ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import id.InterfaceC6108l;
import p181jd.Intrinsics;
import p393v0.AbstractC11073x0;
import p393v0.C10997b;
import p393v0.C11068v;
import p393v0.InterfaceC11052q0;
import p393v0.InterfaceC11064u;

/* compiled from: RenderNodeApi29.android.kt */
/* renamed from: androidx.compose.ui.platform.d1 */
/* loaded from: classes.dex */
public final class C0703d1 implements InterfaceC0756n0 {

    /* renamed from: a */
    private final RenderNode f2225a;

    public C0703d1(AndroidComposeView androidComposeView) {
        Intrinsics.isThisObjectNull(androidComposeView, "ownerView");
        this.f2225a = new RenderNode("Compose");
    }

    /* renamed from: A */
    public int mo39684A() {
        return this.f2225a.getRight();
    }

    /* renamed from: B */
    public boolean mo39683B() {
        return this.f2225a.getClipToOutline();
    }

    /* renamed from: C */
    public void mo39682C(int i) {
        this.f2225a.offsetTopAndBottom(i);
    }

    /* renamed from: D */
    public void mo39681D(boolean z) {
        this.f2225a.setClipToOutline(z);
    }

    /* renamed from: E */
    public boolean mo39680E(boolean z) {
        return this.f2225a.setHasOverlappingRendering(z);
    }

    /* renamed from: F */
    public boolean mo39679F() {
        return this.f2225a.hasDisplayList();
    }

    /* renamed from: G */
    public void mo39678G(Outline outline) {
        this.f2225a.setOutline(outline);
    }

    /* renamed from: H */
    public void mo39677H(Matrix matrix) {
        Intrinsics.isThisObjectNull(matrix, "matrix");
        this.f2225a.getMatrix(matrix);
    }

    /* renamed from: I */
    public float mo39676I() {
        return this.f2225a.getElevation();
    }

    /* renamed from: a */
    public int mo39675a() {
        return this.f2225a.getHeight();
    }

    /* renamed from: b */
    public int mo39674b() {
        return this.f2225a.getWidth();
    }

    /* renamed from: c */
    public void mo39673c(float f) {
        this.f2225a.setAlpha(f);
    }

    /* renamed from: d */
    public void mo39672d(float f) {
        this.f2225a.setRotationY(f);
    }

    /* renamed from: e */
    public void mo39671e(float f) {
        this.f2225a.setRotationZ(f);
    }

    /* renamed from: f */
    public void mo39670f(float f) {
        this.f2225a.setTranslationY(f);
    }

    /* renamed from: g */
    public void mo39669g(float f) {
        this.f2225a.setScaleX(f);
    }

    /* renamed from: h */
    public void mo39668h(AbstractC11073x0 abstractC11073x0) {
        if (Build.VERSION.SDK_INT >= 31) {
            C0710e1.f2240a.m39765a(this.f2225a, abstractC11073x0);
        }
    }

    /* renamed from: i */
    public void mo39667i(float f) {
        this.f2225a.setTranslationX(f);
    }

    /* renamed from: j */
    public void mo39666j(float f) {
        this.f2225a.setScaleY(f);
    }

    /* renamed from: k */
    public float mo39665k() {
        return this.f2225a.getAlpha();
    }

    /* renamed from: l */
    public void mo39664l(float f) {
        this.f2225a.setCameraDistance(f);
    }

    /* renamed from: m */
    public void mo39663m(float f) {
        this.f2225a.setRotationX(f);
    }

    /* renamed from: n */
    public void mo39662n(int i) {
        this.f2225a.offsetLeftAndRight(i);
    }

    /* renamed from: o */
    public int mo39661o() {
        return this.f2225a.getBottom();
    }

    /* renamed from: p */
    public boolean mo39660p() {
        return this.f2225a.getClipToBounds();
    }

    /* renamed from: q */
    public void mo39659q(Canvas canvas) {
        Intrinsics.isThisObjectNull(canvas, "canvas");
        canvas.drawRenderNode(this.f2225a);
    }

    /* renamed from: r */
    public int mo39658r() {
        return this.f2225a.getTop();
    }

    /* renamed from: s */
    public int mo39657s() {
        return this.f2225a.getLeft();
    }

    /* renamed from: t */
    public void mo39656t(float f) {
        this.f2225a.setPivotX(f);
    }

    /* renamed from: u */
    public void mo39655u(boolean z) {
        this.f2225a.setClipToBounds(z);
    }

    /* renamed from: v */
    public boolean mo39654v(int i, int i2, int i3, int i4) {
        return this.f2225a.setPosition(i, i2, i3, i4);
    }

    /* renamed from: w */
    public void mo39653w() {
        this.f2225a.discardDisplayList();
    }

    /* renamed from: x */
    public void mo39652x(C11068v c11068v, InterfaceC11052q0 interfaceC11052q0, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(c11068v, "canvasHolder");
        Intrinsics.isThisObjectNull(interfaceC6108l, "drawBlock");
        RecordingCanvas beginRecording = this.f2225a.beginRecording();
        Intrinsics.checkIfNull(beginRecording, "renderNode.beginRecording()");
        Canvas m6608r = c11068v.m6245a().m6608r();
        c11068v.m6245a().m6606t(beginRecording);
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
        this.f2225a.endRecording();
    }

    /* renamed from: y */
    public void mo39651y(float f) {
        this.f2225a.setPivotY(f);
    }

    /* renamed from: z */
    public void mo39650z(float f) {
        this.f2225a.setElevation(f);
    }
}
