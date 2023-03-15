package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;
import p417w6.C11571b;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = new C11571b();

    /* renamed from: w */
    Intent f7094w;

    public CloudMessage(Intent intent) {
        this.f7094w = intent;
    }

    /* renamed from: h */
    public Intent m33559h() {
        return this.f7094w;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42004q(parcel, 1, this.f7094w, i, false);
        C0066a.m42019b(parcel, m42020a);
    }
}
