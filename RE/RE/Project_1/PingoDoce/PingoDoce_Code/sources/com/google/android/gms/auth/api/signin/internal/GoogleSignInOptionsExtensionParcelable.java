package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C2424b();

    /* renamed from: w */
    final int f7074w;

    /* renamed from: x */
    private int f7075x;

    /* renamed from: y */
    private Bundle f7076y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.f7074w = i;
        this.f7075x = i2;
        this.f7076y = bundle;
    }

    /* renamed from: h */
    public int m33587h() {
        return this.f7075x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42009l(parcel, 1, this.f7074w);
        C0066a.m42009l(parcel, 2, m33587h());
        C0066a.m42016e(parcel, 3, this.f7076y, false);
        C0066a.m42019b(parcel, m42020a);
    }
}
