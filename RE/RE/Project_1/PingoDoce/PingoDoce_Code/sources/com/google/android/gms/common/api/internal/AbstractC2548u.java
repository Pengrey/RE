package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.C2461a.InterfaceC2463b;
import com.google.android.gms.common.api.internal.C2508i;
import com.google.android.gms.tasks.C3421e;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.u */
/* loaded from: classes.dex */
public abstract class AbstractC2548u<A extends C2461a.InterfaceC2463b, L> {

    /* renamed from: a */
    private final C2508i.C2509a<L> f7351a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2548u(C2508i.C2509a<L> c2509a) {
        this.f7351a = c2509a;
    }

    /* renamed from: a */
    public C2508i.C2509a<L> m33278a() {
        return this.f7351a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo33249b(A a, C3421e<Boolean> c3421e) throws RemoteException;
}
