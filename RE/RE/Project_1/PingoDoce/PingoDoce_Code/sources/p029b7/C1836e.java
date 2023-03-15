package p029b7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.InterfaceC2496e;
import com.google.android.gms.common.api.internal.InterfaceC2519l;
import com.google.android.gms.common.internal.AbstractC2586d;
import com.google.android.gms.common.internal.C2583c;
import p251n7.C7685d;
import p484z6.C13711i;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: b7.e */
/* loaded from: classes.dex */
public final class C1836e extends AbstractC2586d<C1832a> {

    /* renamed from: B */
    private final C13711i f5542B;

    public C1836e(Context context, Looper looper, C2583c c2583c, C13711i c13711i, InterfaceC2496e interfaceC2496e, InterfaceC2519l interfaceC2519l) {
        super(context, looper, 270, c2583c, interfaceC2496e, interfaceC2519l);
        this.f5542B = c13711i;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: A */
    protected final Bundle mo19634A() {
        return this.f5542B.m558c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: E */
    public final String mo19096E() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: F */
    protected final String mo19095F() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: I */
    protected final boolean mo33179I() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b, com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: h */
    public final int mo19093h() {
        return 203400000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: s */
    public final /* synthetic */ IInterface mo19092s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof C1832a ? (C1832a) queryLocalInterface : new C1832a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: v */
    public final Feature[] mo19091v() {
        return C7685d.f20273b;
    }
}
