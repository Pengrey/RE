package p286p1;

import p181jd.Intrinsics;
import p297pd._Ranges;
import p373u0.C10774f;
import p373u0.C10776g;
import p373u0.Rect;

/* compiled from: MultiParagraph.kt */
/* renamed from: p1.i */
/* loaded from: classes.dex */
public final class C8346i {

    /* renamed from: a */
    private final InterfaceC8345h f21606a;

    /* renamed from: b */
    private final int f21607b;

    /* renamed from: c */
    private final int f21608c;

    /* renamed from: d */
    private int f21609d;

    /* renamed from: e */
    private int f21610e;

    /* renamed from: f */
    private float f21611f;

    /* renamed from: g */
    private float f21612g;

    public C8346i(InterfaceC8345h interfaceC8345h, int i, int i2, int i3, int i4, float f, float f2) {
        Intrinsics.isThisObjectNull(interfaceC8345h, "paragraph");
        this.f21606a = interfaceC8345h;
        this.f21607b = i;
        this.f21608c = i2;
        this.f21609d = i3;
        this.f21610e = i4;
        this.f21611f = f;
        this.f21612g = f2;
    }

    /* renamed from: a */
    public final float m15703a() {
        return this.f21612g;
    }

    /* renamed from: b */
    public final int m15702b() {
        return this.f21608c;
    }

    /* renamed from: c */
    public final int m15701c() {
        return this.f21610e;
    }

    /* renamed from: d */
    public final int m15700d() {
        return this.f21608c - this.f21607b;
    }

    /* renamed from: e */
    public final InterfaceC8345h m15699e() {
        return this.f21606a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8346i) {
            C8346i c8346i = (C8346i) obj;
            return Intrinsics.equals(this.f21606a, c8346i.f21606a) && this.f21607b == c8346i.f21607b && this.f21608c == c8346i.f21608c && this.f21609d == c8346i.f21609d && this.f21610e == c8346i.f21610e && Intrinsics.equals(Float.valueOf(this.f21611f), Float.valueOf(c8346i.f21611f)) && Intrinsics.equals(Float.valueOf(this.f21612g), Float.valueOf(c8346i.f21612g));
        }
        return false;
    }

    /* renamed from: f */
    public final int m15698f() {
        return this.f21607b;
    }

    /* renamed from: g */
    public final int m15697g() {
        return this.f21609d;
    }

    /* renamed from: h */
    public final float m15696h() {
        return this.f21611f;
    }

    public int hashCode() {
        return (((((((((((this.f21606a.hashCode() * 31) + Integer.hashCode(this.f21607b)) * 31) + Integer.hashCode(this.f21608c)) * 31) + Integer.hashCode(this.f21609d)) * 31) + Integer.hashCode(this.f21610e)) * 31) + Float.hashCode(this.f21611f)) * 31) + Float.hashCode(this.f21612g);
    }

    /* renamed from: i */
    public final Rect m15695i(Rect rect) {
        Intrinsics.isThisObjectNull(rect, "<this>");
        return rect.m7116o(C10776g.m7133a(0.0f, this.f21611f));
    }

    /* renamed from: j */
    public final int m15694j(int i) {
        return i + this.f21607b;
    }

    /* renamed from: k */
    public final int m15693k(int i) {
        return i + this.f21609d;
    }

    /* renamed from: l */
    public final float m15692l(float f) {
        return f + this.f21611f;
    }

    /* renamed from: m */
    public final long m15691m(long j) {
        return C10776g.m7133a(C10774f.m7145k(j), C10774f.m7144l(j) - this.f21611f);
    }

    /* renamed from: n */
    public final int m15690n(int i) {
        int m14996m;
        m14996m = _Ranges.m14996m(i, this.f21607b, this.f21608c);
        return m14996m - this.f21607b;
    }

    /* renamed from: o */
    public final int m15689o(int i) {
        return i - this.f21609d;
    }

    /* renamed from: p */
    public final float m15688p(float f) {
        return f - this.f21611f;
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.f21606a + ", startIndex=" + this.f21607b + ", endIndex=" + this.f21608c + ", startLineIndex=" + this.f21609d + ", endLineIndex=" + this.f21610e + ", top=" + this.f21611f + ", bottom=" + this.f21612g + ')';
    }
}
