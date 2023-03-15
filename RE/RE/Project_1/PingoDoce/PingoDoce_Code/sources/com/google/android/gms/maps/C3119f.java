package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;
import p133h7.AbstractC5866a;
import p133h7.BinderC5870d;
import p133h7.InterfaceC5871e;
import p418w7.InterfaceC11590d;
import p440x7.C12320w;
import p440x7.InterfaceC12295c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: com.google.android.gms.maps.f */
/* loaded from: classes.dex */
public final class C3119f extends AbstractC5866a<C3118e> {

    /* renamed from: e */
    private final ViewGroup f8240e;

    /* renamed from: f */
    private final Context f8241f;

    /* renamed from: g */
    protected InterfaceC5871e<C3118e> f8242g;

    /* renamed from: h */
    private final GoogleMapOptions f8243h;

    /* renamed from: i */
    private final List<InterfaceC11590d> f8244i = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3119f(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f8240e = viewGroup;
        this.f8241f = context;
        this.f8243h = googleMapOptions;
    }

    @Override // p133h7.AbstractC5866a
    /* renamed from: a */
    protected final void mo22855a(InterfaceC5871e<C3118e> interfaceC5871e) {
        this.f8242g = interfaceC5871e;
        m31563p();
    }

    /* renamed from: o */
    public final void m31564o(InterfaceC11590d interfaceC11590d) {
        if (m22854b() != null) {
            m22854b().m31565a(interfaceC11590d);
        } else {
            this.f8244i.add(interfaceC11590d);
        }
    }

    /* renamed from: p */
    public final void m31563p() {
        if (this.f8242g == null || m22854b() != null) {
            return;
        }
        try {
            C3113a.m31568a(this.f8241f);
            InterfaceC12295c mo3080g1 = C12320w.m3088a(this.f8241f, null).mo3080g1(BinderC5870d.m22835S1(this.f8241f), this.f8243h);
            if (mo3080g1 == null) {
                return;
            }
            this.f8242g.mo22834a(new C3118e(this.f8240e, mo3080g1));
            for (InterfaceC11590d interfaceC11590d : this.f8244i) {
                m22854b().m31565a(interfaceC11590d);
            }
            this.f8244i.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }
}
