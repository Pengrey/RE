package p410w;

import androidx.compose.p018ui.platform.AbstractC0820x0;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p127h1.AbstractC5743a;
import p127h1.InterfaceC5803r;
import p127h1.InterfaceC5805t;
import p127h1.LayoutModifier;
import p127h1.MeasureScope;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p479z1.C13605g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AlignmentLine.kt */
/* renamed from: w.b */
/* loaded from: classes.dex */
public final class C11411b extends AbstractC0820x0 implements LayoutModifier {

    /* renamed from: x */
    private final AbstractC5743a f29291x;

    /* renamed from: y */
    private final float f29292y;

    /* renamed from: z */
    private final float f29293z;

    private C11411b(AbstractC5743a abstractC5743a, float f, float f2, InterfaceC6108l interfaceC6108l) {
        super(interfaceC6108l);
        this.f29291x = abstractC5743a;
        this.f29292y = f;
        this.f29293z = f2;
        if (!((m5187c() >= 0.0f || C13605g.m873i(m5187c(), C13605g.f34597x.m868b())) && (m5188b() >= 0.0f || C13605g.m873i(m5188b(), C13605g.f34597x.m868b())))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number".toString());
        }
    }

    public /* synthetic */ C11411b(AbstractC5743a abstractC5743a, float f, float f2, InterfaceC6108l interfaceC6108l, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5743a, f, f2, interfaceC6108l);
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return LayoutModifier.C5802a.m23011a(this, interfaceC6108l);
    }

    /* renamed from: S */
    public InterfaceC5805t m5190S(MeasureScope measureScope, InterfaceC5803r interfaceC5803r, long j) {
        Intrinsics.isThisObjectNull(measureScope, "$receiver");
        Intrinsics.isThisObjectNull(interfaceC5803r, "measurable");
        return C11406a.m5217a(measureScope, this.f29291x, m5187c(), m5188b(), interfaceC5803r, j);
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return LayoutModifier.C5802a.m23009c(this, obj, interfaceC6112p);
    }

    /* renamed from: b */
    public final float m5188b() {
        return this.f29293z;
    }

    /* renamed from: c */
    public final float m5187c() {
        return this.f29292y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C11411b c11411b = obj instanceof C11411b ? (C11411b) obj : null;
        if (c11411b == null) {
            return false;
        }
        return Intrinsics.equals(this.f29291x, c11411b.f29291x) && C13605g.m873i(m5187c(), c11411b.m5187c()) && C13605g.m873i(m5188b(), c11411b.m5188b());
    }

    public int hashCode() {
        return (((this.f29291x.hashCode() * 31) + C13605g.m872j(m5187c())) * 31) + C13605g.m872j(m5188b());
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        return LayoutModifier.C5802a.m23010b(this, obj, interfaceC6112p);
    }

    public String toString() {
        return "AlignmentLineOffset(alignmentLine=" + this.f29291x + ", before=" + ((Object) C13605g.m871k(m5187c())) + ", after=" + ((Object) C13605g.m871k(m5188b())) + ')';
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return LayoutModifier.C5802a.m23008d(this, interfaceC9570f);
    }
}
