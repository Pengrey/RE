package p286p1;

import p181jd.Intrinsics;

/* compiled from: MultiParagraphIntrinsics.kt */
/* renamed from: p1.j */
/* loaded from: classes.dex */
public final class C8347j {

    /* renamed from: a */
    private final InterfaceC8348k f21613a;

    /* renamed from: b */
    private final int f21614b;

    /* renamed from: c */
    private final int f21615c;

    public C8347j(InterfaceC8348k interfaceC8348k, int i, int i2) {
        Intrinsics.isThisObjectNull(interfaceC8348k, "intrinsics");
        this.f21613a = interfaceC8348k;
        this.f21614b = i;
        this.f21615c = i2;
    }

    /* renamed from: a */
    public final int m15687a() {
        return this.f21615c;
    }

    /* renamed from: b */
    public final InterfaceC8348k m15686b() {
        return this.f21613a;
    }

    /* renamed from: c */
    public final int m15685c() {
        return this.f21614b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8347j) {
            C8347j c8347j = (C8347j) obj;
            return Intrinsics.equals(this.f21613a, c8347j.f21613a) && this.f21614b == c8347j.f21614b && this.f21615c == c8347j.f21615c;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f21613a.hashCode() * 31) + Integer.hashCode(this.f21614b)) * 31) + Integer.hashCode(this.f21615c);
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f21613a + ", startIndex=" + this.f21614b + ", endIndex=" + this.f21615c + ')';
    }
}
