package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.C2423a;
import com.google.android.gms.common.C2569e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC2475c;
import com.google.android.gms.common.internal.AbstractC2576b;
import com.google.android.gms.common.internal.AbstractC2586d;
import com.google.android.gms.common.internal.C2583c;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.zat;
import p030b8.InterfaceC1842f;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.signin.internal.a */
/* loaded from: classes.dex */
public class C3406a extends AbstractC2586d<C3410e> implements InterfaceC1842f {

    /* renamed from: F */
    public static final /* synthetic */ int f9208F = 0;

    /* renamed from: B */
    private final boolean f9209B;

    /* renamed from: C */
    private final C2583c f9210C;

    /* renamed from: D */
    private final Bundle f9211D;

    /* renamed from: E */
    private final Integer f9212E;

    public C3406a(Context context, Looper looper, boolean z, C2583c c2583c, Bundle bundle, AbstractC2475c.InterfaceC2476a interfaceC2476a, AbstractC2475c.InterfaceC2477b interfaceC2477b) {
        super(context, looper, 44, c2583c, interfaceC2476a, interfaceC2477b);
        this.f9209B = true;
        this.f9210C = c2583c;
        this.f9211D = bundle;
        this.f9212E = c2583c.m33127i();
    }

    /* renamed from: m0 */
    public static Bundle m30813m0(C2583c c2583c) {
        c2583c.m33128h();
        Integer m33127i = c2583c.m33127i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c2583c.m33135a());
        if (m33127i != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", m33127i.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: A */
    protected final Bundle mo19634A() {
        if (!m33139y().getPackageName().equals(this.f9210C.m33130f())) {
            this.f9211D.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f9210C.m33130f());
        }
        return this.f9211D;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: E */
    public final String mo19096E() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: F */
    protected final String mo19095F() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // p030b8.InterfaceC1842f
    /* renamed from: g */
    public final void mo30814g(InterfaceC3409d interfaceC3409d) {
        C2597i.m33075k(interfaceC3409d, "Expecting a valid ISignInCallbacks");
        try {
            Account m33133c = this.f9210C.m33133c();
            ((C3410e) m33182D()).m30810S1(new zai(1, new zat(m33133c, ((Integer) C2597i.m33076j(this.f9212E)).intValue(), "<<default account>>".equals(m33133c.name) ? C2423a.m33579b(m33139y()).m33578c() : null)), interfaceC3409d);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                interfaceC3409d.mo30811D0(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b, com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: h */
    public final int mo19093h() {
        return C2569e.f7391a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b, com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: o */
    public final boolean mo20508o() {
        return this.f9209B;
    }

    @Override // p030b8.InterfaceC1842f
    /* renamed from: p */
    public final void mo30812p() {
        m33144m(new AbstractC2576b.C2580d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: s */
    public final /* synthetic */ IInterface mo19092s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C3410e ? (C3410e) queryLocalInterface : new C3410e(iBinder);
    }
}
