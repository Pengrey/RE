package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.AbstractC2475c;
import com.google.android.gms.common.internal.AbstractC2586d;
import com.google.android.gms.common.internal.C2583c;
import p331r7.InterfaceC9821c;
import p400v7.C11134f;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.internal.location.s */
/* loaded from: classes.dex */
public class C2672s extends AbstractC2586d<InterfaceC2659f> {

    /* renamed from: B */
    private final String f7603B;

    /* renamed from: C */
    protected final InterfaceC9821c<InterfaceC2659f> f7604C;

    public C2672s(Context context, Looper looper, AbstractC2475c.InterfaceC2476a interfaceC2476a, AbstractC2475c.InterfaceC2477b interfaceC2477b, String str, C2583c c2583c) {
        super(context, looper, 23, c2583c, interfaceC2476a, interfaceC2477b);
        this.f7604C = new C2671r(this);
        this.f7603B = str;
    }

    /* renamed from: m0 */
    public static /* synthetic */ void m32937m0(C2672s c2672s) {
        c2672s.m33142r();
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: A */
    protected final Bundle mo19634A() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f7603B);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: E */
    public final String mo19096E() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: F */
    protected final String mo19095F() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b, com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: h */
    public final int mo19093h() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ IInterface mo19092s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof InterfaceC2659f) {
            return (InterfaceC2659f) queryLocalInterface;
        }
        return new C2658e(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: v */
    public final Feature[] mo19091v() {
        return C11134f.f28566f;
    }
}
