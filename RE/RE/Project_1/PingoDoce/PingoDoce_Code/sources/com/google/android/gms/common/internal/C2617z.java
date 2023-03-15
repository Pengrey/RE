package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC2576b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.z */
/* loaded from: classes.dex */
public final class C2617z extends AbstractC2606o {

    /* renamed from: g */
    public final IBinder f7527g;

    /* renamed from: h */
    final /* synthetic */ AbstractC2576b f7528h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2617z(AbstractC2576b abstractC2576b, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC2576b, i, bundle);
        this.f7528h = abstractC2576b;
        this.f7527g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2606o
    /* renamed from: f */
    protected final void mo33016f(ConnectionResult connectionResult) {
        if (this.f7528h.f7459p != null) {
            this.f7528h.f7459p.mo30928y(connectionResult);
        }
        this.f7528h.m33176L(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.AbstractC2606o
    /* renamed from: g */
    protected final boolean mo33015g() {
        AbstractC2576b.InterfaceC2577a interfaceC2577a;
        AbstractC2576b.InterfaceC2577a interfaceC2577a2;
        try {
            IBinder iBinder = this.f7527g;
            C2597i.m33076j(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f7528h.mo19096E().equals(interfaceDescriptor)) {
                String mo19096E = this.f7528h.mo19096E();
                StringBuilder sb2 = new StringBuilder(String.valueOf(mo19096E).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb2.append("service descriptor mismatch: ");
                sb2.append(mo19096E);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                Log.w("GmsClient", sb2.toString());
                return false;
            }
            IInterface mo19092s = this.f7528h.mo19092s(this.f7527g);
            if (mo19092s == null || !(AbstractC2576b.m33151g0(this.f7528h, 2, 4, mo19092s) || AbstractC2576b.m33151g0(this.f7528h, 3, 4, mo19092s))) {
                return false;
            }
            this.f7528h.f7463t = null;
            Bundle m33140x = this.f7528h.m33140x();
            AbstractC2576b abstractC2576b = this.f7528h;
            interfaceC2577a = abstractC2576b.f7458o;
            if (interfaceC2577a != null) {
                interfaceC2577a2 = abstractC2576b.f7458o;
                interfaceC2577a2.mo30934H(m33140x);
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
