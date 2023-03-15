package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.C2569e;
import com.google.android.gms.common.api.AbstractC2475c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC2586d;
import com.google.android.gms.common.internal.C2583c;
import p217l7.C6993b;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: com.google.android.gms.auth.api.signin.internal.d */
/* loaded from: classes.dex */
public final class C2426d extends AbstractC2586d<C2437o> {

    /* renamed from: B */
    private final GoogleSignInOptions f7089B;

    public C2426d(Context context, Looper looper, C2583c c2583c, GoogleSignInOptions googleSignInOptions, AbstractC2475c.InterfaceC2476a interfaceC2476a, AbstractC2475c.InterfaceC2477b interfaceC2477b) {
        super(context, looper, 91, c2583c, interfaceC2476a, interfaceC2477b);
        GoogleSignInOptions.C2414a c2414a;
        if (googleSignInOptions != null) {
            c2414a = new GoogleSignInOptions.C2414a(googleSignInOptions);
        } else {
            c2414a = new GoogleSignInOptions.C2414a();
        }
        c2414a.m33593e(C6993b.m19641a());
        if (!c2583c.m33132d().isEmpty()) {
            for (Scope scope : c2583c.m33132d()) {
                c2414a.m33594d(scope, new Scope[0]);
            }
        }
        this.f7089B = c2414a.m33597a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: E */
    public final String mo19096E() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: F */
    protected final String mo19095F() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b, com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: h */
    public final int mo19093h() {
        return C2569e.f7391a;
    }

    /* renamed from: m0 */
    public final GoogleSignInOptions m33571m0() {
        return this.f7089B;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ IInterface mo19092s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C2437o) {
            return (C2437o) queryLocalInterface;
        }
        return new C2437o(iBinder);
    }
}
