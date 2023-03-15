package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractBinderC3947p;
import com.google.android.play.core.internal.InterfaceC3950s;
import java.util.Arrays;
import p031b9.C1844a;
import p031b9.C1856m;

/* renamed from: com.google.android.play.core.assetpacks.x */
/* loaded from: classes.dex */
final class BinderC3916x extends AbstractBinderC3947p {

    /* renamed from: a */
    private final C1844a f11207a = new C1844a("AssetPackExtractionService");

    /* renamed from: b */
    private final Context f11208b;

    /* renamed from: c */
    private final AssetPackExtractionService f11209c;

    /* renamed from: d */
    private final C3924z f11210d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC3916x(Context context, AssetPackExtractionService assetPackExtractionService, C3924z c3924z) {
        this.f11208b = context;
        this.f11209c = assetPackExtractionService;
        this.f11210d = c3924z;
    }

    @Override // com.google.android.play.core.internal.InterfaceC3948q
    /* renamed from: f1 */
    public final void mo28535f1(InterfaceC3950s interfaceC3950s) throws RemoteException {
        this.f11210d.m28576z();
        interfaceC3950s.mo28533D(new Bundle());
    }

    @Override // com.google.android.play.core.internal.InterfaceC3948q
    /* renamed from: v0 */
    public final void mo28534v0(Bundle bundle, InterfaceC3950s interfaceC3950s) throws RemoteException {
        String[] packagesForUid;
        this.f11207a.m35280c("updateServiceState AIDL call", new Object[0]);
        if (C1856m.m35252a(this.f11208b) && (packagesForUid = this.f11208b.getPackageManager().getPackagesForUid(Binder.getCallingUid())) != null && Arrays.asList(packagesForUid).contains("com.android.vending")) {
            interfaceC3950s.mo28531z(this.f11209c.m28772a(bundle), new Bundle());
            return;
        }
        interfaceC3950s.mo28532i(new Bundle());
        this.f11209c.m28771b();
    }
}
