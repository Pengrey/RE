package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C2508i;
import com.google.android.gms.internal.location.C2667n;
import com.google.android.gms.tasks.C3421e;
import p400v7.AbstractC11129a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.location.g */
/* loaded from: classes.dex */
public final class C3093g extends AbstractC3098l {

    /* renamed from: b */
    final /* synthetic */ C2508i f8197b;

    /* renamed from: c */
    final /* synthetic */ C3084a f8198c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3093g(C3084a c3084a, C2508i c2508i) {
        this.f8198c = c3084a;
        this.f8197b = c2508i;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2529o
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19090a(C2667n c2667n, C3421e<Boolean> c3421e) throws RemoteException {
        C2667n c2667n2 = c2667n;
        C3421e<Boolean> c3421e2 = c3421e;
        if (m31613b()) {
            BinderC3094h binderC3094h = new BinderC3094h(this.f8198c, c3421e2);
            try {
                C2508i.C2509a<AbstractC11129a> m33355b = this.f8197b.m33355b();
                if (m33355b != null) {
                    c2667n2.m32940o0(m33355b, binderC3094h);
                }
            } catch (RuntimeException e) {
                c3421e2.m30799d(e);
            }
        }
    }
}
