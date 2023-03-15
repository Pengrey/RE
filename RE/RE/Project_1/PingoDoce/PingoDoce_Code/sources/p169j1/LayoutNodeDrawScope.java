package p169j1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p393v0.AbstractC11057s;
import p393v0.ColorFilter;
import p393v0.InterfaceC11025h0;
import p393v0.InterfaceC11052q0;
import p393v0.InterfaceC11064u;
import p433x0.AbstractC12242f;
import p433x0.CanvasDrawScope;
import p433x0.DrawScope;
import p433x0.InterfaceC12238c;
import p433x0.InterfaceC12239d;
import p479z1.EnumC13618o;

/* renamed from: j1.m */
/* loaded from: classes.dex */
public final class LayoutNodeDrawScope implements DrawScope, InterfaceC12238c {

    /* renamed from: w */
    private final CanvasDrawScope f17220w;

    /* renamed from: x */
    private DrawEntity f17221x;

    public LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope) {
        Intrinsics.isThisObjectNull(canvasDrawScope, "canvasDrawScope");
        this.f17220w = canvasDrawScope;
    }

    /* renamed from: k */
    public static final /* synthetic */ CanvasDrawScope m21438k(LayoutNodeDrawScope layoutNodeDrawScope) {
        return layoutNodeDrawScope.f17220w;
    }

    /* renamed from: n */
    public static final /* synthetic */ DrawEntity m21437n(LayoutNodeDrawScope layoutNodeDrawScope) {
        return layoutNodeDrawScope.f17221x;
    }

    /* renamed from: o */
    public static final /* synthetic */ void m21436o(LayoutNodeDrawScope layoutNodeDrawScope, DrawEntity drawEntity) {
        layoutNodeDrawScope.f17221x = drawEntity;
    }

    /* renamed from: A */
    public float m21454A(float f) {
        return this.f17220w.m3319A(f);
    }

    /* renamed from: B */
    public InterfaceC12239d m21453B() {
        return this.f17220w.m3318B();
    }

    /* renamed from: D */
    public void m21452D(long j, float f, long j2, float f2, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i) {
        Intrinsics.isThisObjectNull(abstractC12242f, "style");
        this.f17220w.m3317D(j, f, j2, f2, abstractC12242f, colorFilter, i);
    }

    /* renamed from: E */
    public void m21451E(InterfaceC11025h0 interfaceC11025h0, long j, long j2, long j3, long j4, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i, int i2) {
        Intrinsics.isThisObjectNull(interfaceC11025h0, "image");
        Intrinsics.isThisObjectNull(abstractC12242f, "style");
        this.f17220w.m3316E(interfaceC11025h0, j, j2, j3, j4, f, abstractC12242f, colorFilter, i, i2);
    }

    /* renamed from: H */
    public void m21450H(InterfaceC11052q0 interfaceC11052q0, long j, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i) {
        Intrinsics.isThisObjectNull(interfaceC11052q0, "path");
        Intrinsics.isThisObjectNull(abstractC12242f, "style");
        this.f17220w.m3315H(interfaceC11052q0, j, f, abstractC12242f, colorFilter, i);
    }

    /* renamed from: M */
    public void m21449M(AbstractC11057s abstractC11057s, long j, long j2, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i) {
        Intrinsics.isThisObjectNull(abstractC11057s, "brush");
        Intrinsics.isThisObjectNull(abstractC12242f, "style");
        this.f17220w.m3314M(abstractC11057s, j, j2, f, abstractC12242f, colorFilter, i);
    }

    /* renamed from: N */
    public void m21448N(InterfaceC11052q0 interfaceC11052q0, AbstractC11057s abstractC11057s, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i) {
        Intrinsics.isThisObjectNull(interfaceC11052q0, "path");
        Intrinsics.isThisObjectNull(abstractC11057s, "brush");
        Intrinsics.isThisObjectNull(abstractC12242f, "style");
        this.f17220w.m3313N(interfaceC11052q0, abstractC11057s, f, abstractC12242f, colorFilter, i);
    }

    /* renamed from: O */
    public int m21447O(float f) {
        return this.f17220w.m3312O(f);
    }

    /* renamed from: Q */
    public long m21446Q() {
        return this.f17220w.m3311Q();
    }

    /* renamed from: R */
    public void m21445R(long j, long j2, long j3, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i) {
        Intrinsics.isThisObjectNull(abstractC12242f, "style");
        this.f17220w.m3310R(j, j2, j3, f, abstractC12242f, colorFilter, i);
    }

    /* renamed from: U */
    public long m21444U(long j) {
        return this.f17220w.m3309U(j);
    }

    /* renamed from: X */
    public void m21443X(AbstractC11057s abstractC11057s, long j, long j2, long j3, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i) {
        Intrinsics.isThisObjectNull(abstractC11057s, "brush");
        Intrinsics.isThisObjectNull(abstractC12242f, "style");
        this.f17220w.m3308X(abstractC11057s, j, j2, j3, f, abstractC12242f, colorFilter, i);
    }

    /* renamed from: Y */
    public float m21442Y(long j) {
        return this.f17220w.m3307Y(j);
    }

    /* renamed from: a */
    public long m21441a() {
        return this.f17220w.m3306a();
    }

    /* renamed from: d0 */
    public void m21440d0(long j, long j2, long j3, long j4, AbstractC12242f abstractC12242f, float f, ColorFilter colorFilter, int i) {
        Intrinsics.isThisObjectNull(abstractC12242f, "style");
        this.f17220w.m3305d0(j, j2, j3, j4, abstractC12242f, f, colorFilter, i);
    }

    /* renamed from: g0 */
    public void mo3277g0() {
        InterfaceC11064u mo3275b = m3272B().mo3275b();
        DrawEntity drawEntity = this.f17221x;
        Intrinsics.ifNullDoSomething(drawEntity);
        DrawEntity m21684i = drawEntity.m21684i();
        if (m21684i != null) {
            m21684i.m21688e(mo3275b);
        } else {
            drawEntity.m21686g().m21421B1(mo3275b);
        }
    }

    public float getDensity() {
        return this.f17220w.getDensity();
    }

    public EnumC13618o getLayoutDirection() {
        return this.f17220w.getLayoutDirection();
    }

    /* renamed from: i0 */
    public float m21439i0(int i) {
        return this.f17220w.m3304i0(i);
    }

    /* renamed from: r */
    public float m21435r() {
        return this.f17220w.m3298r();
    }

    public /* synthetic */ LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
