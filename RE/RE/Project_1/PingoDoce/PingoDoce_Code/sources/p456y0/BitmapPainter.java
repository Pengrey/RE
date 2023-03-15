package p456y0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p220ld.C7037c;
import p373u0.C10781l;
import p393v0.C11007d0;
import p393v0.ColorFilter;
import p393v0.InterfaceC11025h0;
import p433x0.DrawScope;
import p479z1.C13612k;
import p479z1.C13615m;
import p479z1.C13617n;

/* renamed from: y0.a */
/* loaded from: classes.dex */
public final class BitmapPainter extends Painter {

    /* renamed from: f */
    private final InterfaceC11025h0 f33948f;

    /* renamed from: g */
    private final long f33949g;

    /* renamed from: h */
    private final long f33950h;

    /* renamed from: i */
    private int f33951i;

    /* renamed from: j */
    private final long f33952j;

    /* renamed from: k */
    private float f33953k;

    /* renamed from: l */
    private ColorFilter f33954l;

    public /* synthetic */ BitmapPainter(InterfaceC11025h0 interfaceC11025h0, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC11025h0, (i & 2) != 0 ? C13612k.f34607b.m834a() : j, (i & 4) != 0 ? C13617n.m819a(interfaceC11025h0.mo6478b(), interfaceC11025h0.mo6479a()) : j2, null);
    }

    public /* synthetic */ BitmapPainter(InterfaceC11025h0 interfaceC11025h0, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC11025h0, j, j2);
    }

    /* renamed from: l */
    private final long m1768l(long j, long j2) {
        if (C13612k.m839h(j) >= 0 && C13612k.m838i(j) >= 0 && C13615m.m824g(j2) >= 0 && C13615m.m825f(j2) >= 0 && C13615m.m824g(j2) <= this.f33948f.mo6478b() && C13615m.m825f(j2) <= this.f33948f.mo6479a()) {
            return j2;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: a */
    protected boolean m1773a(float f) {
        this.f33953k = f;
        return true;
    }

    /* renamed from: b */
    protected boolean m1772b(ColorFilter colorFilter) {
        this.f33954l = colorFilter;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BitmapPainter) {
            BitmapPainter bitmapPainter = (BitmapPainter) obj;
            return Intrinsics.equals(this.f33948f, bitmapPainter.f33948f) && C13612k.m840g(this.f33949g, bitmapPainter.f33949g) && C13615m.m826e(this.f33950h, bitmapPainter.f33950h) && C11007d0.m6559d(m1769k(), bitmapPainter.m1769k());
        }
        return false;
    }

    /* renamed from: h */
    public long m1771h() {
        return C13617n.m818b(this.f33952j);
    }

    public int hashCode() {
        return (((((this.f33948f.hashCode() * 31) + C13612k.m837j(this.f33949g)) * 31) + C13615m.m823h(this.f33950h)) * 31) + C11007d0.m6558e(m1769k());
    }

    /* renamed from: j */
    protected void m1770j(DrawScope drawScope) {
        int m19530c;
        int m19530c2;
        Intrinsics.isThisObjectNull(drawScope, "<this>");
        InterfaceC11025h0 interfaceC11025h0 = this.f33948f;
        long j = this.f33949g;
        long j2 = this.f33950h;
        m19530c = C7037c.m19530c(C10781l.m7091i(drawScope.m3263a()));
        m19530c2 = C7037c.m19530c(C10781l.m7093g(drawScope.m3263a()));
        DrawScope.C12241b.m3258b(drawScope, interfaceC11025h0, j, j2, 0L, C13617n.m819a(m19530c, m19530c2), this.f33953k, null, this.f33954l, 0, m1769k(), 328, null);
    }

    /* renamed from: k */
    public final int m1769k() {
        return this.f33951i;
    }

    public String toString() {
        return "BitmapPainter(image=" + this.f33948f + ", srcOffset=" + ((Object) C13612k.m836k(this.f33949g)) + ", srcSize=" + ((Object) C13615m.m822i(this.f33950h)) + ", filterQuality=" + ((Object) C11007d0.m6557f(m1769k())) + ')';
    }

    private BitmapPainter(InterfaceC11025h0 interfaceC11025h0, long j, long j2) {
        this.f33948f = interfaceC11025h0;
        this.f33949g = j;
        this.f33950h = j2;
        this.f33951i = C11007d0.f28337a.m6556a();
        this.f33952j = m1768l(j, j2);
        this.f33953k = 1.0f;
    }
}
