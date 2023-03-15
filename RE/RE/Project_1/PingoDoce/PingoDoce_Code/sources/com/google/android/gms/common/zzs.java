package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractBinderC2600j0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.Nullable;
import p008a7.C0066a;
import p133h7.BinderC5870d;
import p133h7.InterfaceC5867b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C2634v();

    /* renamed from: w */
    private final String f7567w;
    @Nullable

    /* renamed from: x */
    private final AbstractBinderC2622n f7568x;

    /* renamed from: y */
    private final boolean f7569y;

    /* renamed from: z */
    private final boolean f7570z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(String str, @Nullable IBinder iBinder, boolean z, boolean z2) {
        this.f7567w = str;
        BinderC2623o binderC2623o = null;
        if (iBinder != null) {
            try {
                InterfaceC5867b mo33010b = AbstractBinderC2600j0.m33062y(iBinder).mo33010b();
                byte[] bArr = mo33010b == null ? null : (byte[]) BinderC5870d.m22836H(mo33010b);
                if (bArr != null) {
                    binderC2623o = new BinderC2623o(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.f7568x = binderC2623o;
        this.f7569y = z;
        this.f7570z = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(String str, @Nullable AbstractBinderC2622n abstractBinderC2622n, boolean z, boolean z2) {
        this.f7567w = str;
        this.f7568x = abstractBinderC2622n;
        this.f7569y = z;
        this.f7570z = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42003r(parcel, 1, this.f7567w, false);
        AbstractBinderC2622n abstractBinderC2622n = this.f7568x;
        if (abstractBinderC2622n == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            abstractBinderC2622n = null;
        }
        C0066a.m42010k(parcel, 2, abstractBinderC2622n, false);
        C0066a.m42018c(parcel, 3, this.f7569y);
        C0066a.m42018c(parcel, 4, this.f7570z);
        C0066a.m42019b(parcel, m42020a);
    }
}
