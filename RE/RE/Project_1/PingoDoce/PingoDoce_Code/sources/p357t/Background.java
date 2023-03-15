package p357t;

import androidx.compose.p018ui.platform.AbstractC0820x0;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p070e.C4906j;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p346s0.InterfaceC10024e;
import p373u0.C10781l;
import p393v0.AbstractC11057s;
import p393v0.C11043n0;
import p393v0.Color;
import p393v0.InterfaceC11001b1;
import p393v0.Outline;
import p393v0.RectangleShape;
import p433x0.DrawScope;
import p433x0.InterfaceC12238c;
import p479z1.EnumC13618o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: t.a */
/* loaded from: classes.dex */
public final class Background extends AbstractC0820x0 implements InterfaceC10024e {

    /* renamed from: A */
    private final InterfaceC11001b1 f26709A;

    /* renamed from: B */
    private C10781l f26710B;

    /* renamed from: C */
    private EnumC13618o f26711C;

    /* renamed from: D */
    private Outline f26712D;

    /* renamed from: x */
    private final Color f26713x;

    /* renamed from: y */
    private final AbstractC11057s f26714y;

    /* renamed from: z */
    private final float f26715z;

    public /* synthetic */ Background(Color color, AbstractC11057s abstractC11057s, float f, InterfaceC11001b1 interfaceC11001b1, InterfaceC6108l interfaceC6108l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : color, (i & 2) != 0 ? null : abstractC11057s, (i & 4) != 0 ? 1.0f : f, interfaceC11001b1, interfaceC6108l, null);
    }

    public /* synthetic */ Background(Color color, AbstractC11057s abstractC11057s, float f, InterfaceC11001b1 interfaceC11001b1, InterfaceC6108l interfaceC6108l, DefaultConstructorMarker defaultConstructorMarker) {
        this(color, abstractC11057s, f, interfaceC11001b1, interfaceC6108l);
    }

    /* renamed from: b */
    private final void m8386b(InterfaceC12238c interfaceC12238c) {
        Outline mo6599a;
        if (C10781l.m7095e(interfaceC12238c.m3263a(), this.f26710B) && interfaceC12238c.getLayoutDirection() == this.f26711C) {
            mo6599a = this.f26712D;
            Intrinsics.ifNullDoSomething(mo6599a);
        } else {
            mo6599a = this.f26709A.mo6599a(interfaceC12238c.m3263a(), interfaceC12238c.getLayoutDirection(), interfaceC12238c);
        }
        Color color = this.f26713x;
        if (color != null) {
            color.m6638v();
            C11043n0.m6416e(interfaceC12238c, mo6599a, this.f26713x.m6638v(), 0.0f, null, null, 0, 60, null);
        }
        AbstractC11057s abstractC11057s = this.f26714y;
        if (abstractC11057s != null) {
            C11043n0.m6418c(interfaceC12238c, mo6599a, abstractC11057s, this.f26715z, null, null, 0, 56, null);
        }
        this.f26712D = mo6599a;
        this.f26710B = C10781l.m7097c(interfaceC12238c.m3263a());
    }

    /* renamed from: c */
    private final void m8385c(InterfaceC12238c interfaceC12238c) {
        Color color = this.f26713x;
        if (color != null) {
            DrawScope.C12241b.m3255e(interfaceC12238c, color.m6638v(), 0L, 0L, 0.0f, null, null, 0, C4906j.f13420I0, null);
        }
        AbstractC11057s abstractC11057s = this.f26714y;
        if (abstractC11057s == null) {
            return;
        }
        DrawScope.C12241b.m3256d(interfaceC12238c, abstractC11057s, 0L, 0L, this.f26715z, null, null, 0, C4906j.f13380A0, null);
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return InterfaceC10024e.C10025a.m9376a(this, interfaceC6108l);
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return InterfaceC10024e.C10025a.m9374c(this, obj, interfaceC6112p);
    }

    public boolean equals(Object obj) {
        Background background = obj instanceof Background ? (Background) obj : null;
        if (background != null && Intrinsics.equals(this.f26713x, background.f26713x) && Intrinsics.equals(this.f26714y, background.f26714y)) {
            return ((this.f26715z > background.f26715z ? 1 : (this.f26715z == background.f26715z ? 0 : -1)) == 0) && Intrinsics.equals(this.f26709A, background.f26709A);
        }
        return false;
    }

    public int hashCode() {
        Color color = this.f26713x;
        int m6640t = (color == null ? 0 : Color.m6640t(color.m6638v())) * 31;
        AbstractC11057s abstractC11057s = this.f26714y;
        return ((((m6640t + (abstractC11057s != null ? abstractC11057s.hashCode() : 0)) * 31) + Float.hashCode(this.f26715z)) * 31) + this.f26709A.hashCode();
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        return InterfaceC10024e.C10025a.m9375b(this, obj, interfaceC6112p);
    }

    /* renamed from: p */
    public void m8384p(InterfaceC12238c interfaceC12238c) {
        Intrinsics.isThisObjectNull(interfaceC12238c, "<this>");
        if (this.f26709A == RectangleShape.m6240a()) {
            m8385c(interfaceC12238c);
        } else {
            m8386b(interfaceC12238c);
        }
        interfaceC12238c.mo3277g0();
    }

    public String toString() {
        return "Background(color=" + this.f26713x + ", brush=" + this.f26714y + ", alpha = " + this.f26715z + ", shape=" + this.f26709A + ')';
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return InterfaceC10024e.C10025a.m9373d(this, interfaceC9570f);
    }

    private Background(Color color, AbstractC11057s abstractC11057s, float f, InterfaceC11001b1 interfaceC11001b1, InterfaceC6108l interfaceC6108l) {
        super(interfaceC6108l);
        this.f26713x = color;
        this.f26714y = abstractC11057s;
        this.f26715z = f;
        this.f26709A = interfaceC11001b1;
    }
}
