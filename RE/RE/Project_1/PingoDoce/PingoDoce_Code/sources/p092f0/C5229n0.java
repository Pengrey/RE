package p092f0;

import p092f0.SnapshotMutationPolicy;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f0.n0 */
/* loaded from: classes.dex */
public final class C5229n0 implements SnapshotMutationPolicy<Object> {

    /* renamed from: a */
    public static final C5229n0 f14484a = new C5229n0();

    private C5229n0() {
    }

    @Override // p092f0.SnapshotMutationPolicy
    /* renamed from: a */
    public boolean mo24851a(Object obj, Object obj2) {
        return false;
    }

    @Override // p092f0.SnapshotMutationPolicy
    /* renamed from: b */
    public Object mo24850b(Object obj, Object obj2, Object obj3) {
        return SnapshotMutationPolicy.C5183a.m25242a(this, obj, obj2, obj3);
    }

    public String toString() {
        return "NeverEqualPolicy";
    }
}
