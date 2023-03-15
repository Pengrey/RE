package p092f0;

import p092f0.SnapshotMutationPolicy;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f0.u1 */
/* loaded from: classes.dex */
public final class C5256u1 implements SnapshotMutationPolicy {

    /* renamed from: a */
    public static final C5256u1 f14528a = new C5256u1();

    private C5256u1() {
    }

    /* renamed from: a */
    public boolean mo24851a(Object obj, Object obj2) {
        return Intrinsics.equals(obj, obj2);
    }

    /* renamed from: b */
    public Object mo24850b(Object obj, Object obj2, Object obj3) {
        return SnapshotMutationPolicy.C5183a.m25242a(this, obj, obj2, obj3);
    }

    public String toString() {
        return "StructuralEqualityPolicy";
    }
}
