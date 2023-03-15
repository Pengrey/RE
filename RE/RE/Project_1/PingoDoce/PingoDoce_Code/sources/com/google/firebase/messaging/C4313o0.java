package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p008a7.C0066a;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.o0 */
/* loaded from: classes.dex */
public class C4313o0 implements Parcelable.Creator<RemoteMessage> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m27920c(RemoteMessage remoteMessage, Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42016e(parcel, 2, remoteMessage.f11626w, false);
        C0066a.m42019b(parcel, m42020a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RemoteMessage createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            if (SafeParcelReader.m33048j(m33040r) != 2) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                bundle = SafeParcelReader.m33057a(parcel, m33040r);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new RemoteMessage(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b */
    public RemoteMessage[] newArray(int i) {
        return new RemoteMessage[i];
    }
}
