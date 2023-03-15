package com.google.android.gms.maps;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p133h7.BinderC5870d;
import p133h7.InterfaceC5869c;
import p418w7.InterfaceC11590d;
import p440x7.C12319v;
import p440x7.InterfaceC12295c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: com.google.android.gms.maps.e */
/* loaded from: classes.dex */
public final class C3118e implements InterfaceC5869c {

    /* renamed from: a */
    private final ViewGroup f8237a;

    /* renamed from: b */
    private final InterfaceC12295c f8238b;

    /* renamed from: c */
    private View f8239c;

    public C3118e(ViewGroup viewGroup, InterfaceC12295c interfaceC12295c) {
        this.f8238b = (InterfaceC12295c) C2597i.m33076j(interfaceC12295c);
        this.f8237a = (ViewGroup) C2597i.m33076j(viewGroup);
    }

    @Override // p133h7.InterfaceC5869c
    /* renamed from: B */
    public final void mo22840B() {
        try {
            this.f8238b.mo3122B();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // p133h7.InterfaceC5869c
    /* renamed from: F */
    public final void mo22839F() {
        try {
            this.f8238b.mo3121F();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // p133h7.InterfaceC5869c
    /* renamed from: G */
    public final void mo22838G(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C12319v.m3091b(bundle, bundle2);
            this.f8238b.mo3120G(bundle2);
            C12319v.m3091b(bundle2, bundle);
            this.f8239c = (View) BinderC5870d.m22836H(this.f8238b.mo3118j());
            this.f8237a.removeAllViews();
            this.f8237a.addView(this.f8239c);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void m31565a(InterfaceC11590d interfaceC11590d) {
        try {
            this.f8238b.mo3119L0(new BinderC3117d(this, interfaceC11590d));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // p133h7.InterfaceC5869c
    /* renamed from: k */
    public final void mo22837k() {
        try {
            this.f8238b.mo3117k();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // p133h7.InterfaceC5869c
    public final void onLowMemory() {
        try {
            this.f8238b.onLowMemory();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
