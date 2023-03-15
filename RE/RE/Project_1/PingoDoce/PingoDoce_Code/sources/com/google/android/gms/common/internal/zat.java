package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new C2604m();

    /* renamed from: w */
    final int f7529w;

    /* renamed from: x */
    private final Account f7530x;

    /* renamed from: y */
    private final int f7531y;

    /* renamed from: z */
    private final GoogleSignInAccount f7532z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zat(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f7529w = i;
        this.f7530x = account;
        this.f7531y = i2;
        this.f7532z = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42009l(parcel, 1, this.f7529w);
        C0066a.m42004q(parcel, 2, this.f7530x, i, false);
        C0066a.m42009l(parcel, 3, this.f7531y);
        C0066a.m42004q(parcel, 4, this.f7532z, i, false);
        C0066a.m42019b(parcel, m42020a);
    }

    public zat(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
