package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p031b9.C1869z;

/* renamed from: com.google.android.play.core.internal.k */
/* loaded from: classes.dex */
public final class C3942k extends C3940i implements InterfaceC3944m {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3942k(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    @Override // com.google.android.play.core.internal.InterfaceC3944m
    /* renamed from: B1 */
    public final void mo28556B1(String str, Bundle bundle, InterfaceC3946o interfaceC3946o) throws RemoteException {
        Parcel m28559s = m28559s();
        m28559s.writeString(str);
        C1869z.m35240c(m28559s, bundle);
        C1869z.m35241b(m28559s, interfaceC3946o);
        m28558y(5, m28559s);
    }

    @Override // com.google.android.play.core.internal.InterfaceC3944m
    /* renamed from: E1 */
    public final void mo28555E1(String str, Bundle bundle, Bundle bundle2, InterfaceC3946o interfaceC3946o) throws RemoteException {
        Parcel m28559s = m28559s();
        m28559s.writeString(str);
        C1869z.m35240c(m28559s, bundle);
        C1869z.m35240c(m28559s, bundle2);
        C1869z.m35241b(m28559s, interfaceC3946o);
        m28558y(7, m28559s);
    }

    @Override // com.google.android.play.core.internal.InterfaceC3944m
    /* renamed from: K0 */
    public final void mo28554K0(String str, Bundle bundle, Bundle bundle2, InterfaceC3946o interfaceC3946o) throws RemoteException {
        Parcel m28559s = m28559s();
        m28559s.writeString(str);
        C1869z.m35240c(m28559s, bundle);
        C1869z.m35240c(m28559s, bundle2);
        C1869z.m35241b(m28559s, interfaceC3946o);
        m28558y(11, m28559s);
    }

    @Override // com.google.android.play.core.internal.InterfaceC3944m
    /* renamed from: W0 */
    public final void mo28553W0(String str, List<Bundle> list, Bundle bundle, InterfaceC3946o interfaceC3946o) throws RemoteException {
        Parcel m28559s = m28559s();
        m28559s.writeString(str);
        m28559s.writeTypedList(list);
        C1869z.m35240c(m28559s, bundle);
        C1869z.m35241b(m28559s, interfaceC3946o);
        m28558y(14, m28559s);
    }

    @Override // com.google.android.play.core.internal.InterfaceC3944m
    /* renamed from: X */
    public final void mo28552X(String str, Bundle bundle, Bundle bundle2, InterfaceC3946o interfaceC3946o) throws RemoteException {
        Parcel m28559s = m28559s();
        m28559s.writeString(str);
        C1869z.m35240c(m28559s, bundle);
        C1869z.m35240c(m28559s, bundle2);
        C1869z.m35241b(m28559s, interfaceC3946o);
        m28558y(9, m28559s);
    }

    @Override // com.google.android.play.core.internal.InterfaceC3944m
    /* renamed from: e1 */
    public final void mo28551e1(String str, Bundle bundle, InterfaceC3946o interfaceC3946o) throws RemoteException {
        Parcel m28559s = m28559s();
        m28559s.writeString(str);
        C1869z.m35240c(m28559s, bundle);
        C1869z.m35241b(m28559s, interfaceC3946o);
        m28558y(10, m28559s);
    }

    @Override // com.google.android.play.core.internal.InterfaceC3944m
    /* renamed from: m1 */
    public final void mo28550m1(String str, Bundle bundle, Bundle bundle2, InterfaceC3946o interfaceC3946o) throws RemoteException {
        Parcel m28559s = m28559s();
        m28559s.writeString(str);
        C1869z.m35240c(m28559s, bundle);
        C1869z.m35240c(m28559s, bundle2);
        C1869z.m35241b(m28559s, interfaceC3946o);
        m28558y(6, m28559s);
    }
}
