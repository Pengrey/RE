package p356sf;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p489zc._ArraysJvm;

/* renamed from: sf.c0 */
/* loaded from: classes2.dex */
public final class Segment {

    /* renamed from: a */
    public final byte[] f26529a;

    /* renamed from: b */
    public int f26530b;

    /* renamed from: c */
    public int f26531c;

    /* renamed from: d */
    public boolean f26532d;

    /* renamed from: e */
    public boolean f26533e;

    /* renamed from: f */
    public Segment f26534f;

    /* renamed from: g */
    public Segment f26535g;

    /* compiled from: Segment.kt */
    /* renamed from: sf.c0$a */
    /* loaded from: classes2.dex */
    public static final class C10185a {
        private C10185a() {
        }

        public /* synthetic */ C10185a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C10185a(null);
    }

    public Segment() {
        this.f26529a = new byte[8192];
        this.f26533e = true;
        this.f26532d = false;
    }

    /* renamed from: a */
    public final void m8789a() {
        Segment segment = this.f26535g;
        int i = 0;
        if (segment != this) {
            Intrinsics.ifNullDoSomething(segment);
            if (segment.f26533e) {
                int i2 = this.f26531c - this.f26530b;
                Segment segment2 = this.f26535g;
                Intrinsics.ifNullDoSomething(segment2);
                int i3 = 8192 - segment2.f26531c;
                Segment segment3 = this.f26535g;
                Intrinsics.ifNullDoSomething(segment3);
                if (!segment3.f26532d) {
                    Segment segment4 = this.f26535g;
                    Intrinsics.ifNullDoSomething(segment4);
                    i = segment4.f26530b;
                }
                if (i2 > i3 + i) {
                    return;
                }
                Segment segment5 = this.f26535g;
                Intrinsics.ifNullDoSomething(segment5);
                m8784f(segment5, i2);
                m8788b();
                SegmentPool.m8770b(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    /* renamed from: b */
    public final Segment m8788b() {
        Segment segment = this.f26534f;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.f26535g;
        Intrinsics.ifNullDoSomething(segment2);
        segment2.f26534f = this.f26534f;
        Segment segment3 = this.f26534f;
        Intrinsics.ifNullDoSomething(segment3);
        segment3.f26535g = this.f26535g;
        this.f26534f = null;
        this.f26535g = null;
        return segment;
    }

    /* renamed from: c */
    public final Segment m8787c(Segment segment) {
        Intrinsics.isThisObjectNull(segment, "segment");
        segment.f26535g = this;
        segment.f26534f = this.f26534f;
        Segment segment2 = this.f26534f;
        Intrinsics.ifNullDoSomething(segment2);
        segment2.f26535g = segment;
        this.f26534f = segment;
        return segment;
    }

    /* renamed from: d */
    public final Segment m8786d() {
        this.f26532d = true;
        return new Segment(this.f26529a, this.f26530b, this.f26531c, true, false);
    }

    /* renamed from: e */
    public final Segment m8785e(int i) {
        Segment m8769c;
        if (i > 0 && i <= this.f26531c - this.f26530b) {
            if (i >= 1024) {
                m8769c = m8786d();
            } else {
                m8769c = SegmentPool.m8769c();
                byte[] bArr = this.f26529a;
                byte[] bArr2 = m8769c.f26529a;
                int i2 = this.f26530b;
                _ArraysJvm.m314j(bArr, bArr2, 0, i2, i2 + i, 2, null);
            }
            m8769c.f26531c = m8769c.f26530b + i;
            this.f26530b += i;
            Segment segment = this.f26535g;
            Intrinsics.ifNullDoSomething(segment);
            segment.m8787c(m8769c);
            return m8769c;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    /* renamed from: f */
    public final void m8784f(Segment segment, int i) {
        Intrinsics.isThisObjectNull(segment, "sink");
        if (segment.f26533e) {
            int i2 = segment.f26531c;
            if (i2 + i > 8192) {
                if (!segment.f26532d) {
                    int i3 = segment.f26530b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = segment.f26529a;
                        _ArraysJvm.m314j(bArr, bArr, 0, i3, i2, 2, null);
                        segment.f26531c -= segment.f26530b;
                        segment.f26530b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f26529a;
            byte[] bArr3 = segment.f26529a;
            int i4 = segment.f26531c;
            int i5 = this.f26530b;
            _ArraysJvm.m319e(bArr2, bArr3, i4, i5, i5 + i);
            segment.f26531c += i;
            this.f26530b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public Segment(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        Intrinsics.isThisObjectNull(bArr, "data");
        this.f26529a = bArr;
        this.f26530b = i;
        this.f26531c = i2;
        this.f26532d = z;
        this.f26533e = z2;
    }
}
