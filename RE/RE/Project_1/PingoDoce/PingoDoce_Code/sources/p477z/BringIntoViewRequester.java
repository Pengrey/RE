package p477z;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p127h1.InterfaceC5776j;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z.a */
/* loaded from: classes.dex */
public final class BringIntoViewRequester {

    /* renamed from: a */
    private final C13494f f34279a;

    /* renamed from: b */
    private BringIntoViewResponder f34280b;

    /* renamed from: c */
    private InterfaceC5776j f34281c;

    public BringIntoViewRequester(C13494f c13494f, BringIntoViewResponder bringIntoViewResponder, InterfaceC5776j interfaceC5776j) {
        Intrinsics.isThisObjectNull(c13494f, "bringRectangleOnScreenRequester");
        Intrinsics.isThisObjectNull(bringIntoViewResponder, "parent");
        this.f34279a = c13494f;
        this.f34280b = bringIntoViewResponder;
        this.f34281c = interfaceC5776j;
    }

    /* renamed from: a */
    public final C13494f m1294a() {
        return this.f34279a;
    }

    /* renamed from: b */
    public final InterfaceC5776j m1293b() {
        return this.f34281c;
    }

    /* renamed from: c */
    public final BringIntoViewResponder m1292c() {
        return this.f34280b;
    }

    /* renamed from: d */
    public final void m1291d(InterfaceC5776j interfaceC5776j) {
        this.f34281c = interfaceC5776j;
    }

    /* renamed from: e */
    public final void m1290e(BringIntoViewResponder bringIntoViewResponder) {
        Intrinsics.isThisObjectNull(bringIntoViewResponder, "<set-?>");
        this.f34280b = bringIntoViewResponder;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequester) {
            BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) obj;
            return Intrinsics.equals(this.f34279a, bringIntoViewRequester.f34279a) && Intrinsics.equals(this.f34280b, bringIntoViewRequester.f34280b) && Intrinsics.equals(this.f34281c, bringIntoViewRequester.f34281c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f34279a.hashCode() * 31) + this.f34280b.hashCode()) * 31;
        InterfaceC5776j interfaceC5776j = this.f34281c;
        return hashCode + (interfaceC5776j == null ? 0 : interfaceC5776j.hashCode());
    }

    public String toString() {
        return "BringIntoViewData(bringRectangleOnScreenRequester=" + this.f34279a + ", parent=" + this.f34280b + ", layoutCoordinates=" + this.f34281c + ')';
    }

    public /* synthetic */ BringIntoViewRequester(C13494f c13494f, BringIntoViewResponder bringIntoViewResponder, InterfaceC5776j interfaceC5776j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c13494f, (i & 2) != 0 ? BringIntoViewResponder.f34298v.m1269b() : bringIntoViewResponder, (i & 4) != 0 ? null : interfaceC5776j);
    }
}
