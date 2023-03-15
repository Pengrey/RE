package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C2569e;
import com.google.android.gms.common.internal.AbstractC2576b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.c3 */
/* loaded from: classes.dex */
public final class C3153c3 extends AbstractC2576b {
    public C3153c3(Context context, Looper looper, AbstractC2576b.InterfaceC2577a interfaceC2577a, AbstractC2576b.InterfaceC2578b interfaceC2578b) {
        super(context, looper, 93, interfaceC2577a, interfaceC2578b, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: E */
    public final String mo19096E() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: F */
    protected final String mo19095F() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b, com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: h */
    public final int mo19093h() {
        return C2569e.f7391a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: s */
    public final /* synthetic */ IInterface mo19092s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof InterfaceC3369w2 ? (InterfaceC3369w2) queryLocalInterface : new C3349u2(iBinder);
    }
}
