package p092f0;

import p112g0.IdentityArraySet;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Composer.kt */
/* renamed from: f0.e0 */
/* loaded from: classes.dex */
public final class C5163e0 {

    /* renamed from: a */
    private final RecomposeScopeImpl f14264a;

    /* renamed from: b */
    private final int f14265b;

    /* renamed from: c */
    private IdentityArraySet f14266c;

    public C5163e0(RecomposeScopeImpl recomposeScopeImpl, int i, IdentityArraySet identityArraySet) {
        Intrinsics.isThisObjectNull(recomposeScopeImpl, "scope");
        this.f14264a = recomposeScopeImpl;
        this.f14265b = i;
        this.f14266c = identityArraySet;
    }

    /* renamed from: a */
    public final IdentityArraySet m25448a() {
        return this.f14266c;
    }

    /* renamed from: b */
    public final int m25447b() {
        return this.f14265b;
    }

    /* renamed from: c */
    public final RecomposeScopeImpl m25446c() {
        return this.f14264a;
    }

    /* renamed from: d */
    public final boolean m25445d() {
        return this.f14264a.m24865s(this.f14266c);
    }

    /* renamed from: e */
    public final void m25444e(IdentityArraySet identityArraySet) {
        this.f14266c = identityArraySet;
    }
}
