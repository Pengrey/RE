package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C2566b;
import com.google.android.gms.common.api.AbstractC2475c;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.InterfaceC2496e;
import com.google.android.gms.common.api.internal.InterfaceC2519l;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.d */
/* loaded from: classes.dex */
public abstract class AbstractC2586d<T extends IInterface> extends AbstractC2576b<T> implements C2461a.InterfaceC2470f {

    /* renamed from: A */
    private final Account f7481A;

    /* renamed from: y */
    private final C2583c f7482y;

    /* renamed from: z */
    private final Set<Scope> f7483z;

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public AbstractC2586d(Context context, Looper looper, int i, C2583c c2583c, AbstractC2475c.InterfaceC2476a interfaceC2476a, AbstractC2475c.InterfaceC2477b interfaceC2477b) {
        this(context, looper, i, c2583c, (InterfaceC2496e) interfaceC2476a, (InterfaceC2519l) interfaceC2477b);
    }

    /* renamed from: l0 */
    private final Set<Scope> m33114l0(Set<Scope> set) {
        Set<Scope> m33115k0 = m33115k0(set);
        for (Scope scope : m33115k0) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return m33115k0;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: C */
    protected final Set<Scope> mo33118C() {
        return this.f7483z;
    }

    @Override // com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: c */
    public Set<Scope> mo33117c() {
        return mo20508o() ? this.f7483z : Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j0 */
    public final C2583c m33116j0() {
        return this.f7482y;
    }

    /* renamed from: k0 */
    protected Set<Scope> m33115k0(Set<Scope> set) {
        return set;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: u */
    public final Account mo33113u() {
        return this.f7481A;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: w */
    protected final Executor mo33112w() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2586d(Context context, Looper looper, int i, C2583c c2583c, InterfaceC2496e interfaceC2496e, InterfaceC2519l interfaceC2519l) {
        this(context, looper, AbstractC2588e.m33100b(context), C2566b.m33240m(), i, c2583c, (InterfaceC2496e) C2597i.m33076j(interfaceC2496e), (InterfaceC2519l) C2597i.m33076j(interfaceC2519l));
    }

    protected AbstractC2586d(Context context, Looper looper, AbstractC2588e abstractC2588e, C2566b c2566b, int i, C2583c c2583c, InterfaceC2496e interfaceC2496e, InterfaceC2519l interfaceC2519l) {
        super(context, looper, abstractC2588e, c2566b, i, interfaceC2496e == null ? null : new C2601k(interfaceC2496e), interfaceC2519l == null ? null : new C2603l(interfaceC2519l), c2583c.m33126j());
        this.f7482y = c2583c;
        this.f7481A = c2583c.m33135a();
        this.f7483z = m33114l0(c2583c.m33132d());
    }
}
