package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.core.internal.l */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3943l extends BinderC3941j implements InterfaceC3944m {
    /* renamed from: y */
    public static InterfaceC3944m m28557y(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return queryLocalInterface instanceof InterfaceC3944m ? (InterfaceC3944m) queryLocalInterface : new C3942k(iBinder);
    }
}
