package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2567c;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC2590f;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new C2585c0();

    /* renamed from: A */
    IBinder f7412A;

    /* renamed from: B */
    Scope[] f7413B;

    /* renamed from: C */
    Bundle f7414C;

    /* renamed from: D */
    Account f7415D;

    /* renamed from: E */
    Feature[] f7416E;

    /* renamed from: F */
    Feature[] f7417F;

    /* renamed from: G */
    boolean f7418G;

    /* renamed from: H */
    int f7419H;

    /* renamed from: I */
    boolean f7420I;

    /* renamed from: J */
    private String f7421J;

    /* renamed from: w */
    final int f7422w;

    /* renamed from: x */
    final int f7423x;

    /* renamed from: y */
    int f7424y;

    /* renamed from: z */
    String f7425z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, String str2) {
        this.f7422w = i;
        this.f7423x = i2;
        this.f7424y = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f7425z = "com.google.android.gms";
        } else {
            this.f7425z = str;
        }
        if (i < 2) {
            this.f7415D = iBinder != null ? BinderC2574a.m33184H(InterfaceC2590f.AbstractBinderC2591a.m33097y(iBinder)) : null;
        } else {
            this.f7412A = iBinder;
            this.f7415D = account;
        }
        this.f7413B = scopeArr;
        this.f7414C = bundle;
        this.f7416E = featureArr;
        this.f7417F = featureArr2;
        this.f7418G = z;
        this.f7419H = i4;
        this.f7420I = z2;
        this.f7421J = str2;
    }

    /* renamed from: h */
    public final String m33193h() {
        return this.f7421J;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C2585c0.m33119a(this, parcel, i);
    }

    public GetServiceRequest(int i, String str) {
        this.f7422w = 6;
        this.f7424y = C2567c.f7388a;
        this.f7423x = i;
        this.f7418G = true;
        this.f7421J = str;
    }
}
