package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.core.internal.a */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3928a extends BinderC3941j implements InterfaceC3930b {
    /* renamed from: y */
    public static InterfaceC3930b m28571y(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return queryLocalInterface instanceof InterfaceC3930b ? (InterfaceC3930b) queryLocalInterface : new C3951t(iBinder);
    }
}
