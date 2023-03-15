package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C3421e;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.n1 */
/* loaded from: classes.dex */
public final class C2528n1<ResultT> extends AbstractC2533p0 {

    /* renamed from: b */
    private final AbstractC2541s<C2461a.InterfaceC2463b, ResultT> f7314b;

    /* renamed from: c */
    private final C3421e<ResultT> f7315c;

    /* renamed from: d */
    private final InterfaceC2535q f7316d;

    public C2528n1(int i, AbstractC2541s<C2461a.InterfaceC2463b, ResultT> abstractC2541s, C3421e<ResultT> c3421e, InterfaceC2535q interfaceC2535q) {
        super(i);
        this.f7315c = c3421e;
        this.f7314b = abstractC2541s;
        this.f7316d = interfaceC2535q;
        if (i == 2 && abstractC2541s.m33291c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2534p1
    /* renamed from: a */
    public final void mo33305a(Status status) {
        this.f7315c.m30799d(this.f7316d.mo33300a(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2534p1
    /* renamed from: b */
    public final void mo33304b(Exception exc) {
        this.f7315c.m30799d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2534p1
    /* renamed from: c */
    public final void mo33303c(C2506h0<?> c2506h0) throws DeadObjectException {
        try {
            this.f7314b.mo33292b(c2506h0.m33362t(), this.f7315c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo33305a(AbstractC2534p1.m33301e(e2));
        } catch (RuntimeException e3) {
            this.f7315c.m30799d(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2534p1
    /* renamed from: d */
    public final void mo33302d(C2557x c2557x, boolean z) {
        c2557x.m33265d(this.f7315c, z);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2533p0
    /* renamed from: f */
    public final boolean mo33307f(C2506h0<?> c2506h0) {
        return this.f7314b.m33291c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2533p0
    /* renamed from: g */
    public final Feature[] mo33306g(C2506h0<?> c2506h0) {
        return this.f7314b.m33289e();
    }
}
